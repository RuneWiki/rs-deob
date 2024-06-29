import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class158 {

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public int field2520 = 0;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public int field2526 = 1;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public int field2525 = -1;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    public int field2539 = 0;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "[Ljava/lang/String;")
    public String[] field2531 = new String[] { null, null, class200.field3198, null, null };

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    private int field2538 = -1;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    private int field2544 = 0;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    private int field2547 = -1;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    private int field2533 = 0;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    public int field2556 = -1;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public int field2562 = -1;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public int field2545 = 0;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public int field2553 = 0;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    private int field2559 = -1;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    private int field2527 = -1;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    private int field2528 = 0;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public int field2535 = -1;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    public int field2566 = 0;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    private int field2523 = 0;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public int field2548 = -1;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    private int field2560 = -1;

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
    private int field2571 = 0;

    @OriginalMember(owner = "client!v", name = "db", descriptor = "I")
    public int field2573 = -1;

    @OriginalMember(owner = "client!v", name = "eb", descriptor = "I")
    private int field2574 = -1;

    @OriginalMember(owner = "client!v", name = "mb", descriptor = "I")
    private int field2582 = 0;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public int field2549 = -1;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    private int field2534 = -1;

    @OriginalMember(owner = "client!v", name = "ob", descriptor = "I")
    public int field2584 = 0;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public int field2522 = 0;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public int field2541 = -1;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Ljava/lang/String;")
    public String field2532 = "null";

    @OriginalMember(owner = "client!v", name = "pb", descriptor = "I")
    public int field2585 = 0;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    private int field2550 = 128;

    @OriginalMember(owner = "client!v", name = "rb", descriptor = "Z")
    public boolean field2587 = false;

    @OriginalMember(owner = "client!v", name = "fb", descriptor = "I")
    private int field2575 = 128;

    @OriginalMember(owner = "client!v", name = "nb", descriptor = "I")
    private int field2583 = 128;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public int field2543 = -1;

    @OriginalMember(owner = "client!v", name = "gb", descriptor = "Z")
    public boolean field2576 = false;

    @OriginalMember(owner = "client!v", name = "tb", descriptor = "I")
    private int field2589 = 0;

    @OriginalMember(owner = "client!v", name = "jb", descriptor = "I")
    public int field2579 = -1;

    @OriginalMember(owner = "client!v", name = "wb", descriptor = "I")
    private int field2592 = -1;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "[Ljava/lang/String;")
    public String[] field2565 = new String[] { null, null, null, null, class33.field543 };

    @OriginalMember(owner = "client!v", name = "vb", descriptor = "I")
    public int field2591 = 2000;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    private int field2555 = 0;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public static int field2546 = 2;

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "Lad;")
    public static class275 field2570 = new class275(2);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public int field2557;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "I")
    private int field2564;

    @OriginalMember(owner = "client!v", name = "X", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!v", name = "hb", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!v", name = "ib", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!v", name = "kb", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!v", name = "sb", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Li;")
    public class58 field2529;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "[B")
    private byte[] field2554;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "[I")
    public int[] field2552;

    @OriginalMember(owner = "client!v", name = "qb", descriptor = "[I")
    public int[] field2586;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "[S")
    private short[] field2568;

    @OriginalMember(owner = "client!v", name = "lb", descriptor = "[S")
    private short[] field2581;

    @OriginalMember(owner = "client!v", name = "ub", descriptor = "[S")
    private short[] field2590;

    @OriginalMember(owner = "client!v", name = "xb", descriptor = "[S")
    private short[] field2593;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "[[B")
    public static byte[][] field2563;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZI)Lul;")
    public final class201 method1067(boolean arg0, int arg1) {
        field2551++;
        int var3 = this.field2574;
        int var4 = this.field2538;
        if (arg0) {
            var3 = this.field2559;
            var4 = this.field2560;
        }
        if (~var4 == arg1) {
            return null;
        }
        class201 var5 = class201.method1380(class225.field3533, var4, 0);
        if (var3 != -1) {
            class201 var6 = class201.method1380(class225.field3533, var3, 0);
            class201[] var7 = new class201[] { var5, var6 };
            var5 = new class201(var7, 2);
        }
        if (this.field2568 != null) {
            for (int var8 = 0; var8 < this.field2568.length; var8++) {
                var5.method1403(this.field2568[var8], this.field2593[var8]);
            }
        }
        if (this.field2581 != null) {
            for (int var9 = 0; var9 < this.field2581.length; var9++) {
                var5.method1384(this.field2581[var9], this.field2590[var9]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lfj;IB)V")
    private final void method1068(class274 arg0, int arg1, byte arg2) {
        if (arg2 != 12) {
            return;
        }
        if (arg1 == 1) {
            this.field2564 = arg0.method1837(252);
        } else if (arg1 == 2) {
            this.field2532 = arg0.method1855(95);
        } else if (arg1 == 4) {
            this.field2591 = arg0.method1837(arg2 ^ 0xF0);
        } else if (arg1 == 5) {
            this.field2545 = arg0.method1837(252);
        } else if (arg1 == 6) {
            this.field2585 = arg0.method1837(arg2 ^ 0xF0);
        } else if (arg1 == 7) {
            this.field2553 = arg0.method1837(252);
            if (this.field2553 > 32767) {
                this.field2553 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2566 = arg0.method1837(arg2 ^ 0xF0);
            if (this.field2566 > 32767) {
                this.field2566 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field2539 = 1;
        } else if (arg1 == 12) {
            this.field2526 = arg0.method1833((byte) -104);
        } else if (arg1 == 16) {
            this.field2576 = true;
        } else if (arg1 == 23) {
            this.field2543 = arg0.method1837(252);
        } else if (arg1 == 24) {
            this.field2534 = arg0.method1837(252);
        } else if (arg1 == 25) {
            this.field2549 = arg0.method1837(252);
        } else if (arg1 == 26) {
            this.field2527 = arg0.method1837(252);
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2531[arg1 - 30] = arg0.method1855(-64);
            if (this.field2531[arg1 - 30].equalsIgnoreCase(class306.field4980)) {
                this.field2531[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2565[arg1 - 35] = arg0.method1855(-47);
        } else if (arg1 == 40) {
            int var14 = arg0.method1849(arg2 + 243);
            this.field2593 = new short[var14];
            this.field2568 = new short[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field2568[var15] = (short) arg0.method1837(arg2 + 240);
                this.field2593[var15] = (short) arg0.method1837(252);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method1849(255);
            this.field2590 = new short[var4];
            this.field2581 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2581[var5] = (short) arg0.method1837(252);
                this.field2590[var5] = (short) arg0.method1837(252);
            }
        } else if (arg1 == 42) {
            int var12 = arg0.method1849(arg2 ^ 0xF3);
            this.field2554 = new byte[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2554[var13] = arg0.method1830((byte) 106);
            }
        } else if (arg1 == 65) {
            this.field2587 = true;
        } else if (arg1 == 78) {
            this.field2547 = arg0.method1837(arg2 + 240);
        } else if (arg1 == 79) {
            this.field2592 = arg0.method1837(252);
        } else if (arg1 == 90) {
            this.field2538 = arg0.method1837(252);
        } else if (arg1 == 91) {
            this.field2560 = arg0.method1837(252);
        } else if (arg1 == 92) {
            this.field2574 = arg0.method1837(252);
        } else if (arg1 == 93) {
            this.field2559 = arg0.method1837(252);
        } else if (arg1 == 95) {
            this.field2520 = arg0.method1837(252);
        } else if (arg1 == 96) {
            this.field2522 = arg0.method1849(255);
        } else if (arg1 == 97) {
            this.field2562 = arg0.method1837(252);
        } else if (arg1 == 98) {
            this.field2525 = arg0.method1837(arg2 + 240);
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2586 == null) {
                this.field2552 = new int[10];
                this.field2586 = new int[10];
            }
            this.field2586[arg1 - 100] = arg0.method1837(252);
            this.field2552[arg1 - 100] = arg0.method1837(class81.method582(arg2, 240));
        } else if (arg1 == 110) {
            this.field2583 = arg0.method1837(252);
        } else if (arg1 == 111) {
            this.field2575 = arg0.method1837(arg2 + 240);
        } else if (arg1 == 112) {
            this.field2550 = arg0.method1837(arg2 ^ 0xF0);
        } else if (arg1 == 113) {
            this.field2571 = arg0.method1830((byte) -80);
        } else if (arg1 == 114) {
            this.field2523 = arg0.method1830((byte) -106) * 5;
        } else if (arg1 == 115) {
            this.field2584 = arg0.method1849(255);
        } else if (arg1 == 121) {
            this.field2541 = arg0.method1837(arg2 + 240);
        } else if (arg1 == 122) {
            this.field2548 = arg0.method1837(arg2 + 240);
        } else if (arg1 == 125) {
            this.field2582 = arg0.method1830((byte) 123);
            this.field2555 = arg0.method1830((byte) -93);
            this.field2533 = arg0.method1830((byte) 79);
        } else if (arg1 == 126) {
            this.field2544 = arg0.method1830((byte) 103);
            this.field2589 = arg0.method1830((byte) 113);
            this.field2528 = arg0.method1830((byte) 112);
        } else if (arg1 == 127) {
            this.field2535 = arg0.method1849(arg2 ^ 0xF3);
            this.field2556 = arg0.method1837(arg2 + 240);
        } else if (arg1 == 128) {
            this.field2579 = arg0.method1849(255);
            this.field2573 = arg0.method1837(252);
        } else if (arg1 == 129) {
            arg0.method1849(255);
            arg0.method1837(252);
        } else if (arg1 == 130) {
            arg0.method1849(255);
            arg0.method1837(252);
        } else if (arg1 == 249) {
            int var6 = arg0.method1849(arg2 ^ 0xF3);
            if (this.field2529 == null) {
                int var7 = class128.method873(-17034, var6);
                this.field2529 = new class58(var7);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                boolean var9 = arg0.method1849(255) == 1;
                int var10 = arg0.method1812(true);
                class137 var11;
                if (var9) {
                    var11 = new class287(arg0.method1855(86));
                } else {
                    var11 = new class71(arg0.method1833((byte) -104));
                }
                this.field2529.method368((long) var10, var11, -75);
            }
        }
        field2578++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lwa;B)Lqd;")
    public final class3 method1069(class280 arg0, byte arg1) {
        field2572++;
        class201 var3 = class201.method1380(class225.field3533, this.field2564, 0);
        if (var3 == null) {
            return null;
        }
        if (this.field2568 != null) {
            for (int var4 = 0; var4 < this.field2568.length; var4++) {
                if (this.field2554 == null || this.field2554.length <= var4) {
                    var3.method1403(this.field2568[var4], this.field2593[var4]);
                } else {
                    var3.method1403(this.field2568[var4], class22.field425[this.field2554[var4] & 0xFF]);
                }
            }
        }
        if (this.field2581 != null) {
            for (int var5 = 0; var5 < this.field2581.length; var5++) {
                var3.method1384(this.field2581[var5], this.field2590[var5]);
            }
        }
        if (arg1 != 38) {
            return null;
        }
        if (arg0 != null) {
            for (int var6 = 0; var6 < 5; var6++) {
                if (class182.field3024[var6].length > arg0.field4559[var6]) {
                    var3.method1403(class81.field1306[var6], class182.field3024[var6][arg0.field4559[var6]]);
                }
                if (arg0.field4559[var6] < class66.field1080[var6].length) {
                    var3.method1403(class288.field4662[var6], class66.field1080[var6][arg0.field4559[var6]]);
                }
            }
        }
        class3 var7 = var3.method1390(this.field2571 + 64, this.field2523 + 768, -50, -10, -50);
        if (this.field2583 != 128 || this.field2575 != 128 || this.field2550 != 128) {
            var7.method47(this.field2583, this.field2575, this.field2550);
        }
        return var7;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lfj;I)V")
    public final void method1070(class274 arg0, int arg1) {
        if (arg1 != -1) {
            this.method1068((class274) null, 110, (byte) -10);
        }
        while (true) {
            int var3 = arg0.method1849(255);
            if (var3 == 0) {
                field2580++;
                return;
            }
            this.method1068(arg0, var3, (byte) 12);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BZ)Z")
    public final boolean method1071(byte arg0, boolean arg1) {
        field2588++;
        int var3 = this.field2547;
        int var4 = this.field2534;
        int var5 = this.field2543;
        if (arg1) {
            var4 = this.field2527;
            var3 = this.field2592;
            var5 = this.field2549;
        }
        if (var5 == -1) {
            return true;
        }
        boolean var6 = true;
        if (!class225.field3533.method1165(var5, 0, (byte) 43)) {
            var6 = false;
        }
        if (var4 != -1 && !class225.field3533.method1165(var4, 0, (byte) 60)) {
            var6 = false;
        }
        if (arg0 != -119) {
            this.field2528 = -116;
        }
        if (var3 != -1 && !class225.field3533.method1165(var3, 0, (byte) -97)) {
            var6 = false;
        }
        return var6;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public final void method1072(int arg0) {
        field2530++;
        if (arg0 != 0) {
            method1075((byte) -104);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)I")
    public final int method1073(int arg0, int arg1, int arg2) {
        if (arg2 >= -30) {
            return 14;
        }
        field2577++;
        if (this.field2529 == null) {
            return arg1;
        } else {
            class71 var4 = (class71) this.field2529.method371(11, (long) arg0);
            return var4 == null ? arg1 : var4.field1138;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLv;Lv;)V")
    public final void method1074(byte arg0, class158 arg1, class158 arg2) {
        this.field2553 = arg1.field2553;
        this.field2593 = arg1.field2593;
        this.field2566 = arg1.field2566;
        field2537++;
        this.field2520 = arg1.field2520;
        this.field2568 = arg1.field2568;
        this.field2585 = arg1.field2585;
        this.field2576 = arg2.field2576;
        this.field2539 = 1;
        this.field2526 = arg2.field2526;
        if (arg0 < 118) {
            return;
        }
        this.field2581 = arg1.field2581;
        this.field2590 = arg1.field2590;
        this.field2554 = arg1.field2554;
        this.field2564 = arg1.field2564;
        this.field2532 = arg2.field2532;
        this.field2545 = arg1.field2545;
        this.field2591 = arg1.field2591;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public static final void method1075(byte arg0) {
        field2536++;
        if (class199.field3195 == 0 || class199.field3195 == 5) {
            return;
        }
        try {
            if (++class250.field4111 > 2000) {
                if (class18.field322 != null) {
                    class18.field322.method416(64);
                    class18.field322 = null;
                }
                if (class242.field3838 >= 1) {
                    class199.field3195 = 0;
                    class191.field3120 = -5;
                    return;
                }
                class199.field3195 = 1;
                class242.field3838++;
                class250.field4111 = 0;
                if (class290.field4739 == class221.field3480) {
                    class221.field3480 = class274.field4460;
                } else {
                    class221.field3480 = class290.field4739;
                }
            }
            if (class199.field3195 == 1) {
                class202.field3275 = class44.field659.method471(22874, class4.field103, class221.field3480);
                class199.field3195 = 2;
            }
            if (class199.field3195 == 2) {
                if (class202.field3275.field4929 == 2) {
                    throw new IOException();
                }
                if (class202.field3275.field4929 != 1) {
                    return;
                }
                class18.field322 = new class63((Socket) class202.field3275.field4930, class44.field659);
                class202.field3275 = null;
                long var1 = class48.field712 = class162.method1114((byte) -111, class211.field3368);
                class311.field5027.field4458 = 0;
                class311.field5027.method1865(14, arg0 ^ 0xFFFFFFE9);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class311.field5027.method1865(var3, -93);
                class18.field322.method410(0, class311.field5027.field4441, 2, (byte) 76);
                if (class122.field1939 != null) {
                    class122.field1939.method113(arg0 - 118);
                }
                if (class80.field1296 != null) {
                    class80.field1296.method113(arg0 - 118);
                }
                int var4 = class18.field322.method415(38);
                if (class122.field1939 != null) {
                    class122.field1939.method113(0);
                }
                if (class80.field1296 != null) {
                    class80.field1296.method113(0);
                }
                if (var4 != 0) {
                    class191.field3120 = var4;
                    class199.field3195 = 0;
                    class18.field322.method416(64);
                    class18.field322 = null;
                    return;
                }
                class199.field3195 = 3;
            }
            if (class199.field3195 == 3) {
                if (class18.field322.method419((byte) -106) < 8) {
                    return;
                }
                class18.field322.method413(8, class229.field3584.field4441, -108, 0);
                class229.field3584.field4458 = 0;
                class180.field2975 = class229.field3584.method1834(3);
                int[] var5 = new int[] { 0, (int) (Math.random() * 9.9999999E7D), (int) (class180.field2975 >> 32), 0 };
                class311.field5027.field4458 = 0;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class180.field2975;
                class311.field5027.method1865(10, -120);
                class311.field5027.method1831(var5[0], 119690440);
                class311.field5027.method1831(var5[1], 119690440);
                class311.field5027.method1831(var5[2], 119690440);
                class311.field5027.method1831(var5[3], 119690440);
                class311.field5027.method1840((byte) 47, class162.method1114((byte) -119, class211.field3368));
                class311.field5027.method1859((byte) 58, class186.field3071);
                class311.field5027.method1818((byte) 62, class285.field4623, class292.field4789);
                class310.field5010.field4458 = 0;
                if (class238.field3741 == 40) {
                    class310.field5010.method1865(18, -118);
                } else {
                    class310.field5010.method1865(16, arg0 - 240);
                }
                class310.field5010.method1824(class311.field5027.field4458 + class113.method784(class179.field2966, (byte) -80) + 163, 28357);
                class310.field5010.method1831(549, 119690440);
                class310.field5010.method1865(class122.field1937, arg0 ^ 0x19);
                class310.field5010.method1865(class288.field4650 ? 1 : 0, -103);
                class310.field5010.method1865(0, -108);
                class310.field5010.method1865(class28.method215(15174), arg0 - 5);
                class310.field5010.method1824(class154.field2463, 28357);
                class310.field5010.method1824(class195.field3161, arg0 + 28239);
                class310.field5010.method1865(class275.field4503, 65);
                class274.method1861(class310.field5010, -14260);
                class310.field5010.method1859((byte) 58, class179.field2966);
                class310.field5010.method1831(class215.field3396, 119690440);
                class310.field5010.method1831(class243.method1656(-120), 119690440);
                class295.field4817 = true;
                class310.field5010.method1824(class104.field1644, 28357);
                class310.field5010.method1831(class93.field1492.method1141(arg0 ^ 0x73), arg0 + 119690322);
                class310.field5010.method1831(class205.field3299.method1141(5), 119690440);
                class310.field5010.method1831(class254.field4201.method1141(5), arg0 + 119690322);
                class310.field5010.method1831(class239.field3746.method1141(5), 119690440);
                class310.field5010.method1831(class53.field772.method1141(arg0 - 113), 119690440);
                class310.field5010.method1831(class175.field2919.method1141(5), 119690440);
                class310.field5010.method1831(class203.field3290.method1141(arg0 ^ 0x73), arg0 + 119690322);
                class310.field5010.method1831(class164.field2710.method1141(5), 119690440);
                class310.field5010.method1831(class118.field1844.method1141(5), 119690440);
                class310.field5010.method1831(class197.field3172.method1141(5), 119690440);
                class310.field5010.method1831(class61.field880.method1141(5), 119690440);
                class310.field5010.method1831(class221.field3482.method1141(arg0 - 113), 119690440);
                class310.field5010.method1831(class6.field151.method1141(5), arg0 + 119690322);
                class310.field5010.method1831(class217.field3416.method1141(5), arg0 ^ 0x72254BE);
                class310.field5010.method1831(class123.field1962.method1141(5), arg0 + 119690322);
                class310.field5010.method1831(class177.field2940.method1141(arg0 ^ 0x73), 119690440);
                class310.field5010.method1831(class268.field4337.method1141(5), 119690440);
                class310.field5010.method1831(class203.field3292.method1141(5), 119690440);
                class310.field5010.method1831(class191.field3105.method1141(5), 119690440);
                class310.field5010.method1831(class55.field815.method1141(5), arg0 + 119690322);
                class310.field5010.method1831(class203.field3283.method1141(5), 119690440);
                class310.field5010.method1831(class248.field4052.method1141(arg0 ^ 0x73), 119690440);
                class310.field5010.method1831(class83.field1334.method1141(5), 119690440);
                class310.field5010.method1831(class236.field3710.method1141(5), 119690440);
                class310.field5010.method1831(class35.field566.method1141(5), 119690440);
                class310.field5010.method1831(class242.field3837.method1141(5), arg0 ^ 0x72254BE);
                class310.field5010.method1831(class154.field2464.method1141(5), arg0 ^ 0x72254BE);
                class310.field5010.method1831(class15.field297.method1141(arg0 - 113), 119690440);
                class310.field5010.method1831(class200.field3200.method1141(arg0 - 113), arg0 ^ 0x72254BE);
                class310.field5010.method1836(class311.field5027.field4441, 0, -99, class311.field5027.field4458);
                class18.field322.method410(0, class310.field5010.field4441, class310.field5010.field4458, (byte) 76);
                class311.field5027.method2086(40, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class229.field3584.method2086(arg0 - 36, var5);
                class199.field3195 = 4;
            }
            if (arg0 != 118) {
                method1082(117);
            }
            if (class199.field3195 == 4) {
                if (class18.field322.method419((byte) -113) < 1) {
                    return;
                }
                int var7 = class18.field322.method415(arg0 - 30);
                if (var7 == 21) {
                    class199.field3195 = 7;
                } else if (var7 == 29) {
                    class199.field3195 = 10;
                } else if (var7 == 1) {
                    class199.field3195 = 5;
                    class191.field3120 = var7;
                    return;
                } else if (var7 == 2) {
                    class199.field3195 = 8;
                } else if (var7 == 15) {
                    class199.field3195 = 0;
                    class191.field3120 = var7;
                    return;
                } else if (var7 == 23 && class242.field3838 < 1) {
                    class199.field3195 = 1;
                    class250.field4111 = 0;
                    class242.field3838++;
                    class18.field322.method416(64);
                    class18.field322 = null;
                    return;
                } else {
                    class191.field3120 = var7;
                    class199.field3195 = 0;
                    class18.field322.method416(64);
                    class18.field322 = null;
                    return;
                }
            }
            if (class199.field3195 == 6) {
                class311.field5027.field4458 = 0;
                class311.field5027.method2081(false, 17);
                class18.field322.method410(0, class311.field5027.field4441, class311.field5027.field4458, (byte) 70);
                class199.field3195 = 4;
            } else if (class199.field3195 == 7) {
                if (class18.field322.method419((byte) -108) >= 1) {
                    class309.field5003 = (class18.field322.method415(83) + 3) * 60;
                    class199.field3195 = 0;
                    class191.field3120 = 21;
                    class18.field322.method416(64);
                    class18.field322 = null;
                }
            } else if (class199.field3195 != 10) {
                if (class199.field3195 == 8) {
                    if (class18.field322.method419((byte) -93) < 14) {
                        return;
                    }
                    class18.field322.method413(14, class229.field3584.field4441, arg0 ^ 0xFFFFFFE7, 0);
                    class229.field3584.field4458 = 0;
                    class117.field1796 = class229.field3584.method1849(255);
                    class27.field486 = class229.field3584.method1849(255);
                    class86.field1357 = class229.field3584.method1849(255) == 1;
                    class91.field1450 = class229.field3584.method1849(255) == 1;
                    class118.field1861 = class229.field3584.method1849(255) == 1;
                    class25.field457 = class229.field3584.method1849(255) == 1;
                    class237.field3729 = class229.field3584.method1849(255) == 1;
                    class41.field632 = class229.field3584.method1837(252);
                    class89.field1396 = class229.field3584.method1849(255) == 1;
                    class213.field3383 = class229.field3584.method1849(255) == 1;
                    class87.method611(arg0 - 118, class213.field3383);
                    class122.method835(false, class213.field3383);
                    class98.method700(class213.field3383, -128);
                    if (!class288.field4650) {
                        if ((!class86.field1357 || class118.field1861) && !class89.field1396) {
                            try {
                                class216.method1481(arg0 ^ 0xFFFFFFD5, class44.field659.field1105, "unzap");
                            } catch (Throwable var10) {
                            }
                        } else {
                            try {
                                class216.method1481(arg0 ^ 0xFFFFFFD5, class44.field659.field1105, "zap");
                            } catch (Throwable var9) {
                            }
                        }
                    }
                    try {
                        class216.method1481(-93, class44.field659.field1105, "loggedin");
                    } catch (Throwable var8) {
                    }
                    class88.field1369 = class229.field3584.method2084(-19884);
                    class271.field4366 = class229.field3584.method1837(252);
                    class199.field3195 = 9;
                }
                if (class199.field3195 == 9 && class18.field322.method419((byte) -125) >= class271.field4366) {
                    class229.field3584.field4458 = 0;
                    class18.field322.method413(class271.field4366, class229.field3584.field4441, -93, 0);
                    class199.field3195 = 0;
                    class191.field3120 = 2;
                    class250.method1700(0);
                    class296.field4824 = -1;
                    class272.method1803(2048, false);
                    class88.field1369 = -1;
                }
            } else if (class18.field322.method419((byte) -114) >= 1) {
                class163.field2650 = class18.field322.method415(106);
                class191.field3120 = 29;
                class199.field3195 = 0;
                class18.field322.method416(64);
                class18.field322 = null;
            }
        } catch (IOException var11) {
            if (class18.field322 != null) {
                class18.field322.method416(64);
                class18.field322 = null;
            }
            if (class242.field3838 < 1) {
                class199.field3195 = 1;
                class242.field3838++;
                class250.field4111 = 0;
                if (class290.field4739 == class221.field3480) {
                    class221.field3480 = class274.field4460;
                } else {
                    class221.field3480 = class290.field4739;
                }
            } else {
                class199.field3195 = 0;
                class191.field3120 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1076(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg5;
            arg5 = var7;
        }
        field2524++;
        int var8 = arg0 & 0x3;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return 1 + 7 - arg2 - arg1;
        } else {
            if (arg6 < 89) {
                field2570 = null;
            }
            return var8 == 2 ? 7 + 1 - arg3 - arg5 : arg1;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILv;Lv;)V")
    public final void method1077(int arg0, class158 arg1, class158 arg2) {
        this.field2564 = arg2.field2564;
        this.field2592 = arg1.field2592;
        this.field2590 = arg1.field2590;
        this.field2553 = arg2.field2553;
        this.field2533 = arg1.field2533;
        this.field2545 = arg2.field2545;
        this.field2534 = arg1.field2534;
        this.field2585 = arg2.field2585;
        this.field2531 = arg1.field2531;
        this.field2559 = arg1.field2559;
        this.field2527 = arg1.field2527;
        this.field2560 = arg1.field2560;
        this.field2520 = arg2.field2520;
        this.field2529 = arg1.field2529;
        this.field2582 = arg1.field2582;
        this.field2576 = arg1.field2576;
        this.field2532 = arg1.field2532;
        this.field2593 = arg1.field2593;
        this.field2555 = arg1.field2555;
        this.field2591 = arg2.field2591;
        this.field2565 = new String[5];
        field2561++;
        this.field2581 = arg1.field2581;
        if (arg0 >= -84) {
            this.field2531 = null;
        }
        this.field2528 = arg1.field2528;
        this.field2538 = arg1.field2538;
        this.field2543 = arg1.field2543;
        this.field2547 = arg1.field2547;
        this.field2526 = 0;
        this.field2544 = arg1.field2544;
        this.field2589 = arg1.field2589;
        this.field2574 = arg1.field2574;
        this.field2554 = arg1.field2554;
        this.field2568 = arg1.field2568;
        this.field2566 = arg2.field2566;
        this.field2549 = arg1.field2549;
        this.field2584 = arg1.field2584;
        if (arg1.field2565 != null) {
            for (int var4 = 0; var4 < 4; var4++) {
                this.field2565[var4] = arg1.field2565[var4];
            }
        }
        this.field2565[4] = class257.field4233;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZB)Lul;")
    public final class201 method1078(boolean arg0, byte arg1) {
        if (arg1 < 20) {
            this.method1073(-103, -99, -48);
        }
        field2542++;
        int var3 = this.field2534;
        int var4 = this.field2543;
        int var5 = this.field2547;
        if (arg0) {
            var3 = this.field2527;
            var5 = this.field2592;
            var4 = this.field2549;
        }
        if (var4 == -1) {
            return null;
        }
        class201 var6 = class201.method1380(class225.field3533, var4, 0);
        if (var3 != -1) {
            class201 var7 = class201.method1380(class225.field3533, var3, 0);
            if (var5 == -1) {
                class201[] var8 = new class201[] { var6, var7 };
                var6 = new class201(var8, 2);
            } else {
                class201 var9 = class201.method1380(class225.field3533, var5, 0);
                class201[] var10 = new class201[] { var6, var7, var9 };
                var6 = new class201(var10, 3);
            }
        }
        if (!arg0 && (this.field2582 != 0 || this.field2555 != 0 || this.field2533 != 0)) {
            var6.method1392(this.field2582, this.field2555, this.field2533);
        }
        if (arg0 && (this.field2544 != 0 || this.field2589 != 0 || this.field2528 != 0)) {
            var6.method1392(this.field2544, this.field2589, this.field2528);
        }
        if (this.field2568 != null) {
            for (int var11 = 0; var11 < this.field2568.length; var11++) {
                var6.method1403(this.field2568[var11], this.field2593[var11]);
            }
        }
        if (this.field2581 != null) {
            for (int var12 = 0; var12 < this.field2581.length; var12++) {
                var6.method1384(this.field2581[var12], this.field2590[var12]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(BZ)Z")
    public final boolean method1079(byte arg0, boolean arg1) {
        int var3 = this.field2538;
        int var4 = this.field2574;
        field2558++;
        if (arg1) {
            var3 = this.field2560;
            var4 = this.field2559;
        }
        if (var3 == -1) {
            return true;
        }
        if (arg0 != 39) {
            this.field2522 = 28;
        }
        boolean var5 = true;
        if (!class225.field3533.method1165(var3, 0, (byte) -108)) {
            var5 = false;
        }
        if (var4 != -1 && !class225.field3533.method1165(var4, 0, (byte) 120)) {
            var5 = false;
        }
        return var5;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/String;IZ)Ljava/lang/String;")
    public final String method1080(String arg0, int arg1, boolean arg2) {
        field2521++;
        if (this.field2529 == null) {
            return arg0;
        }
        if (!arg2) {
            method1082(-34);
        }
        class287 var4 = (class287) this.field2529.method371(-104, (long) arg1);
        return var4 == null ? arg0 : var4.field4646;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)Lv;")
    public final class158 method1081(byte arg0, int arg1) {
        int var3 = 36 % ((arg0 + 49) / 34);
        field2569++;
        if (this.field2586 != null && arg1 > 1) {
            int var4 = -1;
            for (int var5 = 0; var5 < 10; var5++) {
                if (arg1 >= this.field2552[var5] && this.field2552[var5] != 0) {
                    var4 = this.field2586[var5];
                }
            }
            if (var4 != -1) {
                return class107.method754(-20563, var4);
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    public static void method1082(int arg0) {
        field2563 = null;
        field2570 = null;
        if (arg0 > -95) {
            field2546 = -54;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lwa;ILai;IIZI)Lha;")
    public final class32 method1083(class280 arg0, int arg1, class91 arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field2567++;
        if (this.field2586 != null && arg1 > 1) {
            int var8 = -1;
            for (int var9 = 0; var9 < 10; var9++) {
                if (this.field2552[var9] <= arg1 && this.field2552[var9] != 0) {
                    var8 = this.field2586[var9];
                }
            }
            if (var8 != -1) {
                return class107.method754(-20563, var8).method1083(arg0, 1, arg2, arg3, arg4, false, arg6);
            }
        }
        class32 var10 = (class32) class161.field2633.method1879(8887, (long) this.field2557);
        if (arg5) {
            return null;
        }
        if (var10 == null) {
            class201 var11 = class201.method1380(class225.field3533, this.field2564, 0);
            if (var11 == null) {
                return null;
            }
            if (this.field2568 != null) {
                for (int var12 = 0; var12 < this.field2568.length; var12++) {
                    if (this.field2554 == null || var12 >= this.field2554.length) {
                        var11.method1403(this.field2568[var12], this.field2593[var12]);
                    } else {
                        var11.method1403(this.field2568[var12], class22.field425[this.field2554[var12] & 0xFF]);
                    }
                }
            }
            if (this.field2581 != null) {
                for (int var13 = 0; var13 < this.field2581.length; var13++) {
                    var11.method1384(this.field2581[var13], this.field2590[var13]);
                }
            }
            if (arg0 != null) {
                for (int var14 = 0; var14 < 5; var14++) {
                    if (class182.field3024[var14].length > arg0.field4559[var14]) {
                        var11.method1403(class81.field1306[var14], class182.field3024[var14][arg0.field4559[var14]]);
                    }
                    if (class66.field1080[var14].length > arg0.field4559[var14]) {
                        var11.method1403(class288.field4662[var14], class66.field1080[var14][arg0.field4559[var14]]);
                    }
                }
            }
            var10 = var11.method1391(this.field2571 + 64, this.field2523 + 768, -50, -10, -50);
            if (this.field2583 != 128 || this.field2575 != 128 || this.field2550 != 128) {
                var10.method47(this.field2583, this.field2575, this.field2550);
            }
            var10.field532 = true;
            class161.field2633.method1883((long) this.field2557, -83, var10);
        }
        if (arg2 != null) {
            var10 = arg2.method637(var10, arg4, arg6, arg3, (byte) 43);
        }
        return var10;
    }
}
