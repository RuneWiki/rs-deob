import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class684 extends class426 {

    @OriginalMember(owner = "client!au", name = "o", descriptor = "Z")
    private boolean field9767 = false;

    @OriginalMember(owner = "client!au", name = "u", descriptor = "I")
    public int field9773 = 0;

    @OriginalMember(owner = "client!au", name = "t", descriptor = "Z")
    public boolean field9772 = false;

    @OriginalMember(owner = "client!au", name = "r", descriptor = "Lhf;")
    private class363 field9770 = new class363();

    @OriginalMember(owner = "client!au", name = "x", descriptor = "I")
    private int field9776 = 0;

    @OriginalMember(owner = "client!au", name = "w", descriptor = "Loe;")
    public class183 field9775 = new class183();

    @OriginalMember(owner = "client!au", name = "z", descriptor = "Z")
    public boolean field9778 = false;

    @OriginalMember(owner = "client!au", name = "C", descriptor = "I")
    private int field9781 = 0;

    @OriginalMember(owner = "client!au", name = "A", descriptor = "Z")
    private boolean field9779 = false;

    @OriginalMember(owner = "client!au", name = "B", descriptor = "Lso;")
    public class436 field9780 = new class436();

    @OriginalMember(owner = "client!au", name = "p", descriptor = "[La;")
    public class572[] field9768 = new class572[8192];

    @OriginalMember(owner = "client!au", name = "q", descriptor = "[Z")
    private static boolean[] field9769 = new boolean[32];

    @OriginalMember(owner = "client!au", name = "s", descriptor = "[Z")
    private static boolean[] field9771 = new boolean[8];

    @OriginalMember(owner = "client!au", name = "y", descriptor = "I")
    public int field9777;

    @OriginalMember(owner = "client!au", name = "n", descriptor = "J")
    private long field9766;

    @OriginalMember(owner = "client!au", name = "v", descriptor = "J")
    private long field9774;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "()Lso;", line = 3)
    public final class436 method3866() {
        this.field9780.field6248.method871((byte) 125);
        for (int var1 = 0; var1 < this.field9768.length; var1++) {
            if (this.field9768[var1] != null && this.field9768[var1].field8354 != null) {
                this.field9780.field6248.method870(this.field9768[var1], (byte) 106);
            }
        }
        return this.field9780;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IZ)V", line = 26)
    private final void method3867(int arg0, boolean arg1) {
        class24.field580.method2071((byte) -76, this);
        this.field9774 = arg0;
        this.field9766 = arg0;
        this.field9779 = true;
        this.field9778 = arg1;
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(IZ)V", line = 394)
    private class684(int arg0, boolean arg1) {
        this.method3867(arg0, arg1);
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "()V", line = 37)
    public static void method3868() {
        field9769 = null;
        field9771 = null;
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "()Lso;", line = 41)
    public final class436 method3869() {
        return this.field9780;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Lr;[Lnba;Z)V", line = 46)
    private final void method3870(class165 arg0, class271[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field9769[var4] = false;
        }
        label67: for (class131 var5 = (class131) this.field9770.method2070((byte) 119); var5 != null; var5 = (class131) this.field9770.method2068(-2001)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field1674 || arg1[var8].field3699 == var5.field1674) {
                        field9769[var8] = true;
                        var5.method886(32605);
                        var5.field1663 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field1666 == 0) {
                    var5.method2564((byte) 2);
                    this.field9776--;
                } else {
                    var5.field1663 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field9776 != 32; var6++) {
            if (!field9769[var6]) {
                class131 var7 = new class131(arg0, arg1[var6], this, this.field9774);
                this.field9770.method2071((byte) 74, var7);
                this.field9776++;
                field9769[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "([Lfk;Z)V", line = 123)
    private final void method3871(class604[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field9771[var3] = false;
        }
        label76: for (class355 var4 = (class355) this.field9775.method1132((byte) -86); var4 != null; var4 = (class355) this.field9775.method1134(8446)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field4745 || arg0[var7].field8706 == var4.field4745) {
                        field9771[var7] = true;
                        var4.method2003((byte) -124);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method3045(true);
                this.field9781--;
                if (var4.method1035((byte) -61)) {
                    var4.method1037(-112);
                    class496.field6931--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field9781 != 8; var5++) {
            if (!field9771[var5]) {
                class355 var6 = null;
                if (arg0[var5].method3481(4).field9971 == 1 && class496.field6931 < 32) {
                    var6 = new class355(arg0[var5], this);
                    class470.field6570.method2206(var6, 1, (long) arg0[var5].field8701);
                    class496.field6931++;
                }
                if (var6 == null) {
                    var6 = new class355(arg0[var5], this);
                }
                this.field9775.method1129(var6, 262144);
                this.field9781++;
                field9771[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Lr;)V", line = 214)
    public final void method3872(class165 arg0) {
        this.field9780.field6248.method871((byte) 125);
        for (class131 var2 = (class131) this.field9770.method2070((byte) 105); var2 != null; var2 = (class131) this.field9770.method2068(-2001)) {
            var2.method884(this.field9766, arg0, -1202531112);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Lr;J[Lnba;[Lfk;Z)V", line = 228)
    public final void method3873(class165 arg0, long arg1, class271[] arg2, class604[] arg3, boolean arg4) {
        if (!this.field9772) {
            this.method3870(arg0, arg2, arg4);
            this.method3871(arg3, arg4);
            this.field9774 = arg1;
        }
    }

    @OriginalMember(owner = "client!au", name = "d", descriptor = "()V", line = 239)
    private final void method3874() {
        this.field9767 = false;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(J)V", line = 242)
    public final void method3875(long arg0) {
        this.field9774 = arg0;
    }

    @OriginalMember(owner = "client!au", name = "e", descriptor = "()V", line = 245)
    public final void method3876() {
        this.field9779 = true;
    }

    @OriginalMember(owner = "client!au", name = "f", descriptor = "()V", line = 248)
    public final void method3877() {
        this.field9767 = true;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIII)V", line = 251)
    public final void method3878(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9777 = arg0;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(IZ)Lau;", line = 262)
    public static final class684 method3879(int arg0, boolean arg1) {
        if (class649.field9208 == class306.field4068) {
            return new class684(arg0, arg1);
        } else {
            class684 var2 = class558.field8082[class649.field9208];
            class649.field9208 = class649.field9208 + 1 & class502.field7014[class561.field8107];
            var2.method3867(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Lr;J)Z", line = 278)
    public final boolean method3880(class165 arg0, long arg1) {
        if (this.field9774 == this.field9766) {
            this.method3874();
        } else {
            this.method3877();
        }
        if (arg1 - this.field9774 > 750L) {
            this.method3881();
            return false;
        }
        int var4 = (int) (arg1 - this.field9766);
        if (this.field9779) {
            for (class131 var5 = (class131) this.field9770.method2070((byte) -112); var5 != null; var5 = (class131) this.field9770.method2068(-2001)) {
                for (int var6 = 0; var6 < var5.field1671.field2791; var6++) {
                    var5.method887(1, arg1, !this.field9767, arg0, (byte) -109);
                }
            }
            this.field9779 = false;
        }
        for (class131 var7 = (class131) this.field9770.method2070((byte) -124); var7 != null; var7 = (class131) this.field9770.method2068(-2001)) {
            var7.method887(var4, arg1, !this.field9767, arg0, (byte) -115);
        }
        this.field9766 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!au", name = "g", descriptor = "()V", line = 330)
    public final void method3881() {
        this.field9772 = true;
        for (class355 var1 = (class355) this.field9775.method1132((byte) -127); var1 != null; var1 = (class355) this.field9775.method1134(8446)) {
            if (var1.field4746.field9971 == 1) {
                var1.method1037(-66);
            }
        }
        for (int var2 = 0; var2 < this.field9768.length; var2++) {
            if (this.field9768[var2] != null) {
                this.field9768[var2].method3345();
                this.field9768[var2] = null;
            }
        }
        this.field9773 = 0;
        this.field9770 = new class363();
        this.field9776 = 0;
        this.field9775 = new class183();
        this.field9781 = 0;
        this.method2564((byte) 2);
        class558.field8082[class306.field4068] = this;
        class306.field4068 = class306.field4068 + 1 & class502.field7014[class561.field8107];
    }
}
