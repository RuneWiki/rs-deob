import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class261 extends class306 {

    @OriginalMember(owner = "client!k", name = "J", descriptor = "I")
    private int field4125 = 12288;

    @OriginalMember(owner = "client!k", name = "M", descriptor = "I")
    private int field4128 = 0;

    @OriginalMember(owner = "client!k", name = "L", descriptor = "I")
    private int field4127 = 4096;

    @OriginalMember(owner = "client!k", name = "K", descriptor = "I")
    private int field4126 = 8192;

    @OriginalMember(owner = "client!k", name = "S", descriptor = "I")
    private int field4134 = 2048;

    @OriginalMember(owner = "client!k", name = "T", descriptor = "I")
    private int field4135 = 0;

    @OriginalMember(owner = "client!k", name = "O", descriptor = "I")
    private int field4130 = 2048;

    @OriginalMember(owner = "client!k", name = "I", descriptor = "I")
    public static int field4124 = 0;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "I")
    public static int field4133 = 0;

    @OriginalMember(owner = "client!k", name = "P", descriptor = "[I")
    public static int[] field4131 = new int[1000];

    @OriginalMember(owner = "client!k", name = "G", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!k", name = "H", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!k", name = "N", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!k", name = "U", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!k", name = "V", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!k", name = "W", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(II)I", line = 6)
    public static int method1840(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI)I", line = 14)
    public static final int method1841(boolean arg0, int arg1) {
        if (!arg0) {
            field4124 = -96;
        }
        field4132++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IZI)Z", line = 27)
    private final boolean method1842(int arg0, boolean arg1, int arg2) {
        field4122++;
        int var4 = (arg0 + arg2) * this.field4125 >> 12;
        if (!arg1) {
            return true;
        }
        int var5 = class323.field5147[(var4 * 255 & 0xFFEAE) >> 12];
        int var6 = (var5 << 12) / this.field4125;
        int var7 = (var6 << 12) / this.field4126;
        int var8 = this.field4127 * var7 >> 12;
        return var8 > arg2 - arg0 && (-var8) < (arg2 - arg0);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V", line = 47)
    public class261() {
        super(0, true);
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(B)V", line = 58)
    public final void method43(byte arg0) {
        class105.method682((byte) -100);
        if (arg0 <= -103) {
            field4137++;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILlf;I)V", line = 76)
    public final void method45(int arg0, class143 arg1, int arg2) {
        if (arg0 != -15334) {
            this.field4126 = -21;
        }
        if (arg2 == 0) {
            this.field4130 = arg1.method1051(1);
        } else if (arg2 == 1) {
            this.field4135 = arg1.method1051(1);
        } else if (arg2 == 2) {
            this.field4128 = arg1.method1051(1);
        } else if (arg2 == 3) {
            this.field4134 = arg1.method1051(arg0 + 15335);
        } else if (arg2 == 4) {
            this.field4125 = arg1.method1051(1);
        } else if (arg2 == 5) {
            this.field4127 = arg1.method1051(arg0 ^ 0xFFFFC41B);
        } else if (arg2 == 6) {
            this.field4126 = arg1.method1051(1);
        }
        field4136++;
    }

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(I)V", line = 156)
    public static void method1843(int arg0) {
        field4131 = null;
        if (arg0 > -61) {
            method1843(-98);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)Z", line = 185)
    private final boolean method1844(int arg0, int arg1, int arg2) {
        field4129++;
        int var4 = (arg0 - arg2) * this.field4125 >> 12;
        int var5 = class323.field5147[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field4125;
        int var7 = (var6 << 12) / this.field4126;
        int var8 = this.field4127 * var7 >> 12;
        if (arg1 != 1071518028) {
            field4133 = 85;
        }
        return arg0 + arg2 < var8 && arg0 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)[I", line = 215)
    public final int[] method47(int arg0, int arg1) {
        if (arg1 != -1546337535) {
            this.method1844(54, -47, 117);
        }
        field4123++;
        int[] var3 = this.field4757.method903(arg0, -91);
        if (this.field4757.field1898) {
            int var4 = class111.field1553[arg0] - 2048;
            for (int var5 = 0; var5 < class31.field367; var5++) {
                int var6 = class25.field288[var5] - 2048;
                int var7 = this.field4135 + var4;
                int var8 = this.field4130 + var6;
                int var9 = this.field4128 + var6;
                int var10 = var9 >= -2048 ? var9 : var9 + 4096;
                int var11 = var8 >= -2048 ? var8 : var8 + 4096;
                int var12 = var7 < -2048 ? var7 + 4096 : var7;
                int var13 = var4 + this.field4134;
                int var14 = var10 > 2048 ? var10 - 4096 : var10;
                int var15 = var11 > 2048 ? var11 - 4096 : var11;
                int var16 = var13 >= -2048 ? var13 : var13 + 4096;
                int var17 = var12 <= 2048 ? var12 : var12 - 4096;
                int var18 = var16 > 2048 ? var16 - 4096 : var16;
                var3[var5] = this.method1844(var17, 1071518028, var15) || this.method1842(var14, true, var18) ? 4096 : 0;
            }
        }
        return var3;
    }
}
