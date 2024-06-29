import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class109 extends class57 {

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "[J")
    private long[] field2751 = new long[10];

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Z")
    public static boolean field2755 = false;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "Lmc;")
    public static class75 field2763 = class30.method234(true, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "[Lac;")
    public static class4[] field2766 = new class4[50];

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    public static int field2773 = 0;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field2759 = 50;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "[I")
    public static int[] field2756 = new int[field2759];

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "[I")
    public static int[] field2768 = new int[field2759];

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "[Lmc;")
    public static class75[] field2771 = new class75[100];

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "[I")
    public static int[] field2774 = new int[field2759];

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "[I")
    public static int[] field2760 = new int[field2759];

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "[I")
    public static int[] field2752 = new int[field2759];

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "[Lmc;")
    public static class75[] field2761 = new class75[field2759];

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "[I")
    public static int[] field2776 = new int[field2759];

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "[I")
    public static int[] field2775 = new int[field2759];

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    private int field2750;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    private int field2767;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
    private int field2770;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "I")
    private int field2777;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "J")
    private long field2753;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "Lka;")
    public static class61 field2764;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "[I")
    public static int[] field2778;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "[Laa;")
    public static class2[] field2765;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "[Lnc;")
    public static class81[] field2769;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 6)
    public static final void method893(byte arg0) {
        if (arg0 == 31) {
            field2758++;
            class101.field2617.method767(false);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V", line = 21)
    public static void method894(byte arg0) {
        field2763 = null;
        field2778 = null;
        field2756 = null;
        field2775 = null;
        int var1 = 30 % ((44 - arg0) / 59);
        field2771 = null;
        field2764 = null;
        field2768 = null;
        field2776 = null;
        field2761 = null;
        field2765 = null;
        field2760 = null;
        field2769 = null;
        field2752 = null;
        field2774 = null;
        field2766 = null;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V", line = 56)
    public final void method78(int arg0) {
        field2772++;
        if (arg0 > -68) {
            method896(63, -73, -44);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field2751[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)V", line = 78)
    public static final void method895(int arg0) {
        for (int var1 = 0; var1 < class79.field1993; var1++) {
            int var10002 = class36.field858[var1]--;
            if (class36.field858[var1] >= -10) {
                class4 var3 = field2766[var1];
                if (var3 == null) {
                    var3 = class4.method21(class10.field223, class98.field2464[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class36.field858[var1] += var3.method23();
                    field2766[var1] = var3;
                }
                if (class36.field858[var1] < 0) {
                    int var4 = class75.field1893;
                    if (class58.field1449[var1] != 0) {
                        int var5 = (class58.field1449[var1] & 0xFF) * 128;
                        int var6 = class58.field1449[var1] >> 16 & 0xFF;
                        int var7 = var6 * 128 + 64 - class52.field1315.field1233;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = class58.field1449[var1] >> 8 & 0xFF;
                        int var9 = var8 * 128 + 64 - class52.field1315.field1242;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var5 < var10) {
                            class36.field858[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class75.field1893 / var5;
                    }
                    class77 var11 = var3.method20().method664(class34.field792);
                    class123 var12 = class123.method968(var11, 100, var4);
                    var12.method976(class72.field1822[var1] - 1);
                    class110.field2792.method865(var12);
                    class36.field858[var1] = -100;
                }
            } else {
                class79.field1993--;
                for (int var2 = var1; var2 < class79.field1993; var2++) {
                    class98.field2464[var2] = class98.field2464[var2 + 1];
                    field2766[var2] = field2766[var2 + 1];
                    class72.field1822[var2] = class72.field1822[var2 + 1];
                    class36.field858[var2] = class36.field858[var2 + 1];
                    class58.field1449[var2] = class58.field1449[var2 + 1];
                }
                var1--;
            }
        }
        field2779++;
        if (arg0 >= class70.field1776) {
            return;
        }
        class70.field1776 -= 20;
        if (class70.field1776 < 0) {
            class70.field1776 = 0;
        }
        if (class70.field1776 == 0 && class27.field574 != 0 && class130.field3172 != -1) {
            class117.method937(class130.field3172, 0, true, false, class10.field224, 0, class27.field574);
            return;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BII)I", line = 194)
    public final int method79(byte arg0, int arg1, int arg2) {
        int var4 = -76 % ((-arg0 - 40) / 59);
        field2754++;
        int var5 = this.field2777;
        this.field2777 = 300;
        int var6 = this.field2770;
        this.field2770 = 1;
        this.field2753 = System.currentTimeMillis();
        if (this.field2751[this.field2767] == 0L) {
            this.field2770 = var6;
            this.field2777 = var5;
        } else if (this.field2753 > this.field2751[this.field2767]) {
            this.field2777 = (int) ((long) (arg2 * 2560) / (this.field2753 - this.field2751[this.field2767]));
        }
        if (this.field2777 < 25) {
            this.field2777 = 25;
        }
        if (this.field2777 > 256) {
            this.field2777 = 256;
            this.field2770 = (int) ((long) arg2 - (this.field2753 - this.field2751[this.field2767]) / 10L);
        }
        if (this.field2770 > arg2) {
            this.field2770 = arg2;
        }
        this.field2751[this.field2767] = this.field2753;
        this.field2767 = (this.field2767 + 1) % 10;
        if (this.field2770 > 1) {
            for (int var7 = 0; var7 < 10; var7++) {
                if (this.field2751[var7] != 0L) {
                    this.field2751[var7] += this.field2770;
                }
            }
        }
        if (arg1 > this.field2770) {
            this.field2770 = arg1;
        }
        class13.method86((long) this.field2770, 1);
        int var8 = 0;
        while (this.field2750 < 256) {
            this.field2750 += this.field2777;
            var8++;
        }
        this.field2750 &= 0xFF;
        return var8;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V", line = 272)
    public static final void method896(int arg0, int arg1, int arg2) {
        field2762++;
        class32 var3 = class112.field2847[class99.field2510][arg2][arg1];
        if (var3 == null) {
            class107.field2679.method225(class99.field2510, arg2, arg1);
            return;
        }
        int var4 = -99999999;
        class87 var5 = null;
        for (class87 var6 = (class87) var3.method248(32); var6 != null; var6 = (class87) var3.method252(72)) {
            class10 var11 = class43.method326(var6.field2153, 0);
            int var12 = var11.field187;
            if (var11.field186) {
                var12 = (var6.field2149 + 1) * var12;
            }
            if (var12 > var4) {
                var5 = var6;
                var4 = var12;
            }
        }
        if (arg0 > -97) {
            field2755 = true;
        }
        if (var5 == null) {
            class107.field2679.method225(class99.field2510, arg2, arg1);
            return;
        }
        var3.method246(var5, 0);
        class87 var7 = null;
        class87 var8 = null;
        for (class87 var9 = (class87) var3.method248(32); var9 != null; var9 = (class87) var3.method252(46)) {
            if (var5.field2153 != var9.field2153) {
                if (var8 == null) {
                    var8 = var9;
                }
                if (var8.field2153 != var9.field2153 && var7 == null) {
                    var7 = var9;
                }
            }
        }
        int var10 = (arg1 << 7) + arg2 + 1610612736;
        class107.field2679.method208(class99.field2510, arg2, arg1, class126.method1000(arg1 * 128 + 64, class99.field2510, false, arg2 * 128 + 64), var5, var10, var8, var7);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V", line = 410)
    public class109() {
        this.method80(64);
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V", line = 386)
    public final void method80(int arg0) {
        this.field2770 = 1;
        this.field2777 = 256;
        this.field2750 = 0;
        field2749++;
        this.field2753 = System.currentTimeMillis();
        if (arg0 != 64) {
            this.method79((byte) -108, 89, 103);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field2751[var2] = this.field2753;
        }
    }
}
