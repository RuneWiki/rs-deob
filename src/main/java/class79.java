import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class79 {

    @OriginalMember(owner = "client!kt", name = "s", descriptor = "Ljava/lang/String;")
    private String field1004 = "null";

    @OriginalMember(owner = "client!kt", name = "l", descriptor = "[C")
    private static char[] field997 = new char[64];

    @OriginalMember(owner = "client!kt", name = "m", descriptor = "Lcb;")
    public static class318 field998;

    @OriginalMember(owner = "client!kt", name = "o", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "C")
    public char field1005;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "C")
    public char field987;

    @OriginalMember(owner = "client!kt", name = "u", descriptor = "F")
    public static float field1006;

    @OriginalMember(owner = "client!kt", name = "p", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "I")
    private int field988;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!kt", name = "j", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!kt", name = "n", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "Lnj;")
    public class436 field993;

    @OriginalMember(owner = "client!kt", name = "k", descriptor = "Lnj;")
    private class436 field996;

    @OriginalMember(owner = "client!kt", name = "q", descriptor = "Lim;")
    public static class675 field1002;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZ)I")
    public final int method446(int arg0, boolean arg1) {
        field992++;
        if (this.field993 == null) {
            return this.field988;
        } else if (arg1) {
            class360 var3 = (class360) this.field993.method2506(73, (long) arg0);
            return var3 == null ? this.field988 : var3.field5197;
        } else {
            return 22;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)V")
    private final void method447(boolean arg0) {
        this.field996 = new class436(this.field993.method2508(0));
        field1001++;
        if (!arg0) {
            this.method447(false);
        }
        for (class360 var2 = (class360) this.field993.method2499(-29); var2 != null; var2 = (class360) this.field993.method2503(0)) {
            class360 var3 = new class360((int) var2.field272);
            this.field996.method2504((long) var2.field5197, -116, var3);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method448(int arg0, int arg1) {
        field990++;
        if (arg0 != 62) {
            this.field1005 = 'F';
        }
        if (this.field993 == null) {
            return this.field1004;
        } else {
            class61 var3 = (class61) this.field993.method2506(85, (long) arg1);
            return var3 == null ? this.field1004 : var3.field848;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method449(int arg0, String arg1) {
        field994++;
        if (this.field993 == null) {
            return false;
        }
        if (this.field996 == null) {
            this.method453((byte) -86);
        }
        if (arg0 != -4628) {
            this.method449(79, null);
        }
        for (class321 var3 = (class321) this.field996.method2506(90, class553.method3102(false, arg1)); var3 != null; var3 = (class321) this.field996.method2507(-1)) {
            if (var3.field4714.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ldga;IB)V")
    private final void method450(class138 arg0, int arg1, byte arg2) {
        if (arg2 != -62) {
            field1006 = -0.46905258F;
        }
        if (arg1 == 1) {
            this.field987 = class679.method3748(arg0.method950(false), -161);
        } else if (arg1 == 2) {
            this.field1005 = class679.method3748(arg0.method950(false), -161);
        } else if (arg1 == 3) {
            this.field1004 = arg0.method907(false);
        } else if (arg1 == 4) {
            this.field988 = arg0.method943(-119);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method922((byte) -128);
            this.field993 = new class436(class306.method1837((byte) -116, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method943(-127);
                class28 var7;
                if (arg1 == 5) {
                    var7 = new class61(arg0.method907(false));
                } else {
                    var7 = new class360(arg0.method943(-84));
                }
                this.field993.method2504((long) var6, arg2 ^ 0x7D, var7);
            }
        }
        field989++;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BLdga;)V")
    public final void method451(byte arg0, class138 arg1) {
        if (arg0 >= -42) {
            return;
        }
        field995++;
        while (true) {
            int var3 = arg1.method957((byte) -94);
            if (var3 == 0) {
                return;
            }
            this.method450(arg1, var3, (byte) -62);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
    public static final void method452(int arg0) {
        int var1 = -71 % ((54 - arg0) / 35);
        field991++;
        if (class241.field3153 == null) {
            return;
        }
        class617[] var2 = class241.field3153;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class617 var4 = var2[var3];
            var4.method39(114);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V")
    private final void method453(byte arg0) {
        field986++;
        this.field996 = new class436(this.field993.method2508(0));
        for (class61 var2 = (class61) this.field993.method2499(-28); var2 != null; var2 = (class61) this.field993.method2503(arg0 + 86)) {
            class321 var3 = new class321(var2.field848, (int) var2.field272);
            this.field996.method2504(class553.method3102(false, var2.field848), 11, var3);
        }
        if (arg0 != -86) {
            this.method454(17, (byte) 35);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IB)Z")
    public final boolean method454(int arg0, byte arg1) {
        field999++;
        if (this.field993 == null) {
            return false;
        }
        if (arg1 != 28) {
            field997 = null;
        }
        if (this.field996 == null) {
            this.method447(true);
        }
        class360 var3 = (class360) this.field996.method2506(104, (long) arg0);
        return var3 != null;
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)V")
    public static void method455(int arg0) {
        if (arg0 <= -79) {
            field1002 = null;
            field997 = null;
            field998 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(ILjava/lang/String;)V")
    public static final void method456(int arg0, String arg1) {
        field1003++;
        class613.field8363 = arg1;
        if (class372.field5359 == null) {
            return;
        }
        try {
            String var2 = class372.field5359.getParameter("cookieprefix");
            String var3 = class372.field5359.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class85.method475(10, class669.method3713(0) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class302.method1820("document.cookie=\"" + var5 + "\"", class372.field5359, 22340);
            if (arg0 < 72) {
                field997 = null;
            }
        } catch (Throwable var6) {
        }
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field997[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field997[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field997[var2] = (char) (var2 + 48 - 52);
        }
        field997[62] = '+';
        field997[63] = '/';
        field998 = new class318(14, 1);
        field1000 = -1;
    }
}
