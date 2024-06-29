import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class758 {

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field10423;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field10424;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field10426;

    // $FF: synthetic field
    @OriginalMember(owner = "client!od", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field10427;

    // $FF: synthetic field
    @OriginalMember(owner = "client!od", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field10428;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "[Lvs;")
    public static class532[] field10425;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([BIB)[B")
    public static final byte[] method4193(byte[] arg0, int arg1, byte arg2) {
        field10423++;
        if (arg2 < 39) {
            field10424 = 38;
        }
        byte[] var3 = new byte[arg1];
        class335.method2118(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
    public static void method4194(boolean arg0) {
        if (!arg0) {
            field10424 = 118;
        }
        field10425 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)I")
    public static final int method4195(int arg0) {
        field10426++;
        int var1 = 0;
        Field[] var2 = (field10427 == null ? (field10427 = method4196("fs")) : field10427).getDeclaredFields();
        Field[] var3 = var2;
        if (arg0 != -14471) {
            method4194(false);
        }
        for (int var4 = 0; var4 < var3.length; var4++) {
            Field var5 = var3[var4];
            if ((field10428 == null ? (field10428 = method4196("li")) : field10428).isAssignableFrom(var5.getType())) {
                var1++;
            }
        }
        return var1 + 1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4196(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
