import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class92 extends class326 {

    @OriginalMember(owner = "client!ho", name = "Q", descriptor = "I")
    public static int field1352 = 1338;

    @OriginalMember(owner = "client!ho", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field1353 = new String[100];

    @OriginalMember(owner = "client!ho", name = "S", descriptor = "Lbc;")
    public static class225 field1354 = new class225("", 14);

    @OriginalMember(owner = "client!ho", name = "U", descriptor = "I")
    public static int field1356 = -1;

    @OriginalMember(owner = "client!ho", name = "N", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!ho", name = "O", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!ho", name = "P", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!ho", name = "T", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "([Ljava/lang/String;I[S)V", line = 8)
    public static final void method586(String[] arg0, int arg1, short[] arg2) {
        class486.method2822(arg2, true, 0, arg0.length + -1, arg0);
        ++field1351;
        if (arg1 < 86) {
            method587(54);
        }
    }

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "(I)V", line = 19)
    public static void method587(int arg0) {
        field1354 = null;
        if (arg0 != -30710) {
            field1356 = -63;
        }
        field1353 = null;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BIC)C", line = 30)
    public static final char method588(byte arg0, int arg1, char arg2) {
        ++field1349;
        if (arg0 != 120) {
            return (char) 65420;
        } else {
            if (arg2 >= 192 && ~arg2 >= -256) {
                if (~arg2 <= -193 && ~arg2 >= -199) {
                    return 'A';
                }
                if (~arg2 == -200) {
                    return 'C';
                }
                if (arg2 >= 200 && arg2 <= 203) {
                    return 'E';
                }
                if (arg2 >= 204 && ~arg2 >= -208) {
                    return 'I';
                }
                if (arg2 == 209 && arg1 != 0) {
                    return 'N';
                }
                if (~arg2 <= -211 && ~arg2 >= -215) {
                    return 'O';
                }
                if (~arg2 <= -218 && ~arg2 >= -221) {
                    return 'U';
                }
                if (arg2 == 221) {
                    return 'Y';
                }
                if (arg2 == 223) {
                    return 's';
                }
                if (arg2 >= 224 && arg2 <= 230) {
                    return 'a';
                }
                if (arg2 == 231) {
                    return 'c';
                }
                if (arg2 >= 232 && ~arg2 >= -236) {
                    return 'e';
                }
                if (~arg2 <= -237 && ~arg2 >= -240) {
                    return 'i';
                }
                if (~arg2 == -242 && ~arg1 != -1) {
                    return 'n';
                }
                if (~arg2 <= -243 && arg2 <= 246) {
                    return 'o';
                }
                if (~arg2 <= -250 && arg2 <= 252) {
                    return 'u';
                }
                if (~arg2 == -254 || arg2 == 255) {
                    return 'y';
                }
            }
            if (~arg2 == -339) {
                return 'O';
            } else if (~arg2 == -340) {
                return 'o';
            } else if (~arg2 == -377) {
                return 'Y';
            } else {
                return arg2;
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BI)[I", line = 119)
    public final int[] method30(byte arg0, int arg1) {
        if (arg0 > -6) {
            field1353 = null;
        }
        ++field1355;
        int[] var3 = super.field4344.method130(arg1, 100);
        if (super.field4344.field286) {
            class380.method2337(var3, 0, class181.field2495, class95.field1400[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 143)
    public static final String method589(int arg0, String arg1) {
        if (arg0 <= 25) {
            return null;
        } else {
            ++field1350;
            if (arg1 == null) {
                return null;
            } else {
                int var2 = 0;
                int var3 = arg1.length();
                while (var3 > var2 && class327.method1829(arg1.charAt(var2), false)) {
                    ++var2;
                }
                while (var2 < var3 && class327.method1829(arg1.charAt(var3 + -1), false)) {
                    --var3;
                }
                int var4 = -var2 + var3;
                if (var4 >= 1 && var4 <= 12) {
                    StringBuffer var5 = new StringBuffer(var4);
                    for (int var6 = var2; var3 > var6; ++var6) {
                        char var7 = arg1.charAt(var6);
                        if (class130.method796(var7, (byte) -98)) {
                            char var8 = class342.method1937(var7, (byte) -105);
                            if (var8 != 0) {
                                var5.append(var8);
                            }
                        }
                    }
                    if (var5.length() == 0) {
                        return null;
                    } else {
                        return var5.toString();
                    }
                } else {
                    return null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V", line = 200)
    public class92() {
        super(0, true);
    }
}
