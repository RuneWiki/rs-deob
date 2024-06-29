import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class146 extends class273 {

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "Llh;")
    private class58 field2010 = new class58();

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "Llh;")
    private class58 field2011 = new class58();

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    private int field2012 = 0;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    private int field2013 = -1;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "([III)V")
    private final void method909(int[] arg0, int arg1, int arg2) {
        for (class273 var4 = (class273) this.field2010.method369((byte) -83); var4 != null; var4 = (class273) this.field2010.method362(false)) {
            var4.method1779(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lrg;)V")
    public final synchronized void method910(class273 arg0) {
        arg0.method962(128);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "()I")
    public final int method911() {
        return 0;
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "()Lrg;")
    public final class273 method912() {
        return (class273) this.field2010.method369((byte) -87);
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "()V")
    private final void method913() {
        if (this.field2012 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field2011.method369((byte) -86); var1 != null; var1 = (class55) this.field2011.method362(false)) {
            var1.field780 -= this.field2012;
        }
        this.field2013 -= this.field2012;
        this.field2012 = 0;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([III)V")
    public final synchronized void method914(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2013 < 0) {
                this.method909(arg0, arg1, arg2);
                return;
            }
            if (this.field2012 + arg2 < this.field2013) {
                this.field2012 += arg2;
                this.method909(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2013 - this.field2012;
            this.method909(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2012 += var4;
            this.method913();
            class55 var5 = (class55) this.field2011.method369((byte) -121);
            synchronized (var5) {
                int var7 = var5.method349(this);
                if (var7 < 0) {
                    var5.field780 = 0;
                    this.method919(var5);
                } else {
                    var5.field780 = var7;
                    this.method915(var5.field2144, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lhb;Lbk;)V")
    private final void method915(class154 arg0, class55 arg1) {
        while (this.field2011.field808 != arg0 && ((class55) arg0).field780 <= arg1.field780) {
            arg0 = arg0.field2144;
        }
        class117.method746(arg1, (byte) 45, arg0);
        this.field2013 = ((class55) this.field2011.field808.field2144).field780;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(Lrg;)V")
    public final synchronized void method916(class273 arg0) {
        this.field2010.method368((byte) -49, arg0);
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "()Lrg;")
    public final class273 method917() {
        return (class273) this.field2010.method362(false);
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)V")
    public final synchronized void method918(int arg0) {
        do {
            if (this.field2013 < 0) {
                this.method920(arg0);
                return;
            }
            if (this.field2012 + arg0 < this.field2013) {
                this.field2012 += arg0;
                this.method920(arg0);
                return;
            }
            int var2 = this.field2013 - this.field2012;
            this.method920(var2);
            arg0 -= var2;
            this.field2012 += var2;
            this.method913();
            class55 var3 = (class55) this.field2011.method369((byte) -94);
            synchronized (var3) {
                int var5 = var3.method349(this);
                if (var5 < 0) {
                    var3.field780 = 0;
                    this.method919(var3);
                } else {
                    var3.field780 = var5;
                    this.method915(var3.field2144, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lbk;)V")
    private final void method919(class55 arg0) {
        arg0.method962(128);
        arg0.method350();
        class154 var2 = this.field2011.field808.field2144;
        if (this.field2011.field808 == var2) {
            this.field2013 = -1;
        } else {
            this.field2013 = ((class55) var2).field780;
        }
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)V")
    private final void method920(int arg0) {
        for (class273 var2 = (class273) this.field2010.method369((byte) -79); var2 != null; var2 = (class273) this.field2010.method362(false)) {
            var2.method918(arg0);
        }
    }
}
