import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QGRLAQIF")
public class class46 {

    @OriginalMember(owner = "client!QGRLAQIF", name = "b", descriptor = "I")
    public int field1319;

    @OriginalMember(owner = "client!QGRLAQIF", name = "d", descriptor = "I")
    public int field1321;

    @OriginalMember(owner = "client!QGRLAQIF", name = "c", descriptor = "LQZXSFRVC;")
    public class47 field1320;

    @OriginalMember(owner = "client!QGRLAQIF", name = "e", descriptor = "[I")
    public int[] field1322;

    @OriginalMember(owner = "client!QGRLAQIF", name = "f", descriptor = "[I")
    public int[] field1323;

    @OriginalMember(owner = "client!QGRLAQIF", name = "g", descriptor = "[I")
    public int[] field1324;

    @OriginalMember(owner = "client!QGRLAQIF", name = "h", descriptor = "[I")
    public int[] field1325;

    @OriginalMember(owner = "client!QGRLAQIF", name = "a", descriptor = "[LQGRLAQIF;")
    private static class46[] field1318;

    @OriginalMember(owner = "client!QGRLAQIF", name = "i", descriptor = "[Z")
    private static boolean[] field1326;

    @OriginalMember(owner = "client!QGRLAQIF", name = "a", descriptor = "(I)V")
    public static void method465(int arg0) {
        field1318 = new class46[arg0 + 1];
        field1326 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1326[var1] = true;
        }
    }

    @OriginalMember(owner = "client!QGRLAQIF", name = "a", descriptor = "([BB)V")
    public static void method466(byte[] arg0, byte arg1) {
        class32 var2 = new class32((byte) 114, arg0);
        var2.field1032 = arg0.length - 8;
        int var3 = var2.method371();
        int var4 = var2.method371();
        int var5 = var2.method371();
        if (arg1 != -21) {
            return;
        }
        int var6 = var2.method371();
        byte var7 = 0;
        class32 var8 = new class32((byte) 114, arg0);
        var8.field1032 = var7;
        int var9 = var3 + var7 + 2;
        class32 var10 = new class32((byte) 114, arg0);
        var10.field1032 = var9;
        int var11 = var4 + var9;
        class32 var12 = new class32((byte) 114, arg0);
        var12.field1032 = var11;
        int var13 = var5 + var11;
        class32 var14 = new class32((byte) 114, arg0);
        var14.field1032 = var13;
        int var15 = var6 + var13;
        class32 var16 = new class32((byte) 114, arg0);
        var16.field1032 = var15;
        class47 var17 = new class47(true, var16);
        int var18 = var8.method371();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method371();
            class46 var25 = field1318[var24] = new class46();
            var25.field1319 = var14.method369();
            var25.field1320 = var17;
            int var26 = var8.method369();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method369();
                if (var31 > 0) {
                    if (var17.field1330[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field1330[var32] == 0) {
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
                    if (var17.field1330[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method382();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method382();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method382();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field1330[var29] == 5) {
                        field1326[var24] = false;
                    }
                }
            }
            var25.field1321 = var28;
            var25.field1322 = new int[var28];
            var25.field1323 = new int[var28];
            var25.field1324 = new int[var28];
            var25.field1325 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field1322[var30] = var19[var30];
                var25.field1323[var30] = var20[var30];
                var25.field1324[var30] = var21[var30];
                var25.field1325[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "client!QGRLAQIF", name = "a", descriptor = "(Z)V")
    public static void method467(boolean arg0) {
        if (!arg0) {
            field1318 = null;
        }
    }

    @OriginalMember(owner = "client!QGRLAQIF", name = "b", descriptor = "(I)LQGRLAQIF;")
    public static class46 method468(int arg0) {
        return field1318 == null ? null : field1318[arg0];
    }

    @OriginalMember(owner = "client!QGRLAQIF", name = "a", descriptor = "(IZ)Z")
    public static boolean method469(int arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        }
        return arg0 == -1;
    }
}
