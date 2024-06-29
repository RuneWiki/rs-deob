import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class385 {

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
    public static int field5425 = 104;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "Lik;")
    public static class410 field5421 = new class410(64);

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "I")
    public static int field5431 = 0;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "[I")
    public static int[] field5428 = new int[5];

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public int field5424;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "I")
    public int field5426;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
    public int field5427;

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
    public int field5430;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "Z")
    public static boolean field5429;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V", line = 5)
    public static void method2388(int arg0) {
        int var1 = -53 / ((-arg0 - 19) / 55);
        field5421 = null;
        field5428 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(III)V", line = 15)
    public static final void method2389(int arg0, int arg1, int arg2) {
        field5423++;
        if (class15.method76(6, arg2)) {
            if (arg1 != -22715) {
                method2390(5, 20);
            }
            class336.method2131(arg0, class291.field3949[arg2], arg1 ^ 0x58A3);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)I", line = 32)
    public static final int method2390(int arg0, int arg1) {
        field5420++;
        int var2 = 56 % ((-arg0 - 38) / 58);
        return arg1 >>> 8;
    }
}
