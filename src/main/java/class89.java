import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class89 extends class220 {

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "Lii;")
    public class203 field1520;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "J")
    public static long field1523 = 0L;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field1521 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "Lmh;")
    public static class128 field1524 = class22.method156(124, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "Lmh;")
    public static class128 field1525 = class22.method156(126, "0");

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V", line = 8)
    public static void method555(int arg0) {
        field1524 = null;
        field1525 = null;
        if (arg0 != -9615) {
            method558(-22, 52, -7, 106, 87, (byte[][][]) ((byte[][][]) null), (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 65, (byte) -94, 112, 91);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lem;IIIIII)V", line = 19)
    public static final void method556(class10 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1519++;
        int var7 = arg5 * arg5 + arg6 * arg6;
        if (var7 > 360000) {
            return;
        }
        if (arg3 < 60) {
            method557(70, 68, 49, 4, (class38) null);
        }
        int var8 = Math.min(arg0.field260 / 2, arg0.field226 / 2);
        if (var7 <= var8 * var8) {
            class123.method752(arg4, arg0, arg6, 2, class294.field5036[arg2], arg1, arg5);
            return;
        }
        int var9 = class216.field3803 + class118.field1997 & 0x7FF;
        var8 -= 10;
        int var10 = class141.field2411[var9];
        int var11 = class141.field2424[var9];
        int var12 = var11 * 256 / (class145.field2480 + 256);
        int var13 = var10 * 256 / (class145.field2480 + 256);
        int var14 = arg5 * var13 - (arg6 * var12) >> 16;
        int var15 = arg5 * var12 + arg6 * var13 >> 16;
        double var16 = Math.atan2((double) var15, (double) var14);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) ((double) var8 * Math.cos(var16));
        if (class247.field4247) {
            ((class40) class97.field1673[arg2]).method274(240, 240, (arg0.field260 / 2 + arg4 + var18) * 16, (arg0.field226 / 2 + arg1 - var19) * 16, (int) (var16 * 10430.378D), 4096);
        } else {
            ((class231) class97.field1673[arg2]).method747(arg0.field260 / 2 + var18 + arg4 - 10, arg0.field226 / 2 + arg1 - (var19 - -10), 20, 20, 15, 15, var16, 256);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIILcg;)V", line = 68)
    public static final void method557(int arg0, int arg1, int arg2, int arg3, class38 arg4) {
        field1522++;
        for (class3 var5 = (class3) class232.field4006.method2024(0); var5 != null; var5 = (class3) class232.field4006.method2027(1211754408)) {
            if (var5.field65 == arg2 && (arg3 * 128) == var5.field40 && arg1 * 128 == var5.field67 && var5.field41.field819 == arg4.field819) {
                if (var5.field52 != null) {
                    class188.field3260.method393(var5.field52);
                    var5.field52 = null;
                }
                if (var5.field47 != null) {
                    class188.field3260.method393(var5.field47);
                    var5.field47 = null;
                }
                var5.method1978((byte) -111);
                return;
            }
        }
        if (arg0 != -12833) {
            field1521 = 102;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lii;)V", line = 111)
    public class89(class203 arg0) {
        this.field1520 = arg0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 120)
    public static final void method558(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class297.field5067 * 128) {
            arg0 = class297.field5067 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class155.field2670 * 128) {
            arg2 = class155.field2670 * 128 - 1;
        }
        class266.field4613 = class141.field2424[arg3];
        class50.field990 = class141.field2411[arg3];
        class306.field5210 = class141.field2424[arg4];
        class291.field4974 = class141.field2411[arg4];
        class260.field4501 = arg0;
        class166.field2847 = arg1;
        class156.field2682 = arg2;
        class145.field2488 = arg0 / 128;
        class217.field3813 = arg2 / 128;
        class170.field2972 = class145.field2488 - class96.field1634;
        if (class170.field2972 < 0) {
            class170.field2972 = 0;
        }
        class96.field1631 = class217.field3813 - class96.field1634;
        if (class96.field1631 < 0) {
            class96.field1631 = 0;
        }
        class181.field3172 = class96.field1634 + class145.field2488;
        if (class181.field3172 > class297.field5067) {
            class181.field3172 = class297.field5067;
        }
        class115.field1939 = class96.field1634 + class217.field3813;
        if (class115.field1939 > class155.field2670) {
            class115.field1939 = class155.field2670;
        }
        short var15;
        if (class247.field4247) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class96.field1634 + class96.field1634 + 2; var16++) {
            for (int var17 = 0; var17 < class96.field1634 + class96.field1634 + 2; var17++) {
                int var18 = (var16 - class96.field1634 << 7) - (class260.field4501 & 0x7F);
                int var19 = (var17 - class96.field1634 << 7) - (class156.field2682 & 0x7F);
                int var20 = class145.field2488 + var16 - class96.field1634;
                int var21 = class217.field3813 + var17 - class96.field1634;
                if (var20 >= 0 && var21 >= 0 && var20 < class297.field5067 && var21 < class155.field2670) {
                    int var22;
                    if (class308.field5227 == null) {
                        var22 = class267.field4626[0][var20][var21] + 128 - class166.field2847;
                    } else {
                        var22 = class308.field5227[0][var20][var21] + 128 - class166.field2847;
                    }
                    int var23 = class267.field4626[3][var20][var21] - class166.field2847 - 1000;
                    class268.field4659[var16][var17] = class82.method522(var18, var23, var22, var19, var15);
                } else {
                    class268.field4659[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class96.field1634 + class96.field1634 + 1; var24++) {
            for (int var25 = 0; var25 < class96.field1634 + class96.field1634 + 1; var25++) {
                class183.field3211[var24][var25] = class268.field4659[var24][var25] || class268.field4659[var24 + 1][var25] || class268.field4659[var24][var25 + 1] || class268.field4659[var24 + 1][var25 + 1];
            }
        }
        class94.field1593 = arg6;
        class170.field2979 = arg7;
        class115.field1933 = arg8;
        class42.field862 = arg9;
        class194.field3393 = arg10;
        class215.method1489();
        if (class260.field4495 != null) {
            class156.method1031(true);
            class88.method554(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class247.field4247) {
                class287.field4916 = false;
                class217.method1498((byte) -29, 0, 0);
                class119.method722((float[]) null);
                class46.method308();
            }
            class156.method1031(false);
        }
        class88.method554(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILmh;SILmh;IJ)V", line = 260)
    public static final void method559(int arg0, class128 arg1, short arg2, int arg3, class128 arg4, int arg5, long arg6) {
        field1526++;
        if (class271.field4721) {
            return;
        }
        if (arg5 != 1) {
            field1525 = (class128) null;
        }
        if (class275.field4769 >= 500) {
            return;
        }
        class283.field4868[class275.field4769] = arg1;
        class210.field3725[class275.field4769] = arg4;
        class117.field1979[class275.field4769] = arg2;
        class1.field22[class275.field4769] = arg6;
        class267.field4635[class275.field4769] = arg0;
        class309.field5251[class275.field4769] = arg3;
        class275.field4769++;
    }
}
