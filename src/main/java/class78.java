import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class78 extends class22 {

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "Lac;")
    private class4 field1693 = new class4();

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "Lac;")
    private class4 field1694 = new class4();

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "I")
    private int field1695 = -1;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
    private int field1696 = 0;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
    private final void method549(int arg0) {
        for (class22 var2 = (class22) this.field1693.method26((byte) 55); var2 != null; var2 = (class22) this.field1693.method18((byte) -128)) {
            var2.method158(arg0);
        }
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "()V")
    private final void method550() {
        if (this.field1696 <= 0) {
            return;
        }
        for (class7 var1 = (class7) this.field1694.method26((byte) -119); var1 != null; var1 = (class7) this.field1694.method18((byte) -128)) {
            var1.field149 -= this.field1696;
        }
        this.field1695 -= this.field1696;
        this.field1696 = 0;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Laf;)V")
    private final void method551(class7 arg0) {
        arg0.method115(26851);
        arg0.method58();
        class16 var2 = this.field1694.field54.field293;
        if (this.field1694.field54 == var2) {
            this.field1695 = -1;
        } else {
            this.field1695 = ((class7) var2).field149;
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "([III)V")
    private final void method552(int[] arg0, int arg1, int arg2) {
        for (class22 var4 = (class22) this.field1693.method26((byte) 80); var4 != null; var4 = (class22) this.field1693.method18((byte) -128)) {
            var4.method155(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ld;)V")
    public final synchronized void method553(class22 arg0) {
        arg0.method115(26851);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()Ld;")
    public final class22 method153() {
        return (class22) this.field1693.method18((byte) -128);
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
    public final synchronized void method158(int arg0) {
        do {
            if (this.field1695 < 0) {
                this.method549(arg0);
                return;
            }
            if (this.field1696 + arg0 < this.field1695) {
                this.field1696 += arg0;
                this.method549(arg0);
                return;
            }
            int var2 = this.field1695 - this.field1696;
            this.method549(var2);
            arg0 -= var2;
            this.field1696 += var2;
            this.method550();
            class7 var3 = (class7) this.field1694.method26((byte) 116);
            synchronized (var3) {
                int var5 = var3.method57(this);
                if (var5 < 0) {
                    var3.field149 = 0;
                    this.method551(var3);
                } else {
                    var3.field149 = var5;
                    this.method555(var3.field293, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Ld;)V")
    public final synchronized void method554(class22 arg0) {
        this.field1693.method28((byte) 106, arg0);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "()I")
    public final int method154() {
        return 0;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "([III)V")
    public final synchronized void method156(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1695 < 0) {
                this.method552(arg0, arg1, arg2);
                return;
            }
            if (this.field1696 + arg2 < this.field1695) {
                this.field1696 += arg2;
                this.method552(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1695 - this.field1696;
            this.method552(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1696 += var4;
            this.method550();
            class7 var5 = (class7) this.field1694.method26((byte) -71);
            synchronized (var5) {
                int var7 = var5.method57(this);
                if (var7 < 0) {
                    var5.field149 = 0;
                    this.method551(var5);
                } else {
                    var5.field149 = var7;
                    this.method555(var5.field293, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lca;Laf;)V")
    private final void method555(class16 arg0, class7 arg1) {
        while (this.field1694.field54 != arg0 && ((class7) arg0).field149 <= arg1.field149) {
            arg0 = arg0.field293;
        }
        this.field1694.method23(arg1, 118, arg0);
        this.field1695 = ((class7) this.field1694.field54.field293).field149;
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "()Ld;")
    public final class22 method159() {
        return (class22) this.field1693.method26((byte) 49);
    }
}
