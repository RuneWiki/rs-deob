import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class157 extends class184 {

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    private int field1995;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    public static int field1993 = 0;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "[I")
    public static int[] field1998 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "Lqh;")
    public static class50 field1997 = new class50();

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class157() {
        this(4096);
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(I)V")
    public class157(int arg0) {
        super(0, true);
        this.field1995 = 4096;
        this.field1995 = arg0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;IILug;)Lsl;")
    public static final class320 method1019(String arg0, int arg1, int arg2, class395 arg3) {
        ++field1996;
        if (arg2 != 1) {
            method1020(77);
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceARB(var4, arg0);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class525.field7762, 0);
        if (class525.field7762[0] == 0) {
            if (class525.field7762[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class525.field7762, 1);
            if (~class525.field7762[1] < -2) {
                byte[] var6 = new byte[class525.field7762[1]];
                OpenGL.glGetInfoLogARB(var4, class525.field7762[1], class525.field7762, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class525.field7762[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class320(arg3, var4, arg1);
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)V")
    public static void method1020(int arg0) {
        if (arg0 != 1) {
            field1998 = null;
        }
        field1998 = null;
        field1997 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        ++field1992;
        int[] var3 = super.field2409.method248(arg0, 16776960);
        if (arg1 != 578) {
            this.method7((byte) 120, 117, (class463) null);
        }
        if (super.field2409.field436) {
            class318.method1876(var3, 0, class245.field3167, this.field1995);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BILfh;)V")
    public final void method7(byte arg0, int arg1, class463 arg2) {
        int var4 = 122 / ((arg0 - -13) / 51);
        ++field1994;
        if (arg1 == 0) {
            this.field1995 = (arg2.method2737(false) << 12) / 255;
        }
    }
}
