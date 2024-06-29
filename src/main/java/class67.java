import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XEVZUZBV")
public class class67 extends class15 {

    @OriginalMember(owner = "client!XEVZUZBV", name = "u", descriptor = "I")
    private int field1718 = -26550;

    @OriginalMember(owner = "client!XEVZUZBV", name = "v", descriptor = "Z")
    private boolean field1719 = false;

    @OriginalMember(owner = "client!XEVZUZBV", name = "A", descriptor = "Z")
    private boolean field1724 = false;

    @OriginalMember(owner = "client!XEVZUZBV", name = "x", descriptor = "I")
    private int field1721;

    @OriginalMember(owner = "client!XEVZUZBV", name = "y", descriptor = "I")
    private int field1722;

    @OriginalMember(owner = "client!XEVZUZBV", name = "z", descriptor = "I")
    private int field1723;

    @OriginalMember(owner = "client!XEVZUZBV", name = "p", descriptor = "I")
    private int field1713;

    @OriginalMember(owner = "client!XEVZUZBV", name = "q", descriptor = "I")
    private int field1714;

    @OriginalMember(owner = "client!XEVZUZBV", name = "r", descriptor = "I")
    private int field1715;

    @OriginalMember(owner = "client!XEVZUZBV", name = "s", descriptor = "I")
    private int field1716;

    @OriginalMember(owner = "client!XEVZUZBV", name = "C", descriptor = "LXETSOHUA;")
    private class66 field1726;

    @OriginalMember(owner = "client!XEVZUZBV", name = "w", descriptor = "I")
    private int field1720;

    @OriginalMember(owner = "client!XEVZUZBV", name = "t", descriptor = "I")
    private int field1717;

    @OriginalMember(owner = "client!XEVZUZBV", name = "m", descriptor = "I")
    public int field1710;

    @OriginalMember(owner = "client!XEVZUZBV", name = "n", descriptor = "I")
    public int field1711;

    @OriginalMember(owner = "client!XEVZUZBV", name = "o", descriptor = "[I")
    public int[] field1712;

    @OriginalMember(owner = "client!XEVZUZBV", name = "B", descriptor = "Lclient;")
    public static client field1725;

    @OriginalMember(owner = "client!XEVZUZBV", name = "a", descriptor = "(I)LFCIDIKVY;")
    public final class19 method187(int arg0) {
        int var2 = -1;
        if (arg0 != 0) {
            this.field1719 = !this.field1719;
        }
        if (this.field1726 != null) {
            int var3 = client.field608 - this.field1717;
            if (var3 > 100 && this.field1726.field1698 > 0) {
                var3 = 100;
            }
            label49: {
                do {
                    do {
                        if (var3 <= this.field1726.method567(0, this.field1720)) {
                            break label49;
                        }
                        var3 -= this.field1726.method567(0, this.field1720);
                        this.field1720++;
                    } while (this.field1720 < this.field1726.field1694);
                    this.field1720 -= this.field1726.field1698;
                } while (this.field1720 >= 0 && this.field1720 < this.field1726.field1694);
                this.field1726 = null;
            }
            this.field1717 = client.field608 - var3;
            if (this.field1726 != null) {
                var2 = this.field1726.field1695[this.field1720];
            }
        }
        class22 var4;
        if (this.field1712 == null) {
            var4 = class22.method246(this.field1721);
        } else {
            var4 = this.method569(-734);
        }
        return var4 == null ? null : var4.method244(this.field1722, this.field1723, this.field1713, this.field1714, this.field1715, this.field1716, var2);
    }

    @OriginalMember(owner = "client!XEVZUZBV", name = "b", descriptor = "(I)LFUIMNWOZ;")
    public final class22 method569(int arg0) {
        int var2 = -1;
        if (arg0 >= 0) {
            this.field1718 = -379;
        }
        if (this.field1710 != -1) {
            class55 var3 = class55.field1581[this.field1710];
            int var4 = var3.field1583;
            int var5 = var3.field1584;
            int var6 = var3.field1585;
            int var7 = client.field287[var6 - var5];
            var2 = field1725.field693[var4] >> var5 & var7;
        } else if (this.field1711 != -1) {
            var2 = field1725.field693[this.field1711];
        }
        return var2 < 0 || var2 >= this.field1712.length || this.field1712[var2] == -1 ? null : class22.method246(this.field1712[var2]);
    }

    @OriginalMember(owner = "client!XEVZUZBV", name = "<init>", descriptor = "(IZIBIIIIII)V")
    public class67(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1721 = arg2;
        this.field1722 = arg9;
        this.field1723 = arg7;
        this.field1713 = arg6;
        this.field1714 = arg0;
        this.field1715 = arg8;
        this.field1716 = arg5;
        if (arg4 != -1) {
            this.field1726 = class66.field1693[arg4];
            this.field1720 = 0;
            this.field1717 = client.field608;
            if (arg1 && this.field1726.field1698 != -1) {
                this.field1720 = (int) (Math.random() * (double) this.field1726.field1694);
                this.field1717 -= (int) (Math.random() * (double) this.field1726.method567(0, this.field1720));
            }
        }
        class22 var11 = class22.method246(this.field1721);
        this.field1710 = var11.field901;
        if (arg3 == 8) {
            boolean var12 = false;
        } else {
            this.field1724 = !this.field1724;
        }
        this.field1711 = var11.field887;
        this.field1712 = var11.field858;
    }
}
