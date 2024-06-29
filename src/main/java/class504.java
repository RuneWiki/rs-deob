import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class504 extends class56 {

    @OriginalMember(owner = "client!ko", name = "J", descriptor = "I")
    private int field7235;

    @OriginalMember(owner = "client!ko", name = "D", descriptor = "Z")
    public static boolean field7230 = false;

    @OriginalMember(owner = "client!ko", name = "K", descriptor = "I")
    public static int field7236 = 999999;

    @OriginalMember(owner = "client!ko", name = "I", descriptor = "I")
    public static int field7234 = -1;

    @OriginalMember(owner = "client!ko", name = "G", descriptor = "I")
    public static int field7232 = 0;

    @OriginalMember(owner = "client!ko", name = "H", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!ko", name = "L", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!ko", name = "E", descriptor = "Loia;")
    public static class88 field7231;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILee;I)V")
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (arg0 == 3731) {
            if (arg2 == 0) {
                this.field7235 = (arg1.method3750((byte) 35) << 12) / 255;
            }
            ++field7233;
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
    public class504() {
        this(4096);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZ)[I")
    public final int[] method24(int arg0, boolean arg1) {
        ++field7237;
        if (!arg1) {
            method2987(true);
        }
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (super.field673.field8073) {
            class255.method1691(var3, 0, class328.field4576, this.field7235);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(I)V")
    public class504(int arg0) {
        super(0, true);
        this.field7235 = 4096;
        this.field7235 = arg0;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)V")
    public static void method2987(boolean arg0) {
        if (!arg0) {
            field7231 = null;
        }
    }
}
