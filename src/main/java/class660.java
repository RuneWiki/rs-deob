import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class660 {

    @OriginalMember(owner = "client!ica", name = "k", descriptor = "Lov;")
    private class186 field9301;

    @OriginalMember(owner = "client!ica", name = "o", descriptor = "Lgt;")
    private class453 field9305;

    @OriginalMember(owner = "client!ica", name = "m", descriptor = "I")
    public int field9303;

    @OriginalMember(owner = "client!ica", name = "g", descriptor = "I")
    private int field9297;

    @OriginalMember(owner = "client!ica", name = "l", descriptor = "I")
    private int field9302;

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "[B")
    public byte[] field9292;

    @OriginalMember(owner = "client!ica", name = "n", descriptor = "I")
    private int field9304;

    @OriginalMember(owner = "client!ica", name = "r", descriptor = "I")
    private int field9308;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "I")
    public static int field9291;

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "I")
    public static int field9293;

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "I")
    public static int field9294;

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "I")
    public static int field9295;

    @OriginalMember(owner = "client!ica", name = "h", descriptor = "I")
    public static int field9298;

    @OriginalMember(owner = "client!ica", name = "i", descriptor = "I")
    public static int field9299;

    @OriginalMember(owner = "client!ica", name = "j", descriptor = "I")
    public static int field9300;

    @OriginalMember(owner = "client!ica", name = "p", descriptor = "I")
    public static int field9306;

    @OriginalMember(owner = "client!ica", name = "q", descriptor = "I")
    public static int field9307;

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "[[Llca;")
    private class641[][] field9296;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method3713(int arg0, String arg1) {
        if (arg0 <= 85) {
            method3713(-32, null);
        }
        field9294++;
        String var2 = class612.method3525(class534.method3135(-108, arg1), false);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(ZILr;I)Z")
    public final boolean method3714(boolean arg0, int arg1, class181 arg2, int arg3) {
        field9307++;
        class104 var5 = (class104) arg2;
        if (!arg0) {
            return false;
        }
        int var6 = var5.field1744 + arg3 + 1;
        int var7 = var5.field1743 + arg1 + 1;
        int var8 = this.field9303 * var7 + var6;
        int var9 = var5.field1735;
        int var10 = var5.field1736;
        int var11 = this.field9303 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var8 += this.field9303 * var12;
            var9 -= var12;
            var7 = 1;
        }
        if (this.field9297 <= var7 + var9) {
            int var13 = var7 - this.field9297 - (-var9 + -1);
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var6 = 1;
            var8 += var14;
            var11 += var14;
        }
        if (var6 + var10 >= this.field9303) {
            int var15 = var6 + var10 + 1 - this.field9303;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field9303 + var11;
            return class592.method3399(var16, var8, var10, var17, this.field9292, true, var9);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIB[[ZZI)V")
    public final void method3715(int arg0, int arg1, byte arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.field9305.method2747(false, 113);
        field9299++;
        this.field9305.method2715(false, -23);
        this.field9305.method2738(-120, 1);
        this.field9305.method2721(1, true);
        this.field9305.method2728(false, false, (byte) 23, -2);
        float var7 = 1.0F / (float) (this.field9305.field6496 * 128);
        if (arg4) {
            for (int var26 = 0; var26 < this.field9308; var26++) {
                int var28 = var26 << this.field9302;
                int var29 = var26 + 1 << this.field9302;
                label91: for (int var30 = 0; var30 < this.field9304; var30++) {
                    if (this.field9296[var30][var26] != null) {
                        int var31 = var30 << this.field9302;
                        int var32 = var30 + 1 << this.field9302;
                        for (int var33 = var31; var33 < var32; var33++) {
                            if (var33 - arg5 >= -arg1 && arg1 >= (var33 - arg5)) {
                                for (int var34 = var28; var34 < var29; var34++) {
                                    if ((-arg1) <= (var34 - arg0) && (var34 - arg0) <= arg1 && arg3[var33 + arg1 - arg5][arg1 + var34 - arg0]) {
                                        class25 var35 = this.field9305.method2773((byte) -30);
                                        var35.method179(1.0F, var7, false, var7);
                                        var35.method149(-var30, -var26, 0);
                                        this.field9305.method2699(class56.field1049, 0);
                                        this.field9296[var30][var26].method3659(94);
                                        continue label91;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field9308; var8++) {
                int var9 = var8 << this.field9302;
                int var10 = var8 + 1 << this.field9302;
                for (int var11 = 0; var11 < this.field9304; var11++) {
                    class641 var12 = this.field9296[var11][var8];
                    if (var12 != null) {
                        class234 var13 = this.field9305.method2714(var12.field9121 * 3, (byte) 19);
                        Buffer var14 = var13.method1599(true, (byte) 71);
                        if (var14 != null) {
                            Stream var15 = this.field9305.method2764(var14, (byte) -76);
                            int var16 = 0;
                            int var17 = var11 << this.field9302;
                            int var18 = var11 + 1 << this.field9302;
                            for (int var19 = var9; var19 < var10; var19++) {
                                if (var19 - arg0 >= -arg1 && arg1 >= (var19 - arg0)) {
                                    int var21 = this.field9301.field3924 * var19 + var17;
                                    for (int var22 = var17; var22 < var18; var22++) {
                                        if ((var22 - arg5) >= (-arg1) && arg1 >= (var22 - arg5) && arg3[var22 + arg1 - arg5][arg1 + var19 - arg0]) {
                                            short[] var23 = this.field9301.field2667[var21];
                                            if (var23 != null) {
                                                if (Stream.method3762()) {
                                                    for (int var25 = 0; var25 < var23.length; var25++) {
                                                        var15.method3766(var23[var25] & 0xFFFF);
                                                        var16++;
                                                    }
                                                } else {
                                                    for (int var24 = 0; var24 < var23.length; var24++) {
                                                        var16++;
                                                        var15.method3768(var23[var24] & 0xFFFF);
                                                    }
                                                }
                                            }
                                        }
                                        var21++;
                                    }
                                }
                            }
                            var15.method3761();
                            if (var13.method1601(-108) && var16 > 0) {
                                class25 var20 = this.field9305.method2773((byte) -30);
                                var20.method179(1.0F, var7, false, var7);
                                var20.method149(-var11, -var8, 0);
                                this.field9305.method2699(class56.field1049, 6);
                                var12.method3660(-6781, var16 / 3, var13);
                            }
                        }
                    }
                }
            }
        }
        int var27 = -119 % ((78 - arg2) / 45);
        this.field9305.method2763((byte) -65);
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(BZLjava/lang/String;Leq;)Lsw;")
    public static final class752 method3716(byte arg0, boolean arg1, String arg2, class209 arg3) {
        field9291++;
        int var4 = arg3.method1482(-1, arg2);
        if (var4 == -1) {
            return new class752(0);
        }
        int[] var5 = arg3.method1479(var4, arg0 - 98);
        class752 var6 = new class752(var5.length);
        int var7 = 0;
        if (arg0 != -24) {
            field9306 = 116;
        }
        int var8 = 0;
        while (true) {
            while (var6.field10481 > var7) {
                class35 var9 = new class35(arg3.method1453(var5[var8++], arg0 + 138, var4));
                int var10 = var9.method234((byte) -117);
                int var11 = var9.method253(-13900);
                int var12 = var9.method273(255);
                if (!arg1 && var12 == 1) {
                    var6.field10481--;
                } else {
                    var6.field10479[var7] = var10;
                    var6.field10480[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V")
    public final void method3717(int arg0) {
        field9300++;
        this.field9296 = new class641[this.field9304][this.field9308];
        for (int var2 = arg0; var2 < this.field9308; var2++) {
            for (int var3 = 0; var3 < this.field9304; var3++) {
                this.field9296[var3][var2] = new class641(this.field9305, this, this.field9301, var3, var2, this.field9302, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field9296[var3][var2].field9121 == 0) {
                    this.field9296[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lr;BII)V")
    public final void method3718(class181 arg0, byte arg1, int arg2, int arg3) {
        field9293++;
        class104 var5 = (class104) arg0;
        int var6 = var5.field1744 + arg3 + 1;
        int var7 = var5.field1743 + arg2 + 1;
        int var8 = this.field9303 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field1735;
        int var11 = var5.field1736;
        if (arg1 != -7) {
            this.method3718(null, (byte) 95, -15, -82);
        }
        int var12 = this.field9303 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var8 += this.field9303 * var14;
            var9 += var11 * var14;
            var10 -= var14;
        }
        if (var7 + var10 >= this.field9297) {
            int var15 = var7 + var10 + 1 - this.field9297;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var6 = 1;
            var11 -= var16;
            var8 += var16;
            var13 += var16;
            var9 += var16;
            var12 += var16;
        }
        if (this.field9303 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field9303;
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class742.method4132(var8, var13, var12, arg1 ^ 0xFFFFFFFA, var11, this.field9292, var9, var10, var5.field1745);
            this.method3719(var7, var11, var10, var6, arg1 + 6);
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIII)V")
    private final void method3719(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9298++;
        if (this.field9296 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg3 + arg1 - 1 - 1 >> 7;
        int var8 = arg0 - 1 >> 7;
        int var9 = arg0 + arg2 + arg4 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class641[] var11 = this.field9296[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field9128 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIILr;)V")
    public final void method3720(int arg0, int arg1, int arg2, class181 arg3) {
        field9295++;
        class104 var5 = (class104) arg3;
        int var6 = var5.field1743 + arg2 + arg1;
        int var7 = var5.field1744 + arg0 + 1;
        int var8 = var7 + (this.field9303 * var6);
        int var9 = 0;
        int var10 = var5.field1735;
        int var11 = var5.field1736;
        int var12 = this.field9303 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var9 += var11 * var14;
            var6 = 1;
            var8 += this.field9303 * var14;
            var10 -= var14;
        }
        if (this.field9297 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field9297;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var13 += var16;
            var8 += var16;
            var7 = 1;
            var11 -= var16;
            var12 += var16;
            var9 += var16;
        }
        if (var7 + var11 >= this.field9303) {
            int var17 = var7 + var11 + 1 - this.field9303;
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class723.method4023(var8, var12, var13, 1, var9, this.field9292, var11, var10, var5.field1745);
            this.method3719(var6, var11, var10, var7, -1);
        }
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lgt;Lov;)V")
    public class660(class453 arg0, class186 arg1) {
        this.field9301 = arg1;
        this.field9305 = arg0;
        this.field9303 = (this.field9301.field3924 * this.field9301.field3920 >> this.field9305.field6490) + 2;
        this.field9297 = (this.field9301.field3920 * this.field9301.field3914 >> this.field9305.field6490) + 2;
        this.field9302 = this.field9305.field6490 + 7 - this.field9301.field3915;
        this.field9292 = new byte[this.field9303 * this.field9297];
        this.field9304 = this.field9301.field3924 >> this.field9302;
        this.field9308 = this.field9301.field3914 >> this.field9302;
    }
}
