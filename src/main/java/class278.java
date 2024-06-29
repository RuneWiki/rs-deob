import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class278 {

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public int field4965;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "[Lid;")
    public class149[] field4967;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "[S")
    public short[] field4969;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "[I")
    public int[] field4959;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "[B")
    public byte[] field4963;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "[S")
    public short[] field4970;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Lid;")
    private static class149 field4961 = class60.method382("Examine", (byte) 59);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Z")
    public static boolean field4958 = true;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Lid;")
    public static class149 field4968 = field4961;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "[Lqf;")
    public static class243[] field4973 = new class243[50];

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "J")
    public static long field4966 = 0L;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "Lid;")
    public static class149 field4975 = class60.method382("; Max)2Age=", (byte) 124);

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)Z")
    public final boolean method1915(int arg0, byte arg1) {
        int var3 = -9 / ((70 - arg1) / 50);
        field4974++;
        return (this.field4963[arg0] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(IB)I")
    public final int method1916(int arg0, byte arg1) {
        field4960++;
        return arg1 <= 5 ? 68 : this.field4963[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILnd;IIZILek;IZIIII)Lnd;")
    public static final class262 method1917(int arg0, int arg1, class262 arg2, int arg3, int arg4, boolean arg5, int arg6, class164 arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        field4964++;
        long var14 = ((long) arg4 << 32) + ((long) arg6 << 48) + (long) ((arg11 << 16) + (arg3 << 24) + arg1);
        class262 var16 = (class262) class287.field5096.method1293(var14, !arg5);
        if (var16 == null) {
            byte var17;
            if (arg1 == 1) {
                var17 = 9;
            } else if (arg1 == 2) {
                var17 = 12;
            } else if (arg1 == 3) {
                var17 = 15;
            } else if (arg1 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19 = 3;
            int[][] var20 = new int[var19][var17];
            class241 var21 = new class241((var17 * var19) + 1, var17 * 2 * var19 + -var17, 0);
            int var22 = var21.method1684(0, 0, 0);
            for (int var23 = 0; var23 < var19; var23++) {
                int var30 = var18[var23];
                int var31 = var18[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = class235.field4123[var33] * var30 + arg8 >> 16;
                    int var35 = class235.field4118[var33] * var31 + arg0 >> 16;
                    var20[var23][var32] = var21.method1684(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var19; var24++) {
                int var25 = (var24 * 256 + 128) / var19;
                int var26 = 256 - var25;
                byte var27 = (byte) (arg3 * var25 + arg11 * var26 >> 8);
                short var28 = (short) (((arg4 & 0x7F) * var26 + (arg6 & 0x7F) * var25 & 0x7F00) + ((arg4 & 0x380) * var26 + (arg6 & 0x380) * var25 & 0x38000) + ((arg4 & 0xFC00) * var26 + (arg6 & 0xFC00) * var25 & 0xFC0000) >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var21.method1658(var22, var20[0][(var29 + 1) % var17], var20[0][var29], (byte) 1, var28, var27);
                    } else {
                        var21.method1658(var20[var24 - 1][var29], var20[var24 - 1][(var29 + 1) % var17], var20[var24][(var29 + 1) % var17], (byte) 1, var28, var27);
                        var21.method1658(var20[var24 - 1][var29], var20[var24][(var29 + 1) % var17], var20[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var21.method1668(64, 768, -50, -10, -50);
            class287.field5096.method1295(var14, var16, (byte) -71);
        }
        int var36 = arg1 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = var36;
        if (arg9) {
            if (arg10 > 1152 && arg10 < 1920) {
                var40 = var36 + 128;
            }
            if (arg10 > 1664 || arg10 < 384) {
                var37 -= 128;
            }
            if (arg10 > 640 && arg10 < 1408) {
                var39 = var36 + 128;
            }
            if (arg10 > 128 && arg10 < 896) {
                var38 -= 128;
            }
        }
        if (!arg5) {
            return null;
        }
        int var41 = arg2.method853();
        if (var41 < var38) {
            var41 = var38;
        }
        int var42 = arg2.method852();
        int var43 = arg2.method828();
        int var44 = arg2.method850();
        if (var43 < var37) {
            var43 = var37;
        }
        class137 var45 = null;
        if (var44 > var39) {
            var44 = var39;
        }
        if (var40 < var42) {
            var42 = var40;
        }
        if (arg7 != null) {
            int var46 = arg7.field3035[arg12];
            var45 = class148.method1014(98, var46 >> 16);
            arg12 = var46 & 0xFFFF;
        }
        class262 var47;
        if (var45 == null) {
            var47 = var16.method848(true, true, true);
            var47.method845((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method826((var41 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method848(!var45.method961((byte) -49, arg12), !var45.method959(1, arg12), true);
            var47.method845((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method826((var41 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method1826(var45, arg12);
        }
        if (arg10 != 0) {
            var47.method835(arg10);
        }
        class121 var48 = (class121) var47;
        if (class287.method1968(class277.field4948, arg8 + var41, arg0 + var43, (byte) 107) != arg13 || arg13 != class287.method1968(class277.field4948, arg8 + var42, arg0 + var44, (byte) 98)) {
            for (int var49 = 0; var49 < var48.field2079; var49++) {
                var48.field2066[var49] += class287.method1968(class277.field4948, var48.field2096[var49] + arg8, var48.field2071[var49] + arg0, (byte) -90) - arg13;
            }
            var48.field2086 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)Z")
    public final boolean method1918(int arg0, boolean arg1) {
        field4971++;
        if (!arg1) {
            this.field4967 = null;
        }
        return (this.field4963[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Z")
    public final boolean method1919(int arg0, int arg1) {
        field4962++;
        int var3 = -63 % ((4 - arg0) / 54);
        return (this.field4963[arg1] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ldd;I)V")
    public static final void method1920(class133 arg0, int arg1) {
        if (arg1 >= 119) {
            field4972++;
            class10.field136 = arg0;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
    public static void method1921(boolean arg0) {
        if (arg0) {
            field4961 = null;
        }
        field4973 = null;
        field4968 = null;
        field4975 = null;
        field4961 = null;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(I)V")
    public class278(int arg0) {
        this.field4965 = arg0;
        this.field4967 = new class149[this.field4965];
        this.field4969 = new short[this.field4965];
        this.field4959 = new int[this.field4965];
        this.field4963 = new byte[this.field4965];
        this.field4970 = new short[this.field4965];
    }
}
