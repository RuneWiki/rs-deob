import java.awt.event.ActionEvent;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class122 {

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "S")
    public static short field1854 = 256;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field1852 = -1;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Z")
    public static boolean field1857 = false;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field1856;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dh", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field1858;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static final void method774(int arg0) {
        for (int var1 = arg0; var1 < class183.field2759; var1++) {
            class232 var2 = class231.method1476((byte) -104, var1);
            if (var2 != null && var2.field3504 == 0) {
                class186.field2823[var1] = 0;
                class35.field494[var1] = 0;
            }
        }
        field1855++;
        class273.field4110 = new class253(16);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILjava/lang/Object;Lfg;)V")
    public static final void method775(int arg0, Object arg1, class12 arg2) {
        field1853++;
        if (arg0 < 14 || arg2.field149 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field149.peekEvent() != null; var3++) {
            class250.method1643(1, 1L);
        }
        if (arg1 != null) {
            arg2.field149.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static final void method776(byte arg0) {
        try {
            if (arg0 >= -54) {
                field1854 = -67;
            }
            Method var1 = (field1858 == null ? (field1858 = method777("java.lang.Runtime")) : field1858).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class54.field880 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field1856++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method777(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
