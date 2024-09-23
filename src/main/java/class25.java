import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KDJQGGIG")
public class class25 {

    @OriginalMember(owner = "KDJQGGIG", name = "a", descriptor = "I")
    private static int field1000 = 732;

    @OriginalMember(owner = "KDJQGGIG", name = "c", descriptor = "I")
    public int field1002;

    @OriginalMember(owner = "KDJQGGIG", name = "e", descriptor = "I")
    public int field1004;

    @OriginalMember(owner = "KDJQGGIG", name = "d", descriptor = "LUSEDATIW;")
    public class53 field1003;

    @OriginalMember(owner = "KDJQGGIG", name = "f", descriptor = "[I")
    public int[] field1005;

    @OriginalMember(owner = "KDJQGGIG", name = "g", descriptor = "[I")
    public int[] field1006;

    @OriginalMember(owner = "KDJQGGIG", name = "h", descriptor = "[I")
    public int[] field1007;

    @OriginalMember(owner = "KDJQGGIG", name = "i", descriptor = "[I")
    public int[] field1008;

    @OriginalMember(owner = "KDJQGGIG", name = "b", descriptor = "[LKDJQGGIG;")
    private static class25[] field1001;

    @OriginalMember(owner = "KDJQGGIG", name = "j", descriptor = "[Z")
    private static boolean[] field1009;

    @OriginalMember(owner = "KDJQGGIG", name = "a", descriptor = "(I)V")
    public static void method281(int arg0) {
        field1001 = new class25[arg0 + 1];
        field1009 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1009[var1] = true;
        }
    }

    @OriginalMember(owner = "KDJQGGIG", name = "a", descriptor = "([BZ)V")
    public static void method282(byte[] arg0, boolean arg1) {
        class35 var2 = new class35((byte) -103, arg0);
        var2.field1107 = arg0.length - 8;
        int var3 = var2.method351();
        int var4 = var2.method351();
        int var5 = var2.method351();
        int var6 = var2.method351();
        byte var7 = 0;
        class35 var8 = new class35((byte) -103, arg0);
        var8.field1107 = var7;
        int var9 = var3 + var7 + 2;
        class35 var10 = new class35((byte) -103, arg0);
        var10.field1107 = var9;
        int var11 = var4 + var9;
        class35 var12 = new class35((byte) -103, arg0);
        var12.field1107 = var11;
        int var13 = var5 + var11;
        if (arg1) {
            return;
        }
        class35 var14 = new class35((byte) -103, arg0);
        var14.field1107 = var13;
        int var15 = var6 + var13;
        class35 var16 = new class35((byte) -103, arg0);
        var16.field1107 = var15;
        class53 var17 = new class53(false, var16);
        int var18 = var8.method351();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method351();
            class25 var25 = field1001[var24] = new class25();
            var25.field1002 = var14.method349();
            var25.field1003 = var17;
            int var26 = var8.method349();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method349();
                if (var31 > 0) {
                    if (var17.field1477[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field1477[var32] == 0) {
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
                    if (var17.field1477[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method362();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method362();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method362();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field1477[var29] == 5) {
                        field1009[var24] = false;
                    }
                }
            }
            var25.field1004 = var28;
            var25.field1005 = new int[var28];
            var25.field1006 = new int[var28];
            var25.field1007 = new int[var28];
            var25.field1008 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field1005[var30] = var19[var30];
                var25.field1006[var30] = var20[var30];
                var25.field1007[var30] = var21[var30];
                var25.field1008[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "KDJQGGIG", name = "a", descriptor = "(Z)V")
    public static void method283(boolean arg0) {
        if (!arg0) {
            field1001 = null;
        }
    }

    @OriginalMember(owner = "KDJQGGIG", name = "b", descriptor = "(I)LKDJQGGIG;")
    public static class25 method284(int arg0) {
        return field1001 == null ? null : field1001[arg0];
    }

    @OriginalMember(owner = "KDJQGGIG", name = "a", descriptor = "(II)Z")
    public static boolean method285(int arg0, int arg1) {
        if (arg0 != 0) {
            field1000 = 479;
        }
        return arg1 == -1;
    }
}
