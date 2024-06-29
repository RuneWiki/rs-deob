import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class41 {

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public static int field614 = 0;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "Lng;")
    public static class190 field615 = new class190(16);

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
    public static int field616 = 0;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "Lvm;")
    public static class407 field612;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field617;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
    public static void method285(int arg0) {
        field617 = null;
        field615 = null;
        if (arg0 != -27278) {
            field617 = null;
        }
        field612 = null;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BI)I")
    public static final int method286(byte arg0, int arg1) {
        if (arg0 != 13) {
            field615 = null;
        }
        field613++;
        return arg1 >>> 7;
    }
}
