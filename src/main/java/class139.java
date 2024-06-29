import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class139 {

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "[I")
    private int[] field2353;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "[I")
    private int[] field2358;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "Lni;")
    private class23 field2348;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "Lni;")
    private class23 field2359;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "[Lni;")
    private class23[] field2361;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "[I")
    public static int[] field2351 = new int[1000];

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Lqd;")
    public static class40 field2354 = class147.method1106("Lade Schrifts-=tze )2 ", (byte) -120);

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Lcm;")
    public static class185 field2346;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "[[B")
    public static byte[][] field2355;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIBIZZ)V", line = 5)
    public static final void method1026(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5, boolean arg6) {
        if (arg6) {
            class21.method166();
        }
        field2352++;
        if (class271.field4503 != null && (arg2 != 3 || class159.field2665 != arg1 || class182.field2961 != arg4)) {
            class194.method1382(class275.field4573, class271.field4503, (byte) -102);
            class271.field4503 = null;
        }
        if (arg2 == 3 && class271.field4503 == null) {
            class271.field4503 = class218.method1534(arg4, false, class275.field4573, 0, arg1, 0);
            if (class271.field4503 != null) {
                class159.field2665 = arg1;
                class182.field2961 = arg4;
                class94.method714(1, class275.field4573);
            }
        }
        if (arg2 == 3 && class271.field4503 == null) {
            method1026(arg0, -1, class204.field3230, (byte) 67, -1, true, true);
            return;
        }
        int var7 = -73 / ((1 - arg3) / 47);
        Container var8;
        if (class271.field4503 != null) {
            var8 = class271.field4503;
        } else if (class106.field1867 == null) {
            var8 = class275.field4573.field1876;
        } else {
            var8 = class106.field1867;
        }
        class59.field1139 = var8.getSize().width;
        class182.field2955 = var8.getSize().height;
        if (class106.field1867 == var8) {
            Insets var9 = class106.field1867.getInsets();
            class59.field1139 -= var9.right + var9.left;
            class182.field2955 -= var9.top + var9.bottom;
        }
        if (arg2 >= 2) {
            class112.field1945 = class59.field1139;
            class33.field663 = 0;
            class110.field1921 = 0;
            class73.field1287 = class182.field2955;
        } else {
            class33.field663 = 0;
            class73.field1287 = 503;
            class110.field1921 = (class59.field1139 - 765) / 2;
            class112.field1945 = 765;
        }
        if (arg5) {
            class232.method1608(class213.field3470, 660);
            class92.method704((byte) -53, class213.field3470);
            if (class119.field2015 != null) {
                class119.field2015.method309(-7257, class213.field3470);
            }
            class312.field5265.method2183(true);
            class55.method470(class213.field3470, 109);
            class101.method765(class213.field3470, (byte) 52);
            if (class119.field2015 != null) {
                class119.field2015.method313(0, class213.field3470);
            }
        } else {
            if (class21.field350) {
                class21.method162(class112.field1945, class73.field1287);
            }
            class213.field3470.setSize(class112.field1945, class73.field1287);
            if (class106.field1867 == var8) {
                Insets var10 = class106.field1867.getInsets();
                class213.field3470.setLocation(class110.field1921 + var10.left, var10.top - -class33.field663);
            } else {
                class213.field3470.setLocation(class110.field1921, class33.field663);
            }
        }
        if (arg2 == 0 && arg0 > 0) {
            class21.method145(class213.field3470);
        }
        if (arg6 && arg2 > 0) {
            class213.field3470.setIgnoreRepaint(true);
            if (!class174.field2830) {
                class312.method2157();
                class237.field3903 = null;
                class237.field3903 = class48.method428(class213.field3470, class112.field1945, 109, class73.field1287);
                class115.method864();
                if (class6.field87 == 5) {
                    class41.method380(class230.field3789, true, 17302);
                } else {
                    class28.method269((byte) -105, class128.field2210, false);
                }
                try {
                    Graphics var11 = class213.field3470.getGraphics();
                    class237.field3903.method548(0, 0, 0, var11);
                } catch (Exception var15) {
                }
                class146.method1103(0);
                if (arg0 == 0) {
                    class237.field3903 = class48.method428(class213.field3470, 765, 16, 503);
                } else {
                    class237.field3903 = null;
                }
                class70 var13 = class275.field4573.method816(-87, class312.field5265.getClass());
                while (var13.field1258 == 0) {
                    class160.method1227(100L, false);
                }
                if (var13.field1258 == 1) {
                    class174.field2830 = true;
                }
            }
            if (class174.field2830) {
                class21.method153(class213.field3470, class104.field1848 * 2);
            }
        }
        if (!class21.field350 && arg2 > 0) {
            method1026(arg0, -1, 0, (byte) -94, -1, true, true);
            return;
        }
        if (arg2 > 0 && arg0 == 0) {
            class8.field112.setPriority(5);
            class237.field3903 = null;
            class175.method1286();
            ((class212) class203.field3217).method1493((byte) 87, 200);
            if (class1.field8) {
                class203.method1422(0.7F);
            }
        } else if (arg2 == 0 && arg0 > 0) {
            class8.field112.setPriority(1);
            class237.field3903 = class48.method428(class213.field3470, 765, 20, 503);
            class175.method1291();
            ((class212) class203.field3217).method1493((byte) 87, 20);
            if (class1.field8) {
                if (class162.field2692 == 1) {
                    class203.method1422(0.9F);
                }
                if (class162.field2692 == 2) {
                    class203.method1422(0.8F);
                }
                if (class162.field2692 == 3) {
                    class203.method1422(0.7F);
                }
                if (class162.field2692 == 4) {
                    class203.method1422(0.6F);
                }
            }
            class47.method421();
        }
        class62.field1176 = !class118.method893(2);
        if (arg6) {
            class106.method793(-102);
        }
        if (arg2 >= 2) {
            class225.field3712 = true;
        } else {
            class225.field3712 = false;
        }
        if (class148.field2499 != -1) {
            class248.method1754(true, (byte) 74);
        }
        if (class140.field2369 != null && (class6.field87 == 30 || class6.field87 == 25)) {
            class271.method1873(true);
        }
        for (int var14 = 0; var14 < 100; var14++) {
            class229.field3778[var14] = true;
        }
        class280.field4714 = true;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IDZZILce;ILij;)[I", line = 240)
    public final int[] method1027(int arg0, double arg1, boolean arg2, boolean arg3, int arg4, class239 arg5, int arg6, class77 arg7) {
        class146.method1104(arg1, false);
        class297.field4956 = arg5;
        class43.field824 = arg7;
        field2362++;
        int[] var10 = new int[arg4 * arg6];
        class57.method480(false, arg6, arg4);
        for (int var11 = 0; var11 < this.field2361.length; var11++) {
            this.field2361[var11].method175(arg4, (byte) 88, arg6);
        }
        byte var12;
        int var13;
        int var14;
        if (arg3) {
            var14 = arg4 - 1;
            var12 = -1;
            var13 = -1;
        } else {
            var12 = 1;
            var13 = arg4;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            if (arg2) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field2348.field415) {
                int[] var21 = this.field2348.method32((byte) -94, var16);
                var20 = var21;
                var19 = var21;
                var18 = var21;
            } else {
                int[][] var17 = this.field2348.method17(95, var16);
                var18 = var17[2];
                var19 = var17[1];
                var20 = var17[0];
            }
            for (int var22 = var14; var22 != var13; var22 += var12) {
                int var23 = var20[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = var19[var22] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = var18[var22] >> 4;
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                int var26 = class207.field3310[var24];
                int var27 = class207.field3310[var23];
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class207.field3310[var25];
                var10[var15++] = (var27 << 16) + (var26 << 8) + var28;
                if (arg2) {
                    var15 += arg4 - 1;
                }
            }
        }
        for (int var29 = arg0; var29 < this.field2361.length; var29++) {
            this.field2361[var29].method18(true);
        }
        return var10;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIII)V", line = 370)
    public static final void method1028(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2360++;
        if (arg1 != 2128) {
            return;
        }
        class177 var5 = class177.method1310(50, 10, arg2);
        var5.method1302(-20040);
        var5.field2907 = arg3;
        var5.field2902 = arg4;
        var5.field2908 = arg0;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lce;ILij;)Z", line = 387)
    public final boolean method1029(class239 arg0, int arg1, class77 arg2) {
        if (arg1 > -37) {
            this.method1027(-48, 0.05791451431916589D, false, true, 77, (class239) null, -100, (class77) null);
        }
        field2357++;
        if (class194.field3126 > 0) {
            for (int var4 = 0; var4 < this.field2353.length; var4++) {
                if (!arg0.method1657(class194.field3126, 0, this.field2353[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field2353.length; var5++) {
                if (!arg0.method1676(this.field2353[var5], -20034)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field2358.length; var6++) {
            if (!arg2.method576(1, this.field2358[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(DLij;IIILce;Z)[B", line = 445)
    public final byte[] method1030(double arg0, class77 arg1, int arg2, int arg3, int arg4, class239 arg5, boolean arg6) {
        class146.method1104(arg0, false);
        class43.field824 = arg1;
        field2350++;
        class297.field4956 = arg5;
        byte[] var9 = new byte[arg3 * 4 * arg2];
        class57.method480(false, arg3, arg2);
        for (int var10 = arg4; var10 < this.field2361.length; var10++) {
            this.field2361[var10].method175(arg2, (byte) 120, arg3);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            if (arg6) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field2348.field415) {
                int[] var17 = this.field2348.method32((byte) -94, var12);
                var14 = var17;
                var16 = var17;
                var15 = var17;
            } else {
                int[][] var13 = this.field2348.method17(arg4 ^ 0x51, var12);
                var14 = var13[0];
                var15 = var13[1];
                var16 = var13[2];
            }
            int[] var18;
            if (this.field2359.field415) {
                var18 = this.field2359.method32((byte) -94, var12);
            } else {
                var18 = this.field2359.method17(96, var12)[0];
            }
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = var14[var19] >> 4;
                int var21 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var22 = class207.field3310[var20];
                int var23 = var16[var19] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class207.field3310[var23];
                int var25 = class207.field3310[var21];
                int var26;
                if (var22 == 0 && var25 == 0 && var24 == 0) {
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
                var9[var11++] = (byte) var25;
                var9[var11++] = (byte) var24;
                var9[var11++] = (byte) var26;
                if (arg6) {
                    var11 += (arg2 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field2361.length; var27++) {
            this.field2361[var27].method18(true);
        }
        return var9;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III[B)I", line = 586)
    public static final int method1031(int arg0, int arg1, int arg2, byte[] arg3) {
        field2349++;
        int var4 = -1;
        for (int var5 = arg1; var5 < arg0; var5++) {
            var4 = var4 >>> 8 ^ class41.field783[(var4 ^ arg3[var5]) & 0xFF];
        }
        return var4 ^ arg2;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 609)
    public static final void method1032(int arg0) {
        field2347++;
        for (int var1 = arg0; var1 < class87.field1555; var1++) {
            int var2 = class301.field5048[var1];
            class258 var3 = class298.field4979[var2];
            int var4 = class95.field1715.method226(255);
            if ((var4 & 0x80) != 0) {
                var4 += class95.field1715.method226(255) << 8;
            }
            class160.method1230(-6867, var2, var4, var3);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V", line = 657)
    public static void method1033(byte arg0) {
        field2351 = null;
        field2355 = (byte[][]) null;
        field2354 = null;
        if (arg0 > -103) {
            field2356 = 31;
        }
        field2346 = null;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V", line = 674)
    public class139() {
        this.field2353 = new int[0];
        this.field2358 = new int[0];
        this.field2348 = new class15();
        this.field2348.field407 = 1;
        this.field2359 = new class15();
        this.field2361 = new class23[] { this.field2348, this.field2359 };
        this.field2359.field407 = 1;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lsd;)V", line = 688)
    public class139(class26 arg0) {
        int var2 = 0;
        int var3 = arg0.method226(255);
        this.field2361 = new class23[var3];
        int var4 = 0;
        int[][] var5 = new int[var3][];
        for (int var6 = 0; var6 < var3; var6++) {
            class23 var7 = class249.method1759(arg0, (byte) -119);
            if (var7.method19(-74) >= 0) {
                var2++;
            }
            if (var7.method170(-76) >= 0) {
                var4++;
            }
            int var8 = var7.field411.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method226(255);
            }
            this.field2361[var6] = var7;
        }
        this.field2353 = new int[var2];
        this.field2358 = new int[var4];
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < var3; var12++) {
            class23 var13 = this.field2361[var12];
            int var14 = var13.field411.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field411[var15] = this.field2361[var5[var12][var15]];
            }
            int var16 = var13.method19(-46);
            int var17 = var13.method170(-74);
            if (var16 > 0) {
                this.field2353[var11++] = var16;
            }
            if (var17 > 0) {
                this.field2358[var10++] = var17;
            }
            var5[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field2348 = this.field2361[arg0.method226(255)];
        this.field2359 = this.field2361[arg0.method226(255)];
    }
}
