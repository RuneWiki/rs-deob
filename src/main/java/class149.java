import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class149 extends class255 {

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "Lgi;")
    public class153 field2669;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "[I")
    public static int[] field2664 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "[Leb;")
    public static class230[] field2667 = new class230[500];

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "Leb;")
    public static class230 field2672 = class68.method589(0, "floorshadows");

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "Leb;")
    private static class230 field2673 = class68.method589(0, "Unable to find ");

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "Leb;")
    public static class230 field2670 = field2673;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "Lnb;")
    public static class199 field2666;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V")
    public static void method1131(int arg0) {
        if (arg0 != 1) {
            field2671 = -87;
        }
        field2673 = null;
        field2667 = null;
        field2670 = null;
        field2666 = null;
        field2664 = null;
        field2672 = null;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lgi;)V")
    public class149(class153 arg0) {
        this.field2669 = arg0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIZ)Leb;")
    public static final class230 method1132(int arg0, int arg1, boolean arg2) {
        field2665++;
        if (arg0 != 10) {
            field2666 = null;
        }
        return class240.method1684(arg1, 10, arg2, -5);
    }
}
