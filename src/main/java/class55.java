import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UECXVCCS")
public class class55 {

    @OriginalMember(owner = "UECXVCCS", name = "d", descriptor = "LDRKSBDQX;")
    private class10 field1545 = new class10();

    @OriginalMember(owner = "UECXVCCS", name = "h", descriptor = "LZLISRGEK;")
    private class71 field1549 = new class71(8);

    @OriginalMember(owner = "UECXVCCS", name = "e", descriptor = "I")
    private int field1546;

    @OriginalMember(owner = "UECXVCCS", name = "f", descriptor = "I")
    private int field1547;

    @OriginalMember(owner = "UECXVCCS", name = "g", descriptor = "LOYARMXQN;")
    private class37 field1548;

    @OriginalMember(owner = "UECXVCCS", name = "a", descriptor = "I")
    private int field1542;

    @OriginalMember(owner = "UECXVCCS", name = "b", descriptor = "I")
    private int field1543;

    @OriginalMember(owner = "UECXVCCS", name = "c", descriptor = "I")
    private int field1544;

    @OriginalMember(owner = "UECXVCCS", name = "<init>", descriptor = "(IB)V")
    public class55(int arg0, byte arg1) {
        this.field1546 = arg0;
        this.field1547 = arg0;
        this.field1548 = new class37(0, 1024);
        if (arg1 != -2) {
            this.field1542 = -262;
        }
    }

    @OriginalMember(owner = "UECXVCCS", name = "a", descriptor = "(J)LDRKSBDQX;")
    public class10 method538(long arg0) {
        class10 var3 = (class10) this.field1548.method365(arg0);
        if (var3 == null) {
            this.field1543++;
        } else {
            this.field1549.method592(var3);
            this.field1544++;
        }
        return var3;
    }

    @OriginalMember(owner = "UECXVCCS", name = "a", descriptor = "(LDRKSBDQX;IJ)V")
    public void method539(class10 arg0, int arg1, long arg2) {
        while (arg1 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (this.field1547 == 0) {
            class10 var5 = this.field1549.method593();
            var5.method367();
            var5.method217();
            if (this.field1545 == var5) {
                class10 var6 = this.field1549.method593();
                var6.method367();
                var6.method217();
            }
        } else {
            this.field1547--;
        }
        this.field1548.method366(arg0, arg2, 5);
        this.field1549.method592(arg0);
        if (class38.field1221) {
        }
    }

    @OriginalMember(owner = "UECXVCCS", name = "a", descriptor = "()V")
    public void method540() {
        while (true) {
            class10 var1 = this.field1549.method593();
            if (var1 == null) {
                this.field1547 = this.field1546;
                return;
            }
            var1.method367();
            var1.method217();
        }
    }
}
