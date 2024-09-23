import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QWCFKPFT")
public class class48 {

    @OriginalMember(owner = "QWCFKPFT", name = "b", descriptor = "I")
    private static int field1301 = 6;

    @OriginalMember(owner = "QWCFKPFT", name = "e", descriptor = "I")
    public int field1304;

    @OriginalMember(owner = "QWCFKPFT", name = "g", descriptor = "I")
    public int field1306;

    @OriginalMember(owner = "QWCFKPFT", name = "f", descriptor = "LOSKYDPYJ;")
    public class40 field1305;

    @OriginalMember(owner = "QWCFKPFT", name = "a", descriptor = "Z")
    private static boolean field1300;

    @OriginalMember(owner = "QWCFKPFT", name = "c", descriptor = "Z")
    private static boolean field1302;

    @OriginalMember(owner = "QWCFKPFT", name = "h", descriptor = "[I")
    public int[] field1307;

    @OriginalMember(owner = "QWCFKPFT", name = "i", descriptor = "[I")
    public int[] field1308;

    @OriginalMember(owner = "QWCFKPFT", name = "j", descriptor = "[I")
    public int[] field1309;

    @OriginalMember(owner = "QWCFKPFT", name = "k", descriptor = "[I")
    public int[] field1310;

    @OriginalMember(owner = "QWCFKPFT", name = "d", descriptor = "[LQWCFKPFT;")
    private static class48[] field1303;

    @OriginalMember(owner = "QWCFKPFT", name = "l", descriptor = "[Z")
    private static boolean[] field1311;

    @OriginalMember(owner = "QWCFKPFT", name = "a", descriptor = "(I)V")
    public static void method500(int arg0) {
        field1303 = new class48[arg0 + 1];
        field1311 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1311[var1] = true;
        }
    }

    @OriginalMember(owner = "QWCFKPFT", name = "a", descriptor = "(Z[B)V")
    public static void method501(boolean arg0, byte[] arg1) {
        class30 var2 = new class30(arg1, -982);
        var2.field1065 = arg1.length - 8;
        int var3 = var2.method351();
        int var4 = var2.method351();
        int var5 = var2.method351();
        int var6 = var2.method351();
        byte var7 = 0;
        class30 var8 = new class30(arg1, -982);
        var8.field1065 = var7;
        int var9 = var3 + var7 + 2;
        class30 var10 = new class30(arg1, -982);
        var10.field1065 = var9;
        int var11 = var4 + var9;
        class30 var12 = new class30(arg1, -982);
        var12.field1065 = var11;
        int var13 = var5 + var11;
        class30 var14 = new class30(arg1, -982);
        var14.field1065 = var13;
        if (!arg0) {
            field1301 = -291;
        }
        int var15 = var6 + var13;
        class30 var16 = new class30(arg1, -982);
        var16.field1065 = var15;
        class40 var17 = new class40(var16, (byte) -22);
        int var18 = var8.method351();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method351();
            class48 var25 = field1303[var24] = new class48();
            var25.field1304 = var14.method349();
            var25.field1305 = var17;
            int var26 = var8.method349();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method349();
                if (var31 > 0) {
                    if (var17.field1215[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field1215[var32] == 0) {
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
                    if (var17.field1215[var29] == 3) {
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
                    if (var17.field1215[var29] == 5) {
                        field1311[var24] = false;
                    }
                }
            }
            var25.field1306 = var28;
            var25.field1307 = new int[var28];
            var25.field1308 = new int[var28];
            var25.field1309 = new int[var28];
            var25.field1310 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field1307[var30] = var19[var30];
                var25.field1308[var30] = var20[var30];
                var25.field1309[var30] = var21[var30];
                var25.field1310[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "QWCFKPFT", name = "b", descriptor = "(I)V")
    public static void method502(int arg0) {
        if (arg0 != 6) {
            field1300 = !field1300;
        }
        field1303 = null;
    }

    @OriginalMember(owner = "QWCFKPFT", name = "a", descriptor = "(II)LQWCFKPFT;")
    public static class48 method503(int arg0, int arg1) {
        if (arg1 != 8) {
            field1300 = !field1300;
        }
        return field1303 == null ? null : field1303[arg0];
    }

    @OriginalMember(owner = "QWCFKPFT", name = "b", descriptor = "(II)Z")
    public static boolean method504(int arg0, int arg1) {
        if (arg1 != 3) {
            field1302 = !field1302;
        }
        return arg0 == -1;
    }
}
