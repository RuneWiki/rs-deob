import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class63 {

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    private int field1307 = -1;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    private int field1299 = 0;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Lsc;")
    private class165 field1297 = new class165();

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "Z")
    public boolean field1320 = false;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    private int field1305;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "[Lqb;")
    private class146[] field1296;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "[[[I")
    private int[][][] field1311;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    private int field1302;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "Lsd;")
    public static class166 field1314 = class135.method935(":clan:", 0);

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "Lsd;")
    public static class166 field1306 = class135.method935("sl_flags", 0);

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "Lsd;")
    private static class166 field1313 = class135.method935("Select", 0);

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "Lsd;")
    private static class166 field1317 = class135.method935("Invalid username or password)3", 0);

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Lsd;")
    public static class166 field1304 = field1317;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "Lsd;")
    public static class166 field1298 = field1313;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Lsd;")
    public static class166 field1308 = class135.method935("<col=ffff00>", 0);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "Lcb;")
    public static class22 field1301;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "Lje;")
    public static class86 field1318;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "[I")
    public static int[] field1316;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "[[Lvd;")
    public static class193[][] field1309;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static final void method526(int arg0) {
        field1300++;
        class190.method1274(false, -127);
        boolean var1 = true;
        class98.field1867 = 0;
        for (int var2 = 0; var2 < class193.field3784.length; var2++) {
            if (class170.field3278[var2] != -1 && class193.field3784[var2] == null) {
                class193.field3784[var2] = class138.field2693.method353(class170.field3278[var2], 0, -74);
                if (class193.field3784[var2] == null) {
                    var1 = false;
                    class98.field1867++;
                }
            }
            if (class135.field2616[var2] != -1 && class196.field3876[var2] == null) {
                class196.field3876[var2] = class138.field2693.method355(class100.field1911[var2], class135.field2616[var2], -122, 0);
                if (class196.field3876[var2] == null) {
                    var1 = false;
                    class98.field1867++;
                }
            }
        }
        if (!var1) {
            class125.field2452 = 1;
            return;
        }
        boolean var3 = true;
        class9.field175 = 0;
        for (int var4 = 0; var4 < class193.field3784.length; var4++) {
            byte[] var56 = class196.field3876[var4];
            if (var56 != null) {
                int var57 = (class92.field1796[var4] >> 8) * 64 - class170.field3279;
                int var58 = (class92.field1796[var4] & 0xFF) * 64 - class147.field2901;
                if (class53.field970) {
                    var57 = 10;
                    var58 = 10;
                }
                var3 &= class189.method1258(var58, var56, var57, 75);
            }
        }
        if (!var3) {
            class125.field2452 = 2;
            return;
        }
        if (class125.field2452 != 0) {
            class116.method838(250, true, class22.method148(new class166[] { class146.field2880, class157.field3005 }, 0));
        }
        class121.method872(false);
        class22.method153((byte) 118);
        class121.method872(false);
        class131.field2556.method624();
        class121.method872(false);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class46.field822[var5].method959(-8974);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class122.field2387[var6][var54][var55] = 0;
                }
            }
        }
        class121.method872(false);
        class3.method21(false);
        int var7 = class193.field3784.length;
        class151.method1025((byte) 57);
        class190.method1274(true, arg0 ^ 0xFFFFC077);
        if (!class53.field970) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class92.field1796[var8] >> 8) * 64 - class170.field3279;
                int var18 = (class92.field1796[var8] & 0xFF) * 64 - class147.field2901;
                byte[] var19 = class193.field3784[var8];
                if (var19 != null) {
                    class121.method872(false);
                    class193.method1294((class29.field531 - 6) * 8, var17, var18, (class60.field1233 - 6) * 8, class46.field822, -65, var19);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class92.field1796[var9] & 0xFF) * 64 - class147.field2901;
                int var15 = (class92.field1796[var9] >> 8) * 64 - class170.field3279;
                byte[] var16 = class193.field3784[var9];
                if (var16 == null && class60.field1233 < 800) {
                    class121.method872(false);
                    class60.method509(true, var15, 64, var14, 64);
                }
            }
            class190.method1274(true, -109);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class196.field3876[var10];
                if (var11 != null) {
                    int var12 = (class92.field1796[var10] >> 8) * 64 - class170.field3279;
                    int var13 = (class92.field1796[var10] & 0xFF) * 64 - class147.field2901;
                    class121.method872(false);
                    class164.method1100(var13, var12, 63, var11, class46.field822, class131.field2556);
                }
            }
        }
        if (class53.field970) {
            for (int var20 = 0; var20 < 4; var20++) {
                class121.method872(false);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        boolean var36 = false;
                        int var37 = class179.field3394[var20][var34][var35];
                        if (var37 != -1) {
                            int var38 = var37 >> 24 & 0x3;
                            int var39 = var37 >> 3 & 0x7FF;
                            int var40 = var37 >> 1 & 0x3;
                            int var41 = var37 >> 14 & 0x3FF;
                            int var42 = (var41 / 8 << 8) + (var39 / 8);
                            for (int var43 = 0; var43 < class92.field1796.length; var43++) {
                                if (class92.field1796[var43] == var42 && class193.field3784[var43] != null) {
                                    class106.method789(var38, arg0 ^ 0xFFFFC03A, (var39 & 0x7) * 8, var20, var34 * 8, class46.field822, var35 * 8, class193.field3784[var43], var40, (var41 & 0x7) * 8);
                                    var36 = true;
                                    break;
                                }
                            }
                        }
                        if (!var36) {
                            class45.method346(-25172, var35 * 8, var34 * 8, var20);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class179.field3394[0][var21][var32];
                    if (var33 == -1) {
                        class60.method509(true, var21 * 8, 8, var32 * 8, 8);
                    }
                }
            }
            class190.method1274(true, arg0 - 16483);
            for (int var22 = 0; var22 < 4; var22++) {
                class121.method872(false);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class179.field3394[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 1 & 0x3;
                            int var28 = var25 >> 3 & 0x7FF;
                            int var29 = var25 >> 14 & 0x3FF;
                            int var30 = (var29 / 8 << 8) + var28 / 8;
                            for (int var31 = 0; var31 < class92.field1796.length; var31++) {
                                if (class92.field1796[var31] == var30 && class196.field3876[var31] != null) {
                                    class95.method726(var22, 24545, (var28 & 0x7) * 8, var23 * 8, class196.field3876[var31], var26, (var29 & 0x7) * 8, class131.field2556, class46.field822, var24 * 8, var27);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class190.method1274(true, -128);
        class22.method153((byte) 118);
        class121.method872(false);
        class144.method988(class46.field822, class131.field2556, (byte) -41);
        class190.method1274(true, -102);
        int var44 = class120.field2351;
        if (class165.field3130 < var44) {
            var44 = class165.field3130;
        }
        if (var44 < class165.field3130 - 1) {
            int var45 = class165.field3130 - 1;
        }
        if (class97.field1858) {
            class131.field2556.method604(class120.field2351);
        } else {
            class131.field2556.method604(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class121.method870(var53, -99999999, var46);
            }
        }
        class121.method872(false);
        class128.method908(125);
        class22.method153((byte) 118);
        if (class102.field1996 != null) {
            class156.field2989.method705(224, (byte) 9);
            class57.field1169++;
            class156.field2989.method438(423055928, 1057001181);
        }
        if (!class53.field970) {
            int var47 = (class29.field531 - 6) / 8;
            int var48 = (class29.field531 + 6) / 8;
            int var49 = (class60.field1233 - 6) / 8;
            int var50 = (class60.field1233 + 6) / 8;
            for (int var51 = var47 - 1; var51 <= var48 + 1; var51++) {
                for (int var52 = var49 - 1; var52 <= var50 + 1; var52++) {
                    if (var47 > var51 || var51 > var48 || var52 < var49 || var52 > var50) {
                        class138.field2693.method356(class22.method148(new class166[] { class34.field645, class174.method1192(false, var51), class47.field878, class174.method1192(false, var52) }, arg0 - 16378), arg0 ^ 0x3FFA);
                        class138.field2693.method356(class22.method148(new class166[] { class99.field1895, class174.method1192(false, var51), class47.field878, class174.method1192(false, var52) }, 0), 0);
                    }
                }
            }
        }
        class88.method695((byte) -125, 30);
        class121.method872(false);
        class120.method868((byte) -97);
        class156.field2989.method705(97, (byte) 9);
        if (arg0 != 16378) {
            method526(-91);
        }
        class62.method520(-70);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILf;IIZI)V")
    public static final void method527(int arg0, int arg1, class47 arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg4 >= -89) {
            return;
        }
        class58.field1182 = arg6;
        class34.field649 = arg3;
        class81.field1657 = arg1;
        class81.field1655 = arg2;
        class153.field2952 = 1;
        class4.field88 = arg5;
        field1295++;
        class143.field2781 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)[[I")
    public final int[][] method528(int arg0, int arg1) {
        if (arg0 < 44) {
            field1298 = null;
        }
        field1312++;
        if (this.field1305 == this.field1302) {
            this.field1320 = this.field1296[arg1] == null;
            this.field1296[arg1] = class67.field1362;
            return this.field1311[arg1];
        } else if (this.field1302 == 1) {
            this.field1320 = this.field1307 != arg1;
            this.field1307 = arg1;
            return this.field1311[0];
        } else {
            class146 var3 = this.field1296[arg1];
            if (this.field1320 = var3 == null) {
                if (this.field1302 > this.field1299) {
                    var3 = new class146(arg1, this.field1299);
                    this.field1299++;
                } else {
                    class146 var4 = (class146) this.field1297.method1111(40);
                    var3 = new class146(arg1, var4.field2872);
                    this.field1296[var4.field2874] = null;
                    var4.method915(0);
                }
                this.field1296[arg1] = var3;
            }
            this.field1297.method1105(1208005, var3);
            return this.field1311[var3.field2872];
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
    public static void method529(boolean arg0) {
        field1314 = null;
        field1304 = null;
        field1317 = null;
        field1298 = null;
        field1301 = null;
        field1313 = null;
        field1306 = null;
        field1308 = null;
        field1316 = null;
        field1318 = null;
        field1309 = null;
        if (!arg0) {
            field1313 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
    public final void method530(int arg0) {
        for (int var2 = 0; var2 < this.field1302; var2++) {
            this.field1311[var2][0] = null;
            this.field1311[var2][1] = null;
            this.field1311[var2][2] = null;
            this.field1311[var2] = null;
        }
        if (arg0 <= 69) {
            method529(false);
        }
        this.field1311 = null;
        this.field1296 = null;
        field1294++;
        this.field1297.method1104(17);
        this.field1297 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZZZ)I")
    public static final int method531(boolean arg0, boolean arg1, boolean arg2) {
        field1319++;
        int var3 = 0;
        if (arg2) {
            var3 += class184.field3518 + class137.field2677;
        }
        if (!arg0) {
            field1298 = null;
        }
        if (arg1) {
            var3 += class34.field629 + class120.field2357;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
    public static final void method532(int arg0) {
        field1310++;
        int var1 = class4.field84 * 128 + 64;
        int var2 = class160.field3074 * 128 + 64;
        int var3 = class119.method864(var1, var2, class165.field3130, true) - class157.field3001;
        if (var1 > class38.field690) {
            class38.field690 += (var1 - class38.field690) * class58.field1197 / 1000 + class132.field2571;
            if (var1 < class38.field690) {
                class38.field690 = var1;
            }
        }
        if (var1 < class38.field690) {
            class38.field690 -= (class38.field690 - var1) * class58.field1197 / 1000 + class132.field2571;
            if (class38.field690 < var1) {
                class38.field690 = var1;
            }
        }
        if (class22.field385 < var2) {
            class22.field385 += class132.field2571 + (var2 - class22.field385) * class58.field1197 / 1000;
            if (class22.field385 > var2) {
                class22.field385 = var2;
            }
        }
        if (var3 > class61.field1242) {
            class61.field1242 += (var3 - class61.field1242) * class58.field1197 / 1000 + class132.field2571;
            if (class61.field1242 > var3) {
                class61.field1242 = var3;
            }
        }
        if (class22.field385 > var2) {
            class22.field385 -= (class22.field385 - var2) * class58.field1197 / 1000 + class132.field2571;
            if (var2 > class22.field385) {
                class22.field385 = var2;
            }
        }
        if (class61.field1242 > var3) {
            class61.field1242 -= (class61.field1242 - var3) * class58.field1197 / 1000 + class132.field2571;
            if (class61.field1242 < var3) {
                class61.field1242 = var3;
            }
        }
        int var4 = class84.field1690 * 128 + 64;
        int var5 = class114.field2220 * 128 + 64;
        int var6 = class119.method864(var4, var5, class165.field3130, true) - class204.field4036;
        int var7 = var4 - class38.field690;
        int var8 = var6 - class61.field1242;
        int var9 = var5 - class22.field385;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 0x7FF;
        if (var11 > 383) {
            var11 = 383;
        }
        if (class143.field2786 < var11) {
            class143.field2786 += (var11 - class143.field2786) * class82.field1672 / 1000 + class31.field584;
            if (var11 < class143.field2786) {
                class143.field2786 = var11;
            }
        }
        int var13 = var12 - class159.field3046;
        if (class143.field2786 > var11) {
            class143.field2786 -= (class143.field2786 - var11) * class82.field1672 / 1000 + class31.field584;
            if (class143.field2786 < var11) {
                class143.field2786 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class159.field3046 += class82.field1672 * var13 / 1000 + class31.field584;
            class159.field3046 &= 0x7FF;
        }
        if (var13 < 0) {
            class159.field3046 -= -var13 * class82.field1672 / 1000 + class31.field584;
            class159.field3046 &= 0x7FF;
        }
        int var14 = var12 - class159.field3046;
        if (arg0 != 8) {
            return;
        }
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class159.field3046 = var12;
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(III)V")
    public class63(int arg0, int arg1, int arg2) {
        this.field1305 = arg1;
        this.field1296 = new class146[arg1];
        this.field1311 = new int[arg0][3][arg2];
        this.field1302 = arg0;
    }
}
