import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class401 extends class25 {

    @OriginalMember(owner = "client!io", name = "n", descriptor = "I")
    public int field5574 = 0;

    @OriginalMember(owner = "client!io", name = "l", descriptor = "Z")
    private boolean field5572 = false;

    @OriginalMember(owner = "client!io", name = "j", descriptor = "Z")
    public boolean field5570 = false;

    @OriginalMember(owner = "client!io", name = "o", descriptor = "Lwn;")
    private class663 field5575 = new class663();

    @OriginalMember(owner = "client!io", name = "r", descriptor = "I")
    private int field5578 = 0;

    @OriginalMember(owner = "client!io", name = "q", descriptor = "Lsu;")
    public class192 field5577 = new class192();

    @OriginalMember(owner = "client!io", name = "v", descriptor = "Z")
    public boolean field5582 = false;

    @OriginalMember(owner = "client!io", name = "s", descriptor = "Z")
    private boolean field5579 = false;

    @OriginalMember(owner = "client!io", name = "A", descriptor = "I")
    private int field5587 = 0;

    @OriginalMember(owner = "client!io", name = "y", descriptor = "Lhfa;")
    public class281 field5585 = new class281();

    @OriginalMember(owner = "client!io", name = "k", descriptor = "[Lfb;")
    public class619[] field5571 = new class619[8192];

    @OriginalMember(owner = "client!io", name = "h", descriptor = "[Z")
    private static boolean[] field5568 = new boolean[32];

    @OriginalMember(owner = "client!io", name = "p", descriptor = "[Z")
    private static boolean[] field5576 = new boolean[8];

    @OriginalMember(owner = "client!io", name = "t", descriptor = "I")
    public int field5580;

    @OriginalMember(owner = "client!io", name = "u", descriptor = "I")
    public int field5581;

    @OriginalMember(owner = "client!io", name = "w", descriptor = "I")
    public int field5583;

    @OriginalMember(owner = "client!io", name = "x", descriptor = "I")
    public int field5584;

    @OriginalMember(owner = "client!io", name = "z", descriptor = "I")
    public int field5586;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "J")
    private long field5569;

    @OriginalMember(owner = "client!io", name = "m", descriptor = "J")
    private long field5573;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "()Lhfa;", line = 3)
    public final class281 method2276() {
        this.field5585.field3924.method2220(-25594);
        for (int var1 = 0; var1 < this.field5571.length; var1++) {
            if (this.field5571[var1] != null && this.field5571[var1].field8555 != null) {
                this.field5585.field3924.method2219(true, this.field5571[var1]);
            }
        }
        return this.field5585;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IZ)Lio;", line = 18)
    public static final class401 method2277(int arg0, boolean arg1) {
        if (class627.field8754 == class105.field1408) {
            return new class401(arg0, arg1);
        } else {
            class401 var2 = class632.field8852[class105.field1408];
            class105.field1408 = class105.field1408 + 1 & class342.field4964[class684.field9621];
            var2.method2286(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIII)V", line = 31)
    public final void method2278(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5581 = arg0;
        this.field5584 = arg1;
        this.field5580 = arg2;
        this.field5586 = arg3;
        this.field5583 = arg4;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "()V", line = 38)
    public final void method2279() {
        this.field5570 = true;
        for (class143 var1 = (class143) this.field5577.method1270((byte) -25); var1 != null; var1 = (class143) this.field5577.method1282(0)) {
            if (var1.field2132.field5561 == 1) {
                var1.method3691((byte) -119);
            }
        }
        for (int var2 = 0; var2 < this.field5571.length; var2++) {
            if (this.field5571[var2] != null) {
                this.field5571[var2].method3441();
                this.field5571[var2] = null;
            }
        }
        this.field5574 = 0;
        this.field5575 = new class663();
        this.field5578 = 0;
        this.field5577 = new class192();
        this.field5587 = 0;
        this.method118(-30545);
        class632.field8852[class627.field8754] = this;
        class627.field8754 = class627.field8754 + 1 & class342.field4964[class684.field9621];
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(J)V", line = 77)
    public final void method2280(long arg0) {
        this.field5569 = arg0;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Loa;J[Lbh;[Lvp;Z)V", line = 85)
    public final void method2281(class638 arg0, long arg1, class34[] arg2, class171[] arg3, boolean arg4) {
        if (!this.field5570) {
            this.method2287(arg0, arg2, arg4);
            this.method2282(arg3, arg4);
            this.field5569 = arg1;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "([Lvp;Z)V", line = 95)
    private final void method2282(class171[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field5576[var3] = false;
        }
        label76: for (class143 var4 = (class143) this.field5577.method1270((byte) -25); var4 != null; var4 = (class143) this.field5577.method1282(0)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field2126 || arg0[var7].field2561 == var4.field2126) {
                        field5576[var7] = true;
                        var4.method1007(122);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method2971(1);
                this.field5587--;
                if (var4.method3692(-26210)) {
                    var4.method3691((byte) -119);
                    class500.field6863--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field5587 != 8; var5++) {
            if (!field5576[var5]) {
                class143 var6 = null;
                if (arg0[var5].method1173(-91).field5561 == 1 && class500.field6863 < 32) {
                    var6 = new class143(arg0[var5], this);
                    class552.field7475.method1608(var6, false, (long) arg0[var5].field2568);
                    class500.field6863++;
                }
                if (var6 == null) {
                    var6 = new class143(arg0[var5], this);
                }
                this.field5577.method1273(var6, (byte) 122);
                this.field5587++;
                field5576[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "()V", line = 183)
    public static void method2283() {
        field5568 = null;
        field5576 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Loa;)V", line = 187)
    public final void method2284(class638 arg0) {
        this.field5585.field3924.method2220(-25594);
        for (class605 var2 = (class605) this.field5575.method3676((byte) 95); var2 != null; var2 = (class605) this.field5575.method3682(-18176)) {
            var2.method3349(this.field5573, (byte) -37, arg0);
        }
    }

    @OriginalMember(owner = "client!io", name = "d", descriptor = "()V", line = 199)
    private final void method2285() {
        this.field5572 = false;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(IZ)V", line = 202)
    private final void method2286(int arg0, boolean arg1) {
        class381.field5356.method3679(this, 0);
        this.field5569 = arg0;
        this.field5573 = arg0;
        this.field5579 = true;
        this.field5582 = arg1;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Loa;[Lbh;Z)V", line = 211)
    private final void method2287(class638 arg0, class34[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field5568[var4] = false;
        }
        label67: for (class605 var5 = (class605) this.field5575.method3676((byte) -60); var5 != null; var5 = (class605) this.field5575.method3682(-18176)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field8422 || arg1[var8].field413 == var5.field8422) {
                        field5568[var8] = true;
                        var5.method3353(-1);
                        var5.field8436 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field8414 == 0) {
                    var5.method118(-30545);
                    this.field5578--;
                } else {
                    var5.field8436 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field5578 != 32; var6++) {
            if (!field5568[var6]) {
                class605 var7 = new class605(arg0, arg1[var6], this, this.field5569);
                this.field5575.method3679(var7, 0);
                this.field5578++;
                field5568[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "e", descriptor = "()Lhfa;", line = 286)
    public final class281 method2288() {
        return this.field5585;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(IZ)V", line = 390)
    private class401(int arg0, boolean arg1) {
        this.method2286(arg0, arg1);
    }

    @OriginalMember(owner = "client!io", name = "f", descriptor = "()V", line = 292)
    public final void method2289() {
        this.field5579 = true;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Loa;J)Z", line = 308)
    public final boolean method2290(class638 arg0, long arg1) {
        if (this.field5573 == this.field5569) {
            this.method2285();
        } else {
            this.method2291();
        }
        if (arg1 - this.field5569 > 750L) {
            this.method2279();
            return false;
        }
        int var4 = (int) (arg1 - this.field5573);
        if (this.field5579) {
            for (class605 var5 = (class605) this.field5575.method3676((byte) -97); var5 != null; var5 = (class605) this.field5575.method3682(-18176)) {
                for (int var6 = 0; var6 < var5.field8430.field3377; var6++) {
                    var5.method3348(arg1, 70, 1, !this.field5572, arg0);
                }
            }
            this.field5579 = false;
        }
        for (class605 var7 = (class605) this.field5575.method3676((byte) 103); var7 != null; var7 = (class605) this.field5575.method3682(-18176)) {
            var7.method3348(arg1, 45, var4, !this.field5572, arg0);
        }
        this.field5573 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!io", name = "g", descriptor = "()V", line = 356)
    public final void method2291() {
        this.field5572 = true;
    }
}
