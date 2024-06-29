import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class6 extends class84 {

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "I")
    private int field48 = -1;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
    public static int field46 = -1;

    @OriginalMember(owner = "client!wj", name = "Z", descriptor = "Z")
    public static boolean field53 = false;

    @OriginalMember(owner = "client!wj", name = "Y", descriptor = "F")
    public static float field52;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!wj", name = "W", descriptor = "I")
    public int field50;

    @OriginalMember(owner = "client!wj", name = "X", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!wj", name = "ab", descriptor = "I")
    public int field54;

    @OriginalMember(owner = "client!wj", name = "cb", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "Lsi;")
    public static class204 field44;

    @OriginalMember(owner = "client!wj", name = "bb", descriptor = "[I")
    public int[] field55;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IB)[[I")
    public int[][] method30(int arg0, byte arg1) {
        ++field43;
        if (arg1 != -18) {
            this.method37(118);
        }
        int[][] var3 = super.field1211.method193((byte) -124, arg0);
        if (super.field1211.field321 && this.method38((byte) 100)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field50 * (~class49.field718 != ~this.field54 ? this.field54 * arg0 / class49.field718 : arg0);
            if (class20.field221 == this.field50) {
                for (int var8 = 0; var8 < class20.field221; ++var8) {
                    int var9 = this.field55[var7++];
                    var6[var8] = class179.method1337(var9, 255) << 4;
                    var5[var8] = class179.method1337(var9, 65280) >> 4;
                    var4[var8] = class179.method1337(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; class20.field221 > var10; ++var10) {
                    int var11 = this.field50 * var10 / class20.field221;
                    int var12 = this.field55[var7 - -var11];
                    var6[var10] = class179.method1337(255, var12) << 4;
                    var5[var10] = class179.method1337(var12 >> 4, 4080);
                    var4[var10] = class179.method1337(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
    public class6() {
        super(0, false);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        ++field56;
        if (arg2 == 0) {
            this.field48 = arg0.method1126(false);
        }
        if (arg1 < 87) {
            this.field54 = 34;
        }
    }

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "(I)V")
    public final void method32(int arg0) {
        super.method32(arg0);
        ++field45;
        this.field55 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "()V")
    public static final void method33() {
        for (int var0 = 0; var0 < class29.field342; ++var0) {
            class166 var1 = class94.field1399[var0];
            class177.method1325(var1);
            class94.field1399[var0] = null;
        }
        class29.field342 = 0;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Llc;Llc;I)V")
    public static final void method34(class86 arg0, class86 arg1, int arg2) {
        ++field42;
        class291.field4614 = arg1;
        class148.field2413 = arg0;
        if (arg2 != 8) {
            method33();
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BIIIILqi;II)V")
    public static final void method35(byte arg0, int arg1, int arg2, int arg3, int arg4, class131 arg5, int arg6, int arg7) {
        if (!class76.field1093) {
            class225.field3622 = 0;
        } else {
            class225.field3622 = 32;
        }
        class76.field1093 = false;
        if (~class243.field3921 != -1) {
            if (arg1 <= arg4 && ~(arg1 + 16) < ~arg4 && ~arg7 <= ~arg3 && ~arg7 > ~(arg3 - -16)) {
                arg5.field1995 -= 4;
                class274.method1896(arg5, 10);
            } else if (arg1 <= arg4 && ~(arg1 - -16) < ~arg4 && arg3 + arg6 - 16 <= arg7 && ~arg7 > ~(arg3 - -arg6)) {
                arg5.field1995 += 4;
                class274.method1896(arg5, 10);
            } else if (arg4 >= -class225.field3622 + arg1 && arg4 < arg1 + 16 - -class225.field3622 && arg3 - -16 <= arg7 && arg3 + -16 - -arg6 > arg7) {
                int var8 = (arg6 - 32) * arg6 / arg2;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = -32 - var8 + arg6;
                int var10 = arg7 - (arg3 + 16) + -(var8 / 2);
                arg5.field1995 = (-arg6 + arg2) * var10 / var9;
                class274.method1896(arg5, 10);
                class76.field1093 = true;
            }
        }
        int var11 = -37 / ((-11 - arg0) / 46);
        if (class223.field3571 != 0) {
            int var12 = arg5.field2102;
            if (~arg4 <= ~(-var12 + arg1) && arg3 <= arg7 && arg1 + 16 > arg4 && ~arg7 >= ~(arg3 + arg6)) {
                arg5.field1995 += class223.field3571 * 45;
                class274.method1896(arg5, 10);
            }
        }
        ++field49;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(Z)V")
    public static void method36(boolean arg0) {
        field44 = null;
        if (!arg0) {
            field44 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)I")
    public final int method37(int arg0) {
        ++field47;
        if (arg0 != 7952) {
            field44 = null;
        }
        return this.field48;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)Z")
    public final boolean method38(byte arg0) {
        ++field51;
        if (this.field55 != null) {
            return true;
        } else if (this.field48 >= 0) {
            class140 var2 = class149.field2426 < 0 ? class288.method1961(3, class164.field2658, this.field48) : class256.method1815(class164.field2658, 111, this.field48, class149.field2426);
            var2.method992();
            this.field55 = var2.field2251;
            this.field50 = var2.field3270;
            this.field54 = var2.field3271;
            return true;
        } else {
            int var3 = -22 / ((arg0 - 18) / 50);
            return false;
        }
    }
}
