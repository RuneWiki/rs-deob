import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class107 extends class461 {

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "Lvf;")
    private class166 field1296 = new class166();

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "Lvf;")
    private class166 field1297 = new class166();

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    private int field1298 = -1;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    private int field1299 = 0;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lrk;)V", line = 5)
    public final synchronized void method508(class461 arg0) {
        this.field1296.method811(-25513, arg0);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Lrk;)V", line = 12)
    public final synchronized void method509(class461 arg0) {
        arg0.method702((byte) -114);
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "([III)V", line = 19)
    private final void method510(int[] arg0, int arg1, int arg2) {
        for (class461 var4 = (class461) this.field1296.method802((byte) 112); var4 != null; var4 = (class461) this.field1296.method806((byte) 104)) {
            var4.method2718(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "()I", line = 28)
    public final int method511() {
        return 0;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V", line = 34)
    public final synchronized void method512(int arg0) {
        do {
            if (this.field1298 < 0) {
                this.method519(arg0);
                return;
            }
            if (this.field1299 + arg0 < this.field1298) {
                this.field1299 += arg0;
                this.method519(arg0);
                return;
            }
            int var2 = this.field1298 - this.field1299;
            this.method519(var2);
            arg0 -= var2;
            this.field1299 += var2;
            this.method514();
            class272 var3 = (class272) this.field1297.method802((byte) 101);
            synchronized (var3) {
                int var5 = var3.method1636(this);
                if (var5 < 0) {
                    var3.field3871 = 0;
                    this.method515(var3);
                } else {
                    var3.field3871 = var5;
                    this.method518(var3.field1779, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "([III)V", line = 87)
    public final synchronized void method513(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1298 < 0) {
                this.method510(arg0, arg1, arg2);
                return;
            }
            if (this.field1299 + arg2 < this.field1298) {
                this.field1299 += arg2;
                this.method510(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1298 - this.field1299;
            this.method510(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1299 += var4;
            this.method514();
            class272 var5 = (class272) this.field1297.method802((byte) 121);
            synchronized (var5) {
                int var7 = var5.method1636(this);
                if (var7 < 0) {
                    var5.field3871 = 0;
                    this.method515(var5);
                } else {
                    var5.field3871 = var7;
                    this.method518(var5.field1779, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "()V", line = 131)
    private final void method514() {
        if (this.field1299 <= 0) {
            return;
        }
        for (class272 var1 = (class272) this.field1297.method802((byte) 109); var1 != null; var1 = (class272) this.field1297.method806((byte) 104)) {
            var1.field3871 -= this.field1299;
        }
        this.field1298 -= this.field1299;
        this.field1299 = 0;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ltq;)V", line = 148)
    private final void method515(class272 arg0) {
        arg0.method702((byte) -114);
        arg0.method1637();
        class147 var2 = this.field1297.field1985.field1779;
        if (this.field1297.field1985 == var2) {
            this.field1298 = -1;
        } else {
            this.field1298 = ((class272) var2).field3871;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "()Lrk;", line = 161)
    public final class461 method516() {
        return (class461) this.field1296.method802((byte) 127);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "()Lrk;", line = 165)
    public final class461 method517() {
        return (class461) this.field1296.method806((byte) 104);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lpt;Ltq;)V", line = 171)
    private final void method518(class147 arg0, class272 arg1) {
        while (this.field1297.field1985 != arg0 && ((class272) arg0).field3871 <= arg1.field3871) {
            arg0 = arg0.field1779;
        }
        class239.method1316(arg0, arg1, true);
        this.field1298 = ((class272) this.field1297.field1985.field1779).field3871;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V", line = 182)
    private final void method519(int arg0) {
        for (class461 var2 = (class461) this.field1296.method802((byte) 107); var2 != null; var2 = (class461) this.field1296.method806((byte) 104)) {
            var2.method512(arg0);
        }
    }
}
