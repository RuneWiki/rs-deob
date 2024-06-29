import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class110 extends class154 {

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "Lcf;")
    public static class93 field1872 = class147.method1066("<col=ffffff>", -48);

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "Z")
    public static boolean field1876 = true;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "Lhk;")
    public static class125 field1870 = new class125(0, 0);

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "[Lna;")
    public static class31[] field1880 = new class31[14];

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "Lcf;")
    public static class93 field1878 = class147.method1066(")4j", -48);

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "[I")
    public static int[] field1877 = new int[100];

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public static int field1884 = 0;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "Lhg;")
    public static class177 field1883;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "Ltg;")
    public static class181 field1879;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "Llh;")
    public static class286 field1873;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "[Lcf;")
    public static class93[] field1885;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public static void method784(int arg0) {
        field1873 = null;
        field1878 = null;
        if (arg0 != 18044) {
            method784(-115);
        }
        field1879 = null;
        field1870 = null;
        field1883 = null;
        field1880 = null;
        field1872 = null;
        field1877 = null;
        field1885 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIBII)V")
    public static final void method785(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1881++;
        class75.method507(arg4, arg0, arg1 + arg4, arg0 - -arg3);
        class75.method517(arg4, arg0, arg1, arg3, 0);
        if (class144.field2499 < 100) {
            return;
        }
        if (class216.field3934 == null || class216.field3934.field2135 != arg1 || class216.field3934.field2127 != arg3) {
            class158 var5 = new class158(arg1, arg3);
            class75.method516(var5.field2795, arg1, arg3);
            class171.method1227(arg3, arg1, (byte) -44, 0, class183.field3373, 0, 0, 0, class148.field2599);
            class216.field3934 = var5;
            class159.field2799.method1623(98);
        }
        class216.field3934.method568(arg4, arg0);
        int var6 = class133.field2331 * arg1 / class148.field2599 + arg4;
        int var7 = class70.field1268 * arg3 / class183.field3373 + arg0;
        int var8 = class29.field406 * arg1 / class148.field2599;
        int var9 = class8.field107 * arg3 / class183.field3373;
        int var10 = 16711680;
        if (class78.field1460 == 1) {
            var10 = 16777215;
        }
        if (arg2 != -29) {
            field1877 = null;
        }
        class75.method510(var6, var7, var8, var9, var10, 128);
        class75.method513(var6, var7, var8, var9, var10);
        if (class19.field258 <= 0) {
            return;
        }
        int var11;
        if (class48.field780 > 10) {
            var11 = (20 - class48.field780) * 25;
        } else {
            var11 = class48.field780 * 25;
        }
        for (class163 var12 = (class163) class5.field63.method1151(110); var12 != null; var12 = (class163) class5.field63.method1159(arg2 ^ 0xFFFFFFB7)) {
            if (class90.field1617 == var12.field2883) {
                int var13 = arg0 + (var12.field2877 * arg3 / class183.field3373);
                int var14 = var12.field2880 * arg1 / class148.field2599 + arg4;
                class75.method510(var14 - 2, var13 + -2, 4, 4, 16776960, var11);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZLcf;I)V")
    public static final void method786(boolean arg0, class93 arg1, int arg2) {
        short[] var3 = new short[16];
        field1874++;
        int var4 = 0;
        class93 var5 = arg1.method663(121);
        for (int var6 = 0; var6 < class186.field3435; var6++) {
            class29 var9 = class89.method617(var6, 0);
            if ((!arg0 || var9.field413) && var9.field427 == -1 && var9.field382 == -1 && var9.field381 == 0 && var9.field357.method663(-16).method652(var5, 9) != -1) {
                if (var4 >= 250) {
                    class230.field4122 = null;
                    class254.field4596 = -1;
                    return;
                }
                if (var4 >= var3.length) {
                    short[] var10 = new short[var3.length * 2];
                    for (int var11 = 0; var11 < var4; var11++) {
                        var10[var11] = var3[var11];
                    }
                    var3 = var10;
                }
                var3[var4++] = (short) var6;
            }
        }
        if (arg2 < 110) {
            method785(-103, -10, (byte) -39, 61, -107);
        }
        class254.field4596 = var4;
        client.field2720 = 0;
        class93[] var7 = new class93[class254.field4596];
        class230.field4122 = var3;
        for (int var8 = 0; var8 < class254.field4596; var8++) {
            var7[var8] = class89.method617(var3[var8], 0).field357;
        }
        class78.method538(-65, class230.field4122, var7);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
    public static final void method787(int arg0) {
        class82.field1513 = 0;
        class224.field4038 = false;
        class68.field1239 = 1;
        field1871++;
        class242.field4371 = -3;
        class153.field2689 = 0;
        class250.field4501 = arg0;
        class283.field5081 = 0;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V")
    public static final void method788(byte arg0) {
        field1875++;
        int var1 = 87 % ((arg0 + 49) / 37);
        class57.field945.method979((byte) -104);
        for (int var2 = 0; var2 < 32; var2++) {
            class94.field1706[var2] = 0L;
        }
        for (int var3 = 0; var3 < 32; var3++) {
            class124.field2205[var3] = 0L;
        }
        class93.field1655 = 0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLee;)Loj;")
    public static final class159 method789(byte arg0, class280 arg1) {
        int var2 = -76 / ((-arg0 - 67) / 47);
        field1886++;
        return new class159(arg1.method1914((byte) 100), arg1.method1914((byte) 55), arg1.method1914((byte) 100), arg1.method1914((byte) 88), arg1.method1893((byte) 32), arg1.method1893((byte) 107), arg1.method1907(16832));
    }
}
