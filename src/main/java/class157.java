import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class157 {

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    private int field2679 = 0;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    private int field2686 = -1;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Ljg;")
    private class303 field2677 = new class303();

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "Z")
    public boolean field2689 = false;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    private int field2678;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    private int field2680;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "[Loj;")
    private class327[] field2682;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "[[[I")
    private int[][][] field2684;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "Ljg;")
    public static class303 field2687 = new class303();

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "Ljf;")
    private static class229 field2690 = class212.method1457((byte) 121, "Loaded wordpack");

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public static int field2691 = 1;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "Ljf;")
    public static class229 field2696 = field2690;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "Ljf;")
    public static class229 field2688 = class212.method1457((byte) 68, "::errortest");

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public static int field2693 = -1;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "Lva;")
    public static class147 field2692;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "[Lrm;")
    public static class248[] field2695;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IB)V", line = 10)
    public static final void method1051(int arg0, byte arg1) {
        field2681++;
        int var2 = 5 / ((arg1 - 41) / 45);
        class122 var3 = class323.method2175(11, arg0, -25873);
        var3.method865(-53);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V", line = 21)
    public static void method1052(byte arg0) {
        field2695 = null;
        field2688 = null;
        if (arg0 <= 118) {
            method1053(29);
        }
        field2692 = null;
        field2696 = null;
        field2690 = null;
        field2687 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 36)
    public static final void method1053(int arg0) {
        if (arg0 == 0) {
            field2675++;
            class324.field5460.method230(true);
            class284.field4866.method230(true);
            class277.field4760.method230(true);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V", line = 52)
    public static final void method1054(byte arg0) {
        if (!class61.field1044) {
            class115.field2063[0] = 1003;
            class150.field2584[0] = class122.field2167;
            class124.field2176 = 1;
            if (class146.field2531 != 0) {
                class25.field461 = class235.field4070;
                class48.field875 = class217.field3732;
            } else if (class55.field969 == 0) {
                class25.field461 = class82.field1511;
                class48.field875 = class287.field4914;
            } else {
                class48.field875 = class222.field3791;
                class25.field461 = class60.field1033;
            }
            class143.field2498[0] = class331.field5638;
        }
        class164.method1111((long) class199.field3475);
        if (arg0 != 102) {
            field2690 = (class229) null;
        }
        if (class16.field263 != -1) {
            class120.method851(-1, class16.field263);
        }
        for (int var1 = 0; var1 < class241.field4250; var1++) {
            if (class244.field4341[var1]) {
                class107.field1883[var1] = true;
            }
            class201.field3510[var1] = class244.field4341[var1];
            class244.field4341[var1] = false;
        }
        class225.field3850 = -1;
        class96.field1703 = -1;
        class142.field2467 = null;
        if (class108.field1900) {
            class205.field3589 = true;
        }
        class211.field3628 = class199.field3475;
        class8.field80 = null;
        field2694++;
        if (class16.field263 != -1) {
            class241.field4250 = 0;
            class203.method1424(class16.field263, -1, class78.field1429, 0, 0, (byte) 103, class175.field3046, 0, 0);
        }
        if (class108.field1900) {
            class163.method1100();
        } else {
            class114.method818();
        }
        class260.method1851(0);
        if (class61.field1044) {
            class269.method1899(126);
        } else if (class142.field2467 != null) {
            class203.method1417(2, class142.field2467, class63.field1085, class59.field1020);
        } else if (class225.field3850 != -1) {
            class203.method1417(2, (class67) null, class96.field1703, class225.field3850);
        }
        if (class195.field3396 == 3) {
            for (int var2 = 0; var2 < class241.field4250; var2++) {
                if (class201.field3510[var2]) {
                    if (class108.field1900) {
                        class163.method1093(class305.field5167[var2], class162.field2764[var2], class124.field2178[var2], class143.field2499[var2], 16711935, 128);
                    } else {
                        class114.method822(class305.field5167[var2], class162.field2764[var2], class124.field2178[var2], class143.field2499[var2], 16711935, 128);
                    }
                } else if (class107.field1883[var2]) {
                    if (class108.field1900) {
                        class163.method1093(class305.field5167[var2], class162.field2764[var2], class124.field2178[var2], class143.field2499[var2], 16711680, 128);
                    } else {
                        class114.method822(class305.field5167[var2], class162.field2764[var2], class124.field2178[var2], class143.field2499[var2], 16711680, 128);
                    }
                }
            }
        }
        class201.method1408(class301.field5124.field1983, class16.field254, class146.field2540, (byte) -112, class301.field5124.field2028);
        class146.field2540 = 0;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)[[[I", line = 179)
    public final int[][][] method1055(int arg0) {
        field2676++;
        if (this.field2680 != this.field2678) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field2680; var2++) {
            this.field2682[var2] = class109.field1930;
        }
        return this.field2684;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)V", line = 201)
    public final void method1056(byte arg0) {
        field2685++;
        int var2 = 0;
        int var3 = -103 / ((arg0 + 12) / 32);
        while (this.field2680 > var2) {
            this.field2684[var2][0] = null;
            this.field2684[var2][1] = null;
            this.field2684[var2][2] = null;
            this.field2684[var2] = (int[][]) null;
            var2++;
        }
        this.field2684 = (int[][][]) null;
        this.field2682 = null;
        this.field2677.method2073(true);
        this.field2677 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)[[I", line = 233)
    public final int[][] method1057(int arg0, int arg1) {
        if (arg0 != -20449) {
            return (int[][]) ((int[][]) null);
        }
        field2683++;
        if (this.field2680 == this.field2678) {
            this.field2689 = this.field2682[arg1] == null;
            this.field2682[arg1] = class109.field1930;
            return this.field2684[arg1];
        } else if (this.field2680 == 1) {
            this.field2689 = this.field2686 != arg1;
            this.field2686 = arg1;
            return this.field2684[0];
        } else {
            class327 var3 = this.field2682[arg1];
            if (var3 == null) {
                this.field2689 = true;
                if (this.field2680 > this.field2679) {
                    var3 = new class327(arg1, this.field2679);
                    this.field2679++;
                } else {
                    class327 var4 = (class327) this.field2677.method2077(-25670);
                    var3 = new class327(arg1, var4.field5493);
                    this.field2682[var4.field5501] = null;
                    var4.method1747((byte) -98);
                }
                this.field2682[arg1] = var3;
            } else {
                this.field2689 = false;
            }
            this.field2677.method2074(var3, (byte) 92);
            return this.field2684[var3.field5493];
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(III)V", line = 336)
    public class157(int arg0, int arg1, int arg2) {
        this.field2678 = arg1;
        this.field2680 = arg0;
        this.field2682 = new class327[this.field2678];
        this.field2684 = new int[this.field2680][3][arg2];
    }
}
