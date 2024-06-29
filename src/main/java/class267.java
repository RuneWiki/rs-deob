import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public abstract class class267 {

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "Lkg;")
    public static class275 field3362 = new class275(74, -1);

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "I")
    public static int field3363 = class423.method2356(1600, 1);

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "Lhg;")
    public static class693 field3364 = new class693(25, 3);

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "Lnd;")
    public static class547 field3366;

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "[I")
    public static int[] field3365;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)V")
    public static void method1592(byte arg0) {
        field3362 = null;
        field3366 = null;
        field3364 = null;
        if (arg0 == -108) {
            field3365 = null;
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(III)Z")
    public static final boolean method1593(int arg0, int arg1, int arg2) {
        if (arg0 != -20700) {
            field3365 = null;
        }
        field3361++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        class543 var3 = client.field3995.method3384(arg1, false);
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method3124(arg2, (byte) 67);
    }
}
