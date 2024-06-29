import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class66 extends class551 {

    @OriginalMember(owner = "client!jj", name = "Jb", descriptor = "[B")
    public static byte[] field880 = new byte[2048];

    @OriginalMember(owner = "client!jj", name = "Bb", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!jj", name = "Db", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!jj", name = "Eb", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!jj", name = "Fb", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!jj", name = "Gb", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!jj", name = "Hb", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!jj", name = "Ib", descriptor = "I")
    private int field879;

    @OriginalMember(owner = "client!jj", name = "Lb", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!jj", name = "Mb", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!jj", name = "Nb", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!jj", name = "Ob", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!jj", name = "Pb", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!jj", name = "Qb", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!jj", name = "Cb", descriptor = "Lwe;")
    private class181 field873;

    @OriginalMember(owner = "client!jj", name = "Kb", descriptor = "[I")
    public static int[] field881;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "(I)V")
    public final void method373(int arg0) {
        this.field879 = super.field7707 * 8;
        ++field883;
        int var2 = 112 / ((arg0 - 33) / 48);
    }

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "(II)V")
    public final void method374(int arg0, int arg1) {
        if (arg1 != 6) {
            method382(-38, 20);
        }
        super.field7693[super.field7707++] = (byte) (this.field873.method1117(class426.method2502(arg1, -121)) + arg0);
        ++field876;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III[B)V")
    public final void method375(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field872;
        for (int var5 = arg1; ~var5 > ~arg2; ++var5) {
            arg3[arg0 + var5] = (byte) (super.field7693[super.field7707++] + -this.field873.method1117(93));
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I)V")
    public class66(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "(I)Z")
    public final boolean method376(int arg0) {
        if (arg0 != -4) {
            return false;
        } else {
            ++field877;
            int var2 = super.field7693[super.field7707] + -this.field873.method1115(-1) & 255;
            return ~var2 <= -129;
        }
    }

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "(II)I")
    public final int method377(int arg0, int arg1) {
        ++field878;
        int var3 = this.field879 >> 3;
        int var4 = -(this.field879 & 7) + arg0;
        this.field879 += arg1;
        int var5 = 0;
        while (~var4 > ~arg1) {
            var5 += (super.field7693[var3++] & class261.field3247[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 == ~var4) {
            var6 = (super.field7693[var3] & class261.field3247[var4]) + var5;
        } else {
            var6 = (super.field7693[var3] >> -arg1 + var4 & class261.field3247[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "(I)V")
    public final void method378(int arg0) {
        super.field7707 = (this.field879 + arg0) / 8;
        ++field887;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([IB)V")
    public final void method379(int[] arg0, byte arg1) {
        ++field882;
        if (arg1 <= 33) {
            this.field873 = null;
        }
        this.field873 = new class181(arg0);
    }

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "(I)I")
    public final int method380(int arg0) {
        ++field886;
        int var2 = super.field7693[super.field7707++] - this.field873.method1117(-126) & 255;
        if (~var2 > -129) {
            return var2;
        } else {
            if (arg0 < 81) {
                this.field879 = 28;
            }
            return (var2 + -128 << 8) + (255 & super.field7693[super.field7707++] + -this.field873.method1117(-125));
        }
    }

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "(II)I")
    public final int method381(int arg0, int arg1) {
        ++field884;
        int var3 = -50 % ((arg0 - 24) / 47);
        return arg1 * 8 + -this.field879;
    }

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "(II)I")
    public static final int method382(int arg0, int arg1) {
        ++field875;
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 != 6409) {
            if (arg1 == 32841) {
                return 1;
            } else if (arg1 != 6410) {
                if (arg1 == 6407) {
                    return 3;
                } else if (arg1 == 6408) {
                    return 4;
                } else {
                    if (arg0 != 1) {
                        field880 = null;
                    }
                    throw new IllegalArgumentException("");
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "(I)V")
    public static final void method383(int arg0) {
        ++field885;
        if (class190.field2453 == null) {
            class190.field2453 = new int[65536];
            double var1 = Math.random() * 0.03D - 0.015D + 0.7D;
            for (int var3 = 0; ~var3 > -65537; ++var3) {
                double var4 = (double) (63 & var3 >> 10) / 64.0D + 0.0078125D;
                double var6 = (double) (7 & var3 >> 7) / 8.0D + 0.0625D;
                double var8 = (double) (127 & var3) / 128.0D;
                double var10 = var8;
                double var12 = var8;
                double var14 = var8;
                if (var6 != 0.0D) {
                    double var16;
                    if (var8 < 0.5D) {
                        var16 = (var6 + 1.0D) * var8;
                    } else {
                        var16 = var6 + var8 - var6 * var8;
                    }
                    double var18 = var8 * 2.0D + -var16;
                    double var20 = var4 + 0.3333333333333333D;
                    if (var20 > 1.0D) {
                        --var20;
                    }
                    double var24 = var4 + -0.3333333333333333D;
                    if (var20 * 6.0D < 1.0D) {
                        var10 = (var16 - var18) * 6.0D * var20 + var18;
                    } else if (!(var20 * 2.0D < 1.0D)) {
                        if (var20 * 3.0D < 2.0D) {
                            var10 = (0.6666666666666666D - var20) * (-var18 + var16) * 6.0D + var18;
                        } else {
                            var10 = var18;
                        }
                    } else {
                        var10 = var16;
                    }
                    if (var24 < 0.0D) {
                        ++var24;
                    }
                    if (var4 * 6.0D < 1.0D) {
                        var12 = (var16 - var18) * 6.0D * var4 + var18;
                    } else if (var4 * 2.0D < 1.0D) {
                        var12 = var16;
                    } else if (var4 * 3.0D < 2.0D) {
                        var12 = (var16 - var18) * (-var4 + 0.6666666666666666D) * 6.0D + var18;
                    } else {
                        var12 = var18;
                    }
                    if (var24 * 6.0D < 1.0D) {
                        var14 = (-var18 + var16) * 6.0D * var24 + var18;
                    } else if (!(var24 * 2.0D < 1.0D)) {
                        if (var24 * 3.0D < 2.0D) {
                            var14 = (-var18 + var16) * (-var24 + 0.6666666666666666D) * 6.0D + var18;
                        } else {
                            var14 = var18;
                        }
                    } else {
                        var14 = var16;
                    }
                }
                double var26 = Math.pow(var10, var1);
                double var28 = Math.pow(var12, var1);
                double var30 = Math.pow(var14, var1);
                int var32 = (int) (var26 * 256.0D);
                int var33 = (int) (var28 * 256.0D);
                int var34 = (int) (var30 * 256.0D);
                int var35 = (var32 << 16) + (var33 << 8) + var34;
                class190.field2453[var3] = var35;
            }
            if (arg0 != 3) {
                field880 = null;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B[I)Ljava/lang/String;")
    public static final String method384(byte arg0, int[] arg1) {
        ++field874;
        if (arg0 != 97) {
            method385(true);
        }
        StringBuffer var2 = new StringBuffer();
        int var3 = class233.field2981;
        for (int var4 = 0; ~var4 > ~arg1.length; ++var4) {
            class221 var5 = class33.field508.method546(arg1[var4], (byte) 122);
            if (var5.field2833 != -1) {
                class116 var6 = (class116) class616.field8878.method323((long) var5.field2833, arg0 ^ -19717);
                if (var6 == null) {
                    class295 var7 = class295.method1806(class24.field433, var5.field2833, 0);
                    if (var7 != null) {
                        var6 = class301.field3918.method916(var7, true);
                        class616.field8878.method316((long) var5.field2833, (byte) -123, var6);
                    }
                }
                if (var6 != null) {
                    class106.field1370[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    ++var3;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(Z)V")
    public static void method385(boolean arg0) {
        if (!arg0) {
            field880 = null;
        }
        field881 = null;
        field880 = null;
    }
}
