import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class110 extends class35 {

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "Lvq;")
    public class22 field1799 = new class22();

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "Z")
    public static boolean field1793 = true;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "S")
    public static short field1794 = 32767;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILdp;I)Lbs;", line = 4)
    public static final class186 method961(int arg0, int arg1, class174 arg2, int arg3) {
        field1795++;
        byte[] var4 = arg2.method1355(arg3, -12607, arg1);
        if (arg0 <= 42) {
            field1794 = 23;
        }
        return var4 == null ? null : new class186(var4);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 23)
    public static final boolean method962(String arg0, int arg1) {
        field1796++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class284.field4255; var2++) {
            if (arg0.equalsIgnoreCase(class164.field2473[var2])) {
                return true;
            }
        }
        if (arg1 != 15) {
            method964((int[][]) null, 4);
        }
        return arg0.equalsIgnoreCase(class86.field1394.field2066);
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)I", line = 52)
    public static final int method963(byte arg0) {
        field1791++;
        class90 var1 = class73.field1235;
        boolean var2 = false;
        if (class288.field4303 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class150.method1161((class177) null, var3, (class181) null, 0, 0, -29623);
            var2 = true;
        }
        if (arg0 != -1) {
            field1794 = -29;
        }
        long var4 = class10.method63(-21149);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method739(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class10.method63(arg0 ^ 0x529C) - var4);
        var1.method736(100, (byte) -40, -16777216, 100, 0, 0);
        if (var2) {
            var1.method685((byte) -31);
        }
        return var7;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "([[II)V", line = 95)
    public static final void method964(int[][] arg0, int arg1) {
        if (arg1 != 24800) {
            field1797 = -58;
        }
        class286.field4283 = arg0;
        field1792++;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)Lfp;", line = 112)
    public static final class7 method965(int arg0, int arg1, int arg2) {
        class168 var3 = class443.field6447[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class7 var4 = var3.field2493;
            var3.field2493 = null;
            return var4;
        }
    }
}
