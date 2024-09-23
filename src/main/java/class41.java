import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RKTGZGSS")
public class class41 {

    @OriginalMember(owner = "RKTGZGSS", name = "a", descriptor = "I")
    private static int field1295 = -302;

    @OriginalMember(owner = "RKTGZGSS", name = "d", descriptor = "I")
    public int field1298;

    @OriginalMember(owner = "RKTGZGSS", name = "f", descriptor = "I")
    public int field1300;

    @OriginalMember(owner = "RKTGZGSS", name = "e", descriptor = "LDIQFKGVT;")
    public class10 field1299;

    @OriginalMember(owner = "RKTGZGSS", name = "b", descriptor = "Z")
    private static boolean field1296;

    @OriginalMember(owner = "RKTGZGSS", name = "g", descriptor = "[I")
    public int[] field1301;

    @OriginalMember(owner = "RKTGZGSS", name = "h", descriptor = "[I")
    public int[] field1302;

    @OriginalMember(owner = "RKTGZGSS", name = "i", descriptor = "[I")
    public int[] field1303;

    @OriginalMember(owner = "RKTGZGSS", name = "j", descriptor = "[I")
    public int[] field1304;

    @OriginalMember(owner = "RKTGZGSS", name = "c", descriptor = "[LRKTGZGSS;")
    private static class41[] field1297;

    @OriginalMember(owner = "RKTGZGSS", name = "k", descriptor = "[Z")
    private static boolean[] field1305;

    @OriginalMember(owner = "RKTGZGSS", name = "a", descriptor = "(I)V")
    public static void method379(int arg0) {
        field1297 = new class41[arg0 + 1];
        field1305 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1305[var1] = true;
        }
    }

    @OriginalMember(owner = "RKTGZGSS", name = "a", descriptor = "([BZ)V")
    public static void method380(byte[] arg0, boolean arg1) {
        class69 var2 = new class69(arg0, field1295);
        var2.field1700 = arg0.length - 8;
        int var3 = var2.method549();
        int var4 = var2.method549();
        int var5 = var2.method549();
        int var6 = var2.method549();
        byte var7 = 0;
        class69 var8 = new class69(arg0, field1295);
        var8.field1700 = var7;
        int var9 = var3 + var7 + 2;
        class69 var10 = new class69(arg0, field1295);
        var10.field1700 = var9;
        int var11 = var4 + var9;
        class69 var12 = new class69(arg0, field1295);
        var12.field1700 = var11;
        int var13 = var5 + var11;
        class69 var14 = new class69(arg0, field1295);
        var14.field1700 = var13;
        int var15 = var6 + var13;
        class69 var16 = new class69(arg0, field1295);
        var16.field1700 = var15;
        class10 var17 = new class10(var16, -999);
        if (!arg1) {
            return;
        }
        int var18 = var8.method549();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method549();
            class41 var25 = field1297[var24] = new class41();
            var25.field1298 = var14.method547();
            var25.field1299 = var17;
            int var26 = var8.method547();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method547();
                if (var31 > 0) {
                    if (var17.field710[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field710[var32] == 0) {
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
                    if (var17.field710[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method560();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method560();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method560();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field710[var29] == 5) {
                        field1305[var24] = false;
                    }
                }
            }
            var25.field1300 = var28;
            var25.field1301 = new int[var28];
            var25.field1302 = new int[var28];
            var25.field1303 = new int[var28];
            var25.field1304 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field1301[var30] = var19[var30];
                var25.field1302[var30] = var20[var30];
                var25.field1303[var30] = var21[var30];
                var25.field1304[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "RKTGZGSS", name = "a", descriptor = "(B)V")
    public static void method381(byte arg0) {
        field1297 = null;
        if (arg0 != 46) {
            field1296 = !field1296;
        }
    }

    @OriginalMember(owner = "RKTGZGSS", name = "a", descriptor = "(II)LRKTGZGSS;")
    public static class41 method382(int arg0, int arg1) {
        if (arg1 >= 0) {
            field1295 = 474;
        }
        return field1297 == null ? null : field1297[arg0];
    }

    @OriginalMember(owner = "RKTGZGSS", name = "a", descriptor = "(IB)Z")
    public static boolean method383(int arg0, byte arg1) {
        if (arg1 == 8) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return arg0 == -1;
    }
}
