import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class298 {

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "Z")
    public boolean field4714 = true;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public int field4706;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public int field4710;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public int field4700;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public int field4699;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public int field4698;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public int field4702;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "[I")
    public static int[] field4707 = new int[] { 5, 0, 15, -1, 0, 0, 0, 0, 0, 0, 0, 0, 9, 8, -1, 9, 0, 0, 0, 0, 12, 0, -1, 0, -2, 0, 0, 0, 3, 0, 0, -2, 0, -1, 0, 0, 0, 0, 3, 0, 4, 0, 0, 10, 0, -1, -2, 0, 0, 0, 0, 0, 0, -2, 0, 8, 2, 0, 10, 1, 0, 0, 0, 0, 6, -1, 0, 0, 0, 0, 0, 0, 2, 0, 0, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 8, 0, 0, 0, 0, 0, 4, 0, 6, 0, 15, 0, 12, 0, 28, 14, 3, 0, 0, 8, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 12, 1, 3, 0, 0, 0, 0, 0, 0, 0, -2, -1, -2, 0, 0, 0, 6, -1, 0, 0, 0, 0, 1, 0, 7, 0, 5, -2, 10, 0, 0, 0, 0, 2, 0, -1, 0, 0, 5, 0, 0, 6, 0, 0, 0, 0, -1, 6, 0, 0, 0, 10, 0, -2, 0, 8, 3, 3, -1, 8, 1, 0, 0, -1, 0, 7, 0, -1, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 6, 0, 0, 0, 0, 6, 0, 12, 0, 2, 0, 4, 1, 0, 0, 0, -1, 0, 0, 20, -2, 5, 0, 8, 0, -1, -2, 0, 0, 0, 14, 0, 0, 0, 0, 5, 6, -2, 7, -2, 0, 0, 2, 0, 0, 0, 0, 2, 0, 2, 0, 4, 0, 0, 7, -2 };

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "Z")
    public static boolean field4704 = true;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field4711 = new String[500];

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "[J")
    public static long[] field4712 = new long[100];

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4716 = "shake:";

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field4713;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "[I")
    public static int[] field4705;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "[[[I")
    public static int[][][] field4701;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 8)
    public static final void method2081(String arg0, int arg1) {
        field4708++;
        class232.field3677 = arg0;
        if (class83.field1235.field5052 == null) {
            return;
        }
        try {
            String var2 = class83.field1235.field5052.getParameter("cookieprefix");
            String var3 = class83.field1235.field5052.getParameter("cookiehost");
            if (arg1 < 96) {
                return;
            }
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class57.method429(-2611, class154.method1172((byte) 89) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class49.method377(-124, class83.field1235.field5052, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILda;IZLda;)I", line = 56)
    public static final int method2082(int arg0, class120 arg1, int arg2, boolean arg3, class120 arg4) {
        field4715++;
        if (arg0 == 1) {
            int var5 = arg4.field4912;
            int var6 = arg1.field4912;
            if (!arg3) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var6 - var5;
        } else if (arg0 == 2) {
            return class254.method1802(arg4.method919(true).field1991, arg1.method919(true).field1991, class195.field3111, arg2 + 21898);
        } else {
            if (arg2 != -21879) {
                field4716 = (String) null;
            }
            if (arg0 == 3) {
                if (arg1.field1927.equals("-")) {
                    if (arg4.field1927.equals("-")) {
                        return 0;
                    } else if (arg3) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else if (arg4.field1927.equals("-")) {
                    return arg3 ? 1 : -1;
                } else {
                    return class254.method1802(arg4.field1927, arg1.field1927, class195.field3111, arg2 ^ 0xFFFFAA9A);
                }
            } else if (arg0 == 4) {
                return arg1.method2161(-128) ? (arg4.method2161(arg2 ^ 0x5509) ? 0 : 1) : (arg4.method2161(arg2 + 21751) ? -1 : 0);
            } else if (arg0 == 5) {
                return arg1.method2159(true) ? (arg4.method2159(true) ? 0 : 1) : (arg4.method2159(true) ? -1 : 0);
            } else if (arg0 == 6) {
                return arg1.method2160(false) ? (arg4.method2160(false) ? 0 : 1) : (arg4.method2160(false) ? -1 : 0);
            } else if (arg0 == 7) {
                return arg1.method2163(-119) ? (arg4.method2163(arg2 + 21834) ? 0 : 1) : (arg4.method2163(-39) ? -1 : 0);
            } else {
                return arg1.field1932 - arg4.field1932;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V", line = 128)
    public static void method2083(byte arg0) {
        field4713 = null;
        field4711 = null;
        field4716 = null;
        field4705 = null;
        field4707 = null;
        if (arg0 >= 52) {
            field4701 = (int[][][]) null;
            field4712 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIJ)Z", line = 144)
    public static final boolean method2084(int arg0, int arg1, int arg2, long arg3) {
        class272 var5 = class60.field946[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field4236 != null && var5.field4236.field3008 == arg3) {
            return true;
        } else if (var5.field4219 != null && var5.field4219.field1865 == arg3) {
            return true;
        } else if (var5.field4213 != null && var5.field4213.field1338 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field4220; var6++) {
                if (var5.field4217[var6].field776 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIIIIIZ)V", line = 204)
    public class298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field4706 = arg1;
        this.field4710 = arg3;
        this.field4700 = arg0;
        this.field4699 = arg5;
        this.field4698 = arg2;
        this.field4714 = arg6;
        this.field4702 = arg4;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZ)Ljava/lang/String;", line = 191)
    public static final String method2085(int arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            field4712 = (long[]) null;
        }
        field4703++;
        return arg2 && arg0 >= 0 ? class195.method1424((byte) -90, 10, arg2, arg0) : Integer.toString(arg0);
    }
}
