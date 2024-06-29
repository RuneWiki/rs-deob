import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class596 {

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field8443 = 0;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    public static int field8445 = 1;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "[I")
    public static int[] field8447 = new int[1];

    @OriginalMember(owner = "client!et", name = "a", descriptor = "Z")
    public static boolean field8442 = false;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "I")
    public static int field8444;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "Lvd;")
    public static class39 field8446;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V", line = 10)
    public static void method3471(int arg0) {
        field8446 = null;
        int var1 = 8 % ((arg0 + 23) / 60);
        field8447 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V", line = 20)
    public static final void method3472(byte arg0) {
        field8444++;
        if (class396.field5945 == class206.field3043) {
            return;
        }
        try {
            class121.method877(class236.field3433, "tbrefresh", -22421);
            if (arg0 != -127) {
                field8445 = 82;
            }
        } catch (Throwable var1) {
        }
    }
}
