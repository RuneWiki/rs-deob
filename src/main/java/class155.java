import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class155 extends class115 {

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "I")
    private int field2701 = 0;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
    private int field2698 = 1;

    @OriginalMember(owner = "client!wg", name = "eb", descriptor = "I")
    private int field2705 = 0;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "Lqe;")
    public static class168 field2693 = class66.method448("Freie Welt", -119);

    @OriginalMember(owner = "client!wg", name = "bb", descriptor = "I")
    public static int field2702 = 0;

    @OriginalMember(owner = "client!wg", name = "gb", descriptor = "I")
    public static int field2707 = 0;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "Lhe;")
    public static class47 field2695 = new class47();

    @OriginalMember(owner = "client!wg", name = "jb", descriptor = "Lqe;")
    public static class168 field2710 = class66.method448(" )2> ", -110);

    @OriginalMember(owner = "client!wg", name = "lb", descriptor = "Lqe;")
    public static class168 field2712 = class66.method448("::clientdrop", 9);

    @OriginalMember(owner = "client!wg", name = "mb", descriptor = "Lqe;")
    public static class168 field2713 = class66.method448("<col=ff0000>", -128);

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!wg", name = "cb", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!wg", name = "db", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!wg", name = "fb", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!wg", name = "hb", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!wg", name = "ib", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "Lmj;")
    public static class129 field2700;

    @OriginalMember(owner = "client!wg", name = "kb", descriptor = "Lui;")
    public static class236 field2711;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(B)V")
    public static void method1020(byte arg0) {
        field2710 = null;
        field2713 = null;
        field2712 = null;
        field2695 = null;
        field2711 = null;
        field2693 = null;
        field2700 = null;
        if (arg0 <= 103) {
            field2711 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)V")
    public final void method170(int arg0) {
        ++field2704;
        if (arg0 == 395462996) {
            class142.method969(-15046);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method1021(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class185.field3270 = arg3;
        class102.field1632 = arg1;
        class222.field3813 = arg0;
        class120.field1955 = arg4;
        if (arg2 != 31145) {
            field2712 = null;
        }
        ++field2709;
        class61.field843 = arg6;
        if (arg5 && class120.field1955 >= 100) {
            class114.field1854 = class222.field3813 * 128 + 64;
            class105.field1680 = class185.field3270 * 128 + 64;
            class88.field1372 = class236.method1535(class114.field1854, class196.field3401, class105.field1680, arg2 + -31145) - class61.field843;
        }
        class31.field379 = 2;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIII)V")
    public static final void method1022(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2708;
        class254.field4389[arg2].method1038(arg5, arg0);
        class254.field4389[1].method1038(arg5, arg0 + -16 + arg3);
        int var6 = (arg3 + -32) * arg3 / arg1;
        if (~var6 > -9) {
            var6 = 8;
        }
        int var7 = (arg3 - 32 + -var6) * arg4 / (-arg3 + arg1);
        class216.method1405(arg5, arg0 + 16, 16, arg3 + -32, class191.field3327);
        class216.method1405(arg5, arg0 + 16 - -var7, 16, var6, class103.field1668);
        class216.method1402(arg5, arg0 - -16 + var7, var6, class18.field200);
        class216.method1402(arg5 + 1, arg0 + 16 + var7, var6, class18.field200);
        class216.method1406(arg5, arg0 + var7 - -16, 16, class18.field200);
        class216.method1406(arg5, var7 + 17 + arg0, 16, class18.field200);
        class216.method1402(arg5 + 15, arg0 + var7 + 16, var6, class79.field1192);
        class216.method1402(arg5 - -14, arg0 - -var7 + 17, var6 - 1, class79.field1192);
        class216.method1406(arg5, arg0 - -15 + var7 - -var6, 16, class79.field1192);
        class216.method1406(arg5 - -1, arg0 + var6 + var7 + 14, 15, class79.field1192);
    }

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "(I)[Lgd;")
    public static final class65[] method1023(int arg0) {
        class65[] var1 = new class65[class85.field1331];
        for (int var2 = 0; ~var2 > ~class85.field1331; ++var2) {
            int var3 = class85.field1332[var2] * class69.field978[var2];
            byte[] var4 = class7.field84[var2];
            if (!class69.field981[var2]) {
                int[] var5 = new int[var3];
                for (int var6 = 0; ~var6 > ~var3; ++var6) {
                    var5[var6] = class92.field1457[class86.method571(var4[var6], 255)];
                }
                var1[var2] = new class15(class243.field4225, class150.field2597, class33.field415[var2], class54.field746[var2], class85.field1332[var2], class69.field978[var2], var5);
            } else {
                byte[] var7 = class21.field256[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; ~var9 > ~var3; ++var9) {
                    var8[var9] = class102.method675(class86.method571(var7[var9], 255) << 24, class92.field1457[class86.method571(255, var4[var9])]);
                }
                var1[var2] = new class183(class243.field4225, class150.field2597, class33.field415[var2], class54.field746[var2], class85.field1332[var2], class69.field978[var2], var8);
            }
        }
        class246.method1613(0);
        ++field2699;
        if (arg0 != -20842) {
            field2693 = null;
        }
        return var1;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLoe;)V")
    public static final void method1024(byte arg0, class256 arg1) {
        class94.field1477 = arg1;
        if (arg0 >= -64) {
            method1020((byte) -37);
        }
        ++field2703;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        ++field2692;
        if (arg0 != 107) {
            field2710 = null;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -4) {
                    this.field2698 = arg1.method758(true);
                }
            } else {
                this.field2701 = arg1.method758(true);
            }
        } else {
            this.field2705 = arg1.method758(true);
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
    public class155() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        if (arg1 < 37) {
            field2710 = null;
        }
        ++field2694;
        int[] var3 = super.field1872.method182((byte) -113, arg0);
        if (super.field1872.field341) {
            int var4 = class170.field2963[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; class130.field2297 > var6; ++var6) {
                int var7 = class193.field3367[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field2705 == -1) {
                    var9 = (-var4 + var7) * this.field2698;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field2698 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field2701 != -1) {
                    if (this.field2701 == 2) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class234.field3980[255 & var12 >> 4] - -4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lmj;Z)V")
    public static final void method1025(class129 arg0, boolean arg1) {
        ++field2697;
        class129 var2 = class116.method796(arg0, (byte) 122);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class223.field3837;
            var4 = class42.field551;
        } else {
            var3 = var2.field2175;
            var4 = var2.field2210;
        }
        class52.method375(arg0, var4, false, arg1, var3);
        class64.method438(var3, arg0, var4, (byte) -123);
    }
}
