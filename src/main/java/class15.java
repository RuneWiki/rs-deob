import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EWLVGVJE")
public class class15 extends class44 {

    @OriginalMember(owner = "EWLVGVJE", name = "l", descriptor = "B")
    private byte field750 = 1;

    @OriginalMember(owner = "EWLVGVJE", name = "m", descriptor = "Z")
    public boolean field751 = false;

    @OriginalMember(owner = "EWLVGVJE", name = "w", descriptor = "Z")
    private boolean field761 = false;

    @OriginalMember(owner = "EWLVGVJE", name = "x", descriptor = "I")
    private int field762 = -371;

    @OriginalMember(owner = "EWLVGVJE", name = "v", descriptor = "LXHDTVZNY;")
    private class64 field760;

    @OriginalMember(owner = "EWLVGVJE", name = "p", descriptor = "I")
    public int field754;

    @OriginalMember(owner = "EWLVGVJE", name = "q", descriptor = "I")
    public int field755;

    @OriginalMember(owner = "EWLVGVJE", name = "r", descriptor = "I")
    public int field756;

    @OriginalMember(owner = "EWLVGVJE", name = "s", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "EWLVGVJE", name = "n", descriptor = "I")
    public int field752;

    @OriginalMember(owner = "EWLVGVJE", name = "o", descriptor = "I")
    private int field753;

    @OriginalMember(owner = "EWLVGVJE", name = "t", descriptor = "I")
    private int field758;

    @OriginalMember(owner = "EWLVGVJE", name = "u", descriptor = "I")
    private int field759;

    @OriginalMember(owner = "EWLVGVJE", name = "a", descriptor = "(I)LVHYCWIPJ;")
    public final class53 method217(int arg0) {
        class53 var2 = this.field760.method579();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field760.field1624.field1540[this.field758];
        while (arg0 >= 0) {
            this.field753 = 63;
        }
        class53 var4 = new class53((byte) 9, class51.method489(var3, this.field750), true, false, var2);
        if (!this.field751) {
            var4.method507(0);
            var4.method508(999, var3);
            var4.field1411 = null;
            var4.field1410 = null;
        }
        if (this.field760.field1627 != 128 || this.field760.field1628 != 128) {
            var4.method516(this.field761, this.field760.field1627, this.field760.field1627, this.field760.field1628);
        }
        if (this.field760.field1629 != 0) {
            if (this.field760.field1629 == 90) {
                var4.method511(true);
            }
            if (this.field760.field1629 == 180) {
                var4.method511(true);
                var4.method511(true);
            }
            if (this.field760.field1629 == 270) {
                var4.method511(true);
                var4.method511(true);
                var4.method511(true);
            }
        }
        var4.method517(this.field760.field1630 + 64, this.field760.field1631 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "EWLVGVJE", name = "<init>", descriptor = "(IIIIIZII)V")
    public class15(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (arg5) {
            this.field762 = 23;
        }
        this.field760 = class64.field1620[arg0];
        this.field754 = arg2;
        this.field755 = arg7;
        this.field756 = arg3;
        this.field757 = arg1;
        this.field752 = arg4 + arg6;
        this.field751 = false;
    }

    @OriginalMember(owner = "EWLVGVJE", name = "a", descriptor = "(II)V")
    public final void method218(int arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        this.field759 += arg0;
        while (true) {
            do {
                do {
                    if (this.field759 <= this.field760.field1624.method549(this.field758, 0)) {
                        return;
                    }
                    this.field759 -= this.field760.field1624.method549(this.field758, 0) + 1;
                    this.field758++;
                } while (this.field758 < this.field760.field1624.field1539);
            } while (this.field758 >= 0 && this.field758 < this.field760.field1624.field1539);
            this.field758 = 0;
            this.field751 = true;
        }
    }
}
