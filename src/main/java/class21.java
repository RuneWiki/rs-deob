import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FGGKJQKK")
public class class21 {

    @OriginalMember(owner = "client!FGGKJQKK", name = "b", descriptor = "I")
    public int field847;

    @OriginalMember(owner = "client!FGGKJQKK", name = "d", descriptor = "I")
    public int field849;

    @OriginalMember(owner = "client!FGGKJQKK", name = "c", descriptor = "LXZSJUDQY;")
    public class71 field848;

    @OriginalMember(owner = "client!FGGKJQKK", name = "e", descriptor = "[I")
    public int[] field850;

    @OriginalMember(owner = "client!FGGKJQKK", name = "f", descriptor = "[I")
    public int[] field851;

    @OriginalMember(owner = "client!FGGKJQKK", name = "g", descriptor = "[I")
    public int[] field852;

    @OriginalMember(owner = "client!FGGKJQKK", name = "h", descriptor = "[I")
    public int[] field853;

    @OriginalMember(owner = "client!FGGKJQKK", name = "a", descriptor = "[LFGGKJQKK;")
    private static class21[] field846;

    @OriginalMember(owner = "client!FGGKJQKK", name = "i", descriptor = "[Z")
    private static boolean[] field854;

    @OriginalMember(owner = "client!FGGKJQKK", name = "a", descriptor = "(I)V")
    public static void method231(int arg0) {
        field846 = new class21[arg0 + 1];
        field854 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field854[var1] = true;
        }
    }

    @OriginalMember(owner = "client!FGGKJQKK", name = "a", descriptor = "([BI)V")
    public static void method232(byte[] arg0, int arg1) {
        class58 var2 = new class58((byte) -115, arg0);
        var2.field1615 = arg0.length - 8;
        int var3 = var2.method517();
        if (arg1 < 0 || arg1 > 0) {
            return;
        }
        int var4 = var2.method517();
        int var5 = var2.method517();
        int var6 = var2.method517();
        byte var7 = 0;
        class58 var8 = new class58((byte) -115, arg0);
        var8.field1615 = var7;
        int var9 = var3 + var7 + 2;
        class58 var10 = new class58((byte) -115, arg0);
        var10.field1615 = var9;
        int var11 = var4 + var9;
        class58 var12 = new class58((byte) -115, arg0);
        var12.field1615 = var11;
        int var13 = var5 + var11;
        class58 var14 = new class58((byte) -115, arg0);
        var14.field1615 = var13;
        int var15 = var6 + var13;
        class58 var16 = new class58((byte) -115, arg0);
        var16.field1615 = var15;
        class71 var17 = new class71(var16, 0);
        int var18 = var8.method517();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method517();
            class21 var25 = field846[var24] = new class21();
            var25.field847 = var14.method515();
            var25.field848 = var17;
            int var26 = var8.method515();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method515();
                if (var31 > 0) {
                    if (var17.field1739[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field1739[var32] == 0) {
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
                    if (var17.field1739[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method528();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method528();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method528();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field1739[var29] == 5) {
                        field854[var24] = false;
                    }
                }
            }
            var25.field849 = var28;
            var25.field850 = new int[var28];
            var25.field851 = new int[var28];
            var25.field852 = new int[var28];
            var25.field853 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field850[var30] = var19[var30];
                var25.field851[var30] = var20[var30];
                var25.field852[var30] = var21[var30];
                var25.field853[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "client!FGGKJQKK", name = "b", descriptor = "(I)V")
    public static void method233(int arg0) {
        field846 = null;
        if (arg0 < 6 || arg0 > 6) {
            ;
        }
    }

    @OriginalMember(owner = "client!FGGKJQKK", name = "c", descriptor = "(I)LFGGKJQKK;")
    public static class21 method234(int arg0) {
        return field846 == null ? null : field846[arg0];
    }

    @OriginalMember(owner = "client!FGGKJQKK", name = "a", descriptor = "(II)Z")
    public static boolean method235(int arg0, int arg1) {
        if (arg1 != 12073) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 == -1;
    }
}
