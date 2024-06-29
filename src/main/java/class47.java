import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class47 extends class220 {

    @OriginalMember(owner = "client!we", name = "G", descriptor = "Ls;")
    public static class261 field937 = new class261(64);

    @OriginalMember(owner = "client!we", name = "V", descriptor = "Lmh;")
    public static class128 field952 = class22.method156(124, ")4a=");

    @OriginalMember(owner = "client!we", name = "U", descriptor = "Lmh;")
    private static class128 field951 = class22.method156(126, " ");

    @OriginalMember(owner = "client!we", name = "X", descriptor = "Lmh;")
    public static class128 field954 = field951;

    @OriginalMember(owner = "client!we", name = "W", descriptor = "I")
    public static int field953 = 1;

    @OriginalMember(owner = "client!we", name = "E", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!we", name = "F", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!we", name = "O", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!we", name = "R", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!we", name = "T", descriptor = "Ldj;")
    public static class314 field950;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "[I")
    private int[] field940;

    @OriginalMember(owner = "client!we", name = "S", descriptor = "[I")
    public int[] field949;

    @OriginalMember(owner = "client!we", name = "P", descriptor = "[Lmh;")
    private class128[] field946;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "[[I")
    private int[][] field939;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V", line = 5)
    public static final void method323(int arg0) {
        int var1 = 96 / ((70 - arg0) / 43);
        class236 var2 = (class236) class214.field3777.method2024(0);
        field938++;
        while (var2 != null) {
            if (var2.field4064 > 0) {
                var2.field4064--;
            }
            if (var2.field4064 != 0) {
                if (var2.field4048 > 0) {
                    var2.field4048--;
                }
                if (var2.field4048 == 0 && var2.field4055 >= 1 && var2.field4053 >= 1 && var2.field4055 <= 102 && var2.field4053 <= 102 && (var2.field4065 < 0 || class303.method2058(var2.field4058, var2.field4065, (byte) 46))) {
                    class268.method1870(var2.field4065, -112, var2.field4058, var2.field4053, var2.field4063, var2.field4055, var2.field4049, var2.field4060);
                    var2.field4048 = -1;
                    if (var2.field4065 == var2.field4054 && var2.field4054 == -1) {
                        var2.method1978((byte) -99);
                    } else if (var2.field4065 == var2.field4054 && var2.field4063 == var2.field4061 && var2.field4058 == var2.field4050) {
                        var2.method1978((byte) -98);
                    }
                }
            } else if (var2.field4054 < 0 || class303.method2058(var2.field4050, var2.field4054, (byte) 117)) {
                class268.method1870(var2.field4054, -121, var2.field4050, var2.field4053, var2.field4061, var2.field4055, var2.field4049, var2.field4060);
                var2.method1978((byte) -126);
            }
            var2 = (class236) class214.field3777.method2027(1211754408);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLbg;)Lmh;", line = 69)
    public final class128 method324(boolean arg0, class194 arg1) {
        field948++;
        class128 var3 = class4.method25(114, 80);
        if (this.field940 != null) {
            for (int var4 = 0; var4 < this.field940.length; var4++) {
                var3.method847(true, this.field946[var4]);
                var3.method847(true, class92.method580(this.field940[var4], arg1.method1297(-2, class112.field1876[this.field940[var4]]), this.field939[var4], 0));
            }
        }
        var3.method847(arg0, this.field946[this.field946.length - 1]);
        return var3.method846(126);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)I", line = 98)
    public final int method325(byte arg0) {
        field935++;
        int var2 = 47 % ((arg0 + 83) / 41);
        return this.field940 == null ? 0 : this.field940.length;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)Lvk;", line = 115)
    public static final class161 method326(int arg0, int arg1, int arg2) {
        class150 var3 = class182.field3184[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class161 var4 = var3.field2565;
            var3.field2565 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILbg;I)V", line = 134)
    private final void method327(int arg0, class194 arg1, int arg2) {
        if (arg2 == 1) {
            this.field946 = arg1.method1319(1).method833(60, (byte) 103);
        } else if (arg2 == 2) {
            int var8 = arg1.method1325(7627);
            this.field949 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field949[var9] = arg1.method1308(-39);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method1325(7627);
            this.field939 = new int[var4][];
            this.field940 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1308(-73);
                this.field940[var5] = var6;
                this.field939[var5] = new int[class39.field830[var6]];
                for (int var7 = 0; var7 < class39.field830[var6]; var7++) {
                    this.field939[var5][var7] = arg1.method1308(-122);
                }
            }
        }
        field947++;
        if (arg0 != -1) {
            method326(14, 46, -16);
        }
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(I)Lmh;", line = 198)
    public final class128 method328(int arg0) {
        field943++;
        class128 var2 = class4.method25(arg0 + 114, 80);
        if (this.field946 == null) {
            return class299.field5097;
        }
        var2.method847(true, this.field946[arg0]);
        for (int var3 = 1; var3 < this.field946.length; var3++) {
            var2.method847(true, class234.field4031);
            var2.method847(true, this.field946[var3]);
        }
        return var2.method846(117);
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V", line = 222)
    public static void method329(byte arg0) {
        field937 = null;
        field950 = null;
        field952 = null;
        int var1 = -58 / ((arg0 + 39) / 35);
        field951 = null;
        field954 = null;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(III)I", line = 237)
    public final int method330(int arg0, int arg1, int arg2) {
        if (arg1 != -6988) {
            return 89;
        }
        field945++;
        if (this.field940 == null || arg0 < 0 || this.field940.length < arg0) {
            return -1;
        } else if (this.field939[arg0] == null || arg2 < 0 || this.field939[arg0].length < arg2) {
            return -1;
        } else {
            return this.field939[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(B)V", line = 262)
    public final void method331(byte arg0) {
        field941++;
        int var2 = 36 / ((3 - arg0) / 63);
        if (this.field949 != null) {
            for (int var3 = 0; var3 < this.field949.length; var3++) {
                this.field949[var3] = class279.method1951(this.field949[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([IZLbg;)V", line = 285)
    public final void method332(int[] arg0, boolean arg1, class194 arg2) {
        field936++;
        if (this.field940 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field940.length && var4 < arg0.length; var4++) {
            int var5 = class188.field3266[this.method334(68, var4)];
            if (var5 > 0) {
                arg2.method1299((byte) -127, var5, (long) arg0[var4]);
            }
        }
        if (!arg1) {
            method326(108, -27, 127);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lbg;B)V", line = 313)
    public final void method333(class194 arg0, byte arg1) {
        if (arg1 <= 77) {
            return;
        }
        field944++;
        while (true) {
            int var3 = arg0.method1325(7627);
            if (var3 == 0) {
                return;
            }
            this.method327(-1, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)I", line = 339)
    public final int method334(int arg0, int arg1) {
        if (arg0 < 18) {
            this.method325((byte) 88);
        }
        field942++;
        return this.field940 == null || arg1 < 0 || this.field940.length < arg1 ? -1 : this.field940[arg1];
    }
}
