import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class45 implements Runnable {

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "Z")
    public boolean field809 = true;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Ljava/lang/Object;")
    public Object field805 = new Object();

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "[I")
    public int[] field817 = new int[500];

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "[I")
    public int[] field818 = new int[500];

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "I")
    public int field820 = 0;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field797 = 0;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field800 = 0;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field810 = 0;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field801 = 50;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "Ljd;")
    private static class85 field799 = class221.method1499("Please wait)3)3)3", (byte) 96);

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "[I")
    public static int[] field812 = new int[field801];

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "[I")
    public static int[] field802 = new int[field801];

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "[I")
    public static int[] field807 = new int[field801];

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "[I")
    public static int[] field815 = new int[field801];

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "[I")
    public static int[] field808 = new int[field801];

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "[I")
    public static int[] field804 = new int[field801];

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "[Ljd;")
    public static class85[] field813 = new class85[field801];

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "Ljd;")
    public static class85 field806 = field799;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "Ljd;")
    public static class85 field814 = class221.method1499("Cache:", (byte) -119);

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "[I")
    public static int[] field819 = new int[field801];

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "[I")
    public static int[] field811;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "[Lqf;")
    public static class232[] field798;

    @OriginalMember(owner = "client!aj", name = "run", descriptor = "()V")
    public final void run() {
        field803++;
        while (this.field809) {
            Object var1 = this.field805;
            synchronized (this.field805) {
                if (this.field820 < 500) {
                    this.field818[this.field820] = class245.field4195;
                    this.field817[this.field820] = class106.field1851;
                    this.field820++;
                }
            }
            class190.method1311(50L, 1);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
    public static void method314(byte arg0) {
        field806 = null;
        field819 = null;
        field804 = null;
        field807 = null;
        field814 = null;
        field812 = null;
        field813 = null;
        field811 = null;
        field798 = null;
        field802 = null;
        field799 = null;
        field808 = null;
        if (arg0 >= -118) {
            method315(-81, 122, false, 86, -65, 2, 109, (class106) null, -36, 43, 7, -28, (class26) null, -31);
        }
        field815 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIZIIIILde;IIIILwb;I)Lwb;")
    public static final class26 method315(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, class106 arg7, int arg8, int arg9, int arg10, int arg11, class26 arg12, int arg13) {
        field816++;
        long var14 = ((long) arg1 << 48) + ((long) arg11 << 32) + (long) ((arg13 << 24) + (arg9 - -(arg5 << 16)));
        class26 var16 = (class26) class131.field2289.method1269(var14, (byte) 48);
        if (var16 == null) {
            byte var17;
            if (arg9 == 1) {
                var17 = 9;
            } else if (arg9 == 2) {
                var17 = 12;
            } else if (arg9 == 3) {
                var17 = 15;
            } else if (arg9 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class165 var20 = new class165((var17 * var18) + 1, var17 * var18 * 2 + -var17, 0);
            int[][] var21 = new int[var18][var17];
            int var22 = var20.method1088(0, 0, 0);
            for (int var23 = 0; var23 < var18; var23++) {
                int var30 = var19[var23];
                int var31 = var19[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = class173.field2984[var33] * var30 + arg6 >> 16;
                    int var35 = class173.field2995[var33] * var31 + arg10 >> 16;
                    var21[var23][var32] = var20.method1088(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var18; var24++) {
                int var25 = (var24 * 256 + 128) / var18;
                int var26 = 256 - var25;
                byte var27 = (byte) (arg5 * var26 + arg13 * var25 >> 8);
                short var28 = (short) (((arg1 & 0x7F) * var25 + (arg11 & 0x7F) * var26 & 0x7F00) + ((arg1 & 0xFC00) * var25 + (arg11 & 0xFC00) * var26 & 0xFC0000) + ((arg1 & 0x380) * var25 + (arg11 & 0x380) * var26 & 0x38000) >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var20.method1102(var22, var21[0][(var29 + 1) % var17], var21[0][var29], (byte) 1, var28, var27);
                    } else {
                        var20.method1102(var21[var24 - 1][var29], var21[var24 - 1][(var29 + 1) % var17], var21[var24][(var29 + 1) % var17], (byte) 1, var28, var27);
                        var20.method1102(var21[var24 - 1][var29], var21[var24][(var29 + 1) % var17], var21[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var20.method1085(64, 768, -50, -10, -50);
            class131.field2289.method1271(-15561, var16, var14);
        }
        int var36 = arg9 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = arg12.method187();
        int var41 = var36;
        if (arg2) {
            if (arg0 > 640 && arg0 < 1408) {
                var39 = var36 + 128;
            }
            if (arg0 > 128 && arg0 < 896) {
                var37 -= 128;
            }
            if (arg0 > 1152 && arg0 < 1920) {
                var41 = var36 + 128;
            }
            if (arg0 > 1664 || arg0 < 384) {
                var38 -= 128;
            }
        }
        int var42 = arg12.method178();
        int var43 = arg12.method186();
        if (var43 < var38) {
            var43 = var38;
        }
        int var44 = arg12.method173();
        if (var40 < var37) {
            var40 = var37;
        }
        if (var42 > var41) {
            var42 = var41;
        }
        if (var39 < var44) {
            var44 = var39;
        }
        class7 var45 = null;
        if (arg7 != null) {
            int var46 = arg7.field1857[arg8];
            var45 = class228.method1531(-31683, var46 >> 16);
            arg8 = var46 & 0xFFFF;
        }
        class26 var47;
        if (var45 == null) {
            var47 = var16.method170(true, true);
            var47.method175((var42 - var40) / 2, 128, (var44 - var43) / 2);
            var47.method177((var40 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method170(!var45.method33((byte) 58, arg8), true);
            var47.method175((var42 - var40) / 2, 128, (var44 - var43) / 2);
            var47.method177((var40 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method188(var45, arg8);
        }
        if (arg0 != 0) {
            var47.method169(arg0);
        }
        if (arg4 != -19071) {
            method315(88, 0, true, 42, 41, 55, 74, (class106) null, -58, 64, -117, -80, (class26) null, -37);
        }
        class42 var48 = (class42) var47;
        if (arg3 != class246.method1660(604124551, arg6 + var40, class116.field2066, arg10 + var43) || arg3 != class246.method1660(604124551, arg6 + var42, class116.field2066, arg10 + var44)) {
            for (int var49 = 0; var49 < var48.field691; var49++) {
                var48.field692[var49] += class246.method1660(arg4 + 604143622, var48.field710[var49] + arg6, class116.field2066, var48.field694[var49] + arg10) - arg3;
            }
            var48.field689 = false;
        }
        return var47;
    }
}
