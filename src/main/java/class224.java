import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class224 {

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public int field3823 = -1;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public int field3819 = -1;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public int field3809 = -1;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public int field3815 = -1;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public int field3813 = 99;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public int field3827 = 5;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "Z")
    private boolean field3832 = false;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "Z")
    public boolean field3830 = false;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    public int field3837 = 2;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    public int field3848 = -1;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field3831 = 0;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "Lr;")
    private static class66 field3821 = class93.method641(43, "purple:");

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "Lr;")
    public static class66 field3835 = field3821;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "Lr;")
    public static class66 field3828 = class93.method641(43, "details");

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "Lr;")
    public static class66 field3839 = field3821;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "Lr;")
    public static class66 field3840 = class93.method641(43, "hint_mapedge");

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "[Lr;")
    public static class66[] field3843 = new class66[100];

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "Lr;")
    private static class66 field3846 = class93.method641(43, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "Lr;")
    public static class66 field3829 = field3846;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "B")
    public static byte field3847;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Llb;")
    public static class228 field3812;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Lsg;")
    public static class247 field3814;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "[I")
    public int[] field3811;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "[I")
    public static int[] field3818;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "[I")
    private int[] field3824;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "[I")
    private int[] field3826;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "[I")
    public int[] field3834;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "[[I")
    public int[][] field3810;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljh;II)Ljh;")
    public final class262 method1419(class262 arg0, int arg1, int arg2) {
        int var4 = this.field3811[arg2];
        field3841++;
        class154 var5 = class241.method1592(var4 >> 16, (byte) -40);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1482(true, true);
        }
        class262 var7 = arg0.method1482(!var5.method1050(true, var6), !this.field3832);
        if (arg1 != 8493) {
            this.field3809 = 85;
        }
        var7.method1493(var5, var6, this.field3832);
        return var7;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lik;BLjava/awt/Component;II)Lff;")
    public static final class241 method1420(class117 arg0, byte arg1, Component arg2, int arg3, int arg4) {
        field3845++;
        if (class200.field3446 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class241 var5 = (class241) Class.forName("gh").getDeclaredConstructor().newInstance();
                var5.field4206 = new int[(class162.field2909 ? 2 : 1) * 256];
                var5.field4213 = arg3;
                var5.method23(arg2);
                var5.field4217 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field4217 > 16384) {
                    var5.field4217 = 16384;
                }
                var5.method18(var5.field4217);
                if (class173.field3045 > 0 && class103.field2003 == null) {
                    class103.field2003 = new class174();
                    class103.field2003.field3061 = arg0;
                    arg0.method770((byte) -125, class173.field3045, class103.field2003);
                }
                if (class103.field2003 != null) {
                    if (class103.field2003.field3069[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class103.field2003.field3069[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class5 var6 = new class5(arg0, arg4);
                    if (arg1 != 104) {
                        return null;
                    }
                    var6.field4213 = arg3;
                    var6.field4206 = new int[(class162.field2909 ? 2 : 1) * 256];
                    var6.method23(arg2);
                    var6.field4217 = 16384;
                    var6.method18(var6.field4217);
                    if (class173.field3045 > 0 && class103.field2003 == null) {
                        class103.field2003 = new class174();
                        class103.field2003.field3061 = arg0;
                        arg0.method770((byte) -117, class173.field3045, class103.field2003);
                    }
                    if (class103.field2003 != null) {
                        if (class103.field2003.field3069[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class103.field2003.field3069[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class241();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method1421(int arg0) {
        field3829 = null;
        field3814 = null;
        field3812 = null;
        field3818 = null;
        field3835 = null;
        field3840 = null;
        if (arg0 != 31891) {
            return;
        }
        field3821 = null;
        field3843 = null;
        field3846 = null;
        field3828 = null;
        field3839 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZLjh;)Ljh;")
    public final class262 method1422(int arg0, boolean arg1, class262 arg2) {
        field3838++;
        int var4 = this.field3811[arg0];
        class154 var5 = class241.method1592(var4 >> 16, (byte) -89);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method1480(true, true);
        } else {
            class262 var7 = arg2.method1480(!var5.method1050(arg1, var6), !this.field3832);
            var7.method1493(var5, var6, this.field3832);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILfa;I)V")
    public static final void method1423(int arg0, int arg1, class45 arg2, int arg3) {
        if (arg1 != 0) {
            return;
        }
        field3820++;
        if (arg2.field2084 == arg3 && arg3 != -1) {
            class224 var4 = class47.method335((byte) -36, arg3);
            int var5 = var4.field3837;
            if (var5 == 1) {
                arg2.field2065 = 0;
                arg2.field2072 = 0;
                arg2.field2038 = 0;
                arg2.field2061 = arg0;
                class103.method713(false, arg2.field2038, arg2.field2077, var4, class207.field3595 == arg2, arg2.field2053);
            }
            if (var5 == 2) {
                arg2.field2065 = 0;
                return;
            }
        } else if (arg3 == -1 || arg2.field2084 == -1 || class47.method335((byte) -36, arg3).field3827 >= class47.method335((byte) -36, arg2.field2084).field3827) {
            arg2.field2084 = arg3;
            arg2.field2038 = 0;
            arg2.field2065 = 0;
            arg2.field2072 = 0;
            arg2.field2061 = arg0;
            arg2.field2073 = arg2.field2095;
            if (arg2.field2084 != -1) {
                class103.method713(false, arg2.field2038, arg2.field2077, class47.method335((byte) -36, arg2.field2084), class207.field3595 == arg2, arg2.field2053);
                return;
            }
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)I")
    public static final int method1424(int arg0, int arg1) {
        field3825++;
        if (arg0 != 1) {
            field3818 = null;
        }
        if (arg1 >= 65 && arg1 <= 90 || arg1 >= 192 && arg1 <= 222 && arg1 != 215) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLjh;I)Ljh;")
    public final class262 method1425(byte arg0, class262 arg1, int arg2) {
        field3842++;
        int var4 = this.field3811[arg2];
        class154 var5 = class241.method1592(var4 >> 16, (byte) -94);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method1480(true, true);
        }
        class154 var7 = null;
        int var8 = 0;
        if (this.field3824 != null && this.field3824.length > arg2) {
            int var9 = this.field3824[arg2];
            var7 = class241.method1592(var9 >> 16, (byte) -48);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class262 var12 = arg1.method1480(!var5.method1050(true, var6), !this.field3832);
            var12.method1493(var5, var6, this.field3832);
            return var12;
        }
        int var10 = -27 % ((arg0 + 5) / 51);
        class262 var11 = arg1.method1480(!var5.method1050(true, var6) & !var7.method1050(true, var8), !this.field3832);
        var11.method1493(var5, var6, this.field3832);
        var11.method1493(var7, var8, this.field3832);
        return var11;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Llh;II)V")
    private final void method1426(class249 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            int var4 = arg0.method1674(arg2 + 1355778338);
            this.field3834 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3834[var5] = arg0.method1674(class109.method741(arg2, -1355760786));
            }
            this.field3811 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3811[var6] = arg0.method1674(1355769544);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3811[var7] += arg0.method1674(1355769544) << 16;
            }
        } else if (arg1 == 2) {
            this.field3848 = arg0.method1674(arg2 ^ 0xAF30BB6E);
        } else if (arg1 == 3) {
            int var8 = arg0.method1677(-6677);
            this.field3826 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3826[var9] = arg0.method1677(-6677);
            }
            this.field3826[var8] = 9999999;
        } else if (arg1 == 4) {
            this.field3830 = true;
        } else if (arg1 == 5) {
            this.field3827 = arg0.method1677(-6677);
        } else if (arg1 == 6) {
            this.field3823 = arg0.method1674(1355769544);
        } else if (arg1 == 7) {
            this.field3809 = arg0.method1674(1355769544);
        } else if (arg1 == 8) {
            this.field3813 = arg0.method1677(arg2 ^ 0x384D);
        } else if (arg1 == 9) {
            this.field3819 = arg0.method1677(-6677);
        } else if (arg1 == 10) {
            this.field3815 = arg0.method1677(-6677);
        } else if (arg1 == 11) {
            this.field3837 = arg0.method1677(arg2 + 2117);
        } else if (arg1 == 12) {
            int var10 = arg0.method1677(arg2 ^ 0x384D);
            this.field3824 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field3824[var11] = arg0.method1674(1355769544);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field3824[var12] += arg0.method1674(1355769544) << 16;
            }
        } else if (arg1 == 13) {
            int var13 = arg0.method1674(1355769544);
            this.field3810 = new int[var13][];
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = arg0.method1677(-6677);
                if (var15 > 0) {
                    this.field3810[var14] = new int[var15];
                    this.field3810[var14][0] = arg0.method1648((byte) -97);
                    for (int var16 = 1; var16 < var15; var16++) {
                        this.field3810[var14][var16] = arg0.method1674(1355769544);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field3832 = true;
        }
        if (arg2 == -8794) {
            field3808++;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIZIII[IIIII)V")
    public static final void method1427(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg7;
        field3836++;
        if (arg7 >= class235.field4101) {
            return;
        }
        if (arg7 < class235.field4103) {
            var11 = class235.field4103;
        }
        int var12 = arg7 + arg1;
        if (class235.field4103 >= var12) {
            return;
        }
        int var13 = arg8;
        if (class235.field4101 < var12) {
            var12 = class235.field4101;
        }
        if (class235.field4107 <= arg8) {
            return;
        }
        int var14 = arg3 + arg8;
        if (arg8 < class235.field4106) {
            var13 = class235.field4106;
        }
        if (var14 <= class235.field4106) {
            return;
        }
        if (var14 > class235.field4107) {
            var14 = class235.field4107;
        }
        int var15 = var14 - arg8;
        if (arg0 == 9) {
            arg9 = arg9 + 1 & 0x3;
            arg0 = 1;
        }
        if (arg10 != 2) {
            method1421(-121);
        }
        int var16 = class235.field4104 * var13 + var11;
        if (arg0 == 10) {
            arg9 = arg9 + 3 & 0x3;
            arg0 = 1;
        }
        int var17 = var13 - arg8;
        if (arg0 == 11) {
            arg0 = 8;
            arg9 = arg9 + 3 & 0x3;
        }
        int var18 = class235.field4104 + var11 - var12;
        int var19 = var11 - arg7;
        int var20 = var12 - arg7;
        int var21 = arg1 - var20;
        int var22 = arg1 - var19;
        int var23 = arg3 - var15;
        int var24 = arg3 - var17;
        if (arg0 == 1) {
            if (arg9 == 0) {
                for (int var25 = var17; var25 < var15; var25++) {
                    for (int var26 = var19; var26 < var20; var26++) {
                        if (var25 >= var26) {
                            arg6[var16] = arg5;
                        } else if (arg2) {
                            arg6[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg9 == 1) {
                for (int var27 = var24 - 1; var27 >= var23; var27--) {
                    for (int var28 = var19; var28 < var20; var28++) {
                        if (var28 <= var27) {
                            arg6[var16] = arg5;
                        } else if (arg2) {
                            arg6[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg9 == 2) {
                for (int var29 = var17; var29 < var15; var29++) {
                    for (int var30 = var19; var30 < var20; var30++) {
                        if (var30 >= var29) {
                            arg6[var16] = arg5;
                        } else if (arg2) {
                            arg6[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg9 == 3) {
                for (int var31 = var24 - 1; var31 >= var23; var31--) {
                    for (int var32 = var19; var32 < var20; var32++) {
                        if (var31 <= var32) {
                            arg6[var16] = arg5;
                        } else if (arg2) {
                            arg6[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg0 == 2) {
            if (arg9 == 0) {
                for (int var33 = var24 - 1; var33 >= var23; var33--) {
                    for (int var34 = var19; var34 < var20; var34++) {
                        if (var34 <= var33 >> 1) {
                            arg6[var16] = arg5;
                        } else if (arg2) {
                            arg6[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg9 == 1) {
                for (int var35 = var17; var35 < var15; var35++) {
                    for (int var36 = var19; var36 < var20; var36++) {
                        if (var16 >= 0 && arg6.length > var16) {
                            if ((var35 << 1) <= var36) {
                                arg6[var16] = arg5;
                            } else if (arg2) {
                                arg6[var16] = arg4;
                            }
                            var16++;
                        } else {
                            var16++;
                        }
                    }
                    var16 += var18;
                }
            } else if (arg9 == 2) {
                for (int var37 = var17; var37 < var15; var37++) {
                    for (int var38 = var22 - 1; var38 >= var21; var38--) {
                        if ((var37 >> 1) >= var38) {
                            arg6[var16] = arg5;
                        } else if (arg2) {
                            arg6[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg9 == 3) {
                for (int var39 = var24 - 1; var39 >= var23; var39--) {
                    for (int var40 = var22 - 1; var40 >= var21; var40--) {
                        if ((var39 << 1) <= var40) {
                            arg6[var16] = arg5;
                        } else if (arg2) {
                            arg6[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg0 == 3) {
            if (arg9 == 0) {
                for (int var41 = var24 - 1; var41 >= var23; var41--) {
                    for (int var42 = var22 - 1; var42 >= var21; var42--) {
                        if (var41 >> 1 >= var42) {
                            arg6[var16] = arg5;
                        } else if (arg2) {
                            arg6[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg9 == 1) {
                for (int var43 = var24 - 1; var43 >= var23; var43--) {
                    for (int var44 = var19; var44 < var20; var44++) {
                        if (var44 >= (var43 << 1)) {
                            arg6[var16] = arg5;
                        } else if (arg2) {
                            arg6[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg9 == 2) {
                for (int var45 = var17; var45 < var15; var45++) {
                    for (int var46 = var19; var46 < var20; var46++) {
                        if (var45 >> 1 >= var46) {
                            arg6[var16] = arg5;
                        } else if (arg2) {
                            arg6[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg9 == 3) {
                for (int var47 = var17; var47 < var15; var47++) {
                    for (int var48 = var22 - 1; var48 >= var21; var48--) {
                        if (var48 >= (var47 << 1)) {
                            arg6[var16] = arg5;
                        } else if (arg2) {
                            arg6[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg0 == 4) {
            if (arg9 == 0) {
                for (int var49 = var24 - 1; var49 >= var23; var49--) {
                    for (int var50 = var19; var50 < var20; var50++) {
                        if ((var49 >> 1) <= var50) {
                            arg6[var16] = arg5;
                        } else if (arg2) {
                            arg6[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg9 == 1) {
                for (int var51 = var17; var51 < var15; var51++) {
                    for (int var52 = var19; var52 < var20; var52++) {
                        if (var51 << 1 >= var52) {
                            arg6[var16] = arg5;
                        } else if (arg2) {
                            arg6[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg9 == 2) {
                for (int var53 = var17; var53 < var15; var53++) {
                    for (int var54 = var22 - 1; var54 >= var21; var54--) {
                        if (var53 >> 1 <= var54) {
                            arg6[var16] = arg5;
                        } else if (arg2) {
                            arg6[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg9 == 3) {
                for (int var55 = var24 - 1; var55 >= var23; var55--) {
                    for (int var56 = var22 - 1; var56 >= var21; var56--) {
                        if ((var55 << 1) >= var56) {
                            arg6[var16] = arg5;
                        } else if (arg2) {
                            arg6[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg0 != 5) {
            if (arg0 == 6) {
                if (arg9 == 0) {
                    for (int var65 = var17; var65 < var15; var65++) {
                        for (int var66 = var19; var66 < var20; var66++) {
                            if ((arg1 / 2) >= var66) {
                                arg6[var16] = arg5;
                            } else if (arg2) {
                                arg6[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var67 = var17; var67 < var15; var67++) {
                        for (int var68 = var19; var68 < var20; var68++) {
                            if (var67 <= (arg3 / 2)) {
                                arg6[var16] = arg5;
                            } else if (arg2) {
                                arg6[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var69 = var17; var69 < var15; var69++) {
                        for (int var70 = var19; var70 < var20; var70++) {
                            if (var70 >= arg1 / 2) {
                                arg6[var16] = arg5;
                            } else if (arg2) {
                                arg6[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var71 = var17; var71 < var15; var71++) {
                        for (int var72 = var19; var72 < var20; var72++) {
                            if (var71 >= (arg3 / 2)) {
                                arg6[var16] = arg5;
                            } else if (arg2) {
                                arg6[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg0 == 7) {
                if (arg9 == 0) {
                    for (int var73 = var17; var73 < var15; var73++) {
                        for (int var74 = var19; var74 < var20; var74++) {
                            if (var73 - (arg3 / 2) >= var74) {
                                arg6[var16] = arg5;
                            } else if (arg2) {
                                arg6[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var75 = var24 - 1; var75 >= var23; var75--) {
                        for (int var76 = var19; var76 < var20; var76++) {
                            if ((var75 - (arg3 / 2)) >= var76) {
                                arg6[var16] = arg5;
                            } else if (arg2) {
                                arg6[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var77 = var24 - 1; var77 >= var23; var77--) {
                        for (int var78 = var22 - 1; var78 >= var21; var78--) {
                            if (var78 <= var77 - arg3 / 2) {
                                arg6[var16] = arg5;
                            } else if (arg2) {
                                arg6[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var79 = var17; var79 < var15; var79++) {
                        for (int var80 = var22 - 1; var80 >= var21; var80--) {
                            if ((var79 - (arg3 / 2)) >= var80) {
                                arg6[var16] = arg5;
                            } else if (arg2) {
                                arg6[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg0 == 8) {
                if (arg9 == 0) {
                    for (int var81 = var17; var81 < var15; var81++) {
                        for (int var82 = var19; var82 < var20; var82++) {
                            if (var81 - (arg3 / 2) <= var82) {
                                arg6[var16] = arg5;
                            } else if (arg2) {
                                arg6[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var83 = var24 - 1; var83 >= var23; var83--) {
                        for (int var84 = var19; var84 < var20; var84++) {
                            if (var83 - (arg3 / 2) <= var84) {
                                arg6[var16] = arg5;
                            } else if (arg2) {
                                arg6[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var85 = var24 - 1; var85 >= var23; var85--) {
                        for (int var86 = var22 - 1; var86 >= var21; var86--) {
                            if ((var85 - (arg3 / 2)) <= var86) {
                                arg6[var16] = arg5;
                            } else if (arg2) {
                                arg6[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var87 = var17; var87 < var15; var87++) {
                        for (int var88 = var22 - 1; var88 >= var21; var88--) {
                            if (var87 - (arg3 / 2) <= var88) {
                                arg6[var16] = arg5;
                            } else if (arg2) {
                                arg6[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
        } else if (arg9 == 0) {
            for (int var57 = var24 - 1; var57 >= var23; var57--) {
                for (int var58 = var22 - 1; var58 >= var21; var58--) {
                    if (var58 >= (var57 >> 1)) {
                        arg6[var16] = arg5;
                    } else if (arg2) {
                        arg6[var16] = arg4;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg9 == 1) {
            for (int var59 = var24 - 1; var59 >= var23; var59--) {
                for (int var60 = var19; var60 < var20; var60++) {
                    if (var59 << 1 >= var60) {
                        arg6[var16] = arg5;
                    } else if (arg2) {
                        arg6[var16] = arg4;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg9 == 2) {
            for (int var61 = var17; var61 < var15; var61++) {
                for (int var62 = var19; var62 < var20; var62++) {
                    if (var62 >= (var61 >> 1)) {
                        arg6[var16] = arg5;
                    } else if (arg2) {
                        arg6[var16] = arg4;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg9 == 3) {
            for (int var63 = var17; var63 < var15; var63++) {
                for (int var64 = var22 - 1; var64 >= var21; var64--) {
                    if ((var63 << 1) >= var64) {
                        arg6[var16] = arg5;
                    } else if (arg2) {
                        arg6[var16] = arg4;
                    }
                    var16++;
                }
                var16 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public final void method1428(byte arg0) {
        if (this.field3815 == -1) {
            if (this.field3826 == null) {
                this.field3815 = 0;
            } else {
                this.field3815 = 2;
            }
        }
        int var2 = 17 % ((55 - arg0) / 54);
        field3844++;
        if (this.field3819 != -1) {
            return;
        }
        if (this.field3826 == null) {
            this.field3819 = 0;
        } else {
            this.field3819 = 2;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)V")
    public static final void method1429(int arg0, int arg1) {
        field3822++;
        class30.field448.method1611(-18767, arg1);
        class242.field4227.method1611(arg0 ^ 0x494E, arg1);
        if (arg0 == -1) {
            class182.field3179.method1611(-18767, arg1);
            class188.field3261.method1611(-18767, arg1);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljh;Luc;IBI)Ljh;")
    public final class262 method1430(class262 arg0, class224 arg1, int arg2, byte arg3, int arg4) {
        int var6 = this.field3811[arg4];
        int var7 = -52 / ((arg3 - 57) / 44);
        field3833++;
        class154 var8 = class241.method1592(var6 >> 16, (byte) -47);
        int var9 = var6 & 0xFFFF;
        if (var8 == null) {
            return arg1.method1422(arg2, true, arg0);
        }
        int var10 = arg1.field3811[arg2];
        class154 var11 = class241.method1592(var10 >> 16, (byte) -96);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            class262 var13 = arg0.method1480(!var8.method1050(true, var9), !this.field3832);
            var13.method1493(var8, var9, this.field3832);
            return var13;
        } else {
            class262 var14 = arg0.method1480(!var8.method1050(true, var9) & !var11.method1050(true, var12), !this.field3832 & !arg1.field3832);
            var14.method1494(var8, var9, var11, var12, this.field3826, this.field3832 | arg1.field3832);
            return var14;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILjh;II)Ljh;")
    public final class262 method1431(int arg0, class262 arg1, int arg2, int arg3) {
        int var5 = this.field3811[arg0];
        field3817++;
        if (arg3 != -11436) {
            this.field3824 = null;
        }
        class154 var6 = class241.method1592(var5 >> 16, (byte) -90);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method1480(true, true);
        }
        int var8 = arg2 & 0x3;
        class262 var9 = arg1.method1480(!var6.method1050(true, var7), !this.field3832);
        if (var8 == 1) {
            var9.method1476();
        } else if (var8 == 2) {
            var9.method1479();
        } else if (var8 == 3) {
            var9.method1483();
        }
        var9.method1493(var6, var7, this.field3832);
        if (var8 == 1) {
            var9.method1483();
        } else if (var8 == 2) {
            var9.method1479();
        } else if (var8 == 3) {
            var9.method1476();
        }
        return var9;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Llh;I)V")
    public final void method1432(class249 arg0, int arg1) {
        field3816++;
        while (true) {
            int var3 = arg0.method1677(-6677);
            if (var3 == 0) {
                if (arg1 == 24022) {
                    return;
                } else {
                    this.method1425((byte) 23, (class262) null, 53);
                    return;
                }
            }
            this.method1426(arg0, var3, arg1 - 32816);
        }
    }
}
