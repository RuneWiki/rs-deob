import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class149 extends class424 {

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "J")
    public long field1920;

    @OriginalMember(owner = "client!wu", name = "r", descriptor = "I")
    public static int field1924 = 0;

    @OriginalMember(owner = "client!wu", name = "q", descriptor = "Lme;")
    public static class668 field1923 = new class668(4);

    @OriginalMember(owner = "client!wu", name = "o", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "([Lkk;Lji;B)Lhq;")
    public static final class47 method1098(class238[] arg0, class622 arg1, byte arg2) {
        field1921++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field3207 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field3207);
        }
        OpenGL.glLinkProgramARB(var4);
        if (arg2 < 13) {
            return null;
        }
        OpenGL.glGetObjectParameterivARB(var4, 35714, class83.field1127, 0);
        if (class83.field1127[0] == 0) {
            if (class83.field1127[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class83.field1127, 1);
            if (class83.field1127[1] > 1) {
                byte[] var7 = new byte[class83.field1127[1]];
                OpenGL.glGetInfoLogARB(var4, class83.field1127[1], class83.field1127, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class83.field1127[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field3207);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class47(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "()V")
    public class149() {
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V")
    public static void method1099(byte arg0) {
        if (arg0 >= -38) {
            field1923 = null;
        }
        field1923 = null;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)I")
    public static final int method1100(int arg0, int arg1) {
        field1922++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else {
            if (arg1 != 6409) {
                method1099((byte) -124);
            }
            if (arg0 == 6410 || arg0 == 34847) {
                return 6410;
            } else if (arg0 == 6402) {
                return 6402;
            } else {
                throw new IllegalArgumentException("");
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(J)V")
    public class149(long arg0) {
        this.field1920 = arg0;
    }
}
