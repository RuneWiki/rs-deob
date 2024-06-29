import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class189 extends class89 {

    @OriginalMember(owner = "client!o", name = "W", descriptor = "I")
    private int field3373 = 4;

    @OriginalMember(owner = "client!o", name = "fb", descriptor = "I")
    private int field3382 = 4;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "Lha;")
    public static class46 field3371 = class271.method1828("Cabbage", -46);

    @OriginalMember(owner = "client!o", name = "db", descriptor = "[[[I")
    public static int[][][] field3380 = new int[4][13][13];

    @OriginalMember(owner = "client!o", name = "eb", descriptor = "[I")
    public static int[] field3381 = new int[32];

    @OriginalMember(owner = "client!o", name = "cb", descriptor = "Lha;")
    public static class46 field3379 = class271.method1828("RuneScape wird geladen )2 bitte warten)3)3)3", -46);

    @OriginalMember(owner = "client!o", name = "R", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!o", name = "X", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "Lfa;")
    public static class211 field3378;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "Lbd;")
    public static class74 field3370;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        ++field3375;
        if (arg1 != -641641492) {
            field3371 = null;
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field3373 = arg0.method558(1);
            }
        } else {
            this.field3382 = arg0.method558(1);
        }
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(B)V")
    public static void method1369(byte arg0) {
        int var1 = -71 % ((arg0 - -22) / 35);
        field3371 = null;
        field3378 = null;
        field3380 = null;
        field3370 = null;
        field3379 = null;
        field3381 = null;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class189() {
        super(1, false);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZ)I")
    public static final int method1370(int arg0, boolean arg1) {
        if (arg1) {
            field3378 = null;
        }
        ++field3376;
        return arg0 >> 11 & 127;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)Lha;")
    public static final class46 method1371(int arg0, int arg1) {
        ++field3369;
        class46 var2 = class115.method932(false, arg0);
        for (int var3 = -3 + var2.method314(arg1 + 17130); ~var3 < -1; var3 -= 3) {
            var2 = class109.method855(0, new class46[] { var2.method338(19551, var3, 0), class115.field2165, var2.method339(var3, 121) });
        }
        if (arg1 != -17060) {
            field3370 = null;
        }
        if (var2.method314(27) > 9) {
            return class109.method855(0, new class46[] { class237.field4182, var2.method338(arg1 ^ -3837, -8 + var2.method314(arg1 ^ -17073), 0), class97.field1803, class216.field3829, var2, class144.field2618 });
        } else {
            return ~var2.method314(73) < -7 ? class109.method855(0, new class46[] { class216.field3833, var2.method338(19551, -4 + var2.method314(29), 0), class218.field3847, class216.field3829, var2, class144.field2618 }) : class109.method855(0, new class46[] { class63.field1057, var2, class30.field581 });
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)I")
    public static final int method1372(int arg0, int arg1) {
        ++field3368;
        if (arg1 != 127) {
            method1370(109, true);
        }
        return 127 & arg0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        if (arg1 != 25) {
            method1370(111, true);
        }
        int[][] var3 = super.field1695.method843((byte) -25, arg0);
        if (super.field1695.field2028) {
            int var4 = class241.field4284 / this.field3382;
            int var5 = class113.field2149 / this.field3373;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method689((byte) 95, 0, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method689((byte) 95, 0, class113.field2149 * var7 / var5);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class241.field4284; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class241.field4284 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        ++field3372;
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(III)V")
    public static final void method1373(int arg0, int arg1, int arg2) {
        ++field3374;
        class39 var3 = class103.field1874[class135.field2450][arg2][arg1];
        if (var3 == null) {
            class92.method719(class135.field2450, arg2, arg1);
        } else {
            int var4 = -99999999;
            class254 var5 = null;
            for (class254 var6 = (class254) var3.method264(-94); var6 != null; var6 = (class254) var3.method269((byte) 7)) {
                class71 var14 = class80.method633(var6.field4456.field2609, 0);
                int var15 = var14.field1257;
                if (var14.field1226 == 1) {
                    var15 = (var6.field4456.field2612 - -1) * var15;
                }
                if (var4 < var15) {
                    var5 = var6;
                    var4 = var15;
                }
            }
            if (var5 == null) {
                class92.method719(class135.field2450, arg2, arg1);
            } else {
                class144 var7 = null;
                class144 var8 = null;
                var3.method268((byte) -68, var5);
                int var9 = 51 / ((arg0 - -21) / 45);
                for (class254 var10 = (class254) var3.method264(-59); var10 != null; var10 = (class254) var3.method269((byte) 7)) {
                    class144 var13 = var10.field4456;
                    if (var5.field4456.field2609 != var13.field2609) {
                        if (var8 == null) {
                            var8 = var13;
                        }
                        if (var8.field2609 != var13.field2609 && var7 == null) {
                            var7 = var13;
                        }
                    }
                }
                long var11 = (long) ((arg1 << 7) + arg2 + 1610612736);
                class198.method1417(class135.field2450, arg2, arg1, class206.method1461(arg1 * 128 + 64, class135.field2450, arg2 * 128 - -64, 4), var5.field4456, var11, var8, var7);
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        ++field3377;
        int[] var3 = super.field1688.method936(1, arg0);
        int var4 = -31 / ((arg1 - 51) / 44);
        if (super.field1688.field2200) {
            int var5 = class113.field2149 / this.field3373;
            int var6 = class241.field4284 / this.field3382;
            int[] var7;
            if (~var5 >= -1) {
                var7 = this.method685(90, 0, 0);
            } else {
                int var8 = arg0 % var5;
                var7 = this.method685(-125, class113.field2149 * var8 / var5, 0);
            }
            for (int var9 = 0; var9 < class241.field4284; ++var9) {
                if (var6 <= 0) {
                    var3[var9] = var7[0];
                } else {
                    int var10 = var9 % var6;
                    var3[var9] = var7[class241.field4284 * var10 / var6];
                }
            }
        }
        return var3;
    }
}
