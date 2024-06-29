import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class170 extends class601 {

    @OriginalMember(owner = "client!cfa", name = "D", descriptor = "I")
    private int field2608 = 3216;

    @OriginalMember(owner = "client!cfa", name = "I", descriptor = "I")
    private int field2612 = 4096;

    @OriginalMember(owner = "client!cfa", name = "O", descriptor = "I")
    private int field2618 = 3216;

    @OriginalMember(owner = "client!cfa", name = "P", descriptor = "[I")
    private int[] field2619 = new int[3];

    @OriginalMember(owner = "client!cfa", name = "H", descriptor = "[I")
    public static int[] field2611 = new int[1];

    @OriginalMember(owner = "client!cfa", name = "E", descriptor = "[[I")
    public static int[][] field2609 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!cfa", name = "L", descriptor = "Z")
    public static boolean field2615 = false;

    @OriginalMember(owner = "client!cfa", name = "G", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!cfa", name = "J", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!cfa", name = "K", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!cfa", name = "N", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!cfa", name = "M", descriptor = "Lwu;")
    public static class376 field2616;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(B)V", line = 3)
    private final void method1207(byte arg0) {
        ++field2613;
        double var2 = Math.cos((double) ((float) this.field2608 / 4096.0F));
        this.field2619[0] = (int) (4096.0D * Math.sin((double) ((float) this.field2618 / 4096.0F)) * var2);
        this.field2619[1] = (int) (Math.cos((double) ((float) this.field2618 / 4096.0F)) * var2 * 4096.0D);
        if (arg0 == 88) {
            this.field2619[2] = (int) (4096.0D * Math.sin((double) ((float) this.field2608 / 4096.0F)));
            int var4 = this.field2619[0] * this.field2619[0] >> 12;
            int var5 = this.field2619[1] * this.field2619[1] >> 12;
            int var6 = this.field2619[2] * this.field2619[2] >> 12;
            int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
            if (~var7 != -1) {
                this.field2619[2] = (this.field2619[2] << 12) / var7;
                this.field2619[1] = (this.field2619[1] << 12) / var7;
                this.field2619[0] = (this.field2619[0] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BI)[I", line = 35)
    public final int[] method5(byte arg0, int arg1) {
        ++field2614;
        if (arg0 != -40) {
            field2611 = null;
        }
        int[] var3 = super.field7902.method382(arg1, true);
        if (super.field7902.field704) {
            int var4 = class562.field7372 * this.field2612 >> 12;
            int[] var5 = this.method3266((byte) 64, class112.field1855 & arg1 + -1, 0);
            int[] var6 = this.method3266((byte) 64, arg1, 0);
            int[] var7 = this.method3266((byte) 64, arg1 - -1 & class112.field1855, 0);
            for (int var8 = 0; ~var8 > ~class171.field2624; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class445.field6116] + -var6[class445.field6116 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class684.field9543[var11 - -((var12 + 1) * var12 >> 1)] & 255;
                int var14 = var10 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field2619[1] * var15 >> 12;
                int var18 = this.field2619[0] * var14 >> 12;
                int var19 = this.field2619[2] * var16 >> 12;
                var3[var8] = var18 - -var17 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "()V", line = 205)
    public class170() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "()V", line = 122)
    public static final void method1208() {
        class277.field3864 = class277.field3863;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lee;BI)V", line = 125)
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field2608 = arg0.method3807(arg1 ^ 60);
                }
            } else {
                this.field2618 = arg0.method3807(-1);
            }
        } else {
            this.field2612 = arg0.method3807(-1);
        }
        if (arg1 != -61) {
            field2609 = null;
        }
        ++field2610;
    }

    @OriginalMember(owner = "client!cfa", name = "e", descriptor = "(I)V", line = 168)
    public static void method1209(int arg0) {
        field2616 = null;
        field2611 = null;
        if (arg0 != 5) {
            field2615 = true;
        }
        field2609 = null;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)V", line = 194)
    public final void method108(int arg0) {
        ++field2617;
        this.method1207((byte) 88);
        if (arg0 != 8351) {
            this.field2608 = -64;
        }
    }
}
