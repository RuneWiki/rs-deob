import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class203 {

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "Lof;")
    public static class446 field2717 = new class446("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "Lhv;")
    public static class365 field2719;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "Lft;")
    public static class4 field2716;

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "[I")
    public static int[] field2718;

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "[[Z")
    public static boolean[][] field2720;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIIZIB)Z")
    public static final boolean method1373(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, byte arg8) {
        if (arg8 != 11) {
            method1376((byte) 59);
        }
        field2713++;
        int var9 = class56.field800.field3917[0];
        int var10 = class56.field800.field3915[0];
        if (var9 < 0 || var9 >= class398.field6071 || var10 < 0 || class528.field7734 <= var10) {
            return false;
        } else if (arg7 >= 0 && arg7 < class398.field6071 && arg1 >= 0 && arg1 < class528.field7734) {
            int var11 = class275.method1769(class166.field2252, arg5, var10, arg2, arg0, arg3, arg1, arg6, class56.field800.method637((byte) -113), arg7, class466.field6948, class9.field174[class56.field800.field1866], arg4, arg8 ^ 0x5F5E0F4, var9);
            if (var11 < 1) {
                return false;
            }
            class75.field1103 = class466.field6948[var11 - 1];
            class309.field4501 = class166.field2252[var11 - 1];
            class176.field2357 = false;
            class48.method374((byte) -76);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "([Ljava/lang/Object;I[J)V")
    public static final void method1374(Object[] arg0, int arg1, long[] arg2) {
        field2714++;
        class183.method1241(arg0, arg2.length - 1, arg1, true, arg2);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BC)Z")
    public static final boolean method1375(byte arg0, char arg1) {
        field2715++;
        if (arg0 <= 77) {
            field2719 = null;
        }
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V")
    public static void method1376(byte arg0) {
        field2719 = null;
        field2716 = null;
        if (arg0 <= 17) {
            method1375((byte) 17, (char) 65470);
        }
        field2717 = null;
        field2718 = null;
        field2720 = null;
    }
}
