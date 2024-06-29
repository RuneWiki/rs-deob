import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class31 extends class128 {

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "Z")
    public static boolean field719 = false;

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "I")
    public static int field724 = 0;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "Z")
    public static boolean field725 = false;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "Lid;")
    public static class60 field727 = class11.method72("Bitte versuchen Sie)1", (byte) -80);

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
    public static int field723 = 1;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "Lid;")
    public static class60 field731 = class11.method72("mapscene", (byte) 114);

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "Lid;")
    private static class60 field718 = class11.method72("Please try again)3", (byte) -18);

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "Lid;")
    public static class60 field716 = field718;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "Lid;")
    public static class60 field736 = class11.method72("nav", (byte) -85);

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "Lid;")
    public static class60 field732 = class11.method72("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", (byte) 118);

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "Lid;")
    public static class60 field729 = class11.method72("(U0a )2 non)2existant gosub script)2num: ", (byte) -128);

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "Leb;")
    public class31 field720;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "Leb;")
    public class31 field735;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "[I")
    public static int[] field737;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(JI)V")
    public static final void method232(long arg0, int arg1) {
        field733++;
        if (arg0 == 0L) {
            return;
        }
        if (class103.field2502 >= 100 && class78.field1923 != 1 || class103.field2502 >= 200) {
            class43.method342(class94.field2314, 0, class62.field1552, arg1 - 12362);
            return;
        }
        class60 var3 = class89.method726((byte) -124, arg0).method434((byte) 89);
        for (int var4 = 0; var4 < class103.field2502; var4++) {
            if (class136.field3082[var4] == arg0) {
                class43.method342(class94.field2314, 0, class104.method853(-97, new class60[] { var3, class148.field3326 }), 2001);
                return;
            }
        }
        for (int var5 = 0; var5 < class133.field3044; var5++) {
            if (class44.field1169[var5] == arg0) {
                class43.method342(class94.field2314, 0, class104.method853(-100, new class60[] { class111.field2664, var3, class50.field1287 }), 2001);
                return;
            }
        }
        if (var3.method451(class107.field2640.field21, 11207)) {
            class43.method342(class94.field2314, 0, class63.field1573, 2001);
            return;
        }
        class67.field1639[class103.field2502] = var3;
        class11.field194++;
        if (arg1 != 14363) {
            method239((byte) -1);
        }
        class136.field3082[class103.field2502] = arg0;
        class89.field2210[class103.field2502] = 0;
        class17.field427[class103.field2502] = 0;
        class103.field2502++;
        class42.field1112 = class78.field1921;
        class22.field519.method1214(214, arg1 - 14363);
        class22.field519.method830(arg0, 93);
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
    public static void method233(int arg0) {
        field736 = null;
        field716 = null;
        field718 = null;
        field737 = null;
        field732 = null;
        if (arg0 != 0) {
            method233(-66);
        }
        field729 = null;
        field727 = null;
        field731 = null;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
    public final void method234(int arg0) {
        field734++;
        if (this.field735 == null) {
            return;
        }
        this.field735.field720 = this.field720;
        this.field720.field735 = this.field735;
        this.field720 = null;
        if (arg0 <= 37) {
            method239((byte) 47);
        }
        this.field735 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method235(Component arg0, byte arg1) {
        int var2 = 82 / ((arg1 - 68) / 41);
        arg0.addMouseListener(class145.field3268);
        arg0.addMouseMotionListener(class145.field3268);
        arg0.addFocusListener(class145.field3268);
        field738++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIZIBI)Lae;")
    public static final class6 method236(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        field730++;
        long var6 = ((long) arg5 << 16) + (long) arg0 + ((long) arg1 << 38) + ((long) arg3 << 40);
        if (!arg2) {
            class6 var8 = (class6) class87.field2172.method918(101, var6);
            if (var8 != null) {
                return var8;
            }
        }
        class85 var9 = class85.method710(arg0, 10);
        if (arg5 > 1 && var9.field2112 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg5 >= var9.field2088[var11] && var9.field2088[var11] != 0) {
                    var10 = var9.field2112[var11];
                }
            }
            if (var10 != -1) {
                var9 = class85.method710(var10, 10);
            }
        }
        class70 var12 = var9.method709(-1, 1);
        if (var12 == null) {
            return null;
        }
        class6 var13 = null;
        if (var9.field2130 != -1) {
            var13 = method236(var9.field2108, 1, true, 0, (byte) 57, 10);
            if (var13 == null) {
                return null;
            }
        }
        int var14 = -73 % ((-arg4 - 36) / 55);
        int var15 = class130.field2958;
        int var16 = class130.field2957;
        int[] var17 = class130.field2959;
        int[] var18 = new int[4];
        class130.method1017(var18);
        class6 var19 = new class6(36, 32);
        class130.method1032(var19.field89, 36, 32);
        class130.method1029();
        class127.method999();
        class127.method991(16, 16);
        class127.field2902 = false;
        int var20 = var9.field2096;
        if (arg2) {
            var20 = (int) ((double) var20 * 1.5D);
        } else if (arg1 == 2) {
            var20 = (int) ((double) var20 * 1.04D);
        }
        int var21 = class127.field2899[var9.field2085] * var20 >> 16;
        int var22 = class127.field2900[var9.field2085] * var20 >> 16;
        var12.method544();
        var12.method523(0, var9.field2084, var9.field2129, var9.field2085, var9.field2128, var12.field1272 / 2 + var22 + var9.field2091, var9.field2091 + var21);
        if (arg1 >= 1) {
            var19.method44(1);
        }
        if (arg1 >= 2) {
            var19.method44(16777215);
        }
        if (arg3 != 0) {
            var19.method38(arg3);
        }
        class130.method1032(var19.field89, 36, 32);
        if (var9.field2130 != -1) {
            var13.method29(0, 0);
        }
        if (!arg2 && (var9.field2098 == 1 || arg5 != 1) && arg5 != -1) {
            class141.field3226.method947(class30.method227(arg5, 108), 0, 9, 16776960, 1);
        }
        if (!arg2) {
            class87.field2172.method914(var19, var6, (byte) 44);
        }
        class130.method1032(var17, var15, var16);
        class130.method1024(var18);
        class127.method999();
        class127.field2902 = true;
        return var19;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZIII)Lid;")
    public static final class60 method237(boolean arg0, int arg1, int arg2, int arg3) {
        int var4 = 1;
        field717++;
        if (~arg1 > arg3 || arg1 > 36) {
            arg1 = 10;
        }
        int var5 = arg2 / arg1;
        while (var5 != 0) {
            var5 /= arg1;
            var4++;
        }
        int var6 = var4;
        if (arg2 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg2 % arg1;
            arg2 /= arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class60 var9 = new class60();
        var9.field1453 = var7;
        var9.field1474 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Lvb;")
    public static final class148 method238(int arg0, int arg1) {
        field721++;
        class148 var2 = (class148) class148.field3343.method918(111, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class99.field2418.method473((byte) 113, 6, arg1);
        class148 var4 = new class148();
        if (arg0 != -29628) {
            return null;
        }
        var4.field3344 = arg1;
        if (var3 != null) {
            var4.method1126(new class103(var3), 15);
        }
        var4.method1127(arg0 + 37290);
        if (var4.field3346) {
            var4.field3348 = 0;
            var4.field3347 = false;
        }
        class148.field3343.method914(var4, (long) arg1, (byte) 63);
        return var4;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
    public static final void method239(byte arg0) {
        field728++;
        if (!class135.field3067) {
            class90.field2249[0] = 1006;
            class64.field1590[0] = class33.field776;
            class80.field1956 = 1;
            class80.field1995[0] = class94.field2314;
        }
        if (class11.field187 != -1) {
            class42.method331(class11.field187, (byte) -60);
        }
        for (int var1 = 0; var1 < class87.field2164; var1++) {
            if (class14.field257[var1]) {
                class47.field1237[var1] = true;
            }
            class32.field757[var1] = class14.field257[var1];
            class14.field257[var1] = false;
        }
        class35.field814 = class82.field2065;
        class51.field1292 = -1;
        class45.field1192 = null;
        class75.field1803 = -1;
        if (arg0 != 89) {
            return;
        }
        if (class11.field187 != -1) {
            class87.field2164 = 0;
            class15.method123(0, (byte) -56, 503, -1, 0, class11.field187, 0, 765, 0);
        }
        class130.method1016();
        class33.method247((byte) -6);
        if (class135.field3067) {
            class34.method257(-20274);
        } else if (class51.field1292 != -1) {
            class41.method325(2, class75.field1803, class51.field1292);
        }
        if (class64.field1604 == 3) {
            for (int var2 = 0; var2 < class87.field2164; var2++) {
                if (class32.field757[var2]) {
                    class130.method1027(class19.field469[var2], class14.field281[var2], class38.field903[var2], class35.field885[var2], 16711935, 128);
                } else if (class47.field1237[var2]) {
                    class130.method1027(class19.field469[var2], class14.field281[var2], class38.field903[var2], class35.field885[var2], 16711680, 128);
                }
            }
        }
        class106.method866(arg0 + 22, class107.field2640.field828, class107.field2640.field854, class46.field1222, class75.field1802);
        class75.field1802 = 0;
    }
}
