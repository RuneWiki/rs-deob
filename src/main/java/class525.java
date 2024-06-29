import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class525 extends class568 {

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "Ljava/lang/String;")
    public String field7740;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7745 = new String[] { method3928(method3927("0$N\rP")), method3928(method3927("0$Nw\u0011.$\u0014uP")), method3928(method3927(".8\f'")), method3928(method3927(";cNe\u0005")), method3928(method3927("0$N\u000fP")), method3928(method3927("0$N\bP")), method3928(method3927("m`M.\u0016$*\u0010;Um`")), method3928(method3927("`=\u0013\"\u0002%w")), method3928(method3927("'=\tzX0\"\u0013q")), method3928(method3927("0$N\nP")), method3928(method3927("0$N\tP")), method3928(method3927("0$N\u000eP")) };

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "Lhl;")
    public static class556 field7742 = new class556(73, -1);

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field7738;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field7741;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public static int field7743;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public static int field7744;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BILrv;)V")
    public static final void method3921(byte arg0, int arg1, class117 arg2) {
        try {
            class133.field1893 = 0;
            field7744++;
            class444.field6917 = false;
            class442.method3464(arg2, -26);
            class30.method319(arg2, 29838);
            if (class444.field6917) {
                System.out.println(field7745[6]);
            }
            if (arg2.field2799 != arg1) {
                throw new RuntimeException(field7745[8] + arg2.field2799 + field7745[7] + arg1);
            }
            int var3 = -3 / ((arg0 + 35) / 61);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7745[9] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7745[2] : field7745[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IJ)V")
    public static final void method3922(int arg0, long arg1) {
        try {
            if (class85.field1280 != null) {
                if (class401.field6334 == 1 || class401.field6334 == 5) {
                    class186.method1749(false, arg1);
                } else if (class401.field6334 == 4) {
                    class590.method4336(320, arg1);
                }
            }
            field7741++;
            class476.method3643(class662.field9437, false, (long) class431.field6776);
            if (class317.field5175 != -1) {
                class764.method5511(99, class317.field5175);
            }
            for (int var3 = 0; var3 < class313.field5119; var3++) {
                if (class178.field2871[var3]) {
                    class370.field5996[var3] = true;
                }
                class37.field424[var3] = class178.field2871[var3];
                class178.field2871[var3] = false;
            }
            class74.field1064 = class431.field6776;
            class259.method2179(~arg0, null, -1, -1);
            class340.method2863(-1, null, (byte) -89, -1);
            if (class317.field5175 != -1) {
                class313.field5119 = 0;
                class449.method3499((byte) -2);
            }
            class662.field9437.method227();
            class170.method1577(-109, class662.field9437);
            int var4 = class728.method5282(arg0 + 4);
            if (var4 == -1) {
                var4 = class561.field8156;
            }
            if (arg0 == var4) {
                var4 = class550.field8064;
            }
            class516.method3869((byte) -95, var4);
            int var5 = class438.field6846.method804(true) << 8;
            class545.method4050(class778.field11350, class438.field6846.field9983 + var5, class438.field6846.field9975, 3, class438.field6846.field9985 + var5);
            class778.field11350 = 0;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field7745[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(IIB)I")
    public static final int method3923(int arg0, int arg1, byte arg2) {
        try {
            field7743++;
            if (arg1 == -2) {
                return 12345678;
            } else if (arg1 == -1) {
                if (arg0 < 2) {
                    arg0 = 2;
                } else if (arg0 > 126) {
                    arg0 = 126;
                }
                return arg0;
            } else {
                arg0 = (arg1 & 0x7F) * arg0 >> 7;
                if (arg2 > -103) {
                    return 88;
                }
                if (arg0 < 2) {
                    arg0 = 2;
                } else if (arg0 > 126) {
                    arg0 = 126;
                }
                return (arg1 & 0xFF80) + arg0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7745[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)V")
    public static final void method3924(int arg0, int arg1) {
        try {
            class32.field389 = 0;
            class458.field7069 = arg0;
            class516.field7614 = 1;
            class787.field11509 = null;
            class785.field11466 = -1;
            class550.field8070 = null;
            class328.field5391 = arg1;
            field7738++;
            class60.field780 = false;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7745[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
    public class525() {
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class525(String arg0) {
        try {
            this.field7740 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7745[1] + (arg0 == null ? field7745[2] : field7745[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3925(int arg0, int arg1, byte arg2) {
        try {
            if (arg2 != -4) {
                field7742 = null;
            }
            field7739++;
            return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7745[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static void method3926(int arg0) {
        try {
            field7742 = null;
            if (arg0 != 6300) {
                method3922(-109, -103L);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7745[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3927(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x78);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3928(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 64;
                    break;
                case 1:
                    var10005 = 77;
                    break;
                case 2:
                    var10005 = 96;
                    break;
                case 3:
                    var10005 = 75;
                    break;
                default:
                    var10005 = 120;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
