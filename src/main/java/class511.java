import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class511 extends class497 {

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7508 = new String[] { method3904(method3903("_lL4\u0002")), method3904(method3903("_lL>\u0002")), method3904(method3903("_lL:\u0002")), method3904(method3903("_lL9\u0002")), method3904(method3903("_lL=\u0002")), method3904(method3903("_lL8\u0002")), method3904(method3903("_lL;\u0002")), method3904(method3903("_lL?\u0002")) };

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field7506 = 0;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "Lui;")
    public static class251 field7499 = new class251(8);

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "[[S")
    public static short[][] field7497;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)I", line = 6)
    public final int method1029(byte arg0, int arg1) {
        try {
            ++field7500;
            if (super.field7293.method4677(arg0 ^ -82)) {
                return 3;
            } else {
                if (arg0 != -73) {
                    field7497 = null;
                }
                return super.field7293.method4684(arg0 + 81) == class378.field5530 ? 1 : 3;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7508[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(II)V", line = 25)
    public static final void method3899(int arg0, int arg1) {
        try {
            ++field7502;
            if (~class559.field8139 == -8) {
                if (~class561.field8167 == -1 && class189.field2516 == 0) {
                    class139.field1812 = arg0;
                    class699.method5035(9, 31754);
                    if (arg1 != 9752) {
                        method3899(-49, 62);
                    }
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7508[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lpp;)V", line = 47)
    public class511(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)I", line = 50)
    public final int method3900(int arg0) {
        try {
            if (arg0 != 3) {
                return -83;
            } else {
                ++field7505;
                return super.field7292;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7508[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V", line = 61)
    public final void method1031(byte arg0) {
        try {
            if (super.field7293.method4684(8) != class378.field5530) {
                super.field7292 = 1;
            } else if (super.field7293.method4677(125)) {
                super.field7292 = 0;
            }
            ++field7504;
            if (arg0 > -70) {
                field7507 = 94;
            }
            if (super.field7292 != 0 && super.field7292 != 1) {
                super.field7292 = this.method1032(-124);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7508[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(ILpp;)V", line = 84)
    public class511(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)V", line = 89)
    public static void method3901(int arg0) {
        try {
            if (arg0 != 3) {
                method3901(62);
            }
            field7499 = null;
            field7497 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7508[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)Z", line = 100)
    public final boolean method3902(int arg0) {
        try {
            if (arg0 >= -127) {
                return true;
            } else {
                ++field7501;
                if (super.field7293.method4677(43)) {
                    return false;
                } else {
                    return super.field7293.method4684(8) == class378.field5530;
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7508[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V", line = 118)
    public final void method1030(int arg0, int arg1) {
        try {
            super.field7292 = arg1;
            ++field7498;
            if (arg0 != 64) {
                this.method1029((byte) 122, -85);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7508[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)I", line = 131)
    public final int method1032(int arg0) {
        try {
            ++field7503;
            if (arg0 >= -101) {
                this.method1029((byte) -33, -98);
            }
            return 1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7508[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3903(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 42);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3904(char[] arg0) {
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
                    var10005 = 11;
                    break;
                case 2:
                    var10005 = 98;
                    break;
                case 3:
                    var10005 = 124;
                    break;
                default:
                    var10005 = 42;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
