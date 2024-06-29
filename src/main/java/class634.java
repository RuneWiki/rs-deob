import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class634 extends class287 {

    @OriginalMember(owner = "client!fca", name = "v", descriptor = "[I")
    private int[] field9014;

    @OriginalMember(owner = "client!fca", name = "t", descriptor = "[I")
    private int[] field9012;

    @OriginalMember(owner = "client!fca", name = "C", descriptor = "Leia;")
    private class748 field9021;

    @OriginalMember(owner = "client!fca", name = "x", descriptor = "Leia;")
    private class748 field9016;

    @OriginalMember(owner = "client!fca", name = "B", descriptor = "Leia;")
    private class748 field9020;

    @OriginalMember(owner = "client!fca", name = "D", descriptor = "[Leia;")
    private class748[] field9022;

    @OriginalMember(owner = "client!fca", name = "G", descriptor = "[B")
    public static byte[] field9025 = new byte[2048];

    @OriginalMember(owner = "client!fca", name = "u", descriptor = "I")
    public static int field9013;

    @OriginalMember(owner = "client!fca", name = "w", descriptor = "I")
    public static int field9015;

    @OriginalMember(owner = "client!fca", name = "z", descriptor = "I")
    public static int field9018;

    @OriginalMember(owner = "client!fca", name = "A", descriptor = "I")
    public static int field9019;

    @OriginalMember(owner = "client!fca", name = "E", descriptor = "I")
    public static int field9023;

    @OriginalMember(owner = "client!fca", name = "F", descriptor = "I")
    public static int field9024;

    @OriginalMember(owner = "client!fca", name = "y", descriptor = "[[[B")
    public static byte[][][] field9017;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(ZDLd;ZIIILwu;)[I", line = 8)
    public final int[] method3681(boolean arg0, double arg1, class268 arg2, boolean arg3, int arg4, int arg5, int arg6, class557 arg7) {
        class594.field8567 = arg2;
        field9018++;
        class87.field1200 = arg7;
        for (int var10 = 0; var10 < this.field9022.length; var10++) {
            this.field9022[var10].method793(arg5, arg6, -256);
        }
        class699.method3946(128, arg1);
        class68.method439(arg4, arg6, arg5);
        int[] var11 = new int[arg5 * arg6];
        int var12;
        byte var13;
        int var14;
        if (arg0) {
            var12 = -1;
            var13 = -1;
            var14 = arg6 - 1;
        } else {
            var12 = arg6;
            var13 = 1;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg5; var16++) {
            if (arg3) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field9016.field10414) {
                int[] var22 = this.field9016.method25(var16, 255);
                var20 = var22;
                var19 = var22;
                var21 = var22;
            } else {
                int[][] var18 = this.field9016.method445(var16, 0);
                var19 = var18[0];
                var20 = var18[1];
                var21 = var18[2];
            }
            for (int var23 = var14; var23 != var12; var23 += var13) {
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
                int var27 = class323.field4157[var25];
                int var28 = class323.field4157[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class323.field4157[var26];
                int var30 = (var27 << 8) + (var28 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg3) {
                    var15 += arg6 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field9022.length; var17++) {
            this.field9022[var17].method792(false);
        }
        return var11;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lwu;ILd;)Z", line = 141)
    public final boolean method3682(class557 arg0, int arg1, class268 arg2) {
        field9015++;
        if (arg1 >= -96) {
            this.field9014 = null;
        }
        if (class589.field8453 < 0) {
            for (int var4 = 0; var4 < this.field9014.length; var4++) {
                if (!arg0.method3340(0, this.field9014[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field9014.length; var5++) {
                if (!arg0.method3321(class589.field8453, (byte) 112, this.field9014[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field9012.length; var6++) {
            if (!arg2.method86((byte) 117, this.field9012[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;", line = 192)
    public static final String method3683(int arg0, String[] arg1, int arg2, int arg3) {
        field9019++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg1[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg2 + arg3;
            int var6 = 0;
            if (arg0 != 4) {
                return null;
            }
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg1[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Ld;ZLwu;IIB)[F", line = 261)
    public final float[] method3684(class268 arg0, boolean arg1, class557 arg2, int arg3, int arg4, byte arg5) {
        class594.field8567 = arg0;
        class87.field1200 = arg2;
        field9023++;
        for (int var7 = 0; var7 < this.field9022.length; var7++) {
            this.field9022[var7].method793(arg3, arg4, -256);
        }
        class68.method439(-1, arg4, arg3);
        float[] var8 = new float[arg4 * 4 * arg3];
        int var9 = 0;
        for (int var10 = 0; var10 < arg3; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field9016.field10414) {
                int[] var12 = this.field9016.method25(var10, 255);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field9016.method445(var10, 0);
                var15 = var16[1];
                var14 = var16[2];
                var13 = var16[0];
            }
            int[] var17;
            if (this.field9020.field10414) {
                var17 = this.field9020.method25(var10, 255);
            } else {
                var17 = this.field9020.method445(var10, 0)[0];
            }
            int[] var18;
            if (this.field9021.field10414) {
                var18 = this.field9021.method25(var10, 255);
            } else {
                var18 = this.field9021.method445(var10, 0)[0];
            }
            if (arg1) {
                var9 = var10 << 2;
            }
            for (int var19 = arg4 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg1) {
                    var9 += (arg4 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field9022.length; var11++) {
            this.field9022[var11].method792(false);
        }
        if (arg5 <= 76) {
            this.method3686(null, null, false, -106, (byte) -114, 84, -0.9893028054541775D);
        }
        return var8;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)V", line = 379)
    public static void method3685(int arg0) {
        field9017 = null;
        if (arg0 != -451565752) {
            method3685(-25);
        }
        field9025 = null;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Ld;Lwu;ZIBID)[I", line = 390)
    public final int[] method3686(class268 arg0, class557 arg1, boolean arg2, int arg3, byte arg4, int arg5, double arg6) {
        field9013++;
        class594.field8567 = arg0;
        class87.field1200 = arg1;
        for (int var9 = 0; var9 < this.field9022.length; var9++) {
            this.field9022[var9].method793(arg5, arg3, -256);
        }
        class699.method3946(128, arg6);
        class68.method439(-1, arg3, arg5);
        int[] var10 = new int[arg3 * arg5];
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field9016.field10414) {
                int[] var18 = this.field9016.method25(var12, 255);
                var16 = var18;
                var15 = var18;
                var17 = var18;
            } else {
                int[][] var14 = this.field9016.method445(var12, 0);
                var15 = var14[1];
                var16 = var14[2];
                var17 = var14[0];
            }
            if (arg2) {
                var11 = var12;
            }
            int[] var19;
            if (this.field9020.field10414) {
                var19 = this.field9020.method25(var12, 255);
            } else {
                var19 = this.field9020.method445(var12, 0)[0];
            }
            for (int var20 = arg3 - 1; var20 >= 0; var20--) {
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
                int var24 = class323.field4157[var21];
                int var25 = class323.field4157[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class323.field4157[var23];
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
                var10[var11++] = (var25 << 8) + (var24 << 16) + (var27 << 24) + var26;
                if (arg2) {
                    var11 += arg3 - 1;
                }
            }
        }
        if (arg4 <= 81) {
            return null;
        } else {
            for (int var13 = 0; var13 < this.field9022.length; var13++) {
                this.field9022[var13].method792(false);
            }
            return var10;
        }
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "()V", line = 529)
    public class634() {
        this.field9014 = new int[0];
        this.field9012 = new int[0];
        this.field9021 = new class429(0);
        this.field9021.field10412 = 1;
        this.field9016 = new class429();
        this.field9016.field10412 = 1;
        this.field9020 = new class429();
        this.field9022 = new class748[] { this.field9016, this.field9020, this.field9021 };
        this.field9020.field10412 = 1;
    }

    @OriginalMember(owner = "client!fca", name = "g", descriptor = "(I)V", line = 545)
    public static final void method3687(int arg0) {
        field9024++;
        if (arg0 != 16209) {
            method3687(71);
        }
        while (class150.field2065.method3460(class542.field7582, -21) >= 15) {
            int var1 = class150.field2065.method3467(arg0 - 16211, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            class15 var3 = (class15) class403.field5587.method1381(true, (long) var1);
            if (var3 == null) {
                class55 var4 = new class55();
                var4.field8344 = var1;
                var3 = new class15(var4);
                class403.field5587.method1387(var3, (long) var1, (byte) -123);
                class312.field4003[class287.field3776++] = var3;
                var2 = true;
            }
            class55 var5 = var3.field204;
            class731.field10231[class676.field9533++] = var1;
            var5.field8367 = class575.field8126;
            if (var5.field771 != null && var5.field771.method56(98)) {
                class502.method3002(var5, false);
            }
            int var6 = class150.field2065.method3467(124, 2);
            int var7 = class150.field2065.method3467(-19, 1);
            int var8 = class150.field2065.method3467(-91, 1);
            if (var8 == 1) {
                class745.field10385[class298.field3905++] = var1;
            }
            int var9 = class150.field2065.method3467(-67, 5);
            if (var9 > 15) {
                var9 -= 32;
            }
            int var10 = (class150.field2065.method3467(-112, 3) + 4 & 0x64400007) << 11;
            int var11 = class150.field2065.method3467(125, 5);
            if (var11 > 15) {
                var11 -= 32;
            }
            var5.method379(class643.field9112.method3887(class150.field2065.method3467(-101, 14), false), arg0 ^ 0xFFFFC0D3);
            var5.method3474((byte) -101, var5.field771.field134);
            var5.field8322 = var5.field771.field146 << 3;
            if (var2) {
                var5.method3471(var10, (byte) -96, true);
            }
            var5.method367(var6, arg0 ^ 0xFFFFC0AF, var7 == 1, var5.method3470(-1), class473.field6483.field8421[0] + var11, class473.field6483.field8414[0] + var9);
            if (var5.field771.method56(106)) {
                class143.method937(var5.field8414[0], null, var5.field9501, arg0 + 2917, var5, var5.field8421[0], 0, null);
            }
        }
        class150.field2065.method3458((byte) 53);
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lvj;)V", line = 623)
    public class634(class26 arg0) {
        int var2 = arg0.method194((byte) 119);
        int var3 = 0;
        int var4 = 0;
        this.field9022 = new class748[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class748 var16 = class529.method3141((byte) -43, arg0);
            if (var16.method3362((byte) 116) >= 0) {
                var3++;
            }
            if (var16.method795(-121) >= 0) {
                var4++;
            }
            int var17 = var16.field10424.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method194((byte) 119);
            }
            this.field9022[var6] = var16;
        }
        this.field9014 = new int[var3];
        int var7 = 0;
        this.field9012 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class748 var11 = this.field9022[var9];
            int var12 = var11.field10424.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field10424[var13] = this.field9022[var5[var9][var13]];
            }
            int var14 = var11.method3362((byte) 112);
            int var15 = var11.method795(-34);
            if (var14 > 0) {
                this.field9014[var7++] = var14;
            }
            if (var15 > 0) {
                this.field9012[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field9016 = this.field9022[arg0.method194((byte) 119)];
        this.field9020 = this.field9022[arg0.method194((byte) 119)];
        this.field9021 = this.field9022[arg0.method194((byte) 119)];
        Object var10 = null;
    }
}
