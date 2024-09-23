import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MSKEMKWR")
public class class44 extends class18 {

    @OriginalMember(owner = "MSKEMKWR", name = "u", descriptor = "I")
    private int field1254;

    @OriginalMember(owner = "MSKEMKWR", name = "v", descriptor = "I")
    private int field1255;

    @OriginalMember(owner = "MSKEMKWR", name = "w", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "MSKEMKWR", name = "q", descriptor = "I")
    private int field1250;

    @OriginalMember(owner = "MSKEMKWR", name = "r", descriptor = "I")
    private int field1251;

    @OriginalMember(owner = "MSKEMKWR", name = "s", descriptor = "I")
    private int field1252;

    @OriginalMember(owner = "MSKEMKWR", name = "t", descriptor = "I")
    private int field1253;

    @OriginalMember(owner = "MSKEMKWR", name = "n", descriptor = "LKIRTNGZJ;")
    private class39 field1247;

    @OriginalMember(owner = "MSKEMKWR", name = "m", descriptor = "I")
    private int field1246;

    @OriginalMember(owner = "MSKEMKWR", name = "o", descriptor = "I")
    private int field1248;

    @OriginalMember(owner = "MSKEMKWR", name = "y", descriptor = "I")
    public int field1258;

    @OriginalMember(owner = "MSKEMKWR", name = "z", descriptor = "I")
    public int field1259;

    @OriginalMember(owner = "MSKEMKWR", name = "p", descriptor = "[I")
    public int[] field1249;

    @OriginalMember(owner = "MSKEMKWR", name = "x", descriptor = "Lclient;")
    public static client field1257;

    @OriginalMember(owner = "MSKEMKWR", name = "a", descriptor = "(I)LGFYXEFQY;")
    public final class21 method294(int arg0) {
        int var2 = -1;
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field1247 != null) {
            int var4 = client.field329 - this.field1248;
            if (var4 > 100 && this.field1247.field1200 > 0) {
                var4 = 100;
            }
            label46: {
                do {
                    do {
                        if (var4 <= this.field1247.method445(this.field1246, 977)) {
                            break label46;
                        }
                        var4 -= this.field1247.method445(this.field1246, 977);
                        this.field1246++;
                    } while (this.field1246 < this.field1247.field1196);
                    this.field1246 -= this.field1247.field1200;
                } while (this.field1246 >= 0 && this.field1246 < this.field1247.field1196);
                this.field1247 = null;
            }
            this.field1248 = client.field329 - var4;
            if (this.field1247 != null) {
                var2 = this.field1247.field1197[this.field1246];
            }
        }
        class64 var5;
        if (this.field1249 == null) {
            var5 = class64.method568(this.field1254);
        } else {
            var5 = this.method449(192);
        }
        return var5 == null ? null : var5.method569(this.field1255, this.field1256, this.field1250, this.field1251, this.field1252, this.field1253, var2);
    }

    @OriginalMember(owner = "MSKEMKWR", name = "b", descriptor = "(I)LVCGOMUBN;")
    public final class64 method449(int arg0) {
        int var2 = -1;
        int var3 = 57 / arg0;
        if (this.field1258 != -1) {
            class72 var4 = class72.field1715[this.field1258];
            int var5 = var4.field1717;
            int var6 = var4.field1718;
            int var7 = var4.field1719;
            int var8 = client.field217[var7 - var6];
            var2 = field1257.field395[var5] >> var6 & var8;
        } else if (this.field1259 != -1) {
            var2 = field1257.field395[this.field1259];
        }
        return var2 < 0 || var2 >= this.field1249.length || this.field1249[var2] == -1 ? null : class64.method568(this.field1249[var2]);
    }

    @OriginalMember(owner = "MSKEMKWR", name = "<init>", descriptor = "(IIIIIIIZII)V")
    public class44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        this.field1254 = arg3;
        this.field1255 = arg9;
        this.field1256 = arg4;
        this.field1250 = arg6;
        this.field1251 = arg1;
        this.field1252 = arg5;
        this.field1253 = arg2;
        if (arg8 != -1) {
            this.field1247 = class39.field1195[arg8];
            this.field1246 = 0;
            this.field1248 = client.field329;
            if (arg7 && this.field1247.field1200 != -1) {
                this.field1246 = (int) (Math.random() * (double) this.field1247.field1196);
                this.field1248 -= (int) (Math.random() * (double) this.field1247.method445(this.field1246, 977));
            }
        }
        class64 var11 = class64.method568(this.field1254);
        this.field1258 = var11.field1615;
        int var12 = 77 / arg0;
        this.field1259 = var11.field1636;
        this.field1249 = var11.field1639;
    }
}
