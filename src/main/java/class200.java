import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class200 extends class518 {

    @OriginalMember(owner = "client!gq", name = "E", descriptor = "I")
    private int field2956 = 585;

    @OriginalMember(owner = "client!gq", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field2960 = new String[] { method1725(method1724("\u0012YL%~")), method1725(method1724("\u001b]\u000e\u000b")), method1725(method1724("\u0012YL$~")), method1725(method1724("\u000e\u0006LI+")), method1725(method1724("\u0012YL#~")), method1725(method1724("\u0012YL ~")) };

    @OriginalMember(owner = "client!gq", name = "H", descriptor = "Lmv;")
    public static class125 field2950 = new class125(40, 7);

    @OriginalMember(owner = "client!gq", name = "I", descriptor = "Lmv;")
    public static class125 field2952 = new class125(69, 7);

    @OriginalMember(owner = "client!gq", name = "C", descriptor = "I")
    public static int field2958 = 0;

    @OriginalMember(owner = "client!gq", name = "G", descriptor = "[F")
    public static float[] field2959 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!gq", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field2957 = new String[] { method1725(method1724("\u0010F")), method1725(method1724("\u0011M")), method1725(method1724("\u0013Z")), method1725(method1724("\u0005\\")), method1725(method1724("\u001bD")) };

    @OriginalMember(owner = "client!gq", name = "L", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!gq", name = "D", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!gq", name = "J", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!gq", name = "B", descriptor = "Lda;")
    public static class216 field2954;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)[I", line = 3)
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field2955;
            int[] var3 = super.field7564.method4462(26041, arg0);
            int var4 = -44 % ((-57 - arg1) / 55);
            if (super.field7564.field8652) {
                int var5 = class568.field8263[arg0];
                for (int var6 = 0; class110.field1436 > var6; ++var6) {
                    int var7 = class393.field5718[var6];
                    if (var7 > this.field2956 && var7 < 4096 - this.field2956 && var5 > -this.field2956 + 2048 && var5 < this.field2956 + 2048) {
                        int var8 = -var7 + 2048;
                        int var9 = ~var8 > -1 ? -var8 : var8;
                        int var10 = var9 << 12;
                        int var11 = var10 / (2048 - this.field2956);
                        var3[var6] = -var11 + 4096;
                    } else if (~var7 < ~(-this.field2956 + 2048) && 2048 - -this.field2956 > var7) {
                        int var12 = var5 + -2048;
                        int var13 = var12 >= 0 ? var12 : -var12;
                        int var14 = var13 - this.field2956;
                        int var15 = var14 << 12;
                        var3[var6] = var15 / (2048 - this.field2956);
                    } else if (this.field2956 <= var5 && var5 <= -this.field2956 + 4096) {
                        if (var7 >= this.field2956 && var7 <= -this.field2956 + 4096) {
                            var3[var6] = 0;
                        } else {
                            int var20 = -var5 + 2048;
                            int var21 = ~var20 > -1 ? -var20 : var20;
                            int var22 = var21 << 12;
                            int var23 = var22 / (-this.field2956 + 2048);
                            var3[var6] = -var23 + 4096;
                        }
                    } else {
                        int var16 = var7 + -2048;
                        int var17 = var16 >= 0 ? var16 : -var16;
                        int var18 = var17 - this.field2956;
                        int var19 = var18 << 12;
                        var3[var6] = var19 / (-this.field2956 + 2048);
                    }
                }
            }
            return var3;
        } catch (RuntimeException var25) {
            throw class665.method4799(var25, field2960[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V", line = 86)
    public class200() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "(I)V", line = 92)
    public static void method1722(int arg0) {
        try {
            field2959 = null;
            field2952 = null;
            field2954 = null;
            field2950 = null;
            field2957 = null;
            if (arg0 != -31980) {
                field2959 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2960[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILjc;I)V", line = 109)
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            ++field2953;
            if (arg0 == 0) {
                this.field2956 = arg1.method5116((byte) -112);
            }
            if (arg2 != -3) {
                field2950 = null;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2960[2] + arg0 + ',' + (arg1 != null ? field2960[3] : field2960[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "(I)V", line = 136)
    public static final void method1723(int arg0) {
        try {
            ++field2951;
            if (class360.field5233 == null) {
                class360.field5233 = new int[65536];
                if (arg0 == 1307045008) {
                    double var1 = 0.7D + (0.03D * Math.random() - 0.015D);
                    for (int var3 = 0; var3 < 65536; ++var3) {
                        double var4 = (double) ((65462 & var3) >> 10) / 64.0D + 0.0078125D;
                        double var6 = (double) ((900 & var3) >> 7) / 8.0D + 0.0625D;
                        double var8 = (double) (127 & var3) / 128.0D;
                        double var10 = var8;
                        double var12 = var8;
                        double var14 = var8;
                        if (var6 != 0.0D) {
                            double var16;
                            if (!(var8 < 0.5D)) {
                                var16 = var6 + var8 - var6 * var8;
                            } else {
                                var16 = (var6 + 1.0D) * var8;
                            }
                            double var18 = var8 * 2.0D - var16;
                            double var20 = var4 + 0.3333333333333333D;
                            if (var20 > 1.0D) {
                                --var20;
                            }
                            double var24 = var4 + -0.3333333333333333D;
                            if (var24 < 0.0D) {
                                ++var24;
                            }
                            if (!(var20 * 6.0D < 1.0D)) {
                                if (var20 * 2.0D < 1.0D) {
                                    var10 = var16;
                                } else if (!(var20 * 3.0D < 2.0D)) {
                                    var10 = var18;
                                } else {
                                    var10 = (0.6666666666666666D - var20) * (-var18 + var16) * 6.0D + var18;
                                }
                            } else {
                                var10 = (var16 - var18) * 6.0D * var20 + var18;
                            }
                            if (var4 * 6.0D < 1.0D) {
                                var12 = (-var18 + var16) * 6.0D * var4 + var18;
                            } else if (var4 * 2.0D < 1.0D) {
                                var12 = var16;
                            } else if (!(var4 * 3.0D < 2.0D)) {
                                var12 = var18;
                            } else {
                                var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                            }
                            if (var24 * 6.0D < 1.0D) {
                                var14 = (-var18 + var16) * 6.0D * var24 + var18;
                            } else if (!(var24 * 2.0D < 1.0D)) {
                                if (!(var24 * 3.0D < 2.0D)) {
                                    var14 = var18;
                                } else {
                                    var14 = (var16 - var18) * (-var24 + 0.6666666666666666D) * 6.0D + var18;
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
                        int var35 = (var33 << 8) + (var32 << 16) + var34;
                        class360.field5233[var3] = var35;
                    }
                }
            }
        } catch (RuntimeException var37) {
            throw class665.method4799(var37, field2960[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1724(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 86);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1725(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 117;
                    break;
                case 1:
                    var10005 = 40;
                    break;
                case 2:
                    var10005 = 98;
                    break;
                case 3:
                    var10005 = 103;
                    break;
                default:
                    var10005 = 86;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
