import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class84 extends class105 {

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    private final int field1570;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    private final int field1568;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    private final int field1569;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    private final int field1565;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "Lpj;")
    public static class237 field1572 = class33.method353("Loading world list data", 108);

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
    public static int field1573 = -1;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "Z")
    public static boolean field1563 = false;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(III)V")
    public final void method501(int arg0, int arg1, int arg2) {
        ++field1574;
        int var4 = this.field1569 * arg0 >> 12;
        int var5 = this.field1568 * arg0 >> 12;
        int var6 = this.field1570 * arg2 >> 12;
        int var7 = this.field1565 * arg2 >> 12;
        if (arg1 <= 110) {
            method644((byte) -66);
        }
        class14.method131(var5, super.field1852, (byte) -85, var7, var6, var4);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIILqe;Lqe;IIIIJ)V")
    public static final void method643(int arg0, int arg1, int arg2, int arg3, class95 arg4, class95 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 != null) {
            class212 var12 = new class212();
            var12.field3617 = arg10;
            var12.field3622 = arg1 * 128 + 64;
            var12.field3610 = arg2 * 128 + 64;
            var12.field3613 = arg3;
            var12.field3604 = arg4;
            var12.field3605 = arg5;
            var12.field3608 = arg6;
            var12.field3606 = arg7;
            var12.field3615 = arg8;
            var12.field3619 = arg9;
            for (int var13 = arg0; var13 >= 0; --var13) {
                if (class274.field4775[var13][arg1][arg2] == null) {
                    class274.field4775[var13][arg1][arg2] = new class35(var13, arg1, arg2);
                }
            }
            class274.field4775[arg0][arg1][arg2].field749 = var12;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V")
    public static void method644(byte arg0) {
        if (arg0 != 48) {
            method646(56);
        }
        field1572 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBI)V")
    public final void method497(int arg0, byte arg1, int arg2) {
        if (arg1 == 51) {
            ++field1564;
            int var4 = this.field1569 * arg0 >> 12;
            int var5 = this.field1570 * arg2 >> 12;
            int var6 = this.field1565 * arg2 >> 12;
            int var7 = this.field1568 * arg0 >> 12;
            class245.method1688(super.field1852, super.field1856, var4, var5, (byte) 103, var7, var6, super.field1851);
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(IIIIIII)V")
    public class84(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1570 = arg1;
        this.field1568 = arg0;
        this.field1569 = arg2;
        this.field1565 = arg3;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IJ)V")
    public static final void method645(int arg0, long arg1) {
        ++field1567;
        if (~arg1 < -1L) {
            if (arg0 != 1) {
                field1571 = -90;
            }
            if (arg1 % 10L == 0L) {
                class273.method1833(arg1 - 1L, arg0 + -109);
                class273.method1833(1L, -118);
            } else {
                class273.method1833(arg1, -117);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public static final void method646(int arg0) {
        if (~class264.field4507 == -31) {
            class79.method610(25, (byte) 110);
        }
        ++field1566;
        if (arg0 != 25) {
            field1563 = true;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
    public final void method499(int arg0, int arg1, int arg2) {
        if (arg1 >= -72) {
            method643(68, -37, -108, 78, (class95) null, (class95) null, -14, -11, -82, -22, 117L);
        }
        ++field1575;
    }
}
