import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class239 extends class208 {

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "Lpk;")
    private class98 field4126 = new class98();

    @OriginalMember(owner = "client!fj", name = "A", descriptor = "Lpk;")
    private class98 field4127 = new class98();

    @OriginalMember(owner = "client!fj", name = "D", descriptor = "I")
    private int field4129 = 0;

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
    private int field4128 = -1;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "()Lck;")
    public final class208 method437() {
        return (class208) this.field4126.method839(128);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lck;)V")
    public final synchronized void method1676(class208 arg0) {
        this.field4126.method833(-1, arg0);
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "()I")
    public final int method457() {
        return 0;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V")
    public final synchronized void method464(int arg0) {
        do {
            if (this.field4128 < 0) {
                this.method1680(arg0);
                return;
            }
            if (this.field4129 + arg0 < this.field4128) {
                this.field4129 += arg0;
                this.method1680(arg0);
                return;
            }
            int var2 = this.field4128 - this.field4129;
            this.method1680(var2);
            arg0 -= var2;
            this.field4129 += var2;
            this.method1677();
            class19 var3 = (class19) this.field4127.method839(128);
            synchronized (var3) {
                int var5 = var3.method229(this);
                if (var5 < 0) {
                    var3.field408 = 0;
                    this.method1681(var3);
                } else {
                    var3.field408 = var5;
                    this.method1679(var3.field1169, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "()V")
    private final void method1677() {
        if (this.field4129 <= 0) {
            return;
        }
        for (class19 var1 = (class19) this.field4127.method839(128); var1 != null; var1 = (class19) this.field4127.method834((byte) 82)) {
            var1.field408 -= this.field4129;
        }
        this.field4128 -= this.field4129;
        this.field4129 = 0;
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "([III)V")
    private final void method1678(int[] arg0, int arg1, int arg2) {
        for (class208 var4 = (class208) this.field4126.method839(128); var4 != null; var4 = (class208) this.field4126.method834((byte) 82)) {
            var4.method1452(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "()Lck;")
    public final class208 method454() {
        return (class208) this.field4126.method834((byte) 82);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lki;Lhe;)V")
    private final void method1679(class61 arg0, class19 arg1) {
        while (this.field4127.field1809 != arg0 && ((class19) arg0).field408 <= arg1.field408) {
            arg0 = arg0.field1169;
        }
        class30.method278(arg0, arg1, -106);
        this.field4128 = ((class19) this.field4127.field1809.field1169).field408;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "([III)V")
    public final synchronized void method441(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4128 < 0) {
                this.method1678(arg0, arg1, arg2);
                return;
            }
            if (this.field4129 + arg2 < this.field4128) {
                this.field4129 += arg2;
                this.method1678(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4128 - this.field4129;
            this.method1678(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4129 += var4;
            this.method1677();
            class19 var5 = (class19) this.field4127.method839(128);
            synchronized (var5) {
                int var7 = var5.method229(this);
                if (var7 < 0) {
                    var5.field408 = 0;
                    this.method1681(var5);
                } else {
                    var5.field408 = var7;
                    this.method1679(var5.field1169, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V")
    private final void method1680(int arg0) {
        for (class208 var2 = (class208) this.field4126.method839(128); var2 != null; var2 = (class208) this.field4126.method834((byte) 82)) {
            var2.method464(arg0);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lhe;)V")
    private final void method1681(class19 arg0) {
        arg0.method518(99);
        arg0.method228();
        class61 var2 = this.field4127.field1809.field1169;
        if (this.field4127.field1809 == var2) {
            this.field4128 = -1;
        } else {
            this.field4128 = ((class19) var2).field408;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Lck;)V")
    public final synchronized void method1682(class208 arg0) {
        arg0.method518(120);
    }
}
