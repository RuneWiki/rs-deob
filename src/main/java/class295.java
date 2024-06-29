import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class295 {

    @OriginalMember(owner = "client!co", name = "u", descriptor = "Lib;")
    public static class14 field3685 = new class14(2, 2);

    @OriginalMember(owner = "client!co", name = "v", descriptor = "Lqg;")
    public static class216 field3686 = new class216("WTQA", 2);

    @OriginalMember(owner = "client!co", name = "c", descriptor = "B")
    public byte field3667;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "B")
    public byte field3669;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "B")
    public byte field3671;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "B")
    public byte field3673;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "B")
    public byte field3675;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "B")
    public byte field3676;

    @OriginalMember(owner = "client!co", name = "q", descriptor = "B")
    public byte field3681;

    @OriginalMember(owner = "client!co", name = "m", descriptor = "I")
    public int field3677;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "I")
    public int field3682;

    @OriginalMember(owner = "client!co", name = "t", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!co", name = "s", descriptor = "S")
    public short field3683;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "Z")
    public boolean field3665;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "Z")
    public boolean field3666;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "Z")
    public boolean field3668;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "Z")
    public boolean field3670;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "Z")
    public boolean field3672;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "Z")
    public boolean field3674;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "Z")
    public boolean field3678;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "Z")
    public boolean field3679;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "Z")
    public boolean field3680;

    @OriginalMember(owner = "client!co", name = "w", descriptor = "Z")
    public boolean field3687;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V", line = 16)
    public static void method1724(int arg0) {
        field3686 = null;
        field3685 = null;
        if (arg0 != 35) {
            field3685 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(III)I", line = 31)
    public static final int method1725(int arg0, int arg1, int arg2) {
        if (arg0 >= -16) {
            method1724(-92);
        }
        field3684++;
        int var3 = class81.method430(arg2 + 45365, 4, (byte) 74, arg1 + 91923) + (class81.method430(arg2 + 10294, 2, (byte) 74, arg1 + 37821) - 128 >> 1) + (class81.method430(arg2, 1, (byte) 74, arg1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }
}
