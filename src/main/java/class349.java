import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class349 {

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field4879 = 0;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "Z")
    public static boolean field4882 = false;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field4883 = 0;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "[I")
    public static int[] field4877;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V")
    public static final void method2230(int arg0, int arg1) {
        field4880++;
        class399 var2 = class269.method1655(4, arg1, arg0 ^ 0x4B);
        if (arg0 != -5) {
            field4879 = -46;
        }
        var2.method2582(0);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILrg;)Z")
    public static final boolean method2231(int arg0, class383 arg1) {
        field4878++;
        if (arg1.field5502 == null) {
            return false;
        }
        int var2 = -102 % ((arg0 + 22) / 49);
        for (int var3 = 0; var3 < arg1.field5502.length; var3++) {
            int var4 = class276.method1693(false, var3, arg1);
            int var5 = arg1.field5527[var3];
            if (arg1.field5502[var3] == 2) {
                if (var5 <= var4) {
                    return false;
                }
            } else if (arg1.field5502[var3] == 3) {
                if (var4 <= var5) {
                    return false;
                }
            } else if (arg1.field5502[var3] == 4) {
                if (var4 == var5) {
                    return false;
                }
            } else if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
    public static final void method2232(byte arg0) {
        field4876++;
        if (arg0 < 62) {
            field4879 = 107;
        }
        for (class326 var1 = (class326) class365.field5111.method1312((byte) 25); var1 != null; var1 = (class326) class365.field5111.method1304(-62)) {
            class232 var2 = var1.field4449;
            if (class265.field3617 != var2.field6198 || var2.field3121) {
                var1.method2459(198);
                var2.method1464((byte) 121);
            } else if (var2.field3118 <= class35.field541) {
                var2.method1458(4, class63.field980);
                if (var2.field3121) {
                    var1.method2459(198);
                } else {
                    class259.method1601(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)V")
    public static void method2233(byte arg0) {
        if (arg0 == 122) {
            field4877 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lqj;IZI)Ldi;")
    public static final class65 method2234(class296 arg0, int arg1, boolean arg2, int arg3) {
        field4881++;
        byte[] var4 = arg0.method1920(arg3, !arg2, arg1);
        if (var4 == null) {
            return null;
        } else {
            if (!arg2) {
                method2233((byte) 100);
            }
            return new class65(var4);
        }
    }
}
