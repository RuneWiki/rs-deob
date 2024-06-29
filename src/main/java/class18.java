import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class18 extends class42 {

    @OriginalMember(owner = "client!bg", name = "yb", descriptor = "I")
    private int field310 = 0;

    @OriginalMember(owner = "client!bg", name = "Kb", descriptor = "I")
    private int field322 = 0;

    @OriginalMember(owner = "client!bg", name = "Lb", descriptor = "Z")
    private boolean field323 = false;

    @OriginalMember(owner = "client!bg", name = "zb", descriptor = "I")
    public int field311;

    @OriginalMember(owner = "client!bg", name = "Gb", descriptor = "I")
    public int field318;

    @OriginalMember(owner = "client!bg", name = "Nb", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client!bg", name = "jb", descriptor = "I")
    public int field295;

    @OriginalMember(owner = "client!bg", name = "ob", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client!bg", name = "pb", descriptor = "I")
    private int field301;

    @OriginalMember(owner = "client!bg", name = "kb", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client!bg", name = "Ib", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client!bg", name = "nb", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client!bg", name = "fb", descriptor = "I")
    public int field291;

    @OriginalMember(owner = "client!bg", name = "Db", descriptor = "I")
    public int field315;

    @OriginalMember(owner = "client!bg", name = "Ab", descriptor = "Lgg;")
    private class62 field312;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "Lsd;")
    public static class166 field286 = class135.method935("Der Anmelde)2Server ist offline)3", 0);

    @OriginalMember(owner = "client!bg", name = "cb", descriptor = "[I")
    public static int[] field288 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!bg", name = "mb", descriptor = "Lvd;")
    public static class193 field298 = null;

    @OriginalMember(owner = "client!bg", name = "wb", descriptor = "Lsd;")
    public static class166 field308 = class135.method935("Null", 0);

    @OriginalMember(owner = "client!bg", name = "lb", descriptor = "Lsd;")
    private static class166 field297 = class135.method935("red:", 0);

    @OriginalMember(owner = "client!bg", name = "Eb", descriptor = "Lsd;")
    public static class166 field316 = field297;

    @OriginalMember(owner = "client!bg", name = "Cb", descriptor = "Lsd;")
    public static class166 field314 = field297;

    @OriginalMember(owner = "client!bg", name = "bb", descriptor = "D")
    private double field287;

    @OriginalMember(owner = "client!bg", name = "hb", descriptor = "D")
    private double field293;

    @OriginalMember(owner = "client!bg", name = "tb", descriptor = "D")
    public double field305;

    @OriginalMember(owner = "client!bg", name = "xb", descriptor = "D")
    public double field309;

    @OriginalMember(owner = "client!bg", name = "Bb", descriptor = "D")
    private double field313;

    @OriginalMember(owner = "client!bg", name = "Hb", descriptor = "D")
    private double field319;

    @OriginalMember(owner = "client!bg", name = "Mb", descriptor = "D")
    private double field324;

    @OriginalMember(owner = "client!bg", name = "Ob", descriptor = "D")
    public double field326;

    @OriginalMember(owner = "client!bg", name = "db", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "client!bg", name = "eb", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!bg", name = "gb", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!bg", name = "ib", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!bg", name = "qb", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!bg", name = "sb", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!bg", name = "ub", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!bg", name = "vb", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!bg", name = "Fb", descriptor = "I")
    public int field317;

    @OriginalMember(owner = "client!bg", name = "Jb", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!bg", name = "rb", descriptor = "Lcb;")
    public static class22 field303;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)V")
    public final void method108(int arg0, int arg1) {
        this.field323 = true;
        this.field305 += (double) arg0 * this.field293;
        field302++;
        this.field326 += this.field324 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field287;
        this.field287 += (double) arg0 * this.field324;
        this.field309 += (double) arg0 * this.field319;
        this.field317 = (int) (Math.atan2(this.field319, this.field293) * 325.949D) + arg1 & 0x7FF;
        this.field289 = (int) (Math.atan2(this.field287, this.field313) * 325.949D) & 0x7FF;
        if (this.field312 == null) {
            return;
        }
        this.field322 += arg0;
        while (true) {
            do {
                do {
                    if (this.field312.field1268[this.field310] >= this.field322) {
                        return;
                    }
                    this.field322 -= this.field312.field1268[this.field310];
                    this.field310++;
                } while (this.field312.field1279.length > this.field310);
                this.field310 -= this.field312.field1267;
            } while (this.field310 >= 0 && this.field310 < this.field312.field1279.length);
            this.field310 = 0;
        }
    }

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "(I)V")
    public static void method109(int arg0) {
        field314 = null;
        field298 = null;
        field286 = null;
        field288 = null;
        field308 = null;
        field316 = null;
        field297 = null;
        if (arg0 < 18) {
            method112((byte) 15);
        }
        field303 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)I")
    public static final int method110(int arg0, byte arg1) {
        field290++;
        int var2 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0x73333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        if (arg1 != -37) {
            method110(33, (byte) -62);
        }
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "(I)Lo;")
    public final class126 method111(int arg0) {
        field304++;
        class117 var2 = class12.method77(this.field320, 13);
        class126 var3 = var2.method843((byte) 117, this.field310);
        if (var3 == null) {
            return null;
        }
        var3.method899(this.field289);
        if (arg0 < 8) {
            method109(-45);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
    public static final void method112(byte arg0) {
        class2.field29 = 0;
        class206.field4058 = 0;
        class84.method679((byte) 75);
        field307++;
        class132.method925(-4096);
        class72.method573(-21);
        class196.method1303(arg0 ^ 0xFFFFFFCB);
        if (arg0 != 105) {
            method110(-65, (byte) -126);
        }
        for (int var1 = 0; var1 < class2.field29; var1++) {
            int var3 = class167.field3219[var1];
            if (class49.field910 != class182.field3451[var3].field3535) {
                class182.field3451[var3] = null;
            }
        }
        if (class19.field335 != class179.field3377.field1000) {
            throw new RuntimeException("gpp1 pos:" + class179.field3377.field1000 + " psize:" + class19.field335);
        }
        for (int var2 = 0; var2 < class6.field131; var2++) {
            if (class182.field3451[class53.field967[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class6.field131);
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lsd;Lf;Lsd;I)Lkf;")
    public static final class96 method113(class166 arg0, class47 arg1, class166 arg2, int arg3) {
        int var4 = 52 % ((-arg3 - 41) / 36);
        int var5 = arg1.method363(arg2, 0);
        field292++;
        int var6 = arg1.method362(var5, arg0, -38);
        return class136.method942(var5, arg1, var6, -98049);
    }

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "(I)V")
    public static final void method114(int arg0) {
        field294++;
        class68.method550(field298, 15);
        class184.field3481++;
        if (class116.field2249 && class97.field1863) {
            int var1 = class41.field734;
            int var2 = class5.field110;
            int var3 = var1 - class35.field660;
            int var4 = var2 - class41.field731;
            int var5 = field298.field3826;
            if (class123.field2418 > var3) {
                var3 = class123.field2418;
            }
            if (var4 < class25.field448) {
                var4 = class25.field448;
            }
            if (field298.field3705 + var3 > class123.field2418 + class64.field1328.field3705) {
                var3 = class123.field2418 + class64.field1328.field3705 - field298.field3705;
            }
            int var6 = var3 - class204.field4030;
            int var7 = var3 + class64.field1328.field3808 - class123.field2418;
            if (arg0 == -21713) {
                if (var4 + field298.field3768 > class25.field448 + class64.field1328.field3768) {
                    var4 = class64.field1328.field3768 + class25.field448 - field298.field3768;
                }
                int var8 = var4 + class64.field1328.field3739 - class25.field448;
                int var9 = var4 - class107.field2091;
                if (field298.field3702 < class184.field3481 && (var5 < var6 || var6 < -var5 || var9 > var5 || var9 < -var5)) {
                    class196.field3874 = true;
                }
                if (field298.field3736 != null && class196.field3874) {
                    class137 var10 = new class137();
                    var10.field2667 = var8;
                    var10.field2668 = field298.field3736;
                    var10.field2673 = field298;
                    var10.field2666 = var7;
                    class166.method1126((byte) -113, var10);
                }
                if (class51.field929 == 0) {
                    if (class196.field3874) {
                        if (field298.field3789 != null) {
                            class137 var11 = new class137();
                            var11.field2662 = class16.field271;
                            var11.field2666 = var7;
                            var11.field2673 = field298;
                            var11.field2667 = var8;
                            var11.field2668 = field298.field3789;
                            class166.method1126((byte) -113, var11);
                        }
                        if (class16.field271 != null && class189.method1269(18822, field298) != null) {
                            class110.field2132++;
                            class156.field2989.method705(243, (byte) 9);
                            class156.field2989.method439((byte) 74, class16.field271.field3715);
                            class156.field2989.method403(field298.field3715, true);
                            class156.field2989.method407((byte) -126, field298.field3716);
                            class156.field2989.method407((byte) -123, class16.field271.field3716);
                        }
                    } else if ((class140.field2733 == 1 || class176.method1200((byte) -36, class160.field3064 - 1)) && class160.field3064 > 2) {
                        class199.method1309((byte) 73);
                    } else if (class160.field3064 > 0) {
                        class84.method677(class160.field3064 - 1, 2);
                    }
                    field298 = null;
                }
            }
        } else if (class184.field3481 > 1) {
            field298 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIBII)V")
    public final void method115(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field321++;
        if (!this.field323) {
            double var6 = (double) (arg0 - this.field296);
            double var8 = (double) (arg1 - this.field300);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field305 = (double) this.field299 * var6 / var10 + (double) this.field296;
            this.field309 = (double) this.field299 * var8 / var10 + (double) this.field300;
            this.field326 = this.field301;
        }
        double var12 = (double) (this.field311 + 1 - arg4);
        if (arg2 != 22) {
            return;
        }
        this.field293 = ((double) arg0 - this.field305) / var12;
        this.field319 = ((double) arg1 - this.field309) / var12;
        this.field313 = Math.sqrt(this.field319 * this.field319 + this.field293 * this.field293);
        if (!this.field323) {
            this.field287 = -this.field313 * Math.tan((double) this.field325 * 0.02454369D);
        }
        this.field324 = ((double) arg3 - this.field326 - this.field287 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field311 = arg6;
        this.field318 = arg1;
        this.field325 = arg7;
        this.field295 = arg5;
        this.field300 = arg2;
        this.field301 = arg4;
        this.field296 = arg3;
        this.field320 = arg0;
        this.field299 = arg8;
        this.field291 = arg9;
        this.field323 = false;
        this.field315 = arg10;
        int var12 = class12.method77(this.field320, 13).field2275;
        if (var12 == -1) {
            this.field312 = null;
        } else {
            this.field312 = class110.method798(var12, 12);
        }
    }
}
