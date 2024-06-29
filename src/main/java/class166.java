import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class166 {

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Lgg;")
    public static class63 field3397 = class116.method911(43, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Lab;")
    public static class3 field3399 = new class3(new byte[5000]);

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "[Lwb;")
    public static class200[] field3406 = new class200[1000];

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "Lgg;")
    public static class63 field3407 = class116.method911(43, "blinken1:");

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field3404 = 0;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lgg;")
    public static class63 field3403 = class116.method911(43, "ams");

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "[Lgg;")
    public static class63[] field3411 = new class63[100];

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Lgg;")
    public static class63 field3408 = class116.method911(43, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Lgg;")
    private static class63 field3405 = class116.method911(43, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "Lgg;")
    public static class63 field3410 = class116.method911(43, "sl_back");

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Lgg;")
    public static class63 field3413 = field3405;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Lgg;")
    private static class63 field3402 = class116.method911(43, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Lgg;")
    public static class63 field3409 = field3402;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "[Lrc;")
    public static class156[] field3401;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)Z")
    public static final boolean method1122(byte arg0) {
        if (arg0 < 107) {
            return false;
        }
        field3412++;
        class135 var1 = class45.field1066;
        synchronized (class45.field1066) {
            if (class47.field1106 == class26.field587) {
                return false;
            } else {
                class117.field2624 = class26.field600[class47.field1106];
                class108.field2444 = class113.field2534[class47.field1106];
                class47.field1106 = class47.field1106 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static final void method1123(int arg0) {
        field3398++;
        if (class183.field3716 == null || class30.field773 == null) {
            class30.field773 = new int[256];
            class183.field3716 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class183.field3716[var1] = (int) (Math.sin(var2) * 4096.0D);
                class30.field773[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != 100) {
            method1122((byte) 58);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public static void method1124(int arg0) {
        field3411 = null;
        field3410 = null;
        field3402 = null;
        field3403 = null;
        field3408 = null;
        field3397 = null;
        if (arg0 >= -88) {
            method1122((byte) 69);
        }
        field3405 = null;
        field3406 = null;
        field3399 = null;
        field3407 = null;
        field3409 = null;
        field3413 = null;
        field3401 = null;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
    public static final void method1125(int arg0) {
        class176.field3610.method282((byte) -70);
        field3400++;
        class105.field2407.method282((byte) -120);
        class4.field118.method282((byte) -110);
        class130.field2844.method282((byte) -103);
        class91.field2124.method282((byte) -86);
        if (arg0 != 8991) {
            field3406 = null;
        }
    }
}
