import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class219 extends class248 {

    @OriginalMember(owner = "client!cha", name = "d", descriptor = "I")
    public static int field3167 = 0;

    @OriginalMember(owner = "client!cha", name = "e", descriptor = "[F")
    public static float[] field3168 = new float[4];

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(Z)V")
    public static void method1561(boolean arg0) {
        if (!arg0) {
            method1561(false);
        }
        field3168 = null;
    }
}
