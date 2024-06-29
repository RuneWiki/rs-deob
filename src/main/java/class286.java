import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class286 {

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "Lil;")
    public static class165 field4282 = new class165();

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field4283 = 0;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "[I")
    public static int[] field4284 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)V")
    public static final void method1880(int arg0, int arg1, int arg2, int arg3) {
        field4279++;
        class282.method1863(false, true);
        class295.field4682 = arg3;
        class154.field2310 = arg0;
        class76.method509(arg1, arg2 + 5650);
        if (arg2 != 1) {
            method1881((byte) 28, 121, -108, 64);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BIII)V")
    public static final void method1881(byte arg0, int arg1, int arg2, int arg3) {
        field4280++;
        if (arg0 <= 52) {
            method1881((byte) -57, -62, -74, 124);
        }
        class187 var4 = class120.method762((byte) -101, 9, arg1);
        var4.method1167(-123);
        var4.field2837 = arg2;
        var4.field2844 = arg3;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static final void method1882(byte arg0) {
        field4281++;
        int var1 = (class165.field2537.field2234 >> 7) + class147.field2141;
        class218.field3280 = 0;
        int var2 = (class165.field2537.field2251 >> 7) + class81.field1303;
        if (arg0 != 107) {
            field4283 = 28;
        }
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class218.field3280 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class218.field3280 = 1;
        }
        if (class218.field3280 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class218.field3280 = 0;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static void method1883(int arg0) {
        field4282 = null;
        field4284 = null;
        if (arg0 != 23980) {
            method1883(95);
        }
    }
}
