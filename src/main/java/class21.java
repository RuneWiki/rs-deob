import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HVIFHYEW")
public class class21 {

    @OriginalMember(owner = "HVIFHYEW", name = "a", descriptor = "Z")
    private static boolean field835 = true;

    @OriginalMember(owner = "HVIFHYEW", name = "b", descriptor = "I")
    private static int field836 = -48545;

    @OriginalMember(owner = "HVIFHYEW", name = "c", descriptor = "I")
    private static int field837;

    @OriginalMember(owner = "HVIFHYEW", name = "e", descriptor = "I")
    public int field839;

    @OriginalMember(owner = "HVIFHYEW", name = "g", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "HVIFHYEW", name = "f", descriptor = "LXEMMPKIX;")
    public class60 field840;

    @OriginalMember(owner = "HVIFHYEW", name = "h", descriptor = "[I")
    public int[] field842;

    @OriginalMember(owner = "HVIFHYEW", name = "i", descriptor = "[I")
    public int[] field843;

    @OriginalMember(owner = "HVIFHYEW", name = "j", descriptor = "[I")
    public int[] field844;

    @OriginalMember(owner = "HVIFHYEW", name = "k", descriptor = "[I")
    public int[] field845;

    @OriginalMember(owner = "HVIFHYEW", name = "d", descriptor = "[LHVIFHYEW;")
    private static class21[] field838;

    @OriginalMember(owner = "HVIFHYEW", name = "l", descriptor = "[Z")
    private static boolean[] field846;

    @OriginalMember(owner = "HVIFHYEW", name = "a", descriptor = "(I)V")
    public static void method283(int arg0) {
        field838 = new class21[arg0 + 1];
        field846 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field846[var1] = true;
        }
    }

    @OriginalMember(owner = "HVIFHYEW", name = "a", descriptor = "(Z[B)V")
    public static void method284(boolean arg0, byte[] arg1) {
        class42 var2 = new class42(5, arg1);
        var2.field1250 = arg1.length - 8;
        int var3 = var2.method422();
        int var4 = var2.method422();
        int var5 = var2.method422();
        int var6 = var2.method422();
        byte var7 = 0;
        class42 var8 = new class42(5, arg1);
        var8.field1250 = var7;
        if (!arg0) {
            return;
        }
        int var9 = var3 + var7 + 2;
        class42 var10 = new class42(5, arg1);
        var10.field1250 = var9;
        int var11 = var4 + var9;
        class42 var12 = new class42(5, arg1);
        var12.field1250 = var11;
        int var13 = var5 + var11;
        class42 var14 = new class42(5, arg1);
        var14.field1250 = var13;
        int var15 = var6 + var13;
        class42 var16 = new class42(5, arg1);
        var16.field1250 = var15;
        class60 var17 = new class60(var16, 428);
        int var18 = var8.method422();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method422();
            class21 var25 = field838[var24] = new class21();
            var25.field839 = var14.method420();
            var25.field840 = var17;
            int var26 = var8.method420();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method420();
                if (var31 > 0) {
                    if (var17.field1535[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field1535[var32] == 0) {
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
                    if (var17.field1535[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method433();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method433();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method433();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field1535[var29] == 5) {
                        field846[var24] = false;
                    }
                }
            }
            var25.field841 = var28;
            var25.field842 = new int[var28];
            var25.field843 = new int[var28];
            var25.field844 = new int[var28];
            var25.field845 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field842[var30] = var19[var30];
                var25.field843[var30] = var20[var30];
                var25.field844[var30] = var21[var30];
                var25.field845[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "HVIFHYEW", name = "b", descriptor = "(I)V")
    public static void method285(int arg0) {
        if (field836 != arg0) {
            field837 = 56;
        }
        field838 = null;
    }

    @OriginalMember(owner = "HVIFHYEW", name = "c", descriptor = "(I)LHVIFHYEW;")
    public static class21 method286(int arg0) {
        return field838 == null ? null : field838[arg0];
    }

    @OriginalMember(owner = "HVIFHYEW", name = "a", descriptor = "(II)Z")
    public static boolean method287(int arg0, int arg1) {
        if (arg1 != -13619) {
            field836 = 105;
        }
        return arg0 == -1;
    }
}
