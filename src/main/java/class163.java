import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class163 {

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Ljp;B)Lqda;", line = 4)
    public static final class112 method1184(class376 arg0, byte arg1) {
        if (arg1 != 102) {
            method1184(null, (byte) -46);
        }
        field2213++;
        return new class112(arg0.method2355(3), arg0.method2355(arg1 - 99), arg0.method2355(3), arg0.method2355(3), arg0.method2355(3), arg0.method2355(3), arg0.method2355(3), arg0.method2355(3), arg0.method2373(arg1 ^ 0x48E980BE), arg0.method2398(-1372747256));
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(JJ)J", line = 17)
    public static long method1185(long arg0, long arg1) {
        return arg0 & arg1;
    }
}
