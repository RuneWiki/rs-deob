import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class183 {

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field2976 = 0;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2980 = "Loaded update list";

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "[Lgk;")
    public static class259[] field2984 = new class259[14];

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Lbl;")
    public static class137 field2979;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method1199(int arg0) {
        if (arg0 != 15) {
            method1200(44);
        }
        field2980 = null;
        field2979 = null;
        field2984 = null;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
    public static final void method1200(int arg0) {
        field2978++;
        if (arg0 != 23947) {
            return;
        }
        if (!class96.method610(0) && class176.field2886 != class145.field2476) {
            class223.method1502(false, class273.field4378.field1486[0], arg0 ^ 0x5D8B, class59.field1031, false, class176.field2886, class273.field4378.field1464[0], class96.field1654);
        } else if (class292.field4663 != class176.field2886 && class153.method1051(18009, class176.field2886)) {
            class292.field4663 = class176.field2886;
            class184.method1211(-23839);
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)I")
    public static final int method1201(int arg0) {
        field2981++;
        if (class277.field4433) {
            return 0;
        } else if (class96.method610(0)) {
            if (arg0 <= 73) {
                method1200(-66);
            }
            return class280.field4459 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V")
    public static final void method1202(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class101.field1785 < 100) {
            class134.method930(-84);
        }
        class283.method1858(arg3, arg1, arg3 + arg4, arg1 + arg2);
        field2982++;
        if (arg0 > -50) {
            method1202(-21, 115, -19, -35, 18);
        }
        if (class101.field1785 < 100) {
            byte var5 = 20;
            int var6 = arg4 / 2 + arg3;
            int var7 = arg2 / 2 + arg1 - var5 - 18;
            class283.method1855(arg3, arg1, arg4, arg2, 0);
            class283.method1846(var6 - 152, var7, 304, 34, 9179409);
            class283.method1846(var6 - 151, var7 - -1, 302, 32, 0);
            class283.method1855(var6 - 150, var7 + 2, class101.field1785 * 3, 30, 9179409);
            class283.method1855(class101.field1785 * 3 + var6 - 150, var7 + 2, 300 - (class101.field1785 * 3), 30, 0);
            class290.field4636.method1623(class154.field2584, var6, var7 + var5, 16777215, -1);
            return;
        }
        class187.field3031 = (int) ((float) (arg4 * 2) / class116.field2077);
        class227.field3821 = (int) ((float) (arg2 * 2) / class116.field2077);
        class85.field1530 = class294.field4681 - ((int) ((float) arg4 / class116.field2077));
        class199.field3213 = class213.field3583 - ((int) ((float) arg2 / class116.field2077));
        int var8 = class294.field4681 - ((int) ((float) arg4 / class116.field2077));
        int var9 = class213.field3583 - (int) ((float) arg2 / class116.field2077);
        int var10 = (int) ((float) arg2 / class116.field2077) + class213.field3583;
        int var11 = (int) ((float) arg4 / class116.field2077) + class294.field4681;
        class152.method1043(var11, var9, arg1, arg3, var10, 42, arg3 + arg4, var8, arg1 + arg2);
        class103.method706(31, arg3, var8, var10, arg1 + arg2, arg1, class158.field2637, var11, arg3 + arg4, var9);
        class267.method1754(var8, arg1, false, arg1 + arg2, var9, arg3, var11, arg3 + arg4, var10);
        if (class196.field3161 > 0) {
            class168.field2787--;
            if (class168.field2787 == 0) {
                class168.field2787 = 20;
                class196.field3161--;
            }
        }
        if (!class105.field1886) {
            return;
        }
        int var12 = arg1 + arg2 - 8;
        int var13 = arg3 + arg4 - 5;
        class112.field2018.method1633("Fps:" + class179.field2952, var13, var12, 16776960, -1);
        int var17 = var12 - 15;
        int var14 = 16776960;
        Runtime var15 = Runtime.getRuntime();
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var14 = 16711680;
        }
        class112.field2018.method1633("Mem:" + var16 + "k", var13, var17, var14, -1);
        var12 = var17 - 15;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI[IJ)Ljava/lang/String;")
    public static final String method1203(byte arg0, int arg1, int[] arg2, long arg3) {
        field2975++;
        if (class155.field2597 != null) {
            String var5 = class155.field2597.method464(arg1, arg3, arg2, (byte) 103);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg0 != 73) {
            field2979 = null;
        }
        return Long.toString(arg3);
    }
}
