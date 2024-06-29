import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class232 {

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3752 = "Loaded config";

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Lhc;")
    public static class163 field3749 = new class163();

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "[Lod;")
    public static class24[] field3756 = new class24[14];

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Z")
    public static boolean field3758 = true;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Lvl;")
    public static class73 field3754;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field3759;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static final void method1637(int arg0) {
        field3750++;
        try {
            if (arg0 != 1) {
                method1638(-45);
            }
            Method var1 = (field3759 == null ? (field3759 = method1639("java.lang.Runtime")) : field3759).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class200.field3157 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
    public static void method1638(int arg0) {
        field3749 = null;
        field3754 = null;
        field3752 = null;
        int var1 = 46 % ((arg0 + 27) / 54);
        field3756 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1639(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
