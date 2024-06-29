import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class481 {

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "B")
    public byte field6489;

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "Lcn;")
    public class543 field6490;

    @OriginalMember(owner = "client!rca", name = "j", descriptor = "I")
    public int field6495;

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "I")
    public int field6491;

    @OriginalMember(owner = "client!rca", name = "l", descriptor = "I")
    public int field6497;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "I")
    public int field6486;

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
    public int field6488;

    @OriginalMember(owner = "client!rca", name = "o", descriptor = "I")
    public int field6500;

    @OriginalMember(owner = "client!rca", name = "i", descriptor = "[I")
    public static int[] field6494 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!rca", name = "h", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!rca", name = "p", descriptor = "I")
    public static int field6501;

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "Lho;")
    public class161 field6487;

    @OriginalMember(owner = "client!rca", name = "n", descriptor = "Lrea;")
    public class221 field6499;

    @OriginalMember(owner = "client!rca", name = "k", descriptor = "Ltea;")
    public class253 field6496;

    @OriginalMember(owner = "client!rca", name = "m", descriptor = "Lbh;")
    public class40 field6498;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "([BLoia;II)Lwja;", line = 12)
    public static final class283 method2755(byte[] arg0, class97 arg1, int arg2, int arg3) {
        if (arg2 != 1) {
            field6494 = null;
        }
        field6493++;
        if (arg0 == null || arg0.length == 0) {
            return null;
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg3);
        OpenGL.glShaderSourceRawARB(var4, arg0);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class369.field4997, 0);
        if (class369.field4997[0] == 0) {
            if (class369.field4997[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class369.field4997, 1);
            if (class369.field4997[1] > 1) {
                byte[] var6 = new byte[class369.field4997[1]];
                OpenGL.glGetInfoLogARB(var4, class369.field4997[1], class369.field4997, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class369.field4997[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class283(arg1, var4, arg3);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)Z", line = 64)
    public final boolean method2756(byte arg0) {
        field6492++;
        if (arg0 >= -111) {
            this.field6491 = 27;
        }
        return this.field6489 == 2 || this.field6489 == 3;
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(B)V", line = 78)
    public static void method2757(byte arg0) {
        if (arg0 != 3) {
            method2755(null, null, 99, -80);
        }
        field6494 = null;
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(BIIIIIILcn;)V", line = 88)
    public class481(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class543 arg7) {
        this.field6489 = arg0;
        this.field6490 = arg7;
        this.field6495 = arg3;
        this.field6491 = arg6;
        this.field6497 = arg4;
        this.field6486 = arg5;
        this.field6488 = arg2;
        this.field6500 = arg1;
    }
}
