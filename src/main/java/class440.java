import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class440 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "[[Z")
    public static boolean[][] field6275;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lwfa;Lwfa;I)V", line = 4)
    public static final void method2693(class388 arg0, class388 arg1, int arg2) {
        field6274++;
        if (arg1.field5597 != null) {
            arg1.method2381(15735);
        }
        if (arg2 < -63) {
            arg1.field5596 = arg0;
            arg1.field5597 = arg0.field5597;
            arg1.field5597.field5596 = arg1;
            arg1.field5596.field5597 = arg1;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 26)
    public static void method2694(int arg0) {
        if (arg0 != 14774) {
            field6275 = null;
        }
        field6275 = null;
    }
}
