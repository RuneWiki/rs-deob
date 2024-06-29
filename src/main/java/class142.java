import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class142 extends class183 {

    @OriginalMember(owner = "client!uj", name = "db", descriptor = "I")
    private int field2468 = -1;

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "I")
    public static int field2458 = 100;

    @OriginalMember(owner = "client!uj", name = "Z", descriptor = "[[[B")
    public static byte[][][] field2464 = new byte[4][104][104];

    @OriginalMember(owner = "client!uj", name = "gb", descriptor = "Ljf;")
    public static class229 field2471 = class212.method1457((byte) 72, "");

    @OriginalMember(owner = "client!uj", name = "cb", descriptor = "Lnf;")
    public static class67 field2467 = null;

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "[[I")
    public static int[][] field2461 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!uj", name = "X", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!uj", name = "Y", descriptor = "I")
    public int field2463;

    @OriginalMember(owner = "client!uj", name = "ab", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!uj", name = "bb", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!uj", name = "eb", descriptor = "I")
    public int field2469;

    @OriginalMember(owner = "client!uj", name = "fb", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!uj", name = "hb", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!uj", name = "ib", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!uj", name = "kb", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!uj", name = "lb", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!uj", name = "jb", descriptor = "[I")
    public int[] field2474;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIZIIIFI)[[I", line = 6)
    public static final int[][] method987(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, float arg7, int arg8) {
        field2462++;
        class80 var9 = new class80();
        var9.field1459 = arg0;
        var9.field1450 = arg8;
        int[][] var10 = new int[arg2][arg1];
        var9.field1455 = arg3;
        var9.field1448 = (int) (arg7 * 4096.0F);
        var9.field1449 = arg6;
        var9.method25(-8);
        class328.method2216(arg1, arg2, (byte) -93);
        int var11 = 0;
        if (arg4 < 87) {
            return (int[][]) ((int[][]) null);
        }
        while (arg2 > var11) {
            var9.method569(var11, var10[var11], 263904844);
            var11++;
        }
        return var10;
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(B)I", line = 38)
    public final int method988(byte arg0) {
        field2460++;
        int var2 = -80 % ((arg0 + 44) / 33);
        return this.field2468;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "([Ljf;I)Ljf;", line = 51)
    public static final class229 method989(class229[] arg0, int arg1) {
        field2459++;
        if (arg1 > -8) {
            method989((class229[]) null, -76);
        }
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class63.method473(arg0.length, 0, (byte) -102, arg0);
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)V", line = 69)
    public final void method454(int arg0) {
        super.method454(117);
        int var2 = 39 % ((70 - arg0) / 42);
        this.field2474 = null;
        field2473++;
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)Z", line = 81)
    public final boolean method990(int arg0) {
        field2470++;
        if (this.field2474 != null) {
            return true;
        } else if (arg0 <= this.field2468) {
            class159 var2 = class167.field2871 >= 0 ? class186.method1297(class237.field4091, this.field2468, -87, class167.field2871) : class323.method2171(70, class237.field4091, this.field2468);
            var2.method1070();
            this.field2463 = var2.field669;
            this.field2469 = var2.field667;
            this.field2474 = var2.field2708;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIILij;)V", line = 105)
    public static final void method991(int arg0, int arg1, int arg2, int arg3, class83 arg4) {
        field2472++;
        if (arg1 <= 18) {
            field2471 = (class229) null;
        }
        for (class165 var5 = (class165) class83.field1589.method2078(-95); var5 != null; var5 = (class165) class83.field1589.method2080(5)) {
            if (var5.field2838 == arg3 && (arg2 * 128) == var5.field2829 && (arg0 * 128) == var5.field2824 && var5.field2833.field1580 == arg4.field1580) {
                if (var5.field2834 != null) {
                    class104.field1816.method613(var5.field2834);
                    var5.field2834 = null;
                }
                if (var5.field2820 != null) {
                    class104.field1816.method613(var5.field2820);
                    var5.field2820 = null;
                }
                var5.method1747((byte) -60);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)[[I", line = 151)
    public int[][] method12(int arg0, int arg1) {
        int[][] var3 = this.field3160.method1057(-20449, arg1);
        if (this.field3160.field2689 && this.method990(0)) {
            int[] var4 = var3[1];
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            int var7 = this.field2469 * (class144.field2508 == this.field2463 ? arg1 : this.field2463 * arg1 / class144.field2508);
            if (class22.field393 == this.field2469) {
                for (int var8 = 0; var8 < class22.field393; var8++) {
                    int var9 = this.field2474[var7++];
                    var5[var8] = class305.method2086(var9 << 4, 4080);
                    var4[var8] = class305.method2086(65280, var9) >> 4;
                    var6[var8] = class305.method2086(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; var10 < class22.field393; var10++) {
                    int var11 = this.field2469 * var10 / class22.field393;
                    int var12 = this.field2474[var7 + var11];
                    var5[var10] = class305.method2086(4080, var12 << 4);
                    var4[var10] = class305.method2086(var12, 65280) >> 4;
                    var6[var10] = class305.method2086(var12 >> 12, 4080);
                }
            }
        }
        int var13 = 121 / ((18 - arg0) / 61);
        field2466++;
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILkh;I)V", line = 229)
    public final void method14(int arg0, class14 arg1, int arg2) {
        if (arg0 >= -43) {
            method994(20);
        }
        if (arg2 == 0) {
            this.field2468 = arg1.method116(-1);
        }
        field2465++;
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(B)V", line = 245)
    public static void method992(byte arg0) {
        if (arg0 != -32) {
            method987(-8, -101, -127, true, -78, -68, 20, 0.93794876F, -53);
        }
        field2467 = null;
        field2471 = null;
        field2461 = (int[][]) null;
        field2464 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(III)I", line = 260)
    public static final int method993(int arg0, int arg1, int arg2) {
        class187 var3 = (class187) class278.field4772.method1890((long) arg2, -107);
        field2475++;
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field3281.length; var5++) {
                if (var3.field3279[var5] == arg1) {
                    var4 += var3.field3281[var5];
                }
            }
            if (arg0 < 121) {
                field2467 = (class67) null;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V", line = 301)
    public class142() {
        super(0, false);
    }

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)V", line = 317)
    public static final void method994(int arg0) {
        class194.method1328((byte) -74, class317.field5356);
        field2476++;
        class179.field3107++;
        if (class155.field2650 && class290.field4961) {
            int var1 = class287.field4914;
            int var2 = var1 - class303.field5150;
            if (class63.field1091 > var2) {
                var2 = class63.field1091;
            }
            int var3 = class82.field1511;
            int var4 = var3 - class4.field34;
            if (class151.field2617 > var4) {
                var4 = class151.field2617;
            }
            if ((class317.field5356.field1295 + var4) > (class151.field2617 + class206.field3594.field1295)) {
                var4 = class151.field2617 + class206.field3594.field1295 - class317.field5356.field1295;
            }
            if (class317.field5356.field1258 + var2 > class63.field1091 + class206.field3594.field1258) {
                var2 = class63.field1091 - (class317.field5356.field1258 - class206.field3594.field1258);
            }
            int var5 = var2 - class329.field5596;
            int var6 = var4 - class211.field3625;
            if (arg0 != 174) {
                method993(-17, -32, 38);
            }
            int var7 = class317.field5356.field1256;
            if (class317.field5356.field1275 < class179.field3107 && (var5 > var7 || (-var7) > var5 || var6 > var7 || var6 < -var7)) {
                class66.field1129 = true;
            }
            int var8 = var2 - (class63.field1091 - class206.field3594.field1297);
            int var9 = var4 + class206.field3594.field1167 - class151.field2617;
            if (class317.field5356.field1164 != null && class66.field1129) {
                class192 var10 = new class192();
                var10.field3327 = class317.field5356;
                var10.field3322 = var9;
                var10.field3324 = class317.field5356.field1164;
                var10.field3325 = var8;
                class215.method1477(-19319, var10);
            }
            if (class235.field4062 == 0) {
                if (class66.field1129) {
                    if (class317.field5356.field1232 != null) {
                        class192 var11 = new class192();
                        var11.field3327 = class317.field5356;
                        var11.field3332 = class22.field384;
                        var11.field3324 = class317.field5356.field1232;
                        var11.field3322 = var9;
                        var11.field3325 = var8;
                        class215.method1477(-19319, var11);
                    }
                    if (class22.field384 != null && client.method1828(class317.field5356) != null) {
                        class205.field3579++;
                        class84.field1608.method1397(174, 0);
                        class84.field1608.method100(class317.field5356.field1247, 65280);
                        class84.field1608.method125(-25369, class317.field5356.field1193);
                        class84.field1608.method119((byte) -122, class22.field384.field1247);
                        class84.field1608.method133((byte) 95, class22.field384.field1193);
                    }
                } else if ((class189.field3292 == 1 || class70.method516(class124.field2176 - 1, (byte) -86)) && class124.field2176 > 2) {
                    class14.method96(10754);
                } else if (class124.field2176 > 0) {
                    class109.method774(arg0 ^ 0x210E);
                }
                class317.field5356 = null;
            }
        } else if (class179.field3107 > 1) {
            class317.field5356 = null;
        }
    }
}
