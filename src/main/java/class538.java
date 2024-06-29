import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class538 {

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "Lrl;")
    public static class672 field7857 = new class672(73, -1);

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
    public static int field7861 = 0;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
    public static int field7862 = -2;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
    public static int field7858;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "Lcr;")
    public static class533 field7860;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gu", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field7863;

    // $FF: synthetic method
    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3270(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V", line = 4)
    public static final void method3268(byte arg0) {
        try {
            if (arg0 != 9) {
                field7857 = null;
            }
            Method var1 = (field7863 == null ? (field7863 = method3270("java.lang.Runtime")) : field7863).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class369.field5783 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field7858++;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V", line = 31)
    public static void method3269(int arg0) {
        field7857 = null;
        if (arg0 != 8867) {
            field7859 = -81;
        }
        field7860 = null;
    }
}
