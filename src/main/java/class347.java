import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class347 extends class331 {

    @OriginalMember(owner = "client!v", name = "R", descriptor = "[I")
    private int[] field4913;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "[I")
    private int[] field4915;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "Lr;")
    private class98 field4905;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "Lr;")
    private class98 field4903;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "Lr;")
    private class98 field4920;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "[Lr;")
    private class98[] field4908;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "Lwq;")
    public static class92 field4916 = new class92();

    @OriginalMember(owner = "client!v", name = "W", descriptor = "Z")
    public static boolean field4918 = false;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    public static int field4921 = 1;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!v", name = "X", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "Lul;")
    public static class343 field4909;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "[Lgj;")
    public static class381[] field4907;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIZILul;Ltq;)[F", line = 8)
    public final float[] method2214(int arg0, int arg1, boolean arg2, int arg3, class343 arg4, class376 arg5) {
        class146.field1794 = arg5;
        field4912++;
        class394.field5565 = arg4;
        for (int var7 = 0; var7 < this.field4908.length; var7++) {
            this.field4908[var7].method538(arg0, arg1, -1);
        }
        class150.method911(arg0, -34, arg1);
        float[] var8 = new float[arg0 * arg1 * 4];
        int var9 = 0;
        for (int var10 = arg3; var10 < arg0; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field4903.field1176) {
                int[] var16 = this.field4903.method83(0, var10);
                var15 = var16;
                var13 = var16;
                var14 = var16;
            } else {
                int[][] var12 = this.field4903.method194(var10, 6);
                var13 = var12[0];
                var14 = var12[1];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field4920.field1176) {
                var17 = this.field4920.method83(0, var10);
            } else {
                var17 = this.field4920.method194(var10, -104)[0];
            }
            if (arg2) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field4905.field1176) {
                var18 = this.field4905.method83(0, var10);
            } else {
                var18 = this.field4905.method194(var10, arg3 + 107)[0];
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg2) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field4908.length; var11++) {
            this.field4908[var11].method540(30103);
        }
        return var8;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V", line = 116)
    public static final void method2215(int arg0, int arg1) {
        class237 var2 = class141.field1742;
        synchronized (class141.field1742) {
            class141.field1742.method1618(0);
            class141.field1742 = new class237(arg1);
            int var3 = -116 % ((arg0 - 84) / 37);
        }
        field4911++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ltq;ZILul;DZIB)[I", line = 133)
    public final int[] method2216(class376 arg0, boolean arg1, int arg2, class343 arg3, double arg4, boolean arg5, int arg6, byte arg7) {
        class394.field5565 = arg3;
        field4914++;
        class146.field1794 = arg0;
        for (int var10 = 0; var10 < this.field4908.length; var10++) {
            this.field4908[var10].method538(arg2, arg6, -1);
        }
        class210.method1414(-122, arg4);
        class150.method911(arg2, -70, arg6);
        int[] var11 = new int[arg2 * arg6];
        int var12;
        int var13;
        byte var14;
        if (arg5) {
            var12 = arg6 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var13 = arg6;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg2; var16++) {
            if (arg1) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field4903.field1176) {
                int[] var18 = this.field4903.method83(0, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field4903.method194(var16, -43);
                var19 = var22[2];
                var21 = var22[0];
                var20 = var22[1];
            }
            for (int var23 = var12; var23 != var13; var23 += var14) {
                int var24 = var21[var23] >> 4;
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
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class327.field4649[var24];
                int var28 = class327.field4649[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class327.field4649[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg1) {
                    var15 += arg6 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field4908.length; var17++) {
            this.field4908[var17].method540(30103);
        }
        if (arg7 < 67) {
            field4909 = null;
        }
        return var11;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILul;Ltq;)Z", line = 271)
    public final boolean method2217(int arg0, class343 arg1, class376 arg2) {
        field4910++;
        if (class334.field4728 >= 0) {
            for (int var4 = 0; var4 < this.field4915.length; var4++) {
                if (!arg2.method2426(false, class334.field4728, this.field4915[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4915.length; var5++) {
                if (!arg2.method2412(this.field4915[var5], arg0 ^ 0xFFFF9074)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field4913.length; var6++) {
            if (!arg1.method1328((byte) -9, this.field4913[var6])) {
                return false;
            }
        }
        if (arg0 != -28657) {
            method2218(-67);
        }
        return true;
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V", line = 328)
    public static void method2218(int arg0) {
        field4916 = null;
        if (arg0 == 1) {
            field4909 = null;
            field4907 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ltq;Ltq;Ltq;Leo;B)Z", line = 345)
    public static final boolean method2219(class376 arg0, class376 arg1, class376 arg2, class162 arg3, byte arg4) {
        if (arg4 != -72) {
            return false;
        }
        class385.field5427 = arg3;
        class240.field3398 = arg1;
        class123.field1515 = arg0;
        field4902++;
        class394.field5559 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ltq;ILul;ZIDI)[I", line = 363)
    public final int[] method2220(class376 arg0, int arg1, class343 arg2, boolean arg3, int arg4, double arg5, int arg6) {
        field4904++;
        class146.field1794 = arg0;
        class394.field5565 = arg2;
        for (int var9 = 0; var9 < this.field4908.length; var9++) {
            this.field4908[var9].method538(arg1, arg4, -1);
        }
        class210.method1414(-94, arg5);
        class150.method911(arg1, arg6 ^ 0xFFFFFFDD, arg4);
        int[] var10 = new int[arg1 * arg4 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field4903.field1176) {
                int[] var14 = this.field4903.method83(0, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field4903.method194(var12, 126);
                var16 = var18[0];
                var15 = var18[2];
                var17 = var18[1];
            }
            if (arg3) {
                var11 = var12;
            }
            int[] var19;
            if (this.field4920.field1176) {
                var19 = this.field4920.method83(0, var12);
            } else {
                var19 = this.field4920.method194(var12, -77)[0];
            }
            for (int var20 = arg4 - 1; var20 >= 0; var20--) {
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
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class327.field4649[var22];
                int var25 = class327.field4649[var21];
                int var26 = class327.field4649[var23];
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
                var10[var11++] = (var25 << 16) + (var24 << 8) + (var27 << 24) + var26;
                if (arg3) {
                    var11 += arg4 - 1;
                }
            }
        }
        for (int var13 = arg6; var13 < this.field4908.length; var13++) {
            this.field4908[var13].method540(30103);
        }
        return var10;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)Lbj;", line = 498)
    public static final class130 method2221(byte arg0) {
        field4917++;
        class170.field2357 = 0;
        if (arg0 < 39) {
            field4907 = null;
        }
        return class385.method2468(6);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V", line = 527)
    public class347() {
        this.field4913 = new int[0];
        this.field4915 = new int[0];
        this.field4905 = new class141(0);
        this.field4905.field1187 = 1;
        this.field4903 = new class141();
        this.field4903.field1187 = 1;
        this.field4920 = new class141();
        this.field4920.field1187 = 1;
        this.field4908 = new class98[] { this.field4903, this.field4920, this.field4905 };
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ldg;)V", line = 542)
    public class347(class236 arg0) {
        int var2 = arg0.method1574(-38);
        int var3 = 0;
        int var4 = 0;
        this.field4908 = new class98[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class98 var16 = class5.method38(arg0, 0);
            if (var16.method543((byte) -49) >= 0) {
                var3++;
            }
            if (var16.method541(-128) >= 0) {
                var4++;
            }
            int var17 = var16.field1182.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1574(-59);
            }
            this.field4908[var6] = var16;
        }
        this.field4915 = new int[var3];
        int var7 = 0;
        this.field4913 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class98 var11 = this.field4908[var9];
            int var12 = var11.field1182.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1182[var13] = this.field4908[var5[var9][var13]];
            }
            int var14 = var11.method543((byte) -114);
            int var15 = var11.method541(-103);
            if (var14 > 0) {
                this.field4915[var7++] = var14;
            }
            if (var15 > 0) {
                this.field4913[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field4903 = this.field4908[arg0.method1574(-73)];
        this.field4920 = this.field4908[arg0.method1574(-65)];
        this.field4905 = this.field4908[arg0.method1574(-114)];
        Object var10 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIII)V", line = 629)
    public static final void method2222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 >= -57) {
            method2215(-5, 58);
        }
        field4906++;
        for (class203 var7 = (class203) class158.field2062.method2509((byte) 51); var7 != null; var7 = (class203) class158.field2062.method2515(0)) {
            if (var7.field2917 <= class189.field2726) {
                var7.method2635(-13388);
            } else {
                class8.method50(-53, arg4 >> 1, (var7.field2916 << 7) + 64, arg0, var7.field2912 * 2, (var7.field2915 << 7) + 64, arg3, arg5 >> 1);
                class174.field2391.method1776(class207.field2955[1] + arg2, var7.field2920 | 0xFF000000, var7.field2918, class207.field2955[0] + arg1, -100, 0);
            }
        }
    }
}
