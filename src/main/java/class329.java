import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class329 extends class375 {

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "[I")
    private int[] field4860;

    @OriginalMember(owner = "client!rr", name = "E", descriptor = "[I")
    private int[] field4871;

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "Lap;")
    private class440 field4866;

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "Lap;")
    private class440 field4862;

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "Lap;")
    private class440 field4864;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "[Lap;")
    private class440[] field4861;

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "Lnea;")
    public static class664 field4863 = new class664(80, 4);

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!rr", name = "A", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!rr", name = "B", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!rr", name = "D", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!rr", name = "F", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!rr", name = "G", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!rr", name = "H", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!rr", name = "C", descriptor = "Lbs;")
    public static class638 field4869;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lfa;Lpu;IZIDIZ)[I", line = 7)
    public final int[] method2066(class209 arg0, class522 arg1, int arg2, boolean arg3, int arg4, double arg5, int arg6, boolean arg7) {
        class386.field5437 = arg0;
        class330.field4876 = arg1;
        field4868++;
        for (int var10 = 0; var10 < this.field4861.length; var10++) {
            this.field4861[var10].method2605(arg4, arg2, false);
        }
        class300.method1933((byte) -128, arg5);
        class550.method3115(arg4, (byte) -126, arg2);
        int[] var11 = new int[arg2 * arg4];
        if (arg6 != 255) {
            return null;
        }
        byte var12;
        int var13;
        int var14;
        if (arg3) {
            var13 = -1;
            var14 = arg4 - 1;
            var12 = -1;
        } else {
            var12 = 1;
            var13 = arg4;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg2; var16++) {
            if (arg7) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field4862.field6424) {
                int[] var18 = this.field4862.method229((byte) -110, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field4862.method763(arg6 - 6021, var16);
                var20 = var22[2];
                var19 = var22[1];
                var21 = var22[0];
            }
            for (int var23 = var14; var23 != var13; var23 += var12) {
                int var24 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var19[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var20[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class105.field1634[var24];
                int var28 = class105.field1634[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class105.field1634[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg7) {
                    var15 += arg4 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field4861.length; var17++) {
            this.field4861[var17].method2301(-1);
        }
        return var11;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lfa;DLpu;ZIBI)[I", line = 142)
    public final int[] method2067(class209 arg0, double arg1, class522 arg2, boolean arg3, int arg4, byte arg5, int arg6) {
        class386.field5437 = arg0;
        field4865++;
        class330.field4876 = arg2;
        for (int var9 = 0; var9 < this.field4861.length; var9++) {
            this.field4861[var9].method2605(arg6, arg4, false);
        }
        class300.method1933((byte) -126, arg1);
        class550.method3115(arg6, (byte) -89, arg4);
        if (arg5 != 116) {
            method2070(-43);
        }
        int[] var10 = new int[arg4 * arg6 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg4; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field4862.field6424) {
                int[] var18 = this.field4862.method229((byte) -110, var12);
                var15 = var18;
                var17 = var18;
                var16 = var18;
            } else {
                int[][] var14 = this.field4862.method763(-5766, var12);
                var15 = var14[2];
                var16 = var14[0];
                var17 = var14[1];
            }
            int[] var19;
            if (this.field4864.field6424) {
                var19 = this.field4864.method229((byte) 89, var12);
            } else {
                var19 = this.field4864.method763(-5766, var12)[0];
            }
            if (arg3) {
                var11 = var12;
            }
            for (int var20 = arg6 - 1; var20 >= 0; var20--) {
                int var21 = var16[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var17[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var15[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class105.field1634[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class105.field1634[var22];
                int var26 = class105.field1634[var23];
                int var27;
                if (var24 == 0 && var25 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var25 << 8) + var26 + (var24 << 16) + (var27 << 24);
                if (arg3) {
                    var11 += arg6 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field4861.length; var13++) {
            this.field4861[var13].method2301(-1);
        }
        return var10;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(Z)V", line = 285)
    public static void method2068(boolean arg0) {
        field4869 = null;
        if (arg0) {
            field4869 = null;
        }
        field4863 = null;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lrga;IIIII)V", line = 297)
    public static final void method2069(class215 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class41.field685 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class302.field4492) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class8.field82 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class40 var14 = class153.field2210[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class296.field4340[var11].method432(var12, false, var13) + class296.field4340[var11].method432(var12 + 1, false, var13) + class296.field4340[var11].method432(var12, false, var13 + 1) + class296.field4340[var11].method432(var12 + 1, false, var13 + 1)) / 4 - (class296.field4340[arg1].method432(arg2, false, arg3) + class296.field4340[arg1].method432(arg2 + 1, false, arg3) + class296.field4340[arg1].method432(arg2, false, arg3 + 1) + class296.field4340[arg1].method432(arg2 + 1, false, arg3 + 1)) / 4;
                                    class244 var16 = var14.field658;
                                    class244 var17 = var14.field669;
                                    if (var16 != null && var16.method951(-66)) {
                                        arg0.method953(var15, var6, class682.field9618, var16, (var12 - arg2) * class437.field6392 + (1 - arg4) * class683.field9623, (var13 - arg3) * class437.field6392 + (1 - arg5) * class683.field9623, true);
                                    }
                                    if (var17 != null && var17.method951(-106)) {
                                        arg0.method953(var15, var6, class682.field9618, var17, (var12 - arg2) * class437.field6392 + (1 - arg4) * class683.field9623, (var13 - arg3) * class437.field6392 + (1 - arg5) * class683.field9623, true);
                                    }
                                    for (class106 var18 = var14.field671; var18 != null; var18 = var18.field1641) {
                                        class454 var19 = var18.field1638;
                                        if (var19 != null && var19.method951(-73) && (var19.field6524 == var12 || var7 == var12) && (var19.field6521 == var13 || var9 == var13)) {
                                            int var20 = var19.field6526 + 1 - var19.field6524;
                                            int var21 = var19.field6516 + 1 - var19.field6521;
                                            arg0.method953(var15, var6, class682.field9618, var19, (var19.field6524 - arg2) * class437.field6392 + (var20 - arg4) * class683.field9623, (var19.field6521 - arg3) * class437.field6392 + (var21 - arg5) * class683.field9623, true);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)Z", line = 390)
    public static final boolean method2070(int arg0) {
        field4867++;
        return ~class420.field6113 <= arg0;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V", line = 402)
    public static final void method2071(int arg0) {
        field4873++;
        class28 var1 = (class28) class436.field6382.method472((byte) -64);
        if (arg0 != 16711680) {
            return;
        }
        while (var1 != null) {
            if (var1.field417) {
                var1.method324(arg0 - 16711680);
            }
            var1 = (class28) class436.field6382.method482(-88);
        }
        for (class28 var2 = (class28) class490.field6944.method472((byte) -56); var2 != null; var2 = (class28) class490.field6944.method482(127)) {
            if (var2.field417) {
                var2.method324(0);
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(III[IIIII)V", line = 437)
    public static final void method2072(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        field4870++;
        if (arg1 > 0 && !class284.method1835(arg1, arg5 + 74)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class284.method1835(arg2, 62)) {
            throw new IllegalArgumentException("");
        } else if (arg4 == 32993) {
            int var8 = 0;
            if (arg5 != 2) {
                method2071(-50);
            }
            int var9 = arg1 >= arg2 ? arg2 : arg1;
            int var10 = arg1 >> 1;
            int var11 = arg2 >> 1;
            int[] var12 = arg3;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg6, var8, arg0, arg1, arg2, 0, arg4, arg7, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = var15 + arg1;
                int[] var17 = var13;
                for (int var18 = 0; var18 < var11; var18++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var16++];
                        int var22 = var12[var15++];
                        int var23 = var20 & 0xFF;
                        int var24 = var12[var16++];
                        int var25 = var20 >> 24 & 0xFF;
                        int var26 = var20 >> 16 & 0xFF;
                        int var27 = (var20 & 0xFF62) >> 8;
                        int var28 = (var22 & 0xFF) + var23;
                        int var29 = (var22 >> 24 & 0xFF) + var25;
                        int var30 = (var22 >> 16 & 0xFF) + var26;
                        int var31 = ((var22 & 0xFF8D) >> 8) + var27;
                        int var32 = (var21 & 0xFF) + var28;
                        int var33 = (var21 >> 24 & 0xFF) + var29;
                        int var34 = ((var21 & 0xFF50) >> 8) + var31;
                        int var35 = (var21 >> 16 & 0xFF) + var30;
                        int var36 = (var24 >> 8 & 0xFF) + var34;
                        int var37 = (var24 & 0xFF) + var32;
                        int var38 = (var24 >> 24 & 0xFF) + var33;
                        int var39 = (var24 >> 16 & 0xFF) + var35;
                        var13[var14++] = class486.method2826(class689.method3797(255, var37 >> 2), class486.method2826(class486.method2826(class689.method3797(var38 << 22, -16777216), class689.method3797(var39 << 14, 16711680)), class689.method3797(var36, 1020) << 6));
                    }
                    var15 += arg1;
                    var16 += arg1;
                }
                var13 = var12;
                var12 = var17;
                arg1 = var10;
                arg2 = var11;
                var9 >>= 0x1;
                var8++;
                var10 >>= 0x1;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lpu;Lfa;B)Z", line = 548)
    public final boolean method2073(class522 arg0, class209 arg1, byte arg2) {
        field4874++;
        if (class415.field6019 < 0) {
            for (int var4 = 0; var4 < this.field4871.length; var4++) {
                if (!arg0.method2997((byte) -95, this.field4871[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4871.length; var5++) {
                if (!arg0.method2991(class415.field6019, this.field4871[var5], (byte) 94)) {
                    return false;
                }
            }
        }
        if (arg2 < 83) {
            field4863 = null;
        }
        for (int var6 = 0; var6 < this.field4860.length; var6++) {
            if (!arg1.method1383(this.field4860[var6], -65)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILfa;Lpu;ZI)[F", line = 603)
    public final float[] method2074(int arg0, int arg1, class209 arg2, class522 arg3, boolean arg4, int arg5) {
        class386.field5437 = arg2;
        field4872++;
        class330.field4876 = arg3;
        if (arg0 <= 54) {
            return null;
        }
        for (int var7 = 0; var7 < this.field4861.length; var7++) {
            this.field4861[var7].method2605(arg5, arg1, false);
        }
        class550.method3115(arg5, (byte) -42, arg1);
        float[] var8 = new float[arg1 * arg5 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field4862.field6424) {
                int[] var12 = this.field4862.method229((byte) 117, var10);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field4862.method763(-5766, var10);
                var14 = var16[1];
                var15 = var16[0];
                var13 = var16[2];
            }
            int[] var17;
            if (this.field4864.field6424) {
                var17 = this.field4864.method229((byte) 100, var10);
            } else {
                var17 = this.field4864.method763(-5766, var10)[0];
            }
            int[] var18;
            if (this.field4866.field6424) {
                var18 = this.field4866.method229((byte) 126, var10);
            } else {
                var18 = this.field4866.method763(-5766, var10)[0];
            }
            if (arg4) {
                var9 = var10 << 2;
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = var20;
                if (arg4) {
                    var9 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field4861.length; var11++) {
            this.field4861[var11].method2301(-1);
        }
        return var8;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V", line = 714)
    public class329() {
        this.field4860 = new int[0];
        this.field4871 = new int[0];
        this.field4866 = new class195(0);
        this.field4866.field6414 = 1;
        this.field4862 = new class195();
        this.field4862.field6414 = 1;
        this.field4864 = new class195();
        this.field4864.field6414 = 1;
        this.field4861 = new class440[] { this.field4862, this.field4864, this.field4866 };
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lmo;)V", line = 731)
    public class329(class695 arg0) {
        int var2 = arg0.method3826(false);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field4861 = new class440[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class440 var16 = class86.method753((byte) 106, arg0);
            if (var16.method2303(-1) >= 0) {
                var3++;
            }
            if (var16.method2609(-97) >= 0) {
                var4++;
            }
            int var17 = var16.field6419.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method3826(false);
            }
            this.field4861[var6] = var16;
        }
        this.field4871 = new int[var3];
        int var7 = 0;
        this.field4860 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class440 var11 = this.field4861[var9];
            int var12 = var11.field6419.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field6419[var13] = this.field4861[var5[var9][var13]];
            }
            int var14 = var11.method2303(-1);
            int var15 = var11.method2609(-110);
            if (var14 > 0) {
                this.field4871[var7++] = var14;
            }
            if (var15 > 0) {
                this.field4860[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field4862 = this.field4861[arg0.method3826(false)];
        this.field4864 = this.field4861[arg0.method3826(false)];
        this.field4866 = this.field4861[arg0.method3826(false)];
        Object var10 = null;
    }
}
