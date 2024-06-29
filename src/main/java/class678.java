import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class678 {

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public int field9528;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "S")
    public short field9531;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public int field9527;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "S")
    public short field9532;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public int field9524;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public int field9533;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "S")
    public short field9529;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public int field9526;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "Z")
    public boolean field9530;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "B")
    public byte field9525;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "Lps;")
    public static class469 field9534 = new class469(13, -1);

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "F")
    public static float field9536 = 0.25F;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field9539 = 0;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field9537;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "[Lf;")
    public static class534[] field9535;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field9538;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 6)
    public static void method3745(int arg0) {
        if (arg0 == 19753) {
            field9534 = null;
            field9535 = null;
            field9538 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 26)
    public class678(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field9528 = arg1;
        this.field9531 = (short) arg6;
        this.field9527 = arg0;
        this.field9532 = (short) arg5;
        this.field9524 = arg2;
        this.field9533 = arg3;
        this.field9529 = (short) arg4;
        this.field9526 = arg11;
        this.field9530 = arg10;
        this.field9525 = (byte) arg8;
    }
}
