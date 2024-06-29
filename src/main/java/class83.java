import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class83 extends class529 {

    @OriginalMember(owner = "client!rda", name = "D", descriptor = "[I")
    public static int[] field1071 = new int[250];

    @OriginalMember(owner = "client!rda", name = "J", descriptor = "Lus;")
    public static class328 field1077 = new class328(7, 3);

    @OriginalMember(owner = "client!rda", name = "N", descriptor = "Lmq;")
    public static class78 field1081 = new class78(5, 6);

    @OriginalMember(owner = "client!rda", name = "E", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!rda", name = "F", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!rda", name = "G", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!rda", name = "H", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!rda", name = "I", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!rda", name = "K", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!rda", name = "L", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!rda", name = "M", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!rda", name = "O", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(III)V")
    private final void method586(int arg0, int arg1, int arg2) {
        ++field1076;
        int var4 = class225.field2973[arg0];
        int var5 = class310.field3960[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - arg2));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class68.field943 = arg1;
            class162.field2081 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class68.field943 = arg0;
            class162.field2081 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class68.field943 = arg0;
            class162.field2081 = class304.field3909 - arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class68.field943 = -arg1 + class424.field6042;
            class162.field2081 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class68.field943 = class424.field6042 - arg1;
            class162.field2081 = -arg0 + class304.field3909;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class162.field2081 = class304.field3909 - arg1;
            class68.field943 = -arg0 + class424.field6042;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class68.field943 = class424.field6042 - arg0;
            class162.field2081 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class162.field2081 = -arg0 + class304.field3909;
            class68.field943 = arg1;
        }
        class68.field943 &= class33.field516;
        class162.field2081 &= class404.field5700;
    }

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "(B)V")
    public static final void method587(byte arg0) {
        if (arg0 >= -120) {
            field1077 = null;
        }
        ++field1072;
        if (class331.field4207 != null) {
            if (class331.field4207.field6124 == 1) {
                class331.field4207 = null;
                return;
            }
            if (class331.field4207.field6124 == 2) {
                class174.method1078(class728.field10190, (byte) 31, 2, class634.field8794);
                class331.field4207 = null;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "(I)V")
    public static void method588(int arg0) {
        if (arg0 > -54) {
            field1077 = null;
        }
        field1071 = null;
        field1077 = null;
        field1081 = null;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IZ)Lfj;")
    public static final class82 method589(int arg0, boolean arg1) {
        if (!arg1) {
            method593((byte[]) null, (byte) -66, 113, 64);
        }
        ++field1080;
        return new class82(arg0, false);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BIIII)I")
    public static final int method590(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 > -69) {
            field1071 = null;
        }
        ++field1075;
        int var5 = -class138.field1645[arg4 * 8192 / arg2] + 65536 >> 1;
        return ((-var5 + 65536) * arg3 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "(I)V")
    public static final void method591(int arg0) {
        class663.method3591(16886, class85.field1090);
        ++field1074;
        ++class295.field3840;
        if (class513.field7225 && class424.field6048) {
            int var1 = 0;
            int var2 = 0;
            if (class107.field1323) {
                var1 = class173.method1075(100);
                var2 = class203.method1259((byte) 125);
            }
            int var3 = class402.field5566.method2337(-125) + var1;
            int var4 = class402.field5566.method2336((byte) 18) - -var2;
            if (arg0 < 84) {
                method593((byte[]) null, (byte) 25, -49, -127);
            }
            int var5 = var4 - class539.field7595;
            int var6 = var3 - class175.field2276;
            if (var6 < class263.field3335) {
                var6 = class263.field3335;
            }
            if (class374.field5258 > var5) {
                var5 = class374.field5258;
            }
            if (~(var6 - -class85.field1090.field6566) < ~(class263.field3335 + class333.field4299.field6566)) {
                var6 = class263.field3335 + class333.field4299.field6566 + -class85.field1090.field6566;
            }
            if (~(class374.field5258 - -class333.field4299.field6514) > ~(class85.field1090.field6514 + var5)) {
                var5 = -class85.field1090.field6514 + class333.field4299.field6514 + class374.field5258;
            }
            int var7 = -class263.field3335 + var6 + class333.field4299.field6549;
            int var8 = -class374.field5258 + class333.field4299.field6466 + var5;
            if (class402.field5566.method3088((byte) -93)) {
                if (class85.field1090.field6583 < class295.field3840) {
                    int var9 = -class480.field6853 + var6;
                    int var10 = -class718.field10128 + var5;
                    if (~var9 < ~class85.field1090.field6586 || ~var9 > ~(-class85.field1090.field6586) || ~class85.field1090.field6586 > ~var10 || -class85.field1090.field6586 > var10) {
                        class563.field7885 = true;
                    }
                }
                if (class85.field1090.field6562 != null && class563.field7885) {
                    class575 var11 = new class575();
                    var11.field8028 = class85.field1090;
                    var11.field8027 = class85.field1090.field6562;
                    var11.field8022 = var8;
                    var11.field8021 = var7;
                    class445.method2625(var11);
                    return;
                }
            } else {
                if (class563.field7885) {
                    class463.method2742((byte) 88);
                    if (class85.field1090.field6480 != null) {
                        class575 var12 = new class575();
                        var12.field8021 = var7;
                        var12.field8022 = var8;
                        var12.field8032 = class33.field519;
                        var12.field8028 = class85.field1090;
                        var12.field8027 = class85.field1090.field6480;
                        class445.method2625(var12);
                    }
                    if (class33.field519 != null && client.method710(class85.field1090) != null) {
                        class134.method845(27533, class85.field1090, class33.field519);
                    }
                } else if ((~class548.field7734 == -2 || class292.method1751((byte) 123)) && ~class573.field8011 < -3) {
                    class730.method4080(class480.field6853 + class175.field2276, class718.field10128 + class539.field7595, 14284);
                } else if (class310.method1809((byte) -81)) {
                    class730.method4080(class480.field6853 + class175.field2276, class539.field7595 - -class718.field10128, 14284);
                }
                class85.field1090 = null;
            }
        } else {
            if (~class295.field3840 < -2) {
                class85.field1090 = null;
            }
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IBLtn;)V")
    public final void method190(int arg0, byte arg1, class179 arg2) {
        if (arg0 == 0) {
            super.field7461 = ~arg2.method1094(255) == -2;
        }
        if (arg1 < 45) {
            field1077 = null;
        }
        ++field1079;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(II)[[I")
    public final int[][] method592(int arg0, int arg1) {
        ++field1082;
        int[][] var3 = super.field7450.method2241(-1, arg0);
        if (super.field7450.field5165) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class304.field3909; ++var7) {
                this.method586(var7, arg0, arg1 ^ 2050);
                int[][] var8 = this.method3026(0, class68.field943, 18464);
                var4[var7] = var8[0][class162.field2081];
                var5[var7] = var8[1][class162.field2081];
                var6[var7] = var8[2][class162.field2081];
            }
        }
        return arg1 != 2 ? null : var3;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "([BBII)I")
    public static final int method593(byte[] arg0, byte arg1, int arg2, int arg3) {
        ++field1073;
        int var4 = -1;
        for (int var5 = arg3; ~var5 > ~arg2; ++var5) {
            var4 = class538.field7550[(arg0[var5] ^ var4) & 255] ^ var4 >>> 8;
        }
        if (arg1 <= 7) {
            method589(-121, true);
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "()V")
    public class83() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IB)[I")
    public final int[] method191(int arg0, byte arg1) {
        ++field1078;
        int[] var3 = super.field7456.method1635(arg0, -76);
        int var4 = 37 % ((27 - arg1) / 49);
        if (super.field7456.field3449) {
            for (int var5 = 0; ~class304.field3909 < ~var5; ++var5) {
                this.method586(var5, arg0, 2048);
                int[] var6 = this.method3028((byte) 104, class68.field943, 0);
                var3[var5] = var6[class162.field2081];
            }
        }
        return var3;
    }
}
