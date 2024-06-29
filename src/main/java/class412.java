import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class412 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Lkb;")
    private class634 field5821;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Lgj;")
    private class580 field5839;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public int field5826;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    private int field5830;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    private int field5824;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "[B")
    public byte[] field5833;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    private int field5822;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    private int field5831;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Lfc;")
    public static class235 field5823 = new class235(33, 1);

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "[I")
    public static int[] field5836 = new int[2];

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "Lpw;")
    public static class649 field5837 = new class649();

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "[S")
    public static short[] field5838 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "[[Ltw;")
    private class185[][] field5829;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lw;BII)V", line = 3)
    public final void method2346(class271 arg0, byte arg1, int arg2, int arg3) {
        field5827++;
        class498 var5 = (class498) arg0;
        int var6 = var5.field6848 + arg2 + 1;
        int var7 = var5.field6854 + arg3 + 1;
        int var8 = var6 + (this.field5826 * var7);
        int var9 = 0;
        int var10 = var5.field6850;
        int var11 = var5.field6855;
        int var12 = this.field5826 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var10 -= var13;
            var9 += var11 * var13;
            var8 += this.field5826 * var13;
            var7 = 1;
        }
        int var14 = 0;
        if ((var7 + var10) >= this.field5830) {
            int var15 = var10 + var7 + 1 - this.field5830;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var6 = 1;
            var8 += var16;
            var14 += var16;
            var12 += var16;
            var11 -= var16;
            var9 += var16;
        }
        if ((var6 + var11) >= this.field5826) {
            int var17 = var11 + var6 + 1 - this.field5826;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            int var18 = -48 % ((arg1 + 56) / 33);
            class652.method3626(var12, var11, var9, this.field5833, var10, -17864, var14, var8, var5.field6844);
            this.method2348(var11, var6, (byte) 7, var10, var7);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 76)
    public static void method2347(int arg0) {
        field5837 = null;
        field5838 = null;
        if (arg0 != 21108) {
            field5838 = null;
        }
        field5836 = null;
        field5823 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIBII)V", line = 99)
    private final void method2348(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field5835++;
        if (this.field5829 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg0 + arg1 - 1 - 1 >> 7;
        int var8 = arg4 - 1 >> 7;
        if (arg2 != 7) {
            return;
        }
        int var9 = arg3 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class185[] var11 = this.field5829[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field2727 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIILw;)V", line = 144)
    public final void method2349(int arg0, int arg1, int arg2, class271 arg3) {
        field5828++;
        class498 var5 = (class498) arg3;
        int var6 = var5.field6848 + arg0 + 1;
        int var7 = var5.field6854 + arg2 + 1;
        int var8 = this.field5826 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field6850;
        int var11 = var5.field6855;
        int var12 = this.field5826 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var8 += this.field5826 * var13;
            var10 -= var13;
            var9 += var11 * var13;
            var7 = 1;
        }
        int var14 = arg1;
        if (var7 + var10 >= this.field5830) {
            int var15 = var7 + var10 + 1 - this.field5830;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var6 = 1;
            var9 += var16;
            var8 += var16;
            var12 += var16;
            var14 = arg1 + var16;
            var11 -= var16;
        }
        if (this.field5826 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field5826;
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class608.method3359(var11, var8, this.field5833, var9, var14, var10, var5.field6844, arg1 ^ 0x3, var12);
            this.method2348(var11, var6, (byte) 7, var10, var7);
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 212)
    public final void method2350(int arg0) {
        this.field5829 = new class185[this.field5822][this.field5831];
        field5825++;
        int var2 = 59 / ((46 - arg0) / 50);
        for (int var3 = 0; var3 < this.field5831; var3++) {
            for (int var4 = 0; var4 < this.field5822; var4++) {
                this.field5829[var4][var3] = new class185(this.field5839, this, this.field5821, var4, var3, this.field5824, var4 * 128 + 1, var3 * 128 - -1);
                if (this.field5829[var4][var3].field2724 == 0) {
                    this.field5829[var4][var3] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZILw;I)Z", line = 249)
    public final boolean method2351(boolean arg0, int arg1, class271 arg2, int arg3) {
        field5832++;
        if (arg0) {
            return false;
        }
        class498 var5 = (class498) arg2;
        int var6 = var5.field6854 + arg3 + 1;
        int var7 = var5.field6848 + arg1 + 1;
        int var8 = this.field5826 * var6 + var7;
        int var9 = var5.field6850;
        int var10 = var5.field6855;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var9 -= var11;
            var8 += this.field5826 * var11;
            var6 = 1;
        }
        int var12 = this.field5826 - var10;
        if (this.field5830 <= (var6 + var9)) {
            int var13 = var6 + var9 + 1 - this.field5830;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var7 = 1;
            var12 += var14;
            var8 += var14;
        }
        if (var7 + var10 >= this.field5826) {
            int var15 = var7 + var10 + 1 - this.field5826;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field5826 + var12;
            return class517.method2876(var9, var16, var17, this.field5833, 0, var10, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lgj;Lkb;)V", line = 334)
    public class412(class580 arg0, class634 arg1) {
        this.field5821 = arg1;
        this.field5839 = arg0;
        this.field5826 = (this.field5821.field1919 * this.field5821.field1918 >> this.field5839.field8036) + 2;
        this.field5830 = (this.field5821.field1919 * this.field5821.field1916 >> this.field5839.field8036) + 2;
        this.field5824 = this.field5839.field8036 + 7 - this.field5821.field1921;
        this.field5833 = new byte[this.field5830 * this.field5826];
        this.field5822 = this.field5821.field1918 >> this.field5824;
        this.field5831 = this.field5821.field1916 >> this.field5824;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZII[[ZII)V", line = 349)
    public final void method2352(boolean arg0, int arg1, int arg2, boolean[][] arg3, int arg4, int arg5) {
        this.field5839.method3172(73, false);
        field5834++;
        this.field5839.method3250(false, false);
        this.field5839.method3242(-2, 1);
        this.field5839.method3229(1, 12);
        int var7 = 6 / ((arg5 - 76) / 40);
        this.field5839.method3183(false, 128, -2, false);
        float var8 = 1.0F / (float) (this.field5839.field8022 * 128);
        if (arg0) {
            for (int var27 = 0; var27 < this.field5831; var27++) {
                int var28 = var27 << this.field5824;
                int var29 = var27 + 1 << this.field5824;
                label91: for (int var30 = 0; var30 < this.field5822; var30++) {
                    if (this.field5829[var30][var27] != null) {
                        int var31 = var30 << this.field5824;
                        int var32 = var30 + 1 << this.field5824;
                        for (int var33 = var31; var33 < var32; var33++) {
                            if ((-arg4) <= (var33 - arg2) && (var33 - arg2) <= arg4) {
                                for (int var34 = var28; var34 < var29; var34++) {
                                    if (var34 - arg1 >= -arg4 && arg4 >= var34 - arg1 && arg3[var33 - (arg2 - arg4)][arg4 + var34 - arg1]) {
                                        class367 var35 = this.field5839.method3204(125);
                                        var35.method2154(var8, (byte) 69, 1.0F, var8);
                                        var35.method1285(-var30, -var27, 0);
                                        this.field5839.method3201(-17, class133.field1868);
                                        this.field5829[var30][var27].method1240(false);
                                        continue label91;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < this.field5831; var9++) {
                int var10 = var9 << this.field5824;
                int var11 = var9 + 1 << this.field5824;
                for (int var12 = 0; var12 < this.field5822; var12++) {
                    class185 var13 = this.field5829[var12][var9];
                    if (var13 != null) {
                        class659 var14 = this.field5839.method3202((byte) -62, var13.field2724 * 3);
                        Buffer var15 = var14.method779((byte) -20, true);
                        if (var15 != null) {
                            Stream var16 = this.field5839.method3212(var15, (byte) 54);
                            int var17 = 0;
                            int var18 = var12 << this.field5824;
                            int var19 = var12 + 1 << this.field5824;
                            for (int var20 = var10; var20 < var11; var20++) {
                                if (var20 - arg1 >= -arg4 && arg4 >= var20 - arg1) {
                                    int var22 = this.field5821.field1918 * var20 + var18;
                                    for (int var23 = var18; var23 < var19; var23++) {
                                        if ((var23 - arg2) >= (-arg4) && arg4 >= (var23 - arg2) && arg3[arg4 + var23 - arg2][var20 - (arg1 - arg4)]) {
                                            short[] var24 = this.field5821.field8893[var22];
                                            if (var24 != null) {
                                                if (Stream.method3418()) {
                                                    for (int var26 = 0; var26 < var24.length; var26++) {
                                                        var16.method3425(var24[var26] & 0xFFFF);
                                                        var17++;
                                                    }
                                                } else {
                                                    for (int var25 = 0; var25 < var24.length; var25++) {
                                                        var16.method3416(var24[var25] & 0xFFFF);
                                                        var17++;
                                                    }
                                                }
                                            }
                                        }
                                        var22++;
                                    }
                                }
                            }
                            var16.method3426();
                            if (var14.method774(-22324) && var17 > 0) {
                                class367 var21 = this.field5839.method3204(122);
                                var21.method2154(var8, (byte) 69, 1.0F, var8);
                                var21.method1285(-var12, -var9, 0);
                                this.field5839.method3201(-17, class133.field1868);
                                var13.method1238(var14, var17 / 3, (byte) 106);
                            }
                        }
                    }
                }
            }
        }
        this.field5839.method3198((byte) -87);
    }
}
