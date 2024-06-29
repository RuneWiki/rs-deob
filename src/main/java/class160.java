import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class160 extends class38 {

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "Lqw;")
    public static class77 field2546 = new class77();

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "Lmia;")
    public static class63 field2552 = new class63(2, 7);

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "I")
    private int field2548;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
    private int field2549;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
    private int field2550;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILrg;)V", line = 3)
    public final void method190(int arg0, int arg1, class645 arg2) {
        if (~arg1 == -1) {
            this.method1172(arg2.method3747((byte) -74), false);
        }
        if (arg0 <= 34) {
            method1171(true);
        }
        ++field2547;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V", line = 33)
    public static void method1171(boolean arg0) {
        if (arg0) {
            field2552 = null;
            field2546 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(I)V", line = 45)
    private class160(int arg0) {
        super(0, false);
        this.method1172(arg0, false);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)[[I", line = 54)
    public final int[][] method196(int arg0, int arg1) {
        ++field2553;
        int[][] var3 = super.field387.method2809(arg1, (byte) -48);
        if (super.field387.field6792) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class729.field10216; ++var7) {
                var4[var7] = this.field2550;
                var5[var7] = this.field2549;
                var6[var7] = this.field2548;
            }
        }
        if (arg0 != -18210) {
            field2552 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V", line = 93)
    public class160() {
        this(0);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)V", line = 105)
    private final void method1172(int arg0, boolean arg1) {
        if (arg1) {
            method1171(true);
        }
        ++field2551;
        this.field2550 = (arg0 & 16711680) >> 12;
        this.field2548 = (arg0 & 255) << 4;
        this.field2549 = 4080 & arg0 >> 4;
    }
}
