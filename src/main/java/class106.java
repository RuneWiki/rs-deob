import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class106 extends class82 {

    @OriginalMember(owner = "client!ju", name = "L", descriptor = "I")
    private int field1285 = 2048;

    @OriginalMember(owner = "client!ju", name = "U", descriptor = "I")
    private int field1294 = 1024;

    @OriginalMember(owner = "client!ju", name = "V", descriptor = "I")
    private int field1295 = 3072;

    @OriginalMember(owner = "client!ju", name = "P", descriptor = "I")
    public static int field1289 = 104;

    @OriginalMember(owner = "client!ju", name = "T", descriptor = "Lcea;")
    public static class180 field1293;

    @OriginalMember(owner = "client!ju", name = "X", descriptor = "Lrg;")
    public static class548 field1297;

    @OriginalMember(owner = "client!ju", name = "N", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!ju", name = "O", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!ju", name = "Q", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!ju", name = "R", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!ju", name = "M", descriptor = "Ldn;")
    public static class438 field1286;

    @OriginalMember(owner = "client!ju", name = "S", descriptor = "Let;")
    public static class509 field1292;

    @OriginalMember(owner = "client!ju", name = "Y", descriptor = "Liv;")
    public static class81 field1298;

    @OriginalMember(owner = "client!ju", name = "W", descriptor = "[Lha;")
    public static class52[] field1296;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(II)[[I")
    public final int[][] method481(int arg0, int arg1) {
        ++field1290;
        int[][] var3 = super.field992.method3178(arg1, arg0 + -1000);
        if (arg0 != 1000) {
            this.method481(114, 33);
        }
        if (super.field992.field7962) {
            int[][] var4 = this.method488(0, arg1, 1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class629.field9033; ++var11) {
                var8[var11] = (var5[var11] * this.field1285 >> 12) + this.field1294;
                var9[var11] = (var6[var11] * this.field1285 >> 12) + this.field1294;
                var10[var11] = (var7[var11] * this.field1285 >> 12) + this.field1294;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "()V")
    public class106() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(II)[I")
    public final int[] method201(int arg0, int arg1) {
        ++field1287;
        if (arg1 != 12218) {
            field1297 = null;
        }
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (super.field990.field3641) {
            int[] var4 = this.method489(false, 0, arg0);
            for (int var5 = 0; ~var5 > ~class629.field9033; ++var5) {
                var3[var5] = this.field1294 - -(var4[var5] * this.field1285 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)V")
    public final void method438(int arg0) {
        this.field1285 = this.field1295 - this.field1294;
        ++field1291;
        if (arg0 != -2) {
            this.method481(-81, -7);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IILos;)V")
    public final void method198(int arg0, int arg1, class374 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field999 = arg2.method2129(-105) == 1;
                }
            } else {
                this.field1295 = arg2.method2136(false);
            }
        } else {
            this.field1294 = arg2.method2136(false);
        }
        int var5 = 65 % ((-69 - arg1) / 42);
        ++field1288;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V")
    public static void method620(byte arg0) {
        field1298 = null;
        field1297 = null;
        field1296 = null;
        field1292 = null;
        if (arg0 <= 26) {
            field1297 = null;
        }
        field1286 = null;
        field1293 = null;
    }

    static {
        new class180("Select", "Auswählen", "Sélectionner", "Selecionar");
        field1293 = new class180("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");
        field1297 = new class548(12, 11);
    }
}
