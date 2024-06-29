import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class407 extends class561 {

    @OriginalMember(owner = "client!eea", name = "s", descriptor = "[I")
    private int[] field5582;

    @OriginalMember(owner = "client!eea", name = "x", descriptor = "[I")
    private int[] field5587;

    @OriginalMember(owner = "client!eea", name = "r", descriptor = "Lar;")
    private class4 field5581;

    @OriginalMember(owner = "client!eea", name = "q", descriptor = "Lar;")
    private class4 field5580;

    @OriginalMember(owner = "client!eea", name = "u", descriptor = "Lar;")
    private class4 field5584;

    @OriginalMember(owner = "client!eea", name = "p", descriptor = "[Lar;")
    private class4[] field5579;

    @OriginalMember(owner = "client!eea", name = "w", descriptor = "Lvt;")
    public static class344 field5586 = new class344("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!eea", name = "o", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!eea", name = "t", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!eea", name = "v", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!eea", name = "y", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!eea", name = "z", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!eea", name = "A", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!eea", name = "B", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(III)B")
    public static final byte method2425(int arg0, int arg1, int arg2) {
        if (arg2 != 18021) {
            return 49;
        }
        field5589++;
        if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIZLn;ILkr;D)[I")
    public final int[] method2426(int arg0, int arg1, boolean arg2, class473 arg3, int arg4, class329 arg5, double arg6) {
        class546.field7607 = arg5;
        class147.field1901 = arg3;
        field5585++;
        for (int var9 = 0; var9 < this.field5579.length; var9++) {
            this.field5579[var9].method11((byte) 86, arg0, arg4);
        }
        class423.method2493(255, arg6);
        if (arg1 != -1446815644) {
            this.field5580 = null;
        }
        class512.method2856((byte) -97, arg0, arg4);
        int[] var10 = new int[arg0 * arg4 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg4; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field5580.field44) {
                int[] var18 = this.field5580.method15((byte) 10, var12);
                var16 = var18;
                var17 = var18;
                var15 = var18;
            } else {
                int[][] var14 = this.field5580.method17(var12, (byte) -123);
                var15 = var14[1];
                var16 = var14[0];
                var17 = var14[2];
            }
            if (arg2) {
                var11 = var12;
            }
            int[] var19;
            if (this.field5584.field44) {
                var19 = this.field5584.method15((byte) 10, var12);
            } else {
                var19 = this.field5584.method17(var12, (byte) -91)[0];
            }
            for (int var20 = arg0 - 1; var20 >= 0; var20--) {
                int var21 = var16[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var15[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class558.field7818[var22];
                int var25 = class558.field7818[var21];
                int var26 = class558.field7818[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
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
                var10[var11++] = (var27 << 24) + var26 + (var25 << 16) + (var24 << 8);
                if (arg2) {
                    var11 += arg0 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field5579.length; var13++) {
            this.field5579[var13].method14(26131);
        }
        return var10;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ln;Lkr;I)Z")
    public final boolean method2427(class473 arg0, class329 arg1, int arg2) {
        field5578++;
        if (class187.field2410 >= 0) {
            for (int var4 = 0; var4 < this.field5587.length; var4++) {
                if (!arg1.method2051(this.field5587[var4], class187.field2410, -95)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field5587.length; var5++) {
                if (!arg1.method2042((byte) -80, this.field5587[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field5582.length; var6++) {
            if (!arg0.method2144(125, this.field5582[var6])) {
                return false;
            }
        }
        int var7 = -18 % ((-arg2 - 34) / 62);
        return true;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILkr;ILn;ZZDI)[I")
    public final int[] method2428(int arg0, class329 arg1, int arg2, class473 arg3, boolean arg4, boolean arg5, double arg6, int arg7) {
        class147.field1901 = arg3;
        class546.field7607 = arg1;
        field5590++;
        for (int var10 = 0; var10 < this.field5579.length; var10++) {
            this.field5579[var10].method11((byte) 86, arg0, arg2);
        }
        class423.method2493(255, arg6);
        class512.method2856((byte) -97, arg0, arg2);
        int[] var11 = new int[arg0 * arg2];
        int var12;
        byte var13;
        int var14;
        if (arg5) {
            var14 = -1;
            var12 = arg0 - 1;
            var13 = -1;
        } else {
            var12 = 0;
            var13 = 1;
            var14 = arg0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg2; var16++) {
            int[] var20;
            int[] var21;
            int[] var22;
            if (this.field5580.field44) {
                int[] var23 = this.field5580.method15((byte) 10, var16);
                var21 = var23;
                var22 = var23;
                var20 = var23;
            } else {
                int[][] var19 = this.field5580.method17(var16, (byte) -92);
                var20 = var19[0];
                var21 = var19[2];
                var22 = var19[1];
            }
            if (arg4) {
                var15 = var16;
            }
            for (int var24 = var12; var24 != var14; var24 += var13) {
                int var25 = var20[var24] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var22[var24] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = var21[var24] >> 4;
                if (var27 > 255) {
                    var27 = 255;
                }
                int var28 = class558.field7818[var25];
                if (var27 < 0) {
                    var27 = 0;
                }
                int var29 = class558.field7818[var26];
                int var30 = class558.field7818[var27];
                int var31 = (var28 << 16) - (-(var29 << 8) - var30);
                if (var31 != 0) {
                    var31 |= 0xFF000000;
                }
                var11[var15++] = var31;
                if (arg4) {
                    var15 += arg0 - 1;
                }
            }
        }
        int var17 = 34 / ((arg7 - 55) / 53);
        for (int var18 = 0; var18 < this.field5579.length; var18++) {
            this.field5579[var18].method14(26131);
        }
        return var11;
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(I)V")
    public static void method2429(int arg0) {
        if (arg0 != 0) {
            method2425(116, 91, 3);
        }
        field5586 = null;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IZLkr;IILn;)[F")
    public final float[] method2430(int arg0, boolean arg1, class329 arg2, int arg3, int arg4, class473 arg5) {
        class546.field7607 = arg2;
        class147.field1901 = arg5;
        field5588++;
        for (int var7 = 0; var7 < this.field5579.length; var7++) {
            this.field5579[var7].method11((byte) 86, arg4, arg0);
        }
        class512.method2856((byte) -97, arg4, arg0);
        float[] var8 = new float[arg4 * 4 * arg0];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field5580.field44) {
                int[] var12 = this.field5580.method15((byte) 10, var10);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field5580.method17(var10, (byte) -108);
                var14 = var16[2];
                var13 = var16[1];
                var15 = var16[0];
            }
            int[] var17;
            if (this.field5584.field44) {
                var17 = this.field5584.method15((byte) 10, var10);
            } else {
                var17 = this.field5584.method17(var10, (byte) -109)[0];
            }
            if (arg1) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field5581.field44) {
                var18 = this.field5581.method15((byte) 10, var10);
            } else {
                var18 = this.field5581.method17(var10, (byte) -102)[0];
            }
            for (int var19 = arg4 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg1) {
                    var9 += (arg4 << 2) - 4;
                }
            }
        }
        if (arg3 <= 73) {
            this.field5580 = null;
        }
        for (int var11 = 0; var11 < this.field5579.length; var11++) {
            this.field5579[var11].method14(26131);
        }
        return var8;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIIII)V")
    public static final void method2431(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5583++;
        for (class72 var5 = (class72) class244.field3084.method3188((byte) -100); var5 != null; var5 = (class72) class244.field3084.method3182((byte) -54)) {
            class214.method1392(arg0, var5, arg1, arg2, 5183, arg3);
        }
        class72 var6 = (class72) class453.field6416.method3188((byte) -100);
        if (arg4 != 2) {
            method2429(69);
        }
        while (var6 != null) {
            byte var11 = 1;
            class362 var12 = var6.field986.method144((byte) 15);
            if (var6.field986.field398) {
                var11 = 0;
            } else if (var6.field986.field350 == var12.field5035 || var6.field986.field350 == var12.field5064 || var6.field986.field350 == var12.field5031 || var6.field986.field350 == var12.field5044) {
                var11 = 2;
            } else if (var6.field986.field350 == var12.field5030 || var6.field986.field350 == var12.field5052 || var6.field986.field350 == var12.field5054 || var6.field986.field350 == var12.field5063) {
                var11 = 3;
            }
            if (var6.field989 != var11) {
                int var13 = class375.method2292(arg4 ^ 0x7E, var6.field986);
                if (var6.field999 != var13) {
                    if (var6.field993 != null) {
                        class92.field1224.method250(var6.field993);
                        var6.field993 = null;
                    }
                    var6.field999 = var13;
                }
                var6.field989 = var11;
            }
            var6.field980 = var6.field986.field6362;
            var6.field1001 = var6.field986.field6362 + (var6.field986.method104((byte) -92) << 8);
            var6.field992 = var6.field986.field6368;
            var6.field988 = var6.field986.field6368 + (var6.field986.method104((byte) -92) << 8);
            class214.method1392(arg0, var6, arg1, arg2, 5183, arg3);
            var6 = (class72) class453.field6416.method3182((byte) -108);
        }
        for (class72 var7 = (class72) class304.field3930.method3473(-27089); var7 != null; var7 = (class72) class304.field3930.method3478((byte) 5)) {
            byte var8 = 1;
            class362 var9 = var7.field991.method144((byte) 100);
            if (var7.field991.field398) {
                var8 = 0;
            } else if (var7.field991.field350 == var9.field5035 || var7.field991.field350 == var9.field5064 || var7.field991.field350 == var9.field5031 || var7.field991.field350 == var9.field5044) {
                var8 = 2;
            } else if (var7.field991.field350 == var9.field5030 || var7.field991.field350 == var9.field5052 || var7.field991.field350 == var9.field5054 || var7.field991.field350 == var9.field5063) {
                var8 = 3;
            }
            if (var7.field989 != var8) {
                int var10 = class105.method576((byte) 100, var7.field991);
                if (var7.field999 != var10) {
                    if (var7.field993 != null) {
                        class92.field1224.method250(var7.field993);
                        var7.field993 = null;
                    }
                    var7.field999 = var10;
                }
                var7.field989 = var8;
            }
            var7.field980 = var7.field991.field6362;
            var7.field1001 = var7.field991.field6362 + (var7.field991.method104((byte) -92) << 8);
            var7.field992 = var7.field991.field6368;
            var7.field988 = var7.field991.field6368 + (var7.field991.method104((byte) -92) << 8);
            class214.method1392(arg0, var7, arg1, arg2, 5183, arg3);
        }
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "()V")
    public class407() {
        this.field5582 = new int[0];
        this.field5587 = new int[0];
        this.field5581 = new class535(0);
        this.field5581.field28 = 1;
        this.field5580 = new class535();
        this.field5580.field28 = 1;
        this.field5584 = new class535();
        this.field5579 = new class4[] { this.field5580, this.field5584, this.field5581 };
        this.field5584.field28 = 1;
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Lge;)V")
    public class407(class551 arg0) {
        int var2 = arg0.method3045(-128);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field5579 = new class4[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class4 var16 = class43.method239((byte) -5, arg0);
            if (var16.method16(112) >= 0) {
                var3++;
            }
            if (var16.method19(102) >= 0) {
                var4++;
            }
            int var17 = var16.field33.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method3045(-127);
            }
            this.field5579[var6] = var16;
        }
        this.field5587 = new int[var3];
        int var7 = 0;
        this.field5582 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class4 var11 = this.field5579[var9];
            int var12 = var11.field33.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field33[var13] = this.field5579[var5[var9][var13]];
            }
            int var14 = var11.method16(112);
            int var15 = var11.method19(102);
            if (var14 > 0) {
                this.field5587[var7++] = var14;
            }
            if (var15 > 0) {
                this.field5582[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field5580 = this.field5579[arg0.method3045(-126)];
        this.field5584 = this.field5579[arg0.method3045(-127)];
        this.field5581 = this.field5579[arg0.method3045(-127)];
        Object var10 = null;
    }
}
