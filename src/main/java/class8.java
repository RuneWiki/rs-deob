import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DFGNFGZH")
public class class8 {

    @OriginalMember(owner = "DFGNFGZH", name = "b", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "DFGNFGZH", name = "d", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "DFGNFGZH", name = "c", descriptor = "LBIWBGZXL;")
    public class1 field676;

    @OriginalMember(owner = "DFGNFGZH", name = "e", descriptor = "[I")
    public int[] field678;

    @OriginalMember(owner = "DFGNFGZH", name = "f", descriptor = "[I")
    public int[] field679;

    @OriginalMember(owner = "DFGNFGZH", name = "g", descriptor = "[I")
    public int[] field680;

    @OriginalMember(owner = "DFGNFGZH", name = "h", descriptor = "[I")
    public int[] field681;

    @OriginalMember(owner = "DFGNFGZH", name = "a", descriptor = "[LDFGNFGZH;")
    private static class8[] field674;

    @OriginalMember(owner = "DFGNFGZH", name = "i", descriptor = "[Z")
    private static boolean[] field682;

    @OriginalMember(owner = "DFGNFGZH", name = "a", descriptor = "(I)V")
    public static void method211(int arg0) {
        field674 = new class8[arg0 + 1];
        field682 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field682[var1] = true;
        }
    }

    @OriginalMember(owner = "DFGNFGZH", name = "a", descriptor = "(I[B)V")
    public static void method212(int arg0, byte[] arg1) {
        class30 var2 = new class30(true, arg1);
        var2.field1092 = arg1.length - 8;
        int var3 = var2.method298();
        int var4 = var2.method298();
        int var5 = var2.method298();
        int var6 = var2.method298();
        byte var7 = 0;
        class30 var8 = new class30(true, arg1);
        var8.field1092 = var7;
        int var9 = var3 + var7 + 2;
        class30 var10 = new class30(true, arg1);
        var10.field1092 = var9;
        int var11 = var4 + var9;
        class30 var12 = new class30(true, arg1);
        var12.field1092 = var11;
        int var13 = var5 + var11;
        class30 var14 = new class30(true, arg1);
        var14.field1092 = var13;
        int var15 = 81 / arg0;
        int var16 = var6 + var13;
        class30 var17 = new class30(true, arg1);
        var17.field1092 = var16;
        class1 var18 = new class1(var17, -23713);
        int var19 = var8.method298();
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        int[] var23 = new int[500];
        for (int var24 = 0; var24 < var19; var24++) {
            int var25 = var8.method298();
            class8 var26 = field674[var25] = new class8();
            var26.field675 = var14.method296();
            var26.field676 = var18;
            int var27 = var8.method296();
            int var28 = -1;
            int var29 = 0;
            for (int var30 = 0; var30 < var27; var30++) {
                int var32 = var10.method296();
                if (var32 > 0) {
                    if (var18.field2[var30] != 0) {
                        for (int var33 = var30 - 1; var33 > var28; var33--) {
                            if (var18.field2[var33] == 0) {
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
                    if (var18.field2[var30] == 3) {
                        var34 = 128;
                    }
                    if ((var32 & 0x1) == 0) {
                        var21[var29] = var34;
                    } else {
                        var21[var29] = var12.method309();
                    }
                    if ((var32 & 0x2) == 0) {
                        var22[var29] = var34;
                    } else {
                        var22[var29] = var12.method309();
                    }
                    if ((var32 & 0x4) == 0) {
                        var23[var29] = var34;
                    } else {
                        var23[var29] = var12.method309();
                    }
                    var28 = var30;
                    var29++;
                    if (var18.field2[var30] == 5) {
                        field682[var25] = false;
                    }
                }
            }
            var26.field677 = var29;
            var26.field678 = new int[var29];
            var26.field679 = new int[var29];
            var26.field680 = new int[var29];
            var26.field681 = new int[var29];
            for (int var31 = 0; var31 < var29; var31++) {
                var26.field678[var31] = var20[var31];
                var26.field679[var31] = var21[var31];
                var26.field680[var31] = var22[var31];
                var26.field681[var31] = var23[var31];
            }
        }
    }

    @OriginalMember(owner = "DFGNFGZH", name = "b", descriptor = "(I)V")
    public static void method213(int arg0) {
        if (arg0 == -38190) {
            field674 = null;
        }
    }

    @OriginalMember(owner = "DFGNFGZH", name = "c", descriptor = "(I)LDFGNFGZH;")
    public static class8 method214(int arg0) {
        return field674 == null ? null : field674[arg0];
    }

    @OriginalMember(owner = "DFGNFGZH", name = "a", descriptor = "(ZI)Z")
    public static boolean method215(boolean arg0, int arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        return arg1 == -1;
    }
}
