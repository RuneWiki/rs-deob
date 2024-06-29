import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class139 extends class23 {

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "I")
    private int field2578 = 4096;

    @OriginalMember(owner = "client!mh", name = "bb", descriptor = "I")
    private int field2585 = 4096;

    @OriginalMember(owner = "client!mh", name = "eb", descriptor = "I")
    private int field2588 = 4096;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
    public static volatile int field2577 = 0;

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "[I")
    public static int[] field2581 = new int[2048];

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "[I")
    public static int[] field2579 = new int[1000];

    @OriginalMember(owner = "client!mh", name = "ab", descriptor = "Li;")
    public static class88 field2584 = class208.method1425(105, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!mh", name = "db", descriptor = "Li;")
    public static class88 field2587 = class208.method1425(105, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "Li;")
    private static class88 field2582 = class208.method1425(105, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!mh", name = "cb", descriptor = "I")
    public static int field2586 = 0;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    public static int field2575 = 0;

    @OriginalMember(owner = "client!mh", name = "fb", descriptor = "Li;")
    public static class88 field2589 = field2582;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "Lnb;")
    public static class144 field2580;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IB)[[I")
    public final int[][] method7(int arg0, byte arg1) {
        ++field2574;
        if (arg1 != 13) {
            field2575 = -63;
        }
        int[][] var3 = super.field364.method1541(true, arg0);
        if (super.field364.field4312) {
            int[][] var4 = this.method121(0, (byte) 87, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[1];
            int[] var8 = var4[2];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; class70.field1276 > var11; ++var11) {
                int var12 = var6[var11];
                int var13 = var8[var11];
                int var14 = var5[var11];
                if (var12 == var13 && var13 == var14) {
                    var9[var11] = this.field2578 * var12 >> 12;
                    var7[var11] = this.field2588 * var13 >> 12;
                    var10[var11] = this.field2585 * var14 >> 12;
                } else {
                    var9[var11] = this.field2578;
                    var7[var11] = this.field2588;
                    var10[var11] = this.field2585;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        ++field2576;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field2585 = arg0.method301(123);
                }
            } else {
                this.field2588 = arg0.method301(56);
            }
        } else {
            this.field2578 = arg0.method301(14);
        }
        if (arg1 != -3) {
            field2589 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIILdj;)V")
    public static final void method924(int arg0, int arg1, int arg2, int arg3, class44 arg4) {
        ++field2583;
        if (arg1 == 31) {
            if (class240.field4458 != arg4) {
                if (class203.field3864 < 400) {
                    class88 var5;
                    if (~arg4.field749 == -1) {
                        var5 = class166.method1142(new class88[] { arg4.field766, class168.method1154(arg4.field747, class240.field4458.field747, arg1 ^ 14069), class68.field1238, class145.field2719, class170.method1214(arg4.field747, arg1 + -150), class104.field1881 }, -3);
                    } else {
                        var5 = class166.method1142(new class88[] { arg4.field766, class68.field1238, class143.field2639, class170.method1214(arg4.field749, arg1 ^ -116), class104.field1881 }, -3);
                    }
                    if (class28.field475 != 1) {
                        if (!class10.field145) {
                            for (int var6 = 7; var6 >= 0; --var6) {
                                if (class130.field2438[var6] != null) {
                                    ++class143.field2650;
                                    short var7 = 0;
                                    if (~class47.field884 == -1 && class130.field2438[var6].method624(class158.field3043, (byte) 123)) {
                                        if (arg4.field747 > class240.field4458.field747) {
                                            var7 = 2000;
                                        }
                                        if (~class240.field4458.field752 != -1 && arg4.field752 != 0) {
                                            if (~class240.field4458.field752 != ~arg4.field752) {
                                                var7 = 0;
                                            } else {
                                                var7 = 2000;
                                            }
                                        }
                                    } else if (class203.field3877[var6]) {
                                        var7 = 2000;
                                    }
                                    boolean var8 = false;
                                    short var9 = class24.field390[var6];
                                    short var10 = (short) (var7 + var9);
                                    class98.method687(arg1 + 9715, arg2, class130.field2438[var6], var10, (long) arg0, class166.method1142(new class88[] { class88.field1637, var5 }, -3), arg3);
                                }
                            }
                        } else if (~(class115.field2086 & 8) == -9) {
                            class98.method687(9746, arg2, class201.field3837, (short) 23, (long) arg0, class166.method1142(new class88[] { class28.field464, class49.field914, var5 }, arg1 + -34), arg3);
                            ++class192.field3699;
                        }
                    } else {
                        class98.method687(9746, arg2, class35.field608, (short) 31, (long) arg0, class166.method1142(new class88[] { class78.field1414, class49.field914, var5 }, -3), arg3);
                        ++class130.field2431;
                    }
                    for (int var11 = 0; ~class203.field3864 < ~var11; ++var11) {
                        if (~class53.field994[var11] == -11) {
                            class201.field3838[var11] = class166.method1142(new class88[] { class88.field1637, var5 }, class180.method1287(arg1, -30));
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class139() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V")
    public static void method925(int arg0) {
        field2587 = null;
        field2579 = null;
        if (arg0 != -11875) {
            field2582 = null;
        }
        field2584 = null;
        field2582 = null;
        field2580 = null;
        field2581 = null;
        field2589 = null;
    }
}
