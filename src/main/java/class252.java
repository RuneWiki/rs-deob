import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class252 extends class247 {

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    public int field4125;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public int field4123;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4128 = "Drop";

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V")
    public static void method1795(boolean arg0) {
        if (arg0) {
            field4128 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)I")
    public static final int method1796(int arg0, int arg1) {
        field4126++;
        if (arg1 < 56) {
            field4128 = null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lim;I)V")
    public static final void method1797(class170 arg0, int arg1) {
        field4127++;
        int var2 = arg0.method1162(-129);
        if (arg1 != 16722) {
            method1795(false);
        }
        class238.field3822 = new class271[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class238.field3822[var3] = new class271();
            class238.field3822[var3].field4411 = arg0.method1162(arg1 ^ 0xFFFFBE2D);
            class238.field3822[var3].field4413 = arg0.method1173(388826520);
        }
        class241.field3883 = arg0.method1162(arg1 ^ 0xFFFFBE2D);
        class287.field4641 = arg0.method1162(-129);
        class296.field4734 = arg0.method1162(-129);
        class61.field888 = new class210[class287.field4641 + 1 - class241.field3883];
        for (int var4 = 0; var4 < class296.field4734; var4++) {
            int var5 = arg0.method1162(arg1 ^ 0xFFFFBE2D);
            class210 var6 = class61.field888[var5] = new class210();
            var6.field3809 = arg0.method1218(78);
            var6.field3816 = arg0.method1190(6345);
            var6.field3273 = class241.field3883 + var5;
            var6.field3272 = arg0.method1173(arg1 + 388809798);
            var6.field3274 = arg0.method1173(388826520);
        }
        class39.field473 = arg0.method1190(6345);
        class287.field4644 = true;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(II)V")
    public class252(int arg0, int arg1) {
        this.field4125 = arg1;
        this.field4123 = arg0;
    }
}
