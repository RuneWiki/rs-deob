import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UIZESDZR")
public class class59 {

    @OriginalMember(owner = "UIZESDZR", name = "c", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "UIZESDZR", name = "e", descriptor = "I")
    public int field1603;

    @OriginalMember(owner = "UIZESDZR", name = "d", descriptor = "LKLNBCMBU;")
    public class29 field1602;

    @OriginalMember(owner = "UIZESDZR", name = "a", descriptor = "Z")
    private static boolean field1599;

    @OriginalMember(owner = "UIZESDZR", name = "f", descriptor = "[I")
    public int[] field1604;

    @OriginalMember(owner = "UIZESDZR", name = "g", descriptor = "[I")
    public int[] field1605;

    @OriginalMember(owner = "UIZESDZR", name = "h", descriptor = "[I")
    public int[] field1606;

    @OriginalMember(owner = "UIZESDZR", name = "i", descriptor = "[I")
    public int[] field1607;

    @OriginalMember(owner = "UIZESDZR", name = "b", descriptor = "[LUIZESDZR;")
    private static class59[] field1600;

    @OriginalMember(owner = "UIZESDZR", name = "j", descriptor = "[Z")
    private static boolean[] field1608;

    @OriginalMember(owner = "UIZESDZR", name = "a", descriptor = "(I)V")
    public static void method520(int arg0) {
        field1600 = new class59[arg0 + 1];
        field1608 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1608[var1] = true;
        }
    }

    @OriginalMember(owner = "UIZESDZR", name = "a", descriptor = "(I[B)V")
    public static void method521(int arg0, byte[] arg1) {
        class3 var2 = new class3(false, arg1);
        var2.field20 = arg1.length - 8;
        int var3 = var2.method17();
        int var4 = var2.method17();
        int var5 = var2.method17();
        int var6 = var2.method17();
        byte var7 = 0;
        class3 var8 = new class3(false, arg1);
        var8.field20 = var7;
        int var9 = var3 + var7 + 2;
        class3 var10 = new class3(false, arg1);
        if (arg0 != 0) {
            field1599 = !field1599;
        }
        var10.field20 = var9;
        int var11 = var4 + var9;
        class3 var12 = new class3(false, arg1);
        var12.field20 = var11;
        int var13 = var5 + var11;
        class3 var14 = new class3(false, arg1);
        var14.field20 = var13;
        int var15 = var6 + var13;
        class3 var16 = new class3(false, arg1);
        var16.field20 = var15;
        class29 var17 = new class29(var16, (byte) 2);
        int var18 = var8.method17();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method17();
            class59 var25 = field1600[var24] = new class59();
            var25.field1601 = var14.method15();
            var25.field1602 = var17;
            int var26 = var8.method15();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method15();
                if (var31 > 0) {
                    if (var17.field1046[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field1046[var32] == 0) {
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
                    if (var17.field1046[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method28();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method28();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method28();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field1046[var29] == 5) {
                        field1608[var24] = false;
                    }
                }
            }
            var25.field1603 = var28;
            var25.field1604 = new int[var28];
            var25.field1605 = new int[var28];
            var25.field1606 = new int[var28];
            var25.field1607 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field1604[var30] = var19[var30];
                var25.field1605[var30] = var20[var30];
                var25.field1606[var30] = var21[var30];
                var25.field1607[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "UIZESDZR", name = "a", descriptor = "(B)V")
    public static void method522(byte arg0) {
        if (arg0 == 113) {
            field1600 = null;
        }
    }

    @OriginalMember(owner = "UIZESDZR", name = "a", descriptor = "(II)LUIZESDZR;")
    public static class59 method523(int arg0, int arg1) {
        if (arg0 != 1) {
            field1599 = !field1599;
        }
        return field1600 == null ? null : field1600[arg1];
    }

    @OriginalMember(owner = "UIZESDZR", name = "a", descriptor = "(BI)Z")
    public static boolean method524(byte arg0, int arg1) {
        if (arg0 != 8) {
            field1599 = !field1599;
        }
        return arg1 == -1;
    }
}
