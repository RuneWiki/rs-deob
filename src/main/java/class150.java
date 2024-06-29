import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class150 {

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public int field2631;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lpj;")
    public static class249 field2634 = class163.method1101(-64);

    @OriginalMember(owner = "client!v", name = "n", descriptor = "Loa;")
    public static class99 field2643 = class221.method1463(2844, "weiss:");

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field2647 = 0;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public int field2633;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public int field2637;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public int field2641;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Lkf;")
    public static class181 field2645;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Lsa;")
    public class262 field2632;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "[I")
    public int[] field2630;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "[I")
    public int[] field2635;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "[I")
    public int[] field2639;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "[I")
    public int[] field2640;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "[I")
    public int[] field2644;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "[I")
    public int[] field2648;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "[Lsa;")
    public class262[] field2636;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "[[I")
    public int[][] field2642;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "[[I")
    public int[][] field2649;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([BI)V")
    private final void method1002(byte[] arg0, int arg1) {
        field2638++;
        if (arg1 != -6963) {
            return;
        }
        class261 var3 = new class261(class250.method1620((byte) 61, arg0));
        int var4 = var3.method1693((byte) -120);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field2633 = var3.method1712(-4);
        } else {
            this.field2633 = 0;
        }
        int var5 = 0;
        int var6 = var3.method1693((byte) 97);
        int var7 = -1;
        this.field2637 = var3.method1740((byte) 57);
        this.field2648 = new int[this.field2637];
        for (int var8 = 0; var8 < this.field2637; var8++) {
            this.field2648[var8] = var5 += var3.method1740((byte) 112);
            if (this.field2648[var8] > var7) {
                var7 = this.field2648[var8];
            }
        }
        this.field2641 = var7 + 1;
        this.field2635 = new int[this.field2641];
        this.field2644 = new int[this.field2641];
        this.field2649 = new int[this.field2641][];
        this.field2639 = new int[this.field2641];
        this.field2640 = new int[this.field2641];
        if (var6 != 0) {
            this.field2630 = new int[this.field2641];
            for (int var9 = 0; var9 < this.field2641; var9++) {
                this.field2630[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field2637; var10++) {
                this.field2630[this.field2648[var10]] = var3.method1712(arg1 + 6959);
            }
            this.field2632 = new class262(this.field2630);
        }
        for (int var11 = 0; var11 < this.field2637; var11++) {
            this.field2635[this.field2648[var11]] = var3.method1712(-4);
        }
        for (int var12 = 0; var12 < this.field2637; var12++) {
            this.field2639[this.field2648[var12]] = var3.method1712(arg1 + 6959);
        }
        for (int var13 = 0; var13 < this.field2637; var13++) {
            this.field2644[this.field2648[var13]] = var3.method1740((byte) 112);
        }
        for (int var14 = 0; var14 < this.field2637; var14++) {
            int var21 = this.field2648[var14];
            int var22 = this.field2644[var21];
            int var23 = 0;
            int var24 = -1;
            this.field2649[var21] = new int[var22];
            for (int var25 = 0; var25 < var22; var25++) {
                int var26 = this.field2649[var21][var25] = var23 += var3.method1740((byte) 104);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field2640[var21] = var24 + 1;
            if (var24 + 1 == var22) {
                this.field2649[var21] = null;
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2642 = new int[var7 + 1][];
        this.field2636 = new class262[var7 + 1];
        for (int var15 = 0; var15 < this.field2637; var15++) {
            int var16 = this.field2648[var15];
            int var17 = this.field2644[var16];
            this.field2642[var16] = new int[this.field2640[var16]];
            for (int var18 = 0; var18 < this.field2640[var16]; var18++) {
                this.field2642[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field2649[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field2649[var16][var19];
                }
                this.field2642[var16][var20] = var3.method1712(-4);
            }
            this.field2636[var16] = new class262(this.field2642[var16]);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ltf;III)V")
    public static final void method1003(class107 arg0, int arg1, int arg2, int arg3) {
        field2646++;
        if (arg0.field1887 == 0) {
            arg0.field1921 = arg0.field1916;
        } else if (arg0.field1887 == 1) {
            arg0.field1921 = (arg3 - arg0.field1933) / 2 + arg0.field1916;
        } else if (arg0.field1887 == 2) {
            arg0.field1921 = arg3 - arg0.field1933 - arg0.field1916;
        } else if (arg0.field1887 == 3) {
            arg0.field1921 = arg0.field1916 * arg3 >> 14;
        } else if (arg0.field1887 == 4) {
            arg0.field1921 = (arg0.field1916 * arg3 >> 14) + (arg3 - arg0.field1933) / 2;
        } else {
            arg0.field1921 = arg3 - (arg0.field1916 * arg3 >> 14) - arg0.field1933;
        }
        if (arg0.field1932 == 0) {
            arg0.field1856 = arg0.field1914;
        } else if (arg0.field1932 == 1) {
            arg0.field1856 = (arg1 - arg0.field1793) / 2 + arg0.field1914;
        } else if (arg0.field1932 == 2) {
            arg0.field1856 = arg1 - arg0.field1793 - arg0.field1914;
        } else if (arg0.field1932 == 3) {
            arg0.field1856 = arg0.field1914 * arg1 >> 14;
        } else if (arg0.field1932 == 4) {
            arg0.field1856 = (arg0.field1914 * arg1 >> 14) + (arg1 - arg0.field1793) / 2;
        } else {
            arg0.field1856 = arg1 - (arg0.field1914 * arg1 >> 14) - arg0.field1793;
        }
        if (arg2 < 121) {
            field2645 = null;
        }
        if (!class278.field4881) {
            return;
        }
        if (client.method1066(arg0) == 0 && arg0.field1814 != 0) {
            return;
        }
        if (arg0.field1921 < 0) {
            arg0.field1921 = 0;
        } else if (arg0.field1933 + arg0.field1921 > arg3) {
            arg0.field1921 = arg3 - arg0.field1933;
        }
        if (arg0.field1856 < 0) {
            arg0.field1856 = 0;
            return;
        }
        if (arg1 < (arg0.field1856 + arg0.field1793)) {
            arg0.field1856 = arg1 - arg0.field1793;
            return;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
    public static void method1004(boolean arg0) {
        field2645 = null;
        if (arg0) {
            method1004(false);
        }
        field2643 = null;
        field2634 = null;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "([BI)V")
    public class150(byte[] arg0, int arg1) {
        this.field2631 = class33.method268(arg0.length, (byte) -39, arg0);
        if (this.field2631 != arg1) {
            throw new RuntimeException();
        }
        this.method1002(arg0, -6963);
    }
}
