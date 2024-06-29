import jaggl.OpenGL;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public abstract class class619 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field8639;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field8640;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
    public static final void method3481(byte arg0) {
        field8640++;
        if (class272.field3891 != null) {
            return;
        }
        int var1 = class633.field8741;
        int var2 = class657.field9009;
        int var3 = class494.field7122 - var1 - class446.field6323;
        int var4 = -41 / ((arg0 + 5) / 37);
        int var5 = class261.field3756 - class172.field2348 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var5 <= 0) {
            return;
        }
        try {
            Container var6;
            if (class387.field5484 != null) {
                var6 = class387.field5484;
            } else if (class213.field2800 == null) {
                var6 = class125.field1524;
            } else {
                var6 = class213.field2800;
            }
            int var7 = 0;
            int var8 = 0;
            if (class387.field5484 == var6) {
                Insets var9 = class387.field5484.getInsets();
                var7 = var9.left;
                var8 = var9.top;
            }
            Graphics var10 = var6.getGraphics();
            var10.setColor(Color.black);
            if (var1 > 0) {
                var10.fillRect(var7, var8, var1, class261.field3756);
            }
            if (var2 > 0) {
                var10.fillRect(var7, var8, class494.field7122, var2);
            }
            if (var3 > 0) {
                var10.fillRect(var7 + class494.field7122 - var3, var8, var3, class261.field3756);
            }
            if (var5 > 0) {
                var10.fillRect(var7, var8 + class261.field3756 - var5, class494.field7122, var5);
                return;
            }
        } catch (Exception var11) {
            return;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLeea;Ljava/lang/String;I)Lbu;")
    public static final class19 method3482(byte arg0, class131 arg1, String arg2, int arg3) {
        field8639++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg3);
        OpenGL.glShaderSourceARB(var4, arg2);
        if (arg0 != 120) {
            field8641 = -101;
        }
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class611.field8582, 0);
        if (class611.field8582[0] == 0) {
            if (class611.field8582[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class611.field8582, 1);
            if (class611.field8582[1] > 1) {
                byte[] var6 = new byte[class611.field8582[1]];
                OpenGL.glGetInfoLogARB(var4, class611.field8582[1], class611.field8582, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class611.field8582[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class19(arg1, var4, arg3);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)J")
    public abstract long method2001(boolean arg0);
}
