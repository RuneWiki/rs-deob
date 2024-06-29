import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class195 extends class17 {

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
    private int field2765;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "(I)Z")
    public static final boolean method1231(int arg0) {
        ++field2766;
        if (arg0 != 0) {
            return false;
        } else {
            return class37.field408 > 0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I)V")
    public class195(int arg0) {
        super(0, true);
        this.field2765 = 4096;
        this.field2765 = arg0;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class195() {
        this(4096);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)V")
    public static final void method1232(int arg0, int arg1, int arg2, int arg3) {
        ++field2763;
        int var4 = class441.field6171 + arg0;
        int var5 = class367.field5241 + arg2;
        if (class268.field3910 != null && ~arg0 <= -1 && arg2 >= 0 && class43.field494 > arg0 && arg2 < class500.field7068) {
            long var6 = (long) (arg1 << 28 | var5 << 14 | var4);
            class176 var8 = (class176) class62.field773.method2405(var6, -115);
            if (var8 == null) {
                class464.method2698(arg1, arg0, arg2);
            } else {
                class25 var9 = (class25) var8.field2531.method2655(15152);
                if (var9 == null) {
                    class464.method2698(arg1, arg0, arg2);
                } else {
                    class430 var10 = (class430) class464.method2698(arg1, arg0, arg2);
                    if (var10 != null) {
                        var10.field6060 = var10.field6063 = -1;
                    } else {
                        var10 = new class430();
                    }
                    var10.field6065 = var9.field311;
                    var10.field6070 = var9.field309;
                    label51: while (true) {
                        class25 var11 = (class25) var8.field2531.method2660((byte) 67);
                        if (var11 == null) {
                            break;
                        }
                        if (~var10.field6070 != ~var11.field309) {
                            var10.field6060 = var11.field309;
                            var10.field6062 = var11.field311;
                            while (true) {
                                class25 var12 = (class25) var8.field2531.method2660((byte) 67);
                                if (var12 == null) {
                                    break label51;
                                }
                                if (~var10.field6070 != ~var12.field309 && ~var10.field6060 != ~var12.field309) {
                                    var10.field6063 = var12.field309;
                                    var10.field6061 = var12.field311;
                                }
                            }
                        }
                    }
                    int var13 = class488.method2817((arg0 << 7) + 64, true, (arg2 << 7) + 64, arg1);
                    class523.method3091(arg1, arg0, arg2, var13, var10);
                    if (arg3 == 4915) {
                        ;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field2764;
        int[] var3 = super.field210.method2683(-17, arg0);
        if (arg1 < 53) {
            return null;
        } else {
            if (super.field210.field6442) {
                class182.method1137(var3, 0, class530.field7763, this.field2765);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lwm;II)V")
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (arg2 == 5159) {
            if (~arg1 == -1) {
                this.field2765 = (arg0.method2357((byte) 127) << 12) / 255;
            }
            ++field2762;
        }
    }
}
