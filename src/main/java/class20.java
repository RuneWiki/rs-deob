import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class20 {

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "[I")
    public static int[] field366 = new int[100];

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Lec;")
    public static class32 field365 = class73.method594(" steht bereits auf Ihrer Freunde)2Liste(Q", true);

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field371 = 0;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lec;")
    public static class32 field364 = class73.method594("Musik)2Engine vorbereitet)3", true);

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Lec;")
    public static class32 field372 = class73.method594("::noclip", true);

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Lhb;")
    public static class51 field369;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "Lka;")
    public static class70 field373;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method135(int arg0) {
        field365 = null;
        field364 = null;
        field369 = null;
        field366 = null;
        int var1 = -44 / ((61 - arg0) / 34);
        field373 = null;
        field372 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILec;)I")
    public static final int method136(int arg0, class32 arg1) {
        field367++;
        if (field371 == 1) {
            return 7;
        } else if (arg1.method262(class131.field3014, true)) {
            return 1;
        } else if (arg1.method262(class128.field2942, true)) {
            return 1;
        } else if (arg1.method262(class119.field2845, true)) {
            return 2;
        } else if (arg1.method262(class149.field3381, true)) {
            return 2;
        } else if (arg1.method262(class38.field927, true)) {
            return 3;
        } else if (arg1.method262(class54.field1272, true)) {
            return 4;
        } else if (arg1.method262(class3.field48, true)) {
            return 4;
        } else if (arg0 > -125) {
            return -69;
        } else if (arg1.method262(class135.field3138, true)) {
            return 5;
        } else if (arg1.method262(class157.field3594, true)) {
            return 6;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
    public static final void method137(boolean arg0) {
        field370++;
        if (arg0) {
            method136(40, null);
        }
        for (int var1 = 0; var1 < class143.field3279; var1++) {
            int var10002 = class112.field2628[var1]--;
            if (class112.field2628[var1] >= -10) {
                class123 var3 = class65.field1510[var1];
                if (var3 == null) {
                    var3 = class123.method974(class1.field6, class53.field1196[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class112.field2628[var1] += var3.method971();
                    class65.field1510[var1] = var3;
                }
                if (class112.field2628[var1] < 0) {
                    int var4;
                    if (class114.field2674[var1] == 0) {
                        var4 = class70.field1630;
                    } else {
                        int var5 = (class114.field2674[var1] & 0xFF) * 128;
                        int var6 = class114.field2674[var1] >> 16 & 0xFF;
                        int var7 = var6 * 128 + 64 - field373.field2749;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = class114.field2674[var1] >> 8 & 0xFF;
                        int var9 = var8 * 128 + 64 - field373.field2700;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var5 < var10) {
                            class112.field2628[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class114.field2648 / var5;
                    }
                    if (var4 > 0) {
                        class58 var11 = var3.method973().method454(class130.field3009);
                        class90 var12 = class90.method688(var11, 100, var4);
                        var12.method686(class126.field2925[var1] - 1);
                        class37.field882.method914(var12);
                    }
                    class112.field2628[var1] = -100;
                }
            } else {
                class143.field3279--;
                for (int var2 = var1; var2 < class143.field3279; var2++) {
                    class53.field1196[var2] = class53.field1196[var2 + 1];
                    class65.field1510[var2] = class65.field1510[var2 + 1];
                    class126.field2925[var2] = class126.field2925[var2 + 1];
                    class112.field2628[var2] = class112.field2628[var2 + 1];
                    class114.field2674[var2] = class114.field2674[var2 + 1];
                }
                var1--;
            }
        }
        if (class112.field2623 && !class29.method197(2330)) {
            if (class158.field3640 != 0 && class12.field206 != -1) {
                class154.method1197(class124.field2889, -1, class12.field206, class158.field3640, false, 0);
            }
            class112.field2623 = false;
        }
    }
}
