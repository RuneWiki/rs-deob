import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class711 extends class87 {

    @OriginalMember(owner = "client!mga", name = "x", descriptor = "Lkaa;")
    public static class47 field9841 = new class47(2, 6);

    @OriginalMember(owner = "client!mga", name = "y", descriptor = "I")
    public static int field9842;

    @OriginalMember(owner = "client!mga", name = "z", descriptor = "I")
    public static int field9843;

    @OriginalMember(owner = "client!mga", name = "A", descriptor = "I")
    public static int field9844;

    @OriginalMember(owner = "client!mga", name = "B", descriptor = "I")
    public static int field9845;

    @OriginalMember(owner = "client!mga", name = "C", descriptor = "I")
    public static int field9846;

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "(B)V")
    public static void method3992(byte arg0) {
        if (arg0 <= -85) {
            field9841 = null;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lqda;Z)I")
    public static final int method3993(class105 arg0, boolean arg1) {
        ++field9844;
        if (class282.field3991 != arg0) {
            if (class315.field4498 == arg0) {
                return 6408;
            } else if (class155.field2358 != arg0) {
                if (class555.field7297 == arg0) {
                    return 6409;
                } else if (class628.field8365 == arg0) {
                    return 6410;
                } else if (class427.field5894 == arg0) {
                    return 6145;
                } else {
                    if (!arg1) {
                        field9841 = null;
                    }
                    throw new IllegalStateException();
                }
            } else {
                return 6406;
            }
        } else {
            return 6407;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IIII)V")
    public final void method667(int arg0, int arg1, int arg2, int arg3) {
        super.field1059 = arg2;
        if (arg3 != -13470) {
            method3992((byte) -31);
        }
        super.field1054 = arg1;
        ++field9846;
        super.field1061 = arg0;
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(IIIIIF)V")
    public class711(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(II)V")
    public static final void method3994(int arg0, int arg1) {
        ++field9842;
        class11.field181 = 3;
        class507.field6768 = arg1;
        class208.field3086 = -1;
        class440.field6076 = 100;
        if (arg0 != 6408) {
            field9841 = null;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(FI)V")
    public final void method672(float arg0, int arg1) {
        ++field9843;
        if (arg1 == 2683) {
            super.field1063 = arg0;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IZLnba;)V")
    public static final void method3995(int arg0, boolean arg1, class302 arg2) {
        if (!arg2.field4288) {
            if (arg2.field4279 && ~arg2.field4286 <= -2 && ~arg2.field4289 <= -2 && class719.field10004 + -2 >= arg2.field4286 && arg2.field4289 <= class107.field1453 + -2 && (~arg2.field4280 > -1 || class472.method2659(arg2.field4275, (byte) -111, arg2.field4280))) {
                if (!arg1) {
                    class515.method2875(arg2.field4285, -1, arg2.field4283, -23, arg2.field4284, arg2.field4280, arg2.field4286, arg2.field4275, arg2.field4289);
                } else {
                    class729.method4089(arg2.field4286, arg2.field4282, (byte) 48, arg2.field4283, arg2.field4284, arg2.field4289);
                }
                arg2.field4279 = false;
                if (!arg1 && arg2.field4287 == arg2.field4280 && arg2.field4287 == -1) {
                    arg2.method3564(true);
                } else if (!arg1 && ~arg2.field4287 == ~arg2.field4280 && ~arg2.field4285 == ~arg2.field4278 && ~arg2.field4276 == ~arg2.field4275) {
                    arg2.method3564(true);
                }
            }
        } else if (~arg2.field4287 > -1 || class472.method2659(arg2.field4276, (byte) -111, arg2.field4287)) {
            if (!arg1) {
                class515.method2875(arg2.field4278, -1, arg2.field4283, 109, arg2.field4284, arg2.field4287, arg2.field4286, arg2.field4276, arg2.field4289);
            } else {
                class729.method4089(arg2.field4286, (class379) null, (byte) 48, arg2.field4283, arg2.field4284, arg2.field4289);
            }
            arg2.method3564(true);
        }
        int var3 = 88 / ((-64 - arg0) / 32);
        ++field9845;
    }
}
