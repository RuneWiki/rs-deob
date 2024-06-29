import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class331 extends class456 {

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    private int field4963 = 4096;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "Z")
    private boolean field4959 = true;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "Lj;")
    public static class240 field4958 = new class240(6, -1);

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public static int field4964 = 0;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(II)I", line = 3)
    public static final int method2031(int arg0, int arg1) {
        ++field4962;
        int var2 = 0;
        if (arg1 < 0 || ~arg1 <= -65537) {
            var2 += 16;
            arg1 >>>= 16;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 8;
        }
        if (~arg1 <= -17) {
            arg1 >>>= 4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 2;
        }
        if (~arg1 <= -2) {
            arg1 >>>= 1;
            ++var2;
        }
        return arg0 < 117 ? -24 : arg1 + var2;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V", line = 48)
    public class331() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBLre;)V", line = 51)
    public final void method210(int arg0, byte arg1, class446 arg2) {
        ++field4960;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field4959 = ~arg2.method2628(arg1 + 49097) == -2;
            }
        } else {
            this.field4963 = arg2.method2631(2530);
        }
        if (arg1 != 55) {
            this.field4963 = -64;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)[[I", line = 85)
    public final int[][] method212(int arg0, int arg1) {
        ++field4961;
        int[][] var3 = super.field6468.method1090(arg0 + -2, arg1);
        if (super.field6468.field2227) {
            int[] var4 = this.method2707(arg1 + -1 & class493.field6947, -31797, 0);
            int[] var5 = this.method2707(arg1, -31797, 0);
            int[] var6 = this.method2707(class493.field6947 & arg1 - -1, -31797, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class156.field2169; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field4963;
                int var12 = (var5[var10 + 1 & class428.field6112] + -var5[class428.field6112 & var10 - 1]) * this.field4963;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var12 / var17;
                    var20 = var11 / var17;
                    var19 = 16777216 / var17;
                }
                if (this.field4959) {
                    var19 = 2048 - -(var19 >> 1);
                    var18 = (var18 >> 1) + 2048;
                    var20 = 2048 - -(var20 >> 1);
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        return arg0 != 0 ? null : var3;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(III)Lje;", line = 166)
    public static final class178 method2032(int arg0, int arg1, int arg2) {
        ++field4957;
        class178 var3 = class493.method2885(arg0, 65535);
        if (arg1 == arg2) {
            return var3;
        } else {
            return var3 != null && var3.field2548 != null && var3.field2548.length > arg1 ? var3.field2548[arg1] : null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "(I)V", line = 187)
    public static void method2033(int arg0) {
        if (arg0 != -40436) {
            method2031(11, 36);
        }
        field4958 = null;
    }
}
