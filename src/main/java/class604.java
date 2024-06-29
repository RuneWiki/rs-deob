import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class604 {

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field8151;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Lqq;")
    public static class502 field8150;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3441(int arg0) {
        class48.method454(11, -1);
        field8151++;
        int var1 = 93 / ((21 - arg0) / 37);
        class697.method3882(20068);
        System.gc();
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V", line = 15)
    public static void method3442(int arg0) {
        field8150 = null;
        if (arg0 != -17412) {
            method3441(103);
        }
    }
}
