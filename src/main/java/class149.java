import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class149 extends class173 {

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "Lsc;")
    private class165 field2907 = new class165();

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "Lsc;")
    private class165 field2908 = new class165();

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    private int field2909 = 0;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    private int field2910 = -1;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()I")
    public final int method313() {
        return 0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ltb;)V")
    public final synchronized void method1010(class173 arg0) {
        arg0.method915(0);
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
    public final synchronized void method327(int arg0) {
        do {
            if (this.field2910 < 0) {
                this.method1016(arg0);
                return;
            }
            if (this.field2909 + arg0 < this.field2910) {
                this.field2909 += arg0;
                this.method1016(arg0);
                return;
            }
            int var2 = this.field2910 - this.field2909;
            this.method1016(var2);
            arg0 -= var2;
            this.field2909 += var2;
            this.method1013();
            class186 var3 = (class186) this.field2908.method1109((byte) -105);
            synchronized (var3) {
                int var5 = var3.method1253(this);
                if (var5 < 0) {
                    var3.field3568 = 0;
                    this.method1015(var3);
                } else {
                    var3.field3568 = var5;
                    this.method1011(var3.field2552, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lod;Luf;)V")
    private final void method1011(class130 arg0, class186 arg1) {
        while (this.field2908.field3141 != arg0 && ((class186) arg0).field3568 <= arg1.field3568) {
            arg0 = arg0.field2552;
        }
        this.field2908.method1113(arg1, arg0, 1208005);
        this.field2910 = ((class186) this.field2908.field3141.field2552).field3568;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "()Ltb;")
    public final class173 method312() {
        return (class173) this.field2907.method1109((byte) -127);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Ltb;)V")
    public final synchronized void method1012(class173 arg0) {
        this.field2907.method1105(1208005, arg0);
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "()V")
    private final void method1013() {
        if (this.field2909 <= 0) {
            return;
        }
        for (class186 var1 = (class186) this.field2908.method1109((byte) -85); var1 != null; var1 = (class186) this.field2908.method1115((byte) -121)) {
            var1.field3568 -= this.field2909;
        }
        this.field2910 -= this.field2909;
        this.field2909 = 0;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "([III)V")
    private final void method1014(int[] arg0, int arg1, int arg2) {
        for (class173 var4 = (class173) this.field2907.method1109((byte) -84); var4 != null; var4 = (class173) this.field2907.method1115((byte) 50)) {
            var4.method1191(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "()Ltb;")
    public final class173 method304() {
        return (class173) this.field2907.method1115((byte) -77);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "([III)V")
    public final synchronized void method311(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2910 < 0) {
                this.method1014(arg0, arg1, arg2);
                return;
            }
            if (this.field2909 + arg2 < this.field2910) {
                this.field2909 += arg2;
                this.method1014(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2910 - this.field2909;
            this.method1014(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2909 += var4;
            this.method1013();
            class186 var5 = (class186) this.field2908.method1109((byte) -87);
            synchronized (var5) {
                int var7 = var5.method1253(this);
                if (var7 < 0) {
                    var5.field3568 = 0;
                    this.method1015(var5);
                } else {
                    var5.field3568 = var7;
                    this.method1011(var5.field2552, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Luf;)V")
    private final void method1015(class186 arg0) {
        arg0.method915(0);
        arg0.method1254();
        class130 var2 = this.field2908.field3141.field2552;
        if (this.field2908.field3141 == var2) {
            this.field2910 = -1;
        } else {
            this.field2910 = ((class186) var2).field3568;
        }
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V")
    private final void method1016(int arg0) {
        for (class173 var2 = (class173) this.field2907.method1109((byte) -99); var2 != null; var2 = (class173) this.field2907.method1115((byte) 37)) {
            var2.method327(arg0);
        }
    }
}
