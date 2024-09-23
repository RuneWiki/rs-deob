import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HJEXDJAH")
public class class15 {

    @OriginalMember(owner = "HJEXDJAH", name = "b", descriptor = "I")
    public int field715;

    @OriginalMember(owner = "HJEXDJAH", name = "d", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "HJEXDJAH", name = "c", descriptor = "LTMLYUVVT;")
    public class52 field716;

    @OriginalMember(owner = "HJEXDJAH", name = "e", descriptor = "[I")
    public int[] field718;

    @OriginalMember(owner = "HJEXDJAH", name = "f", descriptor = "[I")
    public int[] field719;

    @OriginalMember(owner = "HJEXDJAH", name = "g", descriptor = "[I")
    public int[] field720;

    @OriginalMember(owner = "HJEXDJAH", name = "h", descriptor = "[I")
    public int[] field721;

    @OriginalMember(owner = "HJEXDJAH", name = "a", descriptor = "[LHJEXDJAH;")
    private static class15[] field714;

    @OriginalMember(owner = "HJEXDJAH", name = "i", descriptor = "[Z")
    private static boolean[] field722;

    @OriginalMember(owner = "HJEXDJAH", name = "a", descriptor = "(I)V")
    public static void method214(int arg0) {
        field714 = new class15[arg0 + 1];
        field722 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field722[var1] = true;
        }
    }

    @OriginalMember(owner = "HJEXDJAH", name = "a", descriptor = "(I[B)V")
    public static void method215(int arg0, byte[] arg1) {
        class55 var2 = new class55(741, arg1);
        var2.field1456 = arg1.length - 8;
        int var3 = var2.method457();
        int var4 = var2.method457();
        if (arg0 != -40035) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = var2.method457();
        int var7 = var2.method457();
        byte var8 = 0;
        class55 var9 = new class55(741, arg1);
        var9.field1456 = var8;
        int var10 = var3 + var8 + 2;
        class55 var11 = new class55(741, arg1);
        var11.field1456 = var10;
        int var12 = var4 + var10;
        class55 var13 = new class55(741, arg1);
        var13.field1456 = var12;
        int var14 = var6 + var12;
        class55 var15 = new class55(741, arg1);
        var15.field1456 = var14;
        int var16 = var7 + var14;
        class55 var17 = new class55(741, arg1);
        var17.field1456 = var16;
        class52 var18 = new class52(9, var17);
        int var19 = var9.method457();
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        int[] var23 = new int[500];
        for (int var24 = 0; var24 < var19; var24++) {
            int var25 = var9.method457();
            class15 var26 = field714[var25] = new class15();
            var26.field715 = var15.method455();
            var26.field716 = var18;
            int var27 = var9.method455();
            int var28 = -1;
            int var29 = 0;
            for (int var30 = 0; var30 < var27; var30++) {
                int var32 = var11.method455();
                if (var32 > 0) {
                    if (var18.field1363[var30] != 0) {
                        for (int var33 = var30 - 1; var33 > var28; var33--) {
                            if (var18.field1363[var33] == 0) {
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
                    if (var18.field1363[var30] == 3) {
                        var34 = 128;
                    }
                    if ((var32 & 0x1) == 0) {
                        var21[var29] = var34;
                    } else {
                        var21[var29] = var13.method468();
                    }
                    if ((var32 & 0x2) == 0) {
                        var22[var29] = var34;
                    } else {
                        var22[var29] = var13.method468();
                    }
                    if ((var32 & 0x4) == 0) {
                        var23[var29] = var34;
                    } else {
                        var23[var29] = var13.method468();
                    }
                    var28 = var30;
                    var29++;
                    if (var18.field1363[var30] == 5) {
                        field722[var25] = false;
                    }
                }
            }
            var26.field717 = var29;
            var26.field718 = new int[var29];
            var26.field719 = new int[var29];
            var26.field720 = new int[var29];
            var26.field721 = new int[var29];
            for (int var31 = 0; var31 < var29; var31++) {
                var26.field718[var31] = var20[var31];
                var26.field719[var31] = var21[var31];
                var26.field720[var31] = var22[var31];
                var26.field721[var31] = var23[var31];
            }
        }
    }

    @OriginalMember(owner = "HJEXDJAH", name = "a", descriptor = "(Z)V")
    public static void method216(boolean arg0) {
        if (!arg0) {
            field714 = null;
        }
    }

    @OriginalMember(owner = "HJEXDJAH", name = "a", descriptor = "(II)LHJEXDJAH;")
    public static class15 method217(int arg0, int arg1) {
        int var2 = 56 / arg0;
        return field714 == null ? null : field714[arg1];
    }

    @OriginalMember(owner = "HJEXDJAH", name = "a", descriptor = "(IZ)Z")
    public static boolean method218(int arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        }
        return arg0 == -1;
    }
}
