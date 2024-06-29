import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class253 extends class706 {

    @OriginalMember(owner = "client!eia", name = "t", descriptor = "I")
    public int field3725;

    @OriginalMember(owner = "client!eia", name = "w", descriptor = "I")
    public int field3728;

    @OriginalMember(owner = "client!eia", name = "u", descriptor = "I")
    public int field3726;

    @OriginalMember(owner = "client!eia", name = "s", descriptor = "I")
    public int field3724;

    @OriginalMember(owner = "client!eia", name = "p", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!eia", name = "o", descriptor = "I")
    public int field3720;

    @OriginalMember(owner = "client!eia", name = "r", descriptor = "Lwv;")
    public static class37 field3723 = new class37(0, 19);

    @OriginalMember(owner = "client!eia", name = "x", descriptor = "Lfba;")
    public static class27 field3729 = new class27(44, 8);

    @OriginalMember(owner = "client!eia", name = "y", descriptor = "I")
    public static int field3730 = 2;

    @OriginalMember(owner = "client!eia", name = "v", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!eia", name = "q", descriptor = "Lwia;")
    public static class791 field3722;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)Lsaa;", line = 8)
    public class345 method1656(int arg0) {
        field3727++;
        if (arg0 != 0) {
            this.field3726 = 78;
        }
        return class450.field6161;
    }

    @OriginalMember(owner = "client!eia", name = "<init>", descriptor = "(Lin;Lti;IIIIIIIIIIIII)V", line = 22)
    public class253(class97 arg0, class463 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field3725 = arg14;
        this.field3728 = arg9;
        this.field3726 = arg11;
        this.field3724 = arg12;
        this.field3721 = arg10;
        this.field3720 = arg13;
    }

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "(I)V", line = 44)
    public static void method1657(int arg0) {
        field3729 = null;
        if (arg0 != -22860) {
            field3729 = null;
        }
        field3723 = null;
        field3722 = null;
    }
}
