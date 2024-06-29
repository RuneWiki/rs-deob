import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DHMWVSMI")
public class class6 {

    @OriginalMember(owner = "client!DHMWVSMI", name = "a", descriptor = "Z")
    private static boolean field588 = true;

    @OriginalMember(owner = "client!DHMWVSMI", name = "b", descriptor = "I")
    private static int field589 = -23862;

    @OriginalMember(owner = "client!DHMWVSMI", name = "c", descriptor = "I")
    private static int field590 = 602;

    @OriginalMember(owner = "client!DHMWVSMI", name = "e", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "client!DHMWVSMI", name = "g", descriptor = "I")
    public int field594;

    @OriginalMember(owner = "client!DHMWVSMI", name = "f", descriptor = "LURJIIMJU;")
    public class57 field593;

    @OriginalMember(owner = "client!DHMWVSMI", name = "h", descriptor = "[I")
    public int[] field595;

    @OriginalMember(owner = "client!DHMWVSMI", name = "i", descriptor = "[I")
    public int[] field596;

    @OriginalMember(owner = "client!DHMWVSMI", name = "j", descriptor = "[I")
    public int[] field597;

    @OriginalMember(owner = "client!DHMWVSMI", name = "k", descriptor = "[I")
    public int[] field598;

    @OriginalMember(owner = "client!DHMWVSMI", name = "d", descriptor = "[LDHMWVSMI;")
    private static class6[] field591;

    @OriginalMember(owner = "client!DHMWVSMI", name = "l", descriptor = "[Z")
    private static boolean[] field599;

    @OriginalMember(owner = "client!DHMWVSMI", name = "a", descriptor = "(I)V")
    public static void method174(int arg0) {
        field591 = new class6[arg0 + 1];
        field599 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field599[var1] = true;
        }
    }

    @OriginalMember(owner = "client!DHMWVSMI", name = "a", descriptor = "(Z[B)V")
    public static void method175(boolean arg0, byte[] arg1) {
        class63 var2 = new class63((byte) -58, arg1);
        var2.field1571 = arg1.length - 8;
        int var3 = var2.method504();
        int var4 = var2.method504();
        int var5 = var2.method504();
        if (!arg0) {
            field589 = -83;
        }
        int var6 = var2.method504();
        byte var7 = 0;
        class63 var8 = new class63((byte) -58, arg1);
        var8.field1571 = var7;
        int var9 = var3 + var7 + 2;
        class63 var10 = new class63((byte) -58, arg1);
        var10.field1571 = var9;
        int var11 = var4 + var9;
        class63 var12 = new class63((byte) -58, arg1);
        var12.field1571 = var11;
        int var13 = var5 + var11;
        class63 var14 = new class63((byte) -58, arg1);
        var14.field1571 = var13;
        int var15 = var6 + var13;
        class63 var16 = new class63((byte) -58, arg1);
        var16.field1571 = var15;
        class57 var17 = new class57(var16, -32222);
        int var18 = var8.method504();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method504();
            class6 var25 = field591[var24] = new class6();
            var25.field592 = var14.method502();
            var25.field593 = var17;
            int var26 = var8.method502();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method502();
                if (var31 > 0) {
                    if (var17.field1503[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field1503[var32] == 0) {
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
                    if (var17.field1503[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method515();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method515();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method515();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field1503[var29] == 5) {
                        field599[var24] = false;
                    }
                }
            }
            var25.field594 = var28;
            var25.field595 = new int[var28];
            var25.field596 = new int[var28];
            var25.field597 = new int[var28];
            var25.field598 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field595[var30] = var19[var30];
                var25.field596[var30] = var20[var30];
                var25.field597[var30] = var21[var30];
                var25.field598[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "client!DHMWVSMI", name = "b", descriptor = "(I)V")
    public static void method176(int arg0) {
        if (arg0 != 0) {
            field590 = -334;
        }
        field591 = null;
    }

    @OriginalMember(owner = "client!DHMWVSMI", name = "c", descriptor = "(I)LDHMWVSMI;")
    public static class6 method177(int arg0) {
        return field591 == null ? null : field591[arg0];
    }

    @OriginalMember(owner = "client!DHMWVSMI", name = "a", descriptor = "(II)Z")
    public static boolean method178(int arg0, int arg1) {
        if (arg1 != 688) {
            field588 = !field588;
        }
        return arg0 == -1;
    }
}
