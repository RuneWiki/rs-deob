import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DZGXSGHB")
public class class13 extends class20 {

    @OriginalMember(owner = "client!DZGXSGHB", name = "m", descriptor = "B")
    private byte field680 = 2;

    @OriginalMember(owner = "client!DZGXSGHB", name = "r", descriptor = "B")
    private byte field685 = 22;

    @OriginalMember(owner = "client!DZGXSGHB", name = "s", descriptor = "I")
    private int field686 = 3;

    @OriginalMember(owner = "client!DZGXSGHB", name = "n", descriptor = "I")
    private int field681;

    @OriginalMember(owner = "client!DZGXSGHB", name = "o", descriptor = "I")
    private int field682;

    @OriginalMember(owner = "client!DZGXSGHB", name = "p", descriptor = "I")
    private int field683;

    @OriginalMember(owner = "client!DZGXSGHB", name = "y", descriptor = "I")
    private int field692;

    @OriginalMember(owner = "client!DZGXSGHB", name = "z", descriptor = "I")
    private int field693;

    @OriginalMember(owner = "client!DZGXSGHB", name = "A", descriptor = "I")
    private int field694;

    @OriginalMember(owner = "client!DZGXSGHB", name = "B", descriptor = "I")
    private int field695;

    @OriginalMember(owner = "client!DZGXSGHB", name = "v", descriptor = "LBKDXLPEF;")
    private class2 field689;

    @OriginalMember(owner = "client!DZGXSGHB", name = "w", descriptor = "I")
    private int field690;

    @OriginalMember(owner = "client!DZGXSGHB", name = "x", descriptor = "I")
    private int field691;

    @OriginalMember(owner = "client!DZGXSGHB", name = "t", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!DZGXSGHB", name = "u", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "client!DZGXSGHB", name = "C", descriptor = "[I")
    public int[] field696;

    @OriginalMember(owner = "client!DZGXSGHB", name = "q", descriptor = "Lclient;")
    public static client field684;

    @OriginalMember(owner = "client!DZGXSGHB", name = "<init>", descriptor = "(IIIIIIIIZI)V")
    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field681 = arg1;
        this.field682 = arg7;
        this.field683 = arg3;
        this.field692 = arg6;
        this.field693 = arg4;
        this.field694 = arg5;
        if (arg2 != 0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        this.field695 = arg9;
        if (arg0 != -1) {
            this.field689 = class2.field77[arg0];
            this.field690 = 0;
            this.field691 = client.field581 - 1;
            if (arg8 && this.field689.field82 != -1) {
                this.field690 = (int) (Math.random() * (double) this.field689.field78);
                this.field691 -= (int) (Math.random() * (double) this.field689.method12(this.field690, 214));
            }
        }
        class14 var12 = class14.method196(this.field681);
        this.field687 = var12.field741;
        this.field688 = var12.field720;
        this.field696 = var12.field738;
    }

    @OriginalMember(owner = "client!DZGXSGHB", name = "b", descriptor = "(B)LELXAMLNA;")
    public final class14 method189(byte arg0) {
        if (this.field685 != arg0) {
            this.field686 = 373;
        }
        int var2 = -1;
        if (this.field687 != -1) {
            class25 var3 = class25.field916[this.field687];
            int var4 = var3.field918;
            int var5 = var3.field919;
            int var6 = var3.field920;
            int var7 = client.field224[var6 - var5];
            var2 = field684.field391[var4] >> var5 & var7;
        } else if (this.field688 != -1) {
            var2 = field684.field391[this.field688];
        }
        return var2 < 0 || var2 >= this.field696.length || this.field696[var2] == -1 ? null : class14.method196(this.field696[var2]);
    }

    @OriginalMember(owner = "client!DZGXSGHB", name = "a", descriptor = "(B)LFLXAIVEA;")
    public final class16 method190(byte arg0) {
        int var2 = -1;
        if (this.field689 != null) {
            int var3 = client.field581 - this.field691;
            if (var3 > 100 && this.field689.field82 > 0) {
                var3 = 100;
            }
            label45: {
                do {
                    do {
                        if (var3 <= this.field689.method12(this.field690, 214)) {
                            break label45;
                        }
                        var3 -= this.field689.method12(this.field690, 214);
                        this.field690++;
                    } while (this.field690 < this.field689.field78);
                    this.field690 -= this.field689.field82;
                } while (this.field690 >= 0 && this.field690 < this.field689.field78);
                this.field689 = null;
            }
            this.field691 = client.field581 - var3;
            if (this.field689 != null) {
                var2 = this.field689.field79[this.field690];
            }
        }
        if (this.field680 != arg0) {
            throw new NullPointerException();
        }
        boolean var4 = false;
        class14 var5;
        if (this.field696 == null) {
            var5 = class14.method196(this.field681);
        } else {
            var5 = this.method189((byte) 22);
        }
        return var5 == null ? null : var5.method201(this.field682, this.field683, this.field692, this.field693, this.field694, this.field695, var2);
    }
}
