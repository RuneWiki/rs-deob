import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class430 extends class493 {

    @OriginalMember(owner = "client!q", name = "D", descriptor = "Lmt;")
    private class399 field6057;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "Lfg;")
    private class130 field6060;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Z")
    private boolean field6041;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "[I")
    public static int[] field6047 = new int[1];

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    public static int field6048 = 1;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "Z")
    public static boolean field6054 = false;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "[F")
    public static float[] field6044 = new float[2];

    @OriginalMember(owner = "client!q", name = "F", descriptor = "[I")
    public static int[] field6059 = new int[2048];

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "Lni;")
    public static class522 field6050;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "Ljava/lang/Thread;")
    public static Thread field6043;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "Z")
    private boolean field6056;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 6)
    public static final String method2453(String arg0, int arg1, String arg2, String arg3) {
        ++field6058;
        if (arg1 != 4185) {
            return null;
        } else {
            for (int var4 = arg3.indexOf(arg2); ~var4 != 0; var4 = arg3.indexOf(arg2, arg0.length() + var4)) {
                arg3 = arg3.substring(0, var4) + arg0 + arg3.substring(var4 - -arg2.length());
            }
            return arg3;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(III)Z", line = 26)
    public static final boolean method2454(int arg0, int arg1, int arg2) {
        ++field6053;
        if (arg0 > -84) {
            field6048 = -19;
        }
        return (52 & arg2) != 0;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V", line = 37)
    public final void method628(int arg0) {
        if (arg0 != -2) {
            method2456(31);
        }
        if (this.field6056) {
            super.field6720.method2114((byte) 120, 1);
            super.field6720.method2148((class649) null, 40);
            super.field6720.method2114((byte) 120, 0);
            super.field6720.method2148((class649) null, -114);
            OpenGL.glUseProgramObjectARB(0L);
            this.field6056 = false;
        }
        ++field6046;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(IZ)V", line = 57)
    public final void method633(int arg0, boolean arg1) {
        ++field6051;
        if (arg0 != 69) {
            this.field6056 = true;
        }
        class455 var3 = super.field6720.method2106(-93);
        if (this.field6041 && var3 != null) {
            super.field6720.method2114((byte) 120, 1);
            super.field6720.method2148(var3, arg0 + 11);
            super.field6720.method2114((byte) 120, 0);
            super.field6720.method2148(this.field6057.field5651, arg0 + -197);
            long var4 = this.field6060.field1681;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field6720.field5088[0], -super.field6720.field5088[1], -super.field6720.field5088[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field6720.field5103, super.field6720.field5041, super.field6720.field5083, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field6720.field5088[1]));
            this.field6056 = true;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V", line = 87)
    public static void method2455(boolean arg0) {
        field6059 = null;
        field6050 = null;
        field6044 = null;
        if (!arg0) {
            field6043 = null;
        }
        field6047 = null;
        field6043 = null;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)Z", line = 101)
    public final boolean method634(byte arg0) {
        ++field6049;
        if (arg0 != 27) {
            field6050 = null;
        }
        return this.field6041;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)V", line = 117)
    public final void method632(int arg0, boolean arg1) {
        ++field6055;
        if (arg0 <= 93) {
            field6054 = true;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III)V", line = 128)
    public final void method627(int arg0, int arg1, int arg2) {
        if (arg2 <= -75) {
            if (this.field6056) {
                int var4 = 1 << (3 & arg0);
                float var5 = (float) (1 << ((63 & arg0) >> 3)) / 32.0F;
                int var6 = 65535 & arg1;
                float var7 = (float) (arg1 >> 16 & 3) / 8.0F;
                long var8 = this.field6060.field1681;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field6720.field5048 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
            }
            ++field6052;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILbl;)V", line = 158)
    public final void method629(int arg0, int arg1, class649 arg2) {
        if (arg0 == 6) {
            if (!this.field6056) {
                super.field6720.method2148(arg2, 103);
                super.field6720.method2153(arg1, (byte) -105);
            }
            ++field6042;
        }
    }

    @OriginalMember(owner = "client!q", name = "h", descriptor = "(I)V", line = 192)
    public static final void method2456(int arg0) {
        class357.field4742 = new class218[class751.field10420.method2892((byte) -11)][];
        ++field6045;
        class607.field8483 = new class218[class751.field10420.method2892((byte) -11)][];
        class534.field7246 = new boolean[class751.field10420.method2892((byte) -11)];
        if (arg0 < 103) {
            method2454(-4, -90, 36);
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lhl;Lni;Lmt;)V", line = 210)
    public class430(class529 arg0, class522 arg1, class399 arg2) {
        super(arg0);
        this.field6057 = arg2;
        if (arg1 != null && arg0.field7191 && arg0.field7194) {
            class339 var4 = class392.method2289(arg1.method2879("gl", "environment_mapped_water_v", -32734), arg0, -25671, 35633);
            class339 var5 = class392.method2289(arg1.method2879("gl", "environment_mapped_water_f", -32734), arg0, -25671, 35632);
            this.field6060 = class747.method4168(arg0, 0, new class339[] { var4, var5 });
            this.field6041 = this.field6060 != null && this.field6057.method2314(-118);
        } else {
            this.field6041 = false;
        }
    }
}
