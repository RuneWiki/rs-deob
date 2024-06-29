import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public abstract class class404 extends class687 {

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public int field5715;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public int field5718;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public int field5719;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public int field5711;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public int field5717;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public int field5716;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public int field5720;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "[I")
    public static int[] field5710 = new int[1];

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "(I)I")
    public abstract int method575(int arg0);

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILgfa;IIZLoa;)V")
    public final void method143(int arg0, int arg1, class687 arg2, int arg3, int arg4, boolean arg5, class638 arg6) {
        field5713++;
        int var8 = 93 % (-arg3 / 54);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[Lhba;Len;)Lkba;")
    public static final class91 method2311(int arg0, class10[] arg1, class289 arg2) {
        field5712++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg1[var3] == null || arg1[var3].field201 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg1.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field201);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class412.field5836, 0);
        int var7 = -1 / ((-arg0 - 54) / 55);
        if (class412.field5836[0] == 0) {
            if (class412.field5836[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class412.field5836, 1);
            if (class412.field5836[1] > 1) {
                byte[] var8 = new byte[class412.field5836[1]];
                OpenGL.glGetInfoLogARB(var4, class412.field5836[1], class412.field5836, 0, var8, 0);
                System.out.println(new String(var8));
            }
            if (class412.field5836[0] == 0) {
                for (int var9 = 0; var9 < arg1.length; var9++) {
                    OpenGL.glDetachObjectARB(var4, arg1[var9].field201);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class91(arg2, var4, arg1);
    }

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "(I)V")
    public static void method2312(int arg0) {
        field5710 = null;
        if (arg0 != 0) {
            field5710 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)V")
    public static final void method2313(int arg0, int arg1) {
        field5721++;
        class426.field5999 = arg1;
        class528.field7233.method1997(1);
        if (arg0 >= -28) {
            method2312(12);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
    public final void method142(boolean arg0) {
        field5714++;
        if (arg0) {
            method2313(16, 61);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(IIIIIII)V")
    public class404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5715 = arg4;
        this.field5718 = arg5;
        this.field5719 = arg6;
        this.field5711 = arg3;
        this.field5717 = arg1;
        this.field5716 = arg0;
        this.field5720 = arg2;
    }

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "(I)Z")
    public final boolean method140(int arg0) {
        if (arg0 != 0) {
            this.field5720 = 29;
        }
        field5722++;
        return false;
    }
}
