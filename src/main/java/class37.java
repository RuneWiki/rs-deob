import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MOOJSKCU")
public class class37 {

    @OriginalMember(owner = "client!MOOJSKCU", name = "b", descriptor = "I")
    public int field1128;

    @OriginalMember(owner = "client!MOOJSKCU", name = "d", descriptor = "I")
    public int field1130;

    @OriginalMember(owner = "client!MOOJSKCU", name = "c", descriptor = "LTULKBDIJ;")
    public class56 field1129;

    @OriginalMember(owner = "client!MOOJSKCU", name = "e", descriptor = "[I")
    public int[] field1131;

    @OriginalMember(owner = "client!MOOJSKCU", name = "f", descriptor = "[I")
    public int[] field1132;

    @OriginalMember(owner = "client!MOOJSKCU", name = "g", descriptor = "[I")
    public int[] field1133;

    @OriginalMember(owner = "client!MOOJSKCU", name = "h", descriptor = "[I")
    public int[] field1134;

    @OriginalMember(owner = "client!MOOJSKCU", name = "a", descriptor = "[LMOOJSKCU;")
    private static class37[] field1127;

    @OriginalMember(owner = "client!MOOJSKCU", name = "i", descriptor = "[Z")
    private static boolean[] field1135;

    @OriginalMember(owner = "client!MOOJSKCU", name = "a", descriptor = "(I)V")
    public static void method391(int arg0) {
        field1127 = new class37[arg0 + 1];
        field1135 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1135[var1] = true;
        }
    }

    @OriginalMember(owner = "client!MOOJSKCU", name = "a", descriptor = "([BB)V")
    public static void method392(byte[] arg0, byte arg1) {
        class18 var2 = new class18(arg0, 0);
        var2.field794 = arg0.length - 8;
        int var3 = var2.method241();
        int var4 = var2.method241();
        int var5 = var2.method241();
        int var6 = var2.method241();
        byte var7 = 0;
        class18 var8 = new class18(arg0, 0);
        var8.field794 = var7;
        int var9 = var3 + var7 + 2;
        class18 var10 = new class18(arg0, 0);
        var10.field794 = var9;
        int var11 = var4 + var9;
        class18 var12 = new class18(arg0, 0);
        var12.field794 = var11;
        int var13 = var5 + var11;
        class18 var14 = new class18(arg0, 0);
        var14.field794 = var13;
        int var15 = var6 + var13;
        class18 var16 = new class18(arg0, 0);
        var16.field794 = var15;
        class56 var17 = new class56(var16, true);
        int var18 = var8.method241();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        if (arg1 != 2) {
            for (int var23 = 1; var23 > 0; var23++) {
            }
        }
        for (int var24 = 0; var24 < var18; var24++) {
            int var25 = var8.method241();
            class37 var26 = field1127[var25] = new class37();
            var26.field1128 = var14.method239();
            var26.field1129 = var17;
            int var27 = var8.method239();
            int var28 = -1;
            int var29 = 0;
            for (int var30 = 0; var30 < var27; var30++) {
                int var32 = var10.method239();
                if (var32 > 0) {
                    if (var17.field1449[var30] != 0) {
                        for (int var33 = var30 - 1; var33 > var28; var33--) {
                            if (var17.field1449[var33] == 0) {
                                var19[var29] = var33;
                                var20[var29] = 0;
                                var21[var29] = 0;
                                var22[var29] = 0;
                                var29++;
                                break;
                            }
                        }
                    }
                    var19[var29] = var30;
                    short var34 = 0;
                    if (var17.field1449[var30] == 3) {
                        var34 = 128;
                    }
                    if ((var32 & 0x1) == 0) {
                        var20[var29] = var34;
                    } else {
                        var20[var29] = var12.method252();
                    }
                    if ((var32 & 0x2) == 0) {
                        var21[var29] = var34;
                    } else {
                        var21[var29] = var12.method252();
                    }
                    if ((var32 & 0x4) == 0) {
                        var22[var29] = var34;
                    } else {
                        var22[var29] = var12.method252();
                    }
                    var28 = var30;
                    var29++;
                    if (var17.field1449[var30] == 5) {
                        field1135[var25] = false;
                    }
                }
            }
            var26.field1130 = var29;
            var26.field1131 = new int[var29];
            var26.field1132 = new int[var29];
            var26.field1133 = new int[var29];
            var26.field1134 = new int[var29];
            for (int var31 = 0; var31 < var29; var31++) {
                var26.field1131[var31] = var19[var31];
                var26.field1132[var31] = var20[var31];
                var26.field1133[var31] = var21[var31];
                var26.field1134[var31] = var22[var31];
            }
        }
    }

    @OriginalMember(owner = "client!MOOJSKCU", name = "b", descriptor = "(I)V")
    public static void method393(int arg0) {
        field1127 = null;
        if (arg0 < 7 || arg0 > 7) {
            ;
        }
    }

    @OriginalMember(owner = "client!MOOJSKCU", name = "c", descriptor = "(I)LMOOJSKCU;")
    public static class37 method394(int arg0) {
        return field1127 == null ? null : field1127[arg0];
    }

    @OriginalMember(owner = "client!MOOJSKCU", name = "a", descriptor = "(IB)Z")
    public static boolean method395(int arg0, byte arg1) {
        if (arg1 != 1) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        return arg0 == -1;
    }
}
