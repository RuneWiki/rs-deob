import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 extends class63 {

    @OriginalMember(owner = "client!a", name = "D", descriptor = "Lnd;")
    private class94 field1 = new class94();

    @OriginalMember(owner = "client!a", name = "E", descriptor = "Lnd;")
    private class94 field2 = new class94();

    @OriginalMember(owner = "client!a", name = "F", descriptor = "I")
    private int field3 = -1;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "I")
    private int field4 = 0;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "([III)V")
    private final void method1(int[] arg0, int arg1, int arg2) {
        for (class63 var4 = (class63) this.field1.method758(255); var4 != null; var4 = (class63) this.field1.method766(-120)) {
            var4.method522(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lja;)V")
    public final synchronized void method2(class63 arg0) {
        arg0.method1124((byte) 62);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Lja;)V")
    public final synchronized void method3(class63 arg0) {
        this.field1.method767(arg0, true);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()Lja;")
    public final class63 method4() {
        return (class63) this.field1.method766(-37);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()I")
    public final int method5() {
        return 0;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
    public final synchronized void method6(int arg0) {
        do {
            if (this.field3 < 0) {
                this.method10(arg0);
                return;
            }
            if (this.field4 + arg0 < this.field3) {
                this.field4 += arg0;
                this.method10(arg0);
                return;
            }
            int var2 = this.field3 - this.field4;
            this.method10(var2);
            arg0 -= var2;
            this.field4 += var2;
            this.method9();
            class41 var3 = (class41) this.field2.method758(255);
            synchronized (var3) {
                int var5 = var3.method367(this);
                if (var5 < 0) {
                    var3.field992 = 0;
                    this.method8(var3);
                } else {
                    var3.field992 = var5;
                    this.method11(var3.field3268, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()Lja;")
    public final class63 method7() {
        return (class63) this.field1.method758(255);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lfe;)V")
    private final void method8(class41 arg0) {
        arg0.method1124((byte) 62);
        arg0.method368();
        class137 var2 = this.field2.field2192.field3268;
        if (this.field2.field2192 == var2) {
            this.field3 = -1;
        } else {
            this.field3 = ((class41) var2).field992;
        }
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "()V")
    private final void method9() {
        if (this.field4 <= 0) {
            return;
        }
        for (class41 var1 = (class41) this.field2.method758(255); var1 != null; var1 = (class41) this.field2.method766(-81)) {
            var1.field992 -= this.field4;
        }
        this.field3 -= this.field4;
        this.field4 = 0;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
    private final void method10(int arg0) {
        for (class63 var2 = (class63) this.field1.method758(255); var2 != null; var2 = (class63) this.field1.method766(-48)) {
            var2.method6(arg0);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lte;Lfe;)V")
    private final void method11(class137 arg0, class41 arg1) {
        while (this.field2.field2192 != arg0 && ((class41) arg0).field992 <= arg1.field992) {
            arg0 = arg0.field3268;
        }
        this.field2.method769(arg0, arg1, -25408);
        this.field3 = ((class41) this.field2.field2192.field3268).field992;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([III)V")
    public final synchronized void method12(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3 < 0) {
                this.method1(arg0, arg1, arg2);
                return;
            }
            if (this.field4 + arg2 < this.field3) {
                this.field4 += arg2;
                this.method1(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3 - this.field4;
            this.method1(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4 += var4;
            this.method9();
            class41 var5 = (class41) this.field2.method758(255);
            synchronized (var5) {
                int var7 = var5.method367(this);
                if (var7 < 0) {
                    var5.field992 = 0;
                    this.method8(var5);
                } else {
                    var5.field992 = var7;
                    this.method11(var5.field3268, var5);
                }
            }
        } while (arg2 != 0);
    }
}
