import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class626 extends class55 {

    @OriginalMember(owner = "client!paa", name = "k", descriptor = "Z")
    private boolean field8755 = false;

    @OriginalMember(owner = "client!paa", name = "o", descriptor = "Z")
    public boolean field8759 = false;

    @OriginalMember(owner = "client!paa", name = "m", descriptor = "I")
    public int field8757 = 0;

    @OriginalMember(owner = "client!paa", name = "n", descriptor = "Leia;")
    private class243 field8758 = new class243();

    @OriginalMember(owner = "client!paa", name = "s", descriptor = "I")
    private int field8763 = 0;

    @OriginalMember(owner = "client!paa", name = "t", descriptor = "Lada;")
    public class164 field8764 = new class164();

    @OriginalMember(owner = "client!paa", name = "v", descriptor = "Z")
    private boolean field8766 = false;

    @OriginalMember(owner = "client!paa", name = "w", descriptor = "I")
    private int field8767 = 0;

    @OriginalMember(owner = "client!paa", name = "y", descriptor = "Z")
    public boolean field8769 = false;

    @OriginalMember(owner = "client!paa", name = "u", descriptor = "Lof;")
    public class624 field8765 = new class624();

    @OriginalMember(owner = "client!paa", name = "q", descriptor = "[Lrs;")
    public class655[] field8761 = new class655[8192];

    @OriginalMember(owner = "client!paa", name = "l", descriptor = "[Z")
    private static boolean[] field8756 = new boolean[32];

    @OriginalMember(owner = "client!paa", name = "r", descriptor = "[Z")
    private static boolean[] field8762 = new boolean[8];

    @OriginalMember(owner = "client!paa", name = "x", descriptor = "I")
    public int field8768;

    @OriginalMember(owner = "client!paa", name = "j", descriptor = "J")
    private long field8754;

    @OriginalMember(owner = "client!paa", name = "p", descriptor = "J")
    private long field8760;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "()V")
    public final void method3602() {
        this.field8766 = true;
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "()Lof;")
    public final class624 method3603() {
        return this.field8765;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IZ)Lpaa;")
    public static final class626 method3604(int arg0, boolean arg1) {
        if (class756.field10587 == class699.field9637) {
            return new class626(arg0, arg1);
        } else {
            class626 var2 = class59.field840[class699.field9637];
            class699.field9637 = class699.field9637 + 1 & class490.field7000[class34.field352];
            var2.method3612(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "()V")
    public final void method3605() {
        this.field8755 = true;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lha;J[Lwr;[Lol;Z)V")
    public final void method3606(class60 arg0, long arg1, class459[] arg2, class285[] arg3, boolean arg4) {
        if (!this.field8759) {
            this.method3607(arg0, arg2, arg4);
            this.method3611(arg3, arg4);
            this.field8760 = arg1;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lha;[Lwr;Z)V")
    private final void method3607(class60 arg0, class459[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field8756[var4] = false;
        }
        label67: for (class79 var5 = (class79) this.field8758.method1615((byte) 72); var5 != null; var5 = (class79) this.field8758.method1625(-100)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field1101 || arg1[var8].field6762 == var5.field1101) {
                        field8756[var8] = true;
                        var5.method644(86);
                        var5.field1113 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field1107 == 0) {
                    var5.method385((byte) -63);
                    this.field8763--;
                } else {
                    var5.field1113 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field8763 != 32; var6++) {
            if (!field8756[var6]) {
                class79 var7 = new class79(arg0, arg1[var6], this, this.field8760);
                this.field8758.method1616(22437, var7);
                this.field8763++;
                field8756[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIIII)V")
    public final void method3608(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8768 = arg0;
    }

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "()V")
    public static void method3609() {
        field8756 = null;
        field8762 = null;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lha;)V")
    public final void method3610(class60 arg0) {
        this.field8765.field8738.method2544(-40);
        for (class79 var2 = (class79) this.field8758.method1615((byte) 125); var2 != null; var2 = (class79) this.field8758.method1625(-112)) {
            var2.method643(arg0, -126, this.field8754);
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "([Lol;Z)V")
    private final void method3611(class285[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field8762[var3] = false;
        }
        label76: for (class462 var4 = (class462) this.field8764.method1195(0); var4 != null; var4 = (class462) this.field8764.method1201(2)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field6809 || arg0[var7].field4054 == var4.field6809) {
                        field8762[var7] = true;
                        var4.method2817(28159);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method1304((byte) 7);
                this.field8767--;
                if (var4.method2595(88)) {
                    var4.method2597(89);
                    class162.field2580--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field8767 != 8; var5++) {
            if (!field8762[var5]) {
                class462 var6 = null;
                if (arg0[var5].method1824(-100).field10389 == 1 && class162.field2580 < 32) {
                    var6 = new class462(arg0[var5], this);
                    class624.field8739.method664((long) arg0[var5].field4050, true, var6);
                    class162.field2580++;
                }
                if (var6 == null) {
                    var6 = new class462(arg0[var5], this);
                }
                this.field8764.method1203(var6, (byte) 95);
                this.field8767++;
                field8762[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(IZ)V")
    private final void method3612(int arg0, boolean arg1) {
        class493.field7031.method1616(22437, this);
        this.field8760 = arg0;
        this.field8754 = arg0;
        this.field8766 = true;
        this.field8769 = arg1;
    }

    @OriginalMember(owner = "client!paa", name = "e", descriptor = "()V")
    public final void method3613() {
        this.field8759 = true;
        for (class462 var1 = (class462) this.field8764.method1195(0); var1 != null; var1 = (class462) this.field8764.method1201(2)) {
            if (var1.field6811.field10389 == 1) {
                var1.method2597(-110);
            }
        }
        for (int var2 = 0; var2 < this.field8761.length; var2++) {
            if (this.field8761[var2] != null) {
                this.field8761[var2].method3791();
                this.field8761[var2] = null;
            }
        }
        this.field8757 = 0;
        this.field8758 = new class243();
        this.field8763 = 0;
        this.field8764 = new class164();
        this.field8767 = 0;
        this.method385((byte) -44);
        class59.field840[class756.field10587] = this;
        class756.field10587 = class756.field10587 + 1 & class490.field7000[class34.field352];
    }

    @OriginalMember(owner = "client!paa", name = "f", descriptor = "()Lof;")
    public final class624 method3614() {
        this.field8765.field8738.method2544(-53);
        for (int var1 = 0; var1 < this.field8761.length; var1++) {
            if (this.field8761[var1] != null && this.field8761[var1].field9190 != null) {
                this.field8765.field8738.method2539(this.field8761[var1], 0);
            }
        }
        return this.field8765;
    }

    @OriginalMember(owner = "client!paa", name = "g", descriptor = "()V")
    private final void method3615() {
        this.field8755 = false;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lha;J)Z")
    public final boolean method3616(class60 arg0, long arg1) {
        if (this.field8760 == this.field8754) {
            this.method3615();
        } else {
            this.method3605();
        }
        if (arg1 - this.field8760 > 750L) {
            this.method3613();
            return false;
        }
        int var4 = (int) (arg1 - this.field8754);
        if (this.field8766) {
            for (class79 var5 = (class79) this.field8758.method1615((byte) 102); var5 != null; var5 = (class79) this.field8758.method1625(-104)) {
                for (int var6 = 0; var6 < var5.field1099.field7321; var6++) {
                    var5.method645(!this.field8755, false, 1, arg0, arg1);
                }
            }
            this.field8766 = false;
        }
        for (class79 var7 = (class79) this.field8758.method1615((byte) 108); var7 != null; var7 = (class79) this.field8758.method1625(-38)) {
            var7.method645(!this.field8755, false, var4, arg0, arg1);
        }
        this.field8754 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(J)V")
    public final void method3617(long arg0) {
        this.field8760 = arg0;
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(IZ)V")
    private class626(int arg0, boolean arg1) {
        this.method3612(arg0, arg1);
    }
}
