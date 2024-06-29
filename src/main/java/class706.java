import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class706 {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field9923;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field9924;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V", line = 4)
    public static final void method4010(int arg0, int arg1) {
        if (arg1 != 18281) {
            method4010(-27, -102);
        }
        field9924++;
        class714 var2 = class350.method2072((long) arg0, 3, (byte) 107);
        var2.method4044((byte) -128);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZZ)Z", line = 20)
    public static boolean method4011(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }
}
