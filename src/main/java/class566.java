import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class566 extends class517 {

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public int field7946;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public static int field7947 = 0;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public static int field7948;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    public static int field7949;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public static int field7950;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)Lhm;", line = 3)
    public final class223 method29(int arg0) {
        if (arg0 != -200) {
            field7947 = -72;
        }
        field7948++;
        return class479.field6521;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 18)
    public static final boolean method3255(byte arg0, String arg1) {
        if (arg0 >= -36) {
            field7947 = 18;
        }
        field7950++;
        return class593.field8293.containsKey(arg1);
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)V", line = 38)
    public static final void method3256(int arg0) {
        if (class484.field6945 == null) {
            class689 var1 = new class689();
            byte[] var2 = var1.method3869(128, 16, 128, -59072692);
            class484.field6945 = class431.method2466(-111, false, var2);
        }
        field7949++;
        if (class542.field7496 == null) {
            class211 var3 = new class211();
            byte[] var4 = var3.method1359(128, 16, 128, 102);
            class542.field7496 = class431.method2466(-104, false, var4);
        }
        if (arg0 != 128) {
            field7947 = 33;
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(ILeha;Loea;III)V", line = 68)
    public class566(int arg0, class91 arg1, class599 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field7946 = arg5;
    }
}
