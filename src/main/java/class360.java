import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class360 extends class224 {

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "Lld;")
    private class105 field4966 = new class105();

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "Lld;")
    private class105 field4967 = new class105();

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    private int field4969 = 0;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    private int field4968 = -1;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([III)V", line = 8)
    public final synchronized void method59(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4968 < 0) {
                this.method2205(arg0, arg1, arg2);
                return;
            }
            if (this.field4969 + arg2 < this.field4968) {
                this.field4969 += arg2;
                this.method2205(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4968 - this.field4969;
            this.method2205(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4969 += var4;
            this.method2200();
            class149 var5 = (class149) this.field4967.method652((byte) 37);
            synchronized (var5) {
                int var7 = var5.method886(this);
                if (var7 < 0) {
                    var5.field2114 = 0;
                    this.method2201(var5);
                } else {
                    var5.field2114 = var7;
                    this.method2203(var5.field6046, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "()Lll;", line = 55)
    public final class224 method53() {
        return (class224) this.field4966.method652((byte) 37);
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "()V", line = 60)
    private final void method2200() {
        if (this.field4969 <= 0) {
            return;
        }
        for (class149 var1 = (class149) this.field4967.method652((byte) 37); var1 != null; var1 = (class149) this.field4967.method653(15)) {
            var1.field2114 -= this.field4969;
        }
        this.field4968 -= this.field4969;
        this.field4969 = 0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lqa;)V", line = 84)
    private final void method2201(class149 arg0) {
        arg0.method2614((byte) -126);
        arg0.method885();
        class445 var2 = this.field4967.field1573.field6046;
        if (this.field4967.field1573 == var2) {
            this.field4968 = -1;
        } else {
            this.field4968 = ((class149) var2).field2114;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V", line = 100)
    public final synchronized void method63(int arg0) {
        do {
            if (this.field4968 < 0) {
                this.method2202(arg0);
                return;
            }
            if (this.field4969 + arg0 < this.field4968) {
                this.field4969 += arg0;
                this.method2202(arg0);
                return;
            }
            int var2 = this.field4968 - this.field4969;
            this.method2202(var2);
            arg0 -= var2;
            this.field4969 += var2;
            this.method2200();
            class149 var3 = (class149) this.field4967.method652((byte) 37);
            synchronized (var3) {
                int var5 = var3.method886(this);
                if (var5 < 0) {
                    var3.field2114 = 0;
                    this.method2201(var3);
                } else {
                    var3.field2114 = var5;
                    this.method2203(var3.field6046, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V", line = 146)
    private final void method2202(int arg0) {
        for (class224 var2 = (class224) this.field4966.method652((byte) 37); var2 != null; var2 = (class224) this.field4966.method653(44)) {
            var2.method63(arg0);
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "()I", line = 156)
    public final int method58() {
        return 0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lag;Lqa;)V", line = 159)
    private final void method2203(class445 arg0, class149 arg1) {
        while (this.field4967.field1573 != arg0 && ((class149) arg0).field2114 <= arg1.field2114) {
            arg0 = arg0.field6046;
        }
        class429.method2538(arg1, (byte) 113, arg0);
        this.field4968 = ((class149) this.field4967.field1573.field6046).field2114;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lll;)V", line = 167)
    public final synchronized void method2204(class224 arg0) {
        arg0.method2614((byte) -105);
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "([III)V", line = 172)
    private final void method2205(int[] arg0, int arg1, int arg2) {
        for (class224 var4 = (class224) this.field4966.method652((byte) 37); var4 != null; var4 = (class224) this.field4966.method653(64)) {
            var4.method1265(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "()Lll;", line = 184)
    public final class224 method56() {
        return (class224) this.field4966.method653(73);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(Lll;)V", line = 189)
    public final synchronized void method2206(class224 arg0) {
        this.field4966.method646(-67, arg0);
    }
}
