import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class385 extends class726 {

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Z")
    private boolean field5585 = false;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public int field5588 = 0;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "Z")
    public boolean field5582 = false;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "Ltca;")
    private class174 field5590 = new class174();

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
    private int field5592 = 0;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "Luh;")
    public class168 field5591 = new class168();

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "Z")
    public boolean field5594 = false;

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "I")
    private int field5597 = 0;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "Z")
    private boolean field5596 = false;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "Lmda;")
    public class266 field5593 = new class266();

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "[Lps;")
    public class97[] field5587 = new class97[8192];

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "[Z")
    private static boolean[] field5586 = new boolean[32];

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "[Z")
    private static boolean[] field5589 = new boolean[8];

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
    public int field5595;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "J")
    private long field5583;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "J")
    private long field5584;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "()Lmda;")
    public final class266 method2419() {
        return this.field5593;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZ)Luj;")
    public static final class385 method2420(int arg0, boolean arg1) {
        if (class533.field7337 == class347.field4864) {
            return new class385(arg0, arg1);
        } else {
            class385 var2 = class322.field4446[class347.field4864];
            class347.field4864 = class347.field4864 + 1 & class338.field4761[class667.field9109];
            var2.method2425(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "()V")
    public static void method2421() {
        field5586 = null;
        field5589 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lha;)V")
    public final void method2422(class59 arg0) {
        this.field5593.field3774.method3047((byte) 89);
        for (class434 var2 = (class434) this.field5590.method1301(8); var2 != null; var2 = (class434) this.field5590.method1307((byte) 126)) {
            var2.method2637(true, arg0, this.field5583);
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "()V")
    public final void method2423() {
        this.field5596 = true;
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "()V")
    public final void method2424() {
        this.field5582 = true;
        for (class336 var1 = (class336) this.field5591.method1269(4); var1 != null; var1 = (class336) this.field5591.method1264((byte) 89)) {
            if (var1.field4736.field7721 == 1) {
                var1.method115(true);
            }
        }
        for (int var2 = 0; var2 < this.field5587.length; var2++) {
            if (this.field5587[var2] != null) {
                this.field5587[var2].method909();
                this.field5587[var2] = null;
            }
        }
        this.field5588 = 0;
        this.field5590 = new class174();
        this.field5592 = 0;
        this.field5591 = new class168();
        this.field5597 = 0;
        this.method4018(false);
        class322.field4446[class533.field7337] = this;
        class533.field7337 = class533.field7337 + 1 & class338.field4761[class667.field9109];
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(IZ)V")
    private final void method2425(int arg0, boolean arg1) {
        class286.field3996.method1298(-88, this);
        this.field5584 = arg0;
        this.field5583 = arg0;
        this.field5596 = true;
        this.field5594 = arg1;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lha;[Lnn;Z)V")
    private final void method2426(class59 arg0, class417[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field5586[var4] = false;
        }
        label67: for (class434 var5 = (class434) this.field5590.method1301(8); var5 != null; var5 = (class434) this.field5590.method1307((byte) -28)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field6193 || arg1[var8].field6045 == var5.field6193) {
                        field5586[var8] = true;
                        var5.method2633(true);
                        var5.field6203 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field6204 == 0) {
                    var5.method4018(false);
                    this.field5592--;
                } else {
                    var5.field6203 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field5592 != 32; var6++) {
            if (!field5586[var6]) {
                class434 var7 = new class434(arg0, arg1[var6], this, this.field5584);
                this.field5590.method1298(-126, var7);
                this.field5592++;
                field5586[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V")
    public final void method2427(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5595 = arg0;
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "()V")
    public final void method2428() {
        this.field5585 = true;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lha;J)Z")
    public final boolean method2429(class59 arg0, long arg1) {
        if (this.field5584 == this.field5583) {
            this.method2431();
        } else {
            this.method2428();
        }
        if (arg1 - this.field5584 > 750L) {
            this.method2424();
            return false;
        }
        int var4 = (int) (arg1 - this.field5583);
        if (this.field5596) {
            for (class434 var5 = (class434) this.field5590.method1301(8); var5 != null; var5 = (class434) this.field5590.method1307((byte) 122)) {
                for (int var6 = 0; var6 < var5.field6198.field3264; var6++) {
                    var5.method2639(arg0, 1, arg1, 3, !this.field5585);
                }
            }
            this.field5596 = false;
        }
        for (class434 var7 = (class434) this.field5590.method1301(8); var7 != null; var7 = (class434) this.field5590.method1307((byte) -72)) {
            var7.method2639(arg0, var4, arg1, 3, !this.field5585);
        }
        this.field5583 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lha;J[Lnn;[Leca;Z)V")
    public final void method2430(class59 arg0, long arg1, class417[] arg2, class755[] arg3, boolean arg4) {
        if (!this.field5582) {
            this.method2426(arg0, arg2, arg4);
            this.method2432(arg3, arg4);
            this.field5584 = arg1;
        }
    }

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "()V")
    private final void method2431() {
        this.field5585 = false;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "([Leca;Z)V")
    private final void method2432(class755[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field5589[var3] = false;
        }
        label76: for (class336 var4 = (class336) this.field5591.method1269(4); var4 != null; var4 = (class336) this.field5591.method1264((byte) 85)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field4734 || arg0[var7].field10545 == var4.field4734) {
                        field5589[var7] = true;
                        var4.method2125(2);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method2314((byte) 108);
                this.field5597--;
                if (var4.method117((byte) 1)) {
                    var4.method115(true);
                    class434.field6207--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field5597 != 8; var5++) {
            if (!field5589[var5]) {
                class336 var6 = null;
                if (arg0[var5].method4215((byte) -13).field7721 == 1 && class434.field6207 < 32) {
                    var6 = new class336(arg0[var5], this);
                    class641.field8829.method1191(var6, -8098, (long) arg0[var5].field10542);
                    class434.field6207++;
                }
                if (var6 == null) {
                    var6 = new class336(arg0[var5], this);
                }
                this.field5591.method1273(var6, -20180);
                this.field5597++;
                field5589[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "()Lmda;")
    public final class266 method2433() {
        this.field5593.field3774.method3047((byte) 43);
        for (int var1 = 0; var1 < this.field5587.length; var1++) {
            if (this.field5587[var1] != null && this.field5587[var1].field1687 != null) {
                this.field5593.field3774.method3046(this.field5587[var1], true);
            }
        }
        return this.field5593;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(J)V")
    public final void method2434(long arg0) {
        this.field5584 = arg0;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(IZ)V")
    private class385(int arg0, boolean arg1) {
        this.method2425(arg0, arg1);
    }
}
