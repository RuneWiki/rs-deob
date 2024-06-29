import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class94 extends class690 {

    @OriginalMember(owner = "client!cea", name = "S", descriptor = "I")
    public int field1456 = 99;

    @OriginalMember(owner = "client!cea", name = "M", descriptor = "Lefa;")
    public static class322 field1450 = new class322(32);

    @OriginalMember(owner = "client!cea", name = "O", descriptor = "Z")
    public static boolean field1452 = false;

    @OriginalMember(owner = "client!cea", name = "T", descriptor = "I")
    public static int field1457 = -1;

    @OriginalMember(owner = "client!cea", name = "P", descriptor = "Lps;")
    public static class5 field1453 = null;

    @OriginalMember(owner = "client!cea", name = "Q", descriptor = "Lmb;")
    public static class383 field1454 = new class383();

    @OriginalMember(owner = "client!cea", name = "R", descriptor = "F")
    public static float field1455;

    @OriginalMember(owner = "client!cea", name = "D", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!cea", name = "F", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!cea", name = "G", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!cea", name = "H", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!cea", name = "I", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!cea", name = "J", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!cea", name = "L", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!cea", name = "N", descriptor = "I")
    public static int field1451;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cea", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field1458;

    // $FF: synthetic method
    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method595(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "([BLr;III[Lwg;)V", line = 3)
    public final void method586(byte[] arg0, class98 arg1, int arg2, int arg3, int arg4, class516[] arg5) {
        ++field1446;
        if (arg4 == 3) {
            class540 var7 = new class540(arg0);
            int var8 = -1;
            while (true) {
                int var9 = var7.method3174((byte) 43);
                if (~var9 == -1) {
                    return;
                }
                var8 += var9;
                int var10 = 0;
                while (true) {
                    int var11 = var7.method3109(-2);
                    if (var11 == 0) {
                        break;
                    }
                    var10 += var11 + -1;
                    int var12 = 63 & var10;
                    int var13 = (var10 & 4077) >> 6;
                    int var14 = var10 >> 12;
                    int var15 = var7.method3115(29871);
                    int var16 = var15 >> 2;
                    int var17 = 3 & var15;
                    int var18 = arg2 + var13;
                    int var19 = arg3 + var12;
                    if (~var18 < -1 && var19 > 0 && ~(super.field9729 + -1) < ~var18 && ~(super.field9720 - 1) < ~var19) {
                        class516 var20 = null;
                        if (!super.field9738) {
                            int var21 = var14;
                            if (~(class317.field4622[1][var18][var19] & 2) == -3) {
                                var21 = var14 - 1;
                            }
                            if (var21 >= 0) {
                                var20 = arg5[var21];
                            }
                        }
                        this.method593(arg1, var14, var18, var16, var14, (byte) 29, -1, var19, var20, var8, var17);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(I[BII[Lwg;IIIILr;I)V", line = 79)
    public final void method587(int arg0, byte[] arg1, int arg2, int arg3, class516[] arg4, int arg5, int arg6, int arg7, int arg8, class98 arg9, int arg10) {
        if (arg10 < 53) {
            field1454 = null;
        }
        ++field1451;
        class540 var12 = new class540(arg1);
        int var13 = -1;
        while (true) {
            int var14 = var12.method3174((byte) 43);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method3109(-2);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = 63 & var15;
                int var18 = var15 >> 6 & 63;
                int var19 = var15 >> 12;
                int var20 = var12.method3115(29871);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (~arg7 == ~var19 && ~arg5 >= ~var18 && var18 < arg5 - -8 && arg6 <= var17 && ~(arg6 - -8) < ~var17) {
                    class289 var23 = class60.field965.method2596(0, var13);
                    int var24 = class285.method1685(var23.field4269, 7 & var18, var23.field4197, var22, 3, var17 & 7, arg8) + arg2;
                    int var25 = class261.method1573(var22, 12283, var23.field4197, var17 & 7, var23.field4269, arg8, 7 & var18) + arg3;
                    if (var24 > 0 && var25 > 0 && var24 < super.field9729 + -1 && ~(super.field9720 + -1) < ~var25) {
                        class516 var26 = null;
                        if (!super.field9738) {
                            int var27 = arg0;
                            if ((2 & class317.field4622[1][var24][var25]) == 2) {
                                var27 = arg0 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg4[var27];
                            }
                        }
                        this.method593(arg9, arg0, var24, var21, arg0, (byte) 116, -1, var25, var26, var13, arg8 + var22 & 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(IIIZ)V", line = 160)
    public class94(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class2.field15, class547.field8069);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILwg;BLr;III)V", line = 165)
    public final void method588(int arg0, class516 arg1, byte arg2, class98 arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 79) {
            field1453 = null;
        }
        ++field1447;
        class83 var8 = null;
        if (~arg5 == -1) {
            var8 = (class83) class386.method2381(arg4, arg0, arg6);
        }
        if (arg5 == 1) {
            var8 = (class83) class374.method2304(arg4, arg0, arg6);
        }
        if (~arg5 == -3) {
            var8 = (class83) class434.method2583(arg4, arg0, arg6, field1458 != null ? field1458 : (field1458 = method595("je")));
        }
        if (~arg5 == -4) {
            var8 = (class83) class566.method3261(arg4, arg0, arg6);
        }
        if (var8 != null) {
            class289 var9 = class60.field965.method2596(0, var8.method277((byte) 95));
            int var10 = var8.method264(-5273);
            int var11 = var8.method263((byte) 97);
            if (var9.method1775(-1)) {
                class500.method2852(0, arg0, arg4, var9, arg6);
            }
            if (var8.method266(arg2 ^ 28036)) {
                var8.method265(arg3, true);
            }
            if (~arg5 == -1) {
                class268.method1601(arg4, arg0, arg6);
                if (~var9.field4273 != -1) {
                    arg1.method2911(var11, !var9.field4221, arg0, var10, var9.field4240, (byte) -37, arg6);
                }
                if (~var9.field4244 == -2) {
                    if (var11 != 0) {
                        if (var11 == 1) {
                            class314.method1949(1, 2, arg6 - -1, arg0, arg4);
                            return;
                        }
                        if (var11 != 2) {
                            if (~var11 == -4) {
                                class314.method1949(1, 2, arg6, arg0, arg4);
                                return;
                            }
                        } else {
                            class314.method1949(1, 1, arg6, arg0 + 1, arg4);
                        }
                        return;
                    }
                    class314.method1949(1, 1, arg6, arg0, arg4);
                    return;
                }
            } else if (arg5 != 1) {
                if (arg5 != 2) {
                    if (~arg5 == -4) {
                        class269.method1608(arg4, arg0, arg6);
                        if (var9.field4273 == 1) {
                            arg1.method2908(1, arg6, arg0);
                            return;
                        }
                    }
                    return;
                }
                class679.method3814(arg4, arg0, arg6, field1458 != null ? field1458 : (field1458 = method595("je")));
                if (~var9.field4273 != -1 && ~(var9.field4269 + arg0) > ~super.field9729 && ~(var9.field4269 + arg6) > ~super.field9720 && var9.field4197 + arg0 < super.field9729 && ~super.field9720 < ~(var9.field4197 + arg6)) {
                    arg1.method2910(var9.field4240, !var9.field4221, (byte) 76, arg0, var11, arg6, var9.field4197, var9.field4269);
                    return;
                }
            } else {
                class524.method2969(arg4, arg0, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZILr;)V", line = 264)
    public final void method589(boolean arg0, int arg1, class98 arg2) {
        if (arg1 <= 58) {
            method592((byte) -106, (String) null, (class287) null, 118);
        }
        class303.method1913();
        ++field1445;
        if (!arg0) {
            if (~super.field9722 < -2) {
                for (int var4 = 0; super.field9729 > var4; ++var4) {
                    for (int var5 = 0; ~super.field9720 < ~var5; ++var5) {
                        if ((2 & class317.field4622[1][var4][var5]) == 2) {
                            class613.method3487(var4, var5);
                        }
                    }
                }
            }
            for (int var6 = 0; var6 < super.field9722; ++var6) {
                for (int var7 = 0; var7 <= super.field9720; ++var7) {
                    for (int var8 = 0; ~super.field9729 <= ~var8; ++var8) {
                        if (~(4 & super.field9728[var6][var8][var7]) != -1) {
                            int var9 = var8;
                            int var10 = var8;
                            int var11 = var7;
                            int var12 = var7;
                            while (~var11 < -1 && ~(super.field9728[var6][var8][var11 + -1] & 4) != -1 && ~(-var11 + var12) > -11) {
                                --var11;
                            }
                            while (super.field9720 > var12 && (4 & super.field9728[var6][var8][var12 + 1]) != 0 && -var11 + var12 < 10) {
                                ++var12;
                            }
                            label117: while (~var9 < -1 && ~(-var9 + var10) > -11) {
                                for (int var13 = var11; ~var12 <= ~var13; ++var13) {
                                    if (~(super.field9728[var6][var9 + -1][var13] & 4) == -1) {
                                        break label117;
                                    }
                                }
                                --var9;
                            }
                            label104: while (super.field9729 > var10 && ~(-var9 + var10) > -11) {
                                for (int var14 = var11; ~var12 <= ~var14; ++var14) {
                                    if ((super.field9728[var6][var10 + 1][var14] & 4) == 0) {
                                        break label104;
                                    }
                                }
                                ++var10;
                            }
                            if (~((var10 + 1 + -var9) * (var12 + 1 + -var11)) <= -5) {
                                int var15 = super.field9731[var6][var9][var11];
                                class619.method3565(var6, -117, var11 << 9, 4, var9 << 9, (var12 << 9) + 512, var15, (var10 << 9) + 512, var15);
                                for (int var16 = var9; ~var10 <= ~var16; ++var16) {
                                    for (int var17 = var11; var17 <= var12; ++var17) {
                                        super.field9728[var6][var16][var17] = (byte) class425.method2563(super.field9728[var6][var16][var17], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class339.method2096(0);
        }
        super.field9728 = null;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(BILgk;Lr;[II)V", line = 408)
    public final void method590(byte arg0, int arg1, class540 arg2, class98 arg3, int[] arg4, int arg5) {
        ++field1443;
        if (!super.field9738) {
            if (arg0 == 0) {
                boolean var7 = false;
                class453 var8 = null;
                if (arg4 != null) {
                    arg4[0] = -1;
                }
                while (true) {
                    while (true) {
                        while (true) {
                            while (true) {
                                while (~arg2.field7952.length < ~arg2.field7956) {
                                    int var18 = arg2.method3115(29871);
                                    if (var18 != 0) {
                                        if (var18 != 1) {
                                            if (var18 != 2) {
                                                if (~var18 != -129) {
                                                    if (var18 != 129) {
                                                        throw new IllegalStateException("");
                                                    }
                                                    if (super.field9743 == null) {
                                                        super.field9743 = new byte[4][][];
                                                    }
                                                    for (int var19 = 0; var19 < 4; ++var19) {
                                                        byte var20 = arg2.method3128(32767);
                                                        if (var20 == 0 && super.field9743[var19] != null) {
                                                            int var21 = arg5;
                                                            int var22 = arg5 + 64;
                                                            int var23 = arg1;
                                                            if (~var22 > -1) {
                                                                var22 = 0;
                                                            } else if (~super.field9729 >= ~var22) {
                                                                var22 = super.field9729;
                                                            }
                                                            if (arg5 >= 0) {
                                                                if (arg5 >= super.field9729) {
                                                                    var21 = super.field9729;
                                                                }
                                                            } else {
                                                                var21 = 0;
                                                            }
                                                            int var24 = arg1 + 64;
                                                            if (arg1 < 0) {
                                                                var23 = 0;
                                                            } else if (arg1 >= super.field9720) {
                                                                var23 = super.field9720;
                                                            }
                                                            if (var24 >= 0) {
                                                                if (~super.field9720 >= ~var24) {
                                                                    var24 = super.field9720;
                                                                }
                                                            } else {
                                                                var24 = 0;
                                                            }
                                                            while (var22 > var21) {
                                                                while (~var24 < ~var23) {
                                                                    super.field9743[var19][var21][var23] = 0;
                                                                    ++var23;
                                                                }
                                                                ++var21;
                                                            }
                                                        } else if (~var20 == -2) {
                                                            if (super.field9743[var19] == null) {
                                                                super.field9743[var19] = new byte[super.field9729 + 1][super.field9720 + 1];
                                                            }
                                                            for (int var25 = 0; var25 < 64; var25 += 4) {
                                                                for (int var26 = 0; ~var26 > -65; var26 += 4) {
                                                                    byte var27 = arg2.method3128(32767);
                                                                    for (int var28 = arg5 + var25; ~var28 > ~(arg5 + var25 - -4); ++var28) {
                                                                        for (int var29 = arg1 + var26; var26 - -arg1 + 4 > var29; ++var29) {
                                                                            if (~var28 <= -1 && ~super.field9729 < ~var28 && ~var29 <= -1 && super.field9720 > var29) {
                                                                                super.field9743[var19][var28][var29] = var27;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else if (var20 == 2) {
                                                            if (super.field9743[var19] == null) {
                                                                super.field9743[var19] = new byte[super.field9729 - -1][super.field9720 + 1];
                                                            }
                                                            if (var19 > 0) {
                                                                int var30 = arg5;
                                                                int var31 = arg5 + 64;
                                                                int var32 = arg1;
                                                                if (~arg1 <= -1) {
                                                                    if (super.field9720 <= arg1) {
                                                                        var32 = super.field9720;
                                                                    }
                                                                } else {
                                                                    var32 = 0;
                                                                }
                                                                if (var31 >= 0) {
                                                                    if (var31 >= super.field9729) {
                                                                        var31 = super.field9729;
                                                                    }
                                                                } else {
                                                                    var31 = 0;
                                                                }
                                                                int var33 = arg1 + 64;
                                                                if (arg5 < 0) {
                                                                    var30 = 0;
                                                                } else if (~super.field9729 >= ~arg5) {
                                                                    var30 = super.field9729;
                                                                }
                                                                if (~var33 <= -1) {
                                                                    if (var33 >= super.field9720) {
                                                                        var33 = super.field9720;
                                                                    }
                                                                } else {
                                                                    var33 = 0;
                                                                }
                                                                while (var31 > var30) {
                                                                    while (var33 > var32) {
                                                                        super.field9743[var19][var30][var32] = super.field9743[var19 + -1][var30][var32];
                                                                        ++var32;
                                                                    }
                                                                    ++var30;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    var7 = true;
                                                } else if (arg4 == null) {
                                                    arg2.field7956 += 10;
                                                } else {
                                                    arg4[0] = arg2.method3169(26488);
                                                    arg4[1] = arg2.method3129(class145.method1006(arg0, 101));
                                                    arg4[2] = arg2.method3129(121);
                                                    arg4[3] = arg2.method3129(71);
                                                    arg4[4] = arg2.method3169(arg0 + 26488);
                                                }
                                            } else {
                                                if (var8 == null) {
                                                    var8 = new class453();
                                                }
                                                var8.method2658(arg2, 113);
                                            }
                                        } else {
                                            int var34 = arg2.method3115(29871);
                                            if (var34 > 0) {
                                                for (int var35 = 0; var34 > var35; ++var35) {
                                                    class471 var36 = new class471(arg3, arg2, 2);
                                                    if (~var36.field6772 == -32) {
                                                        class554 var37 = class342.field5068.method2763(arg2.method3169(arg0 + 26488), -31148);
                                                        var36.method2713(var37.field8141, var37.field8136, var37.field8137, -92, var37.field8134);
                                                    }
                                                    if (arg3.method669() > 0) {
                                                        class334 var38 = var36.field6773;
                                                        int var39 = var38.method2050((byte) -19) - -(arg5 << 9);
                                                        int var40 = var38.method2046(true) + (arg1 << 9);
                                                        int var41 = var39 >> 9;
                                                        int var42 = var40 >> 9;
                                                        if (~var41 <= -1 && var42 >= 0 && var41 < super.field9729 && super.field9720 > var42) {
                                                            var38.method1166(6211, super.field9731[var36.field6775][var41][var42] - var38.method2045(0), var40, var39);
                                                            class405.method2497(var36);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        var8 = new class453(arg2);
                                    }
                                }
                                if (var8 != null) {
                                    for (int var9 = 0; ~var9 > -9; ++var9) {
                                        for (int var10 = 0; ~var10 > -9; ++var10) {
                                            int var11 = (arg5 >> 3) + var9;
                                            int var12 = (arg1 >> 3) + var10;
                                            if (var11 >= 0 && ~(super.field9729 >> 3) < ~var11 && var12 >= 0 && var12 < super.field9720 >> 3) {
                                                class169.method1177(var11, (byte) -93, var12, var8);
                                            }
                                        }
                                    }
                                }
                                if (!var7 && super.field9743 != null) {
                                    for (int var13 = 0; var13 < 4; ++var13) {
                                        if (super.field9743[var13] != null) {
                                            for (int var14 = 0; ~var14 > -17; ++var14) {
                                                for (int var15 = 0; ~var15 > -17; ++var15) {
                                                    int var16 = (arg5 >> 2) + var14;
                                                    int var17 = (arg1 >> 2) + var15;
                                                    if (var16 >= 0 && ~var16 > -27 && ~var17 <= -1 && ~var17 > -27) {
                                                        super.field9743[var13][var16][var17] = 0;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)V", line = 772)
    public static void method591(int arg0) {
        field1454 = null;
        field1450 = null;
        int var1 = 57 / ((3 - arg0) / 60);
        field1453 = null;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(BLjava/lang/String;Luca;I)Lg;", line = 784)
    public static final class129 method592(byte arg0, String arg1, class287 arg2, int arg3) {
        int var4 = -70 / ((32 - arg0) / 49);
        ++field1448;
        long var5 = OpenGL.glCreateShaderObjectARB(arg3);
        OpenGL.glShaderSourceARB(var5, arg1);
        OpenGL.glCompileShaderARB(var5);
        OpenGL.glGetObjectParameterivARB(var5, 35713, class597.field8646, 0);
        if (~class597.field8646[0] == -1) {
            if (~class597.field8646[0] == -1) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var5, 35716, class597.field8646, 1);
            if (~class597.field8646[1] < -2) {
                byte[] var7 = new byte[class597.field8646[1]];
                OpenGL.glGetInfoLogARB(var5, class597.field8646[1], class597.field8646, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class597.field8646[0] == 0) {
                OpenGL.glDeleteObjectARB(var5);
                return null;
            }
        }
        return new class129(arg2, var5, arg3);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lr;IIIIBIILwg;II)V", line = 823)
    public final void method593(class98 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, class516 arg8, int arg9, int arg10) {
        ++field1444;
        if (class335.field4872.method3439(class62.field996, false) || class257.method1538(106, arg7, class432.field6276, arg2, arg4)) {
            if (~arg1 > ~this.field1456) {
                this.field1456 = arg1;
            }
            class289 var12 = class60.field965.method2596(0, arg9);
            if (!arg0.method618() || !class335.field4872.field9465 || !var12.field4248) {
                int var13;
                int var14;
                if (arg10 != 1 && arg10 != 3) {
                    var13 = var12.field4197;
                    var14 = var12.field4269;
                } else {
                    var14 = var12.field4197;
                    var13 = var12.field4269;
                }
                int var15;
                int var16;
                if (~(arg2 + var14) < ~super.field9729) {
                    var15 = arg2 + 1;
                    var16 = arg2;
                } else {
                    var16 = (var14 >> 1) + arg2;
                    var15 = (var14 + 1 >> 1) + arg2;
                }
                int var17;
                int var18;
                if (super.field9720 >= arg7 + var13) {
                    var17 = (var13 + 1 >> 1) + arg7;
                    var18 = arg7 - -(var13 >> 1);
                } else {
                    var18 = arg7;
                    var17 = arg7 + 1;
                }
                class682 var19 = class178.field2480[arg4];
                int var20 = var19.method3822(var18, var16, 0) - -var19.method3822(var18, var15, 0) - -var19.method3822(var17, var16, 0) - -var19.method3822(var17, var15, 0) >> 2;
                int var21 = (arg2 << 9) - -(var14 << 8);
                int var22 = (arg7 << 9) + (var13 << 8);
                boolean var23 = class194.field2597 && !super.field9738 && var12.field4242;
                if (var12.method1775(-1)) {
                    class61.method381(arg2, (class71) null, arg10, arg7, arg1, var12, 0, (class53) null);
                }
                int var24 = -72 / ((74 - arg5) / 36);
                boolean var25 = arg6 == -1 && ~var12.field4214 == 0 && var12.field4236 == null && var12.field4213 == null && !var12.field4271;
                if (!class543.field8033 || (!class594.method3381(102, arg3) || var12.field4244 == 1) && (!class400.method2480(-18, arg3) || var12.field4244 != 0)) {
                    if (~arg3 == -23) {
                        if (class335.field4872.field9480 || ~var12.field4250 != -1 || ~var12.field4273 == -2 || var12.field4198) {
                            class518 var27;
                            if (var25) {
                                class435 var26 = new class435(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, arg10, var23);
                                var27 = var26;
                                if (var26.method266(28107)) {
                                    var26.method273((byte) 105, arg0);
                                }
                            } else {
                                var27 = new class77(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, arg10, arg6);
                            }
                            class13.method89(arg1, arg2, arg7, var27);
                            if (~var12.field4273 == -2 && arg8 != null) {
                                arg8.method2916(arg2, arg7, 110);
                            }
                        }
                    } else if (arg3 != 10 && ~arg3 != -12) {
                        if (~arg3 <= -13 && ~arg3 >= -18 || arg3 >= 18 && arg3 <= 21) {
                            class293 var28;
                            if (!var25) {
                                var28 = new class685(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, arg2, arg2 - -var14 - 1, arg7, arg7 - -var13 + -1, arg3, arg10, arg6);
                            } else {
                                class188 var29 = new class188(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, arg2, var14 + -1 + arg2, arg7, arg7 + -1 + var13, arg3, arg10, var23);
                                if (var29.method266(28107)) {
                                    var29.method273((byte) -115, arg0);
                                }
                                var28 = var29;
                            }
                            class591.method3367(var28, false);
                            if (class194.field2597 && !super.field9738 && arg3 >= 12 && arg3 <= 17 && ~arg3 != -14 && ~arg1 < -1 && ~var12.field4244 != -1) {
                                super.field9728[arg1][arg2][arg7] = (byte) class151.method1076(super.field9728[arg1][arg2][arg7], 4);
                            }
                            if (var12.field4273 != 0 && arg8 != null) {
                                arg8.method2919(!var12.field4221, arg7, -3, var14, arg2, var13, var12.field4240);
                            }
                        } else if (arg3 == 0) {
                            int var30 = var12.field4244;
                            if (class35.field555 && var12.field4244 == -1) {
                                var30 = 1;
                            }
                            class332 var32;
                            if (var25) {
                                class264 var31 = new class264(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, arg3, arg10, var23);
                                if (var31.method266(28107)) {
                                    var31.method273((byte) 80, arg0);
                                }
                                var32 = var31;
                            } else {
                                var32 = new class135(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, arg3, arg10, arg6);
                            }
                            class401.method2484(arg1, arg2, arg7, var32, (class332) null);
                            if (~arg10 == -1) {
                                if (class194.field2597 && var12.field4254) {
                                    var19.method2183(arg2, arg7, 50);
                                    var19.method2183(arg2, arg7 + 1, 50);
                                }
                                if (~var30 == -2 && !super.field9738) {
                                    class559.method3241(1, arg1, arg2, 1, var12.field4234, var12.field4245, arg7);
                                }
                            } else if (arg10 == 1) {
                                if (class194.field2597 && var12.field4254) {
                                    var19.method2183(arg2, arg7 - -1, 50);
                                    var19.method2183(arg2 + 1, arg7 - -1, 50);
                                }
                                if (~var30 == -2 && !super.field9738) {
                                    class559.method3241(1, arg1, arg2, 2, var12.field4234, -var12.field4245, arg7 - -1);
                                }
                            } else if (arg10 == 2) {
                                if (class194.field2597 && var12.field4254) {
                                    var19.method2183(arg2 + 1, arg7, 50);
                                    var19.method2183(arg2 + 1, arg7 + 1, 50);
                                }
                                if (var30 == 1 && !super.field9738) {
                                    class559.method3241(1, arg1, arg2 + 1, 1, var12.field4234, -var12.field4245, arg7);
                                }
                            } else if (~arg10 == -4) {
                                if (class194.field2597 && var12.field4254) {
                                    var19.method2183(arg2, arg7, 50);
                                    var19.method2183(arg2 + 1, arg7, 50);
                                }
                                if (var30 == 1 && !super.field9738) {
                                    class559.method3241(1, arg1, arg2, 2, var12.field4234, var12.field4245, arg7);
                                }
                            }
                            if (~var12.field4273 != -1 && arg8 != null) {
                                arg8.method2912(arg2, -122, arg3, !var12.field4221, var12.field4240, arg10, arg7);
                            }
                            if (~var12.field4268 != -65) {
                                class362.method2221(arg1, arg2, arg7, var12.field4268);
                            }
                        } else if (arg3 == 1) {
                            class332 var33;
                            if (!var25) {
                                var33 = new class135(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, arg3, arg10, arg6);
                            } else {
                                class264 var34 = new class264(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, arg3, arg10, var23);
                                if (var34.method266(28107)) {
                                    var34.method273((byte) -96, arg0);
                                }
                                var33 = var34;
                            }
                            class401.method2484(arg1, arg2, arg7, var33, (class332) null);
                            if (var12.field4254 && class194.field2597) {
                                if (~arg10 == -1) {
                                    var19.method2183(arg2, arg7 + 1, 50);
                                } else if (arg10 == 1) {
                                    var19.method2183(arg2 + 1, arg7 + 1, 50);
                                } else if (arg10 == 2) {
                                    var19.method2183(arg2 + 1, arg7, 50);
                                } else if (~arg10 == -4) {
                                    var19.method2183(arg2, arg7, 50);
                                }
                            }
                            if (~var12.field4273 != -1 && arg8 != null) {
                                arg8.method2912(arg2, -125, arg3, !var12.field4221, var12.field4240, arg10, arg7);
                            }
                        } else if (arg3 == 2) {
                            int var35 = arg10 + 1 & 3;
                            class332 var36;
                            class332 var37;
                            if (!var25) {
                                var36 = new class135(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, arg3, arg10 + 4, arg6);
                                var37 = new class135(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, arg3, var35, arg6);
                            } else {
                                class264 var38 = new class264(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, arg3, arg10 + 4, var23);
                                class264 var39 = new class264(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, arg3, var35, var23);
                                if (var38.method266(28107)) {
                                    var38.method273((byte) -113, arg0);
                                }
                                var36 = var38;
                                if (var39.method266(28107)) {
                                    var39.method273((byte) 119, arg0);
                                }
                                var37 = var39;
                            }
                            class401.method2484(arg1, arg2, arg7, var36, var37);
                            if ((var12.field4244 == 1 || class35.field555 && var12.field4244 == -1) && !super.field9738) {
                                if (~arg10 == -1) {
                                    class559.method3241(1, arg1, arg2, 1, var12.field4234, var12.field4245, arg7);
                                    class559.method3241(1, arg1, arg2, 2, var12.field4234, var12.field4245, arg7 + 1);
                                } else if (~arg10 != -2) {
                                    if (arg10 != 2) {
                                        if (arg10 == 3) {
                                            class559.method3241(1, arg1, arg2, 1, var12.field4234, var12.field4245, arg7);
                                            class559.method3241(1, arg1, arg2, 2, var12.field4234, var12.field4245, arg7);
                                        }
                                    } else {
                                        class559.method3241(1, arg1, arg2 + 1, 1, var12.field4234, var12.field4245, arg7);
                                        class559.method3241(1, arg1, arg2, 2, var12.field4234, var12.field4245, arg7);
                                    }
                                } else {
                                    class559.method3241(1, arg1, arg2 + 1, 1, var12.field4234, var12.field4245, arg7);
                                    class559.method3241(1, arg1, arg2, 2, var12.field4234, var12.field4245, arg7 + 1);
                                }
                            }
                            if (~var12.field4273 != -1 && arg8 != null) {
                                arg8.method2912(arg2, -128, arg3, !var12.field4221, var12.field4240, arg10, arg7);
                            }
                            if (var12.field4268 != 64) {
                                class362.method2221(arg1, arg2, arg7, var12.field4268);
                            }
                        } else if (arg3 == 3) {
                            class332 var40;
                            if (!var25) {
                                var40 = new class135(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, arg3, arg10, arg6);
                            } else {
                                class264 var41 = new class264(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, arg3, arg10, var23);
                                var40 = var41;
                                if (var41.method266(28107)) {
                                    var41.method273((byte) 91, arg0);
                                }
                            }
                            class401.method2484(arg1, arg2, arg7, var40, (class332) null);
                            if (var12.field4254 && class194.field2597) {
                                if (arg10 == 0) {
                                    var19.method2183(arg2, arg7 + 1, 50);
                                } else if (~arg10 != -2) {
                                    if (arg10 != 2) {
                                        if (~arg10 == -4) {
                                            var19.method2183(arg2, arg7, 50);
                                        }
                                    } else {
                                        var19.method2183(arg2 - -1, arg7, 50);
                                    }
                                } else {
                                    var19.method2183(arg2 - -1, arg7 - -1, 50);
                                }
                            }
                            if (var12.field4273 != 0 && arg8 != null) {
                                arg8.method2912(arg2, -128, arg3, !var12.field4221, var12.field4240, arg10, arg7);
                            }
                        } else if (~arg3 == -10) {
                            class293 var43;
                            if (var25) {
                                class188 var42 = new class188(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, arg2, arg2, arg7, arg7, arg3, arg10, var23);
                                if (var42.method266(28107)) {
                                    var42.method273((byte) -57, arg0);
                                }
                                var43 = var42;
                            } else {
                                var43 = new class685(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, arg2, arg2 + -1 - -var14, arg7, arg7 + var13 + -1, arg3, arg10, arg6);
                            }
                            class591.method3367(var43, false);
                            if (var12.field4273 != 0 && arg8 != null) {
                                arg8.method2919(!var12.field4221, arg7, -3, var14, arg2, var13, var12.field4240);
                            }
                            if (~var12.field4268 != -65) {
                                class362.method2221(arg1, arg2, arg7, var12.field4268);
                            }
                        } else if (arg3 == 4) {
                            class391 var44;
                            if (!var25) {
                                var44 = new class202(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, 0, 0, arg3, arg10, arg6);
                            } else {
                                class46 var45 = new class46(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, 0, 0, arg3, arg10);
                                if (var45.method266(28107)) {
                                    var45.method273((byte) -115, arg0);
                                }
                                var44 = var45;
                            }
                            class9.method65(arg1, arg2, arg7, var44, (class391) null);
                        } else if (~arg3 == -6) {
                            int var46 = 65;
                            class83 var47 = (class83) class386.method2381(arg1, arg2, arg7);
                            if (var47 != null) {
                                var46 = 1 + class60.field965.method2596(0, var47.method277((byte) 95)).field4268;
                            }
                            class391 var49;
                            if (var25) {
                                class46 var48 = new class46(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, class106.field1579[arg10] * var46, class90.field1371[arg10] * var46, arg3, arg10);
                                if (var48.method266(28107)) {
                                    var48.method273((byte) -119, arg0);
                                }
                                var49 = var48;
                            } else {
                                var49 = new class202(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, class106.field1579[arg10] * var46, class90.field1371[arg10] * var46, arg3, arg10, arg6);
                            }
                            class9.method65(arg1, arg2, arg7, var49, (class391) null);
                        } else if (arg3 == 6) {
                            int var50 = 33;
                            class83 var51 = (class83) class386.method2381(arg1, arg2, arg7);
                            if (var51 != null) {
                                var50 = 1 + class60.field965.method2596(0, var51.method277((byte) 95)).field4268 / 2;
                            }
                            class391 var52;
                            if (!var25) {
                                var52 = new class202(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, class2.field14[arg10] * var50, class300.field4454[arg10] * var50, arg3, arg10 + 4, arg6);
                            } else {
                                class46 var53 = new class46(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, class106.field1579[arg10] * var50, class90.field1371[arg10] * var50, arg3, arg10 + 4);
                                if (var53.method266(28107)) {
                                    var53.method273((byte) -89, arg0);
                                }
                                var52 = var53;
                            }
                            class9.method65(arg1, arg2, arg7, var52, (class391) null);
                        } else if (~arg3 == -8) {
                            int var54 = arg10 + 2 & 3;
                            class391 var56;
                            if (var25) {
                                class46 var55 = new class46(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, 0, 0, arg3, var54 - -4);
                                if (var55.method266(28107)) {
                                    var55.method273((byte) -104, arg0);
                                }
                                var56 = var55;
                            } else {
                                var56 = new class202(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, 0, 0, arg3, var54 + 4, arg6);
                            }
                            class9.method65(arg1, arg2, arg7, var56, (class391) null);
                        } else if (~arg3 == -9) {
                            int var57 = 3 & arg10 - -2;
                            int var58 = 33;
                            class83 var59 = (class83) class386.method2381(arg1, arg2, arg7);
                            if (var59 != null) {
                                var58 = 1 + class60.field965.method2596(0, var59.method277((byte) 95)).field4268 / 2;
                            }
                            class391 var62;
                            class391 var63;
                            if (var25) {
                                class46 var60 = new class46(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, class2.field14[arg10] * var58, class300.field4454[arg10] * var58, arg3, arg10 + 4);
                                class46 var61 = new class46(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, 0, 0, arg3, var57 + 4);
                                if (var60.method266(28107)) {
                                    var60.method273((byte) 124, arg0);
                                }
                                var62 = var60;
                                if (var61.method266(28107)) {
                                    var61.method273((byte) 113, arg0);
                                }
                                var63 = var61;
                            } else {
                                class202 var64 = new class202(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, class2.field14[arg10] * var58, class300.field4454[arg10] * var58, arg3, arg10 + 4, arg6);
                                class202 var65 = new class202(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, 0, 0, arg3, var57 + 4, arg6);
                                var62 = var64;
                                var63 = var65;
                            }
                            class9.method65(arg1, arg2, arg7, var62, var63);
                        }
                    } else {
                        class188 var66 = null;
                        class293 var67;
                        int var68;
                        if (!var25) {
                            var67 = new class685(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, arg2, var14 + -1 + arg2, arg7, var13 - 1 + arg7, arg3, arg10, arg6);
                            var68 = 15;
                        } else {
                            class188 var69 = new class188(arg0, var12, arg1, arg4, var21, var20, var22, super.field9738, arg2, arg2 + var14 + -1, arg7, arg7 + -1 + var13, arg3, arg10, var23);
                            var68 = var69.method1246(125);
                            var67 = var69;
                            var66 = var69;
                        }
                        if (class591.method3367(var67, false)) {
                            if (var66 != null && var66.method266(28107)) {
                                var66.method273((byte) 64, arg0);
                            }
                            if (var12.field4254 && class194.field2597) {
                                if (~var68 < -31) {
                                    var68 = 30;
                                }
                                for (int var70 = 0; ~var14 <= ~var70; ++var70) {
                                    for (int var71 = 0; var71 <= var13; ++var71) {
                                        var19.method2183(arg2 + var70, arg7 - -var71, var68);
                                    }
                                }
                            }
                        }
                        if (~var12.field4273 != -1 && arg8 != null) {
                            arg8.method2919(!var12.field4221, arg7, -3, var14, arg2, var13, var12.field4240);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(I[ILgk;ILr;IIIIII)V", line = 1446)
    public final void method594(int arg0, int[] arg1, class540 arg2, int arg3, class98 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg8 != -26720) {
            field1454 = null;
        }
        ++field1449;
        if (!super.field9738) {
            boolean var12 = false;
            if (arg1 != null) {
                arg1[0] = -1;
            }
            class453 var13 = null;
            int var14 = (arg9 & 7) * 8;
            int var15 = (arg6 & 7) * 8;
            while (true) {
                while (true) {
                    while (true) {
                        while (arg2.field7952.length > arg2.field7956) {
                            int var20 = arg2.method3115(29871);
                            if (~var20 != -1) {
                                if (var20 != 1) {
                                    if (var20 == 2) {
                                        if (var13 == null) {
                                            var13 = new class453();
                                        }
                                        var13.method2658(arg2, -69);
                                    } else if (var20 == 128) {
                                        if (arg1 != null) {
                                            arg1[0] = arg2.method3169(arg8 + 53208);
                                            arg1[1] = arg2.method3129(75);
                                            arg1[2] = arg2.method3129(82);
                                            arg1[3] = arg2.method3129(90);
                                            arg1[4] = arg2.method3169(26488);
                                        } else {
                                            arg2.field7956 += 10;
                                        }
                                    } else {
                                        if (~var20 != -130) {
                                            throw new IllegalStateException("");
                                        }
                                        if (super.field9743 == null) {
                                            super.field9743 = new byte[4][][];
                                        }
                                        for (int var21 = 0; ~var21 > -5; ++var21) {
                                            byte var22 = arg2.method3128(32767);
                                            if (var22 == 0 && super.field9743[arg0] != null) {
                                                if (arg10 >= var21) {
                                                    int var23 = arg7;
                                                    int var24 = arg7 - -7;
                                                    int var25 = arg3;
                                                    if (arg3 < 0) {
                                                        var25 = 0;
                                                    } else if (~arg3 <= ~super.field9720) {
                                                        var25 = super.field9720;
                                                    }
                                                    if (var24 < 0) {
                                                        var24 = 0;
                                                    } else if (~var24 <= ~super.field9729) {
                                                        var24 = super.field9729;
                                                    }
                                                    if (arg7 < 0) {
                                                        var23 = 0;
                                                    } else if (~super.field9729 >= ~arg7) {
                                                        var23 = super.field9729;
                                                    }
                                                    int var26 = arg3 + 7;
                                                    if (~var26 > -1) {
                                                        var26 = 0;
                                                    } else if (super.field9720 <= var26) {
                                                        var26 = super.field9720;
                                                    }
                                                    while (var23 < var24) {
                                                        while (~var25 > ~var26) {
                                                            super.field9743[arg0][var23][var25] = 0;
                                                            ++var25;
                                                        }
                                                        ++var23;
                                                    }
                                                }
                                            } else if (var22 == 1) {
                                                if (super.field9743[arg0] == null) {
                                                    super.field9743[arg0] = new byte[super.field9729 + 1][super.field9720 + 1];
                                                }
                                                for (int var27 = 0; ~var27 > -65; var27 += 4) {
                                                    for (int var28 = 0; var28 < 64; var28 += 4) {
                                                        byte var29 = arg2.method3128(32767);
                                                        if (~var21 >= ~arg10) {
                                                            for (int var30 = var27; var30 < var27 - -4; ++var30) {
                                                                for (int var31 = var28; ~(var28 + 4) < ~var31; ++var31) {
                                                                    if (var30 >= var14 && ~(var14 + 8) < ~var30 && ~var31 <= ~var15 && var15 - -8 > var15) {
                                                                        int var32 = class518.method2929(7 & var30, arg5, (byte) -124, 7 & var31) + arg7;
                                                                        int var33 = arg3 - -class417.method2534(var30 & 7, 0, arg5, 7 & var31);
                                                                        if (~var32 <= -1 && ~var32 > ~super.field9729 && ~var33 <= -1 && ~var33 > ~super.field9720) {
                                                                            super.field9743[arg0][var32][var33] = var29;
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
                                } else {
                                    int var34 = arg2.method3115(29871);
                                    if (~var34 < -1) {
                                        for (int var35 = 0; var34 > var35; ++var35) {
                                            class471 var36 = new class471(arg4, arg2, 2);
                                            if (var36.field6772 == 31) {
                                                class554 var37 = class342.field5068.method2763(arg2.method3169(arg8 ^ -3880), -31148);
                                                var36.method2713(var37.field8141, var37.field8136, var37.field8137, -77, var37.field8134);
                                            }
                                            if (arg4.method669() > 0) {
                                                class334 var38 = var36.field6773;
                                                int var39 = var38.method2050((byte) -6) >> 9;
                                                int var40 = var38.method2046(true) >> 9;
                                                if (var36.field6775 == arg10 && ~var14 >= ~var39 && var39 < var14 + 8 && var15 <= var40 && var40 < var15 + 8) {
                                                    int var41 = (arg7 << 9) + class20.method135(4095 & var38.method2046(true), arg5, 4095 & var38.method2050((byte) -88), (byte) -21);
                                                    int var42 = var41 >> 9;
                                                    int var43 = class249.method1512(arg5, -86, var38.method2050((byte) -40) & 4095, 4095 & var38.method2046(true)) + (arg3 << 9);
                                                    int var44 = var43 >> 9;
                                                    if (var42 >= 0 && var44 >= 0 && var42 < super.field9729 && ~var44 > ~super.field9720) {
                                                        var38.method1166(6211, super.field9731[arg10][var42][var44] - var38.method2045(0), var43, var41);
                                                        class405.method2497(var36);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                var13 = new class453(arg2);
                            }
                        }
                        if (var13 != null) {
                            class169.method1177(arg7 >> 3, (byte) -100, arg3 >> 3, var13);
                        }
                        if (!var12 && super.field9743 != null && super.field9743[arg0] != null) {
                            int var16 = arg7 + 7;
                            int var17 = arg3 + 7;
                            for (int var18 = arg7; ~var16 < ~var18; ++var18) {
                                for (int var19 = arg3; ~var19 > ~var17; ++var19) {
                                    super.field9743[arg0][var18][var19] = 0;
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }
}
