import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class107 extends class95 {

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "Led;")
    private class187 field1558 = new class187();

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "Led;")
    private class187 field1559 = new class187();

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
    private int field1561 = 0;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    private int field1560 = -1;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)V")
    public final synchronized void method245(int arg0) {
        do {
            if (this.field1560 < 0) {
                this.method799(arg0);
                return;
            }
            if (this.field1561 + arg0 < this.field1560) {
                this.field1561 += arg0;
                this.method799(arg0);
                return;
            }
            int var2 = this.field1560 - this.field1561;
            this.method799(var2);
            arg0 -= var2;
            this.field1561 += var2;
            this.method797();
            class137 var3 = (class137) this.field1559.method1384(2);
            synchronized (var3) {
                int var5 = var3.method978(this);
                if (var5 < 0) {
                    var3.field2229 = 0;
                    this.method794(var3);
                } else {
                    var3.field2229 = var5;
                    this.method796(var3.field4470, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([III)V")
    public final synchronized void method248(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1560 < 0) {
                this.method798(arg0, arg1, arg2);
                return;
            }
            if (this.field1561 + arg2 < this.field1560) {
                this.field1561 += arg2;
                this.method798(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1560 - this.field1561;
            this.method798(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1561 += var4;
            this.method797();
            class137 var5 = (class137) this.field1559.method1384(2);
            synchronized (var5) {
                int var7 = var5.method978(this);
                if (var7 < 0) {
                    var5.field2229 = 0;
                    this.method794(var5);
                } else {
                    var5.field2229 = var7;
                    this.method796(var5.field4470, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "()Lcf;")
    public final class95 method250() {
        return (class95) this.field1558.method1384(2);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lcf;)V")
    public final synchronized void method793(class95 arg0) {
        this.field1558.method1391(2, arg0);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lac;)V")
    private final void method794(class137 arg0) {
        arg0.method1922(-1);
        arg0.method977();
        class280 var2 = this.field1559.field3013.field4470;
        if (this.field1559.field3013 == var2) {
            this.field1560 = -1;
        } else {
            this.field1560 = ((class137) var2).field2229;
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "()I")
    public final int method253() {
        return 0;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(Lcf;)V")
    public final synchronized void method795(class95 arg0) {
        arg0.method1922(-1);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "()Lcf;")
    public final class95 method249() {
        return (class95) this.field1558.method1388((byte) 105);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ltj;Lac;)V")
    private final void method796(class280 arg0, class137 arg1) {
        while (this.field1559.field3013 != arg0 && ((class137) arg0).field2229 <= arg1.field2229) {
            arg0 = arg0.field4470;
        }
        class83.method606(arg1, 0, arg0);
        this.field1560 = ((class137) this.field1559.field3013.field4470).field2229;
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "()V")
    private final void method797() {
        if (this.field1561 <= 0) {
            return;
        }
        for (class137 var1 = (class137) this.field1559.method1384(2); var1 != null; var1 = (class137) this.field1559.method1388((byte) 111)) {
            var1.field2229 -= this.field1561;
        }
        this.field1560 -= this.field1561;
        this.field1561 = 0;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "([III)V")
    private final void method798(int[] arg0, int arg1, int arg2) {
        for (class95 var4 = (class95) this.field1558.method1384(2); var4 != null; var4 = (class95) this.field1558.method1388((byte) 116)) {
            var4.method741(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)V")
    private final void method799(int arg0) {
        for (class95 var2 = (class95) this.field1558.method1384(2); var2 != null; var2 = (class95) this.field1558.method1388((byte) 79)) {
            var2.method245(arg0);
        }
    }
}
