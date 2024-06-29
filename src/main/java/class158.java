import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class158 extends class421 {

    @OriginalMember(owner = "client!od", name = "o", descriptor = "[I")
    public int[] field1987;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "[I")
    public int[] field1988;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "[I")
    public static int[] field1994 = new int[] { 0, 2, 0, 6, 0, 14, 0, 15, 0, 7, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 7, 12, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 6, 0, 0, 0, 6, 0, 0, 2, 0, -2, -1, 6, 0, -1, 3, 0, 0, -1, 0, 0, 9, 0, 0, 20, 0, 0, 0, 0, -1, 8, 0, 8, 0, 0, 5, 4, 0, 0, 0, 1, 0, -2, 0, -2, 7, 11, 0, 0, 0, 3, 0, 0, 0, 6, 0, 14, 10, 0, 4, 0, 0, -1, 0, 0, -1, 0, -2, 8, 2, 0, 0, 0, 0, 0, 0, 3, 0, 0, 8, 0, 8, -2, 0, -1, 0, 6, 1, 0, -2, 28, 0, 6, 0, 10, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -2, -2, 0, 0, 3, 0, 0, 2, 2, 12, 0, -1, 0, -2, 0, 0, 0, 0, 0, 0, 8, 0, -1, 15, 0, -1, 3, 0, 0, 0, 0, 3, 12, 10, -1, 0, 0, 12, 0, -2, 0, -1, 0, 17, 0, 0, 6, 0, -1, 0, 0, 0, 0, 8, 0, 2, 3, 5, 0, 4, 0, 0, 7, 5, -2, 6, -2, 0, 0, 0, 12, 0, 6, 8, 0, 2, 2, 0, 8, -1, -1, 5, 0, 0, 0, 0, 4, -1, 0, -1, 0, 0, 6, 0, 0, 0, 6, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, -2, 0, 0 };

    @OriginalMember(owner = "client!od", name = "u", descriptor = "Lkb;")
    public static class351 field1993 = class227.method1479(7);

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "[[[B")
    public static byte[][][] field1996;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Lrr;", line = 5)
    public static final class184 method1049(int arg0, int arg1) {
        field1992++;
        if (class322.field4797 && class269.field3988 <= arg0 && arg0 <= class373.field5498) {
            if (arg1 != -21426) {
                method1050((String) null, (byte) 44);
            }
            return class53.field823[arg0 - class269.field3988];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 20)
    public static final void method1050(String arg0, byte arg1) {
        field1991++;
        class129.field1697 = arg0;
        if (class63.field948.field5381 == null) {
            return;
        }
        try {
            String var2 = class63.field948.field5381.getParameter("cookieprefix");
            String var3 = class63.field948.field5381.getParameter("cookiehost");
            if (arg1 != -20) {
                method1051(77);
            }
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class312.method2054(-125, class98.method768((byte) 112) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class177.method1172("document.cookie=\"" + var5 + "\"", class63.field948.field5381, (byte) -128);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 56)
    public static void method1051(int arg0) {
        if (arg0 == 0) {
            field1994 = null;
            field1996 = null;
            field1993 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IILfb;ZIIIIIIZB)V", line = 69)
    public static final void method1052(int arg0, int arg1, class341 arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, byte arg11) {
        field1995++;
        if (arg11 != 21) {
            field1993 = null;
        }
        if (arg5 == 1) {
            arg9 = 1;
        } else if (arg5 == 2) {
            arg8 = 1;
            arg9 = 1;
        } else if (arg5 == 3) {
            arg8 = 1;
        }
        if (arg4 < 0 || class351.field5217 <= arg4 || arg1 < 0 || class143.field1815 <= arg1) {
            while (true) {
                int var14 = arg2.method2233((byte) 104);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg2.method2233((byte) 104);
                    return;
                }
                if (var14 <= 49) {
                    arg2.method2233((byte) 104);
                }
            }
        }
        if (!arg10 && !arg3) {
            class406.field5912[arg6][arg4][arg1] = 0;
        }
        while (true) {
            int var12 = arg2.method2233((byte) 104);
            if (var12 == 0) {
                if (arg10) {
                    class164.field2231[0][arg4 + arg8][arg1 + arg9] = class142.field1804[0].method722(arg4 + arg8, arg1 + arg9);
                    return;
                } else if (arg6 == 0) {
                    class164.field2231[0][arg4 + arg8][arg1 + arg9] = -class159.method1068(-8018, arg0 + 932731, 556238 - -arg7) * 8;
                    return;
                } else {
                    class164.field2231[arg6][arg4 + arg8][arg1 + arg9] = class164.field2231[arg6 - 1][arg4 + arg8][arg1 + arg9] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg2.method2233((byte) 104);
                if (!arg10) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg6 == 0) {
                        class164.field2231[0][arg4 + arg8][arg1 + arg9] = -var13 * 8;
                        return;
                    }
                    class164.field2231[arg6][arg4 + arg8][arg1 + arg9] = class164.field2231[arg6 - 1][arg4 + arg8][arg1 + arg9] - var13 * 8;
                    return;
                }
                class164.field2231[0][arg4 + arg8][arg1 + arg9] = var13 * 8 + class142.field1804[0].method722(arg4 + arg8, arg1 + arg9);
                return;
            }
            if (var12 <= 49) {
                if (arg3) {
                    arg2.method2233((byte) 104);
                } else {
                    class50.field760[arg6][arg4][arg1] = arg2.method2211(255);
                    class263.field3853[arg6][arg4][arg1] = (byte) ((var12 - 2) / 4);
                    class428.field6220[arg6][arg4][arg1] = (byte) class394.method2529(var12 + arg5 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!arg10 && !arg3) {
                    class406.field5912[arg6][arg4][arg1] = (byte) (var12 - 49);
                }
            } else if (!arg3) {
                class112.field1452[arg6][arg4][arg1] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lsj;I)Lsj;", line = 198)
    public static final class248 method1053(class248 arg0, int arg1) {
        field1990++;
        if (arg1 != 0) {
            method1051(-11);
        }
        class248 var2 = client.method408(arg0);
        if (var2 == null) {
            var2 = arg0.field3592;
        }
        return var2;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(II[I[I)V", line = 223)
    public class158(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field1987 = arg3;
        this.field1988 = arg2;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIII)V", line = 237)
    public static final void method1054(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1989++;
        class264.method1774(arg4, arg2, arg3, 0, arg6, arg0, arg5, -2, arg7);
        if (arg1 < 1) {
            method1051(6);
        }
    }
}
