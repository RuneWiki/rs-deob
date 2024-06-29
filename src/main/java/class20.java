import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ja")
public class class20 extends Canvas {

    @OriginalMember(owner = "mapview!ja", name = "h", descriptor = "Ljava/awt/Component;")
    private Component field194;

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "Lu;")
    public static class38 field187 = class9.method45(-41, "Crafting Shop");

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "Z")
    public static boolean field188 = false;

    @OriginalMember(owner = "mapview!ja", name = "g", descriptor = "I")
    public static int field193 = 20;

    @OriginalMember(owner = "mapview!ja", name = "i", descriptor = "I")
    public static int field195 = -1;

    @OriginalMember(owner = "mapview!ja", name = "e", descriptor = "Lu;")
    public static class38 field191 = class9.method45(-41, "???");

    @OriginalMember(owner = "mapview!ja", name = "j", descriptor = "Lu;")
    public static class38 field196 = class9.method45(-41, "Switch to ");

    @OriginalMember(owner = "mapview!ja", name = "f", descriptor = "Lu;")
    public static class38 field192 = class9.method45(-41, "labels)3dat");

    @OriginalMember(owner = "mapview!ja", name = "m", descriptor = "Lu;")
    public static class38 field199 = class9.method45(-41, "Enter place name to find");

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "Lu;")
    public static class38 field189 = class9.method45(-41, "Find");

    @OriginalMember(owner = "mapview!ja", name = "d", descriptor = "I")
    public static int field190 = -1;

    @OriginalMember(owner = "mapview!ja", name = "k", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "mapview!ja", name = "l", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "mapview!ja", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 14)
    public final void update(Graphics arg0) {
        this.field194.update(arg0);
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(I)V", line = 36)
    public static void method96(int arg0) {
        if (arg0 != -27546) {
            field188 = true;
        }
        field191 = null;
        field187 = null;
        field189 = null;
        field192 = null;
        field196 = null;
        field199 = null;
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(Z)B", line = 54)
    public static final byte method97(boolean arg0) {
        if (!arg0) {
            field193 = -50;
        }
        return class8.field67 == null ? 0 : class8.field67[class14.field139];
    }

    @OriginalMember(owner = "mapview!ja", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 67)
    public class20(Component arg0) {
        this.field194 = arg0;
    }

    @OriginalMember(owner = "mapview!ja", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 77)
    public final void paint(Graphics arg0) {
        this.field194.paint(arg0);
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(II)I", line = 95)
    public static int method98(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
