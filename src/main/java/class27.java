import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class27 {

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field327 = 0;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field323 = 1;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public int field322;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "Lsg;")
    public static class224 field329;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "Lth;")
    public static class57 field331;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Ljava/lang/String;")
    public String field325;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "[[[I")
    public static int[][][] field332;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)Z", line = 8)
    public static final boolean method170(byte arg0, int arg1) {
        field333++;
        int var2 = -57 / ((arg0 + 43) / 35);
        return arg1 == 4 || arg1 == 8;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V", line = 18)
    public static final void method171(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field326++;
        if (class35.field509 < 100) {
            class236.method1813(-17500);
        }
        if (class42.field607) {
            class244.method1871(arg4, arg1, arg0 + arg4, arg1 + arg2);
        } else {
            class246.method1889(arg4, arg1, arg4 + arg0, arg1 + arg2);
        }
        if (class35.field509 < 100) {
            byte var16 = 20;
            int var17 = arg0 / 2 + arg4;
            int var18 = arg2 / 2 + arg1 - var16 - 18;
            if (class42.field607) {
                class244.method1862(arg4, arg1, arg0, arg2, 0);
                class244.method1865(var17 - 152, var18, 304, 34, 9179409);
                class244.method1862(var17 - 150, var18 + 2, class35.field509 * 3, 30, 9179409);
            } else {
                class246.method1885(arg4, arg1, arg0, arg2, 0);
                class246.method1881(var17 - 152, var18, 304, 34, 9179409);
                class246.method1885(var17 - 150, var18 + 2, class35.field509 * 3, 30, 9179409);
            }
            class109.field1792.method1328(class347.field5524, var17, var16 + var18, 16777215, -1);
            return;
        }
        class201.field3199 = class208.field3268 - (int) ((float) arg2 / class174.field2774);
        class342.field5446 = (int) ((float) (arg0 * 2) / class174.field2774);
        class56.field915 = (int) ((float) (arg2 * 2) / class174.field2774);
        int var5 = class208.field3268 - ((int) ((float) arg2 / class174.field2774));
        class325.field5167 = class350.field5551 - ((int) ((float) arg0 / class174.field2774));
        int var6 = class350.field5551 - ((int) ((float) arg0 / class174.field2774));
        int var7 = class350.field5551 + ((int) ((float) arg0 / class174.field2774));
        int var8 = (int) ((float) arg2 / class174.field2774) + class208.field3268;
        if (class42.field607) {
            if (class11.field91 == null || class11.field91.field197 != arg0 || class11.field91.field199 != arg2) {
                class11.field91 = null;
                class11.field91 = new class351(arg0, arg2);
            }
            class246.method1894(class11.field91.field5571, arg0, arg2);
            class174.method1365(var6, var5, var7, var8, 0, 0, arg0, arg2 + 1);
            class174.method1373();
            class327 var10 = class174.method1366();
            class50.method393(var10, (byte) -128, arg1, arg4);
            class11.field91.method2482();
            class244.method1854(class11.field91.field5571, arg4, arg1, arg0, arg2);
            class246.field4036 = null;
        } else {
            class174.method1365(var6, var5, var7, var8, arg4, arg1, arg0 + arg4, arg1 + arg2 - -1);
            class174.method1373();
            class327 var9 = class174.method1366();
            class50.method393(var9, (byte) -128, 0, 0);
        }
        if (class248.field4048 > 0) {
            class226.field3727--;
            if (class226.field3727 == 0) {
                class248.field4048--;
                class226.field3727 = 20;
            }
        }
        if (arg3 <= 103 || !class16.field185) {
            return;
        }
        int var11 = arg0 + arg4 - 5;
        int var12 = arg1 + arg2 - 8;
        class343.field5466.method1324("Fps:" + class141.field2308, var11, var12, 16776960, -1);
        Runtime var13 = Runtime.getRuntime();
        int var19 = var12 - 15;
        int var14 = (int) ((var13.totalMemory() - var13.freeMemory()) / 1024L);
        int var15 = 16776960;
        if (var14 > 65536) {
            var15 = 16711680;
        }
        class343.field5466.method1324("Mem:" + var14 + "k", var11, var19, var15, -1);
        var12 = var19 - 15;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V", line = 137)
    public static final void method172(int arg0, int arg1) {
        if (arg1 >= -25) {
            field323 = -83;
        }
        field321++;
        class227.field3781.method2334(4, arg0);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 154)
    public static final void method173(byte arg0) {
        class4.field42 = 1;
        class231.field3834 = false;
        class13.field146 = 0;
        if (arg0 != -37) {
            field328 = 28;
        }
        class46.field736 = -3;
        class253.field4270 = -1;
        field324++;
        class143.field2332 = 0;
        class23.field281 = 0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 174)
    public static void method174(int arg0) {
        field331 = null;
        field332 = (int[][][]) null;
        if (arg0 != 0) {
            field327 = -109;
        }
        field329 = null;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V", line = 206)
    public static final void method175(byte arg0) {
        field330++;
        if (arg0 != 118) {
            method172(44, -98);
        }
        class101.field1658 = -1;
        class190.field3046 = null;
    }
}
