import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class294 extends class42 {

    @OriginalMember(owner = "client!io", name = "D", descriptor = "B")
    private byte field4767 = 0;

    @OriginalMember(owner = "client!io", name = "M", descriptor = "I")
    private int field4776 = 0;

    @OriginalMember(owner = "client!io", name = "J", descriptor = "B")
    private byte field4773 = 0;

    @OriginalMember(owner = "client!io", name = "n", descriptor = "I")
    private int field4751 = 0;

    @OriginalMember(owner = "client!io", name = "C", descriptor = "I")
    private int field4766 = 0;

    @OriginalMember(owner = "client!io", name = "ab", descriptor = "Z")
    public boolean field4790 = false;

    @OriginalMember(owner = "client!io", name = "cb", descriptor = "I")
    public int field4792 = 0;

    @OriginalMember(owner = "client!io", name = "bb", descriptor = "[I")
    private int[] field4791;

    @OriginalMember(owner = "client!io", name = "p", descriptor = "[I")
    public int[] field4753;

    @OriginalMember(owner = "client!io", name = "v", descriptor = "[I")
    public int[] field4759;

    @OriginalMember(owner = "client!io", name = "y", descriptor = "[I")
    public int[] field4762;

    @OriginalMember(owner = "client!io", name = "L", descriptor = "[I")
    private int[] field4775;

    @OriginalMember(owner = "client!io", name = "V", descriptor = "[S")
    private short[] field4785;

    @OriginalMember(owner = "client!io", name = "Q", descriptor = "[Lvf;")
    public class341[] field4780;

    @OriginalMember(owner = "client!io", name = "I", descriptor = "[Lue;")
    public class19[] field4772;

    @OriginalMember(owner = "client!io", name = "B", descriptor = "[S")
    private short[] field4765;

    @OriginalMember(owner = "client!io", name = "A", descriptor = "[S")
    private short[] field4764;

    @OriginalMember(owner = "client!io", name = "X", descriptor = "[S")
    private short[] field4787;

    @OriginalMember(owner = "client!io", name = "k", descriptor = "[S")
    private short[] field4748;

    @OriginalMember(owner = "client!io", name = "H", descriptor = "[F")
    private float[] field4771;

    @OriginalMember(owner = "client!io", name = "T", descriptor = "[F")
    private float[] field4783;

    @OriginalMember(owner = "client!io", name = "q", descriptor = "[S")
    private short[] field4754;

    @OriginalMember(owner = "client!io", name = "x", descriptor = "[B")
    private byte[] field4761;

    @OriginalMember(owner = "client!io", name = "l", descriptor = "[S")
    private short[] field4749;

    @OriginalMember(owner = "client!io", name = "Z", descriptor = "[S")
    private short[] field4789;

    @OriginalMember(owner = "client!io", name = "db", descriptor = "[S")
    private short[] field4793;

    @OriginalMember(owner = "client!io", name = "E", descriptor = "[S")
    private short[] field4768;

    @OriginalMember(owner = "client!io", name = "Y", descriptor = "[B")
    private byte[] field4788;

    @OriginalMember(owner = "client!io", name = "o", descriptor = "[S")
    private short[] field4752;

    @OriginalMember(owner = "client!io", name = "R", descriptor = "Lgh;")
    public class254 field4781;

    @OriginalMember(owner = "client!io", name = "z", descriptor = "Lam;")
    public class282 field4763;

    @OriginalMember(owner = "client!io", name = "S", descriptor = "Lam;")
    private class282 field4782;

    @OriginalMember(owner = "client!io", name = "m", descriptor = "Lam;")
    private class282 field4750;

    @OriginalMember(owner = "client!io", name = "w", descriptor = "Lam;")
    private class282 field4760;

    @OriginalMember(owner = "client!io", name = "s", descriptor = "Lam;")
    private class282 field4756;

    @OriginalMember(owner = "client!io", name = "F", descriptor = "S")
    private short field4769;

    @OriginalMember(owner = "client!io", name = "O", descriptor = "S")
    private short field4778;

    @OriginalMember(owner = "client!io", name = "r", descriptor = "[S")
    private short[] field4755;

    @OriginalMember(owner = "client!io", name = "t", descriptor = "[I")
    private int[] field4757;

    @OriginalMember(owner = "client!io", name = "P", descriptor = "Loe;")
    private static class146 field4779 = new class146(10000);

    @OriginalMember(owner = "client!io", name = "eb", descriptor = "Lio;")
    private static class294 field4794 = new class294();

    @OriginalMember(owner = "client!io", name = "fb", descriptor = "Lio;")
    private static class294 field4795 = new class294();

    @OriginalMember(owner = "client!io", name = "gb", descriptor = "Lio;")
    private static class294 field4796 = new class294();

    @OriginalMember(owner = "client!io", name = "hb", descriptor = "Lio;")
    private static class294 field4797 = new class294();

    @OriginalMember(owner = "client!io", name = "ib", descriptor = "Lio;")
    private static class294 field4798 = new class294();

    @OriginalMember(owner = "client!io", name = "jb", descriptor = "Lio;")
    private static class294 field4799 = new class294();

    @OriginalMember(owner = "client!io", name = "kb", descriptor = "[I")
    private static int[] field4800 = new int[1];

    @OriginalMember(owner = "client!io", name = "ob", descriptor = "[I")
    private static int[] field4804 = new int[1];

    @OriginalMember(owner = "client!io", name = "ub", descriptor = "Z")
    private static boolean field4810 = false;

    @OriginalMember(owner = "client!io", name = "lb", descriptor = "F")
    private static float field4801;

    @OriginalMember(owner = "client!io", name = "qb", descriptor = "F")
    private static float field4806;

    @OriginalMember(owner = "client!io", name = "rb", descriptor = "F")
    private static float field4807;

    @OriginalMember(owner = "client!io", name = "sb", descriptor = "F")
    private static float field4808;

    @OriginalMember(owner = "client!io", name = "tb", descriptor = "F")
    private static float field4809;

    @OriginalMember(owner = "client!io", name = "vb", descriptor = "F")
    private static float field4811;

    @OriginalMember(owner = "client!io", name = "mb", descriptor = "I")
    private static int field4802;

    @OriginalMember(owner = "client!io", name = "nb", descriptor = "I")
    private static int field4803;

    @OriginalMember(owner = "client!io", name = "pb", descriptor = "I")
    private static int field4805;

    @OriginalMember(owner = "client!io", name = "U", descriptor = "Lmn;")
    private class187 field4784;

    @OriginalMember(owner = "client!io", name = "N", descriptor = "Lkf;")
    private class249 field4777;

    @OriginalMember(owner = "client!io", name = "W", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4786;

    @OriginalMember(owner = "client!io", name = "u", descriptor = "[J")
    private static long[] field4758;

    @OriginalMember(owner = "client!io", name = "G", descriptor = "[[I")
    private int[][] field4770;

    @OriginalMember(owner = "client!io", name = "K", descriptor = "[[I")
    private int[][] field4774;

    @OriginalMember(owner = "client!io", name = "n", descriptor = "()V", line = 7)
    public final void method2082() {
        if (this.field4765 == null) {
            this.method341();
            return;
        }
        for (int var1 = 0; var1 < this.field4792; var1++) {
            this.field4753[var1] = -this.field4753[var1];
            this.field4762[var1] = -this.field4762[var1];
        }
        for (int var2 = 0; var2 < this.field4766; var2++) {
            this.field4765[var2] = (short) (-this.field4765[var2]);
            this.field4787[var2] = (short) (-this.field4787[var2]);
        }
        this.field4781.field4169 = false;
        this.field4763.field4608 = false;
        if (this.field4750 != null) {
            this.field4750.field4608 = false;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IILio;[[I[[IIII)V", line = 40)
    public final void method2083(int arg0, int arg1, class294 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field4781.field4169) {
            arg2.method2101();
        }
        int var9 = arg2.field4781.field4165 + arg5;
        int var10 = arg2.field4781.field4172 + arg5;
        int var11 = arg2.field4781.field4170 + arg7;
        int var12 = arg2.field4781.field4171 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field4776; var17++) {
                int var18 = this.field4753[var17] + arg5;
                int var19 = this.field4762[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field4759[var17] = this.field4759[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field4781.field4167;
            for (int var28 = 0; var28 < this.field4776; var28++) {
                int var29 = (this.field4759[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field4753[var28] + arg5;
                    int var31 = this.field4762[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field4759[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method332(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field4781.field4168 - arg2.field4781.field4167;
            for (int var42 = 0; var42 < this.field4776; var42++) {
                int var43 = this.field4753[var42] + arg5;
                int var44 = this.field4762[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field4759[var42] = var51 + this.field4759[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field4781.field4168 - arg2.field4781.field4167;
            for (int var53 = 0; var53 < this.field4776; var53++) {
                int var54 = this.field4753[var53] + arg5;
                int var55 = this.field4762[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field4759[var53] = ((this.field4759[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field4763.field4608 = false;
        this.field4781.field4169 = false;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIIIII)Z", line = 240)
    private final boolean method2084(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!io", name = "o", descriptor = "()I", line = 257)
    public final int method2085() {
        return this.field4778;
    }

    @OriginalMember(owner = "client!io", name = "p", descriptor = "()V", line = 260)
    public final void method2086() {
        if (this.field4765 == null) {
            this.method343();
            return;
        }
        for (int var1 = 0; var1 < this.field4792; var1++) {
            int var2 = this.field4753[var1];
            this.field4753[var1] = this.field4762[var1];
            this.field4762[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field4766; var3++) {
            short var4 = this.field4765[var3];
            this.field4765[var3] = this.field4787[var3];
            this.field4787[var3] = (short) (-var4);
        }
        this.field4781.field4169 = false;
        this.field4763.field4608 = false;
        if (this.field4750 != null) {
            this.field4750.field4608 = false;
        }
    }

    @OriginalMember(owner = "client!io", name = "q", descriptor = "()V", line = 299)
    private final void method2087() {
        if (field4779.field2496.length < this.field4751 * 12) {
            field4779 = new class146((this.field4751 + 100) * 12);
        } else {
            field4779.field2435 = 0;
        }
        if (class241.field4007) {
            for (int var1 = 0; var1 < this.field4751; var1++) {
                field4779.method1045((byte) -117, this.field4749[var1]);
                field4779.method1045((byte) 114, this.field4789[var1]);
                field4779.method1045((byte) -37, this.field4793[var1]);
            }
        } else {
            for (int var2 = 0; var2 < this.field4751; var2++) {
                field4779.method1040((byte) -109, this.field4749[var2]);
                field4779.method1040((byte) -111, this.field4789[var2]);
                field4779.method1040((byte) -127, this.field4793[var2]);
            }
        }
        if (!class241.field4020) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field4779.field2435);
            var5.put(field4779.field2496, 0, field4779.field2435);
            var5.flip();
            this.field4756.field4608 = true;
            this.field4756.field4612 = var5;
            this.field4756.field4624 = null;
            return;
        }
        class249 var3 = new class249();
        ByteBuffer var4 = ByteBuffer.wrap(field4779.field2496, 0, field4779.field2435);
        var3.method1756(var4);
        this.field4756.field4608 = true;
        this.field4756.field4612 = null;
        this.field4756.field4624 = var3;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZZZZZZZZZZZ)Lio;", line = 358)
    public final class294 method2088(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class294 var12 = new class294();
        var12.field4792 = this.field4792;
        var12.field4776 = this.field4776;
        var12.field4766 = this.field4766;
        var12.field4751 = this.field4751;
        if (arg0) {
            var12.field4753 = this.field4753;
            var12.field4762 = this.field4762;
        } else {
            var12.field4753 = class212.method1462(this.field4753, false);
            var12.field4762 = class212.method1462(this.field4762, false);
        }
        if (arg1) {
            var12.field4759 = this.field4759;
        } else {
            var12.field4759 = class212.method1462(this.field4759, false);
        }
        if (arg0 && arg1) {
            var12.field4763 = this.field4763;
            var12.field4781 = this.field4781;
        } else {
            var12.field4763 = new class282();
            var12.field4781 = new class254();
        }
        if (arg2) {
            var12.field4754 = this.field4754;
        } else {
            var12.field4754 = class334.method2357(false, this.field4754);
        }
        if (arg3) {
            var12.field4761 = this.field4761;
        } else {
            var12.field4761 = class296.method2126(this.field4761, true);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class281.field4606) {
            var12.field4782 = new class282();
        } else {
            var12.field4782 = this.field4782;
        }
        if (arg5) {
            var12.field4765 = this.field4765;
            var12.field4764 = this.field4764;
            var12.field4787 = this.field4787;
            var12.field4748 = this.field4748;
        } else {
            var12.field4765 = class334.method2357(false, this.field4765);
            var12.field4764 = class334.method2357(false, this.field4764);
            var12.field4787 = class334.method2357(false, this.field4787);
            var12.field4748 = class334.method2357(false, this.field4748);
        }
        if (!class281.field4606) {
            var12.field4750 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field4750 = this.field4750;
        } else {
            var12.field4750 = new class282();
        }
        if (arg8) {
            var12.field4771 = this.field4771;
            var12.field4783 = this.field4783;
            var12.field4760 = this.field4760;
        } else {
            var12.field4771 = class122.method883(0, this.field4771);
            var12.field4783 = class122.method883(0, this.field4783);
            var12.field4760 = new class282();
        }
        if (arg9) {
            var12.field4749 = this.field4749;
            var12.field4789 = this.field4789;
            var12.field4793 = this.field4793;
            var12.field4756 = this.field4756;
        } else {
            var12.field4749 = class334.method2357(false, this.field4749);
            var12.field4789 = class334.method2357(false, this.field4789);
            var12.field4793 = class334.method2357(false, this.field4793);
            var12.field4756 = new class282();
        }
        if (arg10) {
            var12.field4768 = this.field4768;
        } else {
            var12.field4768 = class334.method2357(false, this.field4768);
        }
        var12.field4775 = this.field4775;
        var12.field4774 = this.field4774;
        var12.field4788 = this.field4788;
        var12.field4770 = this.field4770;
        var12.field4757 = this.field4757;
        var12.field4755 = this.field4755;
        var12.field4791 = this.field4791;
        var12.field4769 = this.field4769;
        var12.field4778 = this.field4778;
        var12.field4780 = this.field4780;
        var12.field4772 = this.field4772;
        var12.field4785 = this.field4785;
        var12.field4752 = this.field4752;
        return var12;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZZZZZ)V", line = 502)
    private final void method2089(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field4763.field4626 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field4782.field4626 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field4750.field4626 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field4760.field4626 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field4779.field2496.length < this.field4766 * var6) {
            field4779 = new class146((this.field4766 + 100) * var6);
        } else {
            field4779.field2435 = 0;
        }
        if (arg1) {
            if (class241.field4007) {
                for (int var7 = 0; var7 < this.field4776; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field4753[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field4759[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field4762[var7]);
                    int var11 = this.field4791[var7];
                    int var12 = this.field4791[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field4755[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field4779.field2435 = var6 * var14;
                        field4779.method1045((byte) -43, var8);
                        field4779.method1045((byte) 121, var9);
                        field4779.method1045((byte) 127, var10);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field4776; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field4753[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field4759[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field4762[var15]);
                    int var19 = this.field4791[var15];
                    int var20 = this.field4791[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field4755[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field4779.field2435 = var6 * var22;
                        field4779.method1040((byte) -114, var16);
                        field4779.method1040((byte) -116, var17);
                        field4779.method1040((byte) -108, var18);
                    }
                }
            }
        }
        if (arg2) {
            if (class281.field4606) {
                for (int var42 = 0; var42 < this.field4751; var42++) {
                    int var43 = method2107(this.field4754[var42], this.field4768[var42], this.field4769, this.field4761[var42]);
                    field4779.field2435 = this.field4749[var42] * var6 + this.field4782.field4626;
                    field4779.method1045((byte) -20, var43);
                    field4779.field2435 = this.field4789[var42] * var6 + this.field4782.field4626;
                    field4779.method1045((byte) -81, var43);
                    field4779.field2435 = this.field4793[var42] * var6 + this.field4782.field4626;
                    field4779.method1045((byte) -89, var43);
                }
            } else {
                int var23 = (int) class259.field4233[0];
                int var24 = (int) class259.field4233[1];
                int var25 = (int) class259.field4233[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field4769 * 1.3F);
                int var28 = this.field4778 * var26 >> 8;
                for (int var29 = 0; var29 < this.field4751; var29++) {
                    short var30 = this.field4749[var29];
                    short var31 = this.field4748[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field4787[var30] * var25 + this.field4765[var30] * var23 + this.field4764[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field4787[var30] * var25 + this.field4765[var30] * var23 + this.field4764[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field4748[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field4789[var29];
                    short var34 = this.field4748[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field4787[var33] * var25 + this.field4765[var33] * var23 + this.field4764[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field4787[var33] * var25 + this.field4765[var33] * var23 + this.field4764[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field4748[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field4793[var29];
                    short var37 = this.field4748[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field4787[var36] * var25 + this.field4765[var36] * var23 + this.field4764[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field4787[var36] * var25 + this.field4765[var36] * var23 + this.field4764[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field4748[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method2107(this.field4754[var29], this.field4768[var29], var32, this.field4761[var29]);
                    int var40 = method2107(this.field4754[var29], this.field4768[var29], var35, this.field4761[var29]);
                    int var41 = method2107(this.field4754[var29], this.field4768[var29], var38, this.field4761[var29]);
                    field4779.field2435 = var6 * var30 + this.field4782.field4626;
                    field4779.method1045((byte) -54, var39);
                    field4779.field2435 = var6 * var33 + this.field4782.field4626;
                    field4779.method1045((byte) -22, var40);
                    field4779.field2435 = var6 * var36 + this.field4782.field4626;
                    field4779.method1045((byte) -119, var41);
                }
                this.field4765 = null;
                this.field4764 = null;
                this.field4787 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field4778;
            float var45 = 3.0F / (float) (this.field4778 / 2 + this.field4778);
            field4779.field2435 = this.field4750.field4626;
            if (class241.field4007) {
                for (int var46 = 0; var46 < this.field4766; var46++) {
                    short var47 = this.field4748[var46];
                    if (var47 == 0) {
                        field4779.method1006((byte) 124, (float) this.field4765[var46] * var45);
                        field4779.method1006((byte) 106, (float) this.field4764[var46] * var45);
                        field4779.method1006((byte) 123, (float) this.field4787[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field4779.method1006((byte) 111, (float) this.field4765[var46] * var48);
                        field4779.method1006((byte) 122, (float) this.field4764[var46] * var48);
                        field4779.method1006((byte) 116, (float) this.field4787[var46] * var48);
                    }
                    field4779.field2435 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field4766; var49++) {
                    short var50 = this.field4748[var49];
                    if (var50 == 0) {
                        field4779.method1001(-102, (float) this.field4765[var49] * var45);
                        field4779.method1001(-70, (float) this.field4764[var49] * var45);
                        field4779.method1001(-97, (float) this.field4787[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field4779.method1001(-71, (float) this.field4765[var49] * var51);
                        field4779.method1001(-9, (float) this.field4764[var49] * var51);
                        field4779.method1001(-9, (float) this.field4787[var49] * var51);
                    }
                    field4779.field2435 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field4779.field2435 = this.field4760.field4626;
            if (class241.field4007) {
                for (int var52 = 0; var52 < this.field4766; var52++) {
                    field4779.method1006((byte) 125, this.field4771[var52]);
                    field4779.method1006((byte) 110, this.field4783[var52]);
                    field4779.field2435 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field4766; var53++) {
                    field4779.method1001(-50, this.field4771[var53]);
                    field4779.method1001(-73, this.field4783[var53]);
                    field4779.field2435 += var6 - 8;
                }
            }
        }
        field4779.field2435 = this.field4766 * var6;
        if (arg0) {
            if (class241.field4011) {
                ByteBuffer var54 = ByteBuffer.wrap(field4779.field2496, 0, field4779.field2435);
                if (this.field4777 == null) {
                    this.field4777 = new class249(true);
                    this.field4777.method1756(var54);
                } else {
                    this.field4777.method1754(var54);
                }
                if (arg1) {
                    this.field4763.field4608 = true;
                    this.field4763.field4612 = null;
                    this.field4763.field4624 = this.field4777;
                    this.field4763.field4613 = var6;
                }
                if (arg2) {
                    this.field4782.field4608 = true;
                    this.field4782.field4612 = null;
                    this.field4782.field4624 = this.field4777;
                    this.field4782.field4613 = var6;
                }
                if (arg3) {
                    this.field4750.field4608 = true;
                    this.field4750.field4612 = null;
                    this.field4750.field4624 = this.field4777;
                    this.field4750.field4613 = var6;
                }
                if (arg4) {
                    this.field4760.field4608 = true;
                    this.field4760.field4612 = null;
                    this.field4760.field4624 = this.field4777;
                    this.field4760.field4613 = var6;
                }
            } else {
                if (field4786 == null || field4786.capacity() < field4779.field2435) {
                    field4786 = ByteBuffer.allocateDirect(var6 * 100 + field4779.field2435);
                } else {
                    field4786.clear();
                }
                field4786.put(field4779.field2496, 0, field4779.field2435);
                field4786.flip();
                if (arg1) {
                    this.field4763.field4608 = true;
                    this.field4763.field4612 = field4786;
                    this.field4763.field4624 = null;
                    this.field4763.field4613 = var6;
                }
                if (arg2) {
                    this.field4782.field4608 = true;
                    this.field4782.field4612 = field4786;
                    this.field4763.field4624 = null;
                    this.field4782.field4613 = var6;
                }
                if (arg3) {
                    this.field4750.field4608 = true;
                    this.field4750.field4612 = field4786;
                    this.field4750.field4624 = null;
                    this.field4750.field4613 = var6;
                }
                if (arg4) {
                    this.field4760.field4608 = true;
                    this.field4760.field4612 = field4786;
                    this.field4760.field4624 = null;
                    this.field4760.field4613 = var6;
                }
            }
        } else if (class241.field4020) {
            class249 var55 = new class249();
            ByteBuffer var56 = ByteBuffer.wrap(field4779.field2496, 0, field4779.field2435);
            var55.method1756(var56);
            if (arg1) {
                this.field4763.field4608 = true;
                this.field4763.field4612 = null;
                this.field4763.field4624 = var55;
                this.field4763.field4613 = var6;
            }
            if (arg2) {
                this.field4782.field4608 = true;
                this.field4782.field4612 = null;
                this.field4782.field4624 = var55;
                this.field4782.field4613 = var6;
            }
            if (arg3) {
                this.field4750.field4608 = true;
                this.field4750.field4612 = null;
                this.field4750.field4624 = var55;
                this.field4750.field4613 = var6;
            }
            if (arg4) {
                this.field4760.field4608 = true;
                this.field4760.field4612 = null;
                this.field4760.field4624 = var55;
                this.field4760.field4613 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field4779.field2435);
            var57.put(field4779.field2496, 0, field4779.field2435);
            var57.flip();
            if (arg1) {
                this.field4763.field4608 = true;
                this.field4763.field4612 = var57;
                this.field4763.field4624 = null;
                this.field4763.field4613 = var6;
            }
            if (arg2) {
                this.field4782.field4608 = true;
                this.field4782.field4612 = var57;
                this.field4763.field4624 = null;
                this.field4782.field4613 = var6;
            }
            if (arg3) {
                this.field4750.field4608 = true;
                this.field4750.field4612 = var57;
                this.field4750.field4624 = null;
                this.field4750.field4613 = var6;
            }
            if (arg4) {
                this.field4760.field4608 = true;
                this.field4760.field4612 = var57;
                this.field4760.field4624 = null;
                this.field4760.field4613 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lml;IIIZ)V", line = 1031)
    public final void method426(class152 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class294 var6 = (class294) arg0;
        if (this.field4751 == 0 || var6.field4751 == 0) {
            return;
        }
        int var7 = var6.field4776;
        int[] var8 = var6.field4753;
        int[] var9 = var6.field4759;
        int[] var10 = var6.field4762;
        short[] var11 = var6.field4765;
        short[] var12 = var6.field4764;
        short[] var13 = var6.field4787;
        short[] var14 = var6.field4748;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field4784 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field4784.field3179;
            var16 = this.field4784.field3182;
            var17 = this.field4784.field3180;
            var18 = this.field4784.field3181;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field4784 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field4784.field3179;
            var20 = var6.field4784.field3182;
            var21 = var6.field4784.field3180;
            var22 = var6.field4784.field3181;
        }
        int[] var23 = var6.field4791;
        short[] var24 = var6.field4755;
        if (!var6.field4781.field4169) {
            var6.method2101();
        }
        short var25 = var6.field4781.field4167;
        short var26 = var6.field4781.field4168;
        short var27 = var6.field4781.field4165;
        short var28 = var6.field4781.field4172;
        short var29 = var6.field4781.field4170;
        short var30 = var6.field4781.field4171;
        for (int var31 = 0; var31 < this.field4776; var31++) {
            int var32 = this.field4759[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field4753[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field4762[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field4791[var31];
                        int var37 = this.field4791[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field4755[var38] - 1;
                            if (var35 == -1 || this.field4748[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field4784 = new class187();
                                            var15 = this.field4784.field3179 = class334.method2357(false, this.field4765);
                                            var16 = this.field4784.field3182 = class334.method2357(false, this.field4764);
                                            var17 = this.field4784.field3180 = class334.method2357(false, this.field4787);
                                            var18 = this.field4784.field3181 = class334.method2357(false, this.field4748);
                                        }
                                        if (var19 == null) {
                                            class187 var44 = var6.field4784 = new class187();
                                            var19 = var44.field3179 = class334.method2357(false, var11);
                                            var20 = var44.field3182 = class334.method2357(false, var12);
                                            var21 = var44.field3180 = class334.method2357(false, var13);
                                            var22 = var44.field3181 = class334.method2357(false, var14);
                                        }
                                        short var45 = this.field4765[var35];
                                        short var46 = this.field4764[var35];
                                        short var47 = this.field4787[var35];
                                        short var48 = this.field4748[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field4791[var31];
                                        int var58 = this.field4791[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field4755[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "e", descriptor = "(I)V", line = 1270)
    public final void method345(int arg0) {
        int var2 = class305.field4959[arg0];
        int var3 = class305.field4957[arg0];
        for (int var4 = 0; var4 < this.field4792; var4++) {
            int var5 = this.field4762[var4] * var2 + this.field4753[var4] * var3 >> 16;
            this.field4762[var4] = this.field4762[var4] * var3 - this.field4753[var4] * var2 >> 16;
            this.field4753[var4] = var5;
        }
        this.field4781.field4169 = false;
        this.field4763.field4608 = false;
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "()I", line = 1292)
    public final int method325() {
        if (!this.field4781.field4169) {
            this.method2101();
        }
        return this.field4781.field4168;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIII[FFIF)V", line = 1300)
    private static final void method2090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field4811 = var16;
        field4809 = var17;
    }

    @OriginalMember(owner = "client!io", name = "r", descriptor = "()V", line = 1345)
    private final void method2091() {
        GL var1 = class241.field4012;
        if (this.field4751 == 0) {
            return;
        }
        if (this.field4773 != 0) {
            this.method2089(true, !this.field4763.field4608 && (this.field4773 & 0x1) != 0, !this.field4782.field4608 && (this.field4773 & 0x2) != 0, this.field4750 != null && !this.field4750.field4608 && (this.field4773 & 0x4) != 0, false);
        }
        this.method2089(false, !this.field4763.field4608, !this.field4782.field4608, this.field4750 != null && !this.field4750.field4608, !this.field4760.field4608);
        if (!this.field4756.field4608) {
            this.method2087();
        }
        if (this.field4767 != 0) {
            if ((this.field4767 & 0x1) != 0) {
                this.field4753 = null;
                this.field4759 = null;
                this.field4762 = null;
                this.field4755 = null;
                this.field4791 = null;
            }
            if ((this.field4767 & 0x2) != 0) {
                this.field4754 = null;
                this.field4761 = null;
            }
            if ((this.field4767 & 0x4) != 0) {
                this.field4765 = null;
                this.field4764 = null;
                this.field4787 = null;
                this.field4748 = null;
            }
            if ((this.field4767 & 0x8) != 0) {
                this.field4771 = null;
                this.field4783 = null;
            }
            if ((this.field4767 & 0x10) != 0) {
                this.field4749 = null;
                this.field4789 = null;
                this.field4793 = null;
            }
            this.field4767 = 0;
        }
        class249 var2 = null;
        if (this.field4763.field4624 != null) {
            this.field4763.field4624.method1755();
            var2 = this.field4763.field4624;
            var1.glVertexPointer(3, 5126, this.field4763.field4613, (long) this.field4763.field4626);
        }
        if (this.field4782.field4624 != null) {
            if (this.field4782.field4624 != var2) {
                this.field4782.field4624.method1755();
                var2 = this.field4782.field4624;
            }
            var1.glColorPointer(4, 5121, this.field4782.field4613, (long) this.field4782.field4626);
        }
        if (class281.field4606 && this.field4750.field4624 != null) {
            if (this.field4750.field4624 != var2) {
                this.field4750.field4624.method1755();
                var2 = this.field4750.field4624;
            }
            var1.glNormalPointer(5126, this.field4750.field4613, (long) this.field4750.field4626);
        }
        if (this.field4760.field4624 != null) {
            if (this.field4760.field4624 != var2) {
                this.field4760.field4624.method1755();
                class249 var3 = this.field4760.field4624;
            }
            var1.glTexCoordPointer(2, 5126, this.field4760.field4613, (long) this.field4760.field4626);
        }
        if (this.field4756.field4624 != null) {
            this.field4756.field4624.method1753();
        }
        if (this.field4763.field4624 == null || this.field4782.field4624 == null || class281.field4606 && this.field4750.field4624 == null || this.field4760.field4624 == null) {
            if (class241.field4020) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field4763.field4624 == null) {
                this.field4763.field4612.position(this.field4763.field4626);
                var1.glVertexPointer(3, 5126, this.field4763.field4613, this.field4763.field4612);
            }
            if (this.field4782.field4624 == null) {
                this.field4782.field4612.position(this.field4782.field4626);
                var1.glColorPointer(4, 5121, this.field4782.field4613, this.field4782.field4612);
            }
            if (class281.field4606 && this.field4750.field4624 == null) {
                this.field4750.field4612.position(this.field4750.field4626);
                var1.glNormalPointer(5126, this.field4750.field4613, this.field4750.field4612);
            }
            if (this.field4760.field4624 == null) {
                this.field4760.field4612.position(this.field4760.field4626);
                var1.glTexCoordPointer(2, 5126, this.field4760.field4613, this.field4760.field4612);
            }
        }
        if (this.field4756.field4624 == null && class241.field4020) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field4757.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field4757[var5];
            int var7 = this.field4757[var5 + 1];
            short var8 = this.field4768[var6];
            if (var8 == -1) {
                class241.method1687(-1);
                class109.method815(-123, 0, 0);
            } else {
                class305.field4968.method77((byte) -107, var8 & 0xFFFF);
            }
            if (this.field4756.field4624 == null) {
                this.field4756.field4612.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field4756.field4612);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "e", descriptor = "()Z", line = 1516)
    public final boolean method336() {
        if (this.field4774 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field4792; var1++) {
            this.field4753[var1] <<= 0x4;
            this.field4759[var1] <<= 0x4;
            this.field4762[var1] <<= 0x4;
        }
        field4803 = 0;
        field4805 = 0;
        field4802 = 0;
        return true;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZZZ)Lhb;", line = 1536)
    public final class42 method347(boolean arg0, boolean arg1, boolean arg2) {
        return this.method2105(arg0, arg1, arg2, field4799, field4798);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I[IIIIZI[I)V", line = 1540)
    public final void method330(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field4803 = 0;
            field4805 = 0;
            field4802 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field4774.length) {
                    int[] var16 = this.field4774[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field4785 == null || (arg6 & this.field4785[var18]) != 0) {
                            field4803 += this.field4753[var18];
                            field4805 += this.field4759[var18];
                            field4802 += this.field4762[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field4803 = field4803 / var13 + var10;
                field4805 = field4805 / var13 + var11;
                field4802 = field4802 / var13 + var12;
                field4810 = true;
            } else {
                field4803 = var10;
                field4805 = var11;
                field4802 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field4774.length) {
                    int[] var27 = this.field4774[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field4785 == null || (arg6 & this.field4785[var29]) != 0) {
                            this.field4753[var29] += var22;
                            this.field4759[var29] += var23;
                            this.field4762[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field4774.length) {
                        int[] var92 = this.field4774[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field4785 == null || (arg6 & this.field4785[var94]) != 0) {
                                this.field4753[var94] -= field4803;
                                this.field4759[var94] -= field4805;
                                this.field4762[var94] -= field4802;
                                if (arg4 != 0) {
                                    int var95 = class305.field4959[arg4];
                                    int var96 = class305.field4957[arg4];
                                    int var97 = this.field4759[var94] * var95 + this.field4753[var94] * var96 + 32767 >> 16;
                                    this.field4759[var94] = this.field4759[var94] * var96 + 32767 - this.field4753[var94] * var95 >> 16;
                                    this.field4753[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class305.field4959[arg2];
                                    int var99 = class305.field4957[arg2];
                                    int var100 = this.field4759[var94] * var99 + 32767 - this.field4762[var94] * var98 >> 16;
                                    this.field4762[var94] = this.field4762[var94] * var99 + this.field4759[var94] * var98 + 32767 >> 16;
                                    this.field4759[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class305.field4959[arg3];
                                    int var102 = class305.field4957[arg3];
                                    int var103 = this.field4762[var94] * var101 + this.field4753[var94] * var102 + 32767 >> 16;
                                    this.field4762[var94] = this.field4762[var94] * var102 + 32767 - this.field4753[var94] * var101 >> 16;
                                    this.field4753[var94] = var103;
                                }
                                this.field4753[var94] += field4803;
                                this.field4759[var94] += field4805;
                                this.field4762[var94] += field4802;
                            }
                        }
                    }
                }
                if (arg5 && this.field4765 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field4774.length) {
                            int[] var106 = this.field4774[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field4785 == null || (arg6 & this.field4785[var108]) != 0) {
                                    int var109 = this.field4791[var108];
                                    int var110 = this.field4791[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field4755[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class305.field4959[arg4];
                                            int var114 = class305.field4957[arg4];
                                            int var115 = this.field4765[var112] * var114 + this.field4764[var112] * var113 + 32767 >> 16;
                                            this.field4764[var112] = (short) (this.field4764[var112] * var114 + 32767 - this.field4765[var112] * var113 >> 16);
                                            this.field4765[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class305.field4959[arg2];
                                            int var117 = class305.field4957[arg2];
                                            int var118 = this.field4764[var112] * var117 + 32767 - this.field4787[var112] * var116 >> 16;
                                            this.field4787[var112] = (short) (this.field4787[var112] * var117 + this.field4764[var112] * var116 + 32767 >> 16);
                                            this.field4764[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class305.field4959[arg3];
                                            int var120 = class305.field4957[arg3];
                                            int var121 = this.field4787[var112] * var119 + this.field4765[var112] * var120 + 32767 >> 16;
                                            this.field4787[var112] = (short) (this.field4787[var112] * var120 + 32767 - this.field4765[var112] * var119 >> 16);
                                            this.field4765[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field4750 != null) {
                        this.field4750.field4608 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field4810) {
                    int var36 = arg7[6] * field4802 + arg7[0] * field4803 + arg7[3] * field4805 + 16384 >> 15;
                    int var37 = arg7[7] * field4802 + arg7[1] * field4803 + arg7[4] * field4805 + 16384 >> 15;
                    int var38 = arg7[8] * field4802 + arg7[2] * field4803 + arg7[5] * field4805 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field4803 = var39;
                    field4805 = var40;
                    field4802 = var41;
                    field4810 = false;
                }
                int[] var42 = new int[9];
                int var43 = class305.field4957[arg2] >> 1;
                int var44 = class305.field4959[arg2] >> 1;
                int var45 = class305.field4957[arg3] >> 1;
                int var46 = class305.field4959[arg3] >> 1;
                int var47 = class305.field4957[arg4] >> 1;
                int var48 = class305.field4959[arg4] >> 1;
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[5] = -var44;
                var42[6] = -var46 * var47 + var45 * var50 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                int var51 = var42[2] * -field4802 + var42[0] * -field4803 + var42[1] * -field4805 + 16384 >> 15;
                int var52 = var42[5] * -field4802 + var42[3] * -field4803 + var42[4] * -field4805 + 16384 >> 15;
                int var53 = var42[8] * -field4802 + var42[6] * -field4803 + var42[7] * -field4805 + 16384 >> 15;
                int var54 = field4803 + var51;
                int var55 = field4805 + var52;
                int var56 = field4802 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var59 = 0; var59 < 3; var59++) {
                        int var60 = 0;
                        for (int var61 = 0; var61 < 3; var61++) {
                            var60 += var42[var58 * 3 + var61] * arg7[var59 * 3 + var61];
                        }
                        var57[var58 * 3 + var59] = var60 + 16384 >> 15;
                    }
                }
                int var62 = var42[2] * var35 + var42[0] * var33 + var42[1] * var34 + 16384 >> 15;
                int var63 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 16384 >> 15;
                int var64 = var42[8] * var35 + var42[6] * var33 + var42[7] * var34 + 16384 >> 15;
                int var65 = var54 + var62;
                int var66 = var55 + var63;
                int var67 = var56 + var64;
                int[] var68 = new int[9];
                for (int var69 = 0; var69 < 3; var69++) {
                    for (int var70 = 0; var70 < 3; var70++) {
                        int var71 = 0;
                        for (int var72 = 0; var72 < 3; var72++) {
                            var71 += arg7[var69 * 3 + var72] * var57[var72 * 3 + var70];
                        }
                        var68[var69 * 3 + var70] = var71 + 16384 >> 15;
                    }
                }
                int var73 = arg7[2] * var67 + arg7[0] * var65 + arg7[1] * var66 + 16384 >> 15;
                int var74 = arg7[5] * var67 + arg7[3] * var65 + arg7[4] * var66 + 16384 >> 15;
                int var75 = arg7[8] * var67 + arg7[6] * var65 + arg7[7] * var66 + 16384 >> 15;
                int var76 = var30 + var73;
                int var77 = var31 + var74;
                int var78 = var32 + var75;
                for (int var79 = 0; var79 < var9; var79++) {
                    int var80 = arg1[var79];
                    if (var80 < this.field4774.length) {
                        int[] var81 = this.field4774[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field4785 == null || (arg6 & this.field4785[var83]) != 0) {
                                int var84 = this.field4762[var83] * var68[2] + this.field4759[var83] * var68[1] + this.field4753[var83] * var68[0] + 16384 >> 15;
                                int var85 = this.field4762[var83] * var68[5] + this.field4759[var83] * var68[4] + this.field4753[var83] * var68[3] + 16384 >> 15;
                                int var86 = this.field4762[var83] * var68[8] + this.field4759[var83] * var68[7] + this.field4753[var83] * var68[6] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field4753[var83] = var87;
                                this.field4759[var83] = var88;
                                this.field4762[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field4774.length) {
                        int[] var174 = this.field4774[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field4785 == null || (arg6 & this.field4785[var176]) != 0) {
                                this.field4753[var176] -= field4803;
                                this.field4759[var176] -= field4805;
                                this.field4762[var176] -= field4802;
                                this.field4753[var176] = this.field4753[var176] * arg2 >> 7;
                                this.field4759[var176] = this.field4759[var176] * arg3 >> 7;
                                this.field4762[var176] = this.field4762[var176] * arg4 >> 7;
                                this.field4753[var176] += field4803;
                                this.field4759[var176] += field4805;
                                this.field4762[var176] += field4802;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (field4810) {
                    int var128 = arg7[6] * field4802 + arg7[0] * field4803 + arg7[3] * field4805 + 16384 >> 15;
                    int var129 = arg7[7] * field4802 + arg7[1] * field4803 + arg7[4] * field4805 + 16384 >> 15;
                    int var130 = arg7[8] * field4802 + arg7[2] * field4803 + arg7[5] * field4805 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field4803 = var131;
                    field4805 = var132;
                    field4802 = var133;
                    field4810 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field4803 * var134 + 16384 >> 15;
                int var138 = -field4805 * var135 + 16384 >> 15;
                int var139 = -field4802 * var136 + 16384 >> 15;
                int var140 = field4803 + var137;
                int var141 = field4805 + var138;
                int var142 = field4802 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var127 * var136 + 16384 >> 15;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var152 = 0; var152 < 3; var152++) {
                        int var153 = 0;
                        for (int var154 = 0; var154 < 3; var154++) {
                            var153 += arg7[var151 * 3 + var154] * var143[var154 * 3 + var152];
                        }
                        var150[var151 * 3 + var152] = var153 + 16384 >> 15;
                    }
                }
                int var155 = arg7[2] * var149 + arg7[0] * var147 + arg7[1] * var148 + 16384 >> 15;
                int var156 = arg7[5] * var149 + arg7[3] * var147 + arg7[4] * var148 + 16384 >> 15;
                int var157 = arg7[8] * var149 + arg7[6] * var147 + arg7[7] * var148 + 16384 >> 15;
                int var158 = var122 + var155;
                int var159 = var123 + var156;
                int var160 = var124 + var157;
                for (int var161 = 0; var161 < var9; var161++) {
                    int var162 = arg1[var161];
                    if (var162 < this.field4774.length) {
                        int[] var163 = this.field4774[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field4785 == null || (arg6 & this.field4785[var165]) != 0) {
                                int var166 = this.field4762[var165] * var150[2] + this.field4759[var165] * var150[1] + this.field4753[var165] * var150[0] + 16384 >> 15;
                                int var167 = this.field4762[var165] * var150[5] + this.field4759[var165] * var150[4] + this.field4753[var165] * var150[3] + 16384 >> 15;
                                int var168 = this.field4762[var165] * var150[8] + this.field4759[var165] * var150[7] + this.field4753[var165] * var150[6] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field4753[var165] = var169;
                                this.field4759[var165] = var170;
                                this.field4762[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field4770 != null && this.field4761 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field4770.length) {
                        int[] var179 = this.field4770[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field4752 == null || (arg6 & this.field4752[var181]) != 0) {
                                int var182 = (this.field4761[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field4761[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field4782.field4608 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field4770 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field4770.length) {
                    int[] var185 = this.field4770[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field4752 == null || (arg6 & this.field4752[var187]) != 0) {
                            int var188 = this.field4754[var187] & 0xFFFF;
                            int var189 = var188 >> 10 & 0x3F;
                            int var190 = var188 >> 7 & 0x7;
                            int var191 = var188 & 0x7F;
                            int var192 = arg2 + var189 & 0x3F;
                            int var193 = arg3 / 4 + var190;
                            if (var193 < 0) {
                                var193 = 0;
                            } else if (var193 > 7) {
                                var193 = 7;
                            }
                            int var194 = arg4 + var191;
                            if (var194 < 0) {
                                var194 = 0;
                            } else if (var194 > 127) {
                                var194 = 127;
                            }
                            this.field4754[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field4782.field4608 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(III)Lml;", line = 2330)
    public final class152 method397(int arg0, int arg1, int arg2) {
        this.field4790 = false;
        if (this.field4784 != null) {
            this.field4765 = this.field4784.field3179;
            this.field4764 = this.field4784.field3182;
            this.field4787 = this.field4784.field3180;
            this.field4748 = this.field4784.field3181;
            this.field4784 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!io", name = "h", descriptor = "()V", line = 2347)
    public final void method343() {
        for (int var1 = 0; var1 < this.field4792; var1++) {
            int var2 = this.field4753[var1];
            this.field4753[var1] = this.field4762[var1];
            this.field4762[var1] = -var2;
        }
        this.field4781.field4169 = false;
        this.field4763.field4608 = false;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIII[FIF)V", line = 2361)
    private static final void method2092(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field4808 = var16;
        field4801 = var17;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(SS)V", line = 2406)
    public final void method2093(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field4751; var3++) {
            if (this.field4754[var3] == arg0) {
                this.field4754[var3] = arg1;
            }
        }
        this.field4782.field4608 = false;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "([SI)[S", line = 2419)
    private static final short[] method2094(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class89.method690(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Ltc;IJIIIIFF)S", line = 2425)
    private final short method2095(class48 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field4791[arg1];
        int var12 = this.field4791[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field4755[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field4758[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field4755[var13] = (short) (this.field4766 + 1);
        field4758[var13] = arg2;
        this.field4765[this.field4766] = (short) arg3;
        this.field4764[this.field4766] = (short) arg4;
        this.field4787[this.field4766] = (short) arg5;
        this.field4748[this.field4766] = (short) arg6;
        this.field4771[this.field4766] = arg7;
        this.field4783[this.field4766] = arg8;
        return (short) (this.field4766++);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 2460)
    private static final void method2096(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field4806 = var18;
        field4807 = var19;
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(III)V", line = 2541)
    public final void method353(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4792; var4++) {
            this.field4753[var4] += arg0;
            this.field4759[var4] += arg1;
            this.field4762[var4] += arg2;
        }
        this.field4781.field4169 = false;
        this.field4763.field4608 = false;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "([FI)[F", line = 2557)
    private static final float[] method2097(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class89.method683(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZZZZZZZ)V", line = 2564)
    public final void method2098(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field4773 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field4766 != 0) {
            if (arg6) {
                boolean var8 = !this.field4782.field4608 && (arg1 || arg2 && !class281.field4606);
                this.method2089(false, !this.field4763.field4608 && arg0, var8, this.field4750 != null && !this.field4750.field4608 && arg2, !this.field4760.field4608 && arg3);
                if (!this.field4756.field4608 && arg4 && arg1) {
                    this.method2087();
                }
            }
            if (arg0) {
                if (this.field4763.field4608) {
                    if (!this.field4781.field4169) {
                        this.method2101();
                    }
                    this.field4753 = null;
                    this.field4759 = null;
                    this.field4762 = null;
                    this.field4755 = null;
                    this.field4791 = null;
                } else {
                    this.field4767 = (byte) (this.field4767 | 0x1);
                }
            }
            if (arg1) {
                if (this.field4782.field4608) {
                    this.field4754 = null;
                    this.field4761 = null;
                } else {
                    this.field4767 = (byte) (this.field4767 | 0x2);
                }
            }
            if (arg2 && class281.field4606) {
                if (this.field4750.field4608) {
                    this.field4765 = null;
                    this.field4764 = null;
                    this.field4787 = null;
                    this.field4748 = null;
                } else {
                    this.field4767 = (byte) (this.field4767 | 0x4);
                }
            }
            if (arg3) {
                if (this.field4760.field4608) {
                    this.field4771 = null;
                    this.field4783 = null;
                } else {
                    this.field4767 = (byte) (this.field4767 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field4756.field4608 && this.field4782.field4608) {
                    this.field4749 = null;
                    this.field4789 = null;
                    this.field4793 = null;
                } else {
                    this.field4767 = (byte) (this.field4767 | 0x10);
                }
            }
            if (arg5) {
                this.field4775 = null;
                this.field4788 = null;
                this.field4774 = (int[][]) null;
                this.field4770 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIII)V", line = 2659)
    public final void method337(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field4803 = 0;
            field4805 = 0;
            field4802 = 0;
            for (int var6 = 0; var6 < this.field4792; var6++) {
                field4803 += this.field4753[var6];
                field4805 += this.field4759[var6];
                field4802 += this.field4762[var6];
                var5++;
            }
            if (var5 > 0) {
                field4803 = field4803 / var5 + arg1;
                field4805 = field4805 / var5 + arg2;
                field4802 = field4802 / var5 + arg3;
            } else {
                field4803 = arg1;
                field4805 = arg2;
                field4802 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field4792; var7++) {
                this.field4753[var7] += arg1;
                this.field4759[var7] += arg2;
                this.field4762[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field4792; var8++) {
                this.field4753[var8] -= field4803;
                this.field4759[var8] -= field4805;
                this.field4762[var8] -= field4802;
                if (arg3 != 0) {
                    int var9 = class305.field4959[arg3];
                    int var10 = class305.field4957[arg3];
                    int var11 = this.field4759[var8] * var9 + this.field4753[var8] * var10 + 32767 >> 16;
                    this.field4759[var8] = this.field4759[var8] * var10 + 32767 - this.field4753[var8] * var9 >> 16;
                    this.field4753[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class305.field4959[arg1];
                    int var13 = class305.field4957[arg1];
                    int var14 = this.field4759[var8] * var13 + 32767 - this.field4762[var8] * var12 >> 16;
                    this.field4762[var8] = this.field4762[var8] * var13 + this.field4759[var8] * var12 + 32767 >> 16;
                    this.field4759[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class305.field4959[arg2];
                    int var16 = class305.field4957[arg2];
                    int var17 = this.field4762[var8] * var15 + this.field4753[var8] * var16 + 32767 >> 16;
                    this.field4762[var8] = this.field4762[var8] * var16 + 32767 - this.field4753[var8] * var15 >> 16;
                    this.field4753[var8] = var17;
                }
                this.field4753[var8] += field4803;
                this.field4759[var8] += field4805;
                this.field4762[var8] += field4802;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field4792; var18++) {
                this.field4753[var18] -= field4803;
                this.field4759[var18] -= field4805;
                this.field4762[var18] -= field4802;
                this.field4753[var18] = this.field4753[var18] * arg1 / 128;
                this.field4759[var18] = this.field4759[var18] * arg2 / 128;
                this.field4762[var18] = this.field4762[var18] * arg3 / 128;
                this.field4753[var18] += field4803;
                this.field4759[var18] += field4805;
                this.field4762[var18] += field4802;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field4751; var19++) {
                int var20 = (this.field4761[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field4761[var19] = (byte) var20;
            }
            this.field4782.field4608 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field4751; var21++) {
                int var22 = this.field4754[var21] & 0xFFFF;
                int var23 = var22 >> 10 & 0x3F;
                int var24 = var22 >> 7 & 0x7;
                int var25 = var22 & 0x7F;
                int var26 = arg1 + var23 & 0x3F;
                int var27 = arg2 / 4 + var24;
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 7) {
                    var27 = 7;
                }
                int var28 = arg3 + var25;
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 127) {
                    var28 = 127;
                }
                this.field4754[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field4782.field4608 = false;
        }
    }

    @OriginalMember(owner = "client!io", name = "s", descriptor = "()V", line = 2855)
    public static void method2099() {
        field4758 = null;
        field4779 = null;
        field4786 = null;
        field4794 = null;
        field4795 = null;
        field4796 = null;
        field4797 = null;
        field4798 = null;
        field4799 = null;
        field4800 = null;
        field4804 = null;
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(ZZZ)Lhb;", line = 2868)
    public final class42 method355(boolean arg0, boolean arg1, boolean arg2) {
        return this.method2105(arg0, arg1, arg2, field4797, field4796);
    }

    @OriginalMember(owner = "client!io", name = "t", descriptor = "()V", line = 2871)
    public static final void method2100() {
        field4794 = new class294();
        field4795 = new class294();
        field4796 = new class294();
        field4797 = new class294();
        field4798 = new class294();
        field4799 = new class294();
    }

    @OriginalMember(owner = "client!io", name = "u", descriptor = "()V", line = 2880)
    private final void method2101() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field4776; var9++) {
            int var10 = this.field4753[var9];
            int var11 = this.field4759[var9];
            int var12 = this.field4762[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field4781.field4165 = (short) var1;
        this.field4781.field4172 = (short) var4;
        this.field4781.field4167 = (short) var2;
        this.field4781.field4168 = (short) var5;
        this.field4781.field4170 = (short) var3;
        this.field4781.field4171 = (short) var6;
        this.field4781.field4166 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field4781.field4169 = true;
    }

    @OriginalMember(owner = "client!io", name = "v", descriptor = "()V", line = 2952)
    public final void method2102() {
        for (int var1 = 0; var1 < this.field4792; var1++) {
            this.field4762[var1] = -this.field4762[var1];
        }
        if (this.field4787 != null) {
            for (int var2 = 0; var2 < this.field4766; var2++) {
                this.field4787[var2] = (short) (-this.field4787[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field4751; var3++) {
            short var4 = this.field4749[var3];
            this.field4749[var3] = this.field4793[var3];
            this.field4793[var3] = var4;
        }
        this.field4781.field4169 = false;
        this.field4763.field4608 = false;
        if (this.field4750 != null) {
            this.field4750.field4608 = false;
        }
        this.field4756.field4608 = false;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(ZZZ)Lhb;", line = 2989)
    public final class42 method349(boolean arg0, boolean arg1, boolean arg2) {
        return this.method2105(arg0, arg1, arg2, field4795, field4794);
    }

    @OriginalMember(owner = "client!io", name = "f", descriptor = "(I)V", line = 2992)
    public final void method2103(int arg0) {
        if (this.field4765 == null) {
            this.method345(arg0);
            return;
        }
        int var2 = class305.field4959[arg0];
        int var3 = class305.field4957[arg0];
        for (int var4 = 0; var4 < this.field4792; var4++) {
            int var5 = this.field4762[var4] * var2 + this.field4753[var4] * var3 >> 16;
            this.field4762[var4] = this.field4762[var4] * var3 - this.field4753[var4] * var2 >> 16;
            this.field4753[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field4766; var6++) {
            int var7 = this.field4787[var6] * var2 + this.field4765[var6] * var3 >> 16;
            this.field4787[var6] = (short) (this.field4787[var6] * var3 - this.field4765[var6] * var2 >> 16);
            this.field4765[var6] = (short) var7;
        }
        this.field4781.field4169 = false;
        this.field4763.field4608 = false;
        if (this.field4750 != null) {
            this.field4750.field4608 = false;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "()I", line = 3033)
    public final int method340() {
        if (!this.field4781.field4169) {
            this.method2101();
        }
        return this.field4781.field4167;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIIIIJ)V", line = 3040)
    public final void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field4766 == 0) {
            return;
        }
        GL var10 = class241.field4012;
        var10.glPushMatrix();
        if (arg3 != 0) {
            var10.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var10.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var10.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var10.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var10.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method2091();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V", line = 4548)
    private class294() {
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Ltc;IIZ)V", line = 4551)
    public class294(class48 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field1000];
        this.field4791 = new int[arg0.field961 + 1];
        for (int var6 = 0; var6 < arg0.field1000; var6++) {
            if ((arg0.field956 == null || arg0.field956[var6] != 2) && (arg0.field984 == null || arg0.field984[var6] == -1 || !class305.field4968.method86(false, arg0.field984[var6] & 0xFFFF))) {
                var5[this.field4751++] = var6;
                this.field4791[arg0.field1006[var6]]++;
                this.field4791[arg0.field1003[var6]]++;
                this.field4791[arg0.field1001[var6]]++;
            }
        }
        long[] var7 = new long[this.field4751];
        for (int var8 = 0; var8 < this.field4751; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field984 != null) {
                var14 = arg0.field984[var9];
                if (var14 != -1) {
                    var12 = class305.field4968.method63(var14 & 0xFFFF, -1);
                    var13 = class305.field4968.method64(var14 & 0xFFFF, true);
                }
            }
            boolean var15 = arg0.field988 != null && arg0.field988[var9] != 0 || var14 != -1 && !class305.field4968.method82(var14 & 0xFFFF, -5001);
            if ((arg3 || var15) && arg0.field991 != null) {
                var10 += arg0.field991[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class138.method961(var7, 0, var5);
        this.field4792 = arg0.field961;
        this.field4776 = arg0.field993;
        this.field4753 = arg0.field1002;
        this.field4759 = arg0.field983;
        this.field4762 = arg0.field989;
        this.field4775 = arg0.field1007;
        this.field4785 = arg0.field958;
        this.field4780 = arg0.field968;
        this.field4772 = arg0.field999;
        int var20 = this.field4751 * 3;
        this.field4765 = new short[var20];
        this.field4764 = new short[var20];
        this.field4787 = new short[var20];
        this.field4748 = new short[var20];
        this.field4771 = new float[var20];
        this.field4783 = new float[var20];
        this.field4754 = new short[this.field4751];
        this.field4761 = new byte[this.field4751];
        this.field4749 = new short[this.field4751];
        this.field4789 = new short[this.field4751];
        this.field4793 = new short[this.field4751];
        this.field4768 = new short[this.field4751];
        if (arg0.field1008 != null) {
            this.field4788 = new byte[this.field4751];
        }
        if (arg0.field976 != null) {
            this.field4752 = new short[this.field4751];
        }
        this.field4781 = new class254();
        this.field4763 = new class282();
        this.field4782 = new class282();
        if (class281.field4606) {
            this.field4750 = new class282();
        }
        this.field4760 = new class282();
        this.field4756 = new class282();
        this.field4769 = (short) arg1;
        this.field4778 = (short) arg2;
        this.field4755 = new short[var20];
        field4758 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < this.field4776; var22++) {
            int var23 = this.field4791[var22];
            this.field4791[var22] = var21;
            var21 += var23;
        }
        this.field4791[this.field4776] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field959 != null) {
            int var28 = arg0.field998;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field4751; var36++) {
                int var37 = var5[var36];
                if (arg0.field959[var37] != -1) {
                    int var38 = arg0.field959[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field1006[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field1003[var37];
                        } else {
                            var40 = arg0.field1001[var37];
                        }
                        int var41 = arg0.field1002[var40];
                        int var42 = arg0.field983[var40];
                        int var43 = arg0.field989[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field1009[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field987[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field997[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field987[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field997[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field957[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field987[var44] / 1024.0F;
                        var49 = (float) arg0.field997[var44] / 1024.0F;
                        var48 = (float) arg0.field957[var44] / 1024.0F;
                    }
                    var27[var44] = method2108(arg0.field963[var44], arg0.field981[var44], arg0.field979[var44], arg0.field970[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field4751; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field973[var51] & 0xFFFF;
            short var53;
            if (arg0.field984 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field984[var51];
            }
            int var54;
            if (arg0.field959 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field959[var51];
            }
            int var55;
            if (arg0.field988 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field988[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field1009[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field1006[var51];
                        int var67 = arg0.field1003[var51];
                        int var68 = arg0.field1001[var51];
                        short var69 = arg0.field963[var54];
                        short var70 = arg0.field981[var54];
                        short var71 = arg0.field979[var54];
                        float var72 = (float) arg0.field1002[var69];
                        float var73 = (float) arg0.field983[var69];
                        float var74 = (float) arg0.field989[var69];
                        float var75 = (float) arg0.field1002[var70] - var72;
                        float var76 = (float) arg0.field983[var70] - var73;
                        float var77 = (float) arg0.field989[var70] - var74;
                        float var78 = (float) arg0.field1002[var71] - var72;
                        float var79 = (float) arg0.field983[var71] - var73;
                        float var80 = (float) arg0.field989[var71] - var74;
                        float var81 = (float) arg0.field1002[var66] - var72;
                        float var82 = (float) arg0.field983[var66] - var73;
                        float var83 = (float) arg0.field989[var66] - var74;
                        float var84 = (float) arg0.field1002[var67] - var72;
                        float var85 = (float) arg0.field983[var67] - var73;
                        float var86 = (float) arg0.field989[var67] - var74;
                        float var87 = (float) arg0.field1002[var68] - var72;
                        float var88 = (float) arg0.field983[var68] - var73;
                        float var89 = (float) arg0.field989[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field1006[var51];
                        int var102 = arg0.field1003[var51];
                        int var103 = arg0.field1001[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field964[var54];
                        float var109 = (float) arg0.field1004[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field957[var54] & 0xFFFF) / 1024.0F;
                            method2090(arg0.field1002[var101], arg0.field983[var101], arg0.field989[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field4811;
                            var57 = field4809;
                            method2090(arg0.field1002[var102], arg0.field983[var102], arg0.field989[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field4811;
                            var59 = field4809;
                            method2090(arg0.field1002[var103], arg0.field983[var103], arg0.field989[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field4811;
                            var61 = field4809;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field974[var54] / 256.0F;
                            float var113 = (float) arg0.field995[var54] / 256.0F;
                            int var114 = arg0.field1002[var102] - arg0.field1002[var101];
                            int var115 = arg0.field983[var102] - arg0.field983[var101];
                            int var116 = arg0.field989[var102] - arg0.field989[var101];
                            int var117 = arg0.field1002[var103] - arg0.field1002[var101];
                            int var118 = arg0.field983[var103] - arg0.field983[var101];
                            int var119 = arg0.field989[var103] - arg0.field989[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field987[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field997[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field957[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method2111(var126, var127, var128);
                            method2096(arg0.field1002[var101], arg0.field983[var101], arg0.field989[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field4806;
                            var57 = field4807;
                            method2096(arg0.field1002[var102], arg0.field983[var102], arg0.field989[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field4806;
                            var59 = field4807;
                            method2096(arg0.field1002[var103], arg0.field983[var103], arg0.field989[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field4806;
                            var61 = field4807;
                        } else if (var65 == 3) {
                            method2092(arg0.field1002[var101], arg0.field983[var101], arg0.field989[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field4808;
                            var57 = field4801;
                            method2092(arg0.field1002[var102], arg0.field983[var102], arg0.field989[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field4808;
                            var59 = field4801;
                            method2092(arg0.field1002[var103], arg0.field983[var103], arg0.field989[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field4808;
                            var61 = field4801;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method408();
            byte var129;
            if (arg0.field956 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field956[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field1006[var51];
                class37 var133 = arg0.field978[var132];
                this.field4749[var50] = this.method2095(arg0, var132, var130, var133.field808, var133.field812, var133.field816, var133.field815, var56, var57);
                int var134 = arg0.field1003[var51];
                class37 var135 = arg0.field978[var134];
                this.field4789[var50] = this.method2095(arg0, var134, (long) var62 + var130, var135.field808, var135.field812, var135.field816, var135.field815, var58, var59);
                int var136 = arg0.field1001[var51];
                class37 var137 = arg0.field978[var136];
                this.field4793[var50] = this.method2095(arg0, var136, (long) var63 + var130, var137.field808, var137.field812, var137.field816, var137.field815, var60, var61);
            } else if (var129 == 1) {
                class147 var138 = arg0.field975[var51];
                long var139 = (long) ((var54 << 2) + (var138.field2508 > 0 ? 1024 : 2048) + (var138.field2507 + 256 << 12) + (var138.field2514 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field4749[var50] = this.method2095(arg0, arg0.field1006[var51], var139, var138.field2508, var138.field2507, var138.field2514, 0, var56, var57);
                this.field4789[var50] = this.method2095(arg0, arg0.field1003[var51], (long) var62 + var139, var138.field2508, var138.field2507, var138.field2514, 0, var58, var59);
                this.field4793[var50] = this.method2095(arg0, arg0.field1001[var51], (long) var63 + var139, var138.field2508, var138.field2507, var138.field2514, 0, var60, var61);
            }
            if (arg0.field984 == null) {
                this.field4768[var50] = -1;
            } else {
                this.field4768[var50] = arg0.field984[var51];
            }
            if (this.field4788 != null) {
                this.field4788[var50] = (byte) arg0.field1008[var51];
            }
            this.field4754[var50] = arg0.field973[var51];
            if (arg0.field988 != null) {
                this.field4761[var50] = arg0.field988[var51];
            }
            if (arg0.field976 != null) {
                this.field4752[var50] = arg0.field976[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field4751; var143++) {
            short var144 = this.field4768[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field4757 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field4751; var147++) {
            short var148 = this.field4768[var147];
            if (var146 != var148) {
                this.field4757[var145++] = var147;
                var146 = var148;
            }
        }
        this.field4757[var145] = this.field4751;
        field4758 = null;
        this.field4765 = method2094(this.field4765, this.field4766);
        this.field4764 = method2094(this.field4764, this.field4766);
        this.field4787 = method2094(this.field4787, this.field4766);
        this.field4748 = method2094(this.field4748, this.field4766);
        this.field4771 = method2097(this.field4771, this.field4766);
        this.field4783 = method2097(this.field4783, this.field4766);
    }

    @OriginalMember(owner = "client!io", name = "g", descriptor = "(I)V", line = 3067)
    public final void method2104(int arg0) {
        this.field4769 = (short) arg0;
        this.field4782.field4608 = false;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZZZLio;Lio;)Lhb;", line = 3072)
    private final class42 method2105(boolean arg0, boolean arg1, boolean arg2, class294 arg3, class294 arg4) {
        arg3.field4792 = this.field4792;
        arg3.field4776 = this.field4776;
        arg3.field4766 = this.field4766;
        arg3.field4751 = this.field4751;
        arg3.field4769 = this.field4769;
        arg3.field4778 = this.field4778;
        arg3.field4773 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field4753 == null || arg3.field4753.length < this.field4792) {
            arg3.field4753 = new int[this.field4792 + 100];
            arg3.field4759 = new int[this.field4792 + 100];
            arg3.field4762 = new int[this.field4792 + 100];
        }
        for (int var6 = 0; var6 < this.field4792; var6++) {
            arg3.field4753[var6] = this.field4753[var6];
            arg3.field4759[var6] = this.field4759[var6];
            arg3.field4762[var6] = this.field4762[var6];
        }
        if (arg3.field4763 == null) {
            arg3.field4763 = new class282();
        }
        arg3.field4763.field4608 = false;
        if (arg3.field4781 == null) {
            arg3.field4781 = new class254();
        }
        arg3.field4781.field4169 = false;
        if (arg0) {
            arg3.field4761 = this.field4761;
        } else {
            if (arg4.field4761 == null || arg4.field4761.length < this.field4751) {
                arg4.field4761 = new byte[this.field4751 + 100];
            }
            arg3.field4761 = arg4.field4761;
            for (int var7 = 0; var7 < this.field4751; var7++) {
                arg3.field4761[var7] = this.field4761[var7];
            }
        }
        if (arg1) {
            arg3.field4754 = this.field4754;
        } else {
            if (arg4.field4754 == null || arg4.field4754.length < this.field4751) {
                arg4.field4754 = new short[this.field4751 + 100];
            }
            arg3.field4754 = arg4.field4754;
            for (int var8 = 0; var8 < this.field4751; var8++) {
                arg3.field4754[var8] = this.field4754[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field4782 = this.field4782;
        } else {
            if (arg4.field4782 == null) {
                arg4.field4782 = new class282();
            }
            arg3.field4782 = arg4.field4782;
            arg3.field4782.field4608 = false;
        }
        if (arg2 || this.field4765 == null) {
            arg3.field4765 = this.field4765;
            arg3.field4764 = this.field4764;
            arg3.field4787 = this.field4787;
            arg3.field4748 = this.field4748;
            arg3.field4750 = this.field4750;
        } else {
            if (arg4.field4765 == null || arg4.field4765.length < this.field4766) {
                arg4.field4765 = new short[this.field4766 + 100];
                arg4.field4764 = new short[this.field4766 + 100];
                arg4.field4787 = new short[this.field4766 + 100];
                arg4.field4748 = new short[this.field4766 + 100];
            }
            arg3.field4765 = arg4.field4765;
            arg3.field4764 = arg4.field4764;
            arg3.field4787 = arg4.field4787;
            arg3.field4748 = arg4.field4748;
            for (int var9 = 0; var9 < this.field4766; var9++) {
                arg3.field4765[var9] = this.field4765[var9];
                arg3.field4764[var9] = this.field4764[var9];
                arg3.field4787[var9] = this.field4787[var9];
                arg3.field4748[var9] = this.field4748[var9];
            }
            if (class281.field4606) {
                if (arg4.field4750 == null) {
                    arg4.field4750 = new class282();
                }
                arg3.field4750 = arg4.field4750;
                arg3.field4750.field4608 = false;
            } else {
                arg3.field4750 = null;
            }
        }
        arg3.field4771 = this.field4771;
        arg3.field4783 = this.field4783;
        arg3.field4775 = this.field4775;
        arg3.field4774 = this.field4774;
        arg3.field4749 = this.field4749;
        arg3.field4789 = this.field4789;
        arg3.field4793 = this.field4793;
        arg3.field4768 = this.field4768;
        arg3.field4788 = this.field4788;
        arg3.field4770 = this.field4770;
        arg3.field4760 = this.field4760;
        arg3.field4756 = this.field4756;
        arg3.field4757 = this.field4757;
        arg3.field4755 = this.field4755;
        arg3.field4791 = this.field4791;
        arg3.field895 = this.field895;
        arg3.field4785 = this.field4785;
        arg3.field4752 = this.field4752;
        arg3.field4780 = this.field4780;
        arg3.field4772 = this.field4772;
        return arg3;
    }

    @OriginalMember(owner = "client!io", name = "d", descriptor = "(I)V", line = 3230)
    public final void method344(int arg0) {
        int var2 = class305.field4959[arg0];
        int var3 = class305.field4957[arg0];
        for (int var4 = 0; var4 < this.field4792; var4++) {
            int var5 = this.field4759[var4] * var3 - this.field4762[var4] * var2 >> 16;
            this.field4762[var4] = this.field4762[var4] * var3 + this.field4759[var4] * var2 >> 16;
            this.field4759[var4] = var5;
        }
        this.field4781.field4169 = false;
        this.field4763.field4608 = false;
    }

    @OriginalMember(owner = "client!io", name = "w", descriptor = "()V", line = 3249)
    public final void method2106() {
        int var10002;
        if (this.field4775 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field4792; var3++) {
                int var4 = this.field4775[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field4774 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field4774[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field4792) {
                int var7 = this.field4775[var6] & 0xFF;
                this.field4774[var7][var1[var7]++] = var6++;
            }
            this.field4775 = null;
        }
        if (this.field4788 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field4751; var10++) {
            int var11 = this.field4788[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field4770 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field4770[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field4751) {
            int var14 = this.field4788[var13] & 0xFF;
            this.field4770[var14][var8[var14]++] = var13++;
        }
        this.field4788 = null;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "()Z", line = 3341)
    public final boolean method418() {
        return this.field4790 && this.field4753 != null && this.field4765 != null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ISIB)I", line = 3346)
    private static final int method2107(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class305.field4956[class95.method723(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class305.field4968.method81(arg1 & 0xFFFF, -15915);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class305.field4968.method61(arg1 & 0xFFFF, (byte) 16);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!io", name = "l", descriptor = "()V", line = 3411)
    public final void method354() {
        for (int var1 = 0; var1 < this.field4792; var1++) {
            int var2 = this.field4762[var1];
            this.field4762[var1] = this.field4753[var1];
            this.field4753[var1] = -var2;
        }
        this.field4781.field4169 = false;
        this.field4763.field4608 = false;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIFFF)[F", line = 3426)
    private static final float[] method2108(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float var8 = 1.0F;
        float var9 = 0.0F;
        float var10 = (float) arg1 / 32767.0F;
        float var11 = -((float) Math.sqrt((double) (1.0F - var10 * var10)));
        float var12 = 1.0F - var10;
        float var13 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var13 != 0.0F) {
            var8 = (float) (-arg2) / var13;
            var9 = (float) arg0 / var13;
        }
        var7[0] = var8 * var8 * var12 + var10;
        var7[1] = var9 * var11;
        var7[2] = var8 * var9 * var12;
        var7[3] = -var9 * var11;
        var7[4] = var10;
        var7[5] = var8 * var11;
        var7[6] = var8 * var9 * var12;
        var7[7] = -var8 * var11;
        var7[8] = var9 * var9 * var12 + var10;
        float[] var14 = new float[9];
        float var15 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var16 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var17 = 1.0F - var15;
        var14[0] = var15;
        var14[1] = 0.0F;
        var14[2] = var16;
        var14[3] = 0.0F;
        var14[4] = 1.0F;
        var14[5] = 0.0F;
        var14[6] = -var16;
        var14[7] = 0.0F;
        var14[8] = var15;
        float[] var18 = new float[] { var7[6] * var14[2] + var7[0] * var14[0] + var7[3] * var14[1], var7[7] * var14[2] + var7[1] * var14[0] + var7[4] * var14[1], var7[8] * var14[2] + var7[2] * var14[0] + var7[5] * var14[1], var7[6] * var14[5] + var7[0] * var14[3] + var7[3] * var14[4], var7[7] * var14[5] + var7[1] * var14[3] + var7[4] * var14[4], var7[8] * var14[5] + var7[2] * var14[3] + var7[5] * var14[4], var7[6] * var14[8] + var7[0] * var14[6] + var7[3] * var14[7], var7[7] * var14[8] + var7[1] * var14[6] + var7[4] * var14[7], var7[8] * var14[8] + var7[2] * var14[6] + var7[5] * var14[7] };
        var18[0] *= arg4;
        var18[1] *= arg4;
        var18[2] *= arg4;
        var18[3] *= arg5;
        var18[4] *= arg5;
        var18[5] *= arg5;
        var18[6] *= arg6;
        var18[7] *= arg6;
        var18[8] *= arg6;
        return var18;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(III)V", line = 3493)
    public final void method351(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4792; var4++) {
            this.field4753[var4] = this.field4753[var4] * arg0 >> 7;
            this.field4759[var4] = this.field4759[var4] * arg1 >> 7;
            this.field4762[var4] = this.field4762[var4] * arg2 >> 7;
        }
        this.field4781.field4169 = false;
        this.field4763.field4608 = false;
    }

    @OriginalMember(owner = "client!io", name = "m", descriptor = "()I", line = 3506)
    public final int method356() {
        if (!this.field4781.field4169) {
            this.method2101();
        }
        return this.field4781.field4165;
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V", line = 3517)
    public final void method329(int arg0) {
        int var2 = class305.field4959[arg0];
        int var3 = class305.field4957[arg0];
        for (int var4 = 0; var4 < this.field4792; var4++) {
            int var5 = this.field4759[var4] * var2 + this.field4753[var4] * var3 >> 16;
            this.field4759[var4] = this.field4759[var4] * var3 - this.field4753[var4] * var2 >> 16;
            this.field4753[var4] = var5;
        }
        this.field4781.field4169 = false;
        this.field4763.field4608 = false;
    }

    @OriginalMember(owner = "client!io", name = "h", descriptor = "(I)V", line = 3537)
    public final void method2109(int arg0) {
        this.field4778 = (short) arg0;
        if (this.field4750 != null) {
            this.field4750.field4608 = false;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIIIIIJILgl;)V", line = 3543)
    public final void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class214 arg10) {
        if (this.field4766 == 0) {
            return;
        }
        if (!this.field4781.field4169) {
            this.method2101();
        }
        short var13 = this.field4781.field4166;
        short var14 = this.field4781.field4167;
        short var15 = this.field4781.field4168;
        if (arg10 != null) {
            arg10.method1479(arg0, arg9, arg5, arg6, arg7);
        }
        int var16 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var17 = arg1 * arg6 + arg2 * var16 >> 16;
        int var18 = (arg1 * var15 + arg2 * var13 >> 16) + var17;
        if (var18 <= 50) {
            return;
        }
        int var19 = (-var13 * arg2 + arg1 * var14 >> 16) + var17;
        if (var19 >= 3584) {
            return;
        }
        int var20 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var21 = var13 + var20 << 9;
        if (var21 / var18 <= class22.field559) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class349.field5581) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class349.field5587) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class7.field264) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class305.field4959[arg0];
            var27 = class305.field4957[arg0];
        }
        if (arg8 > 0L && class285.field4657 && var19 > 0) {
            int var28;
            int var29;
            if (var20 > 0) {
                var28 = var22 / var18;
                var29 = var21 / var19;
            } else {
                var28 = var22 / var19;
                var29 = var21 / var18;
            }
            int var30;
            int var31;
            if (var23 > 0) {
                var30 = var25 / var18;
                var31 = var24 / var19;
            } else {
                var30 = var25 / var19;
                var31 = var24 / var18;
            }
            if (class306.field4980 >= var28 && class306.field4980 <= var29 && class65.field1241 >= var30 && class65.field1241 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field4781.field4165;
                short var37 = this.field4781.field4172;
                short var38 = this.field4781.field4170;
                short var39 = this.field4781.field4171;
                int[] var40 = new int[] { var36, var37, var36, var37, var36, var37, var36, var37 };
                int[] var41 = new int[] { var38, var38, var39, var39, var38, var38, var39, var39 };
                int[] var42 = new int[] { var14, var14, var14, var14, var15, var15, var15, var15 };
                for (int var43 = 0; var43 < 8; var43++) {
                    int var44 = var40[var43];
                    int var45 = var42[var43];
                    int var46 = var41[var43];
                    if (arg0 != 0) {
                        int var47 = var26 * var46 + var27 * var44 >> 16;
                        var46 = var27 * var46 - var26 * var44 >> 16;
                        var44 = var47;
                    }
                    int var48 = arg5 + var44;
                    int var49 = arg6 + var45;
                    int var50 = arg7 + var46;
                    int var51 = arg3 * var50 + arg4 * var48 >> 16;
                    int var52 = arg4 * var50 - arg3 * var48 >> 16;
                    int var54 = arg2 * var49 - arg1 * var52 >> 16;
                    int var55 = arg1 * var49 + arg2 * var52 >> 16;
                    if (var55 > 0) {
                        int var57 = (var51 << 9) / var55;
                        int var58 = (var54 << 9) / var55;
                        if (var57 < var32) {
                            var32 = var57;
                        }
                        if (var57 > var33) {
                            var33 = var57;
                        }
                        if (var58 < var34) {
                            var34 = var58;
                        }
                        if (var58 > var35) {
                            var35 = var58;
                        }
                    }
                }
                if (class306.field4980 >= var32 && class306.field4980 <= var33 && class65.field1241 >= var34 && class65.field1241 <= var35) {
                    if (this.field895) {
                        class5.field111[class99.field1817++] = arg8;
                    } else {
                        if (field4800.length < this.field4766) {
                            field4800 = new int[this.field4766];
                            field4804 = new int[this.field4766];
                        }
                        int var59 = 0;
                        label124: while (true) {
                            if (var59 >= this.field4776) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field4751) {
                                        break label124;
                                    }
                                    short var80 = this.field4749[var79];
                                    short var81 = this.field4789[var79];
                                    short var82 = this.field4793[var79];
                                    if (this.method2084(class306.field4980, class65.field1241, field4804[var80], field4804[var81], field4804[var82], field4800[var80], field4800[var81], field4800[var82])) {
                                        class5.field111[class99.field1817++] = arg8;
                                        break label124;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field4753[var59];
                            int var61 = this.field4759[var59];
                            int var62 = this.field4762[var59];
                            if (arg0 != 0) {
                                int var63 = var26 * var62 + var27 * var60 >> 16;
                                var62 = var27 * var62 - var26 * var60 >> 16;
                                var60 = var63;
                            }
                            int var64 = arg5 + var60;
                            int var65 = arg6 + var61;
                            int var66 = arg7 + var62;
                            int var67 = arg3 * var66 + arg4 * var64 >> 16;
                            int var68 = arg4 * var66 - arg3 * var64 >> 16;
                            int var70 = arg2 * var65 - arg1 * var68 >> 16;
                            int var71 = arg1 * var65 + arg2 * var68 >> 16;
                            if (var71 < 50) {
                                break;
                            }
                            int var73 = (var67 << 9) / var71;
                            int var74 = (var70 << 9) / var71;
                            int var75 = this.field4791[var59];
                            int var76 = this.field4791[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field4755[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field4800[var78] = var73;
                                field4804[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class241.field4012;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method2091();
        var83.glPopMatrix();
        if (arg10 != null) {
            arg10.method1476(arg0, arg1, arg2, arg3, arg4, arg9, arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!io", name = "i", descriptor = "()I", line = 3825)
    public final int method346() {
        if (!this.field4781.field4169) {
            this.method2101();
        }
        return this.field4781.field4170;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I[IIIIZ)V", line = 3832)
    public final void method357(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field4803 = 0;
            field4805 = 0;
            field4802 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field4774.length) {
                    int[] var14 = this.field4774[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field4803 += this.field4753[var16];
                        field4805 += this.field4759[var16];
                        field4802 += this.field4762[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field4803 = field4803 / var11 + var8;
                field4805 = field4805 / var11 + var9;
                field4802 = field4802 / var11 + var10;
            } else {
                field4803 = var8;
                field4805 = var9;
                field4802 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field4774.length) {
                    int[] var22 = this.field4774[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field4753[var24] += var17;
                        this.field4759[var24] += var18;
                        this.field4762[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field4774.length) {
                    int[] var27 = this.field4774[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field4753[var29] -= field4803;
                        this.field4759[var29] -= field4805;
                        this.field4762[var29] -= field4802;
                        if (arg4 != 0) {
                            int var30 = class305.field4959[arg4];
                            int var31 = class305.field4957[arg4];
                            int var32 = this.field4759[var29] * var30 + this.field4753[var29] * var31 + 32767 >> 16;
                            this.field4759[var29] = this.field4759[var29] * var31 + 32767 - this.field4753[var29] * var30 >> 16;
                            this.field4753[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class305.field4959[arg2];
                            int var34 = class305.field4957[arg2];
                            int var35 = this.field4759[var29] * var34 + 32767 - this.field4762[var29] * var33 >> 16;
                            this.field4762[var29] = this.field4762[var29] * var34 + this.field4759[var29] * var33 + 32767 >> 16;
                            this.field4759[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class305.field4959[arg3];
                            int var37 = class305.field4957[arg3];
                            int var38 = this.field4762[var29] * var36 + this.field4753[var29] * var37 + 32767 >> 16;
                            this.field4762[var29] = this.field4762[var29] * var37 + 32767 - this.field4753[var29] * var36 >> 16;
                            this.field4753[var29] = var38;
                        }
                        this.field4753[var29] += field4803;
                        this.field4759[var29] += field4805;
                        this.field4762[var29] += field4802;
                    }
                }
            }
            if (arg5 && this.field4765 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field4774.length) {
                        int[] var41 = this.field4774[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field4791[var43];
                            int var45 = this.field4791[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field4755[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class305.field4959[arg4];
                                    int var49 = class305.field4957[arg4];
                                    int var50 = this.field4765[var47] * var49 + this.field4764[var47] * var48 + 32767 >> 16;
                                    this.field4764[var47] = (short) (this.field4764[var47] * var49 + 32767 - this.field4765[var47] * var48 >> 16);
                                    this.field4765[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class305.field4959[arg2];
                                    int var52 = class305.field4957[arg2];
                                    int var53 = this.field4764[var47] * var52 + 32767 - this.field4787[var47] * var51 >> 16;
                                    this.field4787[var47] = (short) (this.field4787[var47] * var52 + this.field4764[var47] * var51 + 32767 >> 16);
                                    this.field4764[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class305.field4959[arg3];
                                    int var55 = class305.field4957[arg3];
                                    int var56 = this.field4787[var47] * var54 + this.field4765[var47] * var55 + 32767 >> 16;
                                    this.field4787[var47] = (short) (this.field4787[var47] * var55 + 32767 - this.field4765[var47] * var54 >> 16);
                                    this.field4765[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field4750 != null) {
                    this.field4750.field4608 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field4774.length) {
                    int[] var59 = this.field4774[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field4753[var61] -= field4803;
                        this.field4759[var61] -= field4805;
                        this.field4762[var61] -= field4802;
                        this.field4753[var61] = this.field4753[var61] * arg2 >> 7;
                        this.field4759[var61] = this.field4759[var61] * arg3 >> 7;
                        this.field4762[var61] = this.field4762[var61] * arg4 >> 7;
                        this.field4753[var61] += field4803;
                        this.field4759[var61] += field4805;
                        this.field4762[var61] += field4802;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field4770 != null && this.field4761 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field4770.length) {
                        int[] var64 = this.field4770[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field4761[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field4761[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field4782.field4608 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field4770 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field4770.length) {
                    int[] var70 = this.field4770[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field4754[var72] & 0xFFFF;
                        int var74 = var73 >> 10 & 0x3F;
                        int var75 = var73 >> 7 & 0x7;
                        int var76 = var73 & 0x7F;
                        int var77 = arg2 + var74 & 0x3F;
                        int var78 = arg3 / 4 + var75;
                        if (var78 < 0) {
                            var78 = 0;
                        } else if (var78 > 7) {
                            var78 = 7;
                        }
                        int var79 = arg4 + var76;
                        if (var79 < 0) {
                            var79 = 0;
                        } else if (var79 > 127) {
                            var79 = 127;
                        }
                        this.field4754[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field4782.field4608 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "j", descriptor = "()V", line = 4244)
    public final void method348() {
        for (int var1 = 0; var1 < this.field4792; var1++) {
            this.field4753[var1] = this.field4753[var1] + 7 >> 4;
            this.field4759[var1] = this.field4759[var1] + 7 >> 4;
            this.field4762[var1] = this.field4762[var1] + 7 >> 4;
        }
        this.field4781.field4169 = false;
        this.field4763.field4608 = false;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(SS)V", line = 4259)
    public final void method2110(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field4751; var3++) {
            if (this.field4768[var3] == arg0) {
                this.field4768[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class305.field4968.method81(arg0 & 0xFFFF, -15915);
            var5 = class305.field4968.method61(arg0 & 0xFFFF, (byte) 16);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class305.field4968.method81(arg1 & 0xFFFF, -15915);
            var7 = class305.field4968.method61(arg1 & 0xFFFF, (byte) 16);
        }
        if (var4 != var6 || var5 != var7) {
            this.field4782.field4608 = false;
        }
    }

    @OriginalMember(owner = "client!io", name = "f", descriptor = "()I", line = 4294)
    public final int method339() {
        if (!this.field4781.field4169) {
            this.method2101();
        }
        return this.field4781.field4172;
    }

    @OriginalMember(owner = "client!io", name = "d", descriptor = "()I", line = 4300)
    public final int method331() {
        if (!this.field4781.field4169) {
            this.method2101();
        }
        return this.field4781.field4166;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(FFF)I", line = 4315)
    private static final int method2111(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!io", name = "k", descriptor = "()I", line = 4355)
    public final int method350() {
        if (!this.field4781.field4169) {
            this.method2101();
        }
        return this.field4781.field4171;
    }

    @OriginalMember(owner = "client!io", name = "x", descriptor = "()I", line = 4362)
    public final int method2112() {
        return this.field4769;
    }

    @OriginalMember(owner = "client!io", name = "g", descriptor = "()V", line = 4368)
    public final void method341() {
        for (int var1 = 0; var1 < this.field4792; var1++) {
            this.field4753[var1] = -this.field4753[var1];
            this.field4762[var1] = -this.field4762[var1];
        }
        this.field4781.field4169 = false;
        this.field4763.field4608 = false;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lka;)Lka;", line = 4380)
    public final class211 method2113(class211 arg0) {
        if (this.field4766 == 0) {
            return null;
        }
        if (!this.field4781.field4169) {
            this.method2101();
        }
        int var2;
        int var3;
        if (class259.field4236 > 0) {
            var2 = this.field4781.field4165 - (class259.field4236 * this.field4781.field4168 >> 8) >> 3;
            var3 = this.field4781.field4172 - (class259.field4236 * this.field4781.field4167 >> 8) >> 3;
        } else {
            var2 = this.field4781.field4165 - (class259.field4236 * this.field4781.field4167 >> 8) >> 3;
            var3 = this.field4781.field4172 - (class259.field4236 * this.field4781.field4168 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class259.field4241 > 0) {
            var4 = this.field4781.field4170 - (class259.field4241 * this.field4781.field4168 >> 8) >> 3;
            var5 = this.field4781.field4171 - (class259.field4241 * this.field4781.field4167 >> 8) >> 3;
        } else {
            var4 = this.field4781.field4170 - (class259.field4241 * this.field4781.field4167 >> 8) >> 3;
            var5 = this.field4781.field4171 - (class259.field4241 * this.field4781.field4168 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class211 var8;
        if (arg0 == null || arg0.field3507.length < var6 * var7) {
            var8 = new class211(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field5239 = arg0.field5229 = var6;
            arg0.field5228 = arg0.field5236 = var7;
            arg0.method1456();
        }
        var8.field5232 = var2;
        var8.field5238 = var4;
        if (field4800.length < this.field4766) {
            field4800 = new int[this.field4766];
            field4804 = new int[this.field4766];
        }
        for (int var9 = 0; var9 < this.field4776; var9++) {
            int var10 = (this.field4753[var9] - (this.field4759[var9] * class259.field4236 >> 8) >> 3) - var2;
            int var11 = (this.field4762[var9] - (this.field4759[var9] * class259.field4241 >> 8) >> 3) - var4;
            int var12 = this.field4791[var9];
            int var13 = this.field4791[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field4755[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field4800[var15] = var10;
                field4804[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field4751; var16++) {
            if (this.field4761[var16] <= 128) {
                short var17 = this.field4749[var16];
                short var18 = this.field4789[var16];
                short var19 = this.field4793[var16];
                int var20 = field4800[var17];
                int var21 = field4800[var18];
                int var22 = field4800[var19];
                int var23 = field4804[var17];
                int var24 = field4804[var18];
                int var25 = field4804[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class305.method2227(var8.field3507, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!io", name = "y", descriptor = "()V", line = 4503)
    public final void method2114() {
        if (this.field4765 == null) {
            this.method354();
            return;
        }
        for (int var1 = 0; var1 < this.field4792; var1++) {
            int var2 = this.field4762[var1];
            this.field4762[var1] = this.field4753[var1];
            this.field4753[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field4766; var3++) {
            short var4 = this.field4787[var3];
            this.field4787[var3] = this.field4765[var3];
            this.field4765[var3] = (short) (-var4);
        }
        this.field4781.field4169 = false;
        this.field4763.field4608 = false;
        if (this.field4750 != null) {
            this.field4750.field4608 = false;
        }
    }
}
