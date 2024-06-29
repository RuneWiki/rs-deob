import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class547 {

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "[I")
    public static int[] field7409 = new int[] { 4, 4, 1, 2, 6, 4, 2, 45, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0 };

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lcc;I)Z", line = 3)
    public static final boolean method3006(class670 arg0, int arg1) {
        if (arg1 != 1) {
            field7412 = -110;
        }
        field7408++;
        return class292.field4392 == arg0 || class23.field315 == arg0 || class128.field1770 == arg0 || class517.field7069 == arg0;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(ILjava/lang/Object;BI)[B", line = 17)
    public static final byte[] method3007(int arg0, Object arg1, byte arg2, int arg3) {
        field7410++;
        if (arg1 == null) {
            return null;
        }
        int var4 = -120 % ((79 - arg2) / 45);
        if (arg1 instanceof byte[]) {
            byte[] var5 = (byte[]) arg1;
            return class17.method91(false, arg3, arg0, var5);
        } else if (arg1 instanceof class317) {
            class317 var6 = (class317) arg1;
            return var6.method1939(arg3, 22300, arg0);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lpj;I)I", line = 52)
    public static final int method3008(class132 arg0, int arg1) {
        field7411++;
        int var2 = 0;
        if (arg0.method947(114, class473.field6606)) {
            var2++;
        }
        if (arg0.method947(arg1 - 23, class130.field1781)) {
            var2++;
        }
        if (arg0.method947(-52, class77.field1067)) {
            var2++;
        }
        if (arg0.method947(124, class219.field3182)) {
            var2++;
        }
        if (arg0.method947(120, class399.field5547)) {
            var2++;
        }
        if (arg0.method947(arg1 ^ 0xFFFFFFC6, class71.field979)) {
            var2++;
        }
        if (arg0.method947(-96, class387.field5432)) {
            var2++;
        }
        if (arg0.method947(-53, class572.field7711)) {
            var2++;
        }
        if (arg0.method947(arg1 - 46, class30.field364)) {
            var2++;
        }
        if (arg0.method947(arg1 ^ 0x74, class32.field383)) {
            var2++;
        }
        if (arg0.method947(-115, class583.field8127)) {
            var2++;
        }
        if (arg0.method947(-94, class16.field235)) {
            var2++;
        }
        if (arg0.method947(arg1 ^ 0x75, class138.field1941)) {
            var2++;
        }
        if (arg0.method947(-82, class428.field6015)) {
            var2++;
        }
        if (arg0.method947(117, class258.field3698)) {
            var2++;
        }
        if (arg0.method947(-75, class615.field8523)) {
            var2++;
        }
        if (arg1 != 2) {
            field7412 = -69;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V", line = 129)
    public static void method3009(int arg0) {
        if (arg0 == 2) {
            field7409 = null;
        }
    }
}
