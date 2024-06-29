import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class166 extends class31 {

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "[I")
    public static int[] field2041 = new int[1];

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!ru", name = "p", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "Ldm;")
    public static class46 field2040;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ru", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field2043;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIII)Z")
    public static final boolean method960(int arg0, int arg1, int arg2, int arg3) {
        field2042++;
        class57 var4 = (class57) class491.method2948(arg1, arg0, arg3);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class575.method3339(var4, arg2 ^ 0xFFFF9176);
        }
        class57 var6 = (class57) class226.method1473(arg1, arg0, arg3, field2043 == null ? (field2043 = method962("qn")) : field2043);
        if (arg2 != 28412) {
            method960(121, -25, -125, 42);
        }
        if (var6 != null) {
            var5 &= class575.method3339(var6, -46);
        }
        class57 var7 = (class57) class157.method911(arg1, arg0, arg3);
        if (var7 != null) {
            var5 &= class575.method3339(var7, -106);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)V")
    public static void method961(int arg0) {
        field2041 = null;
        if (arg0 >= -66) {
            field2040 = null;
        }
        field2040 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method962(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
