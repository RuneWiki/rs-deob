import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class30 {

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    private int field723 = 0;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    private int field713;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "[Lla;")
    private class68[] field718;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "[B")
    public static byte[] field709 = new byte[520];

    @OriginalMember(owner = "client!e", name = "m", descriptor = "Z")
    public static boolean field717 = false;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "Z")
    public static boolean field725 = false;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Lae;")
    private static class6 field714 = class64.method474(117, "Enter name of friend to add to list");

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Lae;")
    public static class6 field708 = field714;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "Lae;")
    public static class6 field728 = class64.method474(114, "@yel@");

    @OriginalMember(owner = "client!e", name = "r", descriptor = "Lp;")
    public static class95 field722 = new class95();

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public static int field732 = 0;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "Le;")
    public static class30 field731 = new class30(4096);

    @OriginalMember(owner = "client!e", name = "D", descriptor = "Lae;")
    public static class6 field734 = class64.method474(120, "Wordpack geladen)3");

    @OriginalMember(owner = "client!e", name = "F", descriptor = "Lae;")
    public static class6 field736 = class64.method474(109, " )2> @lre@");

    @OriginalMember(owner = "client!e", name = "G", descriptor = "Lae;")
    private static class6 field737 = class64.method474(104, "Loaded textures");

    @OriginalMember(owner = "client!e", name = "J", descriptor = "Lae;")
    private static class6 field740 = class64.method474(117, "Select");

    @OriginalMember(owner = "client!e", name = "I", descriptor = "Lae;")
    public static class6 field739 = class64.method474(114, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!e", name = "C", descriptor = "Lae;")
    private static class6 field733 = class64.method474(115, "Could not complete login)3");

    @OriginalMember(owner = "client!e", name = "N", descriptor = "Lae;")
    public static class6 field744 = field740;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "Lae;")
    public static class6 field741 = class64.method474(107, "(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3");

    @OriginalMember(owner = "client!e", name = "O", descriptor = "Lae;")
    public static class6 field745 = class64.method474(118, "Lade Ignorieren)2Liste)3)3)3");

    @OriginalMember(owner = "client!e", name = "M", descriptor = "Lae;")
    private static class6 field743 = class64.method474(107, "You have only just left another world)3");

    @OriginalMember(owner = "client!e", name = "E", descriptor = "Lae;")
    public static class6 field735 = field743;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "Lae;")
    public static class6 field746 = field733;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "Lae;")
    public static class6 field747 = field737;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "J")
    private long field716;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "J")
    public static long field742;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "Lbf;")
    public static class14 field730;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "Lla;")
    private class68 field707;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "Lla;")
    private class68 field721;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "[I")
    public static int[] field738;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(JB)V", line = 3)
    public static final void method268(long arg0, byte arg1) {
        field719++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 >= -32) {
            field741 = null;
        }
        for (int var3 = 0; var3 < class24.field613; var3++) {
            if (class64.field1402[var3] == arg0) {
                class42.field956++;
                class139.field3380 = true;
                class24.field613--;
                for (int var4 = var3; var4 < class24.field613; var4++) {
                    class64.field1402[var4] = class64.field1402[var4 + 1];
                }
                class111.field2660.method938((byte) 63, 250);
                class111.field2660.method639(true, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(JLla;B)V", line = 55)
    public final void method269(long arg0, class68 arg1, byte arg2) {
        if (arg1.field1497 != null) {
            arg1.method498(111);
        }
        if (arg2 > -2) {
            return;
        }
        field712++;
        class68 var5 = this.field718[(int) (arg0 & (long) (this.field713 - 1))];
        arg1.field1497 = var5.field1497;
        arg1.field1502 = var5;
        arg1.field1497.field1502 = arg1;
        arg1.field1502.field1497 = arg1;
        arg1.field1501 = arg0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)Lla;", line = 88)
    public final class68 method270(int arg0) {
        field729++;
        this.field723 = 0;
        int var2 = 104 / ((arg0 + 41) / 39);
        return this.method272(-1663);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B[BII)Lae;", line = 100)
    public static final class6 method271(byte arg0, byte[] arg1, int arg2, int arg3) {
        field710++;
        class6 var4 = new class6();
        var4.field93 = 0;
        var4.field114 = new byte[arg3];
        if (arg0 > -121) {
            method271((byte) 110, null, 47, -61);
        }
        for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
            if (arg1[var5] != 0) {
                var4.field114[var4.field93++] = arg1[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)Lla;", line = 134)
    private final class68 method272(int arg0) {
        field705++;
        if (this.field723 > 0 && this.field718[this.field723 - 1] != this.field721) {
            class68 var2 = this.field721;
            this.field721 = var2.field1502;
            return var2;
        }
        while (this.field713 > this.field723) {
            class68 var3 = this.field718[this.field723++].field1502;
            if (this.field718[this.field723 - 1] != var3) {
                this.field721 = var3.field1502;
                return var3;
            }
        }
        if (arg0 != -1663) {
            field743 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(I)V", line = 172)
    public class30(int arg0) {
        this.field713 = arg0;
        this.field718 = new class68[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class68 var3 = this.field718[var2] = new class68();
            var3.field1497 = var3;
            var3.field1502 = var3;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)Lla;", line = 193)
    public final class68 method273(byte arg0) {
        field706++;
        if (arg0 <= 61) {
            return null;
        } else if (this.field707 == null) {
            return null;
        } else {
            class68 var2 = this.field718[(int) (this.field716 & (long) (this.field713 - 1))];
            while (this.field707 != var2) {
                if (this.field707.field1501 == this.field716) {
                    class68 var3 = this.field707;
                    this.field707 = this.field707.field1502;
                    return var3;
                }
                this.field707 = this.field707.field1502;
            }
            this.field707 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V", line = 239)
    public static void method274(int arg0) {
        field722 = null;
        field730 = null;
        int var1 = 96 % ((-arg0 - 73) / 51);
        field738 = null;
        field741 = null;
        field747 = null;
        field708 = null;
        field739 = null;
        field745 = null;
        field735 = null;
        field746 = null;
        field731 = null;
        field740 = null;
        field733 = null;
        field743 = null;
        field709 = null;
        field737 = null;
        field728 = null;
        field736 = null;
        field744 = null;
        field734 = null;
        field714 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lmc;Z)V", line = 273)
    public static final void method275(class76 arg0, boolean arg1) {
        field711++;
        arg0.field1751 = 0;
        if (arg0.field1772 == 0) {
            arg0.field1774 = 1024;
        }
        if (arg0.field1772 == 1) {
            arg0.field1774 = 1536;
        }
        if (arg1) {
            field743 = null;
        }
        int var2 = arg0.field1727 - class5.field61;
        if (arg0.field1772 == 2) {
            arg0.field1774 = 0;
        }
        int var3 = arg0.field1777 * 64 + arg0.field1767 * 128;
        arg0.field1783 += (var3 - arg0.field1783) / var2;
        if (arg0.field1772 == 3) {
            arg0.field1774 = 512;
        }
        int var4 = arg0.field1742 * 128 + arg0.field1777 * 64;
        arg0.field1752 += (var4 - arg0.field1752) / var2;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BJ)Lla;", line = 312)
    public final class68 method276(byte arg0, long arg1) {
        this.field716 = arg1;
        field724++;
        class68 var4 = this.field718[(int) (arg1 & (long) (this.field713 - 1))];
        for (this.field707 = var4.field1502; this.field707 != var4; this.field707 = this.field707.field1502) {
            if (this.field707.field1501 == arg1) {
                class68 var5 = this.field707;
                this.field707 = this.field707.field1502;
                return var5;
            }
        }
        this.field707 = null;
        return arg0 == -19 ? null : null;
    }
}
