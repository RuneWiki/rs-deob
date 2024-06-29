import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class71 {

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public int field1348;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field1351 = 0;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "Ljf;")
    private static class229 field1352 = class212.method1457((byte) 89, "Loading)3)3)3");

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "Ljf;")
    public static class229 field1356 = class212.method1457((byte) 103, "Ausw-=hlen");

    @OriginalMember(owner = "client!tm", name = "w", descriptor = "Ljf;")
    public static class229 field1370 = field1352;

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "Ljf;")
    public static class229 field1367 = class212.method1457((byte) 122, "Annuler");

    @OriginalMember(owner = "client!tm", name = "B", descriptor = "[I")
    public static int[] field1375 = new int[256];

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "I")
    public static int field1369 = -1;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public int field1357;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public int field1359;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "I")
    public int field1366;

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!tm", name = "y", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "Lcj;")
    public class320 field1355;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "[I")
    public int[] field1360;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "[I")
    public int[] field1361;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "[I")
    public int[] field1364;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "[I")
    public int[] field1365;

    @OriginalMember(owner = "client!tm", name = "x", descriptor = "[I")
    public int[] field1371;

    @OriginalMember(owner = "client!tm", name = "A", descriptor = "[I")
    public int[] field1374;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "[Lcj;")
    public class320[] field1363;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "[[I")
    public int[][] field1349;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "[[I")
    public int[][] field1358;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)I", line = 11)
    public static final int method522(int arg0, int arg1) {
        if (arg0 == 1) {
            field1353++;
            return arg1 & 0xFF;
        } else {
            return 89;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 28)
    public static final void method523(int arg0) {
        field1373++;
        if (!class273.field4677 || arg0 > -23) {
            return;
        }
        class67 var1 = class189.method1305(class157.field2693, 2048, class232.field4035);
        if (var1 != null && var1.field1142 != null) {
            class192 var2 = new class192();
            var2.field3324 = var1.field1142;
            var2.field3327 = var1;
            class215.method1477(-19319, var2);
        }
        class273.field4677 = false;
        class194.method1328((byte) -123, var1);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIII)Loi;", line = 58)
    public static final class321 method524(int arg0, int arg1, int arg2, int arg3) {
        class321 var4 = new class321();
        var4.field5432 = arg0;
        field1368++;
        var4.field5434 = arg1;
        class151.field2618.method1885((long) arg2, var4, (byte) -126);
        class274.method1921(17208, arg0);
        class67 var5 = class96.method662(arg2, true);
        if (var5 != null) {
            class194.method1328((byte) -113, var5);
        }
        if (class208.field3613 != null) {
            class194.method1328((byte) -117, class208.field3613);
            class208.field3613 = null;
        }
        int var6 = class124.field2176;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class315.method2137(true, class115.field2063[var7])) {
                class70.method521((byte) 85, var7);
            }
        }
        if (class124.field2176 == 1) {
            class61.field1044 = false;
            class122.method872(class261.field4536, class240.field4229, class202.field3536, 0, class12.field142);
        } else {
            class122.method872(class261.field4536, class240.field4229, class202.field3536, 0, class12.field142);
            int var8 = class44.field796.method947(class311.field5233);
            for (int var9 = 0; var9 < class124.field2176; var9++) {
                int var10 = class44.field796.method947(class26.method238(-23, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class202.field3536 = var8 + 8;
            class12.field142 = class124.field2176 * 15 + 22;
        }
        if (var5 != null) {
            class243.method1755(var5, false, -1);
        }
        class327.method2197(arg0, (byte) -90);
        if (class16.field263 != -1) {
            class22.method206(28699, class16.field263, 1);
        }
        if (arg3 >= -54) {
            field1369 = -65;
        }
        return var4;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I[B)V", line = 155)
    private final void method525(int arg0, byte[] arg1) {
        class14 var3 = new class14(class258.method1839(arg1, 75));
        field1372++;
        int var4 = var3.method93(false);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        int var5 = 0;
        if (var4 >= 6) {
            this.field1359 = var3.method128((byte) 4);
        } else {
            this.field1359 = 0;
        }
        int var6 = -1;
        int var7 = var3.method93(false);
        this.field1357 = var3.method116(-1);
        this.field1374 = new int[this.field1357];
        for (int var8 = 0; var8 < this.field1357; var8++) {
            this.field1374[var8] = var5 += var3.method116(-1);
            if (var6 < this.field1374[var8]) {
                var6 = this.field1374[var8];
            }
        }
        this.field1366 = var6 + 1;
        this.field1349 = new int[this.field1366][];
        if (arg0 != 1) {
            method526(-62);
        }
        this.field1371 = new int[this.field1366];
        this.field1360 = new int[this.field1366];
        this.field1365 = new int[this.field1366];
        this.field1364 = new int[this.field1366];
        if (var7 != 0) {
            this.field1361 = new int[this.field1366];
            for (int var9 = 0; var9 < this.field1366; var9++) {
                this.field1361[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1357; var10++) {
                this.field1361[this.field1374[var10]] = var3.method128((byte) 4);
            }
            this.field1355 = new class320(this.field1361);
        }
        for (int var11 = 0; var11 < this.field1357; var11++) {
            this.field1364[this.field1374[var11]] = var3.method128((byte) 4);
        }
        for (int var12 = 0; var12 < this.field1357; var12++) {
            this.field1360[this.field1374[var12]] = var3.method128((byte) 4);
        }
        for (int var13 = 0; var13 < this.field1357; var13++) {
            this.field1365[this.field1374[var13]] = var3.method116(-1);
        }
        for (int var14 = 0; var14 < this.field1357; var14++) {
            int var15 = 0;
            int var16 = -1;
            int var17 = this.field1374[var14];
            int var18 = this.field1365[var17];
            this.field1349[var17] = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                int var20 = this.field1349[var17][var19] = var15 += var3.method116(-1);
                if (var16 < var20) {
                    var16 = var20;
                }
            }
            this.field1371[var17] = var16 + 1;
            if (var16 + 1 == var18) {
                this.field1349[var17] = null;
            }
        }
        if (var7 == 0) {
            return;
        }
        this.field1358 = new int[var6 + 1][];
        this.field1363 = new class320[var6 + 1];
        for (int var21 = 0; var21 < this.field1357; var21++) {
            int var22 = this.field1374[var21];
            int var23 = this.field1365[var22];
            this.field1358[var22] = new int[this.field1371[var22]];
            for (int var24 = 0; var24 < this.field1371[var22]; var24++) {
                this.field1358[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field1349[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field1349[var22][var25];
                }
                this.field1358[var22][var26] = var3.method128((byte) 4);
            }
            this.field1363[var22] = new class320(this.field1358[var22]);
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V", line = 330)
    public static void method526(int arg0) {
        if (arg0 <= 31) {
            method523(74);
        }
        field1352 = null;
        field1370 = null;
        field1367 = null;
        field1356 = null;
        field1375 = null;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V", line = 347)
    public static final void method527(int arg0) {
        class147.field2547 = class72.method532(0.4F, 8, (byte) -86, 35, arg0, 2048, 8, true);
        field1354++;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)V", line = 362)
    public static final void method528(int arg0, int arg1) {
        field1350++;
        if (arg1 <= 119) {
            field1356 = (class229) null;
        }
        if (class318.field5373 == 0) {
            class184.field3186.method2202(arg0, 31530);
        } else {
            class211.field3634 = arg0;
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "([BI)V", line = 390)
    public class71(byte[] arg0, int arg1) {
        this.field1348 = class299.method2060(arg0.length, true, arg0);
        if (this.field1348 != arg1) {
            throw new RuntimeException();
        }
        this.method525(1, arg0);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BIII)I", line = 408)
    public static final int method529(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field1362++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            if (arg0 < 47) {
                field1356 = (class229) null;
            }
            return 7 - arg1;
        }
    }
}
