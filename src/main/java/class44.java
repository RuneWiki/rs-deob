import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OZAHMTPS")
public class class44 {

    @OriginalMember(owner = "client!OZAHMTPS", name = "b", descriptor = "Z")
    private static boolean field1095 = true;

    @OriginalMember(owner = "client!OZAHMTPS", name = "a", descriptor = "I")
    private static int field1094;

    @OriginalMember(owner = "client!OZAHMTPS", name = "d", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "client!OZAHMTPS", name = "f", descriptor = "I")
    public int field1099;

    @OriginalMember(owner = "client!OZAHMTPS", name = "e", descriptor = "LLMYEIVWK;")
    public class32 field1098;

    @OriginalMember(owner = "client!OZAHMTPS", name = "g", descriptor = "[I")
    public int[] field1100;

    @OriginalMember(owner = "client!OZAHMTPS", name = "h", descriptor = "[I")
    public int[] field1101;

    @OriginalMember(owner = "client!OZAHMTPS", name = "i", descriptor = "[I")
    public int[] field1102;

    @OriginalMember(owner = "client!OZAHMTPS", name = "j", descriptor = "[I")
    public int[] field1103;

    @OriginalMember(owner = "client!OZAHMTPS", name = "c", descriptor = "[LOZAHMTPS;")
    private static class44[] field1096;

    @OriginalMember(owner = "client!OZAHMTPS", name = "k", descriptor = "[Z")
    private static boolean[] field1104;

    @OriginalMember(owner = "client!OZAHMTPS", name = "a", descriptor = "(I)V")
    public static void method334(int arg0) {
        field1096 = new class44[arg0 + 1];
        field1104 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1104[var1] = true;
        }
    }

    @OriginalMember(owner = "client!OZAHMTPS", name = "a", descriptor = "([BI)V")
    public static void method335(byte[] arg0, int arg1) {
        class50 var2 = new class50(arg0, -46859);
        var2.field1225 = arg0.length - 8;
        int var3 = var2.method390();
        int var4 = var2.method390();
        int var5 = var2.method390();
        int var6 = var2.method390();
        byte var7 = 0;
        class50 var8 = new class50(arg0, -46859);
        var8.field1225 = var7;
        int var9 = var3 + var7 + 2;
        class50 var10 = new class50(arg0, -46859);
        var10.field1225 = var9;
        int var11 = var4 + var9;
        class50 var12 = new class50(arg0, -46859);
        var12.field1225 = var11;
        int var13 = var5 + var11;
        class50 var14 = new class50(arg0, -46859);
        var14.field1225 = var13;
        if (arg1 != 0) {
            field1094 = 496;
        }
        int var15 = var6 + var13;
        class50 var16 = new class50(arg0, -46859);
        var16.field1225 = var15;
        class32 var17 = new class32(var16, 0);
        int var18 = var8.method390();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method390();
            class44 var25 = field1096[var24] = new class44();
            var25.field1097 = var14.method388();
            var25.field1098 = var17;
            int var26 = var8.method388();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method388();
                if (var31 > 0) {
                    if (var17.field959[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field959[var32] == 0) {
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
                    if (var17.field959[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method401();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method401();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method401();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field959[var29] == 5) {
                        field1104[var24] = false;
                    }
                }
            }
            var25.field1099 = var28;
            var25.field1100 = new int[var28];
            var25.field1101 = new int[var28];
            var25.field1102 = new int[var28];
            var25.field1103 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field1100[var30] = var19[var30];
                var25.field1101[var30] = var20[var30];
                var25.field1102[var30] = var21[var30];
                var25.field1103[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "client!OZAHMTPS", name = "b", descriptor = "(I)V")
    public static void method336(int arg0) {
        field1096 = null;
        while (arg0 >= 0) {
        }
    }

    @OriginalMember(owner = "client!OZAHMTPS", name = "c", descriptor = "(I)LOZAHMTPS;")
    public static class44 method337(int arg0) {
        return field1096 == null ? null : field1096[arg0];
    }

    @OriginalMember(owner = "client!OZAHMTPS", name = "a", descriptor = "(IB)Z")
    public static boolean method338(int arg0, byte arg1) {
        if (arg1 != 6) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        return arg0 == -1;
    }
}
