import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class155 {

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "Lhe;")
    public static class54 field3500 = class6.method58("http:)4)4www)3runescape)3com", false);

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field3499 = 0;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Lhe;")
    public static class54 field3503 = class6.method58("<col=ffff00>", false);

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field3508 = 0;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Lhe;")
    public static class54 field3504 = class6.method58("M", false);

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Lhe;")
    private static class54 field3498 = class6.method58("slide:", false);

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Lhe;")
    public static class54 field3502 = field3498;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Lhe;")
    public static class54 field3497 = field3498;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Lhe;")
    public static class54 field3496 = class6.method58("nicht hergestellt werden)3", false);

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "[I")
    public static int[] field3507 = new int[128];

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "Lhe;")
    public static class54 field3509 = class6.method58("und loggen sich dann erneut ein)3", false);

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "Lhe;")
    public static class54 field3510 = class6.method58("null", false);

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Lsf;")
    public static class131 field3501 = new class131(30);

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "[[[I")
    public static int[][][] field3512 = new int[4][13][13];

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "[I")
    public static int[] field3506;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public static void method1194(int arg0) {
        if (arg0 != 128) {
            method1196((byte) -18, -34);
        }
        field3510 = null;
        field3496 = null;
        field3500 = null;
        field3498 = null;
        field3506 = null;
        field3497 = null;
        field3512 = null;
        field3503 = null;
        field3501 = null;
        field3504 = null;
        field3507 = null;
        field3509 = null;
        field3502 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Lhe;")
    public static final class54 method1195(int arg0, int arg1) {
        field3505++;
        if (arg1 >= -18) {
            field3502 = null;
        }
        return class143.method1105(new class54[] { class147.method1117(-9, arg0 >> 24 & 0xFF), class27.field731, class147.method1117(-63, arg0 >> 16 & 0xFF), class27.field731, class147.method1117(-9, arg0 >> 8 & 0xFF), class27.field731, class147.method1117(-97, arg0 & 0xFF) }, -842);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)Z")
    public static final boolean method1196(byte arg0, int arg1) {
        if (arg0 != -127) {
            field3498 = null;
        }
        field3511++;
        return (arg1 >> 30 & 0x1) != 0;
    }
}
