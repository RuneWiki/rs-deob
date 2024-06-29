import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class143 extends class125 {

    @OriginalMember(owner = "client!p", name = "F", descriptor = "I")
    private int field2842 = 0;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "I")
    private int field2850 = -1;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "Ljd;")
    private static class92 field2849 = class202.method1325((byte) 90, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!p", name = "I", descriptor = "Ljd;")
    private static class92 field2845 = class202.method1325((byte) 90, "wave2:");

    @OriginalMember(owner = "client!p", name = "E", descriptor = "Ljd;")
    public static class92 field2841 = field2845;

    @OriginalMember(owner = "client!p", name = "J", descriptor = "Ljd;")
    public static class92 field2846 = field2849;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
    public static int field2853 = 0;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "Ljd;")
    public static class92 field2852 = class202.method1325((byte) 90, "Fps:");

    @OriginalMember(owner = "client!p", name = "D", descriptor = "Ljd;")
    public static class92 field2840 = class202.method1325((byte) 90, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!p", name = "S", descriptor = "Ljd;")
    public static class92 field2855 = field2845;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!p", name = "B", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "I")
    public int field2839;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "I")
    public int field2843;

    @OriginalMember(owner = "client!p", name = "H", descriptor = "I")
    public int field2844;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "I")
    public int field2847;

    @OriginalMember(owner = "client!p", name = "L", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!p", name = "U", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "Lse;")
    public static class175 field2836;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(B)V")
    public static final void method940(byte arg0) {
        class119.field2415 = 0;
        class98.field1991 = -1;
        class61.field1265 = -1;
        class148.field2930 = 0;
        class44.field988 = -1;
        class3.field182 = 0;
        class137.field2750 = 0;
        if (arg0 <= 82) {
            field2845 = null;
        }
        class72.field1524 = false;
        class4.field262 = 0;
        class99.field2000.field1472 = 0;
        field2837++;
        class3.field174 = -1;
        class185.field3497.field1472 = 0;
        client.field690 = 0;
        for (int var1 = 0; var1 < class172.field3347.length; var1++) {
            if (class172.field3347[var1] != null) {
                class172.field3347[var1].field204 = -1;
            }
        }
        for (int var2 = 0; var2 < class107.field2187.length; var2++) {
            if (class107.field2187[var2] != null) {
                class107.field2187[var2].field204 = -1;
            }
        }
        class210.method1369((byte) -112);
        class213.method1385((byte) 116, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class55.field1143[var3] = true;
        }
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)[Lrf;")
    public static final class167[] method941(int arg0) {
        if (arg0 != -2) {
            return null;
        }
        class167[] var1 = new class167[class30.field661];
        field2848++;
        for (int var2 = 0; var2 < class30.field661; var2++) {
            class167 var3 = new class167();
            var3.field3278 = class147.field2917;
            var3.field3279 = class153.field3029;
            var3.field3280 = class153.field3039[var2];
            var3.field3277 = class61.field1275[var2];
            var3.field3276 = class119.field2419[var2];
            var3.field3275 = class39.field876[var2];
            int var4 = var3.field3276 * var3.field3275;
            byte[] var5 = class14.field401[var2];
            var3.field3281 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field3281[var6] = class123.field2503[class196.method1301(255, var5[var6])];
            }
            var1[var2] = var3;
        }
        class146.method955(true);
        return var1;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
    private final void method942(int arg0, int arg1) {
        field2856++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & arg0) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        double var11 = 0.0D;
        if (var7 < var9) {
            var9 = var7;
        }
        double var13 = var3;
        double var15 = 0.0D;
        if (var5 > var3) {
            var13 = var5;
        }
        if (var7 > var13) {
            var13 = var7;
        }
        double var17 = (var9 + var13) / 2.0D;
        this.field2839 = (int) (var17 * 256.0D);
        if (var9 != var13) {
            if (var3 == var13) {
                var11 = (var5 - var7) / (var13 - var9);
            } else if (var5 == var13) {
                var11 = (var7 - var3) / (-var9 + var13) + 2.0D;
            } else if (var7 == var13) {
                var11 = (var3 - var5) / (var13 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var13 - var9) / (var9 + var13);
            }
            if (var17 >= 0.5D) {
                var15 = (var13 - var9) / (2.0D - var13 - var9);
            }
        }
        if (var17 > 0.5D) {
            this.field2844 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2844 = (int) (var15 * var17 * 512.0D);
        }
        double var19 = var11 / 6.0D;
        if (this.field2844 < 1) {
            this.field2844 = 1;
        }
        this.field2843 = (int) ((double) this.field2844 * var19);
        if (this.field2839 < 0) {
            this.field2839 = 0;
        } else if (this.field2839 > 255) {
            this.field2839 = 255;
        }
        this.field2847 = (int) (var15 * 256.0D);
        if (this.field2847 < 0) {
            this.field2847 = 0;
        } else if (this.field2847 > 255) {
            this.field2847 = 255;
            return;
        }
    }

    @OriginalMember(owner = "client!p", name = "g", descriptor = "(I)V")
    public static void method943(int arg0) {
        if (arg0 != -14264) {
            field2845 = null;
        }
        field2855 = null;
        field2849 = null;
        field2840 = null;
        field2836 = null;
        field2845 = null;
        field2841 = null;
        field2852 = null;
        field2846 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIILh;)V")
    private final void method944(int arg0, int arg1, int arg2, class70 arg3) {
        field2858++;
        if (arg0 <= 66) {
            method941(73);
        }
        if (arg2 == 1) {
            this.field2842 = arg3.method415(49);
            this.method942(255, this.field2842);
        } else if (arg2 == 2) {
            this.field2850 = arg3.method442(-21351);
            if (this.field2850 != 65535) {
                return;
            }
            this.field2850 = -1;
        } else if (arg2 == 3) {
            arg3.method442(-21351);
            return;
        }
    }

    @OriginalMember(owner = "client!p", name = "h", descriptor = "(I)V")
    public static final void method945(int arg0) {
        for (class187 var1 = (class187) class135.field2699.method103(57); var1 != null; var1 = (class187) class135.field2699.method100(-49)) {
            if (var1.field3528 != null) {
                class55.field1136.method373(var1.field3528);
                var1.field3528 = null;
            }
            if (var1.field3545 != null) {
                class55.field1136.method373(var1.field3545);
                var1.field3545 = null;
            }
        }
        class135.field2699.method109(65);
        field2857++;
        int var2 = -59 % ((-arg0 - 39) / 61);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lh;II)V")
    public final void method946(class70 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        field2838++;
        while (true) {
            int var4 = arg0.method443(255);
            if (var4 == 0) {
                return;
            }
            this.method944(123, arg1, var4, arg0);
        }
    }
}
