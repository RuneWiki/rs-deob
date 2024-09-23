import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CANZHIOT")
public class class7 {

    @OriginalMember(owner = "CANZHIOT", name = "c", descriptor = "I")
    public int field43;

    @OriginalMember(owner = "CANZHIOT", name = "e", descriptor = "I")
    public int field45;

    @OriginalMember(owner = "CANZHIOT", name = "d", descriptor = "LAQXKJVRI;")
    public class2 field44;

    @OriginalMember(owner = "CANZHIOT", name = "a", descriptor = "Z")
    private static boolean field41;

    @OriginalMember(owner = "CANZHIOT", name = "f", descriptor = "[I")
    public int[] field46;

    @OriginalMember(owner = "CANZHIOT", name = "g", descriptor = "[I")
    public int[] field47;

    @OriginalMember(owner = "CANZHIOT", name = "h", descriptor = "[I")
    public int[] field48;

    @OriginalMember(owner = "CANZHIOT", name = "i", descriptor = "[I")
    public int[] field49;

    @OriginalMember(owner = "CANZHIOT", name = "b", descriptor = "[LCANZHIOT;")
    private static class7[] field42;

    @OriginalMember(owner = "CANZHIOT", name = "j", descriptor = "[Z")
    private static boolean[] field50;

    @OriginalMember(owner = "CANZHIOT", name = "a", descriptor = "(I)V")
    public static void method13(int arg0) {
        field42 = new class7[arg0 + 1];
        field50 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field50[var1] = true;
        }
    }

    @OriginalMember(owner = "CANZHIOT", name = "a", descriptor = "(I[B)V")
    public static void method14(int arg0, byte[] arg1) {
        class8 var2 = new class8(arg1, 792);
        var2.field72 = arg1.length - 8;
        int var3 = var2.method32();
        int var4 = var2.method32();
        int var5 = var2.method32();
        int var6 = var2.method32();
        byte var7 = 0;
        class8 var8 = new class8(arg1, 792);
        var8.field72 = var7;
        int var9 = var3 + var7 + 2;
        class8 var10 = new class8(arg1, 792);
        var10.field72 = var9;
        int var11 = var4 + var9;
        class8 var12 = new class8(arg1, 792);
        var12.field72 = var11;
        int var13 = var5 + var11;
        class8 var14 = new class8(arg1, 792);
        var14.field72 = var13;
        int var15 = var6 + var13;
        class8 var16 = new class8(arg1, 792);
        if (arg0 <= 0) {
            return;
        }
        var16.field72 = var15;
        class2 var17 = new class2(var16, (byte) 9);
        int var18 = var8.method32();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method32();
            class7 var25 = field42[var24] = new class7();
            var25.field43 = var14.method30();
            var25.field44 = var17;
            int var26 = var8.method30();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method30();
                if (var31 > 0) {
                    if (var17.field5[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field5[var32] == 0) {
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
                    if (var17.field5[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method43();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method43();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method43();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field5[var29] == 5) {
                        field50[var24] = false;
                    }
                }
            }
            var25.field45 = var28;
            var25.field46 = new int[var28];
            var25.field47 = new int[var28];
            var25.field48 = new int[var28];
            var25.field49 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field46[var30] = var19[var30];
                var25.field47[var30] = var20[var30];
                var25.field48[var30] = var21[var30];
                var25.field49[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "CANZHIOT", name = "a", descriptor = "(Z)V")
    public static void method15(boolean arg0) {
        field42 = null;
        if (!arg0) {
            field41 = !field41;
        }
    }

    @OriginalMember(owner = "CANZHIOT", name = "a", descriptor = "(II)LCANZHIOT;")
    public static class7 method16(int arg0, int arg1) {
        if (arg1 < 0 || arg1 > 0) {
            throw new NullPointerException();
        }
        return field42 == null ? null : field42[arg0];
    }

    @OriginalMember(owner = "CANZHIOT", name = "a", descriptor = "(IZ)Z")
    public static boolean method17(int arg0, boolean arg1) {
        if (arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 == -1;
    }
}
