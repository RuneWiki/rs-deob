import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class16 {

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Ljd;")
    public static class92 field441 = class202.method1325((byte) 90, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!be", name = "c", descriptor = "Ljd;")
    public static class92 field442 = class202.method1325((byte) 90, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!be", name = "f", descriptor = "[Z")
    public static boolean[] field445 = new boolean[112];

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Lh;")
    public static class70 field444 = new class70(8);

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Ljd;")
    public static class92 field447 = class202.method1325((byte) 90, "mod_icons");

    @OriginalMember(owner = "client!be", name = "g", descriptor = "Lbg;")
    public static class18 field446 = new class18();

    @OriginalMember(owner = "client!be", name = "i", descriptor = "Ljd;")
    public static class92 field448 = class202.method1325((byte) 90, "AUS");

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lnh;I)V")
    public static final void method94(class133 arg0, int arg1) {
        field443++;
        if (arg1 != 0) {
            field442 = null;
        }
        class76.field1587 = arg0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method95(int arg0) {
        field442 = null;
        field447 = null;
        field444 = null;
        field445 = null;
        field446 = null;
        field441 = null;
        field448 = null;
        if (arg0 != 1) {
            method96(-76);
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public static final void method96(int arg0) {
        field440++;
        try {
            if (class79.field1619 == 1) {
                int var1 = class198.field3871.method1232(255);
                if (var1 > 0 && class198.field3871.method1249(-117)) {
                    int var2 = var1 - class33.field738;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class198.field3871.method1233(var2, -15561);
                    return;
                }
                class198.field3871.method1252(false);
                class198.field3871.method1222(-83);
                if (class156.field3100 == null) {
                    class79.field1619 = 0;
                } else {
                    class79.field1619 = 2;
                }
                class210.field4073 = null;
                class136.field2712 = null;
            }
            if (arg0 >= -125) {
                field441 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class198.field3871.method1252(false);
            class156.field3100 = null;
            class79.field1619 = 0;
            class210.field4073 = null;
            class136.field2712 = null;
        }
    }
}
