import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class487 extends class475 implements class411 {

    @OriginalMember(owner = "client!wga", name = "p", descriptor = "I")
    private int field6814;

    @OriginalMember(owner = "client!wga", name = "q", descriptor = "Z")
    public static boolean field6815 = false;

    @OriginalMember(owner = "client!wga", name = "o", descriptor = "I")
    public static int field6813 = 0;

    @OriginalMember(owner = "client!wga", name = "l", descriptor = "Lkr;")
    public static class602 field6810 = new class602(62, 3);

    @OriginalMember(owner = "client!wga", name = "i", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!wga", name = "j", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!wga", name = "k", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!wga", name = "m", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!wga", name = "n", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!wga", name = "r", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "(B)V", line = 6)
    public static void method2957(byte arg0) {
        int var1 = 55 / ((arg0 - -18) / 47);
        field6810 = null;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Z)V", line = 16)
    public final void method2894(boolean arg0) {
        super.field6615.method3748(this, 106);
        ++field6812;
        if (!arg0) {
            field6810 = null;
        }
    }

    @OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Ldw;I[BIZ)V", line = 27)
    public class487(class664 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field6814 = arg1;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)I", line = 35)
    public final int method742(int arg0) {
        ++field6808;
        if (arg0 != 27594) {
            method2957((byte) -88);
        }
        return this.field6814;
    }

    @OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Ldw;ILjaclib/memory/Buffer;IZ)V", line = 47)
    public class487(class664 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field6814 = arg1;
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(B)J", line = 59)
    public final long method741(byte arg0) {
        ++field6809;
        if (arg0 > -119) {
            this.method2894(false);
        }
        return 0L;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(III[B)V", line = 74)
    public final void method743(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field6816;
        this.method2895(arg3, arg0, 85);
        this.field6814 = arg1;
        if (arg2 != 29764) {
            this.field6814 = 39;
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(B)I", line = 92)
    public final int method745(byte arg0) {
        if (arg0 < 71) {
            return -122;
        } else {
            ++field6807;
            return super.field6621;
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IILha;ILjava/lang/String;III)V", line = 103)
    public static final void method2958(int arg0, int arg1, class548 arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        if (class189.field2584 == null || class674.field9365 == null) {
            if (class671.field9318.method1578(class287.field4123, (byte) -81) && class671.field9318.method1578(class667.field9198, (byte) -81)) {
                class189.field2584 = arg2.method1496(class52.method374(class671.field9318, class287.field4123, 0), true);
                class52 var8 = class52.method374(class671.field9318, class667.field9198, 0);
                class674.field9365 = arg2.method1496(var8, true);
                var8.method375();
                class78.field1136 = arg2.method1496(var8, true);
            } else {
                arg2.method1412(arg7, arg1, arg5, arg6, class292.field4197 | 255 - class593.field8042 << 24, 1);
            }
        }
        ++field6811;
        if (class189.field2584 != null && class674.field9365 != null) {
            int var9 = (arg5 - 2 * class674.field9365.method1955()) / class189.field2584.method1955();
            for (int var10 = 0; var9 > var10; ++var10) {
                class189.field2584.method1970(class674.field9365.method1955() + (arg7 - -(class189.field2584.method1955() * var10)), arg1);
            }
            class674.field9365.method1970(arg7, arg1);
            class78.field1136.method1970(-class78.field1136.method1955() + (arg7 - -arg5), arg1);
        }
        if (arg3 != 14092) {
            field6815 = true;
        }
        class758.field10575.method2505(arg7 + 3, arg3 + -14203, -1, arg4, class126.field1735 | -16777216, arg1 + 14);
        arg2.method1412(arg7, arg1 + arg6, arg5, -arg6 + arg0, -class593.field8042 + 255 << 24 | class292.field4197, 1);
    }
}
