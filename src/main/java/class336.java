import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class336 implements class582 {

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "Lpl;")
    private class595 field4902;

    @OriginalMember(owner = "client!bfa", name = "e", descriptor = "I")
    public static int field4906 = -1;

    @OriginalMember(owner = "client!bfa", name = "f", descriptor = "I")
    public static int field4907 = 0;

    @OriginalMember(owner = "client!bfa", name = "g", descriptor = "I")
    public static int field4908 = 0;

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!bfa", name = "h", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!bfa", name = "i", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!bfa", name = "j", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V", line = 4)
    public final void method108(int arg0) {
        field4911++;
        int var2 = 48 / ((arg0 - 41) / 54);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(BIIIII)V", line = 14)
    public static final void method2025(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4905++;
        int var9 = arg4 + 1;
        class548.method3012(arg5, (byte) 23, arg1, arg3, class476.field6655[arg4]);
        if (arg0 != 61) {
            field4908 = 7;
        }
        int var8 = arg2 - 1;
        class548.method3012(arg5, (byte) 23, arg1, arg3, class476.field6655[arg2]);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class476.field6655[var6];
            var7[arg3] = var7[arg5] = arg1;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)Z", line = 38)
    public final boolean method104(byte arg0) {
        field4904++;
        if (arg0 <= 18) {
            this.method109(104, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(I)V", line = 50)
    public static final void method2026(int arg0) {
        if (arg0 == 100) {
            for (int var1 = 0; var1 < 100; var1++) {
                class287.field3996[var1] = true;
            }
            field4910++;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "(I)Lbg;", line = 71)
    public static final class427 method2027(int arg0) {
        field4903++;
        if (arg0 != 0) {
            method2026(99);
        }
        try {
            return new class393();
        } catch (Throwable var2) {
            try {
                return (class427) Class.forName("uh").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class554();
            }
        }
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Lpl;)V", line = 96)
    public class336(class595 arg0) {
        this.field4902 = arg0;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IZ)V", line = 114)
    public final void method109(int arg0, boolean arg1) {
        if (arg1) {
            class630.field8790.method472(0, 0, class547.field7412, class124.field1711, this.field4902.field8272, 0);
        }
        if (arg0 == 8444) {
            field4909++;
        }
    }
}
