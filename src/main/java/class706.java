import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class706 extends class529 {

    @OriginalMember(owner = "client!oda", name = "K", descriptor = "I")
    private int field9950 = 0;

    @OriginalMember(owner = "client!oda", name = "J", descriptor = "I")
    private int field9949 = 4096;

    @OriginalMember(owner = "client!oda", name = "M", descriptor = "I")
    public static int field9952 = 0;

    @OriginalMember(owner = "client!oda", name = "D", descriptor = "I")
    public static int field9945;

    @OriginalMember(owner = "client!oda", name = "E", descriptor = "I")
    public static int field9946;

    @OriginalMember(owner = "client!oda", name = "G", descriptor = "I")
    public static int field9947;

    @OriginalMember(owner = "client!oda", name = "I", descriptor = "I")
    public static int field9948;

    @OriginalMember(owner = "client!oda", name = "N", descriptor = "I")
    public static int field9953;

    @OriginalMember(owner = "client!oda", name = "L", descriptor = "[[I")
    public static int[][] field9951;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IB)[I")
    public final int[] method191(int arg0, byte arg1) {
        ++field9953;
        int[] var3 = super.field7456.method1635(arg0, -85);
        int var4 = -59 / ((arg1 - 27) / 49);
        if (super.field7456.field3449) {
            int[] var5 = this.method3028((byte) 102, arg0, 0);
            for (int var6 = 0; var6 < class304.field3909; ++var6) {
                int var7 = var5[var6];
                var3[var6] = this.field9950 <= var7 && var7 <= this.field9949 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IBLtn;)V")
    public final void method190(int arg0, byte arg1, class179 arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field9949 = arg2.method1107(false);
            }
        } else {
            this.field9950 = arg2.method1107(false);
        }
        if (arg1 < 45) {
            method3909((byte) -86, (class179) null);
        }
        ++field9948;
    }

    @OriginalMember(owner = "client!oda", name = "f", descriptor = "(I)V")
    public static void method3908(int arg0) {
        field9951 = null;
        if (arg0 != 0) {
            field9947 = 21;
        }
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "()V")
    public class706() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(BLtn;)Lag;")
    public static final class439 method3909(byte arg0, class179 arg1) {
        ++field9946;
        int var2 = 84 / ((arg0 - -6) / 59);
        int var3 = arg1.method1107(false);
        return new class439(var3);
    }

    @OriginalMember(owner = "client!oda", name = "g", descriptor = "(I)V")
    public static final void method3910(int arg0) {
        ++field9945;
        if (class755.field10520 != null) {
            class334[] var1 = class755.field10520;
            for (int var2 = 0; ~var1.length < ~var2; ++var2) {
                class334 var3 = var1[var2];
                var3.method241(-111);
            }
        }
        int var4 = -127 / ((5 - arg0) / 60);
    }
}
