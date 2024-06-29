import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class365 extends class316 {

    @OriginalMember(owner = "client!gha", name = "p", descriptor = "I")
    private int field5090 = -1;

    @OriginalMember(owner = "client!gha", name = "q", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!gha", name = "r", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!gha", name = "s", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!gha", name = "t", descriptor = "I")
    public static int field5094;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gha", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field5095;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(Z)V")
    public static final void method2292(boolean arg0) {
        if (class519.field7328.field6692) {
            class54.field676 = 96;
        } else {
            try {
                Method var1 = (field5095 == null ? (field5095 = method2293("java.lang.Runtime")) : field5095).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class54.field676 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        field5092++;
        if (arg0) {
            field5093 = -66;
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(BLmda;)V")
    public final void method152(byte arg0, class276 arg1) {
        field5091++;
        arg1.method1795(-1, this.field5090);
        if (arg0 <= 80) {
            field5093 = -75;
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(ILso;)V")
    public final void method148(int arg0, class494 arg1) {
        field5094++;
        if (arg0 != -1001) {
            this.method152((byte) 11, null);
        }
        this.field5090 = arg1.method2998(true);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2293(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
