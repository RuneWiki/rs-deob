import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class171 {

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public int field2133 = 0;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "[Lpfa;")
    public static class298[] field2130 = new class298[4];

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field2136 = -1;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field2132 = 0;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Lkba;")
    public static class108 field2134 = new class108();

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field2135;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lji;I)V", line = 6)
    public final void method990(class611 arg0, int arg1) {
        field2138++;
        while (true) {
            int var3 = arg0.method3428((byte) 80);
            if (var3 == 0) {
                if (arg1 == -2) {
                    return;
                } else {
                    this.method990(null, -116);
                    return;
                }
            }
            this.method993(var3, arg0, arg1 ^ 0xFFFFFFFC);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V", line = 26)
    public static void method991(byte arg0) {
        field2134 = null;
        field2135 = null;
        field2130 = null;
        if (arg0 < 82) {
            method991((byte) -25);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lgg;ZZ)V", line = 43)
    public static final void method992(class176 arg0, boolean arg1, boolean arg2) {
        arg0.field2168 = arg2;
        if (!class181.field2224) {
            class652.method3679(arg0, class625.field8747);
        } else if (arg1) {
            class293.field3923[class293.field3923.length - 1].method3638(arg0, 0);
        } else {
            int var3 = class545.method3093(arg0.field2172);
            int var4 = class735.field10258[2] * arg0.method128(false) / arg0.field2169;
            int var5 = class545.method3093(arg0.field2172 - var4);
            int var6 = class545.method3093(arg0.field2172 + var4);
            if (var5 == var6) {
                class293.field3923[var3].method3638(arg0, 0);
            } else if (var6 - var5 == 1) {
                class293.field3923[class360.field4767 + var5].method3638(arg0, 0);
            } else {
                class293.field3923[class293.field3923.length - 1].method3638(arg0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILji;I)V", line = 88)
    private final void method993(int arg0, class611 arg1, int arg2) {
        field2137++;
        if (arg0 == 5) {
            this.field2133 = arg1.method3402((byte) 127);
        }
        if (arg2 != 2) {
            method994(null, -110);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 110)
    public static final byte[] method994(String arg0, int arg1) {
        field2131++;
        int var2 = arg0.length();
        if (var2 == 0) {
            return new byte[0];
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if (arg1 != 12705) {
            return null;
        }
        if (var2 <= (var3 - 2) || class249.method1492(112, arg0.charAt(var3 - 2)) == -1) {
            var4 -= 2;
        } else if (var2 <= (var3 - 1) || class249.method1492(74, arg0.charAt(var3 - 1)) == -1) {
            var4--;
        }
        byte[] var5 = new byte[var4];
        class197.method1095(0, var5, false, arg0);
        return var5;
    }
}
