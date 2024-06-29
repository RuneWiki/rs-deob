import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class236 {

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field3795 = 1;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "[Lfj;")
    public static class3[] field3793 = new class3[2048];

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Lck;")
    public static class119 field3799 = class298.method1987((byte) 18, "Unknown");

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field3800 = 100;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "[[[B")
    public static byte[][][] field3796;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lva;BI)Z", line = 12)
    public static final boolean method1513(class36 arg0, byte arg1, int arg2) {
        int var3 = -100 % ((-arg1 - 21) / 45);
        byte[] var4 = arg0.method280(arg2, (byte) 35);
        field3794++;
        if (var4 == null) {
            return false;
        } else {
            class214.method1349(var4, -3);
            return true;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V", line = 33)
    public static void method1514(byte arg0) {
        field3796 = (byte[][][]) null;
        field3799 = null;
        if (arg0 >= -121) {
            field3796 = (byte[][][]) ((byte[][][]) null);
        }
        field3793 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([JI[I)V", line = 53)
    public static final void method1515(long[] arg0, int arg1, int[] arg2) {
        if (arg1 != 100) {
            field3799 = (class119) null;
        }
        class64.method474(arg2, false, 0, arg0.length - 1, arg0);
        field3798++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILva;ZIZII)V", line = 73)
    public static final void method1516(int arg0, class36 arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (!arg2) {
            return;
        }
        class262.field4256 = arg6;
        class140.field2256 = arg0;
        class207.field3298 = arg1;
        class249.field4022 = arg5;
        field3797++;
        class185.field2928 = arg3;
        class126.field1947 = 1;
        class14.field220 = arg4;
    }
}
