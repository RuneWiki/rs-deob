import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class152 {

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "[S")
    public static short[] field2149 = new short[256];

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "[Lie;")
    public static class6[] field2148 = new class6[4];

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 3)
    public static void method1029(int arg0) {
        field2149 = null;
        field2148 = null;
        if (arg0 != 256) {
            method1029(95);
        }
    }
}
