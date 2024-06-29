import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class147 {

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Lkh;")
    private class5 field2466 = new class5();

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    private int field2468;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    private int field2470;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Lwd;")
    private class97 field2467;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Lfc;")
    public static class92 field2475 = new class92(0, 0);

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Le;")
    private static class191 field2477 = class54.method368("skill)2", 2047);

    @OriginalMember(owner = "client!we", name = "o", descriptor = "[Z")
    public static boolean[] field2478 = new boolean[5];

    @OriginalMember(owner = "client!we", name = "p", descriptor = "[I")
    public static int[] field2479 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!we", name = "r", descriptor = "Le;")
    public static class191 field2481 = field2477;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "[[[I")
    public static int[][][] field2480;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public final void method985(int arg0) {
        if (arg0 != 0) {
            this.field2468 = -74;
        }
        field2472++;
        for (class142 var2 = (class142) this.field2466.method19(-1); var2 != null; var2 = (class142) this.field2466.method18(arg0 ^ 0xFFFFE0BF)) {
            if (var2.method936(125)) {
                var2.method655(arg0 ^ 0x3F);
                var2.method1124(0);
                this.field2468++;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
    public static void method986(int arg0) {
        field2477 = null;
        field2475 = null;
        field2479 = null;
        if (arg0 == 0) {
            field2480 = null;
            field2481 = null;
            field2478 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
    public final void method987(Object arg0, long arg1, int arg2) {
        field2469++;
        this.method994(123, arg1);
        if (this.field2468 == 0) {
            class142 var5 = (class142) this.field2466.method17(0);
            var5.method655(63);
            var5.method1124(0);
        } else {
            this.field2468--;
        }
        class172 var6 = new class172(arg0);
        this.field2467.method605(arg1, -3, var6);
        if (arg2 != -2438) {
            field2475 = null;
        }
        this.field2466.method22(arg2 ^ 0xFFFFF64F, var6);
        var6.field2825 = 0L;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
    public static final void method988(int arg0, int arg1) {
        field2471++;
        Container var2;
        if (class141.field2362 != null) {
            var2 = class141.field2362;
        } else if (class114.field1884 == null) {
            var2 = class167.field2820.field4379;
        } else {
            var2 = class114.field1884;
        }
        class133.field2240 = var2.getSize().width;
        class249.field4434 = var2.getSize().height;
        if (class114.field1884 == var2) {
            Insets var3 = class114.field1884.getInsets();
            class133.field2240 -= var3.left + var3.right;
            class249.field4434 -= var3.top + var3.bottom;
        }
        class118.field1941 = class213.field3764;
        class190.field3337 = 503;
        class17.field232 = (class133.field2240 - 765) / 2;
        class200.field3584 = 765;
        class51.field909.setSize(class200.field3584, class190.field3337);
        if (class114.field1884 == var2) {
            Insets var4 = class114.field1884.getInsets();
            class51.field909.setLocation(class17.field232 + var4.left, class118.field1941 + var4.top);
        } else {
            class51.field909.setLocation(class17.field232, class118.field1941);
        }
        if (~class130.field2166 != arg1) {
            class29.method206((byte) -98, true);
        }
        class119.method791((byte) 71);
        if (class247.field4375.startsWith("mac")) {
            class75.field1279 = (long) arg0 + class27.method198((byte) -118);
        }
        class33.field489 = class27.method198((byte) -128) + ((long) arg0);
        if (arg0 == 0 && class263.field4670 != null && class47.field836 == 30 || class47.field836 == 25) {
            class141.method927((byte) -59);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZII)V")
    public static final void method989(int arg0, boolean arg1, int arg2, int arg3) {
        field2474++;
        if (class30.field425 != 0 && arg3 != 0 && class249.field4422 < 50 && arg0 != -1) {
            class253.field4480[class249.field4422] = arg0;
            class245.field4355[class249.field4422] = arg3;
            class90.field1453[class249.field4422] = arg2;
            class129.field2149[class249.field4422] = null;
            class21.field287[class249.field4422] = 0;
            class249.field4422++;
        }
        if (!arg1) {
            field2477 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)V")
    public final void method990(int arg0, int arg1) {
        if (class1.field9 != null) {
            for (class142 var3 = (class142) this.field2466.method19(-1); var3 != null; var3 = (class142) this.field2466.method18(-8001)) {
                if (var3.method936(125)) {
                    if (var3.method937(-128) == null) {
                        var3.method655(63);
                        var3.method1124(0);
                        this.field2468++;
                    }
                } else if (((long) arg1) < (++var3.field2825)) {
                    class142 var4 = class1.field9.method7((byte) 86, var3);
                    this.field2467.method605(var3.field1713, -3, var4);
                    class256.method1774(var4, false, var3);
                    var3.method655(63);
                    var3.method1124(0);
                }
            }
        }
        field2464++;
        if (arg0 < 23) {
            field2481 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method991(long arg0, int arg1) {
        field2465++;
        class142 var4 = (class142) this.field2467.method612(arg0, true);
        if (var4 == null) {
            return null;
        }
        if (arg1 != -25858) {
            this.method991(-46L, -104);
        }
        Object var5 = var4.method937(arg1 + 25787);
        if (var5 == null) {
            var4.method655(63);
            var4.method1124(0);
            this.field2468++;
            return null;
        }
        if (var4.method936(127)) {
            class172 var6 = new class172(var5);
            this.field2467.method605(var4.field1713, -3, var6);
            this.field2466.method22(61, var6);
            var6.field2825 = 0L;
            var4.method655(63);
            var4.method1124(0);
        } else {
            this.field2466.method22(41, var4);
            var4.field2825 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(I)V")
    public class147(int arg0) {
        this.field2468 = arg0;
        this.field2470 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field2467 = new class97(var2);
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
    public final void method992(int arg0) {
        field2476++;
        this.field2466.method23(true);
        this.field2467.method613(0);
        this.field2468 = this.field2470;
        if (arg0 != -31) {
            this.method985(104);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V")
    public static final void method993(boolean arg0, int arg1) {
        field2483++;
        class241 var2 = class14.method97(12, arg1, -125);
        var2.method1691(0);
        if (!arg0) {
            field2482 = 77;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IJ)V")
    public final void method994(int arg0, long arg1) {
        if (arg0 < 118) {
            return;
        }
        field2473++;
        class142 var4 = (class142) this.field2467.method612(arg1, true);
        if (var4 != null) {
            var4.method655(63);
            var4.method1124(0);
            this.field2468++;
        }
    }
}
