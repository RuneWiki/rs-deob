import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class567 {

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public int field7996 = -1;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "[I")
    public static int[] field8000 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field7994;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field7997;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field7998;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "Lir;")
    public class25 field7995;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ji", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field8002;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "[I")
    public int[] field8001;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "[Ljava/lang/String;")
    public String[] field7999;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3245(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V", line = 8)
    public static final void method3243(boolean arg0) {
        if (!arg0) {
            return;
        }
        if (class543.field7374.field1460) {
            class651.field9037 = 96;
        } else {
            try {
                Method var1 = (field8002 == null ? (field8002 = method3245("java.lang.Runtime")) : field8002).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class651.field9037 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        field7994++;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V", line = 46)
    public static void method3244(byte arg0) {
        if (arg0 != 110) {
            method3244((byte) -123);
        }
        field8000 = null;
    }
}
