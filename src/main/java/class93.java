import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class93 extends class182 {

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "I")
    private int field1520 = 0;

    @OriginalMember(owner = "client!ja", name = "fb", descriptor = "I")
    private int field1533 = 0;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "I")
    private int field1523 = 0;

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1517 = null;

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "[[I")
    public static int[][] field1522 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "[Ljava/lang/String;")
    public static String[] field1525 = new String[1000];

    @OriginalMember(owner = "client!ja", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field1532 = "Allocated memory";

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "I")
    private int field1518;

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "I")
    private int field1519;

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "I")
    private int field1521;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!ja", name = "Z", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!ja", name = "ab", descriptor = "I")
    private int field1528;

    @OriginalMember(owner = "client!ja", name = "bb", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!ja", name = "cb", descriptor = "I")
    private int field1530;

    @OriginalMember(owner = "client!ja", name = "db", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!ja", name = "gb", descriptor = "I")
    private int field1534;

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class93() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "(I)V")
    public static void method667(int arg0) {
        field1522 = null;
        if (arg0 != 1) {
            method667(15);
        }
        field1532 = null;
        field1517 = null;
        field1525 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)[[I")
    public final int[][] method157(byte arg0, int arg1) {
        ++field1531;
        int var3 = -41 / ((arg0 - -64) / 49);
        int[][] var4 = super.field2905.method50(arg1, (byte) 117);
        if (super.field2905.field158) {
            int[][] var5 = this.method1327(0, 0, arg1);
            int[] var6 = var5[1];
            int[] var7 = var5[2];
            int[] var8 = var5[0];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; ~class4.field116 < ~var12; ++var12) {
                this.method670(var7[var12], var6[var12], 0, var8[var12]);
                this.field1518 += this.field1523;
                this.field1530 += this.field1520;
                if (this.field1530 < 0) {
                    this.field1530 = 0;
                }
                if (~this.field1530 < -4097) {
                    this.field1530 = 4096;
                }
                this.field1534 += this.field1533;
                while (~this.field1518 > -1) {
                    this.field1518 += 4096;
                }
                while (~this.field1518 < -4097) {
                    this.field1518 -= 4096;
                }
                if (~this.field1534 > -1) {
                    this.field1534 = 0;
                }
                if (~this.field1534 < -4097) {
                    this.field1534 = 4096;
                }
                this.method669(this.field1530, (byte) 38, this.field1518, this.field1534);
                var9[var12] = this.field1521;
                var10[var12] = this.field1519;
                var11[var12] = this.field1528;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        if (arg0) {
            this.method669(-68, (byte) -127, 29, -19);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field1520 = (arg1.method1768(122) << 12) / 100;
                }
            } else {
                this.field1533 = (arg1.method1768(105) << 12) / 100;
            }
        } else {
            this.field1523 = arg1.method1762(-1);
        }
        ++field1524;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIB)V")
    public static final void method668(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (~arg3 <= ~arg2) {
            class134.method996(0, arg3, arg2, arg0, class41.field630[arg1]);
        } else {
            class134.method996(arg4 ^ -27, arg2, arg3, arg0, class41.field630[arg1]);
        }
        if (arg4 == -27) {
            ++field1529;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBII)V")
    private final void method669(int arg0, byte arg1, int arg2, int arg3) {
        ++field1526;
        int var5 = arg0 > 2048 ? arg0 - (arg0 * arg3 >> 12) + arg3 : (4096 - -arg3) * arg0 >> 12;
        if (arg1 != 38) {
            field1525 = null;
        }
        if (var5 > 0) {
            int var6 = arg2 * 6;
            int var7 = -var5 + arg0 + arg0;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var11 = var8 * var5 >> 12;
            int var12 = var6 - (var9 << 12);
            int var13 = var11 * var12 >> 12;
            int var14 = -var13 + var5;
            int var15 = var7 + var13;
            if (var9 == 0) {
                this.field1528 = var7;
                this.field1521 = var5;
                this.field1519 = var15;
                return;
            }
            if (var9 == 1) {
                this.field1528 = var7;
                this.field1519 = var5;
                this.field1521 = var14;
                return;
            }
            if (~var9 == -3) {
                this.field1519 = var5;
                this.field1528 = var15;
                this.field1521 = var7;
                return;
            }
            if (var9 == 3) {
                this.field1521 = var7;
                this.field1528 = var5;
                this.field1519 = var14;
                return;
            }
            if (~var9 == -5) {
                this.field1521 = var15;
                this.field1519 = var7;
                this.field1528 = var5;
                return;
            }
            if (var9 == 5) {
                this.field1528 = var14;
                this.field1519 = var7;
                this.field1521 = var5;
                return;
            }
        } else {
            this.field1521 = this.field1519 = this.field1528 = arg0;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)V")
    private final void method670(int arg0, int arg1, int arg2, int arg3) {
        int var5 = ~arg3 >= ~arg1 ? arg1 : arg3;
        ++field1527;
        int var6 = ~var5 > ~arg0 ? arg0 : var5;
        int var7 = ~arg1 < ~arg3 ? arg3 : arg1;
        int var8 = ~arg0 > ~var7 ? arg0 : var7;
        this.field1530 = (var6 + var8) / 2;
        int var9 = -var8 + var6;
        if (this.field1530 > arg2 && this.field1530 < 4096) {
            this.field1534 = (var9 << 12) / (this.field1530 <= 2048 ? this.field1530 * 2 : -(this.field1530 * 2) + 8192);
        } else {
            this.field1534 = 0;
        }
        if (var9 > 0) {
            int var10 = (-arg3 + var6 << 12) / var9;
            int var11 = (-arg1 + var6 << 12) / var9;
            int var12 = (-arg0 + var6 << 12) / var9;
            if (~arg3 != ~var6) {
                if (arg1 == var6) {
                    this.field1518 = ~arg0 != ~var8 ? -var12 + 12288 : var10 + 4096;
                } else {
                    this.field1518 = ~arg3 != ~var8 ? -var10 + 20480 : var11 + 12288;
                }
            } else {
                this.field1518 = arg1 != var8 ? -var11 + 4096 : var12 + 20480;
            }
            this.field1518 /= 6;
        } else {
            this.field1518 = 0;
        }
    }
}
