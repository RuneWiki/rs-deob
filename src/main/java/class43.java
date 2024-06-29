import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class43 {

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "Z")
    public static boolean field646 = false;

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!kaa", name = "e", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZLpj;I)Lmj;", line = 3)
    public static final class599 method241(boolean arg0, class132 arg1, int arg2) {
        field649++;
        if (arg0) {
            byte[] var3 = arg1.method938(arg2, (byte) -53);
            return var3 == null ? null : new class599(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(II)Z", line = 30)
    public static final boolean method242(int arg0, int arg1) {
        field648++;
        if (arg1 == -1) {
            return arg0 == 0 || arg0 == 2 || arg0 == 4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZZ)V", line = 44)
    public static final void method243(boolean arg0, boolean arg1) {
        field647++;
        if (class591.field8240.length() == 0) {
            return;
        }
        class434.method2495((byte) 27, "--> " + class591.field8240);
        class693.method3806(arg0, class591.field8240, arg1, 4);
        class584.field8138 = 0;
        class538.field7304 = 0;
        class591.field8240 = "";
    }
}
