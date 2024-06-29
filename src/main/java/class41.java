import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class41 extends class77 {

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "[I")
    private int[] field600;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "[I")
    private int[] field608;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "Lqb;")
    private class27 field591;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "Lqb;")
    private class27 field602;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "Lqb;")
    private class27 field592;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "[Lqb;")
    private class27[] field593;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    public static int field596 = -1;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "[I")
    public static int[] field589 = new int[99];

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "Z")
    public static boolean field603;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "Lpe;")
    public static class311 field607;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "[[B")
    public static byte[][] field605;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lph;ZILpe;IZD)Lln;", line = 4)
    public final class118 method298(class361 arg0, boolean arg1, int arg2, class311 arg3, int arg4, boolean arg5, double arg6) {
        field599++;
        if (arg1) {
            this.field600 = (int[]) null;
        }
        class215.method1560(0, arg6);
        class240.field3565 = arg0;
        field607 = arg3;
        class252.method1849(arg2, arg4, true);
        class118 var9 = new class118(arg2, arg4);
        for (int var10 = 0; var10 < this.field593.length; var10++) {
            this.field593[var10].method170(arg2, arg4, (byte) -46);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg4; var12++) {
            if (arg5) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field602.field376) {
                int[] var17 = this.field602.method18(var12, (byte) -62);
                var14 = var17;
                var15 = var17;
                var16 = var17;
            } else {
                int[][] var13 = this.field602.method19(-28941, var12);
                var14 = var13[0];
                var15 = var13[2];
                var16 = var13[1];
            }
            for (int var18 = arg2 - 1; var18 >= 0; var18--) {
                int var19 = var16[var18] >> 4;
                int var20 = var14[var18] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var15[var18] >> 4;
                if (var20 < 0) {
                    var20 = 0;
                }
                int var22 = class248.field3695[var20];
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class248.field3695[var21];
                if (var19 > 255) {
                    var19 = 255;
                }
                if (var19 < 0) {
                    var19 = 0;
                }
                int var24 = class248.field3695[var19];
                var9.field1665[var11++] = (var22 << 16) + var23 + (var24 << 8);
                if (arg5) {
                    var11 += arg2 - 1;
                }
            }
        }
        for (int var25 = 0; var25 < this.field593.length; var25++) {
            this.field593[var25].method171((byte) 105);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)V", line = 125)
    public static void method299(int arg0) {
        field607 = null;
        int var1 = 96 / ((3 - arg0) / 59);
        field589 = null;
        field605 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIBZLph;Lpe;)[F", line = 138)
    public final float[] method300(int arg0, int arg1, byte arg2, boolean arg3, class361 arg4, class311 arg5) {
        field607 = arg5;
        field597++;
        class240.field3565 = arg4;
        class252.method1849(arg0, arg1, true);
        float[] var7 = new float[arg0 * 4 * arg1];
        int var8 = -42 % ((arg2 + 23) / 62);
        for (int var9 = 0; var9 < this.field593.length; var9++) {
            this.field593[var9].method170(arg0, arg1, (byte) -70);
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            if (arg3) {
                var10 = var11 << 2;
            }
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field602.field376) {
                int[] var16 = this.field602.method18(var11, (byte) -62);
                var15 = var16;
                var13 = var16;
                var14 = var16;
            } else {
                int[][] var12 = this.field602.method19(-28941, var11);
                var13 = var12[0];
                var14 = var12[1];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field592.field376) {
                var17 = this.field592.method18(var11, (byte) -62);
            } else {
                var17 = this.field592.method19(-28941, var11)[0];
            }
            int[] var18;
            if (this.field591.field376) {
                var18 = this.field591.method18(var11, (byte) -62);
            } else {
                var18 = this.field591.method19(-28941, var11)[0];
            }
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                float var20 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                float var21 = (float) var17[var19] / 4096.0F;
                var7[var10++] = (float) var13[var19] * var20;
                if ((var21 < 0.0F)) {
                    var21 = 0.0F;
                } else if (var21 > 1.0F) {
                    var21 = 1.0F;
                }
                var7[var10++] = (float) var14[var19] * var20;
                var7[var10++] = (float) var15[var19] * var20;
                var7[var10++] = var21;
                if (arg3) {
                    var10 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var22 = 0; var22 < this.field593.length; var22++) {
            this.field593[var22].method171((byte) 105);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lph;ZIBLpe;IDZ)[I", line = 250)
    public final int[] method301(class361 arg0, boolean arg1, int arg2, byte arg3, class311 arg4, int arg5, double arg6, boolean arg7) {
        field590++;
        int[] var10 = new int[arg2 * arg5];
        class215.method1560(0, arg6);
        class240.field3565 = arg0;
        field607 = arg4;
        class252.method1849(arg5, arg2, true);
        for (int var11 = 0; var11 < this.field593.length; var11++) {
            this.field593[var11].method170(arg5, arg2, (byte) 101);
        }
        int var12;
        byte var13;
        int var14;
        if (arg1) {
            var14 = arg5 - 1;
            var12 = -1;
            var13 = -1;
        } else {
            var12 = arg5;
            var13 = 1;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg2; var16++) {
            if (arg7) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field602.field376) {
                int[] var21 = this.field602.method18(var16, (byte) -62);
                var19 = var21;
                var20 = var21;
                var18 = var21;
            } else {
                int[][] var17 = this.field602.method19(arg3 ^ 0xFFFF8ED9, var16);
                var18 = var17[0];
                var19 = var17[1];
                var20 = var17[2];
            }
            for (int var22 = var14; var22 != var12; var22 += var13) {
                int var23 = var20[var22] >> 4;
                int var24 = var18[var22] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = var19[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class248.field3695[var23];
                int var27 = class248.field3695[var25];
                int var28 = class248.field3695[var24];
                var10[var15++] = (var28 << 16) + (var27 << 8) + var26;
                if (arg7) {
                    var15 += arg5 - 1;
                }
            }
        }
        int var29 = 0;
        if (arg3 != 42) {
            method306(6, (long[]) null, (int[]) null);
        }
        while (var29 < this.field593.length) {
            this.field593[var29].method171((byte) 105);
            var29++;
        }
        return var10;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lph;BLpe;)Z", line = 382)
    public final boolean method302(class361 arg0, byte arg1, class311 arg2) {
        field594++;
        if (class110.field1594 > 0) {
            for (int var4 = 0; var4 < this.field608.length; var4++) {
                if (!arg0.method2536(-19052, this.field608[var4], class110.field1594)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field608.length; var5++) {
                if (!arg0.method2514((byte) 54, this.field608[var5])) {
                    return false;
                }
            }
        }
        int var6 = 0;
        if (arg1 != -90) {
            this.method305(2.5587386823649725D, (class311) null, -50, 109, false, (class361) null, 89);
        }
        while (var6 < this.field600.length) {
            if (!arg2.method34(this.field600[var6], true)) {
                return false;
            }
            var6++;
        }
        return true;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lpe;IIZDZLph;)[I", line = 442)
    public final int[] method303(class311 arg0, int arg1, int arg2, boolean arg3, double arg4, boolean arg5, class361 arg6) {
        field609++;
        int[] var9 = new int[arg1 * 4 * arg2];
        class215.method1560(0, arg4);
        class240.field3565 = arg6;
        field607 = arg0;
        class252.method1849(arg2, arg1, !arg5);
        if (arg5) {
            this.method303((class311) null, 7, 11, false, 2.68160367471801D, false, (class361) null);
        }
        for (int var10 = 0; var10 < this.field593.length; var10++) {
            this.field593[var10].method170(arg2, arg1, (byte) -112);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            if (arg3) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field602.field376) {
                int[] var17 = this.field602.method18(var12, (byte) -62);
                var16 = var17;
                var14 = var17;
                var15 = var17;
            } else {
                int[][] var13 = this.field602.method19(-28941, var12);
                var14 = var13[1];
                var15 = var13[2];
                var16 = var13[0];
            }
            int[] var18;
            if (this.field592.field376) {
                var18 = this.field592.method18(var12, (byte) -62);
            } else {
                var18 = this.field592.method19(-28941, var12)[0];
            }
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = var16[var19] >> 4;
                int var21 = var14[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var15[var19] >> 4;
                int var23 = class248.field3695[var21];
                int var24 = class248.field3695[var20];
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var25 = class248.field3695[var22];
                int var26;
                if (var24 == 0 && var23 == 0 && var25 == 0) {
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
                var9[var11++] = (var23 << 8) + (var26 << 24) + (var24 << 16) + var25;
                if (arg3) {
                    var11 += arg2 - 1;
                }
            }
        }
        for (int var27 = 0; var27 < this.field593.length; var27++) {
            this.field593[var27].method171((byte) 105);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(CZ)Z", line = 578)
    public static final boolean method304(char arg0, boolean arg1) {
        field606++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class51.method425(57, arg0)) {
            return true;
        } else {
            if (arg1) {
                field607 = (class311) null;
            }
            int var2 = 0;
            char[] var3 = class214.field3105;
            while (var2 < var3.length) {
                char var4 = var3[var2];
                if (arg0 == var4) {
                    return true;
                }
                var2++;
            }
            char[] var5 = class232.field3509;
            for (int var6 = 0; var6 < var5.length; var6++) {
                char var7 = var5[var6];
                if (arg0 == var7) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field589[var1] = var0 / 4;
        }
        field603 = true;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(DLpe;IIZLph;I)Lq;", line = 636)
    public final class79 method305(double arg0, class311 arg1, int arg2, int arg3, boolean arg4, class361 arg5, int arg6) {
        field601++;
        class215.method1560(0, arg0);
        field607 = arg1;
        class240.field3565 = arg5;
        class252.method1849(arg6, arg2, true);
        if (arg3 > -94) {
            this.field602 = (class27) null;
        }
        class79 var9 = new class79(arg6, arg2);
        for (int var10 = 0; var10 < this.field593.length; var10++) {
            this.field593[var10].method170(arg6, arg2, (byte) -63);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg2; var12++) {
            if (arg4) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field602.field376) {
                int[] var17 = this.field602.method18(var12, (byte) -62);
                var16 = var17;
                var14 = var17;
                var15 = var17;
            } else {
                int[][] var13 = this.field602.method19(-28941, var12);
                var14 = var13[0];
                var15 = var13[1];
                var16 = var13[2];
            }
            int[] var18;
            if (this.field592.field376) {
                var18 = this.field592.method18(var12, (byte) -62);
            } else {
                var18 = this.field592.method19(-28941, var12)[0];
            }
            for (int var19 = arg6 - 1; var19 >= 0; var19--) {
                int var20 = var14[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var15[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var22 = class248.field3695[var20];
                int var23 = class248.field3695[var21];
                int var24 = var16[var19] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class248.field3695[var24];
                int var26;
                if (var22 == 0 && var23 == 0 && var25 == 0) {
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
                var9.field1665[var11++] = (var22 << 16) + (var26 << 24) + var25 + (var23 << 8);
                if (arg4) {
                    var11 += (arg6 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field593.length; var27++) {
            this.field593[var27].method171((byte) 105);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[J[I)V", line = 798)
    public static final void method306(int arg0, long[] arg1, int[] arg2) {
        field598++;
        class164.method1161((byte) -123, arg1, 0, arg1.length + arg0, arg2);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)[Lmo;", line = 807)
    public static final class250[] method307(boolean arg0) {
        field604++;
        class250[] var1 = new class250[class220.field3285];
        if (arg0) {
            return (class250[]) null;
        }
        for (int var2 = 0; var2 < class220.field3285; var2++) {
            if (class141.field2031) {
                var1[var2] = new class204(class255.field3816, class22.field336, class199.field2896[var2], class160.field2319[var2], class59.field871[var2], class225.field3397[var2], class225.field3385[var2], class206.field3015);
            } else {
                var1[var2] = new class234(class255.field3816, class22.field336, class199.field2896[var2], class160.field2319[var2], class59.field871[var2], class225.field3397[var2], class225.field3385[var2], class206.field3015);
            }
        }
        class321.method2235(-2182);
        return var1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lmg;Lmg;B)V", line = 835)
    public static final void method308(class117 arg0, class117 arg1, byte arg2) {
        if (arg1.field1657 != null) {
            arg1.method876(8);
        }
        arg1.field1657 = arg0.field1657;
        field595++;
        int var3 = 78 % ((arg2 - 4) / 41);
        arg1.field1659 = arg0;
        arg1.field1657.field1659 = arg1;
        arg1.field1659.field1657 = arg1;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V", line = 852)
    public class41() {
        this.field600 = new int[0];
        this.field608 = new int[0];
        this.field591 = new class320(0);
        this.field591.field371 = 1;
        this.field602 = new class320();
        this.field602.field371 = 1;
        this.field592 = new class320();
        this.field592.field371 = 1;
        this.field593 = new class27[] { this.field602, this.field592, this.field591 };
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lsb;)V", line = 867)
    public class41(class190 arg0) {
        int var2 = arg0.method1319(255);
        int[][] var3 = new int[var2][];
        int var4 = 0;
        int var5 = 0;
        this.field593 = new class27[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class27 var7 = class27.method165(arg0, -92);
            if (var7.method172((byte) 92) >= 0) {
                var4++;
            }
            if (var7.method169(100) >= 0) {
                var5++;
            }
            int var8 = var7.field377.length;
            var3[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var3[var6][var9] = arg0.method1319(255);
            }
            this.field593[var6] = var7;
        }
        this.field600 = new int[var5];
        int var10 = 0;
        this.field608 = new int[var4];
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class27 var13 = this.field593[var12];
            int var14 = var13.field377.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field377[var15] = this.field593[var3[var12][var15]];
            }
            int var16 = var13.method172((byte) 92);
            int var17 = var13.method169(100);
            if (var16 > 0) {
                this.field608[var11++] = var16;
            }
            if (var17 > 0) {
                this.field600[var10++] = var17;
            }
            var3[var12] = null;
        }
        this.field602 = this.field593[arg0.method1319(255)];
        int[][] var18 = (int[][]) null;
        this.field592 = this.field593[arg0.method1319(255)];
        this.field591 = this.field593[arg0.method1319(255)];
    }
}
