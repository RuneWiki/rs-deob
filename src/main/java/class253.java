import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class253 {

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "S")
    public short field3491;

    @OriginalMember(owner = "client!iaa", name = "f", descriptor = "B")
    public byte field3495;

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "I")
    public int field3493;

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "I")
    public int field3492;

    @OriginalMember(owner = "client!iaa", name = "k", descriptor = "Z")
    public boolean field3500;

    @OriginalMember(owner = "client!iaa", name = "g", descriptor = "I")
    public int field3496;

    @OriginalMember(owner = "client!iaa", name = "i", descriptor = "I")
    public int field3498;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "S")
    public short field3490;

    @OriginalMember(owner = "client!iaa", name = "j", descriptor = "I")
    public int field3499;

    @OriginalMember(owner = "client!iaa", name = "h", descriptor = "S")
    public short field3497;

    @OriginalMember(owner = "client!iaa", name = "l", descriptor = "Lhd;")
    public static class595 field3501 = new class595();

    @OriginalMember(owner = "client!iaa", name = "m", descriptor = "Lqk;")
    public static class148 field3502 = new class148(57, 6);

    @OriginalMember(owner = "client!iaa", name = "o", descriptor = "[I")
    public static int[] field3504 = new int[25];

    @OriginalMember(owner = "client!iaa", name = "n", descriptor = "D")
    public static double field3503;

    @OriginalMember(owner = "client!iaa", name = "e", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)V", line = 9)
    public static void method1596(byte arg0) {
        field3501 = null;
        field3504 = null;
        field3502 = null;
        if (arg0 != -124) {
            field3503 = -0.740902106883354D;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIB)I", line = 27)
    public static final int method1597(int arg0, int arg1, int arg2, byte arg3) {
        field3494++;
        if ((class429.field5916[arg1][arg2][arg0] & 0x8) == 0) {
            int var4 = -63 / ((58 - arg3) / 33);
            return arg1 <= 0 || (class429.field5916[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 46)
    public class253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field3491 = (short) arg5;
        this.field3495 = (byte) arg8;
        this.field3493 = arg1;
        this.field3492 = arg3;
        this.field3500 = arg10;
        this.field3496 = arg0;
        this.field3498 = arg11;
        this.field3490 = (short) arg6;
        this.field3499 = arg2;
        this.field3497 = (short) arg4;
    }
}
