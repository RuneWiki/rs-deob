import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public class class743 extends class458 implements class212 {

    @OriginalMember(owner = "client!fka", name = "f", descriptor = "I")
    private int field10266;

    @OriginalMember(owner = "client!fka", name = "c", descriptor = "I")
    public static int field10263;

    @OriginalMember(owner = "client!fka", name = "d", descriptor = "I")
    public static int field10264;

    @OriginalMember(owner = "client!fka", name = "g", descriptor = "I")
    public static int field10267;

    @OriginalMember(owner = "client!fka", name = "h", descriptor = "I")
    public static int field10268;

    @OriginalMember(owner = "client!fka", name = "i", descriptor = "I")
    public static int field10269;

    @OriginalMember(owner = "client!fka", name = "e", descriptor = "Lgj;")
    public static class662 field10265;

    @OriginalMember(owner = "client!fka", name = "c", descriptor = "(B)I", line = 3)
    public final int method1494(byte arg0) {
        if (arg0 >= -61) {
            this.method1491((byte) 25);
        }
        ++field10264;
        return 0;
    }

    @OriginalMember(owner = "client!fka", name = "<init>", descriptor = "(Lhk;ILjaclib/memory/Buffer;)V", line = 15)
    public class743(class111 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field10266 = arg1;
    }

    @OriginalMember(owner = "client!fka", name = "b", descriptor = "(B)J", line = 23)
    public final long method1492(byte arg0) {
        ++field10269;
        if (arg0 != 124) {
            this.field10266 = 63;
        }
        return super.field6229.getAddress();
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(B)I", line = 35)
    public final int method1491(byte arg0) {
        ++field10268;
        int var2 = 105 / ((arg0 - -10) / 48);
        return this.field10266;
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "([BIII)V", line = 45)
    public final void method1493(byte[] arg0, int arg1, int arg2, int arg3) {
        this.method2637(arg0, arg2);
        ++field10263;
        if (arg3 != -13172) {
            field10265 = null;
        }
        this.field10266 = arg1;
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(Z)V", line = 63)
    public static void method4126(boolean arg0) {
        if (arg0) {
            method4126(false);
        }
        field10265 = null;
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "([Ljava/lang/Object;B[I)V", line = 76)
    public static final void method4127(Object[] arg0, byte arg1, int[] arg2) {
        ++field10267;
        if (arg1 != 73) {
            method4126(true);
        }
        class650.method3644(arg2.length + -1, 0, arg0, arg2, false);
    }

    @OriginalMember(owner = "client!fka", name = "<init>", descriptor = "(Lhk;I[BI)V", line = 87)
    public class743(class111 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field10266 = arg1;
    }
}
