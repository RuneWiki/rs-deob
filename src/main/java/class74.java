import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class74 {

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "I")
    public static int field829 = 0;

    @OriginalMember(owner = "client!ifa", name = "f", descriptor = "B")
    public byte field831;

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "I")
    public int field830;

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "Ljava/lang/String;")
    public String field828;

    @OriginalMember(owner = "client!ifa", name = "g", descriptor = "[Lho;")
    public static class318[] field832;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field826;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)V", line = 16)
    public static void method549(int arg0) {
        field832 = null;
        if (arg0 != 0) {
            method549(-36);
        }
        field826 = null;
    }
}
