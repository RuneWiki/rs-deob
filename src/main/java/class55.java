import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RYVJCVCB")
public class class55 {

    @OriginalMember(owner = "RYVJCVCB", name = "a", descriptor = "I")
    private static int field1332 = 1;

    @OriginalMember(owner = "RYVJCVCB", name = "b", descriptor = "I")
    private static int field1333 = 754;

    @OriginalMember(owner = "RYVJCVCB", name = "d", descriptor = "I")
    public int field1335;

    @OriginalMember(owner = "RYVJCVCB", name = "f", descriptor = "I")
    public int field1337;

    @OriginalMember(owner = "RYVJCVCB", name = "e", descriptor = "LANHDGPPA;")
    public class4 field1336;

    @OriginalMember(owner = "RYVJCVCB", name = "g", descriptor = "[I")
    public int[] field1338;

    @OriginalMember(owner = "RYVJCVCB", name = "h", descriptor = "[I")
    public int[] field1339;

    @OriginalMember(owner = "RYVJCVCB", name = "i", descriptor = "[I")
    public int[] field1340;

    @OriginalMember(owner = "RYVJCVCB", name = "j", descriptor = "[I")
    public int[] field1341;

    @OriginalMember(owner = "RYVJCVCB", name = "c", descriptor = "[LRYVJCVCB;")
    private static class55[] field1334;

    @OriginalMember(owner = "RYVJCVCB", name = "k", descriptor = "[Z")
    private static boolean[] field1342;

    @OriginalMember(owner = "RYVJCVCB", name = "a", descriptor = "(I)V")
    public static void method424(int arg0) {
        field1334 = new class55[arg0 + 1];
        field1342 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1342[var1] = true;
        }
    }

    @OriginalMember(owner = "RYVJCVCB", name = "a", descriptor = "([BI)V")
    public static void method425(byte[] arg0, int arg1) {
        class68 var2 = new class68((byte) 9, arg0);
        var2.field1643 = arg0.length - 8;
        int var3 = var2.method536();
        int var4 = var2.method536();
        int var5 = var2.method536();
        int var6 = var2.method536();
        byte var7 = 0;
        class68 var8 = new class68((byte) 9, arg0);
        var8.field1643 = var7;
        int var9 = var3 + var7 + 2;
        class68 var10 = new class68((byte) 9, arg0);
        var10.field1643 = var9;
        int var11 = var4 + var9;
        class68 var12 = new class68((byte) 9, arg0);
        var12.field1643 = var11;
        int var13 = var5 + var11;
        class68 var14 = new class68((byte) 9, arg0);
        var14.field1643 = var13;
        int var15 = var6 + var13;
        class68 var16 = new class68((byte) 9, arg0);
        if (arg1 != 0) {
            return;
        }
        var16.field1643 = var15;
        class4 var17 = new class4(field1333, var16);
        int var18 = var8.method536();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method536();
            class55 var25 = field1334[var24] = new class55();
            var25.field1335 = var14.method534();
            var25.field1336 = var17;
            int var26 = var8.method534();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method534();
                if (var31 > 0) {
                    if (var17.field38[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field38[var32] == 0) {
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
                    if (var17.field38[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method547();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method547();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method547();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field38[var29] == 5) {
                        field1342[var24] = false;
                    }
                }
            }
            var25.field1337 = var28;
            var25.field1338 = new int[var28];
            var25.field1339 = new int[var28];
            var25.field1340 = new int[var28];
            var25.field1341 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field1338[var30] = var19[var30];
                var25.field1339[var30] = var20[var30];
                var25.field1340[var30] = var21[var30];
                var25.field1341[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "RYVJCVCB", name = "b", descriptor = "(I)V")
    public static void method426(int arg0) {
        if (arg0 != 0) {
            field1333 = 177;
        }
        field1334 = null;
    }

    @OriginalMember(owner = "RYVJCVCB", name = "a", descriptor = "(ZI)LRYVJCVCB;")
    public static class55 method427(boolean arg0, int arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return field1334 == null ? null : field1334[arg1];
    }

    @OriginalMember(owner = "RYVJCVCB", name = "a", descriptor = "(II)Z")
    public static boolean method428(int arg0, int arg1) {
        if (arg0 < 4 || arg0 > 4) {
            field1332 = -196;
        }
        return arg1 == -1;
    }
}
