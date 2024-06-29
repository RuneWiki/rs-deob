import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class125 extends class117 {

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    private int field1973 = 0;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "I")
    private int field1977 = 1;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    private int field1980 = 0;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "[C")
    public static char[] field1975 = new char[128];

    @OriginalMember(owner = "client!th", name = "L", descriptor = "Z")
    public static boolean field1974 = false;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(B)V")
    public static void method872(byte arg0) {
        field1975 = null;
        int var1 = 73 % ((arg0 - -49) / 63);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        int[] var3 = super.field1883.method531(arg1, (byte) 90);
        if (super.field1883.field1313) {
            int var4 = class173.field2835[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~var6 > ~class168.field2737; ++var6) {
                int var7 = class243.field3869[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field1973 != 0) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field1977 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field1977;
                }
                int var12 = var11 - (var11 & -4096);
                if (~this.field1980 == -1) {
                    var12 = class261.field4202[(var12 & 4089) >> 4] + 4096 >> 1;
                } else if (this.field1980 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        ++field1976;
        if (arg0 != 2) {
            this.field1977 = 43;
        }
        return var3;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class125() {
        super(0, true);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        if (arg1 == 255) {
            ++field1979;
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (~arg2 == -4) {
                        this.field1977 = arg0.method1133((byte) 53);
                    }
                } else {
                    this.field1980 = arg0.method1133((byte) 53);
                }
            } else {
                this.field1973 = arg0.method1133((byte) 53);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)V")
    public static final void method873(int arg0, boolean arg1) {
        byte var2 = 4;
        byte[][] var3 = class117.field1893;
        for (int var4 = arg0; var2 > var4; ++var4) {
            class276.method1859((byte) 102);
            for (int var5 = 0; var5 < 13; ++var5) {
                for (int var6 = 0; var6 < 13; ++var6) {
                    int var7 = class83.field1379[var4][var5][var6];
                    if (~var7 != 0) {
                        int var8 = (64565498 & var7) >> 24;
                        if (!arg1 || ~var8 == -1) {
                            int var9 = (var7 & 7) >> 1;
                            int var10 = (var7 & 16767182) >> 14;
                            int var11 = (16382 & var7) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class120.field1914.length; ++var13) {
                                if (~class120.field1914[var13] == ~var12 && var3[var13] != null) {
                                    class41.method272(var3[var13], var9, class131.field2065, (7 & var11) * 8, (var10 & 7) * 8, var8, -1, arg1, var5 * 8, var6 * 8, var4);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        ++field1971;
    }

    @OriginalMember(owner = "client!th", name = "f", descriptor = "(I)V")
    public final void method64(int arg0) {
        ++field1978;
        class11.method53(-16416);
        if (arg0 != 1) {
            this.method44((class162) null, 14, -109);
        }
    }
}
