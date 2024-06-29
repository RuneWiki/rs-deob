import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class35 extends class89 {

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "[J")
    private long[] field654 = new long[10];

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
    private int field662 = 0;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
    private int field648 = 256;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
    private int field659 = 1;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "J")
    private long field667 = class68.method516(false);

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "Lsc;")
    public static class128 field656 = null;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "Lsc;")
    public static class128 field658 = class129.method1017(false, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "Lsc;")
    public static class128 field661 = class129.method1017(false, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "[I")
    public static int[] field652 = new int[100];

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "Lsc;")
    public static class128 field668 = class129.method1017(false, "Lade)3)3)3");

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "Lsc;")
    public static class128 field669 = class129.method1017(false, "::clientdrop");

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "Lrc;")
    public static class121 field655 = new class121();

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "Lsc;")
    private static class128 field671 = class129.method1017(false, "flash3:");

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "Lsc;")
    private static class128 field670 = class129.method1017(false, "Please wait)3)3)3");

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "Lsc;")
    public static class128 field674 = field671;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    public static int field675 = 0;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
    public static int field672 = 0;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "I")
    public static int field673 = 0;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "Lsc;")
    private static class128 field676 = class129.method1017(false, "Connection lost)3");

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "Lsc;")
    public static class128 field677 = field671;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "Lsc;")
    public static class128 field678 = field676;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "Lsc;")
    public static class128 field679 = field670;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    private int field651;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "[I")
    public static int[] field653;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BILnd;III)V")
    public static final void method252(byte arg0, int arg1, class94 arg2, int arg3, int arg4, int arg5) {
        field649++;
        class79 var6 = new class79();
        if (arg0 != -38) {
            return;
        }
        var6.field1771 = arg2.field2167;
        var6.field1775 = arg2.field2198 * 128;
        var6.field1779 = arg1 * 128;
        var6.field1752 = arg2.field2209;
        int var7 = arg2.field2195;
        var6.field1765 = arg2.field2158;
        int var8 = arg2.field2166;
        var6.field1774 = arg5 * 128;
        var6.field1778 = arg3;
        var6.field1764 = arg2.field2151;
        if (arg4 == 1 || arg4 == 3) {
            var7 = arg2.field2166;
            var8 = arg2.field2195;
        }
        var6.field1766 = (arg1 + var7) * 128;
        var6.field1773 = (arg5 + var8) * 128;
        if (arg2.field2164 != null) {
            var6.field1763 = arg2;
            var6.method598((byte) -127);
        }
        class1.field8.method926(5569, var6);
        if (var6.field1771 != null) {
            var6.field1769 = (int) ((double) (var6.field1765 - var6.field1752) * Math.random()) + var6.field1752;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static void method253(int arg0) {
        field655 = null;
        field669 = null;
        field679 = null;
        field656 = null;
        field670 = null;
        field676 = null;
        field677 = null;
        field658 = null;
        field678 = null;
        field661 = null;
        field674 = null;
        field653 = null;
        if (arg0 >= -54) {
            field678 = null;
        }
        field652 = null;
        field671 = null;
        field668 = null;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public static final void method254(int arg0) {
        field647++;
        if (arg0 != 10) {
            field676 = null;
        }
        class132.field3072.method919((byte) -104);
        class125.field2844.method919((byte) -104);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public static final void method255(byte arg0) {
        class46.field861.method384((byte) -64);
        class27.field530 = 1;
        if (arg0 < -47) {
            field660++;
            class20.field381 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)I")
    public final int method151(int arg0, int arg1, int arg2) {
        if (arg1 != 5000) {
            method256(24, 75);
        }
        field666++;
        int var4 = this.field648;
        this.field648 = 300;
        int var5 = this.field659;
        this.field659 = 1;
        this.field667 = class68.method516(false);
        if (this.field654[this.field651] == 0L) {
            this.field659 = var5;
            this.field648 = var4;
        } else if (this.field667 > this.field654[this.field651]) {
            this.field648 = (int) ((long) (arg0 * 2560) / (this.field667 - this.field654[this.field651]));
        }
        if (this.field648 < 25) {
            this.field648 = 25;
        }
        if (this.field648 > 256) {
            this.field648 = 256;
            this.field659 = (int) ((long) arg0 - (this.field667 - this.field654[this.field651]) / 10L);
        }
        if (this.field659 > arg0) {
            this.field659 = arg0;
        }
        this.field654[this.field651] = this.field667;
        this.field651 = (this.field651 + 1) % 10;
        if (this.field659 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field654[var6] != 0L) {
                    this.field654[var6] += this.field659;
                }
            }
        }
        if (this.field659 < arg2) {
            this.field659 = arg2;
        }
        class18.method164(false, (long) this.field659);
        int var7 = 0;
        while (this.field662 < 256) {
            var7++;
            this.field662 += this.field648;
        }
        this.field662 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
    public final void method152(boolean arg0) {
        field657++;
        if (arg0) {
            field652 = null;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field654[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Z")
    public static final boolean method256(int arg0, int arg1) {
        field665++;
        if (arg1 != 1) {
            field678 = null;
        }
        return (arg0 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(III)V")
    public static final void method257(int arg0, int arg1, int arg2) {
        class150.field3445++;
        field664++;
        class152.field3502.method507(-82, 25);
        class152.field3502.method652(arg0, 10114);
        if (arg2 != 23971) {
            field672 = -98;
        }
        class152.field3502.method660(arg1, -18562);
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class35() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field654[var1] = this.field667;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIII)V")
    public static final void method258(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        if (arg0 != -11) {
            field655 = null;
        }
        while (var5 < class117.field2657) {
            if (arg4 < field652[var5] + class2.field16[var5] && field652[var5] < arg1 + arg4 && class18.field336[var5] + class122.field2772[var5] > arg2 && class122.field2772[var5] < arg2 + arg3) {
                class7.field111[var5] = true;
            }
            var5++;
        }
        field650++;
    }
}
