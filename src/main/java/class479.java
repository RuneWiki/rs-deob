import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class479 extends class354 {

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "[I")
    private int[] field7023 = new int[3];

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "I")
    private int field7020 = 3216;

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "I")
    private int field7024 = 4096;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    private int field7029 = 3216;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "[I")
    public static int[] field7028 = new int[256];

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "S")
    public static short field7030 = 32767;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "Lao;")
    public static class188 field7025 = new class188(38, 7);

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "I")
    public static int field7026;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)V", line = 4)
    private final void method2862(int arg0) {
        ++field7021;
        double var2 = Math.cos((double) ((float) this.field7020 / 4096.0F));
        this.field7023[0] = (int) (var2 * Math.sin((double) ((float) this.field7029 / 4096.0F)) * 4096.0D);
        this.field7023[1] = (int) (4096.0D * Math.cos((double) ((float) this.field7029 / 4096.0F)) * var2);
        this.field7023[2] = (int) (Math.sin((double) ((float) this.field7020 / 4096.0F)) * 4096.0D);
        int var4 = this.field7023[0] * this.field7023[0] >> 12;
        int var5 = 111 % ((-65 - arg0) / 61);
        int var6 = this.field7023[1] * this.field7023[1] >> 12;
        int var7 = this.field7023[2] * this.field7023[2] >> 12;
        int var8 = (int) (Math.sqrt((double) (var4 + var6 + var7 >> 12)) * 4096.0D);
        if (var8 != 0) {
            this.field7023[1] = (this.field7023[1] << 12) / var8;
            this.field7023[2] = (this.field7023[2] << 12) / var8;
            this.field7023[0] = (this.field7023[0] << 12) / var8;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)[I", line = 35)
    public final int[] method253(int arg0, byte arg1) {
        ++field7022;
        int[] var3 = super.field5357.method861(true, arg0);
        if (arg1 != -95) {
            field7030 = -85;
        }
        if (super.field5357.field1869) {
            int var4 = class430.field6258 * this.field7024 >> 12;
            int[] var5 = this.method2293(0, class30.field492 & arg0 + -1, (byte) 69);
            int[] var6 = this.method2293(0, arg0, (byte) 69);
            int[] var7 = this.method2293(0, class30.field492 & arg0 - -1, (byte) 69);
            for (int var8 = 0; class404.field5952 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class168.field2527] + -var6[var8 + 1 & class168.field2527]) * var4 >> 12;
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
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = 255 & class6.field90[var11 - -((var12 + 1) * var12 >> 1)];
                int var14 = var13 * 4096 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var10 * var13 >> 8;
                int var17 = this.field7023[2] * var14 >> 12;
                int var18 = this.field7023[1] * var15 >> 12;
                int var19 = this.field7023[0] * var16 >> 12;
                var3[var8] = var17 + var19 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V", line = 107)
    public class479() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(B)V", line = 112)
    public static void method2863(byte arg0) {
        field7028 = null;
        if (arg0 != -50) {
            method2863((byte) 18);
        }
        field7025 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V", line = 130)
    public final void method771(boolean arg0) {
        ++field7031;
        if (!arg0) {
            this.method2862(-126);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)I", line = 152)
    public static final int method2864(int arg0, int arg1) {
        if (arg0 >= -35) {
            method2863((byte) 34);
        }
        ++field7026;
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILti;I)V", line = 164)
    public final void method206(int arg0, class303 arg1, int arg2) {
        ++field7027;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field7020 = arg1.method1868(0);
                }
            } else {
                this.field7029 = arg1.method1868(0);
            }
        } else {
            this.field7024 = arg1.method1868(0);
        }
        if (arg0 != 15180) {
            field7030 = 115;
        }
    }
}
