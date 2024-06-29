import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class129 {

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "[I")
    private int[] field2549;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "[I")
    private int[] field2532;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "Lvf;")
    private class259 field2531;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "Lvf;")
    private class259 field2530;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "[Lvf;")
    private class259[] field2538;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "Lsg;")
    private static class30 field2539 = class167.method1221((byte) 33, "Opened title screen");

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "Lsg;")
    public static class30 field2540 = class167.method1221((byte) 33, "l");

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "Lsg;")
    private static class30 field2547 = class167.method1221((byte) 33, "Loaded world list data");

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "Lsg;")
    public static class30 field2542 = field2539;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "Lsg;")
    public static class30 field2545 = class167.method1221((byte) 33, "compass");

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "Lsg;")
    public static class30 field2536 = class167.method1221((byte) 33, "null");

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "Lsg;")
    private static class30 field2534 = class167.method1221((byte) 33, "Connecting to update server");

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "Lsg;")
    public static class30 field2544 = class167.method1221((byte) 33, "Angreifen");

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "Lsg;")
    private static class30 field2537 = class167.method1221((byte) 33, "Loading)3)3)3");

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "Lsg;")
    private static class30 field2551 = class167.method1221((byte) 33, "Take");

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "Lsg;")
    public static class30 field2552 = class167.method1221((byte) 33, "huffman");

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "Lsg;")
    public static class30 field2550 = field2537;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "Lsg;")
    public static class30 field2553 = field2547;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "Lsg;")
    public static class30 field2546 = field2551;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "Lsg;")
    public static class30 field2548 = field2534;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)Lbj;")
    public static final class44 method981(boolean arg0) {
        int var1 = class62.field1329[0] * class2.field33[0];
        field2543++;
        if (arg0) {
            method981(false);
        }
        byte[] var2 = class222.field3992[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class191.field3475[class68.method612(var2[var4], 255)];
        }
        class152 var5 = new class152(class190.field3464, class273.field4774, class142.field2752[0], class37.field895[0], class62.field1329[0], class2.field33[0], var3);
        class175.method1285((byte) 53);
        return var5;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lmc;ZLbk;)Z")
    public final boolean method982(class151 arg0, boolean arg1, class51 arg2) {
        field2533++;
        if (!arg1) {
            field2536 = null;
        }
        for (int var4 = 0; var4 < this.field2549.length; var4++) {
            if (!arg0.method1112(this.field2549[var4], (byte) 70)) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field2532.length; var5++) {
            if (!arg2.method508(-58, this.field2532[var5])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
    public static final void method983(byte arg0) {
        field2541++;
        boolean var1 = true;
        class47.method465((byte) -83, false);
        class200.field3576 = 0;
        for (int var2 = 0; var2 < class159.field2992.length; var2++) {
            if (client.field3799[var2] != -1 && class159.field2992[var2] == null) {
                class159.field2992[var2] = class178.field3298.method1115(0, (byte) -90, client.field3799[var2]);
                if (class159.field2992[var2] == null) {
                    class200.field3576++;
                    var1 = false;
                }
            }
            if (class215.field3938[var2] != -1 && class23.field431[var2] == null) {
                class23.field431[var2] = class178.field3298.method1118(-19758, 0, class215.field3938[var2], class132.field2597[var2]);
                if (class23.field431[var2] == null) {
                    var1 = false;
                    class200.field3576++;
                }
            }
            if (class71.field1590 != null && class44.field1041[var2] == null && class71.field1590[var2] != -1) {
                class44.field1041[var2] = class178.field3298.method1118(-19758, 0, class71.field1590[var2], class132.field2597[var2]);
                if (class44.field1041[var2] == null) {
                    class200.field3576++;
                    var1 = false;
                }
            }
        }
        if (class113.field2247 == null) {
            if (class126.field2459 == null || !class58.field1268.method1114(class160.method1188(new class30[] { class126.field2459.field3306, class231.field4119 }, 0), -105)) {
                class113.field2247 = new class190(0);
            } else if (class58.field1268.method1110(class160.method1188(new class30[] { class126.field2459.field3306, class231.field4119 }, 0), false)) {
                class113.field2247 = class180.method1311(class58.field1268, 77, class160.method1188(new class30[] { class126.field2459.field3306, class231.field4119 }, 0));
            } else {
                var1 = false;
                class200.field3576++;
            }
        }
        if (!var1) {
            class86.field1771 = 1;
            return;
        }
        class67.field1471 = 0;
        if (arg0 >= -63) {
            field2545 = null;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < class159.field2992.length; var4++) {
            byte[] var20 = class23.field431[var4];
            if (var20 != null) {
                int var21 = (class208.field3746[var4] >> 8) * 64 - class22.field421;
                int var22 = (class208.field3746[var4] & 0xFF) * 64 - class196.field3547;
                if (class71.field1604) {
                    var22 = 10;
                    var21 = 10;
                }
                var3 &= class63.method562(var20, var22, (byte) 76, var21);
            }
        }
        if (!var3) {
            class86.field1771 = 2;
            return;
        }
        if (class86.field1771 != 0) {
            class63.method566(true, class160.method1188(new class30[] { class242.field4335, class261.field4615 }, 0), -125);
        }
        class67.method603((byte) -59);
        class211.method1506(true);
        boolean var5 = false;
        class271.method1856(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class100.field2032[var6].method120(110);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class272.field4771[var7][var18][var19] = 0;
                }
            }
        }
        class166.method1219(100000, false);
        class67.method603((byte) -59);
        System.gc();
        class47.method465((byte) -80, true);
        class125.method940(false, 104);
        if (!class71.field1604) {
            class167.method1223(false, 124);
            class47.method465((byte) -101, true);
            class211.method1503(false, -8900);
            if (class44.field1041 != null) {
                class102.method824((byte) -46);
            }
        }
        if (class71.field1604) {
            class59.method546(false, -124);
            class47.method465((byte) -86, true);
            class149.method1084(false, -14337);
        }
        class211.method1506(true);
        class47.method465((byte) -66, true);
        class96.method785(class100.field2032, false, false);
        class47.method465((byte) -95, true);
        int var8 = class239.field4249;
        if (class159.field2998 < var8) {
            var8 = class159.field2998;
        }
        if (class159.field2998 - 1 > var8) {
            int var9 = class159.field2998 - 1;
        }
        if (class81.method703(-15861)) {
            class246.method1726(0);
        } else {
            class246.method1726(class239.field4249);
        }
        class169.method1248(111);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class132.method1001(5640, var10, var17);
            }
        }
        class168.method1230((byte) 41);
        class67.method603((byte) -59);
        class151.method1105((byte) -99);
        class211.method1506(true);
        if (class261.field4614 != null && class175.field3261 != null && class193.field3485 == 25) {
            class252.field4459++;
            class196.field3553.method1267(219, -9);
            class196.field3553.method57(1057001181, 113);
        }
        if (!class71.field1604) {
            int var11 = (class100.field2054 - 6) / 8;
            int var12 = (class202.field3611 + 6) / 8;
            int var13 = (class100.field2054 + 6) / 8;
            int var14 = (class202.field3611 - 6) / 8;
            for (int var15 = var11 - 1; var15 <= var13 + 1; var15++) {
                for (int var16 = var14 - 1; var16 <= var12 + 1; var16++) {
                    if (var11 > var15 || var13 < var15 || var16 < var14 || var16 > var12) {
                        class178.field3298.method1101((byte) -11, class160.method1188(new class30[] { class235.field4191, class73.method675(115, var15), class47.field1082, class73.method675(98, var16) }, 0));
                        class178.field3298.method1101((byte) -11, class160.method1188(new class30[] { field2540, class73.method675(-24, var15), class47.field1082, class73.method675(100, var16) }, 0));
                    }
                }
            }
        }
        if (class193.field3485 == 28) {
            class253.method1764((byte) -85, 10);
        } else {
            class253.method1764((byte) -85, 30);
            if (class175.field3261 != null) {
                class196.field3553.method1267(13, -9);
            }
        }
        class67.method603((byte) -59);
        class36.method348(-8);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lbk;IZDIBZLmc;)[I")
    public final int[] method984(class51 arg0, int arg1, boolean arg2, double arg3, int arg4, byte arg5, boolean arg6, class151 arg7) {
        field2535++;
        class116.method898(54, arg3);
        int[] var10 = new int[arg1 * arg4];
        class21.field396 = arg0;
        class132.field2608 = arg7;
        class211.method1504(735991116, arg1, arg4);
        for (int var11 = 0; var11 < this.field2538.length; var11++) {
            this.field2538[var11].method1794(arg4, arg1, -113);
        }
        int var12;
        byte var13;
        int var14;
        if (arg6) {
            var14 = arg1 - 1;
            var13 = -1;
            var12 = -1;
        } else {
            var12 = arg1;
            var13 = 1;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg4; var16++) {
            if (arg2) {
                var15 = var16;
            }
            int[] var20;
            int[] var21;
            int[] var22;
            if (this.field2531.field4588) {
                int[] var19 = this.field2531.method17(var16, false);
                var20 = var19;
                var21 = var19;
                var22 = var19;
            } else {
                int[][] var23 = this.field2531.method3((byte) 67, var16);
                var20 = var23[1];
                var22 = var23[0];
                var21 = var23[2];
            }
            for (int var24 = var14; var24 != var12; var24 += var13) {
                int var25 = var20[var24] >> 4;
                int var26 = var22[var24] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = var21[var24] >> 4;
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class190.field3470[var26];
                int var29 = class190.field3470[var27];
                int var30 = class190.field3470[var25];
                var10[var15++] = (var28 << 16) + (var30 << 8) + var29;
                if (arg2) {
                    var15 += arg1 - 1;
                }
            }
        }
        int var17 = -68 / ((arg5 - 17) / 61);
        for (int var18 = 0; var18 < this.field2538.length; var18++) {
            this.field2538[var18].method2(3);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
    public class129() {
        this.field2549 = new int[0];
        this.field2532 = new int[0];
        this.field2531 = new class182();
        this.field2531.field4578 = 1;
        this.field2530 = new class182();
        this.field2538 = new class259[] { this.field2531, this.field2530 };
        this.field2530.field4578 = 1;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Laa;)V")
    public class129(class8 arg0) {
        int var2 = arg0.method63((byte) 122);
        this.field2538 = new class259[var2];
        int[][] var3 = new int[var2][];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class259 var16 = class122.method930((byte) 113, arg0);
            if (var16.method5(-1) >= 0) {
                var4++;
            }
            if (var16.method727(638) >= 0) {
                var5++;
            }
            int var17 = var16.field4577.length;
            var3[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var3[var6][var18] = arg0.method63((byte) 79);
            }
            this.field2538[var6] = var16;
        }
        this.field2549 = new int[var4];
        this.field2532 = new int[var5];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class259 var11 = this.field2538[var9];
            int var12 = var11.field4577.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4577[var13] = this.field2538[var3[var9][var13]];
            }
            int var14 = var11.method5(-1);
            int var15 = var11.method727(638);
            if (var14 > 0) {
                this.field2549[var8++] = var14;
            }
            if (var15 > 0) {
                this.field2532[var7++] = var15;
            }
            var3[var9] = null;
        }
        this.field2531 = this.field2538[arg0.method63((byte) 127)];
        this.field2530 = this.field2538[arg0.method63((byte) 58)];
        Object var10 = null;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(Z)V")
    public static void method985(boolean arg0) {
        field2539 = null;
        if (arg0) {
            return;
        }
        field2545 = null;
        field2542 = null;
        field2544 = null;
        field2552 = null;
        field2546 = null;
        field2551 = null;
        field2548 = null;
        field2540 = null;
        field2553 = null;
        field2550 = null;
        field2547 = null;
        field2536 = null;
        field2537 = null;
        field2534 = null;
    }
}
