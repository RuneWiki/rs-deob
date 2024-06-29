import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class312 extends class433 implements class324 {

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
    private int field4294;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    private int field4292;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "Lgj;")
    public static class593 field4299 = new class593();

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)I")
    public final int method944(boolean arg0) {
        ++field4291;
        if (!arg0) {
            this.method946((byte) -62);
        }
        return this.field4294;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Ldc;Lhi;II[FII)V")
    public class312(class5 arg0, class193 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class294.field4164, arg2 * arg3, false);
        this.field4294 = arg2;
        this.field4292 = arg3;
        super.field5925.method897(this, true);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field5915, 0, this.method2461(-120), arg2, arg3, 0, class420.method2414(144, super.field5922), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Ldc;Lhi;II[BII)V")
    public class312(class5 arg0, class193 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class294.field4160, arg2 * arg3, false);
        this.field4294 = arg2;
        this.field4292 = arg3;
        super.field5925.method897(this, true);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field5915, 0, this.method2461(-112), arg2, arg3, 0, class420.method2414(144, super.field5922), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V")
    public static void method1860(int arg0) {
        field4299 = null;
        if (arg0 != 28314) {
            method1861(92, 55, -51);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)Z")
    public static final boolean method1861(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class8.field188; ++var3) {
            class112 var4 = class547.field7303[var3];
            if (var4.field1957 == 1) {
                int var5 = var4.field1946 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1954 * var5 >> 8) + var4.field1942;
                    int var7 = (var4.field1950 * var5 >> 8) + var4.field1958;
                    int var8 = (var4.field1962 * var5 >> 8) + var4.field1959;
                    int var9 = (var4.field1947 * var5 >> 8) + var4.field1956;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1957 == 2) {
                int var10 = arg0 - var4.field1946;
                if (var10 > 0) {
                    int var11 = (var4.field1954 * var10 >> 8) + var4.field1942;
                    int var12 = (var4.field1950 * var10 >> 8) + var4.field1958;
                    int var13 = (var4.field1962 * var10 >> 8) + var4.field1959;
                    int var14 = (var4.field1947 * var10 >> 8) + var4.field1956;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1957 == 3) {
                int var15 = var4.field1942 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1961 * var15 >> 8) + var4.field1946;
                    int var17 = (var4.field1951 * var15 >> 8) + var4.field1952;
                    int var18 = (var4.field1962 * var15 >> 8) + var4.field1959;
                    int var19 = (var4.field1947 * var15 >> 8) + var4.field1956;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1957 == 4) {
                int var20 = arg2 - var4.field1942;
                if (var20 > 0) {
                    int var21 = (var4.field1961 * var20 >> 8) + var4.field1946;
                    int var22 = (var4.field1951 * var20 >> 8) + var4.field1952;
                    int var23 = (var4.field1962 * var20 >> 8) + var4.field1959;
                    int var24 = (var4.field1947 * var20 >> 8) + var4.field1956;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1957 == 5) {
                int var25 = arg1 - var4.field1959;
                if (var25 > 0) {
                    int var26 = (var4.field1961 * var25 >> 8) + var4.field1946;
                    int var27 = (var4.field1951 * var25 >> 8) + var4.field1952;
                    int var28 = (var4.field1954 * var25 >> 8) + var4.field1942;
                    int var29 = (var4.field1950 * var25 >> 8) + var4.field1958;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBII[BLhi;III)V")
    public final void method945(int arg0, byte arg1, int arg2, int arg3, byte[] arg4, class193 arg5, int arg6, int arg7, int arg8) {
        ++field4289;
        if (arg7 == 0) {
            arg7 = arg8;
        }
        super.field5925.method897(this, true);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg7 != ~arg8) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Dub(super.field5915, 0, arg2, arg6, arg8, arg0, class420.method2414(144, arg5), 5121, arg4, arg3);
        if (arg1 != 52) {
            this.field4294 = -98;
        }
        if (arg7 != arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BZZ)V")
    public final void method947(byte arg0, boolean arg1, boolean arg2) {
        ++field4287;
        int var4 = -69 / ((46 - arg0) / 36);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)I")
    public final int method939(byte arg0) {
        ++field4286;
        int var2 = 31 % ((arg0 - 26) / 33);
        return this.field4292;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Ldc;Lhi;Lne;II)V")
    public class312(class5 arg0, class193 arg1, class294 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field4294 = arg3;
        this.field4292 = arg4;
        super.field5925.method897(this, true);
        OpenGL.glTexImage2Dub(super.field5915, 0, this.method2461(-113), arg3, arg4, 0, class420.method2414(144, super.field5922), class122.method942(super.field5931, -108), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V")
    public static final void method1862(int arg0) {
        class26.field433 = null;
        class52.field726 = null;
        if (arg0 != 5121) {
            field4299 = null;
        }
        ++field4297;
        class36.field550 = null;
        class386.field5133 = null;
        class439.field6040 = null;
        class651.field8812 = null;
        class446.field6100 = null;
        class360.field4871 = null;
        class58.field813 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIII[I)V")
    public final void method941(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        super.field5925.method897(this, true);
        if (arg3 == 0) {
            arg3 = arg2;
        }
        ++field4288;
        if (arg6 > -86) {
            this.field4294 = -31;
        }
        if (arg2 != arg3) {
            OpenGL.glPixelStorei(3314, arg3);
        }
        OpenGL.glTexSubImage2Di(super.field5915, 0, arg0, arg4, arg2, arg1, 32993, super.field5925.field144, arg7, arg5);
        if (arg2 != arg3) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Leh;B)Llr;")
    public static final class703 method1863(class335 arg0, byte arg1) {
        int var2 = -66 % ((arg1 - -23) / 44);
        ++field4295;
        int var3 = arg0.method2001((byte) -83);
        return new class703(var3);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZZ)V")
    public static final void method1864(boolean arg0, boolean arg1) {
        ++field4293;
        if (arg1) {
            if (~class251.field3463 != 0) {
                class150.method1070(0, class251.field3463);
            }
            for (class140 var2 = (class140) class264.field3667.method2915(72); var2 != null; var2 = (class140) class264.field3667.method2912((byte) 99)) {
                if (!var2.method2798(-1)) {
                    var2 = (class140) class264.field3667.method2915(66);
                    if (var2 == null) {
                        break;
                    }
                }
                class345.method2074(1, var2, false, true);
            }
            class251.field3463 = -1;
            class264.field3667 = new class520(8);
            class104.method798((byte) 105);
            class251.field3463 = class568.field7548;
            class476.method2670((byte) -97, false);
            class449.method2540((byte) -114);
            class544.method3015(class251.field3463);
        }
        class509.field6793 = "";
        class449.field6163 = "";
        class280.field3984 = false;
        class363.method2146((byte) 112);
        class428.field5883 = -1;
        class16.method169(class587.field7786, -1);
        class199.field2897 = new class403();
        class199.field2897.field8620 = class34.field530 * 512 / 2;
        class199.field2897.field8612 = class34.field531 * 512 / 2;
        class199.field2897.field5643[0] = class34.field530 / 2;
        class643.field8632 = 0;
        class259.field3563 = 0;
        class199.field2897.field5649[0] = class34.field531 / 2;
        if (~class140.field2254 != -3) {
            class438.method2492((byte) -67);
        } else {
            class259.field3563 = class37.field560 << 9;
            class643.field8632 = class561.field7431 << 9;
        }
        class661.method3704(arg0);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZZB)V")
    public static final void method1865(boolean arg0, boolean arg1, byte arg2) {
        if (arg2 > -127) {
            method1862(19);
        }
        if (arg0) {
            ++class261.field3589;
            class705.method3892(true);
        }
        ++field4298;
        if (arg1) {
            ++class262.field3645;
            class13.method140(92);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(FZ)F")
    public final float method940(float arg0, boolean arg1) {
        ++field4285;
        if (arg1) {
            method1863((class335) null, (byte) 50);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)Z")
    public final boolean method946(byte arg0) {
        ++field4290;
        int var2 = 90 / ((69 - arg0) / 48);
        return false;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Ldc;II[III)V")
    public class312(class5 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class5.field100, class294.field4160, arg1 * arg2, false);
        this.field4294 = arg1;
        this.field4292 = arg2;
        super.field5925.method897(this, true);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field5915, 0, 6408, this.field4294, this.field4292, 0, 32993, super.field5925.field144, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IF)F")
    public final float method948(int arg0, float arg1) {
        ++field4296;
        if (arg0 != 22051) {
            this.method947((byte) 61, false, true);
        }
        return arg1;
    }
}
