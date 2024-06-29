import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class204 extends class189 {

    @OriginalMember(owner = "client!i", name = "o", descriptor = "Lfg;")
    private class203 field3511 = new class203();

    @OriginalMember(owner = "client!i", name = "p", descriptor = "Lfg;")
    private class203 field3512 = new class203();

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    private int field3513 = -1;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    private int field3514 = 0;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "([III)V", line = 8)
    public final synchronized void method364(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3513 < 0) {
                this.method1479(arg0, arg1, arg2);
                return;
            }
            if (this.field3514 + arg2 < this.field3513) {
                this.field3514 += arg2;
                this.method1479(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3513 - this.field3514;
            this.method1479(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3514 += var4;
            this.method1478();
            class99 var5 = (class99) this.field3512.method1471((byte) 108);
            synchronized (var5) {
                int var7 = var5.method777(this);
                if (var7 < 0) {
                    var5.field1691 = 0;
                    this.method1480(var5);
                } else {
                    var5.field1691 = var7;
                    this.method1482(var5.field3563, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()V", line = 56)
    private final void method1478() {
        if (this.field3514 <= 0) {
            return;
        }
        for (class99 var1 = (class99) this.field3512.method1471((byte) -121); var1 != null; var1 = (class99) this.field3512.method1475((byte) 83)) {
            var1.field1691 -= this.field3514;
        }
        this.field3513 -= this.field3514;
        this.field3514 = 0;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "([III)V", line = 75)
    private final void method1479(int[] arg0, int arg1, int arg2) {
        for (class189 var4 = (class189) this.field3511.method1471((byte) 120); var4 != null; var4 = (class189) this.field3511.method1475((byte) 83)) {
            var4.method1308(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lvj;)V", line = 85)
    private final void method1480(class99 arg0) {
        arg0.method1502((byte) -82);
        arg0.method778();
        class208 var2 = this.field3512.field3502.field3563;
        if (this.field3512.field3502 == var2) {
            this.field3513 = -1;
        } else {
            this.field3513 = ((class99) var2).field1691;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lci;)V", line = 102)
    public final synchronized void method1481(class189 arg0) {
        arg0.method1502((byte) -82);
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()Lci;", line = 105)
    public final class189 method365() {
        return (class189) this.field3511.method1475((byte) 83);
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V", line = 113)
    public final synchronized void method369(int arg0) {
        do {
            if (this.field3513 < 0) {
                this.method1483(arg0);
                return;
            }
            if (this.field3514 + arg0 < this.field3513) {
                this.field3514 += arg0;
                this.method1483(arg0);
                return;
            }
            int var2 = this.field3513 - this.field3514;
            this.method1483(var2);
            arg0 -= var2;
            this.field3514 += var2;
            this.method1478();
            class99 var3 = (class99) this.field3512.method1471((byte) 17);
            synchronized (var3) {
                int var5 = var3.method777(this);
                if (var5 < 0) {
                    var3.field1691 = 0;
                    this.method1480(var3);
                } else {
                    var3.field1691 = var5;
                    this.method1482(var3.field3563, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lli;Lvj;)V", line = 157)
    private final void method1482(class208 arg0, class99 arg1) {
        while (this.field3512.field3502 != arg0 && ((class99) arg0).field1691 <= arg1.field1691) {
            arg0 = arg0.field3563;
        }
        class287.method2029(arg1, arg0, 114);
        this.field3513 = ((class99) this.field3512.field3502.field3563).field1691;
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V", line = 166)
    private final void method1483(int arg0) {
        for (class189 var2 = (class189) this.field3511.method1471((byte) -110); var2 != null; var2 = (class189) this.field3511.method1475((byte) 83)) {
            var2.method369(arg0);
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()I", line = 175)
    public final int method368() {
        return 0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()Lci;", line = 179)
    public final class189 method374() {
        return (class189) this.field3511.method1471((byte) -83);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(Lci;)V", line = 190)
    public final synchronized void method1484(class189 arg0) {
        this.field3511.method1469(106, arg0);
    }
}
