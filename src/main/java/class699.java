import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class699 extends class518 {

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "Z")
    private boolean field9785 = true;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "Z")
    private boolean field9791 = true;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field9794 = new String[] { method5039(method5038("1H\bv\u0019")), method5039(method5038("1H\br\u0019")), method5039(method5038("1H\bq\u0019")), method5039(method5038("1H\bt\u0019")), method5039(method5038("4[J[")), method5039(method5038("!\u0000\b\u0019L")), method5039(method5038("1H\bp\u0019")), method5039(method5038("1H\bs\u0019")) };

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "Lui;")
    public static class251 field9789 = new class251(32);

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "Lsb;")
    public static class261 field9793 = new class261(11, 3);

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    public static int field9786;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    public static int field9787;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    public static int field9788;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public static int field9790;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public static int field9792;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILjc;I)V", line = 4)
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            if (arg2 != -3) {
                field9789 = null;
            }
            ++field9787;
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        super.field7565 = arg1.method5128(arg2 + 3) == 1;
                    }
                } else {
                    this.field9785 = ~arg1.method5128(0) == -2;
                }
            } else {
                this.field9791 = ~arg1.method5128(0) == -2;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9794[3] + arg0 + ',' + (arg1 != null ? field9794[5] : field9794[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(II)V", line = 50)
    public static final void method5035(int arg0, int arg1) {
        try {
            if (arg1 == 31754) {
                ++field9790;
                if (class559.field8139 != arg0) {
                    if (~arg0 == -15 || ~arg0 == -16) {
                        class622.method4572(false);
                    }
                    if (~arg0 != -15 && class747.field10650 != null) {
                        class747.field10650.method318((byte) -104);
                        class747.field10650 = null;
                    }
                    if (~arg0 == -4) {
                        class315.method2505(~class572.field8291 != ~class265.field3741, (byte) 62);
                    }
                    if (arg0 == 7) {
                        class449.method3476(class572.field8291 != class397.field5781, (byte) -5);
                    }
                    if (arg0 != 5 && arg0 != 13) {
                        if (~arg0 == -7 || ~arg0 == -10) {
                            class622.method4572(false);
                        }
                    } else {
                        class608.method4487(-124);
                    }
                    if (class288.method2341(class559.field8139, (byte) -39)) {
                        class217.field3180.field700 = 2;
                        class234.field3375.field700 = 2;
                        class343.field4991.field700 = 2;
                        class347.field5047.field700 = 2;
                        class691.field9674.field700 = 2;
                        class493.field7240.field700 = 2;
                        class776.field11061.field700 = 2;
                    }
                    if (class288.method2341(arg0, (byte) -121)) {
                        class36.field433 = 0;
                        class772.field11000 = 0;
                        class725.field10316 = 1;
                        class11.field146 = 1;
                        class185.field2400 = 0;
                        class63.method672(true, arg1 ^ 31818);
                        class217.field3180.field700 = 1;
                        class234.field3375.field700 = 1;
                        class343.field4991.field700 = 1;
                        class347.field5047.field700 = 1;
                        class691.field9674.field700 = 1;
                        class493.field7240.field700 = 1;
                        class776.field11061.field700 = 1;
                    }
                    if (~arg0 == -13 || ~arg0 == -4) {
                        class40.method462(false);
                    }
                    boolean var2 = ~arg0 == -3 || class354.method2835(arg0, arg1 ^ 31754) || class322.method2551(arg0, -31);
                    boolean var3 = ~class559.field8139 == -3 || class354.method2835(class559.field8139, 0) || class322.method2551(class559.field8139, -127);
                    if (!var3 == var2) {
                        if (var2) {
                            class291.field4106 = class694.field9703;
                            if (class451.field6612.field9104.method2498(3) != 0) {
                                class728.method5301(2, class694.field9703, 0, arg1 ^ -31854, class379.field5540, class451.field6612.field9104.method2498(arg1 + -31751), false);
                                class486.method3746((byte) -128);
                            } else {
                                class235.method1948(2, (byte) -23);
                            }
                            class45.field646.method5026(false, (byte) 88);
                        } else {
                            class235.method1948(2, (byte) -85);
                            class45.field646.method5026(true, (byte) 78);
                        }
                    }
                    if (class288.method2341(arg0, (byte) -52) || ~arg0 == -15 || ~arg0 == -16) {
                        class236.field3418.method238();
                    }
                    class559.field8139 = arg0;
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9794[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZIBI)Lin;", line = 161)
    public static final class509 method5036(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        try {
            ++field9788;
            class509 var5 = new class509();
            var5.field7472 = arg2;
            var5.field7473 = arg4;
            class104.field1375.method3691(var5, (long) arg0, -1);
            class463.method3557(97, arg2);
            class782 var6 = class435.method3389(arg0, (byte) -118);
            if (var6 != null) {
                class97.method959(var6, -1);
            }
            if (class500.field7302 != null) {
                class97.method959(class500.field7302, -1);
                class500.field7302 = null;
            }
            class576.method4280(-56);
            if (var6 != null) {
                class530.method4011(!arg1, false, var6);
            }
            if (!arg1) {
                class158.method1326(arg2);
            }
            if (arg3 <= 119) {
                return null;
            } else {
                if (!arg1 && ~class572.field8291 != 0) {
                    class149.method1270(1, class572.field8291, -22202);
                }
                return var5;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field9794[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V", line = 203)
    public class699() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)[I", line = 212)
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field9786;
            int[] var3 = super.field7564.method4462(26041, arg0);
            int var4 = -35 % ((arg1 - -57) / 55);
            if (super.field7564.field8652) {
                int[] var5 = this.method3944(this.field9785 ? -arg0 + class478.field7048 : arg0, 0, (byte) 73);
                if (!this.field9791) {
                    class569.method4248(var5, 0, var3, 0, class110.field1436);
                } else {
                    for (int var6 = 0; var6 < class110.field1436; ++var6) {
                        var3[var6] = var5[class247.field3543 - var6];
                    }
                }
            }
            return var3;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field9794[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)[[I", line = 253)
    public final int[][] method349(int arg0, int arg1) {
        try {
            ++field9792;
            int[][] var3 = super.field7575.method1955(arg1, -2);
            if (arg0 != 0) {
                this.method17(10, (class711) null, 35);
            }
            if (super.field7575.field3416) {
                int[][] var4 = this.method3943(0, !this.field9785 ? arg1 : -arg1 + class478.field7048, -23583);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                if (this.field9791) {
                    for (int var11 = 0; class110.field1436 > var11; ++var11) {
                        var8[var11] = var5[-var11 + class247.field3543];
                        var9[var11] = var6[class247.field3543 - var11];
                        var10[var11] = var7[class247.field3543 - var11];
                    }
                } else {
                    for (int var12 = 0; class110.field1436 > var12; ++var12) {
                        var8[var12] = var5[var12];
                        var9[var12] = var6[var12];
                        var10[var12] = var7[var12];
                    }
                }
            }
            return var3;
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field9794[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "(I)V", line = 327)
    public static void method5037(int arg0) {
        try {
            if (arg0 != 27874) {
                method5037(-44);
            }
            field9793 = null;
            field9789 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9794[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5038(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 49);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5039(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 90;
                    break;
                case 1:
                    var10005 = 46;
                    break;
                case 2:
                    var10005 = 38;
                    break;
                case 3:
                    var10005 = 55;
                    break;
                default:
                    var10005 = 49;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
