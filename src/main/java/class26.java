import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class26 extends class139 {

    @OriginalMember(owner = "client!ce", name = "eb", descriptor = "I")
    private int field472 = 0;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "I")
    public static int field468 = 0;

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "Lrf;")
    private static class163 field464 = class53.method392(-64, "Connecting to update server");

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "Lrf;")
    private static class163 field465 = class53.method392(-105, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!ce", name = "gb", descriptor = "[I")
    public static int[] field474 = new int[99];

    @OriginalMember(owner = "client!ce", name = "ib", descriptor = "Lrf;")
    public static class163 field476 = field465;

    @OriginalMember(owner = "client!ce", name = "hb", descriptor = "Lrf;")
    public static class163 field475 = class53.method392(81, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "Lrf;")
    private static class163 field469 = class53.method392(-40, "skill)2");

    @OriginalMember(owner = "client!ce", name = "fb", descriptor = "Lrf;")
    public static class163 field473 = field469;

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "Lrf;")
    public static class163 field463 = field464;

    @OriginalMember(owner = "client!ce", name = "mb", descriptor = "Lrf;")
    private static class163 field480 = class53.method392(-82, "Loading sprites )2 ");

    @OriginalMember(owner = "client!ce", name = "jb", descriptor = "Lrf;")
    public static class163 field477 = field480;

    @OriginalMember(owner = "client!ce", name = "lb", descriptor = "I")
    public static int field479 = 0;

    @OriginalMember(owner = "client!ce", name = "vb", descriptor = "Lrf;")
    private static class163 field489;

    @OriginalMember(owner = "client!ce", name = "tb", descriptor = "Lrf;")
    public static class163 field487;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!ce", name = "kb", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!ce", name = "nb", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!ce", name = "ob", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!ce", name = "rb", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!ce", name = "qb", descriptor = "Lph;")
    public static class147 field484;

    @OriginalMember(owner = "client!ce", name = "sb", descriptor = "Z")
    public static boolean field486;

    @OriginalMember(owner = "client!ce", name = "cb", descriptor = "[I")
    private int[] field470;

    @OriginalMember(owner = "client!ce", name = "pb", descriptor = "[I")
    private int[] field483;

    @OriginalMember(owner = "client!ce", name = "db", descriptor = "[[I")
    private int[][] field471;

    @OriginalMember(owner = "client!ce", name = "ub", descriptor = "[[[B")
    public static byte[][][] field488;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)[I")
    private final int[] method156(int arg0, boolean arg1) {
        ++field467;
        if (arg0 < 0) {
            return this.field483;
        } else if (arg0 >= this.field471.length) {
            return this.field470;
        } else {
            if (arg1) {
                field476 = null;
            }
            return this.field471[arg0];
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        if (~arg0 == -1) {
            this.field472 = arg2.method344(255);
            this.field471 = new int[arg2.method344(255)][2];
            for (int var4 = 0; ~this.field471.length < ~var4; ++var4) {
                this.field471[var4][0] = arg2.method390((byte) 126);
                this.field471[var4][1] = arg2.method390((byte) 118);
            }
        }
        ++field466;
        if (arg1 != 21) {
            field487 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
    public class26() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "(B)V")
    public static void method157(byte arg0) {
        field476 = null;
        field477 = null;
        int var1 = -43 / ((arg0 - 28) / 52);
        field480 = null;
        field464 = null;
        field465 = null;
        field475 = null;
        field473 = null;
        field463 = null;
        field487 = null;
        field469 = null;
        field489 = null;
        field488 = null;
        field484 = null;
        field474 = null;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V")
    public final void method127(int arg0) {
        ++field481;
        if (this.field471 == null) {
            this.field471 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field471.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (arg0 != 0) {
                field476 = null;
            }
            if (this.field472 == 2) {
                this.method158((byte) 113);
            }
            class137.method901(false);
        }
    }

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "(B)V")
    private final void method158(byte arg0) {
        int[] var2 = this.field471[0];
        int[] var3 = this.field471[this.field471.length + -2];
        int[] var4 = this.field471[1];
        ++field461;
        int[] var5 = this.field471[this.field471.length + -1];
        this.field470 = new int[] { var3[0] - -var3[0] + -var5[0], var3[1] + -var5[1] + var3[1] };
        if (arg0 < 88) {
            field469 = null;
        }
        this.field483 = new int[] { var2[0] - var4[0] + var2[0], -var4[1] - (-var2[1] - var2[1]) };
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field462;
        int[] var3 = super.field2859.method1319(-98, arg0);
        if (super.field2859.field3966) {
            int[] var4 = this.method917(arg0, 0, true);
            int var5 = this.field472;
            if (var5 != 2) {
                if (var5 == 1) {
                    for (int var6 = 0; class23.field402 > var6; ++var6) {
                        int var7 = var4[var6];
                        int var8;
                        for (var8 = 1; this.field471.length + -1 > var8 && var7 >= this.field471[var8][0]; ++var8) {
                        }
                        int[] var9 = this.field471[var8];
                        int[] var10 = this.field471[var8 + -1];
                        int var11 = (-var10[0] + var7 << 12) / (var9[0] + -var10[0]);
                        int var12 = 4096 - class210.field4094[(8185 & var11) >> 5] >> 1;
                        int var13 = -var12 + 4096;
                        var3[var6] = var9[1] * var12 + var10[1] * var13 >> 12;
                    }
                } else {
                    for (int var14 = 0; class23.field402 > var14; ++var14) {
                        int var15 = var4[var14];
                        int var16;
                        for (var16 = 1; this.field471.length + -1 > var16 && ~this.field471[var16][0] >= ~var15; ++var16) {
                        }
                        int[] var17 = this.field471[var16 - 1];
                        int[] var18 = this.field471[var16];
                        int var19 = (-var17[0] + var15 << 12) / (var18[0] + -var17[0]);
                        int var20 = -var19 + 4096;
                        var3[var14] = var17[1] * var20 + var18[1] * var19 >> 12;
                    }
                }
            } else {
                for (int var21 = 0; var21 < class23.field402; ++var21) {
                    int var22 = var4[var21];
                    int var23;
                    for (var23 = 1; var23 < this.field471.length - 1 && ~this.field471[var23][0] >= ~var22; ++var23) {
                    }
                    int[] var24 = this.field471[var23];
                    int[] var25 = this.field471[var23 + -1];
                    int var26 = this.method156(var23 - 2, false)[1];
                    int var27 = var25[1];
                    int var28 = var24[1];
                    int var29 = this.method156(var23 + 1, false)[1];
                    int var31 = (-var25[0] + var22 << 12) / (var24[0] + -var25[0]);
                    int var32 = var31 * var31 >> 12;
                    int var33 = -var26 + var28;
                    int var34 = var29 - -var27 + -var28 + -var26;
                    int var35 = var31 * var33 >> 12;
                    int var36 = -var34 + var26 + -var27;
                    int var37 = (var31 * var34 >> 12) * var32 >> 12;
                    int var38 = var32 * var36 >> 12;
                    var3[var21] = var38 - -var35 + var27 + var37;
                }
            }
        }
        if (arg1 != 7451) {
            this.method156(-80, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "(B)V")
    public static final void method159(byte arg0) {
        short var1 = 256;
        if (class194.field3826 <= 0) {
            if (class149.field3066 <= 0) {
                for (int var2 = 0; var2 < 256; ++var2) {
                    class48.field935[var2] = class206.field4025[var2];
                }
            } else {
                for (int var3 = 0; ~var3 > -257; ++var3) {
                    if (class149.field3066 > 768) {
                        class48.field935[var3] = class34.method219(class206.field4025[var3], (byte) 113, class108.field2236[var3], -class149.field3066 + 1024);
                    } else if (~class149.field3066 >= -257) {
                        class48.field935[var3] = class34.method219(class108.field2236[var3], (byte) 107, class206.field4025[var3], -class149.field3066 + 256);
                    } else {
                        class48.field935[var3] = class108.field2236[var3];
                    }
                }
            }
        } else {
            for (int var4 = 0; ~var4 > -257; ++var4) {
                if (class194.field3826 > 768) {
                    class48.field935[var4] = class34.method219(class206.field4025[var4], (byte) 117, class148.field3056[var4], -class194.field3826 + 1024);
                } else if (~class194.field3826 < -257) {
                    class48.field935[var4] = class148.field3056[var4];
                } else {
                    class48.field935[var4] = class34.method219(class148.field3056[var4], (byte) 104, class206.field4025[var4], -class194.field3826 + 256);
                }
            }
        }
        int var5 = class58.field1177.field3364 * 9;
        ++field485;
        int var6 = 0;
        if (arg0 == 10) {
            int var7 = 0;
            for (int var8 = 1; var8 < var1 + -1; ++var8) {
                int var21 = (-var8 + var1) * class36.field729[var8] / var1 + 22;
                if (~var21 > -1) {
                    var21 = 0;
                }
                var6 += var21;
                for (int var22 = var21; ~var22 > -129; ++var22) {
                    int var24 = class58.field1177.field3370[var5++];
                    int var25 = class43.field870[var6++];
                    if (~var25 == -1) {
                        class6.field121.field3370[var7++] = var24;
                    } else {
                        int var27 = -var25 + 256;
                        int var28 = class48.field935[var25];
                        class6.field121.field3370[var7++] = class133.method887(class133.method887(16711935, var28) * var25 - -(var27 * class133.method887(16711935, var24)), -16711936) + class133.method887(16711680, var25 * class133.method887(var28, 65280) - -(class133.method887(65280, var24) * var27)) >> 8;
                    }
                }
                for (int var23 = 0; var21 > var23; ++var23) {
                    class6.field121.field3370[var7++] = class58.field1177.field3370[var5++];
                }
                var5 += class58.field1177.field3364 + -128;
            }
            int var9 = 0;
            int var10 = 0;
            class6.field121.method1116(0, 9);
            int var11 = class58.field1177.field3364 * 9 + 128;
            for (int var12 = 1; var12 < var1 - 1; ++var12) {
                int var13 = (-var12 + var1) * class36.field729[var12] / var1 + 22;
                if (~var13 > -1) {
                    var13 = 0;
                }
                for (int var14 = 0; ~var13 < ~var14; ++var14) {
                    int var10001 = var9++;
                    --var11;
                    class38.field779.field3370[var10001] = class58.field1177.field3370[var11];
                }
                for (int var15 = var13; var15 < 128; ++var15) {
                    int var16 = class43.field870[var10++];
                    --var11;
                    int var17 = class58.field1177.field3370[var11];
                    if (~var16 == -1) {
                        class38.field779.field3370[var9++] = var17;
                    } else {
                        int var19 = -var16 + 256;
                        int var20 = class48.field935[var16];
                        class38.field779.field3370[var9++] = class133.method887(16711680, class133.method887(var20, 65280) * var16 + var19 * class133.method887(var17, 65280)) + class133.method887(-16711936, class133.method887(16711935, var17) * var19 + var16 * class133.method887(var20, 16711935)) >> 8;
                    }
                }
                var11 += class58.field1177.field3364 + 128;
                var10 += var13;
            }
            class38.field779.method1116(637, 9);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field474[var1] = var0 / 4;
        }
        field489 = class53.method392(104, "Location");
        field487 = field489;
    }
}
