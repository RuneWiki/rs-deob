import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class18 extends class102 {

    @OriginalMember(owner = "client!od", name = "s", descriptor = "Lbb;")
    private class49 field351 = new class49();

    @OriginalMember(owner = "client!od", name = "t", descriptor = "Lbb;")
    private class49 field352 = new class49();

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    private int field353 = 0;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    private int field354 = -1;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "([III)V")
    private final void method103(int[] arg0, int arg1, int arg2) {
        for (class102 var4 = (class102) this.field351.method309(0); var4 != null; var4 = (class102) this.field351.method312((byte) -118)) {
            var4.method742(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "(I)V")
    private final void method104(int arg0) {
        for (class102 var2 = (class102) this.field351.method309(0); var2 != null; var2 = (class102) this.field351.method312((byte) 119)) {
            var2.method112(arg0);
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "()Lnk;")
    public final class102 method105() {
        return (class102) this.field351.method309(0);
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "()V")
    private final void method106() {
        if (this.field353 <= 0) {
            return;
        }
        for (class129 var1 = (class129) this.field352.method309(0); var1 != null; var1 = (class129) this.field352.method312((byte) 103)) {
            var1.field2143 -= this.field353;
        }
        this.field354 -= this.field353;
        this.field353 = 0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lnk;)V")
    public final synchronized void method107(class102 arg0) {
        this.field351.method313(1, arg0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lob;Lgk;)V")
    private final void method108(class134 arg0, class129 arg1) {
        while (this.field352.field835 != arg0 && ((class129) arg0).field2143 <= arg1.field2143) {
            arg0 = arg0.field2209;
        }
        class295.method2036(arg1, (byte) 13, arg0);
        this.field354 = ((class129) this.field352.field835.field2209).field2143;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "()Lnk;")
    public final class102 method109() {
        return (class102) this.field351.method312((byte) -102);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "([III)V")
    public final synchronized void method110(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field354 < 0) {
                this.method103(arg0, arg1, arg2);
                return;
            }
            if (this.field353 + arg2 < this.field354) {
                this.field353 += arg2;
                this.method103(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field354 - this.field353;
            this.method103(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field353 += var4;
            this.method106();
            class129 var5 = (class129) this.field352.method309(0);
            synchronized (var5) {
                int var7 = var5.method967(this);
                if (var7 < 0) {
                    var5.field2143 = 0;
                    this.method114(var5);
                } else {
                    var5.field2143 = var7;
                    this.method108(var5.field2209, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "()I")
    public final int method111() {
        return 0;
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
    public final synchronized void method112(int arg0) {
        do {
            if (this.field354 < 0) {
                this.method104(arg0);
                return;
            }
            if (this.field353 + arg0 < this.field354) {
                this.field353 += arg0;
                this.method104(arg0);
                return;
            }
            int var2 = this.field354 - this.field353;
            this.method104(var2);
            arg0 -= var2;
            this.field353 += var2;
            this.method106();
            class129 var3 = (class129) this.field352.method309(0);
            synchronized (var3) {
                int var5 = var3.method967(this);
                if (var5 < 0) {
                    var3.field2143 = 0;
                    this.method114(var3);
                } else {
                    var3.field2143 = var5;
                    this.method108(var3.field2209, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Lnk;)V")
    public final synchronized void method113(class102 arg0) {
        arg0.method993(32);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lgk;)V")
    private final void method114(class129 arg0) {
        arg0.method993(32);
        arg0.method968();
        class134 var2 = this.field352.field835.field2209;
        if (this.field352.field835 == var2) {
            this.field354 = -1;
        } else {
            this.field354 = ((class129) var2).field2143;
        }
    }
}
