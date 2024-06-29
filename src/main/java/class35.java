import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class35 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "[I")
    public static int[] field654 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Lsd;")
    public static class166 field656 = class135.method935("mod_icons", 0);

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field659 = 0;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "Lsd;")
    private static class166 field661 = class135.method935(" has logged in)3", 0);

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Lsd;")
    public static class166 field655 = field661;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "Lsd;")
    public static class166 field665 = class135.method935("Ihr Spielkonto wurde deaktiviert)3", 0);

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field660 = 0;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "Lsd;")
    public static class166 field662 = class135.method935("<col=ff9040>", 0);

    @OriginalMember(owner = "client!df", name = "n", descriptor = "Lsd;")
    public static class166 field667 = class135.method935("::", 0);

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Lre;")
    public static class158 field657;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Lf;")
    public static class47 field658;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Lih;")
    public static class80 field664;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method249(int arg0) {
        if (arg0 != 4) {
            return;
        }
        field661 = null;
        field667 = null;
        field664 = null;
        field654 = null;
        field658 = null;
        field665 = null;
        field655 = null;
        field662 = null;
        field656 = null;
        field657 = null;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static final void method250(int arg0) {
        field666++;
        class147 var1 = class129.field2532;
        synchronized (class129.field2532) {
            int var2 = -12 / ((arg0 + 2) / 46);
            class51.field929 = class103.field2020;
            class41.field734 = class5.field117;
            class5.field110 = class200.field3975;
            class2.field18 = class182.field3448;
            class69.field1409 = class191.field3631;
            class57.field1174 = class74.field1535;
            class139.field2727 = class145.field2828;
            class182.field3448 = 0;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lf;ILhb;ZLf;)V")
    public static final void method251(class47 arg0, int arg1, class66 arg2, boolean arg3, class47 arg4) {
        field663++;
        class199.field3942 = arg4;
        class34.field641 = arg0;
        class51.field934 = arg3;
        class129.field2533 = class34.field641.method358(10, -1);
        if (arg1 != 8) {
            field664 = null;
        }
        class131.field2555 = arg2;
    }
}
