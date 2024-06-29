import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class266 extends class444 {

    @OriginalMember(owner = "client!oaa", name = "z", descriptor = "I")
    public int field3697 = (int) (class681.method3802(-23600) / 1000L);

    @OriginalMember(owner = "client!oaa", name = "t", descriptor = "S")
    public short field3691;

    @OriginalMember(owner = "client!oaa", name = "x", descriptor = "Ljava/lang/String;")
    public String field3695;

    @OriginalMember(owner = "client!oaa", name = "s", descriptor = "Lcu;")
    public static class206 field3690 = new class206(75, 2);

    @OriginalMember(owner = "client!oaa", name = "A", descriptor = "Lqw;")
    public static class71 field3698 = new class71(12, 19);

    @OriginalMember(owner = "client!oaa", name = "u", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!oaa", name = "v", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!oaa", name = "w", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!oaa", name = "y", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!oaa", name = "B", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIBIIIIIII)V", line = 4)
    public static final void method1623(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3694++;
        if (!class269.method1639(arg5, 0)) {
            return;
        }
        if (arg2 != -4) {
            method1628(22, null);
        }
        if (class699.field9814[arg5] == null) {
            client.method1681(class601.field7977[arg5], -1, arg0, arg7, arg1, arg9, arg4, arg3, arg6, arg8);
        } else {
            client.method1681(class699.field9814[arg5], -1, arg0, arg7, arg1, arg9, arg4, arg3, arg6, arg8);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZIBI)Lbi;", line = 29)
    public static final class449 method1624(boolean arg0, int arg1, byte arg2, int arg3) {
        field3699++;
        class685 var4 = null;
        if (class563.field7465 != null) {
            var4 = new class685(arg1, class563.field7465, class176.field2708[arg1], 1000000);
        }
        class47.field677[arg1] = class318.field4365.method1510(arg1, var4, -91, class703.field9901);
        class47.field677[arg1].method181((byte) 125);
        if (arg2 != -15) {
            method1628(-21, null);
        }
        return new class449(class47.field677[arg1], arg0, arg3);
    }

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "(I)V", line = 50)
    public static void method1625(int arg0) {
        field3698 = null;
        if (arg0 == -8501) {
            field3690 = null;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIIBI)V", line = 65)
    public static final void method1626(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        class149[] var7 = class129.field2154;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class149 var9 = var7[var8];
            if (var9 != null && var9.field2385 == 2) {
                class164.method1129(true, var9.field2380, arg0 >> 1, arg4, arg2 >> 1, var9.field2377, arg3, var9.field2390, var9.field2375 * 2);
                if (class601.field7980[0] > -1 && class642.field8626 % 20 < 10) {
                    class179.field2737[var9.field2389].method2637(arg1 + class601.field7980[0] - 12, class601.field7980[1] + -28 + arg6);
                }
            }
        }
        field3692++;
        if (arg5 >= -113) {
            method1628(-62, null);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZILr;)V", line = 98)
    public static final void method1627(int arg0, boolean arg1, int arg2, class170 arg3) {
        class105.field1570[arg2][arg0] = arg3;
        if (!arg1) {
            field3693++;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 108)
    public class266(String arg0, int arg1) {
        this.field3691 = (short) arg1;
        this.field3695 = arg0;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I[B)V", line = 123)
    public static final void method1628(int arg0, byte[] arg1) {
        if (arg0 != 4) {
            return;
        }
        field3696++;
        class335 var2 = new class335(arg1);
        while (true) {
            while (true) {
                int var3 = var2.method2034(255);
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int[] var4 = class394.field5200 = new int[6];
                    var4[0] = var2.method2001((byte) -83);
                    var4[1] = var2.method2001((byte) -83);
                    var4[2] = var2.method2001((byte) -83);
                    var4[3] = var2.method2001((byte) -83);
                    var4[4] = var2.method2001((byte) -83);
                    var4[5] = var2.method2001((byte) -83);
                } else if (var3 == 4) {
                    int var7 = var2.method2034(255);
                    class418.field5718 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        class418.field5718[var8] = var2.method2001((byte) -83);
                        if (class418.field5718[var8] == 65535) {
                            class418.field5718[var8] = -1;
                        }
                    }
                } else if (var3 == 5) {
                    int var5 = var2.method2034(arg0 ^ 0xFB);
                    class147.field2354 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        class147.field2354[var6] = var2.method2001((byte) -83);
                        if (class147.field2354[var6] == 65535) {
                            class147.field2354[var6] = -1;
                        }
                    }
                }
            }
        }
    }
}
