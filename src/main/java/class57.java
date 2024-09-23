import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TDFMBTLA")
public class class57 {

    @OriginalMember(owner = "TDFMBTLA", name = "a", descriptor = "I")
    private static int field1440 = 8;

    @OriginalMember(owner = "TDFMBTLA", name = "c", descriptor = "I")
    public int field1442;

    @OriginalMember(owner = "TDFMBTLA", name = "e", descriptor = "I")
    public int field1444;

    @OriginalMember(owner = "TDFMBTLA", name = "d", descriptor = "LVLFCQHDE;")
    public class64 field1443;

    @OriginalMember(owner = "TDFMBTLA", name = "f", descriptor = "[I")
    public int[] field1445;

    @OriginalMember(owner = "TDFMBTLA", name = "g", descriptor = "[I")
    public int[] field1446;

    @OriginalMember(owner = "TDFMBTLA", name = "h", descriptor = "[I")
    public int[] field1447;

    @OriginalMember(owner = "TDFMBTLA", name = "i", descriptor = "[I")
    public int[] field1448;

    @OriginalMember(owner = "TDFMBTLA", name = "b", descriptor = "[LTDFMBTLA;")
    private static class57[] field1441;

    @OriginalMember(owner = "TDFMBTLA", name = "j", descriptor = "[Z")
    private static boolean[] field1449;

    @OriginalMember(owner = "TDFMBTLA", name = "a", descriptor = "(I)V")
    public static void method487(int arg0) {
        field1441 = new class57[arg0 + 1];
        field1449 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1449[var1] = true;
        }
    }

    @OriginalMember(owner = "TDFMBTLA", name = "a", descriptor = "(I[B)V")
    public static void method488(int arg0, byte[] arg1) {
        class33 var2 = new class33(field1440, arg1);
        var2.field954 = arg1.length - 8;
        int var3 = var2.method294();
        int var4 = var2.method294();
        int var5 = var2.method294();
        int var6 = var2.method294();
        byte var7 = 0;
        class33 var8 = new class33(field1440, arg1);
        var8.field954 = var7;
        if (arg0 != 0) {
            return;
        }
        int var9 = var3 + var7 + 2;
        class33 var10 = new class33(field1440, arg1);
        var10.field954 = var9;
        int var11 = var4 + var9;
        class33 var12 = new class33(field1440, arg1);
        var12.field954 = var11;
        int var13 = var5 + var11;
        class33 var14 = new class33(field1440, arg1);
        var14.field954 = var13;
        int var15 = var6 + var13;
        class33 var16 = new class33(field1440, arg1);
        var16.field954 = var15;
        class64 var17 = new class64(false, var16);
        int var18 = var8.method294();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method294();
            class57 var25 = field1441[var24] = new class57();
            var25.field1442 = var14.method292();
            var25.field1443 = var17;
            int var26 = var8.method292();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method292();
                if (var31 > 0) {
                    if (var17.field1649[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field1649[var32] == 0) {
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
                    if (var17.field1649[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method305();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method305();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method305();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field1649[var29] == 5) {
                        field1449[var24] = false;
                    }
                }
            }
            var25.field1444 = var28;
            var25.field1445 = new int[var28];
            var25.field1446 = new int[var28];
            var25.field1447 = new int[var28];
            var25.field1448 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field1445[var30] = var19[var30];
                var25.field1446[var30] = var20[var30];
                var25.field1447[var30] = var21[var30];
                var25.field1448[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "TDFMBTLA", name = "b", descriptor = "(I)V")
    public static void method489(int arg0) {
        if (arg0 == 0) {
            field1441 = null;
        }
    }

    @OriginalMember(owner = "TDFMBTLA", name = "a", descriptor = "(II)LTDFMBTLA;")
    public static class57 method490(int arg0, int arg1) {
        if (arg1 != 14700) {
            throw new NullPointerException();
        }
        return field1441 == null ? null : field1441[arg0];
    }

    @OriginalMember(owner = "TDFMBTLA", name = "b", descriptor = "(II)Z")
    public static boolean method491(int arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return arg0 == -1;
    }
}
