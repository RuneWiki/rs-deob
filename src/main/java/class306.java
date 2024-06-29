import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class306 extends class83 {

    @OriginalMember(owner = "client!pda", name = "q", descriptor = "I")
    public static int field3786 = 0;

    @OriginalMember(owner = "client!pda", name = "r", descriptor = "[I")
    public static int[] field3787 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!pda", name = "h", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!pda", name = "k", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!pda", name = "l", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!pda", name = "m", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!pda", name = "n", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!pda", name = "p", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!pda", name = "s", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!pda", name = "u", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!pda", name = "t", descriptor = "J")
    public static long field3789;

    @OriginalMember(owner = "client!pda", name = "o", descriptor = "[I")
    public static int[] field3784;

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Lvj;)V", line = 8)
    public class306(class422 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "([Lmc;BLvj;)Ldi;", line = 13)
    public static final class243 method1762(class424[] arg0, byte arg1, class422 arg2) {
        ++field3790;
        int var3 = 0;
        if (arg1 >= -75) {
            return null;
        } else {
            while (var3 < arg0.length) {
                if (arg0[var3] == null || ~arg0[var3].field5986 >= -1L) {
                    return null;
                }
                ++var3;
            }
            long var4 = OpenGL.glCreateProgramObjectARB();
            for (int var6 = 0; ~arg0.length < ~var6; ++var6) {
                OpenGL.glAttachObjectARB(var4, arg0[var6].field5986);
            }
            OpenGL.glLinkProgramARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35714, class598.field8429, 0);
            if (class598.field8429[0] == 0) {
                if (class598.field8429[0] == 0) {
                    System.out.println("Shader linking failed:");
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class598.field8429, 1);
                if (~class598.field8429[1] < -2) {
                    byte[] var7 = new byte[class598.field8429[1]];
                    OpenGL.glGetInfoLogARB(var4, class598.field8429[1], class598.field8429, 0, var7, 0);
                    System.out.println(new String(var7));
                }
                if (class598.field8429[0] == 0) {
                    for (int var8 = 0; arg0.length > var8; ++var8) {
                        OpenGL.glDetachObjectARB(var4, arg0[var8].field5986);
                    }
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return new class243(arg2, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(BZ)V", line = 81)
    public final void method433(byte arg0, boolean arg1) {
        ++field3783;
        if (arg0 != -48) {
            field3789 = -127L;
        }
        super.field855.method2422((byte) -90, true);
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(B)V", line = 94)
    public static void method1763(byte arg0) {
        if (arg0 <= 116) {
            method1763((byte) 95);
        }
        field3784 = null;
        field3787 = null;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ltf;III)Lho;", line = 106)
    public static final class463 method1764(class701 arg0, int arg1, int arg2, int arg3) {
        if (arg3 > -54) {
            return null;
        } else {
            ++field3778;
            byte[] var4 = arg0.method3854((byte) 71, arg2, arg1);
            return var4 == null ? null : new class463(var4);
        }
    }

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(I)V", line = 123)
    public final void method438(int arg0) {
        if (arg0 == 18610) {
            ++field3781;
            super.field855.method2422((byte) -90, false);
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(ZI)V", line = 138)
    public final void method439(boolean arg0, int arg1) {
        ++field3782;
        if (arg1 >= -123) {
            this.method441(105, 123, (class325) null);
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IILav;)V", line = 148)
    public final void method441(int arg0, int arg1, class325 arg2) {
        super.field855.method2396((byte) 36, arg2);
        if (arg0 == -29092) {
            ++field3788;
            super.field855.method2421(arg1, arg0 ^ -29091);
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 161)
    public static final void method1765(boolean arg0, String arg1) {
        if (arg0) {
            ++field3779;
            System.out.println("Error: " + class393.method2231(64, "\n", "%0a", arg1));
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)Z", line = 173)
    public final boolean method440(byte arg0) {
        if (arg0 > -100) {
            field3789 = -39L;
        }
        ++field3785;
        return true;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(III)V", line = 186)
    public final void method435(int arg0, int arg1, int arg2) {
        int var4 = -125 % ((-60 - arg2) / 33);
        ++field3780;
    }
}
