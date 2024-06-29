import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!pa")
public class class30 {

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "La;")
    public static class1 field407 = class3.method36("Rare Trees", -125);

    @OriginalMember(owner = "mapview!pa", name = "h", descriptor = "I")
    public static int field413 = 0;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "La;")
    public static class1 field406 = class3.method36("Hair Dressers", -89);

    @OriginalMember(owner = "mapview!pa", name = "c", descriptor = "Z")
    public static boolean field408 = false;

    @OriginalMember(owner = "mapview!pa", name = "i", descriptor = "La;")
    public static class1 field414 = class3.method36("Prev page", -120);

    @OriginalMember(owner = "mapview!pa", name = "l", descriptor = "[I")
    public static int[] field417 = new int[128];

    @OriginalMember(owner = "mapview!pa", name = "g", descriptor = "La;")
    public static class1 field412 = class3.method36("37(U", -122);

    @OriginalMember(owner = "mapview!pa", name = "m", descriptor = "La;")
    public static class1 field418 = class3.method36("Amulet Shop", -99);

    @OriginalMember(owner = "mapview!pa", name = "n", descriptor = "La;")
    public static class1 field419 = class3.method36("Makeover Mage", -88);

    @OriginalMember(owner = "mapview!pa", name = "d", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "mapview!pa", name = "j", descriptor = "J")
    public static long field415;

    @OriginalMember(owner = "mapview!pa", name = "k", descriptor = "La;")
    public static class1 field416;

    @OriginalMember(owner = "mapview!pa", name = "e", descriptor = "[I")
    public static int[] field410;

    @OriginalMember(owner = "mapview!pa", name = "f", descriptor = "[I")
    public static int[] field411;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(Z)V", line = 34)
    public static void method193(boolean arg0) {
        field418 = null;
        field417 = null;
        if (arg0) {
            return;
        }
        field414 = null;
        field407 = null;
        field412 = null;
        field411 = null;
        field410 = null;
        field419 = null;
        field416 = null;
        field406 = null;
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(Ljava/lang/Object;Lia;B)V", line = 63)
    public static final void method194(Object arg0, class17 arg1, byte arg2) {
        if (arg1.field142 == null) {
            return;
        }
        if (arg2 != 47) {
            field416 = null;
        }
        for (int var3 = 0; var3 < 50 && arg1.field142.peekEvent() != null; var3++) {
            class1.method11(1L, (byte) -61);
        }
        if (arg0 != null) {
            arg1.field142.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }
}
