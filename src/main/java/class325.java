import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class325 {

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Z")
    public boolean field5060 = true;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public int field5059;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public int field5054;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public int field5050;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public int field5055;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public int field5053;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public int field5052;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "[I")
    public static int[] field5049 = new int[32768];

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Z")
    public static boolean field5056 = true;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(CI)Z", line = 4)
    public static final boolean method2204(char arg0, int arg1) {
        field5061++;
        if (arg1 == 7370) {
            return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILl;)V", line = 16)
    public static final void method2205(int arg0, class133 arg1) {
        field5051++;
        class195.field2918 = arg1;
        if (arg0 != -123) {
            method2204((char) 65438, 124);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 27)
    public static void method2206(byte arg0) {
        if (arg0 != 93) {
            field5049 = (int[]) null;
        }
        field5049 = null;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(IIIIIIZ)V", line = 55)
    public class325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field5059 = arg3;
        this.field5054 = arg1;
        this.field5050 = arg0;
        this.field5060 = arg6;
        this.field5055 = arg4;
        this.field5053 = arg2;
        this.field5052 = arg5;
    }
}
