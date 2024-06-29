import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class249 {

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "[I")
    public static int[] field4299 = new int[32];

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Lhi;")
    private static class82 field4303 = class95.method664((byte) -119, "Walk here");

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Lhi;")
    public static class82 field4302 = field4303;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Z")
    public static boolean field4301 = true;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lum;")
    public static class222 field4296;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V", line = 4)
    public static void method1793(byte arg0) {
        field4302 = null;
        if (arg0 < 69) {
            field4301 = true;
        }
        field4303 = null;
        field4299 = null;
        field4296 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 29)
    public static final void method1794(int arg0) {
        int[] var1 = new int[class183.field3125];
        field4297++;
        int var2 = arg0;
        for (int var3 = 0; var3 < class183.field3125; var3++) {
            class312 var4 = class273.method1912(var3, -125);
            if (var4.field5327 >= 0 || var4.field5325 >= 0) {
                var1[var2++] = var3;
            }
        }
        class159.field2752 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class159.field2752[var5] = var1[var5];
        }
    }
}
