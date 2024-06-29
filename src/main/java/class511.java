import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class class511 extends class276 {

    @OriginalMember(owner = "client!n", name = "n", descriptor = "Lpu;")
    public static class411 field7481 = new class411();

    @OriginalMember(owner = "client!n", name = "q", descriptor = "Lvv;")
    public static class313 field7484 = new class313(87, -1);

    @OriginalMember(owner = "client!n", name = "s", descriptor = "[B")
    public static byte[] field7486 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field7485 = -1;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "Lps;")
    public static class5 field7487 = new class5(0, 0);

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Lvi;")
    public static class206 field7483;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "[Lya;")
    public static class220[] field7488;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 3)
    public static void method3009(int arg0) {
        field7486 = null;
        field7483 = null;
        field7487 = null;
        if (arg0 > 105) {
            field7484 = null;
            field7488 = null;
            field7481 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V", line = 18)
    public static final void method3010(int arg0) {
        field7482++;
        if (class422.field6374 != null) {
            return;
        }
        Container var1;
        if (class346.field5450 == null) {
            var1 = class419.field6342.field7203;
        } else {
            var1 = class346.field5450;
        }
        class412.field6245 = var1.getSize().width;
        class314.field4950 = var1.getSize().height;
        if (class346.field5450 == var1) {
            Insets var2 = class346.field5450.getInsets();
            class412.field6245 -= var2.right + var2.left;
            class314.field4950 -= var2.top + var2.bottom;
        }
        if (class287.method1865((byte) -125) == 1) {
            class358.field5581 = class146.field2382;
            class49.field825 = class527.field7766;
            class311.field4923 = (class412.field6245 - class146.field2382) / 2;
            class197.field3137 = 0;
        } else if (class101.field1668 < 96 && field7485 == 0) {
            int var3 = class412.field6245 <= 1024 ? class412.field6245 : 1024;
            class311.field4923 = (class412.field6245 - var3) / 2;
            class358.field5581 = var3;
            int var4 = class314.field4950 <= 768 ? class314.field4950 : 768;
            class197.field3137 = 0;
            class49.field825 = var4;
        } else {
            class49.field825 = class314.field4950;
            class311.field4923 = 0;
            class358.field5581 = class412.field6245;
            class197.field3137 = 0;
        }
        if (class255.field4320 != class180.field2857) {
            boolean var10000;
            if (class358.field5581 < 1024 && class49.field825 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class270.field4495.setSize(class358.field5581, class49.field825);
        if (class305.field4873 != null) {
            class305.field4873.method916(class270.field4495);
        }
        if (class346.field5450 == var1) {
            Insets var5 = class346.field5450.getInsets();
            class270.field4495.setLocation(class311.field4923 + var5.left, class197.field3137 + var5.top);
        } else {
            class270.field4495.setLocation(class311.field4923, class197.field3137);
        }
        if (class379.field5881 != -1) {
            class380.method2404(true, true);
        }
        class420.method2581(arg0);
    }
}
