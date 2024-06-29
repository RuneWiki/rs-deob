import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class545 extends RuntimeException {

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Ljava/lang/String;")
    public String field7804;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field7805;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field7802 = 0;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Z")
    public static boolean field7803 = false;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "[B")
    public static byte[] field7800 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method3089(byte arg0) {
        field7800 = null;
        if (arg0 != 8) {
            field7800 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLgi;ZILgi;IZ)I")
    public static final int method3090(byte arg0, class620 arg1, boolean arg2, int arg3, class620 arg4, int arg5, boolean arg6) {
        field7801++;
        int var7 = class517.method2950(1000, arg6, arg4, arg5, arg1);
        if (arg0 != -57) {
            field7802 = -38;
        }
        if (var7 != 0) {
            return arg6 ? -var7 : var7;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var8 = class517.method2950(1000, arg2, arg4, arg3, arg1);
            return arg2 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjo;)V")
    public static final void method3091(int arg0, class303 arg1) {
        if (arg0 != 0) {
            method3090((byte) 108, null, true, -80, null, 112, false);
        }
        field7799++;
        class25.field304 = arg1;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class545(Throwable arg0, String arg1) {
        this.field7804 = arg1;
        this.field7805 = arg0;
    }
}
