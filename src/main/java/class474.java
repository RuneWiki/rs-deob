import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class474 {

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Lo;")
    public static class31 field6747 = new class31(16);

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II[BI)I", line = 5)
    public static final int method2797(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 >= -30) {
            field6747 = null;
        }
        field6750++;
        int var4 = -1;
        for (int var5 = arg3; var5 < arg1; var5++) {
            var4 = class557.field7911[(var4 ^ arg2[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 29)
    public static void method2798(byte arg0) {
        if (arg0 != -85) {
            method2800((byte) 98, null, null);
        }
        field6747 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V", line = 43)
    public static final void method2799(boolean arg0) {
        if (!arg0) {
            field6748++;
            class486.method2839(29699);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B[Lut;Log;)Lfja;", line = 59)
    public static final class782 method2800(byte arg0, class134[] arg1, class673 arg2) {
        field6749++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg1[var3] == null || arg1[var3].field1743 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg1.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field1743);
        }
        OpenGL.glLinkProgramARB(var4);
        int var7 = -98 % ((60 - arg0) / 50);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class730.field10201, 0);
        if (class730.field10201[0] == 0) {
            if (class730.field10201[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class730.field10201, 1);
            if (class730.field10201[1] > 1) {
                byte[] var8 = new byte[class730.field10201[1]];
                OpenGL.glGetInfoLogARB(var4, class730.field10201[1], class730.field10201, 0, var8, 0);
                System.out.println(new String(var8));
            }
            if (class730.field10201[0] == 0) {
                for (int var9 = 0; var9 < arg1.length; var9++) {
                    OpenGL.glDetachObjectARB(var4, arg1[var9].field1743);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class782(arg2, var4, arg1);
    }
}
