import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class202 extends class56 {

    @OriginalMember(owner = "client!vp", name = "I", descriptor = "I")
    private int field2423 = 3216;

    @OriginalMember(owner = "client!vp", name = "F", descriptor = "[I")
    private int[] field2420 = new int[3];

    @OriginalMember(owner = "client!vp", name = "L", descriptor = "I")
    private int field2426 = 3216;

    @OriginalMember(owner = "client!vp", name = "J", descriptor = "I")
    private int field2424 = 4096;

    @OriginalMember(owner = "client!vp", name = "M", descriptor = "I")
    public static int field2427 = -1;

    @OriginalMember(owner = "client!vp", name = "D", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!vp", name = "E", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!vp", name = "G", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!vp", name = "H", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!vp", name = "K", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V")
    public class202() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)[I")
    public final int[] method145(int arg0, int arg1) {
        ++field2425;
        int[] var3 = super.field752.method1308(false, arg1);
        if (arg0 != 0) {
            this.method493((byte) 108);
        }
        if (super.field752.field2441) {
            int var4 = class790.field10871 * this.field2424 >> 12;
            int[] var5 = this.method492(0, class75.field1037 & arg1 + -1, (byte) 95);
            int[] var6 = this.method492(0, arg1, (byte) 64);
            int[] var7 = this.method492(0, class75.field1037 & arg1 + 1, (byte) 103);
            for (int var8 = 0; ~class642.field8759 < ~var8; ++var8) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class446.field5990] + -var6[var8 + 1 & class446.field5990]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class410.field5371[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var9 * var13 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field2420[1] * var14 >> 12;
                int var18 = this.field2420[0] * var15 >> 12;
                int var19 = this.field2420[2] * var16 >> 12;
                var3[var8] = var17 + var19 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(Z)V")
    private final void method1302(boolean arg0) {
        ++field2422;
        double var2 = Math.cos((double) ((float) this.field2426 / 4096.0F));
        this.field2420[0] = (int) (4096.0D * Math.sin((double) ((float) this.field2423 / 4096.0F)) * var2);
        this.field2420[1] = (int) (4096.0D * Math.cos((double) ((float) this.field2423 / 4096.0F)) * var2);
        this.field2420[2] = (int) (Math.sin((double) ((float) this.field2426 / 4096.0F)) * 4096.0D);
        int var4 = this.field2420[0] * this.field2420[0] >> 12;
        if (!arg0) {
            int var5 = this.field2420[1] * this.field2420[1] >> 12;
            int var6 = this.field2420[2] * this.field2420[2] >> 12;
            int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
            if (~var7 != -1) {
                this.field2420[2] = (this.field2420[2] << 12) / var7;
                this.field2420[1] = (this.field2420[1] << 12) / var7;
                this.field2420[0] = (this.field2420[0] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BILes;)V")
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field2426 = arg2.method2390((byte) 45);
                }
            } else {
                this.field2423 = arg2.method2390((byte) -104);
            }
        } else {
            this.field2424 = arg2.method2390((byte) -104);
        }
        if (arg0 < -44) {
            ++field2419;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLes;)Lin;")
    public static final class99 method1303(byte arg0, class403 arg1) {
        ++field2418;
        class553 var2 = class198.method1292(arg1, (byte) 103);
        if (arg0 != -83) {
            return null;
        } else {
            int var3 = arg1.method2390((byte) -110);
            int var4 = arg1.method2390((byte) 70);
            int var5 = arg1.method2390((byte) -100);
            int var6 = arg1.method2390((byte) -123);
            int var7 = arg1.method2390((byte) 64);
            int var8 = arg1.method2390((byte) -120);
            return new class99(var2.field7693, var2.field7699, var2.field7690, var2.field7700, var2.field7694, var2.field7703, var2.field7696, var2.field7688, var2.field7691, var3, var4, var5, var6, var7, var8);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
    public final void method493(byte arg0) {
        this.method1302(false);
        ++field2421;
        int var2 = -23 % ((37 - arg0) / 62);
    }
}
