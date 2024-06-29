import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class193 extends class759 implements class126 {

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    private int field2578;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "J")
    public static long field2577 = -1L;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Leea;I[BIZ)V")
    public class193(class131 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2578 = arg1;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V")
    public static final void method1196(int arg0, int arg1, int arg2) {
        if (~class328.field4576 != ~arg1) {
            class132.field1945 = new int[arg1];
            for (int var3 = 0; arg1 > var3; ++var3) {
                class132.field1945[var3] = (var3 << 12) / arg1;
            }
            class328.field4576 = arg1;
            class340.field4702 = arg1 * 32;
            class445.field6318 = arg1 + -1;
        }
        ++field2587;
        if (arg0 != -11775) {
            method1197(60);
        }
        if (class226.field3050 != arg2) {
            if (class328.field4576 == arg2) {
                class720.field10000 = class132.field1945;
            } else {
                class720.field10000 = new int[arg2];
                for (int var4 = 0; arg2 > var4; ++var4) {
                    class720.field10000[var4] = (var4 << 12) / arg2;
                }
            }
            class226.field3050 = arg2;
            class636.field8759 = arg2 + -1;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III[B)V")
    public final void method851(int arg0, int arg1, int arg2, byte[] arg3) {
        this.method4210(true, arg0, arg3);
        if (arg1 != 506) {
            this.method851(-66, -85, -112, (byte[]) null);
        }
        ++field2586;
        this.field2578 = arg2;
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
    public static final void method1197(int arg0) {
        ++field2585;
        if (class277.field3922 != class209.field2756) {
            try {
                class113.method797("tbrefresh", 102, class499.field7161);
                if (arg0 > -120) {
                    method1197(-95);
                }
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
    public final void method1198(byte arg0) {
        super.field10548.method921(this, false);
        ++field2584;
        if (arg0 <= 33) {
            field2577 = -123L;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)J")
    public final long method853(byte arg0) {
        if (arg0 != 42) {
            return 103L;
        } else {
            ++field2581;
            return 0L;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)I")
    public final int method852(int arg0) {
        ++field2582;
        int var2 = -108 % ((arg0 - -32) / 48);
        return super.field10547;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Leea;ILjaclib/memory/Buffer;IZ)V")
    public class193(class131 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2578 = arg1;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)I")
    public final int method850(int arg0) {
        int var2 = -27 / ((-70 - arg0) / 45);
        ++field2579;
        return this.field2578;
    }
}
