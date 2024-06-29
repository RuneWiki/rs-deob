import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class115 extends class12 {

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "I")
    private int field2080 = 0;

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "I")
    private int field2084 = 1;

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "I")
    private int field2092 = 0;

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "Ltg;")
    private static class184 field2082 = class135.method812("Loaded input handler", 3);

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "Ltg;")
    public static class184 field2088 = class135.method812("Update)2Liste geladen)3", 3);

    @OriginalMember(owner = "client!ma", name = "ab", descriptor = "Ltg;")
    public static class184 field2093 = field2082;

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!ma", name = "W", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "[I")
    public static int[] field2086;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        if (arg0 != 57) {
            method706(-98, -64, 110, 5);
        }
        class90.method527((byte) -110);
        ++field2090;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            ++field2087;
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (arg1 == 3) {
                        this.field2084 = arg0.method588((byte) -41);
                    }
                } else {
                    this.field2092 = arg0.method588((byte) -59);
                }
            } else {
                this.field2080 = arg0.method588((byte) -42);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        if (arg1 != 17) {
            this.field2080 = 64;
        }
        ++field2085;
        int[] var3 = super.field224.method7((byte) -87, arg0);
        if (super.field224.field53) {
            int var4 = class37.field698[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class201.field3889; ++var6) {
                int var7 = class131.field2381[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field2080 == -1) {
                    var9 = (-var4 + var7) * this.field2084;
                } else {
                    int var10 = var8 * var8 - -(var5 * var5) >> 12;
                    int var11 = (int) (Math.sqrt((double) (var10 / 4096)) * 4096.0D);
                    var9 = (int) ((double) (this.field2084 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field2092 == -1) {
                    var12 = class136.field2474[(var12 & 4081) >> 4] + 4096 >> 1;
                } else if (this.field2092 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)I")
    public static final int method706(int arg0, int arg1, int arg2, int arg3) {
        ++field2089;
        int var4 = arg3 >> 7;
        int var5 = arg0 >> 7;
        if (~var5 <= -1 && ~var4 <= -1 && var5 <= 103 && ~var4 >= -104) {
            int var6 = arg1;
            int var7 = 127 & arg0;
            if (arg1 < 3 && ~(class46.field878[1][var5][var4] & 2) == -3) {
                var6 = arg1 + 1;
            }
            int var8 = (128 - var7) * class179.field3418[var6][var5][var4] - -(class179.field3418[var6][var5 + 1][var4] * var7) >> 7;
            int var9 = (-var7 + 128) * class179.field3418[var6][var5][var4 + 1] + class179.field3418[var6][var5 + 1][var4 - -1] * var7 >> 7;
            int var10 = arg2 & arg3;
            return (-var10 + 128) * var8 + var9 * var10 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    public class115() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)V")
    public static void method707(int arg0) {
        field2088 = null;
        if (arg0 != -2537) {
            field2088 = null;
        }
        field2093 = null;
        field2082 = null;
        field2086 = null;
    }
}
