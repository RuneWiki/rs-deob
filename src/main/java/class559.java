import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class559 extends class207 {

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "[I")
    public static int[] field7664 = new int[32];

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "[Lab;")
    public static class696[] field7665;

    @OriginalMember(owner = "client!tp", name = "t", descriptor = "[I")
    public static int[] field7671;

    @OriginalMember(owner = "client!tp", name = "p", descriptor = "[B")
    public static byte[] field7667;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
    public static int field7659;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!tp", name = "q", descriptor = "I")
    public static int field7668;

    @OriginalMember(owner = "client!tp", name = "s", descriptor = "Lal;")
    public static class109 field7670;

    @OriginalMember(owner = "client!tp", name = "r", descriptor = "[Lhh;")
    public static class140[] field7669;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field7664[var1] = var0 + -1;
            var0 += var0;
        }
        field7666 = 0;
        field7665 = new class696[100];
        field7671 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        int var2 = 0;
        field7667 = new byte[32896];
        for (int var3 = 0; var3 < 256; ++var3) {
            for (int var4 = 0; ~var3 <= ~var4; ++var4) {
                field7667[var2++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var3 * var3 + var4 * var4 - -65535) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(IB)I", line = 5)
    public final int method39(int arg0, byte arg1) {
        ++field7658;
        if (arg1 != 69) {
            this.method3194(-34);
        }
        return 1;
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lrd;)V", line = 16)
    public class559(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZI)Lgd;", line = 19)
    public static final class358 method3192(int arg0, boolean arg1, int arg2) {
        ++field7663;
        if (arg2 != Integer.MIN_VALUE) {
            method3192(88, false, 57);
        }
        long var3 = (long) (arg0 | (!arg1 ? 0 : Integer.MIN_VALUE));
        return (class358) class790.field10847.method1248(90, var3);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)V", line = 32)
    public static void method3193(byte arg0) {
        field7671 = null;
        field7670 = null;
        if (arg0 != -59) {
            field7671 = null;
        }
        field7669 = null;
        field7667 = null;
        field7664 = null;
        field7665 = null;
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)I", line = 51)
    public final int method36(int arg0) {
        if (arg0 >= -14) {
            return -16;
        } else {
            ++field7659;
            return super.field2668.method2249((byte) 124).method2149((byte) -128) > 1 ? 4 : 2;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V", line = 66)
    public final void method37(int arg0) {
        if (~super.field2669 > -1 && ~super.field2669 < -5) {
            super.field2669 = this.method36(-67);
        }
        ++field7660;
        int var2 = -30 / ((arg0 - -58) / 48);
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(ILrd;)V", line = 81)
    public class559(int arg0, class355 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IB)V", line = 84)
    public final void method41(int arg0, byte arg1) {
        if (arg1 > -7) {
            method3193((byte) 113);
        }
        ++field7662;
        super.field2669 = arg0;
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(I)I", line = 95)
    public final int method3194(int arg0) {
        ++field7661;
        return arg0 != 43 ? -27 : super.field2669;
    }
}
