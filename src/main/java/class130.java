import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class130 extends class115 {

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "Lps;")
    private class63 field1745 = new class63();

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "Lps;")
    private class63 field1746 = new class63();

    @OriginalMember(owner = "client!ru", name = "q", descriptor = "I")
    private int field1748 = 0;

    @OriginalMember(owner = "client!ru", name = "p", descriptor = "I")
    private int field1747 = -1;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
    public final synchronized void method712(int arg0) {
        do {
            if (this.field1747 < 0) {
                this.method881(arg0);
                return;
            }
            if (this.field1748 + arg0 < this.field1747) {
                this.field1748 += arg0;
                this.method881(arg0);
                return;
            }
            int var2 = this.field1747 - this.field1748;
            this.method881(var2);
            arg0 -= var2;
            this.field1748 += var2;
            this.method877();
            class469 var3 = (class469) this.field1746.method445(33);
            synchronized (var3) {
                int var5 = var3.method2815(this);
                if (var5 < 0) {
                    var3.field7007 = 0;
                    this.method882(var3);
                } else {
                    var3.field7007 = var5;
                    this.method878(var3.field39, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "()V")
    private final void method877() {
        if (this.field1748 <= 0) {
            return;
        }
        for (class469 var1 = (class469) this.field1746.method445(33); var1 != null; var1 = (class469) this.field1746.method451(false)) {
            var1.field7007 -= this.field1748;
        }
        this.field1747 -= this.field1748;
        this.field1748 = 0;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lie;Lfh;)V")
    private final void method878(class5 arg0, class469 arg1) {
        while (this.field1746.field906 != arg0 && ((class469) arg0).field7007 <= arg1.field7007) {
            arg0 = arg0.field39;
        }
        class535.method3164(13, arg1, arg0);
        this.field1747 = ((class469) this.field1746.field906.field39).field7007;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lwq;)V")
    public final synchronized void method879(class115 arg0) {
        this.field1745.method448(-123, arg0);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "()I")
    public final int method709() {
        return 0;
    }

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "()Lwq;")
    public final class115 method714() {
        return (class115) this.field1745.method445(33);
    }

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "()I")
    public final synchronized int method880() {
        return this.field1745.method446(4090);
    }

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "(I)V")
    private final void method881(int arg0) {
        for (class115 var2 = (class115) this.field1745.method445(33); var2 != null; var2 = (class115) this.field1745.method451(false)) {
            var2.method712(arg0);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lfh;)V")
    private final void method882(class469 arg0) {
        arg0.method25(-13489);
        arg0.method2816();
        class5 var2 = this.field1746.field906.field39;
        if (this.field1746.field906 == var2) {
            this.field1747 = -1;
        } else {
            this.field1747 = ((class469) var2).field7007;
        }
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "()Lwq;")
    public final class115 method710() {
        return (class115) this.field1745.method451(false);
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(Lwq;)V")
    public final synchronized void method883(class115 arg0) {
        arg0.method25(-13489);
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "([III)V")
    private final void method884(int[] arg0, int arg1, int arg2) {
        for (class115 var4 = (class115) this.field1745.method445(33); var4 != null; var4 = (class115) this.field1745.method451(false)) {
            var4.method713(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "([III)V")
    public final synchronized void method708(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1747 < 0) {
                this.method884(arg0, arg1, arg2);
                return;
            }
            if (this.field1748 + arg2 < this.field1747) {
                this.field1748 += arg2;
                this.method884(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1747 - this.field1748;
            this.method884(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1748 += var4;
            this.method877();
            class469 var5 = (class469) this.field1746.method445(33);
            synchronized (var5) {
                int var7 = var5.method2815(this);
                if (var7 < 0) {
                    var5.field7007 = 0;
                    this.method882(var5);
                } else {
                    var5.field7007 = var7;
                    this.method878(var5.field39, var5);
                }
            }
        } while (arg2 != 0);
    }
}
