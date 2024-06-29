import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class489 {

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "Lvv;")
    public static class313 field7155 = new class313(24, -1);

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "Z")
    public static boolean field7157 = false;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field7151;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field7156;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "Li;")
    public class515 field7152;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "Le;")
    public class530 field7150;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BIIZI)Lqq;", line = 7)
    public static final class52 method2852(byte arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field7154++;
        class52 var5 = new class52();
        if (arg0 < 111) {
            field7156 = -90;
        }
        var5.field841 = arg4;
        var5.field843 = arg1;
        class259.field4346.method2517(var5, (long) arg2, (byte) 76);
        class387.method2426(1, arg4);
        class68 var6 = class22.method115(7521, arg2);
        if (var6 != null) {
            class396.method2476(var6, 1);
        }
        if (class402.field6122 != null) {
            class396.method2476(class402.field6122, 1);
            class402.field6122 = null;
        }
        class533.method3158(16);
        if (var6 != null) {
            class226.method1554(var6, -12295, !arg3);
        }
        if (!arg3) {
            class521.method3071(arg4);
        }
        if (!arg3 && class379.field5881 != -1) {
            class462.method2758(75, class379.field5881, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V", line = 46)
    public static void method2853(boolean arg0) {
        field7155 = null;
        if (arg0) {
            method2855((byte) 104);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(CB)Z", line = 56)
    public static final boolean method2854(char arg0, byte arg1) {
        field7153++;
        if (arg1 > -33) {
            field7156 = -99;
        }
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)Led;", line = 69)
    public static final class422 method2855(byte arg0) {
        field7151++;
        if (arg0 <= 70) {
            field7157 = true;
        }
        try {
            return (class422) Class.forName("rp").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
