import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class22 extends class26 {

    @OriginalMember(owner = "client!dc", name = "ib", descriptor = "Z")
    public boolean field443 = false;

    @OriginalMember(owner = "client!dc", name = "zb", descriptor = "I")
    private int field460 = 0;

    @OriginalMember(owner = "client!dc", name = "Gb", descriptor = "I")
    private int field467 = 0;

    @OriginalMember(owner = "client!dc", name = "gb", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "client!dc", name = "pb", descriptor = "I")
    private int field450;

    @OriginalMember(owner = "client!dc", name = "ub", descriptor = "I")
    public int field455;

    @OriginalMember(owner = "client!dc", name = "jb", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "client!dc", name = "rb", descriptor = "I")
    public int field452;

    @OriginalMember(owner = "client!dc", name = "wb", descriptor = "I")
    public int field457;

    @OriginalMember(owner = "client!dc", name = "nb", descriptor = "Lmb;")
    private class74 field448;

    @OriginalMember(owner = "client!dc", name = "sb", descriptor = "Llc;")
    public static class69 field453 = class69.method470((byte) -110, "wave2:");

    @OriginalMember(owner = "client!dc", name = "qb", descriptor = "[[[I")
    public static int[][][] field451 = new int[4][105][105];

    @OriginalMember(owner = "client!dc", name = "vb", descriptor = "[I")
    public static int[] field456 = new int[128];

    @OriginalMember(owner = "client!dc", name = "xb", descriptor = "Llc;")
    public static class69 field458 = class69.method470((byte) -99, "Loading fonts )2 ");

    @OriginalMember(owner = "client!dc", name = "Fb", descriptor = "Llc;")
    public static class69 field466 = class69.method470((byte) -110, "Private chat");

    @OriginalMember(owner = "client!dc", name = "Db", descriptor = "Llc;")
    public static class69 field464 = class69.method470((byte) -98, "::fpsoff");

    @OriginalMember(owner = "client!dc", name = "yb", descriptor = "I")
    public static int field459 = 0;

    @OriginalMember(owner = "client!dc", name = "mb", descriptor = "I")
    public static int field447 = 0;

    @OriginalMember(owner = "client!dc", name = "tb", descriptor = "Lfe;")
    public static class36 field454 = new class36(64);

    @OriginalMember(owner = "client!dc", name = "Ib", descriptor = "I")
    public static int field469 = -1;

    @OriginalMember(owner = "client!dc", name = "Jb", descriptor = "[J")
    public static long[] field470 = new long[100];

    @OriginalMember(owner = "client!dc", name = "hb", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!dc", name = "kb", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!dc", name = "lb", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!dc", name = "ob", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!dc", name = "Bb", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!dc", name = "Eb", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!dc", name = "Hb", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!dc", name = "Ab", descriptor = "Lcb;")
    public static class15 field461;

    @OriginalMember(owner = "client!dc", name = "Cb", descriptor = "Lda;")
    public static class20 field463;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)I")
    public static final int method141(int arg0) {
        if (arg0 >= -13) {
            return -20;
        } else {
            field468++;
            return 5;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)V")
    public final void method142(byte arg0, int arg1) {
        field445++;
        if (this.field443) {
            return;
        }
        this.field467 += arg1;
        while (this.field467 > this.field448.field1658[this.field460]) {
            this.field467 -= this.field448.field1658[this.field460];
            this.field460++;
            if (this.field460 >= this.field448.field1646.length) {
                this.field443 = true;
                break;
            }
        }
        if (arg0 != -67) {
            method143(false);
        }
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(Z)V")
    public static final void method143(boolean arg0) {
        if (!arg0) {
            field451 = null;
        }
        class40.method241(false, null, 12416, 0);
        field446++;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(Z)Lhb;")
    public final class44 method144(boolean arg0) {
        if (!arg0) {
            this.field467 = 82;
        }
        class114 var2 = class89.method631(76, this.field450);
        field465++;
        class44 var3;
        if (this.field443) {
            var3 = var2.method834(-1, (byte) -85);
        } else {
            var3 = var2.method834(this.field460, (byte) -104);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static final void method145(byte arg0) {
        for (int var1 = 0; var1 < class121.field2594; var1++) {
            int var10002 = class92.field2010[var1]--;
            if (class92.field2010[var1] >= -10) {
                class14 var3 = class43.field851[var1];
                if (var3 == null) {
                    var3 = class14.method76(class68.field1452, class49.field1020[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class92.field2010[var1] += var3.method73();
                    class43.field851[var1] = var3;
                }
                if (class92.field2010[var1] < 0) {
                    class38 var4 = var3.method75().method230(class54.field1147);
                    class118 var5 = class118.method864(var4, 100, class102.field2204);
                    var5.method861(class72.field1617[var1] - 1);
                    class57.field1203.method200(var5);
                    class92.field2010[var1] = -100;
                }
            } else {
                class121.field2594--;
                for (int var2 = var1; var2 < class121.field2594; var2++) {
                    class49.field1020[var2] = class49.field1020[var2 + 1];
                    class43.field851[var2] = class43.field851[var2 + 1];
                    class72.field1617[var2] = class72.field1617[var2 + 1];
                    class92.field2010[var2] = class92.field2010[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 <= 9) {
            field454 = null;
        }
        if (class26.field565 > 0) {
            class26.field565 -= 20;
            if (class26.field565 < 0) {
                class26.field565 = 0;
            }
            if (class26.field565 == 0 && class104.field2279 != 0 && class87.field1910 != -1) {
                class93.method656(0, 0, class87.field1910, false, class27.field570, class104.field2279, -126);
            }
        }
        field449++;
    }

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "(I)V")
    public static void method146(int arg0) {
        field456 = null;
        field466 = null;
        field458 = null;
        field470 = null;
        field464 = null;
        if (arg0 != 4) {
            return;
        }
        field451 = null;
        field453 = null;
        field454 = null;
        field461 = null;
        field463 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILbb;)I")
    public static final int method147(int arg0, int arg1, class9 arg2) {
        field442++;
        if (arg2.field138 == null || arg2.field138.length <= arg0) {
            return -2;
        }
        try {
            int[] var3 = arg2.field138[arg0];
            int var4 = 0;
            int var5 = 0;
            if (arg1 >= -34) {
                method141(24);
            }
            byte var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var5;
                }
                if (var7 == 1) {
                    var8 = class101.field2190[var3[var4++]];
                }
                if (var7 == 2) {
                    var8 = class61.field1255[var3[var4++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 3) {
                    var8 = class108.field2396[var3[var4++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class9 var12 = class9.method56(true, var11);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class9.method47(64, var13).field2341 || class75.field1685)) {
                        for (int var14 = 0; var14 < var12.field129.length; var14++) {
                            if (var13 + 1 == var12.field129[var14]) {
                                var8 += var12.field165[var14];
                            }
                        }
                    }
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 5) {
                    var8 = class10.field204[var3[var4++]];
                }
                if (var7 == 6) {
                    var8 = class51.field1102[class61.field1255[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class10.field204[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class46.field974.field1236;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class66.field1375[var15]) {
                            var8 += class61.field1255[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class9 var18 = class9.method56(true, var17);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class9.method47(64, var19).field2341 || class75.field1685)) {
                        for (int var20 = 0; var20 < var18.field129.length; var20++) {
                            if (var19 + 1 == var18.field129[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class125.field2696;
                }
                if (var7 == 12) {
                    var8 = class89.field1941;
                }
                if (var7 == 13) {
                    int var21 = class10.field204[var3[var4++]];
                    int var22 = var3[var4++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var8 = class81.method588(true, var23);
                }
                if (var7 == 18) {
                    var8 = (class46.field974.field1058 >> 7) + class33.field648;
                }
                if (var7 == 19) {
                    var8 = (class46.field974.field1065 >> 7) + class60.field1234;
                }
                if (var7 == 20) {
                    var8 = var3[var4++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var5 += var8;
                    }
                    if (var6 == 1) {
                        var5 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var5 /= var8;
                    }
                    if (var6 == 3) {
                        var5 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)I")
    public static final int method148(int arg0, int arg1, int arg2) {
        if (arg2 < arg1) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        if (arg0 != -1284878009) {
            return -18;
        }
        field462++;
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIIIIII)V")
    public class22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field441 = arg3;
        this.field450 = arg0;
        this.field455 = arg2;
        this.field444 = arg6 + arg5;
        this.field452 = arg1;
        this.field457 = arg4;
        int var8 = class89.method631(33, this.field450).field2485;
        if (var8 == -1) {
            this.field443 = true;
        } else {
            this.field443 = false;
            this.field448 = class67.method435(113, var8);
        }
    }
}
