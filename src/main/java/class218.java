import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class218 extends class219 {

    @OriginalMember(owner = "client!gl", name = "L", descriptor = "[I")
    private int[] field3631 = new int[3];

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "I")
    private int field3636 = 3216;

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "I")
    private int field3637 = 4096;

    @OriginalMember(owner = "client!gl", name = "W", descriptor = "I")
    private int field3642 = 3216;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "[B")
    public static byte[] field3634 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!gl", name = "U", descriptor = "[[I")
    public static int[][] field3640 = new int[104][104];

    @OriginalMember(owner = "client!gl", name = "T", descriptor = "Lbd;")
    public static class162 field3639 = class17.method142(0, "leuchten1:");

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!gl", name = "V", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!gl", name = "S", descriptor = "Lwf;")
    public static class215 field3638;

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "Ldc;")
    public static class71 field3629;

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V", line = 3)
    public class218() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)I", line = 8)
    public static final int method1580(int arg0, int arg1) {
        field3633++;
        int var2 = -118 / ((arg1 - 25) / 61);
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V", line = 20)
    private final void method1581(int arg0) {
        field3630++;
        double var2 = Math.cos((double) ((float) this.field3642 / 4096.0F));
        this.field3631[0] = (int) (var2 * Math.sin((double) ((float) this.field3636 / 4096.0F)) * 4096.0D);
        if (arg0 != 5331) {
            this.method42(8, 41, (class94) null);
        }
        this.field3631[1] = (int) (var2 * 4096.0D * Math.cos((double) ((float) this.field3636 / 4096.0F)));
        this.field3631[2] = (int) (Math.sin((double) ((float) this.field3642 / 4096.0F)) * 4096.0D);
        int var4 = this.field3631[0] * this.field3631[0] >> 12;
        int var5 = this.field3631[1] * this.field3631[1] >> 12;
        int var6 = this.field3631[2] * this.field3631[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field3631[1] = (this.field3631[1] << 12) / var7;
            this.field3631[0] = (this.field3631[0] << 12) / var7;
            this.field3631[2] = (this.field3631[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)V", line = 64)
    public final void method39(byte arg0) {
        if (arg0 != 22) {
            this.field3631 = (int[]) null;
        }
        this.method1581(5331);
        field3632++;
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)V", line = 82)
    public static void method1582(int arg0) {
        field3629 = null;
        field3634 = null;
        field3640 = (int[][]) null;
        if (arg0 == 255) {
            field3639 = null;
            field3638 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZI)[I", line = 101)
    public final int[] method41(boolean arg0, int arg1) {
        if (!arg0) {
            return (int[]) null;
        }
        field3641++;
        int[] var3 = this.field3654.method2032(3, arg1);
        if (this.field3654.field4967) {
            int var4 = class122.field2211 * this.field3637 >> 12;
            int[] var5 = this.method1585(0, arg1 - 1 & class60.field927, -6606);
            int[] var6 = this.method1585(0, arg1, -6606);
            int[] var7 = this.method1585(0, class60.field927 & arg1 + 1, -6606);
            for (int var8 = 0; var8 < class128.field2326; var8++) {
                int var9 = (var6[var8 - 1 & class252.field4208] - var6[class252.field4208 & var8 + 1]) * var4 >> 12;
                int var10 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var11 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var10 >> 4;
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class315.field5311[((var12 + 1) * var12 >> 1) + var11] & 0xFF;
                int var14 = var9 * var13 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = this.field3631[1] * var15 >> 12;
                int var17 = this.field3631[0] * var14 >> 12;
                int var18 = var13 * 4096 >> 8;
                int var19 = this.field3631[2] * var18 >> 12;
                var3[var8] = var17 + var16 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILb;)V", line = 191)
    public final void method42(int arg0, int arg1, class94 arg2) {
        if (arg1 != 0) {
            field3640 = (int[][]) ((int[][]) null);
        }
        if (arg0 == 0) {
            this.field3637 = arg2.method761((byte) 108);
        } else if (arg0 == 1) {
            this.field3636 = arg2.method761((byte) 108);
        } else if (arg0 == 2) {
            this.field3642 = arg2.method761((byte) 108);
        }
        field3635++;
    }
}
