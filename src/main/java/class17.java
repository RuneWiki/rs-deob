import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class17 extends class34 {

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "Z")
    public boolean field219 = true;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "[I")
    public static int[] field221 = new int[2000];

    @OriginalMember(owner = "client!ud", name = "W", descriptor = "Lke;")
    public static class256 field230 = class316.method2202("<br>", 27626);

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "Lke;")
    public static class256 field216 = class316.method2202("0", 27626);

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "Lke;")
    public static class256 field220 = class316.method2202("Connexion au serveur de mise -9 jour en cours", 27626);

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "Lvm;")
    public static class297 field225 = new class297(64);

    @OriginalMember(owner = "client!ud", name = "hb", descriptor = "I")
    public static int field241 = 2;

    @OriginalMember(owner = "client!ud", name = "kb", descriptor = "I")
    public static int field244 = 0;

    @OriginalMember(owner = "client!ud", name = "gb", descriptor = "[I")
    public static int[] field240 = new int[25];

    @OriginalMember(owner = "client!ud", name = "jb", descriptor = "Lke;")
    public static class256 field243 = class316.method2202("Texturen geladen)3", 27626);

    @OriginalMember(owner = "client!ud", name = "ib", descriptor = "[Z")
    public static boolean[] field242 = new boolean[8];

    @OriginalMember(owner = "client!ud", name = "lb", descriptor = "Z")
    public static boolean field245 = true;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ud", name = "bb", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!ud", name = "cb", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ud", name = "db", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!ud", name = "eb", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "Lee;")
    public static class293 field215;

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "Lhg;")
    public static class300 field232;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "[I")
    private int[] field224;

    @OriginalMember(owner = "client!ud", name = "fb", descriptor = "[I")
    public int[] field239;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "[Lke;")
    private class256[] field226;

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "[[B")
    public static byte[][] field231;

    @OriginalMember(owner = "client!ud", name = "ab", descriptor = "[[I")
    private int[][] field234;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)I", line = 5)
    public final int method97(int arg0, byte arg1) {
        field233++;
        if (this.field224 == null || arg0 < 0 || arg0 > this.field224.length) {
            return -1;
        } else {
            if (arg1 >= -64) {
                field221 = (int[]) null;
            }
            return this.field224[arg0];
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIZI)V", line = 21)
    public static final void method98(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var6 = (arg2 - 32) * arg2 / arg1;
        if (var6 < 8) {
            var6 = 8;
        }
        class264.field4535[0].method12(arg5, arg3);
        if (arg4) {
            method98(14, 55, 37, 16, true, 8);
        }
        class264.field4535[1].method12(arg5, arg2 + arg3 - 16);
        field235++;
        int var7 = (arg2 - var6 - 32) * arg0 / (arg1 - arg2);
        if (!class253.field4323) {
            class178.method1299(arg5, arg3 + 16, 16, arg2 - 32, class114.field2016);
            class178.method1299(arg5, arg3 + var7 + 16, 16, var6, class104.field1857);
            class178.method1294(arg5, var7 + arg3 + 16, var6, class237.field4038);
            class178.method1294(arg5 + 1, arg3 + var7 + 16, var6, class237.field4038);
            class178.method1300(arg5, arg3 + var7 + 16, 16, class237.field4038);
            class178.method1300(arg5, arg3 + var7 + 17, 16, class237.field4038);
            class178.method1294(arg5 + 15, arg3 + 16 + var7, var6, class150.field2682);
            class178.method1294(arg5 + 14, var7 + 17 + arg3, var6 - 1, class150.field2682);
            class178.method1300(arg5, arg3 + 15 - (-var6 + -var7), 16, class150.field2682);
            class178.method1300(arg5 + 1, arg3 + 14 + var6 + var7, 15, class150.field2682);
            return;
        }
        class60.method482(arg5, arg3 + 16, 16, arg2 - 32, class114.field2016);
        class60.method482(arg5, arg3 + var7 + 16, 16, var6, class104.field1857);
        class60.method475(arg5, arg3 + var7 + 16, var6, class237.field4038);
        class60.method475(arg5 + 1, arg3 - -16 + var7, var6, class237.field4038);
        class60.method478(arg5, var7 + arg3 + 16, 16, class237.field4038);
        class60.method478(arg5, arg3 + var7 + 17, 16, class237.field4038);
        class60.method475(arg5 + 15, var7 + 16 + arg3, var6, class150.field2682);
        class60.method475(arg5 + 14, arg3 + 17 + var7, var6 - 1, class150.field2682);
        class60.method478(arg5, arg3 + var7 + var6 + 15, 16, class150.field2682);
        class60.method478(arg5 + 1, arg3 + var6 + var7 + 14, 15, class150.field2682);
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V", line = 68)
    public final void method99(int arg0) {
        field223++;
        if (arg0 == -1 && this.field239 != null) {
            for (int var2 = 0; var2 < this.field239.length; var2++) {
                this.field239[var2] = class100.method721(this.field239[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLra;)V", line = 88)
    public final void method100(byte arg0, class41 arg1) {
        field218++;
        while (true) {
            int var3 = arg1.method357(false);
            if (var3 == 0) {
                if (arg0 != -118) {
                    method104(6, -23, -86, (class187) null, -45, 112);
                }
                return;
            }
            this.method102((byte) 100, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)V", line = 116)
    public static final void method101(byte arg0, int arg1) {
        field238++;
        class208.field3769 = new int[arg1];
        class79.field1470 = new int[arg1];
        class140.field2472 = new int[arg1];
        class242.field4107 = new int[arg1];
        if (arg0 != -53) {
            method110(72);
        }
        class57.field1033 = new int[arg1];
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLra;I)V", line = 131)
    private final void method102(byte arg0, class41 arg1, int arg2) {
        if (arg0 != 100) {
            return;
        }
        if (arg2 == 1) {
            this.field226 = arg1.method313((byte) 54).method1784((byte) 124, 60);
        } else if (arg2 == 2) {
            int var4 = arg1.method357(false);
            this.field239 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field239[var5] = arg1.method346(class288.method2011(arg0, -108));
            }
        } else if (arg2 == 3) {
            int var6 = arg1.method357(false);
            this.field234 = new int[var6][];
            this.field224 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method346(-16);
                this.field224[var7] = var8;
                this.field234[var7] = new int[class146.field2578[var8]];
                for (int var9 = 0; var9 < class146.field2578[var8]; var9++) {
                    this.field234[var7][var9] = arg1.method346(-16);
                }
            }
        } else if (arg2 == 4) {
            this.field219 = false;
        }
        field214++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lra;[II)V", line = 197)
    public final void method103(class41 arg0, int[] arg1, int arg2) {
        field227++;
        if (this.field224 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field224.length && arg1.length > var4; var4++) {
            int var5 = class301.field5184[this.method97(var4, (byte) -71)];
            if (var5 > 0) {
                arg0.method318((long) arg1[var4], false, var5);
            }
        }
        if (arg2 != -9222) {
            this.field224 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIILci;II)V", line = 224)
    public static final void method104(int arg0, int arg1, int arg2, class187 arg3, int arg4, int arg5) {
        field236++;
        if (arg3.field3288 == -1 && arg3.field3295 == null) {
            return;
        }
        int var6 = 0;
        int var7 = 23 % ((43 - arg2) / 42);
        if (arg3.field3286 < arg4) {
            var6 += arg4 - arg3.field3286;
        } else if (arg3.field3280 > arg4) {
            var6 += arg3.field3280 - arg4;
        }
        if (arg3.field3285 < arg5) {
            var6 += arg5 - arg3.field3285;
        } else if (arg5 < arg3.field3297) {
            var6 += arg3.field3297 - arg5;
        }
        if (arg3.field3296 == 0 || arg3.field3296 < (var6 - 64) || class70.field1292 == 0 || arg3.field3275 != arg1) {
            if (arg3.field3276 != null) {
                class197.field3603.method2237(arg3.field3276);
                arg3.field3276 = null;
            }
            if (arg3.field3279 != null) {
                class197.field3603.method2237(arg3.field3279);
                arg3.field3279 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg3.field3296 - var6) * class70.field1292 / arg3.field3296;
        if (arg3.field3276 != null) {
            arg3.field3276.method929(var8);
        } else if (arg3.field3288 >= 0) {
            class306 var9 = class306.method2131(class96.field1702, arg3.field3288, 0);
            if (var9 != null) {
                class268 var10 = var9.method2132().method1858(class290.field5025);
                class133 var11 = class133.method951(var10, 100, var8);
                var11.method926(-1);
                class197.field3603.method2235(var11);
                arg3.field3276 = var11;
            }
        }
        if (arg3.field3279 != null) {
            arg3.field3279.method929(var8);
            if (!arg3.field3279.method1198(24)) {
                arg3.field3279 = null;
            }
        } else if (arg3.field3295 != null && (arg3.field3282 -= arg0) <= 0) {
            int var12 = (int) (Math.random() * (double) arg3.field3295.length);
            class306 var13 = class306.method2131(class96.field1702, arg3.field3295[var12], 0);
            if (var13 != null) {
                class268 var14 = var13.method2132().method1858(class290.field5025);
                class133 var15 = class133.method951(var14, 100, var8);
                var15.method926(0);
                class197.field3603.method2235(var15);
                arg3.field3282 = (int) (Math.random() * (double) (arg3.field3274 - arg3.field3298)) + arg3.field3298;
                arg3.field3279 = var15;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(III)I", line = 359)
    public final int method105(int arg0, int arg1, int arg2) {
        if (arg0 < 125) {
            this.method106((byte) -48);
        }
        field228++;
        if (this.field224 == null || arg1 < 0 || arg1 > this.field224.length) {
            return -1;
        } else if (this.field234[arg1] == null || arg2 < 0 || this.field234[arg1].length < arg2) {
            return -1;
        } else {
            return this.field234[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)Lke;", line = 395)
    public final class256 method106(byte arg0) {
        class256 var2 = class99.method711((byte) -122, 80);
        field217++;
        int var3 = 16 % ((arg0 - 75) / 36);
        if (this.field226 == null) {
            return class107.field1908;
        }
        var2.method1793((byte) 37, this.field226[0]);
        for (int var4 = 1; var4 < this.field226.length; var4++) {
            var2.method1793((byte) 37, class130.field2270);
            var2.method1793((byte) 37, this.field226[var4]);
        }
        return var2.method1763((byte) -118);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(Z)I", line = 420)
    public final int method107(boolean arg0) {
        if (arg0) {
            field242 = (boolean[]) null;
        }
        field229++;
        return this.field224 == null ? 0 : this.field224.length;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILra;)Lke;", line = 439)
    public final class256 method108(int arg0, class41 arg1) {
        field237++;
        if (arg0 != -1) {
            method109(113, 16, 100);
        }
        class256 var3 = class99.method711((byte) -122, 80);
        if (this.field224 != null) {
            for (int var4 = 0; var4 < this.field224.length; var4++) {
                var3.method1793((byte) 37, this.field226[var4]);
                var3.method1793((byte) 37, class209.method1478(this.field234[var4], this.field224[var4], arg1.method337(class250.field4252[this.field224[var4]], 111), -10));
            }
        }
        var3.method1793((byte) 37, this.field226[this.field226.length - 1]);
        return var3.method1763((byte) -99);
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(III)V", line = 469)
    public static final void method109(int arg0, int arg1, int arg2) {
        field222++;
        if (arg0 != -13185) {
            method104(98, -33, -115, (class187) null, -83, -45);
        }
        class97.field1741[arg2] = arg1;
        class155 var3 = (class155) class172.field3052.method1744((byte) 127, (long) arg2);
        if (var3 == null) {
            class155 var4 = new class155(class224.method1536(false) + 500L);
            class172.field3052.method1749(true, var4, (long) arg2);
        } else {
            var3.field2765 = class224.method1536(false) + 500L;
        }
    }

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)V", line = 502)
    public static void method110(int arg0) {
        field242 = null;
        field243 = null;
        field221 = null;
        field215 = null;
        field230 = null;
        field216 = null;
        field231 = (byte[][]) null;
        field225 = null;
        field220 = null;
        field240 = null;
        field232 = null;
        if (arg0 > -6) {
            method101((byte) -27, -5);
        }
    }
}
