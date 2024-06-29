import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class303 extends class354 {

    @OriginalMember(owner = "client!w", name = "j", descriptor = "[F")
    public static float[] field3964 = new float[16384];

    @OriginalMember(owner = "client!w", name = "l", descriptor = "[F")
    public static float[] field3966 = new float[16384];

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field3970;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field3966[var2] = (float) Math.sin((double) var2 * var0);
            field3964[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLvea;)V", line = 4)
    public static final void method1805(byte arg0, class277 arg1) {
        ++field3969;
        if (arg1 != null) {
            class343.field4334.method3671(arg1, false);
            ++class159.field2181;
            Object var2 = null;
            class184 var5;
            if (!arg1.field3470 && !"".equals(arg1.field3475)) {
                long var3 = arg1.field3472;
                for (var5 = (class184) class543.field7569.method1160(var3, 119); var5 != null && !var5.field2552.equals(arg1.field3475); var5 = (class184) class543.field7569.method1162(122)) {
                }
                if (var5 == null) {
                    var5 = (class184) class263.field3317.method3079(var3, 0);
                    if (var5 != null && !var5.field2552.equals(arg1.field3475)) {
                        var5 = null;
                    }
                    if (var5 == null) {
                        var5 = new class184(arg1.field3475);
                    }
                    class543.field7569.method1153(var5, var3, -1);
                    ++class512.field7203;
                }
            } else {
                var5 = new class184(arg1.field3475);
                ++class512.field7203;
            }
            if (var5.method1243(arg1, 123)) {
                class669.method3760(var5, -23719);
            }
            int var6 = -100 % ((arg0 - 6) / 39);
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)I", line = 61)
    public final int method1806(byte arg0) {
        int var2 = -25 / ((arg0 - 7) / 45);
        ++field3967;
        return super.field4545;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(II)V", line = 72)
    public final void method389(int arg0, int arg1) {
        ++field3968;
        super.field4545 = arg1;
        if (arg0 != -1) {
            field3964 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 84)
    public final void method388(int arg0) {
        super.field4545 = this.method393((byte) -61);
        if (arg0 == 6384) {
            ++field3963;
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ILwo;)V", line = 98)
    public class303(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(II)Z", line = 101)
    public static final boolean method1807(int arg0, int arg1) {
        ++field3962;
        if (arg0 != 13904) {
            return false;
        } else {
            return ~arg1 == -4 || arg1 == 4;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)I", line = 114)
    public final int method391(int arg0, int arg1) {
        if (arg0 != 3) {
            field3966 = null;
        }
        ++field3965;
        return 3;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V", line = 125)
    public static void method1808(boolean arg0) {
        field3966 = null;
        if (!arg0) {
            method1805((byte) 98, (class277) null);
        }
        field3964 = null;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lwo;)V", line = 140)
    public class303(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)I", line = 149)
    public final int method393(byte arg0) {
        int var2 = -83 % ((37 - arg0) / 63);
        ++field3970;
        return super.field4544.method4153(-9) == class211.field2791 && super.field4544.method4149((byte) 33) ? 0 : 1;
    }
}
