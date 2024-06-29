import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class475 extends class45 {

    @OriginalMember(owner = "client!lt", name = "H", descriptor = "Lmq;")
    public static class350 field7100 = null;

    @OriginalMember(owner = "client!lt", name = "I", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!lt", name = "J", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!lt", name = "K", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!lt", name = "L", descriptor = "I")
    public static int field7104;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method35(int arg0, int arg1) {
        field7103++;
        return arg0 == 0 ? class69.field1199 : null;
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "()V", line = 21)
    public class475() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IZB)Lnm;", line = 27)
    public static final class328 method2847(int arg0, boolean arg1, byte arg2) {
        field7101++;
        long var3 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
        int var5 = 31 % ((65 - arg2) / 47);
        return (class328) class109.field1831.method171((byte) -109, var3);
    }

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "(I)V", line = 40)
    public static void method2848(int arg0) {
        field7100 = null;
        if (arg0 != -4245) {
            method2848(26);
        }
    }
}
