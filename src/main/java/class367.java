import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class367 extends class508 {

    @OriginalMember(owner = "client!te", name = "p", descriptor = "Z")
    public static boolean field4718 = false;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public int field4719;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public int field4721;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)Z")
    public static final boolean method2149(int arg0, int arg1, int arg2) {
        field4720++;
        int var3 = -76 / ((-arg2 - 6) / 39);
        return (arg0 & 0x70000) != 0 | class34.method223(arg0, 7350, arg1) || class71.method404(arg0, (byte) 109, arg1);
    }
}
