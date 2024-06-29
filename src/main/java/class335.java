import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class335 extends class148 {

    @OriginalMember(owner = "client!mn", name = "I", descriptor = "Lgi;")
    public static class631 field4510 = new class631();

    @OriginalMember(owner = "client!mn", name = "F", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!mn", name = "G", descriptor = "[B")
    private byte[] field4508;

    @OriginalMember(owner = "client!mn", name = "H", descriptor = "[[S")
    public static short[][] field4509;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "(I)V")
    public static void method1970(int arg0) {
        field4509 = null;
        if (arg0 != 127) {
            field4510 = null;
        }
        field4510 = null;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
    public class335() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIII)[B")
    public final byte[] method1971(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 63) {
            method1970(65);
        }
        this.field4508 = new byte[arg2 * 2 * arg3 * arg0];
        field4512++;
        this.method1792(arg2, (byte) -124, arg3, arg0);
        return this.field4508;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BII)V")
    public final void method1081(byte arg0, int arg1, int arg2) {
        field4507++;
        byte var4 = (byte) (((arg0 & 0xFF) >> 1) + 127);
        int var5 = arg2 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field4508[var10001] = var4;
        if (arg1 != -12027) {
            field4511 = -67;
        }
        this.field4508[var6] = var4;
    }
}
