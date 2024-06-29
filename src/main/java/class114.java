import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class114 extends class117 {

    @OriginalMember(owner = "client!j", name = "u", descriptor = "Lea;")
    private class243 field1664 = new class243();

    @OriginalMember(owner = "client!j", name = "v", descriptor = "Lea;")
    private class243 field1665 = new class243();

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    private int field1666 = -1;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    private int field1667 = 0;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "([III)V")
    public final synchronized void method688(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1666 < 0) {
                this.method698(arg0, arg1, arg2);
                return;
            }
            if (this.field1667 + arg2 < this.field1666) {
                this.field1667 += arg2;
                this.method698(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1666 - this.field1667;
            this.method698(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1667 += var4;
            this.method693();
            class254 var5 = (class254) this.field1665.method1651((byte) -50);
            synchronized (var5) {
                int var7 = var5.method1716(this);
                if (var7 < 0) {
                    var5.field4485 = 0;
                    this.method691(var5);
                } else {
                    var5.field4485 = var7;
                    this.method692(var5.field1842, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I")
    public final int method689() {
        return 0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lbe;)V")
    public final synchronized void method690(class117 arg0) {
        arg0.method797((byte) 96);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lih;)V")
    private final void method691(class254 arg0) {
        arg0.method797((byte) 97);
        arg0.method1717();
        class130 var2 = this.field1665.field4329.field1842;
        if (this.field1665.field4329 == var2) {
            this.field1666 = -1;
        } else {
            this.field1666 = ((class254) var2).field4485;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lnf;Lih;)V")
    private final void method692(class130 arg0, class254 arg1) {
        while (this.field1665.field4329 != arg0 && ((class254) arg0).field4485 <= arg1.field4485) {
            arg0 = arg0.field1842;
        }
        this.field1665.method1660(arg1, arg0, -22047);
        this.field1666 = ((class254) this.field1665.field4329.field1842).field4485;
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "()V")
    private final void method693() {
        if (this.field1667 <= 0) {
            return;
        }
        for (class254 var1 = (class254) this.field1665.method1651((byte) -13); var1 != null; var1 = (class254) this.field1665.method1656(-96)) {
            var1.field4485 -= this.field1667;
        }
        this.field1666 -= this.field1667;
        this.field1667 = 0;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
    private final void method694(int arg0) {
        for (class117 var2 = (class117) this.field1664.method1651((byte) -10); var2 != null; var2 = (class117) this.field1664.method1656(-84)) {
            var2.method696(arg0);
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()Lbe;")
    public final class117 method695() {
        return (class117) this.field1664.method1651((byte) -73);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public final synchronized void method696(int arg0) {
        do {
            if (this.field1666 < 0) {
                this.method694(arg0);
                return;
            }
            if (this.field1667 + arg0 < this.field1666) {
                this.field1667 += arg0;
                this.method694(arg0);
                return;
            }
            int var2 = this.field1666 - this.field1667;
            this.method694(var2);
            arg0 -= var2;
            this.field1667 += var2;
            this.method693();
            class254 var3 = (class254) this.field1665.method1651((byte) -64);
            synchronized (var3) {
                int var5 = var3.method1716(this);
                if (var5 < 0) {
                    var3.field4485 = 0;
                    this.method691(var3);
                } else {
                    var3.field4485 = var5;
                    this.method692(var3.field1842, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Lbe;)V")
    public final synchronized void method697(class117 arg0) {
        this.field1664.method1663((byte) -104, arg0);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "([III)V")
    private final void method698(int[] arg0, int arg1, int arg2) {
        for (class117 var4 = (class117) this.field1664.method1651((byte) -119); var4 != null; var4 = (class117) this.field1664.method1656(-55)) {
            var4.method706(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()Lbe;")
    public final class117 method699() {
        return (class117) this.field1664.method1656(-127);
    }
}
