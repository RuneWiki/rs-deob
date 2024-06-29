import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class161 extends class317 {

    @OriginalMember(owner = "client!ov", name = "n", descriptor = "Leea;")
    private class114 field1973 = new class114();

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "Leea;")
    private class114 field1974 = new class114();

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "I")
    private int field1975 = 0;

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "I")
    private int field1976 = -1;

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "()Lbk;", line = 3)
    public final class317 method925() {
        return (class317) this.field1973.method716(14);
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "()Lbk;", line = 6)
    public final class317 method926() {
        return (class317) this.field1973.method719(false);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Luj;Lww;)V", line = 10)
    private final void method927(class324 arg0, class634 arg1) {
        while (this.field1974.field1413 != arg0 && ((class634) arg0).field9118 <= arg1.field9118) {
            arg0 = arg0.field4681;
        }
        class608.method3531(arg0, arg1, (byte) 69);
        this.field1976 = ((class634) this.field1974.field1413.field4681).field9118;
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "([III)V", line = 20)
    private final void method928(int[] arg0, int arg1, int arg2) {
        for (class317 var4 = (class317) this.field1973.method719(false); var4 != null; var4 = (class317) this.field1973.method716(14)) {
            var4.method2080(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V", line = 39)
    public final synchronized void method929(int arg0) {
        do {
            if (this.field1976 < 0) {
                this.method931(arg0);
                return;
            }
            if (this.field1975 + arg0 < this.field1976) {
                this.field1975 += arg0;
                this.method931(arg0);
                return;
            }
            int var2 = this.field1976 - this.field1975;
            this.method931(var2);
            arg0 -= var2;
            this.field1975 += var2;
            this.method933();
            class634 var3 = (class634) this.field1974.method719(false);
            synchronized (var3) {
                int var5 = var3.method3619(this);
                if (var5 < 0) {
                    var3.field9118 = 0;
                    this.method932(var3);
                } else {
                    var3.field9118 = var5;
                    this.method927(var3.field4681, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "([III)V", line = 87)
    public final synchronized void method930(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1976 < 0) {
                this.method928(arg0, arg1, arg2);
                return;
            }
            if (this.field1975 + arg2 < this.field1976) {
                this.field1975 += arg2;
                this.method928(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1976 - this.field1975;
            this.method928(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1975 += var4;
            this.method933();
            class634 var5 = (class634) this.field1974.method719(false);
            synchronized (var5) {
                int var7 = var5.method3619(this);
                if (var7 < 0) {
                    var5.field9118 = 0;
                    this.method932(var5);
                } else {
                    var5.field9118 = var7;
                    this.method927(var5.field4681, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "(I)V", line = 133)
    private final void method931(int arg0) {
        for (class317 var2 = (class317) this.field1973.method719(false); var2 != null; var2 = (class317) this.field1973.method716(14)) {
            var2.method929(arg0);
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lww;)V", line = 144)
    private final void method932(class634 arg0) {
        arg0.method2108(true);
        arg0.method3620();
        class324 var2 = this.field1974.field1413.field4681;
        if (this.field1974.field1413 == var2) {
            this.field1976 = -1;
        } else {
            this.field1976 = ((class634) var2).field9118;
        }
    }

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "()V", line = 158)
    private final void method933() {
        if (this.field1975 <= 0) {
            return;
        }
        for (class634 var1 = (class634) this.field1974.method719(false); var1 != null; var1 = (class634) this.field1974.method716(14)) {
            var1.field9118 -= this.field1975;
        }
        this.field1976 -= this.field1975;
        this.field1975 = 0;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lbk;)V", line = 176)
    public final synchronized void method934(class317 arg0) {
        arg0.method2108(true);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "()I", line = 179)
    public final int method935() {
        return 0;
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(Lbk;)V", line = 185)
    public final synchronized void method936(class317 arg0) {
        this.field1973.method710(arg0, 60);
    }

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "()I", line = 191)
    public final synchronized int method937() {
        return this.field1973.method707((byte) -106);
    }
}
