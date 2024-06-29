import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YGFSYDKK")
public class class68 extends class3 {

    @OriginalMember(owner = "client!YGFSYDKK", name = "r", descriptor = "I")
    private int field1688 = -370;

    @OriginalMember(owner = "client!YGFSYDKK", name = "s", descriptor = "Z")
    public boolean field1689 = false;

    @OriginalMember(owner = "client!YGFSYDKK", name = "v", descriptor = "I")
    private int field1692 = -593;

    @OriginalMember(owner = "client!YGFSYDKK", name = "w", descriptor = "Z")
    private boolean field1693 = true;

    @OriginalMember(owner = "client!YGFSYDKK", name = "x", descriptor = "LJEPDVFCL;")
    private class29 field1694;

    @OriginalMember(owner = "client!YGFSYDKK", name = "n", descriptor = "I")
    public int field1684;

    @OriginalMember(owner = "client!YGFSYDKK", name = "o", descriptor = "I")
    public int field1685;

    @OriginalMember(owner = "client!YGFSYDKK", name = "p", descriptor = "I")
    public int field1686;

    @OriginalMember(owner = "client!YGFSYDKK", name = "q", descriptor = "I")
    public int field1687;

    @OriginalMember(owner = "client!YGFSYDKK", name = "m", descriptor = "I")
    public int field1683;

    @OriginalMember(owner = "client!YGFSYDKK", name = "t", descriptor = "I")
    private int field1690;

    @OriginalMember(owner = "client!YGFSYDKK", name = "u", descriptor = "I")
    private int field1691;

    @OriginalMember(owner = "client!YGFSYDKK", name = "a", descriptor = "(II)V")
    public final void method585(int arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        this.field1691 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1691 <= this.field1694.field936.method583(this.field1690, (byte) 9)) {
                        return;
                    }
                    this.field1691 -= this.field1694.field936.method583(this.field1690, (byte) 9) + 1;
                    this.field1690++;
                } while (this.field1690 < this.field1694.field936.field1667);
            } while (this.field1690 >= 0 && this.field1690 < this.field1694.field936.field1667);
            this.field1690 = 0;
            this.field1689 = true;
        }
    }

    @OriginalMember(owner = "client!YGFSYDKK", name = "<init>", descriptor = "(BIIIIIII)V")
    public class68(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1694 = class29.field932[arg2];
        this.field1684 = arg4;
        this.field1685 = arg7;
        this.field1686 = arg6;
        this.field1687 = arg1;
        if (arg0 != -24) {
            this.field1692 = 246;
        }
        this.field1683 = arg3 + arg5;
        this.field1689 = false;
    }

    @OriginalMember(owner = "client!YGFSYDKK", name = "a", descriptor = "(Z)LGCSAWSJV;")
    public final class16 method8(boolean arg0) {
        class16 var2 = this.field1694.method332();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field1694.field936.field1668[this.field1690];
        class16 var4 = new class16(0, var2, true, class48.method436(this.field1693, var3), false);
        if (arg0) {
            this.field1688 = -105;
        }
        if (!this.field1689) {
            var4.method267(-12404);
            var4.method268((byte) 81, var3);
            var4.field746 = null;
            var4.field745 = null;
        }
        if (this.field1694.field939 != 128 || this.field1694.field940 != 128) {
            var4.method276(this.field1694.field939, this.field1694.field939, this.field1694.field940, (byte) -79);
        }
        if (this.field1694.field941 != 0) {
            if (this.field1694.field941 == 90) {
                var4.method271(false);
            }
            if (this.field1694.field941 == 180) {
                var4.method271(false);
                var4.method271(false);
            }
            if (this.field1694.field941 == 270) {
                var4.method271(false);
                var4.method271(false);
                var4.method271(false);
            }
        }
        var4.method277(this.field1694.field942 + 64, this.field1694.field943 + 850, -30, -50, -30, true);
        return var4;
    }
}
