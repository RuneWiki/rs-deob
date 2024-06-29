import java.awt.Canvas;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class243 extends class202 {

    @OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
    private int field3936 = 1024;

    @OriginalMember(owner = "client!lr", name = "M", descriptor = "I")
    private int field3939 = 2048;

    @OriginalMember(owner = "client!lr", name = "U", descriptor = "I")
    private int field3947 = 3072;

    @OriginalMember(owner = "client!lr", name = "R", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3944 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!lr", name = "V", descriptor = "I")
    public static int field3948 = 0;

    @OriginalMember(owner = "client!lr", name = "K", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!lr", name = "L", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!lr", name = "N", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!lr", name = "O", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!lr", name = "P", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!lr", name = "Q", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!lr", name = "S", descriptor = "Lpb;")
    public static class2 field3945;

    @OriginalMember(owner = "client!lr", name = "T", descriptor = "[Lo;")
    public static class139[] field3946;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field3940;
        int[] var3 = super.field3064.method2452((byte) 87, arg0);
        if (super.field3064.field5837) {
            int[] var4 = this.method1376(1046794076, 0, arg0);
            for (int var5 = 0; var5 < class276.field4375; ++var5) {
                var3[var5] = (var4[var5] * this.field3939 >> 12) + this.field3936;
            }
        }
        return !arg1 ? null : var3;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)[[I")
    public final int[][] method44(int arg0, int arg1) {
        ++field3941;
        int[][] var3 = super.field3081.method1050(arg1, arg0 ^ 88);
        if (arg0 != -1) {
            return null;
        } else {
            if (super.field3081.field2432) {
                int[][] var4 = this.method1382(0, arg1, arg0 + 29);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class276.field4375 < ~var11; ++var11) {
                    var8[var11] = (var5[var11] * this.field3939 >> 12) + this.field3936;
                    var9[var11] = (var6[var11] * this.field3939 >> 12) + this.field3936;
                    var10[var11] = (var7[var11] * this.field3939 >> 12) + this.field3936;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "(I)V")
    public static void method1692(int arg0) {
        field3944 = null;
        int var1 = -93 / ((arg0 - 57) / 46);
        field3945 = null;
        field3946 = null;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([BLjava/lang/String;II)I")
    public static final int method1693(byte[] arg0, String arg1, int arg2, int arg3) {
        ++field3942;
        int var4 = arg1.length();
        if (arg2 != 20845) {
            return 39;
        } else {
            int var5 = arg3;
            for (int var6 = 0; ~var4 < ~var6; ++var6) {
                char var7 = arg1.charAt(var6);
                if (~var7 < -128) {
                    if (var7 > 2047) {
                        arg0[var5++] = (byte) (class410.method2621(var7, 921424) >> 12);
                        arg0[var5++] = (byte) class410.method2621(class272.method1842(var7 >> 6, 63), 128);
                        arg0[var5++] = (byte) class410.method2621(128, class272.method1842(var7, 63));
                    } else {
                        arg0[var5++] = (byte) class410.method2621(192, var7 >> 6);
                        arg0[var5++] = (byte) class410.method2621(128, class272.method1842(63, var7));
                    }
                } else {
                    arg0[var5++] = (byte) var7;
                }
            }
            return -arg3 + var5;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        int var4 = 38 / ((arg1 - -46) / 50);
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field3071 = arg0.method1445(39) == 1;
                }
            } else {
                this.field3947 = arg0.method1455(-3387);
            }
        } else {
            this.field3936 = arg0.method1455(-3387);
        }
        ++field3943;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
    public final void method51(int arg0) {
        this.field3939 = this.field3947 - this.field3936;
        int var2 = 120 / ((80 - arg0) / 46);
        ++field3938;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V")
    public class243() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ll;Ljava/awt/Canvas;BI)Lza;")
    public static final class497 method1694(class199 arg0, Canvas arg1, byte arg2, int arg3) {
        if (arg2 != 10) {
            method1692(-115);
        }
        ++field3937;
        return new class195(arg3, arg1, arg0);
    }
}
