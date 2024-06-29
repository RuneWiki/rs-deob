import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class200 extends class101 {

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field3225 = 0;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field3229 = -1;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public static int field3230 = 0;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field3222 = 20;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "Ljj;")
    public static class134 field3219;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "Ljj;")
    public static class134 field3228;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)V")
    public static final void method1346(int arg0, int arg1) {
        field3226++;
        short var2 = 256;
        if (var2 < arg0) {
            arg0 = var2;
        }
        if (arg1 < arg0) {
            arg0 = 10;
        }
        class154.field2487 += arg0 * 128;
        if (class154.field2487 > class144.field2334.length) {
            class154.field2487 -= class144.field2334.length;
            int var3 = (int) (Math.random() * 12.0D);
            class297.method1980(class6.field81[var3], 1396434695);
        }
        int var4 = arg0 * 128;
        int var5 = (var2 - arg0) * 128;
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var26 = class162.field2636[var4 + var6] - (class144.field2334[class144.field2334.length - 1 & var6 - -class154.field2487] * arg0 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class162.field2636[var6++] = var26;
        }
        for (int var8 = var2 - arg0; var8 < var2; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class162.field2636[var24 + var23] = 255;
                } else {
                    class162.field2636[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < (var2 - arg0); var9++) {
            class178.field2890[var9] = class178.field2890[arg0 + var9];
        }
        for (int var10 = var2 - arg0; var10 < var2; var10++) {
            class178.field2890[var10] = (int) (Math.sin((double) class108.field1871 / 14.0D) * 16.0D + Math.sin((double) class108.field1871 / 15.0D) * 14.0D + Math.sin((double) class108.field1871 / 16.0D) * 12.0D);
            class108.field1871++;
        }
        int var11 = ((class9.field141 & 0x1) + arg0) / 2;
        class267.field4331 += arg0;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class267.field4331; var12++) {
            int var21 = (int) (Math.random() * 124.0D) + 2;
            int var22 = (int) (Math.random() * 128.0D) + 128;
            class162.field2636[(var22 << 7) + var21] = 192;
        }
        class267.field4331 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = 0;
            int var19 = var13 * 128;
            for (int var20 = -var11; var20 < 128; var20++) {
                if (var11 + var20 < 128) {
                    var18 += class162.field2636[var19 + var20 + var11];
                }
                if ((var20 - var11 - 1) >= 0) {
                    var18 -= class162.field2636[var19 - var11 - (1 - var20)];
                }
                if (var20 >= 0) {
                    class33.field395[var19 + var20] = var18 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if (var2 > (var11 + var16)) {
                    var15 += class33.field395[var14 - (-var17 - var11 * 128)];
                }
                if (var16 - var11 - 1 >= 0) {
                    var15 -= class33.field395[var14 + var17 - (var11 * 128) - 128];
                }
                if (var16 >= 0) {
                    class162.field2636[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIILni;IILue;IIZII)Lue;")
    public static final class13 method1347(int arg0, int arg1, int arg2, int arg3, int arg4, class21 arg5, int arg6, int arg7, class13 arg8, int arg9, int arg10, boolean arg11, int arg12, int arg13) {
        field3224++;
        long var14 = ((long) arg3 << 48) + ((long) ((arg0 << 16) + (arg7 << 24) + arg4) + ((long) arg13 << 32));
        class13 var16 = (class13) class260.field4132.method1839((byte) 71, var14);
        if (var16 == null) {
            byte var17;
            if (arg4 == 1) {
                var17 = 9;
            } else if (arg4 == 2) {
                var17 = 12;
            } else if (arg4 == 3) {
                var17 = 15;
            } else if (arg4 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19 = 3;
            class158 var20 = new class158(var17 * var19 + 1, var17 * var19 * 2 - var17, 0);
            int[][] var21 = new int[var19][var17];
            int var22 = var20.method1066(0, 0, 0);
            for (int var23 = 0; var23 < var19; var23++) {
                int var30 = var18[var23];
                int var31 = var18[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = class145.field2348[var33] * var31 + arg1 >> 16;
                    int var35 = class145.field2338[var33] * var30 + arg10 >> 16;
                    var21[var23][var32] = var20.method1066(var35, 0, var34);
                }
            }
            for (int var24 = 0; var24 < var19; var24++) {
                int var25 = (var24 * 256 + 128) / var19;
                int var26 = 256 - var25;
                byte var27 = (byte) (arg0 * var26 + arg7 * var25 >> 8);
                short var28 = (short) (((arg3 & 0xFC00) * var25 + (arg13 & 0xFC00) * var26 & 0xFC0000) + ((arg3 & 0x380) * var25 + (arg13 & 0x380) * var26 & 0x38000) + ((arg3 & 0x7F) * var25 + (arg13 & 0x7F) * var26 & 0x7F00) >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var20.method1084(var22, var21[0][(var29 + 1) % var17], var21[0][var29], (byte) 1, var28, var27);
                    } else {
                        var20.method1084(var21[var24 - 1][var29], var21[var24 - 1][(var29 + 1) % var17], var21[var24][(var29 + 1) % var17], (byte) 1, var28, var27);
                        var20.method1084(var21[var24 - 1][var29], var21[var24][(var29 + 1) % var17], var21[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var20.method1090(64, 768, -50, -10, -50);
            class260.field4132.method1830(var14, -78, var16);
        }
        int var36 = arg4 * 64 - 1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = arg8.method80();
        int var40 = var36;
        int var41 = -var36;
        int var42 = arg8.method100();
        int var43 = arg8.method102();
        if (arg11) {
            if (arg12 > 640 && arg12 < 1408) {
                var40 = var36 + 128;
            }
            if (arg12 > 1664 || arg12 < 384) {
                var41 -= 128;
            }
            if (arg12 > 128 && arg12 < 896) {
                var37 -= 128;
            }
            if (arg12 > 1152 && arg12 < 1920) {
                var38 = var36 + 128;
            }
        }
        if (var43 < var41) {
            var43 = var41;
        }
        if (var38 < var42) {
            var42 = var38;
        }
        int var44 = arg8.method98();
        class10 var45 = null;
        if (var44 > var40) {
            var44 = var40;
        }
        if (var37 > var39) {
            var39 = var37;
        }
        if (arg6 != 6) {
            field3219 = null;
        }
        if (arg5 != null) {
            int var46 = arg5.field237[arg2];
            var45 = class9.method56(var46 >> 16, 1545049680);
            arg2 = var46 & 0xFFFF;
        }
        class13 var47;
        if (var45 == null) {
            var47 = var16.method96(true, true, true);
            var47.method81((var42 - var39) / 2, 128, (var44 - var43) / 2);
            var47.method76((var39 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method96(!var45.method63(1, arg2), !var45.method60(arg2, arg6 - 95), true);
            var47.method81((var42 - var39) / 2, 128, (var44 - var43) / 2);
            var47.method76((var39 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method79(var45, arg2);
        }
        if (arg12 != 0) {
            var47.method104(arg12);
        }
        class90 var48 = (class90) var47;
        if (arg9 != class220.method1461(arg10 + var39, class28.field336, arg1 + var43, 97) || arg9 != class220.method1461(arg10 + var42, class28.field336, arg1 + var44, 32)) {
            for (int var49 = 0; var49 < var48.field1238; var49++) {
                var48.field1232[var49] += class220.method1461(var48.field1248[var49] + arg10, class28.field336, var48.field1223[var49] + arg1, 113) - arg9;
            }
            var48.field1250 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
    public static final Object method1348(int arg0, byte[] arg1, boolean arg2) {
        field3223++;
        int var3 = -95 % ((arg0 - 44) / 53);
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class269.field4358) {
            try {
                class274 var4 = (class274) Class.forName("pe").getDeclaredConstructor().newInstance();
                var4.method630(-1, arg1);
                return var4;
            } catch (Throwable var5) {
                class269.field4358 = true;
            }
        }
        return arg2 ? class242.method1591((byte) -52, arg1) : arg1;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)Z")
    public static final boolean method1349(boolean arg0) {
        field3221++;
        if (arg0) {
            field3230 = 120;
        }
        return class185.field2970;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljj;I)V")
    public static final void method1350(class134 arg0, int arg1) {
        class6.field81 = class96.method692(arg0, false, class129.field2161);
        class85.field1174 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) ((class76.field1043[var2] & 0xFF0000) >> 16);
            int var5 = class76.field1043[var2 + 1] >> 16 & 0xFF;
            int var6 = class76.field1043[var2 + 1] >> 8 & 0xFF;
            float var7 = (float) ((class76.field1043[var2] & 0xFF00) >> 8);
            float var8 = ((float) var5 - var4) / 64.0F;
            float var9 = ((float) var6 - var7) / 64.0F;
            int var10 = class76.field1043[var2 + 1] & 0xFF;
            float var11 = (float) (class76.field1043[var2] & 0xFF);
            float var12 = ((float) var10 - var11) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class85.field1174[var2 * 64 + var13] = class45.method348(class45.method348((int) var4 << 16, (int) var7 << 8), (int) var11);
                var11 += var12;
                var4 += var8;
                var7 += var9;
            }
        }
        field3227++;
        for (int var3 = 192; var3 < 255; var3++) {
            class85.field1174[var3] = class76.field1043[3];
        }
        class243.field3895 = new int[32768];
        if (arg1 != 13771) {
            method1348(66, (byte[]) null, false);
        }
        class144.field2334 = new int[32768];
        class297.method1980((class68) null, arg1 ^ 0x533BD2CC);
        class33.field395 = new int[32768];
        class162.field2636 = new int[32768];
        class62.field856 = new class43(128, 254);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public static void method1351(int arg0) {
        int var1 = -94 / ((arg0 + 89) / 36);
        field3228 = null;
        field3219 = null;
    }
}
