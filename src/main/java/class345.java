import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class345 {

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Z")
    public static boolean field4944 = false;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "[S")
    public static short[] field4943 = new short[256];

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Lkea;")
    public static class203 field4942;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Lkea;")
    public static class203 field4945;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 13)
    public static void method2215(int arg0) {
        field4943 = null;
        field4945 = null;
        if (arg0 <= 22) {
            method2215(-57);
        }
        field4942 = null;
    }
}
