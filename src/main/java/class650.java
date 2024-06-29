import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class650 extends class3 {

    @OriginalMember(owner = "client!sga", name = "o", descriptor = "Lfha;")
    private class522 field9195 = new class522();

    @OriginalMember(owner = "client!sga", name = "p", descriptor = "Lfha;")
    private class522 field9196 = new class522();

    @OriginalMember(owner = "client!sga", name = "q", descriptor = "I")
    private int field9197 = 0;

    @OriginalMember(owner = "client!sga", name = "r", descriptor = "I")
    private int field9198 = -1;

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(I)V")
    private final void method3759(int arg0) {
        for (class3 var2 = (class3) this.field9195.method3118((byte) 73); var2 != null; var2 = (class3) this.field9195.method3111(120)) {
            var2.method6(arg0);
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)V")
    public final synchronized void method6(int arg0) {
        do {
            if (this.field9198 < 0) {
                this.method3759(arg0);
                return;
            }
            if (this.field9197 + arg0 < this.field9198) {
                this.field9197 += arg0;
                this.method3759(arg0);
                return;
            }
            int var2 = this.field9198 - this.field9197;
            this.method3759(var2);
            arg0 -= var2;
            this.field9197 += var2;
            this.method3763();
            class653 var3 = (class653) this.field9196.method3118((byte) 73);
            synchronized (var3) {
                int var5 = var3.method3777(this);
                if (var5 < 0) {
                    var3.field9227 = 0;
                    this.method3762(var3);
                } else {
                    var3.field9227 = var5;
                    this.method3766(var3.field7165, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lua;)V")
    public final synchronized void method3760(class3 arg0) {
        this.field9195.method3124(arg0, (byte) 48);
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(Lua;)V")
    public final synchronized void method3761(class3 arg0) {
        arg0.method3065(-17363);
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "()I")
    public final int method5() {
        return 0;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Laba;)V")
    private final void method3762(class653 arg0) {
        arg0.method3065(-17363);
        arg0.method3776();
        class513 var2 = this.field9196.field7324.field7165;
        if (this.field9196.field7324 == var2) {
            this.field9198 = -1;
        } else {
            this.field9198 = ((class653) var2).field9227;
        }
    }

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "()V")
    private final void method3763() {
        if (this.field9197 <= 0) {
            return;
        }
        for (class653 var1 = (class653) this.field9196.method3118((byte) 73); var1 != null; var1 = (class653) this.field9196.method3111(126)) {
            var1.field9227 -= this.field9197;
        }
        this.field9198 -= this.field9197;
        this.field9197 = 0;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "()Lua;")
    public final class3 method4() {
        return (class3) this.field9195.method3111(127);
    }

    @OriginalMember(owner = "client!sga", name = "f", descriptor = "()I")
    public final synchronized int method3764() {
        return this.field9195.method3113((byte) -70);
    }

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "()Lua;")
    public final class3 method8() {
        return (class3) this.field9195.method3118((byte) 73);
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "([III)V")
    public final synchronized void method10(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field9198 < 0) {
                this.method3765(arg0, arg1, arg2);
                return;
            }
            if (this.field9197 + arg2 < this.field9198) {
                this.field9197 += arg2;
                this.method3765(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field9198 - this.field9197;
            this.method3765(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field9197 += var4;
            this.method3763();
            class653 var5 = (class653) this.field9196.method3118((byte) 73);
            synchronized (var5) {
                int var7 = var5.method3777(this);
                if (var7 < 0) {
                    var5.field9227 = 0;
                    this.method3762(var5);
                } else {
                    var5.field9227 = var7;
                    this.method3766(var5.field7165, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "([III)V")
    private final void method3765(int[] arg0, int arg1, int arg2) {
        for (class3 var4 = (class3) this.field9195.method3118((byte) 73); var4 != null; var4 = (class3) this.field9195.method3111(125)) {
            var4.method9(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ltq;Laba;)V")
    private final void method3766(class513 arg0, class653 arg1) {
        while (this.field9196.field7324 != arg0 && ((class653) arg0).field9227 <= arg1.field9227) {
            arg0 = arg0.field7165;
        }
        class104.method705(false, arg1, arg0);
        this.field9198 = ((class653) this.field9196.field7324.field7165).field9227;
    }
}
