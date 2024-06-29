import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class219 {

    @OriginalMember(owner = "client!aca", name = "e", descriptor = "Lrl;")
    private class232 field2860;

    @OriginalMember(owner = "client!aca", name = "k", descriptor = "Leha;")
    private class166 field2866;

    @OriginalMember(owner = "client!aca", name = "q", descriptor = "I")
    public int field2872;

    @OriginalMember(owner = "client!aca", name = "j", descriptor = "I")
    private int field2865;

    @OriginalMember(owner = "client!aca", name = "h", descriptor = "I")
    private int field2863;

    @OriginalMember(owner = "client!aca", name = "g", descriptor = "[B")
    public byte[] field2862;

    @OriginalMember(owner = "client!aca", name = "l", descriptor = "I")
    private int field2867;

    @OriginalMember(owner = "client!aca", name = "r", descriptor = "I")
    private int field2873;

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "I")
    public static int field2857 = -1;

    @OriginalMember(owner = "client!aca", name = "m", descriptor = "F")
    public static float field2868;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!aca", name = "d", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!aca", name = "f", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!aca", name = "i", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!aca", name = "n", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!aca", name = "o", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!aca", name = "p", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "[[Lk;")
    private class62[][] field2858;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILr;II)Z")
    public final boolean method1282(int arg0, class709 arg1, int arg2, int arg3) {
        field2856++;
        class281 var5 = (class281) arg1;
        int var6 = var5.field4074 + arg2 + 1;
        int var7 = var5.field4083 + arg3 + 1;
        int var8 = this.field2872 * var7 + var6;
        int var9 = var5.field4085;
        int var10 = var5.field4086;
        int var11 = this.field2872 - var10;
        if (var7 <= arg0) {
            int var12 = 1 - var7;
            var9 -= var12;
            var8 += this.field2872 * var12;
            var7 = 1;
        }
        if ((var7 + var9) >= this.field2865) {
            int var13 = var7 + var9 + 1 - this.field2865;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var8 += var14;
            var11 += var14;
            var10 -= var14;
        }
        if (var6 + var10 >= this.field2872) {
            int var15 = var6 + var10 + 1 - this.field2872;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field2872 + var11;
            return class636.method3561(var9, (byte) -126, var16, var17, this.field2862, var8, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V")
    public final void method1283(int arg0) {
        field2869++;
        this.field2858 = new class62[this.field2867][this.field2873];
        for (int var2 = arg0; var2 < this.field2873; var2++) {
            for (int var3 = 0; var3 < this.field2867; var3++) {
                this.field2858[var3][var2] = new class62(this.field2860, this, this.field2866, var3, var2, this.field2863, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field2858[var3][var2].field886 == 0) {
                    this.field2858[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1284(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.field2860.method1530((byte) 125, false);
        field2871++;
        this.field2860.method1453(false, arg1 + 35);
        this.field2860.method1422(11665, 1);
        this.field2860.method1503(arg1, (byte) 116);
        this.field2860.method1477(false, false, -69, -2);
        float var7 = 1.0F / (float) (this.field2860.field3428 * 128);
        if (arg4) {
            for (int var8 = 0; var8 < this.field2873; var8++) {
                int var9 = var8 << this.field2863;
                int var10 = var8 + 1 << this.field2863;
                label142: for (int var11 = 0; var11 < this.field2867; var11++) {
                    if (this.field2858[var11][var8] != null) {
                        int var12 = var11 << this.field2863;
                        int var13 = var11 + 1 << this.field2863;
                        for (int var14 = var12; var14 < var13; var14++) {
                            if (-arg5 <= var14 - arg0 && arg5 >= var14 - arg0) {
                                for (int var15 = var9; var15 < var10; var15++) {
                                    if (-arg5 <= var15 - arg2 && arg5 >= (var15 - arg2) && arg3[var14 + arg5 - arg0][var15 + arg5 - arg2]) {
                                        class474 var16 = this.field2860.method1410((byte) -123);
                                        var16.method2886(1.0F, var7, var7, (byte) -65);
                                        var16.method882(-var11, -var8, 0);
                                        this.field2860.method1460(class393.field5647, -125);
                                        this.field2858[var11][var8].method439((byte) 37);
                                        continue label142;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field2873; var17++) {
                int var18 = var17 << this.field2863;
                int var19 = var17 + 1 << this.field2863;
                for (int var20 = 0; var20 < this.field2867; var20++) {
                    class62 var21 = this.field2858[var20][var17];
                    if (var21 != null) {
                        class174 var22 = this.field2860.method1526(var21.field886 * 3, (byte) -41);
                        Buffer var23 = var22.method968(true, (byte) 45);
                        if (var23 != null) {
                            Stream var24 = this.field2860.method1473(arg1 - 1969469653, var23);
                            int var25 = 0;
                            int var26 = var20 << this.field2863;
                            int var27 = var20 + 1 << this.field2863;
                            for (int var28 = var18; var28 < var19; var28++) {
                                if ((var28 - arg2) >= (-arg5) && arg5 >= (var28 - arg2)) {
                                    int var30 = this.field2866.field4814 * var28 + var26;
                                    for (int var31 = var26; var31 < var27; var31++) {
                                        if ((var31 - arg0) >= (-arg5) && arg5 >= (var31 - arg0) && arg3[var31 + arg5 - arg0][var28 - (arg2 - arg5)]) {
                                            short[] var32 = this.field2866.field2300[var30];
                                            if (var32 != null) {
                                                if (Stream.method2614()) {
                                                    for (int var33 = 0; var33 < var32.length; var33++) {
                                                        var25++;
                                                        var24.method2610(var32[var33] & 0xFFFF);
                                                    }
                                                } else {
                                                    for (int var34 = 0; var34 < var32.length; var34++) {
                                                        var25++;
                                                        var24.method2619(var32[var34] & 0xFFFF);
                                                    }
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            var24.method2613();
                            if (var22.method975(arg1 - 36) && var25 > 0) {
                                class474 var29 = this.field2860.method1410((byte) -119);
                                var29.method2886(1.0F, var7, var7, (byte) -65);
                                var29.method882(-var20, -var17, 0);
                                this.field2860.method1460(class393.field5647, -124);
                                var21.method440(var22, (byte) -16, var25 / 3);
                            }
                        }
                    }
                }
            }
        }
        this.field2860.method1459(0);
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIZLr;)V")
    public final void method1285(int arg0, int arg1, boolean arg2, class709 arg3) {
        field2864++;
        class281 var5 = (class281) arg3;
        int var6 = var5.field4074 + arg1 + 1;
        int var7 = var5.field4083 + arg0 + 1;
        int var8 = var6 + (this.field2872 * var7);
        int var9 = 0;
        int var10 = var5.field4085;
        int var11 = var5.field4086;
        int var12 = this.field2872 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var8 += this.field2872 * var13;
            var7 = 1;
            var10 -= var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if ((var7 + var10) >= this.field2865) {
            int var15 = var7 + var10 + 1 - this.field2865;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var6 = 1;
            var12 += var16;
            var9 += var16;
            var8 += var16;
            var14 += var16;
            var11 -= var16;
        }
        if (var6 + var11 >= this.field2872) {
            int var17 = var11 + var6 - (this.field2872 - 1);
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class447.method2727(var11, var14, var10, var8, arg2, var9, this.field2862, var12, var5.field4073);
            this.method1287(-67, var6, var11, var7, var10);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(BLr;II)V")
    public final void method1286(byte arg0, class709 arg1, int arg2, int arg3) {
        field2870++;
        class281 var5 = (class281) arg1;
        int var6 = var5.field4074 + arg2 + 1;
        int var7 = var5.field4083 + arg3 + 1;
        int var8 = var6 + (this.field2872 * var7);
        if (arg0 != -55) {
            this.method1285(-9, -114, true, null);
        }
        int var9 = 0;
        int var10 = var5.field4085;
        int var11 = var5.field4086;
        int var12 = this.field2872 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var8 += this.field2872 * var14;
            var7 = 1;
            var9 += var11 * var14;
        }
        if ((var7 + var10) >= this.field2865) {
            int var15 = var7 + var10 + 1 - this.field2865;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var12 += var16;
            var9 += var16;
            var6 = 1;
            var8 += var16;
            var11 -= var16;
            var13 += var16;
        }
        if (var6 + var11 >= this.field2872) {
            int var17 = var6 + var11 + 1 - this.field2872;
            var12 += var17;
            var11 -= var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class359.method2289(var12, var9, (byte) -91, this.field2862, var10, var5.field4073, var8, var11, var13);
            this.method1287(arg0 ^ 0x4C, var6, var11, var7, var10);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIIII)V")
    private final void method1287(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2859++;
        if (this.field2858 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg2 - 1 - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        if (arg0 > -50) {
            field2868 = 1.2845466F;
        }
        int var9 = arg3 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class62[] var11 = this.field2858[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field906 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Lrl;Leha;)V")
    public class219(class232 arg0, class166 arg1) {
        this.field2860 = arg0;
        this.field2866 = arg1;
        this.field2872 = (this.field2866.field4818 * this.field2866.field4814 >> this.field2860.field3433) + 2;
        this.field2865 = (this.field2866.field4818 * this.field2866.field4817 >> this.field2860.field3433) + 2;
        this.field2863 = this.field2860.field3433 + 7 - this.field2866.field4822;
        this.field2862 = new byte[this.field2872 * this.field2865];
        this.field2867 = this.field2866.field4814 >> this.field2863;
        this.field2873 = this.field2866.field4817 >> this.field2863;
    }
}
