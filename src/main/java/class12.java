import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class12 {

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field264 = 0;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "[Lpe;")
    public static class109[] field262 = new class109[1000];

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "Lpe;")
    private static class109 field272 = class141.method1120("Malformed login packet)3", 0);

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Lpe;")
    public static class109 field268 = field272;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Ljava/lang/Object;")
    public static Object field270 = new Object();

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Lpe;")
    public static class109 field275 = class141.method1120("Lade Eingabe)2Steuerungsprogramm)3)3)3", 0);

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "Lpe;")
    public static class109 field276 = class141.method1120("_", 0);

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public static volatile int field277 = 0;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "J")
    public long field267;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Lbd;")
    public class12 field263;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Lbd;")
    public class12 field266;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Ljava/awt/Frame;")
    public static Frame field278;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "[I")
    public static int[] field273;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lna;IZI)Z")
    public static final boolean method100(class91 arg0, int arg1, boolean arg2, int arg3) {
        field274++;
        byte[] var4 = arg0.method742(arg3, 14, arg1);
        if (var4 == null) {
            return false;
        } else if (arg2) {
            class47.method415(var4, 1);
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public final void method101(byte arg0) {
        field265++;
        if (this.field266 == null) {
            return;
        }
        if (arg0 <= 77) {
            method100(null, -82, true, -74);
        }
        this.field266.field263 = this.field263;
        this.field263.field266 = this.field266;
        this.field266 = null;
        this.field263 = null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
    public static void method102(byte arg0) {
        field272 = null;
        field262 = null;
        field276 = null;
        field270 = null;
        field278 = null;
        field273 = null;
        field275 = null;
        if (arg0 == -54) {
            field268 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)Z")
    public final boolean method103(int arg0) {
        field269++;
        if (arg0 == -1) {
            return this.field266 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)I")
    public static final int method104(int arg0, int arg1, int arg2) {
        field261++;
        class145 var3 = (class145) class25.field613.method505((byte) -46, (long) arg2);
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && var3.field3188.length > arg0) {
            if (arg1 != -21094) {
                field273 = null;
            }
            return var3.field3188[arg0];
        } else {
            return -1;
        }
    }
}
