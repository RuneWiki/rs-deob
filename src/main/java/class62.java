import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class62 extends class8 {

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "Lbg;")
    private class18 field1276 = new class18();

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "Lbg;")
    private class18 field1277 = new class18();

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    private int field1278 = 0;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    private int field1279 = -1;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "()Lag;")
    public final class8 method57() {
        return (class8) this.field1276.method103(57);
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "()I")
    public final int method54() {
        return 0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([III)V")
    public final synchronized void method52(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1279 < 0) {
                this.method369(arg0, arg1, arg2);
                return;
            }
            if (this.field1278 + arg2 < this.field1279) {
                this.field1278 += arg2;
                this.method369(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1279 - this.field1278;
            this.method369(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1278 += var4;
            this.method372();
            class171 var5 = (class171) this.field1277.method103(57);
            synchronized (var5) {
                int var7 = var5.method1132(this);
                if (var7 < 0) {
                    var5.field3330 = 0;
                    this.method370(var5);
                } else {
                    var5.field3330 = var7;
                    this.method374(var5.field4078, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "([III)V")
    private final void method369(int[] arg0, int arg1, int arg2) {
        for (class8 var4 = (class8) this.field1276.method103(57); var4 != null; var4 = (class8) this.field1276.method100(-49)) {
            var4.method55(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lsa;)V")
    private final void method370(class171 arg0) {
        arg0.method1370(31);
        arg0.method1133();
        class210 var2 = this.field1277.field464.field4078;
        if (this.field1277.field464 == var2) {
            this.field1279 = -1;
        } else {
            this.field1279 = ((class171) var2).field3330;
        }
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V")
    private final void method371(int arg0) {
        for (class8 var2 = (class8) this.field1276.method103(57); var2 != null; var2 = (class8) this.field1276.method100(-49)) {
            var2.method56(arg0);
        }
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "()V")
    private final void method372() {
        if (this.field1278 <= 0) {
            return;
        }
        for (class171 var1 = (class171) this.field1277.method103(57); var1 != null; var1 = (class171) this.field1277.method100(-49)) {
            var1.field3330 -= this.field1278;
        }
        this.field1279 -= this.field1278;
        this.field1278 = 0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lag;)V")
    public final synchronized void method373(class8 arg0) {
        arg0.method1370(-3);
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
    public final synchronized void method56(int arg0) {
        do {
            if (this.field1279 < 0) {
                this.method371(arg0);
                return;
            }
            if (this.field1278 + arg0 < this.field1279) {
                this.field1278 += arg0;
                this.method371(arg0);
                return;
            }
            int var2 = this.field1279 - this.field1278;
            this.method371(var2);
            arg0 -= var2;
            this.field1278 += var2;
            this.method372();
            class171 var3 = (class171) this.field1277.method103(57);
            synchronized (var3) {
                int var5 = var3.method1132(this);
                if (var5 < 0) {
                    var3.field3330 = 0;
                    this.method370(var3);
                } else {
                    var3.field3330 = var5;
                    this.method374(var3.field4078, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lwd;Lsa;)V")
    private final void method374(class210 arg0, class171 arg1) {
        while (this.field1277.field464 != arg0 && ((class171) arg0).field3330 <= arg1.field3330) {
            arg0 = arg0.field4078;
        }
        this.field1277.method99(arg0, arg1, (byte) -67);
        this.field1279 = ((class171) this.field1277.field464.field4078).field3330;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()Lag;")
    public final class8 method51() {
        return (class8) this.field1276.method100(-49);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Lag;)V")
    public final synchronized void method375(class8 arg0) {
        this.field1276.method102((byte) 106, arg0);
    }
}
