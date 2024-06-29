import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class356 extends class29 {

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "Lsf;")
    private class398 field5248 = new class398();

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "Lsf;")
    private class398 field5249 = new class398();

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    private int field5250 = -1;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    private int field5251 = 0;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "([III)V")
    private final void method2132(int[] arg0, int arg1, int arg2) {
        for (class29 var4 = (class29) this.field5248.method2514((byte) 61); var4 != null; var4 = (class29) this.field5248.method2511(-123)) {
            var4.method171(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lwf;)V")
    public final synchronized void method2133(class29 arg0) {
        this.field5248.method2513((byte) 89, arg0);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lgi;)V")
    private final void method2134(class428 arg0) {
        arg0.method625((byte) -50);
        arg0.method2636();
        class97 var2 = this.field5249.field5946.field1331;
        if (this.field5249.field5946 == var2) {
            this.field5250 = -1;
        } else {
            this.field5250 = ((class428) var2).field6298;
        }
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "()Lwf;")
    public final class29 method170() {
        return (class29) this.field5248.method2514((byte) 61);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([III)V")
    public final synchronized void method167(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field5250 < 0) {
                this.method2132(arg0, arg1, arg2);
                return;
            }
            if (this.field5251 + arg2 < this.field5250) {
                this.field5251 += arg2;
                this.method2132(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field5250 - this.field5251;
            this.method2132(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field5251 += var4;
            this.method2138();
            class428 var5 = (class428) this.field5249.method2514((byte) 61);
            synchronized (var5) {
                int var7 = var5.method2635(this);
                if (var7 < 0) {
                    var5.field6298 = 0;
                    this.method2134(var5);
                } else {
                    var5.field6298 = var7;
                    this.method2137(var5.field1331, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(Lwf;)V")
    public final synchronized void method2135(class29 arg0) {
        arg0.method625((byte) -50);
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "()Lwf;")
    public final class29 method169() {
        return (class29) this.field5248.method2511(43);
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)V")
    private final void method2136(int arg0) {
        for (class29 var2 = (class29) this.field5248.method2514((byte) 61); var2 != null; var2 = (class29) this.field5248.method2511(-111)) {
            var2.method168(arg0);
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "()I")
    public final int method166() {
        return 0;
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
    public final synchronized void method168(int arg0) {
        do {
            if (this.field5250 < 0) {
                this.method2136(arg0);
                return;
            }
            if (this.field5251 + arg0 < this.field5250) {
                this.field5251 += arg0;
                this.method2136(arg0);
                return;
            }
            int var2 = this.field5250 - this.field5251;
            this.method2136(var2);
            arg0 -= var2;
            this.field5251 += var2;
            this.method2138();
            class428 var3 = (class428) this.field5249.method2514((byte) 61);
            synchronized (var3) {
                int var5 = var3.method2635(this);
                if (var5 < 0) {
                    var3.field6298 = 0;
                    this.method2134(var3);
                } else {
                    var3.field6298 = var5;
                    this.method2137(var3.field1331, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lnr;Lgi;)V")
    private final void method2137(class97 arg0, class428 arg1) {
        while (this.field5249.field5946 != arg0 && ((class428) arg0).field6298 <= arg1.field6298) {
            arg0 = arg0.field1331;
        }
        class54.method311(arg0, -1, arg1);
        this.field5250 = ((class428) this.field5249.field5946.field1331).field6298;
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "()V")
    private final void method2138() {
        if (this.field5251 <= 0) {
            return;
        }
        for (class428 var1 = (class428) this.field5249.method2514((byte) 61); var1 != null; var1 = (class428) this.field5249.method2511(93)) {
            var1.field6298 -= this.field5251;
        }
        this.field5250 -= this.field5251;
        this.field5251 = 0;
    }
}
