import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class628 {

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "Llp;")
    private class395 field8659;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "Lij;")
    private class424 field8648;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    public int field8650;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    private int field8652;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    private int field8654;

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "[B")
    public byte[] field8658;

    @OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
    private int field8662;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    private int field8653;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "[I")
    public static int[] field8647 = null;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public static int field8649 = 0;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
    public static int field8657 = 0;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field8645;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field8646;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public static int field8651;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
    public static int field8655;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
    public static int field8656;

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
    public static int field8660;

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "[[Lin;")
    private class92[][] field8661;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
    public static void method3518(int arg0) {
        field8647 = null;
        if (arg0 != -25989) {
            method3518(-60);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZII[[ZII)V")
    public final void method3519(boolean arg0, int arg1, int arg2, boolean[][] arg3, int arg4, int arg5) {
        field8656++;
        this.field8648.method2438(true, false);
        if (arg4 > -2) {
            this.field8648 = null;
        }
        this.field8648.method2385(-56, false);
        this.field8648.method2440(1, (byte) -71);
        this.field8648.method2379(1, -15829);
        this.field8648.method2410(false, false, (byte) 87, -2);
        float var7 = 1.0F / (float) (this.field8648.field5663 * 128);
        if (arg0) {
            for (int var26 = 0; var26 < this.field8653; var26++) {
                int var27 = var26 << this.field8654;
                int var28 = var26 + 1 << this.field8654;
                label94: for (int var29 = 0; var29 < this.field8662; var29++) {
                    if (this.field8661[var29][var26] != null) {
                        int var30 = var29 << this.field8654;
                        int var31 = var29 + 1 << this.field8654;
                        for (int var32 = var30; var32 < var31; var32++) {
                            if ((-arg2) <= (var32 - arg1) && arg2 >= var32 - arg1) {
                                for (int var33 = var27; var33 < var28; var33++) {
                                    if ((var33 - arg5) >= (-arg2) && arg2 >= (var33 - arg5) && arg3[var32 + arg2 - arg1][arg2 + var33 - arg5]) {
                                        class477 var34 = this.field8648.method2364((byte) -127);
                                        var34.method2747(-16363, var7, var7, 1.0F);
                                        var34.method600(-var29, -var26, 0);
                                        this.field8648.method2384(2, class1.field2);
                                        this.field8661[var29][var26].method738(0);
                                        continue label94;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field8653; var8++) {
                int var9 = var8 << this.field8654;
                int var10 = var8 + 1 << this.field8654;
                for (int var11 = 0; var11 < this.field8662; var11++) {
                    class92 var12 = this.field8661[var11][var8];
                    if (var12 != null) {
                        class497 var13 = this.field8648.method2428(2, var12.field1269 * 3);
                        Buffer var14 = var13.method1369(-25053, true);
                        if (var14 != null) {
                            Stream var15 = this.field8648.method2409((byte) 127, var14);
                            int var16 = 0;
                            int var17 = var11 << this.field8654;
                            int var18 = var11 + 1 << this.field8654;
                            for (int var19 = var9; var19 < var10; var19++) {
                                if (var19 - arg5 >= -arg2 && arg2 >= (var19 - arg5)) {
                                    int var21 = this.field8659.field3561 * var19 + var17;
                                    for (int var22 = var17; var22 < var18; var22++) {
                                        if ((var22 - arg1) >= (-arg2) && (var22 - arg1) <= arg2 && arg3[var22 + arg2 - arg1][arg2 + var19 - arg5]) {
                                            short[] var23 = this.field8659.field5019[var21];
                                            if (var23 != null) {
                                                if (Stream.method3798()) {
                                                    for (int var25 = 0; var25 < var23.length; var25++) {
                                                        var16++;
                                                        var15.method3785(var23[var25] & 0xFFFF);
                                                    }
                                                } else {
                                                    for (int var24 = 0; var24 < var23.length; var24++) {
                                                        var15.method3795(var23[var24] & 0xFFFF);
                                                        var16++;
                                                    }
                                                }
                                            }
                                        }
                                        var21++;
                                    }
                                }
                            }
                            var15.method3793();
                            if (var13.method1368(true) && var16 > 0) {
                                class477 var20 = this.field8648.method2364((byte) -127);
                                var20.method2747(-16363, var7, var7, 1.0F);
                                var20.method600(-var11, -var8, 0);
                                this.field8648.method2384(2, class1.field2);
                                var12.method737(false, var16 / 3, var13);
                            }
                        }
                    }
                }
            }
        }
        this.field8648.method2418(11032);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BLr;II)V")
    public final void method3520(byte arg0, class185 arg1, int arg2, int arg3) {
        field8655++;
        class283 var5 = (class283) arg1;
        int var6 = var5.field3569 + arg3 + 1;
        int var7 = var5.field3574 + arg2 + 1;
        int var8 = this.field8650 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field3565;
        if (arg0 > -26) {
            return;
        }
        int var11 = var5.field3568;
        int var12 = this.field8650 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var10 -= var13;
            var8 += this.field8650 * var13;
            var9 += var11 * var13;
            var6 = 1;
        }
        int var14 = 0;
        if (this.field8652 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field8652;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var7 = 1;
            var12 += var16;
            var11 -= var16;
            var8 += var16;
            var9 += var16;
            var14 += var16;
        }
        if ((var7 + var11) >= this.field8650) {
            int var17 = var7 + var11 + 1 - this.field8650;
            var11 -= var17;
            var14 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class387.method2203(var8, var12, var14, var5.field3572, var11, var10, 1, var9, this.field8658);
            this.method3521(var10, var6, var11, var7, -3006);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIII)V")
    private final void method3521(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8645++;
        if (this.field8661 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg3 - (1 - arg2) - 1 >> 7;
        if (arg4 != -3006) {
            return;
        }
        int var8 = arg1 - 1 >> 7;
        int var9 = arg0 + arg1 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class92[] var11 = this.field8661[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field1272 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V")
    public final void method3522(int arg0) {
        field8651++;
        this.field8661 = new class92[this.field8662][this.field8653];
        for (int var2 = 0; var2 < this.field8653; var2++) {
            for (int var3 = 0; var3 < this.field8662; var3++) {
                this.field8661[var3][var2] = new class92(this.field8648, this, this.field8659, var3, var2, this.field8654, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field8661[var3][var2].field1269 == 0) {
                    this.field8661[var3][var2] = null;
                }
            }
        }
        if (arg0 != 128) {
            method3518(-88);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILr;II)V")
    public final void method3523(int arg0, class185 arg1, int arg2, int arg3) {
        field8660++;
        class283 var5 = (class283) arg1;
        int var6 = var5.field3574 + arg3 + 1;
        int var7 = var5.field3569 + arg0 + 1;
        int var8 = var6 + (this.field8650 * var7);
        int var9 = 0;
        int var10 = var5.field3565;
        int var11 = var5.field3568;
        int var12 = this.field8650 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var8 += this.field8650 * var13;
            var10 -= var13;
            var7 = 1;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if (this.field8652 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field8652;
            var10 -= var15;
        }
        if (~var6 >= arg2) {
            int var16 = 1 - var6;
            var14 += var16;
            var11 -= var16;
            var8 += var16;
            var9 += var16;
            var12 += var16;
            var6 = 1;
        }
        if (this.field8650 <= var6 + var11) {
            int var17 = var6 - (-var11 - 1) - this.field8650;
            var14 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class550.method3199(this.field8658, var5.field3572, var10, var12, var8, 10076, var9, var14, var11);
            this.method3521(var10, var7, var11, var6, -3006);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lr;III)Z")
    public final boolean method3524(class185 arg0, int arg1, int arg2, int arg3) {
        field8646++;
        class283 var5 = (class283) arg0;
        int var6 = var5.field3569 + arg3 + 1;
        int var7 = var5.field3574 + arg2 + 1;
        int var8 = this.field8650 * var6 + var7;
        int var9 = var5.field3565;
        int var10 = var5.field3568;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var8 += this.field8650 * var11;
            var9 -= var11;
            var6 = 1;
        }
        int var12 = this.field8650 - var10;
        if (var6 + var9 >= this.field8652) {
            int var13 = var6 + var9 + 1 - this.field8652;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += var14;
            var7 = 1;
            var12 += var14;
            var10 -= var14;
        }
        if ((var7 + var10) >= this.field8650) {
            int var15 = var7 + var10 + 1 - this.field8650;
            var12 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            int var17 = (arg1 - 1) * this.field8650 + var12;
            return class115.method903(this.field8658, var17, var9, (byte) -89, var8, arg1, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lij;Llp;)V")
    public class628(class424 arg0, class395 arg1) {
        this.field8659 = arg1;
        this.field8648 = arg0;
        this.field8650 = (this.field8659.field3561 * this.field8659.field3557 >> this.field8648.field5637) + 2;
        this.field8652 = (this.field8659.field3557 * this.field8659.field3555 >> this.field8648.field5637) + 2;
        this.field8654 = this.field8648.field5637 + 7 - this.field8659.field3550;
        this.field8658 = new byte[this.field8652 * this.field8650];
        this.field8662 = this.field8659.field3561 >> this.field8654;
        this.field8653 = this.field8659.field3555 >> this.field8654;
    }
}
