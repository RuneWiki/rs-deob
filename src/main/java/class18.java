import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class18 {

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "[I")
    private int[] field301;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "[I")
    private int[] field300;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Lfc;")
    private class51 field309;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "Lfc;")
    private class51 field313;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "[Lfc;")
    private class51[] field299;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field298 = 0;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "[I")
    public static int[] field303 = new int[4000];

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field304 = 0;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "Led;")
    public static class43 field306 = class191.method1219("<col=ffff00>", false);

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "Led;")
    public static class43 field314 = class191.method1219("title)3jpg", false);

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Z")
    public static boolean field307 = false;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "Led;")
    public static class43 field311 = class191.method1219("<col=ffffff>", false);

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "Led;")
    public static class43 field308 = class191.method1219("p11_full", false);

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLai;Lga;)Z")
    public final boolean method85(boolean arg0, class10 arg1, class58 arg2) {
        field312++;
        for (int var4 = 0; var4 < this.field300.length; var4++) {
            if (!arg2.method352(this.field300[var4], 0)) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field301.length; var5++) {
            if (!arg1.method14(-9926, this.field301[var5])) {
                return false;
            }
        }
        return arg0 ? true : true;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)I")
    public static final int method86(int arg0, int arg1, int arg2) {
        field302++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg1 != 15753) {
            return 98;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lga;BII)[Lnb;")
    public static final class120[] method87(class58 arg0, byte arg1, int arg2, int arg3) {
        field310++;
        int var4 = -97 % ((-arg1 - 46) / 60);
        return class184.method1185(arg2, arg3, 117, arg0) ? class17.method80(-125) : null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([Lqh;III[BIBIII)V")
    public static final void method88(class153[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field305++;
        if (arg6 >= -114) {
            field298 = 70;
        }
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg7 + var10 > 0 && arg7 + var10 < 103 && arg9 + var15 > 0 && arg9 + var15 < 103) {
                    arg0[arg5].field3094[arg7 + var10][arg9 + var15] = class7.method38(arg0[arg5].field3094[arg7 + var10][arg9 + var15], -16777217);
                }
            }
        }
        class89 var11 = new class89(arg4);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg1 == var12 && arg2 <= var13 && var13 < arg2 + 8 && var14 >= arg3 && var14 < arg3 + 8) {
                        class128.method827(arg9 + class90.method584(var13 & 0x7, arg8, var14 & 0x7, (byte) -120), var11, 1, arg8, 0, 0, arg7 + class79.method484(var13 & 0x7, var14 & 0x7, true, arg8), arg5);
                    } else {
                        class128.method827(-1, var11, 1, 0, 0, 0, -1, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method89(int arg0) {
        field308 = null;
        if (arg0 == 64) {
            field314 = null;
            field306 = null;
            field311 = null;
            field303 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILga;ILai;ZDB)[I")
    public final int[] method90(int arg0, class58 arg1, int arg2, class10 arg3, boolean arg4, double arg5, byte arg6) {
        class150.field3034 = arg3;
        field315++;
        int var9 = -10 / ((arg6 + 40) / 53);
        class191.field3724 = arg1;
        class61.method386(-124, arg0, arg2);
        int[] var10 = new int[arg0 * arg2];
        for (int var11 = 0; var11 < this.field299.length; var11++) {
            this.field299[var11].method312(-4503, arg2, arg0);
        }
        int var12;
        int var13;
        byte var14;
        if (arg4) {
            var12 = arg2 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var13 = arg2;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg0; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field309.field1029) {
                int[] var22 = this.field309.method27(16, var16);
                var20 = var22;
                var21 = var22;
                var19 = var22;
            } else {
                int[][] var18 = this.field309.method99(var16, (byte) -94);
                var19 = var18[0];
                var20 = var18[2];
                var21 = var18[1];
            }
            for (int var23 = var12; var23 != var13; var23 += var14) {
                double var24 = Math.pow((double) var19[var23] / 4096.0D, arg5);
                double var26 = Math.pow((double) var21[var23] / 4096.0D, arg5);
                double var28 = Math.pow((double) var20[var23] / 4096.0D, arg5);
                int var30 = (int) (var24 * 256.0D);
                if (var30 > 255) {
                    var30 = 255;
                }
                int var31 = (int) (var26 * 256.0D);
                if (var30 < 0) {
                    var30 = 0;
                }
                if (var31 > 255) {
                    var31 = 255;
                }
                if (var31 < 0) {
                    var31 = 0;
                }
                int var32 = (int) (var28 * 256.0D);
                if (var32 > 255) {
                    var32 = 255;
                }
                if (var32 < 0) {
                    var32 = 0;
                }
                var10[var15++] = (var30 << 16) + (var31 << 8) + var32;
            }
        }
        for (int var17 = 0; var17 < this.field299.length; var17++) {
            this.field299[var17].method313((byte) 104);
        }
        return var10;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
    public class18() {
        this.field301 = new int[0];
        this.field300 = new int[0];
        this.field309 = new class78();
        this.field313 = new class78();
        this.field299 = new class51[] { this.field309, this.field313 };
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Ljg;)V")
    public class18(class89 arg0) {
        int var2 = arg0.method538((byte) 84);
        int[][] var3 = new int[var2][];
        class17 var4 = new class17(64);
        class17 var5 = new class17(64);
        class17 var6 = new class17(64);
        this.field299 = new class51[var2];
        for (int var7 = 0; var7 < var2; var7++) {
            class51 var21 = class95.method604(arg0, (byte) -49);
            int var22 = var21.method307(true);
            int var23 = var21.method309((byte) 94);
            if (var22 >= 0 && var22 >= 0 && var5.method75((long) var22, -121) == null) {
                var5.method82(-126, new class30(var22), (long) var22);
            }
            if (var23 >= 0 && var23 >= 0 && var6.method75((long) var23, 123) == null) {
                var6.method82(-110, new class30(var23), (long) var23);
            }
            int var26 = var21.field1039.length;
            var3[var7] = new int[var26];
            for (int var27 = 0; var27 < var26; var27++) {
                var3[var7][var27] = arg0.method538((byte) -41);
            }
            var4.method82(96, var21, (long) var21.field1038);
            this.field299[var7] = var21;
        }
        for (int var8 = 0; var8 < var2; var8++) {
            class51 var17 = this.field299[var8];
            int var18 = var17.field1039.length;
            for (int var19 = 0; var19 < var18; var19++) {
                class51 var20 = (class51) var4.method75((long) var3[var8][var19], 14);
                var17.field1039[var19] = var20;
            }
            var3[var8] = null;
        }
        this.field309 = (class51) var4.method75((long) arg0.method538((byte) 94), 11);
        this.field313 = (class51) var4.method75((long) arg0.method538((byte) 107), -90);
        this.field300 = new int[var5.method83(-30118)];
        this.field301 = new int[var6.method83(-30118)];
        Object var9 = null;
        Object var10 = null;
        class67[] var11 = new class67[var5.method83(-30118)];
        class67[] var12 = new class67[var6.method83(-30118)];
        var5.method78((byte) 118, var11);
        Object var13 = null;
        var6.method78((byte) 89, var12);
        Object var14 = null;
        for (int var15 = 0; var15 < var11.length; var15++) {
            this.field300[var15] = ((class30) var11[var15]).field564;
        }
        for (int var16 = 0; var16 < var12.length; var16++) {
            this.field301[var16] = ((class30) var12[var16]).field564;
        }
    }
}
