import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class574 extends Canvas {

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field8013;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "I")
    public static int field8014;

    @OriginalMember(owner = "client!nea", name = "d", descriptor = "I")
    public static int field8015;

    @OriginalMember(owner = "client!nea", name = "e", descriptor = "I")
    public static int field8016;

    @OriginalMember(owner = "client!nea", name = "f", descriptor = "I")
    public static int field8017;

    @OriginalMember(owner = "client!nea", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field8013.update(arg0);
        field8016++;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V")
    public static final void method3221(int arg0) {
        field8012++;
        if (class745.field10393 == null) {
            return;
        }
        try {
            String var1 = class745.field10393.getParameter("cookiehost");
            int var2 = (int) (class97.method654((byte) 49) / 86400000L) - 11745;
            if (arg0 < -41) {
                String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
                class193.method1212(class745.field10393, "document.cookie=\"" + var3 + "\"", (byte) 38);
            }
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "([BBZ)Ljava/lang/Object;")
    public static final Object method3222(byte[] arg0, byte arg1, boolean arg2) {
        field8017++;
        if (arg1 > -79) {
            return null;
        } else if (arg0 == null) {
            return null;
        } else {
            if (arg0.length > 136 && !class134.field1581) {
                try {
                    class242 var3 = (class242) Class.forName("ifa").getDeclaredConstructor().newInstance();
                    var3.method525(1, arg0);
                    return var3;
                } catch (Throwable var4) {
                    class134.field1581 = true;
                }
            }
            return arg2 ? class572.method3217(66, arg0) : arg0;
        }
    }

    @OriginalMember(owner = "client!nea", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field8015++;
        this.field8013.paint(arg0);
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class574(Component arg0) {
        this.field8013 = arg0;
    }
}
