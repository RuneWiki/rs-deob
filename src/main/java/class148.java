import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class148 extends class179 {

    @OriginalMember(owner = "client!ll", name = "T", descriptor = "I")
    private int field2593 = 0;

    @OriginalMember(owner = "client!ll", name = "fb", descriptor = "I")
    private int field2605 = 4096;

    @OriginalMember(owner = "client!ll", name = "Z", descriptor = "I")
    private int field2599 = 16;

    @OriginalMember(owner = "client!ll", name = "ib", descriptor = "I")
    private int field2608 = 2000;

    @OriginalMember(owner = "client!ll", name = "kb", descriptor = "I")
    private int field2610 = 0;

    @OriginalMember(owner = "client!ll", name = "W", descriptor = "Lke;")
    public static class256 field2596 = class316.method2202("rouge:", 27626);

    @OriginalMember(owner = "client!ll", name = "Q", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!ll", name = "R", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!ll", name = "S", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!ll", name = "U", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!ll", name = "V", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!ll", name = "Y", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!ll", name = "ab", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ll", name = "bb", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!ll", name = "cb", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!ll", name = "eb", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!ll", name = "gb", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!ll", name = "hb", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!ll", name = "jb", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!ll", name = "db", descriptor = "Lng;")
    public static class138 field2603;

    @OriginalMember(owner = "client!ll", name = "X", descriptor = "[I")
    public static int[] field2597;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lff;I)[Lob;", line = 5)
    public static final class317[] method1076(class4 arg0, int arg1) {
        field2592++;
        if (!arg0.method19(arg1 ^ 0xBCF4D0F9)) {
            return new class317[0];
        } else if (arg1 == -1124806526) {
            class82 var2 = arg0.method18(0);
            while (var2.field1500 == 0) {
                class46.method381(10L, arg1 ^ 0x430B2F22);
            }
            if (var2.field1500 == 2) {
                return new class317[0];
            }
            int[] var3 = (int[]) ((int[]) var2.field1499);
            class317[] var4 = new class317[var3.length >> 2];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class317 var6 = new class317();
                var4[var5] = var6;
                var6.field5462 = var3[var5 << 2];
                var6.field5465 = var3[(var5 << 2) + 1];
                var6.field5457 = var3[(var5 << 2) + 2];
                var6.field5464 = var3[(var5 << 2) + 3];
            }
            return var4;
        } else {
            return (class317[]) null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILra;I)V", line = 50)
    public final void method54(int arg0, class41 arg1, int arg2) {
        if (arg0 < 108) {
            field2597 = (int[]) null;
        }
        if (arg2 == 0) {
            this.field2610 = arg1.method357(false);
        } else if (arg2 == 1) {
            this.field2608 = arg1.method346(-16);
        } else if (arg2 == 2) {
            this.field2599 = arg1.method357(false);
        } else if (arg2 == 3) {
            this.field2593 = arg1.method346(-16);
        } else if (arg2 == 4) {
            this.field2605 = arg1.method346(-16);
        }
        field2606++;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)V", line = 113)
    public static void method1077(byte arg0) {
        field2597 = null;
        field2596 = null;
        if (arg0 != -125) {
            field2603 = (class138) null;
        }
        field2603 = null;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V", line = 151)
    public class148() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIII)V", line = 132)
    public static final void method1078(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class171 var7 = new class171();
        var7.field3032 = arg1 / 128;
        var7.field3038 = arg2 / 128;
        var7.field3034 = arg3 / 128;
        var7.field3042 = arg4 / 128;
        var7.field3035 = arg0;
        var7.field3030 = arg1;
        var7.field3039 = arg2;
        var7.field3049 = arg3;
        var7.field3047 = arg4;
        var7.field3040 = arg5;
        var7.field3031 = arg6;
        class143.field2502[class112.field1955++] = var7;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILke;)V", line = 169)
    public static final void method1079(int arg0, class256 arg1) {
        field2604++;
        if (class106.field1896 >= 2) {
            if (arg1.method1769(class28.field385, (byte) 93)) {
                class159.method1181(0);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class274.method1895(0, 22156, (class256) null, class30.method214(new class256[] { class96.field1712, class305.method2125((byte) 127, var4), class90.field1654 }, 29784));
            }
            if (arg1.method1769(class8.field132, (byte) 60)) {
                class159.method1181(arg0 ^ 0x3);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class274.method1895(0, 22156, (class256) null, class30.method214(new class256[] { class62.field1104, class305.method2125((byte) 67, var7), class90.field1654 }, 29784));
                class215.method1507(7300);
                class159.method1181(0);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class274.method1895(0, 22156, (class256) null, class30.method214(new class256[] { class279.field4866, class305.method2125((byte) 70, var9), class90.field1654 }, 29784));
            }
            if (arg1.method1769(class229.field3925, (byte) 88)) {
                class274.method1895(0, 22156, (class256) null, class30.method214(new class256[] { class288.field4983, class305.method2125((byte) 45, class204.method1447(true)) }, 29784));
            }
            if (class253.field4323 && arg1.method1769(class49.field898, (byte) 109)) {
                System.out.println("oncard_geometry:" + class221.field3872);
                System.out.println("oncard_2d:" + class221.field3867);
                System.out.println("oncard_texture:" + class221.field3869);
            }
            if (arg1.method1769(class75.field1427, (byte) 72)) {
                class84.method617((byte) -14);
            }
            if (arg1.method1769(class286.field4966, (byte) 78)) {
                class201.field3665.method879(-128);
            }
            if (arg1.method1769(class183.field3233, (byte) 72)) {
                class201.field3665.method871(-2);
            }
            if (arg1.method1769(class9.field146, (byte) 119)) {
                class272.field4658.method26(5000);
                class196.field3586.method1626(-472090175);
                class201.field3665.method880(-2112591184);
            }
            if (arg1.method1769(class188.field3348, (byte) 31)) {
                class277.field4765 = true;
            }
            if (arg1.method1769(class198.field3618, (byte) 49)) {
                class11.method67((byte) 74, 25);
            }
            if (arg1.method1769(class62.field1099, (byte) 48)) {
                class40.field728 = true;
            }
            if (arg1.method1769(class256.field4382, (byte) 83)) {
                class40.field728 = false;
            }
            if (arg1.method1769(class152.field2726, (byte) 114)) {
                class248.method1671(-1, false, 0, -1, true);
            }
            if (arg1.method1769(class139.field2447, (byte) 69)) {
                class248.method1671(-1, false, 1, -1, true);
            }
            if (arg1.method1769(class278.field4819, (byte) 71)) {
                class248.method1671(-1, false, 2, -1, true);
            }
            if (arg1.method1769(class5.field85, (byte) 31)) {
                class248.method1671(1024, false, 3, 768, true);
            }
            if (arg1.method1769(class79.field1471, (byte) 86)) {
                for (int var10 = 0; var10 < 4; var10++) {
                    for (int var11 = 1; var11 < 103; var11++) {
                        for (int var12 = 1; var12 < 103; var12++) {
                            class124.field2201[var10].field653[var11][var12] = 0;
                        }
                    }
                }
            }
            if (arg1.method1767((byte) -33, class135.field2349)) {
                class283.method1979(arg1.method1788(25610, 15).method1770(0));
                class183.method1337(false, class272.field4658);
                class17.field245 = false;
            }
            if (arg1.method1767((byte) -62, class100.field1784) && class40.field724 != 0) {
                class244.method1644(arg1.method1788(25610, 6).method1770(0), true);
            }
            if (arg1.method1769(class237.field4047, (byte) 81) && class40.field724 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method1767((byte) -93, class284.field4930)) {
                class255.field4369 = arg1.method1788(25610, 12).method1768(false).method1770(0);
                class274.method1895(0, 22156, (class256) null, class30.method214(new class256[] { class272.field4655, class305.method2125((byte) 30, class255.field4369) }, 29784));
            }
            if (arg1.method1769(class251.field4268, (byte) 49)) {
                class37.field654 = true;
            }
            if (arg1.method1769(class285.field4955, (byte) 93)) {
                if (class302.field5230) {
                    class141.field2473.method1797(-126);
                    class302.field5230 = false;
                } else {
                    class248.field4229.method1797(arg0 - 126);
                    class302.field5230 = true;
                }
            }
        }
        class308.field5322.method1599(243, (byte) -89);
        class307.field5285++;
        class308.field5322.method308(arg1.method1799(127) - 1, -2);
        class308.field5322.method361(arg1.method1788(25610, 2), arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)V", line = 374)
    public static final void method1080(boolean arg0) {
        class72.field1316 = null;
        if (arg0) {
            class296.method2068();
            field2602++;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)[I", line = 386)
    public final int[] method41(int arg0, int arg1) {
        if (arg1 != -31598) {
            return (int[]) null;
        }
        field2598++;
        int[] var3 = this.field3157.method1258(-121, arg0);
        if (this.field3157.field3081) {
            int var4 = this.field2605 >> 1;
            int[][] var5 = this.field3157.method1257(true);
            Random var6 = new Random((long) this.field2610);
            for (int var7 = 0; var7 < this.field2608; var7++) {
                int var8 = this.field2605 <= 0 ? this.field2593 : this.field2593 - (var4 - class64.method494(this.field2605, arg1 ^ 0xFFFF8492, var6));
                int var9 = (var8 & 0xFF5) >> 4;
                int var10 = class64.method494(class161.field2858, 0, var6);
                int var11 = class64.method494(class38.field697, 0, var6);
                int var12 = (class104.field1856[var9] * this.field2599 >> 12) + var11;
                int var13 = var12 - var11;
                int var14 = (class321.field5494[var9] * this.field2599 >> 12) + var10;
                int var15 = var14 - var10;
                if (var15 != 0 || var13 != 0) {
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 < var13;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        var11 = var17;
                        int var18 = var14;
                        var14 = var12;
                        var12 = var18;
                    }
                    if (var14 < var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var14;
                        var14 = var19;
                        var11 = var12;
                        var12 = var20;
                    }
                    int var21 = var11;
                    int var22 = var14 - var10;
                    int var23 = var12 - var11;
                    int var24 = -var22 / 2;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var25 = 1024 - (class64.method494(4096, 0, var6) >> 2);
                    int var26 = 2048 / var22;
                    int var27 = var12 > var11 ? 1 : -1;
                    for (int var28 = var10; var28 < var14; var28++) {
                        var24 += var23;
                        int var29 = class19.field255 & var21;
                        if (var24 > 0) {
                            var21 -= -var27;
                            var24 += -var22;
                        }
                        int var30 = (var28 - var10) * var26 + var25 + 1024;
                        int var31 = var28 & class285.field4945;
                        if (var16) {
                            var5[var29][var31] = var30;
                        } else {
                            var5[var31][var29] = var30;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BI)V", line = 524)
    public static final void method1081(byte arg0, int arg1) {
        short var2 = 256;
        if (arg0 < 82) {
            return;
        }
        if (arg1 > var2) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class153.field2728 += arg1 * 128;
        field2607++;
        if (class83.field1513.length < class153.field2728) {
            class153.field2728 -= class83.field1513.length;
            int var3 = (int) (Math.random() * 12.0D);
            class302.method2116((byte) 56, class66.field1182[var3]);
        }
        int var4 = arg1 * 128;
        int var5 = 0;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class313.field5392[var4 + var5] - (class83.field1513[class83.field1513.length - 1 & var5 - -class153.field2728] * arg1 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class313.field5392[var5++] = var8;
        }
        for (int var9 = var2 - arg1; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class313.field5392[var11 + var10] = 255;
                } else {
                    class313.field5392[var11 + var10] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < (var2 - arg1); var13++) {
            class207.field3751[var13] = class207.field3751[var13 + arg1];
        }
        for (int var14 = var2 - arg1; var14 < var2; var14++) {
            class207.field3751[var14] = (int) (Math.sin((double) class166.field2941 / 14.0D) * 16.0D + Math.sin((double) class166.field2941 / 15.0D) * 14.0D + Math.sin((double) class166.field2941 / 16.0D) * 12.0D);
            class166.field2941++;
        }
        int var15 = ((class45.field840 & 0x1) + arg1) / 2;
        class230.field3940 += arg1;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class230.field3940; var16++) {
            int var17 = (int) (Math.random() * 128.0D) + 128;
            int var18 = (int) (Math.random() * 124.0D) + 2;
            class313.field5392[(var17 << 7) + var18] = 192;
        }
        class230.field3940 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = var19 * 128;
            int var21 = 0;
            for (int var22 = -var15; var22 < 128; var22++) {
                if ((var15 + var22) < 128) {
                    var21 += class313.field5392[var20 + var15 + var22];
                }
                if (var22 - var15 - 1 >= 0) {
                    var21 -= class313.field5392[-(var15 - var20 - var22) - 1];
                }
                if (var22 >= 0) {
                    class144.field2527[var22 + var20] = var21 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var2) {
                    var24 += class144.field2527[var15 * 128 + var23 + var26];
                }
                if (var25 - var15 - 1 >= 0) {
                    var24 -= class144.field2527[var23 + var26 - (var15 - -1) * 128];
                }
                if (var25 >= 0) {
                    class313.field5392[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V", line = 697)
    public final void method418(byte arg0) {
        if (arg0 == -110) {
            field2590++;
            class118.method803((byte) -87);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZI)V", line = 708)
    public static final void method1082(boolean arg0, int arg1) {
        if (arg0 && class231.field3950 != null) {
            class199.field3634 = class231.field3950.field506;
        } else {
            class199.field3634 = null;
        }
        field2591++;
        class185.field3260 = (byte[][][]) null;
        class100.field1774 = null;
        class126.field2242 = (byte[][][]) null;
        class80.field1492 = (short[][][]) null;
        class50.field908 = 0;
        class254.field4354 = (int[][][]) null;
        class231.field3950 = null;
        class37.field651 = (byte[][][]) null;
        class305.field5269 = (int[][][]) null;
        class196.field3591 = (byte[][][]) null;
        if (arg1 < 9) {
            return;
        }
        class313.field5396 = (byte[][][]) null;
        class163.field2898 = null;
        class247.field4211.method1275((byte) -53);
        class279.field4867 = null;
        class52.field953 = null;
        class215.field3838 = null;
        class156.field2774 = null;
        class71.field1308 = null;
        class269.field4584 = null;
        class290.field5028 = null;
        class37.field661 = null;
        class161.field2871 = null;
        class91.field1665 = -1;
        class185.field3257 = -1;
        class246.field4199 = null;
        class301.field5189 = null;
    }

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "(I)V", line = 758)
    public static final void method1083(int arg0) {
        field2600++;
        class242.field4118 = null;
        class70.field1289 = null;
        class155.field2769 = null;
        if (arg0 != 28119) {
            field2595 = -43;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lng;IILng;I)Lee;", line = 774)
    public static final class293 method1084(class138 arg0, int arg1, int arg2, class138 arg3, int arg4) {
        field2594++;
        if (arg1 != 128) {
            method1079(-19, (class256) null);
        }
        return class83.method611(arg2, -37, arg3, arg4) ? class138.method1003(arg0.method1016(arg4, 100, arg2), (byte) 120) : null;
    }
}
