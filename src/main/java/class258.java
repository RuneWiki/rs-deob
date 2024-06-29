import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class258 extends class585 {

    @OriginalMember(owner = "client!dea", name = "J", descriptor = "I")
    private int field3800 = 0;

    @OriginalMember(owner = "client!dea", name = "S", descriptor = "I")
    private int field3809 = 0;

    @OriginalMember(owner = "client!dea", name = "T", descriptor = "I")
    private int field3810 = 0;

    @OriginalMember(owner = "client!dea", name = "E", descriptor = "Lfba;")
    public static class27 field3795 = new class27(31, 3);

    @OriginalMember(owner = "client!dea", name = "O", descriptor = "I")
    public static int field3805 = 0;

    @OriginalMember(owner = "client!dea", name = "F", descriptor = "I")
    private int field3796;

    @OriginalMember(owner = "client!dea", name = "G", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!dea", name = "H", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!dea", name = "I", descriptor = "I")
    private int field3799;

    @OriginalMember(owner = "client!dea", name = "K", descriptor = "I")
    private int field3801;

    @OriginalMember(owner = "client!dea", name = "L", descriptor = "I")
    private int field3802;

    @OriginalMember(owner = "client!dea", name = "M", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!dea", name = "N", descriptor = "I")
    private int field3804;

    @OriginalMember(owner = "client!dea", name = "P", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!dea", name = "Q", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!dea", name = "R", descriptor = "I")
    private int field3808;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZI)[[I", line = 8)
    public final int[][] method58(boolean arg0, int arg1) {
        ++field3807;
        int[][] var3 = super.field8265.method1576((byte) -75, arg1);
        if (arg0) {
            this.method54((class494) null, -87, -103);
        }
        if (super.field8265.field3546) {
            int[][] var4 = this.method3417(0, arg1, (byte) 113);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class293.field4278 < ~var11; ++var11) {
                this.method1684((byte) 65, var5[var11], var7[var11], var6[var11]);
                this.field3801 += this.field3809;
                this.field3802 += this.field3810;
                this.field3799 += this.field3800;
                while (~this.field3802 > -1) {
                    this.field3802 += 4096;
                }
                if (~this.field3799 > -1) {
                    this.field3799 = 0;
                }
                while (~this.field3802 < -4097) {
                    this.field3802 -= 4096;
                }
                if (this.field3799 > 4096) {
                    this.field3799 = 4096;
                }
                if (this.field3801 < 0) {
                    this.field3801 = 0;
                }
                if (~this.field3801 < -4097) {
                    this.field3801 = 4096;
                }
                this.method1686(4096, this.field3799, this.field3802, this.field3801);
                var8[var11] = this.field3796;
                var9[var11] = this.field3808;
                var10[var11] = this.field3804;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lso;II)V", line = 91)
    public final void method54(class494 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (arg2 == 2) {
                        this.field3809 = (arg0.method2943((byte) 16) << 12) / 100;
                    }
                } else {
                    this.field3800 = (arg0.method2943((byte) 16) << 12) / 100;
                }
            } else {
                this.field3810 = arg0.method2988(arg1 + -4);
            }
            ++field3797;
        }
    }

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "(I)V", line = 134)
    public static void method1683(int arg0) {
        if (arg0 == 0) {
            field3795 = null;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(BIII)V", line = 144)
    private final void method1684(byte arg0, int arg1, int arg2, int arg3) {
        ++field3798;
        int var5 = ~arg3 <= ~arg1 ? arg3 : arg1;
        int var6 = -52 % ((arg0 - -36) / 35);
        int var7 = arg3 > arg1 ? arg1 : arg3;
        int var8 = var5 >= arg2 ? var5 : arg2;
        int var9 = ~arg2 > ~var7 ? arg2 : var7;
        this.field3801 = (var8 + var9) / 2;
        int var10 = var8 - var9;
        if (~var10 >= -1) {
            this.field3802 = 0;
        } else {
            int var11 = (-arg1 + var8 << 12) / var10;
            int var12 = (-arg3 + var8 << 12) / var10;
            int var13 = (var8 - arg2 << 12) / var10;
            if (arg1 == var8) {
                this.field3802 = arg3 == var9 ? var13 + 20480 : -var12 + 4096;
            } else if (~arg3 == ~var8) {
                this.field3802 = ~arg2 == ~var9 ? var11 + 4096 : -var13 + 12288;
            } else {
                this.field3802 = ~arg1 != ~var9 ? -var11 + 20480 : var12 + 12288;
            }
            this.field3802 /= 6;
        }
        if (~this.field3801 < -1 && ~this.field3801 > -4097) {
            this.field3799 = (var10 << 12) / (this.field3801 > 2048 ? -(this.field3801 * 2) + 8192 : this.field3801 * 2);
        } else {
            this.field3799 = 0;
        }
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "()V", line = 219)
    public class258() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "(B)[Lbu;", line = 205)
    public static final class21[] method1685(byte arg0) {
        if (arg0 != 8) {
            return null;
        } else {
            ++field3803;
            return new class21[] { class178.field2782, class366.field5098, class582.field8218, class459.field6421, class434.field5872, class724.field10023, class261.field3834, class688.field9559, class486.field6854, class742.field10284, class602.field8434, class653.field9129, class479.field6737, class325.field4556, class635.field8908, class768.field10569, class206.field3193, class310.field4425, class617.field8630, class743.field10304, class41.field537, class694.field9693, class123.field1904, class652.field9101, class103.field1189, class198.field3031, class694.field9679, class602.field8440, class55.field707, class410.field5571, class404.field5523, class186.field2841, class391.field5382, class53.field668, class564.field8015, class356.field5009, class712.field9881, class401.field5498, class534.field7711, class88.field981, class650.field9074, class712.field9880, class333.field4702, class789.field10827, class639.field8965, class195.field2996, class343.field4777, class254.field3737, class397.field5457, class394.field5427, class523.field7390, class238.field3575, class386.field5354, class659.field9191, class21.field347, class65.field780, class754.field10422, class206.field3191, class394.field5424, class546.field7860, class470.field6589, class268.field3898, class237.field3563, class610.field8581, class106.field1272, class714.field9908, class371.field5140, class220.field3413, class300.field4332, class500.field7108, class132.field1990, class726.field10040, class780.field10708, class142.field2098, class125.field1931, class597.field8397, class329.field4572, class242.field3610, class432.field5846, class338.field4741, class199.field3041, class493.field6981, class759.field10476, class149.field2143, class715.field9933, class387.field5356, class351.field4912, class699.field9724, class34.field464, class397.field5453, class226.field3475, class33.field435, class20.field341, class447.field6090, class22.field360, class207.field3212, class715.field9928, class547.field7865, class718.field9946, class318.field4524, class359.field5047, class37.field486, class278.field4053, class458.field6411, class670.field9318, class491.field6966, class20.field343, class671.field9327, class27.field399, class107.field1590, class749.field10382, class394.field5426, class438.field5910, class140.field2082, class178.field2784, class103.field1183, class785.field10797, class437.field5896, class245.field3643, class511.field7229, class119.field1832, class476.field6668, class108.field1603, class234.field3516, class449.field6135, class81.field903, class674.field9395, class772.field10603, class647.field9049, class133.field2013, class670.field9312, class719.field9962, class678.field9430, class256.field3758 };
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIII)V", line = 225)
    private final void method1686(int arg0, int arg1, int arg2, int arg3) {
        ++field3806;
        int var5 = ~arg3 >= -2049 ? (arg1 + 4096) * arg3 >> 12 : arg3 - -arg1 - (arg1 * arg3 >> 12);
        if (arg0 != 4096) {
            this.field3808 = -53;
        }
        if (var5 > 0) {
            int var6 = arg2 * 6;
            int var7 = arg3 - -arg3 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = var6 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 - -var13;
            int var15 = -var13 + var5;
            if (var9 == 0) {
                this.field3796 = var5;
                this.field3808 = var14;
                this.field3804 = var7;
                return;
            }
            if (~var9 == -2) {
                this.field3796 = var15;
                this.field3804 = var7;
                this.field3808 = var5;
                return;
            }
            if (var9 == 2) {
                this.field3796 = var7;
                this.field3808 = var5;
                this.field3804 = var14;
                return;
            }
            if (var9 == 3) {
                this.field3808 = var15;
                this.field3804 = var5;
                this.field3796 = var7;
                return;
            }
            if (var9 == 4) {
                this.field3808 = var7;
                this.field3796 = var14;
                this.field3804 = var5;
                return;
            }
            if (~var9 == -6) {
                this.field3808 = var7;
                this.field3796 = var5;
                this.field3804 = var15;
                return;
            }
        } else {
            this.field3796 = this.field3808 = this.field3804 = arg3;
        }
    }
}
