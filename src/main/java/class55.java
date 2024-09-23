import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UXVWESOT")
public class class55 {

    @OriginalMember(owner = "UXVWESOT", name = "a", descriptor = "I")
    private static int field1364;

    @OriginalMember(owner = "UXVWESOT", name = "e", descriptor = "I")
    public int field1368;

    @OriginalMember(owner = "UXVWESOT", name = "g", descriptor = "I")
    public int field1370;

    @OriginalMember(owner = "UXVWESOT", name = "f", descriptor = "LAZLXGPCM;")
    public class6 field1369;

    @OriginalMember(owner = "UXVWESOT", name = "b", descriptor = "Z")
    private static boolean field1365;

    @OriginalMember(owner = "UXVWESOT", name = "c", descriptor = "Z")
    private static boolean field1366;

    @OriginalMember(owner = "UXVWESOT", name = "h", descriptor = "[I")
    public int[] field1371;

    @OriginalMember(owner = "UXVWESOT", name = "i", descriptor = "[I")
    public int[] field1372;

    @OriginalMember(owner = "UXVWESOT", name = "j", descriptor = "[I")
    public int[] field1373;

    @OriginalMember(owner = "UXVWESOT", name = "k", descriptor = "[I")
    public int[] field1374;

    @OriginalMember(owner = "UXVWESOT", name = "d", descriptor = "[LUXVWESOT;")
    private static class55[] field1367;

    @OriginalMember(owner = "UXVWESOT", name = "l", descriptor = "[Z")
    private static boolean[] field1375;

    @OriginalMember(owner = "UXVWESOT", name = "a", descriptor = "(I)V")
    public static void method451(int arg0) {
        field1367 = new class55[arg0 + 1];
        field1375 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1375[var1] = true;
        }
    }

    @OriginalMember(owner = "UXVWESOT", name = "a", descriptor = "(I[B)V")
    public static void method452(int arg0, byte[] arg1) {
        class68 var2 = new class68(arg1, -103);
        var2.field1612 = arg1.length - 8;
        int var3 = var2.method551();
        int var4 = var2.method551();
        int var5 = var2.method551();
        int var6 = var2.method551();
        byte var7 = 0;
        class68 var8 = new class68(arg1, -103);
        var8.field1612 = var7;
        int var9 = 83 / arg0;
        int var10 = var3 + var7 + 2;
        class68 var11 = new class68(arg1, -103);
        var11.field1612 = var10;
        int var12 = var4 + var10;
        class68 var13 = new class68(arg1, -103);
        var13.field1612 = var12;
        int var14 = var5 + var12;
        class68 var15 = new class68(arg1, -103);
        var15.field1612 = var14;
        int var16 = var6 + var14;
        class68 var17 = new class68(arg1, -103);
        var17.field1612 = var16;
        class6 var18 = new class6(field1364, var17);
        int var19 = var8.method551();
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        int[] var23 = new int[500];
        for (int var24 = 0; var24 < var19; var24++) {
            int var25 = var8.method551();
            class55 var26 = field1367[var25] = new class55();
            var26.field1368 = var15.method549();
            var26.field1369 = var18;
            int var27 = var8.method549();
            int var28 = -1;
            int var29 = 0;
            for (int var30 = 0; var30 < var27; var30++) {
                int var32 = var11.method549();
                if (var32 > 0) {
                    if (var18.field126[var30] != 0) {
                        for (int var33 = var30 - 1; var33 > var28; var33--) {
                            if (var18.field126[var33] == 0) {
                                var20[var29] = var33;
                                var21[var29] = 0;
                                var22[var29] = 0;
                                var23[var29] = 0;
                                var29++;
                                break;
                            }
                        }
                    }
                    var20[var29] = var30;
                    short var34 = 0;
                    if (var18.field126[var30] == 3) {
                        var34 = 128;
                    }
                    if ((var32 & 0x1) == 0) {
                        var21[var29] = var34;
                    } else {
                        var21[var29] = var13.method562();
                    }
                    if ((var32 & 0x2) == 0) {
                        var22[var29] = var34;
                    } else {
                        var22[var29] = var13.method562();
                    }
                    if ((var32 & 0x4) == 0) {
                        var23[var29] = var34;
                    } else {
                        var23[var29] = var13.method562();
                    }
                    var28 = var30;
                    var29++;
                    if (var18.field126[var30] == 5) {
                        field1375[var25] = false;
                    }
                }
            }
            var26.field1370 = var29;
            var26.field1371 = new int[var29];
            var26.field1372 = new int[var29];
            var26.field1373 = new int[var29];
            var26.field1374 = new int[var29];
            for (int var31 = 0; var31 < var29; var31++) {
                var26.field1371[var31] = var20[var31];
                var26.field1372[var31] = var21[var31];
                var26.field1373[var31] = var22[var31];
                var26.field1374[var31] = var23[var31];
            }
        }
    }

    @OriginalMember(owner = "UXVWESOT", name = "a", descriptor = "(Z)V")
    public static void method453(boolean arg0) {
        if (arg0) {
            field1367 = null;
        }
    }

    @OriginalMember(owner = "UXVWESOT", name = "a", descriptor = "(ZI)LUXVWESOT;")
    public static class55 method454(boolean arg0, int arg1) {
        if (!arg0) {
            field1366 = !field1366;
        }
        return field1367 == null ? null : field1367[arg1];
    }

    @OriginalMember(owner = "UXVWESOT", name = "b", descriptor = "(ZI)Z")
    public static boolean method455(boolean arg0, int arg1) {
        if (!arg0) {
            field1365 = !field1365;
        }
        return arg1 == -1;
    }
}
