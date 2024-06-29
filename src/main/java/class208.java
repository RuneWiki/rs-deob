import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class208 extends class219 {

    @OriginalMember(owner = "client!g", name = "K", descriptor = "I")
    private int field3510 = 1024;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "I")
    private int field3512 = 2048;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "I")
    private int field3519 = 3072;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "Lbd;")
    public static class162 field3511 = class17.method142(0, "leuchten1:");

    @OriginalMember(owner = "client!g", name = "O", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!g", name = "R", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!g", name = "S", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "[I")
    public static int[] field3513;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V", line = 7)
    public static void method1527(int arg0) {
        field3511 = null;
        if (arg0 < 59) {
            field3513 = (int[]) null;
        }
        field3513 = null;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V", line = 17)
    public class208() {
        super(1, false);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)[I", line = 45)
    public final int[] method41(boolean arg0, int arg1) {
        field3517++;
        if (!arg0) {
            return (int[]) null;
        }
        int[] var3 = this.field3654.method2032(3, arg1);
        if (this.field3654.field4967) {
            int[] var4 = this.method1585(0, arg1, -6606);
            for (int var5 = 0; var5 < class128.field2326; var5++) {
                var3[var5] = (var4[var5] * this.field3512 >> 12) + this.field3510;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(B)V", line = 79)
    public final void method39(byte arg0) {
        this.field3512 = this.field3519 - this.field3510;
        if (arg0 != 22) {
            this.method42(-110, -106, (class94) null);
        }
        field3516++;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IILb;)V", line = 108)
    public final void method42(int arg0, int arg1, class94 arg2) {
        if (arg0 == 0) {
            this.field3510 = arg2.method761((byte) 108);
        } else if (arg0 == 1) {
            this.field3519 = arg2.method761((byte) 108);
        } else if (arg0 == 2) {
            this.field3647 = arg2.method756(915905888) == 1;
        }
        if (arg1 != 0) {
            this.method39((byte) 71);
        }
        field3518++;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)[[I", line = 151)
    public final int[][] method219(int arg0, byte arg1) {
        field3515++;
        if (arg1 != 83) {
            this.method219(105, (byte) -121);
        }
        int[][] var3 = this.field3651.method406(false, arg0);
        if (this.field3651.field917) {
            int[][] var4 = this.method1583(arg0, true, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class128.field2326; var11++) {
                var9[var11] = (var5[var11] * this.field3512 >> 12) + this.field3510;
                var8[var11] = (var6[var11] * this.field3512 >> 12) + this.field3510;
                var10[var11] = (var7[var11] * this.field3512 >> 12) + this.field3510;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(III)V", line = 193)
    public static final void method1528(int arg0, int arg1, int arg2) {
        if (arg2 >= -55) {
            field3511 = (class162) null;
        }
        short var3 = 256;
        if (class233.field3871 > 0) {
            class131.method1045(false, class233.field3871);
            class233.field3871 = 0;
        }
        int var4 = class316.field5331 * arg0;
        field3514++;
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class183.field3145[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var6 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class31.field515[var6++];
                int var11 = class316.field5328[var4++ + arg1];
                if (var10 == 0) {
                    class144.field2636.field1384[var5++] = var11;
                } else {
                    int var12 = var10 + 18;
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = 238 - var10;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = class250.field4150[var10];
                    class144.field2636.field1384[var5++] = class92.method695(class92.method695(16711935, var11) * var13 + var12 * class92.method695(16711935, var14), -16711936) + class92.method695(var13 * class92.method695(65280, var11) + var12 * class92.method695(var14, 65280), 16711680) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class144.field2636.field1384[var5++] = class316.field5328[var4++ + arg1];
            }
            var4 += class316.field5331 - 128;
        }
        class144.field2636.method286(arg1, arg0);
    }
}
