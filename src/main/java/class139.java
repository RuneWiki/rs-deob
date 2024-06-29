import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class139 extends class332 {

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
    public int field1950 = -1;

    @OriginalMember(owner = "client!hu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1952 = new String[] { method1295(method1294("\te\n\u000f`")), method1295(method1294("\te\n\n`")), method1295(method1294("\u000feH'")), method1295(method1294("\u001a>\ne5")), method1295(method1294("\te\n\b`")), method1295(method1294("\te\n\t`")) };

    @OriginalMember(owner = "client!hu", name = "o", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!hu", name = "j", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "I")
    public int field1949;

    @OriginalMember(owner = "client!hu", name = "q", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!hu", name = "p", descriptor = "Ljava/lang/String;")
    public String field1945;

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "Ljava/lang/String;")
    public String field1948;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "(B)Lcda;", line = 3)
    public final class180 method1290(byte arg0) {
        try {
            if (arg0 >= -15) {
                return null;
            } else {
                ++field1946;
                return class788.field11516[super.field5437];
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1952[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IILha;IIIILuo;IIII)V", line = 18)
    public static final void method1291(int arg0, int arg1, class63 arg2, int arg3, int arg4, int arg5, int arg6, class603 arg7, int arg8, int arg9, int arg10, int arg11) {
        try {
            if (arg3 < arg8 && ~(arg3 + arg10) < ~arg8 && ~arg6 < ~(arg11 + -13) && arg6 < arg11 + 3) {
                arg1 = arg4;
            }
            ++field1951;
            String var12 = class558.method4112(arg7, 256);
            class461.field7108.method684(class475.field7238, arg3 + 3, arg1, var12, arg11, 0, 0, class714.field10323);
            if (arg9 >= -55) {
                method1291(15, -106, (class63) null, -43, -34, 8, 9, (class603) null, -112, 86, -84, 6);
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field1952[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1952[3] : field1952[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field1952[3] : field1952[2]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lmj;II)I", line = 42)
    public static final int method1292(class683 arg0, int arg1, int arg2) {
        try {
            ++field1944;
            if (arg2 != -1) {
                return 1;
            } else if (!client.method2695(arg0).method3479(-3979, arg1) && arg0.field9859 == null) {
                return -1;
            } else {
                return arg0.field9751 != null && ~arg1 > ~arg0.field9751.length ? arg0.field9751[arg1] : -1;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1952[5] + (arg0 != null ? field1952[3] : field1952[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I[Ljava/lang/String;I[II)V", line = 62)
    public static final void method1293(int arg0, String[] arg1, int arg2, int[] arg3, int arg4) {
        try {
            if (~arg4 > ~arg2) {
                int var5 = (arg2 + arg4) / 2;
                int var6 = arg4;
                String var7 = arg1[var5];
                arg1[var5] = arg1[arg2];
                arg1[arg2] = var7;
                int var8 = arg3[var5];
                arg3[var5] = arg3[arg2];
                arg3[arg2] = var8;
                for (int var9 = arg4; ~var9 > ~arg2; ++var9) {
                    if (var7 == null || arg1[var9] != null && ~arg1[var9].compareTo(var7) > ~(var9 & 1)) {
                        String var10 = arg1[var9];
                        arg1[var9] = arg1[var6];
                        arg1[var6] = var10;
                        int var11 = arg3[var9];
                        arg3[var9] = arg3[var6];
                        arg3[var6++] = var11;
                    }
                }
                arg1[arg2] = arg1[var6];
                arg1[var6] = var7;
                arg3[arg2] = arg3[var6];
                arg3[var6] = var8;
                method1293(24878, arg1, var6 - 1, arg3, arg4);
                method1293(arg0, arg1, arg2, arg3, var6 + 1);
            }
            if (arg0 != 24878) {
                method1292((class683) null, 117, -38);
            }
            ++field1947;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field1952[4] + arg0 + ',' + (arg1 != null ? field1952[3] : field1952[2]) + ',' + arg2 + ',' + (arg3 != null ? field1952[3] : field1952[2]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!hu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1294(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 72);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1295(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 97;
                    break;
                case 1:
                    var10005 = 16;
                    break;
                case 2:
                    var10005 = 36;
                    break;
                case 3:
                    var10005 = 75;
                    break;
                default:
                    var10005 = 72;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
