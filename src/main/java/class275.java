import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class275 {

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Z")
    public static boolean field4289 = false;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4290 = "M";

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field4288 = -1;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "[Laf;")
    public static class189[] field4287;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "[Lja;")
    public static class70[] field4286;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 4)
    public static void method1980(int arg0) {
        field4287 = null;
        field4290 = null;
        if (arg0 <= -125) {
            field4286 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V", line = 29)
    public static final void method1981(int arg0, boolean arg1) {
        class10.field136 = arg1;
        class337.field5207 = !class339.method2348((byte) 69);
        field4291++;
        if (arg0 > -87) {
            field4289 = false;
        }
    }
}
