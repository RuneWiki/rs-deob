import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class296 {

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "Lck;")
    private class733 field3752;

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "I")
    public int field3755;

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "Lwu;")
    public static class582 field3753 = new class582("", 12);

    @OriginalMember(owner = "client!oca", name = "i", descriptor = "Lrn;")
    public static class633 field3759 = new class633(19, 8);

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!oca", name = "g", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!oca", name = "h", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V", line = 6)
    public static void method1770(int arg0) {
        field3753 = null;
        field3759 = null;
        if (arg0 != 512) {
            method1771(null, -88);
        }
    }

    @OriginalMember(owner = "client!oca", name = "finalize", descriptor = "()V", line = 19)
    protected final void finalize() throws Throwable {
        field3756++;
        this.field3752.method3910(this.field3755, -121);
        super.finalize();
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lck;II)V", line = 29)
    public class296(class733 arg0, int arg1, int arg2) {
        this.field3752 = arg0;
        this.field3755 = arg2;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 41)
    public static final boolean method1771(String arg0, int arg1) {
        int var2 = 83 / ((arg1 + 36) / 51);
        field3754++;
        return class610.method3267(10, -32683, true, arg0);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(ILfda;)V", line = 57)
    public static final void method1772(int arg0, class381 arg1) {
        field3751++;
        boolean var2 = false;
        if (class693.field8900 == arg1.field4690 || arg1.field4700 == -1 || arg1.field4692 != 0) {
            var2 = true;
        } else {
            class11 var3 = class143.field1864.method4265(true, arg1.field4700);
            if (var3.field108 || var3.field121[arg1.field4721] < arg1.field4729 + 1) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field4690 - arg1.field4675;
            int var5 = class693.field8900 - arg1.field4675;
            int var6 = arg1.field4736 * 512 + arg1.method190((byte) -52) * 256;
            int var7 = arg1.field4745 * 512 + arg1.method190((byte) -97) * 256;
            int var8 = arg1.field4727 * 512 + arg1.method190((byte) -82) * 256;
            int var9 = arg1.field4680 * 512 + arg1.method190((byte) -121) * 256;
            arg1.field2900 = ((var4 - var5) * var7 + var5 * var9) / var4;
            arg1.field2896 = ((var4 - var5) * var6 + var5 * var8) / var4;
        }
        arg1.field4759 = 0;
        if (arg0 != 512) {
            method1772(7, null);
        }
        if (arg1.field4693 == 0) {
            arg1.method2179(284, 8192, false);
        }
        if (arg1.field4693 == 1) {
            arg1.method2179(284, 12288, false);
        }
        if (arg1.field4693 == 2) {
            arg1.method2179(284, 0, false);
        }
        if (arg1.field4693 == 3) {
            arg1.method2179(284, 4096, false);
        }
    }
}
