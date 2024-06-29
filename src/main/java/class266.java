import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class266 {

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Lsb;")
    public static class221 field4673 = new class221(64);

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Lp;")
    public static class280 field4676 = class18.method140((byte) -128, " ");

    @OriginalMember(owner = "client!h", name = "f", descriptor = "[Lp;")
    public static class280[] field4678 = new class280[100];

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Lp;")
    public static class280 field4680 = class18.method140((byte) -121, "hitbar_default");

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Z")
    public static boolean field4677 = false;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "Lp;")
    private static class280 field4682 = class18.method140((byte) -125, "green:");

    @OriginalMember(owner = "client!h", name = "k", descriptor = "Lp;")
    public static class280 field4683 = field4682;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Lp;")
    public static class280 field4675 = field4682;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "Ljava/awt/Font;")
    public static Font field4685;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static final void method1787(int arg0) {
        int var1 = class120.field2134 + class262.field4631.field4791;
        field4679++;
        int var2 = class262.field4631.field4793 + class277.field4847;
        if (class183.field3224 - var1 < -500 || class183.field3224 - var1 > 500 || (class67.field1115 - var2) < -500 || (class67.field1115 - var2) > 500) {
            class67.field1115 = var2;
            class183.field3224 = var1;
        }
        if (class183.field3224 != var1) {
            class183.field3224 += (var1 - class183.field3224) / 16;
        }
        if (class67.field1115 != var2) {
            class67.field1115 += (var2 - class67.field1115) / 16;
        }
        if (arg0 != 17) {
            return;
        }
        if (class185.field3267) {
            for (int var3 = 0; var3 < class252.field4413; var3++) {
                int var4 = class187.field3280[var3];
                if (var4 == 98) {
                    class220.field3759 = class220.field3759 + 47 & 0xFFFFFFF0;
                } else if (var4 == 99) {
                    class220.field3759 = class220.field3759 - 17 & 0xFFFFFFF0;
                } else if (var4 == 96) {
                    class25.field487 = class25.field487 - 65 & 0xFFFFFF80;
                } else if (var4 == 97) {
                    class25.field487 = class25.field487 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class88.field1431[98]) {
                class130.field2268 += (12 - class130.field2268) / 2;
            } else if (class88.field1431[99]) {
                class130.field2268 += (-class130.field2268 - 12) / 2;
            } else {
                class130.field2268 /= 2;
            }
            class220.field3759 += class130.field2268 / 2;
            if (class88.field1431[96]) {
                class81.field1331 += (-class81.field1331 - 24) / 2;
            } else if (class88.field1431[97]) {
                class81.field1331 += (24 - class81.field1331) / 2;
            } else {
                class81.field1331 /= 2;
            }
            class25.field487 += class81.field1331 / 2;
        }
        class57.method410(303);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
    public static final void method1788(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4681++;
        class151.method1061(arg2, arg4, arg0 + arg2, arg3 + arg4);
        class151.method1057(arg2, arg4, arg0, arg3, 0);
        if (class250.field4378 < 100) {
            return;
        }
        if (class149.field2577 == null || class149.field2577.field1785 != arg0 || class149.field2577.field1791 != arg3) {
            class223 var5 = new class223(arg0, arg3);
            class151.method1052(var5.field3858, arg0, arg3);
            class85.method610(arg0, class47.field779, class74.field1222, 0, 0, (byte) -122, 0, arg3, 0);
            class149.field2577 = var5;
            class152.field2629.method299(30);
        }
        class149.field2577.method755(arg2, arg4);
        int var6 = arg2 + (class36.field657 * arg0 / class47.field779);
        int var7 = class221.field3830 * arg3 / class74.field1222 + arg4;
        int var8 = class92.field1488 * arg0 / class47.field779;
        int var9 = 16711680;
        if (class283.field4992 == 1) {
            var9 = 16777215;
        }
        int var10 = class273.field4748 * arg3 / class74.field1222;
        class151.method1049(var6, var7, var8, var10, var9, 128);
        class151.method1060(var6, var7, var8, var10, var9);
        if (class108.field1787 > 0 && (class108.field1787 % 10) < 5) {
            for (class68 var11 = (class68) class244.field4290.method651(12916); var11 != null; var11 = (class68) class244.field4290.method643(11066)) {
                if (class73.field1194 == var11.field1129) {
                    int var12 = arg2 + (var11.field1127 * arg0 / class47.field779);
                    int var13 = arg4 + (var11.field1123 * arg3 / class74.field1222);
                    class151.method1057(var12 - 2, var13 - 2, 4, 4, 16776960);
                }
            }
        }
        int var14 = 8 / ((arg1 + 87) / 36);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static void method1789(byte arg0) {
        field4682 = null;
        field4675 = null;
        field4676 = null;
        field4678 = null;
        if (arg0 >= 82) {
            field4685 = null;
            field4680 = null;
            field4673 = null;
            field4683 = null;
        }
    }
}
