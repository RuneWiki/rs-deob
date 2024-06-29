import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class536 implements class486 {

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public int field7435;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public int field7429;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public int field7426;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public int field7428;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public int field7431;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "Log;")
    public class673 field7433;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public int field7432;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public int field7427;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public int field7438;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "Lgi;")
    public class705 field7437;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "Z")
    public boolean field7430;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "Ljb;")
    public static class519 field7436 = new class519(10, 4);

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field7424;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII[[[BIIILha;IIII)V")
    public static final void method3114(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int arg5, int arg6, int arg7, class66 arg8, int arg9, int arg10, int arg11, int arg12) {
        field7424++;
        if (arg7 == 0 || arg3 == 0) {
            return;
        }
        if (arg7 == 9) {
            arg6 = arg6 + 1 & 0x3;
            arg7 = 1;
        }
        if (arg2 <= 5) {
            return;
        }
        if (arg7 == 10) {
            arg6 = arg6 + 3 & 0x3;
            arg7 = 1;
        }
        if (arg7 == 11) {
            arg6 = arg6 + 3 & 0x3;
            arg7 = 8;
        }
        arg8.method435(arg10, arg12, arg1, arg0, arg11, arg9, arg4[arg7 - 1][arg6], arg3, arg5);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static void method3115(int arg0) {
        int var1 = -117 / ((arg0 + 18) / 38);
        field7436 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)Leo;")
    public final class313 method576(byte arg0) {
        if (arg0 != 41) {
            this.field7432 = -93;
        }
        field7425++;
        return class375.field5488;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(ILog;Lgi;IIIIIIIZ)V")
    public class536(int arg0, class673 arg1, class705 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field7435 = arg3;
        this.field7429 = arg9;
        this.field7426 = arg0;
        this.field7428 = arg8;
        this.field7431 = arg6;
        this.field7433 = arg1;
        this.field7432 = arg7;
        this.field7427 = arg4;
        this.field7438 = arg5;
        this.field7437 = arg2;
        this.field7430 = arg10;
    }
}
