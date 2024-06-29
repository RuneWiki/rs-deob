import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class263 {

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "[J")
    public static long[] field4179 = new long[32];

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "[I")
    public static int[] field4178 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "J")
    public static long field4180 = 0L;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field4181 = 0;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 6)
    public static void method1834(int arg0) {
        field4179 = null;
        if (arg0 != 29927) {
            field4181 = 101;
        }
        field4178 = null;
    }
}
