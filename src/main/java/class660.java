import jaggl.OpenGL;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class660 extends class393 {

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    public static int field9294;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field9295;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
    public static int field9297;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "Lf;")
    public static class257 field9296;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "([BIILad;)Lsk;", line = 8)
    public static final class446 method3712(byte[] arg0, int arg1, int arg2, class669 arg3) {
        field9294++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg2);
        OpenGL.glShaderSourceRawARB(var4, arg0);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class557.field8145, 0);
        if (arg1 != -31732) {
            return null;
        }
        if (class557.field8145[0] == 0) {
            if (class557.field8145[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class557.field8145, 1);
            if (class557.field8145[1] > 1) {
                byte[] var6 = new byte[class557.field8145[1]];
                OpenGL.glGetInfoLogARB(var4, class557.field8145[1], class557.field8145, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class557.field8145[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class446(arg3, var4, arg2);
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V", line = 54)
    public static void method3713(int arg0) {
        if (arg0 != 0) {
            method3715((byte) 41, null, -95, null);
        }
        field9296 = null;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V", line = 68)
    public static final void method3714(byte arg0) {
        class525.method3094(arg0 ^ 0x7E);
        if (arg0 != -65) {
            field9296 = null;
        }
        field9297++;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BLjava/lang/String;ILwv;)Ltj;", line = 86)
    public static final class614 method3715(byte arg0, String arg1, int arg2, class705 arg3) {
        field9295++;
        if (arg0 <= 63) {
            field9296 = null;
        }
        if (arg2 == 0) {
            return arg3.method3957(arg1, 16);
        } else if (arg2 == 1) {
            try {
                class157.method1181(class492.field7063, new Object[] { (new URL(class492.field7063.getCodeBase(), arg1)).toString() }, "openjs", 5949);
                class614 var4 = new class614();
                var4.field8787 = 1;
                return var4;
            } catch (Throwable var10) {
                class614 var5 = new class614();
                var5.field8787 = 2;
                return var5;
            }
        } else if (arg2 == 2) {
            try {
                class492.field7063.getAppletContext().showDocument(new URL(class492.field7063.getCodeBase(), arg1), "_blank");
                class614 var6 = new class614();
                var6.field8787 = 1;
                return var6;
            } catch (Exception var11) {
                class614 var7 = new class614();
                var7.field8787 = 2;
                return var7;
            }
        } else if (arg2 == 3) {
            try {
                class157.method1180((byte) 87, class492.field7063, "loggedout");
            } catch (Throwable var13) {
            }
            try {
                class492.field7063.getAppletContext().showDocument(new URL(class492.field7063.getCodeBase(), arg1), "_top");
                class614 var8 = new class614();
                var8.field8787 = 1;
                return var8;
            } catch (Exception var12) {
                class614 var9 = new class614();
                var9.field8787 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
