import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class286 extends class377 {

    @OriginalMember(owner = "client!bv", name = "H", descriptor = "I")
    private int field3629 = -1;

    @OriginalMember(owner = "client!bv", name = "z", descriptor = "Ltl;")
    public static class580 field3622 = new class580();

    @OriginalMember(owner = "client!bv", name = "C", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!bv", name = "D", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!bv", name = "E", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!bv", name = "F", descriptor = "I")
    public int field3627;

    @OriginalMember(owner = "client!bv", name = "G", descriptor = "I")
    public int field3628;

    @OriginalMember(owner = "client!bv", name = "I", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!bv", name = "J", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!bv", name = "K", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!bv", name = "M", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!bv", name = "N", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!bv", name = "A", descriptor = "[I")
    public int[] field3623;

    @OriginalMember(owner = "client!bv", name = "L", descriptor = "[Ld;")
    public static class140[] field3633;

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V")
    public class286() {
        super(0, false);
    }

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "(I)V")
    public final void method1721(int arg0) {
        super.method1721(arg0);
        ++field3631;
        this.field3623 = null;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IILji;)V")
    public final void method27(int arg0, int arg1, class572 arg2) {
        ++field3626;
        int var4 = -124 / ((arg1 - 13) / 55);
        if (~arg0 == -1) {
            this.field3629 = arg2.method3031(-1);
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(II)V")
    public static final void method1722(int arg0, int arg1) {
        class647.field8756 = 3;
        class671.field9179 = 100;
        class103.field1324 = -1;
        if (arg0 != 4080) {
            method1722(56, -126);
        }
        ++field3634;
        class537.field6770 = arg1;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IB)[[I")
    public int[][] method23(int arg0, byte arg1) {
        ++field3624;
        int[][] var3 = super.field4850.method2566(-27346, arg0);
        int var4 = 124 % ((31 - arg1) / 42);
        if (super.field4850.field5843 && this.method1723(-127)) {
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int var8 = (~class383.field4916 == ~this.field3628 ? arg0 : this.field3628 * arg0 / class383.field4916) * this.field3627;
            if (~class528.field6661 == ~this.field3627) {
                for (int var9 = 0; var9 < class528.field6661; ++var9) {
                    int var10 = this.field3623[var8++];
                    var7[var9] = class109.method762(4080, var10 << 4);
                    var6[var9] = class109.method762(var10 >> 4, 4080);
                    var5[var9] = class109.method762(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; var11 < class528.field6661; ++var11) {
                    int var12 = this.field3627 * var11 / class528.field6661;
                    int var13 = this.field3623[var8 - -var12];
                    var7[var11] = class109.method762(var13, 255) << 4;
                    var6[var11] = class109.method762(var13 >> 4, 4080);
                    var5[var11] = class109.method762(var13 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "(I)Z")
    public final boolean method1723(int arg0) {
        ++field3625;
        if (this.field3623 != null) {
            return true;
        } else if (~this.field3629 <= -1) {
            class495 var2 = ~class67.field818 > -1 ? class495.method2696(class79.field1023, this.field3629) : class495.method2695(class79.field1023, class67.field818, this.field3629);
            var2.method2698();
            this.field3623 = var2.method2686();
            this.field3627 = var2.field6193;
            this.field3628 = var2.field6195;
            return true;
        } else {
            if (arg0 >= -125) {
                this.method1723(105);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)I")
    public final int method1724(int arg0) {
        ++field3632;
        if (arg0 <= 94) {
            this.method1721(-104);
        }
        return this.field3629;
    }

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "(B)V")
    public static void method1725(byte arg0) {
        field3622 = null;
        field3633 = null;
        if (arg0 >= -27) {
            method1725((byte) 77);
        }
    }
}
