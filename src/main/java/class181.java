import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class181 {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Z")
    public boolean field2827 = true;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public int field2830 = -1;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    private int field2837 = -1;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Z")
    public boolean field2838 = false;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
    private int field2855 = -1;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    private int field2848 = -1;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public int field2854 = -1;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "Z")
    public boolean field2858 = true;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    public int field2857 = -1;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "[Ljava/lang/String;")
    public String[] field2860 = new String[5];

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public int field2831 = 0;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
    private int field2852 = -1;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
    public int field2863 = -1;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "Z")
    public boolean field2859 = true;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    private int field2867 = -1;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public static int field2851 = 0;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Z")
    public static boolean field2833 = false;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2853 = null;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public static int field2846 = 0;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public int field2829;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public int field2839;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    private int field2840;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    private int field2845;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public int field2847;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    private int field2861;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    public int field2862;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
    private int field2864;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
    public int field2865;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
    public int field2868;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "Lrn;")
    public static class18 field2856;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Ldh;")
    public static class204 field2834;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Ljava/lang/String;")
    public String field2841;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "Ljava/lang/String;")
    public String field2844;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "[I")
    public int[] field2835;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "[[Lmi;")
    public static class125[][] field2866;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V", line = 10)
    public static final void method1401(boolean arg0) {
        if (arg0) {
            class170.field2689 = class72.field1087;
            class277.field4290 = class93.field1425;
            class37.field557 = class205.field3168;
        } else {
            class170.field2689 = class233.field3638;
            class277.field4290 = class121.field1924;
            class37.field557 = field2866;
        }
        class335.field5119 = class170.field2689.length;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 32)
    public static void method1402(int arg0) {
        field2834 = null;
        field2866 = (class125[][]) null;
        if (arg0 == -5) {
            field2853 = null;
            field2856 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)Z", line = 78)
    public final boolean method1403(boolean arg0) {
        field2832++;
        if (!arg0) {
            method1402(-45);
        }
        if (this.field2867 == -1 && this.field2837 == -1) {
            return true;
        }
        boolean var2 = false;
        int var3;
        if (this.field2867 == -1) {
            var3 = class305.method2195(this.field2837, (byte) 5);
        } else {
            var3 = class160.field2538[this.field2867];
        }
        if (this.field2840 > var3 || this.field2861 < var3) {
            return false;
        } else if (this.field2852 == -1 && this.field2848 == -1) {
            return true;
        } else {
            boolean var4 = false;
            int var5;
            if (this.field2852 == -1) {
                var5 = class305.method2195(this.field2848, (byte) 5);
            } else {
                var5 = class160.field2538[this.field2852];
            }
            return this.field2845 <= var5 && this.field2864 >= var5;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIB)V", line = 138)
    public static final void method1404(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2842++;
        int var5 = 71 % ((arg4 + 21) / 53);
        class138 var6 = class149.method1242(arg1, 0, 4);
        var6.method1153((byte) 50);
        var6.field2282 = arg0;
        var6.field2287 = arg3;
        var6.field2293 = arg2;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILug;)V", line = 194)
    private final void method1405(int arg0, int arg1, class25 arg2) {
        field2826++;
        if (arg0 == 1) {
            this.field2863 = arg2.method314((byte) 31);
        } else if (arg0 == 2) {
            this.field2854 = arg2.method314((byte) 119);
        } else if (arg0 == 3) {
            this.field2841 = arg2.method297((byte) -26);
        } else if (arg0 == 4) {
            this.field2868 = arg2.method265(true);
        } else if (arg0 == 5) {
            this.field2830 = arg2.method265(true);
        } else if (arg0 == 6) {
            this.field2831 = arg2.method281(-124);
        } else if (arg0 == 7) {
            int var6 = arg2.method281(94);
            if ((var6 & 0x2) == 2) {
                this.field2838 = true;
            }
            if ((var6 & 0x1) == 0) {
                this.field2858 = false;
            }
        } else if (arg0 == 8) {
            this.field2859 = arg2.method281(58) == 1;
        } else if (arg0 == 9) {
            this.field2837 = arg2.method314((byte) 126);
            if (this.field2837 == 65535) {
                this.field2837 = -1;
            }
            this.field2867 = arg2.method314((byte) 87);
            if (this.field2867 == 65535) {
                this.field2867 = -1;
            }
            this.field2840 = arg2.method262((byte) 23);
            this.field2861 = arg2.method262((byte) 72);
        } else if (arg0 >= 10 && arg0 <= 14) {
            this.field2860[arg0 - 10] = arg2.method297((byte) -41);
        } else if (arg0 == 15) {
            int var4 = arg2.method281(-126);
            this.field2835 = new int[var4 * 2];
            for (int var5 = 0; var5 < (var4 * 2); var5++) {
                this.field2835[var5] = arg2.method296(-95);
            }
            this.field2862 = arg2.method262((byte) 71);
            this.field2839 = arg2.method262((byte) 27);
        } else if (arg0 == 16) {
            this.field2827 = false;
        } else if (arg0 == 17) {
            this.field2844 = arg2.method297((byte) -92);
        } else if (arg0 == 18) {
            this.field2855 = arg2.method314((byte) 36);
        } else if (arg0 == 19) {
            this.field2857 = arg2.method314((byte) 52);
        } else if (arg0 == 20) {
            this.field2848 = arg2.method314((byte) 126);
            if (this.field2848 == 65535) {
                this.field2848 = -1;
            }
            this.field2852 = arg2.method314((byte) 114);
            if (this.field2852 == 65535) {
                this.field2852 = -1;
            }
            this.field2845 = arg2.method262((byte) 50);
            this.field2864 = arg2.method262((byte) 77);
        } else if (arg0 == 21) {
            this.field2847 = arg2.method262((byte) 110);
        } else if (arg0 == 22) {
            this.field2829 = arg2.method262((byte) 23);
        }
        if (arg1 != -1) {
            this.field2848 = -102;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZZI)Lqi;", line = 327)
    public final class246 method1406(boolean arg0, boolean arg1, int arg2) {
        field2850++;
        int var4 = -96 / ((-arg2 - 60) / 43);
        int var5 = arg1 ? this.field2854 : this.field2863;
        class246 var6 = (class246) class353.field5639.method654(-120, (long) ((arg1 ? 65536 : 0) | var5));
        if (var6 != null) {
            return var6;
        } else if (class184.field2889.method199(2209, var5)) {
            class77 var7 = class163.method1305(var5, class184.field2889, 0, 1);
            class246 var8;
            if (class240.field3737 && !arg0) {
                var8 = new class289(var7);
            } else {
                var8 = var7;
            }
            if (var8 != null) {
                var8.field3831 = 0;
                var8.field3832 = var8.field3827;
                var8.field3825 = var8.field3826;
                var8.field3828 = 0;
                class353.field5639.method652(-49, var8, (long) ((arg1 ? 65536 : 0) | var5));
            }
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)Lkk;", line = 368)
    public final class77 method1407(int arg0) {
        field2843++;
        class77 var2 = (class77) class353.field5639.method654(81, (long) (this.field2855 | 0x20000));
        if (var2 != null) {
            return var2;
        } else if (arg0 == 9921) {
            class184.field2889.method199(2209, this.field2855);
            class77 var3 = class163.method1305(this.field2855, class184.field2889, 0, 1);
            if (var3 != null) {
                var3.field3825 = var3.field3826;
                var3.field3832 = var3.field3827;
                var3.field3831 = 0;
                var3.field3828 = 0;
                class353.field5639.method652(50, var3, (long) (this.field2855 | 0x20000));
            }
            return var3;
        } else {
            return (class77) null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lug;Z)V", line = 396)
    public final void method1408(class25 arg0, boolean arg1) {
        field2828++;
        if (!arg1) {
            this.method1405(85, -30, (class25) null);
        }
        while (true) {
            int var3 = arg0.method281(-126);
            if (var3 == 0) {
                return;
            }
            this.method1405(var3, -1, arg0);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)Lbl;", line = 419)
    public static final class202 method1409(int arg0, int arg1, int arg2) {
        class329 var3 = class170.field2689[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class202 var4 = var3.field5064;
            var3.field5064 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z[Ljava/lang/Object;[J)V", line = 431)
    public static final void method1410(boolean arg0, Object[] arg1, long[] arg2) {
        if (!arg0) {
            method1401(true);
        }
        field2849++;
        class331.method2339(arg1, 0, arg2, arg2.length - 1, 27781);
    }
}
