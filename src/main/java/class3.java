import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 extends class105 {

    @OriginalMember(owner = "client!ab", name = "xb", descriptor = "I")
    private int field37;

    @OriginalMember(owner = "client!ab", name = "yb", descriptor = "I")
    private int field38;

    @OriginalMember(owner = "client!ab", name = "kb", descriptor = "I")
    private int field24;

    @OriginalMember(owner = "client!ab", name = "rb", descriptor = "I")
    private int field31;

    @OriginalMember(owner = "client!ab", name = "qb", descriptor = "I")
    private int field30;

    @OriginalMember(owner = "client!ab", name = "ub", descriptor = "I")
    private int field34;

    @OriginalMember(owner = "client!ab", name = "vb", descriptor = "Lnc;")
    private class93 field35;

    @OriginalMember(owner = "client!ab", name = "pb", descriptor = "I")
    private int field29;

    @OriginalMember(owner = "client!ab", name = "mb", descriptor = "I")
    private int field26;

    @OriginalMember(owner = "client!ab", name = "tb", descriptor = "Lje;")
    public static class67 field33 = class85.method592(255, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!ab", name = "zb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field39 = Calendar.getInstance();

    @OriginalMember(owner = "client!ab", name = "Ab", descriptor = "Lje;")
    public static class67 field40 = class85.method592(255, "<img=0>");

    @OriginalMember(owner = "client!ab", name = "Db", descriptor = "Lje;")
    public static class67 field43 = class85.method592(255, "headicons_pk");

    @OriginalMember(owner = "client!ab", name = "Bb", descriptor = "Lje;")
    public static class67 field41 = null;

    @OriginalMember(owner = "client!ab", name = "Eb", descriptor = "I")
    public static int field44 = 0;

    @OriginalMember(owner = "client!ab", name = "lb", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ab", name = "nb", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ab", name = "ob", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ab", name = "sb", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ab", name = "wb", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ab", name = "Cb", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(B)V")
    public static final void method12(byte arg0) {
        if (arg0 != -30) {
            return;
        }
        field36++;
        for (int var1 = -1; var1 < class155.field3540; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class151.field3464[var1];
            }
            class83 var6 = class85.field1885[var5];
            if (var6 != null && var6.field2948 > 0) {
                var6.field2948--;
                if (var6.field2948 == 0) {
                    var6.field2989 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class123.field2743; var2++) {
            int var3 = class45.field836[var2];
            class24 var4 = class152.field3479[var3];
            if (var4 != null && var4.field2948 > 0) {
                var4.field2948--;
                if (var4.field2948 == 0) {
                    var4.field2989 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZZ)V")
    public static final void method13(boolean arg0, boolean arg1) {
        field32++;
        if (class37.field667.field2957 >> 7 == class82.field1818 && class37.field667.field2963 >> 7 == class71.field1432) {
            class82.field1818 = 0;
        }
        int var2 = class155.field3540;
        if (arg1) {
            method12((byte) -112);
        }
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class83 var4;
            int var5;
            if (arg0) {
                var4 = class37.field667;
                var5 = 33538048;
            } else {
                var4 = class85.field1885[class151.field3464[var3]];
                var5 = class151.field3464[var3] << 14;
            }
            if (var4 != null && var4.method164((byte) -99)) {
                var4.field1849 = false;
                if ((class41.field773 && class155.field3540 > 50 || class155.field3540 > 200) && !arg0 && var4.field2960 == var4.field2954) {
                    var4.field1849 = true;
                }
                int var6 = var4.field2963 >> 7;
                int var7 = var4.field2957 >> 7;
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    if (var4.field1826 == null || var4.field1825 > class34.field627 || class34.field627 >= var4.field1837) {
                        if ((var4.field2957 & 0x7F) == 64 && (var4.field2963 & 0x7F) == 64) {
                            if (class131.field2870[var7][var6] == class117.field2636) {
                                continue;
                            }
                            class131.field2870[var7][var6] = class117.field2636;
                        }
                        var4.field1841 = class114.method924(var4.field2957, class128.field2817, var4.field2963, -112);
                        class134.field3044.method360(class128.field2817, var4.field2957, var4.field2963, var4.field1841, 60, var4, var4.field2992, var5, var4.field2959);
                    } else {
                        var4.field1849 = false;
                        var4.field1841 = class114.method924(var4.field2957, class128.field2817, var4.field2963, -98);
                        class134.field3044.method369(class128.field2817, var4.field2957, var4.field2963, var4.field1841, 60, var4, var4.field2992, var5, var4.field1847, var4.field1829, var4.field1850, var4.field1848);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)V")
    public static void method14(int arg0) {
        field33 = null;
        field41 = null;
        field40 = null;
        field39 = null;
        if (arg0 >= -6) {
            method15(-121, (byte) 41, 43, 38, 84);
        }
        field43 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBIII)V")
    public static final void method15(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field27++;
        if (class91.field1983 == 1) {
            class132.field2912[class149.field3410 / 100].method916(class16.field281 - 8, class81.field1787 - 8);
        }
        if (class91.field1983 == 2) {
            class132.field2912[class149.field3410 / 100 + 4].method916(class16.field281 - 8, class81.field1787 + -8);
        }
        class147.method1135(25859);
        if (arg1 != 118) {
            method14(77);
        }
        if (!class46.field855) {
            return;
        }
        int var5 = arg4 + 512 - 5;
        int var6 = arg2 + 20;
        class40.field714.method775(class49.method314(new class67[] { class68.field1385, class60.method420(class79.field1748, 28498) }, arg1 - 118), var5, var6, 16776960, -1);
        int var10 = var6 + 15;
        Runtime var7 = Runtime.getRuntime();
        int var8 = 16776960;
        int var9 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
        if (var9 > 32768 && class41.field773) {
            var8 = 16711680;
        }
        if (var9 > 65536 && !class41.field773) {
            var8 = 16711680;
        }
        class40.field714.method775(class49.method314(new class67[] { class130.field2855, class60.method420(var9, 28498), class59.field1179 }, 0), var5, var10, var8, -1);
        var6 = var10 + 15;
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)Lad;")
    public final class5 method16(int arg0) {
        if (arg0 != 0) {
            field25 = 32;
        }
        field28++;
        if (this.field35 != null) {
            int var2 = class34.field627 - this.field26;
            if (var2 > 100 && this.field35.field2088 > 0) {
                var2 = 100;
            }
            label51: {
                do {
                    do {
                        if (var2 <= this.field35.field2072[this.field29]) {
                            break label51;
                        }
                        var2 -= this.field35.field2072[this.field29];
                        this.field29++;
                    } while (this.field29 < this.field35.field2075.length);
                    this.field29 -= this.field35.field2088;
                } while (this.field29 >= 0 && this.field29 < this.field35.field2075.length);
                this.field35 = null;
            }
            this.field26 = class34.field627 - var2;
        }
        class47 var3 = class130.method993(this.field37, (byte) 102);
        if (var3.field919 != null) {
            var3 = var3.method305(false);
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field34 == 1 || this.field34 == 3) {
            var4 = var3.field875;
            var5 = var3.field931;
        } else {
            var4 = var3.field931;
            var5 = var3.field875;
        }
        int var6 = (var5 >> 1) + this.field30;
        int var7 = (var4 >> 1) + this.field38;
        int[][] var8 = class142.field3253[this.field31];
        int var9 = (this.field30 << 7) + (var5 << 6);
        int var10 = (var5 + 1 >> 1) + this.field30;
        int var11 = (var4 + 1 >> 1) + this.field38;
        int var12 = var8[var6][var7] + var8[var6][var11] + var8[var10][var7] + var8[var10][var11] >> 2;
        int var13 = (this.field38 << 7) + (var4 << 6);
        return var3.method299(this.field35, var13, var9, var8, this.field24, var12, (byte) -119, this.field29, this.field34);
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIIIIIIZLpa;)V")
    public class3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class105 arg8) {
        this.field37 = arg0;
        this.field38 = arg5;
        this.field24 = arg1;
        this.field31 = arg3;
        this.field30 = arg4;
        this.field34 = arg2;
        if (arg6 != -1) {
            this.field35 = class49.method316(arg6, false);
            this.field29 = 0;
            this.field26 = class34.field627 - 1;
            if (this.field35.field2084 == 0 && arg8 != null && arg8 instanceof class3) {
                class3 var10 = (class3) arg8;
                if (this.field35 == var10.field35) {
                    this.field29 = var10.field29;
                    this.field26 = var10.field26;
                    return;
                }
            }
            if (arg7 && this.field35.field2088 != -1) {
                this.field29 = (int) (Math.random() * (double) this.field35.field2075.length);
                this.field26 -= (int) (Math.random() * (double) this.field35.field2072[this.field29]);
                return;
            }
        }
    }
}
