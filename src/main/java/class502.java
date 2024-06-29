import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class502 {

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "[I")
    private int[] field7524;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    public static int field7527 = -1;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    public static int field7529 = 0;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    public static int field7528;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "Lmn;")
    public static class162 field7525;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "Lnw;")
    public static class473 field7530;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
    public static void method3055(byte arg0) {
        if (arg0 >= -8) {
            field7525 = null;
        }
        field7530 = null;
        field7525 = null;
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "([I)V")
    public class502(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field7524 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field7524[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field7524[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field7524[var5 + var5] = arg0[var4];
            this.field7524[var5 - (-var5 - 1)] = var4++;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZLna;II[BIIB)Lme;")
    public static final class508 method3056(boolean arg0, class211 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, byte arg7) {
        field7526++;
        if (arg7 >= -74) {
            field7527 = 108;
        }
        if (!arg1.field3618 && (!class357.method2363(-125, arg5) || !class357.method2363(-55, arg6))) {
            return arg1.field3549 ? new class508(arg1, 34037, arg2, arg5, arg6, arg0, arg4, arg3) : new class508(arg1, arg2, arg5, arg6, class123.method774(-95, arg5), class123.method774(112, arg6), arg4, arg3);
        } else {
            return new class508(arg1, 3553, arg2, arg5, arg6, arg0, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZ)I")
    public final int method3057(int arg0, boolean arg1) {
        field7528++;
        if (arg1) {
            field7525 = null;
        }
        int var3 = (this.field7524.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field7524[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field7524[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }
}
