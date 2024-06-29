import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class376 extends class577 {

    @OriginalMember(owner = "client!up", name = "D", descriptor = "Ltb;")
    public static class450 field4740 = new class450(8);

    @OriginalMember(owner = "client!up", name = "I", descriptor = "Z")
    public static boolean field4745 = false;

    @OriginalMember(owner = "client!up", name = "G", descriptor = "Lrga;")
    public static class280 field4743 = new class280(58, 2);

    @OriginalMember(owner = "client!up", name = "K", descriptor = "Ltb;")
    public static class450 field4747 = new class450(4);

    @OriginalMember(owner = "client!up", name = "B", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!up", name = "C", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!up", name = "E", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!up", name = "H", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!up", name = "J", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!up", name = "L", descriptor = "Lqi;")
    public static class514 field4748;

    @OriginalMember(owner = "client!up", name = "F", descriptor = "[B")
    private byte[] field4742;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IBB)V")
    public final void method2041(int arg0, byte arg1, byte arg2) {
        field4739++;
        if (arg1 != -76) {
            return;
        }
        byte var4 = (byte) (((arg2 & 0xFF) >> 1) + 127);
        int var5 = arg0 * 2;
        int var6 = var5 + 1;
        this.field4742[var5] = var4;
        this.field4742[var6] = var4;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIII)[B")
    public final byte[] method2042(int arg0, int arg1, int arg2, int arg3) {
        this.field4742 = new byte[arg1 * 2 * arg2 * arg3];
        field4741++;
        this.method831((byte) 125, arg1, arg3, arg2);
        if (arg0 != 12743) {
            field4740 = null;
        }
        return this.field4742;
    }

    @OriginalMember(owner = "client!up", name = "e", descriptor = "(I)Ljava/lang/String;")
    public static final String method2043(int arg0) {
        field4746++;
        if (arg0 != 58) {
            method2043(-7);
        }
        return class84.field1188 || class111.field1458 == null ? "" : class111.field1458.field1862;
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "()V")
    public class376() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!up", name = "d", descriptor = "(B)V")
    public static void method2044(byte arg0) {
        if (arg0 < 21) {
            method2044((byte) 66);
        }
        field4747 = null;
        field4748 = null;
        field4740 = null;
        field4743 = null;
    }
}
