import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class260 extends class7 {

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "Lka;")
    private class243 field4649 = new class243();

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "Lka;")
    private class243 field4650 = new class243();

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
    private int field4651 = 0;

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "I")
    private int field4652 = -1;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V")
    private final void method1786(int arg0) {
        for (class7 var2 = (class7) this.field4649.method1724(255); var2 != null; var2 = (class7) this.field4649.method1726(107)) {
            var2.method31(arg0);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lbh;)V")
    public final synchronized void method1787(class7 arg0) {
        this.field4649.method1730(arg0, (byte) 56);
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "()I")
    public final int method35() {
        return 0;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "([III)V")
    public final synchronized void method32(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4652 < 0) {
                this.method1791(arg0, arg1, arg2);
                return;
            }
            if (this.field4651 + arg2 < this.field4652) {
                this.field4651 += arg2;
                this.method1791(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4652 - this.field4651;
            this.method1791(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4651 += var4;
            this.method1792();
            class226 var5 = (class226) this.field4650.method1724(255);
            synchronized (var5) {
                int var7 = var5.method1620(this);
                if (var7 < 0) {
                    var5.field4131 = 0;
                    this.method1790(var5);
                } else {
                    var5.field4131 = var7;
                    this.method1789(var5.field1677, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(Lbh;)V")
    public final synchronized void method1788(class7 arg0) {
        arg0.method632(-8296);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lbb;Ls;)V")
    private final void method1789(class88 arg0, class226 arg1) {
        while (this.field4650.field4460 != arg0 && ((class226) arg0).field4131 <= arg1.field4131) {
            arg0 = arg0.field1677;
        }
        class36.method196(arg1, 1, arg0);
        this.field4652 = ((class226) this.field4650.field4460.field1677).field4131;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "()Lbh;")
    public final class7 method33() {
        return (class7) this.field4649.method1724(255);
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V")
    public final synchronized void method31(int arg0) {
        do {
            if (this.field4652 < 0) {
                this.method1786(arg0);
                return;
            }
            if (this.field4651 + arg0 < this.field4652) {
                this.field4651 += arg0;
                this.method1786(arg0);
                return;
            }
            int var2 = this.field4652 - this.field4651;
            this.method1786(var2);
            arg0 -= var2;
            this.field4651 += var2;
            this.method1792();
            class226 var3 = (class226) this.field4650.method1724(255);
            synchronized (var3) {
                int var5 = var3.method1620(this);
                if (var5 < 0) {
                    var3.field4131 = 0;
                    this.method1790(var3);
                } else {
                    var3.field4131 = var5;
                    this.method1789(var3.field1677, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ls;)V")
    private final void method1790(class226 arg0) {
        arg0.method632(-8296);
        arg0.method1619();
        class88 var2 = this.field4650.field4460.field1677;
        if (this.field4650.field4460 == var2) {
            this.field4652 = -1;
        } else {
            this.field4652 = ((class226) var2).field4131;
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "([III)V")
    private final void method1791(int[] arg0, int arg1, int arg2) {
        for (class7 var4 = (class7) this.field4649.method1724(255); var4 != null; var4 = (class7) this.field4649.method1726(107)) {
            var4.method30(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "()V")
    private final void method1792() {
        if (this.field4651 <= 0) {
            return;
        }
        for (class226 var1 = (class226) this.field4650.method1724(255); var1 != null; var1 = (class226) this.field4650.method1726(100)) {
            var1.field4131 -= this.field4651;
        }
        this.field4652 -= this.field4651;
        this.field4651 = 0;
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "()Lbh;")
    public final class7 method34() {
        return (class7) this.field4649.method1726(105);
    }
}
