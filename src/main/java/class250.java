import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class250 extends class224 {

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "Lch;")
    private class117 field4325 = new class117();

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "Lch;")
    private class117 field4326 = new class117();

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
    private int field4327 = 0;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
    private int field4328 = -1;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "()I")
    public final int method174() {
        return 0;
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)V")
    public final synchronized void method208(int arg0) {
        do {
            if (this.field4328 < 0) {
                this.method1662(arg0);
                return;
            }
            if (this.field4327 + arg0 < this.field4328) {
                this.field4327 += arg0;
                this.method1662(arg0);
                return;
            }
            int var2 = this.field4328 - this.field4327;
            this.method1662(var2);
            arg0 -= var2;
            this.field4327 += var2;
            this.method1659();
            class165 var3 = (class165) this.field4326.method789((byte) -118);
            synchronized (var3) {
                int var5 = var3.method1089(this);
                if (var5 < 0) {
                    var3.field2987 = 0;
                    this.method1663(var3);
                } else {
                    var3.field2987 = var5;
                    this.method1664(var3.field388, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "([III)V")
    public final synchronized void method192(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4328 < 0) {
                this.method1665(arg0, arg1, arg2);
                return;
            }
            if (this.field4327 + arg2 < this.field4328) {
                this.field4327 += arg2;
                this.method1665(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4328 - this.field4327;
            this.method1665(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4327 += var4;
            this.method1659();
            class165 var5 = (class165) this.field4326.method789((byte) -63);
            synchronized (var5) {
                int var7 = var5.method1089(this);
                if (var7 < 0) {
                    var5.field2987 = 0;
                    this.method1663(var5);
                } else {
                    var5.field2987 = var7;
                    this.method1664(var5.field388, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "()V")
    private final void method1659() {
        if (this.field4327 <= 0) {
            return;
        }
        for (class165 var1 = (class165) this.field4326.method789((byte) -74); var1 != null; var1 = (class165) this.field4326.method787((byte) -76)) {
            var1.field2987 -= this.field4327;
        }
        this.field4328 -= this.field4327;
        this.field4327 = 0;
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "()Lvg;")
    public final class224 method211() {
        return (class224) this.field4325.method789((byte) -90);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lvg;)V")
    public final synchronized void method1660(class224 arg0) {
        arg0.method97(158);
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(Lvg;)V")
    public final synchronized void method1661(class224 arg0) {
        this.field4325.method794(-73, arg0);
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "()Lvg;")
    public final class224 method182() {
        return (class224) this.field4325.method787((byte) -76);
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)V")
    private final void method1662(int arg0) {
        for (class224 var2 = (class224) this.field4325.method789((byte) -43); var2 != null; var2 = (class224) this.field4325.method787((byte) -76)) {
            var2.method208(arg0);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lta;)V")
    private final void method1663(class165 arg0) {
        arg0.method97(158);
        arg0.method1088();
        class12 var2 = this.field4326.field2064.field388;
        if (this.field4326.field2064 == var2) {
            this.field4328 = -1;
        } else {
            this.field4328 = ((class165) var2).field2987;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lkh;Lta;)V")
    private final void method1664(class12 arg0, class165 arg1) {
        while (this.field4326.field2064 != arg0 && ((class165) arg0).field2987 <= arg1.field2987) {
            arg0 = arg0.field388;
        }
        class236.method1578(arg0, arg1, 1);
        this.field4328 = ((class165) this.field4326.field2064.field388).field2987;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "([III)V")
    private final void method1665(int[] arg0, int arg1, int arg2) {
        for (class224 var4 = (class224) this.field4325.method789((byte) -74); var4 != null; var4 = (class224) this.field4325.method787((byte) -76)) {
            var4.method1520(arg0, arg1, arg2);
        }
    }
}
