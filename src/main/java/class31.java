import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!pa")
public class class31 extends class4 {

    @OriginalMember(owner = "mapview!pa", name = "n", descriptor = "Lf;")
    public static class10 field424 = class23.method139("Shield Shop", (byte) -107);

    @OriginalMember(owner = "mapview!pa", name = "k", descriptor = "Lf;")
    public static class10 field421 = class23.method139("Enter place name to find", (byte) -90);

    @OriginalMember(owner = "mapview!pa", name = "m", descriptor = "Lf;")
    public static class10 field423 = class23.method139("Saw Mill", (byte) -90);

    @OriginalMember(owner = "mapview!pa", name = "l", descriptor = "Lf;")
    public class10 field422;

    @OriginalMember(owner = "mapview!pa", name = "o", descriptor = "[I")
    public static int[] field425;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(II[B)I", line = 4)
    public static final int method196(int arg0, int arg1, byte[] arg2) {
        if (arg0 != -20838) {
            method197(null, 5);
        }
        return class38.method246(arg2, true, 0, arg1);
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 27)
    public static final void method197(Component arg0, int arg1) {
        arg0.removeMouseListener(class7.field65);
        arg0.removeMouseMotionListener(class7.field65);
        arg0.removeFocusListener(class7.field65);
        class19.field177 = arg1;
    }

    @OriginalMember(owner = "mapview!pa", name = "c", descriptor = "(I)V", line = 44)
    public static void method198(int arg0) {
        if (arg0 != -20583) {
            field421 = null;
        }
        field421 = null;
        field425 = null;
        field424 = null;
        field423 = null;
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "([BZI)Ljava/lang/Object;", line = 59)
    public static final Object method199(byte[] arg0, boolean arg1, int arg2) {
        if (arg0 == null) {
            return null;
        }
        if (arg2 < 73) {
            method197(null, 63);
        }
        if (arg0.length > 136 && !class17.field145) {
            try {
                class8 var3 = (class8) Class.forName("ta").getDeclaredConstructor().newInstance();
                var3.method42(true, arg0);
                return var3;
            } catch (Throwable var5) {
                class17.field145 = true;
            }
        }
        return arg1 ? class33.method215(-115, arg0) : arg0;
    }
}
