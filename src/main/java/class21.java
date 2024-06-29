import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JSKMYDBH")
public class class21 extends class50 {

    @OriginalMember(owner = "client!JSKMYDBH", name = "u", descriptor = "Z")
    private boolean field748 = true;

    @OriginalMember(owner = "client!JSKMYDBH", name = "y", descriptor = "I")
    private int field752;

    @OriginalMember(owner = "client!JSKMYDBH", name = "z", descriptor = "I")
    private int field753;

    @OriginalMember(owner = "client!JSKMYDBH", name = "A", descriptor = "I")
    private int field754;

    @OriginalMember(owner = "client!JSKMYDBH", name = "q", descriptor = "I")
    private int field744;

    @OriginalMember(owner = "client!JSKMYDBH", name = "r", descriptor = "I")
    private int field745;

    @OriginalMember(owner = "client!JSKMYDBH", name = "s", descriptor = "I")
    private int field746;

    @OriginalMember(owner = "client!JSKMYDBH", name = "t", descriptor = "I")
    private int field747;

    @OriginalMember(owner = "client!JSKMYDBH", name = "B", descriptor = "LKYGPROVJ;")
    private class27 field755;

    @OriginalMember(owner = "client!JSKMYDBH", name = "x", descriptor = "I")
    private int field751;

    @OriginalMember(owner = "client!JSKMYDBH", name = "o", descriptor = "I")
    private int field742;

    @OriginalMember(owner = "client!JSKMYDBH", name = "v", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "client!JSKMYDBH", name = "w", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "client!JSKMYDBH", name = "n", descriptor = "[I")
    public int[] field741;

    @OriginalMember(owner = "client!JSKMYDBH", name = "p", descriptor = "Lclient;")
    public static client field743;

    @OriginalMember(owner = "client!JSKMYDBH", name = "b", descriptor = "(I)LKBTDMRWU;")
    public final class25 method207(int arg0) {
        if (arg0 != -19182) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field749 != -1) {
            class23 var3 = class23.field837[this.field749];
            int var4 = var3.field839;
            int var5 = var3.field840;
            int var6 = var3.field841;
            int var7 = client.field544[var6 - var5];
            var2 = field743.field489[var4] >> var5 & var7;
        } else if (this.field750 != -1) {
            var2 = field743.field489[this.field750];
        }
        return var2 < 0 || var2 >= this.field741.length || this.field741[var2] == -1 ? null : class25.method249(this.field741[var2]);
    }

    @OriginalMember(owner = "client!JSKMYDBH", name = "<init>", descriptor = "(IIIIIIIZII)V")
    public class21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        if (arg8 >= 0) {
            throw new NullPointerException();
        }
        this.field752 = arg0;
        this.field753 = arg2;
        this.field754 = arg6;
        this.field744 = arg1;
        this.field745 = arg4;
        this.field746 = arg5;
        this.field747 = arg3;
        if (arg9 != -1) {
            this.field755 = class27.field923[arg9];
            this.field751 = 0;
            this.field742 = client.field567;
            if (arg7 && this.field755.field928 != -1) {
                this.field751 = (int) (Math.random() * (double) this.field755.field924);
                this.field742 -= (int) (Math.random() * (double) this.field755.method256(this.field751, 642));
            }
        }
        class25 var11 = class25.method249(this.field752);
        this.field749 = var11.field866;
        this.field750 = var11.field888;
        this.field741 = var11.field872;
    }

    @OriginalMember(owner = "client!JSKMYDBH", name = "a", descriptor = "(I)LJUQSYEMB;")
    public final class22 method167(int arg0) {
        int var2 = -1;
        if (this.field755 != null) {
            int var3 = client.field567 - this.field742;
            if (var3 > 100 && this.field755.field928 > 0) {
                var3 = 100;
            }
            label50: {
                do {
                    do {
                        if (var3 <= this.field755.method256(this.field751, 642)) {
                            break label50;
                        }
                        var3 -= this.field755.method256(this.field751, 642);
                        this.field751++;
                    } while (this.field751 < this.field755.field924);
                    this.field751 -= this.field755.field928;
                } while (this.field751 >= 0 && this.field751 < this.field755.field924);
                this.field755 = null;
            }
            this.field742 = client.field567 - var3;
            if (this.field755 != null) {
                var2 = this.field755.field925[this.field751];
            }
        }
        if (arg0 <= 0) {
            this.field748 = !this.field748;
        }
        class25 var4;
        if (this.field741 == null) {
            var4 = class25.method249(this.field752);
        } else {
            var4 = this.method207(-19182);
        }
        return var4 == null ? null : var4.method247(this.field753, this.field754, this.field744, this.field745, this.field746, this.field747, var2);
    }
}
