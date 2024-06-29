import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class254 extends class114 {

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "F")
    public static float field3960 = 0.0F;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
    public static int field3962 = -1;

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "[I")
    public static int[] field3966 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!ek", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3967 = "scroll:";

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "Lnh;")
    public static class305 field3965;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(II)V")
    public static final void method1654(int arg0, int arg1) {
        ++field3963;
        class39 var2 = class149.method935(-94, arg0, 3);
        if (arg1 <= -55) {
            var2.method268((byte) -19);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        if (arg1) {
            method1654(26, -80);
        }
        ++field3964;
        int[] var3 = super.field1630.method302(arg0, -124);
        if (super.field1630.field710) {
            int[][] var4 = this.method727(0, arg0, 842);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            for (int var8 = 0; ~var8 > ~class145.field2009; ++var8) {
                var3[var8] = (var6[var8] - -var7[var8] - -var5[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
    public class254() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIII)I")
    public static final int method1655(int arg0, int arg1, int arg2, int arg3) {
        if (~arg1 >= -244) {
            if (~arg1 >= -218) {
                if (~arg1 >= -193) {
                    if (~arg1 < -180) {
                        arg3 >>= 1;
                    }
                } else {
                    arg3 >>= 2;
                }
            } else {
                arg3 >>= 3;
            }
        } else {
            arg3 >>= 4;
        }
        if (arg2 >= -118) {
            method1656(-53, 111, -74, 120, 121);
        }
        ++field3961;
        return (arg1 >> 1) + (arg0 >> 2 << 10) + (arg3 >> 5 << 7);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1656(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class26.field419 * arg3 + class248.field3885 * arg0 >> 16;
        int var6 = class248.field3885 * arg3 - class26.field419 * arg0 >> 16;
        int var7 = class78.field1089 * var6 + class276.field4383 * arg1 >> 16;
        int var8 = class78.field1089 * arg1 - class276.field4383 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class78.field1089 * var6 + class276.field4383 * arg2 >> 16;
        int var12 = class78.field1089 * arg2 - class276.field4383 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class272.field4346 && var13 < class272.field4346) {
            return false;
        } else if (var9 > class226.field3539 && var13 > class226.field3539) {
            return false;
        } else if (var10 < class160.field2241 && var14 < class160.field2241) {
            return false;
        } else {
            return var10 <= class128.field1783 || var14 <= class128.field1783;
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(Z)V")
    public static void method1657(boolean arg0) {
        field3965 = null;
        if (arg0) {
            method1657(false);
        }
        field3967 = null;
        field3966 = null;
    }
}
