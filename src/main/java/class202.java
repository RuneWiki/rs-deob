import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class202 extends class168 {

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "[I")
    public static int[] field3122 = new int[1000];

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Lqv;")
    public static class316 field3123 = new class316(56, 6);

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "[[I")
    public static int[][] field3125 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "Lqt;")
    public static class459 field3126 = new class459(52, 7);

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Ljk;")
    public static class456 field3124;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nb", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field3127;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public static final void method1398(byte arg0) {
        if (class411.field5809 == 2) {
            class414.field5859 = 96;
        } else {
            try {
                Method var1 = (field3127 == null ? (field3127 = method1400("java.lang.Runtime")) : field3127).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class414.field5859 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var5) {
                    }
                }
            } catch (Exception var6) {
            }
        }
        int var4 = -90 / ((1 - arg0) / 54);
        field3121++;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
    public static void method1399(int arg0) {
        field3125 = null;
        field3123 = null;
        field3124 = null;
        field3126 = null;
        if (arg0 > -105) {
            field3122 = null;
        }
        field3122 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1400(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
