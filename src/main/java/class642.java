import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class642 extends class405 implements class682 {

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    private int field9132;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Lfc;")
    public static class235 field9130 = new class235(15, 3);

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field9126;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field9127;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field9128;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field9129;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field9131;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)I", line = 4)
    public final int method2004(byte arg0) {
        ++field9127;
        int var2 = -44 % ((-6 - arg0) / 33);
        return this.field9132;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Len;I[BI)V", line = 15)
    public class642(class289 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field9132 = arg1;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Len;ILjaclib/memory/Buffer;)V", line = 26)
    public class642(class289 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field9132 = arg1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 35)
    public static void method3578(int arg0) {
        if (arg0 != 3) {
            method3579((byte) -19, (class638) null);
        }
        field9130 = null;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)I", line = 46)
    public final int method2002(byte arg0) {
        ++field9126;
        return arg0 > -103 ? 104 : 0;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLoa;)V", line = 60)
    public static final void method3579(byte arg0, class638 arg1) {
        int var2 = -24 % ((50 - arg0) / 32);
        if (class36.field450) {
            class295.method1844(arg1, 8);
        } else {
            class7.method38(arg1, (byte) 54);
        }
        ++field9128;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[BI)V", line = 75)
    public final void method2001(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method2314(arg2, arg3);
        if (arg0 <= -51) {
            ++field9129;
            this.field9132 = arg1;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)J", line = 89)
    public final long method2003(boolean arg0) {
        ++field9131;
        if (arg0) {
            this.method2002((byte) -126);
        }
        return super.field5723.getAddress();
    }
}
