import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class296 extends class175 {

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "[I")
    private int[] field4682;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "[I")
    private int[] field4672;

    @OriginalMember(owner = "client!dj", name = "G", descriptor = "Lcj;")
    private class288 field4678;

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "Lcj;")
    private class288 field4676;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "Lcj;")
    private class288 field4674;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "[Lcj;")
    private class288[] field4673;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "I")
    public static int field4681 = 0;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!dj", name = "F", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1973(Component arg0, int arg1) {
        field4683++;
        arg0.removeKeyListener(class170.field2750);
        if (arg1 != 8175) {
            field4680 = 68;
        }
        arg0.removeFocusListener(class170.field2750);
        class253.field4046 = -1;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjj;Lc;DBZI)Lsd;")
    public final class24 method1974(int arg0, class134 arg1, class276 arg2, double arg3, byte arg4, boolean arg5, int arg6) {
        field4679++;
        int var9 = -69 / ((-arg4 - 14) / 40);
        class208.method1411(-27, arg3);
        class23.field283 = arg2;
        class267.field4329 = arg1;
        class232.method1535(arg6, -80, arg0);
        class24 var10 = new class24(arg0, arg6);
        for (int var11 = 0; var11 < this.field4673.length; var11++) {
            this.field4673[var11].method1929(arg6, arg0, (byte) 101);
        }
        int var12 = 0;
        for (int var13 = 0; var13 < arg6; var13++) {
            if (arg5) {
                var12 = var13 << 2;
            }
            int[] var16;
            int[] var17;
            int[] var18;
            if (this.field4676.field4612) {
                int[] var19 = this.field4676.method26(0, var13);
                var16 = var19;
                var18 = var19;
                var17 = var19;
            } else {
                int[][] var15 = this.field4676.method34(1, var13);
                var16 = var15[1];
                var17 = var15[2];
                var18 = var15[0];
            }
            int[] var20;
            if (this.field4674.field4612) {
                var20 = this.field4674.method26(0, var13);
            } else {
                var20 = this.field4674.method34(1, var13)[0];
            }
            for (int var21 = arg0 - 1; var21 >= 0; var21--) {
                int var22 = var18[var21] >> 4;
                int var23 = var16[var21] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                int var24 = var17[var21] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var25 = class294.field4655[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class294.field4655[var23];
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var27 = class294.field4655[var24];
                int var28;
                if (var25 == 0 && var26 == 0 && var27 == 0) {
                    var28 = 0;
                } else {
                    var28 = var20[var21] >> 4;
                    if (var28 > 255) {
                        var28 = 255;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                }
                var10.field510[var12++] = (var25 << 16) + (var28 << 24) + ((var26 << 8) - -var27);
                if (arg5) {
                    var12 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var14 = 0; var14 < this.field4673.length; var14++) {
            this.field4673[var14].method571(80);
        }
        return var10;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLjj;)V")
    public static final void method1975(byte arg0, class134 arg1) {
        class242.field3881 = arg1;
        field4684++;
        if (arg0 >= -94) {
            field4685 = -62;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)V")
    public static final void method1976(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class154.field2482; var5++) {
            if (arg1 < class85.field1153[var5] + class186.field2989[var5] && arg1 + arg2 > class186.field2989[var5] && arg3 < class236.field3767[var5] + class233.field3710[var5] && (arg3 + arg4) > class236.field3767[var5]) {
                class217.field3482[var5] = true;
            }
        }
        if (arg0 != 15527) {
            method1976(-57, 84, -69, 52, 13);
        }
        field4677++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZLc;DLjj;ZZI)[I")
    public final int[] method1977(int arg0, boolean arg1, class276 arg2, double arg3, class134 arg4, boolean arg5, boolean arg6, int arg7) {
        class208.method1411(104, arg3);
        class23.field283 = arg2;
        class267.field4329 = arg4;
        field4675++;
        class232.method1535(arg0, -52, arg7);
        int[] var10 = new int[arg0 * arg7];
        for (int var11 = 0; var11 < this.field4673.length; var11++) {
            this.field4673[var11].method1929(arg0, arg7, (byte) 61);
        }
        if (arg1) {
            this.field4672 = null;
        }
        int var12;
        int var13;
        byte var14;
        if (arg5) {
            var13 = -1;
            var14 = -1;
            var12 = arg7 - 1;
        } else {
            var12 = 0;
            var13 = arg7;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg0; var16++) {
            if (arg6) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field4676.field4612) {
                int[] var18 = this.field4676.method26(0, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field4676.method34(1, var16);
                var19 = var22[2];
                var20 = var22[1];
                var21 = var22[0];
            }
            for (int var23 = var12; var23 != var13; var23 += var14) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class294.field4655[var24];
                int var26 = var21[var23] >> 4;
                int var27 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var28 = class294.field4655[var27];
                int var29 = class294.field4655[var26];
                var10[var15++] = (var25 << 8) + (var29 << 16) + var28;
                if (arg6) {
                    var15 += arg7 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field4673.length; var17++) {
            this.field4673[var17].method571(22);
        }
        return var10;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
    public class296() {
        this.field4682 = new int[0];
        this.field4672 = new int[0];
        this.field4678 = new class71(0);
        this.field4678.field4603 = 1;
        this.field4676 = new class71();
        this.field4676.field4603 = 1;
        this.field4674 = new class71();
        this.field4674.field4603 = 1;
        this.field4673 = new class288[] { this.field4676, this.field4674, this.field4678 };
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lhi;)V")
    public class296(class264 arg0) {
        int var2 = arg0.method1779(-67);
        this.field4673 = new class288[var2];
        int var3 = 0;
        int[][] var4 = new int[var2][];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class288 var16 = class109.method792((byte) -95, arg0);
            if (var16.method568(255) >= 0) {
                var3++;
            }
            if (var16.method857((byte) -57) >= 0) {
                var5++;
            }
            int var17 = var16.field4606.length;
            var4[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var4[var6][var18] = arg0.method1779(-83);
            }
            this.field4673[var6] = var16;
        }
        this.field4672 = new int[var5];
        int var7 = 0;
        this.field4682 = new int[var3];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class288 var11 = this.field4673[var9];
            int var12 = var11.field4606.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4606[var13] = this.field4673[var4[var9][var13]];
            }
            int var14 = var11.method568(255);
            int var15 = var11.method857((byte) -57);
            if (var14 > 0) {
                this.field4682[var8++] = var14;
            }
            if (var15 > 0) {
                this.field4672[var7++] = var15;
            }
            var4[var9] = null;
        }
        this.field4676 = this.field4673[arg0.method1779(-79)];
        Object var10 = null;
        this.field4674 = this.field4673[arg0.method1779(-97)];
        this.field4678 = this.field4673[arg0.method1779(-120)];
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(DILc;IZBLjj;)Lwe;")
    public final class43 method1978(double arg0, int arg1, class276 arg2, int arg3, boolean arg4, byte arg5, class134 arg6) {
        class208.method1411(114, arg0);
        class23.field283 = arg2;
        class267.field4329 = arg6;
        field4686++;
        class232.method1535(arg1, -121, arg3);
        class43 var9 = new class43(arg3, arg1);
        for (int var10 = 0; var10 < this.field4673.length; var10++) {
            this.field4673[var10].method1929(arg1, arg3, (byte) 56);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            if (arg4) {
                var11 = var12;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field4676.field4612) {
                int[] var18 = this.field4676.method26(0, var12);
                var17 = var18;
                var15 = var18;
                var16 = var18;
            } else {
                int[][] var14 = this.field4676.method34(1, var12);
                var15 = var14[0];
                var16 = var14[2];
                var17 = var14[1];
            }
            for (int var19 = 0; var19 != arg3; var19++) {
                int var20 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var17[var19] >> 4;
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = class294.field4655[var21];
                int var23 = class294.field4655[var20];
                int var24 = var16[var19] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class294.field4655[var24];
                var9.field510[var11++] = (var23 << 16) + (var22 << 8) + var25;
                if (arg4) {
                    var11 += arg3 - 1;
                }
            }
        }
        if (arg5 > -77) {
            this.field4673 = null;
        }
        for (int var13 = 0; var13 < this.field4673.length; var13++) {
            this.field4673[var13].method571(23);
        }
        return var9;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lc;ILjj;)Z")
    public final boolean method1979(class276 arg0, int arg1, class134 arg2) {
        field4671++;
        if (arg1 != -13722) {
            return false;
        }
        if (class99.field1516 <= 0) {
            for (int var4 = 0; var4 < this.field4682.length; var4++) {
                if (!arg2.method935((byte) 31, this.field4682[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4682.length; var5++) {
                if (!arg2.method934(this.field4682[var5], (byte) 96, class99.field1516)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field4672.length; var6++) {
            if (!arg0.method1376(true, this.field4672[var6])) {
                return false;
            }
        }
        return true;
    }
}
