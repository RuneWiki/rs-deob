import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class61 {

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    private int field841 = 0;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "[Lwd;")
    public class69[] field826;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field834 = 0;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field824 = -1;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "[Lpi;")
    public static class281[] field839 = new class281[4];

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field837 = -1;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    public static int field844 = 0;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "J")
    private long field835;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "Lwd;")
    private class69 field838;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "Lwd;")
    private class69 field843;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(JB)Lwd;")
    public final class69 method457(long arg0, byte arg1) {
        field831++;
        this.field835 = arg0;
        class69 var4 = this.field826[(int) (arg0 & (long) (this.field832 - 1))];
        for (this.field838 = var4.field960; this.field838 != var4; this.field838 = this.field838.field960) {
            if (this.field838.field962 == arg0) {
                class69 var5 = this.field838;
                this.field838 = this.field838.field960;
                return var5;
            }
        }
        if (arg1 == -115) {
            this.field838 = null;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public final void method458(int arg0) {
        if (arg0 <= 12) {
            return;
        }
        for (int var2 = 0; var2 < this.field832; var2++) {
            class69 var3 = this.field826[var2];
            while (true) {
                class69 var4 = var3.field960;
                if (var3 == var4) {
                    break;
                }
                var4.method544(124);
            }
        }
        this.field843 = null;
        this.field838 = null;
        field825++;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)I")
    public final int method459(int arg0) {
        field836++;
        if (arg0 != 17822) {
            this.field841 = -59;
        }
        return this.field832;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
    public static void method460(int arg0) {
        field839 = null;
        if (arg0 != -29383) {
            field839 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)Lwd;")
    public final class69 method461(byte arg0) {
        if (arg0 != -13) {
            field839 = null;
        }
        field830++;
        if (this.field841 > 0 && this.field826[this.field841 - 1] != this.field843) {
            class69 var2 = this.field843;
            this.field843 = var2.field960;
            return var2;
        }
        while (this.field841 < this.field832) {
            class69 var3 = this.field826[this.field841++].field960;
            if (this.field826[this.field841 - 1] != var3) {
                this.field843 = var3.field960;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)Lwd;")
    public final class69 method462(int arg0) {
        field828++;
        if (this.field838 == null) {
            return null;
        }
        class69 var2 = this.field826[(int) (this.field835 & (long) (this.field832 - 1))];
        while (this.field838 != var2) {
            if (this.field838.field962 == this.field835) {
                class69 var4 = this.field838;
                this.field838 = this.field838.field960;
                return var4;
            }
            this.field838 = this.field838.field960;
        }
        this.field838 = null;
        int var3 = -13 % ((arg0 + 81) / 34);
        return null;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)I")
    public final int method463(byte arg0) {
        int var2 = 53 % ((arg0 + 78) / 39);
        field842++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field832; var4++) {
            class69 var5 = this.field826[var4];
            class69 var6 = var5.field960;
            while (var5 != var6) {
                var6 = var6.field960;
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(I)V")
    public class61(int arg0) {
        this.field832 = arg0;
        this.field826 = new class69[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class69 var3 = this.field826[var2] = new class69();
            var3.field960 = var3;
            var3.field959 = var3;
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)V")
    public static final void method464(byte arg0) {
        class79.field1092.method1834(0);
        field840++;
        if (arg0 > -87) {
            field837 = -14;
        }
        class196.field3166.method1834(0);
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)Lwd;")
    public final class69 method465(byte arg0) {
        field827++;
        if (arg0 > -91) {
            field834 = 93;
        }
        this.field841 = 0;
        return this.method461((byte) -13);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(JLwd;B)V")
    public final void method466(long arg0, class69 arg1, byte arg2) {
        field829++;
        if (arg1.field959 != null) {
            arg1.method544(119);
        }
        class69 var5 = this.field826[(int) (arg0 & (long) (this.field832 - 1))];
        arg1.field962 = arg0;
        arg1.field959 = var5.field959;
        arg1.field960 = var5;
        arg1.field959.field960 = arg1;
        if (arg2 == 93) {
            arg1.field960.field959 = arg1;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)I")
    public static final int method467(int arg0, int arg1) {
        if (arg1 <= 99) {
            return -101;
        } else {
            field833++;
            return arg0 >>> 8;
        }
    }
}
