import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class218 extends class108 {

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public volatile int field3286 = -1;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "Ljava/lang/String;")
    public volatile String field3287;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "Liu;")
    public static class517 field3285 = new class517(41, 0);

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "[S")
    public static short[] field3289 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "Z")
    public static boolean field3290 = false;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "[I")
    public static int[] field3288;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static void method1468(byte arg0) {
        field3285 = null;
        field3288 = null;
        field3289 = null;
        if (arg0 != 106) {
            field3288 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class218(String arg0) {
        this.field3287 = arg0;
    }
}
