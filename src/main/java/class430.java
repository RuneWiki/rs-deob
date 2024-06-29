import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class430 extends class224 {

    @OriginalMember(owner = "client!rba", name = "D", descriptor = "[I")
    private int[] field6015;

    @OriginalMember(owner = "client!rba", name = "F", descriptor = "[I")
    private int[] field6017;

    @OriginalMember(owner = "client!rba", name = "E", descriptor = "Lpc;")
    private class667 field6016;

    @OriginalMember(owner = "client!rba", name = "H", descriptor = "Lpc;")
    private class667 field6019;

    @OriginalMember(owner = "client!rba", name = "z", descriptor = "Lpc;")
    private class667 field6011;

    @OriginalMember(owner = "client!rba", name = "A", descriptor = "[Lpc;")
    private class667[] field6012;

    @OriginalMember(owner = "client!rba", name = "C", descriptor = "Lqaa;")
    public static class27 field6014 = new class27(6, 7);

    @OriginalMember(owner = "client!rba", name = "x", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!rba", name = "y", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!rba", name = "B", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!rba", name = "G", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!rba", name = "J", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!rba", name = "L", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!rba", name = "K", descriptor = "Lth;")
    public static class593 field6021;

    @OriginalMember(owner = "client!rba", name = "M", descriptor = "[[B")
    public static byte[][] field6023;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILeq;ZDLd;IIZ)[I", line = 7)
    public final int[] method2609(int arg0, class209 arg1, boolean arg2, double arg3, class149 arg4, int arg5, int arg6, boolean arg7) {
        class128.field1937 = arg4;
        class419.field5894 = arg1;
        field6010++;
        for (int var10 = arg0; var10 < this.field6012.length; var10++) {
            this.field6012[var10].method3742(arg6, arg5, 26122);
        }
        class444.method2660(-32415, arg3);
        class458.method2795(arg5, -1, arg6);
        int[] var11 = new int[arg5 * arg6];
        int var12;
        int var13;
        byte var14;
        if (arg7) {
            var13 = arg6 - 1;
            var14 = -1;
            var12 = -1;
        } else {
            var12 = arg6;
            var13 = 0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg5; var16++) {
            if (arg2) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field6019.field9344) {
                int[] var22 = this.field6019.method117((byte) -127, var16);
                var20 = var22;
                var19 = var22;
                var21 = var22;
            } else {
                int[][] var18 = this.field6019.method777(false, var16);
                var19 = var18[0];
                var20 = var18[1];
                var21 = var18[2];
            }
            for (int var23 = var13; var23 != var12; var23 += var14) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var20[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class754.field10503[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class754.field10503[var25];
                int var29 = class754.field10503[var26];
                int var30 = (var27 << 16) - (-(var28 << 8) - var29);
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg2) {
                    var15 += arg6 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field6012.length; var17++) {
            this.field6012[var17].method3745(false);
        }
        return var11;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IBLd;DZLeq;I)[I", line = 145)
    public final int[] method2610(int arg0, byte arg1, class149 arg2, double arg3, boolean arg4, class209 arg5, int arg6) {
        field6013++;
        class419.field5894 = arg5;
        class128.field1937 = arg2;
        for (int var9 = 0; var9 < this.field6012.length; var9++) {
            this.field6012[var9].method3742(arg6, arg0, 26122);
        }
        class444.method2660(-32415, arg3);
        class458.method2795(arg0, -1, arg6);
        int[] var10 = new int[arg0 * arg6];
        int var11 = 0;
        if (arg1 != 43) {
            field6021 = null;
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field6019.field9344) {
                int[] var14 = this.field6019.method117((byte) -108, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field6019.method777(false, var12);
                var15 = var18[1];
                var17 = var18[0];
                var16 = var18[2];
            }
            if (arg4) {
                var11 = var12;
            }
            int[] var19;
            if (this.field6011.field9344) {
                var19 = this.field6011.method117((byte) -122, var12);
            } else {
                var19 = this.field6011.method777(false, var12)[0];
            }
            for (int var20 = arg6 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
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
                int var23 = var16[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class754.field10503[var22];
                int var25 = class754.field10503[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class754.field10503[var23];
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
                var10[var11++] = (var27 << 24) + ((var25 << 16) + (var24 << 8)) + var26;
                if (arg4) {
                    var11 += arg6 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field6012.length; var13++) {
            this.field6012[var13].method3745(false);
        }
        return var10;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZILeq;ILd;I)[F", line = 284)
    public final float[] method2611(boolean arg0, int arg1, class209 arg2, int arg3, class149 arg4, int arg5) {
        class128.field1937 = arg4;
        field6022++;
        class419.field5894 = arg2;
        for (int var7 = 0; var7 < this.field6012.length; var7++) {
            this.field6012[var7].method3742(arg5, arg3, 26122);
        }
        class458.method2795(arg3, -1, arg5);
        float[] var8 = new float[arg3 * arg5 * 4];
        int var9 = 0;
        if (arg1 != 1852332514) {
            method2613(-109);
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field6019.field9344) {
                int[] var16 = this.field6019.method117((byte) -127, var10);
                var14 = var16;
                var13 = var16;
                var15 = var16;
            } else {
                int[][] var12 = this.field6019.method777(false, var10);
                var13 = var12[2];
                var14 = var12[1];
                var15 = var12[0];
            }
            int[] var17;
            if (this.field6011.field9344) {
                var17 = this.field6011.method117((byte) -107, var10);
            } else {
                var17 = this.field6011.method777(false, var10)[0];
            }
            if (arg0) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field6016.field9344) {
                var18 = this.field6016.method117((byte) -90, var10);
            } else {
                var18 = this.field6016.method777(false, var10)[0];
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = var20;
                if (arg0) {
                    var9 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field6012.length; var11++) {
            this.field6012[var11].method3745(false);
        }
        return var8;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Ld;ILeq;)Z", line = 397)
    public final boolean method2612(class149 arg0, int arg1, class209 arg2) {
        field6009++;
        if (class437.field6107 < 0) {
            for (int var4 = 0; var4 < this.field6017.length; var4++) {
                if (!arg2.method1472(-25711, this.field6017[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field6017.length; var5++) {
                if (!arg2.method1469((byte) -122, class437.field6107, this.field6017[var5])) {
                    return false;
                }
            }
        }
        if (arg1 <= 110) {
            return false;
        }
        for (int var6 = 0; var6 < this.field6015.length; var6++) {
            if (!arg0.method1152(this.field6015[var6], -112)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V", line = 453)
    public static final void method2613(int arg0) {
        if (arg0 >= 58) {
            class532.field7530.method552(((float) class471.field6781.field6686.method3630(27669) * 0.1F + 0.7F) * class22.field277);
            field6020++;
            class532.field7530.method522(class269.field3876, class444.field6172, class427.field5966, (float) (class537.field7566 << 2), (float) (class57.field1063 << 2), (float) (class254.field3691 << 2));
            class532.field7530.method587(class385.field5381);
        }
    }

    @OriginalMember(owner = "client!rba", name = "h", descriptor = "(I)V", line = 466)
    public static void method2614(int arg0) {
        if (arg0 == -2129252376) {
            field6014 = null;
            field6023 = null;
            field6021 = null;
        }
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "()V", line = 483)
    public class430() {
        this.field6015 = new int[0];
        this.field6017 = new int[0];
        this.field6016 = new class265(0);
        this.field6016.field9354 = 1;
        this.field6019 = new class265();
        this.field6019.field9354 = 1;
        this.field6011 = new class265();
        this.field6012 = new class667[] { this.field6019, this.field6011, this.field6016 };
        this.field6011.field9354 = 1;
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lud;)V", line = 500)
    public class430(class35 arg0) {
        int var2 = arg0.method273(255);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field6012 = new class667[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class667 var16 = class25.method166(arg0, (byte) 108);
            if (var16.method3749(true) >= 0) {
                var3++;
            }
            if (var16.method3746(27019) >= 0) {
                var4++;
            }
            int var17 = var16.field9347.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method273(255);
            }
            this.field6012[var6] = var16;
        }
        this.field6017 = new int[var3];
        int var7 = 0;
        this.field6015 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class667 var11 = this.field6012[var9];
            int var12 = var11.field9347.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field9347[var13] = this.field6012[var5[var9][var13]];
            }
            int var14 = var11.method3749(true);
            int var15 = var11.method3746(27019);
            if (var14 > 0) {
                this.field6017[var7++] = var14;
            }
            if (var15 > 0) {
                this.field6015[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field6019 = this.field6012[arg0.method273(255)];
        this.field6011 = this.field6012[arg0.method273(255)];
        this.field6016 = this.field6012[arg0.method273(255)];
        Object var10 = null;
    }
}
