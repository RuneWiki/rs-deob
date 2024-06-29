import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public abstract class class528 extends class260 {

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "J")
    public static long field7804 = 0L;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "Lnj;")
    public static class162 field7803 = new class162(260);

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "[Ll;")
    public static class16[] field7802;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)I")
    public abstract int method2749(int arg0);

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "(I)V")
    public static void method3133(int arg0) {
        if (arg0 == -7855) {
            field7802 = null;
            field7803 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "(I)I")
    public abstract int method2747(int arg0);

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "(I)I")
    public abstract int method2741(int arg0);

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "(I)J")
    public abstract long method2752(int arg0);
}
