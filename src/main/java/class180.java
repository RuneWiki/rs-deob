import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class180 extends class470 implements class61 {

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    private int field2793;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "Lfba;")
    public static class27 field2791 = new class27(52, 7);

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field2796 = 0;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field2795 = 0;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)I", line = 3)
    public final int method408(int arg0) {
        ++field2794;
        return arg0 <= 102 ? 41 : this.field2793;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)I", line = 14)
    public final int method407(boolean arg0) {
        if (arg0) {
            return -83;
        } else {
            ++field2798;
            return super.field6594;
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V", line = 25)
    public final void method1247(int arg0) {
        if (arg0 != -21795) {
            field2791 = null;
        }
        super.field6595.method807(this, 121);
        ++field2800;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)J", line = 36)
    public final long method409(byte arg0) {
        if (arg0 != -58) {
            this.field2793 = 33;
        }
        ++field2797;
        return 0L;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III[B)V", line = 47)
    public final void method410(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field2792;
        if (arg1 == -9859) {
            this.method2797(arg0, arg3, (byte) -127);
            this.field2793 = arg2;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lqfa;I[BIZ)V", line = 59)
    public class180(class106 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2793 = arg1;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V", line = 67)
    public static void method1291(int arg0) {
        if (arg0 <= 53) {
            method1291(-85);
        }
        field2791 = null;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lqfa;ILjaclib/memory/Buffer;IZ)V", line = 88)
    public class180(class106 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2793 = arg1;
    }
}
