import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class286 extends class214 {

    @OriginalMember(owner = "client!ww", name = "G", descriptor = "I")
    private int field4399 = -1;

    @OriginalMember(owner = "client!ww", name = "K", descriptor = "Ltm;")
    public static class334 field4403 = new class334(56, 2);

    @OriginalMember(owner = "client!ww", name = "N", descriptor = "I")
    public static int field4406 = 1;

    @OriginalMember(owner = "client!ww", name = "D", descriptor = "I")
    private int field4396;

    @OriginalMember(owner = "client!ww", name = "E", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!ww", name = "F", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!ww", name = "I", descriptor = "I")
    private int field4401;

    @OriginalMember(owner = "client!ww", name = "J", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!ww", name = "L", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!ww", name = "M", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!ww", name = "H", descriptor = "[I")
    private int[] field4400;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILofa;I)V", line = 6)
    public final void method59(int arg0, class301 arg1, int arg2) {
        if (arg0 < 92) {
            this.field4396 = -73;
        }
        ++field4398;
        if (~arg2 == -1) {
            this.field4399 = arg1.method1989((byte) -58);
        }
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(BII)V", line = 20)
    public final void method1546(byte arg0, int arg1, int arg2) {
        super.method1546(arg0, arg1, arg2);
        ++field4397;
        if (~this.field4399 <= -1 && class131.field2129 != null) {
            int var4 = !class131.field2129.method1774(arg0 ^ -31, this.field4399).field8067 ? 128 : 64;
            this.field4400 = class131.field2129.method1771(1.0F, var4, this.field4399, var4, (byte) 70, false);
            this.field4396 = var4;
            this.field4401 = var4;
        }
    }

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "(I)V", line = 39)
    public static void method1872(int arg0) {
        if (arg0 > -63) {
            method1872(-32);
        }
        field4403 = null;
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "()V", line = 146)
    public class286() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "(II)[[I", line = 55)
    public final int[][] method62(int arg0, int arg1) {
        ++field4402;
        int[][] var3 = super.field3545.method2996((byte) 125, arg0);
        if (arg1 != -256) {
            field4406 = -74;
        }
        if (super.field3545.field7147) {
            int var4 = this.field4396 * (class259.field4054 != this.field4401 ? this.field4401 * arg0 / class259.field4054 : arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class626.field8787 != this.field4396) {
                for (int var8 = 0; ~var8 > ~class626.field8787; ++var8) {
                    int var9 = this.field4396 * var8 / class626.field8787;
                    int var10 = this.field4400[var4 + var9];
                    var7[var8] = class636.method3603(var10 << 4, 4080);
                    var6[var8] = class636.method3603(var10 >> 4, 4080);
                    var5[var8] = class636.method3603(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; var11 < class626.field8787; ++var11) {
                    int var12 = this.field4400[var4++];
                    var7[var11] = class636.method3603(var12, 255) << 4;
                    var6[var11] = class636.method3603(var12, 65280) >> 4;
                    var5[var11] = class636.method3603(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Z)I", line = 120)
    public final int method1538(boolean arg0) {
        if (!arg0) {
            this.method1538(false);
        }
        ++field4405;
        return this.field4399;
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(I)V", line = 137)
    public final void method1542(int arg0) {
        super.method1542(arg0 + arg0);
        ++field4404;
        this.field4400 = null;
    }
}
