import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class110 {

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Lsg;")
    private static class169 field2003 = class165.method1060("Sep", 1536);

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "Lsg;")
    public static class169 field2007 = null;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Lsg;")
    private static class169 field2002 = class165.method1060("Feb", 1536);

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Lsg;")
    public static class169 field2010 = class165.method1060("Bitte geben Sie Ihren Benutzenamen ein)3", 1536);

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "[Ldc;")
    public static class32[] field2005 = new class32[50];

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "Lsg;")
    private static class169 field2015 = class165.method1060("Aug", 1536);

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "Lsg;")
    private static class169 field2020 = class165.method1060("Jan", 1536);

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "[S")
    public static short[] field2014 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "Lsg;")
    private static class169 field2006 = class165.method1060("Mar", 1536);

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "Lsg;")
    private static class169 field2016 = class165.method1060("Jun", 1536);

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "Lsg;")
    public static class169 field2011 = class165.method1060("p12_full", 1536);

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "Lsg;")
    private static class169 field2023 = class165.method1060("May", 1536);

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "Lsg;")
    public static class169 field2022 = class165.method1060("titlebutton", 1536);

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Lsg;")
    private static class169 field2012 = class165.method1060("Nov", 1536);

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "Lsg;")
    private static class169 field2021 = class165.method1060("Oct", 1536);

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "Lsg;")
    private static class169 field2008 = class165.method1060("Dec", 1536);

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "Lsg;")
    public static class169 field2018 = class165.method1060("Der Anmelde)2Server ist offline)3", 1536);

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Lsg;")
    private static class169 field2017 = class165.method1060("Apr", 1536);

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "Lsg;")
    private static class169 field2025 = class165.method1060("Jul", 1536);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "[Lsg;")
    public static class169[] field2001 = new class169[] { field2020, field2002, field2006, field2017, field2023, field2016, field2025, field2015, field2003, field2021, field2012, field2008 };

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Lg;")
    public static final class56 method681(int arg0, int arg1) {
        field2019++;
        class56 var2 = (class56) class95.field1813.method1206((long) arg1, -24742);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class19.field417.method552(arg1, 4, 0);
        class56 var4 = new class56();
        if (var3 != null) {
            var4.method352(-49, new class127(var3), arg1);
        }
        var4.method355(-32460);
        class95.field1813.method1208((long) arg1, 77, var4);
        return arg0 < 110 ? null : var4;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZIILbg;II)V")
    public static final void method682(boolean arg0, int arg1, int arg2, class18 arg3, int arg4, int arg5) {
        field2009++;
        if (!arg0) {
            field2001 = null;
        }
        int var6 = arg4 * arg4 + arg1 * arg1;
        if (var6 <= 4225 || var6 >= 90000) {
            class68.method427(arg4, arg3, arg5, arg2, arg1, (byte) -105);
            return;
        }
        int var7 = class29.field600 + class182.field3546 & 0x7FF;
        int var8 = class12.field283[var7];
        int var9 = class12.field279[var7];
        int var10 = var9 * 256 / (class148.field2744 + 256);
        int var11 = var8 * 256 / (class148.field2744 + 256);
        int var12 = arg1 * var10 + arg4 * var11 >> 16;
        int var13 = arg1 * var11 - arg4 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        class62.field1149.method134(var16 + arg5 + 94 + 4 - 10, -var17 + arg2 - -83 + -20, 20, 20, 15, 15, var14, 256);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public static void method683(int arg0) {
        field2007 = null;
        field2022 = null;
        field2015 = null;
        field2002 = null;
        field2018 = null;
        field2012 = null;
        field2021 = null;
        field2023 = null;
        field2001 = null;
        field2008 = null;
        if (arg0 > -2) {
            method681(102, 0);
        }
        field2016 = null;
        field2005 = null;
        field2011 = null;
        field2006 = null;
        field2017 = null;
        field2014 = null;
        field2025 = null;
        field2020 = null;
        field2003 = null;
        field2010 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIB)V")
    public static final void method684(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -58) {
            field2017 = null;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class139.field2588[arg1][arg2 + var4][arg0 + var7] = 0;
            }
        }
        if (arg2 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class139.field2588[arg1][arg2][arg0 + var5] = class139.field2588[arg1][arg2 - 1][arg0 + var5];
            }
        }
        if (arg0 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class139.field2588[arg1][arg2 + var6][arg0] = class139.field2588[arg1][arg2 + var6][arg0 - 1];
            }
        }
        field2013++;
        if (arg2 > 0 && class139.field2588[arg1][arg2 - 1][arg0] != 0) {
            class139.field2588[arg1][arg2][arg0] = class139.field2588[arg1][arg2 - 1][arg0];
        } else if (arg0 > 0 && class139.field2588[arg1][arg2][arg0 - 1] != 0) {
            class139.field2588[arg1][arg2][arg0] = class139.field2588[arg1][arg2][arg0 - 1];
        } else if (arg2 > 0 && arg0 > 0 && class139.field2588[arg1][arg2 - 1][arg0 - 1] != 0) {
            class139.field2588[arg1][arg2][arg0] = class139.field2588[arg1][arg2 - 1][arg0 - 1];
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lhg;Lhg;I)V")
    public static final void method685(class71 arg0, class71 arg1, int arg2) {
        field2004++;
        if (class54.field996) {
            class92.method540(arg0, true, arg1);
            return;
        }
        if (class111.field2031 == 0 || class111.field2031 == 5) {
            byte var3 = 20;
            arg1.method717(class123.field2263, 382, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class130.method857(230, var4, 304, 34, 9179409);
            class130.method857(231, var4 + 1, 302, 32, 0);
            class130.method850(232, var4 + 2, class55.field1006 * 3, 30, 9179409);
            class130.method850(class55.field1006 * 3 + 232, var4 + 2, 300 - class55.field1006 * 3, 30, 0);
            arg1.method717(class43.field811, 382, 276 - var3, 16777215, -1);
        }
        if (class111.field2031 == 20) {
            short var5 = 211;
            class129.field2407.method370(382 - class129.field2407.field1105 / 2, -(class129.field2407.field1103 / 2) + 271);
            arg1.method717(class43.field810, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg1.method717(class43.field800, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg1.method717(class43.field804, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg1.method718(class165.method1058(0, new class169[] { class48.field872, class117.method739(class43.field807) }), 272, var26, 16777215, 0);
            int var27 = var26 + 15;
            arg1.method718(class165.method1058(arg2 ^ 0x2350, new class169[] { class85.field1557, class43.field806.method1129(true) }), 274, var27, 16777215, 0);
            int var28 = var27 + 15;
        }
        if (class111.field2031 == 10) {
            class129.field2407.method370(202, 171);
            if (class26.field547 == 0) {
                short var15 = 251;
                arg1.method717(class171.field3304, 382, var15, 16776960, 0);
                short var16 = 302;
                int var35 = var15 + 30;
                short var17 = 291;
                class136.field2537.method370(var16 - 73, var17 + -20);
                arg1.method732(class57.field1066, var16 - 73, var17 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                short var18 = 462;
                class136.field2537.method370(var18 - 73, var17 + -20);
                arg1.method732(class44.field822, var18 - 73, var17 + -20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class26.field547 == 2) {
                short var9 = 321;
                short var10 = 302;
                short var11 = 211;
                arg1.method717(class43.field810, 382, var11, 16776960, 0);
                int var33 = var11 + 15;
                arg1.method717(class43.field800, 382, var33, 16776960, 0);
                int var34 = var33 + 15;
                arg1.method717(class43.field804, 382, var34, 16776960, 0);
                boolean var12;
                if (class9.field247 == 0 && class162.field3107 % 40 < 20 && class45.field839) {
                    var12 = true;
                } else {
                    var12 = false;
                }
                var33 = var34 + 15;
                var33 += 10;
                arg1.method718(class165.method1058(0, new class169[] { class48.field872, class117.method739(class43.field807), var12 ? class27.field558 : class43.field814 }), 272, var33, 16777215, 0);
                boolean var13;
                if (class9.field247 == 1 && class162.field3107 % 40 < 20 && class45.field839) {
                    var13 = true;
                } else {
                    var13 = false;
                }
                var33 += 15;
                arg1.method718(class165.method1058(0, new class169[] { class85.field1557, class43.field806.method1129(true), var13 ? class27.field558 : class43.field814 }), 274, var33, 16777215, 0);
                var33 += 15;
                class136.field2537.method370(var10 - 73, var9 + -20);
                arg1.method717(class180.field3520, var10, var9 + 5, 16777215, 0);
                short var14 = 462;
                class136.field2537.method370(var14 - 73, var9 + -20);
                arg1.method717(class206.field4035, var14, var9 + 5, 16777215, 0);
            } else if (class26.field547 == 3) {
                arg1.method717(class131.field2436, 382, 211, 16776960, 0);
                short var6 = 382;
                short var7 = 321;
                short var8 = 236;
                arg1.method717(class148.field2716, 382, var8, 16777215, 0);
                int var29 = var8 + 15;
                arg1.method717(class196.field3855, 382, var29, 16777215, 0);
                int var30 = var29 + 15;
                arg1.method717(class55.field1013, 382, var30, 16777215, 0);
                int var31 = var30 + 15;
                arg1.method717(class5.field110, 382, var31, 16777215, 0);
                int var32 = var31 + 15;
                class136.field2537.method370(var6 - 73, var7 + -20);
                arg1.method717(class206.field4035, var6, var7 + 5, 16777215, 0);
            }
        }
        if (arg2 != 9040) {
            return;
        }
        if (class199.field3899 != 1) {
            if (class27.field560 > 0) {
                class5.method32(arg2 - 9113, class27.field560);
                class27.field560 = 0;
            }
            class129.method835(true);
        }
        class206.field4036[class105.field1934 ? 1 : 0].method370(725, 463);
        if (class111.field2031 <= 5 || class187.field3640 == 2 || class154.field2976 != 0) {
            return;
        }
        if (class136.field2539 == null) {
            class136.field2539 = class204.method1324(class7.field201, 108, class104.field1907, class43.field814);
            return;
        }
        byte var19 = 5;
        short var20 = 463;
        class136.field2539.method370(var19, var20);
        byte var21 = 100;
        byte var22 = 35;
        arg1.method717(class165.method1058(arg2 - 9040, new class169[] { class189.field3717, class96.field1819, class2.method18((byte) -62, class80.field1482) }), var21 / 2 + var19, var22 / 2 + -2 + var20, 16777215, 0);
        if (class25.field524 == null) {
            arg0.method717(class61.field1128, var21 / 2 + var19, var20 + 12 - -(var22 / 2), 16777215, 0);
        } else {
            arg0.method717(class55.field1000, var19 + var21 / 2, var22 / 2 + 12 + var20, 16777215, 0);
        }
    }
}
