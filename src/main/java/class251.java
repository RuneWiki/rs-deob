import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class251 extends class147 {

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "S")
    public short field3521;

    @OriginalMember(owner = "client!aq", name = "u", descriptor = "Lab;")
    public static class256 field3527 = null;

    @OriginalMember(owner = "client!aq", name = "s", descriptor = "[Lwi;")
    public static class231[] field3525 = new class231[8];

    @OriginalMember(owner = "client!aq", name = "r", descriptor = "Lqq;")
    public static class285 field3524 = null;

    @OriginalMember(owner = "client!aq", name = "v", descriptor = "I")
    public static int field3528 = 1407;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!aq", name = "t", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method1555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field3523++;
        int var8 = arg7 + arg4;
        int var9 = arg0 - arg4;
        for (int var10 = arg7; var10 < var8; var10++) {
            class270.method1633(class240.field3303[var10], arg3, arg5, arg1, 92);
        }
        if (arg6 < 62) {
            method1555(57, 12, -124, 25, 92, -36, (byte) -89, -74);
        }
        for (int var11 = arg0; var11 > var9; var11--) {
            class270.method1633(class240.field3303[var11], arg3, arg5, arg1, 112);
        }
        int var12 = arg1 + arg4;
        int var13 = arg3 - arg4;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class240.field3303[var14];
            class270.method1633(var15, var12, arg5, arg1, 97);
            class270.method1633(var15, var13, arg2, var12, 110);
            class270.method1633(var15, arg3, arg5, var13, 101);
        }
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(Z)V")
    public static void method1556(boolean arg0) {
        field3525 = null;
        field3527 = null;
        if (!arg0) {
            field3525 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILg;I)Lbg;")
    public static final class406 method1557(int arg0, class470 arg1, int arg2) {
        field3526++;
        byte[] var3 = arg1.method2779(1, arg2);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != 1407) {
                field3527 = null;
            }
            return new class406(var3);
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V")
    public class251() {
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(S)V")
    public class251(short arg0) {
        this.field3521 = arg0;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V")
    public static final void method1558(int arg0, int arg1) {
        field3522++;
        class210 var2 = class189.field2588;
        synchronized (class189.field2588) {
            class189.field2588.method1166(arg1, (byte) -52);
        }
        class210 var3 = class460.field6497;
        synchronized (class460.field6497) {
            class460.field6497.method1166(arg1, (byte) -52);
        }
        if (arg0 <= 97) {
            method1555(-23, -98, 68, -87, 64, -77, (byte) 57, 31);
        }
    }
}
