import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class478 extends class739 {

    @OriginalMember(owner = "client!ap", name = "x", descriptor = "I")
    public int field6932;

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
    public int field6926;

    @OriginalMember(owner = "client!ap", name = "C", descriptor = "I")
    public int field6937;

    @OriginalMember(owner = "client!ap", name = "y", descriptor = "I")
    public int field6933;

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "I")
    public int field6928;

    @OriginalMember(owner = "client!ap", name = "D", descriptor = "I")
    public int field6938;

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "Lada;")
    public static class164 field6929 = new class164();

    @OriginalMember(owner = "client!ap", name = "A", descriptor = "Lpd;")
    public static class259 field6935 = new class259(1);

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!ap", name = "w", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!ap", name = "B", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)V", line = 3)
    public static final void method2880(int arg0, int arg1) {
        client.field4272 = arg1;
        class190.field2880 = -1;
        field6934++;
        class190.field2880 = arg0;
        class547.method3199(true);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V", line = 17)
    public static void method2881(boolean arg0) {
        field6935 = null;
        field6929 = null;
        if (!arg0) {
            field6929 = null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Log;Lega;IIIIIIIIIIIII)V", line = 37)
    public class478(class651 arg0, class713 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field6932 = arg10;
        this.field6926 = arg14;
        this.field6937 = arg11;
        this.field6933 = arg12;
        this.field6928 = arg13;
        this.field6938 = arg9;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)[Lega;", line = 50)
    public static final class713[] method2882(int arg0) {
        field6927++;
        int var1 = -40 / ((-arg0 - 20) / 57);
        return new class713[] { class473.field6886, class241.field3508, class751.field10504 };
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)Lio;", line = 69)
    public class439 method69(byte arg0) {
        int var2 = 117 / ((-arg0 - 69) / 39);
        field6930++;
        return class76.field1065;
    }
}
