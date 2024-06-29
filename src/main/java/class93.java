import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class93 implements Runnable {

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "Z")
    public boolean field1755 = true;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field1750 = new Object();

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "[I")
    public int[] field1761 = new int[500];

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public int field1763 = 0;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "[I")
    public int[] field1765 = new int[500];

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "Lqe;")
    private static class179 field1751 = class206.method1380("Please check your message)2centre for details)3", (byte) 36);

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "Lqe;")
    public static class179 field1757 = class206.method1380("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", (byte) 4);

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "Lqe;")
    public static class179 field1756 = field1751;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "Lqe;")
    public static class179 field1758 = class206.method1380("<col=ff7000>", (byte) -127);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "Lnc;")
    public static class144 field1753;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V")
    public static void method606(boolean arg0) {
        field1757 = null;
        field1756 = null;
        field1753 = null;
        if (!arg0) {
            field1758 = null;
            field1751 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILa;Ljava/lang/Object;)V")
    public static final void method607(int arg0, class1 arg1, Object arg2) {
        field1760++;
        if (arg1.field1 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field1.peekEvent() != null; var3++) {
            class137.method873(1L, -967787128);
        }
        if (arg0 == -15266 && arg2 != null) {
            arg1.field1.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ig", name = "run", descriptor = "()V")
    public final void run() {
        field1749++;
        while (this.field1755) {
            Object var1 = this.field1750;
            synchronized (this.field1750) {
                if (this.field1763 < 500) {
                    this.field1761[this.field1763] = class4.field61;
                    this.field1765[this.field1763] = class139.field2559;
                    this.field1763++;
                }
            }
            class137.method873(50L, -967787128);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII)V")
    public static final void method608(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -8755) {
            field1758 = null;
        }
        field1759++;
        if (class235.field4336 <= arg3 - arg4 && class40.field869 >= arg3 + arg4 && class168.field3037 <= arg0 - arg4 && class70.field1403 >= arg0 + arg4) {
            class139.method884(arg0, (byte) -114, arg4, arg1, arg3);
        } else {
            class151.method963(arg1, arg4, arg0, arg3, -1);
        }
    }
}
