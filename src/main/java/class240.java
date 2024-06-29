import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class240 {

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "[I")
    public static int[] field3544;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "[[Lmq;")
    public static class472[][] field3541;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)V")
    public static void method1589(byte arg0) {
        if (arg0 < 92) {
            field3544 = null;
        }
        field3544 = null;
        field3541 = null;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1590(String arg0, int arg1, int arg2) {
        field3543++;
        class236.method1579(-82);
        class518.method3045((byte) -116);
        class85.method856((byte) -111);
        class369.method2333(arg2, (byte) -14, arg0);
        class350.method2264(124);
        class417.method2537(arg1 - 19698, class623.field9017);
        class433.method2632(class623.field9017, -1);
        class49.method616(class632.field9092, (byte) -81, class623.field9017);
        class183.method1341((byte) -82);
        class481.method2917(class381.field5638, -128);
        class293.method1954(0);
        class309.method2016(4);
        if (class199.field3098 == arg1) {
            class118.method1038(4, 1);
        } else if (class199.field3098 == 7) {
            class118.method1038(8, 1);
        } else if (class199.field3098 == 10) {
            class118.method1038(11, arg1 ^ 0x2);
        } else if (class199.field3098 == 1 || class199.field3098 == 2) {
            class180.method1330((byte) -112);
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Ljq;II[B)Lpm;")
    public static final class542 method1591(class475 arg0, int arg1, int arg2, byte[] arg3) {
        field3542++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg2);
        OpenGL.glShaderSourceRawARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        if (arg1 != -8) {
            method1590(null, 93, -122);
        }
        OpenGL.glGetObjectParameterivARB(var4, 35713, class246.field3712, 0);
        if (class246.field3712[0] == 0) {
            if (class246.field3712[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class246.field3712, 1);
            if (class246.field3712[1] > 1) {
                byte[] var6 = new byte[class246.field3712[1]];
                OpenGL.glGetInfoLogARB(var4, class246.field3712[1], class246.field3712, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class246.field3712[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class542(arg0, var4, arg2);
    }
}
