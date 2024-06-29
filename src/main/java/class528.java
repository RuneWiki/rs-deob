import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class528 extends class305 {

    @OriginalMember(owner = "client!mv", name = "F", descriptor = "I")
    private int field7728 = 3216;

    @OriginalMember(owner = "client!mv", name = "G", descriptor = "I")
    private int field7729 = 3216;

    @OriginalMember(owner = "client!mv", name = "E", descriptor = "[I")
    private int[] field7727 = new int[3];

    @OriginalMember(owner = "client!mv", name = "M", descriptor = "I")
    private int field7735 = 4096;

    @OriginalMember(owner = "client!mv", name = "H", descriptor = "I")
    public static int field7730;

    @OriginalMember(owner = "client!mv", name = "I", descriptor = "I")
    public static int field7731;

    @OriginalMember(owner = "client!mv", name = "K", descriptor = "I")
    public static int field7733;

    @OriginalMember(owner = "client!mv", name = "L", descriptor = "I")
    public static int field7734;

    @OriginalMember(owner = "client!mv", name = "D", descriptor = "J")
    public static long field7726;

    @OriginalMember(owner = "client!mv", name = "J", descriptor = "[Lo;")
    public static class363[] field7732;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "(B)V", line = 3)
    private final void method3128(byte arg0) {
        int var2 = 54 % ((-18 - arg0) / 42);
        ++field7734;
        double var3 = Math.cos((double) ((float) this.field7728 / 4096.0F));
        this.field7727[0] = (int) (var3 * Math.sin((double) ((float) this.field7729 / 4096.0F)) * 4096.0D);
        this.field7727[1] = (int) (4096.0D * var3 * Math.cos((double) ((float) this.field7729 / 4096.0F)));
        this.field7727[2] = (int) (Math.sin((double) ((float) this.field7728 / 4096.0F)) * 4096.0D);
        int var5 = this.field7727[0] * this.field7727[0] >> 12;
        int var6 = this.field7727[1] * this.field7727[1] >> 12;
        int var7 = this.field7727[2] * this.field7727[2] >> 12;
        int var8 = (int) (4096.0D * Math.sqrt((double) (var6 + var7 + var5 >> 12)));
        if (var8 != 0) {
            this.field7727[0] = (this.field7727[0] << 12) / var8;
            this.field7727[1] = (this.field7727[1] << 12) / var8;
            this.field7727[2] = (this.field7727[2] << 12) / var8;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)[I", line = 33)
    public final int[] method15(int arg0, int arg1) {
        if (arg1 != 4688) {
            this.method3128((byte) 83);
        }
        ++field7730;
        int[] var3 = super.field4677.method2174(arg0, 69);
        if (super.field4677.field5040) {
            int var4 = class46.field727 * this.field7735 >> 12;
            int[] var5 = this.method2021(0, class236.field3551 & arg0 + -1, arg1 ^ 4688);
            int[] var6 = this.method2021(0, arg0, 0);
            int[] var7 = this.method2021(0, arg0 + 1 & class236.field3551, 0);
            for (int var8 = 0; class91.field1471 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class228.field3447 & var8 + -1] - var6[class228.field3447 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class500.field7278[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var9 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var10 * var13 >> 8;
                int var17 = this.field7727[1] * var14 >> 12;
                int var18 = this.field7727[0] * var16 >> 12;
                int var19 = this.field7727[2] * var15 >> 12;
                var3[var8] = var17 + var18 - -var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "(I)V", line = 104)
    public static void method3129(int arg0) {
        if (arg0 == 18184) {
            field7732 = null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILfh;B)V", line = 115)
    public final void method14(int arg0, class194 arg1, byte arg2) {
        if (arg2 < 76) {
            field7732 = null;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field7728 = arg1.method1396(83);
                }
            } else {
                this.field7729 = arg1.method1396(-97);
            }
        } else {
            this.field7735 = arg1.method1396(-8);
        }
        ++field7731;
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "()V", line = 195)
    public class528() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)V", line = 184)
    public final void method17(byte arg0) {
        ++field7733;
        if (arg0 != -62) {
            this.field7729 = -82;
        }
        this.method3128((byte) 60);
    }
}
