import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class349 {

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "Lrga;")
    public static class280 field4461 = new class280(68, 8);

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Lwea;")
    public static class259 field4462 = new class259(5, 1);

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Z")
    public static boolean field4463 = false;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "F")
    public static float field4464;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static void method1928(byte arg0) {
        field4462 = null;
        int var1 = 6 % ((arg0 + 52) / 53);
        field4461 = null;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)[Lct;")
    public static final class414[] method1929(byte arg0) {
        field4460++;
        if (arg0 != 87) {
            field4462 = null;
        }
        return new class414[] { class36.field494, class314.field4048, class686.field9628 };
    }
}
