import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class264 {

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "J")
    public long field4265 = 0L;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Z")
    public static boolean field4247 = false;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Z")
    public static boolean field4255 = true;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field4257 = 0;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "Lef;")
    public static class214 field4264 = null;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public int field4248;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public int field4250;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public int field4252;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public int field4253;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public int field4258;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public int field4259;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public int field4262;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Lhi;")
    public class219 field4261;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Lhi;")
    public class219 field4266;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Z")
    public static boolean field4251;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1804(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4249++;
        class187.method1299(arg5, arg3);
        int var7 = arg3 - arg4;
        int var8 = -arg3;
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = arg3;
        int var10 = arg5;
        int var11 = -var7;
        int var12 = -1;
        int var13 = var7;
        int var14 = arg0 - var7;
        int var15 = -1;
        int[] var16 = class106.field1637[arg6];
        class8.method52(arg0 - arg3, var16, var14, arg1, true);
        int var17 = arg0 + var7;
        class8.method52(var14, var16, var17, arg2, true);
        class8.method52(var17, var16, arg0 + arg3, arg1, true);
        while (var9 > var10) {
            var15 += 2;
            var12 += 2;
            var11 += var15;
            if (var11 >= 0 && var13 >= 1) {
                class6.field86[var13] = var10;
                var13--;
                var11 -= var13 << 1;
            }
            var8 += var12;
            var10++;
            if (var8 >= 0) {
                var9--;
                if (var9 < var7) {
                    int var18 = class6.field86[var9];
                    int[] var19 = class106.field1637[arg6 - var9];
                    int var20 = arg0 + var10;
                    int[] var21 = class106.field1637[arg6 + var9];
                    int var22 = arg0 - var10;
                    int var23 = arg0 - var18;
                    class8.method52(var22, var21, var23, arg1, true);
                    int var24 = arg0 + var18;
                    class8.method52(var23, var21, var24, arg2, true);
                    class8.method52(var24, var21, var20, arg1, true);
                    class8.method52(var22, var19, var23, arg1, true);
                    class8.method52(var23, var19, var24, arg2, true);
                    class8.method52(var24, var19, var20, arg1, true);
                } else {
                    int[] var25 = class106.field1637[arg6 + var9];
                    int[] var26 = class106.field1637[arg6 - var9];
                    int var27 = arg0 + var10;
                    int var28 = arg0 - var10;
                    class8.method52(var28, var25, var27, arg1, true);
                    class8.method52(var28, var26, var27, arg1, true);
                }
                var8 -= var9 << 1;
            }
            int[] var29 = class106.field1637[arg6 - var10];
            int[] var30 = class106.field1637[arg6 + var10];
            int var31 = arg0 + var9;
            int var32 = arg0 - var9;
            if (var10 >= var7) {
                class8.method52(var32, var30, var31, arg1, true);
                class8.method52(var32, var29, var31, arg1, true);
            } else {
                int var33 = var13 < var10 ? class6.field86[var10] : var13;
                int var34 = arg0 - var33;
                int var35 = arg0 + var33;
                class8.method52(var32, var30, var34, arg1, true);
                class8.method52(var34, var30, var35, arg2, true);
                class8.method52(var35, var30, var31, arg1, true);
                class8.method52(var32, var29, var34, arg1, true);
                class8.method52(var34, var29, var35, arg2, true);
                class8.method52(var35, var29, var31, arg1, true);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)I")
    public static final int method1805(int arg0, int arg1) {
        if (arg1 > -38) {
            field4257 = -123;
        }
        field4246++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public static final void method1806(byte arg0) {
        class82.field1233 = new class100(32);
        field4256++;
        int var1 = -106 % ((arg0 + 19) / 48);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4263++;
        if (arg5 < -82 && class74.method509(arg2, 0)) {
            client.method1036(class104.field1608[arg2], -1, arg0, arg4, arg6, arg7, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method1808(int arg0) {
        if (arg0 != -5) {
            method1805(4, -80);
        }
        field4264 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I[BII[Lld;IIIIIZ)V")
    public static final void method1809(int arg0, byte[] arg1, int arg2, int arg3, class79[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        field4260++;
        if (!arg10) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if (arg8 + var11 > 0 && arg8 + var11 < 103 && (arg6 + var12) > 0 && arg6 + var12 < 103) {
                        arg4[arg2].field1125[arg8 + var11][arg6 + var12] = class224.method1526(arg4[arg2].field1125[arg8 + var11][arg6 + var12], -16777217);
                    }
                }
            }
        }
        byte var13;
        if (arg10) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        class25 var14 = new class25(arg1);
        for (int var15 = arg7; var15 < var13; var15++) {
            for (int var35 = 0; var35 < 64; var35++) {
                for (int var36 = 0; var36 < 64; var36++) {
                    if (arg3 == var15 && var35 >= arg0 && arg0 + 8 > var35 && var36 >= arg5 && var36 < (arg5 + 8)) {
                        class134.method908(arg10, 0, arg2, class227.method1555(var36 & 0x7, arg7 + 22647, var35 & 0x7, arg9) + arg6, var14, 0, (byte) 98, class235.method1594(arg9, var36 & 0x7, var35 & 0x7, arg7 + 112) + arg8, arg9);
                    } else {
                        class134.method908(arg10, 0, 0, -1, var14, 0, (byte) 95, -1, 0);
                    }
                }
            }
        }
        boolean var16 = false;
        while (var14.field349 < var14.field339.length) {
            int var17 = var14.method201(255);
            if (var17 != 129) {
                var14.field349--;
                break;
            }
            for (int var18 = 0; var18 < 4; var18++) {
                byte var19 = var14.method188(-97);
                if (var19 == 0) {
                    if (var18 <= arg3) {
                        int var27 = arg8 + 7;
                        int var28 = arg8;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 >= 104) {
                            var27 = 104;
                        }
                        int var29 = arg6 + 7;
                        int var30 = arg6;
                        if (arg8 < 0) {
                            var28 = 0;
                        } else if (arg8 >= 104) {
                            var28 = 104;
                        }
                        if (arg6 < 0) {
                            var30 = 0;
                        } else if (arg6 >= 104) {
                            var30 = 104;
                        }
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 >= 104) {
                            var29 = 104;
                        }
                        while (var27 > var28) {
                            while (var30 < var29) {
                                class253.field4065[arg2][var28][var30] = 0;
                                var30++;
                            }
                            var28++;
                        }
                    }
                } else if (var19 == 1) {
                    for (int var20 = 0; var20 < 64; var20 += 4) {
                        for (int var21 = 0; var21 < 64; var21 += 4) {
                            byte var22 = var14.method188(-117);
                            if (var18 <= arg3) {
                                for (int var23 = var20; var23 < (var20 + 4); var23++) {
                                    for (int var24 = var21; var24 < var21 + 4; var24++) {
                                        if (arg0 <= var23 && arg0 + 8 > var23 && var24 >= arg5 && (arg5 + 8) > arg5) {
                                            int var25 = arg8 + class235.method1594(arg9, var24 & 0x7, var23 & 0x7, 88);
                                            int var26 = class227.method1555(var24 & 0x7, 22647, var23 & 0x7, arg9) + arg6;
                                            if (var25 >= 0 && var25 < 104 && var26 >= 0 && var26 < 104) {
                                                class253.field4065[arg2][var25][var26] = var22;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var16) {
            return;
        }
        int var31 = arg6 + 7;
        int var32 = arg8 + 7;
        for (int var33 = arg8; var33 < var32; var33++) {
            for (int var34 = arg6; var34 < var31; var34++) {
                class253.field4065[arg2][var33][var34] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ldl;ZIILdl;)Lma;")
    public static final class188 method1810(class123 arg0, boolean arg1, int arg2, int arg3, class123 arg4) {
        field4254++;
        if (!arg1) {
            field4264 = null;
        }
        return class214.method1445((byte) 124, arg4, arg2, arg3) ? class170.method1186(128, arg0.method807((byte) 77, arg3, arg2)) : null;
    }
}
