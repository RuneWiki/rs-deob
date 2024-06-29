import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class513 {

    @OriginalMember(owner = "client!el", name = "f", descriptor = "[I")
    public static int[] field6857 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field6853;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "Lbi;")
    public static class449 field6852;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)I", line = 3)
    public static final int method2851(int arg0, int arg1, int arg2) {
        if (arg0 >= -19) {
            return -27;
        }
        field6855++;
        int var3 = class405.method2327(-125, arg2 + 45365, arg1 - -91923, 4) + ((class405.method2327(111, arg2 + 10294, arg1 + 37821, 2) + -128 >> 1) - -(class405.method2327(-124, arg2, arg1, 1) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZII)Z", line = 26)
    public static final boolean method2852(boolean arg0, int arg1, int arg2) {
        field6856++;
        if (arg0) {
            field6852 = null;
        }
        return class443.method2500(arg2, (byte) 72, arg1) & ((arg1 & 0x2000) != 0 | class441.method2498(arg2, 17, arg1) | class563.method3089(-102, arg2, arg1));
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V", line = 38)
    public static void method2853(byte arg0) {
        field6852 = null;
        field6857 = null;
        int var1 = -93 / ((19 - arg0) / 62);
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(III)V", line = 49)
    public static final void method2854(int arg0, int arg1, int arg2) {
        field6853++;
        class382 var3 = class396.method2276(92, 1, arg1);
        var3.method2232(120);
        var3.field5099 = arg0;
        int var4 = 28 / ((38 - arg2) / 46);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)V", line = 62)
    public static final void method2855(int arg0, int arg1) {
        if (arg1 != 4) {
            method2851(-43, -38, -38);
        }
        field6854++;
        class526.method2937(-18538);
        int var2 = class597.field7937.method2929(arg0, (byte) 34).field2150;
        if (var2 == 0) {
            return;
        }
        int var3 = class80.field1261.field3056[arg0];
        if (var2 == 6) {
            class149.field2386 = var3;
        }
        if (var2 == 5) {
            class47.field671 = var3;
        }
    }
}
