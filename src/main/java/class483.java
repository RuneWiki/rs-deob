import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class483 {

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field7084 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Lvp;")
    public static class123 field7083 = new class123(49, 1);

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "Lvp;")
    public static class123 field7086 = new class123(4, 16);

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "([Ljava/lang/Object;IZI[J)V")
    public static final void method2886(Object[] arg0, int arg1, boolean arg2, int arg3, long[] arg4) {
        if (arg2) {
            field7084 = null;
        }
        field7085++;
        if (arg3 <= arg1) {
            return;
        }
        int var5 = (arg1 + arg3) / 2;
        int var6 = arg1;
        long var7 = arg4[var5];
        arg4[var5] = arg4[arg3];
        arg4[arg3] = var7;
        Object var9 = arg0[var5];
        arg0[var5] = arg0[arg3];
        arg0[arg3] = var9;
        int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
        for (int var11 = arg1; var11 < arg3; var11++) {
            if (arg4[var11] < ((long) (var10 & var11) + var7)) {
                long var12 = arg4[var11];
                arg4[var11] = arg4[var6];
                arg4[var6] = var12;
                Object var14 = arg0[var11];
                arg0[var11] = arg0[var6];
                arg0[var6++] = var14;
            }
        }
        arg4[arg3] = arg4[var6];
        arg4[var6] = var7;
        arg0[arg3] = arg0[var6];
        arg0[var6] = var9;
        method2886(arg0, arg1, false, var6 - 1, arg4);
        method2886(arg0, var6 + 1, false, arg3, arg4);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
    public static void method2887(int arg0) {
        if (arg0 >= -85) {
            field7083 = null;
        }
        field7084 = null;
        field7086 = null;
        field7083 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)La;")
    public static final class434 method2888(int arg0, int arg1, int arg2) {
        field7081++;
        class434 var3 = (class434) class122.field1907.method2485(84, (long) arg2 << 32 | (long) arg0);
        int var4 = -25 % ((-arg1 - 31) / 63);
        if (var3 == null) {
            var3 = new class434(arg2, arg0);
            class122.field1907.method2486(97, var3, var3.field6399);
        }
        return var3;
    }
}
