import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class93 {

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "Lda;")
    public class66 field1326 = null;

    @OriginalMember(owner = "client!vga", name = "f", descriptor = "Leia;")
    public class255 field1331 = null;

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1328 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

    @OriginalMember(owner = "client!vga", name = "h", descriptor = "Z")
    public static boolean field1333 = false;

    @OriginalMember(owner = "client!vga", name = "e", descriptor = "Ljw;")
    public static class581 field1330 = new class581(102, 10);

    @OriginalMember(owner = "client!vga", name = "g", descriptor = "F")
    public static float field1332;

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!vga", name = "d", descriptor = "Loha;")
    public static class772 field1329;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)V")
    public static final void method748(int arg0) {
        field1327++;
        class474.field6607.method1555((byte) -3);
        if (arg0 != 10) {
            method748(-29);
        }
    }

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "(I)V")
    public static void method749(int arg0) {
        field1329 = null;
        if (arg0 == 102) {
            field1328 = null;
            field1330 = null;
        }
    }

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lda;)V")
    public class93(class66 arg0) {
        this.field1326 = arg0;
    }

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lda;Leia;)V")
    public class93(class66 arg0, class255 arg1) {
        this.field1331 = arg1;
        this.field1326 = arg0;
    }
}
