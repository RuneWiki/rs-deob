import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class209 extends class71 {

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "Lud;")
    public static class279 field3681 = class130.method1024("titlebg", 255);

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "Lud;")
    public static class279 field3684 = class130.method1024("D-Bmarrage de la librairie 3D", 255);

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "Lud;")
    public static class279 field3688 = class130.method1024("mapfunction", 255);

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "I")
    public static int field3678 = 0;

    @OriginalMember(owner = "client!dk", name = "Y", descriptor = "Lud;")
    public static class279 field3691 = class130.method1024("k", 255);

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    public static int field3679 = -1;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!dk", name = "W", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!dk", name = "X", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!dk", name = "Z", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(IB)[I", line = 12)
    public final int[] method199(int arg0, byte arg1) {
        field3690++;
        if (arg1 > -69) {
            this.method199(-118, (byte) -52);
        }
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            int[] var4 = this.method624(arg0, -3, 0);
            for (int var5 = 0; var5 < class215.field3787; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZIBI[ZZI[[FZZLvk;I[[F[[II[[II[[FII[IZ)V", line = 49)
    public static final void method1534(boolean arg0, int arg1, byte arg2, int arg3, boolean[] arg4, boolean arg5, int arg6, float[][] arg7, boolean arg8, boolean arg9, class168 arg10, int arg11, float[][] arg12, int[][] arg13, int arg14, int[][] arg15, int arg16, float[][] arg17, int arg18, int arg19, int[] arg20, boolean arg21) {
        field3692++;
        int var22 = (arg14 << 8) + (arg8 ? 255 : 0);
        int var23 = (arg6 << 8) + (arg0 ? 255 : 0);
        int var24 = (arg16 << 8) + (arg9 ? 255 : 0);
        int var25 = (arg3 << 8) + (arg21 ? 255 : 0);
        int[] var26 = new int[arg20.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg20[var27 + var27];
            int var29 = arg20[var27 + var27 + 1];
            int[][] var30 = arg15 == null || arg4 == null || !arg4[var27] ? arg13 : arg15;
            var26[var27] = class166.method1297(var29, 1, arg19, arg15, var25, var22, false, arg11, arg7, var23, arg2, arg17, var30, var24, var28, arg12, (float) arg18, arg10);
        }
        arg10.method1315(arg1, arg19, arg11, var26, (int[]) null, arg5);
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V", line = 84)
    public class209() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIZILdb;IIBIIILga;)Lga;", line = 90)
    public static final class19 method1535(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class182 arg6, int arg7, int arg8, byte arg9, int arg10, int arg11, int arg12, class19 arg13) {
        long var14 = (long) ((arg10 << 24) + (arg0 << 16) + arg11) - (-((long) arg5 << 32) - ((long) arg3 << 48));
        field3680++;
        class19 var16 = (class19) class166.field3005.method1336(var14, 0);
        if (var16 == null) {
            byte var17 = 3;
            byte var18;
            if (arg11 == 1) {
                var18 = 9;
            } else if (arg11 == 2) {
                var18 = 12;
            } else if (arg11 == 3) {
                var18 = 15;
            } else if (arg11 == 4) {
                var18 = 18;
            } else {
                var18 = 21;
            }
            class148 var19 = new class148(var17 * var18 + 1, var17 * var18 * 2 - var18, 0);
            int[] var20 = new int[] { 64, 96, 128 };
            int var21 = var19.method1133(0, 0, 0);
            int[][] var22 = new int[var17][var18];
            for (int var23 = 0; var23 < var17; var23++) {
                int var24 = var20[var23];
                int var25 = var20[var23];
                for (int var26 = 0; var26 < var18; var26++) {
                    int var27 = (var26 << 11) / var18;
                    int var28 = class27.field654[var27] * var25 + arg2 >> 16;
                    int var29 = class27.field642[var27] * var24 + arg1 >> 16;
                    var22[var23][var26] = var19.method1133(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var17; var30++) {
                int var31 = (var30 * 256 + 128) / var17;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg0 * var32 + arg10 * var31 >> 8);
                short var34 = (short) (((arg3 & 0xFC00) * var31 + (arg5 & 0xFC00) * var32 & 0xFC0000) + ((arg3 & 0x380) * var31 + (arg5 & 0x380) * var32 & 0x38000) + ((arg3 & 0x7F) * var31 + (arg5 & 0x7F) * var32 & 0x7F00) >> 8);
                for (int var35 = 0; var35 < var18; var35++) {
                    if (var30 == 0) {
                        var19.method1143(var21, var22[0][(var35 + 1) % var18], var22[0][var35], (byte) 1, var34, var33);
                    } else {
                        var19.method1143(var22[var30 - 1][var35], var22[var30 - 1][(var35 + 1) % var18], var22[var30][(var35 + 1) % var18], (byte) 1, var34, var33);
                        var19.method1143(var22[var30 - 1][var35], var22[var30][(var35 + 1) % var18], var22[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var19.method1144(64, 768, -50, -10, -50);
            class166.field3005.method1331(var16, 30237, var14);
        }
        int var36 = arg11 * 64 - 1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = -var36;
        int var40 = var36;
        if (arg4) {
            if (arg7 > 640 && arg7 < 1408) {
                var40 = var36 + 128;
            }
            if (arg7 > 1152 && arg7 < 1920) {
                var38 = var36 + 128;
            }
            if (arg7 > 1664 || arg7 < 384) {
                var39 -= 128;
            }
            if (arg7 > 128 && arg7 < 896) {
                var37 -= 128;
            }
        }
        int var41 = arg13.method180();
        if (arg9 > -113) {
            return (class19) null;
        }
        if (var37 > var41) {
            var41 = var37;
        }
        int var42 = arg13.method160();
        int var43 = arg13.method173();
        int var44 = arg13.method175();
        if (var39 > var43) {
            var43 = var39;
        }
        if (var42 > var38) {
            var42 = var38;
        }
        if (var44 > var40) {
            var44 = var40;
        }
        class211 var45 = null;
        if (arg6 != null) {
            int var46 = arg6.field3341[arg8];
            var45 = class17.method153(var46 >> 16, true);
            arg8 = var46 & 0xFFFF;
        }
        class19 var47;
        if (var45 == null) {
            var47 = var16.method187(true, true, true);
            var47.method164((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method170((var41 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method187(!var45.method1549(4096, arg8), !var45.method1545(arg8, false), true);
            var47.method164((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method170((var41 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method172(var45, arg8);
        }
        if (arg7 != 0) {
            var47.method182(arg7);
        }
        if (class97.field1824) {
            class299 var48 = (class299) var47;
            if (arg12 != class130.method1025(arg2 + var41, 1008652135, class287.field5134, arg1 + var43) || arg12 != class130.method1025(arg2 + var42, 1008652135, class287.field5134, arg1 + var44)) {
                for (int var49 = 0; var49 < var48.field5323; var49++) {
                    var48.field5330[var49] += class130.method1025(var48.field5317[var49] + arg2, 1008652135, class287.field5134, var48.field5299[var49] + arg1) - arg12;
                }
                var48.field5295.field2475 = false;
                var48.field5302.field967 = false;
            }
        } else {
            class242 var50 = (class242) var47;
            if (class130.method1025(arg2 + var41, 1008652135, class287.field5134, arg1 + var43) != arg12 || class130.method1025(arg2 + var42, 1008652135, class287.field5134, arg1 + var44) != arg12) {
                for (int var51 = 0; var51 < var50.field4236; var51++) {
                    var50.field4248[var51] += class130.method1025(var50.field4245[var51] + arg2, 1008652135, class287.field5134, var50.field4234[var51] + arg1) - arg12;
                }
                var50.field4229 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIII)V", line = 315)
    public static final void method1536(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3687++;
        if (class97.field1824) {
            class256.method1830(arg4, arg2, arg3 + arg4, arg0 + arg2);
            class256.method1827(arg4, arg2, arg3, arg0, 0);
        } else {
            class146.method1127(arg4, arg2, arg4 + arg3, arg0 + arg2);
            class146.method1110(arg4, arg2, arg3, arg0, 0);
        }
        if (class302.field5374 < 100) {
            return;
        }
        if (class119.field2152 == null || class119.field2152.field1377 != arg3 || class119.field2152.field1375 != arg0) {
            class66 var5 = new class66(arg3, arg0);
            class146.method1116(var5.field1323, arg3, arg0);
            class154.method1218(0, class166.field3007, 0, 0, class121.field2180, arg0, (byte) 99, arg3, 0);
            if (class97.field1824) {
                class119.field2152 = new class203(var5);
            } else {
                class119.field2152 = var5;
            }
            if (class97.field1824) {
                class146.field2637 = null;
            } else {
                class250.field4455.method562(32);
            }
        }
        class119.field2152.method567(arg4, arg2);
        int var6 = class72.field1416 * arg3 / class121.field2180 + arg4;
        int var7 = class80.field1523 * arg0 / class166.field3007 + arg2;
        int var8 = 16711680;
        if (class214.field3764 == 1) {
            var8 = 16777215;
        }
        int var9 = class104.field1953 * arg0 / class166.field3007;
        int var10 = class301.field5360 * arg3 / class121.field2180;
        int var11 = -18 % ((25 - arg1) / 47);
        if (class97.field1824) {
            class256.method1828(var6, var7, var10, var9, var8, 128);
            class256.method1839(var6, var7, var10, var9, var8);
        } else {
            class146.method1126(var6, var7, var10, var9, var8, 128);
            class146.method1124(var6, var7, var10, var9, var8);
        }
        if (class192.field3470 <= 0) {
            return;
        }
        int var12;
        if (class189.field3414 > 10) {
            var12 = (20 - class189.field3414) * 25;
        } else {
            var12 = class189.field3414 * 25;
        }
        for (class215 var13 = (class215) class310.field5491.method2248(117); var13 != null; var13 = (class215) class310.field5491.method2240(1138)) {
            if (class69.field1369 == var13.field3788) {
                int var14 = arg4 + (var13.field3785 * arg3 / class121.field2180);
                int var15 = arg2 + (var13.field3782 * arg0 / class166.field3007);
                if (class97.field1824) {
                    class256.method1828(var14 - 2, var15 - 2, 4, 4, 16776960, var12);
                } else {
                    class146.method1126(var14 - 2, var15 - 2, 4, 4, 16776960, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIIIBII)V", line = 429)
    public static final void method1537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        if (arg7 != 98) {
            return;
        }
        if (arg3 == arg5 && arg0 == arg6 && arg4 == arg9 && arg1 == arg2) {
            class28.method255(arg2, arg9, (byte) 80, arg3, arg8, arg0);
        } else {
            int var10 = arg3;
            int var11 = arg0;
            int var12 = arg3 * 3;
            int var13 = arg0 * 3;
            int var14 = arg5 * 3;
            int var15 = arg6 * 3;
            int var16 = arg4 * 3;
            int var17 = arg1 * 3;
            int var18 = arg9 + var14 - var16 - arg3;
            int var19 = var15 + arg2 - arg0 - var17;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var14 - var12;
            int var22 = var17 + var13 - var15 - var15;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var19 * var26;
                int var28 = var20 * var25;
                int var29 = var18 * var26;
                int var30 = var21 * var24;
                int var31 = var22 * var25;
                int var32 = var23 * var24;
                int var33 = (var29 + var30 + var28 >> 12) + arg3;
                int var34 = (var27 + var31 + var32 >> 12) + arg0;
                class28.method255(var34, var33, (byte) 121, var10, arg8, var11);
                var10 = var33;
                var11 = var34;
            }
        }
        field3685++;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZLvh;)V", line = 508)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        if (arg0 == 0) {
            this.field1389 = arg2.method483(-110) == 1;
        }
        field3682++;
        if (!arg1) {
            field3677 = 30;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZI)I", line = 522)
    public static final int method1538(boolean arg0, int arg1) {
        if (arg0) {
            field3676++;
            return arg1 >>> 8;
        } else {
            return -33;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)[[I", line = 535)
    public final int[][] method86(int arg0, int arg1) {
        field3683++;
        int var3 = -80 / ((-arg1 - 70) / 54);
        int[][] var4 = this.field1400.method1746((byte) -3, arg0);
        if (this.field1400.field4363) {
            int[][] var5 = this.method619(0, 2, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            for (int var12 = 0; var12 < class215.field3787; var12++) {
                var9[var12] = 4096 - var6[var12];
                var11[var12] = 4096 - var7[var12];
                var10[var12] = 4096 - var8[var12];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(B)V", line = 579)
    public static final void method1539(byte arg0) {
        if (arg0 < 36) {
            field3679 = 99;
        }
        field3686++;
        class238.field4171.method1334((byte) -25);
        class153.field2771.method1334((byte) -25);
        class119.field2141.method1334((byte) -25);
        class231.field4040.method1334((byte) -25);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)V", line = 597)
    public static final void method1540(int arg0, boolean arg1) {
        field3689++;
        class219.method1610(class219.field3878, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        class219.method1600(-50.0F, -60.0F, -50.0F);
        class219.method1601(class219.field3870, 0);
        class219.method1609();
        if (arg1) {
            method1540(43, true);
        }
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(B)V", line = 614)
    public static void method1541(byte arg0) {
        field3681 = null;
        field3688 = null;
        field3691 = null;
        field3684 = null;
        if (arg0 != 16) {
            method1538(false, 79);
        }
    }
}
