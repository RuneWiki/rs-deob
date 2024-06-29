import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class125 extends class278 {

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "Lam;")
    private class277 field2204 = new class277();

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "Lam;")
    private class277 field2205 = new class277();

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    private int field2206 = 0;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    private int field2207 = -1;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "()Ljk;", line = 3)
    public final class278 method875() {
        return (class278) this.field2204.method1926((byte) 90);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljk;)V", line = 8)
    public final synchronized void method876(class278 arg0) {
        this.field2204.method1933(9988, arg0);
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V", line = 15)
    private final void method877(int arg0) {
        for (class278 var2 = (class278) this.field2204.method1936(16173); var2 != null; var2 = (class278) this.field2204.method1926((byte) 90)) {
            var2.method883(arg0);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()I", line = 25)
    public final int method878() {
        return 0;
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "()V", line = 28)
    private final void method879() {
        if (this.field2206 <= 0) {
            return;
        }
        for (class12 var1 = (class12) this.field2205.method1936(16173); var1 != null; var1 = (class12) this.field2205.method1926((byte) 90)) {
            var1.field93 -= this.field2206;
        }
        this.field2207 -= this.field2206;
        this.field2206 = 0;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "([III)V", line = 48)
    private final void method880(int[] arg0, int arg1, int arg2) {
        for (class278 var4 = (class278) this.field2204.method1936(16173); var4 != null; var4 = (class278) this.field2204.method1926((byte) 90)) {
            var4.method1941(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([III)V", line = 62)
    public final synchronized void method881(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2207 < 0) {
                this.method880(arg0, arg1, arg2);
                return;
            }
            if (this.field2206 + arg2 < this.field2207) {
                this.field2206 += arg2;
                this.method880(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2207 - this.field2206;
            this.method880(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2206 += var4;
            this.method879();
            class12 var5 = (class12) this.field2205.method1936(16173);
            synchronized (var5) {
                int var7 = var5.method72(this);
                if (var7 < 0) {
                    var5.field93 = 0;
                    this.method884(var5);
                } else {
                    var5.field93 = var7;
                    this.method885(var5.field2423, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Ljk;)V", line = 112)
    public final synchronized void method882(class278 arg0) {
        arg0.method961((byte) 119);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V", line = 122)
    public final synchronized void method883(int arg0) {
        do {
            if (this.field2207 < 0) {
                this.method877(arg0);
                return;
            }
            if (this.field2206 + arg0 < this.field2207) {
                this.field2206 += arg0;
                this.method877(arg0);
                return;
            }
            int var2 = this.field2207 - this.field2206;
            this.method877(var2);
            arg0 -= var2;
            this.field2206 += var2;
            this.method879();
            class12 var3 = (class12) this.field2205.method1936(16173);
            synchronized (var3) {
                int var5 = var3.method72(this);
                if (var5 < 0) {
                    var3.field93 = 0;
                    this.method884(var3);
                } else {
                    var3.field93 = var5;
                    this.method885(var3.field2423, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lan;)V", line = 169)
    private final void method884(class12 arg0) {
        arg0.method961((byte) 74);
        arg0.method71();
        class141 var2 = this.field2205.field4665.field2423;
        if (this.field2205.field4665 == var2) {
            this.field2207 = -1;
        } else {
            this.field2207 = ((class12) var2).field93;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lgd;Lan;)V", line = 188)
    private final void method885(class141 arg0, class12 arg1) {
        while (this.field2205.field4665 != arg0 && ((class12) arg0).field93 <= arg1.field93) {
            arg0 = arg0.field2423;
        }
        class40.method313(255, arg1, arg0);
        this.field2207 = ((class12) this.field2205.field4665.field2423).field93;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "()Ljk;", line = 196)
    public final class278 method886() {
        return (class278) this.field2204.method1936(16173);
    }
}
