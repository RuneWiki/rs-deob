import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class151 {

    @OriginalMember(owner = "client!cfa", name = "g", descriptor = "Lmq;")
    public static class472 field1869 = new class472(8);

    @OriginalMember(owner = "client!cfa", name = "j", descriptor = "Lfw;")
    public static class52 field1872 = new class52();

    @OriginalMember(owner = "client!cfa", name = "h", descriptor = "F")
    public static float field1870;

    @OriginalMember(owner = "client!cfa", name = "e", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!cfa", name = "k", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "Lgd;")
    public static class311 field1866;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "[B")
    public byte[] field1863;

    @OriginalMember(owner = "client!cfa", name = "i", descriptor = "[I")
    public static int[] field1871;

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "[S")
    public short[] field1864;

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "[S")
    public short[] field1865;

    @OriginalMember(owner = "client!cfa", name = "f", descriptor = "[S")
    public short[] field1868;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(III)Llw;", line = 5)
    public static final class611 method973(int arg0, int arg1, int arg2) {
        class433 var3 = class281.field3808[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class611 var4 = var3.field6216;
            var3.field6216 = null;
            class328.method1909(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BJ)V", line = 16)
    public static final void method974(byte arg0, long arg1) {
        if (arg0 != -102) {
            field1870 = -1.3817177F;
        }
        field1867++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class345.method1975(arg1 - 1L, -123);
            class345.method1975(1L, -107);
        } else {
            class345.method1975(arg1, -113);
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)V", line = 54)
    public static void method975(int arg0) {
        if (arg0 != 1) {
            field1870 = -1.253297F;
        }
        field1871 = null;
        field1872 = null;
        field1866 = null;
        field1869 = null;
    }
}
