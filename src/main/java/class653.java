import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class class653 {

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "I")
    public int field8739 = 0;

    @OriginalMember(owner = "client!aja", name = "c", descriptor = "[Lg;")
    public static class596[] field8740 = new class596[8];

    @OriginalMember(owner = "client!aja", name = "f", descriptor = "I")
    public static int field8743 = -1;

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "I")
    public static int field8738;

    @OriginalMember(owner = "client!aja", name = "d", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!aja", name = "e", descriptor = "I")
    public static int field8742;

    @OriginalMember(owner = "client!aja", name = "g", descriptor = "I")
    public static int field8744;

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(ZBI)V")
    public static final void method3649(boolean arg0, byte arg1, int arg2) {
        field8742++;
        class169 var3 = class170.method1090(arg0, (byte) -94, arg2);
        if (var3 == null) {
            return;
        }
        int var4 = 111 % ((25 - arg1) / 43);
        for (int var5 = 0; var5 < var3.field2352.length; var5++) {
            var3.field2352[var5] = -1;
            var3.field2355[var5] = 0;
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(IIII[BII)Z")
    public static final boolean method3650(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        field8738++;
        int var7 = arg6 % arg1;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg1 - var7;
        }
        int var9 = -((arg5 + arg1 + arg0) / arg1);
        int var10 = -((arg6 + arg1 - 1) / arg1);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg4[arg3] == 0) {
                    return true;
                }
                arg3 += arg1;
            }
            int var13 = arg3 - var8;
            if (arg4[var13 - 1] == 0) {
                return true;
            }
            arg3 = arg2 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(Ldc;IB)V")
    private final void method3651(class63 arg0, int arg1, byte arg2) {
        if (arg2 != -46) {
            method3650(-51, -12, 23, -70, null, 33, -52);
        }
        if (arg1 == 5) {
            this.field8739 = arg0.method482(-772591672);
        }
        field8744++;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(ILdc;)V")
    public final void method3652(int arg0, class63 arg1) {
        while (true) {
            int var3 = arg1.method505((byte) -119);
            if (var3 == 0) {
                field8741++;
                if (arg0 != -1) {
                    field8743 = 68;
                    return;
                }
                return;
            }
            this.method3651(arg1, var3, (byte) -46);
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(B)V")
    public static void method3653(byte arg0) {
        int var1 = -117 / (arg0 / 57);
        field8740 = null;
    }
}
