import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class301 extends class237 {

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "Z")
    public static boolean field4287 = false;

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "Lib;")
    public static class105 field4282 = new class105(16);

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "Lao;")
    public static class188 field4288 = new class188(7, 12);

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "Lao;")
    public static class188 field4289 = new class188(73, 6);

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "I")
    public int field4283;

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "I")
    public int field4284;

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
    public int field4285;

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
    public int field4286;

    @OriginalMember(owner = "client!ks", name = "k", descriptor = "Lir;")
    public class22 field4280;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)V")
    public static void method1857(int arg0) {
        field4288 = null;
        field4282 = null;
        field4289 = null;
        if (arg0 != 6) {
            field4287 = true;
        }
    }
}
