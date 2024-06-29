import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class713 {

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "I")
    public static int field9903 = -1;

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "J")
    public static long field9904 = 0L;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "I")
    public static int field9902;

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "I")
    public static int field9905;

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "I")
    public static int field9906;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ega", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field9907;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3983(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IZLjava/awt/Component;)Lwn;", line = 4)
    public static final class725 method3981(int arg0, boolean arg1, Component arg2) {
        field9902++;
        try {
            if (arg0 <= 44) {
                field9905 = 105;
            }
            Constructor var3 = Class.forName("v").getDeclaredConstructor(field9907 == null ? (field9907 = method3983("java.awt.Component")) : field9907, Boolean.TYPE);
            return (class725) var3.newInstance(arg2, Boolean.valueOf(arg1));
        } catch (Throwable var4) {
            return new class159(arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(BIILac;I)V", line = 25)
    public static final void method3982(byte arg0, int arg1, int arg2, class543 arg3, int arg4) {
        field9906++;
        for (class357 var5 = (class357) class482.field6546.method3672(-1); var5 != null; var5 = (class357) class482.field6546.method3662(-1)) {
            if (var5.field4612 == arg2 && arg4 << 9 == var5.field4593 && (arg1 << 9) == var5.field4597 && var5.field4604.field7586 == arg3.field7586) {
                if (var5.field4617 != null) {
                    class307.field4055.method1319(var5.field4617);
                    var5.field4617 = null;
                }
                if (var5.field4609 != null) {
                    class307.field4055.method1319(var5.field4609);
                    var5.field4609 = null;
                }
                var5.method1175(-2);
                return;
            }
        }
        if (arg0 <= 68) {
            field9905 = -109;
        }
    }
}
