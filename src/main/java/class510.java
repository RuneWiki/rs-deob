import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class510 {

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
    private int field7462 = 0;

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "Lew;")
    private class270 field7464;

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "J")
    public static long field7461 = 0L;

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
    public static int field7460 = 0;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "Luj;")
    private class476 field7465;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(III)V", line = 5)
    public static final void method3023(int arg0, int arg1, int arg2) {
        class532 var3 = class103.field1632[arg0][arg1][arg2];
        if (var3 != null && var3.field7838 != null) {
            var3.field7838 = null;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)Luj;", line = 15)
    public final class476 method3024(byte arg0) {
        field7458++;
        int var2 = -27 / ((arg0 + 17) / 56);
        this.field7462 = 0;
        return this.method3027(9104);
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lew;)V", line = 157)
    public class510(class270 arg0) {
        this.field7464 = arg0;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILjava/lang/String;Lpg;B)Lbc;", line = 40)
    public static final class508 method3025(int arg0, String arg1, class333 arg2, byte arg3) {
        field7466++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        int var6 = -114 % ((arg3 + 9) / 55);
        OpenGL.glShaderSourceARB(var4, arg1);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class314.field4252, 0);
        if (class314.field4252[0] == 0) {
            if (class314.field4252[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class314.field4252, 1);
            if (class314.field4252[1] > 1) {
                byte[] var7 = new byte[class314.field4252[1]];
                OpenGL.glGetInfoLogARB(var4, class314.field4252[1], class314.field4252, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class314.field4252[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class508(arg2, var4, arg0);
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V", line = 84)
    public static final void method3026(int arg0) {
        field7459++;
        if (arg0 != -29805) {
            field7460 = 17;
        }
        if (!class511.field7470) {
            return;
        }
        while (true) {
            while (class504.field7378.length > class429.field6224) {
                class468 var1 = class504.field7378[class429.field6224];
                if (var1 != null && var1.field6770 == -1) {
                    if (class375.field5395 == null) {
                        class375.field5395 = class42.field624.method2472(var1.field6766, false);
                    }
                    int var2 = class375.field5395.field4983;
                    if (var2 == -1) {
                        return;
                    }
                    class375.field5395 = null;
                    var1.field6770 = var2;
                    class429.field6224++;
                } else {
                    class429.field6224++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)Luj;", line = 127)
    public final class476 method3027(int arg0) {
        field7463++;
        if (arg0 != 9104) {
            this.field7462 = 10;
        }
        if (this.field7462 > 0 && this.field7464.field3629[this.field7462 - 1] != this.field7465) {
            class476 var2 = this.field7465;
            this.field7465 = var2.field6884;
            return var2;
        }
        while (this.field7462 < this.field7464.field3633) {
            class476 var3 = this.field7464.field3629[this.field7462++].field6884;
            if (this.field7464.field3629[this.field7462 - 1] != var3) {
                this.field7465 = var3.field6884;
                return var3;
            }
        }
        return null;
    }
}
