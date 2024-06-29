import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class525 extends class381 {

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field6998 = 0;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field6996;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field7000;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "Lbi;")
    public static class449 field6997;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "[B")
    public static byte[] field6999;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)V", line = 6)
    public static final void method2934(int arg0, int arg1, int arg2) {
        field6996++;
        class683.field9616 = arg0 - class567.field7529;
        class615.field8140 = arg1 - class567.field7515;
        if (arg2 != 0) {
            field6997 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V", line = 23)
    public static void method2935(int arg0) {
        field6999 = null;
        field6997 = null;
        if (arg0 <= 77) {
            method2935(-72);
        }
    }
}
