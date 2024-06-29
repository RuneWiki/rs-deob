import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class179 extends class192 implements class465 {

    @OriginalMember(owner = "client!sq", name = "J", descriptor = "I")
    private int field2769;

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
    private int field2756;

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "F")
    public static float field2757;

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!sq", name = "A", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!sq", name = "B", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!sq", name = "C", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!sq", name = "D", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!sq", name = "E", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!sq", name = "F", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!sq", name = "G", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!sq", name = "H", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!sq", name = "I", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!sq", name = "K", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "Lge;")
    public static class711 field2759;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)I")
    public final int method1262(byte arg0) {
        ++field2762;
        if (arg0 > -37) {
            field2759 = null;
        }
        return this.field2769;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(BF)F")
    public final float method1263(byte arg0, float arg1) {
        if (arg0 != 109) {
            return -1.1277976F;
        } else {
            ++field2761;
            return arg1 / (float) this.field2769;
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)I")
    public final int method1264(int arg0) {
        ++field2767;
        if (arg0 != 21110) {
            field2759 = null;
        }
        return this.field2756;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIII[BLpd;)V")
    public final void method1265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, class259 arg8) {
        ++field2766;
        super.field2896.method2294(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg4);
        OpenGL.glTexSubImage2Dub(super.field2907, 0, arg6, arg0, arg1, arg5, class489.method2929(arg8, 6407), 5121, arg7, arg2);
        if (arg3 <= -67) {
            OpenGL.glPixelStorei(3314, 0);
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)Z")
    public final boolean method1266(byte arg0) {
        ++field2765;
        int var2 = -105 % ((arg0 - -60) / 32);
        return true;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(Z)V")
    public static final void method1267(boolean arg0) {
        if (!class483.field6967) {
            class325.field4650 = class266.field3802 != -1 && ~class68.field969 <= ~class266.field3802 || ~class510.field7263 > ~(class68.field969 * 16 + (!class332.field4768 ? 22 : 26));
        }
        ++field2768;
        class347.field5004.method1200(121);
        class673.field9383.method1200(69);
        for (class342 var1 = (class342) class748.field10459.method1195(0); var1 != null; var1 = (class342) class748.field10459.method1201(2)) {
            int var38 = var1.field4972;
            if (var38 < 1000) {
                var1.method1304((byte) 7);
                if (~var38 != -7 && ~var38 != -5 && var38 != 22 && ~var38 != -3 && var38 != 11 && ~var38 != -47 && var38 != 16) {
                    class347.field5004.method1203(var1, (byte) 108);
                } else {
                    class673.field9383.method1203(var1, (byte) 122);
                }
            }
        }
        if (!arg0) {
            field2757 = 0.16741344F;
        }
        class347.field5004.method1202(class748.field10459, -106);
        class673.field9383.method1202(class748.field10459, -127);
        if (class68.field969 <= 1) {
            class103.field1450 = null;
            class456.field6722 = null;
        } else {
            if (class209.field3064 && class35.field371.method2474(81, (byte) 125) && class68.field969 > 2) {
                class456.field6722 = (class342) class748.field10459.field2590.field2819.field2819;
            } else {
                class456.field6722 = (class342) class748.field10459.field2590.field2819;
            }
            class103.field1450 = (class342) class748.field10459.field2590.field2819;
        }
        int var2 = -1;
        class467 var3 = (class467) class264.field3741.method1195(0);
        if (var3 != null) {
            var2 = var3.method1792((byte) -100);
        }
        if (class483.field6967) {
            if (~var2 == 0) {
                int var4 = class632.field8840.method2697(4212);
                int var5 = class632.field8840.method2698(0);
                boolean var6 = false;
                if (class218.field3211 != null) {
                    if (~var4 <= ~(class582.field8289 + -10) && ~(class600.field8491 + 10 + class582.field8289) <= ~var4 && ~var5 <= ~(class304.field4300 + -10) && var5 <= class128.field1706 + 10 + class304.field4300) {
                        var6 = true;
                    } else {
                        class407.method2592(-2);
                    }
                }
                if (!var6) {
                    if (var4 >= class642.field9012 - 10 && ~var4 >= ~(class642.field9012 + class624.field8741 + 10) && class177.field2747 + -10 <= var5 && ~(class338.field4919 + class177.field2747 + 10) <= ~var5) {
                        if (class325.field4650) {
                            int var7 = -1;
                            int var8 = -1;
                            for (int var9 = 0; var9 < class565.field8032; ++var9) {
                                if (class332.field4768) {
                                    int var10 = class177.field2747 + 33 - -(var9 * 16);
                                    if (var10 - 13 < var5 && ~(var10 + 4) < ~var5) {
                                        var8 = var10 - 13;
                                        var7 = var9;
                                        break;
                                    }
                                } else {
                                    int var11 = class177.field2747 + 31 - -(var9 * 16);
                                    if (var5 > var11 + -13 && var11 + 3 > var5) {
                                        var8 = var11 + -13;
                                        var7 = var9;
                                        break;
                                    }
                                }
                            }
                            if (var7 != -1) {
                                int var12 = 0;
                                class571 var13 = new class571(class673.field9386);
                                for (class567 var14 = (class567) var13.method3308((byte) -89); var14 != null; var14 = (class567) var13.method3306(123)) {
                                    if (~var7 == ~var12) {
                                        if (var14.field8052 > 1) {
                                            class338.method2157((byte) -102, var5, var14, var8);
                                        }
                                        break;
                                    }
                                    ++var12;
                                }
                            }
                        }
                    } else {
                        class598.method3481(-96);
                    }
                }
            }
            if (~var2 == -1) {
                int var15 = var3.method1794((byte) 116);
                int var16 = var3.method1793((byte) 103);
                if (class218.field3211 != null && ~class582.field8289 >= ~var15 && ~var15 >= ~(class600.field8491 + class582.field8289) && ~var16 <= ~class304.field4300 && var16 <= class304.field4300 + class128.field1706) {
                    int var17 = -1;
                    for (int var18 = 0; ~class218.field3211.field8052 < ~var18; ++var18) {
                        if (class332.field4768) {
                            int var22 = var18 * 16 + class304.field4300 + 33;
                            if (~var16 < ~(var22 + -13) && var16 < var22 + 4) {
                                var17 = var18;
                            }
                        } else {
                            int var23 = var18 * 16 + 31 + class304.field4300;
                            if (var16 > var23 + -13 && var23 + 3 > var16) {
                                var17 = var18;
                            }
                        }
                    }
                    if (var17 != -1) {
                        int var19 = 0;
                        class571 var20 = new class571(class218.field3211.field8055);
                        for (class342 var21 = (class342) var20.method3308((byte) -85); var21 != null; var21 = (class342) var20.method3306(127)) {
                            if (~var17 == ~var19) {
                                class351.method2212(var16, (byte) -18, var21, var15);
                                break;
                            }
                            ++var19;
                        }
                    }
                    class598.method3481(-127);
                    return;
                }
                if (~var15 <= ~class642.field9012 && var15 <= class642.field9012 + class624.field8741 && var16 >= class177.field2747 && ~var16 >= ~(class338.field4919 + class177.field2747)) {
                    if (!class325.field4650) {
                        int var24 = -1;
                        for (int var25 = 0; ~var25 > ~class68.field969; ++var25) {
                            if (class332.field4768) {
                                int var29 = (class68.field969 - 1 + -var25) * 16 + class177.field2747 + 33;
                                if (~(var29 - 13) > ~var16 && var16 < var29 - -4) {
                                    var24 = var25;
                                }
                            } else {
                                int var30 = (class68.field969 + -1 + -var25) * 16 + 31 + class177.field2747;
                                if (~(var30 + -13) > ~var16 && var16 < var30 + 3) {
                                    var24 = var25;
                                }
                            }
                        }
                        if (var24 != -1) {
                            int var26 = 0;
                            class25 var27 = new class25(class748.field10459);
                            for (class342 var28 = (class342) var27.method126(-14656); var28 != null; var28 = (class342) var27.method123(29)) {
                                if (~var24 == ~var26) {
                                    class351.method2212(var16, (byte) -18, var28, var15);
                                    break;
                                }
                                ++var26;
                            }
                        }
                        class598.method3481(-126);
                        return;
                    }
                    int var31 = -1;
                    for (int var32 = 0; var32 < class565.field8032; ++var32) {
                        if (class332.field4768) {
                            int var33 = class177.field2747 + 33 - -(var32 * 16);
                            if (var33 + -13 < var16 && var16 < var33 + 4) {
                                var31 = var32;
                                break;
                            }
                        } else {
                            int var34 = var32 * 16 + class177.field2747 + 31;
                            if (var16 > var34 - 13 && ~(var34 + 3) < ~var16) {
                                var31 = var32;
                                break;
                            }
                        }
                    }
                    if (var31 != -1) {
                        int var35 = 0;
                        class571 var36 = new class571(class673.field9386);
                        for (class567 var37 = (class567) var36.method3308((byte) -117); var37 != null; var37 = (class567) var36.method3306(-27)) {
                            if (var31 == var35) {
                                class351.method2212(var16, (byte) -18, (class342) var37.field8055.field8521.field6156, var15);
                                class598.method3481(-111);
                                return;
                            }
                            ++var35;
                        }
                        return;
                    }
                }
            }
        } else {
            if (~var2 == -1 && (class190.field2881 == 1 && ~class68.field969 < -3 || class268.method1716((byte) -57))) {
                var2 = 2;
            }
            if (var2 == 2 && class68.field969 > 0 && var3 != null) {
                if (class609.field8613 == null && ~class189.field2871 == -1) {
                    class355.method2219(104, var3.method1794((byte) 119), var3.method1793((byte) -16));
                } else {
                    class457.field6743 = 2;
                }
            }
            if (var2 == 0) {
                if (class456.field6722 != null) {
                    class230.method1544((byte) 111);
                } else if (class282.field3986) {
                    class148.method1087(-34848);
                }
            }
            if (class609.field8613 != null || class189.field2871 != 0) {
                return;
            }
            class760.field10609 = null;
            class457.field6743 = 0;
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lno;IIZ[III)V")
    public class179(class704 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class752.field10511, class256.field3677, arg1 * arg2, arg3);
        this.field2769 = arg1;
        this.field2756 = arg2;
        super.field2896.method2294(this, -2);
        if (arg3 && arg6 == 0 && arg5 == 0) {
            this.method1338(arg4, arg1, arg2, super.field2907, (byte) 102);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field2907, 0, 6408, this.field2769, this.field2756, 0, 32993, super.field2896.field9922, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIII[II)V")
    public final void method1268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
        ++field2770;
        super.field2896.method2294(this, -2);
        OpenGL.glPixelStorei(3314, arg4);
        OpenGL.glTexSubImage2Di(super.field2907, 0, arg2, arg5, arg1, arg3, 32993, super.field2896.field9922, arg6, arg0);
        int var9 = 75 % ((-22 - arg7) / 62);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)V")
    public static void method1269(int arg0) {
        if (arg0 >= 37) {
            field2759 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIILpd;ZIII[F)V")
    public final void method1270(int arg0, int arg1, int arg2, class259 arg3, boolean arg4, int arg5, int arg6, int arg7, float[] arg8) {
        ++field2764;
        super.field2896.method2294(this, -2);
        if (arg4) {
            this.field2769 = 1;
        }
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexSubImage2Df(super.field2907, 0, arg0, arg1, arg7, arg2, class489.method2929(arg3, 6407), 5121, arg8, arg5);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I[IIIIII)V")
    public final void method1271(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 == -4685) {
            ++field2760;
            int[] var8 = new int[this.field2769 * this.field2756];
            super.field2896.method2294(this, -2);
            OpenGL.glGetTexImagei(super.field2907, 0, 32993, 5121, var8, 0);
            for (int var9 = 0; ~var9 > ~arg2; ++var9) {
                class319.method2016(var8, (-var9 + -1 - -arg2 + arg3) * this.field2769, arg1, arg6 * var9 + arg4, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZBZ)V")
    public final void method1272(boolean arg0, byte arg1, boolean arg2) {
        ++field2758;
        super.field2896.method2294(this, -2);
        OpenGL.glTexParameteri(super.field2907, 10242, !arg0 ? 33071 : 10497);
        if (arg1 <= -65) {
            OpenGL.glTexParameteri(super.field2907, 10243, !arg2 ? 33071 : 10497);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(FI)F")
    public final float method1273(float arg0, int arg1) {
        ++field2763;
        if (arg1 > -72) {
            field2757 = 1.0861915F;
        }
        return arg0 / (float) this.field2756;
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lno;Lpd;IIZ[BII)V")
    public class179(class704 arg0, class259 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class256.field3677, arg2 * arg3, arg4);
        this.field2756 = arg3;
        this.field2769 = arg2;
        super.field2896.method2294(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method1332(-14, arg2, arg5, arg3, super.field2907);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field2907, 0, this.method1330((byte) -37), arg2, arg3, 0, class489.method2929(super.field2904, 6407), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lno;Lpd;IIZ[FII)V")
    public class179(class704 arg0, class259 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class256.field3681, arg2 * arg3, arg4);
        this.field2769 = arg2;
        this.field2756 = arg3;
        super.field2896.method2294(this, -2);
        if (!arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method1331(arg2, super.field2907, arg5, arg3, -17872);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field2907, 0, this.method1330((byte) -37), arg2, arg3, 0, class489.method2929(super.field2904, 6407), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lno;Lpd;Lok;II)V")
    public class179(class704 arg0, class259 arg1, class256 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field2756 = arg4;
        this.field2769 = arg3;
        super.field2896.method2294(this, -2);
        OpenGL.glTexImage2Dub(super.field2907, 0, this.method1330((byte) -37), arg3, arg4, 0, class489.method2929(super.field2904, 6407), class754.method4205(super.field2899, 64), (byte[]) null, 0);
    }
}
