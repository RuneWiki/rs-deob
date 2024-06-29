import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class254 {

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "Lid;")
    public static class390 field3455 = new class390();

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "Lra;")
    public static class361 field3457 = new class361(77, 16);

    @OriginalMember(owner = "client!eba", name = "f", descriptor = "Lmv;")
    public static class297 field3458 = new class297(4, 1, 1, 1);

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "I")
    public static int field3456;

    // $FF: synthetic field
    @OriginalMember(owner = "client!eba", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field3459;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZIII)Z")
    public static final boolean method1604(boolean arg0, int arg1, int arg2, int arg3) {
        field3453++;
        class620 var4 = (class620) class549.method2909(arg3, arg2, arg1);
        boolean var5 = arg0;
        if (var4 != null) {
            var5 = arg0 & class270.method1655(true, var4);
        }
        class620 var6 = (class620) class47.method432(arg3, arg2, arg1, field3459 == null ? (field3459 = method1608("ut")) : field3459);
        if (var6 != null) {
            var5 &= class270.method1655(true, var6);
        }
        class620 var7 = (class620) class377.method2155(arg3, arg2, arg1);
        if (var7 != null) {
            var5 &= class270.method1655(arg0, var7);
        }
        return var5;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V")
    public static void method1605(byte arg0) {
        if (arg0 < -23) {
            field3457 = null;
            field3455 = null;
            field3458 = null;
        }
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(B)Ljava/lang/String;")
    public static final String method1606(byte arg0) {
        if (arg0 != 11) {
            field3457 = null;
        }
        field3456++;
        return class594.field8025 || class218.field2855 == null ? "" : class218.field2855.field770;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(BLoa;Lgr;)I")
    public static final int method1607(byte arg0, class43 arg1, class612 arg2) {
        if (arg0 != 6) {
            method1607((byte) 83, null, null);
        }
        field3454++;
        if (arg2.field8262 != -1) {
            return arg2.field8262;
        }
        if (arg2.field8270 != -1) {
            class59 var3 = arg1.field598.method3162((byte) -104, arg1.method340() ? arg2.field8270 : arg2.field8268);
            if (!var3.field799) {
                return var3.field804;
            }
        }
        return arg2.field8275;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1608(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
