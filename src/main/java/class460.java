import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class460 extends class518 {

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
    private int field6705 = 2048;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "I")
    private int field6714 = 0;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
    private int field6715 = 10;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "[Ljava/lang/String;")
    private static final String[] field6717 = new String[] { method3544(method3543("H\u001c\f\u00056")), method3544(method3543("U\u000eN-")), method3544(method3543("@U\foc")), method3544(method3543("H\u001c\f\u00076")), method3544(method3543("H\u001c\f\u000b6")), method3544(method3543("H\u001c\f\u00036")), method3544(method3543("H\u001c\f\u00066")), method3544(method3543("H\u001c\f\u00026")) };

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "Z")
    public static boolean field6709 = true;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "Lkl;")
    public static class740 field6716;

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
    public static int field6712;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "[I")
    private int[] field6708;

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "[I")
    private int[] field6711;

    static {
        new class574("", 73);
        field6716 = new class740();
    }

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "(I)V", line = 3)
    public static final void method3539(int arg0) {
        class210.field3055 = arg0;
        for (int var1 = 0; var1 < class508.field7455; ++var1) {
            for (int var2 = 0; var2 < class700.field9795; ++var2) {
                if (class608.field8715[arg0][var1][var2] == null) {
                    class608.field8715[arg0][var1][var2] = new class621(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V", line = 30)
    public final void method12(int arg0) {
        try {
            ++field6712;
            this.method3541(0);
            if (arg0 <= 38) {
                field6716 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6717[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "(I)V", line = 44)
    public static void method3540(int arg0) {
        try {
            field6716 = null;
            if (arg0 <= 6) {
                method3540(113);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6717[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V", line = 58)
    public class460() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "(I)V", line = 61)
    private final void method3541(int arg0) {
        try {
            ++field6706;
            this.field6708 = new int[this.field6715 + 1];
            int var2 = arg0;
            this.field6711 = new int[this.field6715 - -1];
            int var3 = 4096 / this.field6715;
            int var4 = this.field6705 * var3 >> 12;
            for (int var5 = 0; ~this.field6715 < ~var5; ++var5) {
                this.field6711[var5] = var2;
                this.field6708[var5] = var2 + var4;
                var2 += var3;
            }
            this.field6711[this.field6715] = 4096;
            this.field6708[this.field6715] = this.field6708[0] + 4096;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field6717[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 94)
    public static final void method3542(String arg0, byte arg1) {
        try {
            ++field6707;
            if (arg1 == 126) {
                if (class625.field8931 != null) {
                    ++class651.field9251;
                    class779 var2 = class85.method851(false);
                    class274 var3 = class375.method2969((byte) 1, class608.field8713, var2.field11100);
                    var3.field3885.method5114(255, class101.method986(arg0, 6743));
                    var3.field3885.method5089(arg0, (byte) 102);
                    var2.method5608(var3, arg1 ^ 29909);
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6717[3] + (arg0 != null ? field6717[2] : field6717[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)[I", line = 120)
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field6710;
            int[] var3 = super.field7564.method4462(26041, arg0);
            if (super.field7564.field8652) {
                int var4 = class568.field8263[arg0];
                if (this.field6714 != 0) {
                    for (int var5 = 0; ~class110.field1436 < ~var5; ++var5) {
                        int var6 = 0;
                        short var7 = 0;
                        int var8 = class393.field5718[var5];
                        int var9 = this.field6714;
                        if (~var9 != -2) {
                            if (var9 != 2) {
                                if (var9 == 3) {
                                    var6 = (-var4 + var8 >> 1) + 2048;
                                }
                            } else {
                                var6 = (var8 - (-var4 + 4096) >> 1) + 2048;
                            }
                        } else {
                            var6 = var8;
                        }
                        for (int var10 = 0; ~this.field6715 < ~var10; ++var10) {
                            if (~this.field6711[var10] >= ~var6 && ~this.field6711[var10 + 1] < ~var6) {
                                if (~this.field6708[var10] < ~var6) {
                                    var7 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var5] = var7;
                    }
                } else {
                    short var11 = 0;
                    for (int var12 = 0; ~var12 > ~this.field6715; ++var12) {
                        if (this.field6711[var12] <= var4 && this.field6711[1 + var12] > var4) {
                            if (~this.field6708[var12] < ~var4) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    class569.method4243(var3, 0, class110.field1436, var11);
                }
            }
            int var13 = 57 / ((-57 - arg1) / 55);
            return var3;
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field6717[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILjc;I)V", line = 247)
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (~arg0 == -3) {
                        this.field6714 = arg1.method5128(0);
                    }
                } else {
                    this.field6705 = arg1.method5116((byte) -107);
                }
            } else {
                this.field6715 = arg1.method5128(0);
            }
            if (arg2 != -3) {
                this.field6708 = null;
            }
            ++field6713;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6717[7] + arg0 + ',' + (arg1 != null ? field6717[2] : field6717[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3543(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 30);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3544(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 59;
                    break;
                case 1:
                    var10005 = 123;
                    break;
                case 2:
                    var10005 = 34;
                    break;
                case 3:
                    var10005 = 65;
                    break;
                default:
                    var10005 = 30;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
