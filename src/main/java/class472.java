import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class472 extends class335 {

    @OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
    private int field6583;

    @OriginalMember(owner = "client!vo", name = "C", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!vo", name = "D", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!vo", name = "E", descriptor = "I")
    private int field6586;

    @OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
    private int field6587;

    @OriginalMember(owner = "client!vo", name = "H", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!vo", name = "I", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V")
    public class472() {
        this(0);
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(IZ)V")
    private final void method2726(int arg0, boolean arg1) {
        this.field6587 = arg0 >> 12 & 4080;
        ++field6589;
        if (arg1) {
            this.field6583 = 31;
        }
        this.field6583 = arg0 << 4 & 4080;
        this.field6586 = 4080 & arg0 >> 4;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(I)V")
    private class472(int arg0) {
        super(0, false);
        this.method2726(arg0, false);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method1(int arg0, boolean arg1) {
        if (arg1) {
            this.field6587 = 42;
        }
        ++field6588;
        int[][] var3 = super.field4527.method669(arg0, (byte) 2);
        if (super.field4527.field1468) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class649.field8968; ++var7) {
                var4[var7] = this.field6587;
                var5[var7] = this.field6586;
                var6[var7] = this.field6583;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "(III)Z")
    public static final boolean method2727(int arg0, int arg1, int arg2) {
        ++field6585;
        if (!class237.method1468(arg1, false, arg0)) {
            return false;
        } else if (class614.method3397(arg1, 0, arg0) | ~(36864 & arg1) != -1 | class411.method2337(arg1, arg0, (byte) 110)) {
            return true;
        } else {
            return arg2 != -16489 ? false : ~(arg0 & 55) == -1 & (~(8192 & arg1) != -1 | class547.method3067(arg1, arg2 ^ 9598, arg0) | class633.method3509(arg0, arg1, (byte) -17));
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILio;I)V")
    public final void method2(int arg0, class157 arg1, int arg2) {
        ++field6584;
        if (~arg0 == -1) {
            this.method2726(arg1.method933((byte) 1), false);
        }
        if (arg2 != -66) {
            method2727(-13, -88, -80);
        }
    }
}
