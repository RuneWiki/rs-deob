import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class255 {

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Z")
    public static boolean field4295 = false;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field4301 = 0;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field4296 = -1;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "Lnc;")
    public static class104 field4303;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Lsi;")
    public static class351 field4300;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "[S")
    public static short[] field4302;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 4)
    public static void method1966(int arg0) {
        if (arg0 != 0) {
            method1967(100);
        }
        field4300 = null;
        field4303 = null;
        field4302 = null;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V", line = 40)
    public static final void method1967(int arg0) {
        class61.field1027 = null;
        if (arg0 != -1) {
            field4296 = -82;
        }
        class231.field3839 = null;
        class216.field3465 = null;
        class190.field3043 = null;
        class118.field2002 = null;
        field4298++;
    }
}
