import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class777 extends RuntimeException {

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field10680;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Ljava/lang/String;")
    public String field10678;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "[I")
    public static int[] field10675 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "Led;")
    public static class732 field10681 = new class732(10, 2, 2, 0);

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "F")
    public static float field10682;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field10676;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field10677;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field10679;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "[I")
    public static int[] field10683;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 11)
    public static void method4270(int arg0) {
        field10675 = null;
        field10681 = null;
        field10683 = null;
        if (arg0 > -74) {
            method4270(-70);
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 24)
    public class777(Throwable arg0, String arg1) {
        this.field10680 = arg0;
        this.field10678 = arg1;
    }
}
