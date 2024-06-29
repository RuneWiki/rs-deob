import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class114 extends class165 {

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "I")
    private int field2045;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    private int field2041;

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "I")
    private int field2049;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    private int field2047;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    private int field2040;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
    private int field2043;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "Lcf;")
    private class562 field2039;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "Lsl;")
    public static class427 field2042 = new class427(16);

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "Lja;")
    public static class254 field2050 = new class254(12, 0, 1, 0);

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
    public static int field2051 = 1;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "Ldp;")
    public static class3 field2046;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "Lpu;")
    private class524 field2048;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(Z)V")
    public static void method1015(boolean arg0) {
        field2050 = null;
        field2046 = null;
        if (arg0) {
            field2042 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)Lpu;")
    public final class524 method1016(byte arg0) {
        if (arg0 >= -32) {
            this.field2047 = 85;
        }
        field2044++;
        if (this.field2048 == null) {
            class330.field4822[0] = this.field2047;
            class330.field4822[1] = this.field2041;
            class214 var2 = this.field2039.field2768;
            class330.field4822[4] = this.field2040;
            class330.field4822[2] = this.field2045;
            class330.field4822[3] = this.field2049;
            class330.field4822[5] = this.field2043;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1499(class330.field4822[var5], -24052)) {
                    return null;
                }
                class699 var7 = var2.method1500(class330.field4822[var5], -19);
                int var8 = var7.field9836 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field9842 > 0) {
                    var3 = 1;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class396.field5777[var6] = var2.method1495(class330.field4822[var6], false, 1.0F, var4, var4, 32682);
            }
            this.field2048 = this.field2039.method2844(var3 != 0, class396.field5777, var4, 37);
        }
        return this.field2048;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lcf;IIIIII)V")
    public class114(class562 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2045 = arg3;
        this.field2041 = arg2;
        this.field2049 = arg4;
        this.field2047 = arg1;
        this.field2040 = arg5;
        this.field2043 = arg6;
        this.field2039 = arg0;
    }
}
