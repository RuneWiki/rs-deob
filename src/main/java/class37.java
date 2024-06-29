import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NFWEZFJY")
public class class37 {

    @OriginalMember(owner = "client!NFWEZFJY", name = "c", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "client!NFWEZFJY", name = "e", descriptor = "I")
    public int field1164;

    @OriginalMember(owner = "client!NFWEZFJY", name = "d", descriptor = "LMJPGHGEY;")
    public class35 field1163;

    @OriginalMember(owner = "client!NFWEZFJY", name = "a", descriptor = "Z")
    private static boolean field1160;

    @OriginalMember(owner = "client!NFWEZFJY", name = "f", descriptor = "[I")
    public int[] field1165;

    @OriginalMember(owner = "client!NFWEZFJY", name = "g", descriptor = "[I")
    public int[] field1166;

    @OriginalMember(owner = "client!NFWEZFJY", name = "h", descriptor = "[I")
    public int[] field1167;

    @OriginalMember(owner = "client!NFWEZFJY", name = "i", descriptor = "[I")
    public int[] field1168;

    @OriginalMember(owner = "client!NFWEZFJY", name = "b", descriptor = "[LNFWEZFJY;")
    private static class37[] field1161;

    @OriginalMember(owner = "client!NFWEZFJY", name = "j", descriptor = "[Z")
    private static boolean[] field1169;

    @OriginalMember(owner = "client!NFWEZFJY", name = "a", descriptor = "(I)V")
    public static void method298(int arg0) {
        field1161 = new class37[arg0 + 1];
        field1169 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1169[var1] = true;
        }
    }

    @OriginalMember(owner = "client!NFWEZFJY", name = "a", descriptor = "([BZ)V")
    public static void method299(byte[] arg0, boolean arg1) {
        class41 var2 = new class41(888, arg0);
        var2.field1241 = arg0.length - 8;
        int var3 = var2.method342();
        int var4 = var2.method342();
        int var5 = var2.method342();
        int var6 = var2.method342();
        byte var7 = 0;
        class41 var8 = new class41(888, arg0);
        var8.field1241 = var7;
        int var9 = var3 + var7 + 2;
        class41 var10 = new class41(888, arg0);
        var10.field1241 = var9;
        int var11 = var4 + var9;
        class41 var12 = new class41(888, arg0);
        var12.field1241 = var11;
        if (!arg1) {
            return;
        }
        int var13 = var5 + var11;
        class41 var14 = new class41(888, arg0);
        var14.field1241 = var13;
        int var15 = var6 + var13;
        class41 var16 = new class41(888, arg0);
        var16.field1241 = var15;
        class35 var17 = new class35(var16, 0);
        int var18 = var8.method342();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method342();
            class37 var25 = field1161[var24] = new class37();
            var25.field1162 = var14.method340();
            var25.field1163 = var17;
            int var26 = var8.method340();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method340();
                if (var31 > 0) {
                    if (var17.field1140[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field1140[var32] == 0) {
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
                    if (var17.field1140[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method353();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method353();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method353();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field1140[var29] == 5) {
                        field1169[var24] = false;
                    }
                }
            }
            var25.field1164 = var28;
            var25.field1165 = new int[var28];
            var25.field1166 = new int[var28];
            var25.field1167 = new int[var28];
            var25.field1168 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field1165[var30] = var19[var30];
                var25.field1166[var30] = var20[var30];
                var25.field1167[var30] = var21[var30];
                var25.field1168[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "client!NFWEZFJY", name = "a", descriptor = "(Z)V")
    public static void method300(boolean arg0) {
        if (arg0) {
            field1160 = !field1160;
        }
        field1161 = null;
    }

    @OriginalMember(owner = "client!NFWEZFJY", name = "b", descriptor = "(I)LNFWEZFJY;")
    public static class37 method301(int arg0) {
        return field1161 == null ? null : field1161[arg0];
    }

    @OriginalMember(owner = "client!NFWEZFJY", name = "a", descriptor = "(ZI)Z")
    public static boolean method302(boolean arg0, int arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return arg1 == -1;
    }
}
