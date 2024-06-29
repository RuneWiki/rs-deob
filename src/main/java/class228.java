import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class228 extends class82 {

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "I")
    private int field2799 = 0;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
    private int field2807 = 2048;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
    private int field2804 = 10;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
    public static int field2797 = 0;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "Lse;")
    public static class213 field2801;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "[I")
    private int[] field2805;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "[I")
    private int[] field2806;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILqa;)V", line = 4)
    public static final void method1299(int arg0, class206 arg1) {
        ++field2803;
        if (arg0 != 4479) {
            field2801 = null;
        }
        int var2 = class308.field3933;
        int var3 = class521.field7314;
        int var4 = class609.field8848;
        int var5 = class594.field8623 - 3;
        byte var6 = 20;
        if (class6.field49 == null || class388.field5126 == null) {
            if (class39.field299.method2566(arg0 + -4410, class191.field2305) && class39.field299.method2566(100, class329.field4295)) {
                class6.field49 = arg1.method1101(class3.method18(class39.field299, class191.field2305, 0), true);
                class3 var7 = class3.method18(class39.field299, class329.field4295, 0);
                class388.field5126 = arg1.method1101(var7, true);
                var7.method9();
                class426.field5484 = arg1.method1101(var7, true);
            } else {
                arg1.method1133(var2, var3, var4, var6, class503.field6970 | -class147.field1761 + 255 << 24, 1);
            }
        }
        if (class6.field49 != null && class388.field5126 != null) {
            int var8 = (-(2 * class388.field5126.method291()) + var4) / class6.field49.method291();
            for (int var9 = 0; ~var8 < ~var9; ++var9) {
                class6.field49.method299(class388.field5126.method291() + var2 + class6.field49.method291() * var9, var3);
            }
            class388.field5126.method299(var2, var3);
            class426.field5484.method299(-class426.field5484.method291() + var2 + var4, var3);
        }
        class459.field6320.method540(-16777216 | class89.field1098, var3 + 14, class31.field237.method987(class31.field247, 22), var2 - -3, -1, false);
        arg1.method1133(var2, var3 + var6, var4, -var6 + var5, -class147.field1761 + 255 << 24 | class503.field6970, 1);
        int var10 = class368.field4859.method167(64);
        int var11 = class368.field4859.method169(-110);
        int var12 = 0;
        for (class99 var13 = (class99) class89.field1096.method1050((byte) 73); var13 != null; var13 = (class99) class89.field1096.method1047(-7962)) {
            int var31 = (-var12 + class199.field2397 + -1) * 16 + var6 + 13 + var3;
            ++var12;
            if (var2 < var10 && var10 < var2 + var4 && var11 > var31 - 13 && var11 < var31 + 4 && var13.field1224) {
                arg1.method1133(var2, var31 + -12, var4, 16, class367.field4824 | -class163.field1997 + 255 << 24, 1);
            }
        }
        if ((class636.field9145 == null || class258.field3324 == null || class128.field1576 == null) && class39.field299.method2566(arg0 ^ 4408, class40.field316) && class39.field299.method2566(arg0 + -4354, class206.field2480) && class39.field299.method2566(91, class391.field5186)) {
            class3 var14 = class3.method18(class39.field299, class206.field2480, 0);
            class258.field3324 = arg1.method1101(var14, true);
            var14.method9();
            client.field3215 = arg1.method1101(var14, true);
            class636.field9145 = arg1.method1101(class3.method18(class39.field299, class40.field316, 0), true);
            class3 var15 = class3.method18(class39.field299, class391.field5186, 0);
            class128.field1576 = arg1.method1101(var15, true);
            var15.method9();
            class175.field2139 = arg1.method1101(var15, true);
        }
        if (class636.field9145 != null && class258.field3324 != null && class128.field1576 != null) {
            int var16 = (-(2 * class128.field1576.method291()) + var4) / class636.field9145.method291();
            for (int var17 = 0; ~var16 < ~var17; ++var17) {
                class636.field9145.method299(var2 + (class128.field1576.method291() - -(class636.field9145.method291() * var17)), var3 + var5 - class636.field9145.method290());
            }
            int var18 = (-var6 + var5 - class128.field1576.method290()) / class258.field3324.method290();
            for (int var19 = 0; var18 > var19; ++var19) {
                class258.field3324.method299(var2, var6 + var3 + var19 * class258.field3324.method290());
                client.field3215.method299(-client.field3215.method291() + var2 + var4, class258.field3324.method290() * var19 + (var3 - -var6));
            }
            class128.field1576.method299(var2, -class128.field1576.method290() + var3 - -var5);
            class175.field2139.method299(var2 + var4 - class128.field1576.method291(), -class128.field1576.method290() + var3 + var5);
        }
        int var20 = 0;
        for (class99 var21 = (class99) class89.field1096.method1050((byte) 73); var21 != null; var21 = (class99) class89.field1096.method1047(-7962)) {
            int var22 = (class199.field2397 - (1 - -var20)) * 16 + 13 + var6 + var3;
            int var23 = class89.field1098 | -16777216;
            if (~var2 > ~var10 && ~(var2 - -var4) < ~var10 && var22 + -13 < var11 && ~(var22 - -4) < ~var11 && var21.field1224) {
                var23 = class445.field6132 | -16777216;
            }
            int[] var24 = null;
            if (class240.method1361(arg0 + -4479, var21.field1227)) {
                var24 = class449.field6217.method2026((byte) -114, (int) var21.field1235).field8766;
            } else if (var21.field1232 == -1) {
                if (class564.method3292(var21.field1227, -26)) {
                    class415 var25 = (class415) class309.field3938.method2645((long) ((int) var21.field1235), (byte) -108);
                    if (var25 != null) {
                        class459 var26 = var25.field5390;
                        class74 var27 = var26.field6334;
                        if (var27.field800 != null) {
                            var27 = var27.method420(class281.field3700, 113);
                        }
                        if (var27 != null) {
                            var24 = var27.field812;
                        }
                    }
                } else if (class364.method2039((byte) 122, var21.field1227)) {
                    Object var28 = null;
                    class437 var29;
                    if (~var21.field1227 == -1011) {
                        var29 = class16.field126.method1759(false, (int) var21.field1235);
                    } else {
                        var29 = class16.field126.method1759(false, (int) (2147483647L & var21.field1235 >>> 32));
                    }
                    if (var29.field6004 != null) {
                        var29 = var29.method2545(arg0 + -4480, class281.field3700);
                    }
                    if (var29 != null) {
                        var24 = var29.field5967;
                    }
                }
            } else {
                var24 = class449.field6217.method2026((byte) -81, var21.field1232).field8766;
            }
            String var30 = class348.method1941(var21, -66);
            if (var24 != null) {
                var30 = var30 + class404.method2305(0, var24);
            }
            class459.field6320.method536(28664, var30, class7.field59, 0, var22, var2 - -3, var23, class580.field8461);
            ++var20;
            if (var21.field1225) {
                class257.field3312.method299(var2 + 5 - -class410.field5340.method1241(var30, (byte) 0), var22 + -12);
            }
        }
        class476.method2780((byte) -21, class594.field8623, class609.field8848, class308.field3933, class521.field7314);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILos;)V", line = 209)
    public final void method198(int arg0, int arg1, class374 arg2) {
        ++field2800;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field2799 = arg2.method2129(-89);
                }
            } else {
                this.field2807 = arg2.method2136(false);
            }
        } else {
            this.field2804 = arg2.method2129(-124);
        }
        int var5 = 57 % ((-69 - arg1) / 42);
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V", line = 260)
    public class228() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 272)
    private final void method1300(byte arg0) {
        ++field2802;
        this.field2806 = new int[this.field2804 - -1];
        int var2 = 0;
        this.field2805 = new int[this.field2804 - -1];
        int var3 = 4096 / this.field2804;
        int var4 = this.field2807 * var3 >> 12;
        for (int var5 = 0; ~var5 > ~this.field2804; ++var5) {
            this.field2806[var5] = var2;
            this.field2805[var5] = var2 + var4;
            var2 += var3;
        }
        if (arg0 != -128) {
            this.field2804 = -75;
        }
        this.field2806[this.field2804] = 4096;
        this.field2805[this.field2804] = this.field2805[0] + 4096;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V", line = 303)
    public final void method438(int arg0) {
        if (arg0 != -2) {
            this.method438(80);
        }
        this.method1300((byte) -128);
        ++field2796;
    }

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "(I)V", line = 321)
    public static void method1301(int arg0) {
        if (arg0 > 21) {
            field2801 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)[I", line = 337)
    public final int[] method201(int arg0, int arg1) {
        ++field2798;
        if (arg1 != 12218) {
            this.field2799 = 112;
        }
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (super.field990.field3641) {
            int var4 = class85.field1036[arg0];
            if (~this.field2799 != -1) {
                for (int var5 = 0; class629.field9033 > var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class366.field4817[var5];
                    int var9 = this.field2799;
                    if (var9 != 1) {
                        if (var9 != 2) {
                            if (var9 == 3) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var8 - 4096 - -var4 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~this.field2804 < ~var10; ++var10) {
                        if (~var6 <= ~this.field2806[var10] && var6 < this.field2806[var10 + 1]) {
                            if (var6 < this.field2805[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; this.field2804 > var12; ++var12) {
                    if (this.field2806[var12] <= var4 && ~var4 > ~this.field2806[var12 + 1]) {
                        if (~this.field2805[var12] < ~var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class345.method1928(var3, 0, class629.field9033, var11);
            }
        }
        return var3;
    }
}
