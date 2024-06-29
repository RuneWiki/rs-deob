import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class7 extends class263 {

    @OriginalMember(owner = "client!tu", name = "G", descriptor = "I")
    public static int field63 = 0;

    @OriginalMember(owner = "client!tu", name = "M", descriptor = "J")
    public static long field68 = 0L;

    @OriginalMember(owner = "client!tu", name = "F", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!tu", name = "I", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!tu", name = "J", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!tu", name = "K", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!tu", name = "L", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!tu", name = "N", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!tu", name = "E", descriptor = "Lok;")
    public static class74 field61;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZLya;)V")
    public static final void method28(boolean arg0, class11 arg1) {
        arg1.method84(0, 0, class155.field2347, 350);
        if (!arg0) {
            field68 = 0L;
        }
        ++field67;
        arg1.method162(0, 0, class155.field2347, 350, class214.field3052 << 24 | 3351159, 1);
        int var2 = 350 / class228.field3213;
        if (class301.field4472 > 0) {
            int var3 = 346 - class228.field3213 + -4;
            int var4 = var2 * var3 / (class301.field4472 + -1 + var2);
            int var5 = 4;
            if (class301.field4472 > 1) {
                var5 += (class301.field4472 + -1 + -class179.field2654) * (-var4 + var3) / (class301.field4472 + -1);
            }
            arg1.method162(class155.field2347 + -16, var5, 12, var4, class214.field3052 << 24 | 3351159, 2);
            for (int var6 = class179.field2654; class179.field2654 + var2 > var6 && ~var6 > ~class301.field4472; ++var6) {
                String[] var7 = class167.method1164(class100.field1522[var6], (byte) 73, '\b');
                int var8 = (class155.field2347 - 16 + -8) / var7.length;
                for (int var9 = 0; ~var7.length < ~var9; ++var9) {
                    int var10 = 8 - -(var8 * var9);
                    arg1.method84(var10, 0, var10 - 8 + var8, 350);
                    class164.field2445.method1918(-16777216, 350 - (var6 - class179.field2654) * class228.field3213 + -class286.field4293 + -2 + -class192.field2837.field6503, -1, 121, var7[var9], var10);
                }
            }
        }
        arg1.method84(0, 0, class155.field2347, 350);
        arg1.method107(0, -1, (byte) -90, -class286.field4293 + 350, class155.field2347);
        class345.field5325.method1918(-16777216, -class342.field5252.field6503 + 350 + -1, -1, -48, "--> " + class159.field2395, 10);
        int var11 = -1;
        if (~(class86.field1350 % 30) < -16) {
            var11 = 16777215;
        }
        arg1.method121(-class342.field5252.field6503 + 350 - 11, 12, (byte) 66, var11, class342.field5252.method2599("--> " + class159.field2395.substring(0, class258.field3706), (byte) 71) + 10);
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)V")
    public static void method29(int arg0) {
        field61 = null;
        if (arg0 != -1) {
            method28(true, (class11) null);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BLjava/awt/Component;Z)Lde;")
    public static final class10 method30(byte arg0, Component arg1, boolean arg2) {
        if (arg0 != 117) {
            field68 = -105L;
        }
        ++field62;
        return new class111(arg1, arg2);
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(III)V")
    private final void method31(int arg0, int arg1, int arg2) {
        ++field65;
        int var4 = class379.field5711[arg2];
        int var5 = class170.field2509[arg1];
        if (arg0 != 1) {
            this.method31(121, 111, 108);
        }
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class310.field4779 = arg2;
            class268.field3994 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class310.field4779 = arg1;
            class268.field3994 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class268.field3994 = arg2;
            class310.field4779 = class367.field5597 - arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class268.field3994 = -arg1 + class372.field5635;
            class310.field4779 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class268.field3994 = -arg1 + class372.field5635;
            class310.field4779 = class367.field5597 - arg2;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class310.field4779 = -arg1 + class367.field5597;
            class268.field3994 = -arg2 + class372.field5635;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class268.field3994 = -arg2 + class372.field5635;
            class310.field4779 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class310.field4779 = -arg2 + class367.field5597;
            class268.field3994 = arg1;
        }
        class268.field3994 &= class142.field2133;
        class310.field4779 &= class83.field1326;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZLgk;)V")
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        if (arg1) {
            if (~arg0 == -1) {
                super.field3927 = arg2.method2765(114) == 1;
            }
            ++field66;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IB)[I")
    public final int[] method33(int arg0, byte arg1) {
        ++field64;
        if (arg1 < 40) {
            this.method32(-5, false, (class468) null);
        }
        int[] var3 = super.field3917.method41(arg0, 1);
        if (super.field3917.field91) {
            for (int var4 = 0; class367.field5597 > var4; ++var4) {
                this.method31(1, arg0, var4);
                int[] var5 = this.method1644(0, 0, class268.field3994);
                var3[var4] = var5[class310.field4779];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(IB)[[I")
    public final int[][] method34(int arg0, byte arg1) {
        ++field69;
        if (arg1 >= -45) {
            method29(-27);
        }
        int[][] var3 = super.field3912.method2649(arg0, false);
        if (super.field3912.field6681) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class367.field5597; ++var7) {
                this.method31(1, arg0, var7);
                int[][] var8 = this.method1646(0, 2, class268.field3994);
                var4[var7] = var8[0][class310.field4779];
                var5[var7] = var8[1][class310.field4779];
                var6[var7] = var8[2][class310.field4779];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V")
    public class7() {
        super(1, false);
    }
}
