import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class364 {

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public static int field5008 = 64;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "I")
    public static int field5010 = 0;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "I")
    public static int field5011 = 0;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field5005 = 503;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "Lnl;")
    public static class435 field5006;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "Lpg;")
    public static class454 field5009;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
    public static void method2238(byte arg0) {
        field5006 = null;
        field5009 = null;
        if (arg0 != 120) {
            method2238((byte) -20);
        }
    }
}
