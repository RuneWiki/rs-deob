import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class147 extends class390 {

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "Z")
    public boolean field2130 = false;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "Z")
    private boolean field2133 = false;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public int field2136 = 0;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "Lre;")
    private class357 field2132 = new class357();

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    private int field2138 = 0;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "Ltc;")
    public class196 field2137 = new class196();

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    private int field2140 = 0;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "Z")
    private boolean field2141 = false;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "Lqd;")
    public class260 field2143 = new class260();

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "[Lmp;")
    public class452[] field2131 = new class452[8192];

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "J")
    private long field2135;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "J")
    private long field2134;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "[Z")
    private static boolean[] field2128 = new boolean[8];

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "[Z")
    private static boolean[] field2129 = new boolean[8];

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    public int field2139;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    public int field2142;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    public int field2144;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
    public int field2145;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "()V")
    public final void method1004() {
        this.field2133 = true;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Laa;J[Lpd;[Lhp;Z)V")
    public final void method1005(class281 arg0, long arg1, class140[] arg2, class179[] arg3, boolean arg4) {
        if (!this.field2130) {
            this.method1016(arg0, arg2, arg4);
            this.method1010(arg3, arg4);
            this.field2135 = arg1;
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "()V")
    public final void method1006() {
        this.field2130 = true;
        for (class157 var1 = (class157) this.field2137.method1312((byte) 25); var1 != null; var1 = (class157) this.field2137.method1304(104)) {
            if (var1.field2220.field2252 == 1) {
                var1.method2788((byte) -126);
            }
        }
        this.field2131 = new class452[8192];
        this.field2136 = 0;
        this.field2132 = new class357();
        this.field2138 = 0;
        this.field2137 = new class196();
        this.field2140 = 0;
        this.method2552(-1);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIII)V")
    public final void method1007(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2145 = arg0;
        this.field2144 = arg1;
        this.field2139 = arg3;
        this.field2142 = arg4;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Laa;J)Z")
    public final boolean method1008(class281 arg0, long arg1) {
        if (this.field2135 == this.field2134) {
            this.method1013();
        } else {
            this.method1004();
        }
        if (arg1 - this.field2135 > 750L) {
            this.method1006();
            return false;
        }
        int var4 = (int) (arg1 - this.field2134);
        if (this.field2141) {
            for (class287 var5 = (class287) this.field2132.method2307(false); var5 != null; var5 = (class287) this.field2132.method2311(-5116)) {
                for (int var6 = 0; var6 < var5.field3968.field1436; var6++) {
                    var5.method1853(arg0, arg1, 1, 2410, !this.field2133);
                }
            }
            this.field2141 = false;
        }
        for (class287 var7 = (class287) this.field2132.method2307(false); var7 != null; var7 = (class287) this.field2132.method2311(-5116)) {
            var7.method1853(arg0, arg1, var4, 2410, !this.field2133);
        }
        this.field2134 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "()V")
    public static void method1009() {
        field2129 = null;
        field2128 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([Lhp;Z)V")
    private final void method1010(class179[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field2128[var3] = false;
        }
        label73: for (class157 var4 = (class157) this.field2137.method1312((byte) 25); var4 != null; var4 = (class157) this.field2137.method1304(106)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field2222 || arg0[var7].field2509 == var4.field2222) {
                        field2128[var7] = true;
                        var4.method1055(2);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method2459(198);
                this.field2140--;
                if (var4.method2787((byte) 98)) {
                    var4.method2788((byte) -91);
                    class339.field4743--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field2140 != 8; var5++) {
            if (!field2128[var5]) {
                class157 var6 = null;
                if (class54.method368(arg0[var5].field2512, (byte) 110).field2252 == 1 && class339.field4743 < 32) {
                    var6 = new class157(arg0[var5], this);
                    class398.field5816.method950((long) arg0[var5].field2512, var6, -128);
                    class339.field4743++;
                }
                if (var6 == null) {
                    var6 = new class157(arg0[var5], this);
                }
                this.field2137.method1301(50, var6);
                this.field2140++;
                field2128[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "()V")
    public final void method1011() {
        this.field2143.field3559.method2771(false);
        for (class287 var1 = (class287) this.field2132.method2307(false); var1 != null; var1 = (class287) this.field2132.method2311(-5116)) {
            var1.method1857((byte) 92, this.field2134);
        }
    }

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "()V")
    public final void method1012() {
        this.field2141 = true;
    }

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "()V")
    private final void method1013() {
        this.field2133 = false;
    }

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "()Lqd;")
    public final class260 method1014() {
        return this.field2143;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(J)V")
    public final void method1015(long arg0) {
        this.field2135 = arg0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Laa;[Lpd;Z)V")
    private final void method1016(class281 arg0, class140[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field2129[var4] = false;
        }
        label64: for (class287 var5 = (class287) this.field2132.method2307(false); var5 != null; var5 = (class287) this.field2132.method2311(-5116)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field3977 || arg1[var8].field1984 == var5.field3977) {
                        field2129[var8] = true;
                        var5.method1852(-66);
                        var5.field3971 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field3954 == 0) {
                    var5.method2552(-1);
                    this.field2138--;
                } else {
                    var5.field3971 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field2138 != 8; var6++) {
            if (!field2129[var6]) {
                class287 var7 = new class287(arg0, arg1[var6], this, this.field2135);
                this.field2132.method2310(var7, -12918);
                this.field2138++;
                field2129[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(I)V")
    public class147(int arg0) {
        class196.field2721.method2310(this, -12918);
        this.field2135 = (long) arg0;
        this.field2134 = (long) arg0;
        this.field2141 = true;
    }
}
