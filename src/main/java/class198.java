import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class198 extends class5 {

    @OriginalMember(owner = "client!ut", name = "P", descriptor = "I")
    private int field2508 = 3216;

    @OriginalMember(owner = "client!ut", name = "M", descriptor = "[I")
    private int[] field2505 = new int[3];

    @OriginalMember(owner = "client!ut", name = "Q", descriptor = "I")
    private int field2509 = 3216;

    @OriginalMember(owner = "client!ut", name = "O", descriptor = "I")
    private int field2507 = 4096;

    @OriginalMember(owner = "client!ut", name = "K", descriptor = "Lwp;")
    public static class453 field2503 = new class453(75, 0);

    @OriginalMember(owner = "client!ut", name = "I", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!ut", name = "J", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!ut", name = "L", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!ut", name = "N", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!ut", name = "R", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method39(int arg0, int arg1) {
        ++field2510;
        int var3 = 19 % ((81 - arg0) / 36);
        int[] var4 = super.field126.method3280(arg1, true);
        if (super.field126.field8392) {
            int var5 = class686.field9645 * this.field2507 >> 12;
            int[] var6 = this.method49(arg1 + -1 & class669.field9431, false, 0);
            int[] var7 = this.method49(arg1, false, 0);
            int[] var8 = this.method49(arg1 + 1 & class669.field9431, false, 0);
            for (int var9 = 0; ~class657.field9287 < ~var9; ++var9) {
                int var10 = (var8[var9] - var6[var9]) * var5 >> 12;
                int var11 = (var7[var9 + -1 & class194.field2440] + -var7[class194.field2440 & var9 + 1]) * var5 >> 12;
                int var12 = var11 >> 4;
                int var13 = var10 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (var13 > 255) {
                    var13 = 255;
                }
                int var14 = class158.field2051[((var13 + 1) * var13 >> 1) + var12] & 255;
                int var15 = var10 * var14 >> 8;
                int var16 = var11 * var14 >> 8;
                int var17 = var14 * 4096 >> 8;
                int var18 = this.field2505[0] * var16 >> 12;
                int var19 = this.field2505[1] * var15 >> 12;
                int var20 = this.field2505[2] * var17 >> 12;
                var4[var9] = var18 + var19 + var20;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "(B)V", line = 76)
    public static void method1202(byte arg0) {
        field2503 = null;
        if (arg0 >= -1) {
            method1202((byte) -53);
        }
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V", line = 86)
    public class198() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILes;I)V", line = 90)
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (arg0 != 1) {
            this.method1203(-31);
        }
        ++field2502;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field2509 = arg1.method3470(13111);
                }
            } else {
                this.field2508 = arg1.method3470(13111);
            }
        } else {
            this.field2507 = arg1.method3470(13111);
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)V", line = 137)
    public final void method46(int arg0) {
        int var2 = 123 / ((arg0 - 64) / 60);
        ++field2504;
        this.method1203(4096);
    }

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "(I)V", line = 150)
    private final void method1203(int arg0) {
        ++field2506;
        double var2 = Math.cos((double) ((float) this.field2509 / 4096.0F));
        this.field2505[0] = (int) (Math.sin((double) ((float) this.field2508 / 4096.0F)) * var2 * (double) arg0);
        this.field2505[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field2508 / 4096.0F)));
        this.field2505[2] = (int) (4096.0D * Math.sin((double) ((float) this.field2509 / 4096.0F)));
        int var4 = this.field2505[0] * this.field2505[0] >> 12;
        int var5 = this.field2505[1] * this.field2505[1] >> 12;
        int var6 = this.field2505[2] * this.field2505[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
        if (~var7 != -1) {
            this.field2505[2] = (this.field2505[2] << 12) / var7;
            this.field2505[1] = (this.field2505[1] << 12) / var7;
            this.field2505[0] = (this.field2505[0] << 12) / var7;
        }
    }
}
