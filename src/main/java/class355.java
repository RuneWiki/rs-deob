import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class355 extends class337 {

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
    public int field5459 = -1;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "Z")
    public boolean field5463 = false;

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "[I")
    public static int[] field5461 = new int[14];

    @OriginalMember(owner = "client!cn", name = "y", descriptor = "I")
    public static int field5467 = 0;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public int field5458;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
    public int field5460;

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
    public int field5462;

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
    public int field5465;

    @OriginalMember(owner = "client!cn", name = "x", descriptor = "I")
    public int field5466;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIII)V")
    public static final void method2220(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class200.field2889 != null) {
            class200.field2889[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class339.field4778 != null) {
            class339.field4778[arg0][arg1] = (byte) (arg3 >> 3);
        }
        if (class180.field2647 != null) {
            class180.field2647[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V")
    public static final void method2221(int arg0, int arg1) {
        class42.field638 = arg1;
        field5464++;
        class29.field302.method1540(arg0);
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(I)V")
    public class355(int arg0) {
        this.field5459 = arg0;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
    public static void method2222(int arg0) {
        field5461 = null;
        int var1 = 6 % ((-arg0 - 1) / 60);
    }
}
