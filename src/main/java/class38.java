import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class38 extends class123 {

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "[I")
    public static int[] field831 = new int[50];

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "I")
    public static int field835 = 0;

    @OriginalMember(owner = "client!fb", name = "ab", descriptor = "Lvc;")
    public static class137 field843 = class45.method325("Bitte wenden Sie sich an den Kundendienst)3", -46);

    @OriginalMember(owner = "client!fb", name = "Y", descriptor = "I")
    public static int field841 = 0;

    @OriginalMember(owner = "client!fb", name = "db", descriptor = "Lvc;")
    private static class137 field846 = class45.method325("Error loading your profile)3", -46);

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "Lvc;")
    public static class137 field837 = field846;

    @OriginalMember(owner = "client!fb", name = "Z", descriptor = "Lqa;")
    public static class105 field842 = new class105(64);

    @OriginalMember(owner = "client!fb", name = "eb", descriptor = "I")
    public static int field847 = 0;

    @OriginalMember(owner = "client!fb", name = "fb", descriptor = "Lvc;")
    private static class137 field848 = class45.method325("Bad session id)3", -46);

    @OriginalMember(owner = "client!fb", name = "gb", descriptor = "Lvc;")
    public static class137 field849 = field848;

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "B")
    public byte field839;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!fb", name = "bb", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!fb", name = "cb", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "Lfc;")
    public class39 field832;

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "Lfc;")
    public static class39 field838;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V")
    public static final void method272(int arg0) {
        field834++;
        if (arg0 != 0) {
            method272(-17);
        }
        for (class37 var1 = (class37) class19.field396.method726(arg0); var1 != null; var1 = (class37) class19.field396.method731((byte) -117)) {
            if (var1.field811 != null) {
                class23.field560.method566(var1.field811);
                var1.field811 = null;
            }
            if (var1.field817 != null) {
                class23.field560.method566(var1.field817);
                var1.field817 = null;
            }
        }
        class19.field396.method728(44);
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)V")
    public static void method273(int arg0) {
        field837 = null;
        field849 = null;
        field846 = null;
        field848 = null;
        field838 = null;
        field842 = null;
        field831 = null;
        if (arg0 < -25) {
            field843 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)Lvc;")
    public static final class137 method274(int arg0, int arg1) {
        if (arg1 != 0) {
            method274(76, 27);
        }
        field840++;
        return arg0 < 999999999 ? class61.method435(arg0, 76) : class85.field1936;
    }
}
