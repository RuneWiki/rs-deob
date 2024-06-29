import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class383 extends class297 {

    @OriginalMember(owner = "client!dda", name = "O", descriptor = "I")
    private int field5558 = 3216;

    @OriginalMember(owner = "client!dda", name = "Q", descriptor = "I")
    private int field5560 = 3216;

    @OriginalMember(owner = "client!dda", name = "R", descriptor = "I")
    private int field5561 = 4096;

    @OriginalMember(owner = "client!dda", name = "S", descriptor = "[I")
    private int[] field5562 = new int[3];

    @OriginalMember(owner = "client!dda", name = "I", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!dda", name = "K", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!dda", name = "L", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!dda", name = "N", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!dda", name = "P", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!dda", name = "M", descriptor = "Lpc;")
    public static class670 field5556;

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "(I)V", line = 9)
    private final void method2414(int arg0) {
        ++field5553;
        if (arg0 >= -118) {
            this.method2414(-88);
        }
        double var2 = Math.cos((double) ((float) this.field5558 / 4096.0F));
        this.field5562[0] = (int) (var2 * Math.sin((double) ((float) this.field5560 / 4096.0F)) * 4096.0D);
        this.field5562[1] = (int) (var2 * Math.cos((double) ((float) this.field5560 / 4096.0F)) * 4096.0D);
        this.field5562[2] = (int) (Math.sin((double) ((float) this.field5558 / 4096.0F)) * 4096.0D);
        int var4 = this.field5562[0] * this.field5562[0] >> 12;
        int var5 = this.field5562[1] * this.field5562[1] >> 12;
        int var6 = this.field5562[2] * this.field5562[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
        if (var7 != 0) {
            this.field5562[1] = (this.field5562[1] << 12) / var7;
            this.field5562[0] = (this.field5562[0] << 12) / var7;
            this.field5562[2] = (this.field5562[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "()V", line = 198)
    public class383() {
        super(1, true);
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(II)[I", line = 46)
    public final int[] method15(int arg0, int arg1) {
        ++field5559;
        int[] var3 = super.field4165.method127(0, arg0);
        if (super.field4165.field266) {
            int var4 = class295.field4136 * this.field5561 >> 12;
            int[] var5 = this.method1951(class319.field4394 & arg0 + -1, 633706337, 0);
            int[] var6 = this.method1951(arg0, 633706337, 0);
            int[] var7 = this.method1951(class319.field4394 & arg0 - -1, arg1 + 633706082, 0);
            for (int var8 = 0; class525.field7275 > var8; ++var8) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class677.field9204] + -var6[class677.field9204 & var8 - -1]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class378.field5497[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var13 * 4096 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field5562[1] * var16 >> 12;
                int var18 = this.field5562[0] * var15 >> 12;
                int var19 = this.field5562[2] * var14 >> 12;
                var3[var8] = var18 + var19 - -var17;
            }
        }
        return arg1 != 255 ? null : var3;
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(B)V", line = 126)
    public static void method2415(byte arg0) {
        field5556 = null;
        if (arg0 < 34) {
            method2415((byte) 127);
        }
    }

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "(I)V", line = 136)
    public final void method711(int arg0) {
        if (arg0 <= 108) {
            this.method2414(38);
        }
        ++field5554;
        this.method2414(-119);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lcea;II)V", line = 151)
    public final void method17(class215 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field5558 = arg0.method1478(842397944);
                }
            } else {
                this.field5560 = arg0.method1478(842397944);
            }
        } else {
            this.field5561 = arg0.method1478(arg2 ^ 842367455);
        }
        ++field5555;
        if (arg2 != 31015) {
            field5556 = null;
        }
    }
}
