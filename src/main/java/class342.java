import jaggl.OpenGL;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public class class342 {

    @OriginalMember(owner = "client!vja", name = "b", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!vja", name = "c", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!vja", name = "d", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!vja", name = "e", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!vja", name = "f", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!vja", name = "g", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4962;

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "([BB)[B")
    public final byte[] method2167(byte[] arg0, byte arg1) {
        field4963++;
        if (arg1 >= -27) {
            return null;
        }
        class511 var3 = new class511(arg0);
        var3.field6962 = arg0.length - 4;
        int var4 = var3.method3019(127);
        var3.field6962 = 0;
        byte[] var5 = new byte[var4];
        this.method2170(var3, var5, -54);
        return var5;
    }

    @OriginalMember(owner = "client!vja", name = "<init>", descriptor = "()V")
    public class342() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(CI)Z")
    public static final boolean method2168(char arg0, int arg1) {
        field4964++;
        if (arg1 != 32) {
            field4967 = -36;
        }
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(BLkf;)I")
    public static final int method2169(byte arg0, class359 arg1) {
        field4968++;
        class636 var2 = arg1.field5172;
        if (var2.field8872 != null) {
            var2 = var2.method3650(class173.field2192, (byte) 55);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field8923;
        class148 var4 = arg1.method3736((byte) 107);
        if (arg0 >= -110) {
            return -121;
        }
        if (arg1.field9198 == -1 || arg1.field9207) {
            var3 = var2.field8926;
        } else if (arg1.field9198 == var4.field1915 || arg1.field9198 == var4.field1930 || arg1.field9198 == var4.field1920 || arg1.field9198 == var4.field1886) {
            var3 = var2.field8871;
        } else if (arg1.field9198 == var4.field1916 || arg1.field9198 == var4.field1896 || arg1.field9198 == var4.field1938 || arg1.field9198 == var4.field1931) {
            var3 = var2.field8894;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(Lgga;[BI)V")
    public final void method2170(class511 arg0, byte[] arg1, int arg2) {
        if (arg2 > -34) {
            return;
        }
        field4965++;
        if (arg0.field6979[arg0.field6962] != 31 || arg0.field6979[arg0.field6962 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4962 == null) {
            this.field4962 = new Inflater(true);
        }
        try {
            this.field4962.setInput(arg0.field6979, arg0.field6962 + 10, arg0.field6979.length - (arg0.field6962 + 10 + 8));
            this.field4962.inflate(arg1);
        } catch (Exception var4) {
            this.field4962.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4962.reset();
    }

    @OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(III)V")
    private class342(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(ILpq;Ljava/lang/String;I)Lhh;")
    public static final class190 method2171(int arg0, class194 arg1, String arg2, int arg3) {
        field4966++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        OpenGL.glShaderSourceARB(var4, arg2);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, client.field1308, arg3);
        if (client.field1308[0] == 0) {
            if (client.field1308[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, client.field1308, 1);
            if (client.field1308[1] > 1) {
                byte[] var6 = new byte[client.field1308[1]];
                OpenGL.glGetInfoLogARB(var4, client.field1308[1], client.field1308, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (client.field1308[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class190(arg1, var4, arg0);
    }
}
