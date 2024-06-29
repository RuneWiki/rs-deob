import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class250 {

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field4507 = 0;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "Llc;")
    public static class143 field4508 = class66.method374(")3runescape)3com)4l=", -1);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "[Lcd;")
    public static class58[] field4510 = new class58[4];

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static final void method1660(int arg0) {
        field4503++;
        class10.field216++;
        if (arg0 != -18512) {
            field4510 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
    public static final void method1661(boolean arg0) {
        field4506++;
        if (arg0) {
            class282.field4971.method823(true);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIBII)V")
    public static final void method1662(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg4 <= arg3) {
            for (int var5 = arg4; var5 < arg3; var5++) {
                class15.field268[var5][arg1] = arg0;
            }
        } else {
            for (int var6 = arg3; var6 < arg4; var6++) {
                class15.field268[var6][arg1] = arg0;
            }
        }
        if (arg2 != 17) {
            field4508 = null;
        }
        field4504++;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public static void method1663(int arg0) {
        field4510 = null;
        field4508 = null;
        if (arg0 != 18467) {
            method1661(true);
        }
    }
}
