import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class151 extends class13 {

    @OriginalMember(owner = "client!we", name = "K", descriptor = "Lja;")
    private class63 field3727 = new class63();

    @OriginalMember(owner = "client!we", name = "L", descriptor = "Lja;")
    private class63 field3728 = new class63();

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    private int field3729 = -1;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "I")
    private int field3730 = 0;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lsa;Lic;)V")
    private final void method1213(class123 arg0, class59 arg1) {
        while (this.field3728.field1336 != arg0 && ((class59) arg0).field1308 <= arg1.field1308) {
            arg0 = arg0.field2738;
        }
        this.field3728.method509(false, arg1, arg0);
        this.field3729 = ((class59) this.field3728.field1336.field2738).field1308;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
    public final synchronized void method112(int arg0) {
        do {
            if (this.field3729 < 0) {
                this.method1214(arg0);
                return;
            }
            if (this.field3730 + arg0 < this.field3729) {
                this.field3730 += arg0;
                this.method1214(arg0);
                return;
            }
            int var2 = this.field3729 - this.field3730;
            this.method1214(var2);
            arg0 -= var2;
            this.field3730 += var2;
            this.method1215();
            class59 var3 = (class59) this.field3728.method512(92);
            synchronized (var3) {
                int var5 = var3.method472(this);
                if (var5 < 0) {
                    var3.field1308 = 0;
                    this.method1216(var3);
                } else {
                    var3.field1308 = var5;
                    this.method1213(var3.field2738, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
    private final void method1214(int arg0) {
        for (class13 var2 = (class13) this.field3727.method512(-91); var2 != null; var2 = (class13) this.field3727.method513(-74)) {
            var2.method112(arg0);
        }
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "()V")
    private final void method1215() {
        if (this.field3730 <= 0) {
            return;
        }
        for (class59 var1 = (class59) this.field3728.method512(-81); var1 != null; var1 = (class59) this.field3728.method513(-115)) {
            var1.field1308 -= this.field3730;
        }
        this.field3729 -= this.field3730;
        this.field3730 = 0;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lic;)V")
    private final void method1216(class59 arg0) {
        arg0.method975(113);
        arg0.method473();
        class123 var2 = this.field3728.field1336.field2738;
        if (this.field3728.field1336 == var2) {
            this.field3729 = -1;
        } else {
            this.field3729 = ((class59) var2).field1308;
        }
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "()I")
    public final int method109() {
        return 0;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lbe;)V")
    public final synchronized void method1217(class13 arg0) {
        this.field3727.method514(arg0, 0);
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "()Lbe;")
    public final class13 method113() {
        return (class13) this.field3727.method512(82);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "([III)V")
    public final synchronized void method119(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3729 < 0) {
                this.method1219(arg0, arg1, arg2);
                return;
            }
            if (this.field3730 + arg2 < this.field3729) {
                this.field3730 += arg2;
                this.method1219(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3729 - this.field3730;
            this.method1219(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3730 += var4;
            this.method1215();
            class59 var5 = (class59) this.field3728.method512(90);
            synchronized (var5) {
                int var7 = var5.method472(this);
                if (var7 < 0) {
                    var5.field1308 = 0;
                    this.method1216(var5);
                } else {
                    var5.field1308 = var7;
                    this.method1213(var5.field2738, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Lbe;)V")
    public final synchronized void method1218(class13 arg0) {
        arg0.method975(-123);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "()Lbe;")
    public final class13 method110() {
        return (class13) this.field3727.method513(-78);
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "([III)V")
    private final void method1219(int[] arg0, int arg1, int arg2) {
        for (class13 var4 = (class13) this.field3727.method512(-113); var4 != null; var4 = (class13) this.field3727.method513(-116)) {
            var4.method146(arg0, arg1, arg2);
        }
    }
}
