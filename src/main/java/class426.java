import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class426 {

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public int field6129;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Z")
    public static boolean field6128 = false;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lsd;")
    public static class95 field6126 = new class95();

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "[I")
    public static int[] field6132 = new int[13];

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "[[I")
    public static int[][] field6133 = new int[128][128];

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 3)
    public static void method2605(byte arg0) {
        field6132 = null;
        if (arg0 != -9) {
            method2607(-47, null, -126, -99, 117, null, null, 90);
        }
        field6133 = null;
        field6126 = null;
    }

    @OriginalMember(owner = "client!ad", name = "toString", descriptor = "()Ljava/lang/String;", line = 22)
    public final String toString() {
        field6127++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZII)Z", line = 33)
    public static final boolean method2606(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method2605((byte) -104);
        }
        field6130++;
        return (arg2 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(II)V", line = 47)
    public class426(int arg0, int arg1) {
        this.field6129 = arg1;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILff;IIILke;Liv;I)V", line = 61)
    public static final void method2607(int arg0, class9 arg1, int arg2, int arg3, int arg4, class598 arg5, class99 arg6, int arg7) {
        field6131++;
        if (arg0 != 979190089) {
            field6128 = false;
        }
        class397 var8 = new class397();
        var8.field5812 = arg4 << 9;
        var8.field5827 = arg2;
        var8.field5823 = arg3 << 9;
        if (arg6 != null) {
            var8.field5829 = arg6;
            int var10 = arg6.field1796;
            int var11 = arg6.field1761;
            if (arg7 == 1 || arg7 == 3) {
                var10 = arg6.field1761;
                var11 = arg6.field1796;
            }
            var8.field5821 = arg3 + var11 << 9;
            var8.field5814 = arg6.field1797;
            var8.field5819 = arg6.field1722;
            var8.field5815 = arg6.field1751;
            var8.field5831 = arg6.field1739;
            var8.field5830 = arg6.field1713;
            var8.field5833 = arg6.field1738;
            var8.field5828 = arg6.field1724 << 9;
            var8.field5802 = arg6.field1772;
            var8.field5832 = arg4 + var10 << 9;
            var8.field5811 = arg6.field1771;
            var8.field5808 = arg6.field1723;
            if (arg6.field1780 != null) {
                var8.field5818 = true;
                var8.method2486((byte) 21);
            }
            if (var8.field5831 != null) {
                var8.field5804 = var8.field5814 + ((int) ((double) (var8.field5802 - var8.field5814) * Math.random()));
            }
            class754.field10532.method1273(var8, -20180);
            return;
        }
        if (arg1 != null) {
            var8.field5825 = arg1;
            class334 var9 = arg1.field126;
            if (var9.field4694 != null) {
                var8.field5818 = true;
                var9 = var9.method2110(class390.field5635, arg0 ^ 0xC5A2BEB6);
            }
            if (var9 != null) {
                var8.field5832 = var9.field4716 + arg4 << 9;
                var8.field5821 = arg3 + var9.field4716 << 9;
                var8.field5819 = class436.method2643(arg1, -1);
                var8.field5830 = var9.field4657;
                var8.field5828 = var9.field4709 << 9;
                var8.field5811 = var9.field4673;
                var8.field5815 = var9.field4680;
                var8.field5808 = var9.field4687;
            }
            client.field4233.method1273(var8, arg0 - 979210269);
            return;
        }
        if (arg5 == null) {
            return;
        }
        var8.field5813 = arg5;
        var8.field5832 = arg5.method2457((byte) 74) + arg4 << 9;
        var8.field5821 = arg5.method2457((byte) 86) + arg3 << 9;
        var8.field5819 = class613.method3475(-1, arg5);
        var8.field5815 = 256;
        var8.field5828 = arg5.field8198 << 9;
        var8.field5811 = arg5.field8203;
        var8.field5830 = 256;
        var8.field5808 = arg5.field8162;
        class68.field1280.method1468((byte) 65, (long) arg5.field5716, var8);
        return;
    }
}
