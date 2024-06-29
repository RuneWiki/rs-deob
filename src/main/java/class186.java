import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class186 extends class23 {

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "I")
    private int field3628 = 1024;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
    private int field3624 = 1024;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
    private int field3626 = 1024;

    @OriginalMember(owner = "client!ra", name = "db", descriptor = "I")
    private int field3637 = 2048;

    @OriginalMember(owner = "client!ra", name = "fb", descriptor = "I")
    private int field3639 = 1024;

    @OriginalMember(owner = "client!ra", name = "hb", descriptor = "I")
    private int field3641 = 0;

    @OriginalMember(owner = "client!ra", name = "kb", descriptor = "I")
    private int field3644 = 0;

    @OriginalMember(owner = "client!ra", name = "jb", descriptor = "I")
    private int field3643 = 819;

    @OriginalMember(owner = "client!ra", name = "cb", descriptor = "I")
    private int field3636 = 409;

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "Li;")
    public static class88 field3629 = class208.method1425(105, "sch-Utteln:");

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "J")
    public static volatile long field3633 = 0L;

    @OriginalMember(owner = "client!ra", name = "eb", descriptor = "Li;")
    public static class88 field3638 = class208.method1425(105, "<col=ff3000>");

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "Ltc;")
    public static class210 field3625 = new class210();

    @OriginalMember(owner = "client!ra", name = "gb", descriptor = "I")
    public static int field3640 = 0;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!ra", name = "ab", descriptor = "I")
    private int field3634;

    @OriginalMember(owner = "client!ra", name = "bb", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!ra", name = "ib", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        int[] var3 = super.field379.method1080(false, arg0);
        ++field3630;
        if (arg1 <= 19) {
            this.method54(127, (byte) -100);
        }
        if (super.field379.field3100) {
            int[][] var4 = super.field379.method1077(-127);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = class70.field1276 * this.field3639 >> 12;
            int var14 = 0;
            int var15 = class70.field1276 * this.field3637 >> 12;
            int var16 = class27.field460 * this.field3636 >> 12;
            int var17 = class27.field460 * this.field3643 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            } else {
                this.field3634 = class70.field1276 / 8 * this.field3626 >> 12;
                int var18 = class70.field1276 / var13 + 1;
                int[][] var19 = new int[var18][3];
                Random var20 = new Random((long) this.field3641);
                int[][] var21 = new int[var18][3];
                while (true) {
                    while (true) {
                        int var22 = var13 - -class119.method814(-var13 + var15, var20, 54210528);
                        int var23 = var8 + var22;
                        int var24 = var16 + class119.method814(-var16 + var17, var20, 54210528);
                        if (var23 > class70.field1276) {
                            var23 = class70.field1276;
                            var22 = class70.field1276 - var8;
                        }
                        int var28;
                        if (var11) {
                            var28 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var21[var9];
                            int var27 = 0;
                            var28 = var26[2];
                            int var29 = var23 - -var5;
                            if (var29 < 0) {
                                var29 += class70.field1276;
                            }
                            if (~class70.field1276 > ~var29) {
                                var29 -= class70.field1276;
                            }
                            while (true) {
                                int[] var30 = var21[var25];
                                if (var29 >= var30[0] && var29 <= var30[1]) {
                                    if (~var9 != ~var25) {
                                        int var31 = var5 + var8;
                                        if (var31 < 0) {
                                            var31 += class70.field1276;
                                        }
                                        if (~var31 < ~class70.field1276) {
                                            var31 -= class70.field1276;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var27; ++var32) {
                                            int[] var40 = var21[(var9 + var32) % var14];
                                            var28 = Math.max(var28, var40[2]);
                                        }
                                        for (int var33 = 0; var27 >= var33; ++var33) {
                                            int[] var34 = var21[(var9 - -var33) % var14];
                                            int var35 = var34[2];
                                            if (var28 != var35) {
                                                int var36 = var34[1];
                                                int var37 = var34[0];
                                                int var38;
                                                int var39;
                                                if (~var29 >= ~var31) {
                                                    if (var37 == 0) {
                                                        var38 = Math.min(var29, var36);
                                                        var39 = 0;
                                                    } else {
                                                        var39 = Math.max(var31, var37);
                                                        var38 = class70.field1276;
                                                    }
                                                } else {
                                                    var39 = Math.max(var31, var37);
                                                    var38 = Math.min(var29, var36);
                                                }
                                                this.method1310(var20, var4, var7 + var39, var35, var38 - var39, false, var28 - var35);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var25;
                                if (~var25 <= ~var14) {
                                    var25 = 0;
                                }
                                ++var27;
                            }
                        }
                        if (var24 + var28 <= class27.field460) {
                            var10 = false;
                        } else {
                            var24 = class27.field460 - var28;
                        }
                        if (class70.field1276 == var23) {
                            this.method1310(var20, var4, var8 - -var6, var28, var22, false, var24);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            var9 = 0;
                            var11 = false;
                            int[] var41 = var19[var12++];
                            var41[2] = var24 + var28;
                            int[][] var42 = var21;
                            var14 = var12;
                            var41[0] = var8;
                            var8 = 0;
                            var21 = var19;
                            var7 = var6;
                            var12 = 0;
                            var41[1] = var23;
                            var19 = var42;
                            var6 = class119.method814(class70.field1276, var20, 54210528);
                            var5 = var6 - var7;
                            int var43 = var5;
                            if (~var5 > -1) {
                                var43 = class70.field1276 + var5;
                            }
                            if (~var43 < ~class70.field1276) {
                                var43 -= class70.field1276;
                            }
                            while (true) {
                                int[] var44 = var21[var9];
                                if (~var43 <= ~var44[0] && var44[1] >= var43) {
                                    break;
                                }
                                ++var9;
                                if (~var9 <= ~var14) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var12++];
                            var45[0] = var8;
                            var45[2] = var24 + var28;
                            var45[1] = var23;
                            this.method1310(var20, var4, var6 + var8, var28, var22, false, var24);
                            var8 = var23;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(Z)V")
    public static void method1308(boolean arg0) {
        field3625 = null;
        field3629 = null;
        if (!arg0) {
            field3638 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(Z)V")
    public static final void method1309(boolean arg0) {
        ++field3631;
        short var1 = 256;
        if (class154.field2971 > 0) {
            for (int var2 = 0; var2 < 256; ++var2) {
                if (~class154.field2971 >= -769) {
                    if (class154.field2971 <= 256) {
                        class157.field3036[var2] = class228.method1527(class3.field32[var2], -class154.field2971 + 256, (byte) -38, class15.field234[var2]);
                    } else {
                        class157.field3036[var2] = class15.field234[var2];
                    }
                } else {
                    class157.field3036[var2] = class228.method1527(class15.field234[var2], -class154.field2971 + 1024, (byte) -38, class3.field32[var2]);
                }
            }
        } else if (~class161.field3101 < -1) {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                if (class161.field3101 <= 768) {
                    if (~class161.field3101 >= -257) {
                        class157.field3036[var3] = class228.method1527(class3.field32[var3], -class161.field3101 + 256, (byte) -38, class156.field3016[var3]);
                    } else {
                        class157.field3036[var3] = class156.field3016[var3];
                    }
                } else {
                    class157.field3036[var3] = class228.method1527(class156.field3016[var3], 1024 - class161.field3101, (byte) -38, class3.field32[var3]);
                }
            }
        } else {
            for (int var4 = 0; ~var4 > -257; ++var4) {
                class157.field3036[var4] = class3.field32[var4];
            }
        }
        int var5 = class88.field1640.field3656 * 9;
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 1; ~(var1 + -1) < ~var8; ++var8) {
            int var21 = (-var8 + var1) * class240.field4456[var8] / var1 + 22;
            if (~var21 > -1) {
                var21 = 0;
            }
            var6 += var21;
            for (int var22 = var21; var22 < 128; ++var22) {
                int var24 = class190.field3669[var6++];
                int var25 = class88.field1640.field3249[var5++];
                if (~var24 == -1) {
                    class34.field589.field3249[var7++] = var25;
                } else {
                    int var27 = 256 - var24;
                    int var28 = class157.field3036[var24];
                    class34.field589.field3249[var7++] = class70.method470(class70.method470(var28, 16711935) * var24 - -(var27 * class70.method470(var25, 16711935)), -16711936) - -class70.method470(var27 * class70.method470(var25, 65280) + class70.method470(65280, var28) * var24, 16711680) >> 8;
                }
            }
            for (int var23 = 0; var21 > var23; ++var23) {
                class34.field589.field3249[var7++] = class88.field1640.field3249[var5++];
            }
            var5 += class88.field1640.field3656 - 128;
        }
        int var9 = 0;
        int var10 = 0;
        class34.field589.method1163(0, 9);
        int var11 = class88.field1640.field3656 * 9 - -128;
        for (int var12 = 1; ~(var1 - 1) < ~var12; ++var12) {
            int var13 = (-var12 + var1) * class240.field4456[var12] / var1 + 22;
            if (var13 < 0) {
                var13 = 0;
            }
            for (int var14 = 0; ~var13 < ~var14; ++var14) {
                int var10001 = var9++;
                --var11;
                class89.field1676.field3249[var10001] = class88.field1640.field3249[var11];
            }
            for (int var15 = var13; ~var15 > -129; ++var15) {
                int var16 = class190.field3669[var10++];
                --var11;
                int var17 = class88.field1640.field3249[var11];
                if (var16 != 0) {
                    int var19 = -var16 + 256;
                    int var20 = class157.field3036[var16];
                    class89.field1676.field3249[var9++] = class70.method470(class70.method470(var17, 65280) * var19 + var16 * class70.method470(65280, var20), 16711680) + class70.method470(class70.method470(16711935, var17) * var19 + class70.method470(16711935, var20) * var16, -16711936) >> 8;
                } else {
                    class89.field1676.field3249[var9++] = var17;
                }
            }
            var11 += class88.field1640.field3656 - -128;
            var10 += var13;
        }
        if (arg0) {
            field3640 = 26;
        }
        class89.field1676.method1163(637, 9);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/util/Random;[[IIIIZI)V")
    private final void method1310(Random arg0, int[][] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        ++field3627;
        int var8 = ~this.field3624 >= -1 ? 4096 : -class119.method814(this.field3624, arg0, 54210528) + 4096;
        int var9 = this.field3634 * this.field3628 >> 12;
        int var10 = this.field3634 + -(~var9 >= -1 ? 0 : class119.method814(var9, arg0, 54210528));
        if (class70.field1276 <= arg2) {
            arg2 -= class70.field1276;
        }
        if (~var10 >= -1) {
            if (~(arg2 + arg4) < ~class70.field1276) {
                int var11 = -arg2 + class70.field1276;
                for (int var12 = 0; ~var12 > ~arg6; ++var12) {
                    int[] var13 = arg1[arg3 + var12];
                    class124.method839(var13, arg2, var11, var8);
                    class124.method839(var13, 0, -var11 + arg4, var8);
                }
            } else {
                for (int var14 = 0; ~arg6 < ~var14; ++var14) {
                    class124.method839(arg1[arg3 + var14], arg2, arg4, var8);
                }
            }
        } else {
            if (arg6 <= 0 || arg4 <= 0) {
                return;
            }
            int var15 = arg4 / 2;
            int var16 = arg6 / 2;
            int var17 = var16 >= var10 ? var10 : var16;
            int var18 = var15 >= var10 ? var10 : var15;
            int var19 = arg2 + var18;
            int var20 = -(var18 * 2) + arg4;
            for (int var21 = 0; ~var21 > ~arg6; ++var21) {
                int[] var22 = arg1[arg3 + var21];
                if (var17 > var21) {
                    int var23 = var8 * var21 / var17;
                    if (~this.field3644 != -1) {
                        for (int var24 = 0; ~var18 < ~var24; ++var24) {
                            int var25 = var8 * var24 / var18;
                            var22[class70.method470(arg2 + var24, class45.field789)] = var22[class70.method470(-var24 + arg2 - (-arg4 - -1), class45.field789)] = ~var23 >= ~var25 ? var23 : var25;
                        }
                    } else {
                        for (int var26 = 0; var18 > var26; ++var26) {
                            int var28 = var8 * var26 / var18;
                            var22[class70.method470(arg2 + var26, class45.field789)] = var22[class70.method470(-var26 + arg2 + arg4 + -1, class45.field789)] = var23 * var28 >> 12;
                        }
                    }
                    if (~class70.field1276 > ~(var19 + var20)) {
                        int var27 = class70.field1276 - var19;
                        class124.method839(var22, var19, var27, var23);
                        class124.method839(var22, 0, var20 - var27, var23);
                    } else {
                        class124.method839(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = -var21 + arg6 + -1;
                    if (~var17 < ~var29) {
                        int var30 = var8 * var29 / var17;
                        if (~this.field3644 != -1) {
                            for (int var31 = 0; ~var18 < ~var31; ++var31) {
                                int var32 = var8 * var31 / var18;
                                var22[class70.method470(class45.field789, arg2 + var31)] = var22[class70.method470(class45.field789, arg2 - -arg4 + -var31 + -1)] = ~var30 >= ~var32 ? var30 : var32;
                            }
                        } else {
                            for (int var33 = 0; ~var18 < ~var33; ++var33) {
                                int var35 = var8 * var33 / var18;
                                var22[class70.method470(class45.field789, arg2 + var33)] = var22[class70.method470(class45.field789, arg2 - -arg4 + -var33 + -1)] = var30 * var35 >> 12;
                            }
                        }
                        if (~class70.field1276 <= ~(var19 - -var20)) {
                            class124.method839(var22, var19, var20, var30);
                        } else {
                            int var34 = -var19 + class70.field1276;
                            class124.method839(var22, var19, var34, var30);
                            class124.method839(var22, 0, -var34 + var20, var30);
                        }
                    } else {
                        for (int var36 = 0; var36 < var18; ++var36) {
                            var22[class70.method470(arg2 + var36, class45.field789)] = var22[class70.method470(class45.field789, arg2 + arg4 - var36 + -1)] = var8 * var36 / var18;
                        }
                        if (~(var19 + var20) >= ~class70.field1276) {
                            class124.method839(var22, var19, var20, var8);
                        } else {
                            int var37 = -var19 + class70.field1276;
                            class124.method839(var22, var19, var37, var8);
                            class124.method839(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
        if (arg5) {
            method1308(false);
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class186() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (arg1 != -3) {
            this.method11((class46) null, -78, -69);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (arg2 != 7) {
                                        if (arg2 == 8) {
                                            this.field3624 = arg0.method301(80);
                                        }
                                    } else {
                                        this.field3628 = arg0.method301(72);
                                    }
                                } else {
                                    this.field3644 = arg0.method347(26119);
                                }
                            } else {
                                this.field3626 = arg0.method301(44);
                            }
                        } else {
                            this.field3643 = arg0.method301(13);
                        }
                    } else {
                        this.field3636 = arg0.method301(arg1 + 67);
                    }
                } else {
                    this.field3637 = arg0.method301(69);
                }
            } else {
                this.field3639 = arg0.method301(83);
            }
        } else {
            this.field3641 = arg0.method347(26119);
        }
        ++field3635;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V")
    public final void method123(byte arg0) {
        if (arg0 == -69) {
            ++field3632;
        }
    }
}
