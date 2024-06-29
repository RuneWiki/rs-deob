import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class492 {

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "[I")
    public static int[] field6929 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "I")
    public static int field6932 = 0;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "Lus;")
    public static class1 field6933 = new class1(8, 7);

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "[I")
    public static int[] field6938 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "Lus;")
    public static class1 field6937 = new class1(37, -2);

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "Loa;")
    public static class452 field6935;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
    public static void method2887(int arg0) {
        field6937 = null;
        if (arg0 <= -82) {
            field6935 = null;
            field6938 = null;
            field6929 = null;
            field6933 = null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIII)V")
    public static final void method2888(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6931++;
        if (arg0 < arg3) {
            class103.method579((byte) 115, arg0, arg3, arg4, class128.field1676[arg2]);
        } else {
            class103.method579((byte) 115, arg3, arg0, arg4, class128.field1676[arg2]);
        }
        if (arg1 != -14970) {
            field6938 = null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IB)Lhd;")
    public static final class482 method2889(int arg0, byte arg1) {
        field6930++;
        class482 var2 = (class482) class204.field3042.method1524(false, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class480.field6733.method1257(0, arg0, arg1 + 24510);
        if (var3 == null || var3.length <= 1) {
            return null;
        }
        class482 var4 = class286.method1790(false, var3);
        if (arg1 != 48) {
            method2888(-65, 2, 96, 70, 21);
        }
        class204.field3042.method1522((long) arg0, false, var4);
        return var4;
    }
}
