import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GXBMUAVX")
public class class25 extends class18 {

    @OriginalMember(owner = "GXBMUAVX", name = "t", descriptor = "I")
    private int field939 = -783;

    @OriginalMember(owner = "GXBMUAVX", name = "l", descriptor = "I")
    private int field931;

    @OriginalMember(owner = "GXBMUAVX", name = "m", descriptor = "I")
    private int field932;

    @OriginalMember(owner = "GXBMUAVX", name = "n", descriptor = "I")
    private int field933;

    @OriginalMember(owner = "GXBMUAVX", name = "v", descriptor = "I")
    private int field941;

    @OriginalMember(owner = "GXBMUAVX", name = "w", descriptor = "I")
    private int field942;

    @OriginalMember(owner = "GXBMUAVX", name = "x", descriptor = "I")
    private int field943;

    @OriginalMember(owner = "GXBMUAVX", name = "y", descriptor = "I")
    private int field944;

    @OriginalMember(owner = "GXBMUAVX", name = "q", descriptor = "LHARRRJHW;")
    private class26 field936;

    @OriginalMember(owner = "GXBMUAVX", name = "u", descriptor = "I")
    private int field940;

    @OriginalMember(owner = "GXBMUAVX", name = "r", descriptor = "I")
    private int field937;

    @OriginalMember(owner = "GXBMUAVX", name = "o", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "GXBMUAVX", name = "p", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "GXBMUAVX", name = "z", descriptor = "[I")
    public int[] field945;

    @OriginalMember(owner = "GXBMUAVX", name = "s", descriptor = "Lclient;")
    public static client field938;

    @OriginalMember(owner = "GXBMUAVX", name = "a", descriptor = "(B)LDHUPIIUL;")
    public final class10 method159(byte arg0) {
        if (arg0 == 5) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = -1;
        if (this.field936 != null) {
            int var5 = client.field341 - this.field937;
            if (var5 > 100 && this.field936.field954 > 0) {
                var5 = 100;
            }
            label46: {
                do {
                    do {
                        if (var5 <= this.field936.method275(210, this.field940)) {
                            break label46;
                        }
                        var5 -= this.field936.method275(210, this.field940);
                        this.field940++;
                    } while (this.field940 < this.field936.field950);
                    this.field940 -= this.field936.field954;
                } while (this.field940 >= 0 && this.field940 < this.field936.field950);
                this.field936 = null;
            }
            this.field937 = client.field341 - var5;
            if (this.field936 != null) {
                var4 = this.field936.field951[this.field940];
            }
        }
        class63 var6;
        if (this.field945 == null) {
            var6 = class63.method501(this.field931);
        } else {
            var6 = this.method273(false);
        }
        return var6 == null ? null : var6.method506(this.field932, this.field933, this.field941, this.field942, this.field943, this.field944, var4);
    }

    @OriginalMember(owner = "GXBMUAVX", name = "<init>", descriptor = "(ZIIIIIIIII)V")
    public class25(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field931 = arg2;
        this.field932 = arg7;
        this.field933 = arg6;
        this.field941 = arg8;
        if (arg9 != 0) {
            this.field939 = 341;
        }
        this.field942 = arg1;
        this.field943 = arg5;
        this.field944 = arg3;
        if (arg4 != -1) {
            this.field936 = class26.field949[arg4];
            this.field940 = 0;
            this.field937 = client.field341;
            if (arg0 && this.field936.field954 != -1) {
                this.field940 = (int) (Math.random() * (double) this.field936.field950);
                this.field937 -= (int) (Math.random() * (double) this.field936.method275(210, this.field940));
            }
        }
        class63 var11 = class63.method501(this.field931);
        this.field934 = var11.field1550;
        this.field935 = var11.field1522;
        this.field945 = var11.field1554;
    }

    @OriginalMember(owner = "GXBMUAVX", name = "a", descriptor = "(Z)LUVSOAWGE;")
    public final class63 method273(boolean arg0) {
        int var2 = -1;
        if (arg0) {
            throw new NullPointerException();
        }
        if (this.field934 != -1) {
            class44 var3 = class44.field1288[this.field934];
            int var4 = var3.field1290;
            int var5 = var3.field1291;
            int var6 = var3.field1292;
            int var7 = client.field313[var6 - var5];
            var2 = field938.field353[var4] >> var5 & var7;
        } else if (this.field935 != -1) {
            var2 = field938.field353[this.field935];
        }
        return var2 < 0 || var2 >= this.field945.length || this.field945[var2] == -1 ? null : class63.method501(this.field945[var2]);
    }
}
