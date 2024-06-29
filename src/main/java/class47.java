import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OYJABRDD")
public class class47 {

    @OriginalMember(owner = "client!OYJABRDD", name = "a", descriptor = "I")
    private static int field1345 = 37470;

    @OriginalMember(owner = "client!OYJABRDD", name = "b", descriptor = "I")
    private static int field1346 = 3763;

    @OriginalMember(owner = "client!OYJABRDD", name = "d", descriptor = "I")
    public int field1348;

    @OriginalMember(owner = "client!OYJABRDD", name = "f", descriptor = "I")
    public int field1350;

    @OriginalMember(owner = "client!OYJABRDD", name = "e", descriptor = "LFGDIESUZ;")
    public class18 field1349;

    @OriginalMember(owner = "client!OYJABRDD", name = "g", descriptor = "[I")
    public int[] field1351;

    @OriginalMember(owner = "client!OYJABRDD", name = "h", descriptor = "[I")
    public int[] field1352;

    @OriginalMember(owner = "client!OYJABRDD", name = "i", descriptor = "[I")
    public int[] field1353;

    @OriginalMember(owner = "client!OYJABRDD", name = "j", descriptor = "[I")
    public int[] field1354;

    @OriginalMember(owner = "client!OYJABRDD", name = "c", descriptor = "[LOYJABRDD;")
    private static class47[] field1347;

    @OriginalMember(owner = "client!OYJABRDD", name = "k", descriptor = "[Z")
    private static boolean[] field1355;

    @OriginalMember(owner = "client!OYJABRDD", name = "a", descriptor = "(I)V")
    public static void method463(int arg0) {
        field1347 = new class47[arg0 + 1];
        field1355 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1355[var1] = true;
        }
    }

    @OriginalMember(owner = "client!OYJABRDD", name = "a", descriptor = "([BI)V")
    public static void method464(byte[] arg0, int arg1) {
        class59 var2 = new class59(859, arg0);
        var2.field1589 = arg0.length - 8;
        int var3 = var2.method531();
        int var4 = var2.method531();
        int var5 = var2.method531();
        int var6 = var2.method531();
        byte var7 = 0;
        class59 var8 = new class59(859, arg0);
        var8.field1589 = var7;
        int var9 = var3 + var7 + 2;
        class59 var10 = new class59(859, arg0);
        var10.field1589 = var9;
        int var11 = 75 / arg1;
        int var12 = var4 + var9;
        class59 var13 = new class59(859, arg0);
        var13.field1589 = var12;
        int var14 = var5 + var12;
        class59 var15 = new class59(859, arg0);
        var15.field1589 = var14;
        int var16 = var6 + var14;
        class59 var17 = new class59(859, arg0);
        var17.field1589 = var16;
        class18 var18 = new class18(var17, 361);
        int var19 = var8.method531();
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        int[] var23 = new int[500];
        for (int var24 = 0; var24 < var19; var24++) {
            int var25 = var8.method531();
            class47 var26 = field1347[var25] = new class47();
            var26.field1348 = var15.method529();
            var26.field1349 = var18;
            int var27 = var8.method529();
            int var28 = -1;
            int var29 = 0;
            for (int var30 = 0; var30 < var27; var30++) {
                int var32 = var10.method529();
                if (var32 > 0) {
                    if (var18.field774[var30] != 0) {
                        for (int var33 = var30 - 1; var33 > var28; var33--) {
                            if (var18.field774[var33] == 0) {
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
                    if (var18.field774[var30] == 3) {
                        var34 = 128;
                    }
                    if ((var32 & 0x1) == 0) {
                        var21[var29] = var34;
                    } else {
                        var21[var29] = var13.method542();
                    }
                    if ((var32 & 0x2) == 0) {
                        var22[var29] = var34;
                    } else {
                        var22[var29] = var13.method542();
                    }
                    if ((var32 & 0x4) == 0) {
                        var23[var29] = var34;
                    } else {
                        var23[var29] = var13.method542();
                    }
                    var28 = var30;
                    var29++;
                    if (var18.field774[var30] == 5) {
                        field1355[var25] = false;
                    }
                }
            }
            var26.field1350 = var29;
            var26.field1351 = new int[var29];
            var26.field1352 = new int[var29];
            var26.field1353 = new int[var29];
            var26.field1354 = new int[var29];
            for (int var31 = 0; var31 < var29; var31++) {
                var26.field1351[var31] = var20[var31];
                var26.field1352[var31] = var21[var31];
                var26.field1353[var31] = var22[var31];
                var26.field1354[var31] = var23[var31];
            }
        }
    }

    @OriginalMember(owner = "client!OYJABRDD", name = "a", descriptor = "(B)V")
    public static void method465(byte arg0) {
        if (arg0 == 7) {
            boolean var1 = false;
        } else {
            field1346 = 168;
        }
        field1347 = null;
    }

    @OriginalMember(owner = "client!OYJABRDD", name = "b", descriptor = "(I)LOYJABRDD;")
    public static class47 method466(int arg0) {
        return field1347 == null ? null : field1347[arg0];
    }

    @OriginalMember(owner = "client!OYJABRDD", name = "a", descriptor = "(BI)Z")
    public static boolean method467(byte arg0, int arg1) {
        if (arg0 != -39) {
            field1345 = -425;
        }
        return arg1 == -1;
    }
}
