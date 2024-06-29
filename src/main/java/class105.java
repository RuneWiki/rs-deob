import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public abstract class class105 {

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1609 = "wave2:";

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)I")
    public abstract int method501(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public abstract void method500(int arg0);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILfl;)Lrb;")
    public static final class275 method664(int arg0, class248 arg1) {
        if (arg0 != -30385) {
            field1609 = null;
        }
        field1608++;
        return new class275(arg1.method1606((byte) 77), arg1.method1606((byte) 77), arg1.method1606((byte) 77), arg1.method1606((byte) 77), arg1.method1606((byte) 77), arg1.method1606((byte) 77), arg1.method1606((byte) 77), arg1.method1606((byte) 77), arg1.method1587(-123), arg1.method1593((byte) 27));
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)J")
    public abstract long method499(int arg0);

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V")
    public static void method665(int arg0) {
        if (arg0 < 75) {
            method664(-69, (class248) null);
        }
        field1609 = null;
    }
}
