import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class46 {

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "Lpg;")
    public class122 field599 = new class122();

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "Z")
    public boolean field603 = false;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field593 = -1;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Z")
    public static boolean field595 = false;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "[Lcj;")
    public static class198[] field596 = new class198[2048];

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field597 = 0;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public int field605;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Lgq;")
    public static class453 field594;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field601;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "[[B")
    public static byte[][] field602;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V")
    public static final void method244(int arg0, int arg1) {
        field600++;
        class89 var2 = class146.method695(arg1, arg0, (byte) -59);
        var2.method448(13);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static void method245(int arg0) {
        field594 = null;
        field601 = null;
        field596 = null;
        field602 = null;
        if (arg0 != 2048) {
            method244(-12, 45);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)I")
    public static final int method246(int arg0, int arg1) {
        if (arg0 == 14) {
            field598++;
            return arg1 & 0x7F;
        } else {
            return -7;
        }
    }
}
