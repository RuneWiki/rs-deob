import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VPISXBMB")
public class class60 {

    @OriginalMember(owner = "VPISXBMB", name = "a", descriptor = "I")
    private static int field1414 = -742;

    @OriginalMember(owner = "VPISXBMB", name = "c", descriptor = "I")
    public int field1416;

    @OriginalMember(owner = "VPISXBMB", name = "e", descriptor = "I")
    public int field1418;

    @OriginalMember(owner = "VPISXBMB", name = "d", descriptor = "LPCSJGLYB;")
    public class38 field1417;

    @OriginalMember(owner = "VPISXBMB", name = "f", descriptor = "[I")
    public int[] field1419;

    @OriginalMember(owner = "VPISXBMB", name = "g", descriptor = "[I")
    public int[] field1420;

    @OriginalMember(owner = "VPISXBMB", name = "h", descriptor = "[I")
    public int[] field1421;

    @OriginalMember(owner = "VPISXBMB", name = "i", descriptor = "[I")
    public int[] field1422;

    @OriginalMember(owner = "VPISXBMB", name = "b", descriptor = "[LVPISXBMB;")
    private static class60[] field1415;

    @OriginalMember(owner = "VPISXBMB", name = "j", descriptor = "[Z")
    private static boolean[] field1423;

    @OriginalMember(owner = "VPISXBMB", name = "a", descriptor = "(I)V")
    public static void method509(int arg0) {
        field1415 = new class60[arg0 + 1];
        field1423 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1423[var1] = true;
        }
    }

    @OriginalMember(owner = "VPISXBMB", name = "a", descriptor = "(I[B)V")
    public static void method510(int arg0, byte[] arg1) {
        class33 var2 = new class33(true, arg1);
        var2.field945 = arg1.length - 8;
        int var3 = var2.method327();
        int var4 = var2.method327();
        int var5 = var2.method327();
        int var6 = var2.method327();
        byte var7 = 0;
        class33 var8 = new class33(true, arg1);
        var8.field945 = var7;
        int var9 = var3 + var7 + 2;
        if (arg0 < 3 || arg0 > 3) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        class33 var11 = new class33(true, arg1);
        var11.field945 = var9;
        int var12 = var4 + var9;
        class33 var13 = new class33(true, arg1);
        var13.field945 = var12;
        int var14 = var5 + var12;
        class33 var15 = new class33(true, arg1);
        var15.field945 = var14;
        int var16 = var6 + var14;
        class33 var17 = new class33(true, arg1);
        var17.field945 = var16;
        class38 var18 = new class38(var17, -14987);
        int var19 = var8.method327();
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        int[] var23 = new int[500];
        for (int var24 = 0; var24 < var19; var24++) {
            int var25 = var8.method327();
            class60 var26 = field1415[var25] = new class60();
            var26.field1416 = var15.method325();
            var26.field1417 = var18;
            int var27 = var8.method325();
            int var28 = -1;
            int var29 = 0;
            for (int var30 = 0; var30 < var27; var30++) {
                int var32 = var11.method325();
                if (var32 > 0) {
                    if (var18.field985[var30] != 0) {
                        for (int var33 = var30 - 1; var33 > var28; var33--) {
                            if (var18.field985[var33] == 0) {
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
                    if (var18.field985[var30] == 3) {
                        var34 = 128;
                    }
                    if ((var32 & 0x1) == 0) {
                        var21[var29] = var34;
                    } else {
                        var21[var29] = var13.method338();
                    }
                    if ((var32 & 0x2) == 0) {
                        var22[var29] = var34;
                    } else {
                        var22[var29] = var13.method338();
                    }
                    if ((var32 & 0x4) == 0) {
                        var23[var29] = var34;
                    } else {
                        var23[var29] = var13.method338();
                    }
                    var28 = var30;
                    var29++;
                    if (var18.field985[var30] == 5) {
                        field1423[var25] = false;
                    }
                }
            }
            var26.field1418 = var29;
            var26.field1419 = new int[var29];
            var26.field1420 = new int[var29];
            var26.field1421 = new int[var29];
            var26.field1422 = new int[var29];
            for (int var31 = 0; var31 < var29; var31++) {
                var26.field1419[var31] = var20[var31];
                var26.field1420[var31] = var21[var31];
                var26.field1421[var31] = var22[var31];
                var26.field1422[var31] = var23[var31];
            }
        }
    }

    @OriginalMember(owner = "VPISXBMB", name = "a", descriptor = "(B)V")
    public static void method511(byte arg0) {
        if (arg0 != -56) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field1415 = null;
    }

    @OriginalMember(owner = "VPISXBMB", name = "a", descriptor = "(II)LVPISXBMB;")
    public static class60 method512(int arg0, int arg1) {
        if (arg0 >= 0) {
            field1414 = -251;
        }
        return field1415 == null ? null : field1415[arg1];
    }

    @OriginalMember(owner = "VPISXBMB", name = "b", descriptor = "(II)Z")
    public static boolean method513(int arg0, int arg1) {
        if (arg0 < 3 || arg0 > 3) {
            throw new NullPointerException();
        }
        return arg1 == -1;
    }
}
