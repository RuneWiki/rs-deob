import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class98 extends class89 {

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "Z")
    public boolean field1827 = false;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "[I")
    public static int[] field1833 = new int[1000];

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "Led;")
    public static class48 field1828 = new class48();

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
    public static int field1838 = 0;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "Lqe;")
    private static class179 field1841 = class206.method1380("Please try again)3", (byte) -128);

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
    public static int field1840 = 0;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public static int field1837 = 3353893;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "Lqe;")
    public static class179 field1842 = field1841;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "Lqe;")
    private static class179 field1839 = class206.method1380("Press (Wchange your password(W on front page)3", (byte) -127);

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "Lqe;")
    public static class179 field1843 = field1839;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public int field1829;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public int field1831;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "Lcd;")
    public static class26 field1836;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Lmh;")
    public static final class138 method625(int arg0, int arg1) {
        class138 var2 = (class138) class218.field4035.method1299((byte) -128, (long) arg1);
        field1834++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class237.field4380.method342(0, arg1, (byte) 98);
        if (var3 == null) {
            return null;
        }
        class138 var4 = new class138();
        class185 var5 = new class185(var3);
        var5.field3432 = var5.field3397.length - 2;
        int var6 = var5.method1252(2);
        int var7 = var5.field3397.length - var6 - 2 - 12;
        var5.field3432 = var7;
        int var8 = var5.method1231(-4898);
        var4.field2544 = var5.method1252(arg0 + 2);
        var4.field2552 = var5.method1252(2);
        var4.field2540 = var5.method1252(arg0 ^ 0x2);
        var4.field2549 = var5.method1252(2);
        int var9 = var5.method1243(3);
        if (var9 > 0) {
            var4.field2554 = new class144[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1252(2);
                class144 var12 = new class144(class125.method789(arg0 - 122, var11));
                var4.field2554[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method1231(-4898);
                    int var14 = var5.method1231(-4898);
                    var12.method914((long) var13, new class43(var14), true);
                }
            }
        }
        var5.field3432 = 0;
        var4.field2542 = var5.method1219(arg0);
        var4.field2555 = new int[var8];
        int var15 = arg0;
        var4.field2553 = new int[var8];
        var4.field2545 = new class179[var8];
        while (var5.field3432 < var7) {
            int var16 = var5.method1252(2);
            if (var16 == 3) {
                var4.field2545[var15] = var5.method1242(class171.method1087(arg0, -116));
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field2553[var15] = var5.method1243(3);
            } else {
                var4.field2553[var15] = var5.method1231(-4898);
            }
            var4.field2555[var15++] = var16;
        }
        class218.field4035.method1303(var4, (long) arg1, (byte) 116);
        return var4;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)V")
    public static final void method626(byte arg0) {
        if (arg0 == -26) {
            class220.field4073.method1297((byte) 89);
            field1832++;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public static final void method627(int arg0) {
        field1835++;
        for (class32 var1 = (class32) class94.field1767.method242(arg0 + 16724993); var1 != null; var1 = (class32) class94.field1767.method237(10)) {
            class44 var2 = var1.field692;
            if (class49.field1038 != var2.field969 || var2.field945 < class13.field322) {
                var1.method592((byte) -128);
            } else if (class13.field322 >= var2.field984) {
                if (var2.field965 > 0) {
                    class188 var3 = class53.field1152[var2.field965 - 1];
                    if (var3 != null && var3.field3159 >= 0 && var3.field3159 < 13312 && var3.field3198 >= 0 && var3.field3198 < 13312) {
                        var2.method293(class13.field322, var3.field3159, 1, var3.field3198, class202.method1341(arg0 + 13432, var3.field3159, var2.field969, var3.field3198) - var2.field949);
                    }
                }
                if (var2.field965 < 0) {
                    int var4 = -var2.field965 - 1;
                    class115 var5;
                    if (class159.field2871 == var4) {
                        var5 = class61.field1298;
                    } else {
                        var5 = class23.field554[var4];
                    }
                    if (var5 != null && var5.field3159 >= 0 && var5.field3159 < 13312 && var5.field3198 >= 0 && var5.field3198 < 13312) {
                        var2.method293(class13.field322, var5.field3159, arg0 ^ 0xFFFFCBFE, var5.field3198, class202.method1341(arg0 ^ 0x3444, var5.field3159, var2.field969, var5.field3198) - var2.field949);
                    }
                }
                var2.method288(class66.field1342, (byte) 110);
                class113.method728(class49.field1038, (int) var2.field960, (int) var2.field979, (int) var2.field959, 60, var2, var2.field974, -1L, false);
            }
        }
        if (arg0 != -13313) {
            method625(123, 12);
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
    public static void method628(int arg0) {
        field1841 = null;
        field1833 = null;
        if (arg0 != -13313) {
            field1828 = null;
        }
        field1843 = null;
        field1836 = null;
        field1828 = null;
        field1839 = null;
        field1842 = null;
    }
}
