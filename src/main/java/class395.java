import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class395 {

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "[S")
    public static short[] field5028 = new short[256];

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "Lpfa;")
    public static class275 field5030;

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "Lxa;")
    public static class468 field5029;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)V")
    public static void method2238(byte arg0) {
        field5029 = null;
        field5030 = null;
        if (arg0 == 107) {
            field5028 = null;
        }
    }
}
