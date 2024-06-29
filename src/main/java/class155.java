import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class155 {

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Lwa;")
    public static class75 field2650 = class66.method560("blinken1:", false);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Lwa;")
    private static class75 field2649 = class66.method560("Cancel", false);

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "Lre;")
    public static class262 field2654 = null;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "[I")
    public static int[] field2655 = new int[64];

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Lwa;")
    public static class75 field2652 = field2649;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "Lwa;")
    public static class75 field2661 = class66.method560(")3", false);

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "Lwa;")
    public static class75 field2659 = class66.method560("W-=hlen Sie eine Option", false);

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field2656 = 0;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "Lwa;")
    public static class75 field2664 = class66.method560("Verbindung abgebrochen)3", false);

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Lcb;")
    public static class267 field2657;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "[[B")
    public static byte[][] field2653;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V", line = 15)
    public static final void method1177(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class222.method1638(arg1, arg2, arg1 + arg3, arg0 + arg2);
        class222.method1632(arg1, arg2, arg3, arg0, 0);
        field2658++;
        if (class170.field2864 < 100) {
            return;
        }
        if (class271.field4688 == null || class271.field4688.field4318 != arg3 || class271.field4688.field4320 != arg0) {
            class181 var5 = new class181(arg3, arg0);
            class44.method298(var5.field3029, arg3, arg0);
            class189.method1430(0, class215.field3668, 0, arg3, arg0, -131970000, 0, 0, class39.field589);
            class271.field4688 = new class277(var5);
            class44.field721 = null;
        }
        class271.field4688.method156(arg1, arg2);
        int var6 = class185.field3072 * arg0 / class215.field3668 + arg2;
        int var7 = class182.field3036 * arg3 / class39.field589 + arg1;
        int var8 = class281.field4849 * arg3 / class39.field589;
        int var9 = class32.field483 * arg0 / class215.field3668;
        class222.method1641(var7, var6, var8, var9, 16711680, 128);
        class222.method1640(var7, var6, var8, var9, 16711680);
        if (class137.field2342 > 0 && (class137.field2342 % 10) < 5) {
            for (class153 var10 = (class153) class194.field3211.method1250(true); var10 != null; var10 = (class153) class194.field3211.method1256((byte) -127)) {
                if (class25.field325 == var10.field2628) {
                    int var11 = var10.field2629 * arg3 / class39.field589 + arg1;
                    int var12 = var10.field2624 * arg0 / class215.field3668 + arg2;
                    class222.method1632(var11 - 2, var12 + -2, 4, 4, 16776960);
                }
            }
        }
        if (arg4 >= -43) {
            method1179((class50) null, -18);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 90)
    public static void method1178(int arg0) {
        field2654 = null;
        field2653 = (byte[][]) null;
        field2649 = null;
        field2664 = null;
        field2659 = null;
        field2650 = null;
        field2655 = null;
        if (arg0 != -18) {
            method1179((class50) null, 103);
        }
        field2652 = null;
        field2661 = null;
        field2657 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lvb;I)V", line = 113)
    public static final void method1179(class50 arg0, int arg1) {
        field2660++;
        class12.method62((byte) -95);
        int var2 = 23 % ((-arg1 - 37) / 52);
        if (class16.field202 != null) {
            return;
        }
        if (!class195.field3281) {
            class35.method232((byte) 94);
        } else if (class87.field1435 == 1) {
            int var3 = class86.field1416 / 5;
            int var4 = class306.field5232 + var3 + 140;
            if (class39.field595 >= var4 && class39.field595 <= (var4 + 14) && (class75.field1250 + 4) <= class271.field4685 && (class75.field1250 + 18) >= class271.field4685) {
                class258.method1839(0, 0, 0);
                return;
            }
            if (var4 + 15 <= class39.field595 && (var4 + 80) >= class39.field595 && (class75.field1250 + 4) <= class271.field4685 && class271.field4685 <= (class75.field1250 + 18)) {
                class258.method1839(0, 0, 1);
                return;
            }
            int var5 = class306.field5232 - (-var3 - 250);
            if (var5 <= class39.field595 && var5 + 14 >= class39.field595 && class271.field4685 >= (class75.field1250 + 4) && class271.field4685 <= (class75.field1250 + 18)) {
                class258.method1839(0, 1, 0);
                return;
            }
            if (var5 + 15 <= class39.field595 && var5 + 80 >= class39.field595 && class271.field4685 >= class75.field1250 + 4 && class75.field1250 + 18 >= class271.field4685) {
                class258.method1839(0, 1, 1);
                return;
            }
            int var6 = class306.field5232 + var3 + 360;
            if (var6 <= class39.field595 && var6 + 14 >= class39.field595 && class75.field1250 + 4 <= class271.field4685 && class271.field4685 <= (class75.field1250 + 18)) {
                class258.method1839(0, 2, 0);
                return;
            }
            if (class39.field595 >= var6 + 15 && (var6 + 80) >= class39.field595 && (class75.field1250 + 4) <= class271.field4685 && class271.field4685 <= (class75.field1250 + 18)) {
                class258.method1839(0, 2, 1);
                return;
            }
            int var7 = class306.field5232 - (-var3 - 470);
            if (var7 <= class39.field595 && (var7 + 14) >= class39.field595 && class271.field4685 >= class75.field1250 + 4 && (class75.field1250 + 18) >= class271.field4685) {
                class258.method1839(0, 3, 0);
                return;
            }
            if (class39.field595 >= var7 + 15 && var7 + 80 >= class39.field595 && class271.field4685 >= (class75.field1250 + 4) && class75.field1250 + 18 >= class271.field4685) {
                class258.method1839(0, 3, 1);
                return;
            }
            if (class75.field1311 != -1) {
                class29 var8 = class115.field1946[class75.field1311];
                if (var8.field407 == class120.field2016) {
                    byte[] var9 = class66.method562((byte) -120, new class75[] { var8.field414, class111.field1894 }).method659(false);
                    class311.field5305 = new String(var9, 0, var9.length);
                    class246.field4160 = var8.field410;
                    if (class265.field4574 != 0) {
                        field2663 = class246.field4160 + 40000;
                        class117.field1992 = class246.field4160 + 50000;
                        class311.field5304 = field2663;
                    }
                    if (field2654 != null) {
                        field2654.field4491 = true;
                        class291.method2027(field2654, 14580);
                    }
                    return;
                }
                class75 var10 = class250.field4202;
                if (class265.field4574 != 0) {
                    var10 = class66.method562((byte) -74, new class75[] { class25.field326, class67.method565(83, var8.field410 + 7000) });
                }
                class75 var11 = class66.method562((byte) 123, new class75[] { class32.field457, var8.field414, class111.field1894, var10, class161.field2726, class67.method565(62, class151.field2592), class95.field1545, class67.method565(112, class98.field1612), class137.field2345, class67.method565(39, 1), class215.field3683, class67.method565(113, class177.field2975), class53.field885, class67.method565(113, class13.field168) });
                try {
                    arg0.getAppletContext().showDocument(var11.method646(-94), "_self");
                } catch (Exception var13) {
                }
            }
        }
    }
}
