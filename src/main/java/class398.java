import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class398 extends class407 {

    @OriginalMember(owner = "client!po", name = "r", descriptor = "Lam;")
    private class455 field5622 = new class455();

    @OriginalMember(owner = "client!po", name = "s", descriptor = "Lam;")
    private class455 field5623 = new class455();

    @OriginalMember(owner = "client!po", name = "t", descriptor = "I")
    private int field5624 = -1;

    @OriginalMember(owner = "client!po", name = "u", descriptor = "I")
    private int field5625 = 0;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "()Lcv;")
    public final class407 method511() {
        return (class407) this.field5622.method2660((byte) 67);
    }

    @OriginalMember(owner = "client!po", name = "e", descriptor = "()V")
    private final void method2305() {
        if (this.field5625 <= 0) {
            return;
        }
        for (class83 var1 = (class83) this.field5623.method2655(15152); var1 != null; var1 = (class83) this.field5623.method2660((byte) 67)) {
            var1.field1058 -= this.field5625;
        }
        this.field5624 -= this.field5625;
        this.field5625 = 0;
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "([III)V")
    private final void method2306(int[] arg0, int arg1, int arg2) {
        for (class407 var4 = (class407) this.field5622.method2655(15152); var4 != null; var4 = (class407) this.field5622.method2660((byte) 67)) {
            var4.method2416(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!po", name = "f", descriptor = "()I")
    public final synchronized int method2307() {
        return this.field5622.method2665(96);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lju;)V")
    private final void method2308(class83 arg0) {
        arg0.method2891(-122);
        arg0.method609();
        class498 var2 = this.field5623.field6378.field7055;
        if (this.field5623.field6378 == var2) {
            this.field5624 = -1;
        } else {
            this.field5624 = ((class83) var2).field1058;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
    public final synchronized void method519(int arg0) {
        do {
            if (this.field5624 < 0) {
                this.method2311(arg0);
                return;
            }
            if (this.field5625 + arg0 < this.field5624) {
                this.field5625 += arg0;
                this.method2311(arg0);
                return;
            }
            int var2 = this.field5624 - this.field5625;
            this.method2311(var2);
            arg0 -= var2;
            this.field5625 += var2;
            this.method2305();
            class83 var3 = (class83) this.field5623.method2655(15152);
            synchronized (var3) {
                int var5 = var3.method610(this);
                if (var5 < 0) {
                    var3.field1058 = 0;
                    this.method2308(var3);
                } else {
                    var3.field1058 = var5;
                    this.method2310(var3.field7055, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lcv;)V")
    public final synchronized void method2309(class407 arg0) {
        this.field5622.method2658(arg0, false);
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "()I")
    public final int method518() {
        return 0;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "([III)V")
    public final synchronized void method512(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field5624 < 0) {
                this.method2306(arg0, arg1, arg2);
                return;
            }
            if (this.field5625 + arg2 < this.field5624) {
                this.field5625 += arg2;
                this.method2306(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field5624 - this.field5625;
            this.method2306(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field5625 += var4;
            this.method2305();
            class83 var5 = (class83) this.field5623.method2655(15152);
            synchronized (var5) {
                int var7 = var5.method610(this);
                if (var7 < 0) {
                    var5.field1058 = 0;
                    this.method2308(var5);
                } else {
                    var5.field1058 = var7;
                    this.method2310(var5.field7055, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lev;Lju;)V")
    private final void method2310(class498 arg0, class83 arg1) {
        while (this.field5623.field6378 != arg0 && ((class83) arg0).field1058 <= arg1.field1058) {
            arg0 = arg0.field7055;
        }
        class443.method2597((byte) 99, arg1, arg0);
        this.field5624 = ((class83) this.field5623.field6378.field7055).field1058;
    }

    @OriginalMember(owner = "client!po", name = "e", descriptor = "(I)V")
    private final void method2311(int arg0) {
        for (class407 var2 = (class407) this.field5622.method2655(15152); var2 != null; var2 = (class407) this.field5622.method2660((byte) 67)) {
            var2.method519(arg0);
        }
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "()Lcv;")
    public final class407 method520() {
        return (class407) this.field5622.method2655(15152);
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(Lcv;)V")
    public final synchronized void method2312(class407 arg0) {
        arg0.method2891(-121);
    }
}
