import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public abstract class class59 {

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field663 = new String[100];

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "Lgh;")
    public static class509 field667;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "Ljava/applet/Applet;")
    public static Applet field668;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)B")
    public static final byte method488(int arg0, int arg1, int arg2) {
        field664++;
        if (arg0 == arg1) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(III)Z")
    public static final boolean method489(int arg0, int arg1, int arg2) {
        int var3 = 74 / ((-arg2 - 16) / 41);
        field666++;
        return (arg0 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)[B")
    public abstract byte[] method490(int arg0);

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
    public static void method491(boolean arg0) {
        field667 = null;
        field663 = null;
        field668 = null;
        if (arg0) {
            field665 = -117;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "([BI)V")
    public abstract void method492(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "(III)[B")
    public abstract byte[] method493(int arg0, int arg1, int arg2);
}
