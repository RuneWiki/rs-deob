import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class308 extends class325 {

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "[I")
    private int[] field4800;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "[I")
    private int[] field4795;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "Lua;")
    private class304 field4807;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "Lua;")
    private class304 field4792;

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "Lua;")
    private class304 field4806;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "[Lua;")
    private class304[] field4794;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "Lmn;")
    public static class161 field4802;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "Ljava/awt/Font;")
    public static Font field4805;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/lang/String;)I", line = 4)
    public static final int method2108(int arg0, String arg1) {
        field4809++;
        if (arg0 != 12146) {
            field4802 = (class161) null;
        }
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)V", line = 17)
    public static void method2109(byte arg0) {
        field4805 = null;
        field4802 = null;
        if (arg0 != -119) {
            method2110(78, -34, (byte[]) null, 23);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II[BI)I", line = 30)
    public static final int method2110(int arg0, int arg1, byte[] arg2, int arg3) {
        field4797++;
        int var4 = -1;
        if (arg0 > -82) {
            return -10;
        } else {
            for (int var5 = arg3; var5 < arg1; var5++) {
                var4 = class240.field3665[(arg2[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
            }
            return ~var4;
        }
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(B)V", line = 65)
    public static final void method2111(byte arg0) {
        class242.field3680.method752(false);
        field4799++;
        if (arg0 >= -3) {
            field4802 = (class161) null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjd;Lem;ZIDI)Laf;", line = 77)
    public final class195 method2112(int arg0, class95 arg1, class93 arg2, boolean arg3, int arg4, double arg5, int arg6) {
        class284.method1967(arg5, (byte) 98);
        field4801++;
        class38.field571 = arg1;
        class5.field66 = arg2;
        class5.method38(arg0, arg6, 927531564);
        int var9 = -44 % ((-arg4 - 74) / 51);
        class195 var10 = new class195(arg0, arg6);
        for (int var11 = 0; var11 < this.field4794.length; var11++) {
            this.field4794[var11].method2085(100, arg6, arg0);
        }
        int var12 = 0;
        for (int var13 = 0; var13 < arg6; var13++) {
            if (arg3) {
                var12 = var13;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field4792.field4652) {
                int[] var18 = this.field4792.method71(7, var13);
                var15 = var18;
                var16 = var18;
                var17 = var18;
            } else {
                int[][] var14 = this.field4792.method75(var13, 0);
                var15 = var14[0];
                var16 = var14[1];
                var17 = var14[2];
            }
            for (int var19 = 0; var19 != arg0; var19++) {
                int var20 = var16[var19] >> 4;
                int var21 = var15[var19] >> 4;
                int var22 = var17[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var23 = class98.field1410[var20];
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = class98.field1410[var22];
                if (var21 < 0) {
                    var21 = 0;
                }
                int var25 = class98.field1410[var21];
                var10.field3017[var12++] = (var23 << 8) + (var25 << 16) + var24;
                if (arg3) {
                    var12 += arg0 - 1;
                }
            }
        }
        for (int var26 = 0; var26 < this.field4794.length; var26++) {
            this.field4794[var26].method1250(-117);
        }
        return var10;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjd;Lem;IDBZ)Lud;", line = 196)
    public final class17 method2113(int arg0, class95 arg1, class93 arg2, int arg3, double arg4, byte arg5, boolean arg6) {
        field4808++;
        class284.method1967(arg4, (byte) 67);
        class38.field571 = arg1;
        class5.field66 = arg2;
        class5.method38(arg0, arg3, 927531564);
        class17 var9 = new class17(arg0, arg3);
        for (int var10 = 0; var10 < this.field4794.length; var10++) {
            this.field4794[var10].method2085(127, arg3, arg0);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            if (arg6) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field4792.field4652) {
                int[] var17 = this.field4792.method71(7, var12);
                var16 = var17;
                var15 = var17;
                var14 = var17;
            } else {
                int[][] var13 = this.field4792.method75(var12, 0);
                var14 = var13[0];
                var15 = var13[2];
                var16 = var13[1];
            }
            int[] var18;
            if (this.field4806.field4652) {
                var18 = this.field4806.method71(7, var12);
            } else {
                var18 = this.field4806.method75(var12, 0)[0];
            }
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = var14[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var16[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var22 = class98.field1410[var20];
                int var23 = var15[var19] >> 4;
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class98.field1410[var23];
                int var25 = class98.field1410[var21];
                int var26;
                if (var22 == 0 && var25 == 0 && var24 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9.field3017[var11++] = (var26 << 24) - (-(var25 << 8) - var24 - (var22 << 16));
                if (arg6) {
                    var11 += (arg0 << 2) - 4;
                }
            }
        }
        if (arg5 <= 4) {
            this.field4795 = (int[]) null;
        }
        for (int var27 = 0; var27 < this.field4794.length; var27++) {
            this.field4794[var27].method1250(-120);
        }
        return var9;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZILem;IDILjd;)[I", line = 335)
    public final int[] method2114(boolean arg0, int arg1, class93 arg2, int arg3, double arg4, int arg5, class95 arg6) {
        int var9 = -86 % ((-arg5 - 75) / 35);
        field4798++;
        class284.method1967(arg4, (byte) 62);
        int[] var10 = new int[arg3 * 4 * arg1];
        class38.field571 = arg6;
        class5.field66 = arg2;
        class5.method38(arg3, arg1, 927531564);
        for (int var11 = 0; var11 < this.field4794.length; var11++) {
            this.field4794[var11].method2085(116, arg1, arg3);
        }
        int var12 = 0;
        for (int var13 = 0; var13 < arg1; var13++) {
            if (arg0) {
                var12 = var13;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field4792.field4652) {
                int[] var14 = this.field4792.method71(7, var13);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field4792.method75(var13, 0);
                var15 = var18[0];
                var17 = var18[1];
                var16 = var18[2];
            }
            int[] var19;
            if (this.field4806.field4652) {
                var19 = this.field4806.method71(7, var13);
            } else {
                var19 = this.field4806.method75(var13, 0)[0];
            }
            for (int var20 = arg3 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = class98.field1410[var21];
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = var16[var20] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class98.field1410[var24];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class98.field1410[var23];
                int var27;
                if (var22 == 0 && var26 == 0 && var25 == 0) {
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
                var10[var12++] = (var22 << 16) + (var27 << 24) + (var26 << 8) + var25;
                if (arg0) {
                    var12 += arg3 - 1;
                }
            }
        }
        for (int var28 = 0; var28 < this.field4794.length; var28++) {
            this.field4794[var28].method1250(-102);
        }
        return var10;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZIBLem;Ljd;)[F", line = 471)
    public final float[] method2115(int arg0, boolean arg1, int arg2, byte arg3, class93 arg4, class95 arg5) {
        if (arg3 < 125) {
            method2110(93, 121, (byte[]) null, -26);
        }
        field4804++;
        float[] var7 = new float[arg0 * arg2 * 4];
        class38.field571 = arg5;
        class5.field66 = arg4;
        class5.method38(arg0, arg2, 927531564);
        for (int var8 = 0; var8 < this.field4794.length; var8++) {
            this.field4794[var8].method2085(125, arg2, arg0);
        }
        int var9 = 0;
        for (int var10 = 0; var10 < arg2; var10++) {
            if (arg1) {
                var9 = var10 << 2;
            }
            int[] var12;
            int[] var13;
            int[] var14;
            if (this.field4792.field4652) {
                int[] var11 = this.field4792.method71(7, var10);
                var12 = var11;
                var13 = var11;
                var14 = var11;
            } else {
                int[][] var15 = this.field4792.method75(var10, 0);
                var12 = var15[0];
                var13 = var15[1];
                var14 = var15[2];
            }
            int[] var16;
            if (this.field4806.field4652) {
                var16 = this.field4806.method71(7, var10);
            } else {
                var16 = this.field4806.method75(var10, 0)[0];
            }
            int[] var17;
            if (this.field4807.field4652) {
                var17 = this.field4807.method71(7, var10);
            } else {
                var17 = this.field4807.method75(var10, 0)[0];
            }
            for (int var18 = arg0 - 1; var18 >= 0; var18--) {
                float var19 = (float) var16[var18] / 4096.0F;
                float var20 = ((float) var17[var18] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if ((var19 < 0.0F)) {
                    var19 = 0.0F;
                } else if (var19 > 1.0F) {
                    var19 = 1.0F;
                }
                var7[var9++] = (float) var12[var18] * var20;
                var7[var9++] = (float) var13[var18] * var20;
                var7[var9++] = (float) var14[var18] * var20;
                var7[var9++] = var19;
                if (arg1) {
                    var9 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var21 = 0; var21 < this.field4794.length; var21++) {
            this.field4794[var21].method1250(-102);
        }
        return var7;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BILjd;ZZLem;DI)[I", line = 582)
    public final int[] method2116(byte arg0, int arg1, class95 arg2, boolean arg3, boolean arg4, class93 arg5, double arg6, int arg7) {
        if (arg0 <= 43) {
            this.field4800 = (int[]) null;
        }
        field4793++;
        class284.method1967(arg6, (byte) 72);
        int[] var10 = new int[arg1 * arg7];
        class38.field571 = arg2;
        class5.field66 = arg5;
        class5.method38(arg1, arg7, 927531564);
        for (int var11 = 0; var11 < this.field4794.length; var11++) {
            this.field4794[var11].method2085(126, arg7, arg1);
        }
        int var12 = 0;
        byte var13;
        int var14;
        int var15;
        if (arg4) {
            var13 = -1;
            var14 = arg1 - 1;
            var15 = -1;
        } else {
            var13 = 1;
            var15 = arg1;
            var14 = 0;
        }
        for (int var16 = 0; var16 < arg7; var16++) {
            if (arg3) {
                var12 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field4792.field4652) {
                int[] var17 = this.field4792.method71(7, var16);
                var18 = var17;
                var19 = var17;
                var20 = var17;
            } else {
                int[][] var21 = this.field4792.method75(var16, 0);
                var19 = var21[0];
                var20 = var21[1];
                var18 = var21[2];
            }
            for (int var22 = var14; var22 != var15; var22 += var13) {
                int var23 = var20[var22] >> 4;
                int var24 = var19[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = var18[var22] >> 4;
                int var26 = class98.field1410[var23];
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var27 = class98.field1410[var24];
                int var28 = class98.field1410[var25];
                var10[var12++] = (var27 << 16) + (var26 << 8) + var28;
                if (arg3) {
                    var12 += arg1 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field4794.length; var29++) {
            this.field4794[var29].method1250(-114);
        }
        return var10;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V", line = 716)
    public class308() {
        this.field4800 = new int[0];
        this.field4795 = new int[0];
        this.field4807 = new class72(0);
        this.field4807.field4659 = 1;
        this.field4792 = new class72();
        this.field4792.field4659 = 1;
        this.field4806 = new class72();
        this.field4794 = new class304[] { this.field4792, this.field4806, this.field4807 };
        this.field4806.field4659 = 1;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lwm;)V", line = 731)
    public class308(class254 arg0) {
        int var2 = 0;
        int var3 = arg0.method1774((byte) 51);
        this.field4794 = new class304[var3];
        int var4 = 0;
        int[][] var5 = new int[var3][];
        for (int var6 = 0; var6 < var3; var6++) {
            class304 var7 = class341.method2366((byte) 126, arg0);
            if (var7.method1545(64) >= 0) {
                var2++;
            }
            if (var7.method1249((byte) 108) >= 0) {
                var4++;
            }
            int var8 = var7.field4667.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method1774((byte) -122);
            }
            this.field4794[var6] = var7;
        }
        this.field4800 = new int[var2];
        this.field4795 = new int[var4];
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < var3; var12++) {
            class304 var13 = this.field4794[var12];
            int var14 = var13.field4667.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field4667[var15] = this.field4794[var5[var12][var15]];
            }
            int var16 = var13.method1545(115);
            int var17 = var13.method1249((byte) 104);
            if (var16 > 0) {
                this.field4800[var10++] = var16;
            }
            if (var17 > 0) {
                this.field4795[var11++] = var17;
            }
            var5[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field4792 = this.field4794[arg0.method1774((byte) 56)];
        this.field4806 = this.field4794[arg0.method1774((byte) -106)];
        this.field4807 = this.field4794[arg0.method1774((byte) 117)];
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljd;ILem;)Z", line = 821)
    public final boolean method2117(class95 arg0, int arg1, class93 arg2) {
        field4796++;
        if (arg1 >= class276.field4285) {
            for (int var4 = 0; var4 < this.field4800.length; var4++) {
                if (!arg0.method707(this.field4800[var4], (byte) 73)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4800.length; var5++) {
                if (!arg0.method716(this.field4800[var5], arg1 ^ 0x3B49, class276.field4285)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field4795.length; var6++) {
            if (!arg2.method678(arg1 + 3, this.field4795[var6])) {
                return false;
            }
        }
        return true;
    }
}
