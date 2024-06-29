import jaggl.OpenGL;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class316 {

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "Z")
    public boolean field4577 = false;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Lfc;")
    private class174 field4585 = new class174(64);

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "Lfc;")
    public class174 field4593 = new class174(500);

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "Lfc;")
    public class174 field4594 = new class174(30);

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "Lfc;")
    public class174 field4595 = new class174(50);

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "Z")
    public boolean field4583;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Loi;")
    private class53 field4576;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Loi;")
    public class53 field4578;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Leh;")
    public static class246 field4589;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "[[I")
    public static int[][] field4592;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    public int field4596;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uf", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field4597;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "Z")
    public static boolean field4590;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
    public static void method1898(byte arg0) {
        field4592 = null;
        field4589 = null;
        if (arg0 != -87) {
            field4592 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZB)V")
    public final void method1899(boolean arg0, byte arg1) {
        field4575++;
        if (arg0 == this.field4577) {
            return;
        }
        this.field4577 = arg0;
        if (arg1 != -8) {
            field4589 = null;
        }
        this.method1907(true);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static final void method1900(int arg0) {
        field4582++;
        if (arg0 != -3889) {
            field4590 = false;
        }
        if (class151.field2158 == 2) {
            class494.field6991 = 96;
            return;
        }
        try {
            Method var1 = (field4597 == null ? (field4597 = method1909("java.lang.Runtime")) : field4597).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class494.field6991 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)Lfu;")
    public final class270 method1901(int arg0, int arg1) {
        field4579++;
        class174 var3 = this.field4585;
        class270 var4;
        synchronized (this.field4585) {
            var4 = (class270) this.field4585.method1088((long) arg1, (byte) -115);
        }
        if (arg0 != 50) {
            this.field4585 = null;
        }
        if (var4 != null) {
            return var4;
        }
        class53 var5 = this.field4576;
        byte[] var6;
        synchronized (this.field4576) {
            var6 = this.field4576.method426(class114.method764(true, arg1), (byte) 9, class413.method2451(arg1, 255));
        }
        class270 var7 = new class270();
        var7.field3946 = this;
        var7.field3952 = arg1;
        if (var6 != null) {
            var7.method1708(false, new class403(var6));
        }
        var7.method1701(0);
        if (!this.field4583 && var7.field3988) {
            var7.field3934 = null;
            var7.field3996 = null;
        }
        if (var7.field3941) {
            var7.field4006 = false;
            var7.field3989 = 0;
        }
        class174 var8 = this.field4585;
        synchronized (this.field4585) {
            this.field4585.method1097(19627, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)V")
    public final void method1902(int arg0, int arg1) {
        this.field4596 = arg1;
        field4581++;
        class174 var3 = this.field4593;
        synchronized (this.field4593) {
            if (arg0 > -86) {
                return;
            }
            this.field4593.method1096((byte) 120);
        }
        class174 var4 = this.field4594;
        synchronized (this.field4594) {
            this.field4594.method1096((byte) -71);
        }
        class174 var5 = this.field4595;
        synchronized (this.field4595) {
            this.field4595.method1096((byte) -69);
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(II)V")
    public final void method1903(int arg0, int arg1) {
        class174 var3 = this.field4585;
        synchronized (this.field4585) {
            this.field4585.method1087(1, arg0);
        }
        field4580++;
        class174 var4 = this.field4593;
        synchronized (this.field4593) {
            this.field4593.method1087(1, arg0);
        }
        if (arg1 != 0) {
            method1906(null, (byte) -123, null, 67);
        }
        class174 var5 = this.field4594;
        synchronized (this.field4594) {
            this.field4594.method1087(arg1 ^ 0x1, arg0);
        }
        class174 var6 = this.field4595;
        synchronized (this.field4595) {
            this.field4595.method1087(1, arg0);
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public final void method1904(int arg0) {
        class174 var2 = this.field4585;
        synchronized (this.field4585) {
            this.field4585.method1095(0);
        }
        field4587++;
        class174 var3 = this.field4593;
        synchronized (this.field4593) {
            this.field4593.method1095(0);
        }
        class174 var4 = this.field4594;
        synchronized (this.field4594) {
            this.field4594.method1095(0);
        }
        class174 var5 = this.field4595;
        synchronized (this.field4595) {
            this.field4595.method1095(arg0);
        }
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(II)V")
    public final void method1905(int arg0, int arg1) {
        field4591++;
        this.field4585 = new class174(arg1);
        if (arg0 > -65) {
            this.field4585 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/String;BLih;I)Lkt;")
    public static final class110 method1906(String arg0, byte arg1, class503 arg2, int arg3) {
        field4588++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg3);
        OpenGL.glShaderSourceARB(var4, arg0);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class198.field2818, 0);
        int var6 = -107 % ((-arg1 - 11) / 58);
        if (class198.field2818[0] == 0) {
            if (class198.field2818[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class198.field2818, 1);
            if (class198.field2818[1] > 1) {
                byte[] var7 = new byte[class198.field2818[1]];
                OpenGL.glGetInfoLogARB(var4, class198.field2818[1], class198.field2818, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class198.field2818[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class110(arg2, var4, arg3);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V")
    public final void method1907(boolean arg0) {
        field4584++;
        class174 var2 = this.field4585;
        synchronized (this.field4585) {
            this.field4585.method1096((byte) -50);
        }
        class174 var3 = this.field4593;
        synchronized (this.field4593) {
            this.field4593.method1096((byte) 109);
        }
        class174 var4 = this.field4594;
        synchronized (this.field4594) {
            this.field4594.method1096((byte) 127);
            if (!arg0) {
                this.method1904(-30);
            }
        }
        class174 var5 = this.field4595;
        synchronized (this.field4595) {
            this.field4595.method1096((byte) -122);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZI)V")
    public final void method1908(boolean arg0, int arg1) {
        field4586++;
        int var3 = 76 / ((arg1 + 86) / 36);
        if (this.field4583 != arg0) {
            this.field4583 = arg0;
            this.method1907(true);
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lle;IZLoi;Loi;)V")
    public class316(class205 arg0, int arg1, boolean arg2, class53 arg3, class53 arg4) {
        this.field4583 = arg2;
        this.field4576 = arg3;
        this.field4578 = arg4;
        if (this.field4576 != null) {
            int var6 = this.field4576.method434(26154) - 1;
            this.field4576.method435(var6, 0);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1909(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class530("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field4589 = new class246(87, -2);
        field4592 = new int[128][128];
    }
}
