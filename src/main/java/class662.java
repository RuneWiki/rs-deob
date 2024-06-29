import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class662 {

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "I")
    public static int field9387;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "I")
    public static int field9388;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "I")
    public static int field9389;

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "Lhca;")
    public static class455 field9390;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
    public static void method3744(int arg0) {
        if (arg0 == -152331794) {
            field9390 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIILua;ILr;ILn;)V")
    public static final void method3745(int arg0, int arg1, int arg2, int arg3, class616 arg4, int arg5, class165 arg6, int arg7, class17 arg8) {
        field9389++;
        class289 var9 = class455.field6408.method3816(-109, arg2);
        if (var9 != null && var9.field3916 && var9.method1718(class410.field5804, (byte) 87)) {
            if (var9.field3922 != null) {
                int[] var10 = new int[var9.field3922.length];
                for (int var11 = 0; var11 < var10.length / 2; var11++) {
                    int var13;
                    if (class586.field8507 == 4) {
                        var13 = (int) class115.field1495 & 0x3FFF;
                    } else {
                        var13 = (int) class115.field1495 + class186.field2277 & 0x3FFF;
                    }
                    int var14 = class395.field5579[var13];
                    int var15 = class395.field5582[var13];
                    if (class586.field8507 != 4) {
                        var15 = var15 * 256 / (class680.field9743 + 256);
                        var14 = var14 * 256 / (class680.field9743 + 256);
                    }
                    var10[var11 * 2] = arg8.field414 / 2 + ((arg5 + (var9.field3922[var11 * 2] * 4)) * var15 + (var9.field3922[var11 * 2 + 1] * 4 + arg0) * var14 >> 14) + arg7;
                    var10[var11 * 2 + 1] = arg8.field402 / 2 + arg1 - ((arg0 - -(var9.field3922[var11 * 2 + 1] * 4)) * var15 + -((arg5 - -(var9.field3922[var11 * 2] * 4)) * var14) >> 14);
                }
                class121.method846(arg6, var10, var9.field3896, arg8.field450, arg8.field373);
                for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                    arg6.method212(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[var12 * 2 + 2 + 1], var9.field3890, 1, arg4, arg7, arg1);
                }
                arg6.method212(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field3890, 1, arg4, arg7, arg1);
            }
            class701 var16 = null;
            if (var9.field3904 != -1) {
                var16 = var9.method1715(-4053, false, arg6);
                if (var16 != null) {
                    class86.method685(var16, arg7, arg8, arg0, arg5, arg4, (byte) -92, arg1);
                }
            }
            if (var9.field3910 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method900();
                }
                class419 var18 = class242.field3330;
                class50 var19 = class214.field2729;
                if (var9.field3913 == 1) {
                    var18 = class657.field9330;
                    var19 = class417.field5909;
                }
                if (var9.field3913 == 2) {
                    var19 = class12.field205;
                    var18 = class36.field691;
                }
                class394.method2386(arg7, var9.field3887, var19, true, arg5, var17, arg1, arg8, arg0, arg4, var18, var9.field3910);
            }
        }
        if (arg3 != 2) {
            method3745(-113, 79, 67, -31, null, 72, null, 84, null);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V")
    public static final void method3746(byte arg0) {
        class603.method3474(class221.field2851.field4172, (byte) 19);
        field9387++;
        int var1 = (class346.field4550 >> 12) + (class36.field689 >> 3);
        class617.field8853 = class206.field2472.field532 = 0;
        int var2 = (class88.field1239 >> 3) + (class627.field8995 >> 12);
        class206.field2472.method3515((byte) -59, 8, 8);
        byte var3 = 18;
        class346.field4549 = new byte[var3][];
        class176.field2177 = new int[var3];
        class312.field4119 = new int[var3];
        class445.field6318 = new int[var3];
        class423.field6026 = new byte[var3][];
        if (arg0 < 16) {
            field9390 = null;
        }
        class5.field38 = new int[var3];
        class498.field6965 = new int[var3];
        class354.field4734 = new byte[var3][];
        class478.field6703 = new int[var3];
        class653.field9257 = new byte[var3][];
        class322.field4249 = new int[var3][4];
        class50.field830 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (var1 - (class473.field6604 >> 4)) / 8; var5 <= ((class473.field6604 >> 4) + var1) / 8; var5++) {
            for (int var8 = (var2 - (class205.field2465 >> 4)) / 8; var8 <= ((class205.field2465 >> 4) + var2) / 8; var8++) {
                int var9 = (var5 << 8) + var8;
                class312.field4119[var4] = var9;
                class498.field6965[var4] = class89.field1249.method3804((byte) 103, "m" + var5 + "_" + var8);
                class445.field6318[var4] = class89.field1249.method3804((byte) 116, "l" + var5 + "_" + var8);
                class5.field38[var4] = class89.field1249.method3804((byte) 116, "n" + var5 + "_" + var8);
                class176.field2177[var4] = class89.field1249.method3804((byte) 127, "um" + var5 + "_" + var8);
                class478.field6703[var4] = class89.field1249.method3804((byte) 85, "ul" + var5 + "_" + var8);
                if (class5.field38[var4] == -1) {
                    class498.field6965[var4] = -1;
                    class445.field6318[var4] = -1;
                    class176.field2177[var4] = -1;
                    class478.field6703[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class5.field38.length; var6++) {
            class5.field38[var6] = -1;
            class498.field6965[var6] = -1;
            class445.field6318[var6] = -1;
            class176.field2177[var6] = -1;
            class478.field6703[var6] = -1;
        }
        byte var7;
        if (class114.field1485 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class245.method1493((byte) -94, false, var7, var2, var1);
    }

    static {
        new class115("", 73);
    }
}
