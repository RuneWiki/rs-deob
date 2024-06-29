import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class533 extends class567 {

    @OriginalMember(owner = "client!cda", name = "q", descriptor = "I")
    public int field7845;

    @OriginalMember(owner = "client!cda", name = "n", descriptor = "I")
    public int field7842;

    @OriginalMember(owner = "client!cda", name = "m", descriptor = "I")
    public static int field7841;

    @OriginalMember(owner = "client!cda", name = "o", descriptor = "I")
    public static int field7843;

    @OriginalMember(owner = "client!cda", name = "r", descriptor = "I")
    public static int field7846;

    @OriginalMember(owner = "client!cda", name = "s", descriptor = "I")
    public static int field7847;

    @OriginalMember(owner = "client!cda", name = "p", descriptor = "Lso;")
    public static class99 field7844;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)Lkq;", line = 5)
    public final class696 method726(int arg0) {
        if (arg0 != -17) {
            field7844 = null;
        }
        field7841++;
        return class37.field491;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 16)
    public static final void method3129(int arg0, String arg1, int arg2) {
        field7846++;
        class124.field2048++;
        class699 var3 = class452.method2630(class699.field9897, class288.field4047, (byte) 124);
        var3.field9908.method2753((byte) 100, class252.method1609(0, arg1) + arg2);
        var3.field9908.method2752((byte) -1, arg0);
        var3.field9908.method2703(false, arg1);
        class149.method1134(var3, true);
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)V", line = 31)
    public static final void method3130(byte arg0) {
        class105.field1743 = class246.field3584.field7041 + class246.field3584.field7038 + 2;
        if (arg0 >= -112) {
            method3132(null, true);
        }
        class679.field9668 = new String[500];
        class397.field5751 = class399.field5763.field7041 + class399.field5763.field7038 + 2;
        field7843++;
        for (int var1 = 0; var1 < class679.field9668.length; var1++) {
            class679.field9668[var1] = "";
        }
        class28.method269(32316, class343.field4750.method2059(class238.field3511, true));
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(B)V", line = 52)
    public static void method3131(byte arg0) {
        if (arg0 != -77) {
            method3130((byte) 16);
        }
        field7844 = null;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lod;Z)V", line = 64)
    public static final void method3132(class673 arg0, boolean arg1) {
        if (arg1) {
            field7844 = null;
        }
        field7847++;
        if (!class324.field4519) {
            arg0.method2549((byte) -52);
            class400.field5784--;
        }
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Lvn;Lmf;IIIIIIIII)V", line = 87)
    public class533(class186 arg0, class409 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field7845 = arg10;
        this.field7842 = arg9;
    }
}
