import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YSSTKYXW")
public class class71 extends class20 {

    @OriginalMember(owner = "client!YSSTKYXW", name = "k", descriptor = "I")
    private int field1737 = 969;

    @OriginalMember(owner = "client!YSSTKYXW", name = "v", descriptor = "Z")
    private boolean field1748 = true;

    @OriginalMember(owner = "client!YSSTKYXW", name = "q", descriptor = "I")
    private int field1743;

    @OriginalMember(owner = "client!YSSTKYXW", name = "r", descriptor = "I")
    private int field1744;

    @OriginalMember(owner = "client!YSSTKYXW", name = "s", descriptor = "I")
    private int field1745;

    @OriginalMember(owner = "client!YSSTKYXW", name = "m", descriptor = "I")
    private int field1739;

    @OriginalMember(owner = "client!YSSTKYXW", name = "n", descriptor = "I")
    private int field1740;

    @OriginalMember(owner = "client!YSSTKYXW", name = "o", descriptor = "I")
    private int field1741;

    @OriginalMember(owner = "client!YSSTKYXW", name = "p", descriptor = "I")
    private int field1742;

    @OriginalMember(owner = "client!YSSTKYXW", name = "x", descriptor = "LQBINVEVU;")
    private class47 field1750;

    @OriginalMember(owner = "client!YSSTKYXW", name = "l", descriptor = "I")
    private int field1738;

    @OriginalMember(owner = "client!YSSTKYXW", name = "z", descriptor = "I")
    private int field1752;

    @OriginalMember(owner = "client!YSSTKYXW", name = "t", descriptor = "I")
    public int field1746;

    @OriginalMember(owner = "client!YSSTKYXW", name = "u", descriptor = "I")
    public int field1747;

    @OriginalMember(owner = "client!YSSTKYXW", name = "y", descriptor = "[I")
    public int[] field1751;

    @OriginalMember(owner = "client!YSSTKYXW", name = "w", descriptor = "Lclient;")
    public static client field1749;

    @OriginalMember(owner = "client!YSSTKYXW", name = "a", descriptor = "(I)LIRLTEWJP;")
    public final class26 method168(int arg0) {
        int var2 = -1;
        if (this.field1750 != null) {
            int var3 = client.field542 - this.field1752;
            if (var3 > 100 && this.field1750.field1341 > 0) {
                var3 = 100;
            }
            label50: {
                do {
                    do {
                        if (var3 <= this.field1750.method451(13126, this.field1738)) {
                            break label50;
                        }
                        var3 -= this.field1750.method451(13126, this.field1738);
                        this.field1738++;
                    } while (this.field1738 < this.field1750.field1337);
                    this.field1738 -= this.field1750.field1341;
                } while (this.field1738 >= 0 && this.field1738 < this.field1750.field1337);
                this.field1750 = null;
            }
            this.field1752 = client.field542 - var3;
            if (this.field1750 != null) {
                var2 = this.field1750.field1338[this.field1738];
            }
        }
        class36 var4;
        if (this.field1751 == null) {
            var4 = class36.method363(this.field1743);
        } else {
            var4 = this.method604(true);
        }
        if (var4 == null) {
            return null;
        }
        class26 var5 = var4.method365(this.field1744, this.field1745, this.field1739, this.field1740, this.field1741, this.field1742, var2);
        while (arg0 >= 0) {
            this.field1737 = -435;
        }
        return var5;
    }

    @OriginalMember(owner = "client!YSSTKYXW", name = "<init>", descriptor = "(IIIIBIIIIZ)V")
    public class71(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field1743 = arg7;
        this.field1744 = arg0;
        this.field1745 = arg3;
        this.field1739 = arg5;
        this.field1740 = arg1;
        if (arg4 != 116) {
            this.field1748 = !this.field1748;
        }
        this.field1741 = arg6;
        this.field1742 = arg8;
        if (arg2 != -1) {
            this.field1750 = class47.field1336[arg2];
            this.field1738 = 0;
            this.field1752 = client.field542;
            if (arg9 && this.field1750.field1341 != -1) {
                this.field1738 = (int) (Math.random() * (double) this.field1750.field1337);
                this.field1752 -= (int) (Math.random() * (double) this.field1750.method451(13126, this.field1738));
            }
        }
        class36 var11 = class36.method363(this.field1743);
        this.field1746 = var11.field1182;
        this.field1747 = var11.field1158;
        this.field1751 = var11.field1148;
    }

    @OriginalMember(owner = "client!YSSTKYXW", name = "a", descriptor = "(Z)LMIQWCPVG;")
    public final class36 method604(boolean arg0) {
        int var2 = -1;
        if (!arg0) {
            throw new NullPointerException();
        }
        if (this.field1746 != -1) {
            class39 var3 = class39.field1232[this.field1746];
            int var4 = var3.field1234;
            int var5 = var3.field1235;
            int var6 = var3.field1236;
            int var7 = client.field448[var6 - var5];
            var2 = field1749.field498[var4] >> var5 & var7;
        } else if (this.field1747 != -1) {
            var2 = field1749.field498[this.field1747];
        }
        return var2 < 0 || var2 >= this.field1751.length || this.field1751[var2] == -1 ? null : class36.method363(this.field1751[var2]);
    }
}
