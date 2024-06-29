import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class405 {

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "Lmu;")
    public static class303 field5940 = new class303(84, 7);

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "Z")
    public static boolean field5941 = false;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "Lmu;")
    public static class303 field5943 = new class303(20, -2);

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "[[B")
    public static byte[][] field5944 = new byte[250][];

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
    public static int field5942;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ns", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field5945;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ns", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field5946;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2528(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V", line = 4)
    public static void method2524(int arg0) {
        if (arg0 == 2767) {
            field5944 = null;
            field5943 = null;
            field5940 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V", line = 18)
    public static final void method2525(int arg0) {
        field5942++;
        class693.field9368.method2065((byte) 74, class693.field9368.field4452, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4458, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4447, 2);
        class693.field9368.method2065((byte) 74, class693.field9368.field4461, 2);
        class693.field9368.method2065((byte) 74, class693.field9368.field4417, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4453, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4433, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4443, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4467, 1);
        if (arg0 < 45) {
            return;
        }
        class693.field9368.method2065((byte) 74, class693.field9368.field4432, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4435, 2);
        class693.field9368.method2065((byte) 74, class693.field9368.field4427, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4456, 2);
        class693.field9368.method2065((byte) 74, class693.field9368.field4444, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4413, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4445, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4421, 2);
        class693.field9368.method2065((byte) 74, class693.field9368.field4423, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4440, 0);
        class254.method1731(-127);
        class693.field9368.method2065((byte) 74, class693.field9368.field4428, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4426, 4);
        class297.method1947(-1);
        class440.method2652(true);
        class274.field3858 = true;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lua;IIILke;)V", line = 57)
    public static final void method2526(class665 arg0, int arg1, int arg2, int arg3, class598 arg4) {
        field5938++;
        if (arg3 < 41) {
            return;
        }
        byte var5 = -1;
        if ((arg2 & 0x1) != 0) {
            int var6 = arg0.method1478(842397944);
            if (var6 == 65535) {
                var6 = -1;
            }
            arg4.field5701 = var6;
        }
        if ((arg2 & 0x10000) != 0) {
            int var7 = arg0.method1535(255);
            int[] var8 = new int[var7];
            int[] var9 = new int[var7];
            for (int var10 = 0; var10 < var7; var10++) {
                int var11 = arg0.method1506(-118);
                if ((var11 & 0xC000) == 49152) {
                    int var12 = arg0.method1521(false);
                    var8[var10] = class418.method2577(var11 << 16, var12);
                } else {
                    var8[var10] = var11;
                }
                var9[var10] = arg0.method1521(false);
            }
            arg4.method2451(var9, var8, -116);
        }
        if ((arg2 & 0x400) != 0) {
            int var13 = arg0.method1521(false);
            arg4.field5653 = arg0.method1490((byte) -94);
            arg4.field5697 = arg0.method1490((byte) -104);
            arg4.field5636 = var13 & 0x7FFF;
            arg4.field5652 = (var13 & 0x8000) != 0;
            arg4.field5713 = class641.field8810 + arg4.field5653 + arg4.field5636;
        }
        if ((arg2 & 0x1000) != 0) {
            arg4.field5718 = arg0.method1525((byte) 110);
            if (arg4.field5718.charAt(0) == '~') {
                arg4.field5718 = arg4.field5718.substring(1);
                class128.method1064(arg4.method3398(false, -70), 2, (byte) -116, 0, arg4.field5718, arg4.method3404(true, 255), arg4.field8182);
            } else if (class58.field1147 == arg4) {
                class128.method1064(arg4.method3398(false, -88), 2, (byte) -102, 0, arg4.field5718, arg4.method3404(true, 255), arg4.field8182);
            }
            arg4.field5690 = 150;
            arg4.field5660 = 0;
            arg4.field5627 = 0;
        }
        if ((arg2 & 0x4) != 0) {
            int var14 = arg0.method1477((byte) 21);
            if (var14 > 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    int var16 = -1;
                    int var17 = -1;
                    int var18 = arg0.method1530(-127);
                    int var19 = -1;
                    if (var18 == 32767) {
                        var18 = arg0.method1530(-125);
                        var17 = arg0.method1530(-126);
                        var16 = arg0.method1530(-128);
                        var19 = arg0.method1530(-122);
                    } else if (var18 == 32766) {
                        var18 = -1;
                    } else {
                        var17 = arg0.method1530(-117);
                    }
                    int var20 = arg0.method1530(-123);
                    int var21 = arg0.method1541((byte) -98);
                    arg4.method2459(var17, class641.field8810, var18, var19, var16, var20, var21, (byte) 102);
                }
            }
        }
        if ((arg2 & 0x2) != 0) {
            arg4.field8169 = arg0.method1478(842397944);
            if (arg4.field5745 == 0) {
                arg4.method2461((byte) 49, arg4.field8169);
                arg4.field8169 = -1;
            }
        }
        if ((arg2 & 0x8000) != 0) {
            arg4.field8199 = arg0.method1541((byte) -94) == 1;
        }
        if ((arg2 & 0x100) != 0) {
            int var22 = arg0.method1477((byte) 21);
            int[] var23 = new int[var22];
            int[] var24 = new int[var22];
            int[] var25 = new int[var22];
            for (int var26 = 0; var26 < var22; var26++) {
                int var27 = arg0.method1478(842397944);
                if (var27 == 65535) {
                    var27 = -1;
                }
                var23[var26] = var27;
                var24[var26] = arg0.method1477((byte) 21);
                var25[var26] = arg0.method1478(842397944);
            }
            class534.method3079((byte) -116, arg4, var25, var23, var24);
        }
        if ((arg2 & 0x2000) != 0) {
            arg4.field5719 = arg0.method1536(-121);
            arg4.field5740 = arg0.method1493(-27697);
            arg4.field5667 = arg0.method1509(-622951480);
            arg4.field5714 = arg0.method1509(-622951480);
            arg4.field5665 = arg0.method1506(-118) + class641.field8810;
            arg4.field5726 = arg0.method1503(19) + class641.field8810;
            arg4.field5657 = arg0.method1535(255);
            arg4.field5748 = 0;
            if (arg4.field8184) {
                arg4.field5714 += arg4.field8176;
                arg4.field5719 += arg4.field8194;
                arg4.field5740 += arg4.field8176;
                arg4.field5667 += arg4.field8194;
                arg4.field5745 = 0;
            } else {
                arg4.field5667 += arg4.field5746[0];
                arg4.field5714 += arg4.field5743[0];
                arg4.field5745 = 1;
                arg4.field5740 += arg4.field5743[0];
                arg4.field5719 += arg4.field5746[0];
            }
        }
        if ((arg2 & 0x200) != 0) {
            int var28 = arg0.method1506(-107);
            if (var28 == 65535) {
                var28 = -1;
            }
            int var29 = arg0.method1512((byte) -121);
            int var30 = arg0.method1490((byte) 54);
            int var31 = var30 & 0x7;
            int var32 = var30 >> 3 & 0xF;
            if (var32 == 15) {
                var32 = -1;
            }
            arg4.method2458(var31, var28, -1012294866, var32, true, var29);
        }
        if ((arg2 & 0x40000) != 0) {
            arg4.field5681 = arg0.method1509(-622951480);
            arg4.field5632 = arg0.method1536(-99);
            arg4.field5696 = arg0.method1536(-87);
            arg4.field5705 = (byte) arg0.method1535(255);
            arg4.field5674 = class641.field8810 + arg0.method1506(-120);
            arg4.field5676 = class641.field8810 + arg0.method1503(125);
        }
        if ((arg2 & 0x80) != 0) {
            class318.field4386[arg1] = arg0.method1493(-27697);
        }
        if ((arg2 & 0x20) != 0) {
            int var33 = arg0.method1506(-126);
            if (var33 == 65535) {
                var33 = -1;
            }
            int var34 = arg0.method1494(255);
            int var35 = arg0.method1541((byte) -125);
            int var36 = var35 & 0x7;
            int var37 = (var35 & 0x78) >> 3;
            if (var37 == 15) {
                var37 = -1;
            }
            arg4.method2458(var36, var33, -1012294866, var37, false, var34);
        }
        if ((arg2 & 0x8) != 0) {
            int[] var38 = new int[4];
            for (int var39 = 0; var39 < 4; var39++) {
                var38[var39] = arg0.method1503(123);
                if (var38[var39] == 65535) {
                    var38[var39] = -1;
                }
            }
            int var40 = arg0.method1541((byte) -101);
            class218.method1559(23946, var38, var40, arg4);
        }
        if ((arg2 & 0x10) != 0) {
            int var41 = arg0.method1535(255);
            byte[] var42 = new byte[var41];
            class215 var43 = new class215(var42);
            arg0.method1495(var42, 0, var41, (byte) -124);
            class627.field8638[arg1] = var43;
            arg4.method3400((byte) 84, var43);
        }
        if ((arg2 & 0x800) != 0) {
            var5 = arg0.method1509(-622951480);
        }
        if (!arg4.field8184) {
            return;
        }
        if (var5 == 127) {
            arg4.method3397(arg4.field8176, arg4.field8194, (byte) 84);
            return;
        }
        byte var44;
        if (var5 == -1) {
            var44 = class318.field4386[arg1];
        } else {
            var44 = var5;
        }
        class147.method1167(arg4, var44, -21);
        arg4.method3403(arg4.field8176, -26443, var44, arg4.field8194);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V", line = 405)
    public static final synchronized void method2527(byte arg0) {
        field5939++;
        if (class445.field6328 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            Object var3 = var2.invoke(null, (Object[]) null);
            if (arg0 == 26) {
                Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field5945 == null ? (field5945 = method2528("java.lang.String")) : field5945, field5946 == null ? (field5946 = method2528("java.lang.Class")) : field5946);
                class445.field6328 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
            }
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }
}
