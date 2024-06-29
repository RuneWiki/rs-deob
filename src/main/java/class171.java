import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class171 extends class331 implements class116 {

    @OriginalMember(owner = "client!js", name = "i", descriptor = "I")
    private int field2407;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public static int field2403 = 0;

    @OriginalMember(owner = "client!js", name = "k", descriptor = "F")
    public static float field2409;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!js", name = "j", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)I", line = 4)
    public final int method822(boolean arg0) {
        if (arg0) {
            return 104;
        } else {
            ++field2401;
            return this.field2407;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ZIILla;BLeg;I)V", line = 16)
    public static final void method1215(boolean arg0, int arg1, int arg2, class423 arg3, byte arg4, class317 arg5, int arg6) {
        class219.method1545(arg0, arg4 + 67, arg2, arg3, arg6, arg1);
        ++field2405;
        class11.field98 = arg5;
        if (arg4 != -67) {
            method1215(false, 102, 48, (class423) null, (byte) 51, (class317) null, -97);
        }
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lkw;I[BI)V", line = 28)
    public class171(class346 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field2407 = arg1;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B)I", line = 37)
    public final int method823(byte arg0) {
        if (arg0 >= -55) {
            this.method821(110, 107, (byte[]) null, (byte) -64);
        }
        ++field2408;
        return 0;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II[BB)V", line = 54)
    public final void method821(int arg0, int arg1, byte[] arg2, byte arg3) {
        ++field2406;
        this.method2038(arg2, arg0);
        if (arg3 != -64) {
            this.method820(29);
        }
        this.field2407 = arg1;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)J", line = 71)
    public final long method820(int arg0) {
        if (arg0 != 23579) {
            return 45L;
        } else {
            ++field2404;
            return super.field4494.getAddress();
        }
    }
}
