import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class360 {

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field5314 = 64;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "Lwn;")
    public static class177 field5312;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "[Lo;")
    public static class363[] field5315;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "[[[Lvt;")
    public static class281[][][] field5317;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
    public static void method2288(byte arg0) {
        field5315 = null;
        field5312 = null;
        field5317 = null;
        if (arg0 < 16) {
            field5312 = null;
        }
    }
}
