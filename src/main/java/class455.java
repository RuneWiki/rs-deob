import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class455 extends class377 {

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    private int field5682 = -1;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "Ldr;")
    public static class675 field5684 = new class675(81, 3);

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "Lcga;")
    public static class449 field5685 = new class449(35, 7);

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
    private int field5673;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
    private int field5678;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "Lclient;")
    public static client field5687;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "Ljava/lang/Thread;")
    public static Thread field5683;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "[I")
    private int[] field5676;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILji;)V", line = 6)
    public final void method27(int arg0, int arg1, class572 arg2) {
        ++field5681;
        int var4 = -92 % ((13 - arg1) / 55);
        if (arg0 == 0) {
            this.field5682 = arg2.method3031(-1);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)[[I", line = 20)
    public final int[][] method23(int arg0, byte arg1) {
        ++field5675;
        int[][] var3 = super.field4850.method2566(-27346, arg0);
        int var4 = -36 % ((31 - arg1) / 42);
        if (super.field4850.field5843) {
            int var5 = this.field5673 * (class383.field4916 == this.field5678 ? arg0 : this.field5678 * arg0 / class383.field4916);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            if (~class528.field6661 == ~this.field5673) {
                for (int var9 = 0; ~class528.field6661 < ~var9; ++var9) {
                    int var10 = this.field5676[var5++];
                    var8[var9] = class109.method762(255, var10) << 4;
                    var7[var9] = class109.method762(65280, var10) >> 4;
                    var6[var9] = class109.method762(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~class528.field6661 < ~var11; ++var11) {
                    int var12 = this.field5673 * var11 / class528.field6661;
                    int var13 = this.field5676[var5 + var12];
                    var8[var11] = class109.method762(4080, var13 << 4);
                    var7[var11] = class109.method762(var13 >> 4, 4080);
                    var6[var11] = class109.method762(var13 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)V", line = 86)
    public static final void method2499(int arg0, boolean arg1) {
        class55.field711 = arg0;
        ++field5679;
        if (arg1) {
            method2500((byte) -57);
        }
        class650.field8783.method1218(118);
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(B)V", line = 101)
    public static void method2500(byte arg0) {
        int var1 = 77 / ((15 - arg0) / 57);
        field5687 = null;
        field5683 = null;
        field5685 = null;
        field5684 = null;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V", line = 113)
    public class455() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBI)V", line = 118)
    public final void method2177(int arg0, byte arg1, int arg2) {
        super.method2177(arg0, arg1, arg2);
        ++field5677;
        if (~this.field5682 <= -1 && class536.field6746 != null) {
            int var4 = !class536.field6746.method2718(this.field5682, (byte) 72).field1826 ? 128 : 64;
            this.field5676 = class536.field6746.method2714(1.0F, this.field5682, var4, 19991, false, var4);
            this.field5678 = var4;
            this.field5673 = var4;
        }
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)I", line = 137)
    public final int method2178(int arg0) {
        if (arg0 != -1) {
            this.method27(-3, -101, (class572) null);
        }
        ++field5674;
        return this.field5682;
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V", line = 149)
    public final void method1721(int arg0) {
        super.method1721(arg0);
        ++field5680;
        this.field5676 = null;
    }
}
