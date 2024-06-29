import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class91 extends class383 {

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Lub;")
    public class18 field1112 = new class18();

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Lkg;")
    public static class179 field1111 = new class179(49, 6);

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "[[I")
    public static int[][] field1118 = new int[6][];

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "Ljk;")
    public static class449 field1117 = new class449(8);

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "Lla;")
    public static class316 field1116;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cg", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field1119;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public static final void method709(byte arg0) {
        field1115++;
        try {
            if (arg0 <= 119) {
                method710(58);
            }
            Method var1 = (field1119 == null ? (field1119 = method713("java.lang.Runtime")) : field1119).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class323.field4104 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method710(int arg0) {
        if (arg0 != -1) {
            field1118 = null;
        }
        field1118 = null;
        field1111 = null;
        field1116 = null;
        field1117 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Lis;")
    public static final class348 method711(int arg0, int arg1, int arg2) {
        field1114++;
        class348 var3 = new class348();
        var3.field4467 = arg1 + 1 - arg2;
        var3.field4478 = -1;
        var3.field4464 = -1;
        var3.field4474 = arg0 + 6;
        var3.field4465 = new int[var3.field4474][var3.field4467];
        var3.method2004(-1);
        return var3;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIZIZ)V")
    public static final void method712(int arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field1113++;
        if (class450.method2649(arg1, 21182)) {
            if (arg2) {
                method711(-1, -12, -56);
            }
            class126.method888(arg0, class293.field3725[arg1], arg3, 0, arg4, -1);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method713(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
