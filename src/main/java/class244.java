import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class244 extends class232 {

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
    private int field3758 = -1;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "[Ljava/lang/String;")
    private static final String[] field3770 = new String[] { method2108(method2107("ho/\u0006y")), method2108(method2107("ho/\u0004y")), method2108(method2107("ho/\u0018y")), method2108(method2107("u /y,")), method2108(method2107("ho/\u0012y")), method2108(method2107("`{m;")), method2108(method2107("ho/\u0015y")), method2108(method2107("ho/\u0005y")), method2108(method2107("ho/\u0010y")), method2108(method2107("ho/\u0003y")), method2108(method2107("Moc50ik")) };

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
    public int field3760;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public int field3763;

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "[I")
    public int[] field3761;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(III)Lpba;", line = 5)
    public static final class350 method2102(int arg0, int arg1, int arg2) {
        class290 var3 = class85.field1280[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4684;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZILwq;)Ljava/lang/String;", line = 12)
    public static final String method2103(boolean arg0, int arg1, class176 arg2) {
        try {
            ++field3769;
            try {
                if (!arg0) {
                    method2105(10, 0, 3);
                }
                int var3 = arg2.method1660(!arg0);
                if (~arg1 > ~var3) {
                    var3 = arg1;
                }
                byte[] var4 = new byte[var3];
                arg2.field2799 += class784.field11460.method2942(arg2.field2799, var3, var4, arg2.field2805, 0, 7);
                return class240.method2069(160, var4, 0, var3);
            } catch (Exception var7) {
                return field3770[10];
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field3770[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3770[3] : field3770[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)[[I", line = 42)
    public int[][] method122(int arg0, int arg1) {
        try {
            ++field3762;
            int[][] var3 = super.field3599.method1580(arg1, (byte) -42);
            if (super.field3599.field2743 && this.method2106((byte) 27)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = (~class742.field10920 == ~this.field3760 ? arg1 : this.field3760 * arg1 / class742.field10920) * this.field3763;
                if (~class449.field6969 != ~this.field3763) {
                    for (int var8 = 0; class449.field6969 > var8; ++var8) {
                        int var9 = this.field3763 * var8 / class449.field6969;
                        int var10 = this.field3761[var7 + var9];
                        var6[var8] = class292.method2485(255, var10) << 4;
                        var5[var8] = class292.method2485(var10 >> 4, 4080);
                        var4[var8] = class292.method2485(var10 >> 12, 4080);
                    }
                } else {
                    for (int var11 = 0; var11 < class449.field6969; ++var11) {
                        int var12 = this.field3761[var7++];
                        var6[var11] = class292.method2485(4080, var12 << 4);
                        var5[var11] = class292.method2485(var12, 65280) >> 4;
                        var4[var11] = class292.method2485(var12, 16711680) >> 12;
                    }
                }
            }
            if (arg0 != -3093) {
                this.field3763 = 111;
            }
            return var3;
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field3770[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V", line = 122)
    public class244() {
        super(0, false);
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)V", line = 126)
    public static final void method2104(int arg0, int arg1) {
        try {
            class551.field8082.method294(arg1, arg0 ^ -2239);
            ++field3767;
            if (arg0 != 2763) {
                method2105(-55, -53, 47);
            }
            class104.field1524.method294(arg1, -630);
            class303.field4880.method294(arg1, -630);
            class37.field426.method294(arg1, -630);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3770[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(III)V", line = 141)
    public static final void method2105(int arg0, int arg1, int arg2) {
        try {
            ++field3766;
            if (class761.field11182 != null) {
                int var3 = 73 / ((arg2 - -6) / 37);
                int var4 = class152.field2133;
                int var5 = class258.field3904;
                class20.method134(arg1, 71, arg0);
                if (class184.field2931 != 0) {
                    if (~class184.field2931 == -2 && (class574.field8295 == null || class152.field2133 != var4 || class258.field3904 != var5)) {
                        class574.field8295 = new class769[class258.field3904 * class152.field2133];
                        for (int var6 = 0; var6 < class574.field8295.length; ++var6) {
                            class574.field8295[var6] = class761.field11182.method217(class761.field11182.method209(class667.field9483, class742.field10924), class761.field11182.method223(class667.field9483, class742.field10924));
                        }
                        class143.field2028 = 1;
                        class194.field3055 = new int[class258.field3904 * class152.field2133];
                    }
                } else {
                    class765.field11214 = null;
                    class765.field11214 = class761.field11182.method217(class761.field11182.method209(class82.field1244, class413.field6569), class761.field11182.method223(class82.field1244, class413.field6569));
                }
                class540.field7961 = true;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field3770[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)Z", line = 187)
    public final boolean method2106(byte arg0) {
        try {
            ++field3764;
            if (this.field3761 != null) {
                return true;
            } else if (this.field3758 >= 0) {
                class174 var2 = class393.field6255 < 0 ? class174.method1609(class568.field8251, this.field3758) : class174.method1608(class568.field8251, class393.field6255, this.field3758);
                var2.method1604();
                this.field3761 = var2.method1605();
                this.field3760 = var2.field2782;
                this.field3763 = var2.field2781;
                return true;
            } else {
                if (arg0 < 20) {
                    method2103(false, 86, (class176) null);
                }
                return false;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3770[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILwq;I)V", line = 214)
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            ++field3765;
            if (arg2 == 0) {
                this.field3758 = arg1.method1687((byte) -93);
            }
            if (arg0 <= 96) {
                this.field3761 = null;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3770[4] + arg0 + ',' + (arg1 != null ? field3770[3] : field3770[5]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I", line = 228)
    public final int method2025(int arg0) {
        try {
            ++field3759;
            if (arg0 != -9801) {
                this.field3761 = null;
            }
            return this.field3758;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3770[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V", line = 239)
    public final void method2024(int arg0) {
        try {
            super.method2024(arg0);
            ++field3768;
            this.field3761 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3770[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2107(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 81);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2108(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 14;
                    break;
                case 1:
                    var10005 = 14;
                    break;
                case 2:
                    var10005 = 1;
                    break;
                case 3:
                    var10005 = 87;
                    break;
                default:
                    var10005 = 81;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
