import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class24 extends class172 {

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
    public int field349 = 0;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
    public int field353 = -1;

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "I")
    public int field351 = -1;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
    public int field352 = 12800;

    @OriginalMember(owner = "client!gh", name = "W", descriptor = "I")
    public int field366 = 12800;

    @OriginalMember(owner = "client!gh", name = "Z", descriptor = "Z")
    public boolean field369 = true;

    @OriginalMember(owner = "client!gh", name = "ab", descriptor = "I")
    public int field370 = 0;

    @OriginalMember(owner = "client!gh", name = "R", descriptor = "I")
    public int field361;

    @OriginalMember(owner = "client!gh", name = "S", descriptor = "Lid;")
    private class149 field362;

    @OriginalMember(owner = "client!gh", name = "T", descriptor = "Lid;")
    public class149 field363;

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "I")
    public int field360;

    @OriginalMember(owner = "client!gh", name = "U", descriptor = "Lgk;")
    public class157 field364;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "[I")
    public static int[] field355 = new int[2];

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "[I")
    public static int[] field345 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "I")
    public static int field344 = 0;

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "Lid;")
    public static class149 field359 = class60.method382("blaugr-Un:", (byte) 13);

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "Lid;")
    public static class149 field350 = class60.method382("", (byte) 117);

    @OriginalMember(owner = "client!gh", name = "Y", descriptor = "I")
    public static int field368 = -1;

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!gh", name = "O", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!gh", name = "V", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "Lvc;")
    public static class190 field356;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "Laj;")
    public static class47 field346;

    @OriginalMember(owner = "client!gh", name = "X", descriptor = "Le;")
    public static class65 field367;

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "[Lvc;")
    public static class190[] field357;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
    public final void method135(int arg0) {
        field347++;
        this.field349 = 0;
        this.field370 = arg0;
        this.field366 = 12800;
        this.field352 = 12800;
        for (class32 var2 = (class32) this.field364.method1140(0); var2 != null; var2 = (class32) this.field364.method1127(0)) {
            if (this.field349 < var2.field476) {
                this.field349 = var2.field476;
            }
            if (var2.field480 < this.field366) {
                this.field366 = var2.field480;
            }
            if (this.field370 < var2.field468) {
                this.field370 = var2.field468;
            }
            if (this.field352 > var2.field479) {
                this.field352 = var2.field479;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V")
    public static void method136(int arg0) {
        field346 = null;
        field350 = null;
        field345 = null;
        if (arg0 != 17882) {
            field344 = 35;
        }
        field355 = null;
        field356 = null;
        field357 = null;
        field359 = null;
        field367 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIZ)Z")
    public final boolean method137(int arg0, int arg1, boolean arg2) {
        field365++;
        if (arg2) {
            return false;
        } else if (this.field352 <= arg1 && arg1 <= this.field349 && arg0 >= this.field366 && this.field370 >= arg0) {
            for (class32 var4 = (class32) this.field364.method1140(0); var4 != null; var4 = (class32) this.field364.method1127(0)) {
                if (var4.method190(arg0, arg1, 16777215)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field354++;
        if (arg7 == arg9 && arg1 == arg4 && arg0 == arg2 && arg3 == arg8) {
            class37.method216(arg2, arg5, -30374, arg4, arg8, arg9);
        } else {
            int var10 = arg9;
            int var11 = arg4;
            int var12 = arg9 * 3;
            int var13 = arg1 * 3;
            int var14 = arg4 * 3;
            int var15 = arg7 * 3;
            int var16 = arg3 * 3;
            int var17 = arg8 + var13 - arg4 - var16;
            int var18 = arg0 * 3;
            int var19 = var15 + arg2 - arg9 - var18;
            int var20 = var15 - var12;
            int var21 = var16 + var14 - var13 - var13;
            int var22 = var13 - var14;
            int var23 = var12 + var18 - var15 - var15;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var17 * var26;
                int var28 = var19 * var26;
                int var29 = var23 * var25;
                int var30 = var21 * var25;
                int var31 = var20 * var24;
                int var32 = var22 * var24;
                int var33 = arg4 + (var27 + var30 + var32 >> 12);
                int var34 = arg9 + (var28 + var29 + var31 >> 12);
                class37.method216(var34, arg5, -30374, var11, var33, var10);
                var10 = var34;
                var11 = var33;
            }
        }
        if (arg6 != 3) {
            field355 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lwf;II)V")
    public static final void method139(class1 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field17;
        field348++;
        int var4 = (Integer) var3[0];
        class116 var5 = class165.method1208(var4, arg1 + 22256);
        if (var5 == null) {
            return;
        }
        class80.field1481 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field1976;
        byte var10 = -1;
        int[] var11 = var5.field1978;
        try {
            class82.field1498 = new class149[var5.field1981];
            class103.field1811 = new int[var5.field1977];
            int var12 = 0;
            if (arg1 != -22368) {
                method139((class1) null, 64, -17);
            }
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg0.field14;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field21;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field13 == null ? -1 : arg0.field13.field834;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field9;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field13 == null ? -1 : arg0.field13.field799;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field12 == null ? -1 : arg0.field12.field834;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field12 == null ? -1 : arg0.field12.field799;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field8;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field15;
                    }
                    class103.field1811[var12++] = var16;
                } else if (var3[var14] instanceof class149) {
                    class149 var15 = (class149) var3[var14];
                    if (var15.method1041((byte) -109, class25.field374)) {
                        var15 = arg0.field10;
                    }
                    class82.field1498[var13++] = var15;
                }
            }
            int var17 = 0;
            label3879: while (true) {
                var17++;
                if (var17 > arg2) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var498 = var9[var8];
                if (var498 < 100) {
                    if (var498 == 0) {
                        class181.field3268[var6++] = var11[var8];
                        continue;
                    }
                    if (var498 == 1) {
                        int var18 = var11[var8];
                        class181.field3268[var6++] = class115.field1953[var18];
                        continue;
                    }
                    if (var498 == 2) {
                        int var19 = var11[var8];
                        var6--;
                        class170.method1223(36, var19, class181.field3268[var6]);
                        continue;
                    }
                    if (var498 == 3) {
                        class276.field4939[var7++] = var5.field1974[var8];
                        continue;
                    }
                    if (var498 == 6) {
                        var8 += var11[var8];
                        continue;
                    }
                    if (var498 == 7) {
                        var6 -= 2;
                        if (class181.field3268[var6 + 1] != class181.field3268[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var498 == 8) {
                        var6 -= 2;
                        if (class181.field3268[var6 + 1] == class181.field3268[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var498 == 9) {
                        var6 -= 2;
                        if (class181.field3268[var6] < class181.field3268[var6 + 1]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var498 == 10) {
                        var6 -= 2;
                        if (class181.field3268[var6 + 1] < class181.field3268[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var498 == 21) {
                        if (class80.field1481 == 0) {
                            return;
                        }
                        class243 var20 = class278.field4973[--class80.field1481];
                        var5 = var20.field4267;
                        class82.field1498 = var20.field4270;
                        var11 = var5.field1978;
                        var8 = var20.field4272;
                        class103.field1811 = var20.field4274;
                        var9 = var5.field1976;
                        continue;
                    }
                    if (var498 == 25) {
                        int var21 = var11[var8];
                        class181.field3268[var6++] = class32.method192(22255, var21);
                        continue;
                    }
                    int var10001;
                    if (var498 == 27) {
                        int var22 = var11[var8];
                        var10001 = arg1 + 22368;
                        var6--;
                        class205.method1396(var22, var10001, class181.field3268[var6]);
                        continue;
                    }
                    if (var498 == 31) {
                        var6 -= 2;
                        if (class181.field3268[var6] <= class181.field3268[var6 + 1]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var498 == 32) {
                        var6 -= 2;
                        if (class181.field3268[var6] >= class181.field3268[var6 + 1]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var498 == 33) {
                        class181.field3268[var6++] = class103.field1811[var11[var8]];
                        continue;
                    }
                    if (var498 == 34) {
                        var10001 = var11[var8];
                        var6--;
                        class103.field1811[var10001] = class181.field3268[var6];
                        continue;
                    }
                    if (var498 == 35) {
                        class276.field4939[var7++] = class82.field1498[var11[var8]];
                        continue;
                    }
                    if (var498 == 36) {
                        var10001 = var11[var8];
                        var7--;
                        class82.field1498[var10001] = class276.field4939[var7];
                        continue;
                    }
                    if (var498 == 37) {
                        int var23 = var11[var8];
                        var7 -= var23;
                        class149 var24 = class199.method1363(var23, class276.field4939, var7, (byte) -67);
                        class276.field4939[var7++] = var24;
                        continue;
                    }
                    if (var498 == 38) {
                        var6--;
                        continue;
                    }
                    if (var498 == 39) {
                        var7--;
                        continue;
                    }
                    if (var498 == 40) {
                        int var25 = var11[var8];
                        class116 var26 = class165.method1208(var25, -116);
                        int[] var27 = new int[var26.field1977];
                        class149[] var28 = new class149[var26.field1981];
                        for (int var29 = 0; var29 < var26.field1983; var29++) {
                            var27[var29] = class181.field3268[var6 + var29 - var26.field1983];
                        }
                        for (int var30 = 0; var30 < var26.field1990; var30++) {
                            var28[var30] = class276.field4939[var7 + var30 - var26.field1990];
                        }
                        var7 -= var26.field1990;
                        var6 -= var26.field1983;
                        class243 var31 = new class243();
                        var31.field4267 = var5;
                        var31.field4272 = var8;
                        var31.field4270 = class82.field1498;
                        var31.field4274 = class103.field1811;
                        if (class80.field1481 >= class278.field4973.length) {
                            throw new RuntimeException();
                        }
                        var8 = -1;
                        var5 = var26;
                        class278.field4973[class80.field1481++] = var31;
                        class103.field1811 = var27;
                        class82.field1498 = var28;
                        var9 = var26.field1976;
                        var11 = var26.field1978;
                        continue;
                    }
                    if (var498 == 42) {
                        class181.field3268[var6++] = class91.field1620[var11[var8]];
                        continue;
                    }
                    if (var498 == 43) {
                        int var32 = var11[var8];
                        var6--;
                        class91.field1620[var32] = class181.field3268[var6];
                        class128.method897(var32, 7931);
                        continue;
                    }
                    if (var498 == 44) {
                        int var33 = var11[var8] >> 16;
                        int var34 = var11[var8] & 0xFFFF;
                        var6--;
                        int var35 = class181.field3268[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            byte var36 = -1;
                            class137.field2513[var33] = var35;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var35 <= var37) {
                                    continue label3879;
                                }
                                class32.field483[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var498 == 45) {
                        int var38 = var11[var8];
                        var6--;
                        int var39 = class181.field3268[var6];
                        if (var39 >= 0 && class137.field2513[var38] > var39) {
                            class181.field3268[var6++] = class32.field483[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var498 == 46) {
                        var6 -= 2;
                        int var40 = var11[var8];
                        int var41 = class181.field3268[var6];
                        if (var41 >= 0 && class137.field2513[var40] > var41) {
                            class32.field483[var40][var41] = class181.field3268[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var498 == 47) {
                        class149 var42 = class222.field3878[var11[var8]];
                        if (var42 == null) {
                            var42 = class213.field3781;
                        }
                        class276.field4939[var7++] = var42;
                        continue;
                    }
                    if (var498 == 48) {
                        int var43 = var11[var8];
                        var7--;
                        class222.field3878[var43] = class276.field4939[var7];
                        class211.method1437(var43, 63);
                        continue;
                    }
                    if (var498 == 51) {
                        class85 var44 = var5.field1986[var11[var8]];
                        var6--;
                        class143 var45 = (class143) var44.method639((byte) -102, (long) class181.field3268[var6]);
                        if (var45 != null) {
                            var8 += var45.field2606;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var11[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var498 < 300) {
                    if (var498 == 100) {
                        var6 -= 3;
                        int var47 = class181.field3268[var6];
                        int var48 = class181.field3268[var6 + 1];
                        int var49 = class181.field3268[var6 + 2];
                        if (var48 == 0) {
                            throw new RuntimeException();
                        }
                        class47 var50 = class251.method1741((byte) 110, var47);
                        if (var50.field761 == null) {
                            var50.field761 = new class47[var49 + 1];
                        }
                        if (var50.field761.length <= var49) {
                            class47[] var51 = new class47[var49 + 1];
                            for (int var52 = 0; var52 < var50.field761.length; var52++) {
                                var51[var52] = var50.field761[var52];
                            }
                            var50.field761 = var51;
                        }
                        if (var49 > 0 && var50.field761[var49 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var49 - 1));
                        }
                        class47 var53 = new class47();
                        var53.field718 = true;
                        var53.field799 = var49;
                        var53.field760 = var48;
                        var53.field707 = var53.field834 = var50.field834;
                        var50.field761[var49] = var53;
                        if (var46) {
                            class86.field1572 = var53;
                        } else {
                            class230.field4025 = var53;
                        }
                        class182.method1267(var50, arg1 + 22485);
                        continue;
                    }
                    if (var498 == 101) {
                        class47 var54 = var46 ? class86.field1572 : class230.field4025;
                        if (var54.field799 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class47 var55 = class251.method1741((byte) 110, var54.field834);
                        var55.field761[var54.field799] = null;
                        class182.method1267(var55, 88);
                        continue;
                    }
                    if (var498 == 102) {
                        var6--;
                        class47 var56 = class251.method1741((byte) 110, class181.field3268[var6]);
                        var56.field761 = null;
                        class182.method1267(var56, 103);
                        continue;
                    }
                    if (var498 == 200) {
                        var6 -= 2;
                        int var57 = class181.field3268[var6];
                        int var58 = class181.field3268[var6 + 1];
                        class47 var59 = class247.method1720(var58, 18062, var57);
                        if (var59 != null && var58 != -1) {
                            class181.field3268[var6++] = 1;
                            if (var46) {
                                class86.field1572 = var59;
                            } else {
                                class230.field4025 = var59;
                            }
                            continue;
                        }
                        class181.field3268[var6++] = 0;
                        continue;
                    }
                    if (var498 == 201) {
                        var6--;
                        int var60 = class181.field3268[var6];
                        class47 var61 = class251.method1741((byte) 110, var60);
                        if (var61 == null) {
                            class181.field3268[var6++] = 0;
                        } else {
                            class181.field3268[var6++] = 1;
                            if (var46) {
                                class86.field1572 = var61;
                            } else {
                                class230.field4025 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var498 < 500) {
                    if (var498 == 403) {
                        var6 -= 2;
                        int var485 = class181.field3268[var6 + 1];
                        int var486 = class181.field3268[var6];
                        for (int var487 = 0; var487 < class78.field1462.length; var487++) {
                            if (class78.field1462[var487] == var486) {
                                class77.field1449.field2226.method1315(8418, var487, var485);
                                continue label3879;
                            }
                        }
                        int var488 = 0;
                        while (true) {
                            if (var488 >= class180.field3254.length) {
                                continue label3879;
                            }
                            if (class180.field3254[var488] == var486) {
                                class77.field1449.field2226.method1315(arg1 ^ 0xFFFF8842, var488, var485);
                                continue label3879;
                            }
                            var488++;
                        }
                    }
                    if (var498 == 404) {
                        var6 -= 2;
                        int var489 = class181.field3268[var6 + 1];
                        int var490 = class181.field3268[var6];
                        class77.field1449.field2226.method1316(1, var490, var489);
                        continue;
                    }
                    if (var498 == 410) {
                        var6--;
                        boolean var491 = class181.field3268[var6] != 0;
                        class77.field1449.field2226.method1325(var491, (byte) -10);
                        continue;
                    }
                } else if (var498 >= 1000 && var498 < 1100 || var498 >= 2000 && var498 < 2100) {
                    class47 var62;
                    if (var498 < 2000) {
                        var62 = var46 ? class86.field1572 : class230.field4025;
                    } else {
                        var498 -= 1000;
                        var6--;
                        var62 = class251.method1741((byte) 110, class181.field3268[var6]);
                    }
                    if (var498 == 1000) {
                        var6 -= 4;
                        var62.field825 = class181.field3268[var6];
                        var62.field828 = class181.field3268[var6 + 1];
                        int var63 = class181.field3268[var6 + 3];
                        int var64 = class181.field3268[var6 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 5) {
                            var63 = 5;
                        }
                        var62.field706 = (byte) var63;
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 5) {
                            var64 = 5;
                        }
                        var62.field766 = (byte) var64;
                        class182.method1267(var62, arg1 + 22453);
                        class259.method1787(0, var62);
                        if (var62.field799 == -1) {
                            class104.method736((byte) -113, var62.field834);
                        }
                        continue;
                    }
                    if (var498 == 1001) {
                        var6 -= 4;
                        var62.field726 = class181.field3268[var6];
                        var62.field732 = class181.field3268[var6 + 1];
                        var62.field773 = 0;
                        var62.field744 = 0;
                        int var65 = class181.field3268[var6 + 3];
                        int var66 = class181.field3268[var6 + 2];
                        if (var65 < 0) {
                            var65 = 0;
                        } else if (var65 > 4) {
                            var65 = 4;
                        }
                        var62.field701 = (byte) var65;
                        if (var66 < 0) {
                            var66 = 0;
                        } else if (var66 > 4) {
                            var66 = 4;
                        }
                        var62.field743 = (byte) var66;
                        class182.method1267(var62, 100);
                        class259.method1787(0, var62);
                        if (var62.field760 == 0) {
                            class258.method1777(false, var62, 80);
                        }
                        continue;
                    }
                    if (var498 == 1003) {
                        var6--;
                        boolean var67 = class181.field3268[var6] == 1;
                        if (var62.field846 != var67) {
                            var62.field846 = var67;
                            class182.method1267(var62, arg1 + 22477);
                        }
                        if (var62.field799 == -1) {
                            class170.method1224(var62.field834, arg1 + 22490);
                        }
                        continue;
                    }
                    if (var498 == 1004) {
                        var6 -= 2;
                        var62.field748 = class181.field3268[var6];
                        var62.field794 = class181.field3268[var6 + 1];
                        class182.method1267(var62, 86);
                        class259.method1787(arg1 + 22368, var62);
                        if (var62.field760 == 0) {
                            class258.method1777(false, var62, 69);
                        }
                        continue;
                    }
                    if (var498 == 1005) {
                        var6--;
                        var62.field857 = class181.field3268[var6] == 1;
                        continue;
                    }
                } else if (!(var498 < 1100 || var498 >= 1200) || !(var498 < 2100 || var498 >= 2200)) {
                    class47 var482;
                    if (var498 >= 2000) {
                        var6--;
                        var482 = class251.method1741((byte) 110, class181.field3268[var6]);
                        var498 -= 1000;
                    } else {
                        var482 = var46 ? class86.field1572 : class230.field4025;
                    }
                    if (var498 == 1100) {
                        var6 -= 2;
                        var482.field805 = class181.field3268[var6];
                        if (var482.field861 - var482.field722 < var482.field805) {
                            var482.field805 = var482.field861 - var482.field722;
                        }
                        if (var482.field805 < 0) {
                            var482.field805 = 0;
                        }
                        var482.field824 = class181.field3268[var6 + 1];
                        if (var482.field824 > (var482.field755 - var482.field727)) {
                            var482.field824 = var482.field755 - var482.field727;
                        }
                        if (var482.field824 < 0) {
                            var482.field824 = 0;
                        }
                        class182.method1267(var482, arg1 + 22490);
                        if (var482.field799 == -1) {
                            class221.method1490(arg1 ^ 0xFFFFA8DB, var482.field834);
                        }
                        continue;
                    }
                    if (var498 == 1101) {
                        var6--;
                        var482.field812 = class181.field3268[var6];
                        class182.method1267(var482, 118);
                        if (var482.field799 == -1) {
                            class30.method180((byte) -128, var482.field834);
                        }
                        continue;
                    }
                    if (var498 == 1102) {
                        var6--;
                        var482.field833 = class181.field3268[var6] == 1;
                        class182.method1267(var482, 94);
                        continue;
                    }
                    if (var498 == 1103) {
                        var6--;
                        var482.field738 = class181.field3268[var6];
                        class182.method1267(var482, 85);
                        continue;
                    }
                    if (var498 == 1104) {
                        var6--;
                        var482.field844 = class181.field3268[var6];
                        class182.method1267(var482, 97);
                        continue;
                    }
                    if (var498 == 1105) {
                        var6--;
                        var482.field758 = class181.field3268[var6];
                        class182.method1267(var482, arg1 ^ 0xFFFFA8F8);
                        continue;
                    }
                    if (var498 == 1106) {
                        var6--;
                        var482.field720 = class181.field3268[var6];
                        class182.method1267(var482, 117);
                        continue;
                    }
                    if (var498 == 1107) {
                        var6--;
                        var482.field710 = class181.field3268[var6] == 1;
                        class182.method1267(var482, 126);
                        continue;
                    }
                    if (var498 == 1108) {
                        var482.field862 = 1;
                        var6--;
                        var482.field716 = class181.field3268[var6];
                        class182.method1267(var482, 115);
                        if (var482.field799 == -1) {
                            class281.method1931(var482.field834, true);
                        }
                        continue;
                    }
                    if (var498 == 1109) {
                        var6 -= 6;
                        var482.field749 = class181.field3268[var6];
                        var482.field753 = class181.field3268[var6 + 1];
                        var482.field863 = class181.field3268[var6 + 2];
                        var482.field697 = class181.field3268[var6 + 3];
                        var482.field858 = class181.field3268[var6 + 4];
                        var482.field871 = class181.field3268[var6 + 5];
                        class182.method1267(var482, arg1 ^ 0xFFFFA8D3);
                        if (var482.field799 == -1) {
                            class240.method1651(8, var482.field834);
                            class5.method32(2174, var482.field834);
                        }
                        continue;
                    }
                    if (var498 == 1110) {
                        var6--;
                        int var483 = class181.field3268[var6];
                        if (var482.field807 != var483) {
                            var482.field807 = var483;
                            var482.field790 = 0;
                            var482.field831 = 0;
                            var482.field736 = 1;
                            class182.method1267(var482, 127);
                        }
                        if (var482.field799 == -1) {
                            class16.method98(var482.field834, (byte) 114);
                        }
                        continue;
                    }
                    if (var498 == 1111) {
                        var6--;
                        var482.field832 = class181.field3268[var6] == 1;
                        class182.method1267(var482, arg1 ^ 0xFFFFA8D9);
                        continue;
                    }
                    if (var498 == 1112) {
                        var7--;
                        class149 var484 = class276.field4939[var7];
                        if (!var484.method1041((byte) -83, var482.field752)) {
                            var482.field752 = var484;
                            class182.method1267(var482, 119);
                        }
                        if (var482.field799 == -1) {
                            class93.method679(var482.field834, true);
                        }
                        continue;
                    }
                    if (var498 == 1113) {
                        var6--;
                        var482.field810 = class181.field3268[var6];
                        class182.method1267(var482, arg1 ^ 0xFFFFA8CB);
                        continue;
                    }
                    if (var498 == 1114) {
                        var6 -= 3;
                        var482.field747 = class181.field3268[var6];
                        var482.field781 = class181.field3268[var6 + 1];
                        var482.field731 = class181.field3268[var6 + 2];
                        class182.method1267(var482, 87);
                        continue;
                    }
                    if (var498 == 1115) {
                        var6--;
                        var482.field811 = class181.field3268[var6] == 1;
                        class182.method1267(var482, 84);
                        continue;
                    }
                    if (var498 == 1116) {
                        var6--;
                        var482.field817 = class181.field3268[var6];
                        class182.method1267(var482, 111);
                        continue;
                    }
                    if (var498 == 1117) {
                        var6--;
                        var482.field827 = class181.field3268[var6];
                        class182.method1267(var482, 88);
                        continue;
                    }
                    if (var498 == 1118) {
                        var6--;
                        var482.field782 = class181.field3268[var6] == 1;
                        class182.method1267(var482, 125);
                        continue;
                    }
                    if (var498 == 1119) {
                        var6--;
                        var482.field751 = class181.field3268[var6] == 1;
                        class182.method1267(var482, arg1 + 22463);
                        continue;
                    }
                    if (var498 == 1120) {
                        var6 -= 2;
                        var482.field861 = class181.field3268[var6];
                        var482.field755 = class181.field3268[var6 + 1];
                        class182.method1267(var482, 95);
                        if (var482.field760 == 0) {
                            class258.method1777(false, var482, 120);
                        }
                        continue;
                    }
                    if (var498 == 1121) {
                        class182.method1267(var482, arg1 + 22457);
                        var6 -= 2;
                        continue;
                    }
                    if (var498 == 1122) {
                        var6--;
                        var482.field795 = class181.field3268[var6] == 1;
                        class182.method1267(var482, 100);
                        continue;
                    }
                    if (var498 == 1123) {
                        var6--;
                        var482.field871 = class181.field3268[var6];
                        class182.method1267(var482, 112);
                        if (var482.field799 == -1) {
                            class240.method1651(arg1 + 22376, var482.field834);
                        }
                        continue;
                    }
                } else if (var498 >= 1200 && var498 < 1300 || var498 >= 2200 && var498 < 2300) {
                    class47 var478;
                    if (var498 >= 2000) {
                        var498 -= 1000;
                        var6--;
                        var478 = class251.method1741((byte) 110, class181.field3268[var6]);
                    } else {
                        var478 = var46 ? class86.field1572 : class230.field4025;
                    }
                    class182.method1267(var478, 77);
                    if (var498 == 1200 || var498 == 1205) {
                        var6 -= 2;
                        int var479 = class181.field3268[var6];
                        int var480 = class181.field3268[var6 + 1];
                        if (var478.field799 == -1) {
                            class57.method354(0, var478.field834);
                            class240.method1651(8, var478.field834);
                            class5.method32(2174, var478.field834);
                        }
                        if (var479 == -1) {
                            var478.field822 = -1;
                            var478.field716 = -1;
                            var478.field862 = 1;
                        } else {
                            var478.field821 = var480;
                            var478.field822 = var479;
                            class261 var481 = class226.method1516(var479, -28322);
                            var478.field697 = var481.field4627;
                            var478.field863 = var481.field4631;
                            var478.field753 = var481.field4602;
                            var478.field749 = var481.field4606;
                            var478.field858 = var481.field4598;
                            var478.field871 = var481.field4643;
                            if (var498 == 1205) {
                                var478.field698 = false;
                            } else {
                                var478.field698 = true;
                            }
                            if (var478.field773 > 0) {
                                var478.field871 = var478.field871 * 32 / var478.field773;
                            } else if (var478.field726 > 0) {
                                var478.field871 = var478.field871 * 32 / var478.field726;
                            }
                        }
                        continue;
                    }
                    if (var498 == 1201) {
                        var478.field862 = 2;
                        var6--;
                        var478.field716 = class181.field3268[var6];
                        if (var478.field799 == -1) {
                            class281.method1931(var478.field834, true);
                        }
                        continue;
                    }
                    if (var498 == 1202) {
                        var478.field862 = 3;
                        var478.field716 = class77.field1449.field2226.method1319(arg1 ^ 0xFFFFC720);
                        if (var478.field799 == -1) {
                            class281.method1931(var478.field834, true);
                        }
                        continue;
                    }
                    if (var498 == 1203) {
                        var478.field862 = 6;
                        var6--;
                        var478.field716 = class181.field3268[var6];
                        if (var478.field799 == -1) {
                            class281.method1931(var478.field834, true);
                        }
                        continue;
                    }
                    if (var498 == 1204) {
                        var478.field862 = 5;
                        var6--;
                        var478.field716 = class181.field3268[var6];
                        if (var478.field799 == -1) {
                            class281.method1931(var478.field834, true);
                        }
                        continue;
                    }
                } else if ((var498 < 1300 || var498 >= 1400) && (var498 < 2300 || var498 >= 2400)) {
                    if (var498 >= 1400 && var498 < 1500 || var498 >= 2400 && var498 < 2500) {
                        class47 var465;
                        if (var498 >= 2000) {
                            var498 -= 1000;
                            var6--;
                            var465 = class251.method1741((byte) 110, class181.field3268[var6]);
                        } else {
                            var465 = var46 ? class86.field1572 : class230.field4025;
                        }
                        var7--;
                        class149 var466 = class276.field4939[var7];
                        int[] var467 = null;
                        if (var466.method1053((byte) 67) > 0 && var466.method1021(var466.method1053((byte) 27) - 1, -6) == 89) {
                            var6--;
                            int var468 = class181.field3268[var6];
                            if (var468 > 0) {
                                var467 = new int[var468];
                                while (var468-- > 0) {
                                    var6--;
                                    var467[var468] = class181.field3268[var6];
                                }
                            }
                            var466 = var466.method1024(0, -5975, var466.method1053((byte) -128) - 1);
                        }
                        Object[] var469 = new Object[var466.method1053((byte) -112) + 1];
                        for (int var470 = var469.length - 1; var470 >= 1; var470--) {
                            if (var466.method1021(var470 - 1, arg1 ^ 0x5760) == 115) {
                                var7--;
                                var469[var470] = class276.field4939[var7];
                            } else {
                                var6--;
                                var469[var470] = Integer.valueOf(class181.field3268[var6]);
                            }
                        }
                        var6--;
                        int var471 = class181.field3268[var6];
                        if (var471 == -1) {
                            var469 = null;
                        } else {
                            var469[0] = Integer.valueOf(var471);
                        }
                        if (var498 == 1400) {
                            var465.field830 = var469;
                        } else if (var498 == 1401) {
                            var465.field742 = var469;
                        } else if (var498 == 1402) {
                            var465.field700 = var469;
                        } else if (var498 == 1403) {
                            var465.field843 = var469;
                        } else if (var498 == 1404) {
                            var465.field741 = var469;
                        } else if (var498 == 1405) {
                            var465.field850 = var469;
                        } else if (var498 == 1406) {
                            var465.field869 = var469;
                        } else if (var498 == 1407) {
                            var465.field696 = var467;
                            var465.field835 = var469;
                        } else if (var498 == 1408) {
                            var465.field729 = var469;
                        } else if (var498 == 1409) {
                            var465.field733 = var469;
                        } else if (var498 == 1410) {
                            var465.field704 = var469;
                        } else if (var498 == 1411) {
                            var465.field813 = var469;
                        } else if (var498 == 1412) {
                            var465.field787 = var469;
                        } else if (var498 == 1414) {
                            var465.field849 = var469;
                            var465.field789 = var467;
                        } else if (var498 == 1415) {
                            var465.field788 = var467;
                            var465.field745 = var469;
                        } else if (var498 == 1416) {
                            var465.field777 = var469;
                        } else if (var498 == 1417) {
                            var465.field839 = var469;
                        } else if (var498 == 1418) {
                            var465.field709 = var469;
                        } else if (var498 == 1419) {
                            var465.field717 = var469;
                        } else if (var498 == 1420) {
                            var465.field714 = var469;
                        } else if (var498 == 1421) {
                            var465.field864 = var469;
                        } else if (var498 == 1422) {
                            var465.field856 = var469;
                        } else if (var498 == 1423) {
                            var465.field841 = var469;
                        } else if (var498 == 1424) {
                            var465.field798 = var469;
                        } else if (var498 == 1425) {
                            var465.field730 = var469;
                        } else if (var498 == 1426) {
                            var465.field759 = var469;
                        } else if (var498 == 1427) {
                            var465.field806 = var469;
                        } else if (var498 == 1428) {
                            var465.field801 = var469;
                            var465.field740 = var467;
                        } else if (var498 == 1429) {
                            var465.field814 = var469;
                            var465.field816 = var467;
                        }
                        var465.field702 = true;
                        continue;
                    }
                    if (var498 < 1600) {
                        class47 var464 = var46 ? class86.field1572 : class230.field4025;
                        if (var498 == 1500) {
                            class181.field3268[var6++] = var464.field754;
                            continue;
                        }
                        if (var498 == 1501) {
                            class181.field3268[var6++] = var464.field784;
                            continue;
                        }
                        if (var498 == 1502) {
                            class181.field3268[var6++] = var464.field722;
                            continue;
                        }
                        if (var498 == 1503) {
                            class181.field3268[var6++] = var464.field727;
                            continue;
                        }
                        if (var498 == 1504) {
                            class181.field3268[var6++] = var464.field846 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 1505) {
                            class181.field3268[var6++] = var464.field707;
                            continue;
                        }
                    } else if (var498 < 1700) {
                        class47 var463 = var46 ? class86.field1572 : class230.field4025;
                        if (var498 == 1600) {
                            class181.field3268[var6++] = var463.field805;
                            continue;
                        }
                        if (var498 == 1601) {
                            class181.field3268[var6++] = var463.field824;
                            continue;
                        }
                        if (var498 == 1602) {
                            class276.field4939[var7++] = var463.field752;
                            continue;
                        }
                        if (var498 == 1603) {
                            class181.field3268[var6++] = var463.field861;
                            continue;
                        }
                        if (var498 == 1604) {
                            class181.field3268[var6++] = var463.field755;
                            continue;
                        }
                        if (var498 == 1605) {
                            class181.field3268[var6++] = var463.field871;
                            continue;
                        }
                        if (var498 == 1606) {
                            class181.field3268[var6++] = var463.field863;
                            continue;
                        }
                        if (var498 == 1607) {
                            class181.field3268[var6++] = var463.field858;
                            continue;
                        }
                        if (var498 == 1608) {
                            class181.field3268[var6++] = var463.field697;
                            continue;
                        }
                        if (var498 == 1609) {
                            class181.field3268[var6++] = var463.field738;
                            continue;
                        }
                        if (var498 == 1610) {
                            class181.field3268[var6++] = var463.field749;
                            continue;
                        }
                        if (var498 == 1611) {
                            class181.field3268[var6++] = var463.field753;
                            continue;
                        }
                        if (var498 == 1612) {
                            class181.field3268[var6++] = var463.field758;
                            continue;
                        }
                    } else if (var498 < 1800) {
                        class47 var68 = var46 ? class86.field1572 : class230.field4025;
                        if (var498 == 1700) {
                            class181.field3268[var6++] = var68.field822;
                            continue;
                        }
                        if (var498 == 1701) {
                            if (var68.field822 == -1) {
                                class181.field3268[var6++] = 0;
                            } else {
                                class181.field3268[var6++] = var68.field821;
                            }
                            continue;
                        }
                        if (var498 == 1702) {
                            class181.field3268[var6++] = var68.field799;
                            continue;
                        }
                    } else if (var498 < 1900) {
                        class47 var69 = var46 ? class86.field1572 : class230.field4025;
                        if (var498 == 1800) {
                            class181.field3268[var6++] = client.method1104(var69).method1178(arg1 + 22367);
                            continue;
                        }
                        if (var498 == 1801) {
                            var6--;
                            int var70 = class181.field3268[var6];
                            int var499 = var70 - 1;
                            if (var69.field848 != null && var69.field848.length > var499 && var69.field848[var499] != null) {
                                class276.field4939[var7++] = var69.field848[var499];
                                continue;
                            }
                            class276.field4939[var7++] = class279.field4984;
                            continue;
                        }
                        if (var498 == 1802) {
                            if (var69.field711 == null) {
                                class276.field4939[var7++] = class279.field4984;
                            } else {
                                class276.field4939[var7++] = var69.field711;
                            }
                            continue;
                        }
                    } else if (var498 < 2600) {
                        var6--;
                        class47 var71 = class251.method1741((byte) 110, class181.field3268[var6]);
                        if (var498 == 2500) {
                            class181.field3268[var6++] = var71.field754;
                            continue;
                        }
                        if (var498 == 2501) {
                            class181.field3268[var6++] = var71.field784;
                            continue;
                        }
                        if (var498 == 2502) {
                            class181.field3268[var6++] = var71.field722;
                            continue;
                        }
                        if (var498 == 2503) {
                            class181.field3268[var6++] = var71.field727;
                            continue;
                        }
                        if (var498 == 2504) {
                            class181.field3268[var6++] = var71.field846 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 2505) {
                            class181.field3268[var6++] = var71.field707;
                            continue;
                        }
                    } else if (var498 < 2700) {
                        var6--;
                        class47 var462 = class251.method1741((byte) 110, class181.field3268[var6]);
                        if (var498 == 2600) {
                            class181.field3268[var6++] = var462.field805;
                            continue;
                        }
                        if (var498 == 2601) {
                            class181.field3268[var6++] = var462.field824;
                            continue;
                        }
                        if (var498 == 2602) {
                            class276.field4939[var7++] = var462.field752;
                            continue;
                        }
                        if (var498 == 2603) {
                            class181.field3268[var6++] = var462.field861;
                            continue;
                        }
                        if (var498 == 2604) {
                            class181.field3268[var6++] = var462.field755;
                            continue;
                        }
                        if (var498 == 2605) {
                            class181.field3268[var6++] = var462.field871;
                            continue;
                        }
                        if (var498 == 2606) {
                            class181.field3268[var6++] = var462.field863;
                            continue;
                        }
                        if (var498 == 2607) {
                            class181.field3268[var6++] = var462.field858;
                            continue;
                        }
                        if (var498 == 2608) {
                            class181.field3268[var6++] = var462.field697;
                            continue;
                        }
                        if (var498 == 2609) {
                            class181.field3268[var6++] = var462.field738;
                            continue;
                        }
                        if (var498 == 2610) {
                            class181.field3268[var6++] = var462.field749;
                            continue;
                        }
                        if (var498 == 2611) {
                            class181.field3268[var6++] = var462.field753;
                            continue;
                        }
                        if (var498 == 2612) {
                            class181.field3268[var6++] = var462.field758;
                            continue;
                        }
                    } else if (var498 < 2800) {
                        if (var498 == 2700) {
                            var6--;
                            class47 var72 = class251.method1741((byte) 110, class181.field3268[var6]);
                            class181.field3268[var6++] = var72.field822;
                            continue;
                        }
                        if (var498 == 2701) {
                            var6--;
                            class47 var73 = class251.method1741((byte) 110, class181.field3268[var6]);
                            if (var73.field822 == -1) {
                                class181.field3268[var6++] = 0;
                            } else {
                                class181.field3268[var6++] = var73.field821;
                            }
                            continue;
                        }
                        if (var498 == 2702) {
                            var6--;
                            int var74 = class181.field3268[var6];
                            class3 var75 = (class3) class34.field499.method639((byte) -126, (long) var74);
                            if (var75 == null) {
                                class181.field3268[var6++] = 0;
                            } else {
                                class181.field3268[var6++] = 1;
                            }
                            continue;
                        }
                        if (var498 == 2703) {
                            var6--;
                            class47 var76 = class251.method1741((byte) 110, class181.field3268[var6]);
                            if (var76.field761 == null) {
                                class181.field3268[var6++] = 0;
                                continue;
                            }
                            int var77 = var76.field761.length;
                            for (int var78 = 0; var78 < var76.field761.length; var78++) {
                                if (var76.field761[var78] == null) {
                                    var77 = var78;
                                    break;
                                }
                            }
                            class181.field3268[var6++] = var77;
                            continue;
                        }
                        if (var498 == 2704 || var498 == 2705) {
                            var6 -= 2;
                            int var79 = class181.field3268[var6 + 1];
                            int var80 = class181.field3268[var6];
                            class3 var81 = (class3) class34.field499.method639((byte) -121, (long) var80);
                            if (var81 != null && var81.field42 == var79) {
                                class181.field3268[var6++] = 1;
                                continue;
                            }
                            class181.field3268[var6++] = 0;
                            continue;
                        }
                    } else if (var498 < 2900) {
                        var6--;
                        class47 var460 = class251.method1741((byte) 110, class181.field3268[var6]);
                        if (var498 == 2800) {
                            class181.field3268[var6++] = client.method1104(var460).method1178(-1);
                            continue;
                        }
                        if (var498 == 2801) {
                            var6--;
                            int var461 = class181.field3268[var6];
                            int var500 = var461 - 1;
                            if (var460.field848 != null && var500 < var460.field848.length && var460.field848[var500] != null) {
                                class276.field4939[var7++] = var460.field848[var500];
                                continue;
                            }
                            class276.field4939[var7++] = class279.field4984;
                            continue;
                        }
                        if (var498 == 2802) {
                            if (var460.field711 == null) {
                                class276.field4939[var7++] = class279.field4984;
                            } else {
                                class276.field4939[var7++] = var460.field711;
                            }
                            continue;
                        }
                    } else if (var498 < 3200) {
                        if (var498 == 3100) {
                            var7--;
                            class149 var82 = class276.field4939[var7];
                            class264.method1841(true, var82, class279.field4984, 0);
                            continue;
                        }
                        if (var498 == 3101) {
                            var6 -= 2;
                            class269.method1872(-109, class181.field3268[var6], class181.field3268[var6 + 1], class77.field1449);
                            continue;
                        }
                        if (var498 == 3103) {
                            class48.method308((byte) 10);
                            continue;
                        }
                        if (var498 == 3104) {
                            class122.field2142++;
                            var7--;
                            class149 var83 = class276.field4939[var7];
                            int var84 = 0;
                            if (var83.method1039((byte) 74)) {
                                var84 = var83.method1052((byte) -89);
                            }
                            class208.field3720.method162(arg1 ^ 0xFFFFA8A2, 23);
                            class208.field3720.method517(var84, arg1 + 22490);
                            continue;
                        }
                        if (var498 == 3105) {
                            class194.field3475++;
                            var7--;
                            class149 var85 = class276.field4939[var7];
                            class208.field3720.method162(2, 244);
                            class208.field3720.method496(2, var85.method1023((byte) -16));
                            continue;
                        }
                        if (var498 == 3106) {
                            var7--;
                            class149 var86 = class276.field4939[var7];
                            class208.field3720.method162(2, 65);
                            class208.field3720.method494((byte) 4, var86.method1053((byte) -122) + 1);
                            class264.field4697++;
                            class208.field3720.method523(var86, (byte) 0);
                            continue;
                        }
                        if (var498 == 3107) {
                            var7--;
                            class149 var87 = class276.field4939[var7];
                            var6--;
                            int var88 = class181.field3268[var6];
                            class191.method1304(var87, var88, -534);
                            continue;
                        }
                        if (var498 == 3108) {
                            var6 -= 3;
                            int var89 = class181.field3268[var6];
                            int var90 = class181.field3268[var6 + 1];
                            int var91 = class181.field3268[var6 + 2];
                            class47 var92 = class251.method1741((byte) 110, var91);
                            client.method1118(var89, (byte) 61, var92, var90);
                            continue;
                        }
                        if (var498 == 3109) {
                            var6 -= 2;
                            int var93 = class181.field3268[var6];
                            int var94 = class181.field3268[var6 + 1];
                            class47 var95 = var46 ? class86.field1572 : class230.field4025;
                            client.method1118(var93, (byte) 61, var95, var94);
                            continue;
                        }
                        if (var498 == 3110) {
                            class283.field5007++;
                            var6--;
                            int var96 = class181.field3268[var6];
                            class208.field3720.method162(arg1 ^ 0xFFFFA8A2, 111);
                            class208.field3720.method518(arg1 ^ 0xFF00A8A0, var96);
                            continue;
                        }
                    } else if (var498 < 3300) {
                        if (var498 == 3200) {
                            var6 -= 3;
                            class279.method1926(true, class181.field3268[var6 + 1], class181.field3268[var6 + 2], class181.field3268[var6]);
                            continue;
                        }
                        if (var498 == 3201) {
                            var6--;
                            class219.method1484((byte) -91, class181.field3268[var6]);
                            continue;
                        }
                        if (var498 == 3202) {
                            var6 -= 2;
                            class68.method424(arg1 ^ 0xFFFFA8DC, class181.field3268[var6], class181.field3268[var6 + 1]);
                            continue;
                        }
                    } else if (var498 < 3400) {
                        if (var498 == 3300) {
                            class181.field3268[var6++] = class118.field2022;
                            continue;
                        }
                        if (var498 == 3301) {
                            var6 -= 2;
                            int var426 = class181.field3268[var6];
                            int var427 = class181.field3268[var6 + 1];
                            class181.field3268[var6++] = class149.method1067(var426, -104, var427);
                            continue;
                        }
                        if (var498 == 3302) {
                            var6 -= 2;
                            int var428 = class181.field3268[var6];
                            int var429 = class181.field3268[var6 + 1];
                            class181.field3268[var6++] = class271.method1883(var428, var429, (byte) -114);
                            continue;
                        }
                        if (var498 == 3303) {
                            var6 -= 2;
                            int var430 = class181.field3268[var6];
                            int var431 = class181.field3268[var6 + 1];
                            class181.field3268[var6++] = class40.method235(class85.method629(arg1, -22368), var430, var431);
                            continue;
                        }
                        if (var498 == 3304) {
                            var6--;
                            int var432 = class181.field3268[var6];
                            class181.field3268[var6++] = class222.method1499((byte) 69, var432).field4337;
                            continue;
                        }
                        if (var498 == 3305) {
                            var6--;
                            int var433 = class181.field3268[var6];
                            class181.field3268[var6++] = class176.field3226[var433];
                            continue;
                        }
                        if (var498 == 3306) {
                            var6--;
                            int var434 = class181.field3268[var6];
                            class181.field3268[var6++] = class257.field4501[var434];
                            continue;
                        }
                        if (var498 == 3307) {
                            var6--;
                            int var435 = class181.field3268[var6];
                            class181.field3268[var6++] = class206.field3703[var435];
                            continue;
                        }
                        if (var498 == 3308) {
                            int var436 = class277.field4948;
                            int var437 = (class77.field1449.field2347 >> 7) + class125.field2199;
                            int var438 = (class77.field1449.field2340 >> 7) + class115.field1969;
                            class181.field3268[var6++] = (var436 << 28) + (var437 << 14) + var438;
                            continue;
                        }
                        if (var498 == 3309) {
                            var6--;
                            int var439 = class181.field3268[var6];
                            class181.field3268[var6++] = class136.method953(var439, 268433487) >> 14;
                            continue;
                        }
                        if (var498 == 3310) {
                            var6--;
                            int var440 = class181.field3268[var6];
                            class181.field3268[var6++] = var440 >> 28;
                            continue;
                        }
                        if (var498 == 3311) {
                            var6--;
                            int var441 = class181.field3268[var6];
                            class181.field3268[var6++] = class136.method953(var441, 16383);
                            continue;
                        }
                        if (var498 == 3312) {
                            class181.field3268[var6++] = class256.field4470 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3313) {
                            var6 -= 2;
                            int var442 = class181.field3268[var6] + 32768;
                            int var443 = class181.field3268[var6 + 1];
                            class181.field3268[var6++] = class149.method1067(var442, -94, var443);
                            continue;
                        }
                        if (var498 == 3314) {
                            var6 -= 2;
                            int var444 = class181.field3268[var6] + 32768;
                            int var445 = class181.field3268[var6 + 1];
                            class181.field3268[var6++] = class271.method1883(var444, var445, (byte) -89);
                            continue;
                        }
                        if (var498 == 3315) {
                            var6 -= 2;
                            int var446 = class181.field3268[var6] + 32768;
                            int var447 = class181.field3268[var6 + 1];
                            class181.field3268[var6++] = class40.method235(class85.method629(arg1, -22368), var446, var447);
                            continue;
                        }
                        if (var498 == 3316) {
                            if (class258.field4519 >= 2) {
                                class181.field3268[var6++] = class258.field4519;
                            } else {
                                class181.field3268[var6++] = 0;
                            }
                            continue;
                        }
                        if (var498 == 3317) {
                            class181.field3268[var6++] = class271.field4876;
                            continue;
                        }
                        if (var498 == 3318) {
                            class181.field3268[var6++] = class147.field2652;
                            continue;
                        }
                        if (var498 == 3321) {
                            class181.field3268[var6++] = class32.field470;
                            continue;
                        }
                        if (var498 == 3322) {
                            class181.field3268[var6++] = class279.field4986;
                            continue;
                        }
                        if (var498 == 3323) {
                            if (class181.field3258 >= 5 && class181.field3258 <= 9) {
                                class181.field3268[var6++] = 1;
                                continue;
                            }
                            class181.field3268[var6++] = 0;
                            continue;
                        }
                        if (var498 == 3324) {
                            if (class181.field3258 >= 5 && class181.field3258 <= 9) {
                                class181.field3268[var6++] = class181.field3258;
                                continue;
                            }
                            class181.field3268[var6++] = 0;
                            continue;
                        }
                        if (var498 == 3325) {
                            class181.field3268[var6++] = class185.field3334 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3326) {
                            class181.field3268[var6++] = class77.field1449.field2231;
                            continue;
                        }
                        if (var498 == 3327) {
                            class181.field3268[var6++] = class77.field1449.field2226.field3476 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3328) {
                            class181.field3268[var6++] = class79.field1472 && !class236.field4137 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3329) {
                            class181.field3268[var6++] = class129.field2292 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3330) {
                            var6--;
                            int var448 = class181.field3268[var6];
                            class181.field3268[var6++] = class22.method127(var448, -123);
                            continue;
                        }
                        if (var498 == 3331) {
                            var6 -= 2;
                            int var449 = class181.field3268[var6];
                            int var450 = class181.field3268[var6 + 1];
                            class181.field3268[var6++] = class92.method673(var450, (byte) 11, var449, false);
                            continue;
                        }
                        if (var498 == 3332) {
                            var6 -= 2;
                            int var451 = class181.field3268[var6];
                            int var452 = class181.field3268[var6 + 1];
                            class181.field3268[var6++] = class92.method673(var452, (byte) 11, var451, true);
                            continue;
                        }
                        if (var498 == 3333) {
                            class181.field3268[var6++] = class14.field208;
                            continue;
                        }
                        if (var498 == 3335) {
                            class181.field3268[var6++] = class39.field588;
                            continue;
                        }
                        if (var498 == 3336) {
                            var6 -= 4;
                            int var453 = class181.field3268[var6 + 1];
                            int var454 = class181.field3268[var6];
                            int var455 = (var453 << 14) + var454;
                            int var456 = class181.field3268[var6 + 2];
                            int var457 = (var456 << 28) + var455;
                            int var458 = class181.field3268[var6 + 3];
                            int var459 = var457 + var458;
                            class181.field3268[var6++] = var459;
                            continue;
                        }
                        if (var498 == 3337) {
                            class181.field3268[var6++] = class216.field3807;
                            continue;
                        }
                    } else if (var498 < 3500) {
                        if (var498 == 3400) {
                            var6 -= 2;
                            int var409 = class181.field3268[var6];
                            int var410 = class181.field3268[var6 + 1];
                            class13 var411 = class150.method1072(var409, (byte) -113);
                            class276.field4939[var7++] = var411.method84(30, var410);
                            continue;
                        }
                        if (var498 == 3408) {
                            var6 -= 4;
                            int var412 = class181.field3268[var6];
                            int var413 = class181.field3268[var6 + 1];
                            int var414 = class181.field3268[var6 + 2];
                            int var415 = class181.field3268[var6 + 3];
                            class13 var416 = class150.method1072(var414, (byte) -126);
                            if (var416.field182 == var412 && var416.field190 == var413) {
                                if (var413 == 115) {
                                    class276.field4939[var7++] = var416.method84(arg1 + 22420, var415);
                                } else {
                                    class181.field3268[var6++] = var416.method80(var415, 107);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var498 == 3409) {
                            var6 -= 3;
                            int var417 = class181.field3268[var6 + 1];
                            int var418 = class181.field3268[var6];
                            int var419 = class181.field3268[var6 + 2];
                            if (var417 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class13 var420 = class150.method1072(var417, (byte) -119);
                            if (var420.field190 != var418) {
                                throw new RuntimeException("C3409-1");
                            }
                            class181.field3268[var6++] = var420.method87(arg1 + 22367, var419) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3410) {
                            var6--;
                            int var421 = class181.field3268[var6];
                            var7--;
                            class149 var422 = class276.field4939[var7];
                            if (var421 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class13 var423 = class150.method1072(var421, (byte) -125);
                            if (var423.field190 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class181.field3268[var6++] = var423.method75(true, var422) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3411) {
                            var6--;
                            int var424 = class181.field3268[var6];
                            class13 var425 = class150.method1072(var424, (byte) -124);
                            class181.field3268[var6++] = var425.field185.method637((byte) -107);
                            continue;
                        }
                    } else if (var498 < 3700) {
                        if (var498 == 3600) {
                            if (class172.field3173 == 0) {
                                class181.field3268[var6++] = -2;
                            } else if (class172.field3173 == 1) {
                                class181.field3268[var6++] = -1;
                            } else {
                                class181.field3268[var6++] = class49.field892;
                            }
                            continue;
                        }
                        if (var498 == 3601) {
                            var6--;
                            int var387 = class181.field3268[var6];
                            if (class172.field3173 == 2 && var387 < class49.field892) {
                                class276.field4939[var7++] = class217.field3822[var387];
                                continue;
                            }
                            class276.field4939[var7++] = class279.field4984;
                            continue;
                        }
                        if (var498 == 3602) {
                            var6--;
                            int var388 = class181.field3268[var6];
                            if (class172.field3173 == 2 && var388 < class49.field892) {
                                class181.field3268[var6++] = class64.field1139[var388];
                                continue;
                            }
                            class181.field3268[var6++] = 0;
                            continue;
                        }
                        if (var498 == 3603) {
                            var6--;
                            int var389 = class181.field3268[var6];
                            if (class172.field3173 == 2 && class49.field892 > var389) {
                                class181.field3268[var6++] = class94.field1656[var389];
                                continue;
                            }
                            class181.field3268[var6++] = 0;
                            continue;
                        }
                        if (var498 == 3604) {
                            var7--;
                            class149 var390 = class276.field4939[var7];
                            var6--;
                            int var391 = class181.field3268[var6];
                            class240.method1652(var390, (byte) -107, var391);
                            continue;
                        }
                        if (var498 == 3605) {
                            var7--;
                            class149 var392 = class276.field4939[var7];
                            class246.method1712(118, var392.method1023((byte) -16));
                            continue;
                        }
                        if (var498 == 3606) {
                            var7--;
                            class149 var393 = class276.field4939[var7];
                            class61.method386(-124, var393.method1023((byte) -16));
                            continue;
                        }
                        if (var498 == 3607) {
                            var7--;
                            class149 var394 = class276.field4939[var7];
                            class19.method110(var394.method1023((byte) -16), 0);
                            continue;
                        }
                        if (var498 == 3608) {
                            var7--;
                            class149 var395 = class276.field4939[var7];
                            class245.method1710(0, var395.method1023((byte) -16));
                            continue;
                        }
                        if (var498 == 3609) {
                            var7--;
                            class149 var396 = class276.field4939[var7];
                            if (var396.method1062(class126.field2213, arg1 ^ 0x571C) || var396.method1062(class25.field371, arg1 ^ 0x5722)) {
                                var396 = var396.method1025((byte) 34, 7);
                            }
                            class181.field3268[var6++] = class139.method966(true, var396) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3610) {
                            var6--;
                            int var397 = class181.field3268[var6];
                            if (class172.field3173 == 2 && class49.field892 > var397) {
                                class276.field4939[var7++] = class213.field3771[var397];
                                continue;
                            }
                            class276.field4939[var7++] = class279.field4984;
                            continue;
                        }
                        if (var498 == 3611) {
                            if (class275.field4917 == null) {
                                class276.field4939[var7++] = class279.field4984;
                            } else {
                                class276.field4939[var7++] = class275.field4917.method1022(arg1 + 22368);
                            }
                            continue;
                        }
                        if (var498 == 3612) {
                            if (class275.field4917 == null) {
                                class181.field3268[var6++] = 0;
                            } else {
                                class181.field3268[var6++] = class101.field1773;
                            }
                            continue;
                        }
                        if (var498 == 3613) {
                            var6--;
                            int var398 = class181.field3268[var6];
                            if (class275.field4917 != null && class101.field1773 > var398) {
                                class276.field4939[var7++] = class245.field4305[var398].field4993.method1022(0);
                                continue;
                            }
                            class276.field4939[var7++] = class279.field4984;
                            continue;
                        }
                        if (var498 == 3614) {
                            var6--;
                            int var399 = class181.field3268[var6];
                            if (class275.field4917 != null && class101.field1773 > var399) {
                                class181.field3268[var6++] = class245.field4305[var399].field4999;
                                continue;
                            }
                            class181.field3268[var6++] = 0;
                            continue;
                        }
                        if (var498 == 3615) {
                            var6--;
                            int var400 = class181.field3268[var6];
                            if (class275.field4917 != null && class101.field1773 > var400) {
                                class181.field3268[var6++] = class245.field4305[var400].field4991;
                                continue;
                            }
                            class181.field3268[var6++] = 0;
                            continue;
                        }
                        if (var498 == 3616) {
                            class181.field3268[var6++] = class152.field2766;
                            continue;
                        }
                        if (var498 == 3617) {
                            var7--;
                            class149 var401 = class276.field4939[var7];
                            class103.method726(119, var401);
                            continue;
                        }
                        if (var498 == 3618) {
                            class181.field3268[var6++] = class189.field3394;
                            continue;
                        }
                        if (var498 == 3619) {
                            var7--;
                            class149 var402 = class276.field4939[var7];
                            class288.method1975(var402.method1023((byte) -16), 117);
                            continue;
                        }
                        if (var498 == 3620) {
                            class85.method631((byte) 104);
                            continue;
                        }
                        if (var498 == 3621) {
                            if (class172.field3173 == 0) {
                                class181.field3268[var6++] = -1;
                            } else {
                                class181.field3268[var6++] = class16.field229;
                            }
                            continue;
                        }
                        if (var498 == 3622) {
                            var6--;
                            int var403 = class181.field3268[var6];
                            if (class172.field3173 != 0 && var403 < class16.field229) {
                                class276.field4939[var7++] = class258.method1780((byte) -72, class139.field2545[var403]).method1022(0);
                                continue;
                            }
                            class276.field4939[var7++] = class279.field4984;
                            continue;
                        }
                        if (var498 == 3623) {
                            var7--;
                            class149 var404 = class276.field4939[var7];
                            if (var404.method1062(class126.field2213, 113) || var404.method1062(class25.field371, arg1 + 22472)) {
                                var404 = var404.method1025((byte) 34, 7);
                            }
                            class181.field3268[var6++] = class194.method1320(0, var404) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3624) {
                            var6--;
                            int var405 = class181.field3268[var6];
                            if (class245.field4305 != null && var405 < class101.field1773 && class245.field4305[var405].field4993.method1048(82, class77.field1449.field2243)) {
                                class181.field3268[var6++] = 1;
                                continue;
                            }
                            class181.field3268[var6++] = 0;
                            continue;
                        }
                        if (var498 == 3625) {
                            if (class177.field3237 == null) {
                                class276.field4939[var7++] = class279.field4984;
                            } else {
                                class276.field4939[var7++] = class177.field3237.method1022(0);
                            }
                            continue;
                        }
                        if (var498 == 3626) {
                            var6--;
                            int var406 = class181.field3268[var6];
                            if (class275.field4917 != null && var406 < class101.field1773) {
                                class276.field4939[var7++] = class245.field4305[var406].field4996;
                                continue;
                            }
                            class276.field4939[var7++] = class279.field4984;
                            continue;
                        }
                        if (var498 == 3627) {
                            var6--;
                            int var407 = class181.field3268[var6];
                            if (class172.field3173 == 2 && var407 >= 0 && class49.field892 > var407) {
                                class181.field3268[var6++] = class116.field1984[var407] ? 1 : 0;
                                continue;
                            }
                            class181.field3268[var6++] = 0;
                            continue;
                        }
                        if (var498 == 3628) {
                            var7--;
                            class149 var408 = class276.field4939[var7];
                            if (var408.method1062(class126.field2213, 42) || var408.method1062(class25.field371, 116)) {
                                var408 = var408.method1025((byte) 34, 7);
                            }
                            class181.field3268[var6++] = class186.method1282(var408, (byte) 109);
                            continue;
                        }
                        if (var498 == 3629) {
                            class181.field3268[var6++] = class185.field3335;
                            continue;
                        }
                    } else if (var498 < 4000) {
                        if (var498 == 3903) {
                            var6--;
                            int var97 = class181.field3268[var6];
                            class181.field3268[var6++] = class267.field4760[var97].method219(-122);
                            continue;
                        }
                        if (var498 == 3904) {
                            var6--;
                            int var98 = class181.field3268[var6];
                            class181.field3268[var6++] = class267.field4760[var98].field557;
                            continue;
                        }
                        if (var498 == 3905) {
                            var6--;
                            int var99 = class181.field3268[var6];
                            class181.field3268[var6++] = class267.field4760[var99].field547;
                            continue;
                        }
                        if (var498 == 3906) {
                            var6--;
                            int var100 = class181.field3268[var6];
                            class181.field3268[var6++] = class267.field4760[var100].field549;
                            continue;
                        }
                        if (var498 == 3907) {
                            var6--;
                            int var101 = class181.field3268[var6];
                            class181.field3268[var6++] = class267.field4760[var101].field560;
                            continue;
                        }
                        if (var498 == 3908) {
                            var6--;
                            int var102 = class181.field3268[var6];
                            class181.field3268[var6++] = class267.field4760[var102].field543;
                            continue;
                        }
                        if (var498 == 3910) {
                            var6--;
                            int var103 = class181.field3268[var6];
                            int var104 = class267.field4760[var103].method215((byte) -118);
                            class181.field3268[var6++] = var104 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3911) {
                            var6--;
                            int var105 = class181.field3268[var6];
                            int var106 = class267.field4760[var105].method215((byte) -71);
                            class181.field3268[var6++] = var106 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3912) {
                            var6--;
                            int var107 = class181.field3268[var6];
                            int var108 = class267.field4760[var107].method215((byte) -116);
                            class181.field3268[var6++] = var108 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3913) {
                            var6--;
                            int var109 = class181.field3268[var6];
                            int var110 = class267.field4760[var109].method215((byte) -108);
                            class181.field3268[var6++] = var110 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var498 < 4100) {
                        if (var498 == 4000) {
                            var6 -= 2;
                            int var342 = class181.field3268[var6];
                            int var343 = class181.field3268[var6 + 1];
                            class181.field3268[var6++] = var342 + var343;
                            continue;
                        }
                        if (var498 == 4001) {
                            var6 -= 2;
                            int var344 = class181.field3268[var6];
                            int var345 = class181.field3268[var6 + 1];
                            class181.field3268[var6++] = var344 - var345;
                            continue;
                        }
                        if (var498 == 4002) {
                            var6 -= 2;
                            int var346 = class181.field3268[var6 + 1];
                            int var347 = class181.field3268[var6];
                            class181.field3268[var6++] = var346 * var347;
                            continue;
                        }
                        if (var498 == 4003) {
                            var6 -= 2;
                            int var348 = class181.field3268[var6];
                            int var349 = class181.field3268[var6 + 1];
                            class181.field3268[var6++] = var348 / var349;
                            continue;
                        }
                        if (var498 == 4004) {
                            var6--;
                            int var350 = class181.field3268[var6];
                            class181.field3268[var6++] = (int) ((double) var350 * Math.random());
                            continue;
                        }
                        if (var498 == 4005) {
                            var6--;
                            int var351 = class181.field3268[var6];
                            class181.field3268[var6++] = (int) ((double) (var351 + 1) * Math.random());
                            continue;
                        }
                        if (var498 == 4006) {
                            var6 -= 5;
                            int var352 = class181.field3268[var6];
                            int var353 = class181.field3268[var6 + 1];
                            int var354 = class181.field3268[var6 + 2];
                            int var355 = class181.field3268[var6 + 3];
                            int var356 = class181.field3268[var6 + 4];
                            class181.field3268[var6++] = (var356 - var354) * (var353 - var352) / (var355 - var354) + var352;
                            continue;
                        }
                        if (var498 == 4007) {
                            var6 -= 2;
                            long var357 = (long) class181.field3268[var6];
                            long var359 = (long) class181.field3268[var6 + 1];
                            class181.field3268[var6++] = (int) (var357 * var359 / 100L + var357);
                            continue;
                        }
                        if (var498 == 4008) {
                            var6 -= 2;
                            int var361 = class181.field3268[var6];
                            int var362 = class181.field3268[var6 + 1];
                            class181.field3268[var6++] = class40.method238(var361, 0x1 << var362);
                            continue;
                        }
                        if (var498 == 4009) {
                            var6 -= 2;
                            int var363 = class181.field3268[var6 + 1];
                            int var364 = class181.field3268[var6];
                            class181.field3268[var6++] = class136.method953(-(0x1 << var363) - 1, var364);
                            continue;
                        }
                        if (var498 == 4010) {
                            var6 -= 2;
                            int var365 = class181.field3268[var6];
                            int var366 = class181.field3268[var6 + 1];
                            class181.field3268[var6++] = class136.method953(0x1 << var366, var365) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var498 == 4011) {
                            var6 -= 2;
                            int var367 = class181.field3268[var6];
                            int var368 = class181.field3268[var6 + 1];
                            class181.field3268[var6++] = var367 % var368;
                            continue;
                        }
                        if (var498 == 4012) {
                            var6 -= 2;
                            int var369 = class181.field3268[var6 + 1];
                            int var370 = class181.field3268[var6];
                            if (var370 == 0) {
                                class181.field3268[var6++] = 0;
                            } else {
                                class181.field3268[var6++] = (int) Math.pow((double) var370, (double) var369);
                            }
                            continue;
                        }
                        if (var498 == 4013) {
                            var6 -= 2;
                            int var371 = class181.field3268[var6 + 1];
                            int var372 = class181.field3268[var6];
                            if (var372 == 0) {
                                class181.field3268[var6++] = 0;
                            } else if (var371 == 0) {
                                class181.field3268[var6++] = Integer.MAX_VALUE;
                            } else {
                                class181.field3268[var6++] = (int) Math.pow((double) var372, 1.0D / (double) var371);
                            }
                            continue;
                        }
                        if (var498 == 4014) {
                            var6 -= 2;
                            int var373 = class181.field3268[var6];
                            int var374 = class181.field3268[var6 + 1];
                            class181.field3268[var6++] = class136.method953(var373, var374);
                            continue;
                        }
                        if (var498 == 4015) {
                            var6 -= 2;
                            int var375 = class181.field3268[var6];
                            int var376 = class181.field3268[var6 + 1];
                            class181.field3268[var6++] = class40.method238(var375, var376);
                            continue;
                        }
                        if (var498 == 4016) {
                            var6 -= 2;
                            int var377 = class181.field3268[var6];
                            int var378 = class181.field3268[var6 + 1];
                            class181.field3268[var6++] = var377 < var378 ? var377 : var378;
                            continue;
                        }
                        if (var498 == 4017) {
                            var6 -= 2;
                            int var379 = class181.field3268[var6 + 1];
                            int var380 = class181.field3268[var6];
                            class181.field3268[var6++] = var379 < var380 ? var380 : var379;
                            continue;
                        }
                        if (var498 == 4018) {
                            var6 -= 3;
                            long var381 = (long) class181.field3268[var6];
                            long var383 = (long) class181.field3268[var6 + 1];
                            long var385 = (long) class181.field3268[var6 + 2];
                            class181.field3268[var6++] = (int) (var381 * var385 / var383);
                            continue;
                        }
                    } else if (var498 < 4200) {
                        if (var498 == 4100) {
                            var7--;
                            class149 var111 = class276.field4939[var7];
                            var6--;
                            int var112 = class181.field3268[var6];
                            class276.field4939[var7++] = class237.method1603(new class149[] { var111, class211.method1434(var112, true) }, class85.method629(arg1, 22317));
                            continue;
                        }
                        if (var498 == 4101) {
                            var7 -= 2;
                            class149 var113 = class276.field4939[var7];
                            class149 var114 = class276.field4939[var7 + 1];
                            class276.field4939[var7++] = class237.method1603(new class149[] { var113, var114 }, -101);
                            continue;
                        }
                        if (var498 == 4102) {
                            var7--;
                            class149 var115 = class276.field4939[var7];
                            var6--;
                            int var116 = class181.field3268[var6];
                            class276.field4939[var7++] = class237.method1603(new class149[] { var115, class251.method1740(var116, true, true) }, -115);
                            continue;
                        }
                        if (var498 == 4103) {
                            var7--;
                            class149 var117 = class276.field4939[var7];
                            class276.field4939[var7++] = var117.method1018(arg1 + 30606);
                            continue;
                        }
                        if (var498 == 4104) {
                            var6--;
                            int var118 = class181.field3268[var6];
                            long var119 = ((long) var118 + 11745L) * 86400000L;
                            class40.field622.setTime(new Date(var119));
                            int var121 = class40.field622.get(5);
                            int var122 = class40.field622.get(2);
                            int var123 = class40.field622.get(1);
                            class276.field4939[var7++] = class237.method1603(new class149[] { class211.method1434(var121, true), class288.field5135, class119.field2037[var122], class288.field5135, class211.method1434(var123, true) }, -128);
                            continue;
                        }
                        if (var498 == 4105) {
                            var7 -= 2;
                            class149 var124 = class276.field4939[var7 + 1];
                            class149 var125 = class276.field4939[var7];
                            if (class77.field1449.field2226 != null && class77.field1449.field2226.field3476) {
                                class276.field4939[var7++] = var124;
                                continue;
                            }
                            class276.field4939[var7++] = var125;
                            continue;
                        }
                        if (var498 == 4106) {
                            var6--;
                            int var126 = class181.field3268[var6];
                            class276.field4939[var7++] = class211.method1434(var126, true);
                            continue;
                        }
                        if (var498 == 4107) {
                            var7 -= 2;
                            class181.field3268[var6++] = class276.field4939[var7].method1056(class276.field4939[var7 + 1], (byte) -16);
                            continue;
                        }
                        if (var498 == 4108) {
                            var6 -= 2;
                            var7--;
                            class149 var127 = class276.field4939[var7];
                            int var128 = class181.field3268[var6];
                            int var129 = class181.field3268[var6 + 1];
                            class181.field3268[var6++] = class259.method1785(arg1 + 21040, var129).method1150(var127, var128);
                            continue;
                        }
                        if (var498 == 4109) {
                            var6 -= 2;
                            var7--;
                            class149 var130 = class276.field4939[var7];
                            int var131 = class181.field3268[var6 + 1];
                            int var132 = class181.field3268[var6];
                            class181.field3268[var6++] = class259.method1785(-1328, var131).method1152(var130, var132);
                            continue;
                        }
                        if (var498 == 4110) {
                            var7 -= 2;
                            class149 var133 = class276.field4939[var7];
                            class149 var134 = class276.field4939[var7 + 1];
                            var6--;
                            if (class181.field3268[var6] == 1) {
                                class276.field4939[var7++] = var133;
                            } else {
                                class276.field4939[var7++] = var134;
                            }
                            continue;
                        }
                        if (var498 == 4111) {
                            var7--;
                            class149 var135 = class276.field4939[var7];
                            class276.field4939[var7++] = class160.method1172(var135);
                            continue;
                        }
                        if (var498 == 4112) {
                            var7--;
                            class149 var136 = class276.field4939[var7];
                            var6--;
                            int var137 = class181.field3268[var6];
                            if (var137 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class276.field4939[var7++] = var136.method1043(var137, -35);
                            continue;
                        }
                        if (var498 == 4113) {
                            var6--;
                            int var138 = class181.field3268[var6];
                            class181.field3268[var6++] = class222.method1497(var138, true) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4114) {
                            var6--;
                            int var139 = class181.field3268[var6];
                            class181.field3268[var6++] = class213.method1445(var139, 5) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4115) {
                            var6--;
                            int var140 = class181.field3268[var6];
                            class181.field3268[var6++] = class129.method899(-117, var140) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4116) {
                            var6--;
                            int var141 = class181.field3268[var6];
                            class181.field3268[var6++] = class38.method224(var141, (byte) -105) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4117) {
                            var7--;
                            class149 var142 = class276.field4939[var7];
                            if (var142 == null) {
                                class181.field3268[var6++] = 0;
                            } else {
                                class181.field3268[var6++] = var142.method1053((byte) -126);
                            }
                            continue;
                        }
                        if (var498 == 4118) {
                            var6 -= 2;
                            var7--;
                            class149 var143 = class276.field4939[var7];
                            int var144 = class181.field3268[var6 + 1];
                            int var145 = class181.field3268[var6];
                            class276.field4939[var7++] = var143.method1024(var145, -5975, var144);
                            continue;
                        }
                        if (var498 == 4119) {
                            var7--;
                            class149 var146 = class276.field4939[var7];
                            class149 var147 = class167.method1215((byte) -93, var146.method1053((byte) 121));
                            boolean var148 = false;
                            for (int var149 = 0; var146.method1053((byte) -120) > var149; var149++) {
                                int var150 = var146.method1021(var149, -3);
                                if (var150 == 60) {
                                    var148 = true;
                                } else if (var150 == 62) {
                                    var148 = false;
                                } else if (!var148) {
                                    var147.method1060(arg1 + 22304, var150);
                                }
                            }
                            var147.method1042((byte) -96);
                            class276.field4939[var7++] = var147;
                            continue;
                        }
                        if (var498 == 4120) {
                            var6 -= 2;
                            var7--;
                            class149 var151 = class276.field4939[var7];
                            int var152 = class181.field3268[var6 + 1];
                            int var153 = class181.field3268[var6];
                            class181.field3268[var6++] = var151.method1050(true, var153, var152);
                            continue;
                        }
                        if (var498 == 4121) {
                            var7 -= 2;
                            class149 var154 = class276.field4939[var7];
                            var6--;
                            int var155 = class181.field3268[var6];
                            class149 var156 = class276.field4939[var7 + 1];
                            class181.field3268[var6++] = var154.method1055(var156, 9274, var155);
                            continue;
                        }
                        if (var498 == 4122) {
                            var6--;
                            int var157 = class181.field3268[var6];
                            class181.field3268[var6++] = class146.method1005(var157, 102);
                            continue;
                        }
                        if (var498 == 4123) {
                            var6--;
                            int var158 = class181.field3268[var6];
                            class181.field3268[var6++] = class69.method437(var158, (byte) -125);
                            continue;
                        }
                        if (var498 == 4124) {
                            var6--;
                            boolean var159 = class181.field3268[var6] != 0;
                            var6--;
                            int var160 = class181.field3268[var6];
                            class276.field4939[var7++] = class227.method1525((long) var160, class39.field588, 0, (byte) 118, var159);
                            continue;
                        }
                    } else if (var498 < 4300) {
                        if (var498 == 4200) {
                            var6--;
                            int var323 = class181.field3268[var6];
                            class276.field4939[var7++] = class226.method1516(var323, arg1 - 5954).field4604;
                            continue;
                        }
                        if (var498 == 4201) {
                            var6 -= 2;
                            int var324 = class181.field3268[var6 + 1];
                            int var325 = class181.field3268[var6];
                            class261 var326 = class226.method1516(var325, -28322);
                            if (var324 >= 1 && var324 <= 5 && var326.field4614[var324 - 1] != null) {
                                class276.field4939[var7++] = var326.field4614[var324 - 1];
                                continue;
                            }
                            class276.field4939[var7++] = class279.field4984;
                            continue;
                        }
                        if (var498 == 4202) {
                            var6 -= 2;
                            int var327 = class181.field3268[var6];
                            int var328 = class181.field3268[var6 + 1];
                            class261 var329 = class226.method1516(var327, -28322);
                            if (var328 >= 1 && var328 <= 5 && var329.field4658[var328 - 1] != null) {
                                class276.field4939[var7++] = var329.field4658[var328 - 1];
                                continue;
                            }
                            class276.field4939[var7++] = class279.field4984;
                            continue;
                        }
                        if (var498 == 4203) {
                            var6--;
                            int var330 = class181.field3268[var6];
                            class181.field3268[var6++] = class226.method1516(var330, -28322).field4593;
                            continue;
                        }
                        if (var498 == 4204) {
                            var6--;
                            int var331 = class181.field3268[var6];
                            class181.field3268[var6++] = class226.method1516(var331, -28322).field4645 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4205) {
                            var6--;
                            int var332 = class181.field3268[var6];
                            class261 var333 = class226.method1516(var332, -28322);
                            if (var333.field4607 == -1 && var333.field4597 >= 0) {
                                class181.field3268[var6++] = var333.field4597;
                                continue;
                            }
                            class181.field3268[var6++] = var332;
                            continue;
                        }
                        if (var498 == 4206) {
                            var6--;
                            int var334 = class181.field3268[var6];
                            class261 var335 = class226.method1516(var334, -28322);
                            if (var335.field4607 >= 0 && var335.field4597 >= 0) {
                                class181.field3268[var6++] = var335.field4597;
                                continue;
                            }
                            class181.field3268[var6++] = var334;
                            continue;
                        }
                        if (var498 == 4207) {
                            var6--;
                            int var336 = class181.field3268[var6];
                            class181.field3268[var6++] = class226.method1516(var336, -28322).field4591 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4208) {
                            var6 -= 2;
                            int var337 = class181.field3268[var6 + 1];
                            int var338 = class181.field3268[var6];
                            class49 var339 = class138.method964(-84, var337);
                            if (var339.method312(-13492)) {
                                class276.field4939[var7++] = class226.method1516(var338, arg1 - 5954).method1819(var337, var339.field891, arg1 + 31462);
                            } else {
                                class181.field3268[var6++] = class226.method1516(var338, -28322).method1808(var339.field882, var337, (byte) -123);
                            }
                            continue;
                        }
                        if (var498 == 4210) {
                            var7--;
                            class149 var340 = class276.field4939[var7];
                            var6--;
                            int var341 = class181.field3268[var6];
                            class80.method602(var340, var341 == 1, 21105);
                            class181.field3268[var6++] = class228.field3997;
                            continue;
                        }
                        if (var498 == 4211) {
                            if (class151.field2753 != null && class196.field3516 < class228.field3997) {
                                class181.field3268[var6++] = class136.method953(class151.field2753[class196.field3516++], 65535);
                                continue;
                            }
                            class181.field3268[var6++] = -1;
                            continue;
                        }
                        if (var498 == 4212) {
                            class196.field3516 = 0;
                            continue;
                        }
                    } else if (var498 < 4400) {
                        if (var498 == 4300) {
                            var6 -= 2;
                            int var161 = class181.field3268[var6 + 1];
                            int var162 = class181.field3268[var6];
                            class49 var163 = class138.method964(-110, var161);
                            if (var163.method312(-13492)) {
                                class276.field4939[var7++] = class98.method712(var162, -6).method364(var163.field891, var161, 3);
                            } else {
                                class181.field3268[var6++] = class98.method712(var162, 86).method367(var161, var163.field882, class85.method629(arg1, 22367));
                            }
                            continue;
                        }
                    } else if (var498 >= 4500) {
                        if (var498 < 4600) {
                            if (var498 == 4500) {
                                var6 -= 2;
                                int var164 = class181.field3268[var6];
                                int var165 = class181.field3268[var6 + 1];
                                class49 var166 = class138.method964(-87, var165);
                                if (var166.method312(arg1 ^ 0x63EC)) {
                                    class276.field4939[var7++] = class39.method233(arg1 + 22477, var164).method423((byte) -122, var165, var166.field891);
                                } else {
                                    class181.field3268[var6++] = class39.method233(60, var164).method420(class85.method629(arg1, -22368), var166.field882, var165);
                                }
                                continue;
                            }
                        } else if (var498 < 5100) {
                            if (var498 == 5000) {
                                class181.field3268[var6++] = class198.field3591;
                                continue;
                            }
                            if (var498 == 5001) {
                                class219.field3859++;
                                var6 -= 3;
                                class198.field3591 = class181.field3268[var6];
                                class128.field2268 = class181.field3268[var6 + 1];
                                class44.field675 = class181.field3268[var6 + 2];
                                class208.field3720.method162(2, 157);
                                class208.field3720.method494((byte) 4, class198.field3591);
                                class208.field3720.method494((byte) 4, class128.field2268);
                                class208.field3720.method494((byte) 4, class44.field675);
                                continue;
                            }
                            if (var498 == 5002) {
                                var6 -= 2;
                                class65.field1161++;
                                var7--;
                                class149 var167 = class276.field4939[var7];
                                int var168 = class181.field3268[var6];
                                int var169 = class181.field3268[var6 + 1];
                                class208.field3720.method162(2, 99);
                                class208.field3720.method496(2, var167.method1023((byte) -16));
                                class208.field3720.method494((byte) 4, var168 - 1);
                                class208.field3720.method494((byte) 4, var169);
                                continue;
                            }
                            if (var498 == 5003) {
                                var6--;
                                int var170 = class181.field3268[var6];
                                class149 var171 = null;
                                if (var170 < 100) {
                                    var171 = class227.field3973[var170];
                                }
                                if (var171 == null) {
                                    var171 = class279.field4984;
                                }
                                class276.field4939[var7++] = var171;
                                continue;
                            }
                            if (var498 == 5004) {
                                var6--;
                                int var172 = class181.field3268[var6];
                                int var173 = -1;
                                if (var172 < 100 && class227.field3973[var172] != null) {
                                    var173 = class109.field1886[var172];
                                }
                                class181.field3268[var6++] = var173;
                                continue;
                            }
                            if (var498 == 5005) {
                                class181.field3268[var6++] = class128.field2268;
                                continue;
                            }
                            if (var498 == 5008) {
                                var7--;
                                class149 var174 = class276.field4939[var7];
                                if (var174.method1062(class110.field1894, arg1 ^ 0x5727)) {
                                    class9.method46(var174, 12);
                                    continue;
                                }
                                if (class258.field4519 == 0 && (class79.field1472 && !class236.field4137 || class129.field2292)) {
                                    continue;
                                }
                                class261.field4666++;
                                class149 var175 = var174.method1018(8238);
                                byte var176 = 0;
                                byte var177 = 0;
                                if (var175.method1062(class148.field2663, -121)) {
                                    var177 = 0;
                                    var174 = var174.method1025((byte) 34, class148.field2663.method1053((byte) -104));
                                } else if (var175.method1062(class284.field5022, -108)) {
                                    var177 = 1;
                                    var174 = var174.method1025((byte) 34, class284.field5022.method1053((byte) 70));
                                } else if (var175.method1062(class233.field4109, 63)) {
                                    var177 = 2;
                                    var174 = var174.method1025((byte) 34, class233.field4109.method1053((byte) 44));
                                } else if (var175.method1062(class96.field1691, -78)) {
                                    var177 = 3;
                                    var174 = var174.method1025((byte) 34, class96.field1691.method1053((byte) 44));
                                } else if (var175.method1062(class133.field2421, 36)) {
                                    var177 = 4;
                                    var174 = var174.method1025((byte) 34, class133.field2421.method1053((byte) -113));
                                } else if (var175.method1062(class68.field1184, 103)) {
                                    var174 = var174.method1025((byte) 34, class68.field1184.method1053((byte) -114));
                                    var177 = 5;
                                } else if (var175.method1062(class257.field4502, -70)) {
                                    var174 = var174.method1025((byte) 34, class257.field4502.method1053((byte) -118));
                                    var177 = 6;
                                } else if (var175.method1062(class226.field3961, 113)) {
                                    var177 = 7;
                                    var174 = var174.method1025((byte) 34, class226.field3961.method1053((byte) 75));
                                } else if (var175.method1062(class288.field5145, 30)) {
                                    var177 = 8;
                                    var174 = var174.method1025((byte) 34, class288.field5145.method1053((byte) -113));
                                } else if (var175.method1062(class264.field4729, -63)) {
                                    var177 = 9;
                                    var174 = var174.method1025((byte) 34, class264.field4729.method1053((byte) -112));
                                } else if (var175.method1062(class176.field3223, -94)) {
                                    var177 = 10;
                                    var174 = var174.method1025((byte) 34, class176.field3223.method1053((byte) 20));
                                } else if (var175.method1062(class139.field2534, -122)) {
                                    var174 = var174.method1025((byte) 34, class139.field2534.method1053((byte) -128));
                                    var177 = 11;
                                } else if (class39.field588 != 0) {
                                    if (var175.method1062(class148.field2664, arg1 + 22299)) {
                                        var174 = var174.method1025((byte) 34, class148.field2664.method1053((byte) 115));
                                        var177 = 0;
                                    } else if (var175.method1062(class284.field5031, -73)) {
                                        var177 = 1;
                                        var174 = var174.method1025((byte) 34, class284.field5031.method1053((byte) 14));
                                    } else if (var175.method1062(class233.field4108, arg1 ^ 0xFFFFA8BC)) {
                                        var177 = 2;
                                        var174 = var174.method1025((byte) 34, class233.field4108.method1053((byte) -111));
                                    } else if (var175.method1062(class96.field1699, arg1 + 22457)) {
                                        var174 = var174.method1025((byte) 34, class96.field1699.method1053((byte) -124));
                                        var177 = 3;
                                    } else if (var175.method1062(class133.field2419, -89)) {
                                        var174 = var174.method1025((byte) 34, class133.field2419.method1053((byte) -126));
                                        var177 = 4;
                                    } else if (var175.method1062(class68.field1190, -92)) {
                                        var174 = var174.method1025((byte) 34, class68.field1190.method1053((byte) 53));
                                        var177 = 5;
                                    } else if (var175.method1062(class257.field4495, 33)) {
                                        var174 = var174.method1025((byte) 34, class257.field4495.method1053((byte) -115));
                                        var177 = 6;
                                    } else if (var175.method1062(class226.field3962, arg1 + 22266)) {
                                        var177 = 7;
                                        var174 = var174.method1025((byte) 34, class226.field3962.method1053((byte) 15));
                                    } else if (var175.method1062(class288.field5142, 35)) {
                                        var174 = var174.method1025((byte) 34, class288.field5142.method1053((byte) -114));
                                        var177 = 8;
                                    } else if (var175.method1062(class264.field4724, -102)) {
                                        var177 = 9;
                                        var174 = var174.method1025((byte) 34, class264.field4724.method1053((byte) 38));
                                    } else if (var175.method1062(class176.field3227, 21)) {
                                        var177 = 10;
                                        var174 = var174.method1025((byte) 34, class176.field3227.method1053((byte) -106));
                                    } else if (var175.method1062(class139.field2540, -56)) {
                                        var174 = var174.method1025((byte) 34, class139.field2540.method1053((byte) -128));
                                        var177 = 11;
                                    }
                                }
                                class149 var178 = var174.method1018(8238);
                                if (var178.method1062(class161.field2981, 53)) {
                                    var174 = var174.method1025((byte) 34, class161.field2981.method1053((byte) -18));
                                    var176 = 1;
                                } else if (var178.method1062(class275.field4920, -108)) {
                                    var174 = var174.method1025((byte) 34, class275.field4920.method1053((byte) -104));
                                    var176 = 2;
                                } else if (var178.method1062(class101.field1789, arg1 ^ 0x5717)) {
                                    var174 = var174.method1025((byte) 34, class101.field1789.method1053((byte) 59));
                                    var176 = 3;
                                } else if (var178.method1062(class198.field3602, 91)) {
                                    var176 = 4;
                                    var174 = var174.method1025((byte) 34, class198.field3602.method1053((byte) -119));
                                } else if (var178.method1062(class115.field1971, -92)) {
                                    var176 = 5;
                                    var174 = var174.method1025((byte) 34, class115.field1971.method1053((byte) -128));
                                } else if (class39.field588 != 0) {
                                    if (var178.method1062(class161.field2994, 26)) {
                                        var174 = var174.method1025((byte) 34, class161.field2994.method1053((byte) 41));
                                        var176 = 1;
                                    } else if (var178.method1062(class275.field4922, 117)) {
                                        var176 = 2;
                                        var174 = var174.method1025((byte) 34, class275.field4922.method1053((byte) -109));
                                    } else if (var178.method1062(class101.field1775, -56)) {
                                        var174 = var174.method1025((byte) 34, class101.field1775.method1053((byte) 103));
                                        var176 = 3;
                                    } else if (var178.method1062(class198.field3590, arg1 + 22427)) {
                                        var174 = var174.method1025((byte) 34, class198.field3590.method1053((byte) 83));
                                        var176 = 4;
                                    } else if (var178.method1062(class115.field1965, arg1 + 22412)) {
                                        var174 = var174.method1025((byte) 34, class115.field1965.method1053((byte) -126));
                                        var176 = 5;
                                    }
                                }
                                class208.field3720.method162(2, 237);
                                class208.field3720.method494((byte) 4, 0);
                                int var179 = class208.field3720.field1340;
                                class208.field3720.method494((byte) 4, var177);
                                class208.field3720.method494((byte) 4, var176);
                                class233.method1571(arg1 + 22265, var174, class208.field3720);
                                class208.field3720.method521(arg1 ^ 0xFFFFA8DC, class208.field3720.field1340 - var179);
                                continue;
                            }
                            if (var498 == 5009) {
                                var7 -= 2;
                                class149 var180 = class276.field4939[var7];
                                class149 var181 = class276.field4939[var7 + 1];
                                if (class258.field4519 != 0 || (!class79.field1472 || class236.field4137) && !class129.field2292) {
                                    class208.field3720.method162(2, 201);
                                    class31.field464++;
                                    class208.field3720.method494((byte) 4, 0);
                                    int var182 = class208.field3720.field1340;
                                    class208.field3720.method496(2, var180.method1023((byte) -16));
                                    class233.method1571(-64, var181, class208.field3720);
                                    class208.field3720.method521(127, class208.field3720.field1340 - var182);
                                }
                                continue;
                            }
                            if (var498 == 5010) {
                                var6--;
                                int var183 = class181.field3268[var6];
                                class149 var184 = null;
                                if (var183 < 100) {
                                    var184 = class116.field1992[var183];
                                }
                                if (var184 == null) {
                                    var184 = class279.field4984;
                                }
                                class276.field4939[var7++] = var184;
                                continue;
                            }
                            if (var498 == 5011) {
                                class149 var185 = null;
                                var6--;
                                int var186 = class181.field3268[var6];
                                if (var186 < 100) {
                                    var185 = class188.field3372[var186];
                                }
                                if (var185 == null) {
                                    var185 = class279.field4984;
                                }
                                class276.field4939[var7++] = var185;
                                continue;
                            }
                            if (var498 == 5012) {
                                var6--;
                                int var187 = class181.field3268[var6];
                                int var188 = -1;
                                if (var187 < 100) {
                                    var188 = class168.field3126[var187];
                                }
                                class181.field3268[var6++] = var188;
                                continue;
                            }
                            if (var498 == 5015) {
                                class149 var189;
                                if (class77.field1449 == null || class77.field1449.field2243 == null) {
                                    var189 = class171.field3155;
                                } else {
                                    var189 = class77.field1449.method890(-14756);
                                }
                                class276.field4939[var7++] = var189;
                                continue;
                            }
                            if (var498 == 5016) {
                                class181.field3268[var6++] = class44.field675;
                                continue;
                            }
                            if (var498 == 5017) {
                                class181.field3268[var6++] = class189.field3389;
                                continue;
                            }
                            if (var498 == 5050) {
                                var6--;
                                int var190 = class181.field3268[var6];
                                class276.field4939[var7++] = class154.method1093((byte) 116, var190).field1364;
                                continue;
                            }
                            if (var498 == 5051) {
                                var6--;
                                int var191 = class181.field3268[var6];
                                class75 var192 = class154.method1093((byte) -79, var191);
                                if (var192.field1358 == null) {
                                    class181.field3268[var6++] = 0;
                                } else {
                                    class181.field3268[var6++] = var192.field1358.length;
                                }
                                continue;
                            }
                            if (var498 == 5052) {
                                var6 -= 2;
                                int var193 = class181.field3268[var6];
                                int var194 = class181.field3268[var6 + 1];
                                class75 var195 = class154.method1093((byte) 112, var193);
                                int var196 = var195.field1358[var194];
                                class181.field3268[var6++] = var196;
                                continue;
                            }
                            if (var498 == 5053) {
                                var6--;
                                int var197 = class181.field3268[var6];
                                class75 var198 = class154.method1093((byte) 118, var197);
                                if (var198.field1361 == null) {
                                    class181.field3268[var6++] = 0;
                                } else {
                                    class181.field3268[var6++] = var198.field1361.length;
                                }
                                continue;
                            }
                            if (var498 == 5054) {
                                var6 -= 2;
                                int var199 = class181.field3268[var6];
                                int var200 = class181.field3268[var6 + 1];
                                class181.field3268[var6++] = class154.method1093((byte) -84, var199).field1361[var200];
                                continue;
                            }
                            if (var498 == 5055) {
                                var6--;
                                int var201 = class181.field3268[var6];
                                class276.field4939[var7++] = class90.method662(var201, -32769).method1699(false);
                                continue;
                            }
                            if (var498 == 5056) {
                                var6--;
                                int var202 = class181.field3268[var6];
                                class244 var203 = class90.method662(var202, -32769);
                                if (var203.field4286 == null) {
                                    class181.field3268[var6++] = 0;
                                } else {
                                    class181.field3268[var6++] = var203.field4286.length;
                                }
                                continue;
                            }
                            if (var498 == 5057) {
                                var6 -= 2;
                                int var204 = class181.field3268[var6 + 1];
                                int var205 = class181.field3268[var6];
                                class181.field3268[var6++] = class90.method662(var205, class85.method629(arg1, 55135)).field4286[var204];
                                continue;
                            }
                            if (var498 == 5058) {
                                class7.field82 = new class236();
                                var6--;
                                class7.field82.field4136 = class181.field3268[var6];
                                class7.field82.field4144 = class90.method662(class7.field82.field4136, -32769);
                                class7.field82.field4140 = new int[class7.field82.field4144.method1697(arg1 ^ 0xFFFFA8F6)];
                                continue;
                            }
                            if (var498 == 5059) {
                                class208.field3720.method162(2, 167);
                                class246.field4319++;
                                class208.field3720.method494((byte) 4, 0);
                                int var206 = class208.field3720.field1340;
                                class208.field3720.method494((byte) 4, 0);
                                class208.field3720.method518(16711680, class7.field82.field4136);
                                class7.field82.field4144.method1693(arg1 ^ 0x395B, class208.field3720, class7.field82.field4140);
                                class208.field3720.method521(arg1 ^ 0xFFFFA8DF, class208.field3720.field1340 - var206);
                                continue;
                            }
                            if (var498 == 5060) {
                                class224.field3937++;
                                var7--;
                                class149 var207 = class276.field4939[var7];
                                class208.field3720.method162(2, 178);
                                class208.field3720.method494((byte) 4, 0);
                                int var208 = class208.field3720.field1340;
                                class208.field3720.method496(2, var207.method1023((byte) -16));
                                class208.field3720.method518(arg1 + 16734048, class7.field82.field4136);
                                class7.field82.field4144.method1693(-28165, class208.field3720, class7.field82.field4140);
                                class208.field3720.method521(123, class208.field3720.field1340 - var208);
                                continue;
                            }
                            if (var498 == 5061) {
                                class208.field3720.method162(2, 167);
                                class208.field3720.method494((byte) 4, 0);
                                int var209 = class208.field3720.field1340;
                                class246.field4319++;
                                class208.field3720.method494((byte) 4, 1);
                                class208.field3720.method518(16711680, class7.field82.field4136);
                                class7.field82.field4144.method1693(-28165, class208.field3720, class7.field82.field4140);
                                class208.field3720.method521(122, class208.field3720.field1340 - var209);
                                continue;
                            }
                            if (var498 == 5062) {
                                var6 -= 2;
                                int var210 = class181.field3268[var6];
                                int var211 = class181.field3268[var6 + 1];
                                class181.field3268[var6++] = class154.method1093((byte) 11, var210).field1352[var211];
                                continue;
                            }
                            if (var498 == 5063) {
                                var6 -= 2;
                                int var212 = class181.field3268[var6 + 1];
                                int var213 = class181.field3268[var6];
                                class181.field3268[var6++] = class154.method1093((byte) 121, var213).field1350[var212];
                                continue;
                            }
                            if (var498 == 5064) {
                                var6 -= 2;
                                int var214 = class181.field3268[var6];
                                int var215 = class181.field3268[var6 + 1];
                                if (var215 == -1) {
                                    class181.field3268[var6++] = -1;
                                } else {
                                    class181.field3268[var6++] = class154.method1093((byte) 97, var214).method541(64, var215);
                                }
                                continue;
                            }
                            if (var498 == 5065) {
                                var6 -= 2;
                                int var216 = class181.field3268[var6];
                                int var217 = class181.field3268[var6 + 1];
                                if (var217 == -1) {
                                    class181.field3268[var6++] = -1;
                                } else {
                                    class181.field3268[var6++] = class154.method1093((byte) 115, var216).method543(var217, -64);
                                }
                                continue;
                            }
                            if (var498 == 5066) {
                                var6--;
                                int var218 = class181.field3268[var6];
                                class181.field3268[var6++] = class90.method662(var218, class85.method629(arg1, 55135)).method1697(92);
                                continue;
                            }
                            if (var498 == 5067) {
                                var6 -= 2;
                                int var219 = class181.field3268[var6];
                                int var220 = class181.field3268[var6 + 1];
                                int var221 = class90.method662(var219, arg1 - 10401).method1700(var220, arg1 + 51171);
                                class181.field3268[var6++] = var221;
                                continue;
                            }
                            if (var498 == 5068) {
                                var6 -= 2;
                                int var222 = class181.field3268[var6];
                                int var223 = class181.field3268[var6 + 1];
                                class7.field82.field4140[var222] = var223;
                                continue;
                            }
                            if (var498 == 5069) {
                                var6 -= 2;
                                int var224 = class181.field3268[var6];
                                int var225 = class181.field3268[var6 + 1];
                                class7.field82.field4140[var224] = var225;
                                continue;
                            }
                            if (var498 == 5070) {
                                var6 -= 3;
                                int var226 = class181.field3268[var6];
                                int var227 = class181.field3268[var6 + 1];
                                int var228 = class181.field3268[var6 + 2];
                                class244 var229 = class90.method662(var226, -32769);
                                if (var229.method1700(var227, 28803) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class181.field3268[var6++] = var229.method1703(var228, false, var227);
                                continue;
                            }
                            if (var498 == 5071) {
                                var7--;
                                class149 var230 = class276.field4939[var7];
                                var6--;
                                boolean var231 = class181.field3268[var6] == 1;
                                class35.method202((byte) 76, var230, var231);
                                class181.field3268[var6++] = class228.field3997;
                                continue;
                            }
                            if (var498 == 5072) {
                                if (class151.field2753 != null && class196.field3516 < class228.field3997) {
                                    class181.field3268[var6++] = class136.method953(65535, class151.field2753[class196.field3516++]);
                                    continue;
                                }
                                class181.field3268[var6++] = -1;
                                continue;
                            }
                            if (var498 == 5073) {
                                class196.field3516 = 0;
                                continue;
                            }
                        } else if (var498 < 5200) {
                            if (var498 == 5100) {
                                if (class131.field2312[86]) {
                                    class181.field3268[var6++] = 1;
                                } else {
                                    class181.field3268[var6++] = 0;
                                }
                                continue;
                            }
                            if (var498 == 5101) {
                                if (class131.field2312[82]) {
                                    class181.field3268[var6++] = 1;
                                } else {
                                    class181.field3268[var6++] = 0;
                                }
                                continue;
                            }
                            if (var498 == 5102) {
                                if (class131.field2312[81]) {
                                    class181.field3268[var6++] = 1;
                                } else {
                                    class181.field3268[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var498 < 5300) {
                            if (var498 == 5200) {
                                var6--;
                                class104.method739(class181.field3268[var6], true);
                                continue;
                            }
                            if (var498 == 5201) {
                                class181.field3268[var6++] = class156.method1121(arg1 + 22473);
                                continue;
                            }
                            if (var498 == 5202) {
                                var6--;
                                class242.method1688((byte) 95, class181.field3268[var6]);
                                continue;
                            }
                            if (var498 == 5203) {
                                var7--;
                                class57.method355(class276.field4939[var7], (byte) 77);
                                continue;
                            }
                            if (var498 == 5204) {
                                class276.field4939[var7 - 1] = class197.method1348(class276.field4939[var7 - 1], -1);
                                continue;
                            }
                            if (var498 == 5205) {
                                var7--;
                                class110.method782(-1, class276.field4939[var7]);
                                continue;
                            }
                            if (var498 == 5206) {
                                var6--;
                                int var232 = class181.field3268[var6];
                                class24 var233 = class207.method1413(19451, (var232 & 0xFFFEE0D) >> 14, var232 & 0x3FFF);
                                if (var233 == null) {
                                    class276.field4939[var7++] = class279.field4984;
                                } else {
                                    class276.field4939[var7++] = var233.field363;
                                }
                                continue;
                            }
                            if (var498 == 5207) {
                                var7--;
                                class24 var234 = class199.method1359(-23, class276.field4939[var7]);
                                if (var234 != null && var234.field362 != null) {
                                    class276.field4939[var7++] = var234.field362;
                                    continue;
                                }
                                class276.field4939[var7++] = class279.field4984;
                                continue;
                            }
                            if (var498 == 5208) {
                                class181.field3268[var6++] = class60.field1083;
                                class181.field3268[var6++] = class279.field4979;
                                continue;
                            }
                            if (var498 == 5209) {
                                class181.field3268[var6++] = class80.field1480 + class106.field1840;
                                class181.field3268[var6++] = class287.field5086 + class91.field1615 - class163.field3019 - 1;
                                continue;
                            }
                            if (var498 == 5210) {
                                class24 var235 = class62.method389(23410);
                                if (var235 == null) {
                                    class181.field3268[var6++] = 0;
                                    class181.field3268[var6++] = 0;
                                } else {
                                    class181.field3268[var6++] = var235.field360 * 64;
                                    class181.field3268[var6++] = var235.field361 * 64;
                                }
                                continue;
                            }
                            if (var498 == 5211) {
                                class24 var236 = class62.method389(23410);
                                if (var236 == null) {
                                    class181.field3268[var6++] = 0;
                                    class181.field3268[var6++] = 0;
                                } else {
                                    class181.field3268[var6++] = var236.field349 - var236.field352;
                                    class181.field3268[var6++] = var236.field370 - var236.field366;
                                }
                                continue;
                            }
                            if (var498 == 5212) {
                                int var237 = class95.method692(arg1 + 22465);
                                int var238 = 0;
                                class149 var239;
                                if (var237 == -1) {
                                    var239 = class279.field4984;
                                } else {
                                    var239 = class168.field3120.field4967[var237];
                                    var238 = class168.field3120.method1916(var237, (byte) 49);
                                }
                                class149 var240 = var239.method1030(class175.field3214, true, class193.field3462);
                                class276.field4939[var7++] = var240;
                                class181.field3268[var6++] = var238;
                                continue;
                            }
                            if (var498 == 5213) {
                                int var241 = class133.method932(112);
                                int var242 = 0;
                                class149 var243;
                                if (var241 == -1) {
                                    var243 = class279.field4984;
                                } else {
                                    var243 = class168.field3120.field4967[var241];
                                    var242 = class168.field3120.method1916(var241, (byte) 84);
                                }
                                class149 var244 = var243.method1030(class175.field3214, true, class193.field3462);
                                class276.field4939[var7++] = var244;
                                class181.field3268[var6++] = var242;
                                continue;
                            }
                            if (var498 == 5214) {
                                var6--;
                                int var245 = class181.field3268[var6];
                                class101.method721(arg1 + 16966, var245 & 0x3FFF, (var245 & 0xFFFECA7) >> 14);
                                continue;
                            }
                            if (var498 == 5215) {
                                var6--;
                                int var246 = class181.field3268[var6];
                                var7--;
                                class149 var247 = class276.field4939[var7];
                                class69 var248 = class267.method1854(var246 & 0x3FFF, (var246 & 0xFFFF318) >> 14, -29055);
                                boolean var249 = false;
                                for (class24 var250 = (class24) var248.method426(104); var250 != null; var250 = (class24) var248.method438(true)) {
                                    if (var250.field363.method1048(-114, var247)) {
                                        var249 = true;
                                        break;
                                    }
                                }
                                if (var249) {
                                    class181.field3268[var6++] = 1;
                                } else {
                                    class181.field3268[var6++] = 0;
                                }
                                continue;
                            }
                            if (var498 == 5216) {
                                var6--;
                                int var251 = class181.field3268[var6];
                                class111.method784(var251, (byte) -126);
                                continue;
                            }
                            if (var498 == 5217) {
                                var6--;
                                int var252 = class181.field3268[var6];
                                if (class93.method680(false, var252)) {
                                    class181.field3268[var6++] = 1;
                                } else {
                                    class181.field3268[var6++] = 0;
                                }
                                continue;
                            }
                            if (var498 == 5218) {
                                class24 var253 = class62.method389(arg1 ^ 0xFFFFF3D2);
                                if (var253 == null) {
                                    class181.field3268[var6++] = -1;
                                } else {
                                    class181.field3268[var6++] = var253.field351;
                                }
                                continue;
                            }
                            if (var498 == 5219) {
                                var7--;
                                class83.method623(125, class276.field4939[var7]);
                                continue;
                            }
                            if (var498 == 5220) {
                                class181.field3268[var6++] = class260.field4581 == 100 ? 1 : 0;
                                continue;
                            }
                        } else if (var498 < 5400) {
                            if (var498 == 5300) {
                                var6 -= 2;
                                class181.field3268[var6++] = 0;
                                continue;
                            }
                            if (var498 == 5301) {
                                continue;
                            }
                            if (var498 == 5302) {
                                class181.field3268[var6++] = 0;
                                continue;
                            }
                            if (var498 == 5303) {
                                var6--;
                                class181.field3268[var6++] = 0;
                                class181.field3268[var6++] = 0;
                                continue;
                            }
                            if (var498 == 5305) {
                                byte var254 = -1;
                                class181.field3268[var6++] = var254;
                                continue;
                            }
                            if (var498 == 5306) {
                                class181.field3268[var6++] = class79.method600(arg1 + 22459);
                                continue;
                            }
                            if (var498 == 5307) {
                                var6--;
                                int var255 = class181.field3268[var6];
                                if (var255 < 0 || var255 > 2) {
                                    var255 = 0;
                                }
                                class227.method1521(-1, true, var255, false, -1);
                                continue;
                            }
                            if (var498 == 5308) {
                                class181.field3268[var6++] = class169.field3137;
                                continue;
                            }
                            if (var498 == 5309) {
                                var6--;
                                int var256 = class181.field3268[var6];
                                if (var256 < 0 || var256 > 2) {
                                    var256 = 0;
                                }
                                class169.field3137 = var256;
                                class83.method620(class272.field4900, (byte) 88);
                                continue;
                            }
                        } else if (var498 < 5500) {
                            if (var498 == 5400) {
                                class61.field1099++;
                                var7 -= 2;
                                class149 var257 = class276.field4939[var7];
                                class149 var258 = class276.field4939[var7 + 1];
                                var6--;
                                int var259 = class181.field3268[var6];
                                class208.field3720.method162(2, 117);
                                class208.field3720.method494((byte) 4, class286.method1962(18241, var257) - (-class286.method1962(18241, var258) - 1));
                                class208.field3720.method523(var257, (byte) 0);
                                class208.field3720.method523(var258, (byte) 0);
                                class208.field3720.method494((byte) 4, var259);
                                continue;
                            }
                            if (var498 == 5401) {
                                var6 -= 2;
                                class67.field1179[class181.field3268[var6]] = (short) class13.method73((byte) -117, class181.field3268[var6 + 1]);
                                class92.method671(-90);
                                class129.method903((byte) -101);
                                class162.method1191(false);
                                class83.method622(-121);
                                class247.method1716(-70);
                                continue;
                            }
                            if (var498 == 5405) {
                                var6 -= 2;
                                int var260 = class181.field3268[var6 + 1];
                                int var261 = class181.field3268[var6];
                                if (var261 >= 0 && var261 < 2) {
                                    class136.field2481[var261] = new int[var260 << 1][4];
                                }
                                continue;
                            }
                            if (var498 == 5406) {
                                var6 -= 7;
                                int var262 = class181.field3268[var6];
                                int var263 = class181.field3268[var6 + 2];
                                int var264 = class181.field3268[var6 + 1] << 1;
                                int var265 = class181.field3268[var6 + 3];
                                int var266 = class181.field3268[var6 + 4];
                                int var267 = class181.field3268[var6 + 5];
                                int var268 = class181.field3268[var6 + 6];
                                if (var262 >= 0 && var262 < 2 && class136.field2481[var262] != null && var264 >= 0 && var264 < class136.field2481[var262].length) {
                                    class136.field2481[var262][var264] = new int[] { class136.method953(var263 >> 14, 16383) * 128, var265, class136.method953(var263, 16383) * 128, var268 };
                                    class136.field2481[var262][var264 + 1] = new int[] { (class136.method953(var266, 268420521) >> 14) * 128, var267, class136.method953(16383, var266) * 128 };
                                }
                                continue;
                            }
                            if (var498 == 5407) {
                                var6--;
                                int var269 = class136.field2481[class181.field3268[var6]].length >> 1;
                                class181.field3268[var6++] = var269;
                                continue;
                            }
                            if (var498 == 5411) {
                                if (class69.field1203 == null) {
                                    class95.method690(false, (byte) 76, class216.method1454(arg1 ^ 0x7457));
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var498 == 5419) {
                                class149 var270 = class279.field4984;
                                if (class133.field2416 != null) {
                                    var270 = class63.method396(class133.field2416.field3359, true);
                                    try {
                                        if (class133.field2416.field3357 != null) {
                                            byte[] var271 = ((String) class133.field2416.field3357).getBytes("ISO-8859-1");
                                            var270 = class37.method214(var271, 0, var271.length, arg1 ^ 0xFFFFA8A0);
                                        }
                                    } catch (UnsupportedEncodingException var496) {
                                    }
                                }
                                class276.field4939[var7++] = var270;
                                continue;
                            }
                            if (var498 == 5420) {
                                class181.field3268[var6++] = class29.field427 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 5421) {
                                var7--;
                                class149 var272 = class276.field4939[var7];
                                var6--;
                                boolean var273 = class181.field3268[var6] == 1;
                                class149 var274 = class237.method1603(new class149[] { class216.method1454(-8969), var272 }, -108);
                                if (class69.field1203 != null || var273 && class29.field427 != 3 && class29.field433.startsWith("win") && !class35.field523) {
                                    client.field2862 = var274;
                                    class213.field3774 = var273;
                                    class83.field1519 = class272.field4900.method176(new String(var274.method1040(false), "ISO-8859-1"), (byte) -102);
                                    continue;
                                }
                                class95.method690(var273, (byte) 89, var274);
                                continue;
                            }
                            if (var498 == 5422) {
                                var7 -= 2;
                                class149 var275 = class276.field4939[var7 + 1];
                                class149 var276 = class276.field4939[var7];
                                var6--;
                                int var277 = class181.field3268[var6];
                                if (var276.method1053((byte) 62) > 0) {
                                    if (class268.field4802 == null) {
                                        class268.field4802 = new class149[class166.field3090[class245.field4306]];
                                    }
                                    class268.field4802[var277] = var276;
                                }
                                if (var275.method1053((byte) -19) > 0) {
                                    if (class118.field2013 == null) {
                                        class118.field2013 = new class149[class166.field3090[class245.field4306]];
                                    }
                                    class118.field2013[var277] = var275;
                                }
                                continue;
                            }
                            if (var498 == 5423) {
                                var7--;
                                class276.field4939[var7].method1057(0);
                                continue;
                            }
                            if (var498 == 5424) {
                                var6 -= 11;
                                class25.field380 = class181.field3268[var6];
                                class236.field4145 = class181.field3268[var6 + 1];
                                class283.field5006 = class181.field3268[var6 + 2];
                                class175.field3217 = class181.field3268[var6 + 3];
                                class92.field1635 = class181.field3268[var6 + 4];
                                class277.field4947 = class181.field3268[var6 + 5];
                                class122.field2156 = class181.field3268[var6 + 6];
                                class54.field969 = class181.field3268[var6 + 7];
                                class186.field3353 = class181.field3268[var6 + 8];
                                class129.field2287 = class181.field3268[var6 + 9];
                                class155.field2838 = class181.field3268[var6 + 10];
                                class270.field4864.method1556(class92.field1635, true);
                                class270.field4864.method1556(class277.field4947, true);
                                class270.field4864.method1556(class122.field2156, true);
                                class270.field4864.method1556(class54.field969, true);
                                class270.field4864.method1556(class186.field3353, true);
                                class23.field324 = true;
                                continue;
                            }
                            if (var498 == 5425) {
                                class49.method318(false);
                                class23.field324 = false;
                                continue;
                            }
                            if (var498 == 5426) {
                                var6--;
                                class9.field124 = class181.field3268[var6];
                                continue;
                            }
                            if (var498 == 5427) {
                                var6 -= 2;
                                class210.field3751 = class181.field3268[var6];
                                class222.field3919 = class181.field3268[var6 + 1];
                                continue;
                            }
                        } else if (var498 < 5600) {
                            if (var498 == 5500) {
                                var6 -= 4;
                                int var308 = class181.field3268[var6];
                                int var309 = class181.field3268[var6 + 2];
                                int var310 = class181.field3268[var6 + 1];
                                int var311 = class181.field3268[var6 + 3];
                                class256.method1769(var311, (var308 >> 14 & 0x3FFF) - class125.field2199, var310, var309, -126, (var308 & 0x3FFF) - class115.field1969, false);
                                continue;
                            }
                            if (var498 == 5501) {
                                var6 -= 4;
                                int var312 = class181.field3268[var6];
                                int var313 = class181.field3268[var6 + 1];
                                int var314 = class181.field3268[var6 + 2];
                                int var315 = class181.field3268[var6 + 3];
                                class92.method672(var314, var313, (var312 >> 14 & 0x3FFF) - class125.field2199, var315, (var312 & 0x3FFF) - class115.field1969, 2047);
                                continue;
                            }
                            if (var498 == 5502) {
                                var6 -= 6;
                                int var316 = class181.field3268[var6];
                                if (var316 >= 2) {
                                    throw new RuntimeException();
                                }
                                class151.field2751 = var316;
                                int var317 = class181.field3268[var6 + 1];
                                if ((class136.field2481[class151.field2751].length >> 1) <= (var317 + 1)) {
                                    throw new RuntimeException();
                                }
                                class217.field3841 = var317;
                                class205.field3665 = 0;
                                class171.field3149 = class181.field3268[var6 + 2];
                                class264.field4694 = class181.field3268[var6 + 3];
                                int var318 = class181.field3268[var6 + 4];
                                if (var318 >= 2) {
                                    throw new RuntimeException();
                                }
                                class10.field148 = var318;
                                int var319 = class181.field3268[var6 + 5];
                                if ((class136.field2481[class10.field148].length >> 1) <= (var319 + 1)) {
                                    throw new RuntimeException();
                                }
                                class194.field3468 = 3;
                                class248.field4356 = var319;
                                continue;
                            }
                            if (var498 == 5503) {
                                class2.method6(-1);
                                continue;
                            }
                            if (var498 == 5504) {
                                var6 -= 2;
                                class57.field1004 = class181.field3268[var6];
                                class55.field985 = class181.field3268[var6 + 1];
                                if (class194.field3468 == 2) {
                                    class186.field3354 = class57.field1004;
                                    class147.field2646 = class55.field985;
                                }
                                class139.method973(0);
                                continue;
                            }
                            if (var498 == 5505) {
                                class181.field3268[var6++] = class57.field1004;
                                continue;
                            }
                            if (var498 == 5506) {
                                class181.field3268[var6++] = class55.field985;
                                continue;
                            }
                        } else if (var498 < 5700) {
                            if (var498 == 5600) {
                                var7 -= 2;
                                class149 var278 = class276.field4939[var7];
                                class149 var279 = class276.field4939[var7 + 1];
                                var6--;
                                int var280 = class181.field3268[var6];
                                if (class107.field1845 == 10 && class244.field4292 == 0 && class91.field1614 == 0 && class197.field3570 == 0 && class22.field313 == 0) {
                                    class13.method83(var278, var279, var280, 0);
                                }
                                continue;
                            }
                            if (var498 == 5601) {
                                class134.method944(arg1 ^ 0xFFFFA890);
                                continue;
                            }
                            if (var498 == 5602) {
                                if (class91.field1614 == 0) {
                                    class140.field2558 = -2;
                                }
                                continue;
                            }
                            if (var498 == 5603) {
                                var6 -= 4;
                                if (class107.field1845 == 10 && class244.field4292 == 0 && class91.field1614 == 0 && class197.field3570 == 0 && class22.field313 == 0) {
                                    class134.method937(class181.field3268[var6 + 1], class181.field3268[var6 + 3], class181.field3268[var6 + 2], class181.field3268[var6], 9);
                                }
                                continue;
                            }
                            if (var498 == 5604) {
                                var7--;
                                if (class107.field1845 == 10 && class244.field4292 == 0 && class91.field1614 == 0 && class197.field3570 == 0 && class22.field313 == 0) {
                                    class118.method817(class276.field4939[var7].method1023((byte) -16), -121);
                                }
                                continue;
                            }
                            if (var498 == 5605) {
                                var6 -= 4;
                                var7 -= 2;
                                if (class107.field1845 == 10 && class244.field4292 == 0 && class91.field1614 == 0 && class197.field3570 == 0 && class22.field313 == 0) {
                                    class222.method1496(class276.field4939[var7].method1023((byte) -16), class181.field3268[var6 + 3], class181.field3268[var6 + 2], class181.field3268[var6], class276.field4939[var7 + 1], class181.field3268[var6 + 1], 118);
                                }
                                continue;
                            }
                            if (var498 == 5606) {
                                if (class197.field3570 == 0) {
                                    class207.field3716 = -2;
                                }
                                continue;
                            }
                            if (var498 == 5607) {
                                class181.field3268[var6++] = class140.field2558;
                                continue;
                            }
                            if (var498 == 5608) {
                                class181.field3268[var6++] = class162.field3012;
                                continue;
                            }
                            if (var498 == 5609) {
                                class181.field3268[var6++] = class207.field3716;
                                continue;
                            }
                            if (var498 == 5610) {
                                for (int var281 = 0; var281 < 5; var281++) {
                                    class276.field4939[var7++] = class233.field4105.length <= var281 ? class279.field4984 : class233.field4105[var281].method1022(0);
                                }
                                class233.field4105 = null;
                                continue;
                            }
                            if (var498 == 5611) {
                                class181.field3268[var6++] = class261.field4634;
                                continue;
                            }
                        } else if (var498 < 6100) {
                            if (var498 == 6001) {
                                var6--;
                                int var282 = class181.field3268[var6];
                                if (var282 < 1) {
                                    var282 = 1;
                                }
                                if (var282 > 4) {
                                    var282 = 4;
                                }
                                class140.field2573 = var282;
                                if (class140.field2573 == 1) {
                                    class235.method1575(0.9F);
                                }
                                if (class140.field2573 == 2) {
                                    class235.method1575(0.8F);
                                }
                                if (class140.field2573 == 3) {
                                    class235.method1575(0.7F);
                                }
                                if (class140.field2573 == 4) {
                                    class235.method1575(0.6F);
                                }
                                class129.method903((byte) -75);
                                class83.method620(class272.field4900, (byte) 88);
                                class63.field1134 = false;
                                continue;
                            }
                            if (var498 == 6002) {
                                var6--;
                                class127.method884((byte) -35, class181.field3268[var6] == 1);
                                class108.method752(82);
                                class77.method591(-31);
                                class224.method1505(512);
                                class83.method620(class272.field4900, (byte) 88);
                                class63.field1134 = false;
                                continue;
                            }
                            if (var498 == 6003) {
                                var6--;
                                class80.field1489 = class181.field3268[var6] == 1;
                                class224.method1505(512);
                                class83.method620(class272.field4900, (byte) 88);
                                class63.field1134 = false;
                                continue;
                            }
                            if (var498 == 6005) {
                                var6--;
                                class211.field3761 = class181.field3268[var6] == 1;
                                class77.method591(-31);
                                class83.method620(class272.field4900, (byte) 88);
                                class63.field1134 = false;
                                continue;
                            }
                            if (var498 == 6006) {
                                var6--;
                                class83.field1512 = class181.field3268[var6] == 1;
                                ((class136) class235.field4129).method949(arg1 + 22283, !class83.field1512);
                                class83.method620(class272.field4900, (byte) 88);
                                class63.field1134 = false;
                                continue;
                            }
                            if (var498 == 6007) {
                                var6--;
                                class283.field5003 = class181.field3268[var6] == 1;
                                class83.method620(class272.field4900, (byte) 88);
                                class63.field1134 = false;
                                continue;
                            }
                            if (var498 == 6008) {
                                var6--;
                                class86.field1573 = class181.field3268[var6] == 1;
                                class83.method620(class272.field4900, (byte) 88);
                                class63.field1134 = false;
                                continue;
                            }
                            if (var498 == 6009) {
                                var6--;
                                class211.field3762 = class181.field3268[var6] == 1;
                                class83.method620(class272.field4900, (byte) 88);
                                class63.field1134 = false;
                                continue;
                            }
                            if (var498 == 6010) {
                                var6--;
                                class116.field1989 = class181.field3268[var6] == 1;
                                class83.method620(class272.field4900, (byte) 88);
                                class63.field1134 = false;
                                continue;
                            }
                            if (var498 == 6011) {
                                var6--;
                                int var283 = class181.field3268[var6];
                                if (var283 < 0 || var283 > 2) {
                                    var283 = 0;
                                }
                                class281.field4997 = var283;
                                class83.method620(class272.field4900, (byte) 88);
                                class63.field1134 = false;
                                continue;
                            }
                            if (var498 == 6012) {
                                var6--;
                                class111.field1921 = class181.field3268[var6] == 1;
                                if (class140.field2573 == 1) {
                                    class235.method1575(0.9F);
                                }
                                if (class140.field2573 == 2) {
                                    class235.method1575(0.8F);
                                }
                                if (class140.field2573 == 3) {
                                    class235.method1575(0.7F);
                                }
                                if (class140.field2573 == 4) {
                                    class235.method1575(0.6F);
                                }
                                class77.method591(-31);
                                class83.method620(class272.field4900, (byte) 88);
                                class63.field1134 = false;
                                continue;
                            }
                            if (var498 == 6014) {
                                var6--;
                                class278.field4958 = class181.field3268[var6] == 1;
                                class83.method620(class272.field4900, (byte) 88);
                                class63.field1134 = false;
                                continue;
                            }
                            if (var498 == 6015) {
                                var6--;
                                class38.field571 = class181.field3268[var6] == 1;
                                class83.method620(class272.field4900, (byte) 88);
                                class63.field1134 = false;
                                continue;
                            }
                            if (var498 == 6016) {
                                var6--;
                                int var284 = class181.field3268[var6];
                                if (var284 < 0 || var284 > 2) {
                                    var284 = 0;
                                }
                                class180.field3242 = var284;
                                continue;
                            }
                            if (var498 == 6017) {
                                var6--;
                                class126.field2209 = class181.field3268[var6] == 1;
                                class67.method414(1);
                                class83.method620(class272.field4900, (byte) 88);
                                class63.field1134 = false;
                                continue;
                            }
                            if (var498 == 6018) {
                                var6--;
                                int var285 = class181.field3268[var6];
                                if (var285 < 0) {
                                    var285 = 0;
                                }
                                if (var285 > 127) {
                                    var285 = 127;
                                }
                                class57.field1005 = var285;
                                class83.method620(class272.field4900, (byte) 88);
                                class63.field1134 = false;
                                continue;
                            }
                            if (var498 == 6019) {
                                var6--;
                                int var286 = class181.field3268[var6];
                                if (var286 < 0) {
                                    var286 = 0;
                                }
                                if (var286 > 255) {
                                    var286 = 255;
                                }
                                if (class44.field667 != var286) {
                                    if (class44.field667 == 0 && class133.field2425 != -1) {
                                        class78.method592(0, false, class133.field2425, class230.field4010, var286, (byte) -103);
                                        class71.field1241 = false;
                                    } else if (var286 == 0) {
                                        class206.method1406((byte) -67);
                                        class71.field1241 = false;
                                    } else {
                                        class285.method1960(var286, 120);
                                    }
                                    class44.field667 = var286;
                                }
                                class83.method620(class272.field4900, (byte) 88);
                                class63.field1134 = false;
                                continue;
                            }
                            if (var498 == 6020) {
                                var6--;
                                int var287 = class181.field3268[var6];
                                if (var287 < 0) {
                                    var287 = 0;
                                }
                                if (var287 > 127) {
                                    var287 = 127;
                                }
                                class133.field2432 = var287;
                                class83.method620(class272.field4900, (byte) 88);
                                class63.field1134 = false;
                                continue;
                            }
                            if (var498 == 6021) {
                                var6--;
                                class180.field3252 = class181.field3268[var6] == 1;
                                class224.method1505(512);
                                continue;
                            }
                            if (var498 == 6023) {
                                var6--;
                                int var288 = class181.field3268[var6];
                                if (var288 < 0) {
                                    var288 = 0;
                                }
                                boolean var289 = false;
                                if (var288 > 2) {
                                    var288 = 2;
                                }
                                if (class77.field1447 < 96) {
                                    var288 = 0;
                                    var289 = true;
                                }
                                class88.method651(var288);
                                class83.method620(class272.field4900, (byte) 88);
                                class63.field1134 = false;
                                class181.field3268[var6++] = var289 ? 0 : 1;
                                continue;
                            }
                            if (var498 == 6024) {
                                var6--;
                                int var290 = class181.field3268[var6];
                                if (var290 < 0 || var290 > 2) {
                                    var290 = 0;
                                }
                                class136.field2496 = var290;
                                class83.method620(class272.field4900, (byte) 88);
                                continue;
                            }
                            if (var498 == 6028) {
                                var6--;
                                class26.field398 = class181.field3268[var6] != 0;
                                class83.method620(class272.field4900, (byte) 88);
                                continue;
                            }
                        } else if (var498 < 6200) {
                            if (var498 == 6101) {
                                class181.field3268[var6++] = class140.field2573;
                                continue;
                            }
                            if (var498 == 6102) {
                                class181.field3268[var6++] = class123.method869(true) ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6103) {
                                class181.field3268[var6++] = class80.field1489 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6105) {
                                class181.field3268[var6++] = class211.field3761 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6106) {
                                class181.field3268[var6++] = class83.field1512 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6107) {
                                class181.field3268[var6++] = class283.field5003 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6108) {
                                class181.field3268[var6++] = class86.field1573 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6109) {
                                class181.field3268[var6++] = class211.field3762 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6110) {
                                class181.field3268[var6++] = class116.field1989 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6111) {
                                class181.field3268[var6++] = class281.field4997;
                                continue;
                            }
                            if (var498 == 6112) {
                                class181.field3268[var6++] = class111.field1921 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6114) {
                                class181.field3268[var6++] = class278.field4958 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6115) {
                                class181.field3268[var6++] = class38.field571 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6116) {
                                class181.field3268[var6++] = class180.field3242;
                                continue;
                            }
                            if (var498 == 6117) {
                                class181.field3268[var6++] = class126.field2209 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6118) {
                                class181.field3268[var6++] = class57.field1005;
                                continue;
                            }
                            if (var498 == 6119) {
                                class181.field3268[var6++] = class44.field667;
                                continue;
                            }
                            if (var498 == 6120) {
                                class181.field3268[var6++] = class133.field2432;
                                continue;
                            }
                            if (var498 == 6121) {
                                class181.field3268[var6++] = 0;
                                continue;
                            }
                            if (var498 == 6123) {
                                class181.field3268[var6++] = class88.method652();
                                continue;
                            }
                            if (var498 == 6124) {
                                class181.field3268[var6++] = class136.field2496;
                                continue;
                            }
                            if (var498 == 6128) {
                                class181.field3268[var6++] = class26.field398 ? 1 : 0;
                                continue;
                            }
                        } else if (var498 < 6300) {
                            if (var498 == 6200) {
                                var6 -= 2;
                                class59.field1062 = (short) class181.field3268[var6];
                                if (class59.field1062 <= 0) {
                                    class59.field1062 = 256;
                                }
                                class13.field172 = (short) class181.field3268[var6 + 1];
                                if (class13.field172 <= 0) {
                                    class13.field172 = 205;
                                }
                                continue;
                            }
                            if (var498 == 6201) {
                                var6 -= 2;
                                class154.field2824 = (short) class181.field3268[var6];
                                if (class154.field2824 <= 0) {
                                    class154.field2824 = 256;
                                }
                                class156.field2871 = (short) class181.field3268[var6 + 1];
                                if (class156.field2871 <= 0) {
                                    class156.field2871 = 320;
                                }
                                continue;
                            }
                            if (var498 == 6202) {
                                var6 -= 4;
                                class170.field3147 = (short) class181.field3268[var6];
                                if (class170.field3147 <= 0) {
                                    class170.field3147 = 1;
                                }
                                class66.field1171 = (short) class181.field3268[var6 + 1];
                                if (class66.field1171 <= 0) {
                                    class66.field1171 = 32767;
                                } else if (class66.field1171 < class170.field3147) {
                                    class66.field1171 = class170.field3147;
                                }
                                class91.field1613 = (short) class181.field3268[var6 + 2];
                                if (class91.field1613 <= 0) {
                                    class91.field1613 = 1;
                                }
                                class170.field3139 = (short) class181.field3268[var6 + 3];
                                if (class170.field3139 <= 0) {
                                    class170.field3139 = 32767;
                                } else if (class91.field1613 > class170.field3139) {
                                    class170.field3139 = class91.field1613;
                                }
                                continue;
                            }
                            if (var498 == 6203) {
                                class92.method675(0, 0, 64, class7.field86.field727, false, class7.field86.field722);
                                class181.field3268[var6++] = class269.field4849;
                                class181.field3268[var6++] = class223.field3931;
                                continue;
                            }
                            if (var498 == 6204) {
                                class181.field3268[var6++] = class154.field2824;
                                class181.field3268[var6++] = class156.field2871;
                                continue;
                            }
                            if (var498 == 6205) {
                                class181.field3268[var6++] = class59.field1062;
                                class181.field3268[var6++] = class13.field172;
                                continue;
                            }
                        } else if (var498 < 6400) {
                            if (var498 == 6300) {
                                class181.field3268[var6++] = (int) (class81.method608(19644) / 60000L);
                                continue;
                            }
                            if (var498 == 6301) {
                                class181.field3268[var6++] = (int) (class81.method608(19644) / 86400000L) - 11745;
                                continue;
                            }
                            if (var498 == 6302) {
                                var6 -= 3;
                                int var291 = class181.field3268[var6 + 1];
                                int var292 = class181.field3268[var6];
                                int var293 = class181.field3268[var6 + 2];
                                class40.field622.clear();
                                class40.field622.set(11, 12);
                                class40.field622.set(var293, var291, var292);
                                class181.field3268[var6++] = (int) (class40.field622.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var498 == 6303) {
                                class40.field622.clear();
                                class40.field622.setTime(new Date(class81.method608(19644)));
                                class181.field3268[var6++] = class40.field622.get(1);
                                continue;
                            }
                            if (var498 == 6304) {
                                var6--;
                                int var294 = class181.field3268[var6];
                                boolean var295 = true;
                                if (var294 < 0) {
                                    var295 = ((var294 + 1) % 4) == 0;
                                } else if (var294 < 1582) {
                                    var295 = (var294 % 4) == 0;
                                } else if ((var294 % 4) != 0) {
                                    var295 = false;
                                } else if ((var294 % 100) != 0) {
                                    var295 = true;
                                } else if ((var294 % 400) != 0) {
                                    var295 = false;
                                }
                                class181.field3268[var6++] = var295 ? 1 : 0;
                                continue;
                            }
                        } else if (var498 < 6500) {
                            if (var498 == 6405) {
                                class181.field3268[var6++] = class244.method1705((byte) 34) ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6406) {
                                class181.field3268[var6++] = class236.method1600((byte) -83) ? 1 : 0;
                                continue;
                            }
                        } else if (var498 < 6600) {
                            if (var498 == 6500) {
                                if (class107.field1845 == 10 && class244.field4292 == 0 && class91.field1614 == 0 && class197.field3570 == 0) {
                                    class181.field3268[var6++] = class268.method1869(-1) == -1 ? 0 : 1;
                                    continue;
                                }
                                class181.field3268[var6++] = 1;
                                continue;
                            }
                            if (var498 == 6501) {
                                class208 var296 = class5.method25((byte) 96);
                                if (var296 == null) {
                                    class181.field3268[var6++] = -1;
                                    class181.field3268[var6++] = 0;
                                    class276.field4939[var7++] = class279.field4984;
                                    class181.field3268[var6++] = 0;
                                    class276.field4939[var7++] = class279.field4984;
                                    class181.field3268[var6++] = 0;
                                } else {
                                    class181.field3268[var6++] = var296.field3721;
                                    class181.field3268[var6++] = var296.field4485;
                                    class276.field4939[var7++] = var296.field3723;
                                    class99 var297 = var296.method1417(2047);
                                    class181.field3268[var6++] = var297.field1752;
                                    class276.field4939[var7++] = var297.field1760;
                                    class181.field3268[var6++] = var296.field4484;
                                }
                                continue;
                            }
                            if (var498 == 6502) {
                                class208 var298 = class155.method1097(-68);
                                if (var298 == null) {
                                    class181.field3268[var6++] = -1;
                                    class181.field3268[var6++] = 0;
                                    class276.field4939[var7++] = class279.field4984;
                                    class181.field3268[var6++] = 0;
                                    class276.field4939[var7++] = class279.field4984;
                                    class181.field3268[var6++] = 0;
                                } else {
                                    class181.field3268[var6++] = var298.field3721;
                                    class181.field3268[var6++] = var298.field4485;
                                    class276.field4939[var7++] = var298.field3723;
                                    class99 var299 = var298.method1417(arg1 ^ 0xFFFFAF5F);
                                    class181.field3268[var6++] = var299.field1752;
                                    class276.field4939[var7++] = var299.field1760;
                                    class181.field3268[var6++] = var298.field4484;
                                }
                                continue;
                            }
                            if (var498 == 6503) {
                                var6--;
                                int var300 = class181.field3268[var6];
                                if (class107.field1845 == 10 && class244.field4292 == 0 && class91.field1614 == 0 && class197.field3570 == 0) {
                                    class181.field3268[var6++] = class122.method862(var300, 32) ? 1 : 0;
                                    continue;
                                }
                                class181.field3268[var6++] = 0;
                                continue;
                            }
                            if (var498 == 6504) {
                                var6--;
                                class165.field3073 = class181.field3268[var6];
                                class83.method620(class272.field4900, (byte) 88);
                                continue;
                            }
                            if (var498 == 6505) {
                                class181.field3268[var6++] = class165.field3073;
                                continue;
                            }
                            if (var498 == 6506) {
                                var6--;
                                int var301 = class181.field3268[var6];
                                class208 var302 = class255.method1757(var301, -63);
                                if (var302 == null) {
                                    class181.field3268[var6++] = -1;
                                    class276.field4939[var7++] = class279.field4984;
                                    class181.field3268[var6++] = 0;
                                    class276.field4939[var7++] = class279.field4984;
                                    class181.field3268[var6++] = 0;
                                } else {
                                    class181.field3268[var6++] = var302.field4485;
                                    class276.field4939[var7++] = var302.field3723;
                                    class99 var303 = var302.method1417(2047);
                                    class181.field3268[var6++] = var303.field1752;
                                    class276.field4939[var7++] = var303.field1760;
                                    class181.field3268[var6++] = var302.field4484;
                                }
                                continue;
                            }
                            if (var498 == 6507) {
                                var6 -= 4;
                                int var304 = class181.field3268[var6];
                                int var305 = class181.field3268[var6 + 2];
                                boolean var306 = class181.field3268[var6 + 3] == 1;
                                boolean var307 = class181.field3268[var6 + 1] == 1;
                                class205.method1399(var306, (byte) -113, var304, var305, var307);
                                continue;
                            }
                        } else if (var498 < 6700) {
                            if (var498 == 6600) {
                                var6--;
                                class228.field3987 = class181.field3268[var6] == 1;
                                class83.method620(class272.field4900, (byte) 88);
                                continue;
                            }
                            if (var498 == 6601) {
                                class181.field3268[var6++] = class228.field3987 ? 1 : 0;
                                continue;
                            }
                        }
                    } else if (var498 == 4400) {
                        var6 -= 2;
                        int var320 = class181.field3268[var6];
                        int var321 = class181.field3268[var6 + 1];
                        class49 var322 = class138.method964(-118, var321);
                        if (var322.method312(-13492)) {
                            class276.field4939[var7++] = class108.method755(11525, var320).method1868((byte) -96, var322.field891, var321);
                        } else {
                            class181.field3268[var6++] = class108.method755(11525, var320).method1865(false, var322.field882, var321);
                        }
                        continue;
                    }
                } else {
                    class47 var472;
                    if (var498 < 2000) {
                        var472 = var46 ? class86.field1572 : class230.field4025;
                    } else {
                        var498 -= 1000;
                        var6--;
                        var472 = class251.method1741((byte) 110, class181.field3268[var6]);
                    }
                    if (var498 == 1300) {
                        var6--;
                        int var473 = class181.field3268[var6] - 1;
                        if (var473 >= 0 && var473 <= 9) {
                            var7--;
                            var472.method290(class276.field4939[var7], var473, (byte) 121);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var498 == 1301) {
                        var6 -= 2;
                        int var474 = class181.field3268[var6 + 1];
                        int var475 = class181.field3268[var6];
                        var472.field852 = class247.method1720(var474, 18062, var475);
                        continue;
                    }
                    if (var498 == 1302) {
                        var6--;
                        var472.field823 = class181.field3268[var6] == 1;
                        continue;
                    }
                    if (var498 == 1303) {
                        var6--;
                        var472.field800 = class181.field3268[var6];
                        continue;
                    }
                    if (var498 == 1304) {
                        var6--;
                        var472.field796 = class181.field3268[var6];
                        continue;
                    }
                    if (var498 == 1305) {
                        var7--;
                        var472.field711 = class276.field4939[var7];
                        continue;
                    }
                    if (var498 == 1306) {
                        var7--;
                        var472.field724 = class276.field4939[var7];
                        continue;
                    }
                    if (var498 == 1307) {
                        var472.field848 = null;
                        continue;
                    }
                    if (var498 == 1308) {
                        var6--;
                        var472.field865 = class181.field3268[var6];
                        var6--;
                        var472.field768 = class181.field3268[var6];
                        continue;
                    }
                    if (var498 == 1309) {
                        var6--;
                        int var476 = class181.field3268[var6];
                        var6--;
                        int var477 = class181.field3268[var6];
                        if (var477 >= 1 && var477 <= 10) {
                            var472.method297(var477 - 1, 121, var476);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var497) {
            if (var5.field1982 == null) {
                if (class236.field4132 != 0) {
                    class264.method1841(true, class7.field79, class279.field4984, 0);
                }
                class100.method720(var497, "CS2 - scr:" + var5.field1148 + " op:" + var10, 1);
            } else {
                class149 var493 = class167.method1215((byte) -111, 30);
                var493.method1066(-63, class49.field884).method1066(-63, var5.field1982);
                for (int var494 = class80.field1481 - 1; var494 >= 0; var494--) {
                    var493.method1066(arg1 + 22305, class285.field5066).method1066(-63, class278.field4973[var494].field4267.field1982);
                }
                if (var10 == 40) {
                    int var495 = var11[var8];
                    var493.method1066(-63, class31.field456).method1066(-63, class211.method1434(var495, true));
                }
                if (class236.field4132 != 0) {
                    class264.method1841(true, class237.method1603(new class149[] { class97.field1726, var5.field1982 }, arg1 + 22243), class279.field4984, 0);
                }
                class100.method720(var497, "CS2 - scr:" + var5.field1148 + " op:" + var10 + new String(var493.method1040(false)), arg1 + 22369);
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Laj;BII)V")
    public static final void method140(class47 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 >= -63) {
            field344 = 52;
        }
        if (arg0.field766 == 0) {
            arg0.field754 = arg0.field825;
        } else if (arg0.field766 == 1) {
            arg0.field754 = (arg2 - arg0.field722) / 2 + arg0.field825;
        } else if (arg0.field766 == 2) {
            arg0.field754 = arg2 - arg0.field722 - arg0.field825;
        } else if (arg0.field766 == 3) {
            arg0.field754 = arg0.field825 * arg2 >> 14;
        } else if (arg0.field766 == 4) {
            arg0.field754 = (arg2 - arg0.field722) / 2 + (arg0.field825 * arg2 >> 14);
        } else {
            arg0.field754 = arg2 - (arg0.field825 * arg2 >> 14) - arg0.field722;
        }
        if (arg0.field706 == 0) {
            arg0.field784 = arg0.field828;
        } else if (arg0.field706 == 1) {
            arg0.field784 = (arg3 - arg0.field727) / 2 + arg0.field828;
        } else if (arg0.field706 == 2) {
            arg0.field784 = arg3 - (arg0.field727 + arg0.field828);
        } else if (arg0.field706 == 3) {
            arg0.field784 = arg0.field828 * arg3 >> 14;
        } else if (arg0.field706 == 4) {
            arg0.field784 = (arg0.field828 * arg3 >> 14) + (arg3 - arg0.field727) / 2;
        } else {
            arg0.field784 = arg3 - arg0.field727 - (arg0.field828 * arg3 >> 14);
        }
        if (class38.field563 && (client.method1104(arg0).field2992 != 0 || arg0.field760 == 0)) {
            if (arg0.field784 < 0) {
                arg0.field784 = 0;
            } else if ((arg0.field784 + arg0.field727) > arg3) {
                arg0.field784 = arg3 - arg0.field727;
            }
            if (arg0.field754 < 0) {
                arg0.field754 = 0;
            } else if (arg0.field754 + arg0.field722 > arg2) {
                arg0.field754 = arg2 - arg0.field722;
            }
        }
        field358++;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lid;Lid;IIIZI)V")
    public class24(class149 arg0, class149 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field369 = arg5;
        this.field353 = arg4;
        this.field361 = arg3;
        this.field362 = arg1;
        this.field363 = arg0;
        this.field360 = arg2;
        this.field351 = arg6;
        if (this.field351 == 255) {
            this.field351 = 0;
        }
        this.field364 = new class157();
    }
}
