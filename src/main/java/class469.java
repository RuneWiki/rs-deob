import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class469 extends class404 {

    @OriginalMember(owner = "client!ev", name = "C", descriptor = "I")
    private int field7188 = -1;

    @OriginalMember(owner = "client!ev", name = "F", descriptor = "[[I")
    public static int[][] field7191 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ev", name = "L", descriptor = "Z")
    public static boolean field7196 = false;

    @OriginalMember(owner = "client!ev", name = "z", descriptor = "I")
    public int field7185;

    @OriginalMember(owner = "client!ev", name = "A", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!ev", name = "D", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!ev", name = "E", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!ev", name = "H", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!ev", name = "I", descriptor = "I")
    public static int field7194;

    @OriginalMember(owner = "client!ev", name = "M", descriptor = "I")
    public static int field7197;

    @OriginalMember(owner = "client!ev", name = "N", descriptor = "I")
    public int field7198;

    @OriginalMember(owner = "client!ev", name = "P", descriptor = "I")
    public static int field7199;

    @OriginalMember(owner = "client!ev", name = "K", descriptor = "Llt;")
    public static class458 field7195;

    @OriginalMember(owner = "client!ev", name = "B", descriptor = "[I")
    public static int[] field7187;

    @OriginalMember(owner = "client!ev", name = "G", descriptor = "[I")
    public int[] field7192;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILha;I)V", line = 4)
    public final void method87(int arg0, class40 arg1, int arg2) {
        ++field7189;
        if (arg0 == arg2) {
            this.field7188 = arg1.method254((byte) -111);
        }
    }

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "(I)V", line = 16)
    public static void method2830(int arg0) {
        field7195 = null;
        field7187 = null;
        if (arg0 <= -120) {
            field7191 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "(I)V", line = 34)
    public static final void method2831(int arg0) {
        class138.field2275.method66(23913);
        ++field7193;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            class4.field44[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; ++var2) {
            class370.field5439[var2] = 0L;
        }
        if (arg0 != -17186) {
            method2830(-44);
        }
        class505.field7626 = 0;
    }

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "(I)I", line = 60)
    public final int method2399(int arg0) {
        ++field7199;
        if (arg0 <= 119) {
            this.method89(-7, 126);
        }
        return this.field7188;
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "()V", line = 175)
    public class469() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(II)[[I", line = 75)
    public int[][] method89(int arg0, int arg1) {
        ++field7190;
        int[][] var3 = super.field5869.method2819(arg1, arg0 ^ -2);
        if (super.field5869.field7156 && this.method2833(1971193892)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field7185 * (~class437.field6437 == ~this.field7198 ? arg1 : this.field7198 * arg1 / class437.field6437);
            if (class431.field6348 != this.field7185) {
                for (int var8 = 0; ~var8 > ~class431.field6348; ++var8) {
                    int var9 = this.field7185 * var8 / class431.field6348;
                    int var10 = this.field7192[var7 - -var9];
                    var6[var8] = class330.method2050(var10 << 4, 4080);
                    var5[var8] = class330.method2050(65280, var10) >> 4;
                    var4[var8] = class330.method2050(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; ~var11 > ~class431.field6348; ++var11) {
                    int var12 = this.field7192[var7++];
                    var6[var11] = class330.method2050(4080, var12 << 4);
                    var5[var11] = class330.method2050(65280, var12) >> 4;
                    var4[var11] = class330.method2050(var12, 16711680) >> 12;
                }
            }
        }
        if (arg0 != -1) {
            this.field7192 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "(I)V", line = 148)
    public final void method2397(int arg0) {
        ++field7194;
        super.method2397(69);
        this.field7192 = null;
        if (arg0 < 13) {
            field7191 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(III)I", line = 160)
    public static final int method2832(int arg0, int arg1, int arg2) {
        ++field7197;
        if (arg2 < 126) {
            return 71;
        } else {
            return arg0 != 4 && arg0 != 5 ? 256 : class506.field7645[arg1 & 3];
        }
    }

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "(I)Z", line = 185)
    public final boolean method2833(int arg0) {
        ++field7186;
        if (arg0 != 1971193892) {
            return false;
        } else if (this.field7192 != null) {
            return true;
        } else if (~this.field7188 <= -1) {
            class351 var2 = ~class268.field4043 > -1 ? class351.method2145(class193.field3048, this.field7188) : class351.method2132(class193.field3048, class268.field4043, this.field7188);
            var2.method2136();
            this.field7192 = var2.method2135();
            this.field7185 = var2.field5166;
            this.field7198 = var2.field5168;
            return true;
        } else {
            return false;
        }
    }
}
