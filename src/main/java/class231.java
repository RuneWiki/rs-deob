import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class231 extends class172 {

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "Lrc;")
    public class83 field3835;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "Z")
    public static boolean field3834 = false;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "Lka;")
    public static class106 field3833 = new class106();

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public static int field3836 = 0;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    public static int field3837 = 0;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "[I")
    public static int[] field3841 = new int[32];

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field3840 = " is already on your friend list.";

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "Lml;")
    public static class17 field3839;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLth;Lth;)V", line = 11)
    public static final void method1786(byte arg0, class57 arg1, class57 arg2) {
        class238.field3926 = arg2;
        class129.field2185 = arg1;
        field3838++;
        if (arg0 != -48) {
            field3840 = (String) null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)V", line = 24)
    public static void method1787(int arg0) {
        field3840 = null;
        field3841 = null;
        field3833 = null;
        field3839 = null;
        if (arg0 != -22137) {
            field3833 = (class106) null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lrc;)V", line = 46)
    public class231(class83 arg0) {
        this.field3835 = arg0;
    }
}
