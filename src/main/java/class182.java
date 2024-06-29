import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class182 {

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public int field2043;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "[I")
    public int[] field2040;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "[I")
    public int[] field2041;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "[I")
    public static int[] field2042 = new int[14];

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "[I")
    public static int[] field2039 = new int[4096];

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Lsb;")
    public static class305 field2046;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "[I")
    public static int[] field2049;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "[I")
    public static int[] field2048;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Lsb;")
    public static class305 field2047;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public static void method1104(int arg0) {
        field2048 = null;
        field2039 = null;
        field2047 = null;
        field2046 = null;
        if (arg0 <= -110) {
            field2049 = null;
            field2042 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(CBLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1105(char arg0, byte arg1, String arg2) {
        field2045++;
        int var3 = class38.method199(0, arg0, arg2);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0 != arg2.charAt(var8); var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        if (arg1 != -75) {
            method1104(120);
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILwp;ZB)V")
    public static final void method1106(int arg0, int arg1, class452 arg2, boolean arg3, byte arg4) {
        field2044++;
        int var5 = arg2.field6483;
        int var6 = arg2.field6443;
        if (arg4 <= 25) {
            return;
        }
        if (arg2.field6452 == 0) {
            arg2.field6483 = arg2.field6463;
        } else if (arg2.field6452 == 1) {
            arg2.field6483 = arg0 - arg2.field6463;
        } else if (arg2.field6452 == 2) {
            arg2.field6483 = arg2.field6463 * arg0 >> 14;
        }
        if (arg2.field6477 == 0) {
            arg2.field6443 = arg2.field6356;
        } else if (arg2.field6477 == 1) {
            arg2.field6443 = arg1 - arg2.field6356;
        } else if (arg2.field6477 == 2) {
            arg2.field6443 = arg2.field6356 * arg1 >> 14;
        }
        if (arg2.field6452 == 4) {
            arg2.field6483 = arg2.field6443 * arg2.field6367 / arg2.field6326;
        }
        if (arg2.field6477 == 4) {
            arg2.field6443 = arg2.field6483 * arg2.field6326 / arg2.field6367;
        }
        if (class590.field8339 && (client.method3750(arg2).field3898 != 0 || arg2.field6471 == 0)) {
            if (arg2.field6443 < 5 && arg2.field6483 < 5) {
                arg2.field6483 = 5;
                arg2.field6443 = 5;
            } else {
                if (arg2.field6443 <= 0) {
                    arg2.field6443 = 5;
                }
                if (arg2.field6483 <= 0) {
                    arg2.field6483 = 5;
                }
            }
        }
        if (class191.field2196 == arg2.field6335) {
            class492.field7138 = arg2;
        }
        if (arg3 && arg2.field6325 != null && arg2.field6483 != var5 || arg2.field6443 != var6) {
            class213 var7 = new class213();
            var7.field2587 = arg2.field6325;
            var7.field2592 = arg2;
            class472.field6793.method3425(var7, false);
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I)V")
    public class182(int arg0) {
        this.field2043 = arg0;
        this.field2040 = new int[this.field2043];
        this.field2041 = new int[this.field2043];
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2039[var0] = class516.method2938(var0, -61440);
        }
        field2046 = new class305(43, -1);
        field2049 = new int[32];
        field2048 = new int[4];
        field2047 = new class305(37, 7);
        field2050 = 0;
    }
}
