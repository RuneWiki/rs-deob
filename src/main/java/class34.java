import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class34 extends class288 {

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
    private int field426 = 0;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    private int field410 = 4096;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "[I")
    public static int[] field418 = new int[4096];

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
    public static int field424 = -1;

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "Ljava/lang/String;")
    public static String field427 = "Loaded interfaces";

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "Ljj;")
    public static class134 field425;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "[S")
    public static short[] field411;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "[[[I")
    public static int[][][] field423;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V")
    public static void method232(boolean arg0) {
        field425 = null;
        field411 = null;
        field418 = null;
        field423 = null;
        field427 = null;
        if (arg0) {
            method237((int[]) null, -62);
        }
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V")
    public static final void method233(int arg0) {
        ++field417;
        if (~class61.field837 != 0 && class248.field3984 != -1) {
            if (arg0 != 23898) {
                method233(-73);
            }
            int var1 = ((-class138.field2279 + class6.field77) * class148.field2384 >> 16) + class138.field2279;
            class148.field2384 += var1;
            if (class148.field2384 >= 65535) {
                if (!class157.field2512) {
                    class281.field4483 = true;
                } else {
                    class281.field4483 = false;
                }
                class157.field2512 = true;
                class148.field2384 = 65535;
            } else {
                class157.field2512 = false;
                class281.field4483 = false;
            }
            int var2 = class289.field4622 * 2;
            float[] var3 = new float[3];
            float var4 = (float) class148.field2384 / 65535.0F;
            for (int var5 = 0; var5 < 3; ++var5) {
                int var21 = class73.field1004[class61.field837][var2][var5] * 3;
                int var22 = class73.field1004[class61.field837][var2 - -1][var5] * 3;
                int var23 = (class73.field1004[class61.field837][var2 + 2][var5] - (class73.field1004[class61.field837][var2 - -3][var5] - class73.field1004[class61.field837][var2 + 2][var5])) * 3;
                int var24 = class73.field1004[class61.field837][var2][var5];
                int var25 = -var21 + var22;
                int var26 = -(var22 * 2) + var21 + var23;
                int var27 = class73.field1004[class61.field837][var2 + 2][var5] + var22 + -var23 + -var24;
                var3[var5] = (((float) var27 * var4 + (float) var26) * var4 + (float) var25) * var4 + (float) var24;
            }
            class193.field3108 = (int) var3[1] * -1;
            class119.field2014 = (int) var3[2] + -(class93.field1321 * 128);
            float[] var6 = new float[3];
            class44.field522 = (int) var3[0] + -(class296.field4685 * 128);
            int var7 = class175.field2821 * 2;
            for (int var8 = 0; var8 < 3; ++var8) {
                int var14 = class73.field1004[class248.field3984][var7][var8] * 3;
                int var15 = class73.field1004[class248.field3984][var7 + 1][var8] * 3;
                int var16 = (-class73.field1004[class248.field3984][var7 + 3][var8] - -class73.field1004[class248.field3984][var7 + 2][var8] + class73.field1004[class248.field3984][var7 + 2][var8]) * 3;
                int var17 = -var14 + var15;
                int var18 = var14 + var16 + -(var15 * 2);
                int var19 = class73.field1004[class248.field3984][var7][var8];
                int var20 = -var19 - (-var15 - -var16) + class73.field1004[class248.field3984][var7 + 2][var8];
                var6[var8] = (((float) var20 * var4 + (float) var18) * var4 + (float) var17) * var4 + (float) var19;
            }
            float var9 = var6[0] - var3[0];
            float var10 = (var6[1] - var3[1]) * -1.0F;
            float var11 = var6[2] - var3[2];
            double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
            class274.field4424 = (float) Math.atan2((double) var10, var12);
            class283.field4513 = -((float) Math.atan2((double) var9, (double) var11));
            class8.field119 = (int) ((double) class274.field4424 * 325.949D) & 2047;
            class244.field3910 = 2047 & (int) ((double) class283.field4513 * 325.949D);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([IIIIII)V")
    public static final void method234(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class99 var6 = class273.field4415[arg3][arg4][arg5];
        if (var6 != null) {
            class38 var7 = var6.field1510;
            if (var7 == null) {
                class47 var10 = var6.field1498;
                if (var10 != null) {
                    int var11 = var10.field576;
                    int var12 = var10.field586;
                    int var13 = var10.field582;
                    int var14 = var10.field571;
                    int[] var15 = class233.field3704[var11];
                    int[] var16 = class16.field191[var12];
                    int var17 = 0;
                    if (var13 != 0) {
                        for (int var18 = 0; var18 < 4; ++var18) {
                            arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg1 += arg2;
                        }
                    } else {
                        for (int var19 = 0; var19 < 4; ++var19) {
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 2] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 3] = var14;
                            }
                            arg1 += arg2;
                        }
                    }
                }
            } else {
                int var8 = var7.field470;
                if (var8 != 0) {
                    for (int var9 = 0; var9 < 4; ++var9) {
                        arg0[arg1] = var8;
                        arg0[arg1 + 1] = var8;
                        arg0[arg1 + 2] = var8;
                        arg0[arg1 + 3] = var8;
                        arg1 += arg2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        ++field413;
        if (arg0 != 0) {
            field411 = null;
        }
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            int[] var4 = this.method1931((byte) -115, 0, arg1);
            for (int var5 = 0; class186.field2986 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field426 >= ~var6 && ~var6 >= ~this.field410 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([BIZI)Ljava/lang/String;")
    public static final String method235(byte[] arg0, int arg1, boolean arg2, int arg3) {
        ++field416;
        if (arg2) {
            method232(true);
        }
        int var4 = 0;
        char[] var5 = new char[arg3];
        for (int var6 = 0; arg3 > var6; ++var6) {
            int var7 = 255 & arg0[arg1 + var6];
            if (~var7 != -1) {
                if (~var7 <= -129 && var7 < 160) {
                    char var8 = class208.field3402[var7 + -128];
                    if (~var8 == -1) {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var5[var4++] = (char) var7;
            }
        }
        return new String(var5, 0, var4);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(BII)Z")
    public static final boolean method236(byte arg0, int arg1, int arg2) {
        int var3 = -63 % ((4 - arg0) / 63);
        ++field415;
        if (!class240.field3852) {
            return false;
        } else {
            int var4 = 65535 & arg2;
            int var5 = arg2 >> 16;
            if (class133.field2204[var5] != null && class133.field2204[var5][var4] != null) {
                class103 var6 = class133.field2204[var5][var4];
                if (arg1 == -1 && var6.field1655 == 0) {
                    for (int var7 = 0; var7 < class202.field3248; ++var7) {
                        if (class23.field291[var7] == 33 || class23.field291[var7] == 1007 || ~class23.field291[var7] == -48 || class23.field291[var7] == 16 || class23.field291[var7] == 18) {
                            for (class103 var8 = class168.method1180(8931, class23.field284[var7]); var8 != null; var8 = class113.method816((byte) -26, var8)) {
                                if (var6.field1659 == var8.field1659) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    for (int var9 = 0; class202.field3248 > var9; ++var9) {
                        if (~class270.field4368[var9] == ~arg1 && class23.field284[var9] == var6.field1659 && (class23.field291[var9] == 33 || ~class23.field291[var9] == -1008 || ~class23.field291[var9] == -48 || ~class23.field291[var9] == -17 || class23.field291[var9] == 18)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field410 = arg0.method1777(arg1 + -82);
            }
        } else {
            this.field426 = arg0.method1777(arg1 + -94);
        }
        if (arg1 != -19) {
            method233(-82);
        }
        ++field414;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class34() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([II)[I")
    public static final int[] method237(int[] arg0, int arg1) {
        ++field419;
        if (arg0 == null) {
            return null;
        } else if (arg1 != 17510) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            class56.method434(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "(I)V")
    public static final void method238(int arg0) {
        if (arg0 == -3) {
            ++field421;
            if (!class238.field3793 && ~class92.field1312 != -3) {
                try {
                    class27.method184((byte) 101, "tbrefresh", class85.field1168);
                } catch (Throwable var1) {
                }
            }
        }
    }
}
