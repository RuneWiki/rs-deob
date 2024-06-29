import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class18 {

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Lnd;")
    public class383 field268 = new class383();

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field276 = 0;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "Lnd;")
    private class383 field275;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Lnd;", line = 9)
    public final class383 method153(int arg0) {
        if (arg0 != 0) {
            this.method157(-123);
        }
        field262++;
        class383 var2 = this.field268.field5042;
        if (this.field268 == var2) {
            this.field275 = null;
            return null;
        } else {
            this.field275 = var2.field5042;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V", line = 30)
    public final void method154(int arg0) {
        field261++;
        if (arg0 != 7491) {
            this.field275 = null;
        }
        while (true) {
            class383 var2 = this.field268.field5042;
            if (this.field268 == var2) {
                this.field275 = null;
                return;
            }
            var2.method2165(16225);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lug;[Lsl;I)Lme;", line = 53)
    public static final class131 method155(class395 arg0, class320[] arg1, int arg2) {
        field270++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg1[var3] == null || arg1[var3].field4058 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg1.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field4058);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class105.field1338, arg2);
        if (class105.field1338[0] == 0) {
            if (class105.field1338[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class105.field1338, 1);
            if (class105.field1338[1] > 1) {
                byte[] var7 = new byte[class105.field1338[1]];
                OpenGL.glGetInfoLogARB(var4, class105.field1338[1], class105.field1338, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class105.field1338[0] == 0) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field4058);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class131(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)I", line = 118)
    public final int method156(int arg0) {
        int var2 = -75 / ((arg0 + 91) / 32);
        field260++;
        int var3 = 0;
        for (class383 var4 = this.field268.field5042; var4 != this.field268; var4 = var4.field5042) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)Lnd;", line = 138)
    public final class383 method157(int arg0) {
        field264++;
        class383 var2 = this.field268.field5047;
        if (this.field268 == var2) {
            this.field275 = null;
            return null;
        } else {
            this.field275 = var2.field5047;
            return arg0 > -7 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)Lnd;", line = 167)
    public final class383 method158(int arg0) {
        field265++;
        if (arg0 != -24557) {
            field263 = -3;
        }
        class383 var2 = this.field268.field5042;
        if (this.field268 == var2) {
            return null;
        } else {
            var2.method2165(arg0 ^ 0xFFFF9F72);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILub;Lnd;)V", line = 188)
    private final void method159(int arg0, class18 arg1, class383 arg2) {
        field272++;
        class383 var4 = this.field268.field5047;
        if (arg0 != 0) {
            this.method154(26);
        }
        this.field268.field5047 = arg2.field5047;
        arg2.field5047.field5042 = this.field268;
        if (this.field268 != arg2) {
            arg2.field5047 = arg1.field268.field5047;
            arg2.field5047.field5042 = arg2;
            arg1.field268.field5047 = var4;
            var4.field5042 = arg1.field268;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLub;)V", line = 211)
    public final void method160(byte arg0, class18 arg1) {
        field273++;
        this.method159(0, arg1, this.field268.field5042);
        int var3 = 64 % ((arg0 + 20) / 55);
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)Lnd;", line = 227)
    public final class383 method161(int arg0) {
        field271++;
        class383 var2 = this.field275;
        if (this.field268 == var2) {
            this.field275 = null;
            return null;
        }
        this.field275 = var2.field5042;
        if (arg0 > -12) {
            field263 = 116;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)Z", line = 247)
    public final boolean method162(byte arg0) {
        int var2 = -88 / ((-arg0 - 60) / 49);
        field274++;
        return this.field268.field5042 == this.field268;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lnd;I)V", line = 257)
    public final void method163(class383 arg0, int arg1) {
        if (arg0.field5047 != null) {
            arg0.method2165(arg1 ^ 0x3F61);
        }
        field269++;
        if (arg1 != 0) {
            this.field275 = null;
        }
        arg0.field5047 = this.field268.field5047;
        arg0.field5042 = this.field268;
        arg0.field5047.field5042 = arg0;
        arg0.field5042.field5047 = arg0;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V", line = 328)
    public class18() {
        this.field268.field5042 = this.field268;
        this.field268.field5047 = this.field268;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lnd;B)V", line = 280)
    public final void method164(class383 arg0, byte arg1) {
        if (arg0.field5047 != null) {
            arg0.method2165(16225);
        }
        field266++;
        if (arg1 < -57) {
            arg0.field5042 = this.field268.field5042;
            arg0.field5047 = this.field268;
            arg0.field5047.field5042 = arg0;
            arg0.field5042.field5047 = arg0;
        }
    }

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)Lnd;", line = 303)
    public final class383 method165(int arg0) {
        field267++;
        class383 var2 = this.field275;
        if (this.field268 == var2) {
            this.field275 = null;
            return null;
        }
        this.field275 = var2.field5047;
        if (arg0 > -31) {
            this.field268 = null;
        }
        return var2;
    }
}
