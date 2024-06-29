import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class180 extends class583 {

    @OriginalMember(owner = "client!r", name = "s", descriptor = "Lpca;")
    public static class714 field2406 = new class714(4);

    @OriginalMember(owner = "client!r", name = "v", descriptor = "Z")
    public static boolean field2409 = false;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field2412 = 0;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1135(int arg0) {
        field2410++;
        if (arg0 < 104) {
            method1137(-123, (byte) -71, null, -22, 108, 92, 109, -61);
        }
        class592 var1 = class682.method3825(-652872096, 15, 0);
        var1.method3350(0);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)V", line = 22)
    public static final void method1136(boolean arg0, int arg1) {
        if (arg1 != -1) {
            field2411 = -77;
        }
        field2407++;
        class364.field5157++;
        class519 var2 = class357.method2293(class427.field5994, class551.field7751, (byte) -38);
        class151.method1027(var2, -122);
        for (class47 var3 = (class47) class475.field6744.method1176(arg1 ^ 0xFFFFA055); var3 != null; var3 = (class47) class475.field6744.method1178((byte) 71)) {
            if (!var3.method1187(0)) {
                var3 = (class47) class475.field6744.method1176(24490);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field553 == 0) {
                class353.method2275(arg0, true, var3, -57);
            }
        }
        if (class486.field6819 != null) {
            class543.method3149(class486.field6819, arg1 + 2);
            class486.field6819 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB[IIIIII)V", line = 63)
    public static final void method1137(int arg0, byte arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2408++;
        if (arg3 > 0 && !class253.method1681(arg3, (byte) 100)) {
            throw new IllegalArgumentException("");
        } else if (arg5 > 0 && !class253.method1681(arg5, (byte) 48)) {
            throw new IllegalArgumentException("");
        } else if (arg4 == 32993) {
            int var8 = 0;
            int var9 = arg3 < arg5 ? arg3 : arg5;
            int var10 = arg3 >> 1;
            int var11 = arg5 >> 1;
            int[] var12 = arg2;
            int[] var13 = new int[var10 * var11];
            if (arg1 != -90) {
                method1139((byte) 30);
            }
            while (true) {
                OpenGL.glTexImage2Di(arg0, var8, arg6, arg3, arg5, 0, arg4, arg7, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = var15 + arg3;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = var12[var16++];
                        int var24 = var20 >> 16 & 0xFF;
                        int var25 = (var20 & 0xFF93) >> 8;
                        int var26 = var20 & 0xFF;
                        int var27 = var20 >> 24 & 0xFF;
                        int var28 = ((var21 & 0xFF84DC) >> 16) + var24;
                        int var29 = (var21 & 0xFF) + var26;
                        int var30 = (var21 >> 24 & 0xFF) + var27;
                        int var31 = (var21 >> 8 & 0xFF) + var25;
                        int var32 = ((var22 & 0xFFAF) >> 8) + var31;
                        int var33 = (var22 >> 24 & 0xFF) + var30;
                        int var34 = ((var22 & 0xFF3406) >> 16) + var28;
                        int var35 = (var22 & 0xFF) + var29;
                        int var36 = (var23 >> 24 & 0xFF) + var33;
                        int var37 = ((var23 & 0xFF91) >> 8) + var32;
                        int var38 = (var23 & 0xFF) + var35;
                        int var39 = (var23 >> 16 & 0xFF) + var34;
                        var13[var14++] = class325.method2116(class286.method1877(255, var38 >> 2), class325.method2116(class325.method2116(class286.method1877(1020, var39) << 14, class286.method1877(var36 << 22, -16777216)), class286.method1877(1020, var37) << 6));
                    }
                    var16 += arg3;
                    var15 += arg3;
                }
                int[] var18 = var13;
                var13 = var12;
                arg3 = var10;
                arg5 = var11;
                var12 = var18;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var8++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V", line = 170)
    public static void method1138(byte arg0) {
        if (arg0 != -76) {
            method1139((byte) 21);
        }
        field2406 = null;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(B)V", line = 185)
    public static final void method1139(byte arg0) {
        field2405++;
        if (arg0 != -95) {
            field2411 = 63;
        }
        if (class220.field2882 != null) {
            class220.field2882.method2489((byte) -108);
        }
        if (class503.field7209 != null) {
            class503.field7209.method2489((byte) -126);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I[SB)[S", line = 209)
    public static final short[] method1140(int arg0, short[] arg1, byte arg2) {
        field2404++;
        short[] var3 = new short[arg0];
        if (arg2 != -75) {
            field2411 = -6;
        }
        class255.method1692(arg1, 0, var3, 0, arg0);
        return var3;
    }
}
