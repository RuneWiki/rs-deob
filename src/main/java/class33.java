import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class33 {

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field409 = 0;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field415 = 0;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "Ljava/lang/String;")
    public static String field416 = "Loaded input handler";

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "Ljava/lang/String;")
    public static String field413 = null;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field410;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "[[B")
    public static byte[][] field411;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 6)
    public static void method230(int arg0) {
        field416 = null;
        field413 = null;
        field411 = (byte[][]) null;
        field410 = null;
        if (arg0 >= -38) {
            method230(-10);
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 37)
    public static final void method231(int arg0) {
        field412++;
        class133.method1007(class152.field2290, 111);
        class96.field1404++;
        if (class106.field1621 && class205.field3248) {
            int var1 = class295.field4646;
            int var2 = 47 % ((37 - arg0) / 41);
            int var3 = class273.field4129;
            int var4 = var3 - class69.field1010;
            if (class161.field2389 > var4) {
                var4 = class161.field2389;
            }
            if ((class161.field2389 + class102.field1581.field2890) < (class152.field2290.field2890 + var4)) {
                var4 = class161.field2389 + class102.field1581.field2890 - class152.field2290.field2890;
            }
            int var5 = var1 - class43.field675;
            if (var5 < class122.field1925) {
                var5 = class122.field1925;
            }
            if ((class122.field1925 + class102.field1581.field2904) < (class152.field2290.field2904 + var5)) {
                var5 = class122.field1925 + class102.field1581.field2904 - class152.field2290.field2904;
            }
            int var6 = var4 - class311.field4843;
            int var7 = var5 - class298.field4676;
            int var8 = class152.field2290.field2955;
            if (class96.field1404 > class152.field2290.field2814 && (var8 < var6 || var6 < -var8 || var8 < var7 || var7 < (-var8))) {
                class99.field1465 = true;
            }
            int var9 = class102.field1581.field2808 + var5 - class122.field1925;
            int var10 = class102.field1581.field2970 + var4 - class161.field2389;
            if (class152.field2290.field2861 != null && class99.field1465) {
                class167 var11 = new class167();
                var11.field2510 = class152.field2290.field2861;
                var11.field2518 = class152.field2290;
                var11.field2513 = var10;
                var11.field2508 = var9;
                class272.method1889(1, var11);
            }
            if (class31.field400 == 0) {
                if (class99.field1465) {
                    if (class152.field2290.field2969 != null) {
                        class167 var12 = new class167();
                        var12.field2520 = class227.field3514;
                        var12.field2518 = class152.field2290;
                        var12.field2513 = var10;
                        var12.field2508 = var9;
                        var12.field2510 = class152.field2290.field2969;
                        class272.method1889(1, var12);
                    }
                    if (class227.field3514 != null && client.method1770(class152.field2290) != null) {
                        class79.field1105++;
                        class159.field2372.method59(9, (byte) 73);
                        class159.field2372.method249(class227.field3514.field2806, false);
                        class159.field2372.method257(class227.field3514.field2893, true);
                        class159.field2372.method303(class152.field2290.field2893, (byte) 32);
                        class159.field2372.method249(class152.field2290.field2806, false);
                    }
                } else if ((class328.field5084 == 1 || class190.method1372(class6.field62 - 1, (byte) 109)) && class6.field62 > 2) {
                    class266.method1845(-124);
                } else if (class6.field62 > 0) {
                    class29.method201((byte) -120);
                }
                class152.field2290 = null;
            }
        } else if (class96.field1404 > 1) {
            class152.field2290 = null;
        }
    }
}
