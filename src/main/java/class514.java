import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class514 extends class148 {

    @OriginalMember(owner = "client!fm", name = "Q", descriptor = "I")
    private int field7511 = 3216;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
    private int field7504 = 4096;

    @OriginalMember(owner = "client!fm", name = "S", descriptor = "[I")
    private int[] field7513 = new int[3];

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
    private int field7506 = 3216;

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!fm", name = "N", descriptor = "I")
    public static int field7508;

    @OriginalMember(owner = "client!fm", name = "O", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!fm", name = "T", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!fm", name = "R", descriptor = "Lsv;")
    public static class468 field7512;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field7508;
        int[] var3 = super.field2193.method497(arg1, false);
        if (super.field2193.field1312) {
            int var4 = class392.field5915 * this.field7504 >> 12;
            int[] var5 = this.method971(false, arg1 - 1 & class39.field569, 0);
            int[] var6 = this.method971(false, arg1, 0);
            int[] var7 = this.method971(false, class39.field569 & arg1 + 1, 0);
            for (int var8 = 0; class320.field4579 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class304.field4339 & var8 + -1] + -var6[class304.field4339 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class196.field2862[((var12 - -1) * var12 >> 1) + var11];
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field7513[0] * var14 >> 12;
                int var18 = this.field7513[1] * var16 >> 12;
                int var19 = this.field7513[2] * var15 >> 12;
                var3[var8] = var17 + var19 + var18;
            }
        }
        if (arg0 > -65) {
            this.method3032(110);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "(I)V")
    private final void method3032(int arg0) {
        ++field7510;
        double var2 = Math.cos((double) ((float) this.field7506 / 4096.0F));
        this.field7513[0] = (int) (Math.sin((double) ((float) this.field7511 / 4096.0F)) * var2 * 4096.0D);
        this.field7513[1] = (int) (4096.0D * Math.cos((double) ((float) this.field7511 / 4096.0F)) * var2);
        this.field7513[2] = (int) (Math.sin((double) ((float) this.field7506 / 4096.0F)) * 4096.0D);
        int var4 = this.field7513[0] * this.field7513[0] >> 12;
        int var5 = this.field7513[1] * this.field7513[1] >> 12;
        int var6 = this.field7513[arg0] * this.field7513[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var5 + var6 + var4 >> 12)));
        if (var7 != 0) {
            this.field7513[0] = (this.field7513[0] << 12) / var7;
            this.field7513[2] = (this.field7513[2] << 12) / var7;
            this.field7513[1] = (this.field7513[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
    public class514() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
    public final void method175(int arg0) {
        ++field7505;
        if (arg0 != -1285532468) {
            this.field7511 = 74;
        }
        this.method3032(2);
    }

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "(I)V")
    public static void method3033(int arg0) {
        field7512 = null;
        if (arg0 != -1086042900) {
            field7512 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIII)V")
    public static final void method3034(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1009) {
            if (~arg2 == -1011) {
                class360.method2244(class367.field5603, arg0, arg3);
            } else if (arg2 != 1003) {
                if (arg2 != 1001) {
                    if (arg2 == 1002) {
                        class360.method2244(class337.field4742, arg0, arg3);
                    }
                } else {
                    class360.method2244(class51.field806, arg0, arg3);
                }
            } else {
                class360.method2244(class290.field4171, arg0, arg3);
            }
        } else {
            class360.method2244(class275.field3978, arg0, arg3);
        }
        if (arg1 != 0) {
            field7512 = null;
        }
        ++field7507;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field7506 = arg1.method1450((byte) 32);
                }
            } else {
                this.field7511 = arg1.method1450((byte) 89);
            }
        } else {
            this.field7504 = arg1.method1450((byte) 125);
        }
        ++field7509;
        int var5 = -20 % ((-88 - arg2) / 33);
    }
}
