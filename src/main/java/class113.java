import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class113 {

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "J")
    public long field1485;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "Lur;")
    private class377 field1483;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "[I")
    public static int[] field1486 = new int[2];

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "Ljc;")
    public static class305 field1489 = new class305("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "[I")
    public static int[] field1490 = new int[32];

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "I")
    public static int field1491;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uq", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field1492;

    // $FF: synthetic method
    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method688(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!uq", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        this.field1483.method2258(this.field1485, -122);
        field1487++;
        super.finalize();
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIIBIII)V", line = 13)
    public static final void method684(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field1488++;
        if (class372.method2199(73, arg6)) {
            if (class363.field4969[arg6] == null) {
                class176.method1027(arg3, arg4, arg8, (byte) 126, arg7, -1, class339.field4491[arg6], arg1, arg0, arg2);
            } else {
                class176.method1027(arg3, arg4, arg8, (byte) 125, arg7, -1, class363.field4969[arg6], arg1, arg0, arg2);
            }
            if (arg5 < 30) {
                field1486 = null;
            }
        } else if (arg2 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class442.field6427[var9] = true;
            }
        } else {
            class442.field6427[arg2] = true;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V", line = 52)
    public static void method685(byte arg0) {
        int var1 = -104 % ((52 - arg0) / 53);
        field1486 = null;
        field1490 = null;
        field1489 = null;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;IILur;)Lpi;", line = 63)
    public static final class346 method686(String arg0, int arg1, int arg2, class377 arg3) {
        field1484++;
        int var4 = 47 / ((arg2 + 28) / 54);
        long var5 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceARB(var5, arg0);
        OpenGL.glCompileShaderARB(var5);
        OpenGL.glGetObjectParameterivARB(var5, 35713, class379.field5484, 0);
        if (class379.field5484[0] == 0) {
            if (class379.field5484[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var5, 35716, class379.field5484, 1);
            if (class379.field5484[1] > 1) {
                byte[] var7 = new byte[class379.field5484[1]];
                OpenGL.glGetInfoLogARB(var5, class379.field5484[1], class379.field5484, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class379.field5484[0] == 0) {
                OpenGL.glDeleteObjectARB(var5);
                return null;
            }
        }
        return new class346(arg3, var5, arg1);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lah;B)V", line = 102)
    public static final void method687(class263 arg0, byte arg1) {
        field1491++;
        if (class186.field2421 == null) {
            return;
        }
        class448 var2 = null;
        if (arg0.field3532 == 0) {
            var2 = (class448) class48.method279(arg0.field3535, arg0.field3534, arg0.field3527);
        }
        if (arg0.field3532 == 1) {
            var2 = (class448) class107.method663(arg0.field3535, arg0.field3534, arg0.field3527);
        }
        if (arg1 <= 64) {
            return;
        }
        if (arg0.field3532 == 2) {
            var2 = (class448) class365.method2172(arg0.field3535, arg0.field3534, arg0.field3527, field1492 == null ? (field1492 = method688("mh")) : field1492);
        }
        if (arg0.field3532 == 3) {
            var2 = (class448) class434.method2671(arg0.field3535, arg0.field3534, arg0.field3527);
        }
        if (var2 == null) {
            arg0.field3520 = 0;
            arg0.field3519 = 0;
            arg0.field3529 = -1;
        } else {
            arg0.field3529 = var2.method46(108);
            arg0.field3520 = var2.method48((byte) -70);
            arg0.field3519 = var2.method47(-15774);
        }
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lur;J[Lpi;)V", line = 149)
    public class113(class377 arg0, long arg1, class346[] arg2) {
        this.field1485 = arg1;
        this.field1483 = arg0;
    }
}
