import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public abstract class class104 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "S")
    public static short field2008 = 320;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)I")
    public abstract int method841(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public abstract void method842(int arg0);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lpg;I)Lcc;")
    public static final class19 method843(class81 arg0, int arg1) {
        if (arg1 != -24011) {
            method843((class81) null, -125);
        }
        field2011++;
        return new class19(arg0.method647(true), arg0.method647(true), arg0.method647(true), arg0.method647(true), arg0.method647(true), arg0.method647(true), arg0.method647(true), arg0.method647(true), arg0.method615(-114), arg0.method622(true));
    }
}
