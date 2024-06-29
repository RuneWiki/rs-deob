import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class345 extends class440 {

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "[I")
    public static int[] field5037 = new int[8];

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "Lgi;")
    public static class630 field5035;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIILpu;ZI)V")
    public static final void method2142(int arg0, int arg1, int arg2, class522 arg3, boolean arg4, int arg5) {
        field5038++;
        class325.method2042(arg1, (byte) -82, arg3, arg0, arg4, (long) arg2, arg5);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BI)[I")
    public final int[] method229(byte arg0, int arg1) {
        field5036++;
        int var3 = -112 % ((-arg0 - 56) / 41);
        return class499.field7073;
    }

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "(I)V")
    public static void method2143(int arg0) {
        field5035 = null;
        field5037 = null;
        if (arg0 >= -122) {
            method2144((byte) -5);
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
    public static final void method2144(byte arg0) {
        field5039++;
        class512.field7202.method132(((float) class287.field4270.field3725 * 0.1F + 0.7F) * 1.1523438F);
        class512.field7202.method185(class114.field1748, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class512.field7202.method122(class571.field8044, -1, 0);
        class512.field7202.method116(class53.field1050);
        if (arg0 != -110) {
            method2144((byte) 25);
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
    public class345() {
        super(0, true);
    }
}
