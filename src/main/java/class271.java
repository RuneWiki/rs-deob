import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class271 extends class24 {

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "Lql;")
    private class87 field4213 = new class87();

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "Lql;")
    private class87 field4214 = new class87();

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    private int field4215 = -1;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    private int field4216 = 0;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lp;)V", line = 3)
    public final synchronized void method1864(class24 arg0) {
        arg0.method403(1);
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "([III)V", line = 11)
    private final void method1865(int[] arg0, int arg1, int arg2) {
        for (class24 var4 = (class24) this.field4213.method636(-1); var4 != null; var4 = (class24) this.field4213.method638(106)) {
            var4.method231(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "()Lp;", line = 23)
    public final class24 method232() {
        return (class24) this.field4213.method636(-1);
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V", line = 28)
    private final void method1866(int arg0) {
        for (class24 var2 = (class24) this.field4213.method636(-1); var2 != null; var2 = (class24) this.field4213.method638(96)) {
            var2.method235(arg0);
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lp;)V", line = 40)
    public final synchronized void method1867(class24 arg0) {
        this.field4213.method631(arg0, false);
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V", line = 48)
    public final synchronized void method235(int arg0) {
        do {
            if (this.field4215 < 0) {
                this.method1866(arg0);
                return;
            }
            if (this.field4216 + arg0 < this.field4215) {
                this.field4216 += arg0;
                this.method1866(arg0);
                return;
            }
            int var2 = this.field4215 - this.field4216;
            this.method1866(var2);
            arg0 -= var2;
            this.field4216 += var2;
            this.method1870();
            class122 var3 = (class122) this.field4214.method636(-1);
            synchronized (var3) {
                int var5 = var3.method885(this);
                if (var5 < 0) {
                    var3.field1852 = 0;
                    this.method1868(var3);
                } else {
                    var3.field1852 = var5;
                    this.method1869(var3.field754, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lrm;)V", line = 93)
    private final void method1868(class122 arg0) {
        arg0.method403(1);
        arg0.method886();
        class46 var2 = this.field4214.field1402.field754;
        if (this.field4214.field1402 == var2) {
            this.field4215 = -1;
        } else {
            this.field4215 = ((class122) var2).field1852;
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "()I", line = 109)
    public final int method237() {
        return 0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lsm;Lrm;)V", line = 112)
    private final void method1869(class46 arg0, class122 arg1) {
        while (this.field4214.field1402 != arg0 && ((class122) arg0).field1852 <= arg1.field1852) {
            arg0 = arg0.field754;
        }
        class238.method1661(arg0, arg1, 115);
        this.field4215 = ((class122) this.field4214.field1402.field754).field1852;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "()Lp;", line = 120)
    public final class24 method233() {
        return (class24) this.field4213.method638(118);
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "()V", line = 127)
    private final void method1870() {
        if (this.field4216 <= 0) {
            return;
        }
        for (class122 var1 = (class122) this.field4214.method636(-1); var1 != null; var1 = (class122) this.field4214.method638(109)) {
            var1.field1852 -= this.field4216;
        }
        this.field4215 -= this.field4216;
        this.field4216 = 0;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "([III)V", line = 148)
    public final synchronized void method234(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4215 < 0) {
                this.method1865(arg0, arg1, arg2);
                return;
            }
            if (this.field4216 + arg2 < this.field4215) {
                this.field4216 += arg2;
                this.method1865(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4215 - this.field4216;
            this.method1865(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4216 += var4;
            this.method1870();
            class122 var5 = (class122) this.field4214.method636(-1);
            synchronized (var5) {
                int var7 = var5.method885(this);
                if (var7 < 0) {
                    var5.field1852 = 0;
                    this.method1868(var5);
                } else {
                    var5.field1852 = var7;
                    this.method1869(var5.field754, var5);
                }
            }
        } while (arg2 != 0);
    }
}
