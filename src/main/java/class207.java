import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class207 extends class237 {

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "Ljava/lang/String;")
    public String field3312;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public static int field3310 = 0;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3307 = "Created gameworld";

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "Ljava/lang/String;")
    public static String field3316 = "Use";

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3314 = "Started 3d Library";

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field3317 = 0;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "Leh;")
    public static class137 field3313;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "Z")
    public static boolean field3311;

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class207() {
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)V")
    public static void method1456(int arg0) {
        field3313 = null;
        field3316 = null;
        field3314 = null;
        field3307 = null;
        if (arg0 != 0) {
            field3311 = false;
        }
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)V")
    public static final void method1457(int arg0) {
        class57.field730.method1699(0);
        if (arg0 < 47) {
            method1457(86);
        }
        field3308++;
        class275.field4400.method1699(0);
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class207(String arg0) {
        this.field3312 = arg0;
    }
}
