import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class182 extends class715 {

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "Ldw;")
    private class664 field2494;

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "Lifa;")
    private class413 field2491;

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "Lkr;")
    public static class602 field2496 = new class602(47, -2);

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!pr", name = "u", descriptor = "Ld;")
    public static class270 field2497;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lifa;FILifa;)Z", line = 3)
    public final boolean method1145(class413 arg0, float arg1, int arg2, class413 arg3) {
        field2492++;
        boolean var5 = true;
        class665 var6 = this.field2494.field9111;
        this.field2494.method1454(class473.field6550);
        this.field2494.method1437();
        this.field2494.method3714(-32);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field2491.field5856, this.field2491.field5856);
        this.field2494.method3703(true, false);
        this.field2494.method3680((byte) 106, false);
        this.field2494.method3707((byte) 57, false);
        this.field2494.method3684(false, -32);
        this.field2494.method3709((byte) -92, -2);
        this.field2494.method3738((byte) -63, 1);
        this.field2494.method3739(0.0F, arg1, 0.0F, 0.0F, (byte) 101);
        this.field2494.method3729((byte) 95, 34165, 34165);
        this.field2494.method3681(arg0, 0);
        this.field2494.method3738((byte) -63, 0);
        this.field2494.method3720(arg2 ^ 0xFFFF1EA3, 1);
        this.field2494.method3681(arg3, 0);
        this.field2494.method3695(var6, -17015);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method3758((byte) 123, var8, this.field2491, 0);
            var6.method3761(0, -1);
            if (!var6.method3755(0)) {
                var5 = false;
                break;
            }
            OpenGL.glBegin(7);
            if (var8 == 34069) {
                OpenGL.glTexCoord3i(65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34070) {
                OpenGL.glTexCoord3i(-65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34071) {
                OpenGL.glTexCoord3i(-65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34072) {
                OpenGL.glTexCoord3i(-65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34073) {
                OpenGL.glTexCoord3i(-65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34074) {
                OpenGL.glTexCoord3i(65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            }
            OpenGL.glEnd();
        }
        var6.method3757(0, false);
        this.field2494.method3694(var6, (byte) -115);
        if (arg2 != 33985) {
            return false;
        }
        this.field2494.method3738((byte) -63, 1);
        this.field2494.method3681(null, 0);
        this.field2494.method3729((byte) 95, 8448, 8448);
        this.field2494.method3738((byte) -63, 0);
        this.field2494.method3681(null, 0);
        OpenGL.glPopAttrib();
        this.field2494.method1544(class473.field6550[0], class473.field6550[1], class473.field6550[2], class473.field6550[3]);
        if (var5 && !this.field2494.field9147) {
            this.field2491.method3291(-1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)I", line = 203)
    public final int method1146(int arg0) {
        if (arg0 != -11083) {
            field2496 = null;
        }
        field2495++;
        return this.field2491.field5856;
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Ldw;I)V", line = 219)
    public class182(class664 arg0, int arg1) {
        this.field2494 = arg0;
        this.field2491 = new class413(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V", line = 231)
    public static void method1147(byte arg0) {
        field2497 = null;
        if (arg0 < 68) {
            method1147((byte) -124);
        }
        field2496 = null;
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)Lifa;", line = 242)
    public final class413 method1148(int arg0) {
        if (arg0 != 0) {
            field2497 = null;
        }
        field2498++;
        return this.field2491;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIIIIIILnfa;II)Z", line = 253)
    public static final boolean method1149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class228 arg9, int arg10, int arg11) {
        field2493++;
        int var12 = arg8;
        int var13 = arg3;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg8 - var14;
        int var17 = arg3 - var15;
        class202.field2678[var14][var15] = 99;
        class229.field3070[var14][var15] = 0;
        byte var18 = 0;
        class748.field10296[var18] = arg8;
        int var19 = 0;
        int var20 = -111 / ((arg2 - 66) / 40);
        int var36 = var18 + 1;
        class633.field8514[var18] = arg3;
        int[][] var21 = arg9.field3049;
        while (true) {
            label282: while (true) {
                int var22;
                int var23;
                int var24;
                int var25;
                int var27;
                do {
                    do {
                        do {
                            label259: do {
                                if (var36 == var19) {
                                    class750.field10323 = var12;
                                    class633.field8520 = var13;
                                    return false;
                                }
                                var13 = class633.field8514[var19];
                                var12 = class748.field10296[var19];
                                var22 = var12 - var16;
                                var23 = var13 - var17;
                                var19 = var19 + 1 & 0xFFF;
                                var24 = var12 - arg9.field3063;
                                var25 = var13 - arg9.field3052;
                                if (arg10 == -4) {
                                    if (arg1 == var12 && arg4 == var13) {
                                        class750.field10323 = var12;
                                        class633.field8520 = var13;
                                        return true;
                                    }
                                } else if (arg10 == -3) {
                                    if (class80.method581(arg5, var12, arg4, arg1, arg7, arg11, arg7, 32660, var13)) {
                                        class633.field8520 = var13;
                                        class750.field10323 = var12;
                                        return true;
                                    }
                                } else if (arg10 == -2) {
                                    if (arg9.method1352(arg5, arg7, var13, arg7, arg6, arg4, arg11, -25945, arg1, var12)) {
                                        class750.field10323 = var12;
                                        class633.field8520 = var13;
                                        return true;
                                    }
                                } else if (arg10 == -1) {
                                    if (arg9.method1346(-4794, arg5, arg6, var12, arg7, var13, arg1, arg11, arg4)) {
                                        class633.field8520 = var13;
                                        class750.field10323 = var12;
                                        return true;
                                    }
                                } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                                    if (arg9.method1345(arg4, arg10, arg0, 2883842, arg1, var13, arg7, var12)) {
                                        class633.field8520 = var13;
                                        class750.field10323 = var12;
                                        return true;
                                    }
                                } else if (arg9.method1353(arg1, arg7, arg4, var12, arg10, var13, (byte) 14, arg0)) {
                                    class750.field10323 = var12;
                                    class633.field8520 = var13;
                                    return true;
                                }
                                var27 = class229.field3070[var22][var23] + 1;
                                if (var22 > 0 && class202.field2678[var22 - 1][var23] == 0 && (var21[var24 - 1][var25] & 0x43A40000) == 0 && (var21[var24 - 1][var25 + arg7 - 1] & 0x4E240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= (arg7 - 1)) {
                                            class748.field10296[var36] = var12 - 1;
                                            class633.field8514[var36] = var13;
                                            var36 = var36 + 1 & 0xFFF;
                                            class202.field2678[var22 - 1][var23] = 2;
                                            class229.field3070[var22 - 1][var23] = var27;
                                            break;
                                        }
                                        if ((var21[var24 - 1][var25 + var28] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (128 - arg7 > var22 && class202.field2678[var22 + 1][var23] == 0 && (var21[arg7 + var24][var25] & 0x60E40000) == 0 && (var21[arg7 + var24][var25 + arg7 - 1] & 0x78240000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg7 - 1) {
                                            class748.field10296[var36] = var12 + 1;
                                            class633.field8514[var36] = var13;
                                            var36 = var36 + 1 & 0xFFF;
                                            class202.field2678[var22 + 1][var23] = 8;
                                            class229.field3070[var22 + 1][var23] = var27;
                                            break;
                                        }
                                        if ((var21[arg7 + var24][var25 + var29] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var23 > 0 && class202.field2678[var22][var23 - 1] == 0 && (var21[var24][var25 - 1] & 0x43A40000) == 0 && (var21[arg7 + var24 - 1][var25 - 1] & 0x60E40000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg7 - 1)) {
                                            class748.field10296[var36] = var12;
                                            class633.field8514[var36] = var13 - 1;
                                            class202.field2678[var22][var23 - 1] = 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class229.field3070[var22][var23 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 + var30][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var23 < 128 - arg7 && class202.field2678[var22][var23 + 1] == 0 && (var21[var24][arg7 + var25] & 0x4E240000) == 0 && (var21[arg7 + var24 - 1][arg7 + var25] & 0x78240000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg7 - 1) {
                                            class748.field10296[var36] = var12;
                                            class633.field8514[var36] = var13 + 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class202.field2678[var22][var23 + 1] = 4;
                                            class229.field3070[var22][var23 + 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 + var31][arg7 + var25] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 > 0 && var23 > 0 && class202.field2678[var22 - 1][var23 - 1] == 0 && (var21[var24 - 1][var25 - 1] & 0x43A40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg7 <= var32) {
                                            class748.field10296[var36] = var12 - 1;
                                            class633.field8514[var36] = var13 - 1;
                                            class202.field2678[var22 - 1][var23 - 1] = 3;
                                            var36 = var36 + 1 & 0xFFF;
                                            class229.field3070[var22 - 1][var23 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 - 1][var25 + var32 - 1] & 0x4FA40000) != 0 || (var21[var24 + var32 - 1][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if ((128 - arg7) > var22 && var23 > 0 && class202.field2678[var22 + 1][var23 - 1] == 0 && (var21[arg7 + var24][var25 - 1] & 0x60E40000) == 0) {
                                    int var33 = 1;
                                    while (true) {
                                        if (var33 >= arg7) {
                                            class748.field10296[var36] = var12 + 1;
                                            class633.field8514[var36] = var13 - 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class202.field2678[var22 + 1][var23 - 1] = 9;
                                            class229.field3070[var22 + 1][var23 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[arg7 + var24][var33 + var25 - 1] & 0x78E40000) != 0 || (var21[var24 + var33][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var33++;
                                    }
                                }
                                if (var22 > 0 && var23 < 128 - arg7 && class202.field2678[var22 - 1][var23 + 1] == 0 && (var21[var24 - 1][arg7 + var25] & 0x4E240000) == 0) {
                                    for (int var34 = 1; var34 < arg7; var34++) {
                                        if ((var21[var24 - 1][var25 + var34] & 0x4FA40000) != 0 || (var21[var24 + var34 - 1][arg7 + var25] & 0x7E240000) != 0) {
                                            continue label259;
                                        }
                                    }
                                    class748.field10296[var36] = var12 - 1;
                                    class633.field8514[var36] = var13 + 1;
                                    var36 = var36 + 1 & 0xFFF;
                                    class202.field2678[var22 - 1][var23 + 1] = 6;
                                    class229.field3070[var22 - 1][var23 + 1] = var27;
                                }
                            } while (128 - arg7 <= var22);
                        } while ((128 - arg7) <= var23);
                    } while (class202.field2678[var22 + 1][var23 + 1] != 0);
                } while ((var21[var24 + arg7][arg7 + var25] & 0x78240000) != 0);
                for (int var35 = 1; var35 < arg7; var35++) {
                    if ((var21[var24 + var35][arg7 + var25] & 0x7E240000) != 0 || (var21[arg7 + var24][var25 + var35] & 0x78E40000) != 0) {
                        continue label282;
                    }
                }
                class748.field10296[var36] = var12 + 1;
                class633.field8514[var36] = var13 + 1;
                class202.field2678[var22 + 1][var23 + 1] = 12;
                var36 = var36 + 1 & 0xFFF;
                class229.field3070[var22 + 1][var23 + 1] = var27;
            }
        }
    }
}
