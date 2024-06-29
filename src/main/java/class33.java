import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NXEWQQJO")
public class class33 {

    @OriginalMember(owner = "client!NXEWQQJO", name = "a", descriptor = "I")
    private static int field1013;

    @OriginalMember(owner = "client!NXEWQQJO", name = "c", descriptor = "I")
    public int field1015;

    @OriginalMember(owner = "client!NXEWQQJO", name = "e", descriptor = "I")
    public int field1017;

    @OriginalMember(owner = "client!NXEWQQJO", name = "d", descriptor = "LIIXTARMC;")
    public class19 field1016;

    @OriginalMember(owner = "client!NXEWQQJO", name = "f", descriptor = "[I")
    public int[] field1018;

    @OriginalMember(owner = "client!NXEWQQJO", name = "g", descriptor = "[I")
    public int[] field1019;

    @OriginalMember(owner = "client!NXEWQQJO", name = "h", descriptor = "[I")
    public int[] field1020;

    @OriginalMember(owner = "client!NXEWQQJO", name = "i", descriptor = "[I")
    public int[] field1021;

    @OriginalMember(owner = "client!NXEWQQJO", name = "b", descriptor = "[LNXEWQQJO;")
    private static class33[] field1014;

    @OriginalMember(owner = "client!NXEWQQJO", name = "j", descriptor = "[Z")
    private static boolean[] field1022;

    @OriginalMember(owner = "client!NXEWQQJO", name = "a", descriptor = "(I)V")
    public static void method333(int arg0) {
        field1014 = new class33[arg0 + 1];
        field1022 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1022[var1] = true;
        }
    }

    @OriginalMember(owner = "client!NXEWQQJO", name = "a", descriptor = "([BI)V")
    public static void method334(byte[] arg0, int arg1) {
        class14 var2 = new class14(arg0, true);
        var2.field707 = arg0.length - 8;
        int var3 = var2.method219();
        int var4 = var2.method219();
        int var5 = var2.method219();
        int var6 = var2.method219();
        byte var7 = 0;
        class14 var8 = new class14(arg0, true);
        var8.field707 = var7;
        int var9 = var3 + var7 + 2;
        class14 var10 = new class14(arg0, true);
        var10.field707 = var9;
        int var11 = var4 + var9;
        class14 var12 = new class14(arg0, true);
        if (arg1 != 0) {
            field1013 = -27;
        }
        var12.field707 = var11;
        int var13 = var5 + var11;
        class14 var14 = new class14(arg0, true);
        var14.field707 = var13;
        int var15 = var6 + var13;
        class14 var16 = new class14(arg0, true);
        var16.field707 = var15;
        class19 var17 = new class19(var16, 9);
        int var18 = var8.method219();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method219();
            class33 var25 = field1014[var24] = new class33();
            var25.field1015 = var14.method217();
            var25.field1016 = var17;
            int var26 = var8.method217();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method217();
                if (var31 > 0) {
                    if (var17.field835[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field835[var32] == 0) {
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
                    if (var17.field835[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method230();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method230();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method230();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field835[var29] == 5) {
                        field1022[var24] = false;
                    }
                }
            }
            var25.field1017 = var28;
            var25.field1018 = new int[var28];
            var25.field1019 = new int[var28];
            var25.field1020 = new int[var28];
            var25.field1021 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field1018[var30] = var19[var30];
                var25.field1019[var30] = var20[var30];
                var25.field1020[var30] = var21[var30];
                var25.field1021[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "client!NXEWQQJO", name = "a", descriptor = "(Z)V")
    public static void method335(boolean arg0) {
        field1014 = null;
        if (arg0) {
            field1013 = -20;
        }
    }

    @OriginalMember(owner = "client!NXEWQQJO", name = "b", descriptor = "(I)LNXEWQQJO;")
    public static class33 method336(int arg0) {
        return field1014 == null ? null : field1014[arg0];
    }

    @OriginalMember(owner = "client!NXEWQQJO", name = "a", descriptor = "(BI)Z")
    public static boolean method337(byte arg0, int arg1) {
        if (arg0 == 0) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return arg1 == -1;
    }
}
