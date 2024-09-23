import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("APJPJMYV")
public class class2 {

    @OriginalMember(owner = "APJPJMYV", name = "b", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "APJPJMYV", name = "d", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "APJPJMYV", name = "c", descriptor = "LMOLQXLMB;")
    public class46 field14;

    @OriginalMember(owner = "APJPJMYV", name = "e", descriptor = "[I")
    public int[] field16;

    @OriginalMember(owner = "APJPJMYV", name = "f", descriptor = "[I")
    public int[] field17;

    @OriginalMember(owner = "APJPJMYV", name = "g", descriptor = "[I")
    public int[] field18;

    @OriginalMember(owner = "APJPJMYV", name = "h", descriptor = "[I")
    public int[] field19;

    @OriginalMember(owner = "APJPJMYV", name = "a", descriptor = "[LAPJPJMYV;")
    private static class2[] field12;

    @OriginalMember(owner = "APJPJMYV", name = "i", descriptor = "[Z")
    private static boolean[] field20;

    @OriginalMember(owner = "APJPJMYV", name = "a", descriptor = "(I)V")
    public static void method7(int arg0) {
        field12 = new class2[arg0 + 1];
        field20 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field20[var1] = true;
        }
    }

    @OriginalMember(owner = "APJPJMYV", name = "a", descriptor = "(Z[B)V")
    public static void method8(boolean arg0, byte[] arg1) {
        class69 var2 = new class69(arg1, -82);
        var2.field1652 = arg1.length - 8;
        int var3 = var2.method467();
        int var4 = var2.method467();
        int var5 = var2.method467();
        int var6 = var2.method467();
        byte var7 = 0;
        class69 var8 = new class69(arg1, -82);
        var8.field1652 = var7;
        int var9 = var3 + var7 + 2;
        if (arg0) {
            return;
        }
        class69 var10 = new class69(arg1, -82);
        var10.field1652 = var9;
        int var11 = var4 + var9;
        class69 var12 = new class69(arg1, -82);
        var12.field1652 = var11;
        int var13 = var5 + var11;
        class69 var14 = new class69(arg1, -82);
        var14.field1652 = var13;
        int var15 = var6 + var13;
        class69 var16 = new class69(arg1, -82);
        var16.field1652 = var15;
        class46 var17 = new class46(var16, true);
        int var18 = var8.method467();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method467();
            class2 var25 = field12[var24] = new class2();
            var25.field13 = var14.method465();
            var25.field14 = var17;
            int var26 = var8.method465();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method465();
                if (var31 > 0) {
                    if (var17.field1205[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field1205[var32] == 0) {
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
                    if (var17.field1205[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method478();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method478();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method478();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field1205[var29] == 5) {
                        field20[var24] = false;
                    }
                }
            }
            var25.field15 = var28;
            var25.field16 = new int[var28];
            var25.field17 = new int[var28];
            var25.field18 = new int[var28];
            var25.field19 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field16[var30] = var19[var30];
                var25.field17[var30] = var20[var30];
                var25.field18[var30] = var21[var30];
                var25.field19[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "APJPJMYV", name = "a", descriptor = "(B)V")
    public static void method9(byte arg0) {
        field12 = null;
        if (arg0 == -117) {
            ;
        }
    }

    @OriginalMember(owner = "APJPJMYV", name = "b", descriptor = "(I)LAPJPJMYV;")
    public static class2 method10(int arg0) {
        return field12 == null ? null : field12[arg0];
    }

    @OriginalMember(owner = "APJPJMYV", name = "a", descriptor = "(BI)Z")
    public static boolean method11(byte arg0, int arg1) {
        if (arg0 != 85) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 == -1;
    }
}
