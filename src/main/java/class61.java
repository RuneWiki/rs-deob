import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class61 {

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "Lke;")
    public static class622 field830 = new class622(116, 6);

    @OriginalMember(owner = "client!gda", name = "k", descriptor = "D")
    public static double field838;

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "F")
    public static float field831;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "I")
    public int field834;

    @OriginalMember(owner = "client!gda", name = "h", descriptor = "I")
    public int field835;

    @OriginalMember(owner = "client!gda", name = "i", descriptor = "I")
    public int field836;

    @OriginalMember(owner = "client!gda", name = "j", descriptor = "I")
    public int field837;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V")
    public static void method372(int arg0) {
        if (arg0 == 6) {
            field830 = null;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZB)V")
    public static final void method373(boolean arg0, byte arg1) {
        field829++;
        if (arg0) {
            if (class251.field3546 != -1) {
                class34.method233((byte) -22, class251.field3546);
            }
            for (class329 var2 = (class329) class251.field3547.method382(0); var2 != null; var2 = (class329) class251.field3547.method391(37)) {
                if (!var2.method3114(74)) {
                    var2 = (class329) class251.field3547.method382(0);
                    if (var2 == null) {
                        break;
                    }
                }
                class224.method1551((byte) 26, var2, false, true);
            }
            class251.field3546 = -1;
            class251.field3547 = new class64(8);
            class723.method4073(1);
            class251.field3546 = class711.field10012;
            class126.method924(false, (byte) 102);
            class149.method1028(-19376);
            class353.method2223(class251.field3546);
        }
        if (arg1 >= 19) {
            class585.field8273 = true;
        }
    }
}
