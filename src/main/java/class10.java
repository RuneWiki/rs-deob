import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class10 extends class185 {

    @OriginalMember(owner = "client!ai", name = "Ab", descriptor = "Lqe;")
    public static class179 field272 = class206.method1380("60 Sekunden noch einmal)3)3)3", (byte) 30);

    @OriginalMember(owner = "client!ai", name = "yb", descriptor = "Lqe;")
    private static class179 field270 = class206.method1380("Error loading your profile)3", (byte) 81);

    @OriginalMember(owner = "client!ai", name = "Hb", descriptor = "[I")
    public static int[] field279 = new int[2048];

    @OriginalMember(owner = "client!ai", name = "xb", descriptor = "Lqe;")
    public static class179 field269 = class206.method1380("loc)3dat", (byte) 4);

    @OriginalMember(owner = "client!ai", name = "Kb", descriptor = "Lqe;")
    public static class179 field282 = class206.method1380("::", (byte) -126);

    @OriginalMember(owner = "client!ai", name = "Lb", descriptor = "Lqe;")
    public static class179 field283 = field270;

    @OriginalMember(owner = "client!ai", name = "Mb", descriptor = "[Lka;")
    public static class109[] field284 = new class109[500];

    @OriginalMember(owner = "client!ai", name = "Qb", descriptor = "[I")
    public static int[] field288 = new int[200];

    @OriginalMember(owner = "client!ai", name = "Tb", descriptor = "[I")
    public static int[] field291 = new int[100];

    @OriginalMember(owner = "client!ai", name = "zb", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!ai", name = "Bb", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!ai", name = "Cb", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!ai", name = "Db", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!ai", name = "Eb", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!ai", name = "Fb", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!ai", name = "Gb", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!ai", name = "Ib", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!ai", name = "Jb", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!ai", name = "Nb", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client!ai", name = "Rb", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!ai", name = "Sb", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!ai", name = "Pb", descriptor = "Lmg;")
    private class137 field287;

    @OriginalMember(owner = "client!ai", name = "Ob", descriptor = "[[[B")
    public static byte[][][] field286;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III[[[II)V")
    public static final void method60(int arg0, int arg1, int arg2, int[][][] arg3, int arg4) {
        class155.field2793 = arg0;
        class39.field834 = arg1;
        class33.field719 = arg2;
        class229.field4232 = new class197[arg0][arg1][arg2];
        class177.field3224 = new int[arg0][arg1 + 1][arg2 + 1];
        class30.field665 = arg3;
        class176.method1116();
        class93.field1752 = arg4;
        class67.field1356 = new boolean[class93.field1752 + class93.field1752 + 1][class93.field1752 + class93.field1752 + 1];
        class216.field4004 = new boolean[class93.field1752 + class93.field1752 + 2][class93.field1752 + class93.field1752 + 2];
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([IZ)V")
    public final void method61(int[] arg0, boolean arg1) {
        if (!arg1) {
            field272 = null;
        }
        this.field287 = new class137(arg0);
        ++field275;
    }

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "(I)V")
    public static void method62(int arg0) {
        field284 = null;
        field282 = null;
        if (arg0 == -7373) {
            field270 = null;
            field283 = null;
            field269 = null;
            field288 = null;
            field286 = null;
            field272 = null;
            field291 = null;
            field279 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "(II)I")
    public final int method63(int arg0, int arg1) {
        if (arg1 != 8) {
            return 48;
        } else {
            ++field271;
            return arg0 * 8 + -this.field285;
        }
    }

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "(I)I")
    public final int method64(int arg0) {
        ++field281;
        if (arg0 < 92) {
            field270 = null;
        }
        return 255 & super.field3397[super.field3432++] + -this.field287.method871((byte) 73);
    }

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "(B)V")
    public final void method65(byte arg0) {
        if (arg0 != 0) {
            this.method66(37, (byte[]) null, 58, -3);
        }
        super.field3432 = (this.field285 + 7) / 8;
        ++field289;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I[BII)V")
    public final void method66(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 < 30) {
            field284 = null;
        }
        for (int var5 = 0; ~arg2 < ~var5; ++var5) {
            arg1[var5 - -arg3] = (byte) (super.field3397[super.field3432++] + -this.field287.method871((byte) 73));
        }
        ++field274;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(I)V")
    public class10(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I[S[Lqe;)V")
    public static final void method67(int arg0, short[] arg1, class179[] arg2) {
        ++field290;
        class7.method46(arg1, -35, arg2.length + -1, arg2, arg0);
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(Z)V")
    public static final void method68(boolean arg0) {
        ++field277;
        if (class150.field2698 < class55.field1218) {
            class150.field2698 += class150.field2698 / 30.0D;
            if (class55.field1218 < class150.field2698) {
                class150.field2698 = class55.field1218;
            }
            class161.method1037(22704);
        } else if (class55.field1218 < class150.field2698) {
            class150.field2698 -= class150.field2698 / 30.0D;
            if (class150.field2698 < class55.field1218) {
                class150.field2698 = class55.field1218;
            }
            class161.method1037(22704);
        }
        if (~class131.field2386 != 0 && class139.field2570 != -1) {
            int var1 = -class164.field2972 + class131.field2386;
            if (var1 < 2 || ~var1 < -3) {
                var1 >>= 4;
            }
            class164.field2972 += var1;
            int var2 = -class71.field1421 + class139.field2570;
            if (~var2 > -3 || var2 > 2) {
                var2 >>= 4;
            }
            class71.field1421 += var2;
            if (var1 == 0 && ~var2 == -1) {
                class131.field2386 = -1;
                class139.field2570 = -1;
            }
            class161.method1037(22704);
        }
        if (!arg0) {
            field284 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "(II)V")
    public static final void method69(int arg0, int arg1) {
        class226.field4191 += arg1 * 128;
        ++field278;
        if (~class226.field4191 < ~class50.field1071.length) {
            class226.field4191 -= class50.field1071.length;
            int var2 = (int) (Math.random() * 12.0D);
            class216.method1414(class163.field2945[var2], (byte) -101);
        }
        short var3 = 256;
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (-arg1 + var3) * 128;
        if (arg0 <= -1) {
            for (int var7 = 0; ~var6 < ~var7; ++var7) {
                int var27 = class190.field3530[var4 - -var5] + -(class50.field1071[class226.field4191 + var4 & class50.field1071.length - 1] * arg1 / 6);
                if (var27 < 0) {
                    var27 = 0;
                }
                class190.field3530[var4++] = var27;
            }
            for (int var8 = -arg1 + var3; ~var3 < ~var8; ++var8) {
                int var24 = var8 * 128;
                for (int var25 = 0; ~var25 > -129; ++var25) {
                    int var26 = (int) (Math.random() * 100.0D);
                    if (~var26 > -51 && ~var25 < -11 && var25 < 118) {
                        class190.field3530[var24 + var25] = 255;
                    } else {
                        class190.field3530[var24 + var25] = 0;
                    }
                }
            }
            if (class11.field304 > 0) {
                class11.field304 -= arg1 * 4;
            }
            if (~class55.field1225 < -1) {
                class55.field1225 -= arg1 * 4;
            }
            if (class11.field304 == 0 && ~class55.field1225 == -1) {
                int var9 = (int) (Math.random() * (double) (2000 / arg1));
                if (var9 == 1) {
                    class55.field1225 = 1024;
                }
                if (~var9 == -1) {
                    class11.field304 = 1024;
                }
            }
            for (int var10 = 0; ~var10 > ~(-arg1 + var3); ++var10) {
                class97.field1823[var10] = class97.field1823[var10 - -arg1];
            }
            for (int var11 = -arg1 + var3; var3 > var11; ++var11) {
                class97.field1823[var11] = (int) (16.0D * Math.sin((double) class113.field2123 / 14.0D) + 14.0D * Math.sin((double) class113.field2123 / 15.0D) + Math.sin((double) class113.field2123 / 16.0D) * 12.0D);
                ++class113.field2123;
            }
            class18.field481 += arg1;
            int var12 = ((class13.field322 & 1) + arg1) / 2;
            if (~var12 < -1) {
                for (int var13 = 0; ~var13 > ~(class18.field481 * 100); ++var13) {
                    int var22 = 2 + (int) (Math.random() * 124.0D);
                    int var23 = 128 + (int) (Math.random() * 128.0D);
                    class190.field3530[(var23 << 7) + var22] = 192;
                }
                class18.field481 = 0;
                for (int var14 = 0; ~var3 < ~var14; ++var14) {
                    int var19 = var14 * 128;
                    int var20 = 0;
                    for (int var21 = -var12; var21 < 128; ++var21) {
                        if (var12 + var21 < 128) {
                            var20 += class190.field3530[var12 + var19 + var21];
                        }
                        if (~(-var12 + -1 + var21) <= -1) {
                            var20 -= class190.field3530[var19 - var12 + var21 + -1];
                        }
                        if (var21 >= 0) {
                            class223.field4121[var21 - -var19] = var20 / (var12 * 2 + 1);
                        }
                    }
                }
                for (int var15 = 0; ~var15 > -129; ++var15) {
                    int var16 = 0;
                    for (int var17 = -var12; ~var3 < ~var17; ++var17) {
                        int var18 = var17 * 128;
                        if (~var3 < ~(var12 + var17)) {
                            var16 += class223.field4121[var18 - -(var12 * 128) + var15];
                        }
                        if (-1 - var12 + var17 >= 0) {
                            var16 -= class223.field4121[var15 + var18 + -((var12 - -1) * 128)];
                        }
                        if (var17 >= 0) {
                            class190.field3530[var15 + var18] = var16 / (var12 * 2 + 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "(BI)V")
    public final void method70(byte arg0, int arg1) {
        if (arg0 != -62) {
            method68(true);
        }
        super.field3397[super.field3432++] = (byte) (this.field287.method871((byte) 73) + arg1);
        ++field280;
    }

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "(II)I")
    public final int method71(int arg0, int arg1) {
        ++field273;
        int var3 = 0;
        int var4 = -(this.field285 & 7) + 8;
        int var5 = this.field285 >> 3;
        if (arg1 != 128) {
            field291 = null;
        }
        this.field285 += arg0;
        while (~var4 > ~arg0) {
            var3 += (class3.field44[var4] & super.field3397[var5++]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 != var4) {
            var6 = (super.field3397[var5] >> -arg0 + var4 & class3.field44[arg0]) + var3;
        } else {
            var6 = (super.field3397[var5] & class3.field44[var4]) + var3;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "(II)I")
    public static final int method72(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        this.field285 = super.field3432 * 8;
        ++field276;
        if (arg0) {
            this.method66(36, (byte[]) null, 68, 115);
        }
    }
}
