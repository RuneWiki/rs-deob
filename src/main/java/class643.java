import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class643 {

    @OriginalMember(owner = "client!it", name = "c", descriptor = "Lkca;")
    public static class82 field9137 = new class82(1);

    @OriginalMember(owner = "client!it", name = "e", descriptor = "Lqe;")
    public static class465 field9139 = new class465(8, 10);

    @OriginalMember(owner = "client!it", name = "f", descriptor = "[I")
    public static int[] field9140 = new int[14];

    @OriginalMember(owner = "client!it", name = "h", descriptor = "F")
    public static float field9142;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field9135;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "Lfk;")
    public static class650 field9141;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IBIII)V", line = 7)
    public static final void method3665(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field9136++;
        if (arg1 != 48) {
            method3665(127, (byte) -127, -13, 54, -98);
        }
        if (arg4 >= class558.field7940 && arg4 <= class748.field10458) {
            int var5 = class498.method3000(false, class612.field8854, arg3, class156.field2337);
            int var6 = class498.method3000(false, class612.field8854, arg0, class156.field2337);
            class454.method2780(var5, arg4, (byte) -86, var6, arg2);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)Z", line = 28)
    public static final boolean method3666(boolean arg0) {
        field9138++;
        class462.field6656 = arg0;
        class241.field3385++;
        return true;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V", line = 38)
    public static void method3667(int arg0) {
        if (arg0 != 27117) {
            field9140 = null;
        }
        field9140 = null;
        field9139 = null;
        field9141 = null;
        field9137 = null;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "([Lib;Leea;I)Lpga;", line = 59)
    public static final class531 method3668(class152[] arg0, class132 arg1, int arg2) {
        field9135++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field2291 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        int var6 = 0;
        if (arg2 != -32169) {
            field9139 = null;
        }
        while (arg0.length > var6) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field2291);
            var6++;
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class387.field5423, 0);
        if (class387.field5423[0] == 0) {
            if (class387.field5423[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class387.field5423, 1);
            if (class387.field5423[1] > 1) {
                byte[] var7 = new byte[class387.field5423[1]];
                OpenGL.glGetInfoLogARB(var4, class387.field5423[1], class387.field5423, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class387.field5423[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field2291);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class531(arg1, var4, arg0);
    }
}
