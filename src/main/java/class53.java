import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SCWTQUFK")
public class class53 {

    @OriginalMember(owner = "client!SCWTQUFK", name = "b", descriptor = "I")
    public int field1404;

    @OriginalMember(owner = "client!SCWTQUFK", name = "d", descriptor = "I")
    public int field1406;

    @OriginalMember(owner = "client!SCWTQUFK", name = "c", descriptor = "LGCSWWDCL;")
    public class14 field1405;

    @OriginalMember(owner = "client!SCWTQUFK", name = "e", descriptor = "[I")
    public int[] field1407;

    @OriginalMember(owner = "client!SCWTQUFK", name = "f", descriptor = "[I")
    public int[] field1408;

    @OriginalMember(owner = "client!SCWTQUFK", name = "g", descriptor = "[I")
    public int[] field1409;

    @OriginalMember(owner = "client!SCWTQUFK", name = "h", descriptor = "[I")
    public int[] field1410;

    @OriginalMember(owner = "client!SCWTQUFK", name = "a", descriptor = "[LSCWTQUFK;")
    private static class53[] field1403;

    @OriginalMember(owner = "client!SCWTQUFK", name = "i", descriptor = "[Z")
    private static boolean[] field1411;

    @OriginalMember(owner = "client!SCWTQUFK", name = "a", descriptor = "(I)V")
    public static void method451(int arg0) {
        field1403 = new class53[arg0 + 1];
        field1411 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1411[var1] = true;
        }
    }

    @OriginalMember(owner = "client!SCWTQUFK", name = "a", descriptor = "([BI)V")
    public static void method452(byte[] arg0, int arg1) {
        class13 var2 = new class13(arg0, (byte) 3);
        var2.field643 = arg0.length - 8;
        int var3 = var2.method215();
        int var4 = var2.method215();
        int var5 = var2.method215();
        int var6 = var2.method215();
        byte var7 = 0;
        class13 var8 = new class13(arg0, (byte) 3);
        var8.field643 = var7;
        int var9 = var3 + var7 + 2;
        class13 var10 = new class13(arg0, (byte) 3);
        var10.field643 = var9;
        int var11 = var4 + var9;
        class13 var12 = new class13(arg0, (byte) 3);
        if (arg1 >= 0) {
            return;
        }
        var12.field643 = var11;
        int var13 = var5 + var11;
        class13 var14 = new class13(arg0, (byte) 3);
        var14.field643 = var13;
        int var15 = var6 + var13;
        class13 var16 = new class13(arg0, (byte) 3);
        var16.field643 = var15;
        class14 var17 = new class14((byte) -26, var16);
        int var18 = var8.method215();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method215();
            class53 var25 = field1403[var24] = new class53();
            var25.field1404 = var14.method213();
            var25.field1405 = var17;
            int var26 = var8.method213();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method213();
                if (var31 > 0) {
                    if (var17.field659[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field659[var32] == 0) {
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
                    if (var17.field659[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method226();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method226();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method226();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field659[var29] == 5) {
                        field1411[var24] = false;
                    }
                }
            }
            var25.field1406 = var28;
            var25.field1407 = new int[var28];
            var25.field1408 = new int[var28];
            var25.field1409 = new int[var28];
            var25.field1410 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field1407[var30] = var19[var30];
                var25.field1408[var30] = var20[var30];
                var25.field1409[var30] = var21[var30];
                var25.field1410[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "client!SCWTQUFK", name = "b", descriptor = "(I)V")
    public static void method453(int arg0) {
        if (arg0 <= 0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field1403 = null;
    }

    @OriginalMember(owner = "client!SCWTQUFK", name = "c", descriptor = "(I)LSCWTQUFK;")
    public static class53 method454(int arg0) {
        return field1403 == null ? null : field1403[arg0];
    }

    @OriginalMember(owner = "client!SCWTQUFK", name = "a", descriptor = "(ZI)Z")
    public static boolean method455(boolean arg0, int arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return arg1 == -1;
    }
}
