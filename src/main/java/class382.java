import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class382 extends class145 {

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    private int field5357 = 0;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
    private int field5358 = 1365;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    private int field5352 = 20;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
    private int field5361 = 0;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "Ljava/lang/String;")
    public static String field5356 = "Please wait...";

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
    public static void method2371(int arg0) {
        if (arg0 <= 126) {
            method2372(-27, 49);
        }
        field5356 = null;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class382() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lap;BI)V")
    public final void method2(class289 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 == 3) {
                        this.field5361 = arg0.method1853(96);
                    }
                } else {
                    this.field5357 = arg0.method1853(116);
                }
            } else {
                this.field5352 = arg0.method1853(-55);
            }
        } else {
            this.field5358 = arg0.method1853(107);
        }
        ++field5360;
        int var5 = 97 % ((11 - arg1) / 52);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)V")
    public static final void method2372(int arg0, int arg1) {
        if (arg1 != 3628) {
            field5356 = null;
        }
        ++field5354;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        class123.method965(-122);
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    class359.method2255((byte) -59);
                }
            } else {
                class330.method2098((byte) -111);
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)I")
    public static final int method2373(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 3;
        ++field5364;
        if (~var4 == -1) {
            return arg0;
        } else if (arg2 != -5410) {
            return -46;
        } else if (~var4 == -2) {
            return arg1;
        } else {
            return ~var4 == -3 ? -arg0 + 7 : -arg1 + 7;
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)Lwd;")
    public static final class36 method2374(int arg0, int arg1) {
        int var2 = 9 % ((-39 - arg1) / 40);
        ++field5362;
        class36 var3 = (class36) class151.field2308.method2537(-56, (long) arg0);
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class187.field2707.method2633(arg0, -1, 4);
            class36 var5 = new class36();
            if (var4 != null) {
                var5.method362((byte) 25, arg0, new class289(var4));
            }
            var5.method363(-530676504, arg0);
            class151.field2308.method2542(var5, (byte) -61, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field5359;
        int var3 = -44 / ((arg1 - 16) / 49);
        int[] var4 = super.field2218.method1614(95, arg0);
        if (super.field2218.field3396) {
            for (int var5 = 0; var5 < class156.field2364; ++var5) {
                int var6 = (class229.field3181[var5] << 12) / this.field5358 + this.field5357;
                int var7 = (class134.field1902[arg0] << 12) / this.field5358 - -this.field5361;
                int var8 = var6;
                int var9 = var7;
                int var10 = var6;
                int var11 = var7;
                int var12 = var6 * var6 >> 12;
                int var13 = var7 * var7 >> 12;
                int var14;
                for (var14 = 0; var12 + var13 < 16384 && this.field5352 > var14; ++var14) {
                    var11 = (var10 * var11 >> 12) * 2 + var9;
                    var10 = -var13 + var8 + var12;
                    var13 = var11 * var11 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var4[var5] = var14 < this.field5352 + -1 ? (var14 << 12) / this.field5352 : 0;
            }
        }
        return var4;
    }
}
