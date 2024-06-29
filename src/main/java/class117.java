import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class117 {

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "[I")
    public int[] field1572 = new int[3];

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "[I")
    public int[] field1573 = new int[2];

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "[I")
    public int[] field1576 = new int[3];

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "[I")
    public int[] field1575 = new int[2];

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "[S")
    public short[] field1571;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "[S")
    public short[] field1578;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "Lfea;")
    public static class152 field1574 = new class152();

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Luq;")
    public static class172 field1580;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([BLsha;BI)Lmca;")
    public static final class33 method844(byte[] arg0, class757 arg1, byte arg2, int arg3) {
        field1577++;
        if (arg0 == null || arg0.length == 0) {
            return null;
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg3);
        OpenGL.glShaderSourceRawARB(var4, arg0);
        OpenGL.glCompileShaderARB(var4);
        if (arg2 > -29) {
            return null;
        }
        OpenGL.glGetObjectParameterivARB(var4, 35713, class202.field2623, 0);
        if (class202.field2623[0] == 0) {
            if (class202.field2623[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class202.field2623, 1);
            if (class202.field2623[1] > 1) {
                byte[] var6 = new byte[class202.field2623[1]];
                OpenGL.glGetInfoLogARB(var4, class202.field2623[1], class202.field2623, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class202.field2623[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class33(arg1, var4, arg3);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static void method845(int arg0) {
        if (arg0 != 0) {
            field1580 = null;
        }
        field1574 = null;
        field1580 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIZIII)I")
    public static final int method846(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (!arg3) {
            field1580 = null;
        }
        int var7 = arg1 & 0x3;
        field1579++;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg0;
            arg0 = var8;
        }
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return arg2;
        } else if (var7 == 2) {
            return 7 + 1 - arg4 - arg6;
        } else {
            return 1 + 7 - arg0 - arg2;
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lak;)V")
    public class117(class369 arg0) {
        this.field1572[0] = arg0.field5330;
        this.field1572[1] = arg0.field5319;
        this.field1572[2] = arg0.field5326;
        this.field1576[0] = arg0.field5317;
        this.field1576[1] = arg0.field5338;
        this.field1576[2] = arg0.field5382;
        this.field1575[1] = arg0.field5336;
        this.field1575[0] = arg0.field5342;
        this.field1573[1] = arg0.field5391;
        this.field1573[0] = arg0.field5390;
        if (arg0.field5373 != null) {
            this.field1571 = new short[arg0.field5373.length];
            class421.method2535(arg0.field5373, 0, this.field1571, 0, this.field1571.length);
        }
        if (arg0.field5329 != null) {
            this.field1578 = new short[arg0.field5329.length];
            class421.method2535(arg0.field5329, 0, this.field1578, 0, this.field1578.length);
        }
    }
}
