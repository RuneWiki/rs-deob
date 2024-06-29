import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class705 {

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "I")
    public static int field9881;

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "I")
    public static int field9882;

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "I")
    public static int field9883;

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "Ldm;")
    public static class765 field9884;

    @OriginalMember(owner = "client!gca", name = "toString", descriptor = "()Ljava/lang/String;", line = 12)
    public final String toString() {
        field9881++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V", line = 20)
    public static void method3941(int arg0) {
        if (arg0 != 0) {
            field9884 = null;
        }
        field9884 = null;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIB)V", line = 31)
    public static final void method3942(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class515.field7102 = arg1;
        class698.field9801 = arg3;
        class742.field10301 = arg0;
        int var5 = 120 % ((45 - arg4) / 37);
        class435.field6058 = arg2;
        field9882++;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZII)V", line = 45)
    public static final void method3943(boolean arg0, int arg1, int arg2) {
        if (class582.field8375 != 0) {
            if (arg2 >= 0) {
                class475.field6454[arg2] = arg1;
            } else {
                for (int var3 = 0; var3 < 16; var3++) {
                    class475.field6454[var3] = arg1;
                }
            }
        }
        field9883++;
        if (arg0) {
            method3943(false, -100, 78);
        }
        class233.field3384.method2803(arg1, arg2, -70);
    }
}
