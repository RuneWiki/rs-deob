import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class97 {

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Lvc;")
    public static class128 field2458 = new class128(64);

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "Lpd;")
    private static class94 field2471 = class28.method249(75, " is already on your ignore list");

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field2473 = 0;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Lpd;")
    public static class94 field2467 = field2471;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "Lpd;")
    private static class94 field2465 = class28.method249(49, " million");

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "Lpd;")
    public static class94 field2474 = field2465;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public static int field2478 = 0;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "Lpd;")
    public static class94 field2476 = class28.method249(-85, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "Lpd;")
    public static class94 field2477 = class28.method249(-81, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "[I")
    public static int[] field2475 = new int[5];

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Lvc;")
    public static class128 field2466 = new class128(128);

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "[I")
    public static int[] field2480 = new int[256];

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public int field2455;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public int field2457;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public int field2460;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public int field2461;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public int field2463;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Lbe;")
    public class12 field2462;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "[I")
    public static int[] field2479;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2480[var0] = var1;
        }
        field2481 = -1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 3)
    public static final void method734(byte arg0) {
        field2470++;
        class127.field3186.method1013(-1);
        class67.field1640.method1013(-1);
        class120.field2993.method1013(arg0 + 50);
        if (arg0 != -51) {
            method735(44, 42);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Lpd;", line = 21)
    public static final class94 method735(int arg0, int arg1) {
        if (arg0 < 45) {
            return null;
        }
        field2469++;
        if (arg1 < 100000) {
            return class51.method403(arg1, true);
        } else if (arg1 < 10000000) {
            return class4.method20(new class94[] { class51.method403(arg1 / 1000, true), class17.field411 }, true);
        } else {
            return class4.method20(new class94[] { class51.method403(arg1 / 1000000, true), class115.field2921 }, true);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)V", line = 45)
    public static final void method736(int arg0, byte arg1) {
        int var2 = 121 / ((arg1 - 33) / 49);
        field2464++;
        if (arg0 == -1 && class103.field2595 == 0) {
            class123.method968(55);
        } else if (arg0 != -1 && class36.field946 != arg0 && class112.field2837 != 0 && class103.field2595 == 0) {
            class123.method977(0, 10, 0, arg0, false, 102, class77.field1978, class112.field2837);
        }
        class36.field946 = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 80)
    public static void method737(int arg0) {
        field2466 = null;
        field2458 = null;
        field2471 = null;
        field2475 = null;
        field2465 = null;
        field2476 = null;
        if (arg0 != 0) {
            field2473 = -118;
        }
        field2480 = null;
        field2467 = null;
        field2474 = null;
        field2477 = null;
        field2479 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILpd;Lpd;III)V", line = 129)
    public static final void method738(int arg0, int arg1, class94 arg2, class94 arg3, int arg4, int arg5, int arg6) {
        if (field2478 < 500) {
            if (arg2.method710(-123) <= 0) {
                class39.field1008[field2478] = arg3;
            } else {
                class39.field1008[field2478] = class4.method20(new class94[] { arg3, class73.field1783, arg2 }, true);
            }
            class38.field995[field2478] = arg5;
            class101.field2560[field2478] = arg4;
            class9.field237[field2478] = arg1;
            class134.field3273[field2478] = arg0;
            field2478++;
        }
        if (arg6 != -30801) {
            field2481 = 14;
        }
        field2456++;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V", line = 156)
    public static final void method739(int arg0, int arg1) {
        field2459++;
        class75 var2 = (class75) class86.field2185.method19(25239, (long) arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field1831.length; var3++) {
            var2.field1831[var3] = -1;
            var2.field1826[var3] = 0;
        }
        if (arg1 != -1) {
            field2474 = null;
        }
    }
}
