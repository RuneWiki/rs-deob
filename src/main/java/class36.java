import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class36 {

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "B")
    public static byte field621;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "Lel;")
    public static class213 field625;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "[[[I")
    public static int[][][] field622;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static void method337(int arg0) {
        if (arg0 != -2918) {
            method337(-128);
        }
        field622 = null;
        field625 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BIIII)V")
    public static final void method338(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -109 % ((arg0 - 55) / 61);
        field624++;
        if (arg3 >= class184.field2914 && arg3 <= class2.field42) {
            int var6 = class47.method396(class112.field1727, arg4, 80, class278.field4410);
            int var7 = class47.method396(class112.field1727, arg1, -82, class278.field4410);
            class170.method1224(var6, (byte) -53, arg2, arg3, var7);
        }
    }
}
