import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class526 extends class129 {

    @OriginalMember(owner = "client!eaa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7666 = new String[] { method3983(method3982("1\u0011;FB|")), method3983(method3982("/^tFv")), method3983(method3982("1\u0011;FD|")), method3983(method3982("t]d")), method3983(method3982("h\u00135\u000462\u0016<\u000em2NzG+")), method3983(method3982(":\u00056\u0004")), method3983(method3982("1\u0011;FO|")), method3983(method3982("1\u0011;FL|")), method3983(method3982("1\u0011;FJ|")), method3983(method3982("1\u0011;FA|")), method3983(method3982("1\u0011;FC|")), method3983(method3982("1\u0011;FM|")), method3983(method3982("1\u0011;FH|")) };

    @OriginalMember(owner = "client!eaa", name = "o", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!eaa", name = "n", descriptor = "I")
    public static int field7659;

    @OriginalMember(owner = "client!eaa", name = "t", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!eaa", name = "r", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!eaa", name = "s", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!eaa", name = "q", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!eaa", name = "u", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!eaa", name = "p", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ILha;)V", line = 4)
    public static final void method3979(int arg0, class66 arg1) {
        try {
            ++field7660;
            if ((class593.field8707 >= 2 || class728.field10555) && class69.field740 == null) {
                int var2 = 6 / ((-64 - arg0) / 32);
                String var3;
                if (class728.field10555 && class593.field8707 < 2) {
                    var3 = class10.field116 + class309.field4879.method2616(false, class167.field2300) + class740.field10757 + field7666[3];
                } else if (class308.field4836 && class597.field8749.method89(false, 81) && ~class593.field8707 < -3) {
                    var3 = class270.method2237(-97, class513.field7366);
                } else {
                    class417 var4 = class513.field7366;
                    if (var4 == null) {
                        return;
                    }
                    var3 = class270.method2237(-122, var4);
                    int[] var5 = null;
                    if (class83.method713(var4.field6146, -50)) {
                        var5 = class540.field7920.method5000((int) var4.field6137, (byte) 77).field7734;
                    } else if (~var4.field6145 == 0) {
                        if (!class473.method3592((byte) 125, var4.field6146)) {
                            if (class31.method207(var4.field6146, false)) {
                                Object var6 = null;
                                class198 var7;
                                if (var4.field6146 != 1003) {
                                    var7 = class417.field6144.method3030(0, (int) (var4.field6137 >>> 32 & 2147483647L));
                                } else {
                                    var7 = class417.field6144.method3030(0, (int) var4.field6137);
                                }
                                if (var7.field3017 != null) {
                                    var7 = var7.method1764(class276.field4168, -174);
                                }
                                if (var7 != null) {
                                    var5 = var7.field3065;
                                }
                            }
                        } else {
                            class383 var8 = (class383) class207.field3184.method977((long) ((int) var4.field6137), 1);
                            if (var8 != null) {
                                class612 var9 = var8.field5799;
                                class496 var10 = var9.field8947;
                                if (var10.field7110 != null) {
                                    var10 = var10.method3742(-1, class276.field4168);
                                }
                                if (var10 != null) {
                                    var5 = var10.field7130;
                                }
                            }
                        }
                    } else {
                        var5 = class540.field7920.method5000(var4.field6145, (byte) 65).field7734;
                    }
                    if (var5 != null) {
                        var3 = var3 + class584.method4361(13271, var5);
                    }
                }
                if (class593.field8707 > 2) {
                    var3 = var3 + field7666[4] + (class593.field8707 + -2) + class309.field4872.method2616(false, class167.field2300);
                }
                if (class402.field5990 != null) {
                    class67 var11 = class402.field5990.method4078((byte) -30, arg1);
                    if (var11 == null) {
                        var11 = class269.field4100;
                    }
                    var11.method612(class749.field10906, class402.field5990.field8062, class523.field7646, 4, var3, class402.field5990.field8091, class714.field10339, class402.field5990.field7939, class698.field10162, class402.field5990.field8025, class402.field5990.field8029, class106.field1221, class717.field10397, class402.field5990.field8045, class749.field10899);
                    class728.method5312(class749.field10899[0], class749.field10899[3], class749.field10899[1], (byte) 97, class749.field10899[2]);
                } else if (class382.field5790 != null && class447.field6576 == class243.field3725) {
                    int var12 = class269.field4100.method603(class717.field10397, var3, false, class749.field10906, class760.field11010 + 16, 16777215, class523.field7646, class530.field7757 + 4, class106.field1221, 0);
                    class728.method5312(class530.field7757 - -4, 16, class760.field11010, (byte) 25, var12 + class475.field6895.method4322(256, var3));
                }
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field7666[2] + arg0 + ',' + (arg1 != null ? field7666[1] : field7666[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lkd;)V", line = 114)
    public class526(class296 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIB)V", line = 117)
    public final void method786(int arg0, int arg1, byte arg2) {
        try {
            ++field7663;
            int var4 = -89 % ((arg2 - 21) / 56);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field7666[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IILrca;)V", line = 126)
    public final void method788(int arg0, int arg1, class479 arg2) {
        try {
            if (arg1 >= -3) {
                this.method784(true, (byte) 3);
            }
            ++field7659;
            super.field1509.method2467(12, arg2);
            super.field1509.method2433(-16075, arg0);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7666[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7666[1] : field7666[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "(B)V", line = 138)
    public static final void method3980(byte arg0) {
        try {
            ++field7664;
            if (class151.field1862 == null) {
                class151.field1862 = new int[65536];
                if (arg0 < -42) {
                    double var1 = -0.015D + 0.03D * Math.random() + 0.7D;
                    int var3 = 0;
                    for (int var4 = 0; var4 < 512; ++var4) {
                        float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                        float var6 = (float) (7 & var4) / 8.0F + 0.0625F;
                        for (int var7 = 0; ~var7 > -129; ++var7) {
                            float var8 = (float) var7 / 128.0F;
                            float var9 = 0.0F;
                            float var10 = 0.0F;
                            float var11 = 0.0F;
                            float var12 = var5 / 60.0F;
                            int var13 = (int) var12;
                            int var14 = var13 % 6;
                            float var15 = (float) (-var13) + var12;
                            float var16 = (1.0F - var6) * var8;
                            float var17 = (1.0F - var6 * var15) * var8;
                            float var18 = (-((1.0F - var15) * var6) + 1.0F) * var8;
                            if (var14 == 0) {
                                var10 = var18;
                                var11 = var16;
                                var9 = var8;
                            } else if (var14 == 1) {
                                var10 = var8;
                                var11 = var16;
                                var9 = var17;
                            } else if (~var14 == -3) {
                                var10 = var8;
                                var11 = var18;
                                var9 = var16;
                            } else if (var14 == 3) {
                                var10 = var17;
                                var11 = var8;
                                var9 = var16;
                            } else if (~var14 == -5) {
                                var11 = var8;
                                var10 = var16;
                                var9 = var18;
                            } else if (~var14 == -6) {
                                var10 = var16;
                                var11 = var17;
                                var9 = var8;
                            }
                            float var19 = (float) Math.pow((double) var9, var1);
                            float var20 = (float) Math.pow((double) var10, var1);
                            float var21 = (float) Math.pow((double) var11, var1);
                            int var22 = (int) (var19 * 256.0F);
                            int var23 = (int) (var20 * 256.0F);
                            int var24 = (int) (var21 * 256.0F);
                            int var25 = (var23 << 8) + (var22 << 16) + -16777216 + var24;
                            class151.field1862[var3++] = var25;
                        }
                    }
                }
            }
        } catch (RuntimeException var27) {
            throw class759.method5498(var27, field7666[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(JJ)J", line = 259)
    public static long method3981(long arg0, long arg1) {
        try {
            return arg0 | arg1;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7666[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V", line = 268)
    public final void method783(int arg0) {
        try {
            super.field1509.method2450(arg0, false);
            ++field7661;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7666[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZI)V", line = 278)
    public final void method781(boolean arg0, int arg1) {
        try {
            super.field1509.method2450(arg1, true);
            ++field7662;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7666[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZB)V", line = 288)
    public final void method784(boolean arg0, byte arg1) {
        try {
            ++field7665;
            if (arg1 == -34) {
                ;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7666[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Z)Z", line = 298)
    public final boolean method790(boolean arg0) {
        try {
            ++field7658;
            return !arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7666[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3982(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 11);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3983(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 84;
                    break;
                case 1:
                    var10005 = 112;
                    break;
                case 2:
                    var10005 = 90;
                    break;
                case 3:
                    var10005 = 104;
                    break;
                default:
                    var10005 = 11;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
