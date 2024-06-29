import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class481 {

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "Z")
    public static boolean field6909 = false;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "[C")
    public static char[] field6910 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public static int field6904 = 0;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public static int field6911 = 0;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public int field6905;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public int field6906;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
    public int field6913;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "Lom;")
    public static class344 field6912;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fo", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field6914;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([Lf;I)V")
    public static final void method2917(class702[] arg0, int arg1) {
        class546.field7760 = arg0.length;
        field6908++;
        class126.field2308 = new class702[class546.field7760 + 10];
        class240.field3544 = new int[class546.field7760 + 10];
        if (arg1 >= -126) {
            field6904 = 90;
        }
        class692.method3875(arg0, 0, class126.field2308, 0, class546.field7760);
        for (int var2 = 0; var2 < class546.field7760; var2++) {
            class240.field3544[var2] = class126.field2308[var2].method1789();
        }
        for (int var3 = class546.field7760; var3 < class126.field2308.length; var3++) {
            class240.field3544[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "()V")
    public static final void method2918() {
        class270.method1755(1, class148.field2557);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)I")
    public static int method2919(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lpca;")
    public static final class666 method2920(Component arg0, int arg1, boolean arg2) {
        field6907++;
        if (arg1 != 13233) {
            return null;
        }
        try {
            Constructor var3 = Class.forName("iw").getDeclaredConstructor(field6914 == null ? (field6914 = method2922("java.awt.Component")) : field6914, Boolean.TYPE);
            return (class666) var3.newInstance(arg0, Boolean.valueOf(arg2));
        } catch (Throwable var4) {
            return new class309(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
    public static void method2921(int arg0) {
        field6912 = null;
        field6910 = null;
        if (arg0 != 122) {
            field6911 = -124;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2922(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
