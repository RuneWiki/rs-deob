import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class96 {

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "Loe;")
    private class139 field1914 = new class139();

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    private int field1907;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
    private int field1918;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "Lmg;")
    private class252 field1902;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "[I")
    public static int[] field1909 = new int[32];

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "[Ljd;")
    public static class86[] field1904 = new class86[100];

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "Ljd;")
    public static class86 field1913 = class122.method868("<col=ffffff>", true);

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "[[I")
    public static int[][] field1915 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public static int field1916 = 0;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "Lwb;")
    public static class26 field1897;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lqk;B)Lrc;")
    public static final class66 method692(class200 arg0, byte arg1) {
        field1906++;
        return arg1 < 104 ? null : new class66(arg0.method1421((byte) -81), arg0.method1421((byte) -98), arg0.method1421((byte) -104), arg0.method1421((byte) 119), arg0.method1405(-3), arg0.method1408((byte) -50));
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
    public final void method693(int arg0, int arg1) {
        if (arg0 != 6) {
            this.field1918 = 78;
        }
        field1899++;
        if (class23.field569 == null) {
            return;
        }
        for (class76 var3 = (class76) this.field1914.method995(26386); var3 != null; var3 = (class76) this.field1914.method996(-78)) {
            if (var3.method391(true)) {
                if (var3.method392(arg0 ^ 0x6) == null) {
                    var3.method1477(1);
                    var3.method1728(arg0 + 994);
                    this.field1918++;
                }
            } else if (++var3.field4542 > (long) arg1) {
                class76 var4 = class23.field569.method1365(126, var3);
                this.field1902.method1699(-28407, var4, var3.field3759);
                class163.method1183(var3, arg0 + 1, var4);
                var3.method1477(1);
                var3.method1728(arg0 + 994);
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(JI)V")
    public final void method694(long arg0, int arg1) {
        field1898++;
        int var4 = 103 / ((-arg1 - 17) / 62);
        class76 var5 = (class76) this.field1902.method1698(arg0, (byte) -63);
        if (var5 != null) {
            var5.method1477(1);
            var5.method1728(1000);
            this.field1918++;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lbj;Lbj;Lbj;Lbj;I)V")
    public static final void method695(class151 arg0, class151 arg1, class151 arg2, class151 arg3, int arg4) {
        field1900++;
        class210.field3811 = arg2;
        class22.field566 = arg3;
        class189.field3345 = arg0;
        class186.field3302 = arg1;
        class108.field2070 = new class6[class22.field566.method1081(-2)][];
        class49.field1039 = new boolean[class22.field566.method1081(-2)];
        int var5 = -13 % ((-arg4 - 43) / 62);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(JLjava/lang/Object;B)V")
    public final void method696(long arg0, Object arg1, byte arg2) {
        field1905++;
        this.method694(arg0, 108);
        if (this.field1918 == 0) {
            class76 var5 = (class76) this.field1914.method990(0);
            var5.method1477(1);
            var5.method1728(1000);
        } else {
            this.field1918--;
        }
        if (arg2 != -96) {
            field1904 = null;
        }
        class153 var6 = new class153(arg1);
        this.field1902.method1699(arg2 - 28311, var6, arg0);
        this.field1914.method991(var6, true);
        var6.field4542 = 0L;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IBI)V")
    public static final void method697(int arg0, byte arg1, int arg2) {
        field1917++;
        class161 var3 = class204.method1456(true, 13, arg2);
        if (arg1 <= 100) {
            field1916 = 58;
        }
        var3.method1174(0);
        var3.field3027 = arg0;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)V")
    public static final void method698(int arg0, int arg1, int arg2) {
        if (arg0 != 11) {
            method698(77, 72, -126);
        }
        if (class139.field2646 != 0 && arg2 != -1) {
            class108.method770(false, (byte) -82, arg2, class70.field1448, 0, class139.field2646);
            class91.field1854 = true;
        }
        field1919++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static void method699(int arg0) {
        field1909 = null;
        field1904 = null;
        field1915 = null;
        field1913 = null;
        field1897 = null;
        int var1 = -42 / ((-arg0 - 75) / 46);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZI)V")
    public static final void method700(boolean arg0, int arg1) {
        field1903++;
        class7.method51(21966);
        if (class84.field1634 != 30 && class84.field1634 != 25) {
            return;
        }
        class6.field165++;
        if (arg1 != -26) {
            field1897 = null;
        }
        if (class6.field165 < 50 && !arg0) {
            return;
        }
        class6.field165 = 0;
        if (!class45.field1010 && class248.field4415 != null) {
            class36.field809.method1356(118, true);
            try {
                class248.field4415.method209(class36.field809.field3547, arg1 + 4926, class36.field809.field3565, 0);
                class36.field809.field3565 = 0;
            } catch (IOException var2) {
                class45.field1010 = true;
            }
            class159.field2980++;
        }
        class7.method51(21966);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
    public final Object method701(byte arg0, long arg1) {
        class76 var4 = (class76) this.field1902.method1698(arg1, (byte) -42);
        field1912++;
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method392(0);
        if (var5 == null) {
            var4.method1477(1);
            var4.method1728(1000);
            this.field1918++;
            return null;
        }
        if (arg0 >= -116) {
            method692((class200) null, (byte) -7);
        }
        if (var4.method391(true)) {
            class153 var6 = new class153(var5);
            this.field1902.method1699(-28407, var6, var4.field3759);
            this.field1914.method991(var6, true);
            var6.field4542 = 0L;
            var4.method1477(1);
            var4.method1728(1000);
        } else {
            this.field1914.method991(var4, true);
            var4.field4542 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
    public final void method702(byte arg0) {
        if (arg0 != -88) {
            this.field1902 = null;
        }
        for (class76 var2 = (class76) this.field1914.method995(26386); var2 != null; var2 = (class76) this.field1914.method996(-113)) {
            if (var2.method391(true)) {
                var2.method1477(1);
                var2.method1728(1000);
                this.field1918++;
            }
        }
        field1908++;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)V")
    public final void method703(byte arg0) {
        if (arg0 == 122) {
            this.field1914.method994(8);
            field1901++;
            this.field1902.method1705(6);
            this.field1918 = this.field1907;
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I)V")
    public class96(int arg0) {
        this.field1907 = arg0;
        this.field1918 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field1902 = new class252(var2);
    }
}
