import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class441 extends class182 {

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6891 = new String[] { method3461(method3460("1+\b\u001e3")), method3461(method3460("1+\b\u001b3")), method3461(method3460("1+\b\u001f3")), method3461(method3460("\u00163P;w69\u0006(z;4^`")), method3461(method3460("1+\b\u00193")), method3461(method3460("$s\btf")), method3461(method3460("1(J6")), method3461(method3460("1+\b\u00183")), method3461(method3460("1+\b\u001c3")) };

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "I")
    public static int field6878;

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!nv", name = "t", descriptor = "I")
    public int field6880;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
    public int field6881;

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "I")
    public int field6883;

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "I")
    public int field6885;

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "I")
    public int field6888;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "I")
    public int field6889;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "Ljava/lang/String;")
    public String field6886;

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "Z")
    public static boolean field6882;

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "[[Z")
    public static boolean[][] field6890;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(II[J[II)V", line = 7)
    public static final void method3454(int arg0, int arg1, long[] arg2, int[] arg3, int arg4) {
        try {
            if (arg1 < arg4) {
                int var5 = (arg1 + arg4) / 2;
                int var6 = arg1;
                long var7 = arg2[var5];
                arg2[var5] = arg2[arg4];
                arg2[arg4] = var7;
                int var9 = arg3[var5];
                arg3[var5] = arg3[arg4];
                arg3[arg4] = var9;
                int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
                for (int var11 = arg1; var11 < arg4; var11++) {
                    if ((long) (var11 & var10) + var7 > arg2[var11]) {
                        long var12 = arg2[var11];
                        arg2[var11] = arg2[var6];
                        arg2[var6] = var12;
                        int var14 = arg3[var11];
                        arg3[var11] = arg3[var6];
                        arg3[var6++] = var14;
                    }
                }
                arg2[arg4] = arg2[var6];
                arg2[var6] = var7;
                arg3[arg4] = arg3[var6];
                arg3[var6] = var9;
                method3454(29529, arg1, arg2, arg3, var6 - 1);
                method3454(29529, var6 + 1, arg2, arg3, arg4);
            }
            field6887++;
            if (arg0 != 29529) {
                field6882 = true;
            }
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field6891[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6891[6] : field6891[5]) + ',' + (arg3 == null ? field6891[6] : field6891[5]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(III)Z", line = 63)
    public static final boolean method3455(int arg0, int arg1, int arg2) {
        try {
            if (arg2 == 55) {
                field6878++;
                return class625.method4565(arg1, arg2 ^ 0x5689, arg0) || class574.method4220(arg1, arg0, 110);
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6891[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V", line = 78)
    public static void method3456(int arg0) {
        try {
            if (arg0 != 0) {
                field6882 = false;
            }
            field6890 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6891[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 89)
    public static final int method3457(boolean arg0, String arg1) {
        try {
            if (arg0) {
                field6877++;
                return class184.method1732(10, arg1, 14, true);
            } else {
                return -103;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6891[7] + arg0 + ',' + (arg1 == null ? field6891[6] : field6891[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZII)Ljava/lang/String;", line = 101)
    public static final String method3458(int arg0, boolean arg1, int arg2, int arg3) {
        try {
            field6884++;
            if (arg2 < 2 || arg2 > 36) {
                throw new IllegalArgumentException(field6891[3] + arg2);
            } else if (arg1 && arg0 >= 0) {
                int var4 = 2;
                int var5 = arg0 / arg2;
                while (var5 != 0) {
                    var5 /= arg2;
                    var4++;
                }
                if (arg3 != 87) {
                    return null;
                }
                char[] var6 = new char[var4];
                var6[0] = '+';
                for (int var7 = var4 - 1; var7 > 0; var7--) {
                    int var8 = arg0;
                    arg0 /= arg2;
                    int var9 = var8 - (arg0 * arg2);
                    if (var9 < 10) {
                        var6[var7] = (char) (var9 + 48);
                    } else {
                        var6[var7] = (char) (var9 + 87);
                    }
                }
                return new String(var6);
            } else {
                return Integer.toString(arg0, arg2);
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field6891[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(III)Z", line = 150)
    public static final boolean method3459(int arg0, int arg1, int arg2) {
        try {
            if (arg1 != 55) {
                field6882 = true;
            }
            field6879++;
            return (arg2 & 0x800) != 0 && (arg0 & 0x37) != 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6891[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3460(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3461(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 95;
                    break;
                case 1:
                    var10005 = 93;
                    break;
                case 2:
                    var10005 = 38;
                    break;
                case 3:
                    var10005 = 90;
                    break;
                default:
                    var10005 = 27;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
