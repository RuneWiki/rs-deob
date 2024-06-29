import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class96 extends class124 {

    @OriginalMember(owner = "client!oa", name = "gb", descriptor = "[I")
    private int[] field2402 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "[S")
    private short[] field2394 = new short[6];

    @OriginalMember(owner = "client!oa", name = "jb", descriptor = "Z")
    public boolean field2405 = false;

    @OriginalMember(owner = "client!oa", name = "ob", descriptor = "[S")
    private short[] field2410 = new short[6];

    @OriginalMember(owner = "client!oa", name = "kb", descriptor = "I")
    public int field2406 = -1;

    @OriginalMember(owner = "client!oa", name = "ib", descriptor = "I")
    public static int field2404 = 0;

    @OriginalMember(owner = "client!oa", name = "ab", descriptor = "Lrd;")
    public static class117 field2396 = class95.method812("Startseite auf (WSpielkonto wiederherstellen(W)3", (byte) 8);

    @OriginalMember(owner = "client!oa", name = "db", descriptor = "[I")
    public static int[] field2399 = new int[5];

    @OriginalMember(owner = "client!oa", name = "lb", descriptor = "Lrd;")
    private static class117 field2407 = class95.method812("green:", (byte) 8);

    @OriginalMember(owner = "client!oa", name = "cb", descriptor = "Lrd;")
    public static class117 field2398 = field2407;

    @OriginalMember(owner = "client!oa", name = "tb", descriptor = "Lrd;")
    public static class117 field2415 = field2407;

    @OriginalMember(owner = "client!oa", name = "bb", descriptor = "La;")
    public static class1 field2397 = new class1();

    @OriginalMember(owner = "client!oa", name = "xb", descriptor = "I")
    public static int field2419 = 0;

    @OriginalMember(owner = "client!oa", name = "ub", descriptor = "Lrd;")
    private static class117 field2416 = class95.method812("Press (Wchange your password(W on front page)3", (byte) 8);

    @OriginalMember(owner = "client!oa", name = "yb", descriptor = "I")
    public static int field2420 = -1;

    @OriginalMember(owner = "client!oa", name = "zb", descriptor = "Lrd;")
    public static class117 field2421 = field2416;

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!oa", name = "eb", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!oa", name = "fb", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!oa", name = "mb", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!oa", name = "nb", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!oa", name = "pb", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!oa", name = "qb", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!oa", name = "rb", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!oa", name = "wb", descriptor = "Lra;")
    public static class114 field2418;

    @OriginalMember(owner = "client!oa", name = "vb", descriptor = "Laf;")
    public static class7 field2417;

    @OriginalMember(owner = "client!oa", name = "sb", descriptor = "Z")
    public static boolean field2414;

    @OriginalMember(owner = "client!oa", name = "hb", descriptor = "[I")
    private int[] field2403;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)Z")
    public final boolean method819(byte arg0) {
        if (arg0 != 78) {
            return true;
        }
        field2401++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2402[var3] != -1 && !class65.field1860.method525(this.field2402[var3], (byte) 45, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lbf;B)V")
    public final void method820(class14 arg0, byte arg1) {
        if (arg1 >= -93) {
            return;
        }
        while (true) {
            int var3 = arg0.method153(true);
            if (var3 == 0) {
                field2395++;
                return;
            }
            this.method823(15916, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
    public static final void method821(boolean arg0) {
        class104.field2588.method736((byte) 125);
        field2408++;
        int var1 = class104.field2588.method741(8, -71);
        if (class24.field678 > var1) {
            for (int var2 = var1; var2 < class24.field678; var2++) {
                class105.field2616[class79.field2123++] = class95.field2379[var2];
            }
        }
        if (arg0) {
            return;
        }
        if (class24.field678 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class24.field678 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class95.field2379[var3];
            class36 var5 = class93.field2334[var4];
            int var6 = class104.field2588.method741(1, 13);
            if (var6 == 0) {
                class95.field2379[class24.field678++] = var4;
                var5.field722 = class85.field2236;
            } else {
                int var7 = class104.field2588.method741(2, -118);
                if (var7 == 0) {
                    class95.field2379[class24.field678++] = var4;
                    var5.field722 = class85.field2236;
                    class135.field3229[class47.field1329++] = var4;
                } else if (var7 == 1) {
                    class95.field2379[class24.field678++] = var4;
                    var5.field722 = class85.field2236;
                    int var8 = class104.field2588.method741(3, 123);
                    var5.method268(-1, var8, false);
                    int var9 = class104.field2588.method741(1, 127);
                    if (var9 == 1) {
                        class135.field3229[class47.field1329++] = var4;
                    }
                } else if (var7 == 2) {
                    class95.field2379[class24.field678++] = var4;
                    var5.field722 = class85.field2236;
                    int var10 = class104.field2588.method741(3, -120);
                    var5.method268(-1, var10, true);
                    int var11 = class104.field2588.method741(3, 25);
                    var5.method268(-1, var11, true);
                    int var12 = class104.field2588.method741(1, 118);
                    if (var12 == 1) {
                        class135.field3229[class47.field1329++] = var4;
                    }
                } else if (var7 == 3) {
                    class105.field2616[class79.field2123++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)Lbc;")
    public final class11 method822(int arg0) {
        field2412++;
        class11[] var2 = new class11[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2402[var4] != -1) {
                var2[var3++] = class11.method79(class65.field1860, this.field2402[var4], 0);
            }
        }
        if (arg0 != -61) {
            return null;
        }
        class11 var5 = new class11(var2, var3);
        for (int var6 = 0; var6 < 6 && this.field2410[var6] != 0; var6++) {
            var5.method96(this.field2410[var6], this.field2394[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILbf;)V")
    private final void method823(int arg0, int arg1, class14 arg2) {
        field2411++;
        if (arg1 == 1) {
            this.field2406 = arg2.method153(true);
        } else if (arg1 == 2) {
            int var4 = arg2.method153(true);
            this.field2403 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2403[var5] = arg2.method138((byte) 77);
            }
        } else if (arg1 == 3) {
            this.field2405 = true;
        } else if (arg1 >= 40 && arg1 < 50) {
            this.field2410[arg1 - 40] = (short) arg2.method138((byte) 107);
        } else if (arg1 >= 50 && arg1 < 60) {
            this.field2394[arg1 - 50] = (short) arg2.method138((byte) 95);
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2402[arg1 - 60] = arg2.method138((byte) 95);
        }
        if (arg0 != 15916) {
            method824((byte) -114);
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)V")
    public static void method824(byte arg0) {
        field2397 = null;
        field2399 = null;
        field2396 = null;
        field2416 = null;
        if (arg0 != 26) {
            field2418 = null;
        }
        field2415 = null;
        field2417 = null;
        field2418 = null;
        field2398 = null;
        field2407 = null;
        field2421 = null;
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)Lbc;")
    public final class11 method825(int arg0) {
        field2413++;
        if (this.field2403 == null) {
            return null;
        }
        class11[] var2 = new class11[this.field2403.length];
        if (arg0 != 18489) {
            this.field2405 = false;
        }
        for (int var3 = 0; var3 < this.field2403.length; var3++) {
            var2[var3] = class11.method79(class65.field1860, this.field2403[var3], 0);
        }
        class11 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class11(var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field2410[var5] != 0; var5++) {
            var4.method96(this.field2410[var5], this.field2394[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)Z")
    public final boolean method826(int arg0) {
        field2400++;
        if (this.field2403 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field2403.length; var3++) {
            if (!class65.field1860.method525(this.field2403[var3], (byte) 45, 0)) {
                var2 = false;
            }
        }
        return var2;
    }
}
