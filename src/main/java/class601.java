import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class601 extends class209 {

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "[Ldk;")
    public static class88[] field8529 = new class88[300];

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "Z")
    public static boolean field8527 = false;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "Lbda;")
    public static class717 field8528 = new class717();

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "I")
    public static int field8530;

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "I")
    public static int field8531;

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "I")
    public static int field8533;

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "I")
    public static int field8534;

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "Lgg;")
    public static class398 field8535;

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "Lsca;")
    public static class432 field8532;

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "[B")
    private byte[] field8536;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBI)V", line = 3)
    public final void method1489(int arg0, byte arg1, int arg2) {
        field8531++;
        int var4 = arg0 * 2;
        if (arg2 >= 59) {
            byte var5 = (byte) ((arg1 >> 1 & 0x7F) + 127);
            this.field8536[var4++] = var5;
            this.field8536[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(IIII)[B", line = 18)
    public final byte[] method3505(int arg0, int arg1, int arg2, int arg3) {
        this.field8536 = new byte[arg0 * arg2 * arg1 * 2];
        if (arg3 != 4095) {
            field8528 = null;
        }
        field8533++;
        this.method1686(arg0, -127, arg1, arg2);
        return this.field8536;
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)Lra;", line = 38)
    public static final class757 method3506(int arg0) {
        field8530++;
        int var1 = 39 % ((-arg0 - 5) / 46);
        return class328.method2017(1, false);
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 49)
    public class601() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "(I)V", line = 57)
    public static void method3507(int arg0) {
        field8535 = null;
        field8528 = null;
        field8529 = null;
        if (arg0 != -18420) {
            field8527 = false;
        }
        field8532 = null;
    }
}
