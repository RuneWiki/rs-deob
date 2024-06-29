import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class198 extends class1 {

    @OriginalMember(owner = "client!wh", name = "U", descriptor = "[I")
    private int[] field3017;

    @OriginalMember(owner = "client!wh", name = "T", descriptor = "[I")
    private int[] field3016;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "Ltg;")
    private class185 field3004;

    @OriginalMember(owner = "client!wh", name = "S", descriptor = "Ltg;")
    private class185 field3015;

    @OriginalMember(owner = "client!wh", name = "X", descriptor = "Ltg;")
    private class185 field3020;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "[Ltg;")
    private class185[] field3006;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "[C")
    public static char[] field3003 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "Ljava/lang/String;")
    public static String field3007 = "Cancel";

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!wh", name = "V", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!wh", name = "W", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "Lpf;")
    public static class294 field3009;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "[[B")
    public static byte[][] field3011;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V")
    public static final void method1238(int arg0, int arg1, int arg2) {
        field3008++;
        class146.field2137 = class79.field1274 + class99.field1564 - (arg1 - arg2);
        class61.field973 = arg0 - class119.field1798;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZIDILpf;Lvf;Z)[I")
    public final int[] method1239(int arg0, boolean arg1, int arg2, double arg3, int arg4, class294 arg5, class104 arg6, boolean arg7) {
        int[] var10 = new int[arg2 * arg4];
        field3018++;
        class49.method328(arg3, 92);
        class110.field1711 = arg6;
        if (arg0 != -12746) {
            this.method1241(-96, (class294) null, 58, -1.3265145418812523D, true, 18, (class104) null);
        }
        class176.field2690 = arg5;
        class163.method1009(arg4, (byte) -114, arg2);
        for (int var11 = 0; var11 < this.field3006.length; var11++) {
            this.field3006[var11].method1147(arg2, (byte) -102, arg4);
        }
        int var12 = 0;
        int var13;
        byte var14;
        int var15;
        if (arg1) {
            var13 = -1;
            var14 = -1;
            var15 = arg4 - 1;
        } else {
            var13 = arg4;
            var14 = 1;
            var15 = 0;
        }
        for (int var16 = 0; var16 < arg2; var16++) {
            if (arg7) {
                var12 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field3015.field2814) {
                int[] var22 = this.field3015.method34(var16, 109);
                var21 = var22;
                var20 = var22;
                var19 = var22;
            } else {
                int[][] var18 = this.field3015.method39(true, var16);
                var19 = var18[1];
                var20 = var18[0];
                var21 = var18[2];
            }
            for (int var23 = var15; var23 != var13; var23 += var14) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = var20[var23] >> 4;
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                int var27 = class151.field2192[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class151.field2192[var26];
                int var29 = class151.field2192[var25];
                var10[var12++] = (var27 << 8) + (var29 << 16) + var28;
                if (arg7) {
                    var12 += arg4 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field3006.length; var17++) {
            this.field3006[var17].method162((byte) 80);
        }
        return var10;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "()V")
    public static final void method1240() {
        for (int var0 = 0; var0 < class97.field1525; var0++) {
            class2 var1 = class173.field2627[var0];
            class126.method794(var1);
            class173.field2627[var0] = null;
        }
        class97.field1525 = 0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILpf;IDZILvf;)Lmc;")
    public final class201 method1241(int arg0, class294 arg1, int arg2, double arg3, boolean arg4, int arg5, class104 arg6) {
        class49.method328(arg3, 99);
        class110.field1711 = arg6;
        class176.field2690 = arg1;
        field3013++;
        class163.method1009(arg0, (byte) 117, arg2);
        class201 var9 = new class201(arg0, arg2);
        for (int var10 = 0; var10 < this.field3006.length; var10++) {
            this.field3006[var10].method1147(arg2, (byte) -120, arg0);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg2; var12++) {
            if (arg4) {
                var11 = var12;
            }
            int[] var16;
            int[] var17;
            int[] var18;
            if (this.field3015.field2814) {
                int[] var15 = this.field3015.method34(var12, 98);
                var16 = var15;
                var17 = var15;
                var18 = var15;
            } else {
                int[][] var19 = this.field3015.method39(true, var12);
                var18 = var19[2];
                var16 = var19[0];
                var17 = var19[1];
            }
            for (int var20 = 0; var20 != arg0; var20++) {
                int var21 = var16[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                int var22 = var17[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                int var23 = var18[var20] >> 4;
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class151.field2192[var21];
                if (var22 < 0) {
                    var22 = 0;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class151.field2192[var23];
                int var26 = class151.field2192[var22];
                var9.field3047[var11++] = (var24 << 16) + (var26 << 8) + var25;
                if (arg4) {
                    var11 += arg0 - 1;
                }
            }
        }
        int var13 = 34 % ((arg5 - 48) / 35);
        for (int var14 = 0; var14 < this.field3006.length; var14++) {
            this.field3006[var14].method162((byte) 80);
        }
        return var9;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BIIIZIIIII)V")
    public static final void method1242(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3014++;
        if (arg0 > -24) {
            method1244(72, 20, 49);
        }
        int var10 = arg5 - arg2;
        int var11 = (arg9 - arg3 << 16) / var10;
        int var12 = arg8 - arg7;
        int var13 = (arg6 - arg1 << 16) / var12;
        class27.method166(arg8, arg2, arg5, arg1, var11, arg7, arg4, 0, 0, var13, arg3, (byte) 54);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lvf;Lpf;B)Z")
    public final boolean method1243(class104 arg0, class294 arg1, byte arg2) {
        field3019++;
        if (class80.field1290 <= 0) {
            for (int var4 = 0; var4 < this.field3017.length; var4++) {
                if (!arg1.method1960(this.field3017[var4], (byte) 123)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3017.length; var5++) {
                if (!arg1.method1969(class80.field1290, -121, this.field3017[var5])) {
                    return false;
                }
            }
        }
        int var6 = -52 % ((53 - arg2) / 54);
        for (int var7 = 0; var7 < this.field3016.length; var7++) {
            if (!arg0.method663(this.field3016[var7], (byte) -75)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(III)V")
    public static final void method1244(int arg0, int arg1, int arg2) {
        if (arg1 > 24) {
            field3005++;
            class187 var3 = class120.method762((byte) -104, 6, arg0);
            var3.method1167(-117);
            var3.field2844 = arg2;
        }
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(B)V")
    public static void method1245(byte arg0) {
        field3011 = null;
        field3009 = null;
        field3007 = null;
        if (arg0 > 17) {
            field3003 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lvf;IILpf;ZDI)Lwk;")
    public final class279 method1246(class104 arg0, int arg1, int arg2, class294 arg3, boolean arg4, double arg5, int arg6) {
        class49.method328(arg5, 104);
        field3010++;
        class176.field2690 = arg3;
        class110.field1711 = arg0;
        class163.method1009(arg2, (byte) 127, arg6);
        class279 var9 = new class279(arg2, arg6);
        for (int var10 = 0; var10 < this.field3006.length; var10++) {
            this.field3006[var10].method1147(arg6, (byte) -113, arg2);
        }
        if (arg1 > -117) {
            field3003 = null;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg6; var12++) {
            if (arg4) {
                var11 = var12 << 2;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field3015.field2814) {
                int[] var14 = this.field3015.method34(var12, 82);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field3015.method39(true, var12);
                var15 = var18[0];
                var17 = var18[1];
                var16 = var18[2];
            }
            int[] var19;
            if (this.field3020.field2814) {
                var19 = this.field3020.method34(var12, 99);
            } else {
                var19 = this.field3020.method39(true, var12)[0];
            }
            for (int var20 = arg2 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                int var22 = var17[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                int var23 = var16[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var24 = class151.field2192[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                if (var22 > 255) {
                    var22 = 255;
                }
                int var25 = class151.field2192[var23];
                if (var22 < 0) {
                    var22 = 0;
                }
                int var26 = class151.field2192[var22];
                int var27;
                if (var24 == 0 && var26 == 0 && var25 == 0) {
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
                var9.field3047[var11++] = (var26 << 8) + ((var27 << 24) + (var24 << 16)) + var25;
                if (arg4) {
                    var11 += (arg2 << 2) - 4;
                }
            }
        }
        for (int var13 = 0; var13 < this.field3006.length; var13++) {
            this.field3006[var13].method162((byte) 80);
        }
        return var9;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
    public class198() {
        this.field3017 = new int[0];
        this.field3016 = new int[0];
        this.field3004 = new class24(0);
        this.field3004.field2806 = 1;
        this.field3015 = new class24();
        this.field3015.field2806 = 1;
        this.field3020 = new class24();
        this.field3006 = new class185[] { this.field3015, this.field3020, this.field3004 };
        this.field3020.field2806 = 1;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lfl;)V")
    public class198(class248 arg0) {
        int var2 = arg0.method1593((byte) 27);
        this.field3006 = new class185[var2];
        int var3 = 0;
        int[][] var4 = new int[var2][];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class185 var16 = class187.method1161(-5285, arg0);
            if (var16.method1148(0) >= 0) {
                var3++;
            }
            if (var16.method160(122) >= 0) {
                var5++;
            }
            int var17 = var16.field2812.length;
            var4[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var4[var6][var18] = arg0.method1593((byte) 27);
            }
            this.field3006[var6] = var16;
        }
        this.field3017 = new int[var3];
        int var7 = 0;
        this.field3016 = new int[var5];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class185 var11 = this.field3006[var9];
            int var12 = var11.field2812.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field2812[var13] = this.field3006[var4[var9][var13]];
            }
            int var14 = var11.method1148(0);
            int var15 = var11.method160(123);
            if (var14 > 0) {
                this.field3017[var7++] = var14;
            }
            if (var15 > 0) {
                this.field3016[var8++] = var15;
            }
            var4[var9] = null;
        }
        this.field3015 = this.field3006[arg0.method1593((byte) 27)];
        Object var10 = null;
        this.field3020 = this.field3006[arg0.method1593((byte) 27)];
        this.field3004 = this.field3006[arg0.method1593((byte) 27)];
    }
}
