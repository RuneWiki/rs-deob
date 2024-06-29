import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class98 extends class129 {

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "Lqb;")
    private class113 field2275 = new class113();

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "Lqb;")
    private class113 field2276 = new class113();

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "I")
    private int field2277 = 0;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
    private int field2278 = -1;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lsd;)V")
    public final synchronized void method759(class129 arg0) {
        this.field2275.method894(-1, arg0);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "([III)V")
    private final void method760(int[] arg0, int arg1, int arg2) {
        for (class129 var4 = (class129) this.field2275.method889(-121); var4 != null; var4 = (class129) this.field2275.method884(true)) {
            var4.method1006(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lob;Lq;)V")
    private final void method761(class99 arg0, class111 arg1) {
        while (this.field2276.field2645 != arg0 && ((class111) arg0).field2589 <= arg1.field2589) {
            arg0 = arg0.field2280;
        }
        this.field2276.method892(88, arg1, arg0);
        this.field2278 = ((class111) this.field2276.field2645.field2280).field2589;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()Lsd;")
    public final class129 method122() {
        return (class129) this.field2275.method889(-12);
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()V")
    private final void method762() {
        if (this.field2277 <= 0) {
            return;
        }
        for (class111 var1 = (class111) this.field2276.method889(127); var1 != null; var1 = (class111) this.field2276.method884(true)) {
            var1.field2589 -= this.field2277;
        }
        this.field2278 -= this.field2277;
        this.field2277 = 0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lq;)V")
    private final void method763(class111 arg0) {
        arg0.method768(-1);
        arg0.method873();
        class99 var2 = this.field2276.field2645.field2280;
        if (this.field2276.field2645 == var2) {
            this.field2278 = -1;
        } else {
            this.field2278 = ((class111) var2).field2589;
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Lsd;")
    public final class129 method102() {
        return (class129) this.field2275.method884(true);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    private final void method764(int arg0) {
        for (class129 var2 = (class129) this.field2275.method889(-10); var2 != null; var2 = (class129) this.field2275.method884(true)) {
            var2.method114(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()I")
    public final int method133() {
        return 0;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public final synchronized void method114(int arg0) {
        do {
            if (this.field2278 < 0) {
                this.method764(arg0);
                return;
            }
            if (this.field2277 + arg0 < this.field2278) {
                this.field2277 += arg0;
                this.method764(arg0);
                return;
            }
            int var2 = this.field2278 - this.field2277;
            this.method764(var2);
            arg0 -= var2;
            this.field2277 += var2;
            this.method762();
            class111 var3 = (class111) this.field2276.method889(-82);
            synchronized (var3) {
                int var5 = var3.method874(this);
                if (var5 < 0) {
                    var3.field2589 = 0;
                    this.method763(var3);
                } else {
                    var3.field2589 = var5;
                    this.method761(var3.field2280, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Lsd;)V")
    public final synchronized void method765(class129 arg0) {
        arg0.method768(-1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([III)V")
    public final synchronized void method132(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2278 < 0) {
                this.method760(arg0, arg1, arg2);
                return;
            }
            if (this.field2277 + arg2 < this.field2278) {
                this.field2277 += arg2;
                this.method760(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2278 - this.field2277;
            this.method760(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2277 += var4;
            this.method762();
            class111 var5 = (class111) this.field2276.method889(-12);
            synchronized (var5) {
                int var7 = var5.method874(this);
                if (var7 < 0) {
                    var5.field2589 = 0;
                    this.method763(var5);
                } else {
                    var5.field2589 = var7;
                    this.method761(var5.field2280, var5);
                }
            }
        } while (arg2 != 0);
    }
}
