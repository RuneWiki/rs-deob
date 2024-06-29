import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public abstract class class175 {

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "Z")
    public static volatile boolean field2985 = false;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "[I")
    public static int[] field2991 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public int field2992;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public int field2994;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "Ljava/awt/Image;")
    public Image field2986;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "[I")
    public int[] field2990;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "[[[B")
    public static byte[][][] field2993;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 14)
    public static final void method1357(int arg0, String arg1, int arg2) {
        field2989++;
        class30 var3 = class99.method857((byte) 107, arg0, 2);
        var3.method277(true);
        if (arg2 != 20192) {
            field2993 = (byte[][][]) ((byte[][][]) null);
        }
        var3.field436 = arg1;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 29)
    public final void method1358(int arg0) {
        class47.method407(this.field2990, this.field2994, this.field2992);
        field2984++;
        if (arg0 != 2) {
            this.field2992 = -118;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V", line = 49)
    public static void method1359(int arg0) {
        field2993 = (byte[][][]) null;
        if (arg0 == 0) {
            field2991 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V", line = 69)
    protected class175() {
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)Lel;", line = 73)
    public static final class133 method1360(int arg0) {
        if (arg0 != -13556) {
            return (class133) null;
        }
        field2987++;
        try {
            return (class133) Class.forName("gd").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILjava/awt/Graphics;IZII)V")
    public abstract void method957(int arg0, Graphics arg1, int arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
    public abstract void method959(Graphics arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BIILjava/awt/Component;)V")
    public abstract void method958(byte arg0, int arg1, int arg2, Component arg3);
}
