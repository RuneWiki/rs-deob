import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class516 extends class386 {

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "Lfg;")
    public static class83 field7569 = new class83("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "[Le;")
    public static class370[] field7572 = new class370[16];

    @OriginalMember(owner = "client!ql", name = "F", descriptor = "I")
    public static int field7575 = 0;

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "[J")
    public static long[] field7577 = new long[32];

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
    public int field7567;

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "I")
    public int field7571;

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!ql", name = "E", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!ql", name = "G", descriptor = "I")
    public int field7576;

    @OriginalMember(owner = "client!ql", name = "I", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "J")
    public long field7564;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)J")
    public final long method2219(int arg0) {
        int var2 = -99 % ((64 - arg0) / 35);
        field7570++;
        return this.field7564;
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)I")
    public final int method2221(int arg0) {
        if (arg0 != -3) {
            field7577 = null;
        }
        field7566++;
        return this.field7567;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZ)I")
    public static final int method3029(int arg0, boolean arg1) {
        field7573++;
        return arg1 ? arg0 & 0x7F : -30;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)I")
    public final int method2217(int arg0) {
        if (arg0 != 2879) {
            this.field7576 = -113;
        }
        field7565++;
        return this.field7576;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/String;Lht;IB)Llo;")
    public static final class528 method3030(String arg0, class410 arg1, int arg2, byte arg3) {
        field7568++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg2);
        if (arg3 > -1) {
            method3031((byte) 93);
        }
        OpenGL.glShaderSourceARB(var4, arg0);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class7.field76, 0);
        if (class7.field76[0] == 0) {
            if (class7.field76[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class7.field76, 1);
            if (class7.field76[1] > 1) {
                byte[] var6 = new byte[class7.field76[1]];
                OpenGL.glGetInfoLogARB(var4, class7.field76[1], class7.field76, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class7.field76[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class528(arg1, var4, arg2);
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(B)V")
    public static void method3031(byte arg0) {
        field7569 = null;
        field7577 = null;
        if (arg0 > -56) {
            field7575 = -8;
        }
        field7572 = null;
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)I")
    public final int method2220(int arg0) {
        if (arg0 == -1243743073) {
            field7574++;
            return this.field7571;
        } else {
            return -117;
        }
    }

    static {
        new class83("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
    }
}
