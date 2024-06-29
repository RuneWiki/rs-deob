import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class313 {

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "I")
    public static int field4038;

    // $FF: synthetic field
    @OriginalMember(owner = "client!afa", name = "d", descriptor = "Ljava/lang/Class;")
    public static Class field4039;

    // $FF: synthetic method
    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1772(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIII)V", line = 3)
    public static final void method1769(int arg0, int arg1, int arg2, int arg3) {
        class379.field4922 = new byte[arg0][arg3][arg1];
        if (arg2 >= 67) {
            field4036++;
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IILep;I)V", line = 14)
    public static final void method1770(int arg0, int arg1, class382 arg2, int arg3) {
        class672.field9556 = arg2;
        field4037++;
        class647.field9164 = arg0;
        if (arg1 == 1) {
            class389.field5197 = arg3;
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)V", line = 29)
    public static final void method1771(byte arg0) {
        int var1 = 5 % ((arg0 - 72) / 47);
        if (class623.field8837.field7935) {
            class145.field1630 = 96;
        } else {
            try {
                Method var2 = (field4039 == null ? (field4039 = method1772("java.lang.Runtime")) : field4039).getMethod("maxMemory");
                if (var2 != null) {
                    try {
                        Runtime var3 = Runtime.getRuntime();
                        Long var4 = (Long) var2.invoke(var3, (Object[]) null);
                        class145.field1630 = (int) (var4 / 1048576L) + 1;
                    } catch (Throwable var5) {
                    }
                }
            } catch (Exception var6) {
            }
        }
        field4038++;
    }
}
