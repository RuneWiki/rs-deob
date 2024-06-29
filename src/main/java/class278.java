import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class278 extends class74 {

    @OriginalMember(owner = "client!h", name = "R", descriptor = "Z")
    private boolean field4376 = true;

    @OriginalMember(owner = "client!h", name = "S", descriptor = "I")
    private int field4377 = 4096;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field4375 = "flash2:";

    @OriginalMember(owner = "client!h", name = "M", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!h", name = "T", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!h", name = "U", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "Ljava/awt/Font;")
    public static Font field4374;

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
    public class278() {
        super(1, false);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)[[I")
    public final int[][] method82(int arg0, byte arg1) {
        ++field4373;
        int[][] var3 = super.field1248.method269(false, arg0);
        if (arg1 > -112) {
            return null;
        } else {
            if (super.field1248.field550) {
                int[] var4 = this.method590(0, 0, class218.field3419 & arg0 - 1);
                int[] var5 = this.method590(0, 0, arg0);
                int[] var6 = this.method590(0, 0, class218.field3419 & arg0 - -1);
                int[] var7 = var3[0];
                int[] var8 = var3[2];
                int[] var9 = var3[1];
                for (int var10 = 0; var10 < class178.field2662; ++var10) {
                    int var11 = (var6[var10] + -var4[var10]) * this.field4377;
                    int var12 = var11 >> 12;
                    int var13 = (var5[var10 + 1 & class129.field2012] + -var5[class129.field2012 & var10 + -1]) * this.field4377;
                    int var14 = var13 >> 12;
                    int var15 = var12 * var12 >> 12;
                    int var16 = var14 * var14 >> 12;
                    int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 + 4096 - -var15) / 4096.0F)));
                    int var18;
                    int var19;
                    int var20;
                    if (var17 == 0) {
                        var18 = 0;
                        var19 = 0;
                        var20 = 0;
                    } else {
                        var19 = var13 / var17;
                        var18 = var11 / var17;
                        var20 = 16777216 / var17;
                    }
                    if (this.field4376) {
                        var18 = 2048 - -(var18 >> 1);
                        var20 = (var20 >> 1) + 2048;
                        var19 = 2048 - -(var19 >> 1);
                    }
                    var7[var10] = var19;
                    var9[var10] = var18;
                    var8[var10] = var20;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
    public static final void method1862(int arg0) {
        class154.field2356 = null;
        class204.field3181 = null;
        if (arg0 == 22333) {
            class245.field3799 = null;
            class154.field2354 = null;
            class35.field575 = null;
            class141.field2177 = null;
            class109.field1728 = null;
            class228.field3560 = null;
            class203.field3170 = null;
            class72.field1139 = null;
            ++field4372;
            class105.field1684 = null;
            class113.field1782 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        ++field4378;
        if (arg0 != -79) {
            field4374 = null;
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field4376 = arg1.method333((byte) -59) == 1;
            }
        } else {
            this.field4377 = arg1.method293(9);
        }
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
    public static void method1863(int arg0) {
        field4375 = null;
        if (arg0 != 0) {
            method1863(19);
        }
        field4374 = null;
    }

    @OriginalMember(owner = "client!h", name = "h", descriptor = "(I)I")
    public static final int method1864(int arg0) {
        ++field4371;
        return arg0 < 21 ? 51 : class187.field2820;
    }
}
