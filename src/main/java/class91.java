import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class91 extends class184 {

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "Ldd;")
    private class132 field1624 = new class132();

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "Ldd;")
    private class132 field1625 = new class132();

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    private int field1626 = -1;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    private int field1627 = 0;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "([III)V")
    private final void method655(int[] arg0, int arg1, int arg2) {
        for (class184 var4 = (class184) this.field1624.method922((byte) 53); var4 != null; var4 = (class184) this.field1624.method928(-52)) {
            var4.method1294(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
    private final void method656(int arg0) {
        for (class184 var2 = (class184) this.field1624.method922((byte) 51); var2 != null; var2 = (class184) this.field1624.method928(112)) {
            var2.method203(arg0);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lij;Ljc;)V")
    private final void method657(class194 arg0, class238 arg1) {
        while (this.field1625.field2291 != arg0 && ((class238) arg0).field4375 <= arg1.field4375) {
            arg0 = arg0.field3410;
        }
        class80.method602(arg1, arg0, 28);
        this.field1626 = ((class238) this.field1625.field2291.field3410).field4375;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljc;)V")
    private final void method658(class238 arg0) {
        arg0.method1346((byte) -16);
        arg0.method1692();
        class194 var2 = this.field1625.field2291.field3410;
        if (this.field1625.field2291 == var2) {
            this.field1626 = -1;
        } else {
            this.field1626 = ((class238) var2).field4375;
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "()Lda;")
    public final class184 method196() {
        return (class184) this.field1624.method928(78);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "()I")
    public final int method187() {
        return 0;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "([III)V")
    public final synchronized void method191(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1626 < 0) {
                this.method655(arg0, arg1, arg2);
                return;
            }
            if (this.field1627 + arg2 < this.field1626) {
                this.field1627 += arg2;
                this.method655(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1626 - this.field1627;
            this.method655(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1627 += var4;
            this.method660();
            class238 var5 = (class238) this.field1625.method922((byte) 33);
            synchronized (var5) {
                int var7 = var5.method1691(this);
                if (var7 < 0) {
                    var5.field4375 = 0;
                    this.method658(var5);
                } else {
                    var5.field4375 = var7;
                    this.method657(var5.field3410, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V")
    public final synchronized void method203(int arg0) {
        do {
            if (this.field1626 < 0) {
                this.method656(arg0);
                return;
            }
            if (this.field1627 + arg0 < this.field1626) {
                this.field1627 += arg0;
                this.method656(arg0);
                return;
            }
            int var2 = this.field1626 - this.field1627;
            this.method656(var2);
            arg0 -= var2;
            this.field1627 += var2;
            this.method660();
            class238 var3 = (class238) this.field1625.method922((byte) 110);
            synchronized (var3) {
                int var5 = var3.method1691(this);
                if (var5 < 0) {
                    var3.field4375 = 0;
                    this.method658(var3);
                } else {
                    var3.field4375 = var5;
                    this.method657(var3.field3410, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lda;)V")
    public final synchronized void method659(class184 arg0) {
        this.field1624.method932(arg0, true);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "()Lda;")
    public final class184 method210() {
        return (class184) this.field1624.method922((byte) 103);
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "()V")
    private final void method660() {
        if (this.field1627 <= 0) {
            return;
        }
        for (class238 var1 = (class238) this.field1625.method922((byte) 65); var1 != null; var1 = (class238) this.field1625.method928(78)) {
            var1.field4375 -= this.field1627;
        }
        this.field1626 -= this.field1627;
        this.field1627 = 0;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Lda;)V")
    public final synchronized void method661(class184 arg0) {
        arg0.method1346((byte) -16);
    }
}
