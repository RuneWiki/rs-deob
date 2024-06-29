import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class330 {

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public int field4802;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "S")
    public short field4800;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "Z")
    public boolean field4806;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "S")
    public short field4796;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "B")
    public byte field4801;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public int field4804;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public int field4805;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public int field4797;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public int field4803;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "S")
    public short field4798;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "[C")
    public static char[] field4795 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field4791 = -50;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "[S")
    public static short[] field4799 = new short[] { 60, 12, 44, 20, 49, 30, 19, 6 };

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static void method2038(int arg0) {
        if (arg0 == 8211) {
            field4795 = null;
            field4799 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZI)I")
    public static final int method2039(int arg0, boolean arg1, int arg2) {
        field4792++;
        int var3 = class640.method3647(arg2 - 1, arg0 + -1, (byte) -111) + class640.method3647(arg2 - 1, arg0 + 1, (byte) -108) + class640.method3647(arg2 - -1, arg0 + -1, (byte) -118) + class640.method3647(arg2 + 1, arg0 - -1, (byte) -93);
        if (!arg1) {
            field4799 = null;
        }
        int var4 = class640.method3647(arg2, arg0 - 1, (byte) -111) + class640.method3647(arg2, arg0 + 1, (byte) -110) + (class640.method3647(arg2 + -1, arg0, (byte) -128) - -class640.method3647(arg2 + 1, arg0, (byte) -105));
        int var5 = class640.method3647(arg2, arg0, (byte) -113);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field4802 = arg2;
        this.field4800 = (short) arg5;
        this.field4806 = arg10;
        this.field4796 = (short) arg4;
        this.field4801 = (byte) arg8;
        this.field4804 = arg1;
        this.field4805 = arg11;
        this.field4797 = arg3;
        this.field4803 = arg0;
        this.field4798 = (short) arg6;
    }
}
