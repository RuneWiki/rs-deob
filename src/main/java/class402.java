import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class402 {

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "J")
    public static long field5880 = -1L;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "[I")
    public static int[] field5878 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field5881 = 0;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "[I")
    public static int[] field5883 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field5886 = -50;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method2548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5888++;
        for (int var6 = arg0; var6 <= arg2; var6++) {
            for (int var7 = arg3; var7 <= arg4; var7++) {
                if (class244.field3547[var6][var7] == arg5 && class205.field3013[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        if (arg1 != 128) {
            field5881 = -55;
        }
        return false;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)Lgb;")
    public static final class239 method2549(int arg0, int arg1) {
        if (arg1 != 128) {
            field5886 = 5;
        }
        field5884++;
        class239 var2 = (class239) client.field3636.method103(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class350.field4966.method1355(arg0, -12607, 34);
        class239 var4 = new class239();
        if (var3 != null) {
            var4.method1737(arg0, (byte) 37, new class37(var3));
        }
        client.field3636.method113(var4, 0, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)Ltg;")
    public static final class294 method2550(byte arg0) {
        int var1 = -77 / ((arg0 - 4) / 37);
        field5885++;
        return class272.field4070;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
    public static final void method2551(int arg0) {
        if (arg0 != 34) {
            method2554(47, 5, (class127) null, -74, 16, (class45) null, (byte) -56, (class98) null);
        }
        field5879++;
        client.field3636.method106((byte) -112);
        class30.field436.method106((byte) -115);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BI)Lrs;")
    public static final class238 method2552(byte arg0, int arg1) {
        field5887++;
        class238 var2 = (class238) class270.field4054.method103(0, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 >= -124) {
            return null;
        } else {
            byte[] var3 = class115.field1828.method1355(arg1, -12607, 1);
            class238 var4 = new class238();
            var4.field3430 = arg1;
            if (var3 != null) {
                var4.method1733((byte) 55, new class37(var3));
            }
            var4.method1736(false);
            if (var4.field3431 == 2 && class50.field814.method1219((long) arg1, -93) == null) {
                class50.field814.method1217(1, (long) arg1, new class9(class443.field6443));
                class218.field3225[class443.field6443++] = var4;
            }
            class270.field4054.method113(var4, 0, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
    public static void method2553(int arg0) {
        field5883 = null;
        field5878 = null;
        int var1 = 96 / ((arg0 - 61) / 49);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILqo;IILfb;BLri;)V")
    public static final void method2554(int arg0, int arg1, class127 arg2, int arg3, int arg4, class45 arg5, byte arg6, class98 arg7) {
        field5882++;
        int var8 = 59 % ((27 - arg6) / 55);
        class324 var9 = new class324();
        var9.field4675 = arg0 * 128;
        var9.field4691 = arg4 * 128;
        var9.field4688 = arg1;
        if (arg5 != null) {
            var9.field4671 = arg5;
            int var11 = arg5.field717;
            int var12 = arg5.field724;
            if (arg3 == 1 || arg3 == 3) {
                var11 = arg5.field724;
                var12 = arg5.field717;
            }
            var9.field4681 = arg5.field685;
            var9.field4684 = arg5.field677;
            var9.field4669 = arg5.field739;
            var9.field4682 = (arg4 + var12) * 128;
            var9.field4664 = arg5.field683 * 128;
            var9.field4677 = (arg0 + var11) * 128;
            var9.field4666 = arg5.field731;
            var9.field4687 = arg5.field686;
            if (arg5.field681 != null) {
                var9.field4686 = true;
                var9.method2153(0);
            }
            if (var9.field4666 != null) {
                var9.field4680 = var9.field4687 + (int) (Math.random() * (double) (var9.field4681 - var9.field4687));
            }
            class127.field2075.method148((byte) 127, var9);
        } else if (arg7 != null) {
            var9.field4672 = arg7;
            class11 var10 = arg7.field1545;
            if (var10.field135 != null) {
                var9.field4686 = true;
                var10 = var10.method75(0);
            }
            if (var10 != null) {
                var9.field4682 = (var10.field174 + arg4) * 128;
                var9.field4677 = (var10.field174 + arg0) * 128;
                var9.field4669 = class332.method2175(-104, arg7);
                var9.field4684 = var10.field185;
                var9.field4664 = var10.field164 * 128;
            }
            class30.field441.method148((byte) 77, var9);
        } else if (arg2 != null) {
            var9.field4676 = arg2;
            var9.field4677 = (arg2.method1070((byte) -50) + arg0) * 128;
            var9.field4682 = (arg4 + arg2.method1070((byte) -50)) * 128;
            var9.field4669 = class220.method1676(arg2, 21386);
            var9.field4664 = arg2.field2062 * 128;
            var9.field4684 = arg2.field2078;
            class356.field5056.method1217(1, (long) arg2.field5657, var9);
            return;
        }
    }
}
