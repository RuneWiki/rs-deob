import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class503 {

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
    private int field7261 = -1;

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "I")
    private int field7269 = 0;

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "Lub;")
    private class18 field7260 = new class18();

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "Z")
    public boolean field7271 = false;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "I")
    private int field7262;

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "I")
    private int field7267;

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "[Lnh;")
    private class528[] field7263;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "[[[I")
    private int[][][] field7259;

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "Z")
    public static boolean field7268 = false;

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "[S")
    public static short[] field7270 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "Ldq;")
    public static class493 field7265 = new class493(34, -2);

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method3029(byte arg0) {
        field7258++;
        if (this.field7267 != this.field7262) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        int var3 = -75 / ((arg0 + 39) / 58);
        while (var2 < this.field7262) {
            this.field7263[var2] = class172.field2190;
            var2++;
        }
        return this.field7259;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)V")
    public static void method3030(byte arg0) {
        field7265 = null;
        if (arg0 > 118) {
            field7270 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)[[I")
    public final int[][] method3031(int arg0, int arg1) {
        if (arg0 != -28526) {
            return null;
        }
        field7264++;
        if (this.field7267 == this.field7262) {
            this.field7271 = this.field7263[arg1] == null;
            this.field7263[arg1] = class172.field2190;
            return this.field7259[arg1];
        } else if (this.field7262 == 1) {
            this.field7271 = this.field7261 != arg1;
            this.field7261 = arg1;
            return this.field7259[0];
        } else {
            class528 var3 = this.field7263[arg1];
            if (var3 == null) {
                this.field7271 = true;
                if (this.field7269 < this.field7262) {
                    var3 = new class528(arg1, this.field7269);
                    this.field7269++;
                } else {
                    class528 var4 = (class528) this.field7260.method157(-113);
                    var3 = new class528(arg1, var4.field7790);
                    this.field7263[var4.field7788] = null;
                    var4.method2165(16225);
                }
                this.field7263[arg1] = var3;
            } else {
                this.field7271 = false;
            }
            this.field7260.method164(var3, (byte) -119);
            return this.field7259[var3.field7790];
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
    public final void method3032(int arg0) {
        int var2 = -8 / ((arg0 + 23) / 49);
        for (int var3 = 0; var3 < this.field7262; var3++) {
            this.field7259[var3][0] = null;
            this.field7259[var3][1] = null;
            this.field7259[var3][2] = null;
            this.field7259[var3] = null;
        }
        field7257++;
        this.field7259 = null;
        this.field7263 = null;
        this.field7260.method154(7491);
        this.field7260 = null;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BFFFI)F")
    public static final float method3033(byte arg0, float arg1, float arg2, float arg3, int arg4) {
        if (arg0 > -92) {
            field7265 = null;
        }
        field7266++;
        float[] var5 = class105.field1339[arg4];
        return var5[2] * arg1 + var5[0] * arg3 + var5[1] * arg2;
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(III)V")
    public class503(int arg0, int arg1, int arg2) {
        this.field7262 = arg0;
        this.field7267 = arg1;
        this.field7263 = new class528[this.field7267];
        this.field7259 = new int[this.field7262][3][arg2];
    }
}
