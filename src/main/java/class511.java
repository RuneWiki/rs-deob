import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class511 extends class354 {

    @OriginalMember(owner = "client!lu", name = "L", descriptor = "I")
    private int field7495 = 12288;

    @OriginalMember(owner = "client!lu", name = "N", descriptor = "I")
    private int field7497 = 0;

    @OriginalMember(owner = "client!lu", name = "W", descriptor = "I")
    private int field7506 = 2048;

    @OriginalMember(owner = "client!lu", name = "S", descriptor = "I")
    private int field7502 = 0;

    @OriginalMember(owner = "client!lu", name = "P", descriptor = "I")
    private int field7499 = 4096;

    @OriginalMember(owner = "client!lu", name = "X", descriptor = "I")
    private int field7507 = 2048;

    @OriginalMember(owner = "client!lu", name = "bb", descriptor = "I")
    private int field7511 = 8192;

    @OriginalMember(owner = "client!lu", name = "O", descriptor = "Lco;")
    public static class77 field7498 = new class77("WTQA", 2);

    @OriginalMember(owner = "client!lu", name = "Q", descriptor = "Lip;")
    public static class508 field7500 = new class508("", 16);

    @OriginalMember(owner = "client!lu", name = "Z", descriptor = "I")
    public static int field7509 = -50;

    @OriginalMember(owner = "client!lu", name = "ab", descriptor = "[Ljava/lang/String;")
    public static String[] field7510 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!lu", name = "cb", descriptor = "Lla;")
    public static class319 field7512 = new class319(91, -2);

    @OriginalMember(owner = "client!lu", name = "db", descriptor = "Lfg;")
    public static class84 field7513 = new class84(8, 0, 4, 1);

    @OriginalMember(owner = "client!lu", name = "K", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!lu", name = "M", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!lu", name = "R", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!lu", name = "T", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!lu", name = "U", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!lu", name = "V", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!lu", name = "Y", descriptor = "I")
    public static int field7508;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(III)Z")
    private final boolean method3054(int arg0, int arg1, int arg2) {
        ++field7503;
        if (arg2 > -101) {
            this.field7499 = 44;
        }
        int var4 = (arg1 - arg0) * this.field7495 >> 12;
        int var5 = class165.field2241[(1044588 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field7495;
        int var7 = (var6 << 12) / this.field7511;
        int var8 = this.field7499 * var7 >> 12;
        return arg0 - -arg1 < var8 && ~(arg0 + arg1) < ~(-var8);
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(BI)[I")
    public final int[] method270(byte arg0, int arg1) {
        ++field7494;
        if (arg0 > -74) {
            this.method270((byte) 0, 41);
        }
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (super.field5478.field6213) {
            int var4 = class350.field5392[arg1] + -2048;
            for (int var5 = 0; ~class531.field7814 < ~var5; ++var5) {
                int var6 = class195.field2616[var5] - 2048;
                int var7 = this.field7507 + var6;
                int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = var4 - -this.field7497;
                int var11 = ~var10 > 2047 ? var10 - -4096 : var10;
                int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var13 = this.field7502 + var6;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = ~var14 >= -2049 ? var14 : var14 + -4096;
                int var16 = this.field7506 + var4;
                int var17 = var16 < -2048 ? var16 + 4096 : var16;
                int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                var3[var5] = !this.method3054(var9, var12, -124) && !this.method3055(1045923, var15, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "()V")
    public class511() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(III)Z")
    private final boolean method3055(int arg0, int arg1, int arg2) {
        ++field7505;
        int var4 = (arg1 + arg2) * this.field7495 >> 12;
        int var5 = class165.field2241[(var4 * 255 & arg0) >> 12];
        int var6 = (var5 << 12) / this.field7495;
        int var7 = (var6 << 12) / this.field7511;
        int var8 = this.field7499 * var7 >> 12;
        return ~var8 < ~(arg2 - arg1) && ~(-var8) > ~(-arg1 + arg2);
    }

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "(I)V")
    public final void method357(int arg0) {
        ++field7504;
        class410.method2530(1);
        if (arg0 <= 28) {
            this.method3054(-22, -6, 122);
        }
    }

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "(I)V")
    public static void method3056(int arg0) {
        field7513 = null;
        field7512 = null;
        field7498 = null;
        int var1 = -16 / ((arg0 - -49) / 43);
        field7510 = null;
        field7500 = null;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lnj;II)V")
    public final void method272(class164 arg0, int arg1, int arg2) {
        ++field7496;
        if (arg2 == 1638) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (~arg1 != -3) {
                        if (~arg1 != -4) {
                            if (arg1 != 4) {
                                if (arg1 != 5) {
                                    if (~arg1 == -7) {
                                        this.field7511 = arg0.method1074(arg2 + -635990790);
                                    }
                                } else {
                                    this.field7499 = arg0.method1074(-635989152);
                                }
                            } else {
                                this.field7495 = arg0.method1074(-635989152);
                            }
                        } else {
                            this.field7506 = arg0.method1074(arg2 ^ -635988730);
                        }
                    } else {
                        this.field7502 = arg0.method1074(-635989152);
                    }
                } else {
                    this.field7497 = arg0.method1074(-635989152);
                }
            } else {
                this.field7507 = arg0.method1074(arg2 ^ -635988730);
            }
        }
    }
}
