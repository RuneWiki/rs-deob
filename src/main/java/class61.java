import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XTGOQLGZ")
public class class61 extends class54 {

    @OriginalMember(owner = "XTGOQLGZ", name = "s", descriptor = "Z")
    public boolean field1573 = false;

    @OriginalMember(owner = "XTGOQLGZ", name = "t", descriptor = "LZSSCYSIO;")
    private class71 field1574;

    @OriginalMember(owner = "XTGOQLGZ", name = "l", descriptor = "I")
    public int field1566;

    @OriginalMember(owner = "XTGOQLGZ", name = "m", descriptor = "I")
    public int field1567;

    @OriginalMember(owner = "XTGOQLGZ", name = "n", descriptor = "I")
    public int field1568;

    @OriginalMember(owner = "XTGOQLGZ", name = "o", descriptor = "I")
    public int field1569;

    @OriginalMember(owner = "XTGOQLGZ", name = "p", descriptor = "I")
    public int field1570;

    @OriginalMember(owner = "XTGOQLGZ", name = "q", descriptor = "I")
    private int field1571;

    @OriginalMember(owner = "XTGOQLGZ", name = "r", descriptor = "I")
    private int field1572;

    @OriginalMember(owner = "XTGOQLGZ", name = "a", descriptor = "(B)LCCYECDYX;")
    public final class4 method181(byte arg0) {
        class4 var2 = this.field1574.method590();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field1574.field1725.field877[this.field1571];
        if (arg0 != 1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        class4 var5 = new class4(class41.method383(var3, (byte) 8), -784, var2, false, true);
        if (!this.field1573) {
            var5.method18(true);
            var5.method19(var3, (byte) 106);
            var5.field65 = null;
            var5.field64 = null;
        }
        if (this.field1574.field1728 != 128 || this.field1574.field1729 != 128) {
            var5.method27(this.field1574.field1728, this.field1574.field1729, this.field1574.field1728, (byte) 6);
        }
        if (this.field1574.field1730 != 0) {
            if (this.field1574.field1730 == 90) {
                var5.method22((byte) 5);
            }
            if (this.field1574.field1730 == 180) {
                var5.method22((byte) 5);
                var5.method22((byte) 5);
            }
            if (this.field1574.field1730 == 270) {
                var5.method22((byte) 5);
                var5.method22((byte) 5);
                var5.method22((byte) 5);
            }
        }
        var5.method28(this.field1574.field1731 + 64, this.field1574.field1732 + 850, -30, -50, -30, true);
        return var5;
    }

    @OriginalMember(owner = "XTGOQLGZ", name = "<init>", descriptor = "(IIIIIIII)V")
    public class61(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1574 = class71.field1721[arg1];
        this.field1566 = arg0;
        this.field1567 = arg2;
        this.field1568 = arg6;
        while (arg5 >= 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        this.field1569 = arg4;
        this.field1570 = arg3 + arg7;
        this.field1573 = false;
    }

    @OriginalMember(owner = "XTGOQLGZ", name = "a", descriptor = "(II)V")
    public final void method496(int arg0, int arg1) {
        this.field1572 += arg0;
        if (arg1 != 0) {
            return;
        }
        while (true) {
            do {
                do {
                    if (this.field1572 <= this.field1574.field1725.method226((byte) 6, this.field1571)) {
                        return;
                    }
                    this.field1572 -= this.field1574.field1725.method226((byte) 6, this.field1571) + 1;
                    this.field1571++;
                } while (this.field1571 < this.field1574.field1725.field876);
            } while (this.field1571 >= 0 && this.field1571 < this.field1574.field1725.field876);
            this.field1571 = 0;
            this.field1573 = true;
        }
    }
}
