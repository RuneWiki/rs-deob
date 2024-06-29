import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class183 {

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2924 = "flash3:";

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2925 = null;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "Z")
    public static boolean field2928 = true;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2929 = "glow1:";

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "[Ljg;")
    public static class271[] field2930;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static final void method1254(byte arg0) {
        class166.field2709.method1234(8);
        if (arg0 > -114) {
            method1254((byte) -54);
        }
        int var1 = class166.field2709.method1239(-91, 8);
        if (class251.field4027 > var1) {
            for (int var2 = var1; var2 < class251.field4027; var2++) {
                class227.field3597[class57.field804++] = class134.field2250[var2];
            }
        }
        field2926++;
        if (var1 > class251.field4027) {
            throw new RuntimeException("gnpov1");
        }
        class251.field4027 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class134.field2250[var3];
            class275 var5 = class198.field3193[var4];
            int var6 = class166.field2709.method1239(116, 1);
            if (var6 == 0) {
                class134.field2250[class251.field4027++] = var4;
                var5.field656 = class9.field141;
            } else {
                int var7 = class166.field2709.method1239(102, 2);
                if (var7 == 0) {
                    class134.field2250[class251.field4027++] = var4;
                    var5.field656 = class9.field141;
                    class28.field335[class61.field834++] = var4;
                } else if (var7 == 1) {
                    class134.field2250[class251.field4027++] = var4;
                    var5.field656 = class9.field141;
                    int var8 = class166.field2709.method1239(-2, 3);
                    var5.method380(1, -111, var8);
                    int var9 = class166.field2709.method1239(-16, 1);
                    if (var9 == 1) {
                        class28.field335[class61.field834++] = var4;
                    }
                } else if (var7 == 2) {
                    class134.field2250[class251.field4027++] = var4;
                    var5.field656 = class9.field141;
                    if (class166.field2709.method1239(-70, 1) == 1) {
                        int var11 = class166.field2709.method1239(113, 3);
                        var5.method380(2, -63, var11);
                        int var12 = class166.field2709.method1239(110, 3);
                        var5.method380(2, -70, var12);
                    } else {
                        int var10 = class166.field2709.method1239(123, 3);
                        var5.method380(0, -64, var10);
                    }
                    int var13 = class166.field2709.method1239(-125, 1);
                    if (var13 == 1) {
                        class28.field335[class61.field834++] = var4;
                    }
                } else if (var7 == 3) {
                    class227.field3597[class57.field804++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method1255(int arg0) {
        field2924 = null;
        field2925 = null;
        field2930 = null;
        if (arg0 != 23469) {
            method1257(-98, 3);
        }
        field2929 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lli;IIIII)V")
    public static final void method1256(class197 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class269.field4361 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class236.field3769) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class77.field1061 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class99 var14 = class273.field4415[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class229.field3641[var11][var12 + 1][var13] + class229.field3641[var11][var12][var13] + class229.field3641[var11][var12][var13 + 1] + class229.field3641[var11][var12 + 1][var13 + 1]) / 4 - (class229.field3641[arg1][arg2 + 1][arg3] + class229.field3641[arg1][arg2][arg3] + class229.field3641[arg1][arg2][arg3 + 1] + class229.field3641[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class233 var16 = var14.field1502;
                                    if (var16 != null) {
                                        if (var16.field3709.method1092()) {
                                            arg0.method1069(var16.field3709, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3716 != null && var16.field3716.method1092()) {
                                            arg0.method1069(var16.field3716, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field1503; var17++) {
                                        class138 var18 = var14.field1496[var17];
                                        if (var18 != null && var18.field2291.method1092() && (var18.field2272 == var12 || var7 == var12) && (var18.field2284 == var13 || var9 == var13)) {
                                            int var19 = var18.field2289 + 1 - var18.field2272;
                                            int var20 = var18.field2285 + 1 - var18.field2284;
                                            arg0.method1069(var18.field2291, (var18.field2272 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field2284 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
    public static final void method1257(int arg0, int arg1) {
        field2923++;
        if (arg1 == -1 || !class280.method1870(125, arg1)) {
            return;
        }
        class103[] var2 = class133.field2204[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class103 var4 = var2[var3];
            if (var4.field1634 != null) {
                class173 var5 = new class173();
                var5.field2798 = var4.field1634;
                var5.field2796 = var4;
                class152.method1029(2000000, 38, var5);
            }
        }
        if (arg0 != 1) {
            field2930 = null;
        }
    }
}
