import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class76 extends class31 {

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "Lpb;")
    private class100 field1700 = new class100();

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "Lpb;")
    private class100 field1701 = new class100();

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
    private int field1703 = -1;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    private int field1702 = 0;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "()Leb;")
    public final class31 method116() {
        return (class31) this.field1700.method726(0);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([III)V")
    public final synchronized void method140(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1703 < 0) {
                this.method564(arg0, arg1, arg2);
                return;
            }
            if (this.field1702 + arg2 < this.field1703) {
                this.field1702 += arg2;
                this.method564(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1703 - this.field1702;
            this.method564(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1702 += var4;
            this.method568();
            class118 var5 = (class118) this.field1701.method726(0);
            synchronized (var5) {
                int var7 = var5.method902(this);
                if (var7 < 0) {
                    var5.field2771 = 0;
                    this.method570(var5);
                } else {
                    var5.field2771 = var7;
                    this.method567(var5.field2500, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public final synchronized void method117(int arg0) {
        do {
            if (this.field1703 < 0) {
                this.method565(arg0);
                return;
            }
            if (this.field1702 + arg0 < this.field1703) {
                this.field1702 += arg0;
                this.method565(arg0);
                return;
            }
            int var2 = this.field1703 - this.field1702;
            this.method565(var2);
            arg0 -= var2;
            this.field1702 += var2;
            this.method568();
            class118 var3 = (class118) this.field1701.method726(0);
            synchronized (var3) {
                int var5 = var3.method902(this);
                if (var5 < 0) {
                    var3.field2771 = 0;
                    this.method570(var3);
                } else {
                    var3.field2771 = var5;
                    this.method567(var3.field2500, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "([III)V")
    private final void method564(int[] arg0, int arg1, int arg2) {
        for (class31 var4 = (class31) this.field1700.method726(0); var4 != null; var4 = (class31) this.field1700.method731((byte) -117)) {
            var4.method234(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
    private final void method565(int arg0) {
        for (class31 var2 = (class31) this.field1700.method726(0); var2 != null; var2 = (class31) this.field1700.method731((byte) -117)) {
            var2.method117(arg0);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Leb;)V")
    public final synchronized void method566(class31 arg0) {
        arg0.method776(0);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()I")
    public final int method135() {
        return 0;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lqc;Lsb;)V")
    private final void method567(class107 arg0, class118 arg1) {
        while (this.field1701.field2334 != arg0 && ((class118) arg0).field2771 <= arg1.field2771) {
            arg0 = arg0.field2500;
        }
        this.field1701.method732(arg1, -31501, arg0);
        this.field1703 = ((class118) this.field1701.field2334.field2500).field2771;
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "()V")
    private final void method568() {
        if (this.field1702 <= 0) {
            return;
        }
        for (class118 var1 = (class118) this.field1701.method726(0); var1 != null; var1 = (class118) this.field1701.method731((byte) -117)) {
            var1.field2771 -= this.field1702;
        }
        this.field1703 -= this.field1702;
        this.field1702 = 0;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "()Leb;")
    public final class31 method120() {
        return (class31) this.field1700.method731((byte) -117);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Leb;)V")
    public final synchronized void method569(class31 arg0) {
        this.field1700.method722(15346, arg0);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lsb;)V")
    private final void method570(class118 arg0) {
        arg0.method776(0);
        arg0.method903();
        class107 var2 = this.field1701.field2334.field2500;
        if (this.field1701.field2334 == var2) {
            this.field1703 = -1;
        } else {
            this.field1703 = ((class118) var2).field2771;
        }
    }
}
