import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class160 extends class205 {

    @OriginalMember(owner = "client!pb", name = "eb", descriptor = "I")
    private int field3049 = 4096;

    @OriginalMember(owner = "client!pb", name = "V", descriptor = "I")
    private int field3040 = 4096;

    @OriginalMember(owner = "client!pb", name = "gb", descriptor = "[I")
    private int[] field3051 = new int[3];

    @OriginalMember(owner = "client!pb", name = "lb", descriptor = "I")
    private int field3056 = 409;

    @OriginalMember(owner = "client!pb", name = "mb", descriptor = "I")
    private int field3057 = 4096;

    @OriginalMember(owner = "client!pb", name = "X", descriptor = "[Lvd;")
    public static class222[] field3042 = new class222[8];

    @OriginalMember(owner = "client!pb", name = "Z", descriptor = "[[S")
    public static short[][] field3044 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!pb", name = "Y", descriptor = "I")
    public static int field3043 = 500;

    @OriginalMember(owner = "client!pb", name = "ab", descriptor = "Lvd;")
    public static class222 field3045 = class212.method1357("Ladevorgang )2 bitte warten Sie)3", 10731);

    @OriginalMember(owner = "client!pb", name = "cb", descriptor = "I")
    public static int field3047 = 0;

    @OriginalMember(owner = "client!pb", name = "W", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!pb", name = "bb", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!pb", name = "db", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!pb", name = "fb", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!pb", name = "hb", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!pb", name = "ib", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!pb", name = "kb", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!pb", name = "jb", descriptor = "Lva;")
    public static class219 field3054;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZLvd;Lvd;I)V")
    public static final void method1007(boolean arg0, class222 arg1, class222 arg2, int arg3) {
        class110.method715((class222) null, arg3, -1, arg1, 65, arg2);
        ++field3046;
        if (arg0) {
            field3054 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "(I)V")
    public static void method1008(int arg0) {
        field3054 = null;
        field3045 = null;
        field3044 = null;
        if (arg0 != -19350) {
            field3054 = null;
        }
        field3042 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method96(int arg0, byte arg1) {
        ++field3053;
        if (arg1 < 98) {
            this.method2((class109) null, (byte) -97, 60);
        }
        int[][] var3 = super.field3815.method1003(-8357, arg0);
        if (super.field3815.field3015) {
            int[][] var4 = this.method1323(0, arg0, -5920);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class118.field2245 < ~var11; ++var11) {
                int var12 = var6[var11];
                int var13 = var12 - this.field3051[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~this.field3056 > ~var13) {
                    var7[var11] = var12;
                    var9[var11] = var5[var11];
                    var10[var11] = var8[var11];
                } else {
                    int var14 = var5[var11];
                    int var15 = -this.field3051[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (this.field3056 < var15) {
                        var7[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var8[var11];
                    } else {
                        int var16 = var8[var11];
                        int var17 = var16 - this.field3051[2];
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field3056) {
                            var7[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var7[var11] = this.field3049 * var12 >> 12;
                            var9[var11] = this.field3040 * var14 >> 12;
                            var10[var11] = this.field3057 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class160() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V")
    public static final void method1009(boolean arg0) {
        class218.field4050 = null;
        ++field3050;
        class185.field3429 = null;
        class83.field1584 = null;
        class157.field3020 = null;
        class235.field4398 = null;
        class174.field3279 = null;
        if (!arg0) {
            field3047 = 19;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        ++field3041;
        int var4 = 127 / ((arg1 - -47) / 34);
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            int var6 = arg0.method701(869322848);
                            this.field3051[1] = class139.method876(4080, var6 >> 4);
                            this.field3051[2] = class139.method876(0, var6 >> 12);
                            this.field3051[0] = class139.method876(16711680, var6) << 4;
                        }
                    } else {
                        this.field3049 = arg0.method675(2);
                    }
                } else {
                    this.field3040 = arg0.method675(2);
                }
            } else {
                this.field3057 = arg0.method675(2);
            }
        } else {
            this.field3056 = arg0.method675(2);
        }
    }
}
