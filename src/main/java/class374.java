import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class374 {

    @OriginalMember(owner = "client!la", name = "p", descriptor = "Lre;")
    private class582 field5216;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Luo;")
    private class171 field5206;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public int field5218;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    private int field5217;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    private int field5203;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "[B")
    public byte[] field5209;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    private int field5210;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    private int field5208;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "Lvda;")
    public static class311 field5215;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "J")
    public static long field5221;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "[[Lfa;")
    private class483[][] field5204;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZIBII)V")
    public static final void method2280(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, int arg6) {
        class344.field4771 = arg1;
        field5205++;
        class408.field5601 = arg0;
        class194.field2511 = arg6;
        class34.field518 = arg3;
        class174.field2248 = arg5;
        if (arg2 && class408.field5601 >= 100) {
            class196.field2555 = class174.field2248 * 512 + 256;
            class434.field5901 = class344.field4771 * 512 + 256;
            class186.field2364 = class341.method2147(class187.field2407, class196.field2555, 0, class434.field5901) - class34.field518;
        }
        if (arg4 == -24) {
            class621.field8952 = 2;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLge;)Llk;")
    public static final class383 method2281(byte arg0, class551 arg1) {
        if (arg0 != 37) {
            method2280(-108, -34, true, -91, (byte) -93, -51, -116);
        }
        field5222++;
        return new class383(arg1.method3087(true), arg1.method3087(true), arg1.method3087(true), arg1.method3087(true), arg1.method3043((byte) 49), arg1.method3043((byte) 49), arg1.method3045(-126));
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II[[ZIIZ)V")
    public final void method2282(int arg0, int arg1, boolean[][] arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 != -1) {
            this.method2284(true);
        }
        field5207++;
        this.field5216.method3333(false, (byte) 124);
        this.field5216.method3284(false, 35);
        this.field5216.method3343(1, 0);
        this.field5216.method3291(1, 2);
        this.field5216.method3329(-10053, false, false, -2);
        float var7 = 1.0F / (float) (this.field5216.field8320 * 128);
        if (arg5) {
            for (int var26 = 0; var26 < this.field5208; var26++) {
                int var27 = var26 << this.field5203;
                int var28 = var26 + 1 << this.field5203;
                label94: for (int var29 = 0; var29 < this.field5210; var29++) {
                    if (this.field5204[var29][var26] != null) {
                        int var30 = var29 << this.field5203;
                        int var31 = var29 + 1 << this.field5203;
                        for (int var32 = var30; var32 < var31; var32++) {
                            if ((-arg3) <= (var32 - arg0) && arg3 >= (var32 - arg0)) {
                                for (int var33 = var27; var33 < var28; var33++) {
                                    if ((-arg3) <= (var33 - arg4) && arg3 >= var33 - arg4 && arg2[var32 + arg3 - arg0][var33 + arg3 - arg4]) {
                                        class186 var34 = this.field5216.method3299(-8435);
                                        var34.method1138(0, var7, var7, 1.0F);
                                        var34.method365(-var29, -var26, 0);
                                        this.field5216.method3321((byte) -125, class620.field8928);
                                        this.field5204[var29][var26].method2733(-49);
                                        continue label94;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field5208; var8++) {
                int var9 = var8 << this.field5203;
                int var10 = var8 + 1 << this.field5203;
                for (int var11 = 0; var11 < this.field5210; var11++) {
                    class483 var12 = this.field5204[var11][var8];
                    if (var12 != null) {
                        class180 var13 = this.field5216.method3301(7040, var12.field6743 * 3);
                        Buffer var14 = var13.method297((byte) 52, true);
                        if (var14 != null) {
                            Stream var15 = this.field5216.method3287(-1, var14);
                            int var16 = 0;
                            int var17 = var11 << this.field5203;
                            int var18 = var11 + 1 << this.field5203;
                            for (int var19 = var9; var19 < var10; var19++) {
                                if ((-arg3) <= (var19 - arg4) && var19 - arg4 <= arg3) {
                                    int var21 = this.field5206.field7581 * var19 + var17;
                                    for (int var22 = var17; var22 < var18; var22++) {
                                        if ((var22 - arg0) >= (-arg3) && arg3 >= (var22 - arg0) && arg2[var22 + arg3 - arg0][arg3 + var19 - arg4]) {
                                            short[] var23 = this.field5206.field2199[var21];
                                            if (var23 != null) {
                                                if (Stream.method3209()) {
                                                    for (int var25 = 0; var25 < var23.length; var25++) {
                                                        var15.method3198(var23[var25] & 0xFFFF);
                                                        var16++;
                                                    }
                                                } else {
                                                    for (int var24 = 0; var24 < var23.length; var24++) {
                                                        var15.method3203(var23[var24] & 0xFFFF);
                                                        var16++;
                                                    }
                                                }
                                            }
                                        }
                                        var21++;
                                    }
                                }
                            }
                            var15.method3207();
                            if (var13.method290(22526) && var16 > 0) {
                                class186 var20 = this.field5216.method3299(arg1 - 8434);
                                var20.method1138(0, var7, var7, 1.0F);
                                var20.method365(-var11, -var8, 0);
                                this.field5216.method3321((byte) -126, class620.field8928);
                                var12.method2732(var13, var16 / 3, (byte) 101);
                            }
                        }
                    }
                }
            }
        }
        this.field5216.method3323(0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILk;IB)V")
    public final void method2283(int arg0, class88 arg1, int arg2, byte arg3) {
        field5213++;
        class545 var5 = (class545) arg1;
        int var6 = var5.field7592 + arg0 + 1;
        int var7 = var5.field7596 + arg2 + 1;
        int var8 = var7 + (this.field5218 * var6);
        int var9 = 0;
        int var10 = var5.field7597;
        int var11 = -126 / ((78 - arg3) / 43);
        int var12 = var5.field7598;
        int var13 = this.field5218 - var12;
        int var14 = 0;
        if (var6 <= 0) {
            int var15 = 1 - var6;
            var8 += this.field5218 * var15;
            var9 += var12 * var15;
            var10 -= var15;
            var6 = 1;
        }
        if (this.field5217 <= var6 + var10) {
            int var16 = var6 + var10 + 1 - this.field5217;
            var10 -= var16;
        }
        if (var7 <= 0) {
            int var17 = 1 - var7;
            var7 = 1;
            var12 -= var17;
            var14 += var17;
            var8 += var17;
            var9 += var17;
            var13 += var17;
        }
        if ((var7 + var12) >= this.field5218) {
            int var18 = var12 + var7 + 1 - this.field5218;
            var13 += var18;
            var12 -= var18;
            var14 += var18;
        }
        if (var12 > 0 && var10 > 0) {
            class389.method2345(var14, var5.field7594, var9, var12, -6573, var10, var8, var13, this.field5209);
            this.method2289(var10, var7, 0, var12, var6);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
    public final void method2284(boolean arg0) {
        field5214++;
        this.field5204 = new class483[this.field5210][this.field5208];
        int var2 = 0;
        if (!arg0) {
            this.field5210 = 96;
        }
        while (this.field5208 > var2) {
            for (int var3 = 0; var3 < this.field5210; var3++) {
                this.field5204[var3][var2] = new class483(this.field5216, this, this.field5206, var3, var2, this.field5203, var3 * 128 + 1, var2 * 128 - -1);
                if (this.field5204[var3][var2].field6743 == 0) {
                    this.field5204[var3][var2] = null;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILk;II)V")
    public final void method2285(int arg0, class88 arg1, int arg2, int arg3) {
        field5220++;
        class545 var5 = (class545) arg1;
        int var6 = var5.field7596 + arg3 + 1;
        int var7 = var5.field7592 + arg0 + 1;
        int var8 = this.field5218 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field7597;
        int var11 = var5.field7598;
        int var12 = this.field5218 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var9 += var11 * var13;
            var10 -= var13;
            var8 += this.field5218 * var13;
        }
        int var14 = 0;
        if (this.field5217 <= (var7 + var10)) {
            int var15 = var7 + var10 + (1 - this.field5217);
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var8 += var16;
            var12 += var16;
            var9 += var16;
            var11 -= var16;
            var6 = 1;
            var14 += var16;
        }
        if (arg2 != 21211) {
            return;
        }
        if (this.field5218 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field5218;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class451.method2622(var10, (byte) -122, var14, var9, var12, var5.field7594, var8, this.field5209, var11);
            this.method2289(var10, var6, arg2 - 21211, var11, var7);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([Ljava/lang/Object;[II)V")
    public static final void method2286(Object[] arg0, int[] arg1, int arg2) {
        class545.method3015(0, (byte) 81, arg1.length - 1, arg1, arg0);
        if (arg2 != 26881) {
            method2286(null, null, -16);
        }
        field5202++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILk;I)Z")
    public final boolean method2287(int arg0, int arg1, class88 arg2, int arg3) {
        field5211++;
        class545 var5 = (class545) arg2;
        int var6 = var5.field7592 + arg0 + arg3;
        int var7 = var5.field7596 + arg1 + 1;
        int var8 = this.field5218 * var6 + var7;
        int var9 = var5.field7597;
        int var10 = var5.field7598;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var9 -= var11;
            var8 += this.field5218 * var11;
            var6 = 1;
        }
        int var12 = this.field5218 - var10;
        if (var6 + var9 >= this.field5217) {
            int var13 = var6 + var9 + 1 - this.field5217;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var7 = 1;
            var8 += var14;
            var12 += var14;
        }
        if (this.field5218 <= (var7 + var10)) {
            int var15 = var7 + var10 - (this.field5218 - 1);
            var12 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field5218 + var12;
            return class277.method1714(this.field5209, var17, -124, var10, var9, var8, var16);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZI[Ljq;II)V")
    public static final void method2288(int arg0, boolean arg1, int arg2, class447[] arg3, int arg4, int arg5) {
        field5201++;
        for (int var6 = arg5; var6 < arg3.length; var6++) {
            class447 var7 = arg3[var6];
            if (var7 != null && var7.field6244 == arg0) {
                class124.method670(-20823, arg1, var7, arg4, arg2);
                class428.method2506(arg4, (byte) 93, var7, arg2);
                if (var7.field6291 > var7.field6294 - var7.field6330) {
                    var7.field6291 = var7.field6294 - var7.field6330;
                }
                if (var7.field6291 < 0) {
                    var7.field6291 = 0;
                }
                if ((var7.field6309 - var7.field6218) < var7.field6280) {
                    var7.field6280 = var7.field6309 - var7.field6218;
                }
                if (var7.field6280 < 0) {
                    var7.field6280 = 0;
                }
                if (var7.field6336 == 0) {
                    class558.method3136((byte) 112, var7, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIII)V")
    private final void method2289(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5219++;
        if (this.field5204 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        int var8 = arg4 - 1 >> 7;
        int var9 = arg4 - (1 - arg0) - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class483[] var11 = this.field5204[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field6760 = true;
                }
            }
        }
        if (arg2 != 0) {
            this.field5203 = -75;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method2290(int arg0) {
        field5215 = null;
        int var1 = 43 / ((-arg0 - 15) / 47);
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lre;Luo;)V")
    public class374(class582 arg0, class171 arg1) {
        this.field5216 = arg0;
        this.field5206 = arg1;
        this.field5218 = (this.field5206.field7582 * this.field5206.field7581 >> this.field5216.field8357) + 2;
        this.field5217 = (this.field5206.field7585 * this.field5206.field7582 >> this.field5216.field8357) + 2;
        this.field5203 = this.field5216.field8357 + 7 - this.field5206.field7583;
        this.field5209 = new byte[this.field5218 * this.field5217];
        this.field5210 = this.field5206.field7581 >> this.field5203;
        this.field5208 = this.field5206.field7585 >> this.field5203;
    }

    static {
        new class344(null, "geschickt werden.", null, null);
        field5212 = 0;
        field5215 = new class311();
    }
}
