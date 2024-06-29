import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class519 extends class62 {

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "I")
    private int field7401 = -1;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "Lwf;")
    public static class117 field7397 = new class117(64);

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
    public static int field7409 = -1;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "F")
    public static float field7408;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
    public int field7398;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
    public int field7400;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
    public static int field7403;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "Lra;")
    public static class92 field7407;

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "[I")
    public int[] field7404;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)[[I")
    public int[][] method409(int arg0, byte arg1) {
        ++field7395;
        int[][] var3 = super.field772.method2906(8, arg0);
        if (arg1 > -20) {
            return null;
        } else {
            if (super.field772.field6899 && this.method3071((byte) 62)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = (~class14.field148 == ~this.field7400 ? arg0 : this.field7400 * arg0 / class14.field148) * this.field7398;
                if (~class438.field5847 == ~this.field7398) {
                    for (int var8 = 0; ~var8 > ~class438.field5847; ++var8) {
                        int var9 = this.field7404[var7++];
                        var6[var8] = class37.method245(var9 << 4, 4080);
                        var5[var8] = class37.method245(var9 >> 4, 4080);
                        var4[var8] = class37.method245(var9, 16711680) >> 12;
                    }
                } else {
                    for (int var10 = 0; var10 < class438.field5847; ++var10) {
                        int var11 = this.field7398 * var10 / class438.field5847;
                        int var12 = this.field7404[var7 + var11];
                        var6[var10] = class37.method245(255, var12) << 4;
                        var5[var10] = class37.method245(4080, var12 >> 4);
                        var4[var10] = class37.method245(var12, 16711680) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class519() {
        super(0, false);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)I")
    public final int method403(int arg0) {
        if (arg0 != 0) {
            method3070(-46);
        }
        ++field7410;
        return this.field7401;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/awt/Canvas;ILn;)Lqa;")
    public static final class208 method3068(Canvas arg0, int arg1, class17 arg2) {
        int var3 = 95 % ((arg1 - -6) / 49);
        ++field7399;
        return new class530(arg0, arg2);
    }

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "(I)V")
    public static void method3069(int arg0) {
        if (arg0 >= -62) {
            method3070(103);
        }
        field7407 = null;
        field7397 = null;
    }

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "(I)V")
    public static final void method3070(int arg0) {
        ++field7402;
        class114.field1605.method1717(31913);
        if (arg0 < 36) {
            method3069(29);
        }
        for (int var1 = 0; ~var1 > -33; ++var1) {
            class45.field546[var1] = 0L;
        }
        for (int var2 = 0; ~var2 > -33; ++var2) {
            class402.field5503[var2] = 0L;
        }
        class86.field1234 = 0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lgw;II)V")
    public final void method11(class148 arg0, int arg1, int arg2) {
        ++field7396;
        if (arg1 != -1) {
            method3068((Canvas) null, 80, (class17) null);
        }
        if (arg2 == 0) {
            this.field7401 = arg0.method1045(true);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)Z")
    public final boolean method3071(byte arg0) {
        ++field7403;
        if (this.field7404 != null) {
            return true;
        } else if (this.field7401 >= 0) {
            class126 var2 = class220.field3206 < 0 ? class126.method894(class44.field519, this.field7401) : class126.method896(class44.field519, class220.field3206, this.field7401);
            var2.method888();
            this.field7404 = var2.method897();
            this.field7400 = var2.field1771;
            this.field7398 = var2.field1767;
            return true;
        } else {
            if (arg0 < 24) {
                this.field7400 = 57;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(IB)V")
    public static final void method3072(int arg0, byte arg1) {
        ++field7406;
        int var2 = -class448.field6279 + class617.field9123;
        if (~var2 <= -101) {
            class531.field7929 = 1;
        } else {
            int var3 = (int) class278.field3902;
            if (~var3 > ~(class1.field2 >> 8)) {
                var3 = class1.field2 >> 8;
            }
            if (class345.field4750[4] && class642.field9354[4] - -128 > var3) {
                var3 = class642.field9354[4] + 128;
            }
            int var4 = 16383 & (int) class539.field8023 - -class232.field3379;
            class323.method1939(arg0, var3, class24.field224, var4, class111.field1579, (var3 >> 3) * 3 + 600 << 0, -50 + class132.method919(class89.field1339, class541.field8119.field8500, class541.field8119.field8496, (byte) -82), false);
            float var5 = -((float) ((100 - var2) * (-var2 + 100) * (-var2 + 100)) / 1000000.0F) + 1.0F;
            class125.field1760 = (int) ((float) (-class494.field7037 + class125.field1760) * var5 + (float) class494.field7037);
            class517.field7371 = (int) ((float) (-class204.field3009 + class517.field7371) * var5 + (float) class204.field3009);
            class214.field3161 = (int) ((float) (-class527.field7600 + class214.field3161) * var5 + (float) class527.field7600);
            if (arg1 > 101) {
                class118.field1665 = (int) ((float) (class118.field1665 - class341.field4718) * var5 + (float) class341.field4718);
                int var6 = -class607.field9011 + class222.field3222;
                if (var6 <= 8192) {
                    if (var6 < -8192) {
                        var6 += 16384;
                    }
                } else {
                    var6 -= 16384;
                }
                class222.field3222 = (int) ((float) var6 * var5 + (float) class607.field9011);
                class222.field3222 &= 16383;
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
    public final void method405(int arg0) {
        super.method405(arg0);
        if (arg0 != 255) {
            method3070(-86);
        }
        ++field7405;
        this.field7404 = null;
    }
}
