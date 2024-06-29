import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class72 extends class4 {

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "Llb;")
    private class78 field1572 = new class78();

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "Llb;")
    private class78 field1573 = new class78();

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    private int field1574 = 0;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    private int field1575 = -1;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([III)V")
    public final synchronized void method17(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1575 < 0) {
                this.method503(arg0, arg1, arg2);
                return;
            }
            if (this.field1574 + arg2 < this.field1575) {
                this.field1574 += arg2;
                this.method503(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1575 - this.field1574;
            this.method503(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1574 += var4;
            this.method507();
            class9 var5 = (class9) this.field1573.method523(false);
            synchronized (var5) {
                int var7 = var5.method45(this);
                if (var7 < 0) {
                    var5.field137 = 0;
                    this.method506(var5);
                } else {
                    var5.field137 = var7;
                    this.method508(var5.field2731, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "()I")
    public final int method20() {
        return 0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()Lac;")
    public final class4 method15() {
        return (class4) this.field1572.method527(true);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "([III)V")
    private final void method503(int[] arg0, int arg1, int arg2) {
        for (class4 var4 = (class4) this.field1572.method523(false); var4 != null; var4 = (class4) this.field1572.method527(true)) {
            var4.method19(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
    public final synchronized void method21(int arg0) {
        do {
            if (this.field1575 < 0) {
                this.method505(arg0);
                return;
            }
            if (this.field1574 + arg0 < this.field1575) {
                this.field1574 += arg0;
                this.method505(arg0);
                return;
            }
            int var2 = this.field1575 - this.field1574;
            this.method505(var2);
            arg0 -= var2;
            this.field1574 += var2;
            this.method507();
            class9 var3 = (class9) this.field1573.method523(false);
            synchronized (var3) {
                int var5 = var3.method45(this);
                if (var5 < 0) {
                    var3.field137 = 0;
                    this.method506(var3);
                } else {
                    var3.field137 = var5;
                    this.method508(var3.field2731, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "()Lac;")
    public final class4 method18() {
        return (class4) this.field1572.method523(false);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lac;)V")
    public final synchronized void method504(class4 arg0) {
        this.field1572.method531(-1, arg0);
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)V")
    private final void method505(int arg0) {
        for (class4 var2 = (class4) this.field1572.method523(false); var2 != null; var2 = (class4) this.field1572.method527(true)) {
            var2.method21(arg0);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lba;)V")
    private final void method506(class9 arg0) {
        arg0.method959(11835);
        arg0.method44();
        class125 var2 = this.field1573.field1629.field2731;
        if (this.field1573.field1629 == var2) {
            this.field1575 = -1;
        } else {
            this.field1575 = ((class9) var2).field137;
        }
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "()V")
    private final void method507() {
        if (this.field1574 <= 0) {
            return;
        }
        for (class9 var1 = (class9) this.field1573.method523(false); var1 != null; var1 = (class9) this.field1573.method527(true)) {
            var1.field137 -= this.field1574;
        }
        this.field1575 -= this.field1574;
        this.field1574 = 0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ls;Lba;)V")
    private final void method508(class125 arg0, class9 arg1) {
        while (this.field1573.field1629 != arg0 && ((class9) arg0).field137 <= arg1.field137) {
            arg0 = arg0.field2731;
        }
        this.field1573.method524(arg1, (byte) -91, arg0);
        this.field1575 = ((class9) this.field1573.field1629.field2731).field137;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Lac;)V")
    public final synchronized void method509(class4 arg0) {
        arg0.method959(11835);
    }
}
