import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class29 extends class136 {

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "La;")
    public static class4 field821 = new class4(4096);

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "Lpd;")
    private static class94 field834 = class28.method249(-54, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "Lpd;")
    public static class94 field833 = class28.method249(103, " x ");

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "Lpd;")
    public static class94 field835 = class28.method249(-60, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "Lpd;")
    public static class94 field840 = class28.method249(118, "Einloggen");

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "Lpd;")
    public static class94 field836 = field834;

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "Lpd;")
    public static class94 field837 = class28.method249(99, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "Lpd;")
    public static class94 field839 = class28.method249(-74, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!ed", name = "Y", descriptor = "Lpd;")
    public static class94 field842 = class28.method249(-94, "m");

    @OriginalMember(owner = "client!ed", name = "Z", descriptor = "[I")
    public static int[] field843 = new int[32];

    @OriginalMember(owner = "client!ed", name = "ab", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!ed", name = "bb", descriptor = "[I")
    public static int[] field845;

    @OriginalMember(owner = "client!ed", name = "cb", descriptor = "Lpd;")
    public static class94 field846;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
    public int field817;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public int field819;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "I")
    public int field823;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
    public int field824;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    public int field825;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
    public int field828;

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public int field830;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    public int field831;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!ed", name = "X", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "Lec;")
    public class27 field822;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "Lie;")
    public class53 field818;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "Lie;")
    public class53 field827;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "[I")
    public int[] field820;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field843[var1] = var0 - 1;
            var0 += var0;
        }
        field844 = 0;
        field845 = new int[1000];
        field846 = class28.method249(-112, "(U3");
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILs;I)Lc;", line = 5)
    public static final class16 method254(int arg0, int arg1, class111 arg2, int arg3) {
        field829++;
        if (arg0 != 33538048) {
            method257(null, -22, null);
        }
        return class43.method321(arg3, arg1, arg2, -12404) ? class76.method567((byte) -13) : null;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)V", line = 25)
    public final void method255(boolean arg0) {
        field838++;
        int var2 = this.field817;
        class27 var3 = this.field822.method247(false);
        if (!arg0) {
            field833 = null;
        }
        if (var3 == null) {
            this.field841 = 0;
            this.field825 = 0;
            this.field817 = -1;
            this.field831 = 0;
            this.field820 = null;
        } else {
            this.field831 = var3.field717;
            this.field841 = var3.field758 * 128;
            this.field817 = var3.field769;
            this.field820 = var3.field720;
            this.field825 = var3.field754;
        }
        if (this.field817 != var2 && this.field827 != null) {
            class26.field700.method853(this.field827);
            this.field827 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)V", line = 64)
    public static void method256(byte arg0) {
        field843 = null;
        field836 = null;
        field846 = null;
        int var1 = -17 / ((32 - arg0) / 39);
        field839 = null;
        field821 = null;
        field835 = null;
        field834 = null;
        field842 = null;
        field837 = null;
        field833 = null;
        field840 = null;
        field845 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ls;ILs;)V", line = 84)
    public static final void method257(class111 arg0, int arg1, class111 arg2) {
        if (arg1 == 64) {
            field832++;
            class39.field1018 = arg0;
            class87.field2229 = arg2;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZI)V", line = 170)
    public static final void method258(boolean arg0, int arg1) {
        field826++;
        if (class80.field2044.field177 >> 7 == class14.field355 && class80.field2044.field222 >> 7 == class12.field306) {
            class14.field355 = 0;
        }
        int var2 = class113.field2886;
        if (arg0) {
            var2 = 1;
        }
        if (arg1 != 32) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class89 var4;
            int var5;
            if (arg0) {
                var4 = class80.field2044;
                var5 = 33538048;
            } else {
                var4 = class85.field2138[class38.field985[var3]];
                var5 = class38.field985[var3] << 14;
            }
            if (var4 != null && var4.method48((byte) -122)) {
                var4.field2296 = false;
                int var6 = var4.field177 >> 7;
                int var7 = var4.field222 >> 7;
                if ((class115.field2912 && class113.field2886 > 50 || class113.field2886 > 200) && !arg0 && var4.field216 == var4.field158) {
                    var4.field2296 = true;
                }
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field2290 == null || var4.field2285 > class26.field699 || class26.field699 >= var4.field2310) {
                        if ((var4.field177 & 0x7F) == 64 && (var4.field222 & 0x7F) == 64) {
                            if (class92.field2356[var6][var7] == class23.field605) {
                                continue;
                            }
                            class92.field2356[var6][var7] = class23.field605;
                        }
                        var4.field2281 = class25.method226(class64.field1589, var4.field222, var4.field177, (byte) -89);
                        class64.field1585.method177(class64.field1589, var4.field177, var4.field222, var4.field2281, 60, var4, var4.field187, var5, var4.field200);
                    } else {
                        var4.field2296 = false;
                        var4.field2281 = class25.method226(class64.field1589, var4.field222, var4.field177, (byte) -116);
                        class64.field1585.method213(class64.field1589, var4.field177, var4.field222, var4.field2281, 60, var4, var4.field187, var5, var4.field2282, var4.field2277, var4.field2312, var4.field2276);
                    }
                }
            }
        }
    }
}
