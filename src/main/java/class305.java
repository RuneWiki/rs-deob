import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class305 {

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public int field4300;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public int field4301;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public int field4303;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public int field4304;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "[J")
    public static long[] field4302;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V", line = 9)
    public static void method1977(byte arg0) {
        if (arg0 > -80) {
            field4302 = null;
        }
        field4302 = null;
    }
}
