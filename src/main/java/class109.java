import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class109 extends class267 {

    @OriginalMember(owner = "client!de", name = "p", descriptor = "Lrh;")
    private class46 field1660 = new class46();

    @OriginalMember(owner = "client!de", name = "q", descriptor = "Lrh;")
    private class46 field1661 = new class46();

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    private int field1662 = -1;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    private int field1663 = 0;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ldh;Lji;)V")
    private final void method706(class120 arg0, class42 arg1) {
        while (this.field1661.field579 != arg0 && ((class42) arg0).field559 <= arg1.field559) {
            arg0 = arg0.field1752;
        }
        class100.method663(0, arg1, arg0);
        this.field1662 = ((class42) this.field1661.field579.field1752).field559;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
    public final synchronized void method707(int arg0) {
        do {
            if (this.field1662 < 0) {
                this.method708(arg0);
                return;
            }
            if (this.field1663 + arg0 < this.field1662) {
                this.field1663 += arg0;
                this.method708(arg0);
                return;
            }
            int var2 = this.field1662 - this.field1663;
            this.method708(var2);
            arg0 -= var2;
            this.field1663 += var2;
            this.method711();
            class42 var3 = (class42) this.field1661.method350(8240);
            synchronized (var3) {
                int var5 = var3.method327(this);
                if (var5 < 0) {
                    var3.field559 = 0;
                    this.method714(var3);
                } else {
                    var3.field559 = var5;
                    this.method706(var3.field1752, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
    private final void method708(int arg0) {
        for (class267 var2 = (class267) this.field1660.method350(8240); var2 != null; var2 = (class267) this.field1660.method353((byte) -115)) {
            var2.method707(arg0);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lof;)V")
    public final synchronized void method709(class267 arg0) {
        this.field1660.method351(arg0, 47);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "()I")
    public final int method710() {
        return 0;
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "()V")
    private final void method711() {
        if (this.field1663 <= 0) {
            return;
        }
        for (class42 var1 = (class42) this.field1661.method350(8240); var1 != null; var1 = (class42) this.field1661.method353((byte) -116)) {
            var1.field559 -= this.field1663;
        }
        this.field1662 -= this.field1663;
        this.field1663 = 0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([III)V")
    public final synchronized void method712(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1662 < 0) {
                this.method715(arg0, arg1, arg2);
                return;
            }
            if (this.field1663 + arg2 < this.field1662) {
                this.field1663 += arg2;
                this.method715(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1662 - this.field1663;
            this.method715(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1663 += var4;
            this.method711();
            class42 var5 = (class42) this.field1661.method350(8240);
            synchronized (var5) {
                int var7 = var5.method327(this);
                if (var7 < 0) {
                    var5.field559 = 0;
                    this.method714(var5);
                } else {
                    var5.field559 = var7;
                    this.method706(var5.field1752, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "()Lof;")
    public final class267 method713() {
        return (class267) this.field1660.method350(8240);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lji;)V")
    private final void method714(class42 arg0) {
        arg0.method784(false);
        arg0.method328();
        class120 var2 = this.field1661.field579.field1752;
        if (this.field1661.field579 == var2) {
            this.field1662 = -1;
        } else {
            this.field1662 = ((class42) var2).field559;
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "([III)V")
    private final void method715(int[] arg0, int arg1, int arg2) {
        for (class267 var4 = (class267) this.field1660.method350(8240); var4 != null; var4 = (class267) this.field1660.method353((byte) -120)) {
            var4.method1819(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Lof;)V")
    public final synchronized void method716(class267 arg0) {
        arg0.method784(false);
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "()Lof;")
    public final class267 method717() {
        return (class267) this.field1660.method353((byte) -128);
    }
}
