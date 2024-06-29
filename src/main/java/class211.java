import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class211 implements class702 {

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public int field3057;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "I")
    public int field3059;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public int field3051;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "Lfda;")
    public class336 field3053;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "Laba;")
    public class185 field3050;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
    public int field3058;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "Z")
    public boolean field3056;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
    public int field3060;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
    public int field3054;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    public int field3055;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public int field3049;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "Lpa;")
    public static class387 field3052 = new class387(260);

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "I")
    public static int field3063 = 2;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)Lve;", line = 3)
    public final class527 method606(int arg0) {
        field3062++;
        return arg0 == 0 ? class468.field6683 : null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZZB)V", line = 23)
    public static final void method1486(boolean arg0, boolean arg1, byte arg2) {
        if (arg0) {
            class281.field4329++;
            class27.method204(0);
        }
        field3061++;
        int var3 = -32 % ((-arg2 - 74) / 50);
        if (arg1) {
            class11.field235++;
            class347.method2196(-117);
        }
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(ILfda;Laba;IIIIIIIZ)V", line = 53)
    public class211(int arg0, class336 arg1, class185 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field3057 = arg6;
        this.field3059 = arg5;
        this.field3051 = arg9;
        this.field3053 = arg1;
        this.field3050 = arg2;
        this.field3058 = arg3;
        this.field3056 = arg10;
        this.field3060 = arg0;
        this.field3054 = arg8;
        this.field3055 = arg4;
        this.field3049 = arg7;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V", line = 72)
    public static void method1487(byte arg0) {
        if (arg0 == -73) {
            field3052 = null;
        }
    }
}
