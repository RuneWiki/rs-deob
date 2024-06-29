import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class210 {

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "Lcc;")
    public static class209 field3821 = class95.method669(93, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "[I")
    public static int[] field3827 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Lcc;")
    public static class209 field3817 = class95.method669(107, " <col=ffff00>");

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "[I")
    public static int[] field3831 = new int[100];

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "Lcc;")
    public static class209 field3830 = class95.method669(101, "Attaquer");

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "Lcc;")
    public static class209 field3833 = class95.method669(96, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "Lta;")
    public static class255 field3823 = new class255(16);

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "Lcc;")
    private static class209 field3836 = class95.method669(115, "slide:");

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "Lcc;")
    public static class209 field3835 = field3836;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "Lcc;")
    public static class209 field3834 = field3836;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public int field3818;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public int field3819;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public int field3824;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public int field3826;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public int field3828;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public int field3829;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public int field3832;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "[B")
    public byte[] field3820;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "[B")
    public byte[] field3825;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public static void method1493(byte arg0) {
        field3823 = null;
        field3817 = null;
        field3833 = null;
        field3834 = null;
        field3835 = null;
        field3831 = null;
        field3827 = null;
        field3830 = null;
        int var1 = 14 % ((arg0 + 79) / 40);
        field3836 = null;
        field3821 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILek;)I")
    public static final int method1494(int arg0, class163 arg1) {
        if (arg0 >= -84) {
            method1494(40, (class163) null);
        }
        class237 var2 = arg1.field2969;
        field3822++;
        if (var2.field4295 != null) {
            var2 = var2.method1636(62);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4273;
        if (arg1.field1551 == arg1.field1549) {
            var3 = var2.field4248;
        } else if (arg1.field1551 == arg1.field1513) {
            var3 = var2.field4244;
        }
        return var3;
    }
}
