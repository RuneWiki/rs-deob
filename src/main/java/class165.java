import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class165 {

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "I")
    public static int field2070 = 100;

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "Lea;")
    public static class547 field2067 = new class547(81, 4);

    @OriginalMember(owner = "client!ada", name = "f", descriptor = "F")
    public static float field2071;

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "Lrj;")
    public static class596 field2069;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "Ljava/awt/Image;")
    public static Image field2066;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(B)V")
    public static void method970(byte arg0) {
        field2067 = null;
        field2066 = null;
        if (arg0 > 73) {
            field2069 = null;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V")
    public static final void method971(int arg0) {
        field2068++;
        if (class116.field1543 == -1) {
            return;
        }
        int var1 = class427.field6034.method528(61);
        int var2 = class427.field6034.method521((byte) 80);
        class314 var3 = (class314) class171.field2134.method724(32);
        if (var3 != null) {
            var1 = var3.method1879(123);
            var2 = var3.method1875(48);
        }
        int var4 = 0;
        if (arg0 < 79) {
            method970((byte) -85);
        }
        int var5 = 0;
        if (class247.field3206) {
            var4 = class63.method488((byte) 42);
            var5 = class231.method1364(false);
        }
        class758.method4216(var1 + var4, var5, class116.field1543, var4 + class546.field7710, 0, class512.field6932 + var5, var4, var1, var2, var2 + var5, var5, var4);
        if (class162.field2034 != null) {
            class329.method1953(var1 + var4, var2 + var5, (byte) 2);
        }
    }
}
