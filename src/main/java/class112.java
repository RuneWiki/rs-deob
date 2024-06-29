import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class112 extends class46 {

    @OriginalMember(owner = "client!qa", name = "fb", descriptor = "I")
    private int field2516 = 128;

    @OriginalMember(owner = "client!qa", name = "db", descriptor = "I")
    private int field2514 = 0;

    @OriginalMember(owner = "client!qa", name = "gb", descriptor = "I")
    private int field2517 = 0;

    @OriginalMember(owner = "client!qa", name = "wb", descriptor = "I")
    private int field2533 = 0;

    @OriginalMember(owner = "client!qa", name = "vb", descriptor = "I")
    private int field2532 = 128;

    @OriginalMember(owner = "client!qa", name = "Eb", descriptor = "I")
    public int field2541 = -1;

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "Lsc;")
    public static class128 field2509 = class129.method1017(false, "weiss:");

    @OriginalMember(owner = "client!qa", name = "hb", descriptor = "Lsc;")
    private static class128 field2518 = class129.method1017(false, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!qa", name = "bb", descriptor = "Lsc;")
    public static class128 field2512 = class129.method1017(false, "headicons_pk");

    @OriginalMember(owner = "client!qa", name = "pb", descriptor = "Z")
    public static boolean field2526 = false;

    @OriginalMember(owner = "client!qa", name = "lb", descriptor = "Lsc;")
    private static class128 field2522 = class129.method1017(false, "Error connecting to server)3");

    @OriginalMember(owner = "client!qa", name = "eb", descriptor = "Lsc;")
    public static class128 field2515 = field2518;

    @OriginalMember(owner = "client!qa", name = "Bb", descriptor = "Lsc;")
    public static class128 field2538 = field2522;

    @OriginalMember(owner = "client!qa", name = "zb", descriptor = "Lsc;")
    private static class128 field2536 = class129.method1017(false, "Loaded sprites");

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "Lsc;")
    public static class128 field2508 = class129.method1017(false, "::errortest");

    @OriginalMember(owner = "client!qa", name = "kb", descriptor = "Lsc;")
    public static class128 field2521 = field2536;

    @OriginalMember(owner = "client!qa", name = "nb", descriptor = "I")
    public static int field2524 = 0;

    @OriginalMember(owner = "client!qa", name = "Db", descriptor = "Lrb;")
    public static class120 field2540 = new class120(100);

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "I")
    public int field2510;

    @OriginalMember(owner = "client!qa", name = "ab", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!qa", name = "ib", descriptor = "I")
    private int field2519;

    @OriginalMember(owner = "client!qa", name = "jb", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!qa", name = "sb", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!qa", name = "tb", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!qa", name = "xb", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!qa", name = "yb", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!qa", name = "Cb", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!qa", name = "ub", descriptor = "J")
    public static long field2531;

    @OriginalMember(owner = "client!qa", name = "mb", descriptor = "Lsb;")
    public static class127 field2523;

    @OriginalMember(owner = "client!qa", name = "cb", descriptor = "Li;")
    public static class56 field2513;

    @OriginalMember(owner = "client!qa", name = "ob", descriptor = "[S")
    private short[] field2525;

    @OriginalMember(owner = "client!qa", name = "qb", descriptor = "[S")
    private short[] field2527;

    @OriginalMember(owner = "client!qa", name = "rb", descriptor = "[S")
    private short[] field2528;

    @OriginalMember(owner = "client!qa", name = "Ab", descriptor = "[S")
    private short[] field2537;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)Llb;")
    public final class78 method858(int arg0, int arg1) {
        class78 var3 = (class78) class46.field854.method917((long) this.field2510, -1);
        field2507++;
        if (arg1 > -86) {
            return null;
        }
        if (var3 == null) {
            class136 var4 = class136.method1108(class44.field831, this.field2519, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field2527 != null) {
                for (int var5 = 0; var5 < this.field2527.length; var5++) {
                    var4.method1111(this.field2527[var5], this.field2525[var5]);
                }
            }
            if (this.field2528 != null) {
                for (int var6 = 0; var6 < this.field2528.length; var6++) {
                    var4.method1112(this.field2528[var6], this.field2537[var6]);
                }
            }
            var3 = var4.method1096(this.field2533 + 64, 850 - -this.field2514, -30, -50, -30);
            class46.field854.method913((long) this.field2510, var3, (byte) -65);
        }
        class78 var7;
        if (this.field2541 == -1 || arg0 == -1) {
            var7 = var3.method579(true);
        } else {
            var7 = class70.method527(12, this.field2541).method1085(var3, (byte) 95, arg0);
        }
        if (this.field2532 != 128 || this.field2516 != 128) {
            var7.method575(this.field2532, this.field2516, this.field2532);
        }
        if (this.field2517 != 0) {
            if (this.field2517 == 90) {
                var7.method586();
            }
            if (this.field2517 == 180) {
                var7.method586();
                var7.method586();
            }
            if (this.field2517 == 270) {
                var7.method586();
                var7.method586();
                var7.method586();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILmc;)V")
    public final void method859(int arg0, class86 arg1) {
        while (true) {
            int var3 = arg1.method646(-15447);
            if (var3 == 0) {
                if (arg0 != -27751) {
                    this.method859(-42, null);
                }
                field2520++;
                return;
            }
            this.method862(var3, arg1, -13589);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BI)V")
    public static final void method860(byte arg0, int arg1) {
        if (arg0 > -120) {
            return;
        }
        field2534++;
        class159 var2 = (class159) class46.field858.method969((long) arg1, -91);
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field3641.length; var3++) {
                var2.field3641[var3] = -1;
                var2.field3647[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)Lvc;")
    public static final class149 method861(boolean arg0, int arg1) {
        field2530++;
        class149 var2 = (class149) class55.field1224.method917((long) arg1, -1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class25.field498.method1023(arg1, 14, (byte) -35);
        if (!arg0) {
            method861(false, 63);
        }
        class149 var4 = new class149();
        if (var3 != null) {
            var4.method1188((byte) 77, new class86(var3));
        }
        class55.field1224.method913((long) arg1, var4, (byte) -67);
        return var4;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILmc;I)V")
    private final void method862(int arg0, class86 arg1, int arg2) {
        if (arg0 == 1) {
            this.field2519 = arg1.method632((byte) -80);
        } else if (arg0 == 2) {
            this.field2541 = arg1.method632((byte) -80);
        } else if (arg0 == 4) {
            this.field2532 = arg1.method632((byte) -80);
        } else if (arg0 == 5) {
            this.field2516 = arg1.method632((byte) -80);
        } else if (arg0 == 6) {
            this.field2517 = arg1.method632((byte) -80);
        } else if (arg0 == 7) {
            this.field2533 = arg1.method646(-15447);
        } else if (arg0 == 8) {
            this.field2514 = arg1.method646(-15447);
        } else if (arg0 == 40) {
            int var6 = arg1.method646(-15447);
            this.field2527 = new short[var6];
            this.field2525 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2527[var7] = (short) arg1.method632((byte) -80);
                this.field2525[var7] = (short) arg1.method632((byte) -80);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method646(-15447);
            this.field2528 = new short[var4];
            this.field2537 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2528[var5] = (short) arg1.method632((byte) -80);
                this.field2537[var5] = (short) arg1.method632((byte) -80);
            }
        }
        if (arg2 != -13589) {
            field2518 = null;
        }
        field2511++;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public static void method863(int arg0) {
        field2508 = null;
        field2536 = null;
        field2515 = null;
        field2512 = null;
        field2521 = null;
        field2540 = null;
        field2523 = null;
        field2513 = null;
        field2522 = null;
        if (arg0 >= -18) {
            method860((byte) 27, -94);
        }
        field2518 = null;
        field2538 = null;
        field2509 = null;
    }
}
