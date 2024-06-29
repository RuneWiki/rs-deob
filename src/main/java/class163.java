import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class163 extends class513 {

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "[B")
    public byte[] field2250;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "Lqk;")
    public static class148 field2251 = new class148(25, 20);

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static void method1014(byte arg0) {
        if (arg0 > -17) {
            method1014((byte) -82);
        }
        field2251 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)I")
    public static final int method1015(int arg0, int arg1) {
        field2247++;
        return arg0 == -6816 ? arg1 >>> 8 : 74;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lep;[Lee;I)Lwaa;")
    public static final class622 method1016(class371 arg0, class510[] arg1, int arg2) {
        field2249++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg1[var3] == null || arg1[var3].field7111 <= 0L) {
                return null;
            }
        }
        if (arg2 != -12748) {
            field2251 = null;
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg1.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field7111);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class596.field8573, 0);
        if (class596.field8573[0] == 0) {
            if (class596.field8573[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class596.field8573, 1);
            if (class596.field8573[1] > 1) {
                byte[] var7 = new byte[class596.field8573[1]];
                OpenGL.glGetInfoLogARB(var4, class596.field8573[1], class596.field8573, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class596.field8573[0] == 0) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field7111);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class622(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
    public static final void method1017(boolean arg0) {
        if (class749.field10435 <= 1) {
            class674.field9500.method2250((byte) 112, 2, class674.field9500.field5153);
        } else {
            class674.field9500.method2250((byte) 105, 4, class674.field9500.field5153);
        }
        field2246++;
        if (arg0) {
            field2251 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "([B)V")
    public class163(byte[] arg0) {
        this.field2250 = arg0;
    }
}
