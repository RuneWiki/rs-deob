import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public abstract class class29 {

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
    public static int field416 = 0;

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "Lad;")
    public static class446 field417 = new class446();

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "Lmo;")
    public static class780 field415;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)V")
    public static void method251(int arg0) {
        field415 = null;
        field417 = null;
        if (arg0 != -7628) {
            method251(35);
        }
    }
}
