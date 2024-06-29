import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class198 {

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "Z")
    public boolean field2750;

    @OriginalMember(owner = "client!kba", name = "j", descriptor = "S")
    public short field2757;

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "I")
    public int field2754;

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "I")
    public int field2751;

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "I")
    public int field2753;

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
    public int field2756;

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "B")
    public byte field2755;

    @OriginalMember(owner = "client!kba", name = "m", descriptor = "S")
    public short field2760;

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "I")
    public int field2749;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "S")
    public short field2748;

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "J")
    public static long field2752 = 0L;

    @OriginalMember(owner = "client!kba", name = "k", descriptor = "[I")
    public static int[] field2758 = new int[8];

    @OriginalMember(owner = "client!kba", name = "l", descriptor = "Luaa;")
    public static class391 field2759 = null;

    @OriginalMember(owner = "client!kba", name = "n", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!kba", name = "o", descriptor = "Lmda;")
    public static class369 field2762;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIIIII[[[BIILha;III)V")
    public static final void method1359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[][][] arg6, int arg7, int arg8, class570 arg9, int arg10, int arg11, int arg12) {
        field2761++;
        if (arg8 == 0 || arg5 == 0) {
            return;
        }
        if (arg2 != 3) {
            field2759 = null;
        }
        if (arg8 == 9) {
            arg8 = 1;
            arg3 = arg3 + 1 & 0x3;
        }
        if (arg8 == 10) {
            arg3 = arg3 + 3 & 0x3;
            arg8 = 1;
        }
        if (arg8 == 11) {
            arg8 = 8;
            arg3 = arg3 + 3 & 0x3;
        }
        arg9.method954(arg7, arg1, arg11, arg0, arg12, arg4, arg6[arg8 - 1][arg3], arg5, arg10);
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Z)V")
    public static void method1360(boolean arg0) {
        field2762 = null;
        field2758 = null;
        if (!arg0) {
            field2759 = null;
        }
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field2750 = arg10;
        this.field2757 = (short) arg5;
        this.field2754 = arg2;
        this.field2751 = arg11;
        this.field2753 = arg3;
        this.field2756 = arg0;
        this.field2755 = (byte) arg8;
        this.field2760 = (short) arg6;
        this.field2749 = arg1;
        this.field2748 = (short) arg4;
    }
}
