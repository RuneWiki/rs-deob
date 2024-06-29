import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class594 extends class98 {

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "Lga;")
    private class420 field8368 = new class420();

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "Lga;")
    private class420 field8369 = new class420();

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    private int field8370 = 0;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    private int field8371 = -1;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "()Leha;", line = 5)
    public final class98 method687() {
        return (class98) this.field8368.method2508((byte) 125);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 11)
    public final synchronized void method686(int arg0) {
        do {
            if (this.field8371 < 0) {
                this.method3441(arg0);
                return;
            }
            if (this.field8370 + arg0 < this.field8371) {
                this.field8370 += arg0;
                this.method3441(arg0);
                return;
            }
            int var2 = this.field8371 - this.field8370;
            this.method3441(var2);
            arg0 -= var2;
            this.field8370 += var2;
            this.method3436();
            class193 var3 = (class193) this.field8369.method2508((byte) 113);
            synchronized (var3) {
                int var5 = var3.method1408(this);
                if (var5 < 0) {
                    var3.field2857 = 0;
                    this.method3438(var3);
                } else {
                    var3.field2857 = var5;
                    this.method3442(var3.field7578, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "()V", line = 55)
    private final void method3436() {
        if (this.field8370 <= 0) {
            return;
        }
        for (class193 var1 = (class193) this.field8369.method2508((byte) 108); var1 != null; var1 = (class193) this.field8369.method2505((byte) -55)) {
            var1.field2857 -= this.field8370;
        }
        this.field8371 -= this.field8370;
        this.field8370 = 0;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "()Leha;", line = 74)
    public final class98 method688() {
        return (class98) this.field8368.method2505((byte) -55);
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "([III)V", line = 79)
    private final void method3437(int[] arg0, int arg1, int arg2) {
        for (class98 var4 = (class98) this.field8368.method2508((byte) -24); var4 != null; var4 = (class98) this.field8368.method2505((byte) -55)) {
            var4.method692(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lefa;)V", line = 89)
    private final void method3438(class193 arg0) {
        arg0.method3117((byte) -114);
        arg0.method1409();
        class540 var2 = this.field8369.field5911.field7578;
        if (this.field8369.field5911 == var2) {
            this.field8371 = -1;
        } else {
            this.field8371 = ((class193) var2).field2857;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Leha;)V", line = 104)
    public final synchronized void method3439(class98 arg0) {
        arg0.method3117((byte) -100);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([III)V", line = 112)
    public final synchronized void method689(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field8371 < 0) {
                this.method3437(arg0, arg1, arg2);
                return;
            }
            if (this.field8370 + arg2 < this.field8371) {
                this.field8370 += arg2;
                this.method3437(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field8371 - this.field8370;
            this.method3437(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field8370 += var4;
            this.method3436();
            class193 var5 = (class193) this.field8369.method2508((byte) 118);
            synchronized (var5) {
                int var7 = var5.method1408(this);
                if (var7 < 0) {
                    var5.field2857 = 0;
                    this.method3438(var5);
                } else {
                    var5.field2857 = var7;
                    this.method3442(var5.field7578, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "()I", line = 160)
    public final int method691() {
        return 0;
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "()I", line = 163)
    public final synchronized int method3440() {
        return this.field8368.method2504(0);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V", line = 168)
    private final void method3441(int arg0) {
        for (class98 var2 = (class98) this.field8368.method2508((byte) 118); var2 != null; var2 = (class98) this.field8368.method2505((byte) -55)) {
            var2.method686(arg0);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ldn;Lefa;)V", line = 177)
    private final void method3442(class540 arg0, class193 arg1) {
        while (this.field8369.field5911 != arg0 && ((class193) arg0).field2857 <= arg1.field2857) {
            arg0 = arg0.field7578;
        }
        class246.method1657(arg1, arg0, -16711936);
        this.field8371 = ((class193) this.field8369.field5911.field7578).field2857;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(Leha;)V", line = 186)
    public final synchronized void method3443(class98 arg0) {
        this.field8368.method2506(arg0, (byte) -114);
    }
}
