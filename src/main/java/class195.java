import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class195 extends class335 {

    @OriginalMember(owner = "client!ut", name = "B", descriptor = "I")
    private int field2669 = 3216;

    @OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
    private int field2670 = 3216;

    @OriginalMember(owner = "client!ut", name = "F", descriptor = "[I")
    private int[] field2673 = new int[3];

    @OriginalMember(owner = "client!ut", name = "K", descriptor = "I")
    private int field2678 = 4096;

    @OriginalMember(owner = "client!ut", name = "N", descriptor = "[I")
    public static int[] field2680 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!ut", name = "D", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!ut", name = "E", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!ut", name = "G", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!ut", name = "H", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!ut", name = "I", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!ut", name = "J", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!ut", name = "M", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZI)[I", line = 4)
    public final int[] method3(boolean arg0, int arg1) {
        if (!arg0) {
            field2680 = null;
        }
        ++field2672;
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (super.field4525.field5435) {
            int var4 = class703.field9887 * this.field2678 >> 12;
            int[] var5 = this.method1969(0, arg1 + -1 & class326.field4386, -43);
            int[] var6 = this.method1969(0, arg1, -43);
            int[] var7 = this.method1969(0, arg1 - -1 & class326.field4386, -44);
            for (int var8 = 0; ~class649.field8968 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class29.field413 & var8 + -1] + -var6[var8 + 1 & class29.field413]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class704.field9940[var11 - -((var12 + 1) * var12 >> 1)];
                int var14 = var9 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var10 * var13 >> 8;
                int var17 = this.field2673[2] * var15 >> 12;
                int var18 = this.field2673[0] * var16 >> 12;
                int var19 = this.field2673[1] * var14 >> 12;
                var3[var8] = var17 + var18 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V", line = 210)
    public class195() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "(I)V", line = 80)
    public static void method1272(int arg0) {
        if (arg0 != -1729473140) {
            method1272(49);
        }
        field2680 = null;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIII)V", line = 93)
    public static final void method1273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == 0) {
            if (class281.field3703 <= arg2 && class255.field3350 >= arg6 && ~arg4 <= ~class6.field66 && class151.field2071 >= arg1) {
                if (~arg5 != -2) {
                    class562.method3117(arg4, arg2, arg6, arg1, arg3, (byte) 97, arg5);
                } else {
                    class172.method1168(arg3, 393216, arg1, arg2, arg6, arg4);
                }
            } else if (~arg5 == -2) {
                class637.method3526(arg4, 99, arg1, arg6, arg3, arg2);
            } else {
                class116.method684(arg4, arg1, arg6, arg5, (byte) 61, arg3, arg2);
            }
            ++field2677;
        }
    }

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "(I)V", line = 124)
    private final void method1274(int arg0) {
        ++field2674;
        double var2 = Math.cos((double) ((float) this.field2669 / 4096.0F));
        this.field2673[0] = (int) (Math.sin((double) ((float) this.field2670 / 4096.0F)) * var2 * 4096.0D);
        this.field2673[1] = (int) (Math.cos((double) ((float) this.field2670 / 4096.0F)) * var2 * 4096.0D);
        this.field2673[2] = (int) (4096.0D * Math.sin((double) ((float) this.field2669 / 4096.0F)));
        if (arg0 != -12083) {
            this.field2669 = -118;
        }
        int var4 = this.field2673[0] * this.field2673[0] >> 12;
        int var5 = this.field2673[1] * this.field2673[1] >> 12;
        int var6 = this.field2673[2] * this.field2673[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var6 + var5 >> 12)));
        if (var7 != 0) {
            this.field2673[1] = (this.field2673[1] << 12) / var7;
            this.field2673[2] = (this.field2673[2] << 12) / var7;
            this.field2673[0] = (this.field2673[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILio;I)V", line = 166)
    public final void method2(int arg0, class157 arg1, int arg2) {
        ++field2671;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field2669 = arg1.method963(-124);
                }
            } else {
                this.field2670 = arg1.method963(arg2 ^ 59);
            }
        } else {
            this.field2678 = arg1.method963(-128);
        }
        if (arg2 != -66) {
            this.method1274(71);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V", line = 214)
    public final void method317(byte arg0) {
        this.method1274(-12083);
        ++field2679;
        int var2 = -72 % ((58 - arg0) / 60);
    }
}
