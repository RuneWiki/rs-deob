import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class166 extends class4 {

    @OriginalMember(owner = "client!hl", name = "S", descriptor = "Ljava/lang/String;")
    public static String field2379 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!hl", name = "T", descriptor = "Ljava/lang/String;")
    public static String field2380 = null;

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "I")
    public static int field2375 = 0;

    @OriginalMember(owner = "client!hl", name = "X", descriptor = "I")
    public static int field2384 = 0;

    @OriginalMember(owner = "client!hl", name = "V", descriptor = "B")
    public byte field2382;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!hl", name = "Q", descriptor = "I")
    public int field2377;

    @OriginalMember(owner = "client!hl", name = "R", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!hl", name = "W", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!hl", name = "Y", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!hl", name = "Z", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "Lsb;")
    public class190 field2373;

    @OriginalMember(owner = "client!hl", name = "U", descriptor = "[Lin;")
    public static class177[] field2381;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "(I)[B", line = 4)
    public final byte[] method27(int arg0) {
        if (arg0 < 106) {
            this.field2382 = 71;
        }
        field2383++;
        if (this.field118 || this.field2373.field2776 < this.field2373.field2718.length - this.field2382) {
            throw new RuntimeException();
        }
        return this.field2373.field2718;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(CB)Z", line = 22)
    public static final boolean method1181(char arg0, byte arg1) {
        field2372++;
        if (arg1 != -67) {
            return false;
        } else if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "(I)I", line = 48)
    public final int method29(int arg0) {
        field2371++;
        int var2 = -107 % ((-arg0 - 64) / 38);
        return this.field2373 == null ? 0 : this.field2373.field2776 * 100 / (this.field2373.field2718.length - this.field2382);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/lang/String;ZLph;)Lto;", line = 85)
    public static final class109 method1182(int arg0, String arg1, boolean arg2, class361 arg3) {
        field2378++;
        int var4 = arg3.method2505(arg1, (byte) -77);
        if (var4 == -1) {
            return new class109(0);
        }
        int[] var5 = arg3.method2508(110, var4);
        class109 var6 = new class109(var5.length);
        int var7 = 0;
        if (arg0 <= 33) {
            field2379 = (String) null;
        }
        int var8 = 0;
        while (true) {
            while (var6.field1589 > var7) {
                class190 var9 = new class190(arg3.method2520(var4, var5[var8++], (byte) -25));
                int var10 = var9.method1371(-4);
                int var11 = var9.method1317((byte) 91);
                int var12 = var9.method1319(255);
                if (!arg2 && var12 == 1) {
                    var6.field1589--;
                } else {
                    var6.field1586[var7] = var10;
                    var6.field1576[var7] = new class287();
                    var6.field1576[var7].field4350 = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 134)
    public static final void method1183(String arg0, int arg1) {
        field2374++;
        class294.field4432 = arg0;
        if (class54.field787.field878 == null) {
            return;
        }
        try {
            String var2 = class54.field787.field878.getParameter("cookieprefix");
            String var3 = class54.field787.field878.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class164.method1164((byte) -76, class176.method1234(arg1 ^ 0xFFFFA6C8) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class114.method859("document.cookie=\"" + var5 + "\"", class54.field787.field878, 27510);
            if (arg1 != -19698) {
                field2375 = -102;
            }
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "(I)V", line = 167)
    public static void method1184(int arg0) {
        field2381 = null;
        field2380 = null;
        field2379 = null;
        if (arg0 != 255) {
            method1184(-68);
        }
    }

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "(I)V", line = 179)
    public static final void method1185(int arg0) {
        field2376++;
        class326.field4898.method458((byte) 94);
        if (arg0 != 0) {
            method1181((char) 65472, (byte) 31);
        }
    }
}
