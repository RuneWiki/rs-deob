import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class122 {

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "Lv;")
    private static class146 field2824 = class159.method1226((byte) -37, "K");

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "Lv;")
    private static class146 field2836 = class159.method1226((byte) -37, "wave:");

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "Lv;")
    private static class146 field2839 = class159.method1226((byte) -37, "M");

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "Lv;")
    public static class146 field2833 = field2824;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Lv;")
    public static class146 field2823 = field2839;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "Lv;")
    private static class146 field2834 = class159.method1226((byte) -37, "Loaded title screen");

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field2835 = 7759444;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "Lv;")
    public static class146 field2837 = class159.method1226((byte) -37, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "Lv;")
    public static class146 field2843 = field2836;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Lv;")
    public static class146 field2826 = field2839;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "Lv;")
    public static class146 field2838 = class159.method1226((byte) -37, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "Lv;")
    public static class146 field2844 = field2834;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Lv;")
    public static class146 field2831 = field2824;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "Lv;")
    public static class146 field2850 = null;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "Lv;")
    public static class146 field2841 = class159.method1226((byte) -37, ": ");

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "Lv;")
    private static class146 field2846 = class159.method1226((byte) -37, "button near the top of that page)3");

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "Lv;")
    public static class146 field2849 = field2836;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "Lv;")
    public static class146 field2830 = field2846;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public int field2827;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public int field2842;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public int field2845;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    public int field2847;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lv;")
    public class146 field2821;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "Lla;")
    public static class77 field2832;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Lmd;")
    public static class87 field2822;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Z")
    public boolean field2829;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "[I")
    public static int[] field2840;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLke;Lla;Lla;Lla;)Z")
    public static final boolean method920(boolean arg0, class74 arg1, class77 arg2, class77 arg3, class77 arg4) {
        if (!arg0) {
            return false;
        }
        class35.field760 = arg1;
        class3.field88 = arg3;
        class147.field3424 = arg2;
        class141.field3230 = arg4;
        field2851++;
        return true;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method921(byte arg0, String arg1, Throwable arg2) {
        field2825++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class81.method620((byte) 35, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class46.field1068.field319 != null) {
                class39 var8 = class46.field1068.method118((byte) 117, new URL(class46.field1068.field319.getCodeBase(), "clienterror.ws?c=" + class143.field3277 + "&u=" + class6.field133 + "&v1=" + class21.field320 + "&v2=" + class21.field327 + "&e=" + var7));
                if (arg0 == 90) {
                    while (var8.field866 == 0) {
                        class6.method51(1L, arg0 ^ 0xFFFFC7A2);
                    }
                    if (var8.field866 == 1) {
                        DataInputStream var9 = (DataInputStream) var8.field870;
                        var9.read();
                        var9.close();
                    }
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static void method922(byte arg0) {
        field2831 = null;
        field2843 = null;
        field2830 = null;
        field2840 = null;
        field2839 = null;
        field2823 = null;
        field2826 = null;
        field2849 = null;
        field2833 = null;
        field2822 = null;
        field2846 = null;
        field2844 = null;
        field2850 = null;
        if (arg0 != -15) {
            return;
        }
        field2837 = null;
        field2824 = null;
        field2841 = null;
        field2834 = null;
        field2838 = null;
        field2836 = null;
        field2832 = null;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)Lof;")
    public static final class103 method923(byte arg0) {
        if (arg0 >= -33) {
            field2833 = null;
        }
        field2828++;
        try {
            return (class103) Class.forName("nc").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class2();
        }
    }
}
