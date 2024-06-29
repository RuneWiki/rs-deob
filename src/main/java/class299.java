import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class299 extends class497 {

    @OriginalMember(owner = "client!ou", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4176 = new String[] { method2400(method2399("ND\u000b\u00142")), method2400(method2399("ND\u000b\u00182")), method2400(method2399("ND\u000b\u001e2")), method2400(method2399("ND\u000b\u001a2")), method2400(method2399("ND\u000b\u001f2")), method2400(method2399("ND\u000b\u001d2")), method2400(method2399("ND\u000b\u00192")), method2400(method2399("ND\u000b\u001b2")) };

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "Z")
    public static boolean field4169 = false;

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "Lsb;")
    public static class261 field4172 = new class261(107, 5);

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!ou", name = "i", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "Lqia;")
    public static class532 field4174;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(BI)I")
    public final int method1029(byte arg0, int arg1) {
        try {
            ++field4165;
            if (super.field7293.method4677(17)) {
                return 3;
            } else {
                if (arg0 != -73) {
                    this.method2398(-23);
                }
                if (super.field7293.method4684(arg0 ^ -65) == class378.field5530) {
                    if (arg1 == 0) {
                        if (super.field7293.field9114.method5345(arg0 + 76) == 1) {
                            return 2;
                        }
                        if (super.field7293.field9092.method2151(3) == 1) {
                            return 2;
                        }
                        if (super.field7293.field9105.method1260(arg0 ^ -76) > 0) {
                            return 2;
                        }
                    }
                    return 1;
                } else {
                    return 3;
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4176[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IBII)V")
    public static final void method2395(int arg0, byte arg1, int arg2, int arg3) {
        try {
            ++field4170;
            if (class591.field8499 != arg2 || class641.field9143 != arg0 || class263.field3715 != arg3) {
                class710.field9925 = true;
                class263.field3715 = arg3;
                class591.field8499 = arg2;
                class641.field9143 = arg0;
                double var4 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
                double var6 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
                double var8 = Math.cos(var6);
                double var10 = Math.sin(var6);
                double var12 = Math.cos(var4);
                double var14 = Math.sin(var4);
                class191.field2534 = var10 * var14;
                class398.field5792 = -var8 * var14;
                class378.field5528 = 0.0D;
                class232.field3351 = -var10 * var12;
                class167.field2138 = var8;
                class497.field7289 = var8 * var12;
                class285.field4013 = var10;
                int var16 = -13 % ((-52 - arg1) / 48);
                class531.field7697 = var14;
                class596.field8567 = var12;
            }
        } catch (RuntimeException var18) {
            throw class665.method4799(var18, field4176[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lpp;)V")
    public class299(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
    public static void method2396(int arg0) {
        try {
            field4174 = null;
            int var1 = 76 / ((arg0 - 56) / 55);
            field4172 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4176[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)Z")
    public final boolean method2397(int arg0) {
        try {
            ++field4171;
            if (arg0 >= -127) {
                return false;
            } else if (super.field7293.method4677(83)) {
                return false;
            } else {
                return super.field7293.method4684(8) == class378.field5530;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4176[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "(I)I")
    public final int method2398(int arg0) {
        try {
            if (arg0 != 3) {
                return -114;
            } else {
                ++field4173;
                return super.field7292;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4176[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(ILpp;)V")
    public class299(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V")
    public final void method1031(byte arg0) {
        try {
            if (arg0 >= -70) {
                this.method1029((byte) -52, 57);
            }
            ++field4167;
            if (super.field7293.method4684(8) == class378.field5530) {
                if (super.field7293.method4677(60)) {
                    super.field7292 = 0;
                }
            } else {
                super.field7292 = 1;
            }
            if (~super.field7292 != -1 && super.field7292 != 1) {
                super.field7292 = this.method1032(-102);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4176[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)I")
    public final int method1032(int arg0) {
        try {
            ++field4168;
            return arg0 > -101 ? -14 : 1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4176[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)V")
    public final void method1030(int arg0, int arg1) {
        try {
            super.field7292 = arg1;
            if (arg0 == 64) {
                ++field4166;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4176[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ou", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2399(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 26);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ou", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2400(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 33;
                    break;
                case 1:
                    var10005 = 49;
                    break;
                case 2:
                    var10005 = 37;
                    break;
                case 3:
                    var10005 = 92;
                    break;
                default:
                    var10005 = 26;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
