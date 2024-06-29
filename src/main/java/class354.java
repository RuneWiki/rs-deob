import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class354 {

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    public static int field4554 = -60;

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "Z")
    public static boolean field4555 = false;

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "I")
    public static int field4557 = 0;

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "F")
    public static float field4556;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "Z")
    public static boolean field4551;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V", line = 12)
    public static final void method2008(byte arg0) {
        field4553++;
        if (arg0 != -86) {
            method2008((byte) 93);
        }
        int var1 = 0;
        if (class674.field9500 != null) {
            var1 = class674.field9500.field5139.method3774(0);
        }
        if (var1 == 2) {
            int var4 = class389.field5428 > 800 ? 800 : class389.field5428;
            class305.field3963 = (class389.field5428 - var4) / 2;
            int var5 = class611.field8696 <= 600 ? class611.field8696 : 600;
            class58.field807 = var4;
            class582.field8281 = var5;
            class614.field8750 = 0;
        } else if (var1 == 1) {
            int var2 = class389.field5428 > 1024 ? 1024 : class389.field5428;
            class305.field3963 = (class389.field5428 - var2) / 2;
            int var3 = class611.field8696 > 768 ? 768 : class611.field8696;
            class58.field807 = var2;
            class614.field8750 = 0;
            class582.field8281 = var3;
        } else {
            class614.field8750 = 0;
            class305.field3963 = 0;
            class582.field8281 = class611.field8696;
            class58.field807 = class389.field5428;
        }
    }
}
