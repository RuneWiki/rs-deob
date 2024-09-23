import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ICYGYVTE")
public class class31 {

    @OriginalMember(owner = "ICYGYVTE", name = "a", descriptor = "Z")
    private static boolean field914 = true;

    @OriginalMember(owner = "ICYGYVTE", name = "c", descriptor = "I")
    public int field916;

    @OriginalMember(owner = "ICYGYVTE", name = "e", descriptor = "I")
    public int field918;

    @OriginalMember(owner = "ICYGYVTE", name = "d", descriptor = "LOAUECDUZ;")
    public class46 field917;

    @OriginalMember(owner = "ICYGYVTE", name = "f", descriptor = "[I")
    public int[] field919;

    @OriginalMember(owner = "ICYGYVTE", name = "g", descriptor = "[I")
    public int[] field920;

    @OriginalMember(owner = "ICYGYVTE", name = "h", descriptor = "[I")
    public int[] field921;

    @OriginalMember(owner = "ICYGYVTE", name = "i", descriptor = "[I")
    public int[] field922;

    @OriginalMember(owner = "ICYGYVTE", name = "b", descriptor = "[LICYGYVTE;")
    private static class31[] field915;

    @OriginalMember(owner = "ICYGYVTE", name = "j", descriptor = "[Z")
    private static boolean[] field923;

    @OriginalMember(owner = "ICYGYVTE", name = "a", descriptor = "(I)V")
    public static void method345(int arg0) {
        field915 = new class31[arg0 + 1];
        field923 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field923[var1] = true;
        }
    }

    @OriginalMember(owner = "ICYGYVTE", name = "a", descriptor = "(I[B)V")
    public static void method346(int arg0, byte[] arg1) {
        class15 var2 = new class15(arg1, false);
        var2.field709 = arg1.length - 8;
        int var3 = var2.method263();
        int var4 = var2.method263();
        int var5 = var2.method263();
        int var6 = var2.method263();
        byte var7 = 0;
        class15 var8 = new class15(arg1, false);
        var8.field709 = var7;
        int var9 = var3 + var7 + 2;
        class15 var10 = new class15(arg1, false);
        var10.field709 = var9;
        int var11 = var4 + var9;
        class15 var12 = new class15(arg1, false);
        var12.field709 = var11;
        int var13 = var5 + var11;
        class15 var14 = new class15(arg1, false);
        var14.field709 = var13;
        int var15 = var6 + var13;
        int var16 = 29 / arg0;
        class15 var17 = new class15(arg1, false);
        var17.field709 = var15;
        class46 var18 = new class46(var17, 39234);
        int var19 = var8.method263();
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        int[] var23 = new int[500];
        for (int var24 = 0; var24 < var19; var24++) {
            int var25 = var8.method263();
            class31 var26 = field915[var25] = new class31();
            var26.field916 = var14.method261();
            var26.field917 = var18;
            int var27 = var8.method261();
            int var28 = -1;
            int var29 = 0;
            for (int var30 = 0; var30 < var27; var30++) {
                int var32 = var10.method261();
                if (var32 > 0) {
                    if (var18.field1307[var30] != 0) {
                        for (int var33 = var30 - 1; var33 > var28; var33--) {
                            if (var18.field1307[var33] == 0) {
                                var20[var29] = var33;
                                var21[var29] = 0;
                                var22[var29] = 0;
                                var23[var29] = 0;
                                var29++;
                                break;
                            }
                        }
                    }
                    var20[var29] = var30;
                    short var34 = 0;
                    if (var18.field1307[var30] == 3) {
                        var34 = 128;
                    }
                    if ((var32 & 0x1) == 0) {
                        var21[var29] = var34;
                    } else {
                        var21[var29] = var12.method274();
                    }
                    if ((var32 & 0x2) == 0) {
                        var22[var29] = var34;
                    } else {
                        var22[var29] = var12.method274();
                    }
                    if ((var32 & 0x4) == 0) {
                        var23[var29] = var34;
                    } else {
                        var23[var29] = var12.method274();
                    }
                    var28 = var30;
                    var29++;
                    if (var18.field1307[var30] == 5) {
                        field923[var25] = false;
                    }
                }
            }
            var26.field918 = var29;
            var26.field919 = new int[var29];
            var26.field920 = new int[var29];
            var26.field921 = new int[var29];
            var26.field922 = new int[var29];
            for (int var31 = 0; var31 < var29; var31++) {
                var26.field919[var31] = var20[var31];
                var26.field920[var31] = var21[var31];
                var26.field921[var31] = var22[var31];
                var26.field922[var31] = var23[var31];
            }
        }
    }

    @OriginalMember(owner = "ICYGYVTE", name = "a", descriptor = "(B)V")
    public static void method347(byte arg0) {
        field915 = null;
        if (arg0 == 1) {
            boolean var1 = false;
        }
    }

    @OriginalMember(owner = "ICYGYVTE", name = "b", descriptor = "(I)LICYGYVTE;")
    public static class31 method348(int arg0) {
        return field915 == null ? null : field915[arg0];
    }

    @OriginalMember(owner = "ICYGYVTE", name = "a", descriptor = "(II)Z")
    public static boolean method349(int arg0, int arg1) {
        if (arg1 != 5131) {
            field914 = !field914;
        }
        return arg0 == -1;
    }
}
