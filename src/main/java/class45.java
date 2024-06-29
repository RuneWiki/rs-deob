import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class45 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Lje;")
    public static class67 field831 = class85.method592(255, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Lje;")
    private static class67 field834 = class85.method592(255, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field839 = 50;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "[I")
    public static int[] field836 = new int[32768];

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Lje;")
    public static class67 field844 = class85.method592(255, "VOLL");

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field841 = 0;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Lje;")
    public static class67 field842 = field834;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Z")
    public static boolean field835 = false;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Lfd;")
    public static class40 field843;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field840;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
    public static void method289(boolean arg0) {
        field842 = null;
        field836 = null;
        field831 = null;
        field844 = null;
        field843 = null;
        field840 = null;
        if (!arg0) {
            method291(null, -15, 19, null);
        }
        field834 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static final void method290(byte arg0) {
        field833++;
        class30.field536.method767(1);
        int var1 = 116 / ((-arg0 - 11) / 55);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lha;IILua;)V")
    public static final void method291(class50 arg0, int arg1, int arg2, class140 arg3) {
        field838++;
        if (arg2 != -1001) {
            method293((byte) -4);
        }
        byte[] var4 = null;
        class4 var5 = class6.field142;
        synchronized (class6.field142) {
            for (class98 var6 = (class98) class6.field142.method26((byte) -65); var6 != null; var6 = (class98) class6.field142.method18((byte) -128)) {
                if ((long) arg1 == var6.field300 && var6.field2182 == arg0 && var6.field2192 == 0) {
                    var4 = var6.field2191;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg0.method325(arg1, 5371);
            arg3.method1057(arg0, arg1, var7, true, 255);
        } else {
            arg3.method1057(arg0, arg1, var4, true, arg2 + 1256);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BLje;)I")
    public static final int method292(byte arg0, class67 arg1) {
        field845++;
        if (class23.field415 == 1) {
            return 7;
        } else if (arg0 != 113) {
            return -56;
        } else if (arg1.method454(class72.field1488, (byte) -123)) {
            return 1;
        } else if (arg1.method454(class38.field689, (byte) -123)) {
            return 1;
        } else if (arg1.method454(class40.field745, (byte) -123)) {
            return 2;
        } else if (arg1.method454(class35.field644, (byte) -123)) {
            return 2;
        } else if (arg1.method454(class59.field1183, (byte) -123)) {
            return 3;
        } else if (arg1.method454(class80.field1754, (byte) -123)) {
            return 4;
        } else if (arg1.method454(class93.field2108, (byte) -123)) {
            return 4;
        } else if (arg1.method454(class40.field748, (byte) -123)) {
            return 5;
        } else if (arg1.method454(class58.field1165, (byte) -123)) {
            return 6;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
    public static final void method293(byte arg0) {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class69.field1419 - 1; var2++) {
                if (class101.field2267[var2] < 1000 && class101.field2267[var2 + 1] > 1000) {
                    var1 = false;
                    class67 var3 = class31.field543[var2];
                    class31.field543[var2] = class31.field543[var2 + 1];
                    class31.field543[var2 + 1] = var3;
                    class67 var4 = class55.field1095[var2];
                    class55.field1095[var2] = class55.field1095[var2 + 1];
                    class55.field1095[var2 + 1] = var4;
                    int var5 = class101.field2267[var2];
                    class101.field2267[var2] = class101.field2267[var2 + 1];
                    class101.field2267[var2 + 1] = var5;
                    int var6 = class46.field847[var2];
                    class46.field847[var2] = class46.field847[var2 + 1];
                    class46.field847[var2 + 1] = var6;
                    int var7 = class154.field3501[var2];
                    class154.field3501[var2] = class154.field3501[var2 + 1];
                    class154.field3501[var2 + 1] = var7;
                    int var8 = class126.field2766[var2];
                    class126.field2766[var2] = class126.field2766[var2 + 1];
                    class126.field2766[var2 + 1] = var8;
                }
            }
        }
        if (arg0 == -87) {
            field837++;
        }
    }
}
