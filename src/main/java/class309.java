import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class309 extends Canvas {

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "Ljava/awt/Component;")
    private Component field5289;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field5285 = 0;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field5284 = -1;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "[[[I")
    public static int[][][] field5291;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V", line = 5)
    public static void method2100(boolean arg0) {
        field5291 = (int[][][]) null;
        if (!arg0) {
            method2102(-64, (byte) 67);
        }
    }

    @OriginalMember(owner = "client!rc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 20)
    public final void paint(Graphics arg0) {
        field5282++;
        this.field5289.paint(arg0);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Z", line = 36)
    public static final boolean method2101(int arg0, int arg1) {
        if (arg1 <= 21) {
            method2100(false);
        }
        field5286++;
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)Z", line = 53)
    public static final boolean method2102(int arg0, byte arg1) {
        field5290++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            if (arg1 != -21) {
                field5285 = 44;
            }
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!rc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 76)
    public final void update(Graphics arg0) {
        field5287++;
        this.field5289.update(arg0);
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 91)
    public class309(Component arg0) {
        this.field5289 = arg0;
    }
}
