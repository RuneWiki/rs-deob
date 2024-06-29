import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class193 {

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "[I")
    private int[] field3339;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "[I")
    private int[] field3356;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "Lmc;")
    private class183 field3352;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "Lmc;")
    private class183 field3340;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "[Lmc;")
    private class183[] field3353;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "J")
    public static long field3338 = 0L;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "[I")
    public static int[] field3347 = new int[25];

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "Ljf;")
    public static class229 field3348 = class212.method1457((byte) 72, "_labels");

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "[[I")
    public static int[][] field3346 = new int[104][104];

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "Ljf;")
    public static class229 field3350 = class212.method1457((byte) 92, "Particles: ");

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "F")
    public static float field3344;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "Ldn;")
    public static class231 field3354;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BJ)Ljf;", line = 15)
    public static final class229 method1316(byte arg0, long arg1) {
        class155.field2646.setTime(new Date(arg1));
        field3345++;
        int var3 = class155.field2646.get(7);
        int var4 = class155.field2646.get(5);
        int var5 = class155.field2646.get(2);
        int var6 = class155.field2646.get(1);
        int var7 = class155.field2646.get(11);
        int var8 = class155.field2646.get(12);
        int var9 = class155.field2646.get(13);
        if (arg0 != 119) {
            method1316((byte) 111, 25L);
        }
        return class142.method989(new class229[] { class20.field341[var3 - 1], class315.field5343, class84.method607(-76, var4 / 10), class84.method607(75, var4 % 10), class187.field3282, class220.field3761[var5], class187.field3282, class84.method607(121, var6), class257.field4479, class84.method607(-123, var7 / 10), class84.method607(arg0 ^ 0xFFFFFFF9, var7 % 10), class33.field626, class84.method607(-126, var8 / 10), class84.method607(113, var8 % 10), class33.field626, class84.method607(arg0 ^ 0x8, var9 / 10), class84.method607(arg0 ^ 0x39, var9 % 10), class104.field1815 }, -84);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lwj;Lek;Z)Z", line = 48)
    public final boolean method1317(class219 arg0, class185 arg1, boolean arg2) {
        if (!arg2) {
            this.field3353 = (class183[]) null;
        }
        field3341++;
        if (class167.field2871 > 0) {
            for (int var4 = 0; var4 < this.field3356.length; var4++) {
                if (!arg1.method1276(this.field3356[var4], -25658, class167.field2871)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3356.length; var5++) {
                if (!arg1.method1289(this.field3356[var5], -98)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field3339.length; var6++) {
            if (!arg0.method1513(this.field3339[var6], 14393)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILek;ZBLwj;ID)[B", line = 104)
    public final byte[] method1318(int arg0, class185 arg1, boolean arg2, byte arg3, class219 arg4, int arg5, double arg6) {
        class59.method452(arg6, (byte) 40);
        class237.field4091 = arg1;
        class107.field1884 = arg4;
        field3349++;
        byte[] var9 = new byte[arg0 * arg5 * 4];
        class328.method2216(arg0, arg5, (byte) -58);
        for (int var10 = 0; var10 < this.field3353.length; var10++) {
            this.field3353[var10].method1251(5, arg5, arg0);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            if (arg2) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field3352.field3166) {
                int[] var13 = this.field3352.method10(var12, -1);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field3352.method12(-121, var12);
                var14 = var17[1];
                var16 = var17[0];
                var15 = var17[2];
            }
            int[] var18;
            if (this.field3340.field3166) {
                var18 = this.field3340.method10(var12, -1);
            } else {
                var18 = this.field3340.method12(-55, var12)[0];
            }
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = var16[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var21 = var14[var19] >> 4;
                int var22 = class71.field1375[var20];
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class71.field1375[var21];
                int var24 = var15[var19] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class71.field1375[var24];
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
                var9[var11++] = (byte) var22;
                var9[var11++] = (byte) var23;
                var9[var11++] = (byte) var25;
                var9[var11++] = (byte) var26;
                if (arg2) {
                    var11 += (arg0 << 2) - 4;
                }
            }
        }
        int var27 = -110 / ((27 - arg3) / 56);
        for (int var28 = 0; var28 < this.field3353.length; var28++) {
            this.field3353[var28].method454(-100);
        }
        return var9;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIBIII)V", line = 254)
    public static final void method1319(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        class126.field2233 = arg3;
        field3355++;
        class327.field5500 = arg1;
        class61.field1048 = arg0;
        class295.field5040 = arg4;
        class104.field1808 = arg5;
        if (arg2 >= -76) {
            field3344 = 1.6287575F;
        }
        if (class295.field5040 >= 100) {
            int var6 = class104.field1808 * 128 + 64;
            int var7 = class61.field1048 * 128 + 64;
            int var8 = class282.method1984((byte) -102, var7, var6, class16.field254) - class327.field5500;
            int var9 = var8 - class107.field1881;
            int var10 = var6 - class97.field1721;
            int var11 = var7 - class243.field4301;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class203.field3550 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class174.field3043 = (int) (-325.949D * Math.atan2((double) var10, (double) var11)) & 0x7FF;
            if (class203.field3550 < 128) {
                class203.field3550 = 128;
            }
            if (class203.field3550 > 383) {
                class203.field3550 = 383;
            }
        }
        class74.field1405 = 2;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 300)
    public static void method1320(int arg0) {
        field3346 = (int[][]) null;
        field3347 = null;
        field3354 = null;
        field3350 = null;
        int var1 = 90 / ((arg0 - 6) / 63);
        field3348 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIII)V", line = 316)
    public static final void method1321(int arg0, int arg1, int arg2, int arg3) {
        field3351++;
        if (class298.field5083 != 0 && arg1 != 0 && class131.field2313 < 50 && arg3 != -1) {
            class232.field4039[class131.field2313] = arg3;
            class47.field857[class131.field2313] = arg1;
            class234.field4047[class131.field2313] = arg0;
            class245.field4359[class131.field2313] = null;
            class226.field3866[class131.field2313] = 0;
            class131.field2313++;
        }
        if (arg2 > -49) {
            method1316((byte) -81, 16L);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lek;ZZIILwj;ID)[I", line = 354)
    public final int[] method1322(class185 arg0, boolean arg1, boolean arg2, int arg3, int arg4, class219 arg5, int arg6, double arg7) {
        int[] var10 = new int[arg3 * arg6];
        field3342++;
        class59.method452(arg7, (byte) 79);
        class237.field4091 = arg0;
        if (arg4 != 23896) {
            return (int[]) null;
        }
        class107.field1884 = arg5;
        class328.method2216(arg6, arg3, (byte) -79);
        for (int var11 = 0; var11 < this.field3353.length; var11++) {
            this.field3353[var11].method1251(5, arg3, arg6);
        }
        int var12;
        byte var13;
        int var14;
        if (arg2) {
            var14 = -1;
            var12 = arg6 - 1;
            var13 = -1;
        } else {
            var12 = 0;
            var13 = 1;
            var14 = arg6;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg3; var16++) {
            if (arg1) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field3352.field3166) {
                int[] var21 = this.field3352.method10(var16, -1);
                var18 = var21;
                var19 = var21;
                var20 = var21;
            } else {
                int[][] var17 = this.field3352.method12(-96, var16);
                var18 = var17[0];
                var19 = var17[2];
                var20 = var17[1];
            }
            for (int var22 = var12; var22 != var14; var22 += var13) {
                int var23 = var18[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class71.field1375[var23];
                int var25 = var19[var22] >> 4;
                int var26 = var20[var22] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var27 = class71.field1375[var25];
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class71.field1375[var26];
                var10[var15++] = (var24 << 16) + (var28 << 8) + var27;
                if (arg1) {
                    var15 += arg6 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field3353.length; var29++) {
            this.field3353[var29].method454(arg4 ^ 0x5D2C);
        }
        return var10;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V", line = 482)
    public class193() {
        this.field3339 = new int[0];
        this.field3356 = new int[0];
        this.field3352 = new class211();
        this.field3352.field3170 = 1;
        this.field3340 = new class211();
        this.field3353 = new class183[] { this.field3352, this.field3340 };
        this.field3340.field3170 = 1;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lkh;)V", line = 495)
    public class193(class14 arg0) {
        int var2 = arg0.method93(false);
        this.field3353 = new class183[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class183 var7 = class294.method2041(arg0, true);
            if (var7.method988((byte) 59) >= 0) {
                var3++;
            }
            if (var7.method451(-1) >= 0) {
                var4++;
            }
            int var8 = var7.field3180.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method93(false);
            }
            this.field3353[var6] = var7;
        }
        this.field3339 = new int[var4];
        int var10 = 0;
        this.field3356 = new int[var3];
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class183 var13 = this.field3353[var12];
            int var14 = var13.field3180.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field3180[var15] = this.field3353[var5[var12][var15]];
            }
            int var16 = var13.method988((byte) 70);
            int var17 = var13.method451(-1);
            if (var16 > 0) {
                this.field3356[var11++] = var16;
            }
            if (var17 > 0) {
                this.field3339[var10++] = var17;
            }
            var5[var12] = null;
        }
        this.field3352 = this.field3353[arg0.method93(false)];
        int[][] var18 = (int[][]) null;
        this.field3340 = this.field3353[arg0.method93(false)];
    }
}
