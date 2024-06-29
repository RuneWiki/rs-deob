import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class46 extends class152 {

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "[I")
    public static int[] field765 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "[Lhh;")
    public static class163[] field769 = new class163[200];

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "Lhh;")
    private static class163 field764 = class137.method1065("Please wait)3)3)3", 17);

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "Lhh;")
    public static class163 field773 = field764;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "B")
    public byte field767;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
    public int field768;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "Lv;")
    public class22 field771;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "[I")
    public static int[] field775;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
    public static final void method336(int arg0) {
        class24.field388.method111((byte) -52);
        field774++;
        if (arg0 != 96) {
            method337(-22, (byte) 70, 0);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBI)V")
    public static final void method337(int arg0, byte arg1, int arg2) {
        if (arg1 != -58) {
            method337(-76, (byte) 81, -69);
        }
        for (int var3 = 0; var3 < class40.field664; var3++) {
            class36 var4 = class60.method412(arg1 + 184, var3);
            if (var4 != null) {
                int var5 = var4.field611;
                if (var5 >= 0 && !class98.field1852.method672(32678, var5)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field620 >= 0) {
                    int var10 = var4.field620;
                    int var11 = (var10 & 0x7F) + arg0;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var6 = class98.field1850[class171.method1274(var12, arg1 + 55, 96)];
                } else if (var5 >= 0) {
                    var6 = class98.field1850[class171.method1274(class98.field1852.method669(arg1 ^ 0xFFFFFF87, var5), -3, 96)];
                } else if (var4.field619 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field619;
                    int var8 = (var7 & 0x7F) + arg0;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (arg2 + var7 & 0xFC00) + (var7 & 0x380) + var8;
                    var6 = class98.field1850[class171.method1274(var9, -3, 96)];
                }
                class231.field4151[var3 + 1] = var6;
            }
        }
        field770++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjava/lang/String;)Lhh;")
    public static final class163 method338(int arg0, String arg1) {
        field766++;
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg1.getBytes();
        }
        class163 var3 = new class163();
        var3.field3020 = var2;
        var3.field2990 = 0;
        int var4 = 26 / ((28 - arg0) / 44);
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var3.field2990++] = var2[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(B)V")
    public static void method339(byte arg0) {
        field764 = null;
        field765 = null;
        field773 = null;
        field769 = null;
        field775 = null;
        if (arg0 > -101) {
            method337(107, (byte) 82, -68);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)I")
    public static int method340(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
