import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class37 {

    @OriginalMember(owner = "client!df", name = "g", descriptor = "Lad;")
    public static class5 field748 = new class5();

    @OriginalMember(owner = "client!df", name = "i", descriptor = "Lf;")
    public static class51 field750 = new class51(5000);

    @OriginalMember(owner = "client!df", name = "j", descriptor = "Lrf;")
    public static class163 field751 = class53.method392(108, "Untersuchen");

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Lu;")
    public static class184 field752;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILh;)V")
    public static final void method232(int arg0, class69 arg1) {
        field749++;
        int var2 = -53 % ((74 - arg0) / 51);
        if (class68.field1424 != 1) {
            return;
        }
        short var3 = 280;
        if (var3 <= class193.field3796 && var3 + 14 >= class193.field3796 && class16.field283 >= 4 && class16.field283 <= 18) {
            class93.method652(0, true, 0);
            return;
        }
        if (class193.field3796 >= var3 + 15 && var3 + 80 >= class193.field3796 && class16.field283 >= 4 && class16.field283 <= 18) {
            class93.method652(0, true, 1);
            return;
        }
        short var4 = 390;
        if (class193.field3796 >= var4 && class193.field3796 <= var4 + 14 && class16.field283 >= 4 && class16.field283 <= 18) {
            class93.method652(1, true, 0);
            return;
        }
        if (var4 + 15 <= class193.field3796 && class193.field3796 <= var4 + 80 && class16.field283 >= 4 && class16.field283 <= 18) {
            class93.method652(1, true, 1);
            return;
        }
        short var5 = 500;
        if (class193.field3796 >= var5 && var5 + 14 >= class193.field3796 && class16.field283 >= 4 && class16.field283 <= 18) {
            class93.method652(2, true, 0);
            return;
        }
        if (var5 + 15 <= class193.field3796 && var5 + 80 >= class193.field3796 && class16.field283 >= 4 && class16.field283 <= 18) {
            class93.method652(2, true, 1);
            return;
        }
        short var6 = 610;
        if (class193.field3796 >= var6 && var6 + 14 >= class193.field3796 && class16.field283 >= 4 && class16.field283 <= 18) {
            class93.method652(3, true, 0);
            return;
        }
        if (var6 + 15 <= class193.field3796 && var6 + 80 >= class193.field3796 && class16.field283 >= 4 && class16.field283 <= 18) {
            class93.method652(3, true, 1);
            return;
        }
        if (class193.field3796 >= 708 && class16.field283 >= 4 && class193.field3796 <= 758 && class16.field283 <= 20) {
            class96.field2041 = false;
            class58.field1177.method1116(0, 0);
            class190.field3775.method1116(382, 0);
            class71.field1500.method944(382 - class71.field1500.field2972 / 2, 18);
            return;
        }
        if (class142.field2910 == -1) {
            return;
        }
        class23 var7 = class25.field454[class142.field2910];
        if (class143.field2955 == var7.field406) {
            byte[] var8 = class180.method1216(new class163[] { var7.field407, class82.field1651 }, false).method1059(105);
            class108.field2254 = new String(var8, 0, var8.length);
            if (class36.field700 != 0) {
                class36.field700 = 0;
                class177.field3578 = 43594;
                class62.field1324 = 43594;
                class4.field71 = 443;
            }
            class27.field503 = var7.field400;
            class96.field2041 = false;
            class58.field1177.method1116(0, 0);
            class190.field3775.method1116(382, 0);
            class71.field1500.method944(382 - class71.field1500.field2972 / 2, 18);
            return;
        }
        class163 var9 = class180.method1216(new class163[] { class8.field178, var7.field407, class82.field1651, class36.field685, class12.field233, class34.method217(class86.field1880 ? 1 : 0, -56), class86.field1888, class34.method217(class20.field343, -101), class85.field1872, class34.method217(class140.field2877, -106) }, false);
        try {
            arg1.getAppletContext().showDocument(var9.method1030(0), "_self");
            return;
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
    public static final void method233(int arg0, int arg1, int arg2) {
        if (arg1 != -5) {
            field748 = null;
        }
        field747++;
        if (class23.field402 != arg2) {
            class189.field3772 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class189.field3772[var3] = (var3 << 12) / arg2;
            }
            class29.field542 = arg2 - 1;
            class23.field402 = arg2;
        }
        if (class205.field4008 == arg0) {
            return;
        }
        class180.field3607 = new int[arg0];
        for (int var4 = 0; var4 < arg0; var4++) {
            class180.field3607[var4] = (var4 << 12) / arg0;
        }
        class15.field260 = arg0 - 1;
        class205.field4008 = arg0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class142 var8 = new class142();
        var8.field2919 = arg2 / 128;
        var8.field2911 = arg3 / 128;
        var8.field2924 = arg4 / 128;
        var8.field2934 = arg5 / 128;
        var8.field2925 = arg1;
        var8.field2914 = arg2;
        var8.field2931 = arg3;
        var8.field2917 = arg4;
        var8.field2916 = arg5;
        var8.field2922 = arg6;
        var8.field2928 = arg7;
        class85.field1864[arg0][class85.field1863[arg0]++] = var8;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method235(int arg0) {
        field750 = null;
        field748 = null;
        if (arg0 >= -52) {
            field748 = null;
        }
        field752 = null;
        field751 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZILu;ZIII)V")
    public static final void method236(boolean arg0, int arg1, class184 arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class51.field1024 = arg5;
        field743++;
        class155.field3210 = arg2;
        if (arg3) {
            method237((byte) -117);
        }
        class29.field543 = arg6;
        class209.field4074 = arg4;
        class180.field3611 = 1;
        class155.field3211 = arg0;
        class158.field3230 = arg1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public static final void method237(byte arg0) {
        if (arg0 != 118) {
            return;
        }
        for (class168 var1 = (class168) class158.field3228.method46(16); var1 != null; var1 = (class168) class158.field3228.method53(7759444)) {
            if (class60.field1227 != var1.field3421 || var1.field3409 < class51.field1023) {
                var1.method630(45);
            } else if (var1.field3417 <= class51.field1023) {
                if (var1.field3404 > 0) {
                    class70 var2 = class187.field3723[var1.field3404 - 1];
                    if (var2 != null && var2.field716 >= 0 && var2.field716 < 13312 && var2.field679 >= 0 && var2.field679 < 13312) {
                        var1.method1139(-69, class175.method1186(var2.field716, var1.field3421, var2.field679, arg0 ^ 0x77) - var1.field3399, var2.field679, class51.field1023, var2.field716);
                    }
                }
                if (var1.field3404 < 0) {
                    int var3 = -var1.field3404 - 1;
                    class38 var4;
                    if (class200.field3962 == var3) {
                        var4 = class56.field1136;
                    } else {
                        var4 = class121.field2553[var3];
                    }
                    if (var4 != null && var4.field716 >= 0 && var4.field716 < 13312 && var4.field679 >= 0 && var4.field679 < 13312) {
                        var1.method1139(arg0 ^ 0xFFFFFFF4, class175.method1186(var4.field716, var1.field3421, var4.field679, 1) - var1.field3399, var4.field679, class51.field1023, var4.field716);
                    }
                }
                var1.method1140(125, class79.field1607);
                class144.method936(class60.field1227, (int) var1.field3412, (int) var1.field3414, (int) var1.field3423, 60, var1, var1.field3401, -1L, false);
            }
        }
        field744++;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(III)Ln;")
    public static final class122 method238(int arg0, int arg1, int arg2) {
        class111 var3 = class97.field2054[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2346;
    }
}
