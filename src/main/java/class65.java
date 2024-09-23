import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZJEEQISS")
public class class65 extends class66 {

    @OriginalMember(owner = "ZJEEQISS", name = "l", descriptor = "Z")
    public boolean field1672 = false;

    @OriginalMember(owner = "ZJEEQISS", name = "t", descriptor = "I")
    private int field1680 = 9;

    @OriginalMember(owner = "ZJEEQISS", name = "u", descriptor = "Z")
    private boolean field1681 = false;

    @OriginalMember(owner = "ZJEEQISS", name = "q", descriptor = "LFXNZCBPL;")
    private class11 field1677;

    @OriginalMember(owner = "ZJEEQISS", name = "m", descriptor = "I")
    public int field1673;

    @OriginalMember(owner = "ZJEEQISS", name = "n", descriptor = "I")
    public int field1674;

    @OriginalMember(owner = "ZJEEQISS", name = "o", descriptor = "I")
    public int field1675;

    @OriginalMember(owner = "ZJEEQISS", name = "p", descriptor = "I")
    public int field1676;

    @OriginalMember(owner = "ZJEEQISS", name = "v", descriptor = "I")
    public int field1682;

    @OriginalMember(owner = "ZJEEQISS", name = "r", descriptor = "I")
    private int field1678;

    @OriginalMember(owner = "ZJEEQISS", name = "s", descriptor = "I")
    private int field1679;

    @OriginalMember(owner = "ZJEEQISS", name = "a", descriptor = "(Z)LCSGBDGDY;")
    public final class4 method187(boolean arg0) {
        class4 var2 = this.field1677.method202();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field1677.field702.field1221[this.field1678];
        class4 var4 = new class4(true, class25.method285(0, var3), var2, false, (byte) -45);
        if (!this.field1672) {
            var4.method167(7);
            var4.method168(false, var3);
            var4.field601 = null;
            var4.field600 = null;
        }
        if (this.field1677.field705 != 128 || this.field1677.field706 != 128) {
            var4.method176(this.field1677.field705, this.field1677.field706, this.field1677.field705, 1);
        }
        if (this.field1677.field707 != 0) {
            if (this.field1677.field707 == 90) {
                var4.method171(322);
            }
            if (this.field1677.field707 == 180) {
                var4.method171(322);
                var4.method171(322);
            }
            if (this.field1677.field707 == 270) {
                var4.method171(322);
                var4.method171(322);
                var4.method171(322);
            }
        }
        var4.method177(this.field1677.field708 + 64, this.field1677.field709 + 850, -30, -50, -30, true);
        if (!arg0) {
            this.field1681 = !this.field1681;
        }
        return var4;
    }

    @OriginalMember(owner = "ZJEEQISS", name = "a", descriptor = "(II)V")
    public final void method584(int arg0, int arg1) {
        this.field1679 += arg0;
        int var3 = 15 / arg1;
        while (true) {
            do {
                do {
                    if (this.field1679 <= this.field1677.field702.method427(this.field1678, this.field1680)) {
                        return;
                    }
                    this.field1679 -= this.field1677.field702.method427(this.field1678, this.field1680) + 1;
                    this.field1678++;
                } while (this.field1678 < this.field1677.field702.field1220);
            } while (this.field1678 >= 0 && this.field1678 < this.field1677.field702.field1220);
            this.field1678 = 0;
            this.field1672 = true;
        }
    }

    @OriginalMember(owner = "ZJEEQISS", name = "<init>", descriptor = "(IIZIIIII)V")
    public class65(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!arg2) {
            throw new NullPointerException();
        }
        this.field1677 = class11.field698[arg4];
        this.field1673 = arg0;
        this.field1674 = arg1;
        this.field1675 = arg7;
        this.field1676 = arg5;
        this.field1682 = arg3 + arg6;
        this.field1672 = false;
    }
}
