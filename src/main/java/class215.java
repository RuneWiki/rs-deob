import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class215 {

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "Z")
    public boolean field3012 = false;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "Z")
    public static boolean field3009 = true;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "[I")
    public static int[] field3010 = new int[4096];

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public int field3006;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public int field3007;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "[[S")
    public static short[][] field3017;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)I")
    public static final int method1430(int arg0, byte arg1) {
        field3016++;
        if (arg1 > -53) {
            field3017 = null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lrg;ZI)V")
    public static final void method1431(class366 arg0, boolean arg1, int arg2) {
        if (class244.field3441 != null) {
            try {
                class244.field3441.method802(-111, 0L);
                class244.field3441.method804(arg2, 24, arg0.field5076, 0);
            } catch (Exception var3) {
            }
        }
        if (arg1) {
            field3009 = false;
        }
        field3008++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public static void method1432(int arg0) {
        field3010 = null;
        field3017 = null;
        if (arg0 > -20) {
            method1432(76);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
    public static final void method1433(int arg0) {
        field3011++;
        if (arg0 == 18554) {
            class311.field4218 = new class162();
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILrg;I)V")
    public final void method1434(int arg0, class366 arg1, int arg2) {
        if (arg2 != 0) {
            this.method1434(-66, (class366) null, 43);
        }
        while (true) {
            int var4 = arg1.method2306((byte) 98);
            if (var4 == 0) {
                field3018++;
                return;
            }
            this.method1437(arg1, var4, arg0, -21215);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILea;ZZ)Lwn;")
    public final class77 method1435(int arg0, class58 arg1, boolean arg2, boolean arg3) {
        field3005++;
        long var5 = (long) (arg1.field744 << 19 | (arg3 ? 262144 : 0) | arg0 << 16 | this.field3006);
        class77 var7 = (class77) class442.field6208.method2529(0, var5);
        if (var7 != null) {
            return var7;
        } else if (class159.field2257.method1930((byte) 127, this.field3006)) {
            class96 var8 = class96.method739(class159.field2257, this.field3006, 0);
            if (var8 != null) {
                var8.field1320 = var8.field1319 = var8.field1323 = var8.field1322 = 0;
                if (arg3) {
                    var8.method752();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method740();
                }
            }
            if (arg2) {
                return null;
            }
            class77 var10 = arg1.method199(var8, true);
            if (var10 != null) {
                class442.field6208.method2527(-103, var5, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)Z")
    public final boolean method1436(byte arg0) {
        field3004++;
        return arg0 == 69 ? class159.field2257.method1930((byte) -128, this.field3006) : true;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lrg;III)V")
    private final void method1437(class366 arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1) {
            this.field3006 = arg0.method2297(13352);
        } else if (arg1 == 2) {
            this.field3007 = arg0.method2263((byte) 10);
        } else if (arg1 == 3) {
            this.field3012 = true;
        } else if (arg1 == 4) {
            this.field3006 = -1;
        }
        field3015++;
        if (arg3 != -21215) {
            method1432(-7);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLij;)I")
    public static final int method1438(byte arg0, class316 arg1) {
        field3013++;
        int var2 = -56 / ((arg0 + 43) / 55);
        int var3 = 0;
        if (arg1.method1930((byte) 112, class118.field1798)) {
            var3++;
        }
        if (arg1.method1930((byte) 26, class381.field5249)) {
            var3++;
        }
        return var3;
    }
}
