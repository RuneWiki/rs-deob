import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class270 extends class181 {

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "[I")
    public int[] field4213 = new int[] { -1 };

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "[I")
    public int[] field4216 = new int[1];

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "[Lwg;")
    public static class220[] field4214 = new class220[14];

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "[I")
    public static int[] field4215 = new int[4096];

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "Lhl;")
    public static class139 field4217;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "Lki;")
    public static class158 field4219;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V")
    public static void method1817(int arg0) {
        field4217 = null;
        field4219 = null;
        if (arg0 != -6503) {
            method1819(-38);
        }
        field4214 = null;
        field4215 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(CZ)Z")
    public static final boolean method1818(char arg0, boolean arg1) {
        field4210++;
        if (arg1) {
            field4219 = null;
        }
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)Lha;")
    public static final class182 method1819(int arg0) {
        field4211++;
        try {
            return arg0 == -12513 ? (class182) Class.forName("ac").getDeclaredConstructor().newInstance() : null;
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(B)V")
    public static final void method1820(byte arg0) {
        if (arg0 <= 122) {
            field4219 = null;
        }
        field4209++;
        if (!class50.field820 && class146.field2119 != 2) {
            try {
                class238.method1634("tbrefresh", (byte) -113, class163.field2378);
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(B)V")
    public static final void method1821(byte arg0) {
        field4212++;
        class4.field53.method940(15);
        class237.field3673.method940(26);
        int var1 = 27 / ((arg0 - 63) / 36);
        class59.field975.method940(51);
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4215[var0] = class213.method1436(11818, var0);
        }
        field4217 = new class139(4);
    }
}
