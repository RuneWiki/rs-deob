import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ERVJQNCY")
public class class14 {

    @OriginalMember(owner = "ERVJQNCY", name = "b", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "ERVJQNCY", name = "d", descriptor = "I")
    public int field761;

    @OriginalMember(owner = "ERVJQNCY", name = "c", descriptor = "LXVBRPTSM;")
    public class71 field760;

    @OriginalMember(owner = "ERVJQNCY", name = "e", descriptor = "[I")
    public int[] field762;

    @OriginalMember(owner = "ERVJQNCY", name = "f", descriptor = "[I")
    public int[] field763;

    @OriginalMember(owner = "ERVJQNCY", name = "g", descriptor = "[I")
    public int[] field764;

    @OriginalMember(owner = "ERVJQNCY", name = "h", descriptor = "[I")
    public int[] field765;

    @OriginalMember(owner = "ERVJQNCY", name = "a", descriptor = "[LERVJQNCY;")
    private static class14[] field758;

    @OriginalMember(owner = "ERVJQNCY", name = "i", descriptor = "[Z")
    private static boolean[] field766;

    @OriginalMember(owner = "ERVJQNCY", name = "a", descriptor = "(I)V")
    public static void method278(int arg0) {
        field758 = new class14[arg0 + 1];
        field766 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field766[var1] = true;
        }
    }

    @OriginalMember(owner = "ERVJQNCY", name = "a", descriptor = "([BZ)V")
    public static void method279(byte[] arg0, boolean arg1) {
        class5 var2 = new class5(2, arg0);
        var2.field123 = arg0.length - 8;
        int var3 = var2.method46();
        int var4 = var2.method46();
        int var5 = var2.method46();
        int var6 = var2.method46();
        byte var7 = 0;
        class5 var8 = new class5(2, arg0);
        var8.field123 = var7;
        int var9 = var3 + var7 + 2;
        class5 var10 = new class5(2, arg0);
        var10.field123 = var9;
        int var11 = var4 + var9;
        class5 var12 = new class5(2, arg0);
        var12.field123 = var11;
        int var13 = var5 + var11;
        class5 var14 = new class5(2, arg0);
        if (arg1) {
            return;
        }
        var14.field123 = var13;
        int var15 = var6 + var13;
        class5 var16 = new class5(2, arg0);
        var16.field123 = var15;
        class71 var17 = new class71(-179, var16);
        int var18 = var8.method46();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method46();
            class14 var25 = field758[var24] = new class14();
            var25.field759 = var14.method44();
            var25.field760 = var17;
            int var26 = var8.method44();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method44();
                if (var31 > 0) {
                    if (var17.field1711[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field1711[var32] == 0) {
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
                    if (var17.field1711[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method57();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method57();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method57();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field1711[var29] == 5) {
                        field766[var24] = false;
                    }
                }
            }
            var25.field761 = var28;
            var25.field762 = new int[var28];
            var25.field763 = new int[var28];
            var25.field764 = new int[var28];
            var25.field765 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field762[var30] = var19[var30];
                var25.field763[var30] = var20[var30];
                var25.field764[var30] = var21[var30];
                var25.field765[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "ERVJQNCY", name = "b", descriptor = "(I)V")
    public static void method280(int arg0) {
        if (arg0 == 0) {
            field758 = null;
        }
    }

    @OriginalMember(owner = "ERVJQNCY", name = "a", descriptor = "(BI)LERVJQNCY;")
    public static class14 method281(byte arg0, int arg1) {
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        return field758 == null ? null : field758[arg1];
    }

    @OriginalMember(owner = "ERVJQNCY", name = "a", descriptor = "(IZ)Z")
    public static boolean method282(int arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        return arg0 == -1;
    }
}
