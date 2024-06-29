import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class126 extends class5 {

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
    public int field2499 = 0;

    @OriginalMember(owner = "client!nh", name = "Z", descriptor = "Led;")
    public class43 field2511 = class1.field36;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "Led;")
    private static class43 field2503 = class191.method1219("Walk here", false);

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "Led;")
    public static class43 field2496 = field2503;

    @OriginalMember(owner = "client!nh", name = "Y", descriptor = "Ltd;")
    public static class176 field2510 = new class176(64);

    @OriginalMember(owner = "client!nh", name = "ab", descriptor = "Lbf;")
    public static class17 field2512 = new class17(4096);

    @OriginalMember(owner = "client!nh", name = "bb", descriptor = "I")
    public static int field2513 = 0;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
    public int field2494;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
    public int field2505;

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
    public int field2506;

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!nh", name = "W", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "[I")
    public int[] field2495;

    @OriginalMember(owner = "client!nh", name = "X", descriptor = "[I")
    public int[] field2509;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "[Led;")
    public class43[] field2497;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjg;)V")
    public final void method808(int arg0, class89 arg1) {
        field2501++;
        if (arg0 > -80) {
            method810(101);
        }
        while (true) {
            int var3 = arg1.method538((byte) -114);
            if (var3 == 0) {
                return;
            }
            this.method809(var3, -7906, arg1);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILjg;)V")
    private final void method809(int arg0, int arg1, class89 arg2) {
        field2504++;
        if (arg0 == 1) {
            this.field2494 = arg2.method538((byte) -107);
        } else if (arg0 == 2) {
            this.field2505 = arg2.method538((byte) -57);
        } else if (arg0 == 3) {
            this.field2511 = arg2.method541(arg1 + 8842);
        } else if (arg0 == 4) {
            this.field2506 = arg2.method545(-7436);
        } else if (arg0 == 5) {
            this.field2499 = arg2.method555(-1113627096);
            this.field2495 = new int[this.field2499];
            this.field2497 = new class43[this.field2499];
            for (int var5 = 0; var5 < this.field2499; var5++) {
                this.field2495[var5] = arg2.method545(-7436);
                this.field2497[var5] = arg2.method541(arg1 + 8842);
            }
        } else if (arg0 == 6) {
            this.field2499 = arg2.method555(-1113627096);
            this.field2509 = new int[this.field2499];
            this.field2495 = new int[this.field2499];
            for (int var4 = 0; var4 < this.field2499; var4++) {
                this.field2495[var4] = arg2.method545(-7436);
                this.field2509[var4] = arg2.method545(-7436);
            }
        }
        if (arg1 != -7906) {
            method812((byte) 86, 41, 83);
        }
    }

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)V")
    public static void method810(int arg0) {
        field2512 = null;
        if (arg0 != -19904) {
            field2513 = 40;
        }
        field2503 = null;
        field2496 = null;
        field2510 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IJ)V")
    public static final void method811(int arg0, long arg1) {
        field2507++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class73.field1457; var3++) {
            if (class78.field1546[var3] == arg1) {
                class114.field2176++;
                class73.field1457--;
                for (int var4 = var3; var4 < class73.field1457; var4++) {
                    class78.field1546[var4] = class78.field1546[var4 + 1];
                    class185.field3640[var4] = class185.field3640[var4 + 1];
                }
                class27.field479 = class200.field3940;
                class29.field522.method338(arg0 ^ 0xFFFFACB1, 253);
                class29.field522.method550(-110, arg1);
                break;
            }
        }
        if (arg0 != -21428) {
            field2512 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(BII)V")
    public static final void method812(byte arg0, int arg1, int arg2) {
        field2508++;
        if (class7.field147 != 2) {
            return;
        }
        class157.method996((class116.field2269 - class170.field3393 << 7) + class129.field2659, (-class83.field1641 + class142.field2941 << 7) + class114.field2218, 8, class161.field3255 * 2);
        if (arg0 != 90) {
            field2512 = null;
        }
        if (class200.field3933 > -1 && client.field559 % 20 < 10) {
            class136.field2834[0].method788(arg1 + class200.field3933 - 12, class19.field333 + arg2 + -28);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZILga;Lga;)V")
    public static final void method813(boolean arg0, int arg1, class58 arg2, class58 arg3) {
        class188.field3690 = arg0;
        if (arg1 == -1) {
            class32.field598 = arg2;
            field2502++;
            class124.field2463 = arg3;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lig;BLf;I)V")
    public static final void method814(class80 arg0, byte arg1, class48 arg2, int arg3) {
        if (arg1 != -123) {
            method813(false, -52, null, null);
        }
        field2498++;
        class201 var4 = new class201();
        var4.field1353 = arg3;
        var4.field3953 = arg2;
        var4.field3946 = arg0;
        var4.field3943 = 1;
        class118 var5 = class112.field2145;
        synchronized (class112.field2145) {
            class112.field2145.method756(25541, var4);
        }
        class36.method203(1);
    }
}
