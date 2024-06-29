import java.awt.Color;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class140 {

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1918 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "S")
    public static short field1919 = 32767;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "[Z")
    public static boolean[] field1920 = new boolean[100];

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
    public static int field1921 = -14475237;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)V")
    public static void method899(boolean arg0) {
        if (arg0) {
            field1918 = null;
            field1920 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZI)V")
    public static final void method900(boolean arg0, int arg1) {
        if (arg1 != 133) {
            field1921 = -23;
        }
        field1917++;
        class281.method1935(-42);
        if (class70.field932 != 30 && class70.field932 != 25) {
            return;
        }
        class51.field686++;
        if (class51.field686 < 50 && !arg0) {
            return;
        }
        class51.field686 = 0;
        if (!class368.field5313 && class191.field2558 != null) {
            class185.field2507.method5(-6445, 133);
            class69.field883++;
            try {
                class191.field2558.method1401(3, 0, class185.field2507.field3029, class185.field2507.field3040);
                class185.field2507.field3029 = 0;
            } catch (IOException var2) {
                class368.field5313 = true;
            }
        }
        class281.method1935(100);
    }
}
