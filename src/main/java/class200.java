import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class200 extends class258 {

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "Lda;")
    private class212 field3204 = new class212();

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "Lda;")
    private class212 field3205 = new class212();

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    private int field3206 = -1;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    private int field3207 = 0;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lqb;)V", line = 5)
    private final void method1417(class309 arg0) {
        arg0.method418(6971);
        arg0.method2144();
        class59 var2 = this.field3205.field3413.field841;
        if (this.field3205.field3413 == var2) {
            this.field3206 = -1;
        } else {
            this.field3206 = ((class309) var2).field5213;
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V", line = 25)
    public final synchronized void method1054(int arg0) {
        do {
            if (this.field3206 < 0) {
                this.method1419(arg0);
                return;
            }
            if (this.field3207 + arg0 < this.field3206) {
                this.field3207 += arg0;
                this.method1419(arg0);
                return;
            }
            int var2 = this.field3206 - this.field3207;
            this.method1419(var2);
            arg0 -= var2;
            this.field3207 += var2;
            this.method1418();
            class309 var3 = (class309) this.field3205.method1495(-312);
            synchronized (var3) {
                int var5 = var3.method2145(this);
                if (var5 < 0) {
                    var3.field5213 = 0;
                    this.method1417(var3);
                } else {
                    var3.field5213 = var5;
                    this.method1420(var3.field841, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "()Lcm;", line = 70)
    public final class258 method1075() {
        return (class258) this.field3204.method1501(48);
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "()V", line = 79)
    private final void method1418() {
        if (this.field3207 <= 0) {
            return;
        }
        for (class309 var1 = (class309) this.field3205.method1495(-312); var1 != null; var1 = (class309) this.field3205.method1501(118)) {
            var1.field5213 -= this.field3207;
        }
        this.field3206 -= this.field3207;
        this.field3207 = 0;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "()Lcm;", line = 96)
    public final class258 method1070() {
        return (class258) this.field3204.method1495(-312);
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V", line = 102)
    private final void method1419(int arg0) {
        for (class258 var2 = (class258) this.field3204.method1495(-312); var2 != null; var2 = (class258) this.field3204.method1501(48)) {
            var2.method1054(arg0);
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "()I", line = 111)
    public final int method1067() {
        return 0;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Llh;Lqb;)V", line = 115)
    private final void method1420(class59 arg0, class309 arg1) {
        while (this.field3205.field3413 != arg0 && ((class309) arg0).field5213 <= arg1.field5213) {
            arg0 = arg0.field841;
        }
        class93.method663((byte) -121, arg0, arg1);
        this.field3206 = ((class309) this.field3205.field3413.field841).field5213;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([III)V", line = 127)
    public final synchronized void method1072(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3206 < 0) {
                this.method1423(arg0, arg1, arg2);
                return;
            }
            if (this.field3207 + arg2 < this.field3206) {
                this.field3207 += arg2;
                this.method1423(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3206 - this.field3207;
            this.method1423(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3207 += var4;
            this.method1418();
            class309 var5 = (class309) this.field3205.method1495(-312);
            synchronized (var5) {
                int var7 = var5.method2145(this);
                if (var7 < 0) {
                    var5.field5213 = 0;
                    this.method1417(var5);
                } else {
                    var5.field5213 = var7;
                    this.method1420(var5.field841, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lcm;)V", line = 176)
    public final synchronized void method1421(class258 arg0) {
        arg0.method418(6971);
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(Lcm;)V", line = 181)
    public final synchronized void method1422(class258 arg0) {
        this.field3204.method1498(arg0, (byte) 70);
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "([III)V", line = 190)
    private final void method1423(int[] arg0, int arg1, int arg2) {
        for (class258 var4 = (class258) this.field3204.method1495(-312); var4 != null; var4 = (class258) this.field3204.method1501(97)) {
            var4.method1826(arg0, arg1, arg2);
        }
    }
}
