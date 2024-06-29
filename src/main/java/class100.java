import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class class100 {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Z")
    public static boolean field2471 = true;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "[[B")
    public static byte[][] field2473 = new byte[250][];

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2479 = -1;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Lrd;")
    private static class117 field2480 = class95.method812("You need a members account to login to this world)3", (byte) 8);

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "Lrd;")
    public static class117 field2485 = class95.method812("Regeln versto-8en hat)3", (byte) 8);

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
    public static int field2490 = 50;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "[I")
    public static int[] field2487 = new int[field2490];

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "[I")
    public static int[] field2481 = new int[field2490];

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "[I")
    public static int[] field2478 = new int[field2490];

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "[I")
    public static int[] field2484 = new int[field2490];

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "Lrd;")
    public static class117 field2491 = class95.method812("Lade Texturen )2 ", (byte) 8);

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "[I")
    public static int[] field2472 = new int[field2490];

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "[Lrd;")
    public static class117[] field2474 = new class117[field2490];

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "[I")
    public static int[] field2492 = new int[50];

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "Lrd;")
    private static class117 field2488 = class95.method812("Create a free account", (byte) 8);

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "[I")
    public static int[] field2475 = new int[field2490];

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "[I")
    public static int[] field2483 = new int[field2490];

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "Lrd;")
    public static class117 field2498 = class95.method812("Verbindung abgebrochen)3", (byte) 8);

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "Lrd;")
    public static class117 field2497 = field2480;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Lrd;")
    public static class117 field2476 = field2488;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
    public static int field2495 = -1;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "Lrd;")
    public static class117 field2499 = class95.method812("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AN>", (byte) 8);

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "Laf;")
    public static class7 field2486;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "[I")
    public static int[] field2489;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "[I")
    public static int[] field2500;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "[Ll;")
    public static class76[] field2493;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[B)V")
    public abstract void method846(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lp;IIII)V")
    public static final void method847(class101 arg0, int arg1, int arg2, int arg3, int arg4) {
        field2482++;
        if (class144.field3516 == arg0 || class21.field604 >= 400) {
            return;
        }
        class117 var5;
        if (arg0.field2509 == 0) {
            var5 = class18.method193(new class117[] { arg0.field2528, class90.method792(arg0.field2534, 19501, class144.field3516.field2534), class23.field665, class107.field2669, class142.method1131(arg0.field2534, true), class136.field3234 }, arg4 - 24398);
        } else {
            var5 = class18.method193(new class117[] { arg0.field2528, class23.field665, class17.field414, class142.method1131(arg0.field2509, true), class136.field3234 }, 54);
        }
        if (class32.field955 == 1) {
            client.method238(arg2, class18.method193(new class117[] { class1.field29, class104.field2610, var5 }, 62), arg1, 59, arg3, 7, class21.field583);
            class121.field2969++;
        } else if (!class46.field1292) {
            for (int var6 = 4; var6 >= 0; var6--) {
                if (class138.field3307[var6] != null) {
                    class4.field102++;
                    short var8 = 0;
                    if (class138.field3307[var6].method965(class143.field3397, false)) {
                        if (class144.field3516.field2534 < arg0.field2534) {
                            var8 = 2000;
                        }
                        if (class144.field3516.field2521 != 0 && arg0.field2521 != 0) {
                            if (class144.field3516.field2521 == arg0.field2521) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class102.field2578[var6]) {
                        var8 = 2000;
                    }
                    int var9 = 0;
                    if (var6 == 0) {
                        var9 = var8 + 8;
                    }
                    if (var6 == 1) {
                        var9 = var8 + 44;
                    }
                    if (var6 == 2) {
                        var9 = var8 + 50;
                    }
                    if (var6 == 3) {
                        var9 = var8 + 57;
                    }
                    if (var6 == 4) {
                        var9 = var8 + 29;
                    }
                    client.method238(arg2, class18.method193(new class117[] { class121.field2968, var5 }, 19), arg1, 46, arg3, var9, class138.field3307[var6]);
                }
            }
        } else if ((class84.field2201 & 0x8) == 8) {
            client.method238(arg2, class18.method193(new class117[] { class57.field1589, class104.field2610, var5 }, 97), arg1, 42, arg3, 38, class37.field1085);
            class111.field2781++;
        }
        if (arg4 != 24515) {
            return;
        }
        for (int var7 = 0; var7 < class21.field604; var7++) {
            if (class79.field2119[var7] == 51) {
                class35.field1051[var7] = class18.method193(new class117[] { class17.field416, class37.field1070, class121.field2968, var5 }, 37);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method848(int arg0) {
        field2473 = null;
        field2483 = null;
        field2498 = null;
        field2493 = null;
        field2489 = null;
        field2478 = null;
        field2488 = null;
        field2497 = null;
        field2475 = null;
        field2492 = null;
        field2485 = null;
        field2476 = null;
        field2481 = null;
        field2472 = null;
        if (arg0 != 50) {
            field2499 = null;
        }
        field2500 = null;
        field2484 = null;
        field2474 = null;
        field2499 = null;
        field2486 = null;
        field2480 = null;
        field2491 = null;
        field2487 = null;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)[B")
    public abstract byte[] method849(int arg0);

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
    public static final void method850(int arg0) {
        if (arg0 <= 72) {
            return;
        }
        field2477++;
        if (class86.field2247 > 0) {
            class46.method496(-72);
        } else {
            class85.method769(0, 40);
            class35.field1040 = class119.field2923;
            class119.field2923 = null;
        }
    }
}
