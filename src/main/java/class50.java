import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class50 extends class725 {

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "Lmba;")
    private class646 field741 = new class646();

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Lmba;")
    private class646 field742 = new class646();

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    private int field744 = -1;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    private int field743 = 0;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lno;Lfc;)V", line = 5)
    private final void method354(class71 arg0, class734 arg1) {
        while (this.field742.field8670 != arg0 && ((class734) arg0).field10184 <= arg1.field10184) {
            arg0 = arg0.field1077;
        }
        class428.method2651(arg0, arg1, -6059);
        this.field744 = ((class734) this.field742.field8670.field1077).field10184;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "()I", line = 14)
    public final int method355() {
        return 0;
    }

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "()V", line = 18)
    private final void method356() {
        if (this.field743 <= 0) {
            return;
        }
        for (class734 var1 = (class734) this.field742.method3618(79); var1 != null; var1 = (class734) this.field742.method3619(0)) {
            var1.field10184 -= this.field743;
        }
        this.field744 -= this.field743;
        this.field743 = 0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "()Lco;", line = 35)
    public final class725 method357() {
        return (class725) this.field741.method3619(0);
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "()Lco;", line = 38)
    public final class725 method358() {
        return (class725) this.field741.method3618(-104);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lco;)V", line = 43)
    public final synchronized void method359(class725 arg0) {
        this.field741.method3614(arg0, 1045);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([III)V", line = 60)
    public final synchronized void method360(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field744 < 0) {
                this.method365(arg0, arg1, arg2);
                return;
            }
            if (this.field743 + arg2 < this.field744) {
                this.field743 += arg2;
                this.method365(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field744 - this.field743;
            this.method365(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field743 += var4;
            this.method356();
            class734 var5 = (class734) this.field742.method3618(96);
            synchronized (var5) {
                int var7 = var5.method4093(this);
                if (var7 < 0) {
                    var5.field10184 = 0;
                    this.method364(var5);
                } else {
                    var5.field10184 = var7;
                    this.method354(var5.field1077, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(Lco;)V", line = 104)
    public final synchronized void method361(class725 arg0) {
        arg0.method549(6410);
    }

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "()I", line = 107)
    public final synchronized int method362() {
        return this.field741.method3621(0);
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V", line = 112)
    private final void method363(int arg0) {
        for (class725 var2 = (class725) this.field741.method3618(-104); var2 != null; var2 = (class725) this.field741.method3619(0)) {
            var2.method366(arg0);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lfc;)V", line = 121)
    private final void method364(class734 arg0) {
        arg0.method549(6410);
        arg0.method4094();
        class71 var2 = this.field742.field8670.field1077;
        if (this.field742.field8670 == var2) {
            this.field744 = -1;
        } else {
            this.field744 = ((class734) var2).field10184;
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "([III)V", line = 136)
    private final void method365(int[] arg0, int arg1, int arg2) {
        for (class725 var4 = (class725) this.field741.method3618(91); var4 != null; var4 = (class725) this.field741.method3619(0)) {
            var4.method4048(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 148)
    public final synchronized void method366(int arg0) {
        do {
            if (this.field744 < 0) {
                this.method363(arg0);
                return;
            }
            if (this.field743 + arg0 < this.field744) {
                this.field743 += arg0;
                this.method363(arg0);
                return;
            }
            int var2 = this.field744 - this.field743;
            this.method363(var2);
            arg0 -= var2;
            this.field743 += var2;
            this.method356();
            class734 var3 = (class734) this.field742.method3618(-79);
            synchronized (var3) {
                int var5 = var3.method4093(this);
                if (var5 < 0) {
                    var3.field10184 = 0;
                    this.method364(var3);
                } else {
                    var3.field10184 = var5;
                    this.method354(var3.field1077, var3);
                }
            }
        } while (arg0 != 0);
    }
}
