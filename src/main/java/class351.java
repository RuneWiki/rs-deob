import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class351 extends class45 implements class579 {

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    private int field5017;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
    private int field5009;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "Lhb;")
    public static class629 field5012 = new class629(11, 3);

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lgf;Lkp;Lvt;II)V")
    public class351(class234 arg0, class421 arg1, class256 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field5017 = arg4;
        this.field5009 = arg3;
        super.field480.method1971((byte) -80, this);
        OpenGL.glTexImage2Dub(super.field475, 0, this.method243((byte) -91), arg3, arg4, 0, class442.method2756(super.field489, 119), class572.method3326(super.field481, 5122), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIZ)Llc;")
    public static final class563 method2227(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field5020;
        class563 var5 = new class563();
        var5.field8021 = arg3;
        if (arg1 != 0) {
            return null;
        } else {
            var5.field8022 = arg0;
            class234.field3309.method520((byte) -91, var5, (long) arg2);
            class10.method57(arg0, (byte) -119);
            class593 var6 = class259.method1728(40, arg2);
            if (var6 != null) {
                class33.method187(var6, (byte) -101);
            }
            if (class636.field9141 != null) {
                class33.method187(class636.field9141, (byte) 126);
                class636.field9141 = null;
            }
            class400.method2551(true);
            if (var6 != null) {
                class471.method2880(!arg4, var6, 10);
            }
            if (!arg4) {
                class604.method3508(arg0);
            }
            if (!arg4 && ~class518.field7542 != 0) {
                class244.method1626(1, -24494, class518.field7542);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)I")
    public final int method475(int arg0) {
        ++field5008;
        return arg0 < 36 ? 2 : this.field5017;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZZB)V")
    public final void method476(boolean arg0, boolean arg1, byte arg2) {
        super.field480.method1971((byte) -62, this);
        ++field5006;
        OpenGL.glTexParameteri(super.field475, 10242, arg0 ? 10497 : 33071);
        OpenGL.glTexParameteri(super.field475, 10243, arg1 ? 10497 : 33071);
        if (arg2 <= 121) {
            this.method474(-117, 1.6768702F);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IF)F")
    public final float method474(int arg0, float arg1) {
        ++field5013;
        int var3 = 103 % ((-32 - arg0) / 61);
        return arg1 / (float) this.field5017;
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)V")
    public static void method2228(int arg0) {
        if (arg0 != 0) {
            method2227(-9, 29, 103, 29, false);
        }
        field5012 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIILkp;[BIBII)V")
    public final void method469(int arg0, int arg1, int arg2, class421 arg3, byte[] arg4, int arg5, byte arg6, int arg7, int arg8) {
        super.field480.method1971((byte) -108, this);
        if (arg6 < -108) {
            ++field5018;
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glPixelStorei(3314, arg0);
            OpenGL.glTexSubImage2Dub(super.field475, 0, arg5, arg1, arg2, arg8, class442.method2756(arg3, 118), 5121, arg4, arg7);
            OpenGL.glPixelStorei(3314, 0);
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIII[II)V")
    public final void method471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
        super.field480.method1971((byte) -127, this);
        ++field5011;
        OpenGL.glPixelStorei(3314, arg2);
        OpenGL.glTexSubImage2Di(super.field475, 0, arg1, arg5, arg3, arg7, 32993, super.field480.field3367, arg6, arg0);
        OpenGL.glPixelStorei(3314, 0);
        if (arg4 != 5218) {
            method2227(-50, -31, -21, -70, false);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)I")
    public final int method470(int arg0) {
        ++field5015;
        if (arg0 != 5742) {
            this.method2229(21, -40, -100, -91, (float[]) null, (byte) -115, (class421) null, 99, -84);
        }
        return this.field5009;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZF)F")
    public final float method473(boolean arg0, float arg1) {
        if (arg0) {
            this.method470(-20);
        }
        ++field5016;
        return arg1 / (float) this.field5009;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII[FBLkp;II)V")
    public final void method2229(int arg0, int arg1, int arg2, int arg3, float[] arg4, byte arg5, class421 arg6, int arg7, int arg8) {
        if (arg5 != 92) {
            field5012 = null;
        }
        ++field5014;
        super.field480.method1971((byte) -97, this);
        OpenGL.glPixelStorei(3314, arg0);
        OpenGL.glTexSubImage2Df(super.field475, 0, arg2, arg3, arg1, arg7, class442.method2756(arg6, 115), 5121, arg4, arg8);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)Leba;")
    public static final class511 method2230(byte arg0) {
        ++field5021;
        if (arg0 > -5) {
            field5012 = null;
        }
        class592.field8500 = 0;
        return class301.method1999((byte) -128);
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lgf;IIZ[III)V")
    public class351(class234 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class538.field7742, class256.field3653, arg1 * arg2, arg3);
        this.field5009 = arg1;
        this.field5017 = arg2;
        super.field480.method1971((byte) -99, this);
        if (arg3 && ~arg6 == -1 && ~arg5 == -1) {
            this.method241(arg2, 12041, arg1, super.field475, arg4);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field475, 0, 6408, this.field5009, this.field5017, 0, 32993, super.field480.field3367, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)Z")
    public static final boolean method2231(byte arg0, int arg1) {
        if (arg1 <= 79) {
            field5007 = 58;
        }
        ++field5019;
        int var2 = 255 & arg0;
        if (~var2 == -1) {
            return false;
        } else {
            return ~var2 > -129 || ~var2 <= -161 || ~class461.field6874[var2 + -128] != -1;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lgf;Lkp;IIZ[BII)V")
    public class351(class234 arg0, class421 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class256.field3653, arg2 * arg3, arg4);
        this.field5009 = arg2;
        this.field5017 = arg3;
        super.field480.method1971((byte) -63, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method239(arg5, super.field475, arg2, -122, arg3);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field475, 0, this.method243((byte) -128), arg2, arg3, 0, class442.method2756(super.field489, 126), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)Z")
    public final boolean method472(int arg0) {
        if (arg0 != -23679) {
            return false;
        } else {
            ++field5010;
            return true;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lgf;Lkp;IIZ[FII)V")
    public class351(class234 arg0, class421 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class256.field3657, arg2 * arg3, arg4);
        this.field5009 = arg2;
        this.field5017 = arg3;
        super.field480.method1971((byte) -72, this);
        if (!arg4 && arg7 == 0 && arg6 == 0) {
            this.method238(super.field475, arg5, true, arg3, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field475, 0, this.method243((byte) -72), arg2, arg3, 0, class442.method2756(super.field489, 121), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }
}
