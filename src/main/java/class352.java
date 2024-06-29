import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class352 extends class616 implements class211 {

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    private int field5109;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "Z")
    public static volatile boolean field5108 = true;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "Z")
    public static boolean field5104;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILqp;)V", line = 3)
    public static final void method2218(int arg0, class487 arg1) {
        if (arg1.field6720 != null) {
            arg1.field6720.field10829 = 0;
        }
        ++field5103;
        arg1.field6718 = false;
        for (class487 var2 = arg1.method614(); var2 != null; var2 = arg1.method615()) {
            method2218(47, var2);
        }
        if (arg0 < 21) {
            field5104 = true;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)I", line = 24)
    public final int method866(int arg0) {
        if (arg0 >= -2) {
            this.method867(false);
        }
        ++field5102;
        return super.field8648;
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V", line = 37)
    public final void method1594(int arg0) {
        if (arg0 != -9) {
            this.method866(48);
        }
        ++field5107;
        super.field8655.method1208(0, this);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(Z)J", line = 51)
    public final long method869(boolean arg0) {
        ++field5106;
        if (arg0) {
            this.method867(false);
        }
        return 0L;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)I", line = 64)
    public final int method867(boolean arg0) {
        if (!arg0) {
            field5104 = false;
        }
        ++field5105;
        return this.field5109;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II[BI)V", line = 75)
    public final void method864(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method3556(arg2, (byte) -56, arg0);
        if (arg3 != -26434) {
            method2218(46, (class487) null);
        }
        ++field5110;
        this.field5109 = arg1;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lpq;ILjaclib/memory/Buffer;IZ)V", line = 89)
    public class352(class194 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field5109 = arg1;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lpq;I[BIZ)V", line = 102)
    public class352(class194 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field5109 = arg1;
    }
}
