import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class364 extends class497 {

    @OriginalMember(owner = "client!co", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5285 = new String[] { method2899(method2898("A;o(U")), method2899(method2898("A;o/U")), method2899(method2898("A;o,U")), method2899(method2898("A;o.U")), method2899(method2898("A;o+U")), method2899(method2898("A;o*U")), method2899(method2898("A;o-U")), method2899(method2898("A;o!U")) };

    @OriginalMember(owner = "client!co", name = "j", descriptor = "Z")
    public static boolean field5276 = false;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "Ltf;")
    public static class524 field5278 = new class524();

    @OriginalMember(owner = "client!co", name = "m", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "Lwia;")
    public static class681 field5275;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(I)I", line = 9)
    public final int method2894(int arg0) {
        try {
            if (arg0 != 3) {
                return 35;
            } else {
                ++field5280;
                return super.field7292;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5285[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)I", line = 20)
    public final int method1032(int arg0) {
        try {
            if (arg0 >= -101) {
                field5278 = null;
            }
            ++field5277;
            return 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5285[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BI)I", line = 38)
    public final int method1029(byte arg0, int arg1) {
        try {
            ++field5281;
            if (arg0 != -73) {
                field5276 = false;
            }
            int var3 = super.field7293.method4675((byte) -92).method269(true);
            if (~var3 > -97) {
                return 3;
            } else if (arg1 > 1 && ~var3 > -129) {
                return 3;
            } else {
                return ~arg1 < -4 && ~var3 > -193 ? 3 : 1;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5285[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(ILpp;)V", line = 67)
    public class364(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(I)Z", line = 70)
    public final boolean method2895(int arg0) {
        try {
            ++field5284;
            int var2 = super.field7293.method4675((byte) -92).method269(true);
            if (arg0 >= -127) {
                this.method2895(-126);
            }
            return ~var2 <= -97;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5285[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lpp;)V", line = 89)
    public class364(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!co", name = "e", descriptor = "(I)V", line = 92)
    public static void method2896(int arg0) {
        try {
            field5278 = null;
            if (arg0 != -97) {
                field5276 = false;
            }
            field5275 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5285[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V", line = 103)
    public final void method1030(int arg0, int arg1) {
        try {
            super.field7292 = arg1;
            ++field5279;
            if (arg0 != 64) {
                method2896(81);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5285[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V", line = 115)
    public static final void method2897(int arg0) {
        try {
            class385.field5626 = null;
            class602.field8638 = null;
            class501.field7322 = null;
            ++field5282;
            class716.field10200 = null;
            class732.field10451 = null;
            class608.field8719 = null;
            class137.field1766 = null;
            class108.field1416 = null;
            if (arg0 != 3) {
                method2897(8);
            }
            class342.field4978 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5285[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V", line = 134)
    public final void method1031(byte arg0) {
        try {
            ++field5283;
            int var2 = super.field7293.method4675((byte) -126).method269(true);
            if (~var2 > -97) {
                super.field7292 = 0;
            }
            if (arg0 >= -70) {
                field5278 = null;
            }
            if (~super.field7292 < -2 && var2 < 128) {
                super.field7292 = 1;
            }
            if (super.field7292 > 2 && ~var2 > -193) {
                super.field7292 = 2;
            }
            if (super.field7292 < 0 || ~super.field7292 < -4) {
                super.field7292 = this.method1032(-121);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5285[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!co", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2898(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 125);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!co", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2899(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 34;
                    break;
                case 1:
                    var10005 = 84;
                    break;
                case 2:
                    var10005 = 65;
                    break;
                case 3:
                    var10005 = 105;
                    break;
                default:
                    var10005 = 125;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
