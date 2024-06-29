import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PHDJZMLE")
public class class49 {

    @OriginalMember(owner = "client!PHDJZMLE", name = "a", descriptor = "I")
    private static int field1417 = 18;

    @OriginalMember(owner = "client!PHDJZMLE", name = "c", descriptor = "I")
    public int field1419;

    @OriginalMember(owner = "client!PHDJZMLE", name = "e", descriptor = "I")
    public int field1421;

    @OriginalMember(owner = "client!PHDJZMLE", name = "d", descriptor = "LYMEZTXZW;")
    public class70 field1420;

    @OriginalMember(owner = "client!PHDJZMLE", name = "f", descriptor = "[I")
    public int[] field1422;

    @OriginalMember(owner = "client!PHDJZMLE", name = "g", descriptor = "[I")
    public int[] field1423;

    @OriginalMember(owner = "client!PHDJZMLE", name = "h", descriptor = "[I")
    public int[] field1424;

    @OriginalMember(owner = "client!PHDJZMLE", name = "i", descriptor = "[I")
    public int[] field1425;

    @OriginalMember(owner = "client!PHDJZMLE", name = "b", descriptor = "[LPHDJZMLE;")
    private static class49[] field1418;

    @OriginalMember(owner = "client!PHDJZMLE", name = "j", descriptor = "[Z")
    private static boolean[] field1426;

    @OriginalMember(owner = "client!PHDJZMLE", name = "a", descriptor = "(I)V")
    public static void method424(int arg0) {
        field1418 = new class49[arg0 + 1];
        field1426 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1426[var1] = true;
        }
    }

    @OriginalMember(owner = "client!PHDJZMLE", name = "a", descriptor = "(B[B)V")
    public static void method425(byte arg0, byte[] arg1) {
        class53 var2 = new class53(arg1, (byte) -17);
        var2.field1539 = arg1.length - 8;
        int var3 = var2.method457();
        int var4 = var2.method457();
        int var5 = var2.method457();
        int var6 = var2.method457();
        byte var7 = 0;
        class53 var8 = new class53(arg1, (byte) -17);
        if (arg0 != -111) {
            field1417 = -338;
        }
        var8.field1539 = var7;
        int var9 = var3 + var7 + 2;
        class53 var10 = new class53(arg1, (byte) -17);
        var10.field1539 = var9;
        int var11 = var4 + var9;
        class53 var12 = new class53(arg1, (byte) -17);
        var12.field1539 = var11;
        int var13 = var5 + var11;
        class53 var14 = new class53(arg1, (byte) -17);
        var14.field1539 = var13;
        int var15 = var6 + var13;
        class53 var16 = new class53(arg1, (byte) -17);
        var16.field1539 = var15;
        class70 var17 = new class70(453, var16);
        int var18 = var8.method457();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method457();
            class49 var25 = field1418[var24] = new class49();
            var25.field1419 = var14.method455();
            var25.field1420 = var17;
            int var26 = var8.method455();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method455();
                if (var31 > 0) {
                    if (var17.field1750[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field1750[var32] == 0) {
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
                    if (var17.field1750[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method468();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method468();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method468();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field1750[var29] == 5) {
                        field1426[var24] = false;
                    }
                }
            }
            var25.field1421 = var28;
            var25.field1422 = new int[var28];
            var25.field1423 = new int[var28];
            var25.field1424 = new int[var28];
            var25.field1425 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field1422[var30] = var19[var30];
                var25.field1423[var30] = var20[var30];
                var25.field1424[var30] = var21[var30];
                var25.field1425[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "client!PHDJZMLE", name = "b", descriptor = "(I)V")
    public static void method426(int arg0) {
        field1418 = null;
        if (arg0 == -29497) {
            ;
        }
    }

    @OriginalMember(owner = "client!PHDJZMLE", name = "c", descriptor = "(I)LPHDJZMLE;")
    public static class49 method427(int arg0) {
        return field1418 == null ? null : field1418[arg0];
    }

    @OriginalMember(owner = "client!PHDJZMLE", name = "a", descriptor = "(BI)Z")
    public static boolean method428(byte arg0, int arg1) {
        if (arg0 != 9) {
            throw new NullPointerException();
        }
        return arg1 == -1;
    }
}
