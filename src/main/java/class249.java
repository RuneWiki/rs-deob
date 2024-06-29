import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class249 {

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field3992 = 0;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "Lcg;")
    public static class36 field3989;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "[I")
    public static int[] field3993;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method1644(int arg0) {
        field3993 = null;
        if (arg0 == 0) {
            field3989 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V")
    public static final void method1645(boolean arg0) {
        if (arg0) {
            method1647(76, 105, -91, -115, 38, -81);
        }
        class197.field3176.method1834(0);
        field3990++;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
    public static final void method1646(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class66.field944[var1] = false;
        }
        class61.field837 = -1;
        class248.field3984 = -1;
        class92.field1316 = 5;
        class124.field2075 = arg0;
        class34.field420 = 0;
        field3986++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIII)V")
    public static final void method1647(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3987++;
        if (arg0 != 0) {
            method1644(78);
        }
        for (int var6 = arg4; var6 <= arg2; var6++) {
            class168.method1184(arg0 ^ 0x80, arg3, arg1, arg5, class85.field1162[var6]);
        }
    }
}
