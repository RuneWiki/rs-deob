import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class612 extends class649 {

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    public static int field8632 = 0;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "Z")
    public static boolean field8625 = false;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
    public static int field8624;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
    public static int field8626;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
    public static int field8627;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
    public static int field8629;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
    public static int field8630;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
    public static int field8631;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
    public static int field8633;

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "I")
    public static int field8634;

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
    public static int field8635;

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
    public static int field8636;

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "I")
    public static int field8637;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "[Lps;")
    public static class432[] field8628;

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lhs;)V", line = 3)
    public class612(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IB)V", line = 7)
    public final void method129(int arg0, byte arg1) {
        ++field8637;
        if (arg1 < -120) {
            super.field9223 = arg0;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V", line = 18)
    public static void method3491(byte arg0) {
        if (arg0 < 106) {
            method3494(-47, -30);
        }
        field8628 = null;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lom;[BII)Lhe;", line = 30)
    public static final class574 method3492(class642 arg0, byte[] arg1, int arg2, int arg3) {
        ++field8627;
        if (arg1 == null) {
            return null;
        } else {
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg3, var4);
            OpenGL.glProgramRawARB(arg3, 34933, arg1);
            OpenGL.glGetIntegerv(34379, class308.field4658, 0);
            if (class308.field4658[0] != -1) {
                OpenGL.glBindProgramARB(arg3, 0);
                return null;
            } else {
                OpenGL.glBindProgramARB(arg3, arg2);
                return new class574(arg0, arg3, var4);
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(ILhs;)V", line = 57)
    public class612(int arg0, class358 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)I", line = 62)
    public final int method3493(int arg0) {
        if (arg0 != 3) {
            return -91;
        } else {
            ++field8629;
            return super.field9223;
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(II)I", line = 74)
    public static final int method3494(int arg0, int arg1) {
        if (arg1 != 15) {
            field8625 = true;
        }
        ++field8631;
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "(I)I", line = 85)
    public static final int method3495(int arg0) {
        ++field8636;
        if (class32.field304) {
            return 6;
        } else if (arg0 != 16507) {
            return -102;
        } else if (class237.field3813 == null) {
            return 0;
        } else {
            int var1 = class237.field3813.field3488;
            if (class455.method2793(0, var1)) {
                return 1;
            } else if (class313.method2064(127, var1)) {
                return 2;
            } else if (class354.method2271(var1, 25)) {
                return 3;
            } else {
                return class4.method16((byte) -100, var1) ? 4 : 5;
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIB)V", line = 120)
    public static final void method3496(int arg0, int arg1, byte arg2) {
        if (arg2 > -87) {
            method3492((class642) null, (byte[]) null, 53, 23);
        }
        ++field8633;
        class118 var3 = class86.method755(true, 15, 0);
        var3.method933((byte) 73);
        var3.field1821 = arg0;
        var3.field1811 = arg1;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)I", line = 139)
    public final int method133(int arg0, int arg1) {
        ++field8624;
        if (arg0 != 18648) {
            field8632 = -30;
        }
        return 1;
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)V", line = 150)
    public final void method134(int arg0) {
        ++field8634;
        if (super.field9223 != arg0 && super.field9223 != 0) {
            super.field9223 = this.method135(-94);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)I", line = 160)
    public final int method135(int arg0) {
        ++field8626;
        int var2 = -103 / ((arg0 - -18) / 50);
        return 1;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIIILha;III)V", line = 173)
    public static final void method3497(int arg0, int arg1, int arg2, int arg3, class544 arg4, int arg5, int arg6, int arg7) {
        ++field8635;
        arg4.method3183(arg6, arg3, arg0, arg2, arg5 ^ -67, arg7);
        arg4.method3183(arg5 + arg6, 16, arg1, arg2 + 1, arg5 ^ 126, arg7 + 1);
        arg4.method3179(arg7 + 1, arg1, arg3 + -19, arg2 - -18, arg6 + -2, true);
    }
}
