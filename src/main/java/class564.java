import java.awt.Color;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class564 {

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "[I")
    public static int[] field7811 = new int[2];

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "[Ljava/awt/Color;")
    public static Color[] field7809 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field7815 = new Rectangle[100];

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field7812;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field7814;

    @OriginalMember(owner = "client!fj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7810++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static void method3216(int arg0) {
        field7815 = null;
        if (arg0 == 2) {
            field7809 = null;
            field7811 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lbea;BII)V")
    public static final void method3217(class188 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -23) {
            field7814 = 18;
        }
        field7812++;
        if (arg0.field535 == arg3 && arg3 != -1) {
            class78 var4 = class331.field4418.method195(arg3, (byte) 13);
            int var5 = var4.field1282;
            if (var5 == 1) {
                arg0.field596 = 0;
                arg0.field584 = arg2;
                arg0.field539 = 0;
                arg0.field595 = 1;
                arg0.field566 = 0;
                class170.method1085(arg0.field6029, arg0.field6035, class645.field9372 == arg0, (byte) 61, arg0.field539, var4, arg0.field6037);
            }
            if (var5 == 2) {
                arg0.field596 = 0;
                return;
            }
        } else if (arg3 == -1 || arg0.field535 == -1 || class331.field4418.method195(arg3, (byte) 13).field1276 >= class331.field4418.method195(arg0.field535, (byte) 13).field1276) {
            arg0.field621 = arg0.field617;
            arg0.field566 = 0;
            arg0.field584 = arg2;
            arg0.field539 = 0;
            arg0.field535 = arg3;
            arg0.field595 = 1;
            arg0.field596 = 0;
            if (arg0.field535 == -1) {
                return;
            }
            class170.method1085(arg0.field6029, arg0.field6035, class645.field9372 == arg0, (byte) -119, arg0.field539, class331.field4418.method195(arg0.field535, (byte) 13), arg0.field6037);
        }
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field7815[var0] = new Rectangle();
        }
    }
}
