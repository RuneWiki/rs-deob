import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RLONYBCF")
public class class48 {

    @OriginalMember(owner = "client!RLONYBCF", name = "a", descriptor = "I")
    private static int field1250 = 536;

    @OriginalMember(owner = "client!RLONYBCF", name = "c", descriptor = "I")
    public int field1252;

    @OriginalMember(owner = "client!RLONYBCF", name = "e", descriptor = "I")
    public int field1254;

    @OriginalMember(owner = "client!RLONYBCF", name = "d", descriptor = "LWHXBCNTD;")
    public class63 field1253;

    @OriginalMember(owner = "client!RLONYBCF", name = "f", descriptor = "[I")
    public int[] field1255;

    @OriginalMember(owner = "client!RLONYBCF", name = "g", descriptor = "[I")
    public int[] field1256;

    @OriginalMember(owner = "client!RLONYBCF", name = "h", descriptor = "[I")
    public int[] field1257;

    @OriginalMember(owner = "client!RLONYBCF", name = "i", descriptor = "[I")
    public int[] field1258;

    @OriginalMember(owner = "client!RLONYBCF", name = "b", descriptor = "[LRLONYBCF;")
    private static class48[] field1251;

    @OriginalMember(owner = "client!RLONYBCF", name = "j", descriptor = "[Z")
    private static boolean[] field1259;

    @OriginalMember(owner = "client!RLONYBCF", name = "a", descriptor = "(I)V")
    public static void method432(int arg0) {
        field1251 = new class48[arg0 + 1];
        field1259 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1259[var1] = true;
        }
    }

    @OriginalMember(owner = "client!RLONYBCF", name = "a", descriptor = "(I[B)V")
    public static void method433(int arg0, byte[] arg1) {
        class10 var2 = new class10(arg1, field1250);
        var2.field646 = arg1.length - 8;
        int var3 = var2.method196();
        int var4 = var2.method196();
        int var5 = var2.method196();
        int var6 = var2.method196();
        byte var7 = 0;
        class10 var8 = new class10(arg1, field1250);
        var8.field646 = var7;
        int var9 = var3 + var7 + 2;
        if (arg0 <= 0) {
            return;
        }
        class10 var10 = new class10(arg1, field1250);
        var10.field646 = var9;
        int var11 = var4 + var9;
        class10 var12 = new class10(arg1, field1250);
        var12.field646 = var11;
        int var13 = var5 + var11;
        class10 var14 = new class10(arg1, field1250);
        var14.field646 = var13;
        int var15 = var6 + var13;
        class10 var16 = new class10(arg1, field1250);
        var16.field646 = var15;
        class63 var17 = new class63(var16, -890);
        int var18 = var8.method196();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method196();
            class48 var25 = field1251[var24] = new class48();
            var25.field1252 = var14.method194();
            var25.field1253 = var17;
            int var26 = var8.method194();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method194();
                if (var31 > 0) {
                    if (var17.field1567[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field1567[var32] == 0) {
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
                    if (var17.field1567[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method207();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method207();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method207();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field1567[var29] == 5) {
                        field1259[var24] = false;
                    }
                }
            }
            var25.field1254 = var28;
            var25.field1255 = new int[var28];
            var25.field1256 = new int[var28];
            var25.field1257 = new int[var28];
            var25.field1258 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field1255[var30] = var19[var30];
                var25.field1256[var30] = var20[var30];
                var25.field1257[var30] = var21[var30];
                var25.field1258[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "client!RLONYBCF", name = "b", descriptor = "(I)V")
    public static void method434(int arg0) {
        if (arg0 >= 0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field1251 = null;
    }

    @OriginalMember(owner = "client!RLONYBCF", name = "c", descriptor = "(I)LRLONYBCF;")
    public static class48 method435(int arg0) {
        return field1251 == null ? null : field1251[arg0];
    }

    @OriginalMember(owner = "client!RLONYBCF", name = "a", descriptor = "(ZI)Z")
    public static boolean method436(boolean arg0, int arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return arg1 == -1;
    }
}
