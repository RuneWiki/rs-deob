import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class78 extends class202 {

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "Lef;")
    private class175 field1334 = new class175();

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "Lef;")
    private class175 field1335 = new class175();

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
    private int field1337 = -1;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
    private int field1336 = 0;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lw;Laj;)V")
    private final void method500(class104 arg0, class109 arg1) {
        while (this.field1335.field2929 != arg0 && ((class109) arg0).field1819 <= arg1.field1819) {
            arg0 = arg0.field1711;
        }
        class49.method328(12800, arg0, arg1);
        this.field1337 = ((class109) this.field1335.field2929.field1711).field1819;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "()I")
    public final int method501() {
        return 0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lii;)V")
    public final synchronized void method502(class202 arg0) {
        this.field1334.method1170(true, arg0);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([III)V")
    public final synchronized void method503(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1337 < 0) {
                this.method509(arg0, arg1, arg2);
                return;
            }
            if (this.field1336 + arg2 < this.field1337) {
                this.field1336 += arg2;
                this.method509(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1337 - this.field1336;
            this.method509(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1336 += var4;
            this.method505();
            class109 var5 = (class109) this.field1335.method1173(45);
            synchronized (var5) {
                int var7 = var5.method701(this);
                if (var7 < 0) {
                    var5.field1819 = 0;
                    this.method507(var5);
                } else {
                    var5.field1819 = var7;
                    this.method500(var5.field1711, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(Lii;)V")
    public final synchronized void method504(class202 arg0) {
        arg0.method655(63);
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "()V")
    private final void method505() {
        if (this.field1336 <= 0) {
            return;
        }
        for (class109 var1 = (class109) this.field1335.method1173(82); var1 != null; var1 = (class109) this.field1335.method1175(-1)) {
            var1.field1819 -= this.field1336;
        }
        this.field1337 -= this.field1336;
        this.field1336 = 0;
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V")
    private final void method506(int arg0) {
        for (class202 var2 = (class202) this.field1334.method1173(33); var2 != null; var2 = (class202) this.field1334.method1175(-1)) {
            var2.method510(arg0);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Laj;)V")
    private final void method507(class109 arg0) {
        arg0.method655(63);
        arg0.method700();
        class104 var2 = this.field1335.field2929.field1711;
        if (this.field1335.field2929 == var2) {
            this.field1337 = -1;
        } else {
            this.field1337 = ((class109) var2).field1819;
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "()Lii;")
    public final class202 method508() {
        return (class202) this.field1334.method1173(48);
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "([III)V")
    private final void method509(int[] arg0, int arg1, int arg2) {
        for (class202 var4 = (class202) this.field1334.method1173(122); var4 != null; var4 = (class202) this.field1334.method1175(-1)) {
            var4.method1412(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)V")
    public final synchronized void method510(int arg0) {
        do {
            if (this.field1337 < 0) {
                this.method506(arg0);
                return;
            }
            if (this.field1336 + arg0 < this.field1337) {
                this.field1336 += arg0;
                this.method506(arg0);
                return;
            }
            int var2 = this.field1337 - this.field1336;
            this.method506(var2);
            arg0 -= var2;
            this.field1336 += var2;
            this.method505();
            class109 var3 = (class109) this.field1335.method1173(115);
            synchronized (var3) {
                int var5 = var3.method701(this);
                if (var5 < 0) {
                    var3.field1819 = 0;
                    this.method507(var3);
                } else {
                    var3.field1819 = var5;
                    this.method500(var3.field1711, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "()Lii;")
    public final class202 method511() {
        return (class202) this.field1334.method1175(-1);
    }
}
