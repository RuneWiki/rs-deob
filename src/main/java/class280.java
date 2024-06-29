import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class280 extends class194 {

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    private int field3839;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
    private int field3844;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    private int field3841;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    private int field3836;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "[I")
    public static int[] field3838 = new int[14];

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "Z")
    public static boolean field3829 = false;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "[I")
    public static int[] field3837 = new int[1024];

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "F")
    public static float field3843;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "Lqj;")
    public static class296 field3833;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "Lkq;")
    public static class351 field3835;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1716(boolean arg0) {
        field3833 = null;
        field3838 = null;
        if (!arg0) {
            method1716(false);
        }
        field3835 = null;
        field3837 = null;
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(III)V", line = 17)
    public final void method1042(int arg0, int arg1, int arg2) {
        ++field3845;
        int var4 = this.field3844 * arg2 >> 12;
        int var5 = this.field3841 * arg2 >> 12;
        int var6 = this.field3839 * arg1 >> 12;
        int var7 = this.field3836 * arg1 >> 12;
        class9.method62(super.field2685, var7, super.field2686, arg0, var5, var6, var4);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIBIIIIII)V", line = 37)
    public static final void method1717(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (~arg1 == ~arg6 && arg0 == arg8 && ~arg7 == ~arg9 && ~arg2 == ~arg5) {
            class215.method1377((byte) 79, arg1, arg4, arg9, arg0, arg2);
        } else {
            int var10 = arg1;
            int var11 = arg0;
            int var12 = arg1 * 3;
            int var13 = arg0 * 3;
            int var14 = arg6 * 3;
            int var15 = arg8 * 3;
            int var16 = arg7 * 3;
            int var17 = arg5 * 3;
            int var18 = arg9 + var14 - var16 + -arg1;
            int var19 = arg2 - var17 + -arg0 + var15;
            int var20 = var16 - (var14 - var12) + -var14;
            int var21 = -var15 + var13 + -var15 + var17;
            int var22 = -var12 + var14;
            int var23 = -var13 + var15;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 - -var29 + var31 >> 12) + arg1;
                int var34 = (var28 - -var30 + var32 >> 12) + arg0;
                class215.method1377((byte) 79, var10, arg4, var33, var11, var34);
                var10 = var33;
                var11 = var34;
            }
        }
        ++field3840;
        if (arg3 != -114) {
            field3835 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)V", line = 113)
    public static final void method1718(int arg0, int arg1) {
        int var2 = -86 % ((-61 - arg0) / 36);
        ++field3842;
        class233.field3157 = new class190(arg1);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(BII)V", line = 131)
    public static final void method1719(byte arg0, int arg1, int arg2) {
        ++field3830;
        class44 var3 = class184.field2571[arg2][arg1];
        if (var3 != null) {
            class64.field992 = var3.field664;
            class451.field6575 = var3.field677;
            class412.field5970 = var3.field679;
        }
        if (arg0 <= 2) {
            method1718(-113, 77);
        }
        class171.method1158(true);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BII)V", line = 155)
    public final void method1039(byte arg0, int arg1, int arg2) {
        ++field3834;
        int var4 = -9 / ((arg0 - 9) / 39);
        int var5 = this.field3844 * arg1 >> 12;
        int var6 = this.field3841 * arg1 >> 12;
        int var7 = this.field3839 * arg2 >> 12;
        int var8 = this.field3836 * arg2 >> 12;
        class62.method420(var8, super.field2691, var5, super.field2686, (byte) -52, super.field2685, var6, var7);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIILjj;II)V", line = 173)
    public static final void method1720(int arg0, int arg1, int arg2, int arg3, class61 arg4, int arg5, int arg6) {
        class21.method139(arg2, arg0, arg3, arg1, arg6, 0, (byte) -69, arg4.field6197, arg4.field6192);
        ++field3828;
        if (arg5 >= -86) {
            field3829 = false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(IIIIIII)V", line = 185)
    public class280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3839 = arg1;
        this.field3844 = arg0;
        this.field3841 = arg2;
        this.field3836 = arg3;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)V", line = 201)
    public final void method1041(int arg0, int arg1, int arg2) {
        ++field3832;
        int var4 = this.field3844 * arg1 >> 12;
        if (arg2 != 0) {
            this.field3839 = 83;
        }
        int var5 = this.field3841 * arg1 >> 12;
        int var6 = this.field3839 * arg0 >> 12;
        int var7 = this.field3836 * arg0 >> 12;
        class176.method1177(var6, var7, var5, 116, super.field2691, var4);
    }
}
