import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class184 extends class377 {

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    private int field2163 = 3216;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    private int field2158 = 4096;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "[I")
    private int[] field2165 = new int[3];

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    private int field2157 = 3216;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "[I")
    public static int[] field2164 = new int[8];

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "[Lfs;")
    public static class521[] field2162 = new class521[128];

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)V", line = 4)
    private final void method1092(int arg0) {
        ++field2160;
        double var2 = Math.cos((double) ((float) this.field2157 / 4096.0F));
        this.field2165[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field2163 / 4096.0F)));
        this.field2165[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field2163 / 4096.0F)));
        this.field2165[2] = (int) (4096.0D * Math.sin((double) ((float) this.field2157 / 4096.0F)));
        int var4 = this.field2165[0] * this.field2165[0] >> 12;
        int var5 = this.field2165[1] * this.field2165[1] >> 12;
        if (arg0 != -2947) {
            this.method88(-11, 106);
        }
        int var6 = this.field2165[2] * this.field2165[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 - -var5 + var6 >> 12)));
        if (var7 != 0) {
            this.field2165[1] = (this.field2165[1] << 12) / var7;
            this.field2165[0] = (this.field2165[0] << 12) / var7;
            this.field2165[2] = (this.field2165[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[I", line = 37)
    public final int[] method88(int arg0, int arg1) {
        ++field2161;
        int[] var3 = super.field4842.method2772(arg0, (byte) -124);
        int var4 = -72 / ((arg1 - 5) / 53);
        if (super.field4842.field6354) {
            int var5 = class437.field5500 * this.field2158 >> 12;
            int[] var6 = this.method2174(0, arg0 + -1 & class251.field3236, (byte) 46);
            int[] var7 = this.method2174(0, arg0, (byte) 20);
            int[] var8 = this.method2174(0, arg0 - -1 & class251.field3236, (byte) 61);
            for (int var9 = 0; ~var9 > ~class528.field6661; ++var9) {
                int var10 = (var8[var9] + -var6[var9]) * var5 >> 12;
                int var11 = (var7[class376.field4836 & var9 + -1] + -var7[class376.field4836 & var9 + 1]) * var5 >> 12;
                int var12 = var11 >> 4;
                int var13 = var10 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (var13 > 255) {
                    var13 = 255;
                }
                int var14 = class422.field5359[var12 - -((var13 + 1) * var13 >> 1)] & 255;
                int var15 = var14 * 4096 >> 8;
                int var16 = var11 * var14 >> 8;
                int var17 = var10 * var14 >> 8;
                int var18 = this.field2165[2] * var15 >> 12;
                int var19 = this.field2165[1] * var17 >> 12;
                int var20 = this.field2165[0] * var16 >> 12;
                var3[var9] = var18 + var19 + var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILji;)V", line = 109)
    public final void method27(int arg0, int arg1, class572 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field2157 = arg2.method3031(-1);
                }
            } else {
                this.field2163 = arg2.method3031(-1);
            }
        } else {
            this.field2158 = arg2.method3031(-1);
        }
        ++field2159;
        int var5 = 91 / ((13 - arg1) / 55);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V", line = 157)
    public final void method91(byte arg0) {
        if (arg0 >= 52) {
            this.method1092(-2947);
            ++field2166;
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V", line = 179)
    public class184() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)V", line = 192)
    public static void method1093(int arg0) {
        if (arg0 == 2) {
            field2162 = null;
            field2164 = null;
        }
    }
}
