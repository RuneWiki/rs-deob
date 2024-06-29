import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class47 extends class156 {

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "Lad;")
    private class5 field925 = new class5();

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "Lad;")
    private class5 field926 = new class5();

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    private int field927 = -1;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    private int field928 = 0;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "()Lqh;")
    public final class156 method276() {
        return (class156) this.field925.method46(-116);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "([III)V")
    public final synchronized void method277(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field927 < 0) {
                this.method287(arg0, arg1, arg2);
                return;
            }
            if (this.field928 + arg2 < this.field927) {
                this.field928 += arg2;
                this.method287(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field927 - this.field928;
            this.method287(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field928 += var4;
            this.method286();
            class78 var5 = (class78) this.field926.method46(119);
            synchronized (var5) {
                int var7 = var5.method539(this);
                if (var7 < 0) {
                    var5.field1601 = 0;
                    this.method282(var5);
                } else {
                    var5.field1601 = var7;
                    this.method279(var5.field1942, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()Lqh;")
    public final class156 method278() {
        return (class156) this.field925.method53(7759444);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljd;Li;)V")
    private final void method279(class90 arg0, class78 arg1) {
        while (this.field926.field113 != arg0 && ((class78) arg0).field1601 <= arg1.field1601) {
            arg0 = arg0.field1942;
        }
        this.field926.method50(false, arg0, arg1);
        this.field927 = ((class78) this.field926.field113.field1942).field1601;
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)V")
    private final void method280(int arg0) {
        for (class156 var2 = (class156) this.field925.method46(21); var2 != null; var2 = (class156) this.field925.method53(7759444)) {
            var2.method283(arg0);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lqh;)V")
    public final synchronized void method281(class156 arg0) {
        arg0.method630(92);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Li;)V")
    private final void method282(class78 arg0) {
        arg0.method630(50);
        arg0.method540();
        class90 var2 = this.field926.field113.field1942;
        if (this.field926.field113 == var2) {
            this.field927 = -1;
        } else {
            this.field927 = ((class78) var2).field1601;
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V")
    public final synchronized void method283(int arg0) {
        do {
            if (this.field927 < 0) {
                this.method280(arg0);
                return;
            }
            if (this.field928 + arg0 < this.field927) {
                this.field928 += arg0;
                this.method280(arg0);
                return;
            }
            int var2 = this.field927 - this.field928;
            this.method280(var2);
            arg0 -= var2;
            this.field928 += var2;
            this.method286();
            class78 var3 = (class78) this.field926.method46(-127);
            synchronized (var3) {
                int var5 = var3.method539(this);
                if (var5 < 0) {
                    var3.field1601 = 0;
                    this.method282(var3);
                } else {
                    var3.field1601 = var5;
                    this.method279(var3.field1942, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "()I")
    public final int method284() {
        return 0;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(Lqh;)V")
    public final synchronized void method285(class156 arg0) {
        this.field925.method52(arg0, 0);
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "()V")
    private final void method286() {
        if (this.field928 <= 0) {
            return;
        }
        for (class78 var1 = (class78) this.field926.method46(77); var1 != null; var1 = (class78) this.field926.method53(7759444)) {
            var1.field1601 -= this.field928;
        }
        this.field927 -= this.field928;
        this.field928 = 0;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "([III)V")
    private final void method287(int[] arg0, int arg1, int arg2) {
        for (class156 var4 = (class156) this.field925.method46(-113); var4 != null; var4 = (class156) this.field925.method53(7759444)) {
            var4.method997(arg0, arg1, arg2);
        }
    }
}
