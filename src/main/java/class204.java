import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class204 extends class278 {

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "I")
    private int field2896 = 32768;

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "[Ljava/awt/Color;")
    public static Color[] field2897 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "Lvh;")
    public static class240 field2893;

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
    public class204() {
        super(3, false);
    }

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "(I)V")
    public static void method1241(int arg0) {
        if (arg0 < 91) {
            field2893 = null;
        }
        field2897 = null;
        field2893 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;II)I")
    public static final int method1242(String arg0, int arg1, int arg2) {
        ++field2892;
        return arg2 != 3289650 ? 114 : class506.method2976(true, arg0, arg1, arg2 ^ 3289650);
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V")
    public final void method207(int arg0) {
        class99.method664((byte) -69);
        if (arg0 != 2) {
            this.method207(10);
        }
        ++field2895;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)[I")
    public final int[] method208(int arg0, int arg1) {
        ++field2899;
        int[] var3 = super.field3750.method256(arg1, -30359);
        if (super.field3750.field554) {
            int[] var4 = this.method1570(0, 1, arg1);
            int[] var5 = this.method1570(0, 2, arg1);
            for (int var6 = 0; ~var6 > ~class507.field7456; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field2896 >> 12;
                int var9 = class441.field6422[var7] * var8 >> 12;
                int var10 = class65.field888[var7] * var8 >> 12;
                int var11 = class412.field6045 & (var9 >> 12) + var6;
                int var12 = (var10 >> 12) + arg1 & class40.field549;
                int[] var13 = this.method1570(arg0 + 9, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        if (arg0 != -9) {
            method1241(30);
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)[[I")
    public final int[][] method324(int arg0, int arg1) {
        ++field2894;
        int[][] var3 = super.field3757.method1450(arg1, -1);
        if (super.field3757.field3420) {
            int[] var4 = this.method1570(0, 1, arg1);
            int[] var5 = this.method1570(0, 2, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class507.field7456; ++var9) {
                int var10 = (var4[var9] * 255 & 1046297) >> 12;
                int var11 = var5[var9] * this.field2896 >> 12;
                int var12 = class441.field6422[var10] * var11 >> 12;
                int var13 = class65.field888[var10] * var11 >> 12;
                int var14 = class412.field6045 & var9 - -(var12 >> 12);
                int var15 = class40.field549 & arg1 - -(var13 >> 12);
                int[][] var16 = this.method1568(5426, 0, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        if (arg0 < 75) {
            this.field2896 = 108;
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Llh;II)V")
    public final void method210(class365 arg0, int arg1, int arg2) {
        if (arg1 != -30446) {
            this.method210((class365) null, -125, -23);
        }
        ++field2898;
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field3754 = arg0.method2099(255) == 1;
            }
        } else {
            this.field2896 = arg0.method2062((byte) 14) << 4;
        }
    }
}
