import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OJYMITMR")
public class class42 {

    @OriginalMember(owner = "client!OJYMITMR", name = "a", descriptor = "I")
    private static int field1300 = 4;

    @OriginalMember(owner = "client!OJYMITMR", name = "d", descriptor = "I")
    public int field1303;

    @OriginalMember(owner = "client!OJYMITMR", name = "f", descriptor = "I")
    public int field1305;

    @OriginalMember(owner = "client!OJYMITMR", name = "e", descriptor = "LEPQQXCGW;")
    public class16 field1304;

    @OriginalMember(owner = "client!OJYMITMR", name = "b", descriptor = "Z")
    private static boolean field1301;

    @OriginalMember(owner = "client!OJYMITMR", name = "g", descriptor = "[I")
    public int[] field1306;

    @OriginalMember(owner = "client!OJYMITMR", name = "h", descriptor = "[I")
    public int[] field1307;

    @OriginalMember(owner = "client!OJYMITMR", name = "i", descriptor = "[I")
    public int[] field1308;

    @OriginalMember(owner = "client!OJYMITMR", name = "j", descriptor = "[I")
    public int[] field1309;

    @OriginalMember(owner = "client!OJYMITMR", name = "c", descriptor = "[LOJYMITMR;")
    private static class42[] field1302;

    @OriginalMember(owner = "client!OJYMITMR", name = "k", descriptor = "[Z")
    private static boolean[] field1310;

    @OriginalMember(owner = "client!OJYMITMR", name = "a", descriptor = "(I)V")
    public static void method378(int arg0) {
        field1302 = new class42[arg0 + 1];
        field1310 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1310[var1] = true;
        }
    }

    @OriginalMember(owner = "client!OJYMITMR", name = "a", descriptor = "(B[B)V")
    public static void method379(byte arg0, byte[] arg1) {
        class25 var2 = new class25(arg1, 713);
        var2.field837 = arg1.length - 8;
        int var3 = var2.method247();
        int var4 = var2.method247();
        int var5 = var2.method247();
        int var6 = var2.method247();
        if (arg0 != -123) {
            return;
        }
        byte var7 = 0;
        class25 var8 = new class25(arg1, 713);
        var8.field837 = var7;
        int var9 = var3 + var7 + 2;
        class25 var10 = new class25(arg1, 713);
        var10.field837 = var9;
        int var11 = var4 + var9;
        class25 var12 = new class25(arg1, 713);
        var12.field837 = var11;
        int var13 = var5 + var11;
        class25 var14 = new class25(arg1, 713);
        var14.field837 = var13;
        int var15 = var6 + var13;
        class25 var16 = new class25(arg1, 713);
        var16.field837 = var15;
        class16 var17 = new class16(true, var16);
        int var18 = var8.method247();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method247();
            class42 var25 = field1302[var24] = new class42();
            var25.field1303 = var14.method245();
            var25.field1304 = var17;
            int var26 = var8.method245();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method245();
                if (var31 > 0) {
                    if (var17.field730[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field730[var32] == 0) {
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
                    if (var17.field730[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method258();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method258();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method258();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field730[var29] == 5) {
                        field1310[var24] = false;
                    }
                }
            }
            var25.field1305 = var28;
            var25.field1306 = new int[var28];
            var25.field1307 = new int[var28];
            var25.field1308 = new int[var28];
            var25.field1309 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field1306[var30] = var19[var30];
                var25.field1307[var30] = var20[var30];
                var25.field1308[var30] = var21[var30];
                var25.field1309[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "client!OJYMITMR", name = "a", descriptor = "(Z)V")
    public static void method380(boolean arg0) {
        field1302 = null;
        if (arg0) {
            field1301 = !field1301;
        }
    }

    @OriginalMember(owner = "client!OJYMITMR", name = "b", descriptor = "(I)LOJYMITMR;")
    public static class42 method381(int arg0) {
        return field1302 == null ? null : field1302[arg0];
    }

    @OriginalMember(owner = "client!OJYMITMR", name = "a", descriptor = "(II)Z")
    public static boolean method382(int arg0, int arg1) {
        if (field1300 != arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 == -1;
    }
}
