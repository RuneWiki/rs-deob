import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class104 extends class56 {

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "Lvb;")
    private class247 field1714 = new class247();

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "Lvb;")
    private class247 field1715 = new class247();

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    private int field1716 = -1;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
    private int field1717 = 0;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([III)V")
    public final synchronized void method407(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1716 < 0) {
                this.method701(arg0, arg1, arg2);
                return;
            }
            if (this.field1717 + arg2 < this.field1716) {
                this.field1717 += arg2;
                this.method701(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1716 - this.field1717;
            this.method701(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1717 += var4;
            this.method699();
            class167 var5 = (class167) this.field1715.method1686((byte) -83);
            synchronized (var5) {
                int var7 = var5.method1112(this);
                if (var7 < 0) {
                    var5.field2828 = 0;
                    this.method697(var5);
                } else {
                    var5.field2828 = var7;
                    this.method700(var5.field605, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
    public final synchronized void method411(int arg0) {
        do {
            if (this.field1716 < 0) {
                this.method698(arg0);
                return;
            }
            if (this.field1717 + arg0 < this.field1716) {
                this.field1717 += arg0;
                this.method698(arg0);
                return;
            }
            int var2 = this.field1716 - this.field1717;
            this.method698(var2);
            arg0 -= var2;
            this.field1717 += var2;
            this.method699();
            class167 var3 = (class167) this.field1715.method1686((byte) -83);
            synchronized (var3) {
                int var5 = var3.method1112(this);
                if (var5 < 0) {
                    var3.field2828 = 0;
                    this.method697(var3);
                } else {
                    var3.field2828 = var5;
                    this.method700(var3.field605, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "()Lpf;")
    public final class56 method409() {
        return (class56) this.field1714.method1686((byte) -83);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lpf;)V")
    public final synchronized void method696(class56 arg0) {
        arg0.method290((byte) -48);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lei;)V")
    private final void method697(class167 arg0) {
        arg0.method290((byte) -48);
        arg0.method1113();
        class41 var2 = this.field1715.field4307.field605;
        if (this.field1715.field4307 == var2) {
            this.field1716 = -1;
        } else {
            this.field1716 = ((class167) var2).field2828;
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
    private final void method698(int arg0) {
        for (class56 var2 = (class56) this.field1714.method1686((byte) -83); var2 != null; var2 = (class56) this.field1714.method1683(140)) {
            var2.method411(arg0);
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "()I")
    public final int method408() {
        return 0;
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "()V")
    private final void method699() {
        if (this.field1717 <= 0) {
            return;
        }
        for (class167 var1 = (class167) this.field1715.method1686((byte) -83); var1 != null; var1 = (class167) this.field1715.method1683(140)) {
            var1.field2828 -= this.field1717;
        }
        this.field1716 -= this.field1717;
        this.field1717 = 0;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lrb;Lei;)V")
    private final void method700(class41 arg0, class167 arg1) {
        while (this.field1715.field4307 != arg0 && ((class167) arg0).field2828 <= arg1.field2828) {
            arg0 = arg0.field605;
        }
        class193.method1325(arg0, (byte) -13, arg1);
        this.field1716 = ((class167) this.field1715.field4307.field605).field2828;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "()Lpf;")
    public final class56 method406() {
        return (class56) this.field1714.method1683(140);
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "([III)V")
    private final void method701(int[] arg0, int arg1, int arg2) {
        for (class56 var4 = (class56) this.field1714.method1686((byte) -83); var4 != null; var4 = (class56) this.field1714.method1683(140)) {
            var4.method410(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Lpf;)V")
    public final synchronized void method702(class56 arg0) {
        this.field1714.method1693(-1, arg0);
    }
}
