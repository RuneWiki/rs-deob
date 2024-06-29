import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class211 extends class392 {

    @OriginalMember(owner = "client!ega", name = "g", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!ega", name = "h", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!ega", name = "i", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!ega", name = "j", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!ega", name = "k", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!ega", name = "l", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!ega", name = "m", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(ILw;)V")
    public class211(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(BI)V")
    public final void method286(byte arg0, int arg1) {
        super.field5452 = arg1;
        ++field3084;
        int var3 = -25 % ((-80 - arg0) / 38);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Z)I")
    public final int method292(boolean arg0) {
        ++field3083;
        return !arg0 ? 44 : 0;
    }

    @OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(Lw;)V")
    public class211(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(I)I")
    public final int method1457(int arg0) {
        ++field3089;
        if (arg0 != 17539) {
            this.method292(false);
        }
        return super.field5452;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lfc;I[Lfo;)Lnw;")
    public static final class695 method1458(class642 arg0, int arg1, class679[] arg2) {
        ++field3085;
        for (int var3 = 0; var3 < arg2.length; ++var3) {
            if (arg2[var3] == null || arg2[var3].field9602 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; ~arg2.length < ~var6; ++var6) {
            OpenGL.glAttachObjectARB(var4, arg2[var6].field9602);
        }
        int var7 = -31 / ((31 - arg1) / 49);
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class23.field263, 0);
        if (~class23.field263[0] == -1) {
            if (~class23.field263[0] == -1) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class23.field263, 1);
            if (class23.field263[1] > 1) {
                byte[] var8 = new byte[class23.field263[1]];
                OpenGL.glGetInfoLogARB(var4, class23.field263[1], class23.field263, 0, var8, 0);
                System.out.println(new String(var8));
            }
            if (~class23.field263[0] == -1) {
                for (int var9 = 0; ~arg2.length < ~var9; ++var9) {
                    OpenGL.glDetachObjectARB(var4, arg2[var9].field9602);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class695(arg0, var4, arg2);
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(II)I")
    public final int method290(int arg0, int arg1) {
        if (arg1 > -124) {
            field3087 = 101;
        }
        ++field3086;
        return 1;
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(Z)V")
    public final void method291(boolean arg0) {
        if (arg0) {
            field3087 = 125;
        }
        ++field3088;
        if (super.field5452 != 1 && super.field5452 != 0) {
            super.field5452 = this.method292(true);
        }
    }
}
