import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class560 {

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
    public int field7995 = -1;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "Lof;")
    public static class620 field7991 = new class620(4);

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "Ldh;")
    public static class320 field7993 = new class320(9, -2);

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "F")
    public static float field7997;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
    public static int field7996;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "I")
    public static int field7998;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "Lvga;")
    public class85 field7992;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "[I")
    public int[] field7990;

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "[J")
    public static long[] field7994;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "[Ljava/lang/String;")
    public String[] field7999;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)Z")
    public static final boolean method3273(int arg0, int arg1) {
        if (arg0 != -3469) {
            field7991 = null;
        }
        field7998++;
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method3274(int arg0, String arg1) {
        field7996++;
        System.exit(arg0);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
    public static void method3275(int arg0) {
        field7993 = null;
        field7994 = null;
        field7991 = null;
        if (arg0 <= 11) {
            method3274(-58, null);
        }
    }
}
