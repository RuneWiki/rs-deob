import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class331 extends class145 implements class682 {

    @OriginalMember(owner = "client!uv", name = "r", descriptor = "I")
    private int field4871;

    @OriginalMember(owner = "client!uv", name = "n", descriptor = "Luc;")
    public static class27 field4867 = new class27(23, -1);

    @OriginalMember(owner = "client!uv", name = "l", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!uv", name = "o", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!uv", name = "p", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!uv", name = "q", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Len;I[BIZ)V")
    public class331(class289 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field4871 = arg1;
    }

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "(B)V")
    public static void method2000(byte arg0) {
        if (arg0 != -68) {
            field4867 = null;
        }
        field4867 = null;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(II[BI)V")
    public final void method2001(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field4869;
        this.method1020(35040, arg2, arg3);
        this.field4871 = arg1;
        if (arg0 > -51) {
            this.method1019(true);
        }
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)I")
    public final int method2002(byte arg0) {
        ++field4865;
        return arg0 >= -103 ? 74 : super.field2160;
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Len;ILjaclib/memory/Buffer;IZ)V")
    public class331(class289 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field4871 = arg1;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)J")
    public final long method2003(boolean arg0) {
        if (arg0) {
            this.method1019(false);
        }
        ++field4870;
        return 0L;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)I")
    public final int method2004(byte arg0) {
        int var2 = -39 / ((-6 - arg0) / 33);
        ++field4868;
        return this.field4871;
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(Z)V")
    public final void method1019(boolean arg0) {
        if (!arg0) {
            this.method2001(11, 55, (byte[]) null, -36);
        }
        ++field4866;
        super.field2159.method1757(this, -90);
    }
}
