import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public class class764 {

    @OriginalMember(owner = "client!eja", name = "f", descriptor = "I")
    public int field10561 = class611.method3379((byte) 33);

    @OriginalMember(owner = "client!eja", name = "l", descriptor = "Ljava/lang/String;")
    public String field10567;

    @OriginalMember(owner = "client!eja", name = "d", descriptor = "Ljava/lang/String;")
    public String field10559;

    @OriginalMember(owner = "client!eja", name = "o", descriptor = "I")
    public int field10570;

    @OriginalMember(owner = "client!eja", name = "h", descriptor = "I")
    public int field10563;

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "Ljava/lang/String;")
    public String field10556;

    @OriginalMember(owner = "client!eja", name = "i", descriptor = "I")
    public int field10564;

    @OriginalMember(owner = "client!eja", name = "j", descriptor = "Ljava/lang/String;")
    public String field10565;

    @OriginalMember(owner = "client!eja", name = "k", descriptor = "I")
    public int field10566;

    @OriginalMember(owner = "client!eja", name = "e", descriptor = "Ljava/lang/String;")
    public String field10560;

    @OriginalMember(owner = "client!eja", name = "g", descriptor = "Ljw;")
    public static class581 field10562 = new class581(31, -2);

    @OriginalMember(owner = "client!eja", name = "m", descriptor = "Lmga;")
    public static class739 field10568 = new class739(62, 7);

    @OriginalMember(owner = "client!eja", name = "b", descriptor = "I")
    public static int field10557;

    @OriginalMember(owner = "client!eja", name = "c", descriptor = "I")
    public static int field10558;

    @OriginalMember(owner = "client!eja", name = "n", descriptor = "Lcf;")
    public static class631 field10569;

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(I)V", line = 11)
    public static void method4243(int arg0) {
        field10569 = null;
        field10562 = null;
        if (arg0 != 31) {
            method4245(-4, -32);
        }
        field10568 = null;
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;BILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 31)
    public final void method4244(String arg0, int arg1, String arg2, byte arg3, int arg4, String arg5, String arg6, int arg7, String arg8) {
        field10558++;
        this.field10561 = class611.method3379((byte) 33);
        this.field10570 = arg1;
        this.field10564 = class100.field1401;
        if (arg3 >= -109) {
            field10568 = null;
        }
        this.field10559 = arg8;
        this.field10563 = arg7;
        this.field10556 = arg6;
        this.field10565 = arg2;
        this.field10566 = arg4;
        this.field10560 = arg0;
        this.field10567 = arg5;
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(II)V", line = 51)
    public static final void method4245(int arg0, int arg1) {
        field10557++;
        if (arg0 == 9339) {
            class239 var2 = class593.field8007;
            synchronized (class593.field8007) {
                class593.field8007.method1546(arg1, (byte) -8);
            }
        }
    }

    @OriginalMember(owner = "client!eja", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 68)
    public class764(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field10567 = arg3;
        this.field10559 = arg4;
        this.field10570 = arg0;
        this.field10563 = arg1;
        this.field10556 = arg2;
        this.field10564 = class100.field1401;
        this.field10565 = arg7;
        this.field10566 = arg6;
        this.field10560 = arg5;
    }
}
