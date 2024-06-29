import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class301 extends class487 {

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "[I")
    public int[] field4196;

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "[I")
    public int[] field4197;

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "Lej;")
    public static class124 field4195 = new class124(13, 2);

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "Lej;")
    public static class124 field4199 = new class124(15, 8);

    @OriginalMember(owner = "client!nba", name = "j", descriptor = "Lgba;")
    public static class667 field4201 = new class667(0, 0);

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!nba", name = "k", descriptor = "Lin;")
    public static class91 field4202;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nba", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field4203;

    // $FF: synthetic method
    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1962(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(BII)Z", line = 3)
    public static final boolean method1959(byte arg0, int arg1, int arg2) {
        if (arg0 < 5) {
            method1959((byte) -119, -93, 73);
        }
        field4198++;
        return (arg2 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)V", line = 16)
    public static void method1960(int arg0) {
        if (arg0 != 19612) {
            method1960(-70);
        }
        field4195 = null;
        field4199 = null;
        field4201 = null;
        field4202 = null;
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(B)V", line = 29)
    public static final void method1961(byte arg0) {
        if (class689.field9299.field2542) {
            class69.field1286 = 96;
        } else {
            try {
                Method var1 = (field4203 == null ? (field4203 = method1962("java.lang.Runtime")) : field4203).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class69.field1286 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var5) {
                    }
                }
            } catch (Exception var6) {
            }
        }
        int var4 = 15 % (arg0 / 51);
        field4200++;
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(II[I[I)V", line = 71)
    public class301(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field4196 = arg2;
        this.field4197 = arg3;
    }
}
