import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class288 extends class203 {

    @OriginalMember(owner = "client!uu", name = "s", descriptor = "I")
    public int field3830;

    @OriginalMember(owner = "client!uu", name = "t", descriptor = "I")
    public int field3831;

    @OriginalMember(owner = "client!uu", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3829 = null;

    @OriginalMember(owner = "client!uu", name = "p", descriptor = "Lea;")
    public static class547 field3827 = new class547(58, -1);

    @OriginalMember(owner = "client!uu", name = "q", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!uu", name = "u", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)V")
    public static void method1726(int arg0) {
        field3829 = null;
        field3827 = null;
        if (arg0 != 58) {
            method1726(108);
        }
    }

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "(I)J")
    public static final long method1727(int arg0) {
        if (arg0 != 58) {
            field3827 = null;
        }
        field3828++;
        return class414.field5854.method70((byte) 53);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)Lhda;")
    public final class750 method333(int arg0) {
        field3832++;
        if (arg0 != 30778) {
            field3827 = null;
        }
        return class208.field2506;
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lee;Lhaa;IIIIIIIII)V")
    public class288(class676 arg0, class82 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field3830 = arg10;
        this.field3831 = arg9;
    }
}
