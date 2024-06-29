import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class201 extends class30 {

    @OriginalMember(owner = "client!rfa", name = "J", descriptor = "Z")
    public static boolean field3019 = false;

    @OriginalMember(owner = "client!rfa", name = "D", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!rfa", name = "G", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!rfa", name = "H", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!rfa", name = "I", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!rfa", name = "C", descriptor = "Ltea;")
    public static class241 field3013;

    @OriginalMember(owner = "client!rfa", name = "E", descriptor = "[B")
    private byte[] field3015;

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(IIII)[B", line = 3)
    public final byte[] method1353(int arg0, int arg1, int arg2, int arg3) {
        this.field3015 = new byte[arg1 * 2 * arg0 * arg2];
        field3017++;
        this.method3292(arg0, arg2, arg1, 0);
        return arg3 == 4096 ? this.field3015 : null;
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(Z)V", line = 21)
    public static void method1354(boolean arg0) {
        if (arg0) {
            field3018 = 112;
        }
        field3013 = null;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IZB)V", line = 33)
    public final void method269(int arg0, boolean arg1, byte arg2) {
        field3014++;
        if (arg1) {
            return;
        }
        byte var4 = (byte) ((arg2 >> 1 & 0x7F) + 127);
        int var5 = arg0 * 2;
        int var6 = var5 + 1;
        this.field3015[var5] = var4;
        this.field3015[var6] = var4;
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "()V", line = 48)
    public class201() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "(I)I", line = 52)
    public static final int method1355(int arg0) {
        field3016++;
        if (arg0 != 2) {
            field3019 = true;
        }
        return class175.field2642;
    }
}
