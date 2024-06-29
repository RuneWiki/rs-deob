import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class287 extends class514 {

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "[I")
    public int[] field4229;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "[I")
    public int[] field4231;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "[I")
    public static int[] field4230 = new int[25];

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "J")
    public static long field4232 = 0L;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "Laj;")
    public static class333 field4233;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V", line = 12)
    public static void method1828(int arg0) {
        field4233 = null;
        field4230 = null;
        if (arg0 >= -7) {
            method1828(-19);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILdia;IIB)Lme;", line = 24)
    public static final class207 method1829(int arg0, class246 arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != 127) {
            field4233 = null;
        }
        field4228++;
        if (!arg1.field3609 && (!class117.method957(arg4 ^ 0xFFFFE649, arg3) || !class117.method957(-6602, arg2))) {
            return arg1.field3653 ? new class207(arg1, 34037, arg0, arg3, arg2) : new class207(arg1, arg0, arg3, arg2, class719.method4014(arg3, (byte) -100), class719.method4014(arg2, (byte) -100));
        } else {
            return new class207(arg1, 3553, arg0, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(II[I[I)V", line = 47)
    public class287(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field4229 = arg3;
        this.field4231 = arg2;
    }
}
