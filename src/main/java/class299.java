import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class299 extends class192 {

    @OriginalMember(owner = "client!uba", name = "L", descriptor = "I")
    private int field3906 = -1;

    @OriginalMember(owner = "client!uba", name = "M", descriptor = "Z")
    public static boolean field3907 = false;

    @OriginalMember(owner = "client!uba", name = "J", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!uba", name = "K", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!uba", name = "O", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!uba", name = "P", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!uba", name = "Q", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!uba", name = "R", descriptor = "I")
    private int field3912;

    @OriginalMember(owner = "client!uba", name = "S", descriptor = "I")
    private int field3913;

    @OriginalMember(owner = "client!uba", name = "T", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!uba", name = "I", descriptor = "Z")
    public static boolean field3903;

    @OriginalMember(owner = "client!uba", name = "N", descriptor = "[I")
    private int[] field3908;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(ILfd;I)V", line = 6)
    public final void method109(int arg0, class418 arg1, int arg2) {
        if (arg0 == 0) {
            this.field3906 = arg1.method2393(-30727);
        }
        if (arg2 != -12160) {
            this.method1254(-120, (byte) 65, -115);
        }
        ++field3914;
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(IB)[[I", line = 24)
    public final int[][] method107(int arg0, byte arg1) {
        ++field3910;
        int[][] var3 = super.field2467.method2466(arg0, 0);
        if (super.field2467.field5565) {
            int var4 = (~class505.field6643 == ~this.field3912 ? arg0 : this.field3912 * arg0 / class505.field6643) * this.field3913;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class561.field7319 != ~this.field3913) {
                for (int var8 = 0; var8 < class561.field7319; ++var8) {
                    int var9 = this.field3913 * var8 / class561.field7319;
                    int var10 = this.field3908[var4 + var9];
                    var7[var8] = class597.method3238(4080, var10 << 4);
                    var6[var8] = class597.method3238(var10 >> 4, 4080);
                    var5[var8] = class597.method3238(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; ~class561.field7319 < ~var11; ++var11) {
                    int var12 = this.field3908[var4++];
                    var7[var11] = class597.method3238(4080, var12 << 4);
                    var6[var11] = class597.method3238(var12, 65280) >> 4;
                    var5[var11] = class597.method3238(4080, var12 >> 12);
                }
            }
        }
        int var13 = -87 / ((arg1 - -14) / 34);
        return var3;
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "()V", line = 88)
    public class299() {
        super(0, false);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V", line = 99)
    public final void method1255(int arg0) {
        super.method1255(106);
        int var2 = 103 % ((arg0 - 11) / 54);
        ++field3909;
        this.field3908 = null;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)I", line = 111)
    public final int method1259(boolean arg0) {
        if (arg0) {
            return -48;
        } else {
            ++field3904;
            return this.field3906;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IBI)V", line = 124)
    public final void method1254(int arg0, byte arg1, int arg2) {
        ++field3905;
        super.method1254(arg0, (byte) 54, arg2);
        if (arg1 < 51) {
            this.field3912 = -103;
        }
        if (~this.field3906 <= -1 && class415.field5332 != null) {
            int var4 = class415.field5332.method3162((byte) -104, this.field3906).field794 ? 64 : 128;
            this.field3908 = class415.field5332.method3158(var4, false, 1.0F, var4, this.field3906, (byte) -56);
            this.field3912 = var4;
            this.field3913 = var4;
        }
    }
}
