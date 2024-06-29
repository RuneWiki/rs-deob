import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class70 {

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "S")
    public static short field1427 = 256;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "Ljd;")
    public static class86 field1442 = class122.method868("Lade Texturen )2 ", true);

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "[[I")
    public static int[][] field1440 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "Ljd;")
    public static class86 field1447 = class122.method868("Hidden)2", true);

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "I")
    public int field1449;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "J")
    private long field1441;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "J")
    private long field1445;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "Lbj;")
    public static class151 field1448;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "Z")
    public boolean field1425;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "[I")
    private int[] field1436;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "[I")
    private int[] field1439;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILq;)Lie;")
    public final class32 method501(int arg0, int arg1, class122 arg2) {
        field1444++;
        if (~this.field1449 != arg1) {
            return class178.method1251(this.field1449, (byte) -68).method95(116, arg0, arg2);
        }
        class32 var4 = (class32) class233.field4212.method701((byte) -121, this.field1441);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field1436[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((var15 & Integer.MIN_VALUE) != 0 && !class201.method1435((byte) -85, var15 & 0x3FFFFFFF).method1447(0)) {
                        var5 = true;
                    }
                } else if (!class272.method1853(0, var15 & 0x3FFFFFFF).method484(this.field1425, false)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class192[] var7 = new class192[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field1436[var9];
                if ((var12 & 0x40000000) != 0) {
                    class192 var14 = class272.method1853(0, var12 & 0x3FFFFFFF).method500((byte) 115, this.field1425);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                } else if ((Integer.MIN_VALUE & var12) != 0) {
                    class192 var13 = class201.method1435((byte) -125, var12 & 0x3FFFFFFF).method1446(18269);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                }
            }
            class192 var10 = new class192(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (class142.field2699[var11].length > this.field1439[var11]) {
                    var10.method1318(class114.field2167[var11], class142.field2699[var11][this.field1439[var11]]);
                }
                if (this.field1439[var11] < class116.field2211[var11].length) {
                    var10.method1318(class81.field1589[var11], class116.field2211[var11][this.field1439[var11]]);
                }
            }
            var4 = var10.method1316(64, 768, -50, -10, -50);
            class233.field4212.method696(this.field1441, var4, (byte) -96);
        }
        if (arg2 != null) {
            var4 = arg2.method866(arg0, arg1, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)V")
    public final void method502(int arg0, boolean arg1) {
        this.field1425 = arg1;
        field1429++;
        this.method508(232100640);
        if (arg0 != 8) {
            field1447 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lq;ZLq;II)Lie;")
    public final class32 method503(class122 arg0, boolean arg1, class122 arg2, int arg3, int arg4) {
        field1431++;
        if (this.field1449 != -1) {
            return class178.method1251(this.field1449, (byte) -68).method90(arg2, arg3, arg4, -2, arg0);
        }
        long var6 = this.field1441;
        if (!arg1) {
            this.method502(112, true);
        }
        int[] var8 = this.field1436;
        if (arg0 != null && (arg0.field2383 >= 0 || arg0.field2355 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field1436[var9];
            }
            if (arg0.field2383 >= 0) {
                if (arg0.field2383 == 65535) {
                    var8[5] = 0;
                    var6 ^= 0xFFFFFFFF00000000L;
                } else {
                    var8[5] = class49.method377(arg0.field2383, 1073741824);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg0.field2355 >= 0) {
                if (arg0.field2355 == 65535) {
                    var8[3] = 0;
                    var6 ^= 0xFFFFFFFFL;
                } else {
                    var8[3] = class49.method377(1073741824, arg0.field2355);
                    var6 ^= (long) var8[3];
                }
            }
        }
        class32 var10 = (class32) class140.field2665.method701((byte) -117, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var30 = var8[var12];
                if ((var30 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var30) != 0 && !class201.method1435((byte) -84, var30 & 0x3FFFFFFF).method1449(-42)) {
                        var11 = true;
                    }
                } else if (!class272.method1853(0, var30 & 0x3FFFFFFF).method496(this.field1425, -19060)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1445 != -1L) {
                    var10 = (class32) class140.field2665.method701((byte) -118, this.field1445);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class192[] var13 = new class192[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var27 = var8[var15];
                    if ((var27 & 0x40000000) != 0) {
                        class192 var28 = class272.method1853(0, var27 & 0x3FFFFFFF).method497(this.field1425, false);
                        if (var28 != null) {
                            var13[var14++] = var28;
                        }
                    } else if ((var27 & Integer.MIN_VALUE) != 0) {
                        class192 var29 = class201.method1435((byte) -87, var27 & 0x3FFFFFFF).method1445((byte) 68);
                        if (var29 != null) {
                            var13[var14++] = var29;
                        }
                    }
                }
                int var16 = var8[0];
                if ((var16 & 0x40000000) != 0) {
                    class69 var17 = class272.method1853(0, var16 & 0x3FFFFFFF);
                    if (var17.field1392 != null) {
                        for (int var18 = 0; var18 < var17.field1392.length; var18++) {
                            if (var17.field1392[var18] != null && var13[var18 + 1] != null) {
                                int var19 = var17.field1392[var18][2];
                                int var20 = var17.field1392[var18][1];
                                int var21 = var17.field1392[var18][3];
                                int var22 = var17.field1392[var18][0];
                                int var23 = var17.field1392[var18][4];
                                int var24 = var17.field1392[var18][5];
                                var13[var18 + 1].method1329(var22, var20, var19);
                                var13[var18 + 1].method1322(var21, var23, var24);
                            }
                        }
                    }
                }
                class192 var25 = new class192(var13, var14);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (class142.field2699[var26].length > this.field1439[var26]) {
                        var25.method1318(class114.field2167[var26], class142.field2699[var26][this.field1439[var26]]);
                    }
                    if (this.field1439[var26] < class116.field2211[var26].length) {
                        var25.method1318(class81.field1589[var26], class116.field2211[var26][this.field1439[var26]]);
                    }
                }
                var10 = var25.method1316(64, 850, -30, -50, -30);
                class140.field2665.method696(var6, var10, (byte) -96);
                this.field1445 = var6;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var10;
        }
        class32 var31;
        if (arg0 != null && arg2 != null) {
            var31 = arg0.method865(-5, arg4, arg3, var10, arg2);
        } else if (arg0 == null) {
            var31 = arg2.method867(false, var10, arg4);
        } else {
            var31 = arg0.method867(false, var10, arg3);
        }
        return var31;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIII)V")
    public static final void method504(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1428++;
        if (class265.field4684 < 100) {
            class72.method534((byte) 123);
        }
        class131.method936(arg3, arg1, arg3 + arg4, arg0 + arg1);
        if (class265.field4684 < 100) {
            byte var5 = 20;
            int var6 = arg1 - (-(arg0 / 2) - -var5) - 18;
            int var7 = arg4 / 2 + arg3;
            class131.method927(arg3, arg1, arg4, arg0, 0);
            class131.method932(var7 - 152, var6, 304, 34, 9179409);
            class131.method932(var7 - 151, var6 + 1, 302, 32, 0);
            class131.method927(var7 - 150, var6 + 2, class265.field4684 * 3, 30, 9179409);
            class131.method927(var7 + (class265.field4684 * 3) - 150, var6 - -2, 300 - (class265.field4684 * 3), 30, 0);
            class141.field2684.method1758(class55.field1120, var7, var6 + var5, 16777215, -1);
            return;
        }
        if (arg2 != 20287) {
            method507(-35, 42);
        }
        class209.field3787 = class156.field2952 - ((int) ((float) arg0 / class202.field3658));
        int var8 = class274.field4814 - ((int) ((float) arg4 / class202.field3658));
        class75.field1495 = (int) ((float) (arg0 * 2) / class202.field3658);
        class75.field1503 = class274.field4814 - (int) ((float) arg4 / class202.field3658);
        int var9 = class156.field2952 - (int) ((float) arg0 / class202.field3658);
        int var10 = (int) ((float) arg4 / class202.field3658) + class274.field4814;
        class31.field660 = (int) ((float) (arg4 * 2) / class202.field3658);
        int var11 = (int) ((float) arg0 / class202.field3658) + class156.field2952;
        class240.method1649(var8, arg1, arg3 + arg4, var9, var10, arg2 ^ 0xFFFFB0F1, var11, arg3, arg0 + arg1);
        class76.method545(arg0 + arg1, arg3, var11, var8, arg3 + arg4, arg1, -72, var9, var10);
        class124.method881(arg0 + arg1, 24535, var10, arg1, var11, var9, arg3 + arg4, var8, arg3);
        if (class25.field603 > 0) {
            class25.field603--;
        }
        if (!class68.field1327) {
            return;
        }
        int var12 = arg3 + arg4 - 5;
        int var13 = arg1 + arg0 - 8;
        int var14 = 16776960;
        class211.field3820.method1770(class109.method783(2, new class86[] { class51.field1077, class4.method26(false, class97.field1929) }), var12, var13, 16776960, -1);
        int var17 = var13 - 15;
        Runtime var15 = Runtime.getRuntime();
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var14 = 16711680;
        }
        class211.field3820.method1770(class109.method783(2, new class86[] { class203.field3671, class4.method26(false, var16), class270.field4749 }), var12, var17, var14, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V")
    public final void method505(int arg0, int arg1, int arg2) {
        this.field1439[arg1] = arg2;
        this.method508(232100640);
        field1432++;
        int var4 = 62 / ((arg0 - 33) / 52);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public static void method506(int arg0) {
        field1447 = null;
        field1448 = null;
        if (arg0 < 11) {
            field1430 = 48;
        }
        field1442 = null;
        field1440 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V")
    public static final void method507(int arg0, int arg1) {
        field1426++;
        class167 var2;
        if (class66.field1297 == null) {
            var2 = new class167(512, 512);
        } else {
            var2 = (class167) class66.field1297;
        }
        int[] var3 = var2.field3098;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        int var6 = 1;
        if (arg0 != 15090) {
            return;
        }
        while (var6 < 103) {
            int var24 = (52736 - (var6 * 512)) * 4 + 24628;
            for (int var25 = 1; var25 < 103; var25++) {
                if ((class86.field1693[arg1][var25][var6] & 0x18) == 0) {
                    class141.method1004(var3, var24, 512, arg1, var25, var6);
                }
                if (arg1 < 3 && (class86.field1693[arg1 + 1][var25][var6] & 0x8) != 0) {
                    class141.method1004(var3, var24, 512, arg1 + 1, var25, var6);
                }
                var24 += 4;
            }
            var6++;
        }
        var2.method1204();
        int var7 = (238 - (10 - ((int) (Math.random() * 20.0D))) << 8) + (((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D))) + 228;
        int var8 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var23 = 1; var23 < 103; var23++) {
                if ((class86.field1693[arg1][var23][var9] & 0x18) == 0) {
                    class108.method773(var7, var8, arg1, true, var9, var23);
                }
                if (arg1 < 3 && (class86.field1693[arg1 + 1][var23][var9] & 0x8) != 0) {
                    class108.method773(var7, var8, arg1 + 1, true, var9, var23);
                }
            }
        }
        class158.field2965 = 0;
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var11 = 0; var11 < 104; var11++) {
                long var12 = class218.method1537(class180.field3244, var10, var11);
                if (var12 != 0L) {
                    class117 var14 = class268.method1845((int) (var12 >>> 32) & Integer.MAX_VALUE, (byte) -125);
                    int var15 = var14.field2287;
                    if (var14.field2295 != null) {
                        for (int var16 = 0; var16 < var14.field2295.length; var16++) {
                            if (var14.field2295[var16] != -1) {
                                class117 var17 = class268.method1845(var14.field2295[var16], (byte) -75);
                                if (var17.field2287 >= 0) {
                                    var15 = var17.field2287;
                                    break;
                                }
                            }
                        }
                    }
                    if (var15 >= 0) {
                        int var18 = var10;
                        int var19 = var11;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var20 = class122.field2388[class180.field3244].field300;
                            for (int var21 = 0; var21 < 10; var21++) {
                                int var22 = (int) (Math.random() * 4.0D);
                                if (var22 == 0 && var18 > 0 && var18 > (var10 - 3) && (var20[var18 - 1][var19] & 0x12C0108) == 0) {
                                    var18--;
                                }
                                if (var22 == 1 && var18 < 103 && (var10 + 3) > var18 && (var20[var18 + 1][var19] & 0x12C0180) == 0) {
                                    var18++;
                                }
                                if (var22 == 2 && var19 > 0 && (var11 - 3) < var19 && (var20[var18][var19 - 1] & 0x12C0102) == 0) {
                                    var19--;
                                }
                                if (var22 == 3 && var19 < 103 && var19 < var11 + 3 && (var20[var18][var19 + 1] & 0x12C0120) == 0) {
                                    var19++;
                                }
                            }
                        }
                        class87.field1735[class158.field2965] = var14.field2261;
                        class198.field3525[class158.field2965] = var18;
                        class64.field1272[class158.field2965] = var19;
                        class158.field2965++;
                    }
                }
            }
        }
        class66.field1297 = var2;
        class107.field2055.method157(true);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
    private final void method508(int arg0) {
        if (arg0 != 232100640) {
            this.method513((int[]) null, (int[]) null, 35, true, 73);
        }
        field1437++;
        long[] var2 = class151.field2820;
        long var3 = this.field1441;
        this.field1441 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1441 = this.field1441 >>> 8 ^ var2[(int) (((long) (this.field1436[var5] >> 24) ^ this.field1441) & 0xFFL)];
            this.field1441 = this.field1441 >>> 8 ^ var2[(int) (((long) (this.field1436[var5] >> 16) ^ this.field1441) & 0xFFL)];
            this.field1441 = this.field1441 >>> 8 ^ var2[(int) (((long) (this.field1436[var5] >> 8) ^ this.field1441) & 0xFFL)];
            this.field1441 = this.field1441 >>> 8 ^ var2[(int) ((this.field1441 ^ (long) this.field1436[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field1441 = var2[(int) (((long) this.field1439[var6] ^ this.field1441) & 0xFFL)] ^ this.field1441 >>> 8;
        }
        this.field1441 = this.field1441 >>> 8 ^ var2[(int) ((this.field1441 ^ (long) (this.field1425 ? 1 : 0)) & 0xFFL)];
        if (var3 != 0L && this.field1441 != var3) {
            class140.field2665.method694(var3, -89);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIILq;I)Lie;")
    public final class32 method509(int arg0, int arg1, int arg2, class122 arg3, int arg4) {
        field1446++;
        if (arg4 != 768) {
            this.method501(52, -5, (class122) null);
        }
        long var6 = (long) arg0 << 32 | (long) (arg2 << 16) | (long) arg0;
        class32 var8 = (class32) class233.field4212.method701((byte) -124, var6);
        if (var8 == null) {
            class192[] var9 = new class192[2];
            int var10 = 0;
            if (!class201.method1435((byte) -96, arg0).method1447(0) || !class201.method1435((byte) -93, arg2).method1447(arg4 - 768)) {
                return null;
            }
            class192 var11 = class201.method1435((byte) -82, arg0).method1446(18269);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class192 var12 = class201.method1435((byte) -84, arg2).method1446(18269);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class192 var13 = new class192(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field1439[var14] < class142.field2699[var14].length) {
                    var13.method1318(class114.field2167[var14], class142.field2699[var14][this.field1439[var14]]);
                }
                if (this.field1439[var14] < class116.field2211[var14].length) {
                    var13.method1318(class81.field1589[var14], class116.field2211[var14][this.field1439[var14]]);
                }
            }
            var8 = var13.method1316(64, 768, -50, -10, -50);
            class233.field4212.method696(var6, var8, (byte) -96);
        }
        if (arg3 != null) {
            var8 = arg3.method866(arg1, 0, var8);
        }
        return var8;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)I")
    public final int method510(boolean arg0) {
        if (arg0) {
            this.field1436 = null;
        }
        field1433++;
        return this.field1449 == -1 ? (this.field1439[0] << 25) + (this.field1436[11] << 5) + (this.field1436[8] << 10) + (this.field1436[0] << 15) + (this.field1439[4] << 20) + this.field1436[1] : class178.method1251(this.field1449, (byte) -68).field362 + 305419896;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(III)V")
    public final void method511(int arg0, int arg1, int arg2) {
        field1434++;
        int var4 = class203.field3668[arg1];
        if (this.field1436[var4] == 0 || class201.method1435((byte) -86, arg0) == null) {
            return;
        }
        if (arg2 < 95) {
            this.field1449 = -11;
        }
        this.field1436[var4] = class49.method377(Integer.MIN_VALUE, arg0);
        this.method508(232100640);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIZII)V")
    public static final void method512(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field1443++;
        if (class179.method1258(arg2, (byte) -36)) {
            if (arg5) {
                method507(23, 118);
            }
            client.method1108(class108.field2070[arg2], -1, arg3, arg7, arg1, arg4, arg6, arg0);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([I[IIZI)V")
    public final void method513(int[] arg0, int[] arg1, int arg2, boolean arg3, int arg4) {
        field1435++;
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class180.field3248; var7++) {
                    class202 var8 = class201.method1435((byte) -124, var7);
                    if (var8 != null && !var8.field3653 && (arg3 ? 7 : 0) + var6 == var8.field3639) {
                        arg0[class203.field3668[var6]] = class49.method377(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        if (arg2 != 0) {
            this.method510(false);
        }
        this.field1436 = arg0;
        this.field1439 = arg1;
        this.field1425 = arg3;
        this.field1449 = arg4;
        this.method508(232100640);
    }
}
