import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class192 extends class198 {

    @OriginalMember(owner = "client!la", name = "s", descriptor = "Lth;")
    private class55 field3122 = new class55();

    @OriginalMember(owner = "client!la", name = "t", descriptor = "Lth;")
    private class55 field3123 = new class55();

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    private int field3125 = 0;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    private int field3124 = -1;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([III)V", line = 10)
    public final synchronized void method1227(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3124 < 0) {
                this.method1232(arg0, arg1, arg2);
                return;
            }
            if (this.field3125 + arg2 < this.field3124) {
                this.field3125 += arg2;
                this.method1232(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3124 - this.field3125;
            this.method1232(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3125 += var4;
            this.method1230();
            class117 var5 = (class117) this.field3123.method424(-100);
            synchronized (var5) {
                int var7 = var5.method772(this);
                if (var7 < 0) {
                    var5.field2049 = 0;
                    this.method1231(var5);
                } else {
                    var5.field2049 = var7;
                    this.method1236(var5.field701, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V", line = 57)
    public final synchronized void method1228(int arg0) {
        do {
            if (this.field3124 < 0) {
                this.method1238(arg0);
                return;
            }
            if (this.field3125 + arg0 < this.field3124) {
                this.field3125 += arg0;
                this.method1238(arg0);
                return;
            }
            int var2 = this.field3124 - this.field3125;
            this.method1238(var2);
            arg0 -= var2;
            this.field3125 += var2;
            this.method1230();
            class117 var3 = (class117) this.field3123.method424(-57);
            synchronized (var3) {
                int var5 = var3.method772(this);
                if (var5 < 0) {
                    var3.field2049 = 0;
                    this.method1231(var3);
                } else {
                    var3.field2049 = var5;
                    this.method1236(var3.field701, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Laj;)V", line = 104)
    public final synchronized void method1229(class198 arg0) {
        this.field3122.method429(arg0, (byte) 127);
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "()V", line = 108)
    private final void method1230() {
        if (this.field3125 <= 0) {
            return;
        }
        for (class117 var1 = (class117) this.field3123.method424(-64); var1 != null; var1 = (class117) this.field3123.method425(-32547)) {
            var1.field2049 -= this.field3125;
        }
        this.field3124 -= this.field3125;
        this.field3125 = 0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Luc;)V", line = 125)
    private final void method1231(class117 arg0) {
        arg0.method278((byte) -105);
        arg0.method771();
        class35 var2 = this.field3123.field1102.field701;
        if (this.field3123.field1102 == var2) {
            this.field3124 = -1;
        } else {
            this.field3124 = ((class117) var2).field2049;
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "([III)V", line = 140)
    private final void method1232(int[] arg0, int arg1, int arg2) {
        for (class198 var4 = (class198) this.field3122.method424(-57); var4 != null; var4 = (class198) this.field3122.method425(-32547)) {
            var4.method1267(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "()I", line = 151)
    public final int method1233() {
        return 0;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "()Laj;", line = 154)
    public final class198 method1234() {
        return (class198) this.field3122.method424(-120);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()Laj;", line = 158)
    public final class198 method1235() {
        return (class198) this.field3122.method425(-32547);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Laa;Luc;)V", line = 161)
    private final void method1236(class35 arg0, class117 arg1) {
        while (this.field3123.field1102 != arg0 && ((class117) arg0).field2049 <= arg1.field2049) {
            arg0 = arg0.field701;
        }
        class291.method1957(1537, arg0, arg1);
        this.field3124 = ((class117) this.field3123.field1102.field701).field2049;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(Laj;)V", line = 173)
    public final synchronized void method1237(class198 arg0) {
        arg0.method278((byte) -105);
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V", line = 180)
    private final void method1238(int arg0) {
        for (class198 var2 = (class198) this.field3122.method424(-124); var2 != null; var2 = (class198) this.field3122.method425(-32547)) {
            var2.method1228(arg0);
        }
    }
}
