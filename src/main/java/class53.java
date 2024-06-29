import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class53 extends class223 {

    @OriginalMember(owner = "client!da", name = "I", descriptor = "I")
    public static int field990 = 2;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "I")
    public static int field994 = 0;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    public static int field993 = 0;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "Ltl;")
    public static class531 field988;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "[Lfm;")
    public static class626[] field996;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(FB)V")
    public final void method504(float arg0, byte arg1) {
        if (arg1 < 87) {
            field996 = null;
        }
        super.field3179 = arg0;
        ++field992;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public static void method505(byte arg0) {
        field996 = null;
        field988 = null;
        if (arg0 > -81) {
            method507(-34, 119);
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(IIIIIF)V")
    public class53(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBI)V")
    public final void method506(int arg0, int arg1, byte arg2, int arg3) {
        ++field995;
        if (arg2 != -115) {
            this.method506(-50, -21, (byte) 78, 54);
        }
        super.field3193 = arg0;
        super.field3187 = arg1;
        super.field3194 = arg3;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)Z")
    public static final boolean method507(int arg0, int arg1) {
        int var2 = 64 / ((arg0 - 18) / 34);
        ++field989;
        return arg1 == 0 || arg1 == 1 || ~arg1 == -3;
    }
}
