import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class131 extends class110 {

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "[S")
    private short[] field3134 = new short[6];

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
    private int field3129 = 0;

    @OriginalMember(owner = "client!ua", name = "fb", descriptor = "I")
    private int field3141 = 128;

    @OriginalMember(owner = "client!ua", name = "gb", descriptor = "I")
    public int field3142 = -1;

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "[S")
    private short[] field3138 = new short[6];

    @OriginalMember(owner = "client!ua", name = "nb", descriptor = "I")
    private int field3149 = 128;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
    private int field3135 = 0;

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
    private int field3139 = 0;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "Lsa;")
    public static class119 field3131 = new class119(64);

    @OriginalMember(owner = "client!ua", name = "ib", descriptor = "Lmb;")
    public static class84 field3144 = class79.method672(true, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!ua", name = "lb", descriptor = "I")
    public static int field3147 = 0;

    @OriginalMember(owner = "client!ua", name = "hb", descriptor = "Lmb;")
    public static class84 field3143 = class79.method672(true, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!ua", name = "rb", descriptor = "Lmb;")
    public static class84 field3153 = class79.method672(true, "Passwort: ");

    @OriginalMember(owner = "client!ua", name = "mb", descriptor = "Lmb;")
    public static class84 field3148 = class79.method672(true, "p12_full");

    @OriginalMember(owner = "client!ua", name = "sb", descriptor = "Lmb;")
    private static class84 field3154 = class79.method672(true, "Friends");

    @OriginalMember(owner = "client!ua", name = "pb", descriptor = "Lmb;")
    public static class84 field3151 = field3154;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
    private int field3132;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
    public int field3140;

    @OriginalMember(owner = "client!ua", name = "jb", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!ua", name = "ob", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!ua", name = "qb", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!ua", name = "kb", descriptor = "Lb;")
    public static class8 field3146;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(Z)V")
    public static void method1057(boolean arg0) {
        field3154 = null;
        if (arg0) {
            return;
        }
        field3146 = null;
        field3144 = null;
        field3153 = null;
        field3148 = null;
        field3151 = null;
        field3143 = null;
        field3131 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lhb;B)V")
    public final void method1058(class51 arg0, byte arg1) {
        field3145++;
        int var3 = -13 / ((-arg1 - 25) / 34);
        while (true) {
            int var4 = arg0.method373(25094);
            if (var4 == 0) {
                return;
            }
            this.method1060(var4, arg0, -51);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)Ldd;")
    public final class26 method1059(int arg0, int arg1) {
        field3137++;
        class26 var3 = (class26) class22.field513.method970(-27059, (long) this.field3140);
        if (var3 == null) {
            class101 var4 = class101.method829(class126.field3043, this.field3132, 0);
            if (var4 == null) {
                return null;
            }
            for (int var5 = 0; var5 < 6; var5++) {
                if (this.field3134[0] != 0) {
                    var4.method834(this.field3134[var5], this.field3138[var5]);
                }
            }
            var3 = var4.method838(this.field3129 + 64, 850 - -this.field3139, -30, -50, -30);
            class22.field513.method965(var3, arg0 + 208, (long) this.field3140);
        }
        class26 var6;
        if (~this.field3142 == arg0 || arg1 == -1) {
            var6 = var3.method190(true);
        } else {
            var6 = class79.method673(this.field3142, false).method623(65535, var3, arg1);
        }
        if (this.field3149 != 128 || this.field3141 != 128) {
            var6.method191(this.field3149, this.field3141, this.field3149);
        }
        if (this.field3135 != 0) {
            if (this.field3135 == 90) {
                var6.method184();
            }
            if (this.field3135 == 180) {
                var6.method184();
                var6.method184();
            }
            if (this.field3135 == 270) {
                var6.method184();
                var6.method184();
                var6.method184();
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILhb;I)V")
    private final void method1060(int arg0, class51 arg1, int arg2) {
        if (arg0 == 1) {
            this.field3132 = arg1.method383(-2056200760);
        } else if (arg0 == 2) {
            this.field3142 = arg1.method383(-2056200760);
        } else if (arg0 == 4) {
            this.field3149 = arg1.method383(-2056200760);
        } else if (arg0 == 5) {
            this.field3141 = arg1.method383(-2056200760);
        } else if (arg0 == 6) {
            this.field3135 = arg1.method383(-2056200760);
        } else if (arg0 == 7) {
            this.field3129 = arg1.method373(25094);
        } else if (arg0 == 8) {
            this.field3139 = arg1.method373(arg2 + 25145);
        } else if (arg0 >= 40 && arg0 < 50) {
            this.field3134[arg0 - 40] = (short) arg1.method383(-2056200760);
        } else if (arg0 >= 50 && arg0 < 60) {
            this.field3138[arg0 - 50] = (short) arg1.method383(class13.method86(arg2, 2056200709));
        }
        if (arg2 == -51) {
            field3150++;
        }
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(Z)V")
    public static final void method1061(boolean arg0) {
        if (class11.field198[98]) {
            class36.field794 += (12 - class36.field794) / 2;
        } else if (class11.field198[99]) {
            class36.field794 += (-class36.field794 - 12) / 2;
        } else {
            class36.field794 /= 2;
        }
        field3152++;
        class123.field2987 += class36.field794 / 2;
        int var1 = class40.field925.field3549 + class109.field2630;
        if (!arg0) {
            method1061(true);
        }
        int var2 = field3147 + class40.field925.field3535;
        if (class11.field198[96]) {
            class74.field1819 += (-class74.field1819 - 24) / 2;
        } else if (class11.field198[97]) {
            class74.field1819 += (24 - class74.field1819) / 2;
        } else {
            class74.field1819 /= 2;
        }
        if (class44.field976 - var1 < -500 || class44.field976 - var1 > 500 || class64.field1581 - var2 < -500 || class64.field1581 - var2 > 500) {
            class44.field976 = var1;
            class64.field1581 = var2;
        }
        if (class64.field1581 != var2) {
            class64.field1581 += (var2 - class64.field1581) / 16;
        }
        class136.field3300 = class74.field1819 / 2 + class136.field3300 & 0x7FF;
        if (class44.field976 != var1) {
            class44.field976 += (var1 - class44.field976) / 16;
        }
        int var3 = class44.field976 >> 7;
        int var4 = class64.field1581 >> 7;
        if (class123.field2987 < 128) {
            class123.field2987 = 128;
        }
        if (class123.field2987 > 383) {
            class123.field2987 = 383;
        }
        int var5 = 0;
        int var6 = class41.method309((byte) 64, class44.field976, class64.field1581, class13.field251);
        if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class13.field251;
                    if (var9 < 3 && (class62.field1540[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class52.field1168[var9][var7][var8];
                    if (var5 < var10) {
                        var5 = var10;
                    }
                }
            }
        }
        int var11 = var5 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class66.field1638 < var11) {
            class66.field1638 += (var11 - class66.field1638) / 24;
        } else if (var11 < class66.field1638) {
            class66.field1638 += (var11 - class66.field1638) / 80;
            return;
        }
    }
}
