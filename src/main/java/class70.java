import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XGJADJOY")
public class class70 extends class18 {

    @OriginalMember(owner = "XGJADJOY", name = "u", descriptor = "I")
    private int field1708 = -45010;

    @OriginalMember(owner = "XGJADJOY", name = "v", descriptor = "Z")
    public boolean field1709 = false;

    @OriginalMember(owner = "XGJADJOY", name = "q", descriptor = "LUYLUCQNM;")
    private class63 field1704;

    @OriginalMember(owner = "XGJADJOY", name = "m", descriptor = "I")
    public int field1700;

    @OriginalMember(owner = "XGJADJOY", name = "n", descriptor = "I")
    public int field1701;

    @OriginalMember(owner = "XGJADJOY", name = "o", descriptor = "I")
    public int field1702;

    @OriginalMember(owner = "XGJADJOY", name = "p", descriptor = "I")
    public int field1703;

    @OriginalMember(owner = "XGJADJOY", name = "r", descriptor = "I")
    public int field1705;

    @OriginalMember(owner = "XGJADJOY", name = "s", descriptor = "I")
    private int field1706;

    @OriginalMember(owner = "XGJADJOY", name = "t", descriptor = "I")
    private int field1707;

    @OriginalMember(owner = "XGJADJOY", name = "a", descriptor = "(I)LGFYXEFQY;")
    public final class21 method294(int arg0) {
        if (arg0 <= 0) {
            this.field1708 = 220;
        }
        class21 var2 = this.field1704.method564();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field1704.field1592.field1197[this.field1706];
        class21 var4 = new class21((byte) 72, class14.method282(var3, false), var2, true, false);
        if (!this.field1709) {
            var4.method348(false);
            var4.method349(90, var3);
            var4.field917 = null;
            var4.field916 = null;
        }
        if (this.field1704.field1595 != 128 || this.field1704.field1596 != 128) {
            var4.method357((byte) -10, this.field1704.field1595, this.field1704.field1595, this.field1704.field1596);
        }
        if (this.field1704.field1597 != 0) {
            if (this.field1704.field1597 == 90) {
                var4.method352((byte) -119);
            }
            if (this.field1704.field1597 == 180) {
                var4.method352((byte) -119);
                var4.method352((byte) -119);
            }
            if (this.field1704.field1597 == 270) {
                var4.method352((byte) -119);
                var4.method352((byte) -119);
                var4.method352((byte) -119);
            }
        }
        var4.method358(this.field1704.field1598 + 64, this.field1704.field1599 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "XGJADJOY", name = "<init>", descriptor = "(IIIIIIII)V")
    public class70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1704 = class63.field1588[arg1];
        this.field1700 = arg3;
        this.field1701 = arg4;
        this.field1702 = arg7;
        if (arg6 != 0) {
            this.field1708 = 303;
        }
        this.field1703 = arg5;
        this.field1705 = arg0 + arg2;
        this.field1709 = false;
    }

    @OriginalMember(owner = "XGJADJOY", name = "a", descriptor = "(II)V")
    public final void method590(int arg0, int arg1) {
        if (arg1 != 28532) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1707 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1707 <= this.field1704.field1592.method445(this.field1706, 977)) {
                        return;
                    }
                    this.field1707 -= this.field1704.field1592.method445(this.field1706, 977) + 1;
                    this.field1706++;
                } while (this.field1706 < this.field1704.field1592.field1196);
            } while (this.field1706 >= 0 && this.field1706 < this.field1704.field1592.field1196);
            this.field1706 = 0;
            this.field1709 = true;
        }
    }
}
