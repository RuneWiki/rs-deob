import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class115 extends class168 {

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "Lfl;")
    private class191 field2059 = new class191();

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "Lfl;")
    private class191 field2060 = new class191();

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    private int field2061 = -1;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    private int field2062 = 0;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
    public final synchronized void method354(int arg0) {
        do {
            if (this.field2061 < 0) {
                this.method803(arg0);
                return;
            }
            if (this.field2062 + arg0 < this.field2061) {
                this.field2062 += arg0;
                this.method803(arg0);
                return;
            }
            int var2 = this.field2061 - this.field2062;
            this.method803(var2);
            arg0 -= var2;
            this.field2062 += var2;
            this.method800();
            class8 var3 = (class8) this.field2060.method1375(16259);
            synchronized (var3) {
                int var5 = var3.method87(this);
                if (var5 < 0) {
                    var3.field171 = 0;
                    this.method797(var3);
                } else {
                    var3.field171 = var5;
                    this.method798(var3.field1269, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "()Lhf;")
    public final class168 method336() {
        return (class168) this.field2059.method1377(-19546);
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "()Lhf;")
    public final class168 method342() {
        return (class168) this.field2059.method1375(16259);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Laa;)V")
    private final void method797(class8 arg0) {
        arg0.method476(-111);
        arg0.method88();
        class73 var2 = this.field2060.field3536.field1269;
        if (this.field2060.field3536 == var2) {
            this.field2061 = -1;
        } else {
            this.field2061 = ((class8) var2).field171;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([III)V")
    public final synchronized void method356(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2061 < 0) {
                this.method799(arg0, arg1, arg2);
                return;
            }
            if (this.field2062 + arg2 < this.field2061) {
                this.field2062 += arg2;
                this.method799(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2061 - this.field2062;
            this.method799(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2062 += var4;
            this.method800();
            class8 var5 = (class8) this.field2060.method1375(16259);
            synchronized (var5) {
                int var7 = var5.method87(this);
                if (var7 < 0) {
                    var5.field171 = 0;
                    this.method797(var5);
                } else {
                    var5.field171 = var7;
                    this.method798(var5.field1269, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "()I")
    public final int method347() {
        return 0;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lua;Laa;)V")
    private final void method798(class73 arg0, class8 arg1) {
        while (this.field2060.field3536 != arg0 && ((class8) arg0).field171 <= arg1.field171) {
            arg0 = arg0.field1269;
        }
        class193.method1394(2, arg1, arg0);
        this.field2061 = ((class8) this.field2060.field3536.field1269).field171;
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "([III)V")
    private final void method799(int[] arg0, int arg1, int arg2) {
        for (class168 var4 = (class168) this.field2059.method1375(16259); var4 != null; var4 = (class168) this.field2059.method1377(-19546)) {
            var4.method1209(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "()V")
    private final void method800() {
        if (this.field2062 <= 0) {
            return;
        }
        for (class8 var1 = (class8) this.field2060.method1375(16259); var1 != null; var1 = (class8) this.field2060.method1377(-19546)) {
            var1.field171 -= this.field2062;
        }
        this.field2061 -= this.field2062;
        this.field2062 = 0;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lhf;)V")
    public final synchronized void method801(class168 arg0) {
        this.field2059.method1378(arg0, false);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(Lhf;)V")
    public final synchronized void method802(class168 arg0) {
        arg0.method476(-79);
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
    private final void method803(int arg0) {
        for (class168 var2 = (class168) this.field2059.method1375(16259); var2 != null; var2 = (class168) this.field2059.method1377(-19546)) {
            var2.method354(arg0);
        }
    }
}
