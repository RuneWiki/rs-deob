import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UEUSJYYO")
public class class56 {

    @OriginalMember(owner = "UEUSJYYO", name = "b", descriptor = "I")
    private static int field1369 = -28858;

    @OriginalMember(owner = "UEUSJYYO", name = "d", descriptor = "I")
    private static int field1371 = -21772;

    @OriginalMember(owner = "UEUSJYYO", name = "a", descriptor = "I")
    private static int field1368;

    @OriginalMember(owner = "UEUSJYYO", name = "f", descriptor = "I")
    public int field1373;

    @OriginalMember(owner = "UEUSJYYO", name = "h", descriptor = "I")
    public int field1375;

    @OriginalMember(owner = "UEUSJYYO", name = "g", descriptor = "LETJKXQLD;")
    public class17 field1374;

    @OriginalMember(owner = "UEUSJYYO", name = "c", descriptor = "Z")
    private static boolean field1370;

    @OriginalMember(owner = "UEUSJYYO", name = "i", descriptor = "[I")
    public int[] field1376;

    @OriginalMember(owner = "UEUSJYYO", name = "j", descriptor = "[I")
    public int[] field1377;

    @OriginalMember(owner = "UEUSJYYO", name = "k", descriptor = "[I")
    public int[] field1378;

    @OriginalMember(owner = "UEUSJYYO", name = "l", descriptor = "[I")
    public int[] field1379;

    @OriginalMember(owner = "UEUSJYYO", name = "e", descriptor = "[LUEUSJYYO;")
    private static class56[] field1372;

    @OriginalMember(owner = "UEUSJYYO", name = "m", descriptor = "[Z")
    private static boolean[] field1380;

    @OriginalMember(owner = "UEUSJYYO", name = "a", descriptor = "(I)V")
    public static void method532(int arg0) {
        field1372 = new class56[arg0 + 1];
        field1380 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1380[var1] = true;
        }
    }

    @OriginalMember(owner = "UEUSJYYO", name = "a", descriptor = "(B[B)V")
    public static void method533(byte arg0, byte[] arg1) {
        class34 var2 = new class34(arg1, field1368);
        var2.field1073 = arg1.length - 8;
        int var3 = var2.method404();
        int var4 = var2.method404();
        int var5 = var2.method404();
        int var6 = var2.method404();
        byte var7 = 0;
        class34 var8 = new class34(arg1, field1368);
        var8.field1073 = var7;
        int var9 = var3 + var7 + 2;
        class34 var10 = new class34(arg1, field1368);
        var10.field1073 = var9;
        int var11 = var4 + var9;
        class34 var12 = new class34(arg1, field1368);
        var12.field1073 = var11;
        int var13 = var5 + var11;
        class34 var14 = new class34(arg1, field1368);
        if (arg0 != 9) {
            return;
        }
        var14.field1073 = var13;
        int var15 = var6 + var13;
        class34 var16 = new class34(arg1, field1368);
        var16.field1073 = var15;
        class17 var17 = new class17(field1370, var16);
        int var18 = var8.method404();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method404();
            class56 var25 = field1372[var24] = new class56();
            var25.field1373 = var14.method402();
            var25.field1374 = var17;
            int var26 = var8.method402();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method402();
                if (var31 > 0) {
                    if (var17.field706[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field706[var32] == 0) {
                                var19[var28] = var32;
                                var20[var28] = 0;
                                var21[var28] = 0;
                                var22[var28] = 0;
                                var28++;
                                break;
                            }
                        }
                    }
                    var19[var28] = var29;
                    short var33 = 0;
                    if (var17.field706[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method415();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method415();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method415();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field706[var29] == 5) {
                        field1380[var24] = false;
                    }
                }
            }
            var25.field1375 = var28;
            var25.field1376 = new int[var28];
            var25.field1377 = new int[var28];
            var25.field1378 = new int[var28];
            var25.field1379 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field1376[var30] = var19[var30];
                var25.field1377[var30] = var20[var30];
                var25.field1378[var30] = var21[var30];
                var25.field1379[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "UEUSJYYO", name = "b", descriptor = "(I)V")
    public static void method534(int arg0) {
        field1372 = null;
        if (arg0 != 0) {
            field1369 = 398;
        }
    }

    @OriginalMember(owner = "UEUSJYYO", name = "a", descriptor = "(IB)LUEUSJYYO;")
    public static class56 method535(int arg0, byte arg1) {
        if (arg1 != 71) {
            field1371 = -155;
        }
        return field1372 == null ? null : field1372[arg0];
    }

    @OriginalMember(owner = "UEUSJYYO", name = "a", descriptor = "(II)Z")
    public static boolean method536(int arg0, int arg1) {
        if (arg1 != 9643) {
            throw new NullPointerException();
        }
        return arg0 == -1;
    }
}
