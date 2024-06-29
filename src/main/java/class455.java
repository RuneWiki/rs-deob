import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class455 extends class184 {

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    private int field6559 = 2048;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    private int field6553 = 3072;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    private int field6560 = 1024;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "Z")
    public static boolean field6552 = false;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(Z)V")
    public final void method109(boolean arg0) {
        if (arg0) {
            this.method109(true);
        }
        this.field6559 = this.field6553 - this.field6560;
        ++field6556;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)[[I")
    public final int[][] method13(int arg0, int arg1) {
        if (arg1 != 1) {
            this.method13(70, -105);
        }
        ++field6554;
        int[][] var3 = super.field2416.method3031(arg1 ^ -28525, arg0);
        if (super.field2416.field7271) {
            int[][] var4 = this.method1163(1, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class245.field3167; ++var11) {
                var8[var11] = (var5[var11] * this.field6559 >> 12) + this.field6560;
                var9[var11] = this.field6560 - -(var6[var11] * this.field6559 >> 12);
                var10[var11] = (var7[var11] * this.field6559 >> 12) + this.field6560;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
    public class455() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)V")
    public static final void method2706(int arg0) {
        if (arg0 < 117) {
            field6552 = true;
        }
        ++field6555;
        if (class476.field6902 != 3) {
            class64.field834 = class385.field5064;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        ++field6557;
        if (arg1 != 578) {
            return null;
        } else {
            int[] var3 = super.field2409.method248(arg0, 16776960);
            if (super.field2409.field436) {
                int[] var4 = this.method1159(arg1 ^ 629, arg0, 0);
                for (int var5 = 0; var5 < class245.field3167; ++var5) {
                    var3[var5] = (var4[var5] * this.field6559 >> 12) + this.field6560;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BILfh;)V")
    public final void method7(byte arg0, int arg1, class463 arg2) {
        ++field6558;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field2406 = ~arg2.method2737(false) == -2;
                }
            } else {
                this.field6553 = arg2.method2758((byte) 83);
            }
        } else {
            this.field6560 = arg2.method2758((byte) 118);
        }
        int var5 = 9 % ((-13 - arg0) / 51);
    }

    static {
        new class335(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
    }
}
