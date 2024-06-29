import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class54 extends class263 {

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    private int field713 = -1;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "Laa;")
    public static class76 field710 = new class76(30, 3);

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    private int field717;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    private int field719;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "[I")
    private int[] field712;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "[I")
    public static int[] field714;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZLgk;)V", line = 3)
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        if (arg0 == 0) {
            this.field713 = arg2.method2727((byte) 43);
        }
        if (!arg1) {
            field710 = null;
        }
        ++field715;
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)V", line = 18)
    public static void method397(byte arg0) {
        field714 = null;
        if (arg0 > -12) {
            method401(-122, (class400) null);
        }
        field710 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V", line = 31)
    public final void method398(boolean arg0) {
        super.method398(arg0);
        ++field708;
        this.field712 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI)V", line = 40)
    public final void method399(int arg0, byte arg1, int arg2) {
        super.method399(arg0, (byte) -88, arg2);
        ++field709;
        int var4 = -107 % ((arg1 - 44) / 60);
        if (~this.field713 <= -1 && class119.field1822 != null) {
            int var5 = class119.field1822.method1480(this.field713, 14270).field2421 ? 64 : 128;
            this.field712 = class119.field1822.method1484(92, false, var5, 1.0F, this.field713, var5);
            this.field719 = var5;
            this.field717 = var5;
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V", line = 74)
    public class54() {
        super(0, false);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)I", line = 80)
    public final int method400(int arg0) {
        ++field716;
        if (arg0 != -31427) {
            field710 = null;
        }
        return this.field713;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(IB)[[I", line = 92)
    public final int[][] method34(int arg0, byte arg1) {
        if (arg1 >= -45) {
            this.field712 = null;
        }
        ++field711;
        int[][] var3 = super.field3912.method2649(arg0, false);
        if (super.field3912.field6681) {
            int var4 = this.field719 * (~class372.field5635 != ~this.field717 ? this.field717 * arg0 / class372.field5635 : arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class367.field5597 != ~this.field719) {
                for (int var8 = 0; class367.field5597 > var8; ++var8) {
                    int var9 = this.field719 * var8 / class367.field5597;
                    int var10 = this.field712[var4 + var9];
                    var7[var8] = class140.method1023(255, var10) << 4;
                    var6[var8] = class140.method1023(var10 >> 4, 4080);
                    var5[var8] = class140.method1023(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~var11 > ~class367.field5597; ++var11) {
                    int var12 = this.field712[var4++];
                    var7[var11] = class140.method1023(var12, 255) << 4;
                    var6[var11] = class140.method1023(var12, 65280) >> 4;
                    var5[var11] = class140.method1023(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILkh;)V", line = 156)
    public static final void method401(int arg0, class400 arg1) {
        if (arg0 != 4080) {
            method401(76, (class400) null);
        }
        ++field718;
        if (arg1 instanceof class351) {
            class351 var2 = (class351) arg1;
            if (var2.field5409 != null) {
                class149.method1085(var2, class410.field6198.field7686 != var2.field7686, false);
                return;
            }
        } else {
            if (!(arg1 instanceof class480)) {
                return;
            }
            class480 var3 = (class480) arg1;
            class477.method2842(var3, class410.field6198.field7686 != var3.field7686, arg0 + -4081);
        }
    }
}
