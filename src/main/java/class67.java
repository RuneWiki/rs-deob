import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class67 extends class766 {

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Ltm;")
    private class412 field953 = new class412();

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Ltm;")
    private class412 field954 = new class412();

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    private int field955 = 0;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    private int field956 = -1;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "([III)V")
    private final void method587(int[] arg0, int arg1, int arg2) {
        for (class766 var4 = (class766) this.field953.method2551((byte) -108); var4 != null; var4 = (class766) this.field953.method2542(-113)) {
            var4.method4248(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lst;)V")
    private final void method588(class460 arg0) {
        arg0.method792((byte) -103);
        arg0.method2717();
        class101 var2 = this.field954.field5921.field1412;
        if (this.field954.field5921 == var2) {
            this.field956 = -1;
        } else {
            this.field956 = ((class460) var2).field6363;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ldba;Lst;)V")
    private final void method589(class101 arg0, class460 arg1) {
        while (this.field954.field5921 != arg0 && ((class460) arg0).field6363 <= arg1.field6363) {
            arg0 = arg0.field1412;
        }
        class274.method1781(arg1, 9476, arg0);
        this.field956 = ((class460) this.field954.field5921.field1412).field6363;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lsia;)V")
    public final synchronized void method590(class766 arg0) {
        arg0.method792((byte) -106);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "()I")
    public final int method591() {
        return 0;
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "()Lsia;")
    public final class766 method592() {
        return (class766) this.field953.method2542(-106);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([III)V")
    public final synchronized void method593(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field956 < 0) {
                this.method587(arg0, arg1, arg2);
                return;
            }
            if (this.field955 + arg2 < this.field956) {
                this.field955 += arg2;
                this.method587(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field956 - this.field955;
            this.method587(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field955 += var4;
            this.method599();
            class460 var5 = (class460) this.field954.method2551((byte) -108);
            synchronized (var5) {
                int var7 = var5.method2716(this);
                if (var7 < 0) {
                    var5.field6363 = 0;
                    this.method588(var5);
                } else {
                    var5.field6363 = var7;
                    this.method589(var5.field1412, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "()I")
    public final synchronized int method594() {
        return this.field953.method2538(41);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()Lsia;")
    public final class766 method595() {
        return (class766) this.field953.method2551((byte) -108);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public final synchronized void method596(int arg0) {
        do {
            if (this.field956 < 0) {
                this.method597(arg0);
                return;
            }
            if (this.field955 + arg0 < this.field956) {
                this.field955 += arg0;
                this.method597(arg0);
                return;
            }
            int var2 = this.field956 - this.field955;
            this.method597(var2);
            arg0 -= var2;
            this.field955 += var2;
            this.method599();
            class460 var3 = (class460) this.field954.method2551((byte) -108);
            synchronized (var3) {
                int var5 = var3.method2716(this);
                if (var5 < 0) {
                    var3.field6363 = 0;
                    this.method588(var3);
                } else {
                    var3.field6363 = var5;
                    this.method589(var3.field1412, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    private final void method597(int arg0) {
        for (class766 var2 = (class766) this.field953.method2551((byte) -108); var2 != null; var2 = (class766) this.field953.method2542(-99)) {
            var2.method596(arg0);
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Lsia;)V")
    public final synchronized void method598(class766 arg0) {
        this.field953.method2550(0, arg0);
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "()V")
    private final void method599() {
        if (this.field955 <= 0) {
            return;
        }
        for (class460 var1 = (class460) this.field954.method2551((byte) -108); var1 != null; var1 = (class460) this.field954.method2542(-104)) {
            var1.field6363 -= this.field955;
        }
        this.field956 -= this.field955;
        this.field955 = 0;
    }
}
