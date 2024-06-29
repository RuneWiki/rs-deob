import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class190 extends class642 {

    @OriginalMember(owner = "client!mfa", name = "E", descriptor = "I")
    private int field2577 = -1;

    @OriginalMember(owner = "client!mfa", name = "D", descriptor = "I")
    public static int field2576 = 64;

    @OriginalMember(owner = "client!mfa", name = "B", descriptor = "I")
    public int field2574;

    @OriginalMember(owner = "client!mfa", name = "C", descriptor = "I")
    public int field2575;

    @OriginalMember(owner = "client!mfa", name = "F", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!mfa", name = "G", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!mfa", name = "I", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!mfa", name = "J", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!mfa", name = "K", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!mfa", name = "H", descriptor = "[I")
    public int[] field2580;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(B)I")
    public final int method1250(byte arg0) {
        if (arg0 != 44) {
            field2576 = -21;
        }
        ++field2583;
        return this.field2577;
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(B)Z")
    public final boolean method1251(byte arg0) {
        if (arg0 < 68) {
            return true;
        } else {
            ++field2581;
            if (this.field2580 != null) {
                return true;
            } else if (this.field2577 >= 0) {
                class616 var2 = class112.field1704 < 0 ? class616.method3517(class81.field1315, this.field2577) : class616.method3509(class81.field1315, class112.field1704, this.field2577);
                var2.method3508();
                this.field2580 = var2.method3510();
                this.field2574 = var2.field8868;
                this.field2575 = var2.field8869;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(I)V")
    public final void method503(int arg0) {
        super.method503(arg0);
        ++field2578;
        this.field2580 = null;
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "()V")
    public class190() {
        super(0, false);
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II)[[I")
    public int[][] method138(int arg0, int arg1) {
        ++field2582;
        int[][] var3 = super.field9211.method1068(arg0 ^ arg0, arg1);
        if (super.field9211.field2131 && this.method1251((byte) 89)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class106.field1578 != this.field2574 ? this.field2574 * arg1 / class106.field1578 : arg1) * this.field2575;
            if (~class338.field4909 != ~this.field2575) {
                for (int var8 = 0; var8 < class338.field4909; ++var8) {
                    int var9 = this.field2575 * var8 / class338.field4909;
                    int var10 = this.field2580[var7 + var9];
                    var6[var8] = class425.method2563(var10 << 4, 4080);
                    var5[var8] = class425.method2563(var10, 65280) >> 4;
                    var4[var8] = class425.method2563(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; ~var11 > ~class338.field4909; ++var11) {
                    int var12 = this.field2580[var7++];
                    var6[var11] = class425.method2563(4080, var12 << 4);
                    var5[var11] = class425.method2563(var12 >> 4, 4080);
                    var4[var11] = class425.method2563(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ILgk;B)V")
    public final void method1(int arg0, class540 arg1, byte arg2) {
        if (arg2 <= 29) {
            field2576 = -35;
        }
        if (~arg0 == -1) {
            this.field2577 = arg1.method3169(26488);
        }
        ++field2579;
    }
}
