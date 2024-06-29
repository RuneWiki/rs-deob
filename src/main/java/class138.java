import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class138 extends class615 {

    @OriginalMember(owner = "client!ho", name = "M", descriptor = "I")
    private int field2234 = 3216;

    @OriginalMember(owner = "client!ho", name = "Q", descriptor = "I")
    private int field2238 = 3216;

    @OriginalMember(owner = "client!ho", name = "L", descriptor = "I")
    private int field2233 = 4096;

    @OriginalMember(owner = "client!ho", name = "N", descriptor = "[I")
    private int[] field2235 = new int[3];

    @OriginalMember(owner = "client!ho", name = "J", descriptor = "I")
    public static int field2231 = -1;

    @OriginalMember(owner = "client!ho", name = "H", descriptor = "[I")
    public static int[] field2229 = new int[6];

    @OriginalMember(owner = "client!ho", name = "R", descriptor = "I")
    public static int field2239 = -1;

    @OriginalMember(owner = "client!ho", name = "P", descriptor = "Ldb;")
    public static class298 field2237 = new class298(107, 6);

    @OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!ho", name = "I", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!ho", name = "K", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!ho", name = "O", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!ho", name = "S", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!ho", name = "T", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!ho", name = "U", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!ho", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field2228;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BZ)Z", line = 4)
    public static final boolean method1017(byte arg0, boolean arg1) {
        ++field2232;
        int var2 = 59 % ((arg0 - -65) / 47);
        boolean var3 = class10.field197.method96();
        if (!arg1 != var3) {
            return true;
        } else {
            if (arg1) {
                if (!class10.field197.method93()) {
                    arg1 = false;
                }
            } else {
                class10.field197.method30();
            }
            if (arg1 != var3) {
                class344.field4718.field5416 = arg1;
                class344.field4718.method1562(-17, class688.field9669);
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BILeh;)V", line = 41)
    public final void method15(byte arg0, int arg1, class335 arg2) {
        ++field2240;
        if (arg0 <= 44) {
            this.method1019(-94);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field2234 = arg2.method2001((byte) -83);
                }
            } else {
                this.field2238 = arg2.method2001((byte) -83);
            }
        } else {
            this.field2233 = arg2.method2001((byte) -83);
        }
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V", line = 85)
    public final void method10(int arg0) {
        if (arg0 != 12404) {
            this.field2233 = -107;
        }
        ++field2241;
        this.method1019(5545);
    }

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "(I)V", line = 101)
    public static void method1018(int arg0) {
        if (arg0 != -6701) {
            field2229 = null;
        }
        field2237 = null;
        field2228 = null;
        field2229 = null;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V", line = 113)
    public class138() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "(I)V", line = 121)
    private final void method1019(int arg0) {
        ++field2230;
        double var2 = Math.cos((double) ((float) this.field2234 / 4096.0F));
        this.field2235[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field2238 / 4096.0F)));
        this.field2235[1] = (int) (var2 * Math.cos((double) ((float) this.field2238 / 4096.0F)) * 4096.0D);
        this.field2235[2] = (int) (Math.sin((double) ((float) this.field2234 / 4096.0F)) * 4096.0D);
        int var4 = this.field2235[0] * this.field2235[0] >> 12;
        if (arg0 == 5545) {
            int var5 = this.field2235[1] * this.field2235[1] >> 12;
            int var6 = this.field2235[2] * this.field2235[2] >> 12;
            int var7 = (int) (Math.sqrt((double) (var4 + var6 + var5 >> 12)) * 4096.0D);
            if (var7 != 0) {
                this.field2235[2] = (this.field2235[2] << 12) / var7;
                this.field2235[0] = (this.field2235[0] << 12) / var7;
                this.field2235[1] = (this.field2235[1] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IB)[I", line = 152)
    public final int[] method8(int arg0, byte arg1) {
        ++field2242;
        int[] var3 = super.field8125.method298(arg0, -116);
        if (arg1 != -18) {
            this.field2238 = -70;
        }
        if (super.field8125.field579) {
            int var4 = class454.field6187 * this.field2233 >> 12;
            int[] var5 = this.method3366(0, arg1 ^ -1013, arg0 + -1 & class658.field9107);
            int[] var6 = this.method3366(0, arg1 + 1015, arg0);
            int[] var7 = this.method3366(0, 997, class658.field9107 & arg0 + 1);
            for (int var8 = 0; ~var8 > ~class505.field6740; ++var8) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[class313.field4306 & var8 + -1] - var6[var8 + 1 & class313.field4306]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class87.field1305[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var9 * var13 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field2235[0] * var15 >> 12;
                int var18 = this.field2235[1] * var14 >> 12;
                int var19 = this.field2235[2] * var16 >> 12;
                var3[var8] = var17 + var19 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IC)I", line = 231)
    public static final int method1020(int arg0, char arg1) {
        ++field2236;
        if (arg0 != -21218) {
            field2231 = 39;
        }
        return arg1 >= 0 && class470.field6286.length > arg1 ? class470.field6286[arg1] : -1;
    }
}
