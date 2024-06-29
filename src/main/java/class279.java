import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class279 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "Lha;")
    private class194 field4774 = new class194();

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "Lha;")
    private class194 field4800 = new class194();

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "Lha;")
    private class194 field4802 = new class194();

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "Lha;")
    private class194 field4803 = new class194();

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "Lva;")
    private class235 field4807 = new class235(4);

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
    public volatile int field4808 = 0;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "B")
    private byte field4810 = 0;

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
    public volatile int field4811 = 0;

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "Lva;")
    private class235 field4809 = new class235(8);

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "Loh;")
    public static class258 field4775 = class153.method1046("lila:", 108);

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "[Loh;")
    public static class258[] field4779 = new class258[100];

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "Loh;")
    private static class258 field4789 = class153.method1046("level: ", 111);

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
    public static int field4797 = -1;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "Loh;")
    public static class258 field4782 = field4789;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    public static int field4799 = 0;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    private int field4804;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "J")
    private long field4806;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "Lsj;")
    private class169 field4805;

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "Lbh;")
    private class184 field4812;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "[I")
    public static int[] field4795;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 5)
    public final void method1951(int arg0) {
        field4777++;
        if (this.field4805 == null) {
            return;
        }
        try {
            this.field4807.field4051 = 0;
            this.field4807.method1598(7, 27052);
            int var2 = 35 / ((-arg0 - 69) / 56);
            this.field4807.method1571(false, 0);
            this.field4805.method1123(4900, 0, 4, this.field4807.field4066);
        } catch (IOException var6) {
            try {
                this.field4805.method1122(-1);
            } catch (Exception var5) {
            }
            this.field4811 = -2;
            this.field4805 = null;
            this.field4808++;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)I", line = 33)
    public final int method1952(byte arg0) {
        int var2 = -45 % ((-arg0 - 63) / 33);
        field4794++;
        return this.field4774.method1306(0) + this.field4800.method1306(0);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V", line = 44)
    public final void method1953(int arg0) {
        try {
            this.field4805.method1122(arg0 ^ 0x11B065EF);
        } catch (Exception var3) {
        }
        field4783++;
        if (arg0 != -296773104) {
            this.field4774 = (class194) null;
        }
        this.field4810 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field4811 = -1;
        this.field4805 = null;
        this.field4808++;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V", line = 61)
    public static void method1954(boolean arg0) {
        field4779 = null;
        if (arg0) {
            field4795 = null;
            field4782 = null;
            field4789 = null;
            field4775 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLva;)V", line = 77)
    public static final void method1955(byte arg0, class235 arg1) {
        field4792++;
        int var2 = arg1.method1613((byte) 38);
        class310.field5256 = new class105[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class310.field5256[var3] = new class105();
            class310.field5256[var3].field1887 = arg1.method1613((byte) 64);
            class310.field5256[var3].field1892 = arg1.method1608(arg0 + 31603);
        }
        class123.field2179 = arg1.method1613((byte) 91);
        class291.field5004 = arg1.method1613((byte) 40);
        class3.field43 = arg1.method1613((byte) 78);
        if (arg0 != -3) {
            field4779 = (class258[]) null;
        }
        class109.field1928 = new class98[class291.field5004 + 1 - class123.field2179];
        for (int var4 = 0; var4 < class3.field43; var4++) {
            int var5 = arg1.method1613((byte) 127);
            class98 var6 = class109.field1928[var5] = new class98();
            var6.field86 = arg1.method1589(73);
            var6.field89 = arg1.method1611(-103);
            var6.field1747 = class123.field2179 + var5;
            var6.field1751 = arg1.method1608(31600);
            var6.field1752 = arg1.method1608(31600);
        }
        class218.field3756 = arg1.method1611(arg0 ^ 0xFFFFFF96);
        class153.field2633 = true;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V", line = 125)
    public final void method1956(byte arg0) {
        if (arg0 == 14) {
            if (this.field4805 != null) {
                this.field4805.method1122(arg0 - 15);
            }
            field4785++;
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V", line = 140)
    private final void method1957(int arg0) {
        field4790++;
        if (this.field4805 == null) {
            return;
        }
        try {
            this.field4807.field4051 = 0;
            this.field4807.method1598(6, 27052);
            this.field4807.method1571(false, 3);
            int var2 = -48 % ((arg0) / 45);
            this.field4805.method1123(4900, 0, 4, this.field4807.field4066);
        } catch (IOException var6) {
            try {
                this.field4805.method1122(-1);
            } catch (Exception var5) {
            }
            this.field4811 = -2;
            this.field4805 = null;
            this.field4808++;
        }
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V", line = 182)
    public final void method1958(int arg0) {
        if (this.field4805 != null) {
            this.field4805.method1119(121);
        }
        field4791++;
        if (arg0 != 3) {
            method1965((class235) null, (byte) 115);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)V", line = 196)
    public final void method1959(boolean arg0, int arg1) {
        field4796++;
        if (this.field4805 == null) {
            return;
        }
        try {
            this.field4807.field4051 = arg1;
            this.field4807.method1598(arg0 ? 2 : 3, 27052);
            this.field4807.method1571(false, 0);
            this.field4805.method1123(4900, 0, 4, this.field4807.field4066);
        } catch (IOException var6) {
            try {
                this.field4805.method1122(-1);
            } catch (Exception var5) {
            }
            this.field4805 = null;
            this.field4811 = -2;
            this.field4808++;
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(B)I", line = 221)
    private final int method1960(byte arg0) {
        if (arg0 != -11) {
            field4775 = (class258) null;
        }
        field4776++;
        return this.field4802.method1306(0) + this.field4803.method1306(0);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BIZII)Lbh;", line = 236)
    public final class184 method1961(byte arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field4793++;
        long var6 = (long) ((arg3 << 16) + arg4);
        if (arg1 != 25933) {
            return (class184) null;
        }
        class184 var8 = new class184();
        var8.field4219 = arg2;
        var8.field3286 = arg0;
        var8.field3397 = var6;
        if (arg2) {
            if (this.method1952((byte) 51) >= 20) {
                throw new RuntimeException();
            }
            this.field4774.method1305(var8, arg1 ^ 0x654D);
        } else if (this.method1960((byte) -11) < 20) {
            this.field4802.method1305(var8, 0);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(Z)Z", line = 284)
    public final boolean method1962(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            field4781++;
            return this.method1960((byte) -11) >= 20;
        }
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(I)Z", line = 306)
    public final boolean method1963(int arg0) {
        field4784++;
        if (arg0 == -7164) {
            return this.method1952((byte) 76) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILs;I)I", line = 320)
    public static final int method1964(int arg0, class171 arg1, int arg2) {
        field4801++;
        if (arg1.field3008 == null || arg0 >= arg1.field3008.length) {
            return -2;
        }
        try {
            if (arg2 >= -19) {
                return 12;
            }
            byte var3 = 0;
            int[] var4 = arg1.field3008[arg0];
            int var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = var4[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var6;
                }
                if (var7 == 1) {
                    var8 = class258.field4435[var4[var5++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 2) {
                    var8 = class130.field2287[var4[var5++]];
                }
                if (var7 == 3) {
                    var8 = class252.field4338[var4[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var4[var5++] << 16;
                    int var11 = var10 + var4[var5++];
                    class171 var12 = class263.method1844(var11, (byte) -70);
                    int var13 = var4[var5++];
                    if (var13 != -1 && (!class186.method1256((byte) 116, var13).field1052 || class268.field4674)) {
                        for (int var14 = 0; var14 < var12.field3042.length; var14++) {
                            if ((var13 + 1) == var12.field3042[var14]) {
                                var8 += var12.field2977[var14];
                            }
                        }
                    }
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 5) {
                    var8 = class227.field3917[var4[var5++]];
                }
                if (var7 == 6) {
                    var8 = class217.field3750[class130.field2287[var4[var5++]] - 1];
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 7) {
                    var8 = class227.field3917[var4[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class152.field2606.field3996;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class265.field4616[var15]) {
                            var8 += class130.field2287[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var4[var5++] << 16;
                    int var17 = var16 + var4[var5++];
                    class171 var18 = class263.method1844(var17, (byte) -70);
                    int var19 = var4[var5++];
                    if (var19 != -1 && (!class186.method1256((byte) 115, var19).field1052 || class268.field4674)) {
                        for (int var20 = 0; var20 < var18.field3042.length; var20++) {
                            if ((var19 + 1) == var18.field3042[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = field4799;
                }
                if (var7 == 12) {
                    var8 = class71.field1263;
                }
                if (var7 == 13) {
                    int var21 = class227.field3917[var4[var5++]];
                    int var22 = var4[var5++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var4[var5++];
                    var8 = class245.method1680(var23, (byte) 98);
                }
                if (var7 == 18) {
                    var8 = (class152.field2606.field912 >> 7) + class229.field3955;
                }
                if (var7 == 19) {
                    var8 = (class152.field2606.field934 >> 7) + class311.field5271;
                }
                if (var7 == 20) {
                    var8 = var4[var5++];
                }
                if (var9 == 0) {
                    if (var3 == 0) {
                        var6 += var8;
                    }
                    if (var3 == 1) {
                        var6 -= var8;
                    }
                    if (var3 == 2 && var8 != 0) {
                        var6 /= var8;
                    }
                    if (var3 == 3) {
                        var6 *= var8;
                    }
                    var3 = 0;
                } else {
                    var3 = var9;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lva;B)Lsd;", line = 524)
    public static final class125 method1965(class235 arg0, byte arg1) {
        if (arg1 > -99) {
            method1954(false);
        }
        class125 var2 = new class125(arg0.method1620(67), arg0.method1620(100), arg0.method1615(-121), arg0.method1615(87), arg0.method1611(119), arg0.method1589(87) == 1);
        int var3 = arg0.method1589(92);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field2244.method82(new class76(arg0.method1615(-123), arg0.method1615(42), arg0.method1615(-118), arg0.method1615(-119)), (byte) -39);
        }
        field4798++;
        var2.method913(-90);
        return var2;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lnd;I)V", line = 566)
    public static final void method1966(class58 arg0, int arg1) {
        arg0.field909 = arg0.field929;
        field4780++;
        if (arg0.field971 == 0) {
            arg0.field958 = 0;
            return;
        }
        if (arg0.field965 != -1 && arg0.field969 == 0) {
            class2 var2 = class263.method1842(arg0.field965, (byte) -114);
            if (arg0.field931 > 0 && var2.field39 == 0) {
                arg0.field958++;
                return;
            }
            if (arg0.field931 <= 0 && var2.field40 == 0) {
                arg0.field958++;
                return;
            }
        }
        int var3 = arg0.field912;
        int var4 = arg0.field934;
        int var5 = arg0.field975[arg0.field971 - 1] * 128 + arg0.method447(18123) * 64;
        int var6 = arg0.field959[arg0.field971 - 1] * 128 + (arg0.method447(arg1 ^ 0xFFFFF39A) * 64);
        if (var5 - var3 > 256 || (var5 - var3) < -256 || var6 - var4 > 256 || (var6 - var4) < -256) {
            arg0.field912 = var5;
            arg0.field934 = var6;
            return;
        }
        if (var5 <= var3) {
            if (var5 >= var3) {
                if (var6 > var4) {
                    arg0.field961 = 1024;
                } else if (var4 > var6) {
                    arg0.field961 = 0;
                }
            } else if (var6 > var4) {
                arg0.field961 = 768;
            } else if (var6 < var4) {
                arg0.field961 = 256;
            } else {
                arg0.field961 = 512;
            }
        } else if (var6 > var4) {
            arg0.field961 = 1280;
        } else if (var4 <= var6) {
            arg0.field961 = 1536;
        } else {
            arg0.field961 = 1792;
        }
        int var7 = arg0.field961 - arg0.field923 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field957;
        if (arg1 != -19119) {
            field4778 = -62;
        }
        int var9 = 4;
        boolean var10 = true;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field973;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field915;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field926;
        }
        if (var8 == -1) {
            var8 = arg0.field973;
        }
        arg0.field909 = var8;
        if (arg0 instanceof class107) {
            var10 = ((class107) arg0).field1906.field2573;
        }
        if (var10) {
            if (arg0.field961 != arg0.field923 && arg0.field963 == -1 && arg0.field979 != 0) {
                var9 = 2;
            }
            if (arg0.field971 > 2) {
                var9 = 6;
            }
            if (arg0.field971 > 3) {
                var9 = 8;
            }
            if (arg0.field958 > 0 && arg0.field971 > 1) {
                var9 = 8;
                arg0.field958--;
            }
        } else {
            if (arg0.field971 > 1) {
                var9 = 6;
            }
            if (arg0.field971 > 2) {
                var9 = 8;
            }
            if (arg0.field958 > 0 && arg0.field971 > 1) {
                arg0.field958--;
                var9 = 8;
            }
        }
        if (arg0.field939[arg0.field971 - 1]) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field973 == arg0.field909 && arg0.field937 != -1) {
            arg0.field909 = arg0.field937;
        }
        if (var6 > var4) {
            arg0.field934 += var9;
            if (var6 < arg0.field934) {
                arg0.field934 = var6;
            }
        } else if (var4 > var6) {
            arg0.field934 -= var9;
            if (arg0.field934 < var6) {
                arg0.field934 = var6;
            }
        }
        if (var5 > var3) {
            arg0.field912 += var9;
            if (arg0.field912 > var5) {
                arg0.field912 = var5;
            }
        } else if (var3 > var5) {
            arg0.field912 -= var9;
            if (arg0.field912 < var5) {
                arg0.field912 = var5;
            }
        }
        if (arg0.field912 == var5 && arg0.field934 == var6) {
            if (arg0.field931 > 0) {
                arg0.field931--;
            }
            arg0.field971--;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZBLsj;)V", line = 787)
    public final void method1967(boolean arg0, byte arg1, class169 arg2) {
        if (this.field4805 != null) {
            try {
                this.field4805.method1122(-1);
            } catch (Exception var11) {
            }
            this.field4805 = null;
        }
        this.field4805 = arg2;
        field4786++;
        this.method1957(77);
        this.method1959(arg0, 0);
        this.field4812 = null;
        this.field4809.field4051 = 0;
        while (true) {
            class184 var5 = (class184) this.field4800.method1304(10);
            if (var5 == null) {
                while (true) {
                    class184 var6 = (class184) this.field4803.method1304(10);
                    if (var6 == null) {
                        if (this.field4810 != 0) {
                            try {
                                this.field4807.field4051 = 0;
                                this.field4807.method1598(4, 27052);
                                this.field4807.method1598(this.field4810, 27052);
                                this.field4807.method1605(0, (byte) 116);
                                this.field4805.method1123(4900, 0, 4, this.field4807.field4066);
                            } catch (IOException var10) {
                                try {
                                    this.field4805.method1122(-1);
                                } catch (Exception var9) {
                                }
                                this.field4811 = -2;
                                this.field4808++;
                                this.field4805 = null;
                            }
                        }
                        this.field4804 = 0;
                        this.field4806 = class25.method197(-3418);
                        if (arg1 <= 89) {
                            this.field4811 = 82;
                        }
                        return;
                    }
                    this.field4802.method1305(var6, 0);
                }
            }
            this.field4774.method1305(var5, 0);
        }
    }

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "(I)Z", line = 856)
    public final boolean method1968(int arg0) {
        field4787++;
        if (arg0 != -1) {
            return false;
        }
        if (this.field4805 != null) {
            long var2 = class25.method197(-3418);
            int var4 = (int) (var2 - this.field4806);
            this.field4806 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4804 += var4;
            if (this.field4804 > 30000) {
                try {
                    this.field4805.method1122(-1);
                } catch (Exception var30) {
                }
                this.field4805 = null;
            }
        }
        if (this.field4805 == null) {
            return this.method1952((byte) -97) == 0 && this.method1960((byte) -11) == 0;
        }
        try {
            this.field4805.method1118(8789);
            for (class184 var6 = (class184) this.field4774.method1308((byte) -100); var6 != null; var6 = (class184) this.field4774.method1309((byte) -127)) {
                this.field4807.field4051 = 0;
                this.field4807.method1598(1, 27052);
                this.field4807.method1571(false, (int) var6.field3397);
                this.field4805.method1123(4900, 0, 4, this.field4807.field4066);
                this.field4800.method1305(var6, arg0 + 1);
            }
            for (class184 var7 = (class184) this.field4802.method1308((byte) -100); var7 != null; var7 = (class184) this.field4802.method1309((byte) -124)) {
                this.field4807.field4051 = 0;
                this.field4807.method1598(0, 27052);
                this.field4807.method1571(false, (int) var7.field3397);
                this.field4805.method1123(arg0 + 4901, 0, 4, this.field4807.field4066);
                this.field4803.method1305(var7, 0);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field4805.method1124(true);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field4804 = 0;
                byte var10 = 0;
                if (this.field4812 == null) {
                    var10 = 8;
                } else if (this.field4812.field3283 == 0) {
                    var10 = 1;
                }
                if (var10 > 0) {
                    int var11 = var10 - this.field4809.field4051;
                    if (var11 > var9) {
                        var11 = var9;
                    }
                    this.field4805.method1120(false, this.field4809.field4051, var11, this.field4809.field4066);
                    if (this.field4810 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field4809.field4066[this.field4809.field4051 + var12] = (byte) class139.method962(this.field4809.field4066[this.field4809.field4051 + var12], this.field4810);
                        }
                    }
                    this.field4809.field4051 += var11;
                    if (this.field4809.field4051 >= var10) {
                        if (this.field4812 == null) {
                            this.field4809.field4051 = 0;
                            int var13 = this.field4809.method1589(88);
                            int var14 = this.field4809.method1615(-120);
                            int var15 = this.field4809.method1589(117);
                            int var16 = var15 & 0x7F;
                            boolean var17 = (var15 & 0x80) != 0;
                            int var18 = this.field4809.method1611(-112);
                            long var19 = (long) ((var13 << 16) + var14);
                            Object var21 = null;
                            class184 var22;
                            if (var17) {
                                for (var22 = (class184) this.field4803.method1308((byte) -100); var22 != null && var22.field3397 != var19; var22 = (class184) this.field4803.method1309((byte) -121)) {
                                }
                            } else {
                                for (var22 = (class184) this.field4800.method1308((byte) -100); var22 != null && var22.field3397 != var19; var22 = (class184) this.field4800.method1309((byte) -121)) {
                                }
                            }
                            if (var22 == null) {
                                throw new IOException();
                            }
                            this.field4812 = var22;
                            int var23 = var16 == 0 ? 5 : 9;
                            this.field4812.field3282 = new class235(var18 + var23 + this.field4812.field3286);
                            this.field4812.field3282.method1598(var16, 27052);
                            this.field4812.field3282.method1577(true, var18);
                            this.field4809.field4051 = 0;
                            this.field4812.field3283 = 8;
                        } else if (this.field4812.field3283 != 0) {
                            throw new IOException();
                        } else if (this.field4809.field4066[0] == -1) {
                            this.field4809.field4051 = 0;
                            this.field4812.field3283 = 1;
                        } else {
                            this.field4812 = null;
                        }
                    }
                } else {
                    int var24 = this.field4812.field3282.field4066.length - this.field4812.field3286;
                    int var25 = 512 - this.field4812.field3283;
                    if ((var24 - this.field4812.field3282.field4051) < var25) {
                        var25 = var24 - this.field4812.field3282.field4051;
                    }
                    if (var9 < var25) {
                        var25 = var9;
                    }
                    this.field4805.method1120(false, this.field4812.field3282.field4051, var25, this.field4812.field3282.field4066);
                    if (this.field4810 != 0) {
                        for (int var26 = 0; var26 < var25; var26++) {
                            this.field4812.field3282.field4066[this.field4812.field3282.field4051 + var26] = (byte) class139.method962(this.field4812.field3282.field4066[this.field4812.field3282.field4051 + var26], this.field4810);
                        }
                    }
                    this.field4812.field3282.field4051 += var25;
                    this.field4812.field3283 += var25;
                    if (this.field4812.field3282.field4051 == var24) {
                        this.field4812.method1298(true);
                        this.field4812.field4208 = false;
                        this.field4812 = null;
                    } else if (this.field4812.field3283 == 512) {
                        this.field4812.field3283 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field4805.method1122(-1);
            } catch (Exception var29) {
            }
            this.field4808++;
            this.field4805 = null;
            this.field4811 = -2;
            return this.method1952((byte) -12) == 0 && this.method1960((byte) -11) == 0;
        }
    }
}
