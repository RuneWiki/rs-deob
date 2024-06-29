import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class98 extends class144 {

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "Lk;")
    private class69 field2368 = new class69();

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "Lk;")
    private class69 field2369 = new class69();

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
    private int field2371 = -1;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "I")
    private int field2370 = 0;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lv;)V")
    public final synchronized void method788(class144 arg0) {
        this.field2368.method513(arg0, 127);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Lv;)V")
    public final synchronized void method789(class144 arg0) {
        arg0.method674(32);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Lv;")
    public final class144 method83() {
        return (class144) this.field2368.method512(0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldc;)V")
    private final void method790(class25 arg0) {
        arg0.method674(32);
        arg0.method226();
        class88 var2 = this.field2369.field1451.field2085;
        if (this.field2369.field1451 == var2) {
            this.field2371 = -1;
        } else {
            this.field2371 = ((class25) var2).field580;
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Lv;")
    public final class144 method79() {
        return (class144) this.field2368.method520((byte) 40);
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()V")
    private final void method791() {
        if (this.field2370 <= 0) {
            return;
        }
        for (class25 var1 = (class25) this.field2369.method512(0); var1 != null; var1 = (class25) this.field2369.method520((byte) 118)) {
            var1.field580 -= this.field2370;
        }
        this.field2371 -= this.field2370;
        this.field2370 = 0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lme;Ldc;)V")
    private final void method792(class88 arg0, class25 arg1) {
        while (this.field2369.field1451 != arg0 && ((class25) arg0).field580 <= arg1.field580) {
            arg0 = arg0.field2085;
        }
        this.field2369.method517(arg1, 0, arg0);
        this.field2371 = ((class25) this.field2369.field1451.field2085).field580;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()I")
    public final int method88() {
        return 0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([III)V")
    public final synchronized void method87(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2371 < 0) {
                this.method793(arg0, arg1, arg2);
                return;
            }
            if (this.field2370 + arg2 < this.field2371) {
                this.field2370 += arg2;
                this.method793(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2371 - this.field2370;
            this.method793(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2370 += var4;
            this.method791();
            class25 var5 = (class25) this.field2369.method512(0);
            synchronized (var5) {
                int var7 = var5.method227(this);
                if (var7 < 0) {
                    var5.field580 = 0;
                    this.method790(var5);
                } else {
                    var5.field580 = var7;
                    this.method792(var5.field2085, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "([III)V")
    private final void method793(int[] arg0, int arg1, int arg2) {
        for (class144 var4 = (class144) this.field2368.method512(0); var4 != null; var4 = (class144) this.field2368.method520((byte) 61)) {
            var4.method1168(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public final synchronized void method80(int arg0) {
        do {
            if (this.field2371 < 0) {
                this.method794(arg0);
                return;
            }
            if (this.field2370 + arg0 < this.field2371) {
                this.field2370 += arg0;
                this.method794(arg0);
                return;
            }
            int var2 = this.field2371 - this.field2370;
            this.method794(var2);
            arg0 -= var2;
            this.field2370 += var2;
            this.method791();
            class25 var3 = (class25) this.field2369.method512(0);
            synchronized (var3) {
                int var5 = var3.method227(this);
                if (var5 < 0) {
                    var3.field580 = 0;
                    this.method790(var3);
                } else {
                    var3.field580 = var5;
                    this.method792(var3.field2085, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final void method794(int arg0) {
        for (class144 var2 = (class144) this.field2368.method512(0); var2 != null; var2 = (class144) this.field2368.method520((byte) 99)) {
            var2.method80(arg0);
        }
    }
}
