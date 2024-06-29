import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SGSYCWFB")
public class class48 {

    @OriginalMember(owner = "client!SGSYCWFB", name = "a", descriptor = "I")
    private static int field1361 = 8;

    @OriginalMember(owner = "client!SGSYCWFB", name = "c", descriptor = "I")
    public int field1363;

    @OriginalMember(owner = "client!SGSYCWFB", name = "e", descriptor = "I")
    public int field1365;

    @OriginalMember(owner = "client!SGSYCWFB", name = "d", descriptor = "LQICGPMWF;")
    public class43 field1364;

    @OriginalMember(owner = "client!SGSYCWFB", name = "f", descriptor = "[I")
    public int[] field1366;

    @OriginalMember(owner = "client!SGSYCWFB", name = "g", descriptor = "[I")
    public int[] field1367;

    @OriginalMember(owner = "client!SGSYCWFB", name = "h", descriptor = "[I")
    public int[] field1368;

    @OriginalMember(owner = "client!SGSYCWFB", name = "i", descriptor = "[I")
    public int[] field1369;

    @OriginalMember(owner = "client!SGSYCWFB", name = "b", descriptor = "[LSGSYCWFB;")
    private static class48[] field1362;

    @OriginalMember(owner = "client!SGSYCWFB", name = "j", descriptor = "[Z")
    private static boolean[] field1370;

    @OriginalMember(owner = "client!SGSYCWFB", name = "a", descriptor = "(I)V")
    public static void method419(int arg0) {
        field1362 = new class48[arg0 + 1];
        field1370 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1370[var1] = true;
        }
    }

    @OriginalMember(owner = "client!SGSYCWFB", name = "a", descriptor = "([BB)V")
    public static void method420(byte[] arg0, byte arg1) {
        class53 var2 = new class53(arg0, -631);
        var2.field1457 = arg0.length - 8;
        int var3 = var2.method470();
        int var4 = var2.method470();
        int var5 = var2.method470();
        int var6 = var2.method470();
        byte var7 = 0;
        class53 var8 = new class53(arg0, -631);
        var8.field1457 = var7;
        int var9 = var3 + var7 + 2;
        class53 var10 = new class53(arg0, -631);
        var10.field1457 = var9;
        int var11 = var4 + var9;
        class53 var12 = new class53(arg0, -631);
        var12.field1457 = var11;
        int var13 = var5 + var11;
        if (arg1 != 6) {
            return;
        }
        boolean var14 = false;
        class53 var15 = new class53(arg0, -631);
        var15.field1457 = var13;
        int var16 = var6 + var13;
        class53 var17 = new class53(arg0, -631);
        var17.field1457 = var16;
        class43 var18 = new class43(var17, field1361);
        int var19 = var8.method470();
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        int[] var23 = new int[500];
        for (int var24 = 0; var24 < var19; var24++) {
            int var25 = var8.method470();
            class48 var26 = field1362[var25] = new class48();
            var26.field1363 = var15.method468();
            var26.field1364 = var18;
            int var27 = var8.method468();
            int var28 = -1;
            int var29 = 0;
            for (int var30 = 0; var30 < var27; var30++) {
                int var32 = var10.method468();
                if (var32 > 0) {
                    if (var18.field1296[var30] != 0) {
                        for (int var33 = var30 - 1; var33 > var28; var33--) {
                            if (var18.field1296[var33] == 0) {
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
                    if (var18.field1296[var30] == 3) {
                        var34 = 128;
                    }
                    if ((var32 & 0x1) == 0) {
                        var21[var29] = var34;
                    } else {
                        var21[var29] = var12.method481();
                    }
                    if ((var32 & 0x2) == 0) {
                        var22[var29] = var34;
                    } else {
                        var22[var29] = var12.method481();
                    }
                    if ((var32 & 0x4) == 0) {
                        var23[var29] = var34;
                    } else {
                        var23[var29] = var12.method481();
                    }
                    var28 = var30;
                    var29++;
                    if (var18.field1296[var30] == 5) {
                        field1370[var25] = false;
                    }
                }
            }
            var26.field1365 = var29;
            var26.field1366 = new int[var29];
            var26.field1367 = new int[var29];
            var26.field1368 = new int[var29];
            var26.field1369 = new int[var29];
            for (int var31 = 0; var31 < var29; var31++) {
                var26.field1366[var31] = var20[var31];
                var26.field1367[var31] = var21[var31];
                var26.field1368[var31] = var22[var31];
                var26.field1369[var31] = var23[var31];
            }
        }
    }

    @OriginalMember(owner = "client!SGSYCWFB", name = "b", descriptor = "(I)V")
    public static void method421(int arg0) {
        field1362 = null;
        if (arg0 == 5) {
            ;
        }
    }

    @OriginalMember(owner = "client!SGSYCWFB", name = "c", descriptor = "(I)LSGSYCWFB;")
    public static class48 method422(int arg0) {
        return field1362 == null ? null : field1362[arg0];
    }

    @OriginalMember(owner = "client!SGSYCWFB", name = "a", descriptor = "(II)Z")
    public static boolean method423(int arg0, int arg1) {
        if (arg1 != 41952) {
            throw new NullPointerException();
        }
        return arg0 == -1;
    }
}
