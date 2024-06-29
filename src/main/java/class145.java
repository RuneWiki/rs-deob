import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public abstract class class145 extends class155 {

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "Z")
    public volatile boolean field2341 = true;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "Z")
    public static boolean field2344 = true;

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
    public static int field2347 = -2;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "Z")
    public boolean field2342;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "Z")
    public boolean field2345;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIIZLmg;ILoe;IIZI)Lmg;")
    public static final class58 method1082(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, class58 arg7, int arg8, class76 arg9, int arg10, int arg11, boolean arg12, int arg13) {
        field2348++;
        long var14 = ((long) arg0 << 32) + ((long) arg8 << 48) + (long) ((arg1 << 16) + arg2 - -(arg11 << 24));
        if (!arg6) {
            method1082(-45, 110, 127, -54, -23, -60, true, (class58) null, 58, (class76) null, -34, 52, true, -16);
        }
        class58 var16 = (class58) class294.field4677.method1418(var14, 0);
        if (var16 == null) {
            byte var17 = 3;
            byte var18;
            if (arg2 == 1) {
                var18 = 9;
            } else if (arg2 == 2) {
                var18 = 12;
            } else if (arg2 == 3) {
                var18 = 15;
            } else if (arg2 == 4) {
                var18 = 18;
            } else {
                var18 = 21;
            }
            class96 var19 = new class96((var17 * var18) + 1, var17 * 2 * var18 + -var18, 0);
            int[] var20 = new int[] { 64, 96, 128 };
            int var21 = var19.method758(0, 0, 0);
            int[][] var22 = new int[var17][var18];
            for (int var23 = 0; var23 < var17; var23++) {
                int var30 = var20[var23];
                int var31 = var20[var23];
                for (int var32 = 0; var32 < var18; var32++) {
                    int var33 = (var32 << 11) / var18;
                    int var34 = class244.field3592[var33] * var31 + arg10 >> 16;
                    int var35 = arg13 + (class244.field3590[var33] * var30) >> 16;
                    var22[var23][var32] = var19.method758(var35, 0, var34);
                }
            }
            for (int var24 = 0; var24 < var17; var24++) {
                int var25 = (var24 * 256 + 128) / var17;
                int var26 = 256 - var25;
                byte var27 = (byte) (arg1 * var26 + arg11 * var25 >> 8);
                short var28 = (short) (((arg0 & 0x7F) * var26 + (arg8 & 0x7F) * var25 & 0x7F00) + ((arg0 & 0x380) * var26 + (arg8 & 0x380) * var25 & 0x38000) + ((arg0 & 0xFC00) * var26 + (arg8 & 0xFC00) * var25 & 0xFC0000) >> 8);
                for (int var29 = 0; var29 < var18; var29++) {
                    if (var24 == 0) {
                        var19.method740(var21, var22[0][(var29 + 1) % var18], var22[0][var29], (byte) 1, var28, var27);
                    } else {
                        var19.method740(var22[var24 - 1][var29], var22[var24 - 1][(var29 + 1) % var18], var22[var24][(var29 + 1) % var18], (byte) 1, var28, var27);
                        var19.method740(var22[var24 - 1][var29], var22[var24][(var29 + 1) % var18], var22[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var19.method759(64, 768, -50, -10, -50);
            class294.field4677.method1421(var14, var16, (byte) -63);
        }
        int var36 = arg2 * 64 - 1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = var36;
        int var40 = -var36;
        int var41 = arg7.method427();
        if (arg12) {
            if (arg4 > 1152 && arg4 < 1920) {
                var39 = var36 + 128;
            }
            if (arg4 > 640 && arg4 < 1408) {
                var38 = var36 + 128;
            }
            if (arg4 > 1664 || arg4 < 384) {
                var40 -= 128;
            }
            if (arg4 > 128 && arg4 < 896) {
                var37 -= 128;
            }
        }
        if (var41 < var37) {
            var41 = var37;
        }
        int var42 = arg7.method425();
        int var43 = arg7.method415();
        if (var43 < var40) {
            var43 = var40;
        }
        int var44 = arg7.method417();
        if (var39 < var42) {
            var42 = var39;
        }
        if (var44 > var38) {
            var44 = var38;
        }
        class114 var45 = null;
        if (arg9 != null) {
            int var46 = arg9.field1191[arg3];
            var45 = class86.method636(-3, var46 >> 16);
            arg3 = var46 & 0xFFFF;
        }
        class58 var47;
        if (var45 == null) {
            var47 = var16.method419(true, true, true);
            var47.method421((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method423((var41 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method419(!var45.method854((byte) -125, arg3), !var45.method858((byte) 104, arg3), true);
            var47.method421((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method423((var41 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method416(var45, arg3);
        }
        if (arg4 != 0) {
            var47.method430(arg4);
        }
        class257 var48 = (class257) var47;
        if (class113.method851(class37.field474, 108, arg10 + var43, arg13 + var41) != arg5 || class113.method851(class37.field474, -32, arg10 + var44, arg13 + var42) != arg5) {
            for (int var49 = 0; var49 < var48.field3886; var49++) {
                var48.field3888[var49] += class113.method851(class37.field474, -28, var48.field3899[var49] + arg10, var48.field3896[var49] - -arg13) - arg5;
            }
            var48.field3892 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)[B")
    public abstract byte[] method222(byte arg0);

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(III)V")
    public static final void method1083(int arg0, int arg1, int arg2) {
        field2343++;
        if (class76.field1193 > 0) {
            class196.method1389(true, class76.field1193);
            class76.field1193 = 0;
        }
        short var3 = 256;
        int var4 = 0;
        int var5 = 0;
        int var6 = class130.field2159 * arg0;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class286.field4589[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class237.field3464[var4++];
                int var12 = class130.field2164[arg1 + (var6++)];
                if (var11 == 0) {
                    class53.field740.field2375[var5++] = var12;
                } else {
                    int var13 = var11 + 18;
                    int var14 = -(var11 - 256) - 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var15 = class185.field2762[var11];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class53.field740.field2375[var5++] = class301.method2056(-16711936, var14 * class301.method2056(var12, 16711935) + class301.method2056(var15, 16711935) * var13) + class301.method2056(var14 * class301.method2056(65280, var12) + var13 * class301.method2056(var15, 65280), 16711680) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class53.field740.field2375[var5++] = class130.field2164[var6++ + arg1];
            }
            var6 += class130.field2159 - 128;
        }
        if (arg2 != 13036) {
            field2347 = -83;
        }
        class53.field740.method729(arg1, arg0);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZIII)V")
    public static final void method1084(boolean arg0, int arg1, int arg2, int arg3) {
        class279 var4 = class111.method844(arg1, 9, -1780180960);
        var4.method1928(arg0);
        if (!arg0) {
            field2346++;
            var4.field4489 = arg3;
            var4.field4505 = arg2;
        }
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)I")
    public abstract int method223(int arg0);
}
