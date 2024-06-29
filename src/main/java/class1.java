import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class1 extends class328 {

    @OriginalMember(owner = "client!oba", name = "C", descriptor = "I")
    private int field2 = 4096;

    @OriginalMember(owner = "client!oba", name = "E", descriptor = "[I")
    private int[] field4 = new int[3];

    @OriginalMember(owner = "client!oba", name = "F", descriptor = "I")
    private int field5 = 3216;

    @OriginalMember(owner = "client!oba", name = "G", descriptor = "I")
    private int field6 = 3216;

    @OriginalMember(owner = "client!oba", name = "D", descriptor = "Liu;")
    public static class517 field3 = new class517(12, 1);

    @OriginalMember(owner = "client!oba", name = "J", descriptor = "Lpp;")
    public static class464 field9 = new class464(37, 7);

    @OriginalMember(owner = "client!oba", name = "B", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!oba", name = "K", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!oba", name = "H", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!oba", name = "I", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(BILco;)V", line = 3)
    public final void method1(byte arg0, int arg1, class268 arg2) {
        ++field7;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field5 = arg2.method1745(32132);
                }
            } else {
                this.field6 = arg2.method1745(32132);
            }
        } else {
            this.field2 = arg2.method1745(32132);
        }
        if (arg0 <= 75) {
            this.field2 = -104;
        }
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "()V", line = 96)
    public class1() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)V", line = 53)
    public final void method2(int arg0) {
        ++field1;
        if (arg0 <= -97) {
            this.method3(1);
        }
    }

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "(I)V", line = 69)
    private final void method3(int arg0) {
        ++field8;
        double var2 = Math.cos((double) ((float) this.field5 / 4096.0F));
        this.field4[0] = (int) (Math.sin((double) ((float) this.field6 / 4096.0F)) * var2 * 4096.0D);
        this.field4[arg0] = (int) (Math.cos((double) ((float) this.field6 / 4096.0F)) * var2 * 4096.0D);
        this.field4[2] = (int) (4096.0D * Math.sin((double) ((float) this.field5 / 4096.0F)));
        int var4 = this.field4[0] * this.field4[0] >> 12;
        int var5 = this.field4[1] * this.field4[1] >> 12;
        int var6 = this.field4[2] * this.field4[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 - -var5 + var6 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field4[1] = (this.field4[1] << 12) / var7;
            this.field4[0] = (this.field4[0] << 12) / var7;
            this.field4[2] = (this.field4[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(II)[I", line = 110)
    public final int[] method4(int arg0, int arg1) {
        ++field10;
        int[] var3 = super.field4720.method2872(1, arg0);
        if (super.field4720.field7109) {
            int var4 = class524.field7284 * this.field2 >> 12;
            int[] var5 = this.method2042(0, arg0 - 1 & class589.field8379, (byte) 119);
            int[] var6 = this.method2042(0, arg0, (byte) 119);
            int[] var7 = this.method2042(0, class589.field8379 & arg0 + 1, (byte) 119);
            for (int var8 = 0; ~class449.field6539 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class108.field1799] + -var6[var8 + 1 & class108.field1799]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = 255 & class144.field2224[var11 - -((var12 - -1) * var12 >> 1)];
                int var14 = var10 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field4[1] * var15 >> 12;
                int var18 = this.field4[2] * var16 >> 12;
                int var19 = this.field4[0] * var14 >> 12;
                var3[var8] = var17 + var18 + var19;
            }
        }
        int var20 = -4 / ((48 - arg1) / 56);
        return var3;
    }

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "(B)V", line = 184)
    public static void method5(byte arg0) {
        if (arg0 > -21) {
            field3 = null;
        }
        field3 = null;
        field9 = null;
    }
}
