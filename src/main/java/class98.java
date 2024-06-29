import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public abstract class class98 {

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "[Z")
    public static boolean[] field1567 = new boolean[5];

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field1568 = 2;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1572 = "Loading interfaces - ";

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Luf;")
    public static class176 field1569;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "[S")
    public static short[] field1571;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static final void method767(int arg0) {
        field1564++;
        Container var1;
        if (class6.field114 != null) {
            var1 = class6.field114;
        } else if (class239.field3716 == null) {
            var1 = class22.field329.field934;
        } else {
            var1 = class239.field3716;
        }
        class237.field3656 = var1.getSize().width;
        class205.field3183 = var1.getSize().height;
        if (class239.field3716 == var1) {
            Insets var2 = class239.field3716.getInsets();
            class237.field3656 -= var2.right + var2.left;
            class205.field3183 -= var2.top + var2.bottom;
        }
        if (class245.method1659(66) >= 2) {
            class93.field1509 = 0;
            class35.field573 = class237.field3656;
            class62.field994 = 0;
            class277.field4369 = class205.field3183;
        } else {
            class62.field994 = 0;
            class93.field1509 = (class237.field3656 - 765) / 2;
            class277.field4369 = 503;
            class35.field573 = 765;
        }
        class189.field3021.setSize(class35.field573, class277.field4369);
        if (class239.field3716 == var1) {
            Insets var3 = class239.field3716.getInsets();
            class189.field3021.setLocation(class93.field1509 + var3.left, class62.field994 + var3.top);
        } else {
            class189.field3021.setLocation(class93.field1509, class62.field994);
        }
        if (arg0 < -3) {
            if (class34.field544 != -1) {
                class109.method819(127, true);
            }
            class184.method1244(-100);
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
    public static void method768(int arg0) {
        field1572 = null;
        field1569 = null;
        field1571 = null;
        field1567 = null;
        if (arg0 != -1) {
            method767(-88);
        }
    }
}
