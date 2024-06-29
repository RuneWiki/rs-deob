import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class136 {

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field2475 = 0;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field2481 = -1;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "[I")
    public static int[] field2480 = new int[128];

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "Loh;")
    private static class263 field2482 = class253.method1681(-119, "Loaded config");

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "Loh;")
    public static class263 field2484 = field2482;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field2488 = 0;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "Loh;")
    private static class263 field2487 = class253.method1681(-118, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Loh;")
    public static class263 field2476 = field2487;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "Lje;")
    public static class179 field2477 = class55.method350(17859);

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "Loh;")
    public static class263 field2493 = class253.method1681(-122, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field2492 = 0;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "Loh;")
    private static class263 field2491 = class253.method1681(-118, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "Loh;")
    public static class263 field2489 = field2491;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "[[[I")
    public static int[][][] field2490;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static final void method886(int arg0) {
        if (arg0 < 92) {
            method890((class86) null, (byte) -38);
        }
        field2479++;
        class184.field3327 = new class5(32);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIII)I")
    public static final int method887(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field2473++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else if (arg2 > -124) {
            return -13;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Loh;Lue;Z)Lfk;")
    public static final class14 method888(class263 arg0, class86 arg1, boolean arg2) {
        field2483++;
        int var3 = arg1.method573(-1, arg0);
        if (var3 == -1) {
            return new class14(0);
        }
        int[] var4 = arg1.method577(2828, var3);
        if (!arg2) {
            return null;
        }
        class14 var5 = new class14(var4.length);
        for (int var6 = 0; var6 < var5.field358; var6++) {
            class194 var7 = new class194(arg1.method596(-113, var3, var4[var6]));
            var5.field357[var6] = var7.method1320(false);
            var5.field351[var6] = var7.method1281((byte) -97);
            var5.field356[var6] = (short) var7.method1294((byte) 3);
            var5.field364[var6] = (short) var7.method1294((byte) 3);
            var5.field352[var6] = var7.method1266(4);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static void method889(byte arg0) {
        field2480 = null;
        field2493 = null;
        field2491 = null;
        field2477 = null;
        if (arg0 != -103) {
            field2481 = 96;
        }
        field2487 = null;
        field2484 = null;
        field2476 = null;
        field2490 = null;
        field2482 = null;
        field2489 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lue;B)V")
    public static final void method890(class86 arg0, byte arg1) {
        field2474++;
        class130.field2385 = arg0.method573(-1, class239.field4182);
        class36.field844 = arg0.method573(-1, class141.field2590);
        class220.field3899 = arg0.method573(-1, class268.field4735);
        class50.field1078 = arg0.method573(-1, class41.field923);
        if (arg1 < 41) {
            method888((class263) null, (class86) null, true);
        }
        class75.field1557 = arg0.method573(-1, class141.field2582);
        class169.field3103 = arg0.method573(-1, class23.field664);
        class15.field366 = arg0.method573(-1, class112.field2100);
        field2494 = arg0.method573(-1, class73.field1534);
        class91.field1788 = arg0.method573(-1, class255.field4430);
        class189.field3409 = arg0.method573(-1, class162.field2954);
        class128.field2379 = arg0.method573(-1, class57.field1177);
        class207.field3747 = arg0.method573(-1, class162.field2959);
        class185.field3341 = arg0.method573(-1, class138.field2560);
        class156.field2810 = arg0.method573(-1, class255.field4455);
        class103.field1952 = arg0.method573(-1, class8.field173);
        class90.field1782 = arg0.method573(-1, class137.field2495);
        class269.field4744 = arg0.method573(-1, class107.field2029);
        class24.field690 = arg0.method573(-1, class47.field1019);
        class119.field2212 = arg0.method573(-1, class238.field4161);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)Loh;")
    public static final class263 method891(int arg0, int arg1) {
        if (arg0 >= -48) {
            field2477 = null;
        }
        field2485++;
        return class120.method778(10, false, (byte) 59, arg1);
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
    public static final void method892(int arg0) {
        class189.field3394.method1511(Integer.MAX_VALUE);
        field2478++;
        if (arg0 >= -52) {
            method888((class263) null, (class86) null, true);
        }
        int var1 = class189.field3394.method1512(1, 126);
        if (var1 == 0) {
            return;
        }
        int var2 = class189.field3394.method1512(2, 127);
        if (var2 == 0) {
            class21.field627[class249.field4355++] = 2047;
        } else if (var2 == 1) {
            int var3 = class189.field3394.method1512(3, 126);
            class229.field4018.method1809(false, var3, (byte) 84);
            int var4 = class189.field3394.method1512(1, 127);
            if (var4 == 1) {
                class21.field627[class249.field4355++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class189.field3394.method1512(3, 126);
            class229.field4018.method1809(true, var5, (byte) 84);
            int var6 = class189.field3394.method1512(3, 127);
            class229.field4018.method1809(true, var6, (byte) 84);
            int var7 = class189.field3394.method1512(1, 127);
            if (var7 == 1) {
                class21.field627[class249.field4355++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class189.field3394.method1512(7, 127);
            int var9 = class189.field3394.method1512(1, 127);
            int var10 = class189.field3394.method1512(1, 126);
            if (var10 == 1) {
                class21.field627[class249.field4355++] = 2047;
            }
            class12.field321 = class189.field3394.method1512(2, 126);
            int var11 = class189.field3394.method1512(7, 126);
            class229.field4018.method897(var9 == 1, var11, 126, var8);
        }
    }
}
