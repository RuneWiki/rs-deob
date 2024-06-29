import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class427 {

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field5862 = 0;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "F")
    public static float field5864;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public int field5863;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field5866;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wr", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field5867;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "Ljava/lang/String;")
    public String field5865;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILjava/awt/Component;Z)Lek;")
    public static final class474 method2439(int arg0, Component arg1, boolean arg2) {
        field5866++;
        try {
            Constructor var3 = Class.forName("cda").getDeclaredConstructor(field5867 == null ? (field5867 = method2440("java.awt.Component")) : field5867, Boolean.TYPE);
            return (class474) var3.newInstance(arg1, Boolean.valueOf(arg2));
        } catch (Throwable var4) {
            if (arg0 > -33) {
                method2439(8, null, false);
            }
            return new class160(arg1, arg2);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2440(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
