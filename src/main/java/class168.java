import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class168 {

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "B")
    public byte field2494 = 0;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "S")
    public short field2495;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "S")
    public short field2497;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "B")
    public byte field2490;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "B")
    public byte field2504;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field2489 = -14475237;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "Lfg;")
    public static class18 field2483 = new class18(64);

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "B")
    public byte field2492;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "B")
    public byte field2500;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "B")
    public byte field2503;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "B")
    public byte field2509;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "Ljs;")
    public class148 field2505;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "Ljs;")
    public class148 field2510;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "Lsk;")
    public class168 field2498;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "Lhe;")
    public class30 field2496;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "Lim;")
    public class350 field2506;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "Lim;")
    public class350 field2507;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "Lwd;")
    public class36 field2488;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "Lip;")
    public class49 field2501;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "Lfp;")
    public class7 field2493;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "S")
    public short field2502;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "Z")
    public boolean field2499;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "Z")
    public boolean field2508;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "Z")
    public boolean field2511;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILjava/lang/String;)I")
    public static final int method1283(int arg0, int arg1, String arg2) {
        if (arg1 <= 108) {
            return -46;
        } else {
            field2484++;
            return class373.method2376(arg0, (byte) -58, true, arg2);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
    public static void method1284(byte arg0) {
        field2483 = null;
        if (arg0 >= -62) {
            field2489 = -89;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1285(int arg0, String arg1) {
        field2487++;
        if (arg0 != -26) {
            method1283(87, 2, (String) null);
        }
        String var2 = class356.method2282(class437.method2739(37, arg1), true);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILdp;Ldp;)V")
    public static final void method1286(int arg0, class174 arg1, class174 arg2) {
        class153.field2329 = arg2;
        field2491++;
        class394.field5759 = arg1;
        if (arg0 != 283) {
            field2483 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
    public final void method1287(boolean arg0) {
        field2486++;
        while (this.field2488 != null) {
            class36 var2 = this.field2488.field505;
            this.field2488.method258((byte) -37);
            this.field2488 = var2;
        }
        if (!arg0) {
            method1284((byte) -19);
        }
        this.field2494 = 0;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(III)V")
    public class168(int arg0, int arg1, int arg2) {
        this.field2495 = (short) arg1;
        this.field2497 = (short) arg2;
        this.field2504 = this.field2490 = (byte) arg0;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)V")
    public static final void method1288(int arg0, int arg1) {
        field2485++;
        if (class240.field3463 == arg1) {
            return;
        }
        if (class240.field3463 == 0) {
            class169.method1290(arg0 + 7);
        }
        if (arg1 == 40) {
            class249.method1794(-5425);
        }
        if (arg1 != 40 && class134.field2159 != null) {
            class134.field2159.method1654(arg0 ^ 0x5211);
            class134.field2159 = null;
        }
        if (class240.field3463 == 25 || class240.field3463 == 28) {
            class217.field3222.field2564 = 2;
            class361.field5141.field2564 = 2;
            class238.field3425.field2564 = 2;
            class247.field3585.field2564 = 2;
            class40.field620.field2564 = 2;
            class48.field783.field2564 = 2;
            class28.field422.field2564 = 2;
        }
        if (arg1 == 25 || arg1 == 28) {
            class323.field4658 = 1;
            class382.field5437 = 0;
            class176.field2629 = 0;
            class381.field5395 = 1;
            class326.field4695 = 0;
            class51.method404(true, 64);
            class217.field3222.field2564 = 1;
            class361.field5141.field2564 = 1;
            class238.field3425.field2564 = 1;
            class247.field3585.field2564 = 1;
            class40.field620.field2564 = 1;
            class48.field783.field2564 = 1;
            class28.field422.field2564 = 1;
        }
        if (arg1 == 25 || arg1 == 10) {
            class230.method1713((byte) 47);
        }
        if (arg1 == 5) {
            class383.method2430(-75, class100.field1561, class73.field1235);
        } else {
            class303.method2078(1);
        }
        boolean var2 = ~arg1 == arg0 || arg1 == 10 || arg1 == 28;
        boolean var3 = class240.field3463 == 5 || class240.field3463 == 10 || class240.field3463 == 28;
        if (var2 != var3) {
            if (var2) {
                class86.field1402 = class329.field4740;
                if (class321.field4641 == 0) {
                    class294.method2058(2, true);
                } else {
                    class136.method1115(0, class329.field4740, 2, 255, true, false, class446.field6501);
                }
                class123.field1951.method2567(arg0 + 420237878, false);
            } else {
                class294.method2058(2, true);
                class123.field1951.method2567(420237872, true);
                if (class265.field3987 != null) {
                    class265.field3987.method1890(false);
                    class265.field3987 = null;
                }
            }
        }
        if (arg1 == 25 || arg1 == 28 || arg1 == 40) {
            class73.field1235.method722();
        }
        class240.field3463 = arg1;
    }
}
