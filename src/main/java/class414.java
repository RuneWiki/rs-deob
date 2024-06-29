import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class414 extends class349 {

    @OriginalMember(owner = "client!ei", name = "D", descriptor = "I")
    private int field5804 = 4096;

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "[I")
    private int[] field5802 = new int[3];

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "I")
    private int field5807 = 3216;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    private int field5809 = 3216;

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILdga;)V")
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field5809 = arg2.method922((byte) -128);
                }
            } else {
                this.field5807 = arg2.method922((byte) -119);
            }
        } else {
            this.field5804 = arg2.method922((byte) -123);
        }
        if (arg0 != 4095) {
            this.method5(-92, -100, (class138) null);
        }
        ++field5805;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field5808;
        int[] var3 = super.field5109.method3088(arg1, (byte) 26);
        int var4 = 46 / ((56 - arg0) / 41);
        if (super.field5109.field7515) {
            int var5 = class604.field8267 * this.field5804 >> 12;
            int[] var6 = this.method2181(0, -1090477337, class4.field38 & arg1 + -1);
            int[] var7 = this.method2181(0, -1090477337, arg1);
            int[] var8 = this.method2181(0, -1090477337, arg1 + 1 & class4.field38);
            for (int var9 = 0; ~var9 > ~class39.field497; ++var9) {
                int var10 = (var8[var9] + -var6[var9]) * var5 >> 12;
                int var11 = (var7[class144.field1839 & var9 - 1] - var7[var9 + 1 & class144.field1839]) * var5 >> 12;
                int var12 = var11 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                int var13 = var10 >> 4;
                if (var12 > 255) {
                    var12 = 255;
                }
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~var13 < -256) {
                    var13 = 255;
                }
                int var14 = class689.field9728[((var13 + 1) * var13 >> 1) + var12] & 255;
                int var15 = var11 * var14 >> 8;
                int var16 = var14 * 4096 >> 8;
                int var17 = var10 * var14 >> 8;
                int var18 = this.field5802[2] * var16 >> 12;
                int var19 = this.field5802[0] * var15 >> 12;
                int var20 = this.field5802[1] * var17 >> 12;
                var3[var9] = var18 + var19 - -var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(B)V")
    private final void method2421(byte arg0) {
        ++field5806;
        double var2 = Math.cos((double) ((float) this.field5809 / 4096.0F));
        this.field5802[0] = (int) (Math.sin((double) ((float) this.field5807 / 4096.0F)) * var2 * 4096.0D);
        this.field5802[1] = (int) (var2 * Math.cos((double) ((float) this.field5807 / 4096.0F)) * 4096.0D);
        int var4 = 96 / ((14 - arg0) / 55);
        this.field5802[2] = (int) (Math.sin((double) ((float) this.field5809 / 4096.0F)) * 4096.0D);
        int var5 = this.field5802[0] * this.field5802[0] >> 12;
        int var6 = this.field5802[1] * this.field5802[1] >> 12;
        int var7 = this.field5802[2] * this.field5802[2] >> 12;
        int var8 = (int) (Math.sqrt((double) (var5 - -var6 + var7 >> 12)) * 4096.0D);
        if (~var8 != -1) {
            this.field5802[1] = (this.field5802[1] << 12) / var8;
            this.field5802[0] = (this.field5802[0] << 12) / var8;
            this.field5802[2] = (this.field5802[2] << 12) / var8;
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class414() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lcga;III)V")
    public static final void method2422(class255 arg0, int arg1, int arg2, int arg3) {
        long var4 = class369.field5304[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field3524 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 65535L);
            if (var8 <= 0) {
                break;
            }
            arg0.field3515[arg0.field3524++] = class660.field9370[var8 - 1].field1591;
            var6 += 16L;
        }
        for (int var9 = arg0.field3524; var9 < 4; ++var9) {
            arg0.field3515[var9] = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)V")
    public final void method11(byte arg0) {
        ++field5803;
        if (arg0 >= -51) {
            this.field5804 = 98;
        }
        this.method2421((byte) -119);
    }
}
