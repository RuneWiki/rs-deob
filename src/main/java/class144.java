import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class144 extends class202 {

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "Lth;")
    private class187 field3010 = new class187();

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "Lth;")
    private class187 field3011 = new class187();

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    private int field3012 = 0;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
    private int field3013 = -1;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "()Lve;")
    public final class202 method704() {
        return (class202) this.field3010.method1232(25831);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lve;)V")
    public final synchronized void method982(class202 arg0) {
        arg0.method799(-24265);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "()I")
    public final int method707() {
        return 0;
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
    private final void method983(int arg0) {
        for (class202 var2 = (class202) this.field3010.method1232(25831); var2 != null; var2 = (class202) this.field3010.method1238(22622)) {
            var2.method694(arg0);
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(Lve;)V")
    public final synchronized void method984(class202 arg0) {
        this.field3010.method1239((byte) 127, arg0);
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "([III)V")
    private final void method985(int[] arg0, int arg1, int arg2) {
        for (class202 var4 = (class202) this.field3010.method1232(25831); var4 != null; var4 = (class202) this.field3010.method1238(22622)) {
            var4.method1339(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ltf;)V")
    private final void method986(class185 arg0) {
        arg0.method799(-24265);
        arg0.method1225();
        class109 var2 = this.field3011.field3810.field2418;
        if (this.field3011.field3810 == var2) {
            this.field3013 = -1;
        } else {
            this.field3013 = ((class185) var2).field3788;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Llb;Ltf;)V")
    private final void method987(class109 arg0, class185 arg1) {
        while (this.field3011.field3810 != arg0 && ((class185) arg0).field3788 <= arg1.field3788) {
            arg0 = arg0.field2418;
        }
        this.field3011.method1233(arg0, -1, arg1);
        this.field3013 = ((class185) this.field3011.field3810.field2418).field3788;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "()Lve;")
    public final class202 method682() {
        return (class202) this.field3010.method1238(22622);
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "()V")
    private final void method988() {
        if (this.field3012 <= 0) {
            return;
        }
        for (class185 var1 = (class185) this.field3011.method1232(25831); var1 != null; var1 = (class185) this.field3011.method1238(22622)) {
            var1.field3788 -= this.field3012;
        }
        this.field3013 -= this.field3012;
        this.field3012 = 0;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([III)V")
    public final synchronized void method705(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3013 < 0) {
                this.method985(arg0, arg1, arg2);
                return;
            }
            if (this.field3012 + arg2 < this.field3013) {
                this.field3012 += arg2;
                this.method985(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3013 - this.field3012;
            this.method985(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3012 += var4;
            this.method988();
            class185 var5 = (class185) this.field3011.method1232(25831);
            synchronized (var5) {
                int var7 = var5.method1226(this);
                if (var7 < 0) {
                    var5.field3788 = 0;
                    this.method986(var5);
                } else {
                    var5.field3788 = var7;
                    this.method987(var5.field2418, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
    public final synchronized void method694(int arg0) {
        do {
            if (this.field3013 < 0) {
                this.method983(arg0);
                return;
            }
            if (this.field3012 + arg0 < this.field3013) {
                this.field3012 += arg0;
                this.method983(arg0);
                return;
            }
            int var2 = this.field3013 - this.field3012;
            this.method983(var2);
            arg0 -= var2;
            this.field3012 += var2;
            this.method988();
            class185 var3 = (class185) this.field3011.method1232(25831);
            synchronized (var3) {
                int var5 = var3.method1226(this);
                if (var5 < 0) {
                    var3.field3788 = 0;
                    this.method986(var3);
                } else {
                    var3.field3788 = var5;
                    this.method987(var3.field2418, var3);
                }
            }
        } while (arg0 != 0);
    }
}
