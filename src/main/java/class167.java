import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class167 extends class83 {

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    private int field2115 = 0;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    private int field2118 = 4096;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "Z")
    public static boolean field2113 = false;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "Ljava/lang/String;")
    public static String field2117 = "red:";

    @OriginalMember(owner = "client!th", name = "T", descriptor = "[I")
    public static int[] field2121 = new int[4096];

    @OriginalMember(owner = "client!th", name = "M", descriptor = "[[B")
    public static byte[][] field2114 = new byte[50][];

    @OriginalMember(owner = "client!th", name = "U", descriptor = "I")
    public static int field2122 = 0;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!th", name = "S", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!th", name = "V", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!th", name = "W", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method37(int arg0, int arg1) {
        ++field2124;
        if (arg0 != 2) {
            this.field2118 = 24;
        }
        int[] var3 = super.field916.method1813(arg1, (byte) 124);
        if (super.field916.field4174) {
            int[] var4 = this.method451(0, 98, arg1);
            for (int var5 = 0; ~var5 > ~class420.field6139; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field2115 >= ~var6 && var6 <= this.field2118 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(B)V", line = 38)
    public static void method887(byte arg0) {
        field2121 = null;
        if (arg0 != -111) {
            method888(59, (String) null);
        }
        field2114 = null;
        field2117 = null;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V", line = 51)
    public class167() {
        super(1, true);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;)V", line = 56)
    public static final void method888(int arg0, String arg1) {
        class435.field6351 = arg1;
        ++field2123;
        if (class159.field2055.field6532 != null) {
            try {
                String var2 = class159.field2055.field6532.getParameter("cookieprefix");
                String var3 = class159.field2055.field6532.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
                int var5 = 118 % ((61 - arg0) / 52);
                String var6;
                if (~arg1.length() != -1) {
                    var6 = var4 + "; Expires=" + class339.method1971(94608000000L + class442.method2730(25207), 12) + "; Max-Age=" + 94608000L;
                } else {
                    var6 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                class245.method1312(73, class159.field2055.field6532, "document.cookie=\"" + var6 + "\"");
            } catch (Throwable var7) {
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;", line = 97)
    public static final String[] method889(int arg0, String arg1, char arg2) {
        ++field2120;
        int var3 = class72.method414(arg1, arg2, 0);
        int var4 = 79 / ((arg0 - 12) / 60);
        String[] var5 = new String[var3 + 1];
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; ~var8 > ~var3; ++var8) {
            int var9;
            for (var9 = var7; arg1.charAt(var9) != arg2; ++var9) {
            }
            var5[var6++] = arg1.substring(var7, var9);
            var7 = var9 + 1;
        }
        var5[var3] = arg1.substring(var7);
        return var5;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IBLtq;)V", line = 135)
    public final void method35(int arg0, byte arg1, class250 arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field2118 = arg2.method1374(-2);
            }
        } else {
            this.field2115 = arg2.method1374(-2);
        }
        int var5 = -18 / ((-27 - arg1) / 50);
        ++field2119;
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V", line = 188)
    public static final void method890(int arg0) {
        class327.field4354.method137((byte) -57);
        if (arg0 == -26008) {
            ++field2116;
            for (int var1 = 0; var1 < 32; ++var1) {
                class2.field18[var1] = 0L;
            }
            for (int var2 = 0; var2 < 32; ++var2) {
                class436.field6374[var2] = 0L;
            }
            class185.field2351 = 0;
        }
    }
}
