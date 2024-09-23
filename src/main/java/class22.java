import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HQHBJEDA")
public class class22 {

    @OriginalMember(owner = "HQHBJEDA", name = "a", descriptor = "Z")
    private static boolean field791 = true;

    @OriginalMember(owner = "HQHBJEDA", name = "c", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "HQHBJEDA", name = "e", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "HQHBJEDA", name = "d", descriptor = "LYPJRJNAP;")
    public class69 field794;

    @OriginalMember(owner = "HQHBJEDA", name = "f", descriptor = "[I")
    public int[] field796;

    @OriginalMember(owner = "HQHBJEDA", name = "g", descriptor = "[I")
    public int[] field797;

    @OriginalMember(owner = "HQHBJEDA", name = "h", descriptor = "[I")
    public int[] field798;

    @OriginalMember(owner = "HQHBJEDA", name = "i", descriptor = "[I")
    public int[] field799;

    @OriginalMember(owner = "HQHBJEDA", name = "b", descriptor = "[LHQHBJEDA;")
    private static class22[] field792;

    @OriginalMember(owner = "HQHBJEDA", name = "j", descriptor = "[Z")
    private static boolean[] field800;

    @OriginalMember(owner = "HQHBJEDA", name = "a", descriptor = "(I)V")
    public static void method215(int arg0) {
        field792 = new class22[arg0 + 1];
        field800 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field800[var1] = true;
        }
    }

    @OriginalMember(owner = "HQHBJEDA", name = "a", descriptor = "([BB)V")
    public static void method216(byte[] arg0, byte arg1) {
        class24 var2 = new class24(0, arg0);
        var2.field832 = arg0.length - 8;
        int var3 = var2.method240();
        int var4 = var2.method240();
        int var5 = var2.method240();
        int var6 = var2.method240();
        byte var7 = 0;
        class24 var8 = new class24(0, arg0);
        var8.field832 = var7;
        int var9 = var3 + var7 + 2;
        class24 var10 = new class24(0, arg0);
        var10.field832 = var9;
        int var11 = var4 + var9;
        class24 var12 = new class24(0, arg0);
        var12.field832 = var11;
        int var13 = var5 + var11;
        class24 var14 = new class24(0, arg0);
        var14.field832 = var13;
        int var15 = var6 + var13;
        if (arg1 != 7) {
            return;
        }
        boolean var16 = false;
        class24 var17 = new class24(0, arg0);
        var17.field832 = var15;
        class69 var18 = new class69(var17, 0);
        int var19 = var8.method240();
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        int[] var23 = new int[500];
        for (int var24 = 0; var24 < var19; var24++) {
            int var25 = var8.method240();
            class22 var26 = field792[var25] = new class22();
            var26.field793 = var14.method238();
            var26.field794 = var18;
            int var27 = var8.method238();
            int var28 = -1;
            int var29 = 0;
            for (int var30 = 0; var30 < var27; var30++) {
                int var32 = var10.method238();
                if (var32 > 0) {
                    if (var18.field1699[var30] != 0) {
                        for (int var33 = var30 - 1; var33 > var28; var33--) {
                            if (var18.field1699[var33] == 0) {
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
                    if (var18.field1699[var30] == 3) {
                        var34 = 128;
                    }
                    if ((var32 & 0x1) == 0) {
                        var21[var29] = var34;
                    } else {
                        var21[var29] = var12.method251();
                    }
                    if ((var32 & 0x2) == 0) {
                        var22[var29] = var34;
                    } else {
                        var22[var29] = var12.method251();
                    }
                    if ((var32 & 0x4) == 0) {
                        var23[var29] = var34;
                    } else {
                        var23[var29] = var12.method251();
                    }
                    var28 = var30;
                    var29++;
                    if (var18.field1699[var30] == 5) {
                        field800[var25] = false;
                    }
                }
            }
            var26.field795 = var29;
            var26.field796 = new int[var29];
            var26.field797 = new int[var29];
            var26.field798 = new int[var29];
            var26.field799 = new int[var29];
            for (int var31 = 0; var31 < var29; var31++) {
                var26.field796[var31] = var20[var31];
                var26.field797[var31] = var21[var31];
                var26.field798[var31] = var22[var31];
                var26.field799[var31] = var23[var31];
            }
        }
    }

    @OriginalMember(owner = "HQHBJEDA", name = "b", descriptor = "(I)V")
    public static void method217(int arg0) {
        int var1 = 80 / arg0;
        field792 = null;
    }

    @OriginalMember(owner = "HQHBJEDA", name = "a", descriptor = "(IB)LHQHBJEDA;")
    public static class22 method218(int arg0, byte arg1) {
        if (arg1 != -27) {
            throw new NullPointerException();
        }
        return field792 == null ? null : field792[arg0];
    }

    @OriginalMember(owner = "HQHBJEDA", name = "a", descriptor = "(IZ)Z")
    public static boolean method219(int arg0, boolean arg1) {
        if (!arg1) {
            field791 = !field791;
        }
        return arg0 == -1;
    }
}
