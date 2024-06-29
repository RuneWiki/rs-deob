import jaggl.OpenGL;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class261 {

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "Ljava/lang/String;")
    public String field3237;

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "I")
    public int field3233;

    @OriginalMember(owner = "client!oba", name = "g", descriptor = "J")
    public long field3238;

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "I")
    public int field3236;

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "Ljava/lang/String;")
    public String field3234;

    @OriginalMember(owner = "client!oba", name = "h", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3239 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!oba", name = "i", descriptor = "J")
    public static long field3240 = 0L;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!oba", name = "j", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!oba", name = "k", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!oba", name = "l", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!oba", name = "m", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)V", line = 3)
    public static void method1570(int arg0) {
        if (arg0 != -1236084768) {
            field3240 = 101L;
        }
        field3239 = null;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IILwha;B)J", line = 15)
    public static final long method1571(int arg0, int arg1, class281 arg2, byte arg3) {
        field3232++;
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class316 var8 = class445.field6442.method3972((byte) 102, arg2.method1241((byte) 99));
        if (arg3 <= 8) {
            method1571(-97, 102, null, (byte) -102);
        }
        long var9 = (long) (arg0 | 0x800000 << 7 | arg1 | arg2.method1236((byte) -78) << 14 | arg2.method1243((byte) 117) << 20);
        if (var8.field4001 == 0) {
            var9 |= var6;
        }
        if (var8.field4034 == 1) {
            var9 |= var4;
        }
        return var9 | (long) arg2.method1241((byte) 99) << 32;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lnv;ILjava/lang/String;Z)Lw;", line = 47)
    public static final class299 method1572(class417 arg0, int arg1, String arg2, boolean arg3) {
        field3235++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceARB(var4, arg2);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class164.field1844, 0);
        if (class164.field1844[0] == 0) {
            if (class164.field1844[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class164.field1844, 1);
            if (class164.field1844[1] > 1) {
                byte[] var6 = new byte[class164.field1844[1]];
                OpenGL.glGetInfoLogARB(var4, class164.field1844[1], class164.field1844, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class164.field1844[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        if (arg3) {
            field3240 = -41L;
        }
        return new class299(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V", line = 89)
    public class261(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field3237 = arg1;
        this.field3233 = arg2;
        this.field3238 = arg4;
        this.field3236 = arg0;
        this.field3234 = arg3;
    }
}
