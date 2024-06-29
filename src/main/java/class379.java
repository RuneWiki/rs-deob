import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class379 {

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5382 = "green:";

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field5381 = -1;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method2403(boolean arg0) {
        if (arg0) {
            class443.field6447 = class265.field3980;
            class50.field816 = class18.field262;
        } else {
            class443.field6447 = class317.field4594;
            class50.field816 = class311.field4527;
        }
        class13.field218 = class443.field6447.length;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)I", line = 23)
    public static final int method2404(int arg0) {
        field5379++;
        if (class176.field2633) {
            return 0;
        } else if (!class122.method1034(arg0 ^ 0x5DE5)) {
            return 1;
        } else if (arg0 == 0) {
            return class47.field758 ? 2 : 1;
        } else {
            return 45;
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V", line = 40)
    public static void method2405(int arg0) {
        if (arg0 != 1) {
            method2403(false);
        }
        field5382 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lmb;IBI)V", line = 62)
    public static final void method2406(class258 arg0, int arg1, byte arg2, int arg3) {
        class221.field3300 = arg1;
        field5380++;
        class276.field4159 = arg3;
        int var4 = 121 % ((-arg2 - 31) / 55);
        class129.field2110 = arg0;
    }
}
