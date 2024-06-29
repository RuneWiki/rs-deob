import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class287 {

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "Z")
    public static boolean field4637 = false;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "Z")
    public static boolean field4644 = false;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "[Lnj;")
    public static class215[] field4636;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static final void method1959(int arg0) {
        field4638++;
        class150.field2218.method445(134, 7);
        int var1 = 118 / ((26 - arg0) / 57);
        class71.field1055++;
        class150.field2218.method1160(-25643, 0L);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZB)V")
    public static final void method1960(boolean arg0, byte arg1) {
        class60.method383(class238.field3824, -124, class126.field1814, class112.field1626, arg0);
        field4640++;
        if (arg1 != 45) {
            field4641 = 30;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIII)V")
    public static final void method1961(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class254.field4142; var5++) {
            if (arg0 < class28.field342[var5] + class113.field1652[var5] && class28.field342[var5] < (arg0 + arg4) && arg3 < class52.field735[var5] + class16.field227[var5] && arg3 + arg2 > class52.field735[var5]) {
                class195.field3092[var5] = true;
            }
        }
        int var6 = -39 / ((arg1 - 23) / 36);
        field4642++;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public static final void method1962(byte arg0) {
        if (arg0 < 98) {
            field4637 = true;
        }
        class171.field2680.method1511((byte) 98);
        class311.field4991.method1511((byte) 127);
        field4643++;
        class15.field211.method1511((byte) 126);
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V")
    public static void method1963(int arg0) {
        field4636 = null;
        if (arg0 != -29200) {
            method1964(60, (String) null);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1964(int arg0, String arg1) {
        field4645++;
        int var2 = 0;
        if (arg0 < 33) {
            return 59;
        }
        while (class55.field794.length > var2) {
            if (class55.field794[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }
}
