import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class327 extends class518 {

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
    private int field4473 = 4096;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
    private int field4477 = 0;

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field4481 = new String[] { method2583(method2582("\u0006\u0014\u0011\u0014c")), method2583(method2582("\u0006\u0014\u0011\u0011c")), method2583(method2582("\u0006\u0014\u0011\u0013c")), method2583(method2582("\u0006\u0014\u0011\u0012c")), method2583(method2582("\u0006\u0014\u0011\u0010c")), method2583(method2582("\u0004\nS9")), method2583(method2582("\u0006\u0014\u0011\u0016c")), method2583(method2582("\u0011Q\u0011{6")), method2583(method2582("\u0006\u0014\u0011\u0017c")) };

    @OriginalMember(owner = "client!lk", name = "L", descriptor = "[[J")
    public static long[][] field4470 = new long[8][256];

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "[J")
    public static long[] field4474 = new long[11];

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "[Lm;")
    public static class781[] field4479;

    @OriginalMember(owner = "client!lk", name = "N", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!lk", name = "O", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!lk", name = "M", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field4475;
            int var3 = -78 % ((-57 - arg1) / 55);
            int[] var4 = super.field7564.method4462(26041, arg0);
            if (super.field7564.field8652) {
                int[] var5 = this.method3944(arg0, 0, (byte) 73);
                for (int var6 = 0; var6 < class110.field1436; ++var6) {
                    int var7 = var5[var6];
                    if (~var7 > ~this.field4477) {
                        var4[var6] = this.field4477;
                    } else if (~this.field4473 > ~var7) {
                        var4[var6] = this.field4473;
                    } else {
                        var4[var6] = var7;
                    }
                }
            }
            return var4;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field4481[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BJ)V")
    public static final void method2578(byte arg0, long arg1) {
        try {
            ++field4480;
            int var3 = class203.field2988.field2969 - -class113.field1462;
            int var4 = class203.field2988.field2984 - -class282.field3970;
            if (~(-var3 + class222.field3217) > 1999 || ~(-var3 + class222.field3217) < -2001 || ~(-var4 + class604.field8658) > 1999 || ~(-var4 + class604.field8658) < -2001) {
                class222.field3217 = var3;
                class604.field8658 = var4;
            }
            if (arg0 == -79) {
                if (class222.field3217 != var3) {
                    int var5 = var3 - class222.field3217;
                    int var6 = (int) ((long) var5 * arg1 / 320L);
                    if (~var5 >= -1) {
                        if (var6 == 0) {
                            var6 = -1;
                        } else if (var5 > var6) {
                            var6 = var5;
                        }
                    } else if (~var6 != -1) {
                        if (var6 > var5) {
                            var6 = var5;
                        }
                    } else {
                        var6 = 1;
                    }
                    class222.field3217 += var6;
                }
                class349.field5057 += (float) arg1 * class292.field4112 / 6.0F;
                if (~class604.field8658 != ~var4) {
                    int var7 = var4 - class604.field8658;
                    int var8 = (int) ((long) var7 * arg1 / 320L);
                    if (~var7 < -1) {
                        if (var8 == 0) {
                            var8 = 1;
                        } else if (~var7 > ~var8) {
                            var8 = var7;
                        }
                    } else if (~var8 == -1) {
                        var8 = -1;
                    } else if (var7 > var8) {
                        var8 = var7;
                    }
                    class604.field8658 += var8;
                }
                class607.field8706 += (float) arg1 * class238.field3441 / 6.0F;
                class626.method4600(-20556);
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field4481[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(II)V")
    public static final void method2579(int arg0, int arg1) {
        try {
            ++field4472;
            if (arg1 != -25762) {
                method2580(false);
            }
            class294 var2 = class146.method1261((long) arg0, -118, 5);
            var2.method2376(arg1 ^ -25819);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4481[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
    public static void method2580(boolean arg0) {
        try {
            field4470 = null;
            field4474 = null;
            field4479 = null;
            if (!arg0) {
                method2578((byte) 127, 12L);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4481[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)[[I")
    public final int[][] method349(int arg0, int arg1) {
        try {
            ++field4468;
            if (arg0 != 0) {
                field4470 = null;
            }
            int[][] var3 = super.field7575.method1955(arg1, arg0 ^ -2);
            if (super.field7575.field3416) {
                int[][] var4 = this.method3943(0, arg1, -23583);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class110.field1436 < ~var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (this.field4477 <= var12) {
                        if (~this.field4473 <= ~var12) {
                            var8[var11] = var12;
                        } else {
                            var8[var11] = this.field4473;
                        }
                    } else {
                        var8[var11] = this.field4477;
                    }
                    if (~this.field4477 < ~var13) {
                        var9[var11] = this.field4477;
                    } else if (~this.field4473 > ~var13) {
                        var9[var11] = this.field4473;
                    } else {
                        var9[var11] = var13;
                    }
                    if (this.field4477 <= var14) {
                        if (~this.field4473 > ~var14) {
                            var10[var11] = this.field4473;
                        } else {
                            var10[var11] = var14;
                        }
                    } else {
                        var10[var11] = this.field4477;
                    }
                }
            }
            return var3;
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field4481[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
    public class327() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIZII)V")
    public static final void method2581(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        try {
            if (!arg2) {
                field4470 = null;
            }
            ++field4471;
            class294 var5 = class146.method1261((long) arg3, -27, 8);
            var5.method2378(-114);
            var5.field4140 = arg4;
            var5.field4133 = arg0;
            var5.field4136 = arg1;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field4481[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILjc;I)V")
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            ++field4469;
            if (arg2 == -3) {
                if (arg0 != 0) {
                    if (arg0 != 1) {
                        if (~arg0 == -3) {
                            super.field7565 = ~arg1.method5128(0) == -2;
                        }
                    } else {
                        this.field4473 = arg1.method5116((byte) -123);
                    }
                } else {
                    this.field4477 = arg1.method5116((byte) -109);
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4481[6] + arg0 + ',' + (arg1 != null ? field4481[7] : field4481[5]) + ',' + arg2 + ')');
        }
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            char var3 = method2583(method2582("ᡉ욗螇Ě㛭튟礐酭惩鯅ꍦ筊ᷟ힗⸀︽ᔈ㟚龥䪑墣⥵놟毐봖႞쭁\u0558\ue472䇀ꜗ閧\ufbd1簳\udd5c䟴쩒뼸괏荸捨ꨎ젦䦌\uf2a8寢驙㊏\ue95a헋뺧㐷ｅ逊‣᫄됫錝撤獙䁢쎓\udb9e赨靋콁盽혤뗺樛䖙ゐ㽪ꊿ旱⾪\ude63ﵲ鈠ہ늌\u0e60拫ꣃ年┳萍㥳席㣇퇏\ue21e댞鱋䎌ﱮ処洲慠繯㯁칮轱랾㳊钝륬ⳬ\ue73b쑈嘮翖⪄섆\udc40鴆ㄋ\uf679곜ᒪᙐ楶炉킸찉风⠣\uf8b9")).charAt(var0 / 2);
            long var4 = (long) ((1 & var0) != 0 ? var3 & 255 : var3 >>> 8);
            long var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 ^= 285L;
            }
            long var8 = var6 << 1;
            if (var8 >= 256L) {
                var8 ^= 285L;
            }
            long var10 = var8 ^ var4;
            long var12 = var8 << 1;
            if (~var12 <= -257L) {
                var12 ^= 285L;
            }
            long var14 = var12 ^ var4;
            field4470[0][var0] = class597.method4407(var14, class597.method4407(class597.method4407(var10 << 16, class597.method4407(class597.method4407(var4 << 32, class597.method4407(var8 << 40, class597.method4407(var4 << 48, var4 << 56))), var12 << 24)), var6 << 8));
            for (int var16 = 1; var16 < 8; ++var16) {
                field4470[var16][var0] = class597.method4407(field4470[var16 + -1][var0] >>> 8, field4470[var16 + -1][var0] << 56);
            }
        }
        field4474[0] = 0L;
        for (int var1 = 1; var1 <= 10; ++var1) {
            int var2 = var1 * 8 + -8;
            field4474[var1] = class286.method2322(class286.method2322(class286.method2322(class286.method2322(class532.method4024(4278190080L, field4470[4][var2 + 4]), class286.method2322(class532.method4024(field4470[3][var2 + 3], 1095216660480L), class286.method2322(class532.method4024(280375465082880L, field4470[2][var2 + 2]), class286.method2322(class532.method4024(71776119061217280L, field4470[1][var2 + 1]), class532.method4024(field4470[0][var2], -72057594037927936L))))), class532.method4024(16711680L, field4470[5][var2 + 5])), class532.method4024(65280L, field4470[6][var2 + 6])), class532.method4024(255L, field4470[7][var2 + 7]));
        }
        field4476 = 0;
        field4479 = new class781[128];
    }

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2582(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 75);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2583(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 106;
                    break;
                case 1:
                    var10005 = 127;
                    break;
                case 2:
                    var10005 = 63;
                    break;
                case 3:
                    var10005 = 85;
                    break;
                default:
                    var10005 = 75;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
