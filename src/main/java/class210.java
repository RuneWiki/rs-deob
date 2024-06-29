import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class210 extends class266 {

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "[[I")
    public static int[][] field3610 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "Lp;")
    public static class280 field3612 = class18.method140((byte) -117, " )2>");

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public static int field3615 = 0;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "Lp;")
    public static class280 field3616 = class18.method140((byte) -119, "T");

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "Lp;")
    public static class280 field3613 = class18.method140((byte) -119, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "Lp;")
    public static class280 field3617 = class18.method140((byte) -121, "::rebuild");

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "Lde;")
    public static class108 field3614;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)I")
    public static final int method1410(int arg0) {
        if (arg0 != 0) {
            method1410(-84);
        }
        field3611++;
        return 0;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V")
    public static void method1411(byte arg0) {
        field3610 = null;
        field3617 = null;
        field3616 = null;
        field3613 = null;
        field3614 = null;
        if (arg0 == 72) {
            field3612 = null;
        }
    }
}
