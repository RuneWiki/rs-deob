import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class287 {

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "[F")
    public static float[] field4121 = new float[16];

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "Luu;")
    public static class237 field4122;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)V")
    public static void method1904(int arg0) {
        field4122 = null;
        if (arg0 == 0) {
            field4121 = null;
        }
    }
}
