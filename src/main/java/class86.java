import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class86 extends class98 {

    @OriginalMember(owner = "client!g", name = "M", descriptor = "I")
    private int field972 = 4096;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "I")
    private int field975 = 4096;

    @OriginalMember(owner = "client!g", name = "S", descriptor = "I")
    private int field978 = 4096;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "Llg;")
    public static class237 field974 = new class237(8);

    @OriginalMember(owner = "client!g", name = "V", descriptor = "[I")
    public static int[] field981 = new int[1024];

    @OriginalMember(owner = "client!g", name = "U", descriptor = "Liq;")
    public static class362 field980 = new class362("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!g", name = "W", descriptor = "[[I")
    public static int[][] field982 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!g", name = "X", descriptor = "[B")
    public static byte[] field983 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!g", name = "L", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!g", name = "R", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "Ltq;")
    public static class376 field976;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILdg;I)V")
    public final void method81(int arg0, class236 arg1, int arg2) {
        if (arg2 != 0) {
            field983 = null;
        }
        ++field971;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field972 = arg1.method1617((byte) 48);
                }
            } else {
                this.field975 = arg1.method1617((byte) 48);
            }
        } else {
            this.field978 = arg1.method1617((byte) 48);
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)[[I")
    public final int[][] method194(int arg0, int arg1) {
        ++field979;
        int var3 = 105 % ((arg1 - 60) / 43);
        int[][] var4 = super.field1184.method185((byte) -48, arg0);
        if (super.field1184.field332) {
            int[][] var5 = this.method546(arg0, (byte) 33, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; class268.field3811 > var12; ++var12) {
                int var13 = var6[var12];
                int var14 = var8[var12];
                int var15 = var7[var12];
                if (~var13 == ~var14 && ~var14 == ~var15) {
                    var9[var12] = this.field978 * var13 >> 12;
                    var10[var12] = this.field975 * var14 >> 12;
                    var11[var12] = this.field972 * var15 >> 12;
                } else {
                    var9[var12] = this.field978;
                    var10[var12] = this.field975;
                    var11[var12] = this.field972;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class86() {
        super(1, false);
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(II)V")
    public static final void method467(int arg0, int arg1) {
        class152.field1875 = 1000 / arg1;
        if (arg0 != 26029) {
            field976 = null;
        }
        ++field973;
    }

    @OriginalMember(owner = "client!g", name = "f", descriptor = "(B)V")
    public static void method468(byte arg0) {
        field980 = null;
        field982 = null;
        field981 = null;
        field974 = null;
        field976 = null;
        if (arg0 != 0) {
            method468((byte) 71);
        }
        field983 = null;
    }
}
