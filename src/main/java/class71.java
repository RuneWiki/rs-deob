import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZNUJPBQV")
public class class71 {

    @OriginalMember(owner = "ZNUJPBQV", name = "b", descriptor = "I")
    public int field1696;

    @OriginalMember(owner = "ZNUJPBQV", name = "d", descriptor = "I")
    public int field1698;

    @OriginalMember(owner = "ZNUJPBQV", name = "c", descriptor = "LIJWJZMOM;")
    public class30 field1697;

    @OriginalMember(owner = "ZNUJPBQV", name = "e", descriptor = "[I")
    public int[] field1699;

    @OriginalMember(owner = "ZNUJPBQV", name = "f", descriptor = "[I")
    public int[] field1700;

    @OriginalMember(owner = "ZNUJPBQV", name = "g", descriptor = "[I")
    public int[] field1701;

    @OriginalMember(owner = "ZNUJPBQV", name = "h", descriptor = "[I")
    public int[] field1702;

    @OriginalMember(owner = "ZNUJPBQV", name = "a", descriptor = "[LZNUJPBQV;")
    private static class71[] field1695;

    @OriginalMember(owner = "ZNUJPBQV", name = "i", descriptor = "[Z")
    private static boolean[] field1703;

    @OriginalMember(owner = "ZNUJPBQV", name = "a", descriptor = "(I)V")
    public static void method581(int arg0) {
        field1695 = new class71[arg0 + 1];
        field1703 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1703[var1] = true;
        }
    }

    @OriginalMember(owner = "ZNUJPBQV", name = "a", descriptor = "([BI)V")
    public static void method582(byte[] arg0, int arg1) {
        class62 var2 = new class62(-417, arg0);
        var2.field1579 = arg0.length - 8;
        int var3 = var2.method523();
        int var4 = var2.method523();
        int var5 = var2.method523();
        int var6 = var2.method523();
        byte var7 = 0;
        class62 var8 = new class62(-417, arg0);
        var8.field1579 = var7;
        int var9 = var3 + var7 + 2;
        class62 var10 = new class62(-417, arg0);
        var10.field1579 = var9;
        int var11 = var4 + var9;
        class62 var12 = new class62(-417, arg0);
        var12.field1579 = var11;
        int var13 = var5 + var11;
        class62 var14 = new class62(-417, arg0);
        var14.field1579 = var13;
        int var15 = var6 + var13;
        class62 var16 = new class62(-417, arg0);
        var16.field1579 = var15;
        class30 var17 = new class30(false, var16);
        int var18 = var8.method523();
        if (arg1 != 0) {
            return;
        }
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method523();
            class71 var25 = field1695[var24] = new class71();
            var25.field1696 = var14.method521();
            var25.field1697 = var17;
            int var26 = var8.method521();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method521();
                if (var31 > 0) {
                    if (var17.field954[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field954[var32] == 0) {
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
                    if (var17.field954[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method534();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method534();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method534();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field954[var29] == 5) {
                        field1703[var24] = false;
                    }
                }
            }
            var25.field1698 = var28;
            var25.field1699 = new int[var28];
            var25.field1700 = new int[var28];
            var25.field1701 = new int[var28];
            var25.field1702 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field1699[var30] = var19[var30];
                var25.field1700[var30] = var20[var30];
                var25.field1701[var30] = var21[var30];
                var25.field1702[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "ZNUJPBQV", name = "b", descriptor = "(I)V")
    public static void method583(int arg0) {
        if (arg0 != 1) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field1695 = null;
    }

    @OriginalMember(owner = "ZNUJPBQV", name = "a", descriptor = "(II)LZNUJPBQV;")
    public static class71 method584(int arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return field1695 == null ? null : field1695[arg0];
    }

    @OriginalMember(owner = "ZNUJPBQV", name = "b", descriptor = "(II)Z")
    public static boolean method585(int arg0, int arg1) {
        if (arg1 != 2) {
            throw new NullPointerException();
        }
        return arg0 == -1;
    }
}
