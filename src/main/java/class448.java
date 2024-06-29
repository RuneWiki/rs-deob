import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class448 extends class206 {

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public int field6586;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    private int field6588;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    public int field6592;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    private int field6595;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public int field6589;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    private int field6590;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    public int field6579;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    private int field6580;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    private int field6582;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field6597 = new String[] { method3456(method3455("t-g\u0011\t")), method3456(method3455("xdgv\\")), method3456(method3455("t-g\u001a\t")), method3456(method3455("m?%4")), method3456(method3455("t-gdHm#=f\t")), method3456(method3455("k=z<")), method3456(method3455("i+*4Ha")), method3456(method3455("t-g\u0010\t")), method3456(method3455("t-g\u001b\t")), method3456(method3455("t-g\u001e\t")), method3456(method3455("t-g\u001d\t")), method3456(method3455("t-g\u001f\t")), method3456(method3455("t-g\u001c\t")), method3456(method3455("t-g\u0019\t")) };

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)Z", line = 6)
    public static final boolean method3446(int arg0) {
        try {
            if (arg0 > -87) {
                method3446(-42);
            }
            field6591++;
            return class116.method1024(field6597[6], 1) ? class116.method1024(field6597[5], 1) : false;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6597[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIB)Z", line = 23)
    public final boolean method3447(int arg0, int arg1, byte arg2) {
        try {
            field6593++;
            int var4 = 66 % ((arg2 + 65) / 57);
            return this.field6579 <= arg0 && this.field6589 >= arg0 && arg1 >= this.field6592 && arg1 <= this.field6586;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6597[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI[II)V", line = 38)
    public final void method3448(byte arg0, int arg1, int[] arg2, int arg3) {
        try {
            arg2[2] = this.field6592 + arg1 - this.field6580;
            if (arg0 != 92) {
                this.field6588 = -11;
            }
            arg2[0] = 0;
            field6583++;
            arg2[1] = arg3 - (this.field6595 - this.field6579);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6597[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6597[3] : field6597[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III[I)V", line = 51)
    public final void method3449(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            arg3[arg1] = arg0 - (this.field6592 - this.field6580);
            arg3[1] = arg2 - (this.field6579 - this.field6595);
            field6584++;
            arg3[0] = this.field6588;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6597[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field6597[3] : field6597[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 64)
    public static final void method3450(int arg0) {
        try {
            field6596++;
            if (arg0 == ~class289.field4305.field825.method717(false) && class520.field7618 != class419.field6182) {
                class353.method2891(0, class687.field9973, false, 11, class247.field3771);
            } else {
                class165.method1471(true, class610.field8913);
                if (class520.field7618 != class16.field194) {
                    class579.method4331(arg0 ^ 0xFFFFFF8D);
                }
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6597[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBII)Z", line = 82)
    public final boolean method3451(int arg0, byte arg1, int arg2, int arg3) {
        try {
            if (arg1 >= -53) {
                method3453(-49, 73, -114, (byte) -22, 94);
            }
            field6581++;
            return this.field6588 == arg0 && arg3 >= this.field6595 && this.field6582 >= arg3 && arg2 >= this.field6580 && this.field6590 >= arg2;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6597[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Z", line = 102)
    public final boolean method3452(int arg0, int arg1, int arg2) {
        try {
            if (arg2 != -9626) {
                this.field6595 = 48;
            }
            field6585++;
            return this.field6595 <= arg0 && this.field6582 >= arg0 && arg1 >= this.field6580 && arg1 <= this.field6590;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6597[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIBI)V", line = 118)
    public static final void method3453(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        try {
            field6587++;
            int var5 = 0;
            int var6 = arg0;
            if (arg3 <= -110) {
                int var7 = -arg0;
                int var8 = -1;
                class319.method2702(class243.field3731[arg2], arg4 - arg0, arg0 + arg4, true, arg1);
                while (var6 > var5) {
                    var8 += 2;
                    var5++;
                    var7 += var8;
                    if (var7 >= 0) {
                        var6--;
                        var7 -= var6 << 1;
                        int[] var9 = class243.field3731[arg2 + var6];
                        int[] var10 = class243.field3731[arg2 - var6];
                        int var11 = arg4 + var5;
                        int var12 = arg4 - var5;
                        class319.method2702(var9, var12, var11, true, arg1);
                        class319.method2702(var10, var12, var11, true, arg1);
                    }
                    int var13 = arg4 + var6;
                    int var14 = arg4 - var6;
                    int[] var15 = class243.field3731[arg2 + var5];
                    int[] var16 = class243.field3731[arg2 - var5];
                    class319.method2702(var15, var14, var13, true, arg1);
                    class319.method2702(var16, var14, var13, true, arg1);
                }
            }
        } catch (RuntimeException var18) {
            throw class759.method5498(var18, field6597[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V", line = 175)
    public static final void method3454(int arg0) {
        try {
            class656.field9486 = class446.method3428(4, 8, 2048, true, 8, 0.4F, 4096, 35);
            field6594++;
            if (arg0 == -27366) {
                ;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6597[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(IIIIIIIII)V", line = 186)
    public class448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            this.field6586 = arg8;
            this.field6588 = arg0;
            this.field6592 = arg6;
            this.field6595 = arg1;
            this.field6589 = arg7;
            this.field6590 = arg4;
            this.field6579 = arg5;
            this.field6580 = arg2;
            this.field6582 = arg3;
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field6597[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3455(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x21);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3456(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 3;
                    break;
                case 1:
                    var10005 = 74;
                    break;
                case 2:
                    var10005 = 73;
                    break;
                case 3:
                    var10005 = 88;
                    break;
                default:
                    var10005 = 33;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
