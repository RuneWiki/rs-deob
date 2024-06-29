import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class153 extends class12 {

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
    private int field2748 = -1;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "[I")
    public static int[] field2740 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "I")
    public static int field2741 = 0;

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "Ltg;")
    public static class184 field2749 = class135.method812("T", 3);

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
    public int field2737;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "I")
    public int field2745;

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "Lbh;")
    public static class18 field2739;

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "[I")
    public int[] field2744;

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "[Loe;")
    public static class137[] field2746;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            this.field2748 = arg0.method611(arg2);
        }
        ++field2738;
        if (arg2) {
            this.field2737 = 64;
        }
    }

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)V")
    public static void method929(int arg0) {
        if (arg0 != 0) {
            field2740 = null;
        }
        field2749 = null;
        field2746 = null;
        field2740 = null;
        field2739 = null;
    }

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)Z")
    public final boolean method930(int arg0) {
        ++field2750;
        if (this.field2744 != null) {
            return true;
        } else if (arg0 >= ~this.field2748) {
            class137 var2 = class78.method447(0, client.field498, this.field2748);
            var2.method825();
            this.field2737 = var2.field2491;
            this.field2745 = var2.field2490;
            this.field2744 = var2.field2493;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)I")
    public final int method82(int arg0) {
        if (arg0 != 17849) {
            return -30;
        } else {
            ++field2747;
            return this.field2748;
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    public class153() {
        super(0, false);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)[[I")
    public int[][] method80(int arg0, int arg1) {
        ++field2742;
        int[][] var3 = super.field232.method673(arg0, 88);
        int var4 = 122 % ((-58 - arg1) / 34);
        if (super.field232.field1962 && this.method930(-1)) {
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int var7 = (~class114.field2074 != ~this.field2745 ? this.field2745 * arg0 / class114.field2074 : arg0) * this.field2737;
            int[] var8 = var3[2];
            if (class201.field3889 != this.field2737) {
                for (int var9 = 0; var9 < class201.field3889; ++var9) {
                    int var10 = this.field2737 * var9 / class201.field3889;
                    int var11 = this.field2744[var7 + var10];
                    var8[var9] = class10.method61(var11 << 4, 4080);
                    var5[var9] = class10.method61(65280, var11) >> 4;
                    var6[var9] = class10.method61(16711680, var11) >> 12;
                }
            } else {
                for (int var12 = 0; ~var12 > ~class201.field3889; ++var12) {
                    int var13 = this.field2744[var7++];
                    var8[var12] = class10.method61(255, var13) << 4;
                    var5[var12] = class10.method61(var13 >> 4, 4080);
                    var6[var12] = class10.method61(16711680, var13) >> 12;
                }
            }
        }
        return var3;
    }
}
