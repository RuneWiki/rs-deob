import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class282 extends class105 {

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "Z")
    private boolean field4965 = true;

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "Z")
    private boolean field4971 = true;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "I")
    public static int field4969 = 0;

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "Lvf;")
    public static class265 field4973 = class87.method582(-46, ")1");

    @OriginalMember(owner = "client!dj", name = "W", descriptor = "Lvf;")
    public static class265 field4975 = class87.method582(-46, "logo");

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!dj", name = "V", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "[[[B")
    public static byte[][][] field4966;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        int[] var3 = super.field1862.method458(arg1, false);
        if (arg0 != 8055) {
            this.field4971 = false;
        }
        ++field4967;
        if (super.field1862.field1236) {
            int[] var4 = this.method705(this.field4971 ? -arg1 + class11.field377 : arg1, (byte) -78, 0);
            if (this.field4965) {
                for (int var5 = 0; var5 < class94.field1668; ++var5) {
                    var3[var5] = var4[-var5 + class1.field20];
                }
            } else {
                class194.method1340(var4, 0, var3, 0, class94.field1668);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
    public class282() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)[[I")
    public final int[][] method18(int arg0, byte arg1) {
        int[][] var3 = super.field1870.method569((byte) -108, arg0);
        if (super.field1870.field1567) {
            int[][] var4 = this.method702((byte) 94, this.field4971 ? -arg0 + class11.field377 : arg0, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field4965) {
                for (int var11 = 0; var11 < class94.field1668; ++var11) {
                    var8[var11] = var6[var11];
                    var9[var11] = var5[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; class94.field1668 > var12; ++var12) {
                    var8[var12] = var6[class1.field20 - var12];
                    var9[var12] = var5[-var12 + class1.field20];
                    var10[var12] = var7[class1.field20 - var12];
                }
            }
        }
        ++field4972;
        if (arg1 > -110) {
            field4969 = -80;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "(I)V")
    public static void method1915(int arg0) {
        field4966 = null;
        field4975 = null;
        if (arg0 == 0) {
            field4973 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "(I)V")
    public static final void method1916(int arg0) {
        ++field4974;
        int var1 = class15.field441.length;
        if (arg0 != 104) {
            field4969 = 77;
        }
        for (int var2 = 0; ~var1 < ~var2; ++var2) {
            if (class15.field441[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; ~class116.field2056 < ~var4; ++var4) {
                    if (class229.field4049[var4] == class111.field1953[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (~var3 == 0) {
                    class229.field4049[class116.field2056] = class111.field1953[var2];
                    var3 = class116.field2056++;
                }
                class135 var5 = new class135(class15.field441[var2]);
                int var6 = 0;
                while (~var5.field2449 > ~class15.field441[var2].length && var6 < 511) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method927(125);
                    int var9 = var8 >> 7 & 63;
                    int var10 = var8 >> 14;
                    int var11 = var8 & 63;
                    int var12 = (class111.field1953[var2] >> 8) * 64 - class64.field1248 - -var9;
                    int var13 = (class111.field1953[var2] & 255) * 64 + -class231.field4073 + var11;
                    class268 var14 = class98.method654(var5.method927(arg0 + 21), -1);
                    if (class4.field67[var7] == null && (var14.field4780 & 1) > 0 && class58.field1181 == var10 && var12 >= 0 && var14.field4713 + var12 < 104 && var13 >= 0 && var14.field4713 + var13 < 104) {
                        class4.field67[var7] = new class23();
                        class23 var15 = class4.field67[var7];
                        class93.field1646[class48.field1027++] = var7;
                        var15.field2542 = class93.field1655;
                        var15.method223((byte) -101, var14);
                        var15.method965((byte) -116, var15.field681.field4713);
                        var15.field2580 = var15.field2563 = class154.field2854[var15.field681.field4730];
                        var15.field2553 = var15.field681.field4736;
                        var15.field2577 = var15.field681.field4771;
                        var15.field2558 = var15.field681.field4768;
                        var15.field2601 = var15.field681.field4765;
                        var15.field2562 = var15.field681.field4751;
                        var15.field2588 = var15.field681.field4742;
                        var15.field2576 = var15.field681.field4777;
                        var15.field2606 = var15.field681.field4727;
                        if (~var15.field2553 == -1) {
                            var15.field2563 = 0;
                        }
                        var15.method968(true, 61, var15.method822(2), var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLba;)V")
    public static final void method1917(byte arg0, class140 arg1) {
        arg1.field2544 = false;
        int var2 = 117 % ((arg0 - -45) / 59);
        ++field4970;
        if (~arg1.field2582 != 0) {
            class216 var3 = class174.method1142(arg1.field2582, false);
            if (var3 != null && var3.field3890 != null) {
                ++arg1.field2548;
                if (arg1.field2547 < var3.field3890.length && ~arg1.field2548 < ~var3.field3894[arg1.field2547]) {
                    ++arg1.field2547;
                    arg1.field2548 = 1;
                    class268.method1832(var3, class214.field3827 == arg1, arg1.field2547, arg1.field2600, -2, arg1.field2564);
                }
                if (~arg1.field2547 <= ~var3.field3890.length) {
                    arg1.field2548 = 0;
                    arg1.field2547 = 0;
                    class268.method1832(var3, class214.field3827 == arg1, arg1.field2547, arg1.field2600, -2, arg1.field2564);
                }
            } else {
                arg1.field2582 = -1;
            }
        }
        if (~arg1.field2585 != 0 && class93.field1655 >= arg1.field2561) {
            int var4 = class210.method1441(arg1.field2585, -1999596368).field3720;
            if (var4 == -1) {
                arg1.field2585 = -1;
            } else {
                class216 var5 = class174.method1142(var4, false);
                if (var5 != null && var5.field3890 != null) {
                    if (arg1.field2602 < 0) {
                        arg1.field2602 = 0;
                        class268.method1832(var5, class214.field3827 == arg1, 0, arg1.field2600, -2, arg1.field2564);
                    }
                    ++arg1.field2538;
                    if (arg1.field2602 < var5.field3890.length && ~arg1.field2538 < ~var5.field3894[arg1.field2602]) {
                        ++arg1.field2602;
                        arg1.field2538 = 1;
                        class268.method1832(var5, class214.field3827 == arg1, arg1.field2602, arg1.field2600, -2, arg1.field2564);
                    }
                    if (var5.field3890.length <= arg1.field2602) {
                        arg1.field2585 = -1;
                    }
                } else {
                    arg1.field2585 = -1;
                }
            }
        }
        if (arg1.field2570 != -1 && arg1.field2591 <= 1) {
            class216 var6 = class174.method1142(arg1.field2570, false);
            if (var6.field3889 == 1 && arg1.field2590 > 0 && arg1.field2549 <= class93.field1655 && arg1.field2554 < class93.field1655) {
                arg1.field2591 = 1;
                return;
            }
        }
        if (arg1.field2570 != -1 && arg1.field2591 == 0) {
            class216 var7 = class174.method1142(arg1.field2570, false);
            if (var7 != null && var7.field3890 != null) {
                ++arg1.field2581;
                if (~var7.field3890.length < ~arg1.field2552 && ~var7.field3894[arg1.field2552] > ~arg1.field2581) {
                    ++arg1.field2552;
                    arg1.field2581 = 1;
                    class268.method1832(var7, class214.field3827 == arg1, arg1.field2552, arg1.field2600, -2, arg1.field2564);
                }
                if (var7.field3890.length <= arg1.field2552) {
                    ++arg1.field2589;
                    arg1.field2552 -= var7.field3883;
                    if (arg1.field2589 >= var7.field3873) {
                        arg1.field2570 = -1;
                    } else if (arg1.field2552 >= 0 && arg1.field2552 < var7.field3890.length) {
                        class268.method1832(var7, class214.field3827 == arg1, arg1.field2552, arg1.field2600, -2, arg1.field2564);
                    } else {
                        arg1.field2570 = -1;
                    }
                }
                arg1.field2544 = var7.field3881;
            } else {
                arg1.field2570 = -1;
            }
        }
        if (~arg1.field2591 < -1) {
            --arg1.field2591;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field1853 = ~arg2.method920((byte) 41) == -2;
                }
            } else {
                this.field4971 = arg2.method920((byte) 121) == 1;
            }
        } else {
            this.field4965 = ~arg2.method920((byte) 28) == -2;
        }
        ++field4968;
        if (arg1 != 255) {
            this.method12(43, 64, (class135) null);
        }
    }
}
