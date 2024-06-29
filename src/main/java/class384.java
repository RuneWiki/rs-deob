import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class384 {

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "Z")
    public static boolean field5417 = true;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V")
    public static final void method2296(byte arg0) {
        field5416++;
        int var1 = -92 % ((-arg0 - 11) / 33);
        if (class554.field7847 != null) {
            return;
        }
        Container var2;
        if (class683.field9634 != null) {
            var2 = class683.field9634;
        } else if (class421.field6129 == null) {
            var2 = class108.field1660;
        } else {
            var2 = class421.field6129;
        }
        class319.field4702 = var2.getSize().width;
        class443.field6457 = var2.getSize().height;
        if (class683.field9634 == var2) {
            Insets var3 = class683.field9634.getInsets();
            class443.field6457 -= var3.top + var3.bottom;
            class319.field4702 -= var3.right + var3.left;
        }
        if (class488.method2836(3) == 1) {
            class525.field7410 = 0;
            class487.field6930 = class245.field3815;
            class142.field2102 = (class319.field4702 - class245.field3815) / 2;
            class31.field494 = class544.field7651;
        } else {
            class627.method3499(0);
        }
        if (class379.field5372 != class296.field4357) {
            boolean var10000;
            if (class487.field6930 < 1024 && class31.field494 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class31.field486.setSize(class487.field6930, class31.field494);
        if (class282.field4228 != null) {
            class282.field4228.method182(class31.field486);
        }
        if (class683.field9634 == var2) {
            Insets var4 = class683.field9634.getInsets();
            class31.field486.setLocation(class142.field2102 + var4.left, class525.field7410 + var4.top);
        } else {
            class31.field486.setLocation(class142.field2102, class525.field7410);
        }
        if (class100.field1556 != -1) {
            class433.method2580((byte) 126, true);
        }
        class157.method1089(0);
    }
}
