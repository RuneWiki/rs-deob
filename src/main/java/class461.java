import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class461 extends class739 {

    @OriginalMember(owner = "client!fea", name = "B", descriptor = "I")
    private int field6556 = -1;

    @OriginalMember(owner = "client!fea", name = "D", descriptor = "J")
    public static long field6558 = 0L;

    @OriginalMember(owner = "client!fea", name = "L", descriptor = "[Ler;")
    public static class297[] field6565 = null;

    @OriginalMember(owner = "client!fea", name = "z", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!fea", name = "A", descriptor = "I")
    private int field6555;

    @OriginalMember(owner = "client!fea", name = "C", descriptor = "I")
    private int field6557;

    @OriginalMember(owner = "client!fea", name = "E", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!fea", name = "G", descriptor = "I")
    public static int field6560;

    @OriginalMember(owner = "client!fea", name = "I", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!fea", name = "J", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!fea", name = "K", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!fea", name = "M", descriptor = "Lsc;")
    public static class451 field6566;

    @OriginalMember(owner = "client!fea", name = "H", descriptor = "[I")
    private int[] field6561;

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(Z)V", line = 3)
    public final void method586(boolean arg0) {
        super.method586(arg0);
        ++field6563;
        this.field6561 = null;
    }

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "(I)V", line = 13)
    public static void method2796(int arg0) {
        field6566 = null;
        if (arg0 != -1609038844) {
            field6558 = 14L;
        }
        field6565 = null;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)I", line = 26)
    public final int method2797(int arg0) {
        if (arg0 > -64) {
            this.method112((class479) null, -110, (byte) 94);
        }
        ++field6562;
        return this.field6556;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIB)V", line = 44)
    public final void method2798(int arg0, int arg1, byte arg2) {
        super.method2798(arg0, arg1, (byte) -115);
        ++field6560;
        if (arg2 > -20) {
            this.field6557 = 15;
        }
        if (~this.field6556 <= -1 && class40.field684 != null) {
            int var4 = !class40.field684.method962(this.field6556, 2904).field9636 ? 128 : 64;
            this.field6561 = class40.field684.method964(62, false, var4, this.field6556, var4, 1.0F);
            this.field6557 = var4;
            this.field6555 = var4;
        }
    }

    @OriginalMember(owner = "client!fea", name = "<init>", descriptor = "()V", line = 65)
    public class461() {
        super(0, false);
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(II)[[I", line = 70)
    public final int[][] method113(int arg0, int arg1) {
        ++field6564;
        if (arg1 != 8213) {
            return null;
        } else {
            int[][] var3 = super.field10328.method2106(arg0, true);
            if (super.field10328.field4727) {
                int var4 = this.field6555 * (class505.field7350 == this.field6557 ? arg0 : this.field6557 * arg0 / class505.field7350);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                if (~class399.field5703 != ~this.field6555) {
                    for (int var8 = 0; ~class399.field5703 < ~var8; ++var8) {
                        int var9 = this.field6555 * var8 / class399.field5703;
                        int var10 = this.field6561[var4 + var9];
                        var7[var8] = class368.method2314(var10, 255) << 4;
                        var6[var8] = class368.method2314(var10, 65280) >> 4;
                        var5[var8] = class368.method2314(16711680, var10) >> 12;
                    }
                } else {
                    for (int var11 = 0; ~class399.field5703 < ~var11; ++var11) {
                        int var12 = this.field6561[var4++];
                        var7[var11] = class368.method2314(var12 << 4, 4080);
                        var6[var11] = class368.method2314(4080, var12 >> 4);
                        var5[var11] = class368.method2314(4080, var12 >> 12);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "(I)I", line = 139)
    public static final int method2799(int arg0) {
        ++field6559;
        return arg0 != -29709 ? -100 : class185.field2554;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lsl;IB)V", line = 152)
    public final void method112(class479 arg0, int arg1, byte arg2) {
        ++field6554;
        if (arg2 == 1) {
            if (~arg1 == -1) {
                this.field6556 = arg0.method2882(-1);
            }
        }
    }
}
