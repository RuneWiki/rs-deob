import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class177 {

    @OriginalMember(owner = "client!la", name = "j", descriptor = "[I")
    private int[] field2904;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "[I")
    private int[] field2899;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Lvd;")
    private class279 field2896;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Lvd;")
    private class279 field2901;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "[Lvd;")
    private class279[] field2906;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field2902 = 0;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "[Lsb;")
    public static class165[] field2898;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "[Loj;")
    public static class260[] field2903;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILme;Lwe;IZID)[B", line = 19)
    public final byte[] method1312(int arg0, class295 arg1, class54 arg2, int arg3, boolean arg4, int arg5, double arg6) {
        class67.method553(arg6, (byte) -71);
        class17.field221 = arg1;
        byte[] var9 = new byte[arg0 * arg3 * 4];
        class138.field2272 = arg2;
        field2897++;
        class133.method973(arg0, arg3, 125);
        int var10 = -14 % ((72 - arg5) / 33);
        for (int var11 = 0; var11 < this.field2906.length; var11++) {
            this.field2906[var11].method1958(arg3, arg0, 255);
        }
        int var12 = 0;
        for (int var13 = 0; var13 < arg3; var13++) {
            if (arg4) {
                var12 = var13 << 2;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field2896.field4789) {
                int[] var14 = this.field2896.method44(false, var13);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field2896.method87(-7523, var13);
                var16 = var18[2];
                var17 = var18[0];
                var15 = var18[1];
            }
            int[] var19;
            if (this.field2901.field4789) {
                var19 = this.field2901.method44(false, var13);
            } else {
                var19 = this.field2901.method87(-7523, var13)[0];
            }
            for (int var20 = arg0 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                int var22 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = class172.field2832[var22];
                int var25 = class172.field2832[var21];
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class172.field2832[var23];
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
                var9[var12++] = (byte) var25;
                var9[var12++] = (byte) var24;
                var9[var12++] = (byte) var26;
                var9[var12++] = (byte) var27;
                if (arg4) {
                    var12 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var28 = 0; var28 < this.field2906.length; var28++) {
            this.field2906[var28].method254((byte) 121);
        }
        return var9;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lme;BLwe;)Z", line = 158)
    public final boolean method1313(class295 arg0, byte arg1, class54 arg2) {
        field2905++;
        for (int var4 = 0; var4 < this.field2899.length; var4++) {
            if (!arg0.method2034(this.field2899[var4], (byte) 73)) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field2904.length; var5++) {
            if (!arg2.method377(0, this.field2904[var5])) {
                return false;
            }
        }
        if (arg1 != -116) {
            this.field2904 = (int[]) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V", line = 192)
    public static final void method1314(boolean arg0) {
        if (arg0) {
            class84.field1310.method1484(!arg0);
            field2895++;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 205)
    public static void method1315(int arg0) {
        field2898 = null;
        if (arg0 == 0) {
            field2903 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZZLme;IIIDLwe;)[I", line = 246)
    public final int[] method1316(boolean arg0, boolean arg1, class295 arg2, int arg3, int arg4, int arg5, double arg6, class54 arg7) {
        field2900++;
        int[] var10 = new int[arg3 * arg4];
        class67.method553(arg6, (byte) 127);
        class138.field2272 = arg7;
        if (arg5 < 90) {
            this.method1316(false, false, (class295) null, -4, -37, -18, -0.3600840434911689D, (class54) null);
        }
        class17.field221 = arg2;
        class133.method973(arg3, arg4, 121);
        for (int var11 = 0; var11 < this.field2906.length; var11++) {
            this.field2906[var11].method1958(arg4, arg3, 255);
        }
        int var12;
        byte var13;
        int var14;
        if (arg1) {
            var14 = arg3 - 1;
            var13 = -1;
            var12 = -1;
        } else {
            var12 = arg3;
            var13 = 1;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg4; var16++) {
            if (arg0) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field2896.field4789) {
                int[] var17 = this.field2896.method44(false, var16);
                var18 = var17;
                var19 = var17;
                var20 = var17;
            } else {
                int[][] var21 = this.field2896.method87(-7523, var16);
                var19 = var21[0];
                var20 = var21[1];
                var18 = var21[2];
            }
            for (int var22 = var14; var22 != var12; var22 += var13) {
                int var23 = var19[var22] >> 4;
                int var24 = var18[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = var20[var22] >> 4;
                int var26 = class172.field2832[var23];
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var27 = class172.field2832[var24];
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class172.field2832[var25];
                var10[var15++] = (var26 << 16) + (var28 << 8) + var27;
                if (arg0) {
                    var15 += arg3 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field2906.length; var29++) {
            this.field2906[var29].method254((byte) 23);
        }
        return var10;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V", line = 376)
    public class177() {
        this.field2904 = new int[0];
        this.field2899 = new int[0];
        this.field2896 = new class235();
        this.field2896.field4775 = 1;
        this.field2901 = new class235();
        this.field2906 = new class279[] { this.field2896, this.field2901 };
        this.field2901.field4775 = 1;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Ls;)V", line = 389)
    public class177(class170 arg0) {
        int var2 = arg0.method1221(112);
        this.field2906 = new class279[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class279 var7 = class233.method1633(arg0, (byte) -96);
            if (var7.method956(-119) >= 0) {
                var3++;
            }
            if (var7.method255(32) >= 0) {
                var4++;
            }
            int var8 = var7.field4774.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method1221(98);
            }
            this.field2906[var6] = var7;
        }
        this.field2899 = new int[var3];
        this.field2904 = new int[var4];
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class279 var13 = this.field2906[var12];
            int var14 = var13.field4774.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field4774[var15] = this.field2906[var5[var12][var15]];
            }
            int var16 = var13.method956(-84);
            int var17 = var13.method255(32);
            if (var16 > 0) {
                this.field2899[var10++] = var16;
            }
            if (var17 > 0) {
                this.field2904[var11++] = var17;
            }
            var5[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field2896 = this.field2906[arg0.method1221(110)];
        this.field2901 = this.field2906[arg0.method1221(121)];
    }
}
