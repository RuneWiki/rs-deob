import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class187 {

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "J")
    public long field3385 = 0L;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Lcc;")
    public static class209 field3367 = class95.method669(87, "settings");

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lcc;")
    private static class209 field3364 = class95.method669(118, " ");

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Lcc;")
    private static class209 field3370 = class95.method669(99, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Lcc;")
    public static class209 field3366 = class95.method669(114, "Chargement de la liste des serveurs");

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Lcc;")
    public static class209 field3375 = field3364;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Lcc;")
    private static class209 field3368 = class95.method669(112, "Loaded textures");

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lcc;")
    private static class209 field3373 = class95.method669(113, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Lcc;")
    public static class209 field3382 = class95.method669(90, "(Z");

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field3384 = 0;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "Lcc;")
    public static class209 field3379 = field3370;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Lcc;")
    public static class209 field3369 = field3368;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "Lcc;")
    public static class209 field3388 = field3373;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public int field3371;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public int field3372;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public int field3376;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public int field3378;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public int field3380;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "Lpb;")
    public class126 field3377;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "Lpb;")
    public class126 field3387;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lsj;")
    public static class49 field3365;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Llc;")
    public static class83 field3374;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "[[Z")
    public static boolean[][] field3386;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "[[[I")
    public static int[][][] field3383;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static final void method1275(int arg0) {
        class173.field3163++;
        class84.field1677.method287((byte) 120, 30);
        if (arg0 != 0) {
            method1275(66);
        }
        class84.field1677.method773(-6385, class258.method1788(25));
        field3381++;
        class84.field1677.method740(arg0 ^ 0xFF, class25.field442);
        class84.field1677.method740(255, class50.field981);
        class84.field1677.method773(-6385, class163.field2960);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)Z")
    public static final boolean method1276(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class153.field2772; var3++) {
            class53 var4 = class251.field4512[var3];
            if (var4.field1053 == 1) {
                int var5 = var4.field1058 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1049 * var5 >> 8) + var4.field1042;
                    int var7 = (var4.field1046 * var5 >> 8) + var4.field1038;
                    int var8 = (var4.field1055 * var5 >> 8) + var4.field1048;
                    int var9 = (var4.field1043 * var5 >> 8) + var4.field1036;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1053 == 2) {
                int var10 = arg0 - var4.field1058;
                if (var10 > 0) {
                    int var11 = (var4.field1049 * var10 >> 8) + var4.field1042;
                    int var12 = (var4.field1046 * var10 >> 8) + var4.field1038;
                    int var13 = (var4.field1055 * var10 >> 8) + var4.field1048;
                    int var14 = (var4.field1043 * var10 >> 8) + var4.field1036;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1053 == 3) {
                int var15 = var4.field1042 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1044 * var15 >> 8) + var4.field1058;
                    int var17 = (var4.field1054 * var15 >> 8) + var4.field1052;
                    int var18 = (var4.field1055 * var15 >> 8) + var4.field1048;
                    int var19 = (var4.field1043 * var15 >> 8) + var4.field1036;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1053 == 4) {
                int var20 = arg2 - var4.field1042;
                if (var20 > 0) {
                    int var21 = (var4.field1044 * var20 >> 8) + var4.field1058;
                    int var22 = (var4.field1054 * var20 >> 8) + var4.field1052;
                    int var23 = (var4.field1055 * var20 >> 8) + var4.field1048;
                    int var24 = (var4.field1043 * var20 >> 8) + var4.field1036;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1053 == 5) {
                int var25 = arg1 - var4.field1048;
                if (var25 > 0) {
                    int var26 = (var4.field1044 * var25 >> 8) + var4.field1058;
                    int var27 = (var4.field1054 * var25 >> 8) + var4.field1052;
                    int var28 = (var4.field1049 * var25 >> 8) + var4.field1042;
                    int var29 = (var4.field1046 * var25 >> 8) + var4.field1038;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public static void method1277(byte arg0) {
        int var1 = 18 % ((arg0 - 11) / 59);
        field3375 = null;
        field3366 = null;
        field3388 = null;
        field3379 = null;
        field3369 = null;
        field3386 = null;
        field3382 = null;
        field3383 = null;
        field3368 = null;
        field3364 = null;
        field3373 = null;
        field3365 = null;
        field3367 = null;
        field3374 = null;
        field3370 = null;
    }
}
