import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class40 extends class59 {

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "[I")
    private int[] field496;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "[I")
    private int[] field493;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "Lnb;")
    private class300 field488;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "Lnb;")
    private class300 field490;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "Lnb;")
    private class300 field491;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "[Lnb;")
    private class300[] field482;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "Z")
    public static boolean field479 = false;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public static int field480 = 0;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "[I")
    public static int[] field485;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lsd;IDZIILvl;)Le;")
    public final class149 method225(class26 arg0, int arg1, double arg2, boolean arg3, int arg4, int arg5, class73 arg6) {
        field486++;
        method234((byte) -76, arg2);
        class305.field4847 = arg6;
        class230.field3560 = arg0;
        class139.method876(arg4, true, arg1);
        class149 var9 = new class149(arg1, arg4);
        if (arg5 > -99) {
            return null;
        }
        for (int var10 = 0; var10 < this.field482.length; var10++) {
            this.field482[var10].method2022(arg1, (byte) 124, arg4);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg4; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field490.field4784) {
                int[] var14 = this.field490.method99(var12, -957953300);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field490.method36(50, var12);
                var17 = var18[0];
                var16 = var18[2];
                var15 = var18[1];
            }
            if (arg3) {
                var11 = var12 << 2;
            }
            int[] var19;
            if (this.field491.field4784) {
                var19 = this.field491.method99(var12, -957953300);
            } else {
                var19 = this.field491.method36(54, var12)[0];
            }
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                int var22 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                int var23 = var15[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = class158.field2356[var22];
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var25 = class158.field2356[var21];
                int var26 = class158.field2356[var23];
                int var27;
                if (var25 == 0 && var26 == 0 && var24 == 0) {
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
                var9.field602[var11++] = (var27 << 24) - (-(var25 << 16) - ((var26 << 8) + var24));
                if (arg3) {
                    var11 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var13 = 0; var13 < this.field482.length; var13++) {
            this.field482[var13].method405((byte) 67);
        }
        return var9;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method226(String arg0, int arg1) {
        if (arg1 != 0) {
            field485 = null;
        }
        field487++;
        String var2 = class23.method124(class176.method1256((byte) 127, arg0), false);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILsd;Lvl;IDIZ)Lff;")
    public final class48 method227(int arg0, class26 arg1, class73 arg2, int arg3, double arg4, int arg5, boolean arg6) {
        method234((byte) -100, arg4);
        field489++;
        class230.field3560 = arg1;
        if (arg0 != 7015) {
            return null;
        }
        class305.field4847 = arg2;
        class139.method876(arg5, true, arg3);
        class48 var9 = new class48(arg3, arg5);
        for (int var10 = 0; var10 < this.field482.length; var10++) {
            this.field482[var10].method2022(arg3, (byte) 28, arg5);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            if (arg6) {
                var11 = var12;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field490.field4784) {
                int[] var14 = this.field490.method99(var12, -957953300);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field490.method36(-67, var12);
                var16 = var18[1];
                var17 = var18[2];
                var15 = var18[0];
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
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
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var17[var19] >> 4;
                int var23 = class158.field2356[var20];
                int var24 = class158.field2356[var21];
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var25 = class158.field2356[var22];
                var9.field602[var11++] = (var23 << 16) + (var24 << 8) + var25;
                if (arg6) {
                    var11 += arg3 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field482.length; var13++) {
            this.field482[var13].method405((byte) 67);
        }
        return var9;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method228(boolean arg0, String arg1, int arg2) {
        field495++;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        int var7 = var6 + (arg0 ? class261.field4245 : class80.field1219);
        for (int var8 = var6; var8 < var7; var8++) {
            class71 var12 = class218.method1526(var8, false);
            if (var12.field1036 && var12.method470((byte) 83).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class28.field340 = null;
                    class312.field4998 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var13 = new short[var4.length * 2];
                    for (int var14 = 0; var14 < var5; var14++) {
                        var13[var14] = var4[var14];
                    }
                    var4 = var13;
                }
                var4[var5++] = (short) var8;
            }
        }
        int var9 = -105 % ((arg2 - 60) / 32);
        class312.field4998 = var5;
        class28.field340 = var4;
        String[] var10 = new String[class312.field4998];
        class3.field42 = 0;
        for (int var11 = 0; var11 < class312.field4998; var11++) {
            var10[var11] = class218.method1526(var4[var11], false).method470((byte) 81);
        }
        class220.method1550(true, class28.field340, var10);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILki;)Z")
    public static final boolean method229(int arg0, class152 arg1) {
        field484++;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field2266) {
            return false;
        } else if (!arg1.method1051(-8963)) {
            return false;
        } else if (class264.field4288.method1064(-1, (long) arg1.field2236) == null) {
            int var2 = -20 / ((12 - arg0) / 32);
            return class146.field2184.method1064(-1, (long) arg1.field2262) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lvl;ILsd;)Z")
    public final boolean method230(class73 arg0, int arg1, class26 arg2) {
        field492++;
        if (arg1 < class61.field887) {
            for (int var4 = 0; var4 < this.field493.length; var4++) {
                if (!arg0.method487(false, class61.field887, this.field493[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field493.length; var5++) {
                if (!arg0.method509(27635, this.field493[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field496.length; var6++) {
            if (!arg2.method134(this.field496[var6], 1)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIILsc;Lsc;IIJ)V")
    public static final void method231(int arg0, int arg1, int arg2, int arg3, class248 arg4, class248 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class263 var10 = new class263();
        var10.field4270 = arg8;
        var10.field4283 = arg1 * 128 + 64;
        var10.field4280 = arg2 * 128 + 64;
        var10.field4274 = arg3;
        var10.field4281 = arg4;
        var10.field4275 = arg5;
        var10.field4276 = arg6;
        var10.field4278 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class184.field2892[var11][arg1][arg2] == null) {
                class184.field2892[var11][arg1][arg2] = new class113(var11, arg1, arg2);
            }
        }
        class184.field2892[arg0][arg1][arg2].field1640 = var10;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lsd;ZLvl;IZIDZ)[I")
    public final int[] method232(class26 arg0, boolean arg1, class73 arg2, int arg3, boolean arg4, int arg5, double arg6, boolean arg7) {
        field481++;
        method234((byte) -71, arg6);
        if (arg7) {
            this.field491 = null;
        }
        class230.field3560 = arg0;
        class305.field4847 = arg2;
        int[] var10 = new int[arg3 * arg5];
        class139.method876(arg3, !arg7, arg5);
        for (int var11 = 0; var11 < this.field482.length; var11++) {
            this.field482[var11].method2022(arg5, (byte) 45, arg3);
        }
        int var12;
        int var13;
        byte var14;
        if (arg4) {
            var14 = -1;
            var13 = arg5 - 1;
            var12 = -1;
        } else {
            var12 = arg5;
            var13 = 0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg3; var16++) {
            if (arg1) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field490.field4784) {
                int[] var18 = this.field490.method99(var16, -957953300);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field490.method36(61, var16);
                var20 = var22[2];
                var19 = var22[1];
                var21 = var22[0];
            }
            for (int var23 = var13; var23 != var12; var23 += var14) {
                int var24 = var21[var23] >> 4;
                int var25 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = class158.field2356[var25];
                int var27 = var20[var23] >> 4;
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var28 = class158.field2356[var24];
                if (var27 < 0) {
                    var27 = 0;
                }
                int var29 = class158.field2356[var27];
                var10[var15++] = (var26 << 8) + (var28 << 16) + var29;
                if (arg1) {
                    var15 += arg5 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field482.length; var17++) {
            this.field482[var17].method405((byte) 67);
        }
        return var10;
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
    public static void method233(int arg0) {
        if (arg0 >= -34) {
            field480 = 72;
        }
        field485 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BD)V")
    private static final void method234(byte arg0, double arg1) {
        field494++;
        if (arg0 >= -70) {
            field479 = true;
        }
        if (class164.field2539 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
            class158.field2356[var3] = var4 > 255 ? 255 : var4;
        }
        class164.field2539 = arg1;
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(B)V")
    public static final void method235(byte arg0) {
        field483++;
        int var1 = class152.field2272;
        int var2 = class152.field2274;
        int var3 = class278.field4556 - (class126.field1814 + var2);
        int var4 = class14.field210 - class112.field1626 - var1;
        if (arg0 != 24) {
            field479 = true;
        }
        if (var1 <= 0 && var4 <= 0 && var2 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class123.field1771 != null) {
                var5 = class123.field1771;
            } else if (class73.field1086 == null) {
                var5 = class95.field1425.field3832;
            } else {
                var5 = class73.field1086;
            }
            int var6 = 0;
            int var7 = 0;
            if (class73.field1086 == var5) {
                Insets var8 = class73.field1086.getInsets();
                var7 = var8.left;
                var6 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var7, var6, var1, class278.field4556);
            }
            if (var2 > 0) {
                var9.fillRect(var7, var6, class14.field210, var2);
            }
            if (var4 > 0) {
                var9.fillRect(class14.field210 + var7 - var4, var6, var4, class278.field4556);
            }
            if (var3 > 0) {
                var9.fillRect(var7, var6 + class278.field4556 - var3, class14.field210, var3);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    public class40() {
        this.field496 = new int[0];
        this.field493 = new int[0];
        this.field488 = new class262(0);
        this.field488.field4785 = 1;
        this.field490 = new class262();
        this.field490.field4785 = 1;
        this.field491 = new class262();
        this.field482 = new class300[] { this.field490, this.field491, this.field488 };
        this.field491.field4785 = 1;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lim;)V")
    public class40(class170 arg0) {
        int var2 = arg0.method1218(122);
        this.field482 = new class300[var2];
        int var3 = 0;
        int[][] var4 = new int[var2][];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class300 var16 = class199.method1384((byte) -112, arg0);
            if (var16.method406((byte) -62) >= 0) {
                var3++;
            }
            if (var16.method1864(-117) >= 0) {
                var5++;
            }
            int var17 = var16.field4792.length;
            var4[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var4[var6][var18] = arg0.method1218(95);
            }
            this.field482[var6] = var16;
        }
        this.field493 = new int[var3];
        int var7 = 0;
        this.field496 = new int[var5];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class300 var11 = this.field482[var9];
            int var12 = var11.field4792.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4792[var13] = this.field482[var4[var9][var13]];
            }
            int var14 = var11.method406((byte) -57);
            int var15 = var11.method1864(-19);
            if (var14 > 0) {
                this.field493[var7++] = var14;
            }
            if (var15 > 0) {
                this.field496[var8++] = var15;
            }
            var4[var9] = null;
        }
        Object var10 = null;
        this.field490 = this.field482[arg0.method1218(68)];
        this.field491 = this.field482[arg0.method1218(-63)];
        this.field488 = this.field482[arg0.method1218(76)];
    }
}
