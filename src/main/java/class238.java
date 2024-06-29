import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class238 extends class325 {

    @OriginalMember(owner = "client!em", name = "E", descriptor = "I")
    private int field3210 = 4096;

    @OriginalMember(owner = "client!em", name = "H", descriptor = "I")
    private int field3213 = 4096;

    @OriginalMember(owner = "client!em", name = "J", descriptor = "I")
    private int field3215 = 4096;

    @OriginalMember(owner = "client!em", name = "F", descriptor = "Ljw;")
    public static class581 field3211 = new class581(54, -1);

    @OriginalMember(owner = "client!em", name = "I", descriptor = "Z")
    public static boolean field3214 = false;

    @OriginalMember(owner = "client!em", name = "G", descriptor = "Z")
    public static boolean field3212 = false;

    @OriginalMember(owner = "client!em", name = "C", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!em", name = "D", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(Z)V", line = 4)
    public static void method1540(boolean arg0) {
        field3211 = null;
        if (arg0) {
            method1540(false);
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V", line = 143)
    public class238() {
        super(1, false);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)[[I", line = 25)
    public final int[][] method360(int arg0, byte arg1) {
        ++field3209;
        int[][] var3 = super.field4733.method1251((byte) 82, arg0);
        if (super.field4733.field2369) {
            int[][] var4 = this.method2063(0, 1, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class261.field3874 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var8[var11] = this.field3213 * var12 >> 12;
                    var9[var11] = this.field3210 * var13 >> 12;
                    var10[var11] = this.field3215 * var14 >> 12;
                } else {
                    var8[var11] = this.field3213;
                    var9[var11] = this.field3210;
                    var10[var11] = this.field3215;
                }
            }
        }
        if (arg1 != -9) {
            method1540(false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Ljp;IB)V", line = 90)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (arg2 > -41) {
            this.method95((class376) null, 49, (byte) -49);
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field3215 = arg0.method2359(-1);
                }
            } else {
                this.field3210 = arg0.method2359(-1);
            }
        } else {
            this.field3213 = arg0.method2359(-1);
        }
        ++field3208;
    }
}
