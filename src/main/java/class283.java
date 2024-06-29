import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class283 extends Exception {

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)Lcfa;", line = 9)
    public static final class180 method1843(int arg0, byte arg1) {
        field4082++;
        return arg1 > -48 ? null : new class180(arg0, false);
    }
}
