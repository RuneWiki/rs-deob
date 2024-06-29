import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class317 extends class3 {

    @OriginalMember(owner = "client!sv", name = "t", descriptor = "Ltu;")
    private class7 field4079 = new class7();

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "Ltu;")
    private class7 field4080 = new class7();

    @OriginalMember(owner = "client!sv", name = "w", descriptor = "I")
    private int field4082 = 0;

    @OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
    private int field4081 = -1;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "()I", line = 3)
    public final synchronized int method1886() {
        return this.field4079.method45(-15978);
    }

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "(I)V", line = 8)
    private final void method1887(int arg0) {
        for (class3 var2 = (class3) this.field4079.method49(-111); var2 != null; var2 = (class3) this.field4079.method46((byte) 19)) {
            var2.method18(arg0);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lkb;)V", line = 18)
    private final void method1888(class137 arg0) {
        arg0.method3021(-94);
        arg0.method961();
        class508 var2 = this.field4080.field64.field7454;
        if (this.field4080.field64 == var2) {
            this.field4081 = -1;
        } else {
            this.field4081 = ((class137) var2).field1839;
        }
    }

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "()V", line = 34)
    private final void method1889() {
        if (this.field4082 <= 0) {
            return;
        }
        for (class137 var1 = (class137) this.field4080.method49(107); var1 != null; var1 = (class137) this.field4080.method46((byte) 23)) {
            var1.field1839 -= this.field4082;
        }
        this.field4081 -= this.field4082;
        this.field4082 = 0;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "()I", line = 51)
    public final int method13() {
        return 0;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lar;)V", line = 57)
    public final synchronized void method1890(class3 arg0) {
        arg0.method3021(-127);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([III)V", line = 64)
    public final synchronized void method17(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4081 < 0) {
                this.method1892(arg0, arg1, arg2);
                return;
            }
            if (this.field4082 + arg2 < this.field4081) {
                this.field4082 += arg2;
                this.method1892(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4081 - this.field4082;
            this.method1892(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4082 += var4;
            this.method1889();
            class137 var5 = (class137) this.field4080.method49(-128);
            synchronized (var5) {
                int var7 = var5.method960(this);
                if (var7 < 0) {
                    var5.field1839 = 0;
                    this.method1888(var5);
                } else {
                    var5.field1839 = var7;
                    this.method1893(var5.field7454, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(Lar;)V", line = 110)
    public final synchronized void method1891(class3 arg0) {
        this.field4079.method41(-792385400, arg0);
    }

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "()Lar;", line = 114)
    public final class3 method16() {
        return (class3) this.field4079.method46((byte) 111);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V", line = 120)
    public final synchronized void method18(int arg0) {
        do {
            if (this.field4081 < 0) {
                this.method1887(arg0);
                return;
            }
            if (this.field4082 + arg0 < this.field4081) {
                this.field4082 += arg0;
                this.method1887(arg0);
                return;
            }
            int var2 = this.field4081 - this.field4082;
            this.method1887(var2);
            arg0 -= var2;
            this.field4082 += var2;
            this.method1889();
            class137 var3 = (class137) this.field4080.method49(-118);
            synchronized (var3) {
                int var5 = var3.method960(this);
                if (var5 < 0) {
                    var3.field1839 = 0;
                    this.method1888(var3);
                } else {
                    var3.field1839 = var5;
                    this.method1893(var3.field7454, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "([III)V", line = 166)
    private final void method1892(int[] arg0, int arg1, int arg2) {
        for (class3 var4 = (class3) this.field4079.method49(89); var4 != null; var4 = (class3) this.field4079.method46((byte) 124)) {
            var4.method19(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "()Lar;", line = 182)
    public final class3 method15() {
        return (class3) this.field4079.method49(108);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Llf;Lkb;)V", line = 185)
    private final void method1893(class508 arg0, class137 arg1) {
        while (this.field4080.field64 != arg0 && ((class137) arg0).field1839 <= arg1.field1839) {
            arg0 = arg0.field7454;
        }
        class263.method1644(arg0, arg1, (byte) 28);
        this.field4081 = ((class137) this.field4080.field64.field7454).field1839;
    }
}
