import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public abstract class class297 {

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public static int field4005 = 64;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "Lrk;")
    public static class427 field4006;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ls", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field4007;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1913(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V", line = 12)
    public static final void method1909(int arg0) {
        try {
            Method var1 = (field4007 == null ? (field4007 = method1913("java.lang.Runtime")) : field4007).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    field4005 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field4004++;
        if (arg0 != 64) {
            field4005 = 56;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IB)V", line = 51)
    public static final void method1910(int arg0, byte arg1) {
        for (class381 var2 = class204.field2874.method608(-103); var2 != null; var2 = class204.field2874.method606((byte) 92)) {
            if (((long) arg0) == (var2.field5349 >> 48 & 0xFFFFL)) {
                var2.method2367(5);
            }
        }
        field4003++;
        if (arg1 >= -87) {
            field4005 = 32;
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V", line = 72)
    public static void method1911(int arg0) {
        if (arg0 != 64) {
            method1909(-93);
        }
        field4006 = null;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)V", line = 82)
    public static final void method1912(int arg0, int arg1) {
        field4002++;
        class388.field5458 = arg0 / arg1;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lfk;I)Lfk;")
    public abstract class23 method1630(class23 arg0, int arg1);
}
