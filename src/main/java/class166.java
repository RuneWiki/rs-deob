import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class166 {

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "Ls;")
    public class381 field2454 = new class381();

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "Ljava/lang/String;")
    public static String field2465 = null;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "Z")
    public static boolean field2449 = true;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public static int field2464 = 0;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public static int field2472 = 0;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "Z")
    public static boolean field2473 = false;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "Ls;")
    private class381 field2474;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "Lrk;")
    public static class427 field2453;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "Lrk;")
    public static class427 field2467;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fi", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field2475;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZIBII)V")
    public static final void method1234(boolean arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 34) {
            field2449 = true;
        }
        field2455++;
        if (class15.method76(arg2 - 28, arg3)) {
            class296.method1906(arg1, arg4, (byte) 109, -1, class291.field3949[arg3], arg0);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)I")
    public static final int method1235(int arg0, int arg1, int arg2) {
        field2466++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg1 >>= 0x1;
        }
        if (arg2 != -1) {
            method1253(-27);
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lfi;B)V")
    public final void method1236(class166 arg0, byte arg1) {
        if (arg1 != 18) {
            this.method1236((class166) null, (byte) 45);
        }
        this.method1237((byte) 4, arg0, this.field2454.field5346);
        field2470++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLfi;Ls;)V")
    private final void method1237(byte arg0, class166 arg1, class381 arg2) {
        field2459++;
        if (arg0 != 4) {
            field2464 = -106;
        }
        class381 var4 = this.field2454.field5348;
        this.field2454.field5348 = arg2.field5348;
        arg2.field5348.field5346 = this.field2454;
        if (this.field2454 != arg2) {
            arg2.field5348 = arg1.field2454.field5348;
            arg2.field5348.field5346 = arg2;
            var4.field5346 = arg1.field2454;
            arg1.field2454.field5348 = var4;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public static final void method1238(int arg0) {
        field2458++;
        if (!class339.method2153(9) && class69.field1046 != class329.field4471) {
            class257.method1673(class95.field1379.field4998[0], false, false, class296.field3990, true, class38.field578, class69.field1046, class95.field1379.field5005[0]);
            return;
        }
        class295.method1903(124, class249.field3415);
        if (class69.field1046 != class266.field3571) {
            class100.method852((byte) -36);
        }
        int var1 = -91 / ((29 - arg0) / 61);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)Ls;")
    public final class381 method1239(boolean arg0) {
        field2462++;
        if (!arg0) {
            method1253(64);
        }
        class381 var2 = this.field2454.field5346;
        if (this.field2454 == var2) {
            return null;
        } else {
            var2.method2367(5);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)Ls;")
    public final class381 method1240(byte arg0) {
        field2448++;
        if (arg0 > -66) {
            return null;
        }
        class381 var2 = this.field2454.field5346;
        if (this.field2454 == var2) {
            this.field2474 = null;
            return null;
        } else {
            this.field2474 = var2.field5346;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIBIIIIIILoa;I)Z")
    public static final boolean method1241(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class151 arg9, int arg10) {
        field2468++;
        int var11 = arg8;
        int var12 = arg6;
        byte var13 = 64;
        if (arg2 != 86) {
            method1253(-4);
        }
        byte var14 = 64;
        int var15 = arg8 - var13;
        int var16 = arg6 - var14;
        class161.field2398[var13][var14] = 99;
        class416.field5822[var13][var14] = 0;
        byte var17 = 0;
        class358.field4854[var17] = arg8;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class52.field847[var10001] = arg6;
        int[][] var19 = arg9.field2303;
        while (var26 != var18) {
            var12 = class52.field847[var18];
            var11 = class358.field4854[var18];
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var12 - arg9.field2316;
            int var23 = var11 - arg9.field2320;
            if (arg0 == -4) {
                if (arg5 == var11 && arg7 == var12) {
                    class268.field3612 = var12;
                    class286.field3826 = var11;
                    return true;
                }
            } else if (arg0 == -3) {
                if (class448.method2791(arg10, var11, arg5, (byte) -43, 1, var12, arg4, arg7, 1)) {
                    class286.field3826 = var11;
                    class268.field3612 = var12;
                    return true;
                }
            } else if (arg0 == -2) {
                if (arg9.method1161(1, arg7, var12, (byte) -100, var11, arg5, arg4, arg1, arg10, 1)) {
                    class268.field3612 = var12;
                    class286.field3826 = var11;
                    return true;
                }
            } else if (arg0 == -1) {
                if (arg9.method1156(arg1, 1, arg7, arg5, var11, 1, var12, arg10, arg4)) {
                    class268.field3612 = var12;
                    class286.field3826 = var11;
                    return true;
                }
            } else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
                if (arg9.method1155((byte) 36, 1, arg5, arg0, arg7, var11, var12, arg3)) {
                    class268.field3612 = var12;
                    class286.field3826 = var11;
                    return true;
                }
            } else if (arg9.method1165(arg0, arg3, 1, -15410, arg7, var11, var12, arg5)) {
                class268.field3612 = var12;
                class286.field3826 = var11;
                return true;
            }
            int var25 = class416.field5822[var20][var21] + 1;
            if (var20 > 0 && class161.field2398[var20 - 1][var21] == 0 && (var19[var23 - 1][var22] & 0x42240000) == 0) {
                class358.field4854[var26] = var11 - 1;
                class52.field847[var26] = var12;
                class161.field2398[var20 - 1][var21] = 2;
                var26 = var26 + 1 & 0xFFF;
                class416.field5822[var20 - 1][var21] = var25;
            }
            if (var20 < 127 && class161.field2398[var20 + 1][var21] == 0 && (var19[var23 + 1][var22] & 0x60240000) == 0) {
                class358.field4854[var26] = var11 + 1;
                class52.field847[var26] = var12;
                class161.field2398[var20 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class416.field5822[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class161.field2398[var20][var21 - 1] == 0 && (var19[var23][var22 - 1] & 0x40A40000) == 0) {
                class358.field4854[var26] = var11;
                class52.field847[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class161.field2398[var20][var21 - 1] = 1;
                class416.field5822[var20][var21 - 1] = var25;
            }
            if (var21 < 127 && class161.field2398[var20][var21 + 1] == 0 && (var19[var23][var22 + 1] & 0x48240000) == 0) {
                class358.field4854[var26] = var11;
                class52.field847[var26] = var12 + 1;
                class161.field2398[var20][var21 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class416.field5822[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class161.field2398[var20 - 1][var21 - 1] == 0 && (var19[var23 - 1][var22 - 1] & 0x43A40000) == 0 && (var19[var23 - 1][var22] & 0x42240000) == 0 && (var19[var23][var22 - 1] & 0x40A40000) == 0) {
                class358.field4854[var26] = var11 - 1;
                class52.field847[var26] = var12 - 1;
                class161.field2398[var20 - 1][var21 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class416.field5822[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 127 && var21 > 0 && class161.field2398[var20 + 1][var21 - 1] == 0 && (var19[var23 + 1][var22 - 1] & 0x60E40000) == 0 && (var19[var23 + 1][var22] & 0x60240000) == 0 && (var19[var23][var22 - 1] & 0x40A40000) == 0) {
                class358.field4854[var26] = var11 + 1;
                class52.field847[var26] = var12 - 1;
                class161.field2398[var20 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class416.field5822[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 127 && class161.field2398[var20 - 1][var21 + 1] == 0 && (var19[var23 - 1][var22 + 1] & 0x4E240000) == 0 && (var19[var23 - 1][var22] & 0x42240000) == 0 && (var19[var23][var22 + 1] & 0x48240000) == 0) {
                class358.field4854[var26] = var11 - 1;
                class52.field847[var26] = var12 + 1;
                class161.field2398[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class416.field5822[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 127 && var21 < 127 && class161.field2398[var20 + 1][var21 + 1] == 0 && (var19[var23 + 1][var22 + 1] & 0x78240000) == 0 && (var19[var23 + 1][var22] & 0x60240000) == 0 && (var19[var23][var22 + 1] & 0x48240000) == 0) {
                class358.field4854[var26] = var11 + 1;
                class52.field847[var26] = var12 + 1;
                class161.field2398[var20 + 1][var21 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class416.field5822[var20 + 1][var21 + 1] = var25;
            }
        }
        class286.field3826 = var11;
        class268.field3612 = var12;
        return false;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)I")
    public final int method1242(int arg0) {
        field2447++;
        int var2 = arg0;
        for (class381 var3 = this.field2454.field5346; var3 != this.field2454; var3 = var3.field5346) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)Ls;")
    public final class381 method1243(int arg0) {
        field2471++;
        if (arg0 != 0) {
            field2465 = null;
        }
        class381 var2 = this.field2474;
        if (this.field2454 == var2) {
            this.field2474 = null;
            return null;
        } else {
            this.field2474 = var2.field5348;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZLs;)V")
    public final void method1244(boolean arg0, class381 arg1) {
        field2469++;
        if (arg1.field5348 != null) {
            arg1.method2367(5);
        }
        arg1.field5346 = this.field2454.field5346;
        arg1.field5348 = this.field2454;
        arg1.field5348.field5346 = arg1;
        arg1.field5346.field5348 = arg1;
        if (!arg0) {
            method1246(-69, (String) null);
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)Ls;")
    public final class381 method1245(int arg0) {
        field2452++;
        if (arg0 != 1) {
            field2465 = null;
        }
        class381 var2 = this.field2474;
        if (this.field2454 == var2) {
            this.field2474 = null;
            return null;
        } else {
            this.field2474 = var2.field5346;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1246(int arg0, String arg1) {
        field2463++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class286.method1798(93, arg1.charAt(var4)) + ((var3 << 5) - var3);
        }
        if (arg0 != -28005) {
            method1253(-85);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)Z")
    public final boolean method1247(byte arg0) {
        field2457++;
        if (arg0 != 120) {
            field2464 = 120;
        }
        return this.field2454.field5346 == this.field2454;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIILoa;IIILpe;)V")
    public static final void method1248(int arg0, int arg1, int arg2, class151 arg3, int arg4, int arg5, int arg6, class391 arg7) {
        field2446++;
        class111 var8 = null;
        if (arg0 == 0) {
            var8 = (class111) class194.method1394(arg2, arg1, arg6);
        }
        int var9 = -60 / ((arg5 + 17) / 50);
        if (arg0 == 1) {
            var8 = (class111) class434.method2691(arg2, arg1, arg6);
        }
        if (arg0 == 2) {
            var8 = (class111) class95.method815(arg2, arg1, arg6, field2475 == null ? (field2475 = method1256("gd")) : field2475);
        }
        if (arg0 == 3) {
            var8 = (class111) class314.method2001(arg2, arg1, arg6);
        }
        if (var8 == null) {
            return;
        }
        int var10 = var8.method575(-15863);
        int var11 = var8.method580(24493);
        class372 var12 = class10.method53(var8.method582((byte) 22), true);
        if (var12.method2317(false)) {
            class438.method2718(var12, (byte) 22, arg2, arg1, arg6);
        }
        if (var8.method577(-16528)) {
            var8.method574(arg7, -28992);
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                class372.method2322(arg2, arg1, arg6);
                return;
            }
            if (arg0 != 2) {
                if (arg0 == 3) {
                    class36.method367(arg2, arg1, arg6);
                    if (var12.field5221 == 1) {
                        arg3.method1168(81, arg1, arg6);
                        return;
                    }
                }
                return;
            }
            class244.method1601(arg2, arg1, arg6, field2475 == null ? (field2475 = method1256("gd")) : field2475);
            if (var12.field5221 != 0 && class116.field1621 > var12.field5206 + arg1 && class385.field5425 > var12.field5206 + arg6 && arg1 + var12.field5147 < class116.field1621 && (var12.field5147 + arg6) < class385.field5425) {
                arg3.method1163(var12.field5147, var12.field5201, var12.field5206, !var12.field5174, var11, arg6, arg1, (byte) -114);
                return;
            }
            return;
        }
        class12.method60(arg2, arg1, arg6);
        if (var12.field5221 != 0) {
            arg3.method1167(arg1, var12.field5201, var10, true, !var12.field5174, var11, arg6);
            return;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ls;B)V")
    public final void method1249(class381 arg0, byte arg1) {
        field2456++;
        if (arg0.field5348 != null) {
            arg0.method2367(5);
        }
        arg0.field5348 = this.field2454.field5348;
        arg0.field5346 = this.field2454;
        arg0.field5348.field5346 = arg0;
        arg0.field5346.field5348 = arg0;
        if (arg1 > -99) {
            field2453 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V")
    public final void method1250(int arg0) {
        field2451++;
        while (true) {
            class381 var2 = this.field2454.field5346;
            if (this.field2454 == var2) {
                this.field2474 = null;
                if (arg0 == 10346) {
                    return;
                } else {
                    field2472 = 1;
                    return;
                }
            }
            var2.method2367(5);
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)V")
    public static final void method1251(byte arg0) {
        field2460++;
        class410 var1 = class75.field1123;
        synchronized (class75.field1123) {
            class75.field1123.method2539(51);
        }
        if (arg0 >= -43) {
            field2473 = true;
        }
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)Ls;")
    public final class381 method1252(int arg0) {
        if (arg0 != 15666) {
            method1253(106);
        }
        field2445++;
        class381 var2 = this.field2454.field5348;
        if (this.field2454 == var2) {
            this.field2474 = null;
            return null;
        } else {
            this.field2474 = var2.field5348;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)V")
    public static void method1253(int arg0) {
        field2465 = null;
        field2467 = null;
        if (arg0 != 1) {
            field2453 = null;
        }
        field2453 = null;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class166() {
        this.field2454.field5348 = this.field2454;
        this.field2454.field5346 = this.field2454;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)Lok;")
    public static final class61 method1254(byte arg0, int arg1) {
        if (arg0 != -127) {
            return null;
        }
        field2461++;
        class410 var2 = class27.field469;
        class61 var3;
        synchronized (class27.field469) {
            var3 = (class61) class27.field469.method2537(-111, (long) arg1);
            if (var3 == null) {
                var3 = new class61(arg1);
                class27.field469.method2542(var3, (byte) -69, (long) arg1);
            }
        }
        synchronized (var3) {
            return var3.method550((byte) 19) ? var3 : null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)V")
    public static final void method1255(byte arg0) {
        if (arg0 <= 124) {
            method1255((byte) -47);
        }
        field2450++;
        class300.method1927();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1256(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
