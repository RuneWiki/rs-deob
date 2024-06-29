import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class138 extends class28 {

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "Z")
    public static boolean field2541 = false;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "Lqe;")
    public static class179 field2539 = class206.method1380("Verbindung mit Update)2Server)3)3)3", (byte) -128);

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "Lqe;")
    private static class179 field2543 = class206.method1380("Login limit exceeded)3", (byte) 78);

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "Lqe;")
    public static class179 field2538 = field2543;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "I")
    public int field2540;

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
    public int field2544;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "I")
    public int field2549;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "I")
    public int field2552;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "Lqe;")
    public class179 field2542;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "[I")
    public int[] field2553;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "[I")
    public int[] field2555;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "[Lnc;")
    public class144[] field2554;

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "[Lqe;")
    public class179[] field2545;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)V")
    public static void method875(boolean arg0) {
        field2538 = null;
        field2539 = null;
        field2543 = null;
        if (!arg0) {
            field2539 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ldg;IIIIII)V")
    public static final void method876(class40 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2556++;
        long var7 = 0L;
        boolean var9 = true;
        if (arg5 == 0) {
            var7 = class239.method1551(arg4, arg3, arg6);
        }
        if (arg2 != 4884) {
            field2547 = -66;
        }
        if (arg5 == 1) {
            var7 = class67.method435(arg4, arg3, arg6);
        }
        if (arg5 == 2) {
            var7 = class199.method1324(arg4, arg3, arg6);
        }
        boolean var10 = false;
        if (arg5 == 3) {
            var7 = class108.method707(arg4, arg3, arg6);
        }
        boolean var11 = false;
        if (var7 == 0L) {
            return;
        }
        int var12 = (int) var7 >> 14 & 0x1F;
        int var13 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        int var14 = (int) var7 >> 20 & 0x3;
        class134 var15 = class114.method735((byte) -77, var13);
        if (arg5 == 0) {
            class111.method720(arg4, arg3, arg6);
            if (var15.field2443 != 0) {
                arg0.method255(arg3, 16, var14, var12, var15.field2477, arg6);
            }
        }
        if (arg5 == 1) {
            class3.method18(arg4, arg3, arg6);
        }
        if (arg5 == 2) {
            class116.method745(arg4, arg3, arg6);
            if (var15.field2443 != 0 && var15.field2442 + arg3 < 104 && var15.field2442 + arg6 < 104 && arg3 + var15.field2430 < 104 && var15.field2430 + arg6 < 104) {
                arg0.method266(var15.field2430, false, arg3, arg6, var15.field2477, var15.field2442, var14);
            }
        }
        if (arg5 != 3) {
            return;
        }
        class74.method469(arg4, arg3, arg6);
        if (var15.field2443 == 1) {
            arg0.method263(arg6, arg3, -5502);
            return;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)I")
    public static final int method877(int arg0, byte arg1) {
        int var2 = 43 / ((-arg1 - 27) / 46);
        field2546++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method878(byte arg0, byte[] arg1) {
        if (arg0 < 68) {
            return null;
        }
        class185 var2 = new class185(arg1);
        field2550++;
        int var3 = var2.method1243(3);
        int var4 = var2.method1231(-4898);
        if (var4 < 0 || class206.field3848 != 0 && class206.field3848 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1254(0, var4, (byte) 127, var7);
            return var7;
        } else {
            int var5 = var2.method1231(-4898);
            if (var5 < 0 || class206.field3848 != 0 && class206.field3848 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class140.method885(var6, var5, arg1, var4, 9);
            } else {
                class159.field2863.method416(var6, (byte) -42, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lae;IIIBLnb;I)V")
    public static final void method879(class6 arg0, int arg1, int arg2, int arg3, byte arg4, class143 arg5, int arg6) {
        field2551++;
        if (arg5 == null) {
            return;
        }
        int var7 = class236.field4342 + class143.field2608 & 0x7FF;
        int var8 = arg1 * arg1 + arg6 * arg6;
        if (arg4 != -19) {
            field2538 = null;
        }
        int var9 = Math.max(arg0.field169 / 2, arg0.field73 / 2) + 10;
        if (var9 * var9 < var8) {
            return;
        }
        int var10 = class27.field612[var7];
        int var11 = var10 * 256 / (class68.field1364 + 256);
        int var12 = class27.field600[var7];
        int var13 = var12 * 256 / (class68.field1364 + 256);
        int var14 = arg1 * var13 - arg6 * var11 >> 16;
        int var15 = arg1 * var11 + arg6 * var13 >> 16;
        ((class126) arg5).method811(arg0.field169 / 2 + arg2 + var15 - arg5.field2603 / 2, arg3 - arg5.field2590 / 2 + arg0.field73 / 2 + -var14, arg0.field225, arg0.field74);
    }
}
