import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class760 {

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "Lek;")
    private class535 field10479;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "Lsf;")
    private class551 field10473;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    public int field10472;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    private int field10460;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    private int field10467;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "[B")
    public byte[] field10462;

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
    private int field10480;

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
    private int field10477;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "Z")
    public static boolean field10465 = true;

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "I")
    public static int field10478 = 0;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "[[I")
    public static int[][] field10471 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field10461;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field10463;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field10464;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field10466;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field10468;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field10469;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public static int field10470;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
    public static int field10474;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    public static int field10475;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "[[Lkg;")
    private class287[][] field10476;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([[ZIIZBI)V")
    public final void method4201(boolean[][] arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5) {
        this.field10473.method3128((byte) 106, false);
        field10474++;
        int var7 = 3 / ((-arg4 - 38) / 48);
        this.field10473.method3112(false, (byte) 91);
        this.field10473.method3117(1, true);
        this.field10473.method3113(-3334, 1);
        this.field10473.method3131(-2, 0, false, false);
        float var8 = 1.0F / (float) (this.field10473.field7775 * 128);
        if (arg3) {
            for (int var9 = 0; var9 < this.field10477; var9++) {
                int var10 = var9 << this.field10467;
                int var11 = var9 + 1 << this.field10467;
                label142: for (int var12 = 0; var12 < this.field10480; var12++) {
                    if (this.field10476[var12][var9] != null) {
                        int var13 = var12 << this.field10467;
                        int var14 = var12 + 1 << this.field10467;
                        for (int var15 = var13; var15 < var14; var15++) {
                            if ((-arg2) <= (var15 - arg5) && (var15 - arg5) <= arg2) {
                                for (int var16 = var10; var16 < var11; var16++) {
                                    if (var16 - arg1 >= -arg2 && arg2 >= (var16 - arg1) && arg0[arg2 + var15 - arg5][var16 + arg2 - arg1]) {
                                        class421 var17 = this.field10473.method3125(0);
                                        var17.method2490(var8, var8, -14978, 1.0F);
                                        var17.method1860(-var12, -var9, 0);
                                        this.field10473.method3099(-122, class462.field6288);
                                        this.field10476[var12][var9].method1831(true);
                                        continue label142;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var18 = 0; var18 < this.field10477; var18++) {
                int var19 = var18 << this.field10467;
                int var20 = var18 + 1 << this.field10467;
                for (int var21 = 0; var21 < this.field10480; var21++) {
                    class287 var22 = this.field10476[var21][var18];
                    if (var22 != null) {
                        class226 var23 = this.field10473.method3136((byte) -69, var22.field3948 * 3);
                        Buffer var24 = var23.method1545(true, -4450);
                        if (var24 != null) {
                            Stream var25 = this.field10473.method3170((byte) 5, var24);
                            int var26 = 0;
                            int var27 = var21 << this.field10467;
                            int var28 = var21 + 1 << this.field10467;
                            for (int var29 = var19; var29 < var20; var29++) {
                                if ((var29 - arg1) >= (-arg2) && arg2 >= (var29 - arg1)) {
                                    int var31 = this.field10479.field4037 * var29 + var27;
                                    for (int var32 = var27; var32 < var28; var32++) {
                                        if (var32 - arg5 >= -arg2 && (var32 - arg5) <= arg2 && arg0[var32 + arg2 - arg5][var29 + arg2 - arg1]) {
                                            short[] var33 = this.field10479.field7269[var31];
                                            if (var33 != null) {
                                                if (Stream.method3910()) {
                                                    for (int var35 = 0; var35 < var33.length; var35++) {
                                                        var25.method3912(var33[var35] & 0xFFFF);
                                                        var26++;
                                                    }
                                                } else {
                                                    for (int var34 = 0; var34 < var33.length; var34++) {
                                                        var25.method3903(var33[var34] & 0xFFFF);
                                                        var26++;
                                                    }
                                                }
                                            }
                                        }
                                        var31++;
                                    }
                                }
                            }
                            var25.method3901();
                            if (var23.method1544(124) && var26 > 0) {
                                class421 var30 = this.field10473.method3125(0);
                                var30.method2490(var8, var8, -14978, 1.0F);
                                var30.method1860(-var21, -var18, 0);
                                this.field10473.method3099(39, class462.field6288);
                                var22.method1834(var26 / 3, -16093, var23);
                            }
                        }
                    }
                }
            }
        }
        this.field10473.method3108(3);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IBILr;)Z")
    public final boolean method4202(int arg0, byte arg1, int arg2, class196 arg3) {
        field10466++;
        class736 var5 = (class736) arg3;
        int var6 = var5.field10162 + arg2 + 1;
        int var7 = 19 / ((arg1 + 7) / 53);
        int var8 = var5.field10164 + arg0 + 1;
        int var9 = var8 + (this.field10472 * var6);
        int var10 = var5.field10158;
        int var11 = var5.field10161;
        int var12 = this.field10472 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var10 -= var13;
            var6 = 1;
            var9 += this.field10472 * var13;
        }
        if (this.field10460 <= var6 + var10) {
            int var14 = var6 + var10 + 1 - this.field10460;
            var10 -= var14;
        }
        if (var8 <= 0) {
            int var15 = 1 - var8;
            var8 = 1;
            var11 -= var15;
            var12 += var15;
            var9 += var15;
        }
        if (var8 + var11 >= this.field10472) {
            int var16 = var11 + var8 + 1 - this.field10472;
            var11 -= var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            byte var17 = 8;
            int var18 = (var17 - 1) * this.field10472 + var12;
            return class527.method2999(var11, var10, var18, var17, (byte) -119, var9, this.field10462);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(JILha;)V")
    public static final void method4203(long arg0, int arg1, class66 arg2) {
        class259.field3636 = 0;
        class426.field5823 = class201.field3057;
        field10463++;
        class85.field1167 = 0;
        class201.field3057 = 0;
        if (arg1 != 7965) {
            method4208(true);
        }
        long var4 = class197.method1423(arg1 - 7964);
        for (class788 var6 = (class788) class450.field6170.method1597((byte) -122); var6 != null; var6 = (class788) class450.field6170.method1601(127)) {
            if (var6.method4298(arg2, arg0)) {
                class259.field3636++;
            }
        }
        if (class142.field2411 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + class450.field6170.method1596(-11) + ", running: " + class259.field3636);
            System.out.println("Emitters: " + class85.field1167 + " Particles: " + class201.field3057 + ". Time taken: " + (class197.method1423(1) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIII)V")
    private final void method4204(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field10470++;
        if (this.field10476 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg0 + arg3 - (-arg4 + 1) >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 + arg2 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class287[] var11 = this.field10476[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field3943 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BLr;II)V")
    public final void method4205(byte arg0, class196 arg1, int arg2, int arg3) {
        field10469++;
        class736 var5 = (class736) arg1;
        int var6 = var5.field10162 + arg3 + 1;
        int var7 = var5.field10164 + arg2 + 1;
        int var8 = 93 / (-arg0 / 57);
        int var9 = var7 + (this.field10472 * var6);
        int var10 = 0;
        int var11 = var5.field10158;
        int var12 = var5.field10161;
        int var13 = this.field10472 - var12;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var10 += var12 * var14;
            var11 -= var14;
            var9 += this.field10472 * var14;
        }
        int var15 = 0;
        if (this.field10460 <= (var6 + var11)) {
            int var16 = var6 + var11 + 1 - this.field10460;
            var11 -= var16;
        }
        if (var7 <= 0) {
            int var17 = 1 - var7;
            var9 += var17;
            var12 -= var17;
            var10 += var17;
            var7 = 1;
            var13 += var17;
            var15 += var17;
        }
        if (this.field10472 <= (var7 + var12)) {
            int var18 = var7 - (-var12 - (1 - this.field10472));
            var15 += var18;
            var12 -= var18;
            var13 += var18;
        }
        if (var12 > 0 && var11 > 0) {
            class135.method1113(var15, this.field10462, var9, var12, (byte) -19, var5.field10169, var13, var11, var10);
            this.method4204(-1, var6, var11, var7, var12);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
    public final void method4206(int arg0) {
        field10461++;
        this.field10476 = new class287[this.field10480][this.field10477];
        if (arg0 <= 124) {
            return;
        }
        for (int var2 = 0; var2 < this.field10477; var2++) {
            for (int var3 = 0; var3 < this.field10480; var3++) {
                this.field10476[var3][var2] = new class287(this.field10473, this, this.field10479, var3, var2, this.field10467, var3 * 128 + 1, var2 * 128 - -1);
                if (this.field10476[var3][var2].field3948 == 0) {
                    this.field10476[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V")
    public static void method4207(byte arg0) {
        field10471 = null;
        if (arg0 != 78) {
            method4208(true);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)Z")
    public static final boolean method4208(boolean arg0) {
        field10468++;
        if (arg0) {
            method4208(false);
        }
        boolean var1 = true;
        if (class334.field4514 == null) {
            if (class346.field4664.method3737(class499.field6825, false)) {
                class334.field4514 = class49.method370(class346.field4664, class499.field6825);
            } else {
                var1 = false;
            }
        }
        if (class71.field1048 == null) {
            if (class346.field4664.method3737(class592.field8321, arg0)) {
                class71.field1048 = class49.method370(class346.field4664, class592.field8321);
            } else {
                var1 = false;
            }
        }
        if (class433.field5888 == null) {
            if (class346.field4664.method3737(class410.field5615, false)) {
                class433.field5888 = class49.method370(class346.field4664, class410.field5615);
            } else {
                var1 = false;
            }
        }
        if (class312.field4254 == null) {
            if (class564.field7989.method3737(class309.field4221, arg0)) {
                class312.field4254 = class502.method2871(-1, class309.field4221, class564.field7989);
            } else {
                var1 = false;
            }
        }
        if (class439.field5949 == null) {
            if (class346.field4664.method3737(class309.field4221, false)) {
                class439.field5949 = class49.method372(class346.field4664, class309.field4221);
            } else {
                var1 = false;
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILr;II)V")
    public final void method4209(int arg0, class196 arg1, int arg2, int arg3) {
        field10475++;
        class736 var5 = (class736) arg1;
        int var6 = var5.field10164 + arg0 + 1;
        int var7 = var5.field10162 + arg3 + 1;
        int var8 = this.field10472 * var7 + var6;
        if (arg2 != 1) {
            field10464 = 70;
        }
        int var9 = 0;
        int var10 = var5.field10158;
        int var11 = var5.field10161;
        int var12 = this.field10472 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var8 += this.field10472 * var13;
            var9 += var11 * var13;
            var10 -= var13;
        }
        int var14 = 0;
        if (var7 + var10 >= this.field10460) {
            int var15 = var10 + var7 + 1 - this.field10460;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var14 += var16;
            var12 += var16;
            var8 += var16;
            var11 -= var16;
            var6 = 1;
            var9 += var16;
        }
        if (this.field10472 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field10472;
            var11 -= var17;
            var14 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class270.method1753(var11, var5.field10169, this.field10462, var9, var8, 89, var10, var12, var14);
            this.method4204(arg2 ^ 0xFFFFFFFE, var7, var10, var6, var11);
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lsf;Lek;)V")
    public class760(class551 arg0, class535 arg1) {
        this.field10479 = arg1;
        this.field10473 = arg0;
        this.field10472 = (this.field10479.field4037 * this.field10479.field4035 >> this.field10473.field7706) + 2;
        this.field10460 = (this.field10479.field4035 * this.field10479.field4034 >> this.field10473.field7706) + 2;
        this.field10467 = this.field10473.field7706 + 7 - this.field10479.field4036;
        this.field10462 = new byte[this.field10472 * this.field10460];
        this.field10480 = this.field10479.field4037 >> this.field10467;
        this.field10477 = this.field10479.field4034 >> this.field10467;
    }
}
