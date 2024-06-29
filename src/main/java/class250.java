import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class250 {

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public int field3568;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3576 = new String[] { method2037(method2036("]t\u001efa")), method2037(method2036("\u00181\u000e\u0007")), method2037(method2036("]t\u001eba")), method2037(method2036("]t\u001eea")), method2037(method2036("N2\u001e\t4")), method2037(method2036("]t\u001eca")), method2037(method2036("[i\\K")), method2037(method2036("]t\u001eS&fhBN'R4")), method2037(method2036("]t\u001e\u001b [uD\u0019a")), method2037(method2036("]t\u001eda")) };

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Lmv;")
    public static class125 field3567 = new class125(36, 8);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "[I")
    public static int[] field3575 = new int[2];

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "[I")
    public static int[] field3572;

    @OriginalMember(owner = "client!hh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field3574++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3576[7] + ')');
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V")
    public static final void method2031(int arg0, boolean arg1) {
        try {
            field3569++;
            if (arg0 != 5) {
                method2033(-70, -5);
            }
            if (class273.field3877.length() != 0) {
                class11.method74(field3576[1] + class273.field3877, (byte) 61);
                class782.method5623(false, class273.field3877, -1937106807, arg1);
                class354.field5135 = 0;
                if (!arg1) {
                    class273.field3877 = "";
                    class26.field326 = 0;
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3576[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static void method2032(byte arg0) {
        try {
            if (arg0 > 39) {
                field3575 = null;
                field3572 = null;
                field3567 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3576[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(I)V")
    public class250(int arg0) {
        try {
            this.field3568 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3576[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)I")
    public static final int method2033(int arg0, int arg1) {
        try {
            field3566++;
            if (arg0 == 16711935) {
                return -1;
            } else {
                if (arg1 != 28317) {
                    field3575 = null;
                }
                return class238.method1971(-63, arg0);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3576[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
    public static final void method2034(byte arg0) {
        try {
            field3571++;
            class577.method4287(69);
            int var1 = -3 % ((-arg0 - 72) / 54);
            class635.method4633(115);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3576[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lvo;Z)V")
    public static final void method2035(class782 arg0, boolean arg1) {
        try {
            if (!arg1) {
                field3573++;
                if (class340.field4956 == arg0.field11219) {
                    if (class203.field2988.field4905 == null) {
                        arg0.field11124 = 0;
                        arg0.field11213 = 0;
                    } else {
                        arg0.field11181 = 150;
                        arg0.field11266 = (int) (Math.sin((double) class694.field9700 / 40.0D) * 256.0D) & 0x7FF;
                        arg0.field11147 = 5;
                        arg0.field11213 = class241.field3470;
                        arg0.field11124 = class6.method39(class203.field2988.field4905, true);
                        class84 var2 = class203.field2988.field2182;
                        if (var2 == null) {
                            arg0.field11183 = null;
                        } else {
                            if (arg0.field11183 == null) {
                                arg0.field11183 = new class238();
                            }
                            arg0.field11294 = var2.method837(-110);
                            arg0.field11183.method831(0, var2);
                        }
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3576[5] + (arg0 == null ? field3576[6] : field3576[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2036(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x49);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2037(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 53;
                    break;
                case 1:
                    var10005 = 28;
                    break;
                case 2:
                    var10005 = 48;
                    break;
                case 3:
                    var10005 = 39;
                    break;
                default:
                    var10005 = 73;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
