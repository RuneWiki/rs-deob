import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class629 extends class305 {

    @OriginalMember(owner = "client!laa", name = "E", descriptor = "I")
    public static int field8707 = 0;

    @OriginalMember(owner = "client!laa", name = "F", descriptor = "J")
    public static long field8708 = 0L;

    @OriginalMember(owner = "client!laa", name = "J", descriptor = "Z")
    public static boolean field8712 = false;

    @OriginalMember(owner = "client!laa", name = "D", descriptor = "I")
    public static int field8706;

    @OriginalMember(owner = "client!laa", name = "I", descriptor = "I")
    public static int field8711;

    @OriginalMember(owner = "client!laa", name = "H", descriptor = "[B")
    private byte[] field8710;

    @OriginalMember(owner = "client!laa", name = "G", descriptor = "[I")
    public static int[] field8709;

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "(I)V", line = 3)
    public static void method3484(int arg0) {
        field8709 = null;
        if (arg0 < 64) {
            method3484(-32);
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(BIZ)V", line = 17)
    public final void method1311(byte arg0, int arg1, boolean arg2) {
        field8711++;
        int var4 = arg1 * 2;
        byte var5 = (byte) (((arg0 & 0xFF) >> 1) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field8710[var10001] = var5;
        if (arg2) {
            this.field8710[var6] = var5;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIIZ)[B", line = 39)
    public final byte[] method3485(int arg0, int arg1, int arg2, boolean arg3) {
        field8706++;
        this.field8710 = new byte[arg0 * 2 * arg1 * arg2];
        if (arg3) {
            this.method481(arg1, arg0, (byte) -115, arg2);
            return this.field8710;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "()V", line = 52)
    public class629() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
