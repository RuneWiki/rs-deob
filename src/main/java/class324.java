import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class324 {

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public int field4480;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public int field4478;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public int field4487;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public int field4482;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "Ldia;")
    public static class618 field4479 = class199.method1212(0);

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field4484 = -1;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "[Luq;")
    public static class318[] field4481;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V", line = 9)
    public static void method2076(boolean arg0) {
        field4479 = null;
        field4481 = null;
        if (arg0) {
            field4484 = -108;
        }
    }

    @OriginalMember(owner = "client!jn", name = "toString", descriptor = "()Ljava/lang/String;", line = 25)
    public final String toString() {
        field4486++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)Z", line = 33)
    public static final boolean method2077(int arg0, int arg1, int arg2) {
        field4483++;
        if (arg0 != -1) {
            method2078(true, 125, true, null, null, 109, -110, -122);
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZIZ[ILdw;III)Lgv;", line = 48)
    public static final class702 method2078(boolean arg0, int arg1, boolean arg2, int[] arg3, class664 arg4, int arg5, int arg6, int arg7) {
        field4485++;
        if (!arg0) {
            field4484 = 126;
        }
        if (!arg4.field9071 && (!class88.method611(arg5, 2) || !class88.method611(arg6, 2))) {
            return arg4.field9057 ? new class702(arg4, 34037, arg5, arg6, arg2, arg3, arg1, arg7) : new class702(arg4, arg5, arg6, class606.method3450(arg5, (byte) -25), class606.method3450(arg6, (byte) -25), arg3);
        } else {
            return new class702(arg4, 3553, arg5, arg6, arg2, arg3, arg1, arg7);
        }
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(IIII)V", line = 66)
    public class324(int arg0, int arg1, int arg2, int arg3) {
        this.field4480 = arg2;
        this.field4478 = arg0;
        this.field4487 = arg3;
        this.field4482 = arg1;
    }
}
