import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class161 extends class29 {

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "[B")
    public byte[] field2596;

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "Lph;")
    public static class229 field2604 = class266.method1858("(U4", 0);

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "Lsi;")
    public static class66 field2601;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "[I")
    public static int[] field2602;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "[Lph;")
    public static class229[] field2599;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V", line = 15)
    public static final void method1135(int arg0) {
        field2600++;
        int var1 = class306.field5174 * 128 + 64;
        int var2 = class48.field698 * 128 + 64;
        int var3 = class259.method1801(var2, -20428, class298.field4849, var1) - class40.field640;
        if (class313.field5281 < 100) {
            if (var1 > class192.field3177) {
                class192.field3177 += (var1 - class192.field3177) * class313.field5281 / 1000 + class209.field3453;
                if (var1 < class192.field3177) {
                    class192.field3177 = var1;
                }
            }
            if (var3 > class205.field3387) {
                class205.field3387 += (var3 - class205.field3387) * class313.field5281 / 1000 + class209.field3453;
                if (var3 < class205.field3387) {
                    class205.field3387 = var3;
                }
            }
            if (class192.field3177 > var1) {
                class192.field3177 -= (class192.field3177 - var1) * class313.field5281 / 1000 + class209.field3453;
                if (class192.field3177 < var1) {
                    class192.field3177 = var1;
                }
            }
            if (var3 < class205.field3387) {
                class205.field3387 -= (class205.field3387 - var3) * class313.field5281 / 1000 + class209.field3453;
                if (class205.field3387 < var3) {
                    class205.field3387 = var3;
                }
            }
            if (class167.field2725 < var2) {
                class167.field2725 += (var2 - class167.field2725) * class313.field5281 / 1000 + class209.field3453;
                if (class167.field2725 > var2) {
                    class167.field2725 = var2;
                }
            }
            if (class167.field2725 > var2) {
                class167.field2725 -= (class167.field2725 - var2) * class313.field5281 / 1000 + class209.field3453;
                if (class167.field2725 < var2) {
                    class167.field2725 = var2;
                }
            }
        } else {
            class192.field3177 = class306.field5174 * 128 + 64;
            class167.field2725 = class48.field698 * 128 + 64;
            class205.field3387 = class259.method1801(class167.field2725, -20428, class298.field4849, class192.field3177) - class40.field640;
        }
        int var4 = class222.field3649 * 128 + 64;
        int var5 = class236.field3887 * 128 + 64;
        int var6 = class259.method1801(var5, -20428, class298.field4849, var4) - class324.field5544;
        int var7 = var6 - class205.field3387;
        int var8 = var5 - class167.field2725;
        int var9 = var4 - class192.field3177;
        int var10 = (int) Math.sqrt((double) (var9 * var9 + (var8 * var8)));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (-325.949D * Math.atan2((double) var9, (double) var8)) & 0x7FF;
        int var13 = var12 - class65.field1004;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 < 128) {
            var11 = 128;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var11 > class222.field3653) {
            class222.field3653 += (var11 - class222.field3653) * class52.field744 / 1000 + class205.field3378;
            if (class222.field3653 > var11) {
                class222.field3653 = var11;
            }
        }
        if (arg0 > ~var13) {
            class65.field1004 += class52.field744 * var13 / 1000 + class205.field3378;
            class65.field1004 &= 0x7FF;
        }
        if (class222.field3653 > var11) {
            class222.field3653 -= (class222.field3653 - var11) * class52.field744 / 1000 + class205.field3378;
            if (var11 > class222.field3653) {
                class222.field3653 = var11;
            }
        }
        if (var13 < 0) {
            class65.field1004 -= class205.field3378 + (-var13 * class52.field744 / 1000);
            class65.field1004 &= 0x7FF;
        }
        int var14 = var12 - class65.field1004;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class65.field1004 = var12;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)I", line = 172)
    public static final int method1136(int arg0, int arg1, int arg2, int arg3) {
        field2598++;
        int var4 = arg0 / arg2;
        int var5 = arg0 & arg2 - 1;
        int var6 = arg3 / arg2;
        int var7 = arg3 & arg2 - 1;
        int var8 = class238.method1683(var6, (byte) -122, var4);
        int var9 = class238.method1683(var6, (byte) 120, var4 + 1);
        int var10 = class238.method1683(var6 + 1, (byte) 46, var4);
        int var11 = class238.method1683(var6 + 1, (byte) -103, var4 + 1);
        int var12 = class166.method1217(var9, var5, var8, arg2, (byte) 100);
        int var13 = -123 / ((arg1 - 50) / 42);
        int var14 = class166.method1217(var11, var5, var10, arg2, (byte) 82);
        return class166.method1217(var14, var7, var12, arg2, (byte) 103);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([[F[[FLqj;IFI[[I[[FIZIIIIIII[[I)I", line = 202)
    public static final int method1137(float[][] arg0, float[][] arg1, class264 arg2, int arg3, float arg4, int arg5, int[][] arg6, float[][] arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int[][] arg17) {
        if (~arg11 == arg10) {
            int var19 = arg13;
            arg13 = arg3;
            arg3 = 128 - var19;
        } else if (arg11 == 2) {
            arg13 = 128 - arg13;
            arg3 = 128 - arg3;
        } else if (arg11 == 3) {
            int var18 = arg13;
            arg13 = 128 - arg3;
            arg3 = var18;
        }
        field2597++;
        int var20;
        float var21;
        float var22;
        float var23;
        if (arg13 == 0 && arg3 == 0) {
            var20 = arg12;
            var21 = arg0[arg5][arg15];
            var22 = arg7[arg5][arg15];
            var23 = arg1[arg5][arg15];
        } else if (arg13 == 128 && arg3 == 0) {
            var23 = arg1[arg5 + 1][arg15];
            var22 = arg7[arg5 + 1][arg15];
            var21 = arg0[arg5 + 1][arg15];
            var20 = arg16;
        } else if (arg13 == 128 && arg3 == 128) {
            var21 = arg0[arg5 + 1][arg15 + 1];
            var23 = arg1[arg5 + 1][arg15 + 1];
            var20 = arg8;
            var22 = arg7[arg5 + 1][arg15 + 1];
        } else if (arg13 == 0 && arg3 == 128) {
            var22 = arg7[arg5][arg15 + 1];
            var20 = arg14;
            var21 = arg0[arg5][arg15 + 1];
            var23 = arg1[arg5][arg15 + 1];
        } else {
            float var24 = arg0[arg5][arg15];
            float var25 = arg7[arg5][arg15];
            float var26 = (float) arg13 / 128.0F;
            float var27 = arg1[arg5][arg15 + 1];
            float var28 = (arg7[arg5 + 1][arg15] - var25) * var26 + var25;
            float var29 = (arg1[arg5 + 1][arg15 + 1] - var27) * var26 + var27;
            float var30 = arg1[arg5][arg15];
            float var31 = (arg0[arg5 + 1][arg15] - var24) * var26 + var24;
            float var32 = (float) arg3 / 128.0F;
            float var33 = (arg1[arg5 + 1][arg15] - var30) * var26 + var30;
            float var34 = arg7[arg5][arg15 + 1];
            float var35 = arg0[arg5][arg15 + 1];
            float var36 = (arg0[arg5 + 1][arg15 + 1] - var35) * var26 + var35;
            var23 = (var29 - var33) * var32 + var33;
            float var37 = (arg7[arg5 + 1][arg15 + 1] - var34) * var26 + var34;
            var21 = (var36 - var31) * var32 + var31;
            var22 = (var37 - var28) * var32 + var28;
            int var38 = class38.method296(arg16, arg12, arg13, 16711935);
            int var39 = class38.method296(arg8, arg14, arg13, 16711935);
            var20 = class38.method296(var39, var38, arg3, 16711935);
        }
        int var40 = (arg5 << 7) + arg13;
        int var41 = (arg15 << 7) + arg3;
        int var42 = class325.method2228(arg6, arg3, arg5, arg13, arg15, arg10 ^ 0x1);
        return arg2.method1841(var40, var42, var41, var23, var22, var21, arg9 ? var20 & 0xFFFFFF00 : var20, arg17 == null ? 0.0F : (float) (var42 - class325.method2228(arg17, arg3, arg5, arg13, arg15, -1)) / arg4);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V", line = 311)
    public static void method1138(byte arg0) {
        field2602 = null;
        field2601 = null;
        field2604 = null;
        if (arg0 != 29) {
            field2604 = (class229) null;
        }
        field2599 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILqe;II)V", line = 326)
    public static final void method1139(int arg0, int arg1, class313 arg2, int arg3, int arg4) {
        field2603++;
        if (arg0 != -23296) {
            field2601 = (class66) null;
        }
        if (class314.field5337 >= 400) {
            return;
        }
        if (arg2.field5262 != null) {
            arg2 = arg2.method2118(0);
        }
        if (arg2 == null || !arg2.field5298) {
            return;
        }
        class229 var5 = arg2.field5293;
        if (arg2.field5291 != 0) {
            var5 = class248.method1746(8528, new class229[] { var5, class304.method2053(class230.field3820.field3468, arg2.field5291, (byte) -87), class228.field3750, class10.field120, class50.method354(0, arg2.field5291), class51.field731 });
        }
        if (class317.field5381 == 1) {
            class306.method2067(arg3, class248.method1746(8528, new class229[] { class208.field3431, class134.field2174, var5 }), class143.field2321, arg1, (short) 18, (long) arg4, 0);
            class240.field3970++;
        } else if (!class8.field103) {
            class129.field2122++;
            class229[] var6 = arg2.field5300;
            if (class177.field2923) {
                var6 = class222.method1552((byte) -16, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class166.field2710 != 0 || !var6[var7].method1630(10, class94.field1591))) {
                        class157.field2557++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 57;
                        }
                        if (var7 == 1) {
                            var8 = 15;
                        }
                        if (var7 == 2) {
                            var8 = 21;
                        }
                        if (var7 == 3) {
                            var8 = 45;
                        }
                        if (var7 == 4) {
                            var8 = 17;
                        }
                        class306.method2067(arg3, class248.method1746(arg0 + 31824, new class229[] { class133.field2157, var5 }), var6[var7], arg1, var8, (long) arg4, 0);
                    }
                }
            }
            if (class166.field2710 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1630(arg0 ^ 0xFFFFA50A, class94.field1591)) {
                        class112.field1902++;
                        short var10 = 0;
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 57;
                        }
                        if (var9 == 1) {
                            var11 = 15;
                        }
                        if (var9 == 2) {
                            var11 = 21;
                        }
                        if (var9 == 3) {
                            var11 = 45;
                        }
                        if (arg2.field5291 > class230.field3820.field3468) {
                            var10 = 2000;
                        }
                        if (var9 == 4) {
                            var11 = 17;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class306.method2067(arg3, class248.method1746(8528, new class229[] { class133.field2157, var5 }), var6[var9], arg1, var11, (long) arg4, 0);
                    }
                }
            }
            class306.method2067(arg3, class248.method1746(8528, new class229[] { class133.field2157, var5 }), class39.field618, arg1, (short) 1002, (long) arg4, 0);
        } else if ((class208.field3434 & 0x2) == 2) {
            class306.method2067(arg3, class248.method1746(8528, new class229[] { class205.field3388, class134.field2174, var5 }), class116.field1965, arg1, (short) 47, (long) arg4, arg0 ^ 0xFFFFA500);
            class290.field4762++;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([B)V", line = 468)
    public class161(byte[] arg0) {
        this.field2596 = arg0;
    }
}
