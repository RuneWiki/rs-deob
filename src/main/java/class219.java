import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class219 {

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "F")
    public static float field3094 = 1.0F;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Z")
    public static boolean field3091 = false;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Lkc;")
    public static class157 field3096 = new class157(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "[I")
    public static int[] field3098 = new int[4];

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I", line = 8)
    public static int method1367(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lws;B)Ljava/lang/String;", line = 18)
    public static final String method1368(class440 arg0, byte arg1) {
        field3093++;
        if (arg1 < 32) {
            field3096 = null;
        }
        return arg0.field6338 == null || arg0.field6338.length() <= 0 ? arg0.field6345 : arg0.field6345 + class269.field3627.method1126(class486.field6998, (byte) -19) + arg0.field6338;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIZII)V", line = 36)
    public static final void method1369(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field3095++;
        if (!arg2 && class412.field5874 == arg1 && class334.field4874 == arg3 && class366.field5260 == class315.field4267 || class76.field1075.method1104(class195.field2849, 0)) {
            return;
        }
        class334.field4874 = arg3;
        class412.field5874 = arg1;
        class315.field4267 = class366.field5260;
        if (class76.field1075.method1104(class195.field2849, 0)) {
            class315.field4267 = 0;
        }
        class63.method421(arg0, true);
        class229.method1408(0, class314.field4251.method1126(class486.field6998, (byte) -19), class331.field4510, true);
        int var5 = class110.field1775;
        class110.field1775 = (class412.field5874 - (class9.field111 >> 4)) * 8;
        int var6 = class399.field5727;
        class399.field5727 = (class334.field4874 - (class192.field2809 >> 4)) * 8;
        class423.field6154 = class472.method2762(class412.field5874 * 8, class334.field4874 * 8);
        class533.field7851 = null;
        int var7 = class110.field1775 - var5;
        int var8 = class399.field5727 - var6;
        if (arg0 == 10) {
            for (int var17 = 0; var17 < class534.field7854; var17++) {
                class326 var30 = class496.field7261[var17];
                if (var30 != null) {
                    class209 var31 = var30.field4455;
                    for (int var32 = 0; var32 < 10; var32++) {
                        var31.field263[var32] -= var7;
                        var31.field257[var32] -= var8;
                    }
                    var31.field6284 -= var7 * 128;
                    var31.field6287 -= var8 * 128;
                }
            }
        } else {
            class273.field3692 = 0;
            boolean var9 = false;
            int var10 = class9.field111 * 128 - 128;
            int var11 = (class192.field2809 - 1) * 128;
            for (int var12 = 0; var12 < class534.field7854; var12++) {
                class326 var13 = class496.field7261[var12];
                if (var13 != null) {
                    class209 var14 = var13.field4455;
                    var14.field6284 -= var7 * 128;
                    var14.field6287 -= var8 * 128;
                    if (var14.field6284 >= 0 && var10 >= var14.field6284 && var14.field6287 >= 0 && var14.field6287 <= var11) {
                        boolean var15 = true;
                        for (int var16 = 0; var16 < 10; var16++) {
                            var14.field263[var16] -= var7;
                            var14.field257[var16] -= var8;
                            if (var14.field263[var16] < 0 || class9.field111 <= var14.field263[var16] || var14.field257[var16] < 0 || var14.field257[var16] >= class192.field2809) {
                                var15 = false;
                            }
                        }
                        if (var15) {
                            class159.field2416[class273.field3692++] = var14.field179;
                        } else {
                            var14.method1330(null, false);
                            var9 = true;
                            var13.method2791((byte) 112);
                        }
                    } else {
                        var14.method1330(null, false);
                        var13.method2791((byte) 112);
                        var9 = true;
                    }
                }
            }
            if (var9) {
                class534.field7854 = class281.field3826.method1585((byte) 73);
                class281.field3826.method1589(class496.field7261, (byte) 120);
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class487 var28 = class45.field642[var18];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field263[var29] -= var7;
                    var28.field257[var29] -= var8;
                }
                var28.field6287 -= var8 * 128;
                var28.field6284 -= var7 * 128;
            }
        }
        class449[] var19 = class413.field5884;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class449 var27 = var19[var20];
            if (var27 != null) {
                var27.field6571 -= var7 * 128;
                var27.field6574 -= var8 * 128;
            }
        }
        for (class65 var21 = (class65) class463.field6690.method3137(0); var21 != null; var21 = (class65) class463.field6690.method3132(0)) {
            var21.field931 -= var7;
            var21.field929 -= var8;
            if (class374.field5376 != 4 && (var21.field931 < 0 || var21.field929 < 0 || class9.field111 <= var21.field931 || var21.field929 >= class192.field2809)) {
                var21.method2791((byte) 112);
            }
        }
        if (class374.field5376 != 4) {
            for (class292 var22 = (class292) class484.field6966.method1588(19); var22 != null; var22 = (class292) class484.field6966.method1582(-102)) {
                int var23 = (int) (var22.field6883 & 0x3FFFL);
                int var24 = var23 - class110.field1775;
                int var25 = (int) (var22.field6883 >> 14 & 0x3FFFL);
                int var26 = var25 - class399.field5727;
                if (var24 < 0 || var26 < 0 || var24 >= class9.field111 || var26 >= class192.field2809) {
                    var22.method2791((byte) 112);
                }
            }
        }
        if (class71.field1023 != 0) {
            class506.field7400 -= var8;
            class71.field1023 -= var7;
        }
        class294.method1700(-101);
        if (arg0 != 10) {
            class422.field6129 -= var8;
            class51.field750 -= var7;
            class108.field1747 -= var8 * 128;
            class187.field2753 -= var8;
            class118.field1848 -= var7 * 128;
            class22.field302 -= var7;
            if (Math.abs(var7) > class9.field111 || Math.abs(var8) > class192.field2809) {
                class325.method1925((byte) -118);
            }
        } else if (class247.field3363 == 4) {
            class387.field5569 -= var7 * 128;
            class193.field2815 -= var8 * 128;
            class102.field1606 -= var8 * 128;
            class70.field1012 -= var7 * 128;
        } else {
            class247.field3363 = 1;
        }
        class486.method2878(70);
        if (arg4 > -71) {
            field3096 = null;
        }
        class35.method258(109);
        class413.field5880.method3143(true);
        class422.field6134.method3143(true);
        class415.field6024.method2593(false);
        class38.method268((byte) 110);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 301)
    public static void method1370(int arg0) {
        field3098 = null;
        int var1 = -71 % ((arg0 - 44) / 52);
        field3096 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lmb;IIIII)V", line = 314)
    public static final void method1371(class224 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field3164 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field3166[var6] != null) {
                arg0.field3164++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field3164; var7++) {
            long var8 = class118.field1853[arg1][arg2][arg3];
            while (var8 != 0L) {
                class433 var14 = class231.field3229[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field3166[var7] == var14.field6257) {
                    continue label50;
                }
            }
            long var10 = class118.field1853[arg1][arg4][arg5];
            while (var10 != 0L) {
                class433 var13 = class231.field3229[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field3166[var7] == var13.field6257) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field3164 - 1; var12++) {
                arg0.field3166[var12] = arg0.field3166[var12 + 1];
            }
            arg0.field3164--;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II[BIBI)V", line = 369)
    public static final void method1372(int arg0, int arg1, byte[] arg2, int arg3, byte arg4, int arg5) {
        int var6 = -105 / ((42 - arg4) / 52);
        field3092++;
        if (arg5 <= arg0) {
            return;
        }
        int var7 = arg0 + arg3;
        int var8 = arg5 - arg0 >> 2;
        while (true) {
            var8--;
            if (var8 < 0) {
                int var9 = arg5 - arg0 & 0x3;
                while (true) {
                    var9--;
                    if (var9 < 0) {
                        return;
                    }
                    arg2[var7++] = 1;
                }
            }
            arg2[var7++] = 1;
            arg2[var7++] = 1;
            arg2[var7++] = 1;
            arg2[var7++] = 1;
        }
    }
}
