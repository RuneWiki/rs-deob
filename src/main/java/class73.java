import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class73 {

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "[Z")
    public static boolean[] field1392 = new boolean[200];

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Lvf;")
    public static class265 field1402 = class87.method582(-46, "Sprites geladen)3");

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field1403 = 0;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Lvf;")
    public static class265 field1401 = class87.method582(-46, "name_icons");

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Lvf;")
    public static class265 field1394 = class87.method582(-46, "Utiliser");

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    public int field1417;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "J")
    private long field1398;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "J")
    private long field1412;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "Lfl;")
    public static class192 field1414;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "Z")
    public boolean field1411;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "[I")
    private int[] field1391;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "[I")
    private int[] field1408;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIII)V")
    public static final void method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1416++;
        int var7 = 0;
        int var8 = arg1 - arg2;
        class141.method975((byte) 21, arg1);
        int var9 = arg1;
        if (var8 < arg5) {
            var8 = 0;
        }
        int var10 = var8;
        int var11 = -var8;
        int var12 = -arg1;
        if (arg4 >= class81.field1521 && arg4 <= class205.field3681) {
            int[] var13 = class44.field973[arg4];
            int var14 = class219.method1507(class79.field1510, class107.field1890, arg6 - arg1, arg5);
            int var15 = class219.method1507(class79.field1510, class107.field1890, arg1 + arg6, 0);
            int var16 = class219.method1507(class79.field1510, class107.field1890, arg6 - var8, 0);
            int var17 = class219.method1507(class79.field1510, class107.field1890, arg6 + var8, 0);
            class203.method1394(var13, var14, var16, -7249, arg0);
            class203.method1394(var13, var16, var17, -7249, arg3);
            class203.method1394(var13, var17, var15, -7249, arg0);
        }
        int var18 = -1;
        int var19 = -1;
        while (var7 < var9) {
            var18 += 2;
            var19 += 2;
            var12 += var19;
            var11 += var18;
            if (var11 >= 0 && var10 >= 1) {
                var10--;
                class168.field3046[var10] = var7;
                var11 -= var10 << 1;
            }
            var7++;
            if (var12 >= 0) {
                var9--;
                var12 -= var9 << 1;
                int var20 = arg4 - var9;
                int var21 = arg4 + var9;
                if (class81.field1521 <= var21 && var20 <= class205.field3681) {
                    if (var9 < var8) {
                        int var22 = class168.field3046[var9];
                        int var23 = class219.method1507(class79.field1510, class107.field1890, arg6 + var7, 0);
                        int var24 = class219.method1507(class79.field1510, class107.field1890, arg6 - var7, arg5);
                        int var25 = class219.method1507(class79.field1510, class107.field1890, arg6 + var22, arg5);
                        int var26 = class219.method1507(class79.field1510, class107.field1890, arg6 - var22, arg5);
                        if (var21 <= class205.field3681) {
                            int[] var27 = class44.field973[var21];
                            class203.method1394(var27, var24, var26, -7249, arg0);
                            class203.method1394(var27, var26, var25, -7249, arg3);
                            class203.method1394(var27, var25, var23, -7249, arg0);
                        }
                        if (var20 >= class81.field1521) {
                            int[] var28 = class44.field973[var20];
                            class203.method1394(var28, var24, var26, -7249, arg0);
                            class203.method1394(var28, var26, var25, -7249, arg3);
                            class203.method1394(var28, var25, var23, -7249, arg0);
                        }
                    } else {
                        int var29 = class219.method1507(class79.field1510, class107.field1890, arg6 + var7, 0);
                        int var30 = class219.method1507(class79.field1510, class107.field1890, arg6 - var7, 0);
                        if (class205.field3681 >= var21) {
                            class203.method1394(class44.field973[var21], var30, var29, arg5 ^ 0xFFFFE3AF, arg0);
                        }
                        if (var20 >= class81.field1521) {
                            class203.method1394(class44.field973[var20], var30, var29, -7249, arg0);
                        }
                    }
                }
            }
            int var31 = arg4 - var7;
            int var32 = arg4 + var7;
            if (class81.field1521 <= var32 && class205.field3681 >= var31) {
                int var33 = arg6 + var9;
                int var34 = arg6 - var9;
                if (var33 >= class107.field1890 && var34 <= class79.field1510) {
                    int var35 = class219.method1507(class79.field1510, class107.field1890, var33, 0);
                    int var36 = class219.method1507(class79.field1510, class107.field1890, var34, 0);
                    if (var7 >= var8) {
                        if (class205.field3681 >= var32) {
                            class203.method1394(class44.field973[var32], var36, var35, -7249, arg0);
                        }
                        if (class81.field1521 <= var31) {
                            class203.method1394(class44.field973[var31], var36, var35, -7249, arg0);
                        }
                    } else {
                        int var37 = var10 >= var7 ? var10 : class168.field3046[var7];
                        int var38 = class219.method1507(class79.field1510, class107.field1890, arg6 + var37, 0);
                        int var39 = class219.method1507(class79.field1510, class107.field1890, arg6 - var37, arg5);
                        if (class205.field3681 >= var32) {
                            int[] var40 = class44.field973[var32];
                            class203.method1394(var40, var36, var39, -7249, arg0);
                            class203.method1394(var40, var39, var38, -7249, arg3);
                            class203.method1394(var40, var38, var35, -7249, arg0);
                        }
                        if (class81.field1521 <= var31) {
                            int[] var41 = class44.field973[var31];
                            class203.method1394(var41, var36, var39, -7249, arg0);
                            class203.method1394(var41, var39, var38, -7249, arg3);
                            class203.method1394(var41, var38, var35, -7249, arg0);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILt;IBLt;Z)Luh;")
    public final class235 method513(int arg0, class216 arg1, int arg2, byte arg3, class216 arg4, boolean arg5) {
        field1409++;
        if (this.field1417 != -1) {
            return class98.method654(this.field1417, -1).method1828(arg0, arg1, arg4, arg2, (byte) 124);
        } else if (arg3 < 15) {
            return null;
        } else {
            long var7 = this.field1398;
            int[] var9 = this.field1408;
            if (arg4 != null && (arg4.field3885 >= 0 || arg4.field3893 >= 0)) {
                var9 = new int[12];
                for (int var10 = 0; var10 < 12; var10++) {
                    var9[var10] = this.field1408[var10];
                }
                if (arg4.field3885 >= 0) {
                    if (arg4.field3885 == 65535) {
                        var9[5] = 0;
                        var7 ^= 0xFFFFFFFF00000000L;
                    } else {
                        var9[5] = class144.method992(arg4.field3885, 1073741824);
                        var7 ^= (long) var9[5] << 32;
                    }
                }
                if (arg4.field3893 >= 0) {
                    if (arg4.field3893 == 65535) {
                        var7 ^= 0xFFFFFFFFL;
                        var9[3] = 0;
                    } else {
                        var9[3] = class144.method992(1073741824, arg4.field3893);
                        var7 ^= (long) var9[3];
                    }
                }
            }
            class235 var11 = (class235) class70.field1321.method1887(112, var7);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; var13++) {
                    int var22 = var9[var13];
                    if ((var22 & 0x40000000) == 0) {
                        if ((var22 & Integer.MIN_VALUE) != 0 && !class125.method839(var22 & 0x3FFFFFFF, -2).method110((byte) 39)) {
                            var12 = true;
                        }
                    } else if (!class54.method418(var22 & 0x3FFFFFFF, 0).method1748((byte) -116, this.field1411)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field1412 != -1L) {
                        var11 = (class235) class70.field1321.method1887(110, this.field1412);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
                if (var11 == null) {
                    class20[] var14 = new class20[12];
                    int var15 = 0;
                    for (int var16 = 0; var16 < 12; var16++) {
                        int var19 = var9[var16];
                        if ((var19 & 0x40000000) != 0) {
                            class20 var20 = class54.method418(var19 & 0x3FFFFFFF, 0).method1751((byte) 127, this.field1411);
                            if (var20 != null) {
                                var14[var15++] = var20;
                            }
                        } else if ((var19 & Integer.MIN_VALUE) != 0) {
                            class20 var21 = class125.method839(var19 & 0x3FFFFFFF, -2).method113(true);
                            if (var21 != null) {
                                var14[var15++] = var21;
                            }
                        }
                    }
                    class20 var17 = new class20(var14, var15);
                    for (int var18 = 0; var18 < 5; var18++) {
                        if (class29.field743[var18].length > this.field1391[var18]) {
                            var17.method142(class262.field4581[var18], class29.field743[var18][this.field1391[var18]]);
                        }
                        if (class70.field1356[var18].length > this.field1391[var18]) {
                            var17.method142(class10.field352[var18], class70.field1356[var18][this.field1391[var18]]);
                        }
                    }
                    var11 = var17.method172(64, 850, -30, -50, -30);
                    if (arg5) {
                        class70.field1321.method1892(var11, var7, (byte) 59);
                        this.field1412 = var7;
                    }
                }
            }
            if (arg4 == null && arg1 == null) {
                return var11;
            }
            class235 var23;
            if (arg4 != null && arg1 != null) {
                var23 = arg4.method1483(arg1, arg2, 19889, var11, arg0);
            } else if (arg4 == null) {
                var23 = arg1.method1484(65535, var11, arg2);
            } else {
                var23 = arg4.method1484(65535, var11, arg0);
            }
            return var23;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method514(int arg0) {
        field1394 = null;
        field1392 = null;
        if (arg0 != -6) {
            field1402 = null;
        }
        field1402 = null;
        field1401 = null;
        field1414 = null;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    private final void method515(int arg0) {
        field1395++;
        long var2 = this.field1398;
        this.field1398 = -1L;
        long[] var4 = class283.field4979;
        for (int var5 = arg0; var5 < 12; var5++) {
            this.field1398 = this.field1398 >>> 8 ^ var4[(int) ((this.field1398 ^ (long) (this.field1408[var5] >> 24)) & 0xFFL)];
            this.field1398 = this.field1398 >>> 8 ^ var4[(int) ((this.field1398 ^ (long) (this.field1408[var5] >> 16)) & 0xFFL)];
            this.field1398 = this.field1398 >>> 8 ^ var4[(int) (((long) (this.field1408[var5] >> 8) ^ this.field1398) & 0xFFL)];
            this.field1398 = var4[(int) ((this.field1398 ^ (long) this.field1408[var5]) & 0xFFL)] ^ this.field1398 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field1398 = this.field1398 >>> 8 ^ var4[(int) (((long) this.field1391[var6] ^ this.field1398) & 0xFFL)];
        }
        this.field1398 = var4[(int) ((this.field1398 ^ (long) (this.field1411 ? 1 : 0)) & 0xFFL)] ^ this.field1398 >>> 8;
        if (var2 != 0L && this.field1398 != var2) {
            class70.field1321.method1890(var2, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)I")
    public final int method516(int arg0) {
        if (arg0 != 1854271604) {
            field1392 = null;
        }
        field1396++;
        return this.field1417 == -1 ? (this.field1391[0] << 25) + (this.field1391[4] << 20) + (this.field1408[11] << 5) + (this.field1408[8] << 10) + (this.field1408[0] << 15) + this.field1408[1] : class98.method654(this.field1417, -1).field4754 + 305419896;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[I[IIZ)V")
    public final void method517(int arg0, int[] arg1, int[] arg2, int arg3, boolean arg4) {
        field1415++;
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class17.field476; var7++) {
                    class15 var8 = class125.method839(var7, arg3 - 9);
                    if (var8 != null && !var8.field452 && var8.field439 == (arg4 ? 7 : 0) + var6) {
                        arg1[class125.field2243[var6]] = class144.method992(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        if (arg3 != 7) {
            this.field1417 = -66;
        }
        this.field1408 = arg1;
        this.field1391 = arg2;
        this.field1417 = arg0;
        this.field1411 = arg4;
        this.method515(0);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V")
    public final void method518(int arg0, int arg1, int arg2) {
        this.field1391[arg1] = arg0;
        field1407++;
        if (arg2 == 16) {
            this.method515(0);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILt;II)Luh;")
    public final class235 method519(int arg0, int arg1, class216 arg2, int arg3, int arg4) {
        field1410++;
        long var6 = (long) arg4 | (long) arg4 << 32 | (long) (arg3 << 16);
        class235 var8 = (class235) class55.field1125.method1887(121, var6);
        if (arg0 != 449472992) {
            this.method518(-1, -14, -114);
        }
        if (var8 == null) {
            class20[] var9 = new class20[2];
            int var10 = 0;
            if (!class125.method839(arg4, arg0 - 449472994).method106(arg0 ^ 0x1ACA69B3) || !class125.method839(arg3, -2).method106(118)) {
                return null;
            }
            class20 var11 = class125.method839(arg4, -2).method111(true);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class20 var12 = class125.method839(arg3, -2).method111(true);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class20 var13 = new class20(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field1391[var14] < class29.field743[var14].length) {
                    var13.method142(class262.field4581[var14], class29.field743[var14][this.field1391[var14]]);
                }
                if (this.field1391[var14] < class70.field1356[var14].length) {
                    var13.method142(class10.field352[var14], class70.field1356[var14][this.field1391[var14]]);
                }
            }
            var8 = var13.method172(64, 768, -50, -10, -50);
            class55.field1125.method1892(var8, var6, (byte) -128);
        }
        if (arg2 != null) {
            var8 = arg2.method1488(var8, false, arg1);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)I")
    public static final int method520(byte arg0) {
        field1397++;
        int var1 = 28 / ((arg0 - 1) / 44);
        return 16;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)V")
    public final void method521(int arg0, boolean arg1) {
        field1393++;
        this.field1411 = arg1;
        this.method515(0);
        if (arg0 < 21) {
            this.method519(-65, 73, (class216) null, 124, -10);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V")
    public static final void method522(int arg0, int arg1) {
        if (arg1 < 28) {
            method520((byte) -20);
        }
        field1405++;
        class181.field3214.method1891(-23549, arg0);
        class126.field2261.method1891(-23549, arg0);
        class183.field3246.method1891(-23549, arg0);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(III)V")
    public final void method523(int arg0, int arg1, int arg2) {
        int var4 = class125.field2243[arg2];
        field1400++;
        if (this.field1408[var4] != arg1 && class125.method839(arg0, arg1 - 2) != null) {
            this.field1408[var4] = class144.method992(arg0, Integer.MIN_VALUE);
            this.method515(arg1);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lt;II)Luh;")
    public final class235 method524(class216 arg0, int arg1, int arg2) {
        field1413++;
        if (this.field1417 != -1) {
            return class98.method654(this.field1417, -1).method1823(arg0, -87, arg2);
        }
        class235 var4 = (class235) class55.field1125.method1887(123, this.field1398);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field1408[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((var15 & Integer.MIN_VALUE) != 0 && !class125.method839(var15 & 0x3FFFFFFF, -2).method106(79)) {
                        var5 = true;
                    }
                } else if (!class54.method418(var15 & 0x3FFFFFFF, 0).method1735(97, this.field1411)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class20[] var7 = new class20[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field1408[var9];
                if ((var12 & 0x40000000) != 0) {
                    class20 var13 = class54.method418(var12 & 0x3FFFFFFF, 0).method1743(this.field1411, false);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                } else if ((var12 & Integer.MIN_VALUE) != 0) {
                    class20 var14 = class125.method839(var12 & 0x3FFFFFFF, -2).method111(true);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                }
            }
            class20 var10 = new class20(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (class29.field743[var11].length > this.field1391[var11]) {
                    var10.method142(class262.field4581[var11], class29.field743[var11][this.field1391[var11]]);
                }
                if (this.field1391[var11] < class70.field1356[var11].length) {
                    var10.method142(class10.field352[var11], class70.field1356[var11][this.field1391[var11]]);
                }
            }
            var4 = var10.method172(64, 768, -50, -10, -50);
            class55.field1125.method1892(var4, this.field1398, (byte) -124);
        }
        if (arg0 != null) {
            var4 = arg0.method1488(var4, false, arg2);
        }
        int var16 = 60 % ((-arg1 - 23) / 49);
        return var4;
    }
}
