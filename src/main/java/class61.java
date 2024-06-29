import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class61 extends class498 {

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "Z")
    public static boolean field875 = false;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "[I")
    public static int[] field879 = new int[13];

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "Lkr;")
    public static class602 field882 = new class602(78, 8);

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public static int field884 = 2;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field883 = -1;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "Lst;")
    public static class335 field885 = new class335(82, 6);

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "Lug;")
    public class61 field878;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "Lug;")
    public class61 field880;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public final void method434(byte arg0) {
        field876++;
        if (this.field878 == null) {
            return;
        }
        this.field878.field880 = this.field880;
        this.field880.field878 = this.field878;
        if (arg0 != -6) {
            method435(-86);
        }
        this.field878 = null;
        this.field880 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method435(int arg0) {
        field879 = null;
        field882 = null;
        if (arg0 <= 35) {
            method435(-5);
        }
        field885 = null;
    }
}
