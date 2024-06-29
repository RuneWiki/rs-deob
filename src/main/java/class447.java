import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class447 extends class376 {

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "[I")
    public static int[] field6439 = new int[2500];

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
    public static int field6441 = -1;

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "J")
    public long field6446;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "Lmo;")
    public class447 field6442;

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "Lmo;")
    public class447 field6443;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 5)
    public static final void method2785(Component arg0, int arg1) {
        field6440++;
        if (arg1 != -1) {
            method2785((Component) null, -97);
        }
        Method var2 = class351.field4905;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class237.field3228);
        arg0.addFocusListener(class237.field3228);
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)V", line = 31)
    public static void method2786(int arg0) {
        if (arg0 < -83) {
            field6439 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(B)Z", line = 44)
    public final boolean method2787(byte arg0) {
        field6445++;
        if (arg0 < 72) {
            this.field6443 = null;
        }
        return this.field6443 != null;
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(B)V", line = 70)
    public final void method2788(byte arg0) {
        if (arg0 > -88) {
            method2786(45);
        }
        field6444++;
        if (this.field6443 != null) {
            this.field6443.field6442 = this.field6442;
            this.field6442.field6443 = this.field6443;
            this.field6442 = null;
            this.field6443 = null;
        }
    }
}
