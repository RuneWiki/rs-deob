import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class712 extends class189 {

    @OriginalMember(owner = "client!lu", name = "q", descriptor = "I")
    public int field9904;

    @OriginalMember(owner = "client!lu", name = "s", descriptor = "I")
    public int field9906;

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "I")
    public int field9899;

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
    public int field9903;

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
    public int field9901;

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "Z")
    public boolean field9897;

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "I")
    public static int field9900;

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "I")
    public static int field9902;

    @OriginalMember(owner = "client!lu", name = "r", descriptor = "Lbia;")
    public static class498 field9905;

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "[Loia;")
    public static class88[] field9898;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IBIIIIIIII)V", line = 5)
    public static final void method4006(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field9902++;
        if (arg6 < 512 || arg9 < 512 || (class336.field4683 * 512 - 1024) < arg6 || arg9 > ((class700.field9768 - 2) * 512)) {
            class278.field3936[0] = class278.field3936[1] = -1;
            return;
        }
        int var10 = class469.method2798(97, arg9, arg2, arg6) - arg0;
        if (class589.field8295) {
            class254.method1684(2, true);
        } else {
            class631.field8724.method360(arg7, 0, 0);
            class268.field3831.method483(class631.field8724);
        }
        if (class180.field2409) {
            class268.field3831.method480(arg6, var10, arg9, class516.field7361, class278.field3936);
        } else {
            class268.field3831.method423(arg6, var10, arg9, class278.field3936);
        }
        if (class589.field8295) {
            class25.method159((byte) 94);
        } else {
            class631.field8724.method360(-arg7, 0, 0);
            class268.field3831.method483(class631.field8724);
        }
        if (arg1 != -59) {
            method4006(31, (byte) 6, 27, -6, 23, -21, -93, 67, -49, 0);
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)V", line = 45)
    public static void method4007(byte arg0) {
        field9898 = null;
        if (arg0 <= 79) {
            field9900 = 66;
        }
        field9905 = null;
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(IIIIIZ)V", line = 64)
    public class712(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field9904 = arg0;
        this.field9906 = arg4;
        this.field9899 = arg2;
        this.field9903 = arg3;
        this.field9901 = arg1;
        this.field9897 = arg5;
    }
}
