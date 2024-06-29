import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YPRWORMV")
public class class71 {

    @OriginalMember(owner = "client!YPRWORMV", name = "a", descriptor = "I")
    private static int field1716 = 394;

    @OriginalMember(owner = "client!YPRWORMV", name = "c", descriptor = "I")
    public int field1718;

    @OriginalMember(owner = "client!YPRWORMV", name = "e", descriptor = "I")
    public int field1720;

    @OriginalMember(owner = "client!YPRWORMV", name = "d", descriptor = "LRHIQJAPF;")
    public class50 field1719;

    @OriginalMember(owner = "client!YPRWORMV", name = "f", descriptor = "[I")
    public int[] field1721;

    @OriginalMember(owner = "client!YPRWORMV", name = "g", descriptor = "[I")
    public int[] field1722;

    @OriginalMember(owner = "client!YPRWORMV", name = "h", descriptor = "[I")
    public int[] field1723;

    @OriginalMember(owner = "client!YPRWORMV", name = "i", descriptor = "[I")
    public int[] field1724;

    @OriginalMember(owner = "client!YPRWORMV", name = "b", descriptor = "[LYPRWORMV;")
    private static class71[] field1717;

    @OriginalMember(owner = "client!YPRWORMV", name = "j", descriptor = "[Z")
    private static boolean[] field1725;

    @OriginalMember(owner = "client!YPRWORMV", name = "a", descriptor = "(I)V")
    public static void method598(int arg0) {
        field1717 = new class71[arg0 + 1];
        field1725 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1725[var1] = true;
        }
    }

    @OriginalMember(owner = "client!YPRWORMV", name = "a", descriptor = "([BZ)V")
    public static void method599(byte[] arg0, boolean arg1) {
        class38 var2 = new class38(0, arg0);
        var2.field1161 = arg0.length - 8;
        int var3 = var2.method359();
        int var4 = var2.method359();
        int var5 = var2.method359();
        int var6 = var2.method359();
        byte var7 = 0;
        class38 var8 = new class38(0, arg0);
        var8.field1161 = var7;
        int var9 = var3 + var7 + 2;
        class38 var10 = new class38(0, arg0);
        var10.field1161 = var9;
        int var11 = var4 + var9;
        class38 var12 = new class38(0, arg0);
        var12.field1161 = var11;
        int var13 = var5 + var11;
        class38 var14 = new class38(0, arg0);
        var14.field1161 = var13;
        int var15 = var6 + var13;
        class38 var16 = new class38(0, arg0);
        var16.field1161 = var15;
        class50 var17 = new class50(var16, 664);
        if (!arg1) {
            for (int var18 = 1; var18 > 0; var18++) {
            }
        }
        int var19 = var8.method359();
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        int[] var23 = new int[500];
        for (int var24 = 0; var24 < var19; var24++) {
            int var25 = var8.method359();
            class71 var26 = field1717[var25] = new class71();
            var26.field1718 = var14.method357();
            var26.field1719 = var17;
            int var27 = var8.method357();
            int var28 = -1;
            int var29 = 0;
            for (int var30 = 0; var30 < var27; var30++) {
                int var32 = var10.method357();
                if (var32 > 0) {
                    if (var17.field1437[var30] != 0) {
                        for (int var33 = var30 - 1; var33 > var28; var33--) {
                            if (var17.field1437[var33] == 0) {
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
                    if (var17.field1437[var30] == 3) {
                        var34 = 128;
                    }
                    if ((var32 & 0x1) == 0) {
                        var21[var29] = var34;
                    } else {
                        var21[var29] = var12.method370();
                    }
                    if ((var32 & 0x2) == 0) {
                        var22[var29] = var34;
                    } else {
                        var22[var29] = var12.method370();
                    }
                    if ((var32 & 0x4) == 0) {
                        var23[var29] = var34;
                    } else {
                        var23[var29] = var12.method370();
                    }
                    var28 = var30;
                    var29++;
                    if (var17.field1437[var30] == 5) {
                        field1725[var25] = false;
                    }
                }
            }
            var26.field1720 = var29;
            var26.field1721 = new int[var29];
            var26.field1722 = new int[var29];
            var26.field1723 = new int[var29];
            var26.field1724 = new int[var29];
            for (int var31 = 0; var31 < var29; var31++) {
                var26.field1721[var31] = var20[var31];
                var26.field1722[var31] = var21[var31];
                var26.field1723[var31] = var22[var31];
                var26.field1724[var31] = var23[var31];
            }
        }
    }

    @OriginalMember(owner = "client!YPRWORMV", name = "a", descriptor = "(Z)V")
    public static void method600(boolean arg0) {
        if (!arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field1717 = null;
    }

    @OriginalMember(owner = "client!YPRWORMV", name = "b", descriptor = "(I)LYPRWORMV;")
    public static class71 method601(int arg0) {
        return field1717 == null ? null : field1717[arg0];
    }

    @OriginalMember(owner = "client!YPRWORMV", name = "a", descriptor = "(IZ)Z")
    public static boolean method602(int arg0, boolean arg1) {
        if (!arg1) {
            field1716 = 319;
        }
        return arg0 == -1;
    }
}
