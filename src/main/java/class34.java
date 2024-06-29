import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class34 implements class758 {

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "Lua;")
    private class663 field371;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    public static int field365 = 0;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public static int field367 = 0;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "[I")
    public static int[] field368 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "Ldh;")
    public static class320 field370 = new class320(98, 6);

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "Z")
    public static boolean field372;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIII)V")
    public static final void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field364++;
        if (arg4 != 8 && arg4 != 16) {
            class691 var7 = class638.field9170[arg6][arg2][arg5];
            if (var7 == null) {
                var7 = new class691(arg6);
            }
            if (arg4 == 1) {
                var7.field9724 = (short) arg1;
                var7.field9726 = (short) arg3;
            } else if (arg4 == 2) {
                var7.field9730 = (short) arg3;
                var7.field9734 = (short) arg1;
            }
            if (class119.field1229) {
                class622.method3558((byte) 102);
            }
        } else if (arg4 == 8) {
            int var8 = arg2 << class748.field10430;
            int var9 = class559.field7987 + var8;
            int var10 = arg5 << class748.field10430;
            int var11 = class559.field7987 + var10;
            int var12 = class11.field88[arg6].method1671(arg5, arg2, (byte) -122);
            int var13 = class11.field88[arg6].method1671(arg5 + 1, arg2 + 1, (byte) 90);
            class675.field9565[class382.field5231++] = new class464(arg4, arg6, var8, var9, var9, var8, var12, var13, var13 - arg1, -arg1 + var12, var10, var11, var11, var10);
        } else {
            int var14 = (arg2 << class748.field10430) + class559.field7987;
            int var15 = var14 - class559.field7987;
            int var16 = arg5 << class748.field10430;
            int var17 = var16 + class559.field7987;
            int var18 = class11.field88[arg6].method1671(arg5, arg2 + 1, (byte) 125);
            int var19 = class11.field88[arg6].method1671(arg5 + 1, arg2, (byte) 122);
            class675.field9565[class382.field5231++] = new class464(arg4, arg6, var14, var15, var15, var14, var18, var19, var19 - arg1, -arg1 + var18, var16, var17, var17, var16);
        }
        int var20 = 62 / ((-arg0 - 19) / 60);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZI)V")
    public final void method12(boolean arg0, int arg1) {
        field366++;
        if (arg0) {
            class275.field3370.method370(0, 0, class705.field9926, class476.field6777, this.field371.field9441, 0);
        }
        int var3 = -111 / ((-arg1 - 56) / 42);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)Z")
    public final boolean method9(byte arg0) {
        field363++;
        return arg0 == 119 ? true : true;
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)V")
    public static void method159(int arg0) {
        field370 = null;
        field368 = null;
        if (arg0 != 2) {
            method158(-19, 92, 123, 31, -78, -47, 16);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
    public final void method11(int arg0) {
        field369++;
        if (arg0 != 23169) {
            method158(-89, -98, 7, 16, -128, 16, 105);
        }
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lua;)V")
    public class34(class663 arg0) {
        this.field371 = arg0;
    }
}
