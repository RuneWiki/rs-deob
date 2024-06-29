import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class378 extends class82 {

    @OriginalMember(owner = "client!pr", name = "L", descriptor = "I")
    private int field5026 = 0;

    @OriginalMember(owner = "client!pr", name = "O", descriptor = "I")
    private int field5029 = 1365;

    @OriginalMember(owner = "client!pr", name = "N", descriptor = "I")
    private int field5028 = 0;

    @OriginalMember(owner = "client!pr", name = "T", descriptor = "I")
    private int field5034 = 20;

    @OriginalMember(owner = "client!pr", name = "Q", descriptor = "Lvj;")
    public static class373 field5031 = new class373(88, 8);

    @OriginalMember(owner = "client!pr", name = "M", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!pr", name = "P", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!pr", name = "R", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!pr", name = "S", descriptor = "Lvj;")
    public static class373 field5033;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(II)[I")
    public final int[] method201(int arg0, int arg1) {
        ++field5027;
        if (arg1 != 12218) {
            method2197(77, 90, true, -52, -66, 110);
        }
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (super.field990.field3641) {
            for (int var4 = 0; ~var4 > ~class629.field9033; ++var4) {
                int var5 = (class366.field4817[var4] << 12) / this.field5029 + this.field5026;
                int var6 = (class85.field1036[arg0] << 12) / this.field5029 + this.field5028;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && ~this.field5034 < ~var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var7 + var11 + -var12;
                    var12 = var10 * var10 >> 12;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = var13 >= this.field5034 + -1 ? 0 : (var13 << 12) / this.field5034;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIZIII)V")
    public static final void method2197(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (class110.field1367 != null && (~arg0 != -4 || class565.field8299.field2174 != arg1 || class565.field8299.field2179 != arg4)) {
            class643.method3703(class74.field873, class110.field1367, (byte) 98);
            class110.field1367 = null;
        }
        ++field5030;
        if (arg0 == 3 && class110.field1367 == null) {
            class110.field1367 = class644.method3719(-2193, 0, arg4, class74.field873, arg1, 0);
            if (class110.field1367 != null) {
                class565.field8299.field2179 = arg4;
                class565.field8299.field2174 = arg1;
                class565.field8299.method3585(true, class74.field873);
            }
        }
        if (~arg0 == -4 && class110.field1367 == null) {
            method2197(class565.field8299.field2168, -1, true, arg3, -1, 72);
        } else {
            Container var6;
            if (class110.field1367 == null) {
                if (class431.field5843 == null) {
                    var6 = class74.field873.field2014;
                    class7.field56 = var6.getSize().width;
                    class202.field2423 = var6.getSize().height;
                } else {
                    Insets var7 = class431.field5843.getInsets();
                    class7.field56 = class431.field5843.getSize().width + -var7.left - var7.right;
                    int var10001 = -var7.top;
                    class202.field2423 = class431.field5843.getSize().height + var10001 + -var7.bottom;
                    var6 = class431.field5843;
                }
            } else {
                var6 = class110.field1367;
                class7.field56 = arg1;
                class202.field2423 = arg4;
            }
            if (arg0 != 1) {
                if (class252.field3258 < 96 && ~class529.field7429 == -1) {
                    int var8 = class7.field56 > 1024 ? 1024 : class7.field56;
                    class157.field1906 = (-var8 + class7.field56) / 2;
                    int var9 = ~class202.field2423 >= -769 ? class202.field2423 : 768;
                    class185.field2239 = var8;
                    class244.field3133 = 0;
                    class426.field5495 = var9;
                } else {
                    class244.field3133 = 0;
                    class426.field5495 = class202.field2423;
                    class157.field1906 = 0;
                    class185.field2239 = class7.field56;
                }
            } else {
                class244.field3133 = 0;
                class426.field5495 = class381.field5050;
                class185.field2239 = class168.field2051;
                class157.field1906 = (-class168.field2051 + class7.field56) / 2;
            }
            if (class507.field7033 != class36.field282) {
                boolean var10000;
                if (~class185.field2239 > -1025 && ~class426.field5495 > -769) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            if (!arg2) {
                class41.field331.setSize(class185.field2239, class426.field5495);
                class210.field2560.method268(class41.field331);
                if (class431.field5843 == var6) {
                    Insets var10 = class431.field5843.getInsets();
                    class41.field331.setLocation(class157.field1906 + var10.left, var10.top - -class244.field3133);
                } else {
                    class41.field331.setLocation(class157.field1906, class244.field3133);
                }
            } else {
                class81.method473(20860);
            }
            if (arg0 < 2) {
                class137.field1675 = false;
            } else {
                class137.field1675 = true;
            }
            if (class599.field8668 != -1) {
                class194.method1059(true, true);
            }
            if (class597.field8642 != null && class524.method2978(class137.field1671, 114)) {
                class37.method205((byte) -106);
            }
            for (int var11 = 0; var11 < 100; ++var11) {
                class371.field4888[var11] = true;
            }
            int var12 = -76 / ((arg5 - -65) / 60);
            class191.field2306 = true;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IILos;)V")
    public final void method198(int arg0, int arg1, class374 arg2) {
        ++field5032;
        int var4 = -47 / ((arg1 - -69) / 42);
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 == 3) {
                        this.field5028 = arg2.method2136(false);
                    }
                } else {
                    this.field5026 = arg2.method2136(false);
                }
            } else {
                this.field5034 = arg2.method2136(false);
            }
        } else {
            this.field5029 = arg2.method2136(false);
        }
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V")
    public class378() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "(I)V")
    public static void method2198(int arg0) {
        field5031 = null;
        if (arg0 == 768) {
            field5033 = null;
        }
    }
}
