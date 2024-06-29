import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class616 extends class125 {

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "[[I")
    public static int[][] field8775 = new int[128][128];

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "I")
    public static int field8781 = 0;

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
    public static int field8773;

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "I")
    public static int field8774;

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
    public static int field8776;

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "I")
    public static int field8777;

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "I")
    public static int field8778;

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!lt", name = "p", descriptor = "I")
    public static int field8780;

    @OriginalMember(owner = "client!lt", name = "r", descriptor = "I")
    public static int field8782;

    @OriginalMember(owner = "client!lt", name = "s", descriptor = "I")
    public static int field8783;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lt", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field8784;

    // $FF: synthetic method
    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3580(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(B)V", line = 6)
    public static void method3575(byte arg0) {
        if (arg0 == -45) {
            field8775 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILoca;)V", line = 17)
    public static final void method3576(int arg0, class279 arg1) {
        ++field8779;
        if (class565.field8185 != null) {
            class324 var2 = null;
            if (arg1.field3907 == 0) {
                var2 = (class324) class256.method1707(arg1.field3899, arg1.field3906, arg1.field3901);
            }
            if (arg0 != -24008) {
                method3575((byte) -41);
            }
            if (arg1.field3907 == 1) {
                var2 = (class324) class198.method1415(arg1.field3899, arg1.field3906, arg1.field3901);
            }
            if (~arg1.field3907 == -3) {
                var2 = (class324) class360.method2277(arg1.field3899, arg1.field3906, arg1.field3901, field8784 != null ? field8784 : (field8784 = method3580("as")));
            }
            if (~arg1.field3907 == -4) {
                var2 = (class324) class388.method2384(arg1.field3899, arg1.field3906, arg1.field3901);
            }
            if (var2 == null) {
                arg1.field3911 = 0;
                arg1.field3908 = -1;
                arg1.field3903 = 0;
            } else {
                arg1.field3908 = var2.method601((byte) 88);
                arg1.field3911 = var2.method604((byte) 94);
                arg1.field3903 = var2.method606(-86);
            }
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)I", line = 59)
    public final int method158(byte arg0) {
        ++field8782;
        int var2 = -12 % ((arg0 - -63) / 49);
        return 127;
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(ILgp;)V", line = 72)
    public class616(int arg0, class549 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "(Z)I", line = 75)
    public final int method3577(boolean arg0) {
        ++field8778;
        if (arg0) {
            field8775 = null;
        }
        return super.field1732;
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lgp;)V", line = 86)
    public class616(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I[BIB)[B", line = 89)
    public static final byte[] method3578(int arg0, byte[] arg1, int arg2, byte arg3) {
        ++field8780;
        byte[] var4;
        if (~arg2 < -1) {
            var4 = new byte[arg0];
            for (int var5 = 0; ~var5 > ~arg0; ++var5) {
                var4[var5] = arg1[arg2 + var5];
            }
        } else {
            var4 = arg1;
        }
        int var6 = 97 / ((arg3 - -43) / 52);
        class233 var7 = new class233();
        var7.method1628(0);
        var7.method1631((byte) 18, (long) (arg0 * 8), var4);
        byte[] var8 = new byte[64];
        var7.method1627(-107, 0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(Z)V", line = 121)
    public final void method156(boolean arg0) {
        if (super.field1732 < 0 && ~super.field1732 < -128) {
            super.field1732 = this.method158((byte) 110);
        }
        ++field8783;
        if (!arg0) {
            field8781 = -118;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BI)V", line = 138)
    public final void method157(byte arg0, int arg1) {
        ++field8776;
        if (arg0 <= -32) {
            super.field1732 = arg1;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIIIBILha;)Lka;", line = 152)
    public static final class282 method3579(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class543 arg6) {
        ++field8777;
        long var7 = (long) arg5;
        class282 var9 = (class282) class100.field1440.method2216(arg4 + 33, var7);
        short var10 = 2055;
        if (var9 == null) {
            class637 var11 = class565.method3379(109, class386.field5586, arg5, 0);
            if (var11 == null) {
                return null;
            }
            if (~var11.field8978 > -14) {
                var11.method3663(false, 2);
            }
            var9 = arg6.method404(var11, var10, class193.field2837, 64, 768);
            class100.field1440.method2213((byte) -16, var7, var9);
        }
        class282 var12 = var9.method509((byte) 2, var10, true);
        if (arg4 != -33) {
            method3578(-61, (byte[]) null, 16, (byte) 53);
        }
        if (~arg0 != -1) {
            var12.method541(arg0);
        }
        if (~arg1 != -1) {
            var12.method500(arg1);
        }
        if (~arg2 != -1) {
            var12.method488(arg2);
        }
        if (arg3 != 0) {
            var12.method529(0, arg3, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZI)I", line = 203)
    public final int method155(boolean arg0, int arg1) {
        ++field8774;
        return !arg0 ? -124 : 1;
    }
}
