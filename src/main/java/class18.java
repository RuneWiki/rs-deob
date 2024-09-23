import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EMBMBPSC")
public class class18 {

    @OriginalMember(owner = "EMBMBPSC", name = "a", descriptor = "I")
    private static int field668 = 8;

    @OriginalMember(owner = "EMBMBPSC", name = "b", descriptor = "Z")
    private static boolean field669 = true;

    @OriginalMember(owner = "EMBMBPSC", name = "c", descriptor = "I")
    private static int field670;

    @OriginalMember(owner = "EMBMBPSC", name = "e", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "EMBMBPSC", name = "g", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "EMBMBPSC", name = "f", descriptor = "LNSCXCZCZ;")
    public class45 field673;

    @OriginalMember(owner = "EMBMBPSC", name = "h", descriptor = "[I")
    public int[] field675;

    @OriginalMember(owner = "EMBMBPSC", name = "i", descriptor = "[I")
    public int[] field676;

    @OriginalMember(owner = "EMBMBPSC", name = "j", descriptor = "[I")
    public int[] field677;

    @OriginalMember(owner = "EMBMBPSC", name = "k", descriptor = "[I")
    public int[] field678;

    @OriginalMember(owner = "EMBMBPSC", name = "d", descriptor = "[LEMBMBPSC;")
    private static class18[] field671;

    @OriginalMember(owner = "EMBMBPSC", name = "l", descriptor = "[Z")
    private static boolean[] field679;

    @OriginalMember(owner = "EMBMBPSC", name = "a", descriptor = "(I)V")
    public static void method225(int arg0) {
        field671 = new class18[arg0 + 1];
        field679 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field679[var1] = true;
        }
    }

    @OriginalMember(owner = "EMBMBPSC", name = "a", descriptor = "([BI)V")
    public static void method226(byte[] arg0, int arg1) {
        class31 var2 = new class31(arg0, 8);
        var2.field901 = arg0.length - 8;
        int var3 = var2.method308();
        int var4 = var2.method308();
        int var5 = var2.method308();
        int var6 = var2.method308();
        byte var7 = 0;
        class31 var8 = new class31(arg0, 8);
        var8.field901 = var7;
        int var9 = var3 + var7 + 2;
        class31 var10 = new class31(arg0, 8);
        var10.field901 = var9;
        int var11 = var4 + var9;
        class31 var12 = new class31(arg0, 8);
        var12.field901 = var11;
        int var13 = var5 + var11;
        class31 var14 = new class31(arg0, 8);
        var14.field901 = var13;
        if (arg1 != 0) {
            field669 = !field669;
        }
        int var15 = var6 + var13;
        class31 var16 = new class31(arg0, 8);
        var16.field901 = var15;
        class45 var17 = new class45(false, var16);
        int var18 = var8.method308();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method308();
            class18 var25 = field671[var24] = new class18();
            var25.field672 = var14.method306();
            var25.field673 = var17;
            int var26 = var8.method306();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method306();
                if (var31 > 0) {
                    if (var17.field1083[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field1083[var32] == 0) {
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
                    if (var17.field1083[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method319();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method319();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method319();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field1083[var29] == 5) {
                        field679[var24] = false;
                    }
                }
            }
            var25.field674 = var28;
            var25.field675 = new int[var28];
            var25.field676 = new int[var28];
            var25.field677 = new int[var28];
            var25.field678 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field675[var30] = var19[var30];
                var25.field676[var30] = var20[var30];
                var25.field677[var30] = var21[var30];
                var25.field678[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "EMBMBPSC", name = "b", descriptor = "(I)V")
    public static void method227(int arg0) {
        field671 = null;
        if (arg0 != 1) {
            field670 = -227;
        }
    }

    @OriginalMember(owner = "EMBMBPSC", name = "a", descriptor = "(ZI)LEMBMBPSC;")
    public static class18 method228(boolean arg0, int arg1) {
        if (arg0) {
            throw new NullPointerException();
        } else if (field671 == null) {
            return null;
        } else {
            return field671[arg1];
        }
    }

    @OriginalMember(owner = "EMBMBPSC", name = "a", descriptor = "(II)Z")
    public static boolean method229(int arg0, int arg1) {
        if (field668 != arg1) {
            field670 = 312;
        }
        return arg0 == -1;
    }
}
