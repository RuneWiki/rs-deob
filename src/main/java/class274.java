import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class274 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "Lsf;")
    public static class124 field4463 = new class124(64);

    @OriginalMember(owner = "client!f", name = "b", descriptor = "J")
    public static long field4464 = 0L;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "[S")
    public static short[] field4471 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field4472 = 0;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "Z")
    public static boolean field4473 = false;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Lek;")
    public static class206 field4467;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Ljava/awt/Frame;")
    public static Frame field4469;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Z")
    public static boolean field4470;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)V", line = 15)
    public static final void method1949(int arg0, boolean arg1) {
        if (arg1) {
            class199 var2 = class173.method1231(false, 9, arg0);
            var2.method1358(-1);
            field4468++;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 27)
    public static void method1950(byte arg0) {
        field4471 = null;
        field4467 = null;
        if (arg0 > -38) {
            field4465 = -31;
        }
        field4469 = null;
        field4463 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IBLek;)Lsc;", line = 57)
    public static final class288 method1951(int arg0, byte arg1, class206 arg2) {
        if (arg1 == 60) {
            field4466++;
            return class207.method1434(arg2, (byte) 88, arg0) ? class133.method941(true) : null;
        } else {
            return (class288) null;
        }
    }
}
