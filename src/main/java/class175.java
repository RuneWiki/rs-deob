import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class class175 extends class97 {

    @OriginalMember(owner = "t", name = "r", descriptor = "Ltf;")
    private class181 field3317 = new class181();

    @OriginalMember(owner = "t", name = "s", descriptor = "Ltf;")
    private class181 field3318 = new class181();

    @OriginalMember(owner = "t", name = "t", descriptor = "I")
    private int field3319 = -1;

    @OriginalMember(owner = "t", name = "u", descriptor = "I")
    private int field3320 = 0;

    @OriginalMember(owner = "t", name = "a", descriptor = "(I)V")
    public final synchronized void method622(int arg0) {
        do {
            if (this.field3319 < 0) {
                this.method1197(arg0);
                return;
            }
            if (this.field3320 + arg0 < this.field3319) {
                this.field3320 += arg0;
                this.method1197(arg0);
                return;
            }
            int var2 = this.field3319 - this.field3320;
            this.method1197(var2);
            arg0 -= var2;
            this.field3320 += var2;
            this.method1202();
            class101 var3 = (class101) this.field3318.method1230(90);
            synchronized (var3) {
                int var5 = var3.method732(this);
                if (var5 < 0) {
                    var3.field2014 = 0;
                    this.method1199(var3);
                } else {
                    var3.field2014 = var5;
                    this.method1201(var3.field1385, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "t", name = "d", descriptor = "()I")
    public final int method650() {
        return 0;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "([III)V")
    public final synchronized void method620(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3319 < 0) {
                this.method1200(arg0, arg1, arg2);
                return;
            }
            if (this.field3320 + arg2 < this.field3319) {
                this.field3320 += arg2;
                this.method1200(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3319 - this.field3320;
            this.method1200(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3320 += var4;
            this.method1202();
            class101 var5 = (class101) this.field3318.method1230(123);
            synchronized (var5) {
                int var7 = var5.method732(this);
                if (var7 < 0) {
                    var5.field2014 = 0;
                    this.method1199(var5);
                } else {
                    var5.field2014 = var7;
                    this.method1201(var5.field1385, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(Lkc;)V")
    public final synchronized void method1196(class97 arg0) {
        this.field3317.method1227(arg0, (byte) -69);
    }

    @OriginalMember(owner = "t", name = "b", descriptor = "(I)V")
    private final void method1197(int arg0) {
        for (class97 var2 = (class97) this.field3317.method1230(35); var2 != null; var2 = (class97) this.field3317.method1234(-1)) {
            var2.method622(arg0);
        }
    }

    @OriginalMember(owner = "t", name = "b", descriptor = "(Lkc;)V")
    public final synchronized void method1198(class97 arg0) {
        arg0.method452(true);
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(Lkg;)V")
    private final void method1199(class101 arg0) {
        arg0.method452(true);
        arg0.method731();
        class71 var2 = this.field3318.field3417.field1385;
        if (this.field3318.field3417 == var2) {
            this.field3319 = -1;
        } else {
            this.field3319 = ((class101) var2).field2014;
        }
    }

    @OriginalMember(owner = "t", name = "c", descriptor = "([III)V")
    private final void method1200(int[] arg0, int arg1, int arg2) {
        for (class97 var4 = (class97) this.field3317.method1230(47); var4 != null; var4 = (class97) this.field3317.method1234(-1)) {
            var4.method689(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "t", name = "c", descriptor = "()Lkc;")
    public final class97 method630() {
        return (class97) this.field3317.method1234(-1);
    }

    @OriginalMember(owner = "t", name = "b", descriptor = "()Lkc;")
    public final class97 method613() {
        return (class97) this.field3317.method1230(63);
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(Lhb;Lkg;)V")
    private final void method1201(class71 arg0, class101 arg1) {
        while (this.field3318.field3417 != arg0 && ((class101) arg0).field2014 <= arg1.field2014) {
            arg0 = arg0.field1385;
        }
        this.field3318.method1236(0, arg0, arg1);
        this.field3319 = ((class101) this.field3318.field3417.field1385).field2014;
    }

    @OriginalMember(owner = "t", name = "e", descriptor = "()V")
    private final void method1202() {
        if (this.field3320 <= 0) {
            return;
        }
        for (class101 var1 = (class101) this.field3318.method1230(49); var1 != null; var1 = (class101) this.field3318.method1234(-1)) {
            var1.field2014 -= this.field3320;
        }
        this.field3319 -= this.field3320;
        this.field3320 = 0;
    }
}
