import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class653 extends class496 {

    @OriginalMember(owner = "client!gn", name = "G", descriptor = "I")
    public int field9403;

    @OriginalMember(owner = "client!gn", name = "K", descriptor = "Z")
    public static boolean field9407 = false;

    @OriginalMember(owner = "client!gn", name = "H", descriptor = "I")
    public static int field9404;

    @OriginalMember(owner = "client!gn", name = "I", descriptor = "I")
    public static int field9405;

    @OriginalMember(owner = "client!gn", name = "J", descriptor = "I")
    public static int field9406;

    @OriginalMember(owner = "client!gn", name = "L", descriptor = "I")
    public static int field9408;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZIZ)V")
    public static final void method3722(boolean arg0, int arg1, boolean arg2) {
        field9404++;
        class37.field1050 = 3;
        class163.field2735 = arg1;
        if (!arg2) {
            field9407 = true;
        }
        class22.method451(-84, class366.field5432.field4419, class366.field5432.field4425);
        if (arg0) {
            class210.method1471(false, "", (byte) -1, "");
        } else {
            class598.method3402(-1);
            class210.method1471(false, class118.field2098, (byte) -123, class110.field1925);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)[Lsc;")
    public static final class320[] method3723(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field9408++;
            return new class320[] { class207.field3170, class158.field2691, class557.field7890 };
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lsc;Lia;IIIIIIIIIIIIII)V")
    public class653(class320 arg0, class547 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field9403 = arg15;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)Lph;")
    public final class598 method474(int arg0) {
        field9406++;
        if (arg0 != 6686) {
            this.field9403 = -76;
        }
        return class165.field2754;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIILda;Lbm;I)V")
    public static final void method3724(int arg0, int arg1, int arg2, class55 arg3, class98 arg4, int arg5) {
        field9405++;
        if (arg3 != null) {
            arg4.method929(arg3.method369(), arg3.method343(), arg0, arg2 - 30935, arg5, arg1, arg3.method315(), arg3.method328(), arg3.method327(), arg3.method330(), arg3.method354());
            if (arg2 != 30955) {
                field9407 = true;
            }
        }
    }
}
