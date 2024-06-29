import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class192 extends class118 {

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "Lcf;")
    private class25 field3803 = new class25();

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "Lcf;")
    private class25 field3804 = new class25();

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    private int field3806 = -1;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    private int field3805 = 0;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
    private final void method1242(int arg0) {
        for (class118 var2 = (class118) this.field3803.method188((byte) 54); var2 != null; var2 = (class118) this.field3803.method185((byte) -102)) {
            var2.method236(arg0);
        }
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "()V")
    private final void method1243() {
        if (this.field3805 <= 0) {
            return;
        }
        for (class106 var1 = (class106) this.field3804.method188((byte) 54); var1 != null; var1 = (class106) this.field3804.method185((byte) -102)) {
            var1.field2285 -= this.field3805;
        }
        this.field3806 -= this.field3805;
        this.field3805 = 0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lnb;)V")
    public final synchronized void method1244(class118 arg0) {
        this.field3803.method192(1, arg0);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lse;Llh;)V")
    private final void method1245(class166 arg0, class106 arg1) {
        while (this.field3804.field551 != arg0 && ((class106) arg0).field2285 <= arg1.field2285) {
            arg0 = arg0.field3310;
        }
        this.field3804.method182(1001, arg0, arg1);
        this.field3806 = ((class106) this.field3804.field551.field3310).field2285;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Llh;)V")
    private final void method1246(class106 arg0) {
        arg0.method1018(15789);
        arg0.method695();
        class166 var2 = this.field3804.field551.field3310;
        if (this.field3804.field551 == var2) {
            this.field3806 = -1;
        } else {
            this.field3806 = ((class106) var2).field2285;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Lnb;)V")
    public final synchronized void method1247(class118 arg0) {
        arg0.method1018(15789);
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "()I")
    public final int method235() {
        return 0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([III)V")
    public final synchronized void method234(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3806 < 0) {
                this.method1248(arg0, arg1, arg2);
                return;
            }
            if (this.field3805 + arg2 < this.field3806) {
                this.field3805 += arg2;
                this.method1248(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3806 - this.field3805;
            this.method1248(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3805 += var4;
            this.method1243();
            class106 var5 = (class106) this.field3804.method188((byte) 54);
            synchronized (var5) {
                int var7 = var5.method696(this);
                if (var7 < 0) {
                    var5.field2285 = 0;
                    this.method1246(var5);
                } else {
                    var5.field2285 = var7;
                    this.method1245(var5.field3310, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()Lnb;")
    public final class118 method232() {
        return (class118) this.field3803.method188((byte) 54);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "([III)V")
    private final void method1248(int[] arg0, int arg1, int arg2) {
        for (class118 var4 = (class118) this.field3803.method188((byte) 54); var4 != null; var4 = (class118) this.field3803.method185((byte) -102)) {
            var4.method742(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "()Lnb;")
    public final class118 method231() {
        return (class118) this.field3803.method185((byte) -102);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
    public final synchronized void method236(int arg0) {
        do {
            if (this.field3806 < 0) {
                this.method1242(arg0);
                return;
            }
            if (this.field3805 + arg0 < this.field3806) {
                this.field3805 += arg0;
                this.method1242(arg0);
                return;
            }
            int var2 = this.field3806 - this.field3805;
            this.method1242(var2);
            arg0 -= var2;
            this.field3805 += var2;
            this.method1243();
            class106 var3 = (class106) this.field3804.method188((byte) 54);
            synchronized (var3) {
                int var5 = var3.method696(this);
                if (var5 < 0) {
                    var3.field2285 = 0;
                    this.method1246(var3);
                } else {
                    var3.field2285 = var5;
                    this.method1245(var3.field3310, var3);
                }
            }
        } while (arg0 != 0);
    }
}
