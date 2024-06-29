import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class25 extends class87 {

    @OriginalMember(owner = "client!d", name = "B", descriptor = "Lpb;")
    private class105 field605 = new class105();

    @OriginalMember(owner = "client!d", name = "C", descriptor = "Lpb;")
    private class105 field606 = new class105();

    @OriginalMember(owner = "client!d", name = "E", descriptor = "I")
    private int field608 = -1;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "I")
    private int field607 = 0;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lsa;)V")
    private final void method197(class125 arg0) {
        arg0.method1176((byte) 119);
        arg0.method983();
        class148 var2 = this.field606.field2427.field3485;
        if (this.field606.field2427 == var2) {
            this.field608 = -1;
        } else {
            this.field608 = ((class125) var2).field2838;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([III)V")
    public final synchronized void method44(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field608 < 0) {
                this.method203(arg0, arg1, arg2);
                return;
            }
            if (this.field607 + arg2 < this.field608) {
                this.field607 += arg2;
                this.method203(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field608 - this.field607;
            this.method203(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field607 += var4;
            this.method202();
            class125 var5 = (class125) this.field606.method840(true);
            synchronized (var5) {
                int var7 = var5.method984(this);
                if (var7 < 0) {
                    var5.field2838 = 0;
                    this.method197(var5);
                } else {
                    var5.field2838 = var7;
                    this.method199(var5.field3485, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "()Lmd;")
    public final class87 method35() {
        return (class87) this.field605.method841((byte) 18);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lmd;)V")
    public final synchronized void method198(class87 arg0) {
        this.field605.method844(arg0, false);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lvd;Lsa;)V")
    private final void method199(class148 arg0, class125 arg1) {
        while (this.field606.field2427 != arg0 && ((class125) arg0).field2838 <= arg1.field2838) {
            arg0 = arg0.field3485;
        }
        this.field606.method849(53, arg1, arg0);
        this.field608 = ((class125) this.field606.field2427.field3485).field2838;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "()I")
    public final int method42() {
        return 0;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
    public final synchronized void method41(int arg0) {
        do {
            if (this.field608 < 0) {
                this.method200(arg0);
                return;
            }
            if (this.field607 + arg0 < this.field608) {
                this.field607 += arg0;
                this.method200(arg0);
                return;
            }
            int var2 = this.field608 - this.field607;
            this.method200(var2);
            arg0 -= var2;
            this.field607 += var2;
            this.method202();
            class125 var3 = (class125) this.field606.method840(true);
            synchronized (var3) {
                int var5 = var3.method984(this);
                if (var5 < 0) {
                    var3.field2838 = 0;
                    this.method197(var3);
                } else {
                    var3.field2838 = var5;
                    this.method199(var3.field3485, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
    private final void method200(int arg0) {
        for (class87 var2 = (class87) this.field605.method840(true); var2 != null; var2 = (class87) this.field605.method841((byte) 18)) {
            var2.method41(arg0);
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(Lmd;)V")
    public final synchronized void method201(class87 arg0) {
        arg0.method1176((byte) -125);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "()Lmd;")
    public final class87 method30() {
        return (class87) this.field605.method840(true);
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "()V")
    private final void method202() {
        if (this.field607 <= 0) {
            return;
        }
        for (class125 var1 = (class125) this.field606.method840(true); var1 != null; var1 = (class125) this.field606.method841((byte) 18)) {
            var1.field2838 -= this.field607;
        }
        this.field608 -= this.field607;
        this.field607 = 0;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "([III)V")
    private final void method203(int[] arg0, int arg1, int arg2) {
        for (class87 var4 = (class87) this.field605.method840(true); var4 != null; var4 = (class87) this.field605.method841((byte) 18)) {
            var4.method674(arg0, arg1, arg2);
        }
    }
}
