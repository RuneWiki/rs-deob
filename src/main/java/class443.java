import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class443 extends class767 implements class181 {

    @OriginalMember(owner = "client!km", name = "v", descriptor = "I")
    private int field6536;

    @OriginalMember(owner = "client!km", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field6548 = new String[] { method3453(method3452("\u0005~eY}")), method3453(method3452("\u0005~eT}")), method3453(method3452("\u0015=e9(")), method3453(method3452("\u0000f'{")), method3453(method3452("\u0005~eU}")), method3453(method3452("\u0005~eS}")), method3453(method3452("\u0005~eP}")), method3453(method3452("\u0005~eR}")), method3453(method3452("\u0005~e+<\u0000z?)}")), method3453(method3452("\u0005~eZ}")), method3453(method3452("\u0005~eQ}")), method3453(method3452("\u0005~e_}")), method3453(method3452("\u0005~e[}")) };

    @OriginalMember(owner = "client!km", name = "t", descriptor = "Lmv;")
    public static class125 field6538 = new class125(47, 1);

    @OriginalMember(owner = "client!km", name = "s", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!km", name = "y", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!km", name = "A", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!km", name = "C", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!km", name = "z", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!km", name = "u", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "Ltca;")
    public static class611 field6547;

    @OriginalMember(owner = "client!km", name = "x", descriptor = "[Z")
    public static boolean[] field6542;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)Lu;")
    public static final class741 method3445(int arg0, int arg1) {
        try {
            ++field6539;
            class741[] var2 = class231.method1916(23651);
            for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
                class741 var4 = var2[var3];
                if (~var4.field10528 == ~arg0) {
                    return var4;
                }
            }
            return arg1 != -6145 ? null : null;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6548[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "()V")
    public static final void method3446() {
        class80.field1125 = class80.field1124;
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(I)V")
    public final void method3447(int arg0) {
        try {
            ++field6535;
            super.field10956.method1658(this, arg0 + 1);
            if (arg0 != 0) {
                method3448(14, 99, 14);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6548[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III[B)V")
    public final void method1507(int arg0, int arg1, int arg2, byte[] arg3) {
        try {
            this.method5540(arg0, true, arg3);
            if (arg1 != -32534) {
                method3449((byte) -15);
            }
            ++field6540;
            this.field6536 = arg2;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6548[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6548[2] : field6548[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lml;I[BIZ)V")
    public class443(class194 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        try {
            this.field6536 = arg1;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field6548[8] + (arg0 != null ? field6548[2] : field6548[3]) + ',' + arg1 + ',' + (arg2 != null ? field6548[2] : field6548[3]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III)I")
    public static final int method3448(int arg0, int arg1, int arg2) {
        try {
            ++field6534;
            double var3 = Math.log((double) arg2) / Math.log(2.0D);
            double var5 = Math.log((double) arg0) / Math.log(2.0D);
            double var7 = var5 + Math.random() * (-var5 + var3);
            if (arg1 != 29943) {
                field6542 = null;
            }
            return (int) (Math.pow(2.0D, var7) + 0.5D);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field6548[12] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(B)V")
    public static void method3449(byte arg0) {
        try {
            field6542 = null;
            field6538 = null;
            field6547 = null;
            if (arg0 < 32) {
                field6542 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6548[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IFIFFIII)[F")
    public static final float[] method3450(int arg0, float arg1, int arg2, float arg3, float arg4, int arg5, int arg6, int arg7) {
        try {
            ++field6546;
            float[] var8 = new float[9];
            float[] var9 = new float[9];
            float var10 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
            float var11 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
            var8[8] = var10;
            var8[6] = -var11;
            var8[2] = var11;
            var8[1] = (float) arg5;
            var8[5] = 0.0F;
            var8[3] = 0.0F;
            var8[0] = var10;
            var8[7] = 0.0F;
            float var12 = 1.0F - var10;
            var8[4] = 1.0F;
            float[] var13 = new float[9];
            float var14 = 1.0F;
            float var15 = 0.0F;
            float var16 = (float) arg7 / 32767.0F;
            float var17 = -((float) Math.sqrt((double) (1.0F - var16 * var16)));
            float var18 = -var16 + 1.0F;
            float var19 = (float) Math.sqrt((double) (arg6 * arg6 - -(arg0 * arg0)));
            if (var19 == 0.0F && var16 == 0.0F) {
                var9 = var8;
            } else {
                if (var19 != 0.0F) {
                    var14 = (float) (-arg0) / var19;
                    var15 = (float) arg6 / var19;
                }
                var13[0] = var14 * var14 * var18 + var16;
                var13[1] = var15 * var17;
                var13[7] = -var14 * var17;
                var13[4] = var16;
                var13[3] = -var15 * var17;
                var13[2] = var14 * var15 * var18;
                var13[8] = var15 * var15 * var18 + var16;
                var13[6] = var14 * var15 * var18;
                var13[5] = var14 * var17;
                var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
                var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
                var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
                var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
                var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
                var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
                var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
                var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
                var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
            }
            var9[0] *= arg4;
            var9[8] *= arg3;
            var9[2] *= arg4;
            var9[3] *= arg1;
            var9[1] *= arg4;
            var9[5] *= arg1;
            var9[4] *= arg1;
            var9[7] *= arg3;
            var9[6] *= arg3;
            return var9;
        } catch (RuntimeException var21) {
            throw class665.method4799(var21, field6548[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lqo;IIII)V")
    public static final void method3451(class170 arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field6545;
            class765 var5 = arg0.method1430(27750);
            class84 var6 = arg0.field2182;
            if (arg1 != 6144) {
                field6543 = 4;
            }
            int var7 = -arg0.field2234.field91 + arg0.field2235 & 16383;
            if (~arg3 != 0) {
                if (~arg0.field2219 == 0 || var7 < 10240 && var7 > 2048) {
                    if (var7 == 0 && arg0.field2243 <= 25) {
                        if (arg3 == 2 && var5.field10902 != -1) {
                            var6.method840(var5.field10902, false);
                        } else if (arg3 == 0 && ~var5.field10923 != 0) {
                            var6.method840(var5.field10923, false);
                        } else {
                            var6.method840(var5.field10937, false);
                        }
                        arg0.field2204 = false;
                    } else {
                        if (~arg3 == -3 && var5.field10902 != -1) {
                            if (~arg2 > -1 && ~var5.field10880 != 0) {
                                var6.method840(var5.field10880, false);
                            } else if (~arg2 < -1 && var5.field10917 != -1) {
                                var6.method840(var5.field10917, false);
                            } else {
                                var6.method840(var5.field10902, false);
                            }
                        } else if (~arg3 == -1 && ~var5.field10923 != 0) {
                            if (arg2 < 0 && var5.field10919 != -1) {
                                var6.method840(var5.field10919, false);
                            } else if (~arg2 < -1 && var5.field10898 != -1) {
                                var6.method840(var5.field10898, false);
                            } else {
                                var6.method840(var5.field10923, false);
                            }
                        } else if (arg2 < 0 && var5.field10901 != -1) {
                            var6.method840(var5.field10901, false);
                        } else if (~arg2 < -1 && var5.field10894 != -1) {
                            var6.method840(var5.field10894, false);
                        } else {
                            var6.method840(var5.field10937, false);
                        }
                        arg0.field2204 = false;
                    }
                } else {
                    int var8 = class714.field10145[arg4] + -arg0.field2234.field91 & 16383;
                    if (arg3 == 2 && var5.field10902 != -1) {
                        if (~var8 < -2049 && var8 <= 6144 && var5.field10920 != -1) {
                            var6.method840(var5.field10920, false);
                        } else if (var8 >= 10240 && ~var8 > -14337 && ~var5.field10932 != 0) {
                            var6.method840(var5.field10932, false);
                        } else if (~var8 < -6145 && ~var8 > -10241 && ~var5.field10905 != 0) {
                            var6.method840(var5.field10905, false);
                        } else {
                            var6.method840(var5.field10902, false);
                        }
                    } else if (~arg3 == -1 && var5.field10923 != -1) {
                        if (var8 > 2048 && ~var8 >= -6145 && ~var5.field10879 != 0) {
                            var6.method840(var5.field10879, false);
                        } else if (var8 >= 10240 && ~var8 > -14337 && var5.field10892 != -1) {
                            var6.method840(var5.field10892, false);
                        } else if (var8 > 6144 && var8 < 10240 && ~var5.field10922 != 0) {
                            var6.method840(var5.field10922, false);
                        } else {
                            var6.method840(var5.field10923, false);
                        }
                    } else if (~var8 < -2049 && ~var8 >= -6145 && var5.field10888 != -1) {
                        var6.method840(var5.field10888, false);
                    } else if (var8 >= 10240 && ~var8 > -14337 && var5.field10915 != -1) {
                        var6.method840(var5.field10915, false);
                    } else if (var8 > 6144 && var8 < 10240 && ~var5.field10904 != 0) {
                        var6.method840(var5.field10904, false);
                    } else {
                        var6.method840(var5.field10937, false);
                    }
                    arg0.field2204 = false;
                }
            } else if (var7 == 0 && ~arg0.field2243 >= -26) {
                if (!arg0.field2204 || !var5.method5532(var6.method837(arg1 ^ -6171), 0)) {
                    var6.method840(var5.method5528((byte) -95), false);
                    arg0.field2204 = var6.method835(false);
                }
            } else if (~arg2 > -1 && ~var5.field10912 != 0) {
                var6.method840(var5.field10912, false);
                arg0.field2204 = false;
            } else if (arg2 > 0 && var5.field10891 != -1) {
                var6.method840(var5.field10891, false);
                arg0.field2204 = false;
            } else {
                if (!arg0.field2204 || !var5.method5532(var6.method837(110), arg1 + -6144)) {
                    var6.method840(var5.method5528((byte) -95), false);
                    arg0.field2204 = arg0.field2182.method835(false);
                }
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field6548[4] + (arg0 != null ? field6548[2] : field6548[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)J")
    public final long method1506(byte arg0) {
        try {
            ++field6544;
            return arg0 >= -63 ? -97L : 0L;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6548[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)I")
    public final int method1505(int arg0) {
        try {
            if (arg0 != 11874) {
                field6543 = -122;
            }
            ++field6537;
            return super.field10960;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6548[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)I")
    public final int method1508(int arg0) {
        try {
            ++field6541;
            return arg0 != 25946 ? 18 : this.field6536;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6548[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3452(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 85);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!km", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3453(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 110;
                    break;
                case 1:
                    var10005 = 19;
                    break;
                case 2:
                    var10005 = 75;
                    break;
                case 3:
                    var10005 = 23;
                    break;
                default:
                    var10005 = 85;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
