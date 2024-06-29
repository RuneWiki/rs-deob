import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class61 extends class23 {

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "Lse;")
    private class130 field1499 = new class130();

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "Lse;")
    private class130 field1500 = new class130();

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    private int field1501 = 0;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    private int field1502 = -1;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "()Lda;")
    public final class23 method104() {
        return (class23) this.field1499.method979(-125);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lda;)V")
    public final synchronized void method484(class23 arg0) {
        this.field1499.method985(false, arg0);
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "()Lda;")
    public final class23 method135() {
        return (class23) this.field1499.method983(18485);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lfa;)V")
    private final void method485(class37 arg0) {
        arg0.method48(-315);
        arg0.method283();
        class5 var2 = this.field1500.field2927.field153;
        if (this.field1500.field2927 == var2) {
            this.field1502 = -1;
        } else {
            this.field1502 = ((class37) var2).field920;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "()I")
    public final int method134() {
        return 0;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lda;)V")
    public final synchronized void method486(class23 arg0) {
        arg0.method48(-315);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lad;Lfa;)V")
    private final void method487(class5 arg0, class37 arg1) {
        while (this.field1500.field2927 != arg0 && ((class37) arg0).field920 <= arg1.field920) {
            arg0 = arg0.field153;
        }
        this.field1500.method982(arg1, (byte) -62, arg0);
        this.field1502 = ((class37) this.field1500.field2927.field153).field920;
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "()V")
    private final void method488() {
        if (this.field1501 <= 0) {
            return;
        }
        for (class37 var1 = (class37) this.field1500.method979(-120); var1 != null; var1 = (class37) this.field1500.method983(18485)) {
            var1.field920 -= this.field1501;
        }
        this.field1502 -= this.field1501;
        this.field1501 = 0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([III)V")
    public final synchronized void method109(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1502 < 0) {
                this.method489(arg0, arg1, arg2);
                return;
            }
            if (this.field1501 + arg2 < this.field1502) {
                this.field1501 += arg2;
                this.method489(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1502 - this.field1501;
            this.method489(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1501 += var4;
            this.method488();
            class37 var5 = (class37) this.field1500.method979(-121);
            synchronized (var5) {
                int var7 = var5.method284(this);
                if (var7 < 0) {
                    var5.field920 = 0;
                    this.method485(var5);
                } else {
                    var5.field920 = var7;
                    this.method487(var5.field153, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "([III)V")
    private final void method489(int[] arg0, int arg1, int arg2) {
        for (class23 var4 = (class23) this.field1499.method979(-120); var4 != null; var4 = (class23) this.field1499.method983(18485)) {
            var4.method186(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
    private final void method490(int arg0) {
        for (class23 var2 = (class23) this.field1499.method979(-122); var2 != null; var2 = (class23) this.field1499.method983(18485)) {
            var2.method111(arg0);
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
    public final synchronized void method111(int arg0) {
        do {
            if (this.field1502 < 0) {
                this.method490(arg0);
                return;
            }
            if (this.field1501 + arg0 < this.field1502) {
                this.field1501 += arg0;
                this.method490(arg0);
                return;
            }
            int var2 = this.field1502 - this.field1501;
            this.method490(var2);
            arg0 -= var2;
            this.field1501 += var2;
            this.method488();
            class37 var3 = (class37) this.field1500.method979(-122);
            synchronized (var3) {
                int var5 = var3.method284(this);
                if (var5 < 0) {
                    var3.field920 = 0;
                    this.method485(var3);
                } else {
                    var3.field920 = var5;
                    this.method487(var3.field153, var3);
                }
            }
        } while (arg0 != 0);
    }
}
