import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YYYUATIU")
public class class69 {

    @OriginalMember(owner = "client!YYYUATIU", name = "a", descriptor = "I")
    private static int field1703 = 9;

    @OriginalMember(owner = "client!YYYUATIU", name = "b", descriptor = "I")
    private static int field1704;

    @OriginalMember(owner = "client!YYYUATIU", name = "d", descriptor = "I")
    public int field1706;

    @OriginalMember(owner = "client!YYYUATIU", name = "f", descriptor = "I")
    public int field1708;

    @OriginalMember(owner = "client!YYYUATIU", name = "e", descriptor = "LCKXVXQFJ;")
    public class5 field1707;

    @OriginalMember(owner = "client!YYYUATIU", name = "g", descriptor = "[I")
    public int[] field1709;

    @OriginalMember(owner = "client!YYYUATIU", name = "h", descriptor = "[I")
    public int[] field1710;

    @OriginalMember(owner = "client!YYYUATIU", name = "i", descriptor = "[I")
    public int[] field1711;

    @OriginalMember(owner = "client!YYYUATIU", name = "j", descriptor = "[I")
    public int[] field1712;

    @OriginalMember(owner = "client!YYYUATIU", name = "c", descriptor = "[LYYYUATIU;")
    private static class69[] field1705;

    @OriginalMember(owner = "client!YYYUATIU", name = "k", descriptor = "[Z")
    private static boolean[] field1713;

    @OriginalMember(owner = "client!YYYUATIU", name = "a", descriptor = "(I)V")
    public static void method575(int arg0) {
        field1705 = new class69[arg0 + 1];
        field1713 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1713[var1] = true;
        }
    }

    @OriginalMember(owner = "client!YYYUATIU", name = "a", descriptor = "([BI)V")
    public static void method576(byte[] arg0, int arg1) {
        class36 var2 = new class36(-587, arg0);
        var2.field1072 = arg0.length - 8;
        int var3 = var2.method341();
        int var4 = var2.method341();
        int var5 = var2.method341();
        int var6 = var2.method341();
        byte var7 = 0;
        if (arg1 != 0) {
            field1704 = -328;
        }
        class36 var8 = new class36(-587, arg0);
        var8.field1072 = var7;
        int var9 = var3 + var7 + 2;
        class36 var10 = new class36(-587, arg0);
        var10.field1072 = var9;
        int var11 = var4 + var9;
        class36 var12 = new class36(-587, arg0);
        var12.field1072 = var11;
        int var13 = var5 + var11;
        class36 var14 = new class36(-587, arg0);
        var14.field1072 = var13;
        int var15 = var6 + var13;
        class36 var16 = new class36(-587, arg0);
        var16.field1072 = var15;
        class5 var17 = new class5(false, var16);
        int var18 = var8.method341();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method341();
            class69 var25 = field1705[var24] = new class69();
            var25.field1706 = var14.method339();
            var25.field1707 = var17;
            int var26 = var8.method339();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method339();
                if (var31 > 0) {
                    if (var17.field80[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field80[var32] == 0) {
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
                    if (var17.field80[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method352();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method352();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method352();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field80[var29] == 5) {
                        field1713[var24] = false;
                    }
                }
            }
            var25.field1708 = var28;
            var25.field1709 = new int[var28];
            var25.field1710 = new int[var28];
            var25.field1711 = new int[var28];
            var25.field1712 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field1709[var30] = var19[var30];
                var25.field1710[var30] = var20[var30];
                var25.field1711[var30] = var21[var30];
                var25.field1712[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "client!YYYUATIU", name = "b", descriptor = "(I)V")
    public static void method577(int arg0) {
        if (field1703 != arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field1705 = null;
    }

    @OriginalMember(owner = "client!YYYUATIU", name = "c", descriptor = "(I)LYYYUATIU;")
    public static class69 method578(int arg0) {
        return field1705 == null ? null : field1705[arg0];
    }

    @OriginalMember(owner = "client!YYYUATIU", name = "a", descriptor = "(ZI)Z")
    public static boolean method579(boolean arg0, int arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return arg1 == -1;
    }
}
