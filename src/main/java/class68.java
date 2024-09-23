import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XZZTWOGF")
public class class68 {

    @OriginalMember(owner = "XZZTWOGF", name = "a", descriptor = "I")
    private static int field1680 = 28787;

    @OriginalMember(owner = "XZZTWOGF", name = "c", descriptor = "I")
    public int field1682;

    @OriginalMember(owner = "XZZTWOGF", name = "e", descriptor = "I")
    public int field1684;

    @OriginalMember(owner = "XZZTWOGF", name = "d", descriptor = "LTJOELOUM;")
    public class48 field1683;

    @OriginalMember(owner = "XZZTWOGF", name = "f", descriptor = "[I")
    public int[] field1685;

    @OriginalMember(owner = "XZZTWOGF", name = "g", descriptor = "[I")
    public int[] field1686;

    @OriginalMember(owner = "XZZTWOGF", name = "h", descriptor = "[I")
    public int[] field1687;

    @OriginalMember(owner = "XZZTWOGF", name = "i", descriptor = "[I")
    public int[] field1688;

    @OriginalMember(owner = "XZZTWOGF", name = "b", descriptor = "[LXZZTWOGF;")
    private static class68[] field1681;

    @OriginalMember(owner = "XZZTWOGF", name = "j", descriptor = "[Z")
    private static boolean[] field1689;

    @OriginalMember(owner = "XZZTWOGF", name = "a", descriptor = "(I)V")
    public static void method578(int arg0) {
        field1681 = new class68[arg0 + 1];
        field1689 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1689[var1] = true;
        }
    }

    @OriginalMember(owner = "XZZTWOGF", name = "a", descriptor = "([BI)V")
    public static void method579(byte[] arg0, int arg1) {
        class14 var2 = new class14(-527, arg0);
        var2.field769 = arg0.length - 8;
        int var3 = var2.method204();
        int var4 = var2.method204();
        int var5 = var2.method204();
        if (arg1 >= 0) {
            field1680 = -466;
        }
        int var6 = var2.method204();
        byte var7 = 0;
        class14 var8 = new class14(-527, arg0);
        var8.field769 = var7;
        int var9 = var3 + var7 + 2;
        class14 var10 = new class14(-527, arg0);
        var10.field769 = var9;
        int var11 = var4 + var9;
        class14 var12 = new class14(-527, arg0);
        var12.field769 = var11;
        int var13 = var5 + var11;
        class14 var14 = new class14(-527, arg0);
        var14.field769 = var13;
        int var15 = var6 + var13;
        class14 var16 = new class14(-527, arg0);
        var16.field769 = var15;
        class48 var17 = new class48(var16, 31);
        int var18 = var8.method204();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method204();
            class68 var25 = field1681[var24] = new class68();
            var25.field1682 = var14.method202();
            var25.field1683 = var17;
            int var26 = var8.method202();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method202();
                if (var31 > 0) {
                    if (var17.field1467[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field1467[var32] == 0) {
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
                    if (var17.field1467[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method215();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method215();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method215();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field1467[var29] == 5) {
                        field1689[var24] = false;
                    }
                }
            }
            var25.field1684 = var28;
            var25.field1685 = new int[var28];
            var25.field1686 = new int[var28];
            var25.field1687 = new int[var28];
            var25.field1688 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field1685[var30] = var19[var30];
                var25.field1686[var30] = var20[var30];
                var25.field1687[var30] = var21[var30];
                var25.field1688[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "XZZTWOGF", name = "b", descriptor = "(I)V")
    public static void method580(int arg0) {
        if (arg0 == 2) {
            field1681 = null;
        }
    }

    @OriginalMember(owner = "XZZTWOGF", name = "c", descriptor = "(I)LXZZTWOGF;")
    public static class68 method581(int arg0) {
        return field1681 == null ? null : field1681[arg0];
    }

    @OriginalMember(owner = "XZZTWOGF", name = "a", descriptor = "(II)Z")
    public static boolean method582(int arg0, int arg1) {
        if (arg1 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 == -1;
    }
}
