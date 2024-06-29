import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class218 extends class95 {

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    private int field3785 = -1;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    private int field3786 = -1;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
    private int field3788 = -32768;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "Lgk;")
    private class154 field3790 = null;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    private int field3771;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    private int field3779;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "I")
    private int field3783;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    private int field3768;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    private int field3781;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    private int field3770;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "Ljb;")
    private class256 field3782;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    private int field3772;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
    private int field3787;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "[I")
    public static int[] field3776 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "Lpj;")
    public static class237 field3789 = class33.method353(")4p=", 62);

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "[[[B")
    public static byte[][][] field3766;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(BII)V")
    private final void method1456(byte arg0, int arg1, int arg2) {
        if (this.field3782 != null) {
            int var4 = class241.field4246 - this.field3787;
            if (var4 > 100 && this.field3782.field4393 > 0) {
                int var5 = this.field3782.field4416.length - this.field3782.field4393;
                while (this.field3772 < var5 && this.field3782.field4383[this.field3772] < var4) {
                    var4 -= this.field3782.field4383[this.field3772];
                    this.field3772++;
                }
                if (this.field3772 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field3782.field4416.length; var7++) {
                        var6 += this.field3782.field4383[var7];
                    }
                    var4 %= var6;
                }
            }
            label58: {
                do {
                    do {
                        if (var4 <= this.field3782.field4383[this.field3772]) {
                            break label58;
                        }
                        class95.method706(arg2, false, this.field3772, (byte) 88, arg1, this.field3782);
                        var4 -= this.field3782.field4383[this.field3772];
                        this.field3772++;
                    } while (this.field3772 < this.field3782.field4416.length);
                    this.field3772 -= this.field3782.field4393;
                } while (this.field3772 >= 0 && this.field3782.field4416.length > this.field3772);
                this.field3782 = null;
            }
            this.field3787 = class241.field4246 - var4;
        }
        field3767++;
        int var8 = -119 % ((arg0 + 85) / 34);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lie;B)V")
    public static final void method1457(class32 arg0, byte arg1) {
        byte[] var2 = new byte[24];
        if (arg1 != 101) {
            field3766 = null;
        }
        field3773++;
        if (class100.field1781 != null) {
            try {
                int var3 = 0;
                class100.field1781.method627(0L, 15294);
                class100.field1781.method613(var2, arg1 - 8466);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method320(0, var2, 24, 16);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIII)V")
    public final void method703(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1456((byte) -122, ((arg2 - arg3 >> 1) + arg3) * 128 + 64, ((-arg0 + arg1 >> 1) + arg0) * 128 + 64);
        field3775++;
        if (arg4 != 0) {
            field3766 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3784++;
        class95 var11 = this.method1462(-21607);
        if (var11 != null) {
            var11.method183(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3788 = var11.method176();
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lgi;BLgi;)V")
    public static final void method1458(class153 arg0, byte arg1, class153 arg2) {
        if (arg0.field2731 != null) {
            arg0.method1053((byte) 32);
        }
        arg0.field2732 = arg2.field2732;
        int var3 = -114 / ((arg1 - 66) / 54);
        field3778++;
        arg0.field2731 = arg2;
        arg0.field2731.field2732 = arg0;
        arg0.field2732.field2731 = arg0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
    public static void method1459(boolean arg0) {
        field3776 = null;
        if (!arg0) {
            field3789 = null;
            field3766 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZB)Lqe;")
    private final class95 method1460(boolean arg0, byte arg1) {
        boolean var3 = class99.field1773 != class74.field1421;
        field3774++;
        class28 var4 = class94.method700(76, this.field3779);
        if (var4.field537 != null) {
            var4 = var4.method262(true);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field3771 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field571;
            var7 = var4.field507;
        } else {
            var6 = var4.field507;
            var7 = var4.field571;
        }
        int var8 = (var6 >> 1) + this.field3770;
        int var9 = (var6 + 1 >> 1) + this.field3770;
        int var10 = (var7 >> 1) + this.field3783;
        int var11 = this.field3783 + (var7 + 1 >> 1);
        this.method1456((byte) -121, var8 * 128, var10 * 128);
        boolean var12 = !var3 && var4.field561 && (this.field3785 != var4.field527 || this.field3786 != this.field3772 && class91.field1656 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int var13 = 6 % ((5 - arg1) / 32);
        int[][] var14 = class99.field1773[this.field3768];
        int var15 = var14[var8][var10] + var14[var9][var11] + var14[var8][var11] + var14[var9][var10] >> 2;
        int var16 = (this.field3770 << 7) + (var6 << 6);
        int var17 = (this.field3783 << 7) + (var7 << 6);
        int[][] var18 = null;
        if (var3) {
            var18 = class74.field1421[0];
        } else if (this.field3768 < 3) {
            var18 = class99.field1773[this.field3768 + 1];
        }
        boolean var19 = this.field3790 == null;
        class129 var20;
        if (this.field3782 == null) {
            var20 = var4.method264(this.field3781, var19 ? class106.field1894 : this.field3790, var17, false, var12, var14, (byte) -28, var15, var16, var18, this.field3771);
        } else {
            var20 = var4.method261(var12, this.field3781, this.field3772, var15, this.field3782, var19 ? class106.field1894 : this.field3790, var16, (byte) 125, var17, var14, var18, this.field3771);
        }
        return var20 == null ? null : var20.field2256;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "()I")
    public final int method176() {
        field3777++;
        return this.field3788;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZIB)I")
    public static final int method1461(int arg0, boolean arg1, int arg2, byte arg3) {
        field3780++;
        class44 var4 = (class44) class64.field1280.method568((long) arg0, -1);
        if (arg3 > -25) {
            field3776 = null;
        }
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field970.length; var6++) {
            if (var4.field970[var6] >= 0 && class148.field2633 > var4.field970[var6]) {
                class8 var7 = class112.method829((byte) -82, var4.field970[var6]);
                if (var7.field135 != null) {
                    class166 var8 = (class166) var7.field135.method568((long) arg2, -1);
                    if (var8 != null) {
                        if (arg1) {
                            var5 += var4.field958[var6] * var8.field2932;
                        } else {
                            var5 += var8.field2932;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)Lqe;")
    private final class95 method1462(int arg0) {
        field3769++;
        if (arg0 != -21607) {
            this.field3772 = 75;
        }
        return this.method1460(false, (byte) -82);
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(IIIIIIIZLqe;)V")
    public class218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class95 arg8) {
        this.field3771 = arg2;
        this.field3779 = arg0;
        this.field3783 = arg5;
        this.field3768 = arg3;
        this.field3781 = arg1;
        this.field3770 = arg4;
        if (arg6 != -1) {
            this.field3782 = class256.method1732(arg6, true);
            this.field3772 = 0;
            this.field3787 = class241.field4246 - 1;
            if (this.field3782.field4388 == 0 && arg8 != null && arg8 instanceof class218) {
                class218 var10 = (class218) arg8;
                if (this.field3782 == var10.field3782) {
                    this.field3772 = var10.field3772;
                    this.field3787 = var10.field3787;
                    return;
                }
            }
            if (arg7 && this.field3782.field4393 != -1) {
                this.field3772 = (int) ((double) this.field3782.field4416.length * Math.random());
                this.field3787 -= (int) (Math.random() * (double) this.field3782.field4383[this.field3772]);
                return;
            }
        }
    }
}
