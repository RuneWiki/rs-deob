import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class92 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "Lsc;")
    private static class181 field1459 = class149.method967(255, "flash3:");

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "Lsc;")
    public static class181 field1464 = field1459;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "Lsc;")
    public static class181 field1460 = field1459;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "Lak;")
    public static class152 field1463 = new class152(64);

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "Lsc;")
    private static class181 field1469 = class149.method967(255, "Loading textures )2 ");

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "Lsc;")
    public static class181 field1466 = field1469;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "S")
    public static short field1467 = 1;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "Lsc;")
    public static class181 field1470 = class149.method967(255, "blinken2:");

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lsc;B)V")
    public static final void method610(class181 arg0, byte arg1) {
        field1461++;
        if (arg1 <= 42) {
            method612(76, -75);
        }
        for (class120 var2 = (class120) class60.field917.method1686((byte) -83); var2 != null; var2 = (class120) class60.field917.method1683(140)) {
            if (var2.field1969.method1202(arg0, -4557)) {
                class212.field3661 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZD)V")
    public static final void method611(boolean arg0, double arg1) {
        field1465++;
        if (class174.field2921 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class135.field2198[var3] = var4 <= 255 ? var4 : 255;
            }
            class174.field2921 = arg1;
        }
        if (arg0) {
            method613(116);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
    public static final void method612(int arg0, int arg1) {
        field1462++;
        if (class5.field106 == arg0 || arg1 != 255) {
            return;
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (class5.field106 == 0) {
            class234.method1609((byte) -111);
        }
        if (arg0 == 40) {
            class2.method25(class241.field4191, class115.field1859, class241.field4195, (byte) 120);
        }
        if (arg0 != 40 && class160.field2731 != null) {
            class160.field2731.method313(-65);
            class160.field2731 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class188.field3328 = 0;
            class175.field3027 = 1;
            class229.field3922 = 0;
            class190.field3351 = 0;
            class116.field1917 = 1;
            class16.method142((byte) 109);
        }
        if (arg0 == 5) {
            class151.method975(class254.field4453, 0);
        } else {
            class22.method198(arg1 - 20953);
        }
        boolean var3 = class5.field106 == 5 || class5.field106 == 10 || class5.field106 == 28;
        if (var3 != var2) {
            if (var2) {
                class152.field2527 = class246.field4295;
                if (class94.field1502 == 0) {
                    class60.method433(2, false);
                } else {
                    class77.method536(class246.field4295, false, 120, 2, 0, class13.field266, 255);
                }
                class192.method1320((byte) 120, false);
            } else {
                class60.method433(2, false);
                class192.method1320((byte) 105, true);
            }
        }
        class5.field106 = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method613(int arg0) {
        field1459 = null;
        field1464 = null;
        field1469 = null;
        field1463 = null;
        field1470 = null;
        field1460 = null;
        if (arg0 != 0) {
            field1470 = null;
        }
        field1466 = null;
    }
}
