import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class653 extends class38 {

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "I")
    private int field9171 = 2048;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
    private int field9167 = 1024;

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "I")
    private int field9173 = 3072;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "I")
    public static int field9166;

    @OriginalMember(owner = "client!pl", name = "F", descriptor = "I")
    public static int field9168;

    @OriginalMember(owner = "client!pl", name = "G", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!pl", name = "H", descriptor = "I")
    public static int field9170;

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "I")
    public static int field9172;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)[[I", line = 10)
    public final int[][] method196(int arg0, int arg1) {
        ++field9172;
        if (arg0 != -18210) {
            method3782(-119, -93, 41, true, 97);
        }
        int[][] var3 = super.field387.method2809(arg1, (byte) -48);
        if (super.field387.field6792) {
            int[][] var4 = this.method195(true, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class729.field10216 > var11; ++var11) {
                var8[var11] = (var5[var11] * this.field9171 >> 12) + this.field9167;
                var9[var11] = (var6[var11] * this.field9171 >> 12) + this.field9167;
                var10[var11] = (var7[var11] * this.field9171 >> 12) + this.field9167;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V", line = 56)
    public class653() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIZI)V", line = 62)
    public static final void method3782(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field9166;
        if (class63.field916.field10200.method3848(17503) != 0) {
            class749.field10471 = class63.field916.field10200.method3848(17503);
            class134.method950(0, 0, true);
        } else {
            client.method1892(-128, false);
        }
        if (arg1 < -82) {
            class471.field6866 = arg0;
            class440.field6517 = arg4;
            class8.field102 = arg3;
            class84.method676(arg2);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BI)[I", line = 85)
    public final int[] method199(byte arg0, int arg1) {
        ++field9169;
        int[] var3 = super.field397.method1376(arg1, (byte) 120);
        if (super.field397.field3005) {
            int[] var4 = this.method189(arg1, 0, (byte) -92);
            for (int var5 = 0; ~class729.field10216 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field9171 >> 12) + this.field9167;
            }
        }
        if (arg0 >= -43) {
            this.field9171 = -66;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IILrg;)V", line = 122)
    public final void method190(int arg0, int arg1, class645 arg2) {
        ++field9168;
        if (arg0 < 34) {
            this.field9171 = 87;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field388 = arg2.method3745(-6314) == 1;
                }
            } else {
                this.field9173 = arg2.method3712((byte) -118);
            }
        } else {
            this.field9167 = arg2.method3712((byte) -122);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V", line = 169)
    public final void method191(byte arg0) {
        ++field9170;
        this.field9171 = this.field9173 - this.field9167;
        if (arg0 < 120) {
            this.field9171 = -45;
        }
    }
}
