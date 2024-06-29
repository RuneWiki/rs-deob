import jaggl.OpenGL;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class416 extends class86 {

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "Z")
    public boolean field5492 = false;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "Z")
    private boolean field5503 = true;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "[I")
    public static int[] field5489 = new int[2];

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "Lfca;")
    public static class661 field5496 = new class661();

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "Lwm;")
    public static class30 field5500;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)Z", line = 3)
    public final boolean method2400(int arg0) {
        ++field5499;
        if (arg0 != -25176) {
            this.field5492 = false;
        }
        return this.field5503;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V", line = 14)
    public static final void method2401(int arg0, Throwable arg1, String arg2) {
        ++field5491;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class234.method1555((byte) -97, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class733.method3959(var3, (byte) -95);
            String var4 = class446.method2558(var3, ":", "%3a", arg0 ^ -21296);
            String var5 = class446.method2558(var4, "@", "%40", -21295);
            String var6 = class446.method2558(var5, "&", "%26", -21295);
            String var7 = class446.method2558(var6, "#", "%23", -21295);
            if (class144.field1866 != null) {
                class339 var8 = class370.field4537.method4242(-5756, new URL(class144.field1866.getCodeBase(), "clienterror.ws?c=" + class143.field1858 + "&u=" + (class188.field2616 != null ? class188.field2616 : String.valueOf(class58.field766)) + "&v1=" + class775.field10583 + "&v2=" + class775.field10565 + "&e=" + var7));
                while (var8.field4144 == 0) {
                    class591.method3181(1L, 0);
                }
                if (var8.field4144 == arg0) {
                    DataInputStream var9 = (DataInputStream) var8.field4142;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V", line = 63)
    public final void method71(byte arg0) {
        if (arg0 != -65) {
            field5496 = null;
        }
        if (!super.field1203.method2983(arg0 + -19171).method725(-49)) {
            super.field1200 = 0;
        }
        ++field5488;
        if (~super.field1200 > -1 || ~super.field1200 < -6) {
            super.field1200 = this.method73(0);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)I", line = 80)
    public final int method2402(boolean arg0) {
        if (arg0) {
            return 125;
        } else {
            ++field5490;
            return super.field1200;
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(ILsf;)V", line = 94)
    public class416(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZ)V", line = 99)
    public final void method76(int arg0, boolean arg1) {
        this.field5492 = arg1;
        ++field5493;
        super.field1200 = arg0;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(IZ)V", line = 108)
    public final void method2403(int arg0, boolean arg1) {
        ++field5494;
        this.field5503 = arg1;
        if (arg0 != 2) {
            this.field5492 = true;
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lsf;)V", line = 189)
    public class416(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)V", line = 128)
    public static void method2404(int arg0) {
        field5496 = null;
        if (arg0 == 0) {
            field5500 = null;
            field5489 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", line = 140)
    public static final void method2405(int arg0, String arg1, String arg2, String arg3, String arg4, int arg5, int arg6) {
        class357.method2056(arg3, arg4, arg0, 0, (String) null, arg1, arg2, arg6, arg5);
        ++field5502;
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(I)Z", line = 151)
    public final boolean method2406(int arg0) {
        ++field5498;
        if (!super.field1203.method2983(-19236).method725(-49)) {
            return false;
        } else {
            int var2 = 36 % ((-57 - arg0) / 57);
            return true;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/String;Lck;II)Loca;", line = 167)
    public static final class296 method2407(String arg0, class733 arg1, int arg2, int arg3) {
        ++field5501;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramStringARB(arg2, arg3, arg0);
        OpenGL.glGetIntegerv(34379, class215.field2935, 0);
        if (class215.field2935[0] != -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class296(arg1, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)I", line = 195)
    public final int method73(int arg0) {
        ++field5497;
        this.field5492 = true;
        if (arg0 != 0) {
            this.field5492 = false;
        }
        return !super.field1203.method2983(-19236).method725(arg0 + -49) ? 0 : 2;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)I", line = 210)
    public final int method72(int arg0, int arg1) {
        if (arg1 != -2) {
            this.method71((byte) -104);
        }
        ++field5495;
        if (!super.field1203.method2983(-19236).method725(arg1 + -47)) {
            return 3;
        } else {
            return arg0 == 3 && !class424.method2447("jagdx", -122) ? 3 : 2;
        }
    }
}
