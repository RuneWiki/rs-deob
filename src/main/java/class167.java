import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class167 extends class649 {

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "[I")
    public static int[] field2917 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)Lcc;")
    public static final class576 method1345(int arg0) {
        int var1 = 80 / ((arg0 - 3) / 55);
        ++field2911;
        try {
            return new class269();
        } catch (Throwable var3) {
            try {
                return (class576) Class.forName("of").newInstance();
            } catch (Throwable var2) {
                return new class704();
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V")
    public static final void method1346(int arg0) {
        int var1 = -127 % ((9 - arg0) / 60);
        ++field2916;
        if (class346.field5112 != null) {
            class346.field5112.method3977(-15785);
        }
        if (class719.field10081 != null) {
            while (true) {
                try {
                    class719.field10081.join();
                    return;
                } catch (InterruptedException var2) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(ILhs;)V")
    public class167(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I")
    public final int method135(int arg0) {
        int var2 = -122 / ((-18 - arg0) / 50);
        ++field2915;
        return 0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)V")
    public final void method129(int arg0, byte arg1) {
        ++field2914;
        if (arg1 >= -120) {
            field2917 = null;
        }
        super.field9223 = arg0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)I")
    public final int method133(int arg0, int arg1) {
        ++field2909;
        if (arg0 != 18648) {
            field2913 = -126;
        }
        return 1;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public final void method134(int arg0) {
        ++field2912;
        if (arg0 != 1) {
            method1345(-40);
        }
        if (~super.field9223 != -2 && ~super.field9223 != -1) {
            super.field9223 = this.method135(-85);
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lhs;)V")
    public class167(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)I")
    public final int method1347(int arg0) {
        if (arg0 != 3) {
            return -48;
        } else {
            ++field2910;
            return super.field9223;
        }
    }

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V")
    public static void method1348(int arg0) {
        if (arg0 <= -59) {
            field2917 = null;
        }
    }
}
