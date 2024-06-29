import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class521 extends class160 {

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    private int field7609;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    private int field7605;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    private int field7603;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    private int field7596;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    private int field7604;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    private int field7597;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    private int field7601;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    private int field7600;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7611 = new String[] { method3965(method3964("\u0017Y3a*")), method3965(method3964("\u0017Y3\u0019k\u0015Yi\u001b*")), method3965(method3964("\u0015EqI")), method3965(method3964("\u0000\u001e3\u000b\u007f")), method3965(method3964("\u0017Y3m*")), method3965(method3964("3YyAg\u0015\u001dhVg")), method3965(method3964("\u0017Y3`*")), method3965(method3964("\u0017Y3c*")), method3965(method3964("\u0017Y3g*")), method3965(method3964("\u0017Y3f*")), method3965(method3964("\u0017Y3b*")) };

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public static int field7610;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "Llga;")
    public static class47 field7602;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "[I")
    public static int[] field7608;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V", line = 5)
    public static void method3960(int arg0) {
        try {
            field7602 = null;
            field7608 = null;
            if (arg0 <= 8) {
                field7608 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7611[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(III)Z", line = 18)
    public static final boolean method3961(int arg0, int arg1, int arg2) {
        try {
            ++field7610;
            if (arg2 != -22312) {
                field7608 = null;
            }
            return ~(arg0 & 393216) != -1 | class585.method4329(0, arg1, arg0) || class355.method2841(false, arg1, arg0);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7611[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(III)V", line = 30)
    public final void method1350(int arg0, int arg1, int arg2) {
        try {
            ++field7598;
            if (arg1 != 5781) {
                this.method1348(-28, -15, (byte) 96);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7611[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILvo;)Ljava/lang/String;", line = 43)
    public static final String method3962(int arg0, class782 arg1) {
        try {
            ++field7599;
            if (~client.method4957(arg1).method1188(arg0 ^ 1) == -1) {
                return null;
            } else if (arg1.field11209 != null && ~arg1.field11209.trim().length() != -1) {
                if (arg0 != 0) {
                    method3962(-107, (class782) null);
                }
                return arg1.field11209;
            } else {
                return class556.field8095 ? field7611[5] : null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7611[4] + arg0 + ',' + (arg1 != null ? field7611[3] : field7611[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 68)
    public class521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        try {
            this.field7609 = arg4;
            this.field7605 = arg6;
            this.field7603 = arg3;
            this.field7596 = arg7;
            this.field7604 = arg0;
            this.field7597 = arg1;
            this.field7601 = arg2;
            this.field7600 = arg5;
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field7611[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIB)V", line = 85)
    public final void method1348(int arg0, int arg1, byte arg2) {
        try {
            ++field7595;
            if (arg2 <= 13) {
                this.field7596 = 77;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7611[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 97)
    public static final boolean method3963(String arg0, int arg1) {
        try {
            ++field7607;
            if (arg1 != -1) {
                return false;
            } else if (arg0 == null) {
                return false;
            } else {
                for (int var2 = 0; class210.field3062 > var2; ++var2) {
                    if (arg0.equalsIgnoreCase(class591.field8497[var2])) {
                        return true;
                    }
                }
                return arg0.equalsIgnoreCase(class203.field2988.field4905);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7611[6] + (arg0 != null ? field7611[3] : field7611[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V", line = 130)
    public final void method1349(int arg0, int arg1, int arg2) {
        try {
            ++field7606;
            int var4 = this.field7604 * arg1 >> 12;
            int var5 = this.field7597 * arg2 >> 12;
            int var6 = this.field7601 * arg1 >> 12;
            int var7 = this.field7603 * arg2 >> 12;
            if (arg0 != 3289650) {
                field7608 = null;
            }
            int var8 = this.field7609 * arg1 >> 12;
            int var9 = this.field7600 * arg2 >> 12;
            int var10 = this.field7605 * arg1 >> 12;
            int var11 = this.field7596 * arg2 >> 12;
            class101.method987((byte) -16, super.field2049, var5, var7, var10, var4, var8, var6, var11, var9);
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field7611[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!li", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3964(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 2);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!li", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3965(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 123;
                    break;
                case 1:
                    var10005 = 48;
                    break;
                case 2:
                    var10005 = 29;
                    break;
                case 3:
                    var10005 = 37;
                    break;
                default:
                    var10005 = 2;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
