import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class131 extends class267 implements class112 {

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
    private int field1597;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
    private int field1607;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "Lvj;")
    public static class373 field1596 = new class373(54, 14);

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method653(int arg0) {
        ++field1595;
        return arg0 == 11267;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZZB)V", line = 19)
    public final void method647(boolean arg0, boolean arg1, byte arg2) {
        if (arg2 <= 36) {
            this.field1607 = -43;
        }
        ++field1601;
        super.field3489.method2459(105, this);
        OpenGL.glTexParameteri(super.field3482, 10242, !arg0 ? 33071 : 10497);
        OpenGL.glTexParameteri(super.field3482, 10243, !arg1 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([IIIIIIII)V", line = 32)
    public final void method651(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1603;
        if (arg5 == 5826) {
            super.field3489.method2459(arg5 + -5753, this);
            OpenGL.glPixelStorei(3314, arg4);
            OpenGL.glTexSubImage2Di(super.field3482, 0, arg3, arg7, arg2, arg6, 32993, super.field3489.field4261, arg0, arg1);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Ltm;IIZ[III)V", line = 47)
    public class131(class327 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class10.field80, class160.field1932, arg1 * arg2, arg3);
        this.field1597 = arg1;
        this.field1607 = arg2;
        super.field3489.method2459(116, this);
        if (arg3 && arg6 == 0 && arg5 == 0) {
            this.method1493(super.field3482, arg1, (byte) 123, arg4, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field3482, 0, 6408, this.field1597, this.field1607, 0, 32993, super.field3489.field4261, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(FZ)F", line = 68)
    public final float method646(float arg0, boolean arg1) {
        ++field1602;
        return arg1 ? -1.3690537F : arg0 / (float) this.field1607;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)I", line = 79)
    public final int method649(byte arg0) {
        if (arg0 >= -73) {
            this.method647(true, false, (byte) -3);
        }
        ++field1606;
        return this.field1597;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BILvi;Lav;Lcn;III)V", line = 92)
    public static final void method736(byte arg0, int arg1, class459 arg2, class545 arg3, class437 arg4, int arg5, int arg6, int arg7) {
        ++field1600;
        class416 var8 = new class416();
        var8.field5402 = arg7;
        if (arg0 > -31) {
            field1596 = null;
        }
        var8.field5406 = arg5 << 7;
        var8.field5408 = arg1 << 7;
        if (arg4 == null) {
            if (arg2 == null) {
                if (arg3 != null) {
                    var8.field5409 = arg3;
                    var8.field5403 = arg3.method2694(28146) + arg1 << 7;
                    var8.field5405 = arg5 - -arg3.method2694(28146) << 7;
                    var8.field5401 = class519.method2963(arg3, 0);
                    var8.field5420 = arg3.field7992 << 7;
                    var8.field5407 = arg3.field8014;
                    class593.field8610.method2640(1, (long) arg3.field6399, var8);
                    return;
                }
            } else {
                var8.field5418 = arg2;
                class74 var11 = arg2.field6334;
                if (var11.field800 != null) {
                    var8.field5411 = true;
                    var11 = var11.method420(class281.field3700, 94);
                }
                if (var11 != null) {
                    var8.field5403 = arg1 - -var11.field844 << 7;
                    var8.field5405 = var11.field844 + arg5 << 7;
                    var8.field5401 = class290.method1628(-91, arg2);
                    var8.field5420 = var11.field861 << 7;
                    var8.field5407 = var11.field834;
                }
                class542.field7916.method1040(var8, -96);
            }
        } else {
            var8.field5410 = arg4;
            int var9 = arg4.field5982;
            int var10 = arg4.field5945;
            if (~arg6 == -2 || arg6 == 3) {
                var9 = arg4.field5945;
                var10 = arg4.field5982;
            }
            var8.field5420 = arg4.field5995 << 7;
            var8.field5403 = arg1 + var9 << 7;
            var8.field5401 = arg4.field5994;
            var8.field5416 = arg4.field5992;
            var8.field5405 = arg5 + var10 << 7;
            var8.field5398 = arg4.field5970;
            var8.field5407 = arg4.field6010;
            var8.field5413 = arg4.field5944;
            if (arg4.field6004 != null) {
                var8.field5411 = true;
                var8.method2375(0);
            }
            if (var8.field5413 != null) {
                var8.field5415 = (int) ((double) (-var8.field5398 + var8.field5416) * Math.random()) + var8.field5398;
            }
            class645.field9394.method1040(var8, -106);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BF)F", line = 181)
    public final float method652(byte arg0, float arg1) {
        ++field1599;
        if (arg0 >= -126) {
            this.field1597 = 116;
        }
        return arg1 / (float) this.field1597;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BIIILg;III[B)V", line = 193)
    public final void method650(byte arg0, int arg1, int arg2, int arg3, class135 arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        ++field1605;
        if (arg0 <= 124) {
            method736((byte) -127, -43, (class459) null, (class545) null, (class437) null, 118, 40, -94);
        }
        super.field3489.method2459(100, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg3);
        OpenGL.glTexSubImage2Dub(super.field3482, 0, arg2, arg1, arg7, arg5, class354.method1986(-64, arg4), 5121, arg8, arg6);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V", line = 209)
    public static void method737(int arg0) {
        if (arg0 < 50) {
            field1596 = null;
        }
        field1596 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lk;III[Z)V", line = 219)
    public static final void method738(class483 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class370.field4884 != class128.field1574) {
            int var5 = class90.field1114[arg1].method847(arg2, arg3);
            for (int var6 = 0; var6 <= arg1; ++var6) {
                if (arg4 == null || arg4[var6]) {
                    class174 var7 = class90.field1114[var6];
                    if (var7 != null) {
                        var7.method845(arg0, arg2, var5 - var7.method847(arg2, arg3), arg3, 0, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)I", line = 245)
    public static final int method739(int arg0, int arg1) {
        ++field1598;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 8;
        }
        if (~arg0 <= -17) {
            arg0 >>>= 4;
            var2 += 4;
        }
        if (arg1 <= arg0) {
            arg0 >>>= 2;
            var2 += 2;
        }
        if (~arg0 <= -2) {
            arg0 >>>= 1;
            ++var2;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Ltm;Lg;Lvp;II)V", line = 290)
    public class131(class327 arg0, class135 arg1, class160 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field1607 = arg4;
        this.field1597 = arg3;
        super.field3489.method2459(105, this);
        OpenGL.glTexImage2Dub(super.field3482, 0, this.method1497((byte) 76), arg3, arg4, 0, class354.method1986(-127, super.field3465), class450.method2634(5122, super.field3475), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)I", line = 301)
    public final int method648(byte arg0) {
        if (arg0 != -118) {
            this.method647(true, true, (byte) 122);
        }
        ++field1604;
        return this.field1607;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III[FIIILg;I)V", line = 315)
    public final void method740(int arg0, int arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6, class135 arg7, int arg8) {
        ++field1594;
        super.field3489.method2459(92, this);
        OpenGL.glPixelStorei(3314, arg0);
        OpenGL.glTexSubImage2Df(super.field3482, 0, arg4, arg5, arg6, arg8, class354.method1986(-97, arg7), 5121, arg3, arg1);
        if (arg2 > -51) {
            field1596 = null;
        }
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Ltm;Lg;IIZ[BII)V", line = 330)
    public class131(class327 arg0, class135 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class160.field1932, arg2 * arg3, arg4);
        this.field1597 = arg2;
        this.field1607 = arg3;
        super.field3489.method2459(110, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && arg7 == 0 && arg6 == 0) {
            this.method1496(11240, arg2, super.field3482, arg5, arg3);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field3482, 0, this.method1497((byte) 76), arg2, arg3, 0, class354.method1986(-96, super.field3465), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Ltm;Lg;IIZ[FII)V", line = 351)
    public class131(class327 arg0, class135 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class160.field1936, arg2 * arg3, arg4);
        this.field1597 = arg2;
        this.field1607 = arg3;
        super.field3489.method2459(93, this);
        if (!arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method1491(arg2, arg3, -31772, arg5, super.field3482);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field3482, 0, this.method1497((byte) 76), arg2, arg3, 0, class354.method1986(-78, super.field3465), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }
}
