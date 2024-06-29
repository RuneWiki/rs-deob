import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class320 extends class386 {

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
    private int field4225 = -1;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "I")
    private int field4221;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "I")
    private int field4224;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "Lpga;")
    public static class495 field4217;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "[I")
    private int[] field4219;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)[[I")
    public final int[][] method645(int arg0, int arg1) {
        ++field4216;
        int[][] var3 = super.field5148.method1054(arg0, 16257);
        if (super.field5148.field2041) {
            int var4 = this.field4221 * (class365.field4914 == this.field4224 ? arg0 : this.field4224 * arg0 / class365.field4914);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class599.field8643 != ~this.field4221) {
                for (int var8 = 0; ~class599.field8643 < ~var8; ++var8) {
                    int var9 = this.field4221 * var8 / class599.field8643;
                    int var10 = this.field4219[var4 - -var9];
                    var7[var8] = class435.method2605(var10, 255) << 4;
                    var6[var8] = class435.method2605(var10 >> 4, 4080);
                    var5[var8] = class435.method2605(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; class599.field8643 > var11; ++var11) {
                    int var12 = this.field4219[var4++];
                    var7[var11] = class435.method2605(var12 << 4, 4080);
                    var6[var11] = class435.method2605(4080, var12 >> 4);
                    var5[var11] = class435.method2605(var12, 16711680) >> 12;
                }
            }
        }
        if (arg1 != 3) {
            method1865(false, (class668) null, -5L, -26, true, -11, 86);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBLun;)V")
    public final void method355(int arg0, byte arg1, class389 arg2) {
        ++field4215;
        if (~arg0 == -1) {
            this.field4225 = arg2.method2260(-113);
        }
        if (arg1 <= 111) {
            this.field4224 = 82;
        }
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)V")
    public static void method1861(int arg0) {
        int var1 = 65 % ((arg0 - 15) / 49);
        field4217 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)I")
    public final int method1862(byte arg0) {
        ++field4223;
        if (arg0 <= 21) {
            method1861(-54);
        }
        return this.field4225;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
    public final void method926(boolean arg0) {
        ++field4222;
        super.method926(arg0);
        this.field4219 = null;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
    public class320() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBI)V")
    public final void method1863(int arg0, byte arg1, int arg2) {
        ++field4213;
        super.method1863(arg0, (byte) 98, arg2);
        int var4 = 55 % ((arg1 - 21) / 47);
        if (~this.field4225 <= -1 && class364.field4905 != null) {
            int var5 = !class364.field4905.method397(this.field4225, (byte) -127).field4708 ? 128 : 64;
            this.field4219 = class364.field4905.method400(var5, false, var5, (byte) -73, this.field4225, 1.0F);
            this.field4221 = var5;
            this.field4224 = var5;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZIZIB)V")
    public static final void method1864(boolean arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        ++field4220;
        class396.method2396(class501.field7005.length + -1, arg1, arg2, 0, arg3, 7681, arg0);
        if (arg4 <= 35) {
            field4214 = 20;
        }
        class202.field2438 = null;
        class118.field1522 = 0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZLjn;JIZII)V")
    public static final void method1865(boolean arg0, class668 arg1, long arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class279.method1679((byte) 75, 0, arg1, arg6, arg2, arg0, arg5, arg3);
        ++field4218;
        if (!arg4) {
            field4214 = -32;
        }
    }
}
