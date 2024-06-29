import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class748 {

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "Lkr;")
    public static class602 field10295 = new class602(15, 8);

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "[I")
    public static int[] field10296 = new int[4096];

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "[I")
    public static int[] field10298 = new int[4];

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "Lkr;")
    public static class602 field10297 = new class602(68, 4);

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
    public static void method4159(int arg0) {
        field10298 = null;
        field10297 = null;
        field10296 = null;
        field10295 = null;
        if (arg0 > -125) {
            method4159(88);
        }
    }
}
