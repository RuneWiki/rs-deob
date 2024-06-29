import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class630 {

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Ldw;")
    public static class668 field8809 = class492.method2856(false);

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "F")
    public static float field8811 = 0.0F;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Lwba;")
    public static class46 field8810 = new class46();

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "Lgaa;")
    public static class267 field8812 = new class267();

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field8803;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field8804;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field8805;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field8808;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBI)I")
    public final int method3509(int arg0, byte arg1, int arg2) {
        field8806++;
        int var4 = -98 / ((-arg1 - 4) / 52);
        int var5 = arg0 < class31.field494 ? class31.field494 : arg0;
        if (class104.field1620 == this) {
            return 0;
        } else if (class188.field2712 == this) {
            return var5 - arg2;
        } else if (class532.field7462 == this) {
            return (var5 - arg2) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)I")
    public static final int method3510(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field8804++;
        if (var4 == 0) {
            return arg2;
        } else if (arg0 != -31990) {
            return 51;
        } else if (var4 == 1) {
            return 4095 - arg3;
        } else if (var4 == 2) {
            return 4095 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!gi", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8808++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method3511(boolean arg0, byte[] arg1) {
        if (arg0) {
            field8812 = null;
        }
        field8803++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class476.method2792(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public static void method3512(int arg0) {
        field8810 = null;
        if (arg0 >= -25) {
            field8807 = 77;
        }
        field8812 = null;
        field8809 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIII)V")
    public static final void method3513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class15.field153 <= arg1 && class248.field3859 >= arg4 && arg5 >= class520.field7329 && arg2 <= class239.field3747) {
            class594.method3364(arg2, arg1, arg3, arg4, arg5, (byte) -108);
        } else {
            class429.method2566((byte) 71, arg4, arg5, arg1, arg2, arg3);
        }
        field8805++;
        if (arg0 != 0) {
            field8809 = null;
        }
    }
}
