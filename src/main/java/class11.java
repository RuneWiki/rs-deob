import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DROEXFTE")
public class class11 extends class22 {

    @OriginalMember(owner = "DROEXFTE", name = "B", descriptor = "B")
    private byte field701 = 6;

    @OriginalMember(owner = "DROEXFTE", name = "n", descriptor = "I")
    private int field687;

    @OriginalMember(owner = "DROEXFTE", name = "o", descriptor = "I")
    private int field688;

    @OriginalMember(owner = "DROEXFTE", name = "p", descriptor = "I")
    private int field689;

    @OriginalMember(owner = "DROEXFTE", name = "t", descriptor = "I")
    private int field693;

    @OriginalMember(owner = "DROEXFTE", name = "u", descriptor = "I")
    private int field694;

    @OriginalMember(owner = "DROEXFTE", name = "v", descriptor = "I")
    private int field695;

    @OriginalMember(owner = "DROEXFTE", name = "w", descriptor = "I")
    private int field696;

    @OriginalMember(owner = "DROEXFTE", name = "r", descriptor = "LUVDKTGZK;")
    private class58 field691;

    @OriginalMember(owner = "DROEXFTE", name = "A", descriptor = "I")
    private int field700;

    @OriginalMember(owner = "DROEXFTE", name = "s", descriptor = "I")
    private int field692;

    @OriginalMember(owner = "DROEXFTE", name = "x", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "DROEXFTE", name = "y", descriptor = "I")
    public int field698;

    @OriginalMember(owner = "DROEXFTE", name = "z", descriptor = "[I")
    public int[] field699;

    @OriginalMember(owner = "DROEXFTE", name = "q", descriptor = "Lclient;")
    public static client field690;

    @OriginalMember(owner = "DROEXFTE", name = "a", descriptor = "(I)LCADBNSXE;")
    public final class3 method40(int arg0) {
        int var2 = -1;
        if (this.field691 != null) {
            int var3 = client.field502 - this.field692;
            if (var3 > 100 && this.field691.field1575 > 0) {
                var3 = 100;
            }
            label45: {
                do {
                    do {
                        if (var3 <= this.field691.method562((byte) 5, this.field700)) {
                            break label45;
                        }
                        var3 -= this.field691.method562((byte) 5, this.field700);
                        this.field700++;
                    } while (this.field700 < this.field691.field1571);
                    this.field700 -= this.field691.field1575;
                } while (this.field700 >= 0 && this.field700 < this.field691.field1571);
                this.field691 = null;
            }
            this.field692 = client.field502 - var3;
            if (this.field691 != null) {
                var2 = this.field691.field1572[this.field700];
            }
        }
        class27 var4;
        if (this.field699 == null) {
            var4 = class27.method282(this.field687);
        } else {
            var4 = this.method218((byte) -41);
        }
        if (var4 == null) {
            return null;
        }
        class3 var5 = var4.method283(this.field688, this.field689, this.field693, this.field694, this.field695, this.field696, var2);
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return var5;
    }

    @OriginalMember(owner = "DROEXFTE", name = "a", descriptor = "(B)LLYSBQDHB;")
    public final class27 method218(byte arg0) {
        if (arg0 != -41) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field697 != -1) {
            class61 var3 = class61.field1641[this.field697];
            int var4 = var3.field1643;
            int var5 = var3.field1644;
            int var6 = var3.field1645;
            int var7 = client.field166[var6 - var5];
            var2 = field690.field293[var4] >> var5 & var7;
        } else if (this.field698 != -1) {
            var2 = field690.field293[this.field698];
        }
        return var2 < 0 || var2 >= this.field699.length || this.field699[var2] == -1 ? null : class27.method282(this.field699[var2]);
    }

    @OriginalMember(owner = "DROEXFTE", name = "<init>", descriptor = "(ZIIBIIIIII)V")
    public class11(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field687 = arg2;
        if (this.field701 != arg3) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        this.field688 = arg4;
        this.field689 = arg1;
        this.field693 = arg5;
        this.field694 = arg6;
        this.field695 = arg7;
        this.field696 = arg9;
        if (arg8 != -1) {
            this.field691 = class58.field1570[arg8];
            this.field700 = 0;
            this.field692 = client.field502;
            if (arg0 && this.field691.field1575 != -1) {
                this.field700 = (int) (Math.random() * (double) this.field691.field1571);
                this.field692 -= (int) (Math.random() * (double) this.field691.method562((byte) 5, this.field700));
            }
        }
        class27 var12 = class27.method282(this.field687);
        this.field697 = var12.field1014;
        this.field698 = var12.field1006;
        this.field699 = var12.field1016;
    }
}
