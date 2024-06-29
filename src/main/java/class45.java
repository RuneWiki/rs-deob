import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PLSPTEPI")
public class class45 {

    @OriginalMember(owner = "client!PLSPTEPI", name = "a", descriptor = "Z")
    private static boolean field1246 = true;

    @OriginalMember(owner = "client!PLSPTEPI", name = "b", descriptor = "I")
    private static int field1247 = -858;

    @OriginalMember(owner = "client!PLSPTEPI", name = "d", descriptor = "I")
    public int field1249;

    @OriginalMember(owner = "client!PLSPTEPI", name = "f", descriptor = "I")
    public int field1251;

    @OriginalMember(owner = "client!PLSPTEPI", name = "e", descriptor = "LMJXROMKT;")
    public class32 field1250;

    @OriginalMember(owner = "client!PLSPTEPI", name = "g", descriptor = "[I")
    public int[] field1252;

    @OriginalMember(owner = "client!PLSPTEPI", name = "h", descriptor = "[I")
    public int[] field1253;

    @OriginalMember(owner = "client!PLSPTEPI", name = "i", descriptor = "[I")
    public int[] field1254;

    @OriginalMember(owner = "client!PLSPTEPI", name = "j", descriptor = "[I")
    public int[] field1255;

    @OriginalMember(owner = "client!PLSPTEPI", name = "c", descriptor = "[LPLSPTEPI;")
    private static class45[] field1248;

    @OriginalMember(owner = "client!PLSPTEPI", name = "k", descriptor = "[Z")
    private static boolean[] field1256;

    @OriginalMember(owner = "client!PLSPTEPI", name = "a", descriptor = "(I)V")
    public static void method402(int arg0) {
        field1248 = new class45[arg0 + 1];
        field1256 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1256[var1] = true;
        }
    }

    @OriginalMember(owner = "client!PLSPTEPI", name = "a", descriptor = "(B[B)V")
    public static void method403(byte arg0, byte[] arg1) {
        class52 var2 = new class52(arg1, true);
        var2.field1434 = arg1.length - 8;
        int var3 = var2.method463();
        int var4 = var2.method463();
        int var5 = var2.method463();
        int var6 = var2.method463();
        if (arg0 != 9) {
            return;
        }
        byte var7 = 0;
        class52 var8 = new class52(arg1, true);
        var8.field1434 = var7;
        int var9 = var3 + var7 + 2;
        class52 var10 = new class52(arg1, true);
        var10.field1434 = var9;
        int var11 = var4 + var9;
        class52 var12 = new class52(arg1, true);
        var12.field1434 = var11;
        int var13 = var5 + var11;
        class52 var14 = new class52(arg1, true);
        var14.field1434 = var13;
        int var15 = var6 + var13;
        class52 var16 = new class52(arg1, true);
        var16.field1434 = var15;
        class32 var17 = new class32(field1246, var16);
        int var18 = var8.method463();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method463();
            class45 var25 = field1248[var24] = new class45();
            var25.field1249 = var14.method461();
            var25.field1250 = var17;
            int var26 = var8.method461();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method461();
                if (var31 > 0) {
                    if (var17.field986[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field986[var32] == 0) {
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
                    if (var17.field986[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method474();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method474();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method474();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field986[var29] == 5) {
                        field1256[var24] = false;
                    }
                }
            }
            var25.field1251 = var28;
            var25.field1252 = new int[var28];
            var25.field1253 = new int[var28];
            var25.field1254 = new int[var28];
            var25.field1255 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field1252[var30] = var19[var30];
                var25.field1253[var30] = var20[var30];
                var25.field1254[var30] = var21[var30];
                var25.field1255[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "client!PLSPTEPI", name = "b", descriptor = "(I)V")
    public static void method404(int arg0) {
        field1248 = null;
        if (arg0 != 0) {
            field1247 = -291;
        }
    }

    @OriginalMember(owner = "client!PLSPTEPI", name = "c", descriptor = "(I)LPLSPTEPI;")
    public static class45 method405(int arg0) {
        return field1248 == null ? null : field1248[arg0];
    }

    @OriginalMember(owner = "client!PLSPTEPI", name = "a", descriptor = "(II)Z")
    public static boolean method406(int arg0, int arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        return arg1 == -1;
    }
}
