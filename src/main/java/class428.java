import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class428 {

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field6288 = 0;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    private int field6284;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public int field6285;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public int field6286;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Lhm;")
    public class200 field6290;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILmo;)V", line = 7)
    public final void method2562(int arg0, class695 arg1) {
        field6293++;
        if (arg0 != 0) {
            this.method2565(null, 63, 104);
        }
        while (true) {
            int var3 = arg1.method3826(false);
            if (var3 == 0) {
                return;
            }
            this.method2565(arg1, var3, -106);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)Lfg;", line = 30)
    public final synchronized class113 method2563(int arg0) {
        if (arg0 != -24690) {
            return null;
        }
        field6291++;
        class113 var2 = (class113) this.field6290.field2835.method2287(1, (long) this.field6284);
        if (var2 != null) {
            return var2;
        }
        class113 var3 = class113.method875(this.field6290.field2829, this.field6284, 0);
        if (var3 != null) {
            this.field6290.field2835.method2291(var3, (long) this.field6284, 1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lhp;[Lne;I)Law;", line = 53)
    public static final class68 method2564(class296 arg0, class287[] arg1, int arg2) {
        field6292++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg1[var3] == null || arg1[var3].field4273 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg1.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field4273);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class407.field5952, 0);
        if (arg2 != 16317) {
            field6288 = -58;
        }
        if (class407.field5952[0] == 0) {
            if (class407.field5952[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class407.field5952, 1);
            if (class407.field5952[1] > 1) {
                byte[] var7 = new byte[class407.field5952[1]];
                OpenGL.glGetInfoLogARB(var4, class407.field5952[1], class407.field5952, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class407.field5952[0] == 0) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field4273);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class68(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lmo;II)V", line = 127)
    private final void method2565(class695 arg0, int arg1, int arg2) {
        if (arg2 > -38) {
            field6288 = -17;
        }
        field6289++;
        if (arg1 == 1) {
            this.field6284 = arg0.method3847((byte) 118);
        } else if (arg1 == 2) {
            this.field6285 = arg0.method3826(false);
            this.field6286 = arg0.method3826(false);
        }
    }
}
