import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class161 extends class731 {

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field2551 = new String[] { method1517(method1516("GCF.7")), method1517(method1516("GCF+7")), method1517(method1516("GCF*7")), method1517(method1516("GCF-7")), method1517(method1516("GCF,7")) };

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    public static int field2545 = -1;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "Let;")
    public static class621 field2548;

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(IIIIIF)V")
    public class161(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
    public static final void method1513(byte arg0) {
        try {
            ++field2547;
            for (int var1 = 0; var1 < 5; ++var1) {
                class576.field8309[var1] = false;
            }
            class497.field7466 = -1;
            class233.field3611 = -1;
            class401.field6334 = 1;
            class445.field6925 = 0;
            class740.field10885 = 0;
            class210.field3323 = -1;
            class344.field5593 = -1;
            if (arg0 != 50) {
                field2545 = -123;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2551[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(B)V")
    public static void method1514(byte arg0) {
        try {
            field2548 = null;
            int var1 = -115 % ((arg0 - 10) / 43);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2551[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
    public final void method1254(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field2549;
            super.field10706 = arg2;
            super.field10712 = arg3;
            super.field10709 = arg0;
            if (arg1 != 64) {
                method1515((byte) -125);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2551[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V")
    public static final void method1515(byte arg0) {
        try {
            ++field2546;
            if (class613.field8810 == null) {
                class613.field8810 = new int[65536];
                if (arg0 != 114) {
                    method1513((byte) 110);
                }
                double var1 = 0.7D + (0.03D * Math.random() - 0.015D);
                for (int var3 = 0; ~var3 > -65537; ++var3) {
                    double var4 = (double) ((64628 & var3) >> 10) / 64.0D + 0.0078125D;
                    double var6 = (double) (var3 >> 7 & 7) / 8.0D + 0.0625D;
                    double var8 = (double) (var3 & 127) / 128.0D;
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
                        double var18 = var8 * 2.0D - var16;
                        double var20 = var4 + 0.3333333333333333D;
                        if (var20 > 1.0D) {
                            --var20;
                        }
                        double var24 = var4 + -0.3333333333333333D;
                        if (var20 * 6.0D < 1.0D) {
                            var10 = (-var18 + var16) * 6.0D * var20 + var18;
                        } else if (var20 * 2.0D < 1.0D) {
                            var10 = var16;
                        } else if (var20 * 3.0D < 2.0D) {
                            var10 = (var16 - var18) * (-var20 + 0.6666666666666666D) * 6.0D + var18;
                        } else {
                            var10 = var18;
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
                        if (var24 < 0.0D) {
                            ++var24;
                        }
                        if (!(var24 * 6.0D < 1.0D)) {
                            if (!(var24 * 2.0D < 1.0D)) {
                                if (var24 * 3.0D < 2.0D) {
                                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                                } else {
                                    var14 = var18;
                                }
                            } else {
                                var14 = var16;
                            }
                        } else {
                            var14 = (-var18 + var16) * 6.0D * var24 + var18;
                        }
                    }
                    double var26 = Math.pow(var10, var1);
                    double var28 = Math.pow(var12, var1);
                    double var30 = Math.pow(var14, var1);
                    int var32 = (int) (var26 * 256.0D);
                    int var33 = (int) (var28 * 256.0D);
                    int var34 = (int) (var30 * 256.0D);
                    int var35 = (var32 << 16) - (-(var33 << 8) - var34);
                    class613.field8810[var3] = var35;
                }
            }
        } catch (RuntimeException var37) {
            throw class590.method4333(var37, field2551[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BF)V")
    public final void method1257(byte arg0, float arg1) {
        try {
            ++field2550;
            if (arg0 != 86) {
                field2545 = -121;
            }
            super.field10714 = arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2551[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1516(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 31);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1517(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 46;
                    break;
                case 1:
                    var10005 = 33;
                    break;
                case 2:
                    var10005 = 104;
                    break;
                case 3:
                    var10005 = 103;
                    break;
                default:
                    var10005 = 31;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
