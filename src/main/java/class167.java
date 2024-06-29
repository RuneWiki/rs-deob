import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class167 {

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "J")
    public long field2984 = 0L;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "[I")
    public static int[] field2974 = new int[256];

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field2975 = 0;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "Loa;")
    private static class99 field2990 = class221.method1463(2844, "Prepared sound engine");

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Loa;")
    public static class99 field2983 = field2990;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field2980 = -1;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "Loa;")
    public static class99 field2991 = class221.method1463(2844, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Loa;")
    public static class99 field2987 = class221.method1463(2844, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public int field2976;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public int field2978;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public int field2981;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public int field2985;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public int field2994;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "Luk;")
    public class98 field2988;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "Luk;")
    public class98 field2989;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "[I")
    public static int[] field2979;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "[I")
    public static int[] field2982;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIZIILtg;)V")
    public static final void method1132(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class182 arg6) {
        class90.field1545 = arg3;
        field2992++;
        class145.field2546 = arg0;
        class53.field873 = 1;
        class161.field2860 = arg6;
        class48.field797 = arg5;
        class47.field790 = arg4;
        class34.field614 = arg1;
        if (arg2 != 0) {
            field2990 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)Z")
    public static final boolean method1133(boolean arg0) {
        field2995++;
        if (!arg0) {
            method1137(42);
        }
        if (class37.field650) {
            try {
                if ((Boolean) class230.field3989.method687(class24.field368.field1493, -26001)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IJ)V")
    public static final void method1134(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        if (arg0 != 6) {
            method1137(0);
        }
        field2993++;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)V")
    public static void method1135(boolean arg0) {
        field2983 = null;
        if (arg0) {
            field2983 = null;
        }
        field2987 = null;
        field2982 = null;
        field2990 = null;
        field2979 = null;
        field2974 = null;
        field2991 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)I")
    public static final int method1136(int arg0, int arg1) {
        if (arg1 != -881745241) {
            method1133(true);
        }
        field2977++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static final void method1137(int arg0) {
        boolean var1 = true;
        field2986++;
        class143.method976((byte) 103, false);
        class184.field3274 = 0;
        for (int var2 = 0; var2 < class123.field2155.length; var2++) {
            if (class138.field2445[var2] != -1 && class123.field2155[var2] == null) {
                class123.field2155[var2] = class269.field4732.method1242(0, class138.field2445[var2], 6801);
                if (class123.field2155[var2] == null) {
                    class184.field3274++;
                    var1 = false;
                }
            }
            if (class200.field3479[var2] != -1 && class117.field2077[var2] == null) {
                class117.field2077[var2] = class269.field4732.method1222(class220.field3834[var2], class200.field3479[var2], 0, 0);
                if (class117.field2077[var2] == null) {
                    var1 = false;
                    class184.field3274++;
                }
            }
            if (class124.field2183 != null && class164.field2877[var2] == null && class124.field2183[var2] != -1) {
                class164.field2877[var2] = class269.field4732.method1222(class220.field3834[var2], class124.field2183[var2], class28.method249(arg0, 32104), 0);
                if (class164.field2877[var2] == null) {
                    class184.field3274++;
                    var1 = false;
                }
            }
        }
        if (class31.field566 == null) {
            if (class99.field1673 == null || !class139.field2465.method1219(arg0 - 31987, class198.method1332(96, new class99[] { class99.field1673.field3968, class54.field895 }))) {
                class31.field566 = new class88(0);
            } else if (class139.field2465.method1238(121, class198.method1332(87, new class99[] { class99.field1673.field3968, class54.field895 }))) {
                class31.field566 = class179.method1199(class139.field2465, class198.method1332(97, new class99[] { class99.field1673.field3968, class54.field895 }), (byte) -116);
            } else {
                var1 = false;
                class184.field3274++;
            }
        }
        if (!var1) {
            class222.field3866 = 1;
            return;
        }
        class117.field2076 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class123.field2155.length; var4++) {
            byte[] var20 = class117.field2077[var4];
            if (var20 != null) {
                int var21 = (class171.field3042[var4] & 0xFF) * 64 - class215.field3731;
                int var22 = (class171.field3042[var4] >> 8) * 64 - class280.field4910;
                if (class192.field3375) {
                    var22 = 10;
                    var21 = 10;
                }
                var3 &= class151.method1005(var20, (byte) 107, var21, var22);
            }
        }
        if (!var3) {
            class222.field3866 = 2;
            return;
        }
        if (class222.field3866 != 0) {
            class99.method672(class198.method1332(116, new class99[] { class251.field4324, class101.field1721 }), true, true);
        }
        class225.method1485(0);
        class13.method87(arg0 - 57835);
        boolean var5 = false;
        class245.method1583(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class177.field3091[var6].method864((byte) -119);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class230.field3973[var7][var18][var19] = 0;
                }
            }
        }
        class284.method1859(false, false);
        class225.method1485(0);
        System.gc();
        class143.method976((byte) 103, true);
        class78.method546(false, arg0 - 32221);
        if (!class192.field3375) {
            class170.method1149(8, false);
            class143.method976((byte) 103, true);
            class17.method100(75, false);
            if (class164.field2877 != null) {
                class226.method1487(arg0 - 32105);
            }
        }
        if (class192.field3375) {
            class256.method1653(false, (byte) 123);
            class143.method976((byte) 103, true);
            class276.method1829((byte) -103, false);
        }
        if (arg0 != 32104) {
            return;
        }
        class13.method87(arg0 ^ 0xFFFFE615);
        class143.method976((byte) 103, true);
        class223.method1475(class177.field3091, (byte) 75, false);
        class143.method976((byte) 103, true);
        int var8 = class255.field4408;
        if (class255.field4407 < var8) {
            var8 = class255.field4407;
        }
        if (class255.field4407 - 1 > var8) {
            int var9 = class255.field4407 - 1;
        }
        if (class139.method951(arg0 + 436389821)) {
            class174.method1167(0);
        } else {
            class174.method1167(class255.field4408);
        }
        class208.method1389(arg0 - 32030);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class77.method542(var17, var10, (byte) -95);
            }
        }
        class187.method1286(false);
        class225.method1485(0);
        class256.method1652(arg0 - 32104);
        class13.method87(arg0 ^ 0xFFFFE615);
        if (class75.field1281 != null && class133.field2322 != null && class156.field2808 == 25) {
            class131.field2277.method966((byte) 49, 189);
            class270.field4755++;
            class131.field2277.method1701(1057001181, 4994);
        }
        if (!class192.field3375) {
            int var11 = (class209.field3628 - 6) / 8;
            int var12 = (class206.field3565 - 6) / 8;
            int var13 = (class206.field3565 + 6) / 8;
            int var14 = (class209.field3628 + 6) / 8;
            for (int var15 = var11 - 1; var15 <= (var14 + 1); var15++) {
                for (int var16 = var12 - 1; var16 <= var13 + 1; var16++) {
                    if (var15 < var11 || var14 < var15 || var16 < var12 || var16 > var13) {
                        class269.field4732.method1243(100, class198.method1332(74, new class99[] { class156.field2806, class198.method1333(-98, var15), class137.field2415, class198.method1333(-109, var16) }));
                        class269.field4732.method1243(100, class198.method1332(arg0 - 32029, new class99[] { class254.field4394, class198.method1333(arg0 ^ 0xFFFF82C1, var15), class137.field2415, class198.method1333(-127, var16) }));
                    }
                }
            }
        }
        if (class156.field2808 == 28) {
            class138.method943(0, 10);
        } else {
            class138.method943(0, 30);
            if (class133.field2322 != null) {
                class131.field2277.method966((byte) 49, 20);
            }
        }
        class185.method1266(32632);
        class225.method1485(0);
        class228.method1496((byte) -114);
    }
}
