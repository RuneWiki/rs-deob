import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TTZHVWEG")
public class class51 {

    @OriginalMember(owner = "TTZHVWEG", name = "c", descriptor = "I")
    private static int field1291 = 1;

    @OriginalMember(owner = "TTZHVWEG", name = "e", descriptor = "I")
    public int field1293;

    @OriginalMember(owner = "TTZHVWEG", name = "g", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "TTZHVWEG", name = "f", descriptor = "LAECNGNXZ;")
    public class1 field1294;

    @OriginalMember(owner = "TTZHVWEG", name = "a", descriptor = "Z")
    private static boolean field1289;

    @OriginalMember(owner = "TTZHVWEG", name = "b", descriptor = "Z")
    private static boolean field1290;

    @OriginalMember(owner = "TTZHVWEG", name = "h", descriptor = "[I")
    public int[] field1296;

    @OriginalMember(owner = "TTZHVWEG", name = "i", descriptor = "[I")
    public int[] field1297;

    @OriginalMember(owner = "TTZHVWEG", name = "j", descriptor = "[I")
    public int[] field1298;

    @OriginalMember(owner = "TTZHVWEG", name = "k", descriptor = "[I")
    public int[] field1299;

    @OriginalMember(owner = "TTZHVWEG", name = "d", descriptor = "[LTTZHVWEG;")
    private static class51[] field1292;

    @OriginalMember(owner = "TTZHVWEG", name = "l", descriptor = "[Z")
    private static boolean[] field1300;

    @OriginalMember(owner = "TTZHVWEG", name = "a", descriptor = "(I)V")
    public static void method485(int arg0) {
        field1292 = new class51[arg0 + 1];
        field1300 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1300[var1] = true;
        }
    }

    @OriginalMember(owner = "TTZHVWEG", name = "a", descriptor = "(Z[B)V")
    public static void method486(boolean arg0, byte[] arg1) {
        class21 var2 = new class21(arg1, -49015);
        var2.field818 = arg1.length - 8;
        int var3 = var2.method246();
        int var4 = var2.method246();
        int var5 = var2.method246();
        int var6 = var2.method246();
        byte var7 = 0;
        class21 var8 = new class21(arg1, -49015);
        var8.field818 = var7;
        int var9 = var3 + var7 + 2;
        class21 var10 = new class21(arg1, -49015);
        var10.field818 = var9;
        int var11 = var4 + var9;
        class21 var12 = new class21(arg1, -49015);
        if (arg0) {
            field1289 = !field1289;
        }
        var12.field818 = var11;
        int var13 = var5 + var11;
        class21 var14 = new class21(arg1, -49015);
        var14.field818 = var13;
        int var15 = var6 + var13;
        class21 var16 = new class21(arg1, -49015);
        var16.field818 = var15;
        class1 var17 = new class1(false, var16);
        int var18 = var8.method246();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method246();
            class51 var25 = field1292[var24] = new class51();
            var25.field1293 = var14.method244();
            var25.field1294 = var17;
            int var26 = var8.method244();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method244();
                if (var31 > 0) {
                    if (var17.field3[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field3[var32] == 0) {
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
                    if (var17.field3[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method257();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method257();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method257();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field3[var29] == 5) {
                        field1300[var24] = false;
                    }
                }
            }
            var25.field1295 = var28;
            var25.field1296 = new int[var28];
            var25.field1297 = new int[var28];
            var25.field1298 = new int[var28];
            var25.field1299 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field1296[var30] = var19[var30];
                var25.field1297[var30] = var20[var30];
                var25.field1298[var30] = var21[var30];
                var25.field1299[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "TTZHVWEG", name = "b", descriptor = "(I)V")
    public static void method487(int arg0) {
        field1292 = null;
        if (arg0 != 2) {
            field1290 = !field1290;
        }
    }

    @OriginalMember(owner = "TTZHVWEG", name = "a", descriptor = "(BI)LTTZHVWEG;")
    public static class51 method488(byte arg0, int arg1) {
        if (arg0 == 5) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return field1292 == null ? null : field1292[arg1];
    }

    @OriginalMember(owner = "TTZHVWEG", name = "a", descriptor = "(IB)Z")
    public static boolean method489(int arg0, byte arg1) {
        if (arg1 == 1) {
            boolean var2 = false;
        } else {
            field1291 = 340;
        }
        return arg0 == -1;
    }
}
