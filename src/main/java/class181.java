import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class181 extends class283 {

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
    private int field2814 = 204;

    @OriginalMember(owner = "client!mc", name = "bb", descriptor = "I")
    private int field2826 = 1024;

    @OriginalMember(owner = "client!mc", name = "eb", descriptor = "I")
    private int field2829 = 0;

    @OriginalMember(owner = "client!mc", name = "lb", descriptor = "I")
    private int field2836 = 409;

    @OriginalMember(owner = "client!mc", name = "hb", descriptor = "I")
    private int field2832 = 8;

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "I")
    private int field2821 = 81;

    @OriginalMember(owner = "client!mc", name = "ub", descriptor = "I")
    private int field2845 = 4;

    @OriginalMember(owner = "client!mc", name = "ib", descriptor = "I")
    private int field2833 = 1024;

    @OriginalMember(owner = "client!mc", name = "fb", descriptor = "Lna;")
    private static class26 field2830 = class69.method505("pt", (byte) -120);

    @OriginalMember(owner = "client!mc", name = "ab", descriptor = "[I")
    public static int[] field2825 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!mc", name = "mb", descriptor = "Lna;")
    private static class26 field2837 = class69.method505("en", (byte) -127);

    @OriginalMember(owner = "client!mc", name = "pb", descriptor = "Lna;")
    private static class26 field2840 = class69.method505("fr", (byte) -124);

    @OriginalMember(owner = "client!mc", name = "tb", descriptor = "S")
    public static short field2844 = 1;

    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "[Lna;")
    public static class26[] field2823 = new class26[100];

    @OriginalMember(owner = "client!mc", name = "vb", descriptor = "Lna;")
    private static class26 field2846 = class69.method505("de", (byte) -126);

    @OriginalMember(owner = "client!mc", name = "ob", descriptor = "[Lna;")
    public static class26[] field2839 = new class26[] { field2837, field2846, field2840, field2830 };

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
    private int field2819;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "I")
    private int field2820;

    @OriginalMember(owner = "client!mc", name = "db", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!mc", name = "gb", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!mc", name = "jb", descriptor = "I")
    private int field2834;

    @OriginalMember(owner = "client!mc", name = "kb", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!mc", name = "nb", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!mc", name = "qb", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!mc", name = "rb", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "Lmm;")
    public static class256 field2817;

    @OriginalMember(owner = "client!mc", name = "Z", descriptor = "Lve;")
    public static class266 field2824;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "Lna;")
    public static class26 field2815;

    @OriginalMember(owner = "client!mc", name = "cb", descriptor = "[I")
    private int[] field2827;

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "[[I")
    private int[][] field2822;

    @OriginalMember(owner = "client!mc", name = "sb", descriptor = "[[I")
    private int[][] field2843;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V", line = 7)
    public final void method130(int arg0) {
        field2828++;
        if (arg0 != 16251) {
            this.method130(-93);
        }
        this.method1252(0);
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V", line = 433)
    public class181() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(III)V", line = 25)
    public static final void method1249(int arg0, int arg1, int arg2) {
        field2835++;
        if (arg0 != -16207) {
            field2830 = (class26) null;
        }
        class120 var3 = class293.method2059(4, 7, arg1);
        var3.method833((byte) 33);
        var3.field1877 = arg2;
    }

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "(I)V", line = 48)
    public static void method1250(int arg0) {
        int var1 = -31 / ((-arg0 - 43) / 55);
        field2824 = null;
        field2846 = null;
        field2830 = null;
        field2840 = null;
        field2815 = null;
        field2825 = null;
        field2839 = null;
        field2823 = null;
        field2837 = null;
        field2817 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILwa;Z)V", line = 87)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field2845 = arg1.method642((byte) -60);
        } else if (arg0 == 1) {
            this.field2832 = arg1.method642((byte) -82);
        } else if (arg0 == 2) {
            this.field2836 = arg1.method576(1);
        } else if (arg0 == 3) {
            this.field2814 = arg1.method576(1);
        } else if (arg0 == 4) {
            this.field2833 = arg1.method576(1);
        } else if (arg0 == 5) {
            this.field2829 = arg1.method576(1);
        } else if (arg0 == 6) {
            this.field2821 = arg1.method576(1);
        } else if (arg0 == 7) {
            this.field2826 = arg1.method576(1);
        }
        field2842++;
        if (!arg2) {
            field2840 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIIII)V", line = 159)
    public static final void method1251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2841++;
        int var8 = arg2 + arg5;
        int var9 = arg5 + arg7;
        for (int var10 = arg2; var10 < var8; var10++) {
            class76.method543(class45.field710[var10], arg7, 125, arg6, arg0);
        }
        int var11 = arg3 - arg5;
        int var12 = arg6 - arg5;
        for (int var13 = arg3; var13 > var11; var13--) {
            class76.method543(class45.field710[var13], arg7, 103, arg6, arg0);
        }
        if (arg1 <= 118) {
            return;
        }
        for (int var14 = var8; var14 <= var11; var14++) {
            int[] var15 = class45.field710[var14];
            class76.method543(var15, arg7, 117, var9, arg0);
            class76.method543(var15, var9, 111, var12, arg4);
            class76.method543(var15, var12, -75, arg6, arg0);
        }
    }

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "(I)V", line = 207)
    private final void method1252(int arg0) {
        Random var2 = new Random((long) this.field2832);
        this.field2819 = 4096 / this.field2832;
        this.field2820 = this.field2821 / 2;
        this.field2822 = new int[this.field2832][this.field2845 + 1];
        int var3 = this.field2819 / 2;
        this.field2827 = new int[this.field2832 + 1];
        this.field2843 = new int[this.field2832][this.field2845];
        this.field2834 = 4096 / this.field2845;
        this.field2827[0] = arg0;
        int var4 = this.field2834 / 2;
        for (int var5 = 0; var5 < this.field2832; var5++) {
            if (var5 > 0) {
                int var6 = this.field2819;
                int var7 = (class24.method151((byte) 59, 4096, var2) - 2048) * this.field2814 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field2827[var5] = this.field2827[var5 - 1] + var8;
            }
            this.field2822[var5][0] = 0;
            for (int var9 = 0; var9 < this.field2845; var9++) {
                if (var9 > 0) {
                    int var10 = this.field2834;
                    int var11 = (class24.method151((byte) -1, 4096, var2) - 2048) * this.field2836 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field2822[var5][var9] = this.field2822[var5][var9 - 1] + var12;
                }
                this.field2843[var5][var9] = this.field2826 <= 0 ? 4096 : 4096 - class24.method151((byte) 33, this.field2826, var2);
            }
            this.field2822[var5][this.field2845] = 4096;
        }
        field2816++;
        this.field2827[this.field2832] = 4096;
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(B)V", line = 278)
    public static final void method1253(byte arg0) {
        class126.field1936++;
        field2838++;
        class114.field1789.method1431(0, 184);
        for (class174 var1 = (class174) class74.field1132.method1823(124); var1 != null; var1 = (class174) class74.field1132.method1825(-79)) {
            if (var1.field2722 == 0) {
                class113.method786(true, var1, false);
            }
        }
        if (arg0 < 83) {
            field2830 = (class26) null;
        }
        if (class142.field2165 != null) {
            class318.method2209(125, class142.field2165);
            class142.field2165 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)[I", line = 340)
    public final int[] method8(int arg0, byte arg1) {
        field2818++;
        int[] var3 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            int var4 = 0;
            int var5;
            for (var5 = class59.field955[arg0] + this.field2829; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field2832 > var4 && var5 >= this.field2827[var4]) {
                var4++;
            }
            int var6 = var4 - 1;
            int var7 = this.field2827[var4];
            boolean var8 = (var4 & 0x1) == 0;
            int var9 = this.field2827[var4 - 1];
            if (var9 + this.field2820 < var5 && (var7 - this.field2820) > var5) {
                for (int var10 = 0; var10 < class101.field1632; var10++) {
                    int var11 = 0;
                    int var12 = var8 ? this.field2833 : -this.field2833;
                    int var13;
                    for (var13 = class13.field184[var10] + (this.field2834 * var12 >> 12); var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field2845 > var11 && var13 >= this.field2822[var6][var11]) {
                        var11++;
                    }
                    int var14 = this.field2822[var6][var11];
                    int var15 = var11 - 1;
                    int var16 = this.field2822[var6][var15];
                    if ((var16 + this.field2820) < var13 && (var14 - this.field2820) > var13) {
                        var3[var10] = this.field2843[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class75.method538(var3, 0, class101.field1632, 0);
            }
        }
        int var17 = -48 % ((30 - arg1) / 36);
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)V", line = 444)
    public static final void method1254(byte arg0, int arg1) {
        class120 var2 = class293.method2059(4, 8, arg1);
        var2.method823(true);
        field2831++;
        if (arg0 != -42) {
            field2840 = (class26) null;
        }
    }
}
