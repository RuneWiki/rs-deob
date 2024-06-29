import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class188 extends class739 {

    @OriginalMember(owner = "client!hba", name = "A", descriptor = "I")
    private int field2633 = 2048;

    @OriginalMember(owner = "client!hba", name = "z", descriptor = "I")
    private int field2632 = 3072;

    @OriginalMember(owner = "client!hba", name = "D", descriptor = "I")
    private int field2636 = 1024;

    @OriginalMember(owner = "client!hba", name = "B", descriptor = "I")
    public static int field2634 = 0;

    @OriginalMember(owner = "client!hba", name = "C", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!hba", name = "E", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!hba", name = "F", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!hba", name = "G", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!hba", name = "H", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!hba", name = "I", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public static final boolean method1327(String arg0, boolean arg1) {
        ++field2640;
        if (arg1) {
            return true;
        } else if (arg0 == null) {
            return false;
        } else {
            for (int var2 = 0; class365.field5352 > var2; ++var2) {
                if (arg0.equalsIgnoreCase(class11.field101[var2])) {
                    return true;
                }
                if (arg0.equalsIgnoreCase(class667.field9525[var2])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lsl;IB)V")
    public final void method112(class479 arg0, int arg1, byte arg2) {
        ++field2638;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field10320 = arg0.method2886(true) == 1;
                }
            } else {
                this.field2632 = arg0.method2882(arg2 ^ -2);
            }
        } else {
            this.field2636 = arg0.method2882(-1);
        }
        if (arg2 != 1) {
            this.field2636 = 101;
        }
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(I)V")
    public final void method628(int arg0) {
        if (arg0 >= 53) {
            ++field2639;
            this.field2633 = -this.field2636 + this.field2632;
        }
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(II)[[I")
    public final int[][] method113(int arg0, int arg1) {
        ++field2641;
        int[][] var3 = super.field10328.method2106(arg0, true);
        if (arg1 != 8213) {
            this.field2633 = 78;
        }
        if (super.field10328.field4727) {
            int[][] var4 = this.method4124(arg0, 0, true);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class399.field5703; ++var11) {
                var8[var11] = this.field2636 - -(var5[var11] * this.field2633 >> 12);
                var9[var11] = (var6[var11] * this.field2633 >> 12) + this.field2636;
                var10[var11] = (var7[var11] * this.field2633 >> 12) + this.field2636;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "()V")
    public class188() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(ZI)[I")
    public final int[] method445(boolean arg0, int arg1) {
        if (arg0) {
            this.method628(-99);
        }
        ++field2637;
        int[] var3 = super.field10317.method1042(0, arg1);
        if (super.field10317.field2170) {
            int[] var4 = this.method4127(arg1, 43, 0);
            for (int var5 = 0; ~class399.field5703 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field2633 >> 12) + this.field2636;
            }
        }
        return var3;
    }
}
