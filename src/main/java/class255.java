import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class255 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Llh;")
    public static class492 field3277 = new class492("LIVE", 0);

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field3278 = -1;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 17)
    public static void method1532(int arg0) {
        field3277 = null;
        if (arg0 > -65) {
            method1532(124);
        }
    }
}
