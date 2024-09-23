import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EXWCQMNV")
public class class17 extends class4 {

    @OriginalMember(owner = "EXWCQMNV", name = "l", descriptor = "Z")
    private boolean field733 = false;

    @OriginalMember(owner = "EXWCQMNV", name = "m", descriptor = "I")
    private int field734 = 5131;

    @OriginalMember(owner = "EXWCQMNV", name = "t", descriptor = "Z")
    public boolean field741 = false;

    @OriginalMember(owner = "EXWCQMNV", name = "r", descriptor = "LVCTVXSNH;")
    private class62 field739;

    @OriginalMember(owner = "EXWCQMNV", name = "n", descriptor = "I")
    public int field735;

    @OriginalMember(owner = "EXWCQMNV", name = "o", descriptor = "I")
    public int field736;

    @OriginalMember(owner = "EXWCQMNV", name = "p", descriptor = "I")
    public int field737;

    @OriginalMember(owner = "EXWCQMNV", name = "q", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "EXWCQMNV", name = "s", descriptor = "I")
    public int field740;

    @OriginalMember(owner = "EXWCQMNV", name = "u", descriptor = "I")
    private int field742;

    @OriginalMember(owner = "EXWCQMNV", name = "v", descriptor = "I")
    private int field743;

    @OriginalMember(owner = "EXWCQMNV", name = "a", descriptor = "(II)V")
    public final void method301(int arg0, int arg1) {
        this.field743 += arg1;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            do {
                do {
                    if (this.field743 <= this.field739.field1574.method27(this.field742, (byte) -127)) {
                        return;
                    }
                    this.field743 -= this.field739.field1574.method27(this.field742, (byte) -127) + 1;
                    this.field742++;
                } while (this.field742 < this.field739.field1574.field68);
            } while (this.field742 >= 0 && this.field742 < this.field739.field1574.field68);
            this.field742 = 0;
            this.field741 = true;
        }
    }

    @OriginalMember(owner = "EXWCQMNV", name = "a", descriptor = "(I)LIGXVZOHI;")
    public final class32 method25(int arg0) {
        if (arg0 != 47492) {
            this.field733 = !this.field733;
        }
        class32 var2 = this.field739.method555();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field739.field1574.field69[this.field742];
        class32 var4 = new class32(true, var2, false, class31.method349(var3, this.field734), (byte) 1);
        if (!this.field741) {
            var4.method361(6);
            var4.method362(33114, var3);
            var4.field970 = null;
            var4.field969 = null;
        }
        if (this.field739.field1577 != 128 || this.field739.field1578 != 128) {
            var4.method370(this.field739.field1577, this.field739.field1578, false, this.field739.field1577);
        }
        if (this.field739.field1579 != 0) {
            if (this.field739.field1579 == 90) {
                var4.method365(262);
            }
            if (this.field739.field1579 == 180) {
                var4.method365(262);
                var4.method365(262);
            }
            if (this.field739.field1579 == 270) {
                var4.method365(262);
                var4.method365(262);
                var4.method365(262);
            }
        }
        var4.method371(this.field739.field1580 + 64, this.field739.field1581 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "EXWCQMNV", name = "<init>", descriptor = "(IIIIIIII)V")
    public class17(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field739 = class62.field1570[arg0];
        this.field735 = arg3;
        this.field736 = arg6;
        this.field737 = arg7;
        this.field738 = arg2;
        if (arg4 <= 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        this.field740 = arg1 + arg5;
        this.field741 = false;
    }
}
