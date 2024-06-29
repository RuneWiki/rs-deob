import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class319 {

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "Ljava/applet/Applet;")
    public static Applet field4527;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "Z")
    public static boolean field4529;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "[I")
    public static int[] field4526;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)V")
    public static final void method2062(int arg0, int arg1, int arg2) {
        field4530++;
        class313 var3 = class312.method1998((long) arg0, 5, -1);
        if (arg2 != 25382) {
            method2062(-46, 91, -1);
        }
        var3.method2001((byte) -31);
        var3.field4464 = arg1;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
    public static void method2063(byte arg0) {
        field4526 = null;
        field4527 = null;
        if (arg0 <= 96) {
            field4527 = null;
        }
    }
}
