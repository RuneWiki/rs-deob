import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class224 extends class51 {

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "Lwi;")
    private class248 field4216 = new class248();

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "Lwi;")
    private class248 field4217 = new class248();

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    private int field4218 = -1;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    private int field4219 = 0;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "([III)V")
    private final void method1506(int[] arg0, int arg1, int arg2) {
        for (class51 var4 = (class51) this.field4216.method1612(false); var4 != null; var4 = (class51) this.field4216.method1621(82)) {
            var4.method381(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "()V")
    private final void method1507() {
        if (this.field4219 <= 0) {
            return;
        }
        for (class73 var1 = (class73) this.field4217.method1612(false); var1 != null; var1 = (class73) this.field4217.method1621(82)) {
            var1.field1338 -= this.field4219;
        }
        this.field4218 -= this.field4219;
        this.field4219 = 0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([III)V")
    public final synchronized void method379(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4218 < 0) {
                this.method1506(arg0, arg1, arg2);
                return;
            }
            if (this.field4219 + arg2 < this.field4218) {
                this.field4219 += arg2;
                this.method1506(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4218 - this.field4219;
            this.method1506(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4219 += var4;
            this.method1507();
            class73 var5 = (class73) this.field4217.method1612(false);
            synchronized (var5) {
                int var7 = var5.method500(this);
                if (var7 < 0) {
                    var5.field1338 = 0;
                    this.method1510(var5);
                } else {
                    var5.field1338 = var7;
                    this.method1512(var5.field1220, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "()Lef;")
    public final class51 method380() {
        return (class51) this.field4216.method1621(82);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public final synchronized void method384(int arg0) {
        do {
            if (this.field4218 < 0) {
                this.method1509(arg0);
                return;
            }
            if (this.field4219 + arg0 < this.field4218) {
                this.field4219 += arg0;
                this.method1509(arg0);
                return;
            }
            int var2 = this.field4218 - this.field4219;
            this.method1509(var2);
            arg0 -= var2;
            this.field4219 += var2;
            this.method1507();
            class73 var3 = (class73) this.field4217.method1612(false);
            synchronized (var3) {
                int var5 = var3.method500(this);
                if (var5 < 0) {
                    var3.field1338 = 0;
                    this.method1510(var3);
                } else {
                    var3.field1338 = var5;
                    this.method1512(var3.field1220, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "()I")
    public final int method383() {
        return 0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lef;)V")
    public final synchronized void method1508(class51 arg0) {
        this.field4216.method1617(24290, arg0);
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
    private final void method1509(int arg0) {
        for (class51 var2 = (class51) this.field4216.method1612(false); var2 != null; var2 = (class51) this.field4216.method1621(82)) {
            var2.method384(arg0);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lgg;)V")
    private final void method1510(class73 arg0) {
        arg0.method460(true);
        arg0.method499();
        class67 var2 = this.field4217.field4536.field1220;
        if (this.field4217.field4536 == var2) {
            this.field4218 = -1;
        } else {
            this.field4218 = ((class73) var2).field1338;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(Lef;)V")
    public final synchronized void method1511(class51 arg0) {
        arg0.method460(true);
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "()Lef;")
    public final class51 method385() {
        return (class51) this.field4216.method1612(false);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lg;Lgg;)V")
    private final void method1512(class67 arg0, class73 arg1) {
        while (this.field4217.field4536 != arg0 && ((class73) arg0).field1338 <= arg1.field1338) {
            arg0 = arg0.field1220;
        }
        this.field4217.method1622(arg1, (byte) -97, arg0);
        this.field4218 = ((class73) this.field4217.field4536.field1220).field1338;
    }
}
