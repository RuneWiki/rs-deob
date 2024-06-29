import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class36 extends class185 {

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "[Leb;")
    public static class247[] field501 = new class247[14];

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "Ljava/lang/String;")
    public static String field500 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!vk", name = "R", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "Lhg;")
    public static class181 field502;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "Lmc;")
    public static class201 field497;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        int[] var3 = super.field2804.method561(arg0, -2);
        ++field504;
        if (arg1 < 70) {
            field497 = null;
        }
        if (super.field2804.field1384) {
            int var4 = class85.field1356[arg0];
            for (int var5 = 0; var5 < class174.field2648; ++var5) {
                var3[var5] = this.method223(class153.field2304[var5], var4, (byte) -6) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method221(byte arg0, String arg1) {
        class189.field2904 = arg1;
        ++field498;
        if (class209.field3147.field150 != null) {
            try {
                String var2 = class209.field3147.field150.getParameter("cookieprefix");
                if (arg0 == -85) {
                    String var3 = class209.field3147.field150.getParameter("cookiehost");
                    String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
                    String var5;
                    if (arg1.length() != 0) {
                        var5 = var4 + "; Expires=" + class173.method1067(94608000000L + class263.method1754(-88), (byte) 70) + "; Max-Age=" + 94608000L;
                    } else {
                        var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    class73.method497(class209.field3147.field150, -5475, "document.cookie=\"" + var5 + "\"");
                }
            } catch (Throwable var6) {
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)V")
    public static final void method222(int arg0, int arg1, int arg2) {
        ++field499;
        class23 var3 = class276.method1827((byte) 123, arg1);
        int var4 = -86 / ((arg0 - -7) / 60);
        int var5 = var3.field272;
        int var6 = var3.field274;
        int var7 = var3.field281;
        int var8 = class66.field1052[-var6 + var7];
        if (arg2 < 0 || ~var8 > ~arg2) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        class118.method750(var5, -113, ~var9 & class35.field494[var5] | arg2 << var6 & var9);
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
    public class36() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIB)I")
    private final int method223(int arg0, int arg1, byte arg2) {
        ++field496;
        int var4 = arg1 * 57 + arg0;
        int var5 = var4 << 1 ^ var4;
        return arg2 != -6 ? 103 : -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(B)V")
    public static void method224(byte arg0) {
        field497 = null;
        field501 = null;
        field500 = null;
        if (arg0 == 110) {
            field502 = null;
        }
    }
}
