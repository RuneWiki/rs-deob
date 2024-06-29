import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class40 {

    @OriginalMember(owner = "client!vba", name = "l", descriptor = "I")
    public int field448 = 0;

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "I")
    public int field442 = 0;

    @OriginalMember(owner = "client!vba", name = "t", descriptor = "Z")
    private boolean field456 = false;

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "[[S")
    private static short[][] field441 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

    @OriginalMember(owner = "client!vba", name = "k", descriptor = "[[S")
    private static short[][] field447 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!vba", name = "n", descriptor = "[[S")
    private static short[][] field450 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!vba", name = "m", descriptor = "[Lfba;")
    public static class25[] field449 = new class25[14];

    @OriginalMember(owner = "client!vba", name = "y", descriptor = "[F")
    public static float[] field461 = new float[4];

    @OriginalMember(owner = "client!vba", name = "w", descriptor = "Ljava/lang/String;")
    public static String field459 = null;

    @OriginalMember(owner = "client!vba", name = "A", descriptor = "[[[S")
    public static short[][][] field463 = new short[][][] { field441, field450, field447 };

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "I")
    public int field439;

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "I")
    public int field443;

    @OriginalMember(owner = "client!vba", name = "h", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "client!vba", name = "i", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "client!vba", name = "j", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!vba", name = "o", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!vba", name = "p", descriptor = "I")
    private int field452;

    @OriginalMember(owner = "client!vba", name = "q", descriptor = "I")
    public int field453;

    @OriginalMember(owner = "client!vba", name = "r", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!vba", name = "s", descriptor = "I")
    public int field455;

    @OriginalMember(owner = "client!vba", name = "u", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!vba", name = "v", descriptor = "I")
    public int field458;

    @OriginalMember(owner = "client!vba", name = "x", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!vba", name = "z", descriptor = "J")
    public long field462;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method239(int arg0, String arg1) {
        field451++;
        if (arg1 == null) {
            return;
        }
        if (!(class752.field10524 < 200 || class722.field10120) || class752.field10524 >= 200) {
            class490.method2948((byte) -55, class486.field6914.method2936(class489.field6978, -110), 4);
            String var2 = class486.field6915.method2936(class489.field6978, -76);
            if (var2 != null) {
                class490.method2948((byte) -55, var2, 4);
            }
            return;
        }
        String var3 = class102.method708(arg1, -21413);
        if (arg0 < 16) {
            method242(true);
        }
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class752.field10524; var4++) {
            String var9 = class102.method708(class19.field175[var4], -21413);
            if (var9 != null && var9.equals(var3)) {
                class490.method2948((byte) -55, arg1 + class486.field6942.method2936(class489.field6978, -110), 4);
                return;
            }
            if (class161.field1799[var4] != null) {
                String var10 = class102.method708(class161.field1799[var4], -21413);
                if (var10 != null && var10.equals(var3)) {
                    class490.method2948((byte) -55, arg1 + class486.field6942.method2936(class489.field6978, -64), 4);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class293.field3610; var5++) {
            String var7 = class102.method708(class178.field2089[var5], -21413);
            if (var7 != null && var7.equals(var3)) {
                class490.method2948((byte) -55, class486.field6947.method2936(class489.field6978, -52) + arg1 + class486.field6948.method2936(class489.field6978, -119), 4);
                return;
            }
            if (class484.field6891[var5] != null) {
                String var8 = class102.method708(class484.field6891[var5], -21413);
                if (var8 != null && var8.equals(var3)) {
                    class490.method2948((byte) -55, class486.field6947.method2936(class489.field6978, -128) + arg1 + class486.field6948.method2936(class489.field6978, 67), 4);
                    return;
                }
            }
        }
        if (class102.method708(class90.field937.field2157, -21413).equals(var3)) {
            class490.method2948((byte) -55, class486.field6945.method2936(class489.field6978, -127), 4);
            return;
        }
        class353.field4533++;
        class249 var6 = class289.method1715(class64.field652, 59, class41.field470);
        var6.field3016.method1460(class729.method4063(-1, arg1), 24710);
        var6.field3016.method1480(arg1, false);
        class510.method3017(var6, 91);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IZ)V")
    public static final void method240(int arg0, boolean arg1) {
        field446++;
        if (class352.field4528 == 1) {
            class676.field9567 = arg0;
        } else if (class352.field4528 == 2) {
            class122.field1266 = arg0;
        }
        if (!arg1) {
            field459 = null;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lig;I)V")
    public final void method241(class244 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1423(-110);
            if (var3 == 0) {
                if (arg1 != -1) {
                    return;
                }
                field454++;
                return;
            }
            this.method243(arg0, var3, arg1 - 32329);
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Z)V")
    public static void method242(boolean arg0) {
        field459 = null;
        field441 = null;
        field447 = null;
        field449 = null;
        field463 = null;
        if (arg0) {
            field463 = null;
        }
        field450 = null;
        field461 = null;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lig;II)V")
    private final void method243(class244 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field452 = arg0.method1476(5);
        } else if (arg1 == 2) {
            arg0.method1423(arg2 ^ 0x7E09);
        } else if (arg1 == 3) {
            this.field438 = arg0.method1438(arg2 + 32450);
            this.field455 = arg0.method1438(105);
            this.field440 = arg0.method1438(119);
        } else if (arg1 == 4) {
            this.field444 = arg0.method1423(-34);
            this.field439 = arg0.method1438(111);
        } else if (arg1 == 6) {
            this.field453 = arg0.method1423(-104);
        } else if (arg1 == 8) {
            this.field448 = 1;
        } else if (arg1 == 9) {
            this.field442 = 1;
        } else if (arg1 == 10) {
            this.field456 = true;
        }
        field457++;
        if (arg2 != -32330) {
            method245(-82, false);
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)V")
    public final void method244(byte arg0) {
        this.field443 = class260.field3229[this.field452 << 3];
        if (arg0 != -14) {
            return;
        }
        field437++;
        long var2 = (long) this.field438;
        long var4 = (long) this.field455;
        long var6 = (long) this.field440;
        this.field445 = (int) Math.sqrt((double) (var6 * var6 + (var2 * var2 + (var4 * var4))));
        if (this.field439 == 0) {
            this.field439 = 1;
        }
        if (this.field444 == 0) {
            this.field462 = 2147483647L;
        } else if (this.field444 == 1) {
            this.field462 = (this.field445 * 8 / this.field439);
            this.field462 *= this.field462;
        } else if (this.field444 == 2) {
            this.field462 = (this.field445 * 8 / this.field439);
        }
        if (this.field456) {
            this.field445 *= -1;
        }
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(IZ)V")
    public static final void method245(int arg0, boolean arg1) {
        field460++;
        if (arg1 && class656.field9357 != null) {
            class283.field3448 = class656.field9357.field957;
        } else {
            class283.field3448 = -1;
        }
        class656.field9357 = null;
        class354.field4540 = null;
        class284.field3471 = 0;
        class685.field9680 = null;
        if (arg0 != 8) {
            field447 = null;
        }
        class656.method3741();
        class656.field9361.method1728(29632);
        class173.field2041 = null;
        class219.field2532 = null;
        class656.field9364 = null;
        class465.field6643 = null;
        class298.field3715 = null;
        class313.field3883 = null;
        class114.field1192 = null;
        class99.field1035 = -1;
        class107.field1126 = null;
        class141.field1589 = null;
        class427.field6191 = null;
        class469.field6702 = -1;
        if (class656.field9360 != null) {
            class656.field9360.method2055(99);
            class656.field9360.method2056(true, 64, 128);
        }
        if (class656.field9356 != null) {
            class656.field9356.method2342(-63, 64, 64);
        }
        if (class656.field9355 != null) {
            class656.field9355.method3977(30, 64);
        }
        class628.field9019.method1410((byte) 96, 64);
    }
}
