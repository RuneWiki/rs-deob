import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public abstract class class171 {

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field2816 = 0;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "J")
    public static long field2811;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "[[I")
    public static int[][] field2818;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "[[[I")
    public static int[][][] field2810;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)I")
    public abstract int method941(int arg0, int arg1);

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public static void method1149(byte arg0) {
        field2810 = null;
        int var1 = -64 / ((-arg0 - 50) / 36);
        field2818 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public static final void method1150(int arg0) {
        field2814++;
        int var1 = class248.field4058.method198(8, (byte) 0);
        if (class157.field2624 > var1) {
            for (int var2 = var1; var2 < class157.field2624; var2++) {
                class248.field4070[class61.field1071++] = class280.field4458[var2];
            }
        }
        if (var1 > class157.field2624) {
            throw new RuntimeException("gppov1");
        }
        class157.field2624 = 0;
        for (int var3 = arg0; var3 < var1; var3++) {
            int var4 = class280.field4458[var3];
            class288 var5 = class105.field1874[var4];
            int var6 = class248.field4058.method198(1, (byte) 0);
            if (var6 == 0) {
                class280.field4458[class157.field2624++] = var4;
                var5.field1406 = class266.field4301;
            } else {
                int var7 = class248.field4058.method198(2, (byte) 0);
                if (var7 == 0) {
                    class280.field4458[class157.field2624++] = var4;
                    var5.field1406 = class266.field4301;
                    class60.field1051[class292.field4664++] = var4;
                } else if (var7 == 1) {
                    class280.field4458[class157.field2624++] = var4;
                    var5.field1406 = class266.field4301;
                    int var8 = class248.field4058.method198(3, (byte) 0);
                    var5.method534(1, arg0 ^ 0xFFFFFF90, var8);
                    int var9 = class248.field4058.method198(1, (byte) 0);
                    if (var9 == 1) {
                        class60.field1051[class292.field4664++] = var4;
                    }
                } else if (var7 == 2) {
                    class280.field4458[class157.field2624++] = var4;
                    var5.field1406 = class266.field4301;
                    if (class248.field4058.method198(1, (byte) 0) == 1) {
                        int var11 = class248.field4058.method198(3, (byte) 0);
                        var5.method534(2, -34, var11);
                        int var12 = class248.field4058.method198(3, (byte) 0);
                        var5.method534(2, -79, var12);
                    } else {
                        int var10 = class248.field4058.method198(3, (byte) 0);
                        var5.method534(0, -33, var10);
                    }
                    int var13 = class248.field4058.method198(1, (byte) 0);
                    if (var13 == 1) {
                        class60.field1051[class292.field4664++] = var4;
                    }
                } else if (var7 == 3) {
                    class248.field4070[class61.field1071++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)V")
    public abstract void method936(int arg0, int arg1);

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)I")
    public static final int method1151(byte arg0) {
        field2817++;
        int var1 = 27 % ((32 - arg0) / 55);
        return class252.field4130.method61(37);
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)Ldk;")
    public static final class236 method1152(int arg0) {
        if (arg0 == -2) {
            field2815++;
            return class45.field638 < class237.field3908.length ? class237.field3908[class45.field638++] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(B)Lpj;")
    public abstract class98 method949(byte arg0);

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(II)[B")
    public abstract byte[] method948(int arg0, int arg1);

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1153(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2812++;
        if (arg5 > 41) {
            for (int var6 = arg2; var6 <= arg1; var6++) {
                class93.method598(-7, arg3, arg4, class167.field2735[var6], arg0);
            }
        }
    }
}
