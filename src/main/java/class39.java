import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NLIOLBXV")
public class class39 {

    @OriginalMember(owner = "NLIOLBXV", name = "a", descriptor = "Z")
    private static boolean field1154 = true;

    @OriginalMember(owner = "NLIOLBXV", name = "b", descriptor = "I")
    private static int field1155 = 4;

    @OriginalMember(owner = "NLIOLBXV", name = "c", descriptor = "I")
    private static int field1156 = 7;

    @OriginalMember(owner = "NLIOLBXV", name = "e", descriptor = "I")
    public int field1158;

    @OriginalMember(owner = "NLIOLBXV", name = "g", descriptor = "I")
    public int field1160;

    @OriginalMember(owner = "NLIOLBXV", name = "f", descriptor = "LHSGACJOH;")
    public class23 field1159;

    @OriginalMember(owner = "NLIOLBXV", name = "h", descriptor = "[I")
    public int[] field1161;

    @OriginalMember(owner = "NLIOLBXV", name = "i", descriptor = "[I")
    public int[] field1162;

    @OriginalMember(owner = "NLIOLBXV", name = "j", descriptor = "[I")
    public int[] field1163;

    @OriginalMember(owner = "NLIOLBXV", name = "k", descriptor = "[I")
    public int[] field1164;

    @OriginalMember(owner = "NLIOLBXV", name = "d", descriptor = "[LNLIOLBXV;")
    private static class39[] field1157;

    @OriginalMember(owner = "NLIOLBXV", name = "l", descriptor = "[Z")
    private static boolean[] field1165;

    @OriginalMember(owner = "NLIOLBXV", name = "a", descriptor = "(I)V")
    public static void method352(int arg0) {
        field1157 = new class39[arg0 + 1];
        field1165 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1165[var1] = true;
        }
    }

    @OriginalMember(owner = "NLIOLBXV", name = "a", descriptor = "(I[B)V")
    public static void method353(int arg0, byte[] arg1) {
        class11 var2 = new class11(arg1, field1154);
        var2.field643 = arg1.length - 8;
        int var3 = var2.method191();
        int var4 = var2.method191();
        int var5 = var2.method191();
        int var6 = var2.method191();
        byte var7 = 0;
        class11 var8 = new class11(arg1, field1154);
        var8.field643 = var7;
        int var9 = var3 + var7 + 2;
        class11 var10 = new class11(arg1, field1154);
        if (arg0 != 0) {
            field1156 = -308;
        }
        var10.field643 = var9;
        int var11 = var4 + var9;
        class11 var12 = new class11(arg1, field1154);
        var12.field643 = var11;
        int var13 = var5 + var11;
        class11 var14 = new class11(arg1, field1154);
        var14.field643 = var13;
        int var15 = var6 + var13;
        class11 var16 = new class11(arg1, field1154);
        var16.field643 = var15;
        class23 var17 = new class23((byte) 70, var16);
        int var18 = var8.method191();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method191();
            class39 var25 = field1157[var24] = new class39();
            var25.field1158 = var14.method189();
            var25.field1159 = var17;
            int var26 = var8.method189();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method189();
                if (var31 > 0) {
                    if (var17.field822[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field822[var32] == 0) {
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
                    if (var17.field822[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method202();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method202();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method202();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field822[var29] == 5) {
                        field1165[var24] = false;
                    }
                }
            }
            var25.field1160 = var28;
            var25.field1161 = new int[var28];
            var25.field1162 = new int[var28];
            var25.field1163 = new int[var28];
            var25.field1164 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field1161[var30] = var19[var30];
                var25.field1162[var30] = var20[var30];
                var25.field1163[var30] = var21[var30];
                var25.field1164[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "NLIOLBXV", name = "b", descriptor = "(I)V")
    public static void method354(int arg0) {
        field1157 = null;
        if (arg0 < field1155 || arg0 > field1155) {
            field1155 = -184;
        }
    }

    @OriginalMember(owner = "NLIOLBXV", name = "c", descriptor = "(I)LNLIOLBXV;")
    public static class39 method355(int arg0) {
        return field1157 == null ? null : field1157[arg0];
    }

    @OriginalMember(owner = "NLIOLBXV", name = "a", descriptor = "(BI)Z")
    public static boolean method356(byte arg0, int arg1) {
        if (arg0 != 68) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 == -1;
    }
}
