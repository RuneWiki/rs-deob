import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class109 extends class185 {

    @OriginalMember(owner = "client!co", name = "A", descriptor = "I")
    private int field1358 = -1;

    @OriginalMember(owner = "client!co", name = "L", descriptor = "I")
    private int field1369 = -1;

    @OriginalMember(owner = "client!co", name = "C", descriptor = "I")
    public int field1360;

    @OriginalMember(owner = "client!co", name = "D", descriptor = "I")
    public int field1361;

    @OriginalMember(owner = "client!co", name = "y", descriptor = "Ljava/lang/String;")
    public static String field1356 = null;

    @OriginalMember(owner = "client!co", name = "J", descriptor = "I")
    public static int field1367 = 0;

    @OriginalMember(owner = "client!co", name = "B", descriptor = "F")
    public static float field1359;

    @OriginalMember(owner = "client!co", name = "x", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!co", name = "z", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!co", name = "E", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!co", name = "F", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!co", name = "I", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!co", name = "K", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!co", name = "M", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!co", name = "G", descriptor = "Lpfa;")
    public static class275 field1364;

    @OriginalMember(owner = "client!co", name = "H", descriptor = "[J")
    public static long[] field1365;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IZZ)V")
    public final void method758(int arg0, boolean arg1, boolean arg2) {
        if (super.field2169 == 3553) {
            super.field2172.method3194((byte) 75, this);
            OpenGL.glTexParameteri(super.field2169, 10242, !arg1 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field2169, 10243, arg2 ? 10497 : 33071);
        }
        if (arg0 > 35) {
            ++field1370;
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Ljaa;IIIII)V")
    public class109(class576 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field1360 = arg4;
        this.field1361 = arg5;
        int var7 = super.field2172.field7403 - arg5 - arg3;
        super.field2172.method3194((byte) 75, this);
        OpenGL.glCopyTexImage2D(super.field2169, 0, super.field2180, arg2, var7, arg4, arg5, 0);
        this.method1101(10240, true);
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(B)V")
    public static void method759(byte arg0) {
        field1356 = null;
        field1364 = null;
        if (arg0 < 125) {
            method759((byte) -46);
        }
        field1365 = null;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIII)V")
    public final void method760(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != -10237) {
            this.method298((byte) 91);
        }
        ++field1363;
        int var8 = -arg0 + -arg5 + super.field2172.field7403;
        super.field2172.method3194((byte) 75, this);
        OpenGL.glCopyTexSubImage2D(super.field2169, 0, arg6, -arg0 + -arg1 + this.field1361, arg2, var8, arg4, arg0);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IBII)V")
    public final void method761(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 < -27) {
            OpenGL.glFramebufferTexture2DEXT(arg3, arg0, super.field2169, super.field2185, arg2);
            ++field1362;
            this.field1358 = arg3;
            this.field1369 = arg0;
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Ljaa;IIIIZ[FI)V")
    public class109(class576 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field1361 = arg4;
        this.field1360 = arg3;
        super.field2172.method3194((byte) 75, this);
        if (arg5 && super.field2169 != 34037) {
            class479.method2617(arg6, arg7, arg3, (byte) -127, arg2, arg1, arg4);
            this.method1094((byte) -50, true);
        } else {
            OpenGL.glTexImage2Df(super.field2169, 0, super.field2180, this.field1360, this.field1361, 0, arg7, 5126, arg6, 0);
            this.method1094((byte) -50, false);
        }
        this.method1101(10240, true);
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(II)I")
    public static int method762(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "([[[Lqs;ZIIII)Z")
    public static final boolean method763(class565[][][] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1357;
        byte var6 = !arg1 ? (byte) (class197.field2318 & 255) : 1;
        if (class252.field3249[class675.field9219][arg3][arg4] == var6) {
            return false;
        } else if (~(4 & class234.field3033[class675.field9219][arg3][arg4]) == -1) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = arg5;
            class103.field1323[var7] = arg3;
            int var35 = var7 + 1;
            class89.field1158[var7] = arg4;
            class252.field3249[class675.field9219][arg3][arg4] = var6;
            while (~var35 != ~var8) {
                int var9 = class103.field1323[var8] & 65535;
                int var10 = (16753591 & class103.field1323[var8]) >> 16;
                int var11 = class103.field1323[var8] >> 24 & 255;
                int var12 = 65535 & class89.field1158[var8];
                int var13 = (class89.field1158[var8] & 16766934) >> 16;
                var8 = 4095 & var8 + 1;
                boolean var14 = false;
                if ((4 & class234.field3033[class675.field9219][var9][var12]) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label233: for (int var16 = class675.field9219 + 1; var16 <= 3; ++var16) {
                    if ((8 & class234.field3033[var16][var9][var12]) == 0) {
                        if (var14 && arg0[var16][var9][var12] != null) {
                            if (arg0[var16][var9][var12].field7079 != null) {
                                int var20 = class90.method673(var10, arg5 + 3);
                                if (arg0[var16][var9][var12].field7079.field7103 == var20 || arg0[var16][var9][var12].field7087 != null && arg0[var16][var9][var12].field7087.field7103 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class90.method673(var11, 3);
                                    if (arg0[var16][var9][var12].field7079.field7103 == var21 || arg0[var16][var9][var12].field7087 != null && arg0[var16][var9][var12].field7087.field7103 == var21) {
                                        continue;
                                    }
                                }
                                if (~var13 != -1) {
                                    int var22 = class90.method673(var13, 3);
                                    if (arg0[var16][var9][var12].field7079.field7103 == var22 || arg0[var16][var9][var12].field7087 != null && ~arg0[var16][var9][var12].field7087.field7103 == ~var22) {
                                        continue;
                                    }
                                }
                            }
                            class565 var23 = arg0[var16][var9][var12];
                            if (var23.field7074 != null) {
                                for (class436 var24 = var23.field7074; var24 != null; var24 = var24.field5485) {
                                    class597 var25 = var24.field5486;
                                    if (var25 instanceof class310) {
                                        class310 var26 = (class310) var25;
                                        int var27 = var26.method138(8470);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method139((byte) 42);
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || ~var11 != -1 && var11 == var29 || var13 != 0 && ~var13 == ~var29) {
                                            continue label233;
                                        }
                                    }
                                }
                            }
                        }
                        class565 var30 = arg0[var16][var9][var12];
                        if (var30 != null && var30.field7074 != null) {
                            for (class436 var31 = var30.field7074; var31 != null; var31 = var31.field5485) {
                                class597 var32 = var31.field5486;
                                if (~var32.field8017 != ~var32.field8005 || var32.field8014 != var32.field8008) {
                                    for (int var33 = var32.field8017; var32.field8005 >= var33; ++var33) {
                                        for (int var34 = var32.field8014; ~var34 >= ~var32.field8008; ++var34) {
                                            class252.field3249[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class252.field3249[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class299.field3801[class675.field9219 - -1].method201(var9, var12);
                    if (var17 > class478.field5956[arg2]) {
                        class478.field5956[arg2] = var17;
                    }
                    int var18 = var9 << 9;
                    if (var18 >= class711.field9936[arg2]) {
                        if (~class102.field1311[arg2] > ~var18) {
                            class102.field1311[arg2] = var18;
                        }
                    } else {
                        class711.field9936[arg2] = var18;
                    }
                    int var19 = var12 << 9;
                    if (~class245.field3161[arg2] < ~var19) {
                        class245.field3161[arg2] = var19;
                    } else if (var19 > class228.field2948[arg2]) {
                        class228.field2948[arg2] = var19;
                    }
                }
                if (!var14) {
                    if (~var9 <= -2 && class252.field3249[class675.field9219][var9 + -1][var12] != var6) {
                        class103.field1323[var35] = class364.method2113(-754974720, class364.method2113(var9 + -1, 1179648));
                        class89.field1158[var35] = class364.method2113(var12, 1245184);
                        class252.field3249[class675.field9219][var9 + -1][var12] = var6;
                        var35 = var35 + 1 & 4095;
                    }
                    ++var12;
                    if (~var12 > ~class656.field8932) {
                        if (var9 + -1 >= 0 && ~class252.field3249[class675.field9219][var9 + -1][var12] != ~var6 && ~(4 & class234.field3033[class675.field9219][var9][var12]) == -1 && ~(4 & class234.field3033[class675.field9219][var9 + -1][var12 - 1]) == -1) {
                            class103.field1323[var35] = class364.method2113(1375731712, class364.method2113(var9 + -1, 1179648));
                            class89.field1158[var35] = class364.method2113(1245184, var12);
                            class252.field3249[class675.field9219][var9 - 1][var12] = var6;
                            var35 = 4095 & var35 + 1;
                        }
                        if (class252.field3249[class675.field9219][var9][var12] != var6) {
                            class103.field1323[var35] = class364.method2113(class364.method2113(5373952, var9), 318767104);
                            class89.field1158[var35] = class364.method2113(var12, 5439488);
                            class252.field3249[class675.field9219][var9][var12] = var6;
                            var35 = 4095 & var35 - -1;
                        }
                        if (class85.field1090 > var9 + 1 && ~class252.field3249[class675.field9219][var9 + 1][var12] != ~var6 && (class234.field3033[class675.field9219][var9][var12] & 4) == 0 && ~(class234.field3033[class675.field9219][var9 + 1][var12 + -1] & 4) == -1) {
                            class103.field1323[var35] = class364.method2113(-1845493760, class364.method2113(var9 + 1, 5373952));
                            class89.field1158[var35] = class364.method2113(var12, 5439488);
                            var35 = var35 + 1 & 4095;
                            class252.field3249[class675.field9219][var9 + 1][var12] = var6;
                        }
                    }
                    --var12;
                    if (var9 + 1 < class85.field1090 && ~class252.field3249[class675.field9219][var9 + 1][var12] != ~var6) {
                        class103.field1323[var35] = class364.method2113(class364.method2113(var9 + 1, 9568256), 1392508928);
                        class89.field1158[var35] = class364.method2113(9633792, var12);
                        class252.field3249[class675.field9219][var9 + 1][var12] = var6;
                        var35 = 4095 & var35 + 1;
                    }
                    --var12;
                    if (~var12 <= -1) {
                        if (~(var9 - 1) <= -1 && class252.field3249[class675.field9219][var9 - 1][var12] != var6 && ~(class234.field3033[class675.field9219][var9][var12] & 4) == -1 && ~(class234.field3033[class675.field9219][var9 + -1][var12 - -1] & 4) == -1) {
                            class103.field1323[var35] = class364.method2113(class364.method2113(var9 + -1, 13762560), 301989888);
                            class89.field1158[var35] = class364.method2113(13828096, var12);
                            class252.field3249[class675.field9219][var9 + -1][var12] = var6;
                            var35 = var35 - -1 & 4095;
                        }
                        if (~class252.field3249[class675.field9219][var9][var12] != ~var6) {
                            class103.field1323[var35] = class364.method2113(class364.method2113(13762560, var9), -1828716544);
                            class89.field1158[var35] = class364.method2113(var12, 13828096);
                            class252.field3249[class675.field9219][var9][var12] = var6;
                            var35 = var35 + 1 & 4095;
                        }
                        if (var9 + 1 < class85.field1090 && class252.field3249[class675.field9219][var9 + 1][var12] != var6 && (class234.field3033[class675.field9219][var9][var12] & 4) == 0 && ~(class234.field3033[class675.field9219][var9 + 1][var12 + 1] & 4) == -1) {
                            class103.field1323[var35] = class364.method2113(class364.method2113(9568256, var9 + 1), -771751936);
                            class89.field1158[var35] = class364.method2113(var12, 9633792);
                            class252.field3249[class675.field9219][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 4095;
                        }
                    }
                }
            }
            if (~class478.field5956[arg2] != 999999) {
                class478.field5956[arg2] += 10;
                class711.field9936[arg2] -= 50;
                class102.field1311[arg2] += 50;
                class228.field2948[arg2] += 50;
                class245.field3161[arg2] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Ljaa;IIII)V")
    public class109(class576 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field1360 = arg3;
        this.field1361 = arg4;
        super.field2172.method3194((byte) 75, this);
        OpenGL.glTexImage2Dub(super.field2169, 0, super.field2180, arg3, arg4, 0, class443.method2433((byte) 30, super.field2180), 5121, (byte[]) null, 0);
        this.method1101(10240, true);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIZIIII[II)V")
    public final void method764(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8) {
        ++field1366;
        if (arg4 == 0) {
            arg4 = arg6;
        }
        if (arg2) {
            int[] var10 = new int[arg3 * arg6];
            for (int var11 = 0; ~var11 > ~arg3; ++var11) {
                int var12 = arg6 * var11;
                int var13 = (-var11 + arg3 + -1) * arg4 - -arg0;
                for (int var14 = 0; arg6 > var14; ++var14) {
                    var10[var12++] = arg7[var13++];
                }
            }
            arg7 = var10;
        }
        super.field2172.method3194((byte) 75, this);
        if (arg5 == 1) {
            if (arg4 != arg6) {
                OpenGL.glPixelStorei(3314, arg4);
            }
            OpenGL.glTexSubImage2Di(super.field2169, 0, arg1, arg8, arg6, arg3, 32993, super.field2172.field7726, arg7, arg0);
            if (arg4 != arg6) {
                OpenGL.glPixelStorei(3314, 0);
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Ljaa;IIIIZ[BIZ)V")
    public class109(class576 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field1361 = arg4;
        this.field1360 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; var11 < arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 + -1 - var11) * arg3;
                for (int var14 = 0; var14 < arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field2172.method3194((byte) 75, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field2169 != 34037) {
            class157.method965(arg6, (byte) 118, arg2, arg1, arg3, arg7, arg4);
            this.method1094((byte) -50, true);
        } else {
            OpenGL.glTexImage2Dub(super.field2169, 0, super.field2180, this.field1360, this.field1361, 0, arg7, 5121, arg6, 0);
            this.method1094((byte) -50, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1101(10240, true);
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Ljaa;IIIIZ[IZ)V")
    public class109(class576 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field1361 = arg4;
        this.field1360 = arg3;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; var10 < arg4; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (arg4 + -1 + -var10) * arg3;
                for (int var13 = 0; ~arg3 < ~var13; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field2172.method3194((byte) 75, this);
        if (arg5 && super.field2169 != 34037) {
            class46.method284(32993, (byte) -95, this.field1360, arg6, super.field2172.field7726, super.field2169, super.field2180, this.field1361);
            this.method1094((byte) -50, true);
        } else {
            OpenGL.glTexImage2Di(super.field2169, 0, super.field2180, this.field1360, this.field1361, 0, 32993, super.field2172.field7726, arg6, 0);
            this.method1094((byte) -50, false);
        }
        this.method1101(10240, true);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
    public final void method298(byte arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field1358, this.field1369, super.field2169, 0, 0);
        ++field1368;
        this.field1358 = -1;
        this.field1369 = -1;
        if (arg0 != -99) {
            this.method298((byte) -12);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIZ[BZIIII)V")
    public final void method765(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field1355;
        if (arg8 == 0) {
            arg8 = arg0;
        }
        if (arg3) {
            int var11 = class285.method1717(1, arg1);
            int var12 = arg0 * var11;
            int var13 = arg8 * var11;
            byte[] var14 = new byte[arg7 * var12];
            for (int var15 = 0; arg7 > var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg7 - 1 + -var15) * var13 + arg2;
                for (int var18 = 0; ~var12 < ~var18; ++var18) {
                    var14[var16++] = arg4[var17++];
                }
            }
            arg4 = var14;
        }
        super.field2172.method3194((byte) 75, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg0 != arg8) {
            OpenGL.glPixelStorei(3314, arg8);
        }
        OpenGL.glTexSubImage2Dub(super.field2169, 0, arg6, arg9, arg0, arg7, arg1, 5121, arg4, arg2);
        if (~arg0 != ~arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg5) {
            OpenGL.glPixelStorei(3317, 4);
        }
    }
}
