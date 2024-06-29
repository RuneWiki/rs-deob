import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public class class382 {

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!fha", name = "c", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!fha", name = "d", descriptor = "I")
    public static int field5394;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fha", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field5395;

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(II)Z")
    public static final boolean method2244(int arg0, int arg1) {
        field5394++;
        if (class534.field7246[arg0]) {
            return true;
        } else if (class751.field10420.method2896(false, arg0)) {
            int var2 = class751.field10420.method2901(0, arg0);
            if (var2 == 0) {
                class534.field7246[arg0] = true;
                return true;
            }
            if (class357.field4742[arg0] == null) {
                class357.field4742[arg0] = new class218[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class357.field4742[arg0][var3] == null) {
                    byte[] var4 = class751.field10420.method2885(var3, arg0, false);
                    if (var4 != null) {
                        class218 var5 = class357.field4742[arg0][var3] = new class218();
                        var5.field2708 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method1224(new class611(var4), -947);
                    }
                }
            }
            class534.field7246[arg0] = true;
            if (arg1 < 1) {
                method2245(null);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lfh;)V")
    public static final void method2245(class651 arg0) {
        class350.field4641 = arg0;
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(I)V")
    public static final void method2246(int arg0) {
        field5391++;
        try {
            Method var1 = (field5395 == null ? (field5395 = method2247("java.lang.Runtime")) : field5395).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class761.field10625 = var3;
                } catch (Throwable var4) {
                }
            }
            if (arg0 != 12345) {
                field5392 = 1;
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!fha", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5393++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(II)V")
    public class382(int arg0, int arg1) {
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2247(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
