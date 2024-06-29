import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class196 {

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Z")
    public boolean field2527 = false;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public int field2532 = -1;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public int field2525 = 127;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public int field2522 = 128;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public int field2531 = 8;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Z")
    public boolean field2540 = true;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public int field2533 = 1190717;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public int field2524 = -1;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public int field2535 = -1;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "Z")
    public boolean field2537 = true;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public int field2544 = 0;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public int field2529 = 16;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "[[Z")
    public static boolean[][] field2526 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!w", name = "b", descriptor = "[I")
    public static int[] field2523 = new int[13];

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Ldq;")
    public static class493 field2534 = new class493(95, 3);

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public static int field2545 = 2;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public int field2539;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Lfe;")
    public class403 field2542;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1210(byte[] arg0, int arg1) {
        field2543++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class318.method1875(arg0, arg1, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1211(int arg0, String arg1, int arg2) {
        field2528++;
        int var3 = class436.field6234;
        if (arg0 != 26438) {
            return;
        }
        int[] var4 = class12.field218;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class223 var7 = class387.field5107[var4[var6]];
            if (var7 != null && class23.field336 != var7 && var7.field2852 != null && var7.field2852.equalsIgnoreCase(arg1)) {
                if (arg2 == 1) {
                    class385.field5061++;
                    class282.method1669(class276.field3484, false);
                    class40.field511.method2748(var4[var6], 8016);
                    class40.field511.method2729(0, false);
                } else if (arg2 == 4) {
                    class282.method1669(class111.field1491, false);
                    class534.field7847++;
                    class40.field511.method2729(0, false);
                    class40.field511.method2759((byte) -128, var4[var6]);
                } else if (arg2 == 5) {
                    class282.method1669(class50.field661, false);
                    class187.field2449++;
                    class40.field511.method2759((byte) -69, var4[var6]);
                    class40.field511.method2788(0, 30017);
                } else if (arg2 == 6) {
                    class450.field6455++;
                    class282.method1669(class124.field1660, false);
                    class40.field511.method2759((byte) -40, var4[var6]);
                    class40.field511.method2765(0, false);
                } else if (arg2 == 7) {
                    class282.method1669(class10.field162, false);
                    class116.field1565++;
                    class40.field511.method2748(var4[var6], arg0 ^ 0x7816);
                    class40.field511.method2726(arg0 ^ 0xFFFFEEB3, 0);
                }
                var5 = true;
                break;
            }
        }
        if (!var5) {
            class445.method2622(true, class262.field3315.method1936(-26539, class11.field177) + arg1);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILfh;I)V")
    private final void method1212(int arg0, class463 arg1, int arg2) {
        if (arg2 == 1) {
            this.field2544 = class179.method1144(18609, arg1.method2738(-92));
        } else if (arg2 == 2) {
            this.field2535 = arg1.method2737(false);
        } else if (arg2 == 3) {
            this.field2535 = arg1.method2758((byte) 90);
            if (this.field2535 == 65535) {
                this.field2535 = -1;
            }
        } else if (arg2 == 5) {
            this.field2537 = false;
        } else if (arg2 == 7) {
            this.field2532 = class179.method1144(18609, arg1.method2738(arg0 - 17318));
        } else if (arg2 == 8) {
            this.field2542.field5742 = this.field2539;
        } else if (arg2 == 9) {
            this.field2522 = arg1.method2758((byte) 77) << 0;
        } else if (arg2 == 10) {
            this.field2540 = false;
        } else if (arg2 == 11) {
            this.field2531 = arg1.method2737(false);
        } else if (arg2 == 12) {
            this.field2527 = true;
        } else if (arg2 == 13) {
            this.field2533 = arg1.method2738(-54);
        } else if (arg2 == 14) {
            this.field2529 = arg1.method2737(false) << 0;
        } else if (arg2 == 15) {
            this.field2524 = arg1.method2758((byte) 82);
            if (this.field2524 == 65535) {
                this.field2524 = -1;
            }
        } else if (arg2 == 16) {
            this.field2525 = arg1.method2737(false);
        }
        field2530++;
        if (arg0 != 17270) {
            this.field2525 = 3;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public final void method1213(byte arg0) {
        this.field2531 = this.field2539 | this.field2531 << 8;
        field2536++;
        if (this.field2524 == -1) {
            this.field2524 = this.field2535;
        }
        if (arg0 >= -33) {
            this.field2533 = -75;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
    public static void method1214(boolean arg0) {
        field2534 = null;
        field2523 = null;
        field2526 = null;
        if (!arg0) {
            field2541 = 29;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lfh;I)V")
    public final void method1215(class463 arg0, int arg1) {
        field2538++;
        while (true) {
            int var3 = arg0.method2737(false);
            if (var3 == 0) {
                if (arg1 == -1) {
                    return;
                } else {
                    field2545 = -84;
                    return;
                }
            }
            this.method1212(17270, arg0, var3);
        }
    }
}
