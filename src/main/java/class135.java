import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class135 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "[I")
    public static int[] field3133 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lec;")
    public static class32 field3140 = class73.method594(" <col=00ff80>", true);

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field3136 = 0;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "[I")
    public static int[] field3137 = new int[500];

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Lec;")
    private static class32 field3141 = class73.method594("Examine", true);

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lec;")
    public static class32 field3139 = class73.method594("Der Server wird gerade aktualisiert)3", true);

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Lec;")
    public static class32 field3142 = field3141;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Lec;")
    public static class32 field3138 = class73.method594("swe", true);

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "[I")
    public static int[] field3144 = new int[99];

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "Lec;")
    public static class32 field3146 = class73.method594("<col=ff3000>", true);

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "Lec;")
    public static class32 field3147 = class73.method594("(U5", true);

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "[[S")
    public static short[][] field3148;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lb;IZ)V")
    public static final void method1029(class8 arg0, int arg1, boolean arg2) {
        if (class4.field81 != null) {
            try {
                class4.field81.method52(-30);
            } catch (Exception var8) {
            }
            class4.field81 = null;
        }
        class4.field81 = arg0;
        if (arg1 < 35) {
            return;
        }
        field3134++;
        class94.method742(0, arg2);
        class61.field1355.field1569 = 0;
        class38.field922 = 0;
        class106.field2531 = null;
        class149.field3374 = null;
        while (true) {
            class110 var3 = (class110) class112.field2618.method1205((byte) 121);
            if (var3 == null) {
                while (true) {
                    class110 var4 = (class110) class31.field593.method1205((byte) 79);
                    if (var4 == null) {
                        if (class92.field2120 != 0) {
                            try {
                                class66 var5 = new class66(4);
                                var5.method515((byte) 74, 4);
                                var5.method515((byte) 59, class92.field2120);
                                var5.method514(0, (byte) -76);
                                class4.field81.method49(var5.field1587, 4, 0, (byte) 126);
                            } catch (IOException var7) {
                                try {
                                    class4.field81.method52(92);
                                } catch (Exception var6) {
                                }
                                class4.field81 = null;
                                class61.field1356++;
                            }
                        }
                        class133.field3042 = 0;
                        class136.field3159 = class52.method408((byte) -114);
                        return;
                    }
                    class126.field2920.method1170((byte) -102, var4);
                    class132.field3031.method1203(true, var4.field3326, var4);
                    class33.field698++;
                    class66.field1580--;
                }
            }
            class97.field2214.method1203(true, var3.field3326, var3);
            class158.field3629++;
            class64.field1495--;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
    public static void method1030(boolean arg0) {
        field3138 = null;
        field3140 = null;
        field3144 = null;
        field3133 = null;
        field3141 = null;
        field3148 = null;
        field3137 = null;
        if (arg0) {
            method1031(false, -96, null);
        }
        field3142 = null;
        field3146 = null;
        field3139 = null;
        field3147 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
    public static final byte[] method1031(boolean arg0, int arg1, Object arg2) {
        field3145++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class86.method669(49, var3) : var3;
        } else {
            if (arg1 != 2) {
                method1030(true);
            }
            if (!(arg2 instanceof class131)) {
                throw new IllegalArgumentException();
            }
            class131 var4 = (class131) arg2;
            return var4.method61((byte) 84);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static final void method1032(int arg0) {
        int var1 = class38.field914.method772(class5.field94);
        for (int var2 = 0; var2 < class119.field2851; var2++) {
            int var6 = class38.field914.method772(class111.method880(true, var2));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        class110.field2587 = class119.field2851 * 15 + 22;
        var1 += 8;
        class26.field476 = true;
        if (arg0 != -5560) {
            field3146 = null;
        }
        field3143++;
        int var3 = class119.field2851 * 15 + 21;
        int var4 = class9.field166 - var1 / 2;
        class45.field1072 = var1;
        int var5 = class66.field1590;
        if (var1 + var4 > 765) {
            var4 = 765 - var1;
        }
        if (var5 + var3 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        class121.field2866 = var5;
        class36.field864 = var4;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field3144[var1] = var0 / 4;
        }
        field3148 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field3149 = 0;
    }
}
