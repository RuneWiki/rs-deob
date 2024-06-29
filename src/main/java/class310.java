import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class310 extends class739 {

    @OriginalMember(owner = "client!bv", name = "E", descriptor = "[[B")
    public static byte[][] field4074 = new byte[50][];

    @OriginalMember(owner = "client!bv", name = "M", descriptor = "Z")
    public static boolean field4081 = false;

    @OriginalMember(owner = "client!bv", name = "H", descriptor = "Ltba;")
    public static class165 field4077 = new class165(32);

    @OriginalMember(owner = "client!bv", name = "N", descriptor = "Lbia;")
    public static class501 field4082 = new class501(2);

    @OriginalMember(owner = "client!bv", name = "O", descriptor = "Lkg;")
    public static class275 field4083 = new class275(39, 8);

    @OriginalMember(owner = "client!bv", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field4085 = "";

    @OriginalMember(owner = "client!bv", name = "R", descriptor = "[I")
    public static int[] field4086 = new int[4096];

    @OriginalMember(owner = "client!bv", name = "F", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!bv", name = "G", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!bv", name = "J", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!bv", name = "K", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!bv", name = "L", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!bv", name = "P", descriptor = "Lsq;")
    public static class181 field4084;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IBI)V", line = 5)
    private final void method1859(int arg0, byte arg1, int arg2) {
        ++field4078;
        int var4 = class634.field8751[arg0];
        int var5 = class287.field3604[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class290.field3810 = arg2;
            class326.field4187 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class290.field3810 = arg0;
            class326.field4187 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class290.field3810 = arg0;
            class326.field4187 = -arg2 + class29.field523;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class290.field3810 = -arg2 + class549.field7672;
            class326.field4187 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class326.field4187 = -arg0 + class29.field523;
            class290.field3810 = -arg2 + class549.field7672;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class326.field4187 = class29.field523 - arg2;
            class290.field3810 = -arg0 + class549.field7672;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class290.field3810 = class549.field7672 - arg0;
            class326.field4187 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class290.field3810 = arg2;
            class326.field4187 = -arg0 + class29.field523;
        }
        class326.field4187 &= class346.field4366;
        if (arg1 <= 108) {
            this.method215(88, -27);
        }
        class290.field3810 &= class683.field9515;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IILha;ILaa;Lria;III)V", line = 79)
    public static final void method1860(int arg0, int arg1, class60 arg2, int arg3, class489 arg4, class288 arg5, int arg6, int arg7, int arg8) {
        ++field4079;
        if (arg7 != -15134) {
            method1860(-112, -4, (class60) null, -123, (class489) null, (class288) null, -122, -94, -123);
        }
        class278 var9 = class424.field5399.method3085((byte) -122, arg8);
        if (var9 != null && var9.field3490 && var9.method1644(class516.field7236, true)) {
            if (var9.field3487 != null) {
                int[] var10 = new int[var9.field3487.length];
                for (int var11 = 0; ~var11 > ~(var10.length / 2); ++var11) {
                    int var28;
                    if (class650.field9023 == 4) {
                        var28 = 16383 & (int) class521.field7309;
                    } else {
                        var28 = 16383 & (int) class521.field7309 + class683.field9519;
                    }
                    int var29 = class16.field320[var28];
                    int var30 = class16.field322[var28];
                    if (class650.field9023 != 4) {
                        var29 = var29 * 256 / (class127.field1815 + 256);
                        var30 = var30 * 256 / (class127.field1815 + 256);
                    }
                    var10[var11 * 2] = arg5.field3617 / 2 + arg6 - -((var9.field3487[var11 * 2] * 4 + arg0) * var30 + (var9.field3487[var11 * 2 + 1] * 4 + arg3) * var29 >> 14);
                    var10[var11 * 2 + 1] = arg5.field3714 / 2 + -((var9.field3487[var11 * 2 - -1] * 4 + arg3) * var30 - (var9.field3487[var11 * 2] * 4 + arg0) * var29 >> 14) + arg1;
                }
                class671.method3774(arg2, var10, var9.field3506, arg5.field3777, arg5.field3621);
                if (~var9.field3505 >= -1) {
                    for (int var12 = 0; var12 < var10.length / 2 - 1; ++var12) {
                        arg2.method447(var10[var12 * 2], var10[var12 * 2 - -1], var10[(var12 - -1) * 2], var10[var12 * 2 - -2 + 1], var9.field3498[255 & var9.field3509[var12]], 1, arg4, arg6, arg1);
                    }
                    arg2.method447(var10[var10.length + -2], var10[var10.length + -1], var10[0], var10[1], var9.field3498[255 & var9.field3509[var9.field3509.length + -1]], 1, arg4, arg6, arg1);
                } else {
                    for (int var13 = 0; var10.length / 2 + -1 > var13; ++var13) {
                        int var21 = var10[var13 * 2];
                        int var22 = var10[var13 * 2 - -1];
                        int var23 = var10[(var13 + 1) * 2];
                        int var24 = var10[(var13 + 1) * 2 - -1];
                        if (var23 >= var21) {
                            if (~var21 == ~var23 && ~var24 > ~var22) {
                                int var25 = var22;
                                var22 = var24;
                                var24 = var25;
                            }
                        } else {
                            int var26 = var21;
                            var21 = var23;
                            int var27 = var22;
                            var22 = var24;
                            var23 = var26;
                            var24 = var27;
                        }
                        arg2.method516(var21, var22, var23, var24, var9.field3498[var9.field3509[var13] & 255], 1, arg4, arg6, arg1, var9.field3505, var9.field3515, var9.field3520);
                    }
                    int var14 = var10[var10.length - 2];
                    int var15 = var10[var10.length + -1];
                    int var16 = var10[0];
                    int var17 = var10[1];
                    if (var16 >= var14) {
                        if (var14 == var16 && ~var15 < ~var17) {
                            int var18 = var15;
                            var15 = var17;
                            var17 = var18;
                        }
                    } else {
                        int var19 = var14;
                        var14 = var16;
                        int var20 = var15;
                        var15 = var17;
                        var16 = var19;
                        var17 = var20;
                    }
                    arg2.method516(var14, var15, var16, var17, var9.field3498[var9.field3509[var9.field3509.length - 1] & 255], 1, arg4, arg6, arg1, var9.field3505, var9.field3515, var9.field3520);
                }
            }
            class481 var31 = null;
            if (var9.field3530 != -1) {
                var31 = var9.method1642(false, arg2, -11858);
                if (var31 != null) {
                    class211.method1356(arg0, arg4, var31, arg6, (byte) 93, arg3, arg5, arg1);
                }
            }
            if (var9.field3522 != null) {
                int var32 = 0;
                if (var31 != null) {
                    var32 = var31.method144();
                }
                class61 var33 = class164.field2272;
                class274 var34 = class165.field2306;
                if (~var9.field3500 == -2) {
                    var33 = class372.field4774;
                    var34 = class697.field9708;
                }
                if (~var9.field3500 == -3) {
                    var34 = class270.field3406;
                    var33 = class242.field3132;
                }
                class508.method2963(var9.field3534, arg5, (byte) -39, arg0, arg6, var34, arg1, var33, var9.field3522, arg4, var32, arg3);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lsl;II)V", line = 256)
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            this.method215(-10, -96);
        }
        if (~arg1 == -1) {
            super.field10297 = arg0.method2600((byte) -128) == 1;
        }
        ++field4075;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V", line = 270)
    public static void method1861(byte arg0) {
        field4077 = null;
        field4082 = null;
        field4085 = null;
        field4083 = null;
        if (arg0 != -19) {
            method1861((byte) 51);
        }
        field4086 = null;
        field4084 = null;
        field4074 = null;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)[I", line = 288)
    public final int[] method215(int arg0, int arg1) {
        ++field4080;
        int[] var3 = super.field10311.method2116(arg1, (byte) 61);
        if (arg0 != -23347) {
            field4081 = false;
        }
        if (super.field10311.field4728) {
            for (int var4 = 0; ~var4 > ~class29.field523; ++var4) {
                this.method1859(var4, (byte) 111, arg1);
                int[] var5 = this.method4115(-120, class290.field3810, 0);
                var3[var4] = var5[class326.field4187];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V", line = 322)
    public class310() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BI)[[I", line = 326)
    public final int[][] method223(byte arg0, int arg1) {
        ++field4076;
        int[][] var3 = super.field10312.method2191((byte) 52, arg1);
        if (arg0 <= 26) {
            field4085 = null;
        }
        if (super.field10312.field4922) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class29.field523 > var7; ++var7) {
                this.method1859(var7, (byte) 119, arg1);
                int[][] var8 = this.method4119(2, 0, class290.field3810);
                var4[var7] = var8[0][class326.field4187];
                var5[var7] = var8[1][class326.field4187];
                var6[var7] = var8[2][class326.field4187];
            }
        }
        return var3;
    }
}
