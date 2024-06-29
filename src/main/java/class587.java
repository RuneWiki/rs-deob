import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class587 extends class20 {

    @OriginalMember(owner = "client!lk", name = "N", descriptor = "[I")
    public static int[] field8273 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "I")
    public static int field8270;

    @OriginalMember(owner = "client!lk", name = "L", descriptor = "I")
    public static int field8271;

    @OriginalMember(owner = "client!lk", name = "M", descriptor = "I")
    public static int field8272;

    @OriginalMember(owner = "client!lk", name = "R", descriptor = "I")
    public static int field8277;

    @OriginalMember(owner = "client!lk", name = "Q", descriptor = "Lfp;")
    public static class323 field8276;

    @OriginalMember(owner = "client!lk", name = "P", descriptor = "[B")
    private byte[] field8275;

    @OriginalMember(owner = "client!lk", name = "O", descriptor = "[Loia;")
    public static class88[] field8274;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZBI)V")
    public final void method121(boolean arg0, byte arg1, int arg2) {
        field8270++;
        int var4 = arg2 * 2;
        if (arg0) {
            int var5 = arg1 & 0xFF;
            this.field8275[var4++] = (byte) (var5 * 3 >> 5);
            this.field8275[var4] = (byte) (var5 * 3 >> 5);
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)V")
    public static void method3326(byte arg0) {
        field8273 = null;
        field8276 = null;
        if (arg0 >= -107) {
            field8277 = -50;
        }
        field8274 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIZ)[B")
    public final byte[] method3327(int arg0, int arg1, int arg2, boolean arg3) {
        field8271++;
        this.field8275 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2625(arg1, arg2, arg3, arg0);
        return this.field8275;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
    public class587() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
