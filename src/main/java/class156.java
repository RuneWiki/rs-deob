import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class156 extends class3 {

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "Lhi;")
    private class192 field2158 = new class192();

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "Lhi;")
    private class192 field2159 = new class192();

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    private int field2161 = -1;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    private int field2160 = 0;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lan;)V", line = 9)
    public final synchronized void method1126(class3 arg0) {
        this.field2158.method1343(arg0, -74);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 16)
    public final synchronized void method14(int arg0) {
        do {
            if (this.field2161 < 0) {
                this.method1127(arg0);
                return;
            }
            if (this.field2160 + arg0 < this.field2161) {
                this.field2160 += arg0;
                this.method1127(arg0);
                return;
            }
            int var2 = this.field2161 - this.field2160;
            this.method1127(var2);
            arg0 -= var2;
            this.field2160 += var2;
            this.method1129();
            class299 var3 = (class299) this.field2159.method1335(1);
            synchronized (var3) {
                int var5 = var3.method2030(this);
                if (var5 < 0) {
                    var3.field4421 = 0;
                    this.method1132(var3);
                } else {
                    var3.field4421 = var5;
                    this.method1131(var3.field2523, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "()Lan;", line = 67)
    public final class3 method17() {
        return (class3) this.field2158.method1336(3);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "([III)V", line = 74)
    public final synchronized void method16(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2161 < 0) {
                this.method1128(arg0, arg1, arg2);
                return;
            }
            if (this.field2160 + arg2 < this.field2161) {
                this.field2160 += arg2;
                this.method1128(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2161 - this.field2160;
            this.method1128(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2160 += var4;
            this.method1129();
            class299 var5 = (class299) this.field2159.method1335(1);
            synchronized (var5) {
                int var7 = var5.method2030(this);
                if (var7 < 0) {
                    var5.field4421 = 0;
                    this.method1132(var5);
                } else {
                    var5.field4421 = var7;
                    this.method1131(var5.field2523, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "()I", line = 120)
    public final int method15() {
        return 0;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V", line = 125)
    private final void method1127(int arg0) {
        for (class3 var2 = (class3) this.field2158.method1335(1); var2 != null; var2 = (class3) this.field2158.method1336(3)) {
            var2.method14(arg0);
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "([III)V", line = 138)
    private final void method1128(int[] arg0, int arg1, int arg2) {
        for (class3 var4 = (class3) this.field2158.method1335(1); var4 != null; var4 = (class3) this.field2158.method1336(3)) {
            var4.method11(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "()V", line = 147)
    private final void method1129() {
        if (this.field2160 <= 0) {
            return;
        }
        for (class299 var1 = (class299) this.field2159.method1335(1); var1 != null; var1 = (class299) this.field2159.method1336(3)) {
            var1.field4421 -= this.field2160;
        }
        this.field2161 -= this.field2160;
        this.field2160 = 0;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Lan;)V", line = 166)
    public final synchronized void method1130(class3 arg0) {
        arg0.method1274((byte) -26);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lim;Lll;)V", line = 169)
    private final void method1131(class183 arg0, class299 arg1) {
        while (this.field2159.field2636 != arg0 && ((class299) arg0).field4421 <= arg1.field4421) {
            arg0 = arg0.field2523;
        }
        class224.method1579(arg1, arg0, (byte) 127);
        this.field2161 = ((class299) this.field2159.field2636.field2523).field4421;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lll;)V", line = 176)
    private final void method1132(class299 arg0) {
        arg0.method1274((byte) -26);
        arg0.method2029();
        class183 var2 = this.field2159.field2636.field2523;
        if (this.field2159.field2636 == var2) {
            this.field2161 = -1;
        } else {
            this.field2161 = ((class299) var2).field4421;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()Lan;", line = 192)
    public final class3 method12() {
        return (class3) this.field2158.method1335(1);
    }
}
