import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class75 {

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "Lud;")
    private static class279 field1470 = class130.method1024("Loaded input handler", 255);

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "[I")
    public static int[] field1474 = new int[2];

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "[I")
    public static int[] field1469 = new int[500];

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "Lud;")
    public static class279 field1475 = field1470;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "[I")
    public static int[] field1472 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "Lud;")
    public static class279 field1477 = class130.method1024("Card:", 255);

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "Lud;")
    public static class279 field1476 = class130.method1024("Veuillez commencer par supprimer ", 255);

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field1473 = -1;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V", line = 14)
    public static final void method644(int arg0) {
        field1471++;
        if (arg0 < 41) {
            method644(69);
        }
        if (class278.field4909 != null && class87.field1668 != null) {
            return;
        }
        class87.field1668 = new int[256];
        class278.field4909 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class278.field4909[var1] = (int) (Math.sin(var2) * 4096.0D);
            class87.field1668[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V", line = 45)
    public static void method645(int arg0) {
        field1474 = null;
        field1469 = null;
        field1472 = null;
        field1476 = null;
        if (arg0 >= -78) {
            method645(68);
        }
        field1470 = null;
        field1475 = null;
        field1477 = null;
    }
}
