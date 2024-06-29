import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class79 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Z")
    public static boolean field1203 = false;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "[I")
    public static int[] field1207 = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field1212 = 0;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "Lta;")
    public static class198 field1204;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IBI)V", line = 21)
    public static final void method580(int arg0, byte arg1, int arg2) {
        field1211++;
        class204 var3 = class261.field4050[class41.field734][arg0][arg2];
        if (var3 == null) {
            class316.method2177(class41.field734, arg0, arg2);
            return;
        }
        class71 var4 = null;
        int var5 = -99999999;
        for (class71 var6 = (class71) var3.method1490(200); var6 != null; var6 = (class71) var3.method1487((byte) 117)) {
            class179 var7 = class208.method1521(arg1 ^ 0x501, var6.field1120.field1874);
            int var8 = var7.field2818;
            if (var7.field2829 == 1) {
                var8 = (var6.field1120.field1887 + 1) * var8;
            }
            if (var5 < var8) {
                var5 = var8;
                var4 = var6;
            }
        }
        if (var4 == null) {
            class316.method2177(class41.field734, arg0, arg2);
            return;
        }
        if (arg1 != -82) {
            field1204 = (class198) null;
        }
        var3.method1495(var4, -1);
        class115 var9 = null;
        class71 var10 = (class71) var3.method1490(200);
        class115 var11 = null;
        while (var10 != null) {
            class115 var12 = var10.field1120;
            if (var4.field1120.field1874 != var12.field1874) {
                if (var11 == null) {
                    var11 = var12;
                }
                if (var11.field1874 != var12.field1874 && var9 == null) {
                    var9 = var12;
                }
            }
            var10 = (class71) var3.method1487((byte) 117);
        }
        long var13 = (long) ((arg2 << 7) + arg0 + 1610612736);
        class125.method939(class41.field734, arg0, arg2, class48.method374(arg2 * 128 + 64, arg0 * 128 + 64, 110, class41.field734), var4.field1120, var13, var11, var9);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B[B)[B", line = 100)
    public static final byte[] method581(byte arg0, byte[] arg1) {
        field1202++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class271.method1959(arg1, 0, var2, 0, arg1.length);
            int var3 = 30 % ((arg0 + 12) / 50);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 138)
    public static void method582(int arg0) {
        field1207 = null;
        if (arg0 < -92) {
            field1204 = null;
        }
    }
}
