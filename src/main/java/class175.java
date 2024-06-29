import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class175 extends class15 {

    @OriginalMember(owner = "client!li", name = "o", descriptor = "Lie;")
    private class2 field2657 = new class2();

    @OriginalMember(owner = "client!li", name = "p", descriptor = "Lie;")
    private class2 field2658 = new class2();

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    private int field2659 = 0;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    private int field2660 = -1;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "()Lrk;")
    public final class15 method106() {
        return (class15) this.field2657.method12((byte) 69);
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V")
    private final void method1245(int arg0) {
        for (class15 var2 = (class15) this.field2657.method8(-116); var2 != null; var2 = (class15) this.field2657.method12((byte) 69)) {
            var2.method103(arg0);
        }
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V")
    public final synchronized void method103(int arg0) {
        do {
            if (this.field2660 < 0) {
                this.method1245(arg0);
                return;
            }
            if (this.field2659 + arg0 < this.field2660) {
                this.field2659 += arg0;
                this.method1245(arg0);
                return;
            }
            int var2 = this.field2660 - this.field2659;
            this.method1245(var2);
            arg0 -= var2;
            this.field2659 += var2;
            this.method1246();
            class97 var3 = (class97) this.field2658.method8(-98);
            synchronized (var3) {
                int var5 = var3.method767(this);
                if (var5 < 0) {
                    var3.field1667 = 0;
                    this.method1247(var3);
                } else {
                    var3.field1667 = var5;
                    this.method1250(var3.field4013, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([III)V")
    public final synchronized void method104(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2660 < 0) {
                this.method1251(arg0, arg1, arg2);
                return;
            }
            if (this.field2659 + arg2 < this.field2660) {
                this.field2659 += arg2;
                this.method1251(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2660 - this.field2659;
            this.method1251(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2659 += var4;
            this.method1246();
            class97 var5 = (class97) this.field2658.method8(-73);
            synchronized (var5) {
                int var7 = var5.method767(this);
                if (var7 < 0) {
                    var5.field1667 = 0;
                    this.method1247(var5);
                } else {
                    var5.field1667 = var7;
                    this.method1250(var5.field4013, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "()Lrk;")
    public final class15 method101() {
        return (class15) this.field2657.method8(-76);
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "()V")
    private final void method1246() {
        if (this.field2659 <= 0) {
            return;
        }
        for (class97 var1 = (class97) this.field2658.method8(-74); var1 != null; var1 = (class97) this.field2658.method12((byte) 69)) {
            var1.field1667 -= this.field2659;
        }
        this.field2660 -= this.field2659;
        this.field2659 = 0;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lnj;)V")
    private final void method1247(class97 arg0) {
        arg0.method1781(5250);
        arg0.method766();
        class259 var2 = this.field2658.field22.field4013;
        if (this.field2658.field22 == var2) {
            this.field2660 = -1;
        } else {
            this.field2660 = ((class97) var2).field1667;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lrk;)V")
    public final synchronized void method1248(class15 arg0) {
        arg0.method1781(5250);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(Lrk;)V")
    public final synchronized void method1249(class15 arg0) {
        this.field2657.method9((byte) -66, arg0);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ltl;Lnj;)V")
    private final void method1250(class259 arg0, class97 arg1) {
        while (this.field2658.field22 != arg0 && ((class97) arg0).field1667 <= arg1.field1667) {
            arg0 = arg0.field4013;
        }
        class17.method118(arg0, arg1, 96);
        this.field2660 = ((class97) this.field2658.field22.field4013).field1667;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "()I")
    public final int method102() {
        return 0;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "([III)V")
    private final void method1251(int[] arg0, int arg1, int arg2) {
        for (class15 var4 = (class15) this.field2657.method8(-97); var4 != null; var4 = (class15) this.field2657.method12((byte) 69)) {
            var4.method107(arg0, arg1, arg2);
        }
    }
}
