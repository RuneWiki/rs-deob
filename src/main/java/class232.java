import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class232 extends class115 {

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "Lqd;")
    public static class37 field3468 = new class37(64);

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
    private int field3463;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "I")
    private int field3465;

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "I")
    private int field3467;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "Lve;")
    public static class233 field3466;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZZZZ)Lve;")
    public static final class233 method1504(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        ++field3462;
        class141 var5 = null;
        if (class135.field1964 != null) {
            var5 = new class141(arg0, class135.field1964, class12.field193[arg0], 1000000);
        }
        class90.field1371[arg0] = class209.field3014.method1481(1, arg0, var5, class187.field2661);
        if (arg1) {
            class90.field1371[arg0].method1398(83);
        }
        if (!arg4) {
            method1504(-127, false, false, false, false);
        }
        return new class233(class90.field1371[arg0], arg3, arg2);
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(I)V")
    private class232(int arg0) {
        super(0, false);
        this.method1506((byte) -9, arg0);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(IIII)V")
    public static final void method1505(int arg0, int arg1, int arg2, int arg3) {
        class131 var4 = class16.field233[arg0][arg1][arg2];
        if (var4 != null) {
            class264 var5 = var4.field1928;
            if (var5 != null) {
                var5.field3969 = var5.field3969 * arg3 / 16;
                var5.field3984 = var5.field3984 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(II)[[I")
    public final int[][] method235(int arg0, int arg1) {
        ++field3469;
        if (arg0 > -33) {
            this.field3463 = -27;
        }
        int[][] var3 = super.field1716.method6(arg1, (byte) -84);
        if (super.field1716.field23) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class77.field1178 < ~var7; ++var7) {
                var4[var7] = this.field3465;
                var5[var7] = this.field3467;
                var6[var7] = this.field3463;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)V")
    private final void method1506(byte arg0, int arg1) {
        ++field3464;
        this.field3463 = 4080 & arg1 << 4;
        this.field3467 = 4080 & arg1 >> 4;
        if (arg0 != -9) {
            this.method235(-86, 67);
        }
        this.field3465 = (arg1 & 16711680) >> 12;
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(B)V")
    public static void method1507(byte arg0) {
        field3466 = null;
        field3468 = null;
        if (arg0 > -63) {
            field3466 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        if (arg0 == -1) {
            if (arg2 == 0) {
                this.method1506((byte) -9, arg1.method779(16711680));
            }
            ++field3461;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    public class232() {
        this(0);
    }
}
