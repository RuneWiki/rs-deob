import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class173 {

    @OriginalMember(owner = "client!dfa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2773 = new String[] { method1602(method1601("\u001f9Li")), method1602(method1601("\nb\u000e+h")), method1602(method1601("\u0015*A+VY")), method1602(method1601("\u0015*A+SY")), method1602(method1601("\u0015*A+TY")), method1602(method1601("\u0015*A+WY")), method1602(method1601("\u0015*A+PY")), method1602(method1601("\u0015*A+QY")) };

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "[I")
    public static int[] field2764 = new int[13];

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "Lvn;")
    public static class330 field2767 = new class330(35, 8);

    @OriginalMember(owner = "client!dfa", name = "k", descriptor = "[I")
    public static int[] field2768 = new int[3];

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "[I")
    public static int[] field2770 = new int[1];

    @OriginalMember(owner = "client!dfa", name = "g", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!dfa", name = "i", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!dfa", name = "e", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!dfa", name = "j", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!dfa", name = "h", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!dfa", name = "f", descriptor = "Lmo;")
    public static class783 field2772;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    public static final void method1595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            field2765++;
            if (arg3 == arg7) {
                class268.method2314(arg5, arg3, arg1, arg0, arg2, (byte) 80, arg6);
            } else {
                if ((arg2 - arg3) >= class546.field8030 && (arg2 + arg3) <= class779.field11374 && class310.field5088 <= arg0 - arg7 && arg0 + arg7 <= class478.field7264) {
                    class201.method1833(arg0, arg3, arg7, arg6, -121, arg1, arg5, arg2);
                } else {
                    class278.method2384(arg0, (byte) -114, arg7, arg5, arg1, arg2, arg6, arg3);
                }
                if (arg4 != -22692) {
                    field2770 = null;
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field2773[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZII)Lli;", line = 26)
    public static final class454 method1596(boolean arg0, int arg1, int arg2) {
        try {
            field2771++;
            if (arg1 != 13510) {
                field2764 = null;
            }
            long var3 = (long) (arg2 | (arg0 ? Integer.MIN_VALUE : 0));
            return (class454) class152.field2126.method737((byte) -39, var3);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2773[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIIIIII)I", line = 39)
    public static final int method1597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            int var10 = arg6 & 0x3;
            if ((arg0 & 0x1) == 1) {
                int var7 = arg4;
                arg4 = arg2;
                arg2 = var7;
            }
            field2769++;
            if (var10 == 0) {
                return arg1;
            } else if (var10 == 1) {
                return 7 - (arg3 + arg4 - 1);
            } else if (var10 == 2) {
                return 1 + 7 - arg2 - arg1;
            } else {
                if (arg5 != 23055) {
                    method1599((byte) -110, true, 76);
                }
                return arg3;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field2773[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BLha;)V", line = 72)
    public static final void method1598(byte arg0, class63 arg1) {
        try {
            if (arg0 > 40) {
                for (class92 var2 = (class92) class440.field6871.method749(0); var2 != null; var2 = (class92) class440.field6871.method747((byte) 21)) {
                    if (var2.field1362) {
                        var2.method899(arg1);
                    }
                }
                field2766++;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2773[2] + arg0 + ',' + (arg1 == null ? field2773[0] : field2773[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BZI)I", line = 104)
    public static final int method1599(byte arg0, boolean arg1, int arg2) {
        try {
            field2762++;
            if (arg1) {
                return 0;
            }
            class454 var3 = method1596(arg1, 13510, arg2);
            if (var3 == null) {
                return class374.field6073.method340(arg2, 74).field8817;
            }
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field7018.length; var5++) {
                if (var3.field7018[var5] == -1) {
                    var4++;
                }
            }
            if (arg0 == -53) {
                return var4 + class374.field6073.method340(arg2, arg0 ^ 0xFFFFFFD9).field8817 - var3.field7018.length;
            } else {
                return -27;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2773[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)V", line = 149)
    public static void method1600(int arg0) {
        try {
            field2764 = null;
            field2767 = null;
            field2770 = null;
            field2772 = null;
            if (arg0 == 7) {
                field2768 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2773[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1601(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x15);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1602(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 113;
                    break;
                case 1:
                    var10005 = 76;
                    break;
                case 2:
                    var10005 = 32;
                    break;
                case 3:
                    var10005 = 5;
                    break;
                default:
                    var10005 = 21;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
