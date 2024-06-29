import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class219 extends class55 {

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "Lsg;")
    private class203 field4077 = new class203();

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "Lsg;")
    private class203 field4078 = new class203();

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    private int field4079 = -1;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    private int field4080 = 0;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "([III)V")
    private final void method1446(int[] arg0, int arg1, int arg2) {
        for (class55 var4 = (class55) this.field4077.method1338(4); var4 != null; var4 = (class55) this.field4077.method1332((byte) -89)) {
            var4.method439(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lf;)V")
    public final synchronized void method1447(class55 arg0) {
        this.field4077.method1335(arg0, -1);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lob;)V")
    private final void method1448(class154 arg0) {
        arg0.method433(0);
        arg0.method1049();
        class54 var2 = this.field4078.field3767.field1062;
        if (this.field4078.field3767 == var2) {
            this.field4079 = -1;
        } else {
            this.field4079 = ((class154) var2).field2914;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()I")
    public final int method436() {
        return 0;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "([III)V")
    public final synchronized void method441(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4079 < 0) {
                this.method1446(arg0, arg1, arg2);
                return;
            }
            if (this.field4080 + arg2 < this.field4079) {
                this.field4080 += arg2;
                this.method1446(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4079 - this.field4080;
            this.method1446(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4080 += var4;
            this.method1449();
            class154 var5 = (class154) this.field4078.method1338(29);
            synchronized (var5) {
                int var7 = var5.method1050(this);
                if (var7 < 0) {
                    var5.field2914 = 0;
                    this.method1448(var5);
                } else {
                    var5.field2914 = var7;
                    this.method1451(var5.field1062, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "()Lf;")
    public final class55 method438() {
        return (class55) this.field4077.method1338(127);
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "()V")
    private final void method1449() {
        if (this.field4080 <= 0) {
            return;
        }
        for (class154 var1 = (class154) this.field4078.method1338(95); var1 != null; var1 = (class154) this.field4078.method1332((byte) -89)) {
            var1.field2914 -= this.field4080;
        }
        this.field4079 -= this.field4080;
        this.field4080 = 0;
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
    private final void method1450(int arg0) {
        for (class55 var2 = (class55) this.field4077.method1338(100); var2 != null; var2 = (class55) this.field4077.method1332((byte) -89)) {
            var2.method442(arg0);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "()Lf;")
    public final class55 method437() {
        return (class55) this.field4077.method1332((byte) -89);
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
    public final synchronized void method442(int arg0) {
        do {
            if (this.field4079 < 0) {
                this.method1450(arg0);
                return;
            }
            if (this.field4080 + arg0 < this.field4079) {
                this.field4080 += arg0;
                this.method1450(arg0);
                return;
            }
            int var2 = this.field4079 - this.field4080;
            this.method1450(var2);
            arg0 -= var2;
            this.field4080 += var2;
            this.method1449();
            class154 var3 = (class154) this.field4078.method1338(16);
            synchronized (var3) {
                int var5 = var3.method1050(this);
                if (var5 < 0) {
                    var3.field2914 = 0;
                    this.method1448(var3);
                } else {
                    var3.field2914 = var5;
                    this.method1451(var3.field1062, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lej;Lob;)V")
    private final void method1451(class54 arg0, class154 arg1) {
        while (this.field4078.field3767 != arg0 && ((class154) arg0).field2914 <= arg1.field2914) {
            arg0 = arg0.field1062;
        }
        this.field4078.method1342(arg0, 0, arg1);
        this.field4079 = ((class154) this.field4078.field3767.field1062).field2914;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Lf;)V")
    public final synchronized void method1452(class55 arg0) {
        arg0.method433(0);
    }
}
