import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CMOSDPGZ")
public class class11 extends class15 {

    @OriginalMember(owner = "client!CMOSDPGZ", name = "m", descriptor = "I")
    private int field712 = -215;

    @OriginalMember(owner = "client!CMOSDPGZ", name = "n", descriptor = "Z")
    public boolean field713 = false;

    @OriginalMember(owner = "client!CMOSDPGZ", name = "r", descriptor = "Z")
    private boolean field717 = true;

    @OriginalMember(owner = "client!CMOSDPGZ", name = "s", descriptor = "I")
    private int field718 = 36073;

    @OriginalMember(owner = "client!CMOSDPGZ", name = "q", descriptor = "LXBHNZKGU;")
    private class63 field716;

    @OriginalMember(owner = "client!CMOSDPGZ", name = "t", descriptor = "I")
    public int field719;

    @OriginalMember(owner = "client!CMOSDPGZ", name = "u", descriptor = "I")
    public int field720;

    @OriginalMember(owner = "client!CMOSDPGZ", name = "v", descriptor = "I")
    public int field721;

    @OriginalMember(owner = "client!CMOSDPGZ", name = "w", descriptor = "I")
    public int field722;

    @OriginalMember(owner = "client!CMOSDPGZ", name = "x", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "client!CMOSDPGZ", name = "o", descriptor = "I")
    private int field714;

    @OriginalMember(owner = "client!CMOSDPGZ", name = "p", descriptor = "I")
    private int field715;

    @OriginalMember(owner = "client!CMOSDPGZ", name = "a", descriptor = "(II)V")
    public final void method186(int arg0, int arg1) {
        this.field715 += arg1;
        if (arg0 != 11509) {
            return;
        }
        while (true) {
            do {
                do {
                    if (this.field715 <= this.field716.field1656.method567(0, this.field714)) {
                        return;
                    }
                    this.field715 -= this.field716.field1656.method567(0, this.field714) + 1;
                    this.field714++;
                } while (this.field714 < this.field716.field1656.field1694);
            } while (this.field714 >= 0 && this.field714 < this.field716.field1656.field1694);
            this.field714 = 0;
            this.field713 = true;
        }
    }

    @OriginalMember(owner = "client!CMOSDPGZ", name = "a", descriptor = "(I)LFCIDIKVY;")
    public final class19 method187(int arg0) {
        class19 var2 = this.field716.method563();
        if (arg0 != 0) {
            this.field718 = 265;
        }
        if (var2 == null) {
            return null;
        }
        int var3 = this.field716.field1656.field1695[this.field714];
        class19 var4 = new class19(false, class21.method235(var3, 12073), true, var2, true);
        if (!this.field713) {
            var4.method206(8);
            var4.method207(var3, (byte) -14);
            var4.field799 = null;
            var4.field798 = null;
        }
        if (this.field716.field1659 != 128 || this.field716.field1660 != 128) {
            var4.method215(this.field716.field1659, this.field716.field1659, this.field717, this.field716.field1660);
        }
        if (this.field716.field1661 != 0) {
            if (this.field716.field1661 == 90) {
                var4.method210(-79);
            }
            if (this.field716.field1661 == 180) {
                var4.method210(-79);
                var4.method210(-79);
            }
            if (this.field716.field1661 == 270) {
                var4.method210(-79);
                var4.method210(-79);
                var4.method210(-79);
            }
        }
        var4.method216(this.field716.field1662 + 64, this.field716.field1663 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "client!CMOSDPGZ", name = "<init>", descriptor = "(IIIIIIII)V")
    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field716 = class63.field1652[arg4];
        this.field719 = arg5;
        this.field720 = arg1;
        if (arg3 <= 0) {
            this.field712 = -152;
        }
        this.field721 = arg7;
        this.field722 = arg0;
        this.field723 = arg2 + arg6;
        this.field713 = false;
    }
}
