import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class295 extends class292 {

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "I")
    public static int field4633 = -1;

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "[J")
    public static long[] field4629 = new long[100];

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "[Lnj;")
    public static class143[] field4627 = new class143[29];

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "I")
    public static int field4641 = 0;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
    public int field4626;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
    public int field4632;

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "I")
    public int field4636;

    @OriginalMember(owner = "client!lh", name = "O", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!lh", name = "Q", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!lh", name = "R", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "Lpb;")
    public static class128 field4630;

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "Ljava/lang/String;")
    public String field4634;

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "[Laa;")
    public static class172[] field4642;

    @OriginalMember(owner = "client!lh", name = "V", descriptor = "[[I")
    public static int[][] field4643;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)V")
    public static void method1976(int arg0) {
        field4627 = null;
        field4643 = null;
        field4629 = null;
        if (arg0 <= -65) {
            field4642 = null;
            field4630 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)J")
    public final long method1977(int arg0) {
        ++field4637;
        if (arg0 <= 27) {
            field4641 = -15;
        }
        return super.field4603 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIII)V")
    public static final void method1978(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4639;
        int var6 = -arg4 + arg0;
        int var7 = -arg2 + arg1;
        if (~var6 != -1) {
            if (var7 == 0) {
                class61.method487(arg2, arg5, arg0, arg4, -5306);
            } else {
                int var8 = (var7 << 12) / var6;
                int var9 = -(arg4 * var8 >> 12) + arg2;
                if (arg3 == 0) {
                    int var10;
                    int var11;
                    if (class75.field1265 > arg0) {
                        var10 = var9 - -(class75.field1265 * var8 >> 12);
                        var11 = class75.field1265;
                    } else if (arg0 > class261.field4025) {
                        var10 = var9 - -(class261.field4025 * var8 >> 12);
                        var11 = class261.field4025;
                    } else {
                        var10 = arg1;
                        var11 = arg0;
                    }
                    if (class271.field4289 > var10) {
                        var11 = (-var9 + class271.field4289 << 12) / var8;
                        var10 = class271.field4289;
                    } else if (~class113.field1779 > ~var10) {
                        var10 = class113.field1779;
                        var11 = (-var9 + class113.field1779 << 12) / var8;
                    }
                    int var12;
                    int var13;
                    if (~class75.field1265 >= ~arg4) {
                        if (class261.field4025 < arg4) {
                            var12 = var9 - -(class261.field4025 * var8 >> 12);
                            var13 = class261.field4025;
                        } else {
                            var12 = arg2;
                            var13 = arg4;
                        }
                    } else {
                        var13 = class75.field1265;
                        var12 = (class75.field1265 * var8 >> 12) + var9;
                    }
                    if (~var12 <= ~class271.field4289) {
                        if (class113.field1779 < var12) {
                            var13 = (-var9 + class113.field1779 << 12) / var8;
                            var12 = class113.field1779;
                        }
                    } else {
                        var12 = class271.field4289;
                        var13 = (-var9 + class271.field4289 << 12) / var8;
                    }
                    class246.method1662(var12, var10, var13, arg5, var11, 111);
                }
            }
        } else {
            if (~var7 != -1) {
                class167.method1110(arg1, arg2, arg5, arg4, false);
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)V")
    public final void method1979(int arg0) {
        ++field4640;
        super.field4603 = super.field4603 & Long.MIN_VALUE | class269.method1823(-89) + 500L;
        class220.field3451.method683(this, 125);
        if (arg0 != -8205) {
            this.method1982(-46);
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(II)V")
    public class295(int arg0, int arg1) {
        super.field1408 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "(I)V")
    public final void method1980(int arg0) {
        if (arg0 != 1022716908) {
            this.method1979(-61);
        }
        super.field4603 |= Long.MIN_VALUE;
        ++field4635;
        if (~this.method1977(arg0 + -1022716793) == -1L) {
            class85.field1404.method683(this, 116);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)I")
    public final int method1981(boolean arg0) {
        ++field4628;
        return arg0 ? -91 : (int) super.field1408;
    }

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "(I)I")
    public final int method1982(int arg0) {
        if (arg0 != 255) {
            this.method1980(12);
        }
        ++field4638;
        return (int) (super.field1408 >>> 32 & 255L);
    }
}
