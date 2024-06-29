import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class122 extends class100 {

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Z")
    public boolean field2134 = false;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public int field2137 = 0;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "Z")
    private boolean field2138 = false;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Lik;")
    private class78 field2135 = new class78();

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    private int field2144 = 0;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "Lpu;")
    public class411 field2143 = new class411();

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
    private int field2152 = 0;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "Z")
    private boolean field2151 = false;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "Ld;")
    public class66 field2147 = new class66();

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "[Los;")
    public class185[] field2140 = new class185[8192];

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "J")
    private long field2136;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "J")
    private long field2141;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "[Z")
    private static boolean[] field2139 = new boolean[8];

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "[Z")
    private static boolean[] field2142 = new boolean[8];

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public int field2145;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public int field2146;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public int field2148;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    public int field2149;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
    public int field2150;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lza;[Lgh;Z)V")
    private final void method959(class491 arg0, class345[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field2139[var4] = false;
        }
        label64: for (class81 var5 = (class81) this.field2135.method573(24037); var5 != null; var5 = (class81) this.field2135.method576(14)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field1413 || arg1[var8].field5420 == var5.field1413) {
                        field2139[var8] = true;
                        var5.method591(true);
                        var5.field1432 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field1402 == 0) {
                    var5.method695(97);
                    this.field2144--;
                } else {
                    var5.field1432 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field2144 != 8; var6++) {
            if (!field2139[var6]) {
                class81 var7 = new class81(arg0, arg1[var6], this, this.field2136);
                this.field2135.method567(var7, 255);
                this.field2144++;
                field2139[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lza;J[Lgh;[Lhv;Z)V")
    public final void method960(class491 arg0, long arg1, class345[] arg2, class150[] arg3, boolean arg4) {
        if (!this.field2134) {
            this.method959(arg0, arg2, arg4);
            this.method969(arg3, arg4);
            this.field2136 = arg1;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "()V")
    private final void method961() {
        this.field2138 = false;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "()V")
    public final void method962() {
        this.field2138 = true;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lza;J)Z")
    public final boolean method963(class491 arg0, long arg1) {
        if (this.field2141 == this.field2136) {
            this.method961();
        } else {
            this.method962();
        }
        if (arg1 - this.field2136 > 750L) {
            this.method968();
            return false;
        }
        int var4 = (int) (arg1 - this.field2141);
        if (this.field2151) {
            for (class81 var5 = (class81) this.field2135.method573(24037); var5 != null; var5 = (class81) this.field2135.method576(14)) {
                for (int var6 = 0; var6 < var5.field1418.field2439; var6++) {
                    var5.method593(arg1, arg0, !this.field2138, true, 1);
                }
            }
            this.field2151 = false;
        }
        for (class81 var7 = (class81) this.field2135.method573(24037); var7 != null; var7 = (class81) this.field2135.method576(14)) {
            var7.method593(arg1, arg0, !this.field2138, true, var4);
        }
        this.field2141 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "()Ld;")
    public final class66 method964() {
        return this.field2147;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "()V")
    public static void method965() {
        field2139 = null;
        field2142 = null;
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "()V")
    public final void method966() {
        this.field2151 = true;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(J)V")
    public final void method967(long arg0) {
        this.field2136 = arg0;
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "()V")
    public final void method968() {
        this.field2134 = true;
        for (class282 var1 = (class282) this.field2143.method2538(-3); var1 != null; var1 = (class282) this.field2143.method2535((byte) -67)) {
            if (var1.field4613.field2041 == 1) {
                var1.method1799((byte) 102);
            }
        }
        this.field2140 = new class185[8192];
        this.field2137 = 0;
        this.field2135 = new class78();
        this.field2144 = 0;
        this.field2143 = new class411();
        this.field2152 = 0;
        this.method695(123);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([Lhv;Z)V")
    private final void method969(class150[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field2142[var3] = false;
        }
        label73: for (class282 var4 = (class282) this.field2143.method2538(-3); var4 != null; var4 = (class282) this.field2143.method2535((byte) -124)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field4610 || arg0[var7].field2408 == var4.field4610) {
                        field2142[var7] = true;
                        var4.method1846(3870);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method1821((byte) 118);
                this.field2152--;
                if (var4.method1803(-87)) {
                    var4.method1799((byte) 93);
                    class129.field2214--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field2152 != 8; var5++) {
            if (!field2142[var5]) {
                class282 var6 = null;
                if (arg0[var5].method1071(false).field2041 == 1 && class129.field2214 < 32) {
                    var6 = new class282(arg0[var5], this);
                    class253.field4307.method976((byte) -64, var6, (long) arg0[var5].field2411);
                    class129.field2214++;
                }
                if (var6 == null) {
                    var6 = new class282(arg0[var5], this);
                }
                this.field2143.method2541(0, var6);
                this.field2152++;
                field2142[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "()V")
    public final void method970() {
        this.field2147.field976.method2463(27274);
        for (class81 var1 = (class81) this.field2135.method573(24037); var1 != null; var1 = (class81) this.field2135.method576(14)) {
            var1.method590((byte) 88, this.field2141);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIII)V")
    public final void method971(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2146 = arg0;
        this.field2150 = arg1;
        this.field2148 = arg2;
        this.field2149 = arg3;
        this.field2145 = arg4;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
    public class122(int arg0) {
        class305.field4876.method567(this, 255);
        this.field2136 = arg0;
        this.field2141 = arg0;
        this.field2151 = true;
    }
}
