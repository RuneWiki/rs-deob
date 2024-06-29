import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class120 {

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "[I")
    private int[] field1877;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "[I")
    private int[] field1868;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Lt;")
    private class224 field1871;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Lt;")
    private class224 field1869;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[Lt;")
    private class224[] field1864;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field1873 = 0;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Luf;")
    public static class168 field1872 = null;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Z")
    public static boolean field1865 = true;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Luf;")
    public static class168 field1867 = class148.method1019(-1720, "hint_mapedge");

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 6)
    public static void method860(int arg0) {
        field1872 = null;
        if (arg0 != -1189383294) {
            method865(-71);
        }
        field1867 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lfl;Ldk;B)Z", line = 32)
    public final boolean method861(class81 arg0, class241 arg1, byte arg2) {
        field1863++;
        for (int var4 = 0; var4 < this.field1868.length; var4++) {
            if (!arg1.method1648(this.field1868[var4], false)) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field1877.length; var5++) {
            if (!arg0.method509(this.field1877[var5], (byte) 57)) {
                return false;
            }
        }
        if (arg2 == 127) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILfl;ZZLdk;DZ)[I", line = 69)
    public final int[] method862(int arg0, int arg1, class81 arg2, boolean arg3, boolean arg4, class241 arg5, double arg6, boolean arg7) {
        class76.method454(arg6, 0);
        field1878++;
        class72.field961 = arg5;
        class267.field4497 = arg2;
        class241.method1658(arg1, arg0, (byte) 23);
        for (int var10 = 0; var10 < this.field1864.length; var10++) {
            this.field1864[var10].method1543(arg0, arg1, (byte) -118);
        }
        int[] var11 = new int[arg0 * arg1];
        int var12;
        int var13;
        byte var14;
        if (arg3) {
            var13 = arg0 - 1;
            var14 = -1;
            var12 = -1;
        } else {
            var12 = arg0;
            var13 = 0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg1; var16++) {
            if (arg4) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field1871.field3610) {
                int[] var21 = this.field1871.method18((byte) 95, var16);
                var20 = var21;
                var19 = var21;
                var18 = var21;
            } else {
                int[][] var17 = this.field1871.method17(var16, (byte) -77);
                var18 = var17[1];
                var19 = var17[0];
                var20 = var17[2];
            }
            for (int var22 = var13; var22 != var12; var22 += var14) {
                int var23 = var18[var22] >> 4;
                int var24 = var19[var22] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = var20[var22] >> 4;
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var23 > 255) {
                    var23 = 255;
                }
                int var26 = class18.field211[var24];
                if (var23 < 0) {
                    var23 = 0;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                int var27 = class18.field211[var23];
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class18.field211[var25];
                var11[var15++] = (var26 << 16) + (var27 << 8) + var28;
                if (arg4) {
                    var15 += arg0 - 1;
                }
            }
        }
        if (!arg7) {
            field1876 = 108;
        }
        for (int var29 = 0; var29 < this.field1864.length; var29++) {
            this.field1864[var29].method1273(-17545);
        }
        return var11;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V", line = 204)
    public static final void method863(byte arg0) {
        field1874++;
        class205 var1 = class159.field2509;
        synchronized (class159.field2509) {
            class68.field902++;
            if (arg0 != -99) {
                method863((byte) -98);
            }
            class281.field4725 = class86.field1333;
            class262.field4442 = class201.field3309;
            class155.field2457 = class25.field308;
            class106.field1634 = class36.field417;
            class206.field3384 = class23.field281;
            class83.field1244 = class183.field2945;
            class44.field536 = class130.field2015;
            class36.field417 = 0;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(DZILdk;Lfl;II)[B", line = 237)
    public final byte[] method864(double arg0, boolean arg1, int arg2, class241 arg3, class81 arg4, int arg5, int arg6) {
        if (arg6 != 32354) {
            return (byte[]) null;
        }
        class76.method454(arg0, 0);
        class267.field4497 = arg4;
        byte[] var9 = new byte[arg2 * arg5 * 4];
        class72.field961 = arg3;
        field1866++;
        class241.method1658(arg5, arg2, (byte) 110);
        for (int var10 = 0; var10 < this.field1864.length; var10++) {
            this.field1864[var10].method1543(arg2, arg5, (byte) -118);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            if (arg1) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field1871.field3610) {
                int[] var17 = this.field1871.method18((byte) 99, var12);
                var14 = var17;
                var15 = var17;
                var16 = var17;
            } else {
                int[][] var13 = this.field1871.method17(var12, (byte) -77);
                var14 = var13[0];
                var15 = var13[1];
                var16 = var13[2];
            }
            int[] var18;
            if (this.field1869.field3610) {
                var18 = this.field1869.method18((byte) 78, var12);
            } else {
                var18 = this.field1869.method17(var12, (byte) -77)[0];
            }
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = var14[var19] >> 4;
                int var21 = var16[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                int var22 = var15[var19] >> 4;
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var22 > 255) {
                    var22 = 255;
                }
                int var23 = class18.field211[var21];
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = class18.field211[var22];
                int var25 = class18.field211[var20];
                int var26;
                if (var25 == 0 && var24 == 0 && var23 == 0) {
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
                var9[var11++] = (byte) var25;
                var9[var11++] = (byte) var24;
                var9[var11++] = (byte) var23;
                var9[var11++] = (byte) var26;
                if (arg1) {
                    var11 += (arg2 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field1864.length; var27++) {
            this.field1864[var27].method1273(arg6 - 49899);
        }
        return var9;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V", line = 383)
    public static final void method865(int arg0) {
        if (arg0 != -31114) {
            field1865 = false;
        }
        field1875++;
        class144.field2218.method1429((byte) 120);
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V", line = 403)
    public class120() {
        this.field1877 = new int[0];
        this.field1868 = new int[0];
        this.field1871 = new class229();
        this.field1871.field3630 = 1;
        this.field1869 = new class229();
        this.field1864 = new class224[] { this.field1871, this.field1869 };
        this.field1869.field3630 = 1;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lj;)V", line = 417)
    public class120(class153 arg0) {
        int var2 = arg0.method1042((byte) -63);
        this.field1864 = new class224[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class224 var7 = class267.method1857(arg0, 0);
            if (var7.method1536(-15899) >= 0) {
                var4++;
            }
            if (var7.method1275((byte) 119) >= 0) {
                var3++;
            }
            int var8 = var7.field3607.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method1042((byte) -86);
            }
            this.field1864[var6] = var7;
        }
        this.field1877 = new int[var3];
        this.field1868 = new int[var4];
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class224 var13 = this.field1864[var12];
            int var14 = var13.field3607.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field3607[var15] = this.field1864[var5[var12][var15]];
            }
            int var16 = var13.method1536(-15899);
            int var17 = var13.method1275((byte) 119);
            if (var16 > 0) {
                this.field1868[var11++] = var16;
            }
            if (var17 > 0) {
                this.field1877[var10++] = var17;
            }
            var5[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field1871 = this.field1864[arg0.method1042((byte) 83)];
        this.field1869 = this.field1864[arg0.method1042((byte) 127)];
    }
}
