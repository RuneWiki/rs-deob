import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class160 extends class5 {

    @OriginalMember(owner = "client!io", name = "U", descriptor = "I")
    private int field2106 = -1;

    @OriginalMember(owner = "client!io", name = "J", descriptor = "Lsca;")
    public static class237 field2096 = new class237(8);

    @OriginalMember(owner = "client!io", name = "Y", descriptor = "[I")
    public static int[] field2110 = new int[2];

    @OriginalMember(owner = "client!io", name = "X", descriptor = "I")
    public static int field2109 = 0;

    @OriginalMember(owner = "client!io", name = "R", descriptor = "F")
    public static float field2103;

    @OriginalMember(owner = "client!io", name = "I", descriptor = "I")
    private int field2095;

    @OriginalMember(owner = "client!io", name = "K", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!io", name = "L", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!io", name = "M", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!io", name = "N", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!io", name = "Q", descriptor = "I")
    private int field2102;

    @OriginalMember(owner = "client!io", name = "S", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!io", name = "T", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!io", name = "W", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!io", name = "P", descriptor = "Lf;")
    public static class536 field2101;

    @OriginalMember(owner = "client!io", name = "H", descriptor = "[I")
    private int[] field2094;

    @OriginalMember(owner = "client!io", name = "V", descriptor = "[Lf;")
    public static class536[] field2107;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIII)V")
    public static final void method925(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2105;
        if (arg4 != 29830) {
            method926(-68);
        }
        if (class301.field3698.field6628 != 0 && ~arg2 != -1 && ~class265.field3368 > -51 && ~arg1 != 0) {
            class572.field7993[class265.field3368++] = new class377((byte) 1, arg1, arg2, arg3, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!io", name = "i", descriptor = "(I)V")
    public static void method926(int arg0) {
        field2110 = null;
        field2096 = null;
        if (arg0 == -28916) {
            field2101 = null;
            field2107 = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method44(int arg0, boolean arg1) {
        ++field2098;
        int[][] var3 = super.field135.method2706(arg0, -81);
        if (!arg1) {
            this.method43((byte) 56);
        }
        if (super.field135.field6667) {
            int var4 = this.field2095 * (class622.field8706 != this.field2102 ? this.field2102 * arg0 / class622.field8706 : arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class657.field9287 != ~this.field2095) {
                for (int var8 = 0; ~class657.field9287 < ~var8; ++var8) {
                    int var9 = this.field2095 * var8 / class657.field9287;
                    int var10 = this.field2094[var4 + var9];
                    var7[var8] = class695.method3921(255, var10) << 4;
                    var6[var8] = class695.method3921(4080, var10 >> 4);
                    var5[var8] = class695.method3921(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; ~var11 > ~class657.field9287; ++var11) {
                    int var12 = this.field2094[var4++];
                    var7[var11] = class695.method3921(4080, var12 << 4);
                    var6[var11] = class695.method3921(65280, var12) >> 4;
                    var5[var11] = class695.method3921(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(B)I")
    public final int method43(byte arg0) {
        int var2 = 41 % ((arg0 - 10) / 46);
        ++field2108;
        return this.field2106;
    }

    @OriginalMember(owner = "client!io", name = "j", descriptor = "(I)V")
    public static final void method927(int arg0) {
        if (class648.field9137.toLowerCase().indexOf("microsoft") == -1) {
            class5.field138[93] = 43;
            if (class648.field9161 == null) {
                class5.field138[222] = 59;
                class5.field138[192] = 58;
            } else {
                class5.field138[222] = 58;
                class5.field138[192] = 28;
                class5.field138[520] = 59;
            }
            class5.field138[46] = 72;
            class5.field138[92] = 74;
            class5.field138[47] = 73;
            class5.field138[44] = 71;
            class5.field138[59] = 57;
            class5.field138[45] = 26;
            class5.field138[91] = 42;
            class5.field138[61] = 27;
        } else {
            class5.field138[222] = 59;
            class5.field138[220] = 74;
            class5.field138[191] = 73;
            class5.field138[187] = 27;
            class5.field138[219] = 42;
            class5.field138[190] = 72;
            class5.field138[221] = 43;
            class5.field138[188] = 71;
            class5.field138[223] = 28;
            class5.field138[189] = 26;
            class5.field138[192] = 58;
            class5.field138[186] = 57;
        }
        ++field2100;
        if (arg0 != -15630) {
            method925(62, 34, -29, -125, -8);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IBI)V")
    public final void method42(int arg0, byte arg1, int arg2) {
        ++field2099;
        super.method42(arg0, (byte) -113, arg2);
        if (this.field2106 >= 0 && class281.field3523 != null) {
            int var4 = class281.field3523.method2486(this.field2106, (byte) 86).field241 ? 64 : 128;
            this.field2094 = class281.field3523.method2481(this.field2106, 1.0F, false, var4, -5969, var4);
            this.field2095 = var4;
            this.field2102 = var4;
        }
        int var5 = -72 % ((arg1 - -21) / 35);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public final void method37(int arg0) {
        if (arg0 <= 42) {
            this.method42(-51, (byte) 53, -34);
        }
        super.method37(115);
        ++field2104;
        this.field2094 = null;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V")
    public class160() {
        super(0, false);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILes;I)V")
    public final void method47(int arg0, class630 arg1, int arg2) {
        ++field2097;
        if (~arg2 == -1) {
            this.field2106 = arg1.method3470(arg0 + 13110);
        }
        if (arg0 != 1) {
            field2110 = null;
        }
    }
}
