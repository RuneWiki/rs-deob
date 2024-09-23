import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BWSGQYNU")
public class class5 {

    @OriginalMember(owner = "BWSGQYNU", name = "a", descriptor = "I")
    private static int field40;

    @OriginalMember(owner = "BWSGQYNU", name = "c", descriptor = "I")
    public int field42;

    @OriginalMember(owner = "BWSGQYNU", name = "e", descriptor = "I")
    public int field44;

    @OriginalMember(owner = "BWSGQYNU", name = "d", descriptor = "LJRQJNVRC;")
    public class36 field43;

    @OriginalMember(owner = "BWSGQYNU", name = "f", descriptor = "[I")
    public int[] field45;

    @OriginalMember(owner = "BWSGQYNU", name = "g", descriptor = "[I")
    public int[] field46;

    @OriginalMember(owner = "BWSGQYNU", name = "h", descriptor = "[I")
    public int[] field47;

    @OriginalMember(owner = "BWSGQYNU", name = "i", descriptor = "[I")
    public int[] field48;

    @OriginalMember(owner = "BWSGQYNU", name = "b", descriptor = "[LBWSGQYNU;")
    private static class5[] field41;

    @OriginalMember(owner = "BWSGQYNU", name = "j", descriptor = "[Z")
    private static boolean[] field49;

    @OriginalMember(owner = "BWSGQYNU", name = "a", descriptor = "(I)V")
    public static void method12(int arg0) {
        field41 = new class5[arg0 + 1];
        field49 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field49[var1] = true;
        }
    }

    @OriginalMember(owner = "BWSGQYNU", name = "a", descriptor = "([BZ)V")
    public static void method13(byte[] arg0, boolean arg1) {
        class29 var2 = new class29((byte) -28, arg0);
        var2.field1107 = arg0.length - 8;
        int var3 = var2.method310();
        int var4 = var2.method310();
        int var5 = var2.method310();
        int var6 = var2.method310();
        byte var7 = 0;
        class29 var8 = new class29((byte) -28, arg0);
        var8.field1107 = var7;
        int var9 = var3 + var7 + 2;
        class29 var10 = new class29((byte) -28, arg0);
        var10.field1107 = var9;
        if (arg1) {
            return;
        }
        int var11 = var4 + var9;
        class29 var12 = new class29((byte) -28, arg0);
        var12.field1107 = var11;
        int var13 = var5 + var11;
        class29 var14 = new class29((byte) -28, arg0);
        var14.field1107 = var13;
        int var15 = var6 + var13;
        class29 var16 = new class29((byte) -28, arg0);
        var16.field1107 = var15;
        class36 var17 = new class36(var16, field40);
        int var18 = var8.method310();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method310();
            class5 var25 = field41[var24] = new class5();
            var25.field42 = var14.method308();
            var25.field43 = var17;
            int var26 = var8.method308();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method308();
                if (var31 > 0) {
                    if (var17.field1203[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field1203[var32] == 0) {
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
                    if (var17.field1203[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method321();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method321();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method321();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field1203[var29] == 5) {
                        field49[var24] = false;
                    }
                }
            }
            var25.field44 = var28;
            var25.field45 = new int[var28];
            var25.field46 = new int[var28];
            var25.field47 = new int[var28];
            var25.field48 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field45[var30] = var19[var30];
                var25.field46[var30] = var20[var30];
                var25.field47[var30] = var21[var30];
                var25.field48[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "BWSGQYNU", name = "a", descriptor = "(Z)V")
    public static void method14(boolean arg0) {
        field41 = null;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "BWSGQYNU", name = "a", descriptor = "(II)LBWSGQYNU;")
    public static class5 method15(int arg0, int arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else if (field41 == null) {
            return null;
        } else {
            return field41[arg1];
        }
    }

    @OriginalMember(owner = "BWSGQYNU", name = "a", descriptor = "(IZ)Z")
    public static boolean method16(int arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        }
        return arg0 == -1;
    }
}
