import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class160 {

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "[F")
    public static float[] field2065 = new float[16];

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V", line = 3)
    public static void method1023(byte arg0) {
        field2065 = null;
        int var1 = 66 / ((arg0 + 8) / 62);
    }
}
