import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class661 extends class105 {

    @OriginalMember(owner = "client!lga", name = "E", descriptor = "[C")
    public static char[] field9379 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!lga", name = "I", descriptor = "Lwo;")
    public static class690 field9383 = new class690(43, 6);

    @OriginalMember(owner = "client!lga", name = "L", descriptor = "I")
    public static int field9386 = 0;

    @OriginalMember(owner = "client!lga", name = "G", descriptor = "F")
    public static float field9381;

    @OriginalMember(owner = "client!lga", name = "H", descriptor = "F")
    public static float field9382;

    @OriginalMember(owner = "client!lga", name = "F", descriptor = "I")
    public static int field9380;

    @OriginalMember(owner = "client!lga", name = "K", descriptor = "I")
    public static int field9385;

    @OriginalMember(owner = "client!lga", name = "J", descriptor = "[B")
    private byte[] field9384;

    @OriginalMember(owner = "client!lga", name = "f", descriptor = "(I)V", line = 4)
    public static void method3742(int arg0) {
        field9383 = null;
        if (arg0 != 5891) {
            method3742(-90);
        }
        field9379 = null;
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(IIII)[B", line = 19)
    public final byte[] method3743(int arg0, int arg1, int arg2, int arg3) {
        field9385++;
        this.field9384 = new byte[arg2 * 2 * arg1 * arg0];
        this.method2893(arg0, arg2, arg3, arg1);
        return this.field9384;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(BII)V", line = 29)
    public final void method767(byte arg0, int arg1, int arg2) {
        field9380++;
        int var4 = arg1 * 2;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field9384[var10001] = -1;
        int var5 = arg0 & 0xFF;
        if (arg2 <= -96) {
            this.field9384[var6] = (byte) (var5 * 3 >> 5);
        }
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "()V", line = 51)
    public class661() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
