import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class23 extends class184 {

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    private int field330 = 3216;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    private int field332 = 4096;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "[I")
    private int[] field340 = new int[3];

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    private int field339 = 3216;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "Z")
    public static boolean field333 = false;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "[S")
    public static short[] field337 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "[I")
    public static int[] field342 = new int[13];

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "Lkg;")
    public static class179 field334 = new class179(77, 7);

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "Lrd;")
    public static class223 field336;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "[[I")
    public static int[][] field341;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V")
    public static void method196(int arg0) {
        field336 = null;
        field342 = null;
        field337 = null;
        field334 = null;
        if (arg0 == 0) {
            field341 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        ++field335;
        int[] var3 = super.field2409.method248(arg0, arg1 ^ 16776514);
        if (super.field2409.field436) {
            int var4 = class397.field5686 * this.field332 >> 12;
            int[] var5 = this.method1159(36, arg0 + -1 & class501.field7240, 0);
            int[] var6 = this.method1159(arg1 ^ 569, arg0, 0);
            int[] var7 = this.method1159(51, class501.field7240 & arg0 + 1, 0);
            for (int var8 = 0; ~var8 > ~class245.field3167; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class421.field5961 & var8 + -1] - var6[class421.field5961 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = 255 & class56.field723[((var12 - -1) * var12 >> 1) + var11];
                int var14 = var13 * 4096 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field340[2] * var14 >> 12;
                int var18 = this.field340[0] * var15 >> 12;
                int var19 = this.field340[1] * var16 >> 12;
                var3[var8] = var17 + var18 + var19;
            }
        }
        if (arg1 != 578) {
            this.field330 = -67;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V")
    private final void method197(int arg0) {
        ++field338;
        double var2 = Math.cos((double) ((float) this.field339 / 4096.0F));
        this.field340[0] = (int) (4096.0D * Math.sin((double) ((float) this.field330 / 4096.0F)) * var2);
        this.field340[1] = (int) (4096.0D * Math.cos((double) ((float) this.field330 / 4096.0F)) * var2);
        this.field340[2] = (int) (4096.0D * Math.sin((double) ((float) this.field339 / 4096.0F)));
        int var4 = this.field340[0] * this.field340[0] >> 12;
        int var5 = this.field340[1] * this.field340[1] >> 12;
        if (arg0 == -11907) {
            int var6 = this.field340[2] * this.field340[2] >> 12;
            int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
            if (~var7 != -1) {
                this.field340[0] = (this.field340[0] << 12) / var7;
                this.field340[2] = (this.field340[2] << 12) / var7;
                this.field340[1] = (this.field340[1] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BILfh;)V")
    public final void method7(byte arg0, int arg1, class463 arg2) {
        int var4 = 91 % ((-13 - arg0) / 51);
        ++field331;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field339 = arg2.method2758((byte) 80);
                }
            } else {
                this.field330 = arg2.method2758((byte) 120);
            }
        } else {
            this.field332 = arg2.method2758((byte) 79);
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class23() {
        super(1, true);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)V")
    public final void method109(boolean arg0) {
        this.method197(-11907);
        if (!arg0) {
            ++field343;
        }
    }
}
