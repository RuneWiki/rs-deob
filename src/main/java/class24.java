import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class24 {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Lo;")
    public static class84 field396 = class15.method124("Enter name of friend to delete from list", 255);

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field401 = 0;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Lqc;")
    public static class97 field403 = new class97(64);

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field406 = 0;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field407 = 0;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field405 = 0;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Lp;")
    public static class89 field400;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[I")
    public static int[] field397;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 22)
    public static void method179(int arg0) {
        if (arg0 < 102) {
            field403 = null;
        }
        field403 = null;
        field400 = null;
        field396 = null;
        field397 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)V", line = 36)
    public static final void method180(byte arg0, int arg1) {
        field398++;
        int[] var2 = class112.field2432.field2705;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (103 - var5) * 512 * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class73.field1544[arg1][var21][var5] & 0x18) == 0) {
                    class112.field2427.method818(var2, var20, 512, arg1, var21, var5);
                }
                if (arg1 < 3 && (class73.field1544[arg1 + 1][var21][var5] & 0x8) != 0) {
                    class112.field2427.method818(var2, var20, 512, arg1 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class112.field2432.method951();
        int var6 = ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class73.field1544[arg1][var19][var8] & 0x18) == 0) {
                    class126.method975(arg1, var6, (byte) -82, var7, var8, var19);
                }
                if (arg1 < 3 && (class73.field1544[arg1 + 1][var19][var8] & 0x8) != 0) {
                    class126.method975(arg1 + 1, var6, (byte) -82, var7, var8, var19);
                }
            }
        }
        if (arg0 != 99) {
            method182(-7, null, -94, false);
        }
        class109.field2372 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class112.field2427.method844(class1.field11, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class110.method856((byte) -119, var12).field1026;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class93.field2034[class1.field11].field654;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var14 > var9 - 3 && (var16[var14 - 1][var15] & 0x1280108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var14 < var9 + 3 && (var16[var14 + 1][var15] & 0x1280180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var15 > var10 - 3 && (var16[var14][var15 - 1] & 0x1280102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var15 < var10 + 3 && (var16[var14][var15 + 1] & 0x1280120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class114.field2481[class109.field2372] = class118.field2626[var13];
                        class116.field2531[class109.field2372] = var14;
                        class122.field2733[class109.field2372] = var15;
                        class109.field2372++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V", line = 191)
    public static final void method181(boolean arg0) {
        field402++;
        class50.method435(-7184);
        if (class115.field2489 == 2) {
            int[] var1 = class32.field639;
            byte[] var2 = class19.field371.field2058;
            int var3 = var2.length;
            for (int var4 = 0; var4 < var3; var4++) {
                if (var2[var4] == 0) {
                    var1[var4] = 0;
                }
            }
            class15.field282.method939(0, 0, 33, 33, 25, 25, class79.field1680, 256, class122.field2728, class54.field1125);
            class38.method339(4, class30.field593);
            return;
        }
        int var5 = class79.field1680 + class103.field2176 & 0x7FF;
        int var6 = 464 - class107.field2271.field1391 / 32;
        int var7 = class107.field2271.field1380 / 32 + 48;
        class112.field2432.method939(25, 5, 146, 151, var7, var6, var5, class17.field302 + 256, class85.field1936, class3.field46);
        class15.field282.method939(0, 0, 33, 33, 25, 25, class79.field1680, 256, class122.field2728, class54.field1125);
        for (int var8 = 0; var8 < class109.field2372; var8++) {
            int var38 = class116.field2531[var8] * 4 + 2 - class107.field2271.field1380 / 32;
            int var39 = class122.field2733[var8] * 4 + 2 - class107.field2271.field1391 / 32;
            class109.method847(var38, -21346, class114.field2481[var8], var39);
        }
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var34 = 0; var34 < 104; var34++) {
                class88 var35 = class110.field2379[class1.field11][var9][var34];
                if (var35 != null) {
                    int var36 = var9 * 4 + 2 - class107.field2271.field1380 / 32;
                    int var37 = var34 * 4 + 2 - class107.field2271.field1391 / 32;
                    class109.method847(var36, -21346, class36.field709[0], var37);
                }
            }
        }
        for (int var10 = 0; var10 < class85.field1933; var10++) {
            class115 var30 = class3.field30[class75.field1571[var10]];
            if (var30 != null && var30.method496(28738)) {
                class39 var31 = var30.field2501;
                if (var31.field763 != null) {
                    var31 = var31.method347((byte) 83);
                }
                if (var31 != null && var31.field775 && var31.field786) {
                    int var32 = var30.field1391 / 32 - class107.field2271.field1391 / 32;
                    int var33 = var30.field1380 / 32 - class107.field2271.field1380 / 32;
                    class109.method847(var33, -21346, class36.field709[1], var32);
                }
            }
        }
        if (arg0) {
            method180((byte) 67, 79);
        }
        for (int var11 = 0; var11 < class107.field2257; var11++) {
            class63 var22 = class119.field2643[class85.field1949[var11]];
            if (var22 != null && var22.method496(28738)) {
                int var23 = var22.field1391 / 32 - class107.field2271.field1391 / 32;
                int var24 = var22.field1380 / 32 - class107.field2271.field1380 / 32;
                long var25 = var22.field1312.method649((byte) -126);
                boolean var27 = false;
                for (int var28 = 0; var28 < class27.field537; var28++) {
                    if (class26.field442[var28] == var25 && class74.field1547[var28] != 0) {
                        var27 = true;
                        break;
                    }
                }
                boolean var29 = false;
                if (class107.field2271.field1311 != 0 && var22.field1311 != 0 && class107.field2271.field1311 == var22.field1311) {
                    var29 = true;
                }
                if (var27) {
                    class109.method847(var24, -21346, class36.field709[3], var23);
                } else if (var29) {
                    class109.method847(var24, -21346, class36.field709[4], var23);
                } else {
                    class109.method847(var24, -21346, class36.field709[2], var23);
                }
            }
        }
        if (class110.field2378 != 0 && class128.field2837 % 20 < 10) {
            if (class110.field2378 == 1 && class104.field2193 >= 0 && class104.field2193 < class3.field30.length) {
                class115 var12 = class3.field30[class104.field2193];
                if (var12 != null) {
                    int var13 = var12.field1380 / 32 - class107.field2271.field1380 / 32;
                    int var14 = var12.field1391 / 32 - class107.field2271.field1391 / 32;
                    class123.method960(256, class15.field276[1], var14, var13);
                }
            }
            if (class110.field2378 == 2) {
                int var15 = (client.field335 - class106.field2242) * 4 + 2 - class107.field2271.field1380 / 32;
                int var16 = (class101.field2136 - class36.field714) * 4 + 2 - class107.field2271.field1391 / 32;
                class123.method960(256, class15.field276[1], var16, var15);
            }
            if (class110.field2378 == 10 && class116.field2518 >= 0 && class119.field2643.length > class116.field2518) {
                class63 var17 = class119.field2643[class116.field2518];
                if (var17 != null) {
                    int var18 = var17.field1391 / 32 - class107.field2271.field1391 / 32;
                    int var19 = var17.field1380 / 32 - class107.field2271.field1380 / 32;
                    class123.method960(256, class15.field276[1], var18, var19);
                }
            }
        }
        if (class45.field970 != 0) {
            int var20 = class97.field2077 * 4 + 2 - class107.field2271.field1391 / 32;
            int var21 = class45.field970 * 4 + 2 - class107.field2271.field1380 / 32;
            class109.method847(var21, -21346, class15.field276[0], var20);
        }
        class32.method290(97, 78, 3, 3, 16777215);
        class38.method339(4, class30.field593);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I[BIZ)I", line = 411)
    public static final int method182(int arg0, byte[] arg1, int arg2, boolean arg3) {
        field399++;
        int var4 = -1;
        for (int var5 = arg0; var5 < arg2; var5++) {
            var4 = class21.field380[(var4 ^ arg1[var5]) & 0xFF] ^ var4 >>> 8;
        }
        int var6 = ~var4;
        return arg3 ? 59 : var6;
    }
}
