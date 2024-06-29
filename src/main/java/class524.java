import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class524 extends class140 {

    @OriginalMember(owner = "client!um", name = "v", descriptor = "I")
    public int field7263;

    @OriginalMember(owner = "client!um", name = "x", descriptor = "I")
    public int field7265;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "I")
    public int field7266;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "I")
    public int field7262;

    @OriginalMember(owner = "client!um", name = "s", descriptor = "I")
    public int field7260;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "I")
    public int field7258;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "Lin;")
    public static class91 field7264;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "[[Z")
    public static boolean[][] field7259;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)Lad;")
    public class426 method119(byte arg0) {
        field7257++;
        return arg0 <= 116 ? null : class681.field9229;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V")
    public static final void method3038(int arg0) {
        class112 var1 = class477.field6656;
        synchronized (class477.field6656) {
            class477.field6656.method999(0);
        }
        field7261++;
        class112 var2 = class491.field6800;
        synchronized (class491.field6800) {
            class491.field6800.method999(0);
        }
        if (arg0 != -15326) {
            method3038(-67);
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lsd;Lec;IIIIIIIIIIIII)V")
    public class524(class95 arg0, class236 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field7263 = arg13;
        this.field7265 = arg12;
        this.field7266 = arg11;
        this.field7262 = arg9;
        this.field7260 = arg14;
        this.field7258 = arg10;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)V")
    public static void method3039(int arg0) {
        if (arg0 == 19499) {
            field7259 = null;
            field7264 = null;
        }
    }
}
