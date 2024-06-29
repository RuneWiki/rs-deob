import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class83 extends class37 {

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    private int field1418;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Loe;")
    public static class127 field1415 = new class127(22, 8);

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
    public final void method36(int arg0, int arg1, int arg2) {
        ++field1416;
        if (arg0 != 1) {
            method595((byte) -77);
        }
        int var4 = this.field1411 * arg1 >> 12;
        int var5 = this.field1418 * arg1 >> 12;
        int var6 = this.field1412 * arg2 >> 12;
        int var7 = this.field1410 * arg2 >> 12;
        class77.method564(super.field500, var4, (byte) 14, var7, var6, var5, super.field501);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(III)V")
    public final void method32(int arg0, int arg1, int arg2) {
        ++field1417;
        int var4 = this.field1411 * arg2 >> 12;
        int var5 = this.field1418 * arg2 >> 12;
        if (arg1 == 10) {
            int var6 = this.field1412 * arg0 >> 12;
            int var7 = this.field1410 * arg0 >> 12;
            class414.method2439(var4, super.field497, super.field500, var5, super.field501, 64, var6, var7);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static void method595(byte arg0) {
        field1415 = null;
        int var1 = 4 % ((25 - arg0) / 52);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILbl;ILjava/lang/String;)Luh;")
    public static final class108 method596(int arg0, class442 arg1, int arg2, String arg3) {
        ++field1414;
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        OpenGL.glShaderSourceARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        if (arg2 >= -8) {
            method595((byte) 107);
        }
        OpenGL.glGetObjectParameterivARB(var4, 35713, class48.field731, 0);
        if (class48.field731[0] == 0) {
            if (class48.field731[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class48.field731, 1);
            if (~class48.field731[1] < -2) {
                byte[] var6 = new byte[class48.field731[1]];
                OpenGL.glGetInfoLogARB(var4, class48.field731[1], class48.field731, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class48.field731[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class108(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIB)V")
    public final void method30(int arg0, int arg1, byte arg2) {
        ++field1413;
        int var4 = this.field1411 * arg0 >> 12;
        int var5 = this.field1418 * arg0 >> 12;
        int var6 = this.field1412 * arg1 >> 12;
        int var7 = this.field1410 * arg1 >> 12;
        class13.method68(super.field497, var6, var5, var7, var4, false);
        int var8 = -82 / ((arg2 - 36) / 36);
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(IIIIIII)V")
    public class83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1418 = arg2;
        this.field1411 = arg0;
        this.field1410 = arg3;
        this.field1412 = arg1;
    }
}
