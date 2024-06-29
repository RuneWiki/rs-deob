import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class149 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field2349 = -1;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field2350 = 0;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field2356 = 0;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Lmh;")
    public static class62 field2354 = class201.method1405(true, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Lmh;")
    private static class62 field2357 = class201.method1405(true, "slide:");

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Lmh;")
    public static class62 field2355 = field2357;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lmh;")
    public static class62 field2358 = field2357;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Lmh;")
    public static class62 field2359 = class201.method1405(true, "mapfunction");

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)Z", line = 4)
    public static final boolean method1073(byte arg0) {
        field2352++;
        int var1 = -14 / ((arg0 + 20) / 48);
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 33)
    public static void method1074(int arg0) {
        field2359 = null;
        field2358 = null;
        field2355 = null;
        field2354 = null;
        field2357 = null;
        if (arg0 != -8365) {
            field2353 = 32;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 50)
    public static final int method1075(int arg0, KeyEvent arg1) {
        if (arg0 != 128) {
            method1073((byte) -36);
        }
        field2351++;
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }
}
