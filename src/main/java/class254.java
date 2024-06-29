import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class254 {

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "[I")
    public static int[] field3708 = new int[50];

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "[I")
    public static int[] field3711 = new int[32];

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "Lpe;")
    public static class117 field3706 = new class117();

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field3712 = null;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 3)
    public static final void method1643(int arg0, String arg1, boolean arg2) {
        field3709++;
        if (arg1 == null) {
            return;
        }
        if (class184.field2479 >= 100) {
            class295.method1996(class192.field2679, (byte) -62);
            return;
        }
        String var3 = class350.method2310(arg1, (byte) 114);
        if (var3 == null) {
            return;
        }
        if (arg0 != -676617432) {
            field3712 = null;
        }
        for (int var4 = 0; var4 < class184.field2479; var4++) {
            String var8 = class350.method2310(class373.field5504[var4], (byte) 119);
            if (var8 != null && var8.equals(var3)) {
                class295.method1996(arg1 + class331.field4879, (byte) -62);
                return;
            }
            if (class335.field4962[var4] != null) {
                String var9 = class350.method2310(class335.field4962[var4], (byte) 92);
                if (var9 != null && var9.equals(var3)) {
                    class295.method1996(arg1 + class331.field4879, (byte) -62);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class391.field5714; var5++) {
            String var6 = class350.method2310(class30.field488[var5], (byte) 83);
            if (var6 != null && var6.equals(var3)) {
                class295.method1996(class106.field1396 + arg1 + class271.field3995, (byte) -62);
                return;
            }
            if (class96.field1302[var5] != null) {
                String var7 = class350.method2310(class96.field1302[var5], (byte) 123);
                if (var7 != null && var7.equals(var3)) {
                    class295.method1996(class106.field1396 + arg1 + class271.field3995, (byte) -62);
                    return;
                }
            }
        }
        if (class350.method2310(class383.field5609.field4650, (byte) 80).equals(var3)) {
            class295.method1996(class188.field2567, (byte) -62);
            return;
        }
        class140.field1797.method1833(-20379, 163);
        class95.field1296++;
        class140.field1797.method2204(class9.method61((byte) -117, arg1) + 1, arg0 ^ 0xD7ABA320);
        class140.field1797.method2214(arg1, -96);
        class140.field1797.method2204(arg2 ? 1 : 0, 8);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIII)I", line = 99)
    public static final int method1644(int arg0, int arg1, int arg2, int arg3) {
        field3707++;
        int var4 = 255 - arg0;
        if (arg2 >= -15) {
            return 116;
        } else {
            int var5 = ((arg1 & 0xFF00) * arg0 & 0xFF0000 | (arg1 & 0xFF00FF) * arg0 & 0xFF00FF00) >>> 8;
            return (((arg3 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg3 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIILdm;)V", line = 113)
    public static final void method1645(int arg0, int arg1, int arg2, int arg3, class127 arg4) {
        arg4.field1654 = (arg1 << 7) + 64;
        arg4.field1650 = arg3;
        arg4.field1659 = (arg2 << 7) + 64;
        class77 var5 = class106.field1405[arg0][arg1][arg2];
        if (var5 != null) {
            int var6 = 0;
            for (class356 var7 = var5.field1064; var7 != null; var7 = var7.field5275) {
                if (var7.field5274.field5933) {
                    int var8 = var7.field5274.method345(48);
                    if (var8 != -32768 && var8 < var6) {
                        var6 = var8;
                    }
                }
            }
            if (var6 < 0) {
                arg4.field1650 += var6;
                arg4.field1661 = true;
            }
        }
        if (class106.field1405[arg0][arg1][arg2] == null) {
            class267.method1787(arg0, arg1, arg2);
        }
        class106.field1405[arg0][arg1][arg2].field1078 = arg4;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V", line = 158)
    public static void method1646(int arg0) {
        int var1 = -99 % ((arg0 - 65) / 34);
        field3712 = null;
        field3706 = null;
        field3711 = null;
        field3708 = null;
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V", line = 189)
    public static final void method1647(int arg0) {
        field3710++;
        if (class24.field433 == 0) {
            return;
        }
        try {
            if (++class25.field448 > 1500) {
                if (class290.field4380 != null) {
                    class290.field4380.method2360((byte) 78);
                    class290.field4380 = null;
                }
                if (class48.field749 >= 1) {
                    class24.field433 = 0;
                    class241.field3371 = -5;
                    return;
                }
                class25.field448 = 0;
                if (class341.field5058 == class112.field1451) {
                    class112.field1451 = class208.field2832;
                } else {
                    class112.field1451 = class341.field5058;
                }
                class48.field749++;
                class24.field433 = 1;
            }
            if (class24.field433 == arg0) {
                class184.field2477 = class63.field948.method2385(0, class112.field1451, class322.field4800);
                class24.field433 = 2;
            }
            if (class24.field433 == 2) {
                if (class184.field2477.field3104 == 2) {
                    throw new IOException();
                }
                if (class184.field2477.field3104 != 1) {
                    return;
                }
                class290.field4380 = new class359((Socket) class184.field2477.field3105, class63.field948);
                class184.field2477 = null;
                class290.field4380.method2365(class140.field1797.field5042, class140.field1797.field5049, 5000, 0);
                if (class78.field1088 != null) {
                    class78.field1088.method2536(0);
                }
                if (class261.field3836 != null) {
                    class261.field3836.method2536(0);
                }
                int var1 = class290.field4380.method2362(arg0 ^ 0x6C01);
                if (class78.field1088 != null) {
                    class78.field1088.method2536(0);
                }
                if (class261.field3836 != null) {
                    class261.field3836.method2536(0);
                }
                if (var1 != 101) {
                    class24.field433 = 0;
                    class241.field3371 = var1;
                    class290.field4380.method2360((byte) 73);
                    class290.field4380 = null;
                    return;
                }
                class24.field433 = 3;
            }
            if (class24.field433 == 3 && class290.field4380.method2359(true) >= 2) {
                int var2 = class290.field4380.method2362(27648) << 8 | class290.field4380.method2362(arg0 + 27647);
                class106.method807(true, var2);
                if (class13.field209 == -1) {
                    class241.field3371 = 6;
                    class24.field433 = 0;
                    class290.field4380.method2360((byte) 68);
                    class290.field4380 = null;
                } else {
                    class24.field433 = 0;
                    class290.field4380.method2360((byte) -66);
                    class290.field4380 = null;
                    class273.method1808(false);
                }
            }
        } catch (IOException var3) {
            if (class290.field4380 != null) {
                class290.field4380.method2360((byte) -110);
                class290.field4380 = null;
            }
            if (class48.field749 >= 1) {
                class24.field433 = 0;
                class241.field3371 = -4;
            } else {
                if (class341.field5058 == class112.field1451) {
                    class112.field1451 = class208.field2832;
                } else {
                    class112.field1451 = class341.field5058;
                }
                class25.field448 = 0;
                class48.field749++;
                class24.field433 = 1;
            }
        }
    }
}
