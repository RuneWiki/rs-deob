import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class249 extends class251 {

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "Lvj;")
    private class115 field3971 = new class115();

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "Lvj;")
    private class115 field3972 = new class115();

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    private int field3973 = 0;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    private int field3974 = -1;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "([III)V")
    private final void method1702(int[] arg0, int arg1, int arg2) {
        for (class251 var4 = (class251) this.field3971.method843(-40); var4 != null; var4 = (class251) this.field3971.method852((byte) 123)) {
            var4.method1713(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lei;)V")
    private final void method1703(class172 arg0) {
        arg0.method1388(123);
        arg0.method1180();
        class202 var2 = this.field3972.field1902.field3245;
        if (this.field3972.field1902 == var2) {
            this.field3974 = -1;
        } else {
            this.field3974 = ((class172) var2).field2719;
        }
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "()V")
    private final void method1704() {
        if (this.field3973 <= 0) {
            return;
        }
        for (class172 var1 = (class172) this.field3972.method843(106); var1 != null; var1 = (class172) this.field3972.method852((byte) 123)) {
            var1.field2719 -= this.field3973;
        }
        this.field3974 -= this.field3973;
        this.field3973 = 0;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "()Lfa;")
    public final class251 method154() {
        return (class251) this.field3971.method852((byte) 123);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lel;Lei;)V")
    private final void method1705(class202 arg0, class172 arg1) {
        while (this.field3972.field1902 != arg0 && ((class172) arg0).field2719 <= arg1.field2719) {
            arg0 = arg0.field3245;
        }
        class284.method1912(arg1, arg0, -111);
        this.field3974 = ((class172) this.field3972.field1902.field3245).field2719;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "()I")
    public final int method178() {
        return 0;
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V")
    private final void method1706(int arg0) {
        for (class251 var2 = (class251) this.field3971.method843(69); var2 != null; var2 = (class251) this.field3971.method852((byte) 123)) {
            var2.method168(arg0);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lfa;)V")
    public final synchronized void method1707(class251 arg0) {
        arg0.method1388(-124);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([III)V")
    public final synchronized void method150(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3974 < 0) {
                this.method1702(arg0, arg1, arg2);
                return;
            }
            if (this.field3973 + arg2 < this.field3974) {
                this.field3973 += arg2;
                this.method1702(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3974 - this.field3973;
            this.method1702(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3973 += var4;
            this.method1704();
            class172 var5 = (class172) this.field3972.method843(-73);
            synchronized (var5) {
                int var7 = var5.method1179(this);
                if (var7 < 0) {
                    var5.field2719 = 0;
                    this.method1703(var5);
                } else {
                    var5.field2719 = var7;
                    this.method1705(var5.field3245, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Lfa;)V")
    public final synchronized void method1708(class251 arg0) {
        this.field3971.method846((byte) 115, arg0);
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
    public final synchronized void method168(int arg0) {
        do {
            if (this.field3974 < 0) {
                this.method1706(arg0);
                return;
            }
            if (this.field3973 + arg0 < this.field3974) {
                this.field3973 += arg0;
                this.method1706(arg0);
                return;
            }
            int var2 = this.field3974 - this.field3973;
            this.method1706(var2);
            arg0 -= var2;
            this.field3973 += var2;
            this.method1704();
            class172 var3 = (class172) this.field3972.method843(124);
            synchronized (var3) {
                int var5 = var3.method1179(this);
                if (var5 < 0) {
                    var3.field2719 = 0;
                    this.method1703(var3);
                } else {
                    var3.field2719 = var5;
                    this.method1705(var3.field3245, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "()Lfa;")
    public final class251 method153() {
        return (class251) this.field3971.method843(-51);
    }
}
