import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AOFTXYIM")
public class class3 {

    @OriginalMember(owner = "AOFTXYIM", name = "b", descriptor = "I")
    public int field18;

    @OriginalMember(owner = "AOFTXYIM", name = "d", descriptor = "I")
    public int field20;

    @OriginalMember(owner = "AOFTXYIM", name = "c", descriptor = "LWPDTVMXY;")
    public class68 field19;

    @OriginalMember(owner = "AOFTXYIM", name = "e", descriptor = "[I")
    public int[] field21;

    @OriginalMember(owner = "AOFTXYIM", name = "f", descriptor = "[I")
    public int[] field22;

    @OriginalMember(owner = "AOFTXYIM", name = "g", descriptor = "[I")
    public int[] field23;

    @OriginalMember(owner = "AOFTXYIM", name = "h", descriptor = "[I")
    public int[] field24;

    @OriginalMember(owner = "AOFTXYIM", name = "a", descriptor = "[LAOFTXYIM;")
    private static class3[] field17;

    @OriginalMember(owner = "AOFTXYIM", name = "i", descriptor = "[Z")
    private static boolean[] field25;

    @OriginalMember(owner = "AOFTXYIM", name = "a", descriptor = "(I)V")
    public static void method1(int arg0) {
        field17 = new class3[arg0 + 1];
        field25 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field25[var1] = true;
        }
    }

    @OriginalMember(owner = "AOFTXYIM", name = "a", descriptor = "(I[B)V")
    public static void method2(int arg0, byte[] arg1) {
        class43 var2 = new class43(arg1, 0);
        var2.field1105 = arg1.length - 8;
        int var3 = var2.method332();
        int var4 = var2.method332();
        int var5 = var2.method332();
        int var6 = var2.method332();
        byte var7 = 0;
        class43 var8 = new class43(arg1, 0);
        var8.field1105 = var7;
        int var9 = var3 + var7 + 2;
        class43 var10 = new class43(arg1, 0);
        if (arg0 <= 0) {
            return;
        }
        var10.field1105 = var9;
        int var11 = var4 + var9;
        class43 var12 = new class43(arg1, 0);
        var12.field1105 = var11;
        int var13 = var5 + var11;
        class43 var14 = new class43(arg1, 0);
        var14.field1105 = var13;
        int var15 = var6 + var13;
        class43 var16 = new class43(arg1, 0);
        var16.field1105 = var15;
        class68 var17 = new class68(var16, true);
        int var18 = var8.method332();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method332();
            class3 var25 = field17[var24] = new class3();
            var25.field18 = var14.method330();
            var25.field19 = var17;
            int var26 = var8.method330();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method330();
                if (var31 > 0) {
                    if (var17.field1632[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field1632[var32] == 0) {
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
                    if (var17.field1632[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method343();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method343();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method343();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field1632[var29] == 5) {
                        field25[var24] = false;
                    }
                }
            }
            var25.field20 = var28;
            var25.field21 = new int[var28];
            var25.field22 = new int[var28];
            var25.field23 = new int[var28];
            var25.field24 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field21[var30] = var19[var30];
                var25.field22[var30] = var20[var30];
                var25.field23[var30] = var21[var30];
                var25.field24[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "AOFTXYIM", name = "a", descriptor = "(B)V")
    public static void method3(byte arg0) {
        if (arg0 == 0) {
            field17 = null;
        }
    }

    @OriginalMember(owner = "AOFTXYIM", name = "b", descriptor = "(I)LAOFTXYIM;")
    public static class3 method4(int arg0) {
        return field17 == null ? null : field17[arg0];
    }

    @OriginalMember(owner = "AOFTXYIM", name = "a", descriptor = "(BI)Z")
    public static boolean method5(byte arg0, int arg1) {
        if (arg0 != 2) {
            throw new NullPointerException();
        }
        return arg1 == -1;
    }
}
