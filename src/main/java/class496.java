import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class496 extends class349 {

    @OriginalMember(owner = "client!wea", name = "H", descriptor = "I")
    private int field6705 = -1;

    @OriginalMember(owner = "client!wea", name = "I", descriptor = "I")
    public static int field6706 = 1407;

    @OriginalMember(owner = "client!wea", name = "B", descriptor = "I")
    private int field6700;

    @OriginalMember(owner = "client!wea", name = "C", descriptor = "I")
    public static int field6701;

    @OriginalMember(owner = "client!wea", name = "D", descriptor = "I")
    private int field6702;

    @OriginalMember(owner = "client!wea", name = "F", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!wea", name = "K", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!wea", name = "L", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!wea", name = "M", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!wea", name = "N", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!wea", name = "G", descriptor = "[I")
    private int[] field6704;

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "(BI)Llp;", line = 5)
    public static final class270 method2799(byte arg0, int arg1) {
        ++field6710;
        class270[] var2 = class511.method2887(3914);
        for (int var3 = 0; ~var2.length < ~var3; ++var3) {
            if (~var2[var3].field3685 == ~arg1) {
                return var2[var3];
            }
        }
        int var4 = 2 / ((-24 - arg0) / 50);
        return null;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)I", line = 29)
    public final int method2182(int arg0) {
        if (arg0 != 7622) {
            this.method5(-15, -117, (class138) null);
        }
        ++field6708;
        return this.field6705;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IILdga;)V", line = 41)
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg1 == 0) {
            this.field6705 = arg2.method922((byte) -122);
        }
        if (arg0 == 4095) {
            ++field6709;
        }
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "()V", line = 56)
    public class496() {
        super(0, false);
    }

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "(I)V", line = 60)
    public final void method2186(int arg0) {
        ++field6701;
        super.method2186(arg0);
        this.field6704 = null;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IB)[[I", line = 70)
    public final int[][] method9(int arg0, byte arg1) {
        ++field6703;
        int var3 = -8 % ((arg1 - -32) / 47);
        int[][] var4 = super.field5103.method2268(true, arg0);
        if (super.field5103.field5314) {
            int var5 = this.field6702 * (class442.field6080 == this.field6700 ? arg0 : this.field6700 * arg0 / class442.field6080);
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            if (class39.field497 == this.field6702) {
                for (int var9 = 0; ~class39.field497 < ~var9; ++var9) {
                    int var10 = this.field6704[var5++];
                    var8[var9] = class230.method1424(255, var10) << 4;
                    var7[var9] = class230.method1424(65280, var10) >> 4;
                    var6[var9] = class230.method1424(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; class39.field497 > var11; ++var11) {
                    int var12 = this.field6702 * var11 / class39.field497;
                    int var13 = this.field6704[var5 + var12];
                    var8[var11] = class230.method1424(var13 << 4, 4080);
                    var7[var11] = class230.method1424(4080, var13 >> 4);
                    var6[var11] = class230.method1424(var13 >> 12, 4080);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "(III)V", line = 144)
    public final void method2184(int arg0, int arg1, int arg2) {
        ++field6707;
        super.method2184(arg0, arg1, arg2);
        if (this.field6705 >= 0 && class38.field419 != null) {
            int var4 = class38.field419.method1728(-126, this.field6705).field7853 ? 64 : 128;
            this.field6704 = class38.field419.method1731(false, 1.0F, 26409, var4, var4, this.field6705);
            this.field6700 = var4;
            this.field6702 = var4;
        }
    }
}
