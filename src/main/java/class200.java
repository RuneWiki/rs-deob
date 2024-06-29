import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class200 {

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3166 = new String[] { method1829(method1828("e[ALY")), method1829(method1828("`E\u0003a")), method1829(method1828("u\u001eA#\f")), method1829(method1828("e[ANY")), method1829(method1828("e[AHY")), method1829(method1828("e[AIY")), method1829(method1828("e[AOY")) };

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "Z")
    public static boolean field3163 = false;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "Lgda;")
    public static class58 field3160;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "[I")
    public static int[] field3161;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V", line = 3)
    public static void method1823(int arg0) {
        try {
            field3161 = null;
            field3160 = null;
            if (arg0 != 20314) {
                field3161 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3166[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z[B)V", line = 14)
    public static final synchronized void method1824(boolean arg0, byte[] arg1) {
        try {
            field3159++;
            if (arg1.length == 100 && class480.field7302 < 1000) {
                class26.field287[class480.field7302++] = arg1;
            } else if (arg1.length == 5000 && class660.field9421 < 250) {
                class289.field4656[class660.field9421++] = arg1;
            } else if (arg1.length == 30000 && class321.field5226 < 50) {
                class68.field969[class321.field5226++] = arg1;
            } else {
                if (class251.field3844 != null) {
                    for (int var2 = 0; var2 < class693.field9979.length; var2++) {
                        if (class693.field9979[var2] == arg1.length && class268.field4327[var2] < class251.field3844[var2].length) {
                            class251.field3844[var2][class268.field4327[var2]++] = arg1;
                            return;
                        }
                    }
                }
                if (arg0) {
                    field3160 = null;
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3166[3] + arg0 + ',' + (arg1 == null ? field3166[1] : field3166[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[B", line = 66)
    public static final synchronized byte[] method1825(int arg0, int arg1) {
        try {
            field3165++;
            if (arg0 == 100 && class480.field7302 > 0) {
                byte[] var2 = class26.field287[--class480.field7302];
                class26.field287[class480.field7302] = null;
                return var2;
            } else if (arg0 == 5000 && class660.field9421 > 0) {
                byte[] var3 = class289.field4656[--class660.field9421];
                class289.field4656[class660.field9421] = null;
                return var3;
            } else if (arg0 == 30000 && class321.field5226 > 0) {
                byte[] var4 = class68.field969[--class321.field5226];
                class68.field969[class321.field5226] = null;
                return var4;
            } else {
                if (arg1 != -251) {
                    method1825(-22, -79);
                }
                if (class251.field3844 != null) {
                    for (int var5 = 0; var5 < class693.field9979.length; var5++) {
                        if (class693.field9979[var5] == arg0 && class268.field4327[var5] > 0) {
                            byte[] var6 = class251.field3844[var5][--class268.field4327[var5]];
                            class251.field3844[var5][class268.field4327[var5]] = null;
                            return var6;
                        }
                    }
                }
                return new byte[arg0];
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field3166[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)Lmj;", line = 131)
    public static final class683 method1826(boolean arg0, int arg1) {
        try {
            field3162++;
            int var2 = arg1 >> 16;
            if (!arg0) {
                method1827(true, -33, null, null, 38);
            }
            int var3 = arg1 & 0xFFFF;
            if (class309.field5028[var2] == null || class309.field5028[var2][var3] == null) {
                boolean var4 = class504.method3798(127, var2);
                if (!var4) {
                    return null;
                }
            }
            return class309.field5028[var2][var3];
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3166[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;I)V", line = 162)
    public static final void method1827(boolean arg0, int arg1, String arg2, String arg3, int arg4) {
        try {
            if (arg1 >= 107) {
                class656.method4783(-1, arg0, arg2, 125, true, arg4, arg3);
                field3164++;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3166[0] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3166[1] : field3166[2]) + ',' + (arg3 == null ? field3166[1] : field3166[2]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1828(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x71);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1829(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 14;
                    break;
                case 1:
                    var10005 = 48;
                    break;
                case 2:
                    var10005 = 111;
                    break;
                case 3:
                    var10005 = 13;
                    break;
                default:
                    var10005 = 113;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
