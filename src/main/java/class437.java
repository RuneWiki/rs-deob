import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class437 extends class41 implements class306 {

    @OriginalMember(owner = "client!oga", name = "t", descriptor = "I")
    private int field6391;

    @OriginalMember(owner = "client!oga", name = "n", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!oga", name = "p", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!oga", name = "q", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!oga", name = "r", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!oga", name = "s", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!oga", name = "u", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!oga", name = "o", descriptor = "[I")
    public static int[] field6386;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)I", line = 3)
    public static final int method2599(int arg0, int arg1) {
        return class386.field5441 != null ? class386.field5441[arg0][arg1] & 65535 : 0;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I[BBI)V", line = 8)
    public final void method1948(int arg0, byte[] arg1, byte arg2, int arg3) {
        this.method461(arg0, (byte) -70, arg1);
        ++field6385;
        if (arg2 < -51) {
            this.field6391 = arg3;
        }
    }

    @OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Lok;I[BIZ)V", line = 22)
    public class437(class228 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field6391 = arg1;
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)I", line = 31)
    public final int method1950(int arg0) {
        ++field6389;
        return arg0 > -29 ? 20 : this.field6391;
    }

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "(I)J", line = 42)
    public final long method1951(int arg0) {
        ++field6387;
        return arg0 != -27189 ? 19L : 0L;
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(B)V", line = 53)
    public final void method463(byte arg0) {
        ++field6390;
        if (arg0 != -3) {
            this.method1949(-51);
        }
        super.field679.method1538(this, 768);
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(Z)V", line = 65)
    public static void method2600(boolean arg0) {
        if (arg0) {
            field6386 = null;
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)I", line = 76)
    public final int method1949(int arg0) {
        int var2 = 77 % ((-36 - arg0) / 61);
        ++field6388;
        return super.field677;
    }
}
