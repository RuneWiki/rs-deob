import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class143 extends class261 {

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    private int field2384 = 4096;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "Z")
    private boolean field2381 = true;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "Lve;")
    public static class255 field2382 = class87.method607(82, " <col=ffffff>");

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "Lve;")
    public static class255 field2387 = class87.method607(45, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "[I")
    public static int[] field2378 = new int[2];

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "[I")
    public static int[] field2386 = new int[25];

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "Z")
    public static boolean field2392 = true;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "Lve;")
    public static class255 field2395 = class87.method607(125, "Loaded titlescreen)3");

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "Lrg;")
    public static class88 field2379;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "[I")
    public static int[] field2391;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI)[[I", line = 12)
    public final int[][] method13(boolean arg0, int arg1) {
        if (!arg0) {
            field2382 = (class255) null;
        }
        field2396++;
        int[][] var3 = this.field4418.method35(arg1, 117);
        if (this.field4418.field94) {
            int[] var4 = this.method1822(0, 26, class250.field4205 & arg1 - 1);
            int[] var5 = this.method1822(0, 123, arg1);
            int[] var6 = this.method1822(0, 76, class250.field4205 & arg1 + 1);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class92.field1576; var10++) {
                int var11 = (var5[class77.field1260 & var10 + 1] - var5[var10 - 1 & class77.field1260]) * this.field2384;
                int var12 = (var6[var10] - var4[var10]) * this.field2384;
                int var13 = var11 >> 12;
                int var14 = var13 * var13 >> 12;
                int var15 = var12 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var14 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = 16777216 / var17;
                    var18 = var12 / var17;
                    var19 = var11 / var17;
                }
                if (this.field2381) {
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var8[var10] = var19;
                var7[var10] = var18;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V", line = 92)
    public class143() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()V", line = 96)
    public static final void method1061() {
        if (class115.field1956 != null) {
            for (int var0 = 0; var0 < class115.field1956.length; var0++) {
                for (int var1 = 0; var1 < class29.field449; var1++) {
                    for (int var2 = 0; var2 < class315.field5347; var2++) {
                        class115.field1956[var0][var1][var2] = null;
                    }
                }
            }
        }
        class34.field555 = (class142[][]) null;
        if (class159.field2687 != null) {
            for (int var3 = 0; var3 < class159.field2687.length; var3++) {
                for (int var4 = 0; var4 < class29.field449; var4++) {
                    for (int var5 = 0; var5 < class315.field5347; var5++) {
                        class159.field2687[var3][var4][var5] = null;
                    }
                }
            }
        }
        class295.field5062 = (class142[][]) null;
        class137.field2303 = 0;
        if (class298.field5099 != null) {
            for (int var6 = 0; var6 < class137.field2303; var6++) {
                class298.field5099[var6] = null;
            }
        }
        if (class253.field4262 != null) {
            for (int var7 = 0; var7 < class124.field2058; var7++) {
                class253.field4262[var7] = null;
            }
            class124.field2058 = 0;
        }
        if (class304.field5204 != null) {
            for (int var8 = 0; var8 < class304.field5204.length; var8++) {
                class304.field5204[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([[FI[Z[[FII[[IIILdi;[[FZIZBII[IZZB[[I)V", line = 201)
    public static final void method1062(float[][] arg0, int arg1, boolean[] arg2, float[][] arg3, int arg4, int arg5, int[][] arg6, int arg7, int arg8, class142 arg9, float[][] arg10, boolean arg11, int arg12, boolean arg13, byte arg14, int arg15, int arg16, int[] arg17, boolean arg18, boolean arg19, byte arg20, int[][] arg21) {
        field2389++;
        int var22 = (arg19 ? 255 : 0) + (arg1 << 8);
        int var23 = (arg13 ? 255 : 0) + (arg15 << 8);
        int var24 = (arg7 << 8) + (arg18 ? 255 : 0);
        int var25 = (arg5 << 8) + (arg11 ? 255 : 0);
        if (arg20 != 26) {
            field2387 = (class255) null;
        }
        int[] var26 = new int[arg17.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg17[var27 + var27];
            int var29 = arg17[var27 + var27 + 1];
            int[][] var30 = arg6 == null || arg2 == null || !arg2[var27] ? arg21 : arg6;
            var26[var27] = class275.method1929(class127.method943(arg20, 27), false, arg3, var23, arg14, arg6, var30, arg8, var25, arg0, arg9, arg10, var24, (float) arg12, var22, var29, arg16, var28);
        }
        arg9.method1056(arg4, arg16, arg8, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BZ)V", line = 238)
    public static final void method1063(byte arg0, boolean arg1) {
        field2394++;
        if (arg0 >= -53) {
            return;
        }
        for (int var2 = 0; var2 < class282.field4858; var2++) {
            class186 var3 = class82.field1334[class84.field1356[var2]];
            long var4 = (long) class84.field1356[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method1302(1) && arg1 == var3.field2996.field3895 && var3.field2996.method1639((byte) 125)) {
                int var6 = var3.field5130 >> 7;
                int var7 = var3.field5173 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.method1680(-118) == 1 && (var3.field5130 & 0x7F) == 64 && (var3.field5173 & 0x7F) == 64) {
                        if (class78.field1273[var6][var7] == class93.field1600) {
                            continue;
                        }
                        class78.field1273[var6][var7] = class93.field1600;
                    }
                    if (!var3.field2996.field3888) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field5131 = class113.method861((byte) -90, var3.field5130, var3.field5173, client.field4039);
                    class112.method856(client.field4039, var3.field5130, var3.field5173, var3.field5131, (var3.method1680(-121) - 1) * 64 + 60, var3, var3.field5157, var4, var3.field5156);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)V", line = 286)
    public static final void method1064(int arg0, byte arg1) {
        field2388++;
        int var2 = -116 / ((arg1 + 25) / 33);
        class304.field5202.method562((byte) 49, arg0);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZI)I", line = 303)
    public static final int method1065(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field2382 = (class255) null;
        }
        field2380++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lpb;BI)V", line = 336)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field2384 = arg0.method423(255);
        } else if (arg2 == 1) {
            this.field2381 = arg0.method481(0) == 1;
        }
        if (arg1 > -115) {
            method1068(54, 85);
        }
        field2393++;
    }

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "(B)V", line = 366)
    public static void method1066(byte arg0) {
        field2386 = null;
        field2395 = null;
        field2387 = null;
        if (arg0 != -3) {
            field2387 = (class255) null;
        }
        field2391 = null;
        field2382 = null;
        field2378 = null;
        field2379 = null;
    }

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "(B)V", line = 392)
    public static final void method1067(byte arg0) {
        class145.field2426 = null;
        field2390++;
        class86.method597();
        if (arg0 <= 12) {
            field2379 = (class88) null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)Lce;", line = 423)
    public static final class236 method1068(int arg0, int arg1) {
        field2385++;
        class236 var2 = (class236) class150.field2550.method558((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class59.field901.method636(class183.method1283(827, arg1), (byte) 52, class222.method1561(arg1, 127));
        if (arg0 >= -64) {
            return (class236) null;
        }
        class236 var4 = new class236();
        var4.field3891 = arg1;
        if (var3 != null) {
            var4.method1632(76, new class70(var3));
        }
        var4.method1637((byte) 104);
        class150.field2550.method555(var4, (long) arg1, 0);
        return var4;
    }
}
