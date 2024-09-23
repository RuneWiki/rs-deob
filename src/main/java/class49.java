import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SCIASJXX")
public class class49 {

    @OriginalMember(owner = "SCIASJXX", name = "b", descriptor = "I")
    public int field1273;

    @OriginalMember(owner = "SCIASJXX", name = "d", descriptor = "I")
    public int field1275;

    @OriginalMember(owner = "SCIASJXX", name = "c", descriptor = "LYRWSITPW;")
    public class68 field1274;

    @OriginalMember(owner = "SCIASJXX", name = "e", descriptor = "[I")
    public int[] field1276;

    @OriginalMember(owner = "SCIASJXX", name = "f", descriptor = "[I")
    public int[] field1277;

    @OriginalMember(owner = "SCIASJXX", name = "g", descriptor = "[I")
    public int[] field1278;

    @OriginalMember(owner = "SCIASJXX", name = "h", descriptor = "[I")
    public int[] field1279;

    @OriginalMember(owner = "SCIASJXX", name = "a", descriptor = "[LSCIASJXX;")
    private static class49[] field1272;

    @OriginalMember(owner = "SCIASJXX", name = "i", descriptor = "[Z")
    private static boolean[] field1280;

    @OriginalMember(owner = "SCIASJXX", name = "a", descriptor = "(I)V")
    public static void method397(int arg0) {
        field1272 = new class49[arg0 + 1];
        field1280 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1280[var1] = true;
        }
    }

    @OriginalMember(owner = "SCIASJXX", name = "a", descriptor = "(Z[B)V")
    public static void method398(boolean arg0, byte[] arg1) {
        class62 var2 = new class62(arg1, 49938);
        var2.field1542 = arg1.length - 8;
        int var3 = var2.method480();
        int var4 = var2.method480();
        int var5 = var2.method480();
        int var6 = var2.method480();
        byte var7 = 0;
        class62 var8 = new class62(arg1, 49938);
        var8.field1542 = var7;
        int var9 = var3 + var7 + 2;
        class62 var10 = new class62(arg1, 49938);
        var10.field1542 = var9;
        int var11 = var4 + var9;
        class62 var12 = new class62(arg1, 49938);
        var12.field1542 = var11;
        int var13 = var5 + var11;
        class62 var14 = new class62(arg1, 49938);
        if (arg0) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
        var14.field1542 = var13;
        int var16 = var6 + var13;
        class62 var17 = new class62(arg1, 49938);
        var17.field1542 = var16;
        class68 var18 = new class68(var17, (byte) 70);
        int var19 = var8.method480();
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        int[] var23 = new int[500];
        for (int var24 = 0; var24 < var19; var24++) {
            int var25 = var8.method480();
            class49 var26 = field1272[var25] = new class49();
            var26.field1273 = var14.method478();
            var26.field1274 = var18;
            int var27 = var8.method478();
            int var28 = -1;
            int var29 = 0;
            for (int var30 = 0; var30 < var27; var30++) {
                int var32 = var10.method478();
                if (var32 > 0) {
                    if (var18.field1634[var30] != 0) {
                        for (int var33 = var30 - 1; var33 > var28; var33--) {
                            if (var18.field1634[var33] == 0) {
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
                    if (var18.field1634[var30] == 3) {
                        var34 = 128;
                    }
                    if ((var32 & 0x1) == 0) {
                        var21[var29] = var34;
                    } else {
                        var21[var29] = var12.method491();
                    }
                    if ((var32 & 0x2) == 0) {
                        var22[var29] = var34;
                    } else {
                        var22[var29] = var12.method491();
                    }
                    if ((var32 & 0x4) == 0) {
                        var23[var29] = var34;
                    } else {
                        var23[var29] = var12.method491();
                    }
                    var28 = var30;
                    var29++;
                    if (var18.field1634[var30] == 5) {
                        field1280[var25] = false;
                    }
                }
            }
            var26.field1275 = var29;
            var26.field1276 = new int[var29];
            var26.field1277 = new int[var29];
            var26.field1278 = new int[var29];
            var26.field1279 = new int[var29];
            for (int var31 = 0; var31 < var29; var31++) {
                var26.field1276[var31] = var20[var31];
                var26.field1277[var31] = var21[var31];
                var26.field1278[var31] = var22[var31];
                var26.field1279[var31] = var23[var31];
            }
        }
    }

    @OriginalMember(owner = "SCIASJXX", name = "b", descriptor = "(I)V")
    public static void method399(int arg0) {
        int var1 = 65 / arg0;
        field1272 = null;
    }

    @OriginalMember(owner = "SCIASJXX", name = "a", descriptor = "(BI)LSCIASJXX;")
    public static class49 method400(byte arg0, int arg1) {
        if (arg0 != -10) {
            throw new NullPointerException();
        }
        return field1272 == null ? null : field1272[arg1];
    }

    @OriginalMember(owner = "SCIASJXX", name = "a", descriptor = "(II)Z")
    public static boolean method401(int arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return arg0 == -1;
    }
}
