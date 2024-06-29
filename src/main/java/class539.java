import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class539 {

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public int field7471;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)Z")
    public static final boolean method3093(int arg0, int arg1, int arg2) {
        field7472++;
        return arg1 <= 22;
    }

    @OriginalMember(owner = "client!bf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7470++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIZ[B)V")
    public static final void method3094(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
        field7473++;
        if (arg3 <= arg0) {
            return;
        }
        int var6 = arg0 + arg1;
        if (!arg4) {
            method3093(78, -5, 115);
        }
        int var7 = arg3 - arg0 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg3 - arg0 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg5[var6++] = 1;
                }
            }
            arg5[var6++] = 1;
            arg5[var6++] = 1;
            arg5[var6++] = 1;
            arg5[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(II)V")
    public class539(int arg0, int arg1) {
        this.field7471 = arg0;
    }
}
