import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class223 extends class77 {

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "Luj;")
    private class156 field3589 = new class156();

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "Luj;")
    private class156 field3590 = new class156();

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    private int field3591 = 0;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "I")
    private int field3592 = -1;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lq;Lhi;)V", line = 5)
    private final void method1417(class79 arg0, class123 arg1) {
        while (this.field3590.field2482 != arg0 && ((class123) arg0).field1903 <= arg1.field1903) {
            arg0 = arg0.field1209;
        }
        this.field3590.method994(arg1, 122, arg0);
        this.field3592 = ((class123) this.field3590.field2482.field1209).field1903;
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "()V", line = 13)
    private final void method1418() {
        if (this.field3591 <= 0) {
            return;
        }
        for (class123 var1 = (class123) this.field3590.method995(1836596936); var1 != null; var1 = (class123) this.field3590.method996(0)) {
            var1.field1903 -= this.field3591;
        }
        this.field3592 -= this.field3591;
        this.field3591 = 0;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "()Lfg;", line = 30)
    public final class77 method466() {
        return (class77) this.field3589.method995(1836596936);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([III)V", line = 37)
    public final synchronized void method458(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3592 < 0) {
                this.method1423(arg0, arg1, arg2);
                return;
            }
            if (this.field3591 + arg2 < this.field3592) {
                this.field3591 += arg2;
                this.method1423(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3592 - this.field3591;
            this.method1423(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3591 += var4;
            this.method1418();
            class123 var5 = (class123) this.field3590.method995(1836596936);
            synchronized (var5) {
                int var7 = var5.method823(this);
                if (var7 < 0) {
                    var5.field1903 = 0;
                    this.method1422(var5);
                } else {
                    var5.field1903 = var7;
                    this.method1417(var5.field1209, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "()Lfg;", line = 87)
    public final class77 method462() {
        return (class77) this.field3589.method996(0);
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V", line = 92)
    private final void method1419(int arg0) {
        for (class77 var2 = (class77) this.field3589.method995(1836596936); var2 != null; var2 = (class77) this.field3589.method996(0)) {
            var2.method468(arg0);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lfg;)V", line = 107)
    public final synchronized void method1420(class77 arg0) {
        this.field3589.method1003(115, arg0);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V", line = 113)
    public final synchronized void method468(int arg0) {
        do {
            if (this.field3592 < 0) {
                this.method1419(arg0);
                return;
            }
            if (this.field3591 + arg0 < this.field3592) {
                this.field3591 += arg0;
                this.method1419(arg0);
                return;
            }
            int var2 = this.field3592 - this.field3591;
            this.method1419(var2);
            arg0 -= var2;
            this.field3591 += var2;
            this.method1418();
            class123 var3 = (class123) this.field3590.method995(1836596936);
            synchronized (var3) {
                int var5 = var3.method823(this);
                if (var5 < 0) {
                    var3.field1903 = 0;
                    this.method1422(var3);
                } else {
                    var3.field1903 = var5;
                    this.method1417(var3.field1209, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(Lfg;)V", line = 158)
    public final synchronized void method1421(class77 arg0) {
        arg0.method552((byte) -118);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lhi;)V", line = 162)
    private final void method1422(class123 arg0) {
        arg0.method552((byte) -124);
        arg0.method824();
        class79 var2 = this.field3590.field2482.field1209;
        if (this.field3590.field2482 == var2) {
            this.field3592 = -1;
        } else {
            this.field3592 = ((class123) var2).field1903;
        }
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "()I", line = 175)
    public final int method469() {
        return 0;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "([III)V", line = 197)
    private final void method1423(int[] arg0, int arg1, int arg2) {
        for (class77 var4 = (class77) this.field3589.method995(1836596936); var4 != null; var4 = (class77) this.field3589.method996(0)) {
            var4.method544(arg0, arg1, arg2);
        }
    }
}
