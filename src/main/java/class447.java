import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class447 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Ldq;")
    public static class493 field6398 = new class493(79, 8);

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "Ldq;")
    public static class493 field6399 = new class493(85, 6);

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "Ljava/awt/Image;")
    public static Image field6400;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method2628(int arg0) {
        field6399 = null;
        field6398 = null;
        if (arg0 != 79) {
            method2628(-103);
        }
        field6400 = null;
    }
}
