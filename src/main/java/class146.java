import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class146 {

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "[I")
    public static int[] field1790 = new int[13];

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field1791 = 0;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field1792 = 1;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "[I")
    public static int[] field1795 = new int[32];

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "[I")
    public static int[] field1789 = new int[4096];

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "Z")
    public static volatile boolean field1799;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "Lrr;")
    public static class202 field1798;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "Ltq;")
    public static class376 field1794;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
    public static final void method886(int arg0, int arg1) {
        field1793++;
        class237 var2 = class88.field1039;
        synchronized (class88.field1039) {
            if (arg1 != 1) {
                method888(true);
            }
            class88.field1039.method1629(arg0, 105);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V")
    public static final void method887(boolean arg0) {
        field1796++;
        if (!arg0) {
            class105.field1254.method1618(0);
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(Z)V")
    public static void method888(boolean arg0) {
        field1790 = null;
        field1794 = null;
        field1798 = null;
        field1795 = null;
        if (arg0) {
            field1789 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1789[var0] = class12.method84(var0, (byte) 40);
        }
        field1799 = true;
    }
}
