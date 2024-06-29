import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class530 extends class497 {

    @OriginalMember(owner = "client!re", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7696 = new String[] { method4017(method4016("RGza\u001d")), method4017(method4016("RGzm\u001d")), method4017(method4016("RGzg\u001d")), method4017(method4016("RGzl\u001d")), method4017(method4016("RGz`\u001d")), method4017(method4016("RGze\u001d")), method4017(method4016("RGzf\u001d")), method4017(method4016("[\fz\nH")), method4017(method4016("NW8H")), method4017(method4016("RGzb\u001d")), method4017(method4016("RGzc\u001d")) };

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field7689 = 0;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "Lvl;")
    public static class340 field7684 = new class340(16);

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Ltf;")
    public static class524 field7694 = new class524();

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Lsb;")
    public static class261 field7695 = new class261(51, -1);

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field7685;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field7687;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field7690;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field7691;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZZLvo;)V")
    public static final void method4011(boolean arg0, boolean arg1, class782 arg2) {
        try {
            if (arg1) {
                field7684 = null;
            }
            ++field7687;
            int var3 = ~arg2.field11177 != -1 ? arg2.field11177 : arg2.field11295;
            int var4 = ~arg2.field11263 != -1 ? arg2.field11263 : arg2.field11244;
            class110.method1038(var3, arg2.field11158, arg0, 0, var4, class9.field117[arg2.field11158 >> 16]);
            if (arg2.field11290 != null) {
                class110.method1038(var3, arg2.field11158, arg0, 0, var4, arg2.field11290);
            }
            class509 var5 = (class509) class104.field1375.method3693(arg1, (long) arg2.field11158);
            if (var5 != null) {
                class705.method5058(var3, arg0, var4, var5.field7472, (byte) -85);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field7696[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7696[7] : field7696[8]) + ')');
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(Z)I")
    public static final int method4012(boolean arg0) {
        try {
            ++field7688;
            if (!arg0) {
                field7694 = null;
            }
            return class285.method2303(false, -17827);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7696[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)I")
    public final int method1029(byte arg0, int arg1) {
        try {
            if (arg0 != -73) {
                this.method1031((byte) -33);
            }
            ++field7690;
            return 1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7696[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
    public static final void method4013(byte arg0) {
        try {
            class492.field7235 = null;
            ++field7691;
            class349.field5060 = null;
            class637.field9013 = null;
            class641.field9143 = -1;
            class742.field10549 = null;
            class785.field11337 = null;
            class263.field3715 = -1;
            class101.field1360 = -1;
            class570.field8270 = null;
            class209.field3043 = null;
            class591.field8499 = -1;
            if (arg0 < 16) {
                field7694 = null;
            }
            class626.field8937.method1840((byte) 77);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7696[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)I")
    public final int method1032(int arg0) {
        try {
            ++field7685;
            return arg0 > -101 ? -6 : 2;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7696[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public final void method1031(byte arg0) {
        try {
            if (arg0 >= -70) {
                field7689 = 63;
            }
            if (super.field7293.field9085.method5157((byte) -106) && super.field7292 == 2) {
                super.field7292 = 1;
            }
            ++field7686;
            if (~super.field7292 > -1 || ~super.field7292 < -3) {
                super.field7292 = this.method1032(-121);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7696[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(Z)V")
    public static void method4014(boolean arg0) {
        try {
            field7684 = null;
            field7694 = null;
            if (arg0) {
                field7689 = -51;
            }
            field7695 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7696[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(ILpp;)V")
    public class530(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lpp;)V")
    public class530(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V")
    public final void method1030(int arg0, int arg1) {
        try {
            ++field7693;
            if (arg0 == 64) {
                super.field7292 = arg1;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7696[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)I")
    public final int method4015(int arg0) {
        try {
            if (arg0 != 3) {
                return -79;
            } else {
                ++field7692;
                return super.field7292;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7696[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!re", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4016(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 53);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!re", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4017(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 32;
                    break;
                case 1:
                    var10005 = 34;
                    break;
                case 2:
                    var10005 = 84;
                    break;
                case 3:
                    var10005 = 36;
                    break;
                default:
                    var10005 = 53;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
