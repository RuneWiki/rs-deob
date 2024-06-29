import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class148 extends class300 implements class691 {

    @OriginalMember(owner = "client!nfa", name = "C", descriptor = "I")
    private int field1985;

    @OriginalMember(owner = "client!nfa", name = "y", descriptor = "I")
    private int field1981;

    @OriginalMember(owner = "client!nfa", name = "z", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!nfa", name = "A", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!nfa", name = "B", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!nfa", name = "D", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!nfa", name = "E", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!nfa", name = "F", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!nfa", name = "G", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!nfa", name = "H", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!nfa", name = "I", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!nfa", name = "J", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!nfa", name = "K", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!nfa", name = "L", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BF)F", line = 5)
    public final float method841(byte arg0, float arg1) {
        if (arg0 != -40) {
            this.method848(true);
        }
        ++field1988;
        return arg1;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)I", line = 16)
    public final int method842(byte arg0) {
        ++field1983;
        int var2 = -1 % ((arg0 - -47) / 60);
        return this.field1985;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(FB)F", line = 27)
    public final float method843(float arg0, byte arg1) {
        ++field1991;
        if (arg1 != 58) {
            this.field1981 = 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lqi;Lsk;Lvea;II)V", line = 39)
    public class148(class510 arg0, class452 arg1, class404 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field1985 = arg4;
        this.field1981 = arg3;
        super.field3985.method3613((byte) 124, this);
        OpenGL.glTexImage2Dub(super.field3982, 0, this.method1776(true), arg3, arg4, 0, class400.method2292(-27762, super.field3989), class336.method1972((byte) 120, super.field3972), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "(Z)V", line = 52)
    public static final void method844(boolean arg0) {
        if (arg0) {
            ++field1994;
            class662.field9434.method3063((byte) -47);
            class218.field2863.method3063((byte) -54);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V", line = 65)
    public static final void method845(String arg0, byte arg1, String arg2) {
        class149.field2037 = -1;
        ++field1982;
        class378.field5005 = 1;
        if (arg1 <= -106) {
            class32.method195(false, 11703, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lqi;II[III)V", line = 78)
    public class148(class510 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class480.field6686, class404.field5338, arg1 * arg2, false);
        this.field1981 = arg1;
        this.field1985 = arg2;
        super.field3985.method3613((byte) 114, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field3982, 0, 6408, this.field1981, this.field1985, 0, 32993, super.field3985.field7126, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ZBZ)V", line = 93)
    public final void method846(boolean arg0, byte arg1, boolean arg2) {
        if (arg1 >= 55) {
            ++field1989;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "g", descriptor = "(I)V", line = 104)
    public static final void method847(int arg0) {
        ++field1992;
        class375 var1 = (class375) class338.field4554.method2506(68);
        if (arg0 >= -44) {
            field1986 = 89;
        }
        while (var1 != null) {
            class601 var2 = var1.field4968;
            if (~class327.field4404 < ~var2.field8387) {
                var1.method242(true);
                var2.method3346(1886454569);
            } else if (var2.field8391 <= class327.field4404) {
                if (~var2.field8402 < -1) {
                    class407 var3 = (class407) class296.field3921.method3057(1, (long) (var2.field8402 + -1));
                    if (var3 != null) {
                        class351 var4 = var3.field5354;
                        if (~var4.field398 <= -1 && ~(class703.field9886 * 512) < ~var4.field398 && ~var4.field397 <= -1 && ~var4.field397 > ~(class431.field5789 * 512)) {
                            var2.method3348(var4.field397, var4.field398, class180.method1211(var2.field385, true, var4.field398, var4.field397) - var2.field8405, class327.field4404, (byte) 126);
                        }
                    }
                }
                if (var2.field8402 < 0) {
                    int var5 = -var2.field8402 + -1;
                    class573 var6;
                    if (class423.field5702 == var5) {
                        var6 = class408.field5369;
                    } else {
                        var6 = class513.field7145[var5];
                    }
                    if (var6 != null && var6.field398 >= 0 && ~var6.field398 > ~(class703.field9886 * 512) && ~var6.field397 <= -1 && var6.field397 < class431.field5789 * 512) {
                        var2.method3348(var6.field397, var6.field398, class180.method1211(var2.field385, true, var6.field398, var6.field397) - var2.field8405, class327.field4404, (byte) 105);
                    }
                }
                var2.method3342(class498.field6849, 16383);
                class616.method3409(var2, true);
            }
            var1 = (class375) class338.field4554.method2505(-109);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z)I", line = 170)
    public final int method848(boolean arg0) {
        if (!arg0) {
            this.method842((byte) 81);
        }
        ++field1987;
        return this.field1981;
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lqi;Lsk;II[BII)V", line = 181)
    public class148(class510 arg0, class452 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class404.field5338, arg2 * arg3, false);
        this.field1981 = arg2;
        this.field1985 = arg3;
        super.field3985.method3613((byte) 113, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field3982, 0, this.method1776(true), arg2, arg3, 0, class400.method2292(-27762, super.field3989), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)Z", line = 197)
    public final boolean method849(int arg0) {
        if (arg0 >= -23) {
            method847(69);
        }
        ++field1984;
        return false;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIIII[BLsk;I)V", line = 208)
    public final void method850(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, class452 arg7, int arg8) {
        super.field3985.method3613((byte) 113, this);
        ++field1993;
        if (~arg2 == -1) {
            arg2 = arg3;
        }
        OpenGL.glPixelStorei(3317, 1);
        if (~arg2 != ~arg3) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        OpenGL.glTexSubImage2Dub(super.field3982, 0, arg4, arg5, arg3, arg8, class400.method2292(-27762, arg7), 5121, arg6, arg1);
        if (~arg2 != ~arg3) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
        if (arg0 != -3661) {
            this.field1985 = -116;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(III[IIBII)V", line = 235)
    public final void method851(int arg0, int arg1, int arg2, int[] arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (~arg0 == -1) {
            arg0 = arg1;
        }
        ++field1990;
        if (arg5 != -122) {
            method847(66);
        }
        super.field3985.method3613((byte) 100, this);
        if (~arg0 != ~arg1) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Di(super.field3982, 0, arg4, arg2, arg1, arg6, 32993, super.field3985.field7126, arg3, arg7);
        if (arg0 != arg1) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lqi;Lsk;II[FII)V", line = 257)
    public class148(class510 arg0, class452 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class404.field5342, arg2 * arg3, false);
        this.field1985 = arg3;
        this.field1981 = arg2;
        super.field3985.method3613((byte) 102, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field3982, 0, this.method1776(true), arg2, arg3, 0, class400.method2292(-27762, super.field3989), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }
}
